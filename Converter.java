import java.util.*;

public class numberSystemConverter {

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
                                break;//used to break the loop is any character of string is an invalid hexadecimal
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
		int choice;
		char option;
		int number;
		boolean validityFlag;

		// to show and validate input of menu

		System.out.println(
				"\t\t\t\t\t\t\tWelcome to the \n\t\t\t\t\t\t   Number Systen Converter\n\t\t\t\t\t\tHope you enjoy using it :)!!");

		do {

			do {
				System.out.println("\t\t\t\t\t __________________________________________");
				System.out.println("\t\t\t\t\t|Enter 1 to convert decimal to binary\t   |");
				System.out.println("\t\t\t\t\t|Enter 2 to convert decimal to octal\t   |");
				System.out.println("\t\t\t\t\t|Enter 3 to convert decimal to hexadecimal |");
				System.out.println("\t\t\t\t\t|Enter 4 to convert binary to decimal\t   |");
				System.out.println("\t\t\t\t\t|Enter 5 to convert binary to octal\t   |");
				System.out.println("\t\t\t\t\t|Enter 6 to convert binary to hexadecimal  |");
				System.out.println("\t\t\t\t\t|Enter 7 to convert octal to binary\t   |");
				System.out.println("\t\t\t\t\t|Enter 8 to convert octal to decimal\t   |");
				System.out.println("\t\t\t\t\t|Enter 9 to convert octal to hexadecimal   |");
				System.out.println("\t\t\t\t\t|Enter 10 to convert hexaecimal to binary  |");
				System.out.println("\t\t\t\t\t|Enter 11 to convert hexadecimal to octal  |");
				System.out.println("\t\t\t\t\t|Enter 12 to convert hexadecimal to decimal|");
				System.out.print("\t\t\t\t\t ");
				for (int i = 1; i <= 42; i++)
					System.out.print("~");
				System.out.println("\nPlease enter your choice");
				choice = sc.nextInt();
			} while (choice <= 0 || choice > 12);

			switch (choice) {

				case 1:
					System.out.println("Enter the decimal number for conversion from decimal to binary");
					number = sc.nextInt();
					System.out.println("The binary number " + number + " after conversion from decimal to binary is => "
							+ decimalToBinary(number));
					break;
				case 2:
					System.out.println("Enter the decimal number for conversion from decimal to octal");
					number = sc.nextInt();
					System.out.println("The octal number " + number + " after conversion from decimal to octal is => "
							+ decimalToOctal(number));
					break;
				case 3:
					System.out.println("Enter the decimal number for conversion from decimal to hexadecimal");
					number = sc.nextInt();
					System.out.println("The hexadecimal number " + number
							+ " after conversion from decimal to hexadecimal is => " + decimalToHexadecimal(number));
					break;
				case 4:

					// taking input untill the given number is a valid binary number
					do {
						System.out.println("Enter the binary number for conversion from binary to decimal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false) {
							System.out.println("Please enter a valid binary number");
						}
					} while (validityFlag != true);
					// The above do....while loop goes on untill the input is a valid binary number
					System.out.println("The decimal number " + number
							+ " after conversion from binary to decimal is => " + binaryToDecimal(number));
					break;
				case 5:
					// loops on untill the input is a valid octal number
					do {
						System.out.println("Enter the binary number for conversion from binary to octal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid binary number");
					} while (!(validityFlag));
					System.out.println("The octal number " + number + " after conversion from binary to octal is => "
							+ binaryToOctal(number));
					break;
				case 6:
					// loops on untill the input is a valid octal number
					do {
						System.out.println("Enter the binary number for conversion from binary to hexadecimal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid binary number");

					} while (!(validityFlag));
					System.out.println("The hexadecimal number " + number
							+ " after conversion from binary to hexadecimal is => " + binaryToOctal(number));
					break;
				case 7:
					do {
						System.out.println("Enter octal number for conversion from octal to binary ");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");

					} while (!(validityFlag));

					String ans = "";
					int digit = 0;
					while (number != 0) {
						digit = number % 10;
						ans = octalToBinary(digit) + ans;
						number = number / 10;
					}
					System.out.println(
							"The binary number " + number + " after conversion from octal to binary is => " + ans);
					break;
				case 8:
					do {
						System.out.println("Enter the octal number for conversion from octal to decimal");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");

					} while (!(validityFlag));
					// Above do..while loop goes on untill the given input is a valid octal
					System.out.println("The decimal number " + number + " after conversion from octal to decimal is => "
							+ octalToDecimal(number));
					break;
				case 9:
					do {
						System.out.println("Enter the octal number for conversion from Octal to Hexadecimal");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");
					} while (!(validityFlag));
					// Above do..while loop goes on untill the given input is a valid octal
					int octDeci = octalToDecimal(number);
					String deciHex = decimalToHexadecimal(octDeci);
					System.out.println("The hexadecimal number " + number
							+ " after conversion from octal to hexadecimal is => " + deciHex);
					break;
				case 10:
					String hexa;// to store hexadecimal inputs fro conversion
					do {
						System.out.println("Enter the hexadecimal number for conversion from hexadecimal to binary");

						hexa = sc.nextLine();
						// System.out.println(validityFlag);
						validityFlag = isHexa(hexa);
						// // System.out.println(validityFlag);
						// if (validityFlag == false)
						// System.out.println("Please enter a valid hexadecimal number");
						// System.out.println(validityFlag);
					} while (!validityFlag);

					String ans1 = "";
					// String subAns = "";
					for (int i = 0; i < hexa.length(); i++) {
						char ch = hexa.charAt(i);
						if (ch >= 65 && ch <= 70)
							ans1 += alphaToBinary(ch);
						else {
							int n10 = ch - '0';
							ans1 += hexaToBinary(n10);
						}
					}
					System.out.println(
							"The binary number " + hexa + " after conversion from hexadecimal to binary is => " + ans1);

					break;
				case 11:
					String hexa1;// to store hexadecimal inputs fro conversion
					do {
						System.out.println("Enter the number for conversion from Hexadecimal to Octal");
						hexa1 = sc.nextLine();
						validityFlag = isHexa(hexa1);
						// if (validityFlag == false)
						// System.out.println("Please enter a valid hexadecimal number");
					} while (!(validityFlag));
					// Above loop goes on untill the given input is a valid hexadecimal

					int hexToDec = HexadecimalToDecimal(hexa1);
					String decToOct = decimalToOctal(hexToDec);
					System.out
							.println("The octal number " + hexa1 + " after conversion from hexadecimal to octal is => "
									+ decToOct);

					break;
				case 12:
					String hexa2;// to store hexadecimal inputs fro conversion
					do {
						System.out.println("Enter the hexadecimal number for conversion from hexadecimal to decimal");
						hexa2 = sc.nextLine();
						validityFlag = isHexa(hexa2);
					} while (!(validityFlag));
					int hexToDec1 = HexadecimalToDecimal(hexa2);
					String result = decimalToOctal(hexToDec1);
					System.out.println("The decimal number " + hexa2
							+ " after conversion from hexadecimal to decimal is => " + result);
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
		System.out.println("\t\t\t\t\tMade with love by Shuraim");
	}
}
