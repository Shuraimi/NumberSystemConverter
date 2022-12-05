import java.util.*;

public class converter {

	static String decimalToBinary(int n) {
		String rem = "";// used string
		while (n != 0) {
			rem = (n % 2) + rem;// remainder
			n = n / 2;// quotient
		}
		return rem;
	}

	static String decimalToOctal(int n) {
		String rem = "";// used string
		while (n != 0) {
			rem = (n % 8) + rem;// added to string first then added with the remaining string(without reversing)
			n = n / 8;
		}
		return rem;
	}

	static String decimalToHexadecimal(int n) {
		String rem = "";// used string
		while (n != 0) {
			if (n % 16 == 10)
				rem = 'A' + rem;// remainder
			else if (n % 16 == 11)
				rem = 'B' + rem;
			else if (n % 16 == 12)
				rem = 'C' + rem;
			else if (n % 16 == 13)
				rem = 'D' + rem;
			else if (n % 16 == 14)
				rem = 'E' + rem;
			else if (n % 16 == 15)
				rem = 'F' + rem;
			else
				rem = (n % 16) + rem;
			n = n / 16;// quotient
		}
		return rem;
	}

	static boolean isBinary(int n) {
		int dig = 0;
		while (n != 0) {
			dig = n % 10;
			if (dig > 1)
				return false;
			n = n / 10;
		}
		return true;

	}

	static int binaryToDecimal(int n) {
		// converting binary to decimal
		int deci = 0;
		int i = 0;
		int dig;
		while (n != 0) {
			dig = n % 10;
			deci = deci + (dig * (int) Math.pow(2, i));
			n = n / 10;
			i++;
		}
		return deci;
	}

	static String binaryToOctal(int n) {
		int dig = 0;
		int deci = 0;
		String s = "";
		while (n != 0) {
			dig = n % 1000;
			deci = binaryToDecimal(dig);
			s = deci + s;
			n /= 1000; // never forget this statement
		}
		return s;
	}

	static String binaryToHexadecimal(int n) {
		int dig = 0;
		int deci = 0;
		String s = "";

		while (n != 0) {
			dig = n % 10000;
			deci = binaryToDecimal(dig);
			if (deci == 10)
				s = "A" + s;
			else if (deci == 11)
				s = "B" + s;
			else if (deci == 12)
				s = "C" + s;
			else if (deci == 13)
				s = "D" + s;
			else if (deci == 14)
				s = "E" + s;
			else if (deci == 15)
				s = "F" + s;
			else
				s = deci + s;
			n /= 10000; // never forget this statement
		}
		return s;
	}

	static boolean isOctal(int N) {
		int dig;
		while (N != 0) {
			dig = N % 10;
			if (dig > 7)
				return false;
			N = N / 10;
		}
		return true;

	}

	static String octalToBinary(int n) {
		String rem = "";
		if (n == 0)
			rem = "000";
		while (n != 0) {
			rem = n % 2 + rem;
			n = n / 2;
		}
		if (rem.length() == 2)
			rem = "0" + rem;
		else if (rem.length() == 1)
			rem = "00" + rem;
		else
			rem = rem;
		return rem;
	}

	static int octalToDecimal(int n) {
		int deci = 0;
		int i = 0;
		int dig;
		while (n != 0) {

			dig = n % 10;
			deci = deci + (dig * (int) Math.pow(8, i));
			n = n / 10;
			i++;

		}
		return deci;
	}

	static boolean isHexa(String s) {
		int j;
		char ch;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			j = ch;
			if (Character.isDigit(ch)) {

				flag = true;
			} else if (j >= 65 && j <= 70) {

				flag = true;
			} else {
				flag = false;
			}

		}
		return flag;
	}

	static int HexadecimalToDecimal(String s) {
		char ch;
		int j = 0;
		int k = 0;
		int dig = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			ch = s.charAt(i);
			j = ch;
			int above9;
			if (Character.isDigit(ch)) {
				j = ch - '0';
				dig = dig + (j * (int) Math.pow(16, k));
			} else if (j >= 65 && j <= 70) {
				if (j == 65)
					above9 = 10;
				else if (j == 66)
					above9 = 11;
				else if (j == 67)
					above9 = 12;
				else if (j == 68)
					above9 = 13;
				else if (j == 69)
					above9 = 14;
				else
					above9 = 15;
				dig = dig + (above9 * (int) Math.pow(16, k));
				// System.out.println("Character");
			}
			k++;
		}
		return dig;
	}

	static String hexaToBinary(int n) {
		String rem = "";
		if (n == 0)
			rem = "000";
		while (n != 0) {
			rem = n % 2 + rem;
			n = n / 2;
		}
		if (rem.length() == 3)
			rem = "0" + rem;
		else if (rem.length() == 2)
			rem = "00" + rem;
		else if (rem.length() == 1)
			rem = "000" + rem;
		else
			rem = rem;
		return rem;
	}

	static String alphaToBinary(char c) {
		String rem = "";
		if (c == 'A')
			rem = "1010" + "";
		else if (c == 'B')
			rem = "1011" + "";
		else if (c == 'C')
			rem = "1100" + "";
		else if (c == 'D')
			rem = "1101" + "";
		else if (c == 'E')
			rem = "1110" + "";
		else
			rem = "1111" + "";
		return rem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number ");
		// int n=sc.nextInt();

		// to show and validate input of menu
		int choice;
		System.out.println("\t\tWelcomr to the Number System Converter \nHope it is useful!!");
		char option;
		do {

			do {
				System.out.println("Enter 1 to convert decimal to binary");
				System.out.println("Enter 2 to convert decimal to octal");
				System.out.println("Enter 3 to convert decimal to hexadecimal");
				System.out.println("Enter 4 to convert binary to decimal");
				System.out.println("Enter 5 to convert binary to octal");
				System.out.println("Enter 6 to convert binary to hexadecimal");
				System.out.println("Enter 7 to convert octal to binary");
				System.out.println("Enter 8 to convert octal to decimal");
				System.out.println("Enter 9 to convert octal to hexadecimal");
				System.out.println("Enter 10 to convert hexaecimal to binary");
				System.out.println("Enter 11 to convert hexadecimal to octal");
				System.out.println("Enter 12 to convert hexadecimal to decimal");

				choice = sc.nextInt();
			} while (choice <= 0 || choice > 12);

			switch (choice) {

				case 1:
					System.out.println("Enter the decimal number for conversion");
					int n = sc.nextInt();
					System.out.println("The binary number after conversion is " + decimalToBinary(n));
					break;
				case 2:
					System.out.println("Enter the decimal number for conversion");
					int n1 = sc.nextInt();
					System.out.println("The binary number after conversion is " + decimalToOctal(n1));
					break;
				case 3:
					System.out.println("Enter the decimal number for conversion");
					int n2 = sc.nextInt();
					System.out.println("The binary number after conversion is " + decimalToHexadecimal(n2));
					break;
				case 4:
					int N;
					boolean k;
					// System.out.println(isBinary(N));
					// taking input untill the given number is a valid binary number
					do {
						System.out.println("Enter number");
						N = sc.nextInt();
						k = isBinary(N);
						if (k == false) {
							System.out.println("enter a binary number");
						}
					} while (k != true);
					// The above do....while loop goes on untill the input is a valid binary number
					System.out.println("The decimal number is " + binaryToDecimal(N));
					break;
				case 5:
					int n3;

					// loops on untill the input is a valid octal number
					do {
						System.out.println("Enter your binary number");
						n3 = sc.nextInt();
					} while (!(isBinary(n3)));

					String answer = binaryToOctal(n3);
					System.out.println("The octal number is " + answer);
					break;
				case 6:
					int n6;

					// loops on untill the input is a valid octal number
					do {
						System.out.println("Enter your binary number");
						n6 = sc.nextInt();
					} while (!(isBinary(n6)));

					String answer1 = binaryToHexadecimal(n6);
					System.out.println("The hexadecimal number is " + answer1);
					break;
				case 7:
					int n7;
					do {
						System.out.println("Enter octal number ");
						n7 = sc.nextInt();
					} while (!(isOctal(n7)));
					String ans = "";
					int digit = 0;
					while (n7 != 0) {
						digit = n7 % 10;
						ans = octalToBinary(digit) + ans;
						n7 = n7 / 10;
					}
					System.out.println(ans);
					break;
				case 8:
					int n8;

					do {
						System.out.println("Enter you number");
						n8 = sc.nextInt();
					} while (!(isOctal(n8)));
					// Above do..while loop goes on untill the given input is a valid octal
					int ocd = octalToDecimal(n8);
					System.out.println(ocd);
					break;
				case 9:
					int n9;
					do {
						System.out.println("Enter you number to be converted from Octal to Hexadecimal");
						n9 = sc.nextInt();
					} while (!(isOctal(n9)));
					// Above do..while loop goes on untill the given input is a valid octal
					int octDeci = octalToDecimal(n9);
					String deciHex = decimalToHexadecimal(octDeci);
					System.out.println("Your Hexadecimal number after conversion is " + deciHex);
					break;
				case 10:
					String s10;
					boolean Hexa10;
					do {
						System.out.println("Enter your string");
						s10 = sc.nextLine();
						Hexa10 = isHexa(s10);
					} while (!Hexa10);

					String ans1 = "";
					String subAns = "";
					for (int i = 0; i < s10.length(); i++) {
						char ch = s10.charAt(i);
						if (ch >= 65 && ch <= 70)
							ans1 += alphaToBinary(ch);
						else {
							int n10 = ch - '0';
							ans1 += hexaToBinary(n10);
						}
					}
					System.out.println(ans1);

					break;
				case 11:
					String p = "";
					boolean Hexa;
					do {
						System.out.println("Enter your number for conversion from Hexadecimal to Octal");
						p = sc.nextLine();
						Hexa = isHexa(p);
					} while (!Hexa);
					// Above loop goes on untill the given input is a valid hexadecimal

					int hexToDec = HexadecimalToDecimal(p);
					String decToOct = decimalToOctal(hexToDec);
					System.out.println("The octal number after conversion is " + decToOct);

					break;
				case 12:
					String s3;
					boolean Hexa1;
					do {
						System.out.println("Enter your string");
						s3 = sc.nextLine();
						Hexa1 = isHexa(s3);
					} while (!Hexa1);
					int hexToDec1 = HexadecimalToDecimal(s3);
					String result = decimalToOctal(hexToDec1);
					System.out.println(result);
					break;

			}
			System.out.println("Do want to perform the conversion again?");
			boolean choose = true;
			do {
				System.out.println("Enter y to continue or n to exit");
				option = sc.next().toLowerCase().charAt(0);
				if (option == 'y')
					choose = false;
				else if (option == 'n')
					break;
				else
					choose = true;
			} while (choose);

		} while (option == 'y');
		if (option == 'n')
			System.out.println("Bye!!\nThank you for using the converter");
	}
}
