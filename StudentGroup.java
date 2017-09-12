import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		
		
	}

	public StudentGroup() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
//student.addLast("");
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		List s=new List();
	for(int i=0;i<index;i++) 
	{
		}
	}
		//s.add(index, student);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	
			       if (index==0) {
			            for(Entry <E> e = header.next; e != students; e = e.next) {
			                 if (e.element==null) {
			                     remove(e);
			                     
			               }
			             }
			        } 
			       else {
			             for(Entry <E> e =students.next;e!=students;e=e.next) {
			               
			                    remove(e);
			                  
			                 }
			            }
			         }

	@Override
	public void remove(Student student) {
		LinkedList<?> l=new LinkedList();
		l.remove(student);
		
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		List l=new List();
	//student.poll();
		while(hasMoreElements()) {
			if(student.getId()) {}
		}
	
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	for(int i=0;i<(student.length());i++)
	{
		
	}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try {}
		catch(IllegalArgumentException e) {};
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try {}
		catch(IllegalArgumentException e)
		{e.printStackTrace();}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
