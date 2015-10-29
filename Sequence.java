public class Sequence extends Element{

	private LinkedList seq; 
	public int length;

	public Sequence(){
		seq =  new LinkedList(); 
		length = 0;
	}
	
	public void Print(){
		System.out.print("[ "); 
		 
		for(int i = 1; i < this.length()+1; i++){
			
			//go down and print every element 
			this.seq.get(i).Print();  
			System.out.print(" ");
		}
		System.out.print("]");
	
	} 

	public Element first(){
		
		return this.seq.get(0);
		
		
	} 
	
	
	public Sequence rest(){
		Sequence x = new Sequence();
		int pos = 0;
		for(int i = 0; i < this.length() - 1; i++){
			pos = i + 2; 
			x.add(this.seq.get(pos), i);
		}
		return x; 
	}
	
	public int length(){
		
			return this.length; 
	
	}
	
	public void add(Element ele, int pos){
		//check if within bounds, length() is number of objects and positions start at 0	
		if(pos < 0 || pos > this.length()){
			System.err.println("Position Does Not Exist "+Integer.toString(pos));
			System.exit(1); 
	
		}	
		else if(pos >= 0 && pos <= this.length()){
				pos++;
				this.seq.add(ele, pos);
				length++; 
		}
		
		
		
	}
	
	public void delete(int pos){
		
			this.seq.remove(pos);
			length--; 
		
	}
	
	
}
