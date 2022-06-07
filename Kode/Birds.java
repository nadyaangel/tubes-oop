/**
 * Birds
 */
public abstract class Birds implements Power{
    String birdname;
	int nyawaBabi;
	int jumlahPukulan;
	String namaBabi;

	public void serang(String birdname, Pig musuh, int jumlahPukulan) {
		this.birdname = birdname;
		this.jumlahPukulan = jumlahPukulan;
        this.nyawaBabi = musuh.getNyawaBabi();
		System.out.println(this.birdname + " menyerang babi dengan " + getPower() + " ke babi " + musuh.getNamaBabi());
		statusBabi(jumlahPukulan, musuh, nyawaBabi);
	}
	
	public void statusBabi(int jumlahPukulan, Pig musuh, int nyawaBabi) {
        this.jumlahPukulan = jumlahPukulan;
        nyawaBabi = musuh.getNyawaBabi();
		if(musuh.hat() == true) {
			nyawaBabi -= (jumlahPukulan/2);
			
		}
		else if(musuh.metal() == true) {
			nyawaBabi -= (jumlahPukulan/3);
		}
		
		
		if(nyawaBabi>0) {
			System.out.println("Babi " + musuh.getNamaBabi() +" belum mati, nyawa babi = " + nyawaBabi);
		}
		else {
			System.out.println("Babi sudah mati");
		}
	}
}