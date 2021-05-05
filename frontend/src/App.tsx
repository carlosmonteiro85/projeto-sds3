import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DunotChats from "components/DunotCharts";
import Footer from "components/Footer";
import Navbar from "components/navbar";


function App() {
  return (
    /* QUANDO HA DUAS FUNÇÕES COLOCAR O FRAGMENT < ></>*/
    <>
      <Navbar/>
      <div className="container">
          <h1 className="text-primary py-3">DashBord Vendas</h1>
            {/* lINHA COM 12 COLUNAS, COM ESPAÇAMENTO DE 3 PX */}
          <div className="row px-3">
            {/* COLUNA COM METADE DA LINHA COM ESPAÇAMENTO DE 3 PX */}
              <div className="col-sm-6">
                  <h5 className="text-center text-secondary">taxa de suceso (%)</h5>
                   <BarChart /> 
              </div>
               {/* COLUNA QUE FECHA O TOTAL DA ROW*/}
              <div className="col-sm-6">
                  <h5 className="text-center text-secondary">Todas Vendas</h5>
                  <DunotChats/> 
              </div>
          </div>

          <div className="py-3 ">
              <h2 className="text-primary">Todas as Vendas</h2>
          </div>
          <DataTable />
      </div>

      <Footer/>
   </>
  );
}

export default App;
