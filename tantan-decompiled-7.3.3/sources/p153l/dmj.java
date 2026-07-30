package p153l;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes10.dex */
public class dmj {

    /* JADX INFO: renamed from: c */
    public static DecimalFormat f89632c = new DecimalFormat("0.000000");

    /* JADX INFO: renamed from: a */
    public double f89633a;

    /* JADX INFO: renamed from: b */
    public double f89634b;

    /* JADX INFO: renamed from: a */
    public double m116960a() {
        return this.f89634b;
    }

    /* JADX INFO: renamed from: b */
    public double m116961b() {
        return this.f89633a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmj) {
            dmj dmjVar = (dmj) obj;
            if (f89632c.format(this.f89634b).equals(f89632c.format(dmjVar.f89634b)) && f89632c.format(this.f89633a).equals(f89632c.format(dmjVar.f89633a))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return ("latitude:" + this.f89634b).concat(" longitude:" + this.f89633a);
    }
}
