package umjdt.concepts;

import java.util.ArrayList;
import java.util.List;

import umjdt.Events.LockEvent;
import umjdt.Events.ResourceEndEvent;
import umjdt.Events.ResourceStartEvent;
import umjdt.Events.UnlockEvent;

public class ResourceManager {

	private String name;
	private int rmId;
	private Resource resource;
	private TransactionManager tm;
	private List<Resource> listResource = new ArrayList<>();
	private ResourceEndEvent resourceEndEvent;
	private ResourceStartEvent resourceStartEvent;
	private LockEvent lockEvent;
	private UnlockEvent unlockEvent;
	
	public ResourceManager(){
		
	}
	public ResourceManager(String _name, int _rmId){
		this.name=_name;
		this.rmId=_rmId;
	}
	
	public int registerResource(Resource _resource){
		listResource.add(_resource);
		return listResource.size();
	}
	public int deregisterResource(Resource resource){
		listResource.remove(resource);
		return listResource.size();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRmId() {
		return rmId;
	}
	public void setRmId(int rmId) {
		this.rmId = rmId;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public TransactionManager getTm() {
		return tm;
	}
	public void setTm(TransactionManager tm) {
		this.tm = tm;
	}
	public List<Resource> getListResource() {
		return listResource;
	}
	public void setListResource(List<Resource> listResource) {
		this.listResource = listResource;
	}
	public ResourceEndEvent getResourceEndEvent() {
		return resourceEndEvent;
	}
	public void setResourceEndEvent(ResourceEndEvent resourceEndEvent) {
		this.resourceEndEvent = resourceEndEvent;
	}
	public ResourceStartEvent getResourceStartEvent() {
		return resourceStartEvent;
	}
	public void setResourceStartEvent(ResourceStartEvent resourceStartEvent) {
		this.resourceStartEvent = resourceStartEvent;
	}
	public LockEvent getLockEvent() {
		return lockEvent;
	}
	public void setLockEvent(LockEvent lockEvent) {
		this.lockEvent = lockEvent;
	}
	public UnlockEvent getUnlockEvent() {
		return unlockEvent;
	}
	public void setUnlockEvent(UnlockEvent unlockEvent) {
		this.unlockEvent = unlockEvent;
	}
}
