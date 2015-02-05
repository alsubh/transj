package umjdt.concepts;

import java.beans.PropertyChangeEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import com.arjuna.*;
import com.arjuna.ats.*;
import com.arjuna.ats.arjuna.common.*;
import com.arjuna.ats.arjuna.state.*;

import com.arjuna.ats.internal.jta.transaction.arjunacore.TransactionImple;

public class TransactionBeginEvent extends TransactionEvent{
	
	private Timer timer;
	private State state;
	private TransId transactionId;
	private int timeout;
	private int Status;
	
	public TransactionBeginEvent(Transaction _transaction)
	{
		super.setTransaction(_transaction);
		// give transactionId
		transactionId = _transaction.getId();
		super.setId(transactionId);
		// assign time to the transaction
		timeout = _transaction.getTimeout();
		// set the state of the transaction (begin)
		
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public TransId getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(TransId transactionId) {
		this.transactionId = transactionId;
	}

}