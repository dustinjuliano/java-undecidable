interface Comp<T> {
	boolean comp(T other);
}

interface Lst<T> extends Comp<Lst<? extends Comp<? super T>>> {

}

interface Tree extends Lst<Tree> {

}

public class Main {
	public static void main(String[] args) {

	}

	public static boolean compareTrees(Tree t1, Tree t2) {
		return t1.comp(t2);
	}
}
