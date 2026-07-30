package p009l;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kjj {

    /* JADX INFO: renamed from: c */
    public static DecimalFormat f15733c = new DecimalFormat("0.000000");

    /* JADX INFO: renamed from: a */
    public double f15734a;

    /* JADX INFO: renamed from: b */
    public double f15735b;

    /* JADX INFO: renamed from: a */
    public double m17544a() {
        return this.f15735b;
    }

    /* JADX INFO: renamed from: b */
    public double m17545b() {
        return this.f15734a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjj) {
            kjj kjjVar = (kjj) obj;
            if (f15733c.format(this.f15735b).equals(f15733c.format(kjjVar.f15735b)) && f15733c.format(this.f15734a).equals(f15733c.format(kjjVar.f15734a))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return ("latitude:" + this.f15735b).concat(" longitude:" + this.f15734a);
    }
}
