class Paper{
	
	int length=5,width=6;
	String text;
	
	int length2=10;
	int width2=30;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		
		Document d1=new Document();
		  System.out.println("Created a Document object d1");
		d1.name="My First Document";
		  System.out.println("Name of the Document d1 is "+d1.name);
		d1.p=new Paper();
		d1.p.text="This is the text in the paper of Document my first Document";
          System.out.println("Size (l*w) of the paper of the Document d1 is "+d1.p.length+"*"+d1.p.width);	
		System.out.println("Text value of paper p of document d is "+d1.p.text);
		
		Document d2=new Document();
		  System.out.println("Created a Document object d2");
		d2.name="My Second Document";
		  System.out.println("Name of the Document d2 is "+d2.name);
		d2.p=new Paper();
		System.out.println("Size (l*w) of the paper of the Document d2 is "+d2.p.length+"*"+d2.p.width);	
		
		
		
		Document d3=new Document();
		  System.out.println("Created a Document object d3");
		d3.name="My Third Document";
		  System.out.println("Name of the Document d3 is "+d3.name);
		d3.p=new Paper();
		System.out.println("Size (l*w) of the paper of the Document d3 is "+d3.p.length2+"*"+d3.p.width2);	
		
		
		Document d4=new Document();
		  System.out.println("Created a Document object d4");
		d4.name="My fourth Document";
		  System.out.println("Name of the Document d4 is "+d4.name);
		d4.p=new Paper();
		d4.p.length=7;
		d4.p.width=9;
		d4.p.text="this is the text in the paper of document my fourth document";
		System.out.println("Text value of paper p of document d4 is "+d4.p.text);
		System.out.println("Size (l*w) of the paper of the Document d4 is "+d4.p.length+"*"+d4.p.width);	
		
	}
}