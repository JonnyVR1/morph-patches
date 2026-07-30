package p007l;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.g30;
import l.ngm;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ym2 {
    private final List<g30<String, ngm, Animatable>> hookList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11934a(String str, ngm ngmVar, Animatable animatable, g30 g30Var) {
        if (g30Var != null) {
            g30Var.a(str, ngmVar, animatable);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ym2 m11935i(ym2 ym2Var, g30<String, ngm, Animatable> g30Var) {
        if (ym2Var != null) {
            ym2Var.m11936b(g30Var);
            return ym2Var;
        }
        ym2 ym2Var2 = new ym2();
        ym2Var2.m11936b(g30Var);
        return ym2Var2;
    }

    /* JADX INFO: renamed from: b */
    public final void m11936b(g30<String, ngm, Animatable> g30Var) {
        this.hookList.add(g30Var);
    }

    /* JADX INFO: renamed from: h */
    public void m11942h(final String str, final ngm ngmVar, final Animatable animatable) {
        vwb.z(this.hookList, new e30() { // from class: l.xm2
            public final void call(Object obj) {
                ym2.m11934a(str, ngmVar, animatable, (g30) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m11940f(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void m11937c(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m11938d(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m11939e(String str, ngm ngmVar) {
    }

    /* JADX INFO: renamed from: g */
    public void m11941g(String str, Object obj) {
    }
}
