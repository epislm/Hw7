import java.io.File;

public class branchCommand{

public static void main(String[] args){

int counter= 0;
File folder = new File("/users1/st/emartine/");
File[] listOfFiles = folder.listFiles();

for (File file : listOfFiles) {
   if(file.isDirectory() && !file.isHidden()){
	
	File temp = new File(file.getAbsolutePath() );
	File[] tempList = temp.listFiles(); 
		for (File file2 : tempList){
			if(file2.isDirectory() && !file2.isHidden()){
			System.out.print("|");
			System.out.println(file2.getName());
	
			if(file.isFile() && !file.isHidden()){
			System.out.print("|");
			System.out.println(file2.getName());
				}
			}
	
	}		
	counter ++ ;
        System.out.println(file.getName());
	System.out.print("|"); }
  
  if(file.isFile() && !file.isHidden()){

	for(int i= 0; i < counter;i++){
	System.out.print("─");

	}
	System.out.print("|");
	System.out.println(file.getName());

	}
}



}

}
