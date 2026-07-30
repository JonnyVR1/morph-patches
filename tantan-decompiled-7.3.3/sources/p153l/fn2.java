package p153l;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class fn2 {
    private final List<a30<String, qim, Animatable>> hookList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126350a(String str, qim qimVar, Animatable animatable, a30 a30Var) {
        if (a30Var != null) {
            a30Var.mo37058a(str, qimVar, animatable);
        }
    }

    /* JADX INFO: renamed from: i */
    public static fn2 m126351i(fn2 fn2Var, a30<String, qim, Animatable> a30Var) {
        if (fn2Var != null) {
            fn2Var.m126352b(a30Var);
            return fn2Var;
        }
        fn2 fn2Var2 = new fn2();
        fn2Var2.m126352b(a30Var);
        return fn2Var2;
    }

    /* JADX INFO: renamed from: b */
    public final void m126352b(a30<String, qim, Animatable> a30Var) {
        this.hookList.add(a30Var);
    }

    /* JADX INFO: renamed from: h */
    public void mo40111h(final String str, final qim qimVar, final Animatable animatable) {
        jyb.m147537z(this.hookList, new y20() { // from class: l.en2
            @Override // p153l.y20
            public final void call(Object obj) {
                fn2.m126350a(str, qimVar, animatable, (a30) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void mo108585f(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void mo40110c(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m126353d(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m126354e(String str, qim qimVar) {
    }

    /* JADX INFO: renamed from: g */
    public void m126355g(String str, Object obj) {
    }
}
