import Dashboard from 'pages/Dashboard';
import Home from 'pages/Home';
import {BrowserRouter, Route, Switch} from 'react-router-dom';

const Routes = () => {
    return (
        /* Estrutura de rotas */
       <BrowserRouter>
                {/* Definindo as Urls */} 
            <Switch>
                {/* rota da pagina home*/} 
                <Route path="/" exact>
                    <Home />
                </Route>
                {/* rota da pagina Dashboard*/} 
                <Route path="/dashboard" >
                    <Dashboard />
                </Route>

            </Switch>
       </BrowserRouter>
    );
  }
  
  export default Routes;