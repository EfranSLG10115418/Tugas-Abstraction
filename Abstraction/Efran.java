public class Efran extends Mahasiswa {
	
	//override
	protected void kuliah () {
	System.out.println("kuliah paling lama 5 tahun");
	}
	//override
	protected void lulus (){
	System.out.println("lulus harus IPK > 2,7");
	}
	//override
	protected void tidaklulus (){
	System.out.println("tidak ada mahasiswa yang tidak lulus");
	}

}