public class StringExample{
	public static void main(String[] args){
		String name = "Shamim";
		String name2 = "ShamiM";
		String address = " Lalmonirhat.";
		
		char ch = name.charAt(4);
		String cn = name.concat(address);
		boolean eq = name.equals(name2);
		boolean eq2 = name.equalsIgnoreCase(name2);
		int in = name.indexOf("m");
		int in2 = name.lastIndexOf("m");
		boolean em = name.isEmpty();
		String jn = String.join(" - ", name, name2, address);
		int ln = name.length();
		String rp = name.replace('m','n');
		String lc = name2.toLowerCase();
		String lc2 = name.toUpperCase();
		
		System.out.println("01. charAl() example: "+ch);
		System.out.println("02. concat() example: "+cn);
		System.out.println("03. equals() example: "+eq);
		System.out.println("04. equalsIgnoreCase() example: "+eq2);
		System.out.println("05. indexOf() example: "+in);
		System.out.println("08. lastIndexOf() example: "+in2);
		System.out.println("06. isEmpty() example: "+em);
		System.out.println("07. join() example: "+jn);
		System.out.println("09. length() example: "+ln);
		System.out.println(rp);
		System.out.println(lc);
		System.out.println(lc2);
		
	}
}