class Worker extends React.Component {
    render() {
        return (
            <tr>
                <td>{this.props.worker.name}</td>
                <td>{this.props.worker.age}</td>
                <td>{this.props.worker.year}</td>
                <td>{this.props.worker.role}</td>
                <td>{this.props.worker.gender}</td>
            </tr>
        );
    }
}

class Workers extends React.Component {
    render() {
        var rows = [];
        this.props.workers.forEach(function (worker) {
            rows.push(
                <Worker worker={worker} key={worker.name}/>);
        });

        if (this.props.workers.length === 0) {
            return <span>No Workers Present</span>
        } else {
            return (
            		
            	<div className="container">	
            	
            	<br/>
            		
            	<div className="panel panel-primary">	
            	
            	<div className="panel-heading">Workers</div>
            	
            	<div className="panel-body">
            	
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Years</th>
                        <th>Role</th>
                        <th>Gender</th>
                    </tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </table>
                
                </div>
                
                </div>
                
                </div>
            );
        }
    }
}

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {workers: []};
    }

    loadworkersFromServer() {

        var self = this;
        $.ajax({
            url: "http://localhost:8080/workers",
        }).then(function (data) {
            self.setState({workers: data});
            console.log(data);
        });
    }

    componentDidMount() {
        this.loadworkersFromServer();
    }

    render() {
        return ( <Workers workers={this.state.workers}/> );
    }
}

ReactDOM.render(<App/>, document.getElementById('root'));