package p149l;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ym2 {
    private final List<g30<String, ngm, Animatable>> hookList = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m215332a(String str, ngm ngmVar, Animatable animatable, g30 g30Var) {
        if (g30Var != null) {
            g30Var.mo36055a(str, ngmVar, animatable);
        }
    }

    /* JADX INFO: renamed from: i */
    public static ym2 m215333i(ym2 ym2Var, g30<String, ngm, Animatable> g30Var) {
        if (ym2Var != null) {
            ym2Var.m215334b(g30Var);
            return ym2Var;
        }
        ym2 ym2Var2 = new ym2();
        ym2Var2.m215334b(g30Var);
        return ym2Var2;
    }

    /* JADX INFO: renamed from: b */
    public final void m215334b(g30<String, ngm, Animatable> g30Var) {
        this.hookList.add(g30Var);
    }

    /* JADX INFO: renamed from: h */
    public void mo39108h(final String str, final ngm ngmVar, final Animatable animatable) {
        vwb.m200354z(this.hookList, new e30() { // from class: l.xm2
            @Override // p149l.e30
            public final void call(Object obj) {
                ym2.m215332a(str, ngmVar, animatable, (g30) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void mo102386f(String str) {
    }

    /* JADX INFO: renamed from: c */
    public void mo39107c(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m215335d(String str, Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m215336e(String str, ngm ngmVar) {
    }

    /* JADX INFO: renamed from: g */
    public void m215337g(String str, Object obj) {
    }
}
