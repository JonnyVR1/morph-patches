package p153l;

import android.graphics.Canvas;
import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.AbstractC13665s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes11.dex */
public class g1g0 extends AbstractC13647a {

    /* JADX INFO: renamed from: A */
    public List<p60> f101750A;

    /* JADX INFO: renamed from: B */
    public boolean f101751B;

    /* JADX INFO: renamed from: C */
    public boolean f101752C;

    /* JADX INFO: renamed from: D */
    private Runnable f101753D;

    public g1g0(AbstractC13665s abstractC13665s, String str, String str2, String str3) {
        super(abstractC13665s, str, str2, str3);
        this.f101750A = new ArrayList();
        this.f101751B = false;
        this.f101752C = true;
        this.f101753D = null;
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: c */
    public void mo82134c(Canvas canvas) {
        if (this.f56505e != null) {
            Iterator<p60> it = this.f101750A.iterator();
            while (it.hasNext()) {
                it.next().m170708e(this, canvas);
            }
            if (m82137f() >= 1.0f && this.f56518r) {
                mo82140i(0.0f, 1.0f, this.f56513m);
                Runnable runnable = this.f101753D;
                if (runnable != null) {
                    runnable.run();
                }
            }
            if (this.f56518r || !this.f101752C || m82137f() < 1.0f || this.f56514n) {
                return;
            }
            this.f56501a.mo82155e();
        }
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: e */
    public DefaultHandler mo82136e() {
        return new i1g0(this);
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: h */
    public boolean mo82139h(float f) {
        return this.f56513m > 0 && f != this.f56516p.m167992g().floatValue();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T] */
    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: i */
    public void mo82140i(float f, float f2, int i) {
        float f3;
        float f4;
        super.mo82140i(f, f2, i);
        if (this.f101751B && this.f56520t) {
            for (p60 p60Var : this.f101750A) {
                for (int i2 = 0; i2 < p60Var.f150716g.size(); i2++) {
                    c53 c53Var = p60Var.f150716g.get(i2);
                    ho0 ho0VarM136375a = c53Var.f79757h;
                    if (ho0VarM136375a == null) {
                        ho0VarM136375a = c53Var.m136375a(f);
                    }
                    ho0 ho0VarM136375a2 = c53Var.m136375a(f2);
                    if (ho0VarM136375a == null || ho0VarM136375a2 == null) {
                        c53Var.f79757h = null;
                    } else {
                        if (f > f2) {
                            ho0VarM136375a2 = ho0VarM136375a;
                            ho0VarM136375a = ho0VarM136375a2;
                            f4 = f;
                            f3 = f2;
                        } else {
                            f3 = f;
                            f4 = f2;
                        }
                        ho0 ho0Var = new ho0();
                        c53Var.f79757h = ho0Var;
                        ho0Var.f110853a.m190931e(f3, f4);
                        float fM190928b = ho0VarM136375a.f110853a.m190928b(f3);
                        float fM190928b2 = ho0VarM136375a2.f110853a.m190928b(f4);
                        ho0 ho0Var2 = c53Var.f79757h;
                        drf0<Float> drf0Var = ho0Var2.f110856d;
                        drf0<Float> drf0Var2 = ho0VarM136375a2.f110856d;
                        drf0Var.f90384a = drf0Var2.f90384a;
                        drf0Var.f90385b = drf0Var2.f90385b;
                        ho0Var2.f110854b.m167994j(ho0VarM136375a.f110854b.mo150085a(fM190928b), ho0VarM136375a2.f110854b.mo150085a(fM190928b2), ho0VarM136375a2.f110854b.m167990e());
                        c53Var.f79757h.f110855c.m167994j(ho0VarM136375a.f110855c.mo150085a(fM190928b), ho0VarM136375a2.f110855c.mo150085a(fM190928b2), ho0VarM136375a2.f110855c.m167990e());
                        c53Var.f79757h.f110857e.m167994j(ho0VarM136375a.f110857e.mo150085a(fM190928b), ho0VarM136375a2.f110857e.mo150085a(fM190928b2), ho0VarM136375a2.f110857e.m167990e());
                        c53Var.f79757h.f110858f.m167994j(ho0VarM136375a.f110858f.mo150085a(fM190928b), ho0VarM136375a2.f110858f.mo150085a(fM190928b2), ho0VarM136375a2.f110858f.m167990e());
                        c53Var.f79757h.f110861i.m167994j(ho0VarM136375a.f110861i.mo150085a(fM190928b), ho0VarM136375a2.f110861i.mo150085a(fM190928b2), ho0VarM136375a2.f110861i.m167990e());
                        c53Var.f79757h.f110860h.m167994j(ho0VarM136375a.f110860h.mo150085a(fM190928b), ho0VarM136375a2.f110860h.mo150085a(fM190928b2), ho0VarM136375a2.f110860h.m167990e());
                        li80<Float> li80Var = c53Var.f79757h.f110859g;
                        li80<Float> li80Var2 = ho0VarM136375a2.f110859g;
                        li80Var.m154306a(li80Var2.f132192a, li80Var2.f132193b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public p60 m128510k() {
        if (this.f101750A.size() <= 0) {
            return null;
        }
        List<p60> list = this.f101750A;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: l */
    public void m128511l(Runnable runnable) {
        this.f101753D = runnable;
    }
}
