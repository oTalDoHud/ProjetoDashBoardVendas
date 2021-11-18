import NavBar from "components/NavBar";
import Footer from "components/Footer";
import { Link } from "react-router-dom";

function Home() {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">Dashboard de Vendas</h1>
                    <p className="lead">Analise o desempenho de suas vendas por diferentes perspectivas</p>
                    <hr />
                    <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.
                    </p>
                    <p> Nesse APP as seguintes tecnologias foram utilizadas:
                        <br />
                        <ul>
                            <li>Spring Boot</li>
                            <li>React</li>
                            <li>JPA/Hibernate</li> 
                            <li>maven</li>
                            <li>PostgreSQL</li>
                        </ul>
                    </p>
                    <br />

                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Acessar Dashboard
                    </Link>
                </div>
            </div>
            <br />
            <Footer />
        </>
    );
}

export default Home;