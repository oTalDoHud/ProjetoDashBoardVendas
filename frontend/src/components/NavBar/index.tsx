import hudlucalogo from 'assets/img/hudlucalogo.svg';

function NavBar() {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div>
                <nav className="my-2 my-md-0 mr-md-3">
                    <a href="https://dsvendas-hudlucas.netlify.app"><img src={hudlucalogo} alt="HudLUCA" width="170" /></a>
                </nav>
            </div>
        </div>

    );
}

export default NavBar;