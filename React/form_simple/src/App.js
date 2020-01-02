import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { SimpleForm } from './SimpleForm';
import NumberForm from './NumberForm';
import SelectForm from './SelectForm';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;

export default class App extends Component {
  render(){
    return (
      <div className='App'>
        <SimpleForm />
        <NumberForm />
        <SelectForm items={['초콜렛','과자','콜라']} value='콜라' />
      </div>
    )
  }
}