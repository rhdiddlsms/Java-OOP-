class PBoard { }
class CBoard extends PBoard { }

public class ClassCast {

	public static void main(String[] args) {
		PBoard sbd1 = new CBoard();
		CBoard sbd2 = (CBoard)sbd1;		// OK!
		
		System.out.println("-------------");
		
		PBoard ebd1 = new PBoard();
		CBoard ebd2 = (CBoard)ebd1;		// Exception!
		//자식객체가 부모객체를 자식객체로 형변환 하려고하는건 안됨.
	}

}
