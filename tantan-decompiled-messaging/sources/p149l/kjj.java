package p149l;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class kjj {

    /* JADX INFO: renamed from: c */
    public static DecimalFormat f123452c = new DecimalFormat("0.000000");

    /* JADX INFO: renamed from: a */
    public double f123453a;

    /* JADX INFO: renamed from: b */
    public double f123454b;

    /* JADX INFO: renamed from: a */
    public double m146236a() {
        return this.f123454b;
    }

    /* JADX INFO: renamed from: b */
    public double m146237b() {
        return this.f123453a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjj) {
            kjj kjjVar = (kjj) obj;
            if (f123452c.format(this.f123454b).equals(f123452c.format(kjjVar.f123454b)) && f123452c.format(this.f123453a).equals(f123452c.format(kjjVar.f123453a))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return ("latitude:" + this.f123454b).concat(" longitude:" + this.f123453a);
    }
}
