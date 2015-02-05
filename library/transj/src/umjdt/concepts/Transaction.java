package umjdt.concepts;

import com.arjuna.ats.internal.jta.transaction.jts.BaseTransaction;
import java.io.Serializable;
import java.util.*;

public class Transaction extends BaseTransaction implements Serializable{

	private static final long serialVersionUID = 1L;
	private TransId id;
	private State currentState;
	private int timeout;
	private List<TransactionEvent> events = new ArrayList<TransactionEvent>();
	private List<Operation> operations = new ArrayList<Operation>();
	private List<Resource> resources = new ArrayList<Resource>();
	private TransactionManager transactionManager = new TransactionManager();
	private ResourceManager resourceManager= new ResourceManager();
	private TwoPhaseCommitProtocol twoPhaseCommitProtocol = new TwoPhaseCommitProtocol();
	private TransactionThread transactionThread; 
				
	public Transaction(TransId id, State _currentState){	
		super();
		this.id= id;
		this.currentState = _currentState;
	}
	
	public Transaction(State _currentState){
		super();
		this.currentState = _currentState;
	}

	public Transaction(TransId _id){
		super();
		this.setId(_id);		
	}

	public boolean isInBeginState(){
		return getCurrentState().isBegin();			
	}

	public boolean isInCommitState(){
		return getCurrentState().isCommitted();			
	}
	
	public TransId getId(){
		return id;
	}

	public void setId(TransId _id) {
		this.id = _id;
	}
	
	public List<TransactionEvent> getEvents() {
		return events;
	}
	public void setEvents(List<TransactionEvent> _events) {
		this.events = _events;
	}
	
	public void addEvent(TransactionEvent _event){		
		events.add(_event);
	}
	
	public void removeEvent(TransactionEvent _event){
		events.remove(_event);
	}
		
	public Event getEventForOperation(String _data, char _type){
		synchronized(events){
			for(TransactionEvent event : events){
				if(event.getOperation().getData().toString().equals(_data) && event.getType()==_type)
					return event;
			}
		}
		return null;
		
	}
	
	public State getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(State _currentState) {
		this.currentState = _currentState;
	}
	
	// we have in JTA transaction an equal method to check the similarity between transaction
	@Override
	public boolean equals(Object _obj){ 
		Transaction  tempTransaction = (Transaction)_obj;
		if(tempTransaction.getId().equals(this.getId()))
			return true;
		return false;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
}