import DataTable from "components/DataTable";
import Footer from "components/Footer";
import Navbar from "components/navbar";


function App() {
  return (
    /* QUANDO HA DUAS FUNÇÕES COLOCAR O FRAGMENT < ></>*/
    <>
      <Navbar/>
      <div className="container">
          <h1 className="text-primary">Ola Mundo</h1>
          <DataTable />
      </div>

      <Footer/>
   </>
  );
}

export default App;
