
public enum Department {
	
	THEORETICAL_PHISICS("³��� ���������� ������",1000,200," ",true),
	EXPERIMENTAL_WEAPONRY("³��� ������������������ ��������",1000,200," ",true),
	EXPERIMENTAL_MEDICINE("³��� ���������������� ��������",1000,200," ",true),
	CLONING_SCIENCE("³��� �� �������� ����������",1000,200," ",true),
	FEV_EXPERIMENTATION("³��� ������������ � ���",1000,200," ",true),
	LAW("��������� ����",1000,200," ",true);
	
	private String title;
	private int money;
	private int workers;
	private String commentary;
	private boolean isActive;
	
	Department(String title,int money,int workers,String comment,boolean active){
		this.title=title;
		this.money=money;
		this.workers=workers;
		this.commentary=comment;
		this.isActive=active;
	}
	
	
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers = workers;
	}
	
	public String getCommentary() {
		return commentary;
	}
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
