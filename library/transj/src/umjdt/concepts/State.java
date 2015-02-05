package umjdt.concepts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;

public class State implements Serializable{
	
	private static final long serialVersionUID = 1L;

	// 2PC State
	private boolean begin = false;
	private boolean committed = false;
	private boolean aborted = false;
	//Resource State
	private boolean started = false;
	private boolean ended = false;
	
	// 2PL State
	private boolean locked = false;
	private boolean unLocked = false;
	
	private String name = "";
	private TransId transactionId;
	private List<Transaction> transactions = new ArrayList<Transaction>(); 
	private List<Resource> resources = new ArrayList<Resource>(); 
	
	public boolean isBegin() {
		return begin;
	}

	public void setBegin(boolean begin) {
		this.begin = begin;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAbortted() {
		return aborted;
	}

	public void setAbortted(boolean abortted) {
		this.aborted = abortted;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public boolean isUnlocked() {
		return unLocked;
	}

	public void setUnlocked(boolean unLocked) {
		this.unLocked = unLocked;
	}

	public TransId getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(TransId transactionId) {
		this.transactionId = transactionId;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	public State(boolean _begin, boolean _committed, boolean _aborted, TransId _transactionId, String _name) {
		super();
		this.committed = _committed;
		this.aborted = _aborted;
		this.transactionId = _transactionId;
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public State(boolean _committed, boolean _aborted, TransId _transactionId, String _name) {
		super();
		this.committed = _committed;
		this.aborted= _aborted;
		this.transactionId = _transactionId;
		this.name = _name;
	}

	public void setName(TransId _transaction, String _name) {
		this.transactionId= _transaction;
		this.name = _name;
	}

	public List<Transaction> getTransaction() {
		return transactions;
	}

	public void setTransactions(List<Transaction> _transactions) {
		this.transactions = _transactions;
	}
		
	// make the state of transaction based on state of its operations. 
	
		//logger.debug("it is null can't make transition");
}