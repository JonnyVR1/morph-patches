package p153l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class i8s0 implements Comparator {
    public i8s0(k8s0 k8s0Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o8s0 o8s0Var = (o8s0) obj;
        o8s0 o8s0Var2 = (o8s0) obj2;
        int i = o8s0Var.f145465c - o8s0Var2.f145465c;
        return i != 0 ? i : Long.compare(o8s0Var.f145463a, o8s0Var2.f145463a);
    }
}
