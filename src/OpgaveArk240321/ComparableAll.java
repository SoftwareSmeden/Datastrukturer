package OpgaveArk240321;

abstract class ComparableAll {
    public abstract <E extends Comparable<E>> int compareTo(E e, E e1);
}

class NavnComparable extends ComparableAll {
    @Override
    public int compareTo(Comparable e1, Comparable e2) {
        SuperligaKlub hold1 = (SuperligaKlub) e1;
        SuperligaKlub hold2 = (SuperligaKlub) e2;
        if (hold1.getKlubnavn().equals(hold2.getKlubnavn())) return 0;
        else if (hold1.getKlubnavn().compareTo(hold2.getKlubnavn()) < 0) return 1;
        else return -1;
    }
}

class StringComparable extends ComparableAll {
    @Override
    public int compareTo(Comparable e1, Comparable e2) {
        String s= (String) e1;
        String s1=(String)e2;
        return s.compareTo(s1);
    }
}

class IntegerComparable extends ComparableAll {
    @Override
    public int compareTo(Comparable e1, Comparable e2) {
        Integer tal1 = (Integer) e1;
        Integer tal2 = (Integer) e2;
        return tal1.compareTo(tal2);
    }
}


