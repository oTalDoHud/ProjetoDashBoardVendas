import axios from "axios";
import Chart from "react-apexcharts"
import { saleSum } from "types/sale";
import { BASE_URL } from "utils/requests";

type ChartData = {
    labels: string[];
    series: number[];
}

function DonutChart() {

    // forma errada
    let ChartData: ChartData = { labels: [], series: [] };

    // forma errada
    axios.get(`${BASE_URL}/sales/amount-by-seller`)
        .then(response => {
            const data = response.data as saleSum[];
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum);

            ChartData = { labels: myLabels, series: mySeries };
            console.log(ChartData);
        });
    //const mockData = {
    //    series: [477138, 499928, 444867, 220426, 473088],
    //    labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    //}

    const options = {
        legend: {
            show: true
        }
    }


    return (
        <Chart
            options={{ ...options, labels: ChartData.labels }}
            series={ChartData.series}
            type="donut"
            height="250px"
        />
    );
}

export default DonutChart;