package p149l;

import android.graphics.Canvas;
import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.AbstractC13502s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes13.dex */
public class xsf0 extends AbstractC13484a {

    /* JADX INFO: renamed from: A */
    public List<t60> f194237A;

    /* JADX INFO: renamed from: B */
    public boolean f194238B;

    /* JADX INFO: renamed from: C */
    public boolean f194239C;

    /* JADX INFO: renamed from: D */
    private Runnable f194240D;

    public xsf0(AbstractC13502s abstractC13502s, String str, String str2, String str3) {
        super(abstractC13502s, str, str2, str3);
        this.f194237A = new ArrayList();
        this.f194238B = false;
        this.f194239C = true;
        this.f194240D = null;
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: c */
    public void mo80951c(Canvas canvas) {
        if (this.f55657e != null) {
            Iterator<t60> it = this.f194237A.iterator();
            while (it.hasNext()) {
                it.next().m187353e(this, canvas);
            }
            if (m80954f() >= 1.0f && this.f55670r) {
                mo80957i(0.0f, 1.0f, this.f55665m);
                Runnable runnable = this.f194240D;
                if (runnable != null) {
                    runnable.run();
                }
            }
            if (this.f55670r || !this.f194239C || m80954f() < 1.0f || this.f55666n) {
                return;
            }
            this.f55653a.mo80972e();
        }
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: e */
    public DefaultHandler mo80953e() {
        return new zsf0(this);
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: h */
    public boolean mo80956h(float f) {
        return this.f55665m > 0 && f != this.f55668p.m145368g().floatValue();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T] */
    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: i */
    public void mo80957i(float f, float f2, int i) {
        float f3;
        float f4;
        super.mo80957i(f, f2, i);
        if (this.f194238B && this.f55672t) {
            for (t60 t60Var : this.f194237A) {
                for (int i2 = 0; i2 < t60Var.f167894g.size(); i2++) {
                    m43 m43Var = t60Var.f167894g.get(i2);
                    lo0 lo0VarM150758a = m43Var.f131222h;
                    if (lo0VarM150758a == null) {
                        lo0VarM150758a = m43Var.m150758a(f);
                    }
                    lo0 lo0VarM150758a2 = m43Var.m150758a(f2);
                    if (lo0VarM150758a == null || lo0VarM150758a2 == null) {
                        m43Var.f131222h = null;
                    } else {
                        if (f > f2) {
                            lo0VarM150758a2 = lo0VarM150758a;
                            lo0VarM150758a = lo0VarM150758a2;
                            f4 = f;
                            f3 = f2;
                        } else {
                            f3 = f;
                            f4 = f2;
                        }
                        lo0 lo0Var = new lo0();
                        m43Var.f131222h = lo0Var;
                        lo0Var.f129046a.m168510e(f3, f4);
                        float fM168507b = lo0VarM150758a.f129046a.m168507b(f3);
                        float fM168507b2 = lo0VarM150758a2.f129046a.m168507b(f4);
                        lo0 lo0Var2 = m43Var.f131222h;
                        uif0<Float> uif0Var = lo0Var2.f129049d;
                        uif0<Float> uif0Var2 = lo0VarM150758a2.f129049d;
                        uif0Var.f176651a = uif0Var2.f176651a;
                        uif0Var.f176652b = uif0Var2.f176652b;
                        lo0Var2.f129047b.m145370j(lo0VarM150758a.f129047b.mo125466a(fM168507b), lo0VarM150758a2.f129047b.mo125466a(fM168507b2), lo0VarM150758a2.f129047b.m145366e());
                        m43Var.f131222h.f129048c.m145370j(lo0VarM150758a.f129048c.mo125466a(fM168507b), lo0VarM150758a2.f129048c.mo125466a(fM168507b2), lo0VarM150758a2.f129048c.m145366e());
                        m43Var.f131222h.f129050e.m145370j(lo0VarM150758a.f129050e.mo125466a(fM168507b), lo0VarM150758a2.f129050e.mo125466a(fM168507b2), lo0VarM150758a2.f129050e.m145366e());
                        m43Var.f131222h.f129051f.m145370j(lo0VarM150758a.f129051f.mo125466a(fM168507b), lo0VarM150758a2.f129051f.mo125466a(fM168507b2), lo0VarM150758a2.f129051f.m145366e());
                        m43Var.f131222h.f129054i.m145370j(lo0VarM150758a.f129054i.mo125466a(fM168507b), lo0VarM150758a2.f129054i.mo125466a(fM168507b2), lo0VarM150758a2.f129054i.m145366e());
                        m43Var.f131222h.f129053h.m145370j(lo0VarM150758a.f129053h.mo125466a(fM168507b), lo0VarM150758a2.f129053h.mo125466a(fM168507b2), lo0VarM150758a2.f129053h.m145366e());
                        fa80<Float> fa80Var = m43Var.f131222h.f129052g;
                        fa80<Float> fa80Var2 = lo0VarM150758a2.f129052g;
                        fa80Var.m120162a(fa80Var2.f96575a, fa80Var2.f96576b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public t60 m210742k() {
        if (this.f194237A.size() <= 0) {
            return null;
        }
        List<t60> list = this.f194237A;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    public void m210743l(Runnable runnable) {
        this.f194240D = runnable;
    }
}
