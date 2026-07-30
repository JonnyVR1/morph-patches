package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wq4<R, T> {

    /* JADX INFO: renamed from: a */
    public wq4<R, T> f187639a;

    /* JADX INFO: renamed from: b */
    public wq4<R, T> f187640b;

    /* JADX INFO: renamed from: a */
    public static <R, T> wq4<R, T> m205013a(List<wq4<R, T>> list) {
        int i = 0;
        wq4<R, T> wq4Var = list.get(0);
        while (i < list.size() - 1) {
            wq4<R, T> wq4Var2 = list.get(i);
            i++;
            wq4<R, T> wq4Var3 = list.get(i);
            wq4Var2.m205015d(wq4Var3);
            wq4Var3.m205014c(wq4Var);
        }
        return wq4Var;
    }

    /* JADX INFO: renamed from: b */
    public abstract R mo159820b(T t);

    /* JADX INFO: renamed from: c */
    public final void m205014c(wq4<R, T> wq4Var) {
        this.f187640b = wq4Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m205015d(wq4<R, T> wq4Var) {
        this.f187639a = wq4Var;
    }
}
