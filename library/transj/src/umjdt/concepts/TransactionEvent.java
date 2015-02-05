package umjdt.concepts;
import java.util.*;

public class TransactionEvent extends Event{
	

	
	private Transaction transaction;
	private Operation operation;
	private List<Operation> listOperation = new ArrayList<Operation>();
	private TransactionManager transactionManager = new TransactionManager();
	private ResourceManager resourcemanager= new ResourceManager();
	private Participant participant = new Participant();
	
	public TransactionEvent(){
		super();
	}
	
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction _transaction) {
		this.transaction = _transaction;
	}
	
	public List<Operation> getOperationList() {
		return listOperation;
	}

	public void addOperation(Operation op){
		listOperation.add(op);
	}
	
	public Operation getOperation(){
		return operation;
	}
	public void setOperation(Operation _operation) {
		this.operation = _operation;
	}
	
	public ResourceManager getResourceManager() {
		return resourcemanager;
	}

	public void setResourceManager(ResourceManager _resourceManager) {
		this.resourcemanager = _resourceManager;
	}
	
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setResourceManager(TransactionManager _transactionManager) {
		this.transactionManager = _transactionManager;
	}

	public boolean involves(Operation _operation) {
		// TODO Auto-generated method stub
		return false;
	}
}
