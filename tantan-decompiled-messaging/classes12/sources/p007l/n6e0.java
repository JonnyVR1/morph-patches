package p007l;

import l.c4g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n6e0 {

    /* JADX INFO: renamed from: a */
    public int f10679a;

    /* JADX INFO: renamed from: b */
    public c4g0 f10680b;

    /* JADX INFO: renamed from: c */
    public String f10681c;

    public n6e0(String str, int i, c4g0 c4g0Var) {
        this.f10681c = str;
        this.f10679a = i;
        this.f10680b = c4g0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m12096a() {
        c4g0 c4g0Var = this.f10680b;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        this.f10680b.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public void m12097b(int i) {
        this.f10679a = i;
    }
}
