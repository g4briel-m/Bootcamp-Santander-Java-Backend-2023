public class Tarefa {
    String desc;

    //Método construtor
    public Tarefa (String desc){
        this.desc = desc;
    }

    //Método getter e setter
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

	@Override
	public String toString() {
		return desc;
	}
    
    
}
