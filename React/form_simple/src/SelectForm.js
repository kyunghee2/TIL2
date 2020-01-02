import React from 'react'
import ReactDOM from 'react-dom'

export class SelectForm extends React.Component {
    constructor(props){
        super(props)
        this.state = {
            items : props.items,
            value : props.value
        }
    }
    render(){
        const options = this.state.items.map(i=>{
            return (
                <option key={i} value={i}>{i}</option>
            )
        })
        return (
            <div>
                <form onSubmit={e=>this.doSubmit(e)}>
                    <select value={this.state.value} onChange={e=>this.doChange(e)}>
                        {options}
                    </select><br/>
                    <input type='submit'/>
                </form>
            </div>
        )
    }
    doChange(e){
        this.setState({value: e.target})
    }
    doSubmit(e){
        e.preventDefault()
        window.alert(this.state.value)
    }
}
// ReactDOM.render(
//     <SelectForm items={['초콜렛','과자','콜라']} value='콜라' />,
//     document.getElementById('root')
// )