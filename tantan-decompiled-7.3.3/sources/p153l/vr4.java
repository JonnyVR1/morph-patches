package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vr4<R, T> {

    /* JADX INFO: renamed from: a */
    public vr4<R, T> f185431a;

    /* JADX INFO: renamed from: b */
    public vr4<R, T> f185432b;

    /* JADX INFO: renamed from: a */
    public static <R, T> vr4<R, T> m202472a(List<vr4<R, T>> list) {
        int i = 0;
        vr4<R, T> vr4Var = list.get(0);
        while (i < list.size() - 1) {
            vr4<R, T> vr4Var2 = list.get(i);
            i++;
            vr4<R, T> vr4Var3 = list.get(i);
            vr4Var2.m202474d(vr4Var3);
            vr4Var3.m202473c(vr4Var);
        }
        return vr4Var;
    }

    /* JADX INFO: renamed from: b */
    public abstract R mo168854b(T t);

    /* JADX INFO: renamed from: c */
    public final void m202473c(vr4<R, T> vr4Var) {
        this.f185432b = vr4Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m202474d(vr4<R, T> vr4Var) {
        this.f185431a = vr4Var;
    }
}
