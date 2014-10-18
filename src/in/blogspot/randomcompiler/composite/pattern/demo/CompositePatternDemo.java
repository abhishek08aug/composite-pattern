package in.blogspot.randomcompiler.composite.pattern.demo;

import in.blogspot.randomcompiler.composite.pattern.api.Entity;
import in.blogspot.randomcompiler.composite.pattern.impl.File;
import in.blogspot.randomcompiler.composite.pattern.impl.Folder;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Entity file1 = new File("data1.txt", 156786l, "abhishek");
		Entity file2 = new File("data2.txt", 18787292l, "steve");
		Entity file3 = new File("run.sh", 1564446l, "mike");
		
		Entity folder1 = new Folder("home", 534536435643l, "abhishek");
		folder1.add(file1);
		folder1.add(file2);
		folder1.add(file3);
		
		Entity file4 = new File("data123.txt", 156786l, "tag");
		Entity file5 = new File("data234.txt", 18787292l, "smith");
		Entity file6 = new File("run123.sh", 1564446l, "kile");
		
		Entity folder2 = new Folder("opt", 534536435643l, "kevin");
		folder2.add(file4);
		folder2.add(file5);
		folder2.add(file6);
		
		Entity root =  new Folder("/", 5345369999943l, "root");
		root.add(folder1);
		root.add(folder2);
		
		root.print();
	}

}
