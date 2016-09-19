package prob5;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode;

	Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	void rent() {
		System.out.println(this.title + "이(가) 대여됐습니다.");
		this.stateCode = 0;
	}

	void print() {
		if (this.stateCode == 0) {
			System.out.println("책 제목:" + title + ", 작가:" + author + "," + "대여유무: 대여중");
		} else {
			System.out.println("책 제목:" + title + ", 작가:" + author + "," + "대여유무: 재고있음");
		}
	}

	
}
