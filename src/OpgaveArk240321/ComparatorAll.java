package OpgaveArk240321;

import java.util.Comparator;

public abstract class ComparatorAll {
    public abstract <C extends Comparator<C>> int compare(C c1, C c2);
}

class NavnComparator extends ComparatorAll {
    @Override
    public <C extends Comparator<C>> int compare(C c1, C c2) {
        SuperligaKlub hold1 = (SuperligaKlub) c1;
        SuperligaKlub hold2 = (SuperligaKlub) c2;
        if (hold1.getKlubnavn().equals(hold2.getKlubnavn())) return 0;
        else if (hold1.getKlubnavn().compareTo(hold2.getKlubnavn()) < 0) return 1;
        else return -1;
    }
}

class VundneKampeComparator extends ComparatorAll {
    @Override
    public <C extends Comparator<C>> int compare(C c1, C c2) {
        SuperligaKlub hold1 = (SuperligaKlub) c1;
        SuperligaKlub hold2 = (SuperligaKlub) c2;
        if (hold1.getVundneKampe() == hold2.getVundneKampe()) return 0;
        else if (hold1.getVundneKampe() > hold2.getVundneKampe()) return 1;
        else return -1;
    }
}




