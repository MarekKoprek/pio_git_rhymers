package edu.kis.vh.nursery;

/**
 * Klasa przechowująca liczby w ilości maksymalnej zdefiniowanej stałą MAX_SIZE
 */
public class DefaultCountingOutRhymer {

	private static final int MAX_SIZE = 12;

	private static final int IF_EMPTY = -1;

	private static final int DEFAULT_VALUE = -1;

	private final int[] numbers = new int[MAX_SIZE];

	private int total = DEFAULT_VALUE;

	/**
	 * @return Ilość przechowywanych liczb 
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Metoda dodaje liczbę do tablicy oraz zwiększa parametr określający liczbe elementów.
	 * Jeżeli tablica jest pełna metoda nic nie wykonuje.
	 * @param Liczba do przechowania typu integer
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}
	
	/**
	 * Metoda sprawdza czy tablica jest pusta.
	 * @return True jeżeli tablica jest pusta, false jeżeli nie jest pusta
	 */
	public boolean callCheck() {
		return total == IF_EMPTY;
	}
	
	/**
	 * Metoda sprawdza czy tablica jest pełna.
	 * @return True jeżeli tablica jest pełna, false jeżeli nie jest pełna
	 */
	public boolean isFull() {
		return total == MAX_SIZE - 1;
	}
	
	/**
	 * Metoda zwraca ostatnią przechowaną liczbę.
	 * @return Ostatnia przechowana liczba, lub -1 jeżeli tablica jest pusta
	 */
	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}

	/**
	 * Metoda zwraca i usuwa ostatnią przechowaną liczbę.
	 * @return Ostatnia przechowana liczba, lub -1 jeżeli tablica jest pusta
	 */
	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total--];
	}

}
