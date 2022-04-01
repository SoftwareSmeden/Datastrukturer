package OpgaveArk280321;

import OpgaveArk240321.SuperligaKlub;
import java.util.Comparator;

class NavnComparator implements Comparator<SuperligaKlub> {
    @Override
    public int compare(SuperligaKlub c1, SuperligaKlub c2) {
        if (c1.getKlubnavn().equals(c2.getKlubnavn())) return 0;
        else if (c1.getKlubnavn().compareTo(c2.getKlubnavn()) > 0) return 1;
        else return -1;
    }
}