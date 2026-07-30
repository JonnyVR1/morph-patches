package p149l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class czr0 implements Comparator {
    public czr0(ezr0 ezr0Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        izr0 izr0Var = (izr0) obj;
        izr0 izr0Var2 = (izr0) obj2;
        int i = izr0Var.f115597c - izr0Var2.f115597c;
        return i != 0 ? i : Long.compare(izr0Var.f115595a, izr0Var2.f115595a);
    }
}
