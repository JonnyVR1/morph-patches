package p003l;

import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import java.util.List;
import l.lsi0;
import l.mmw;
import l.n500;
import l.p7m;
import l.rlw;
import l.rmw;
import l.sxl;
import l.tif0;
import l.vwb;
import l.wlw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class m500 implements wwl {

    /* JADX INFO: renamed from: a */
    public sxl f5543a;

    /* JADX INFO: renamed from: b */
    public p7m f5544b;

    /* JADX INFO: renamed from: c */
    public String f5545c;

    /* JADX INFO: renamed from: d */
    public List<MMPresetFilter> f5546d;

    /* JADX INFO: renamed from: l.m500$a */
    public class C0423a implements mmw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ af50 f5547a;

        public C0423a(af50 af50Var) {
            this.f5547a = af50Var;
        }

        /* JADX INFO: renamed from: a */
        public void m6319a(String str) {
            this.f5547a.mo2847a(str);
        }

        /* JADX INFO: renamed from: b */
        public void m6320b(int i) {
            this.f5547a.mo2848b(i);
        }

        /* JADX INFO: renamed from: c */
        public void m6321c() {
            this.f5547a.mo2849c(m500.this.f5545c);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6297k(qg50 qg50Var, String str, int i, Exception exc) {
        if (exc == null) {
            qg50Var.success(str);
        } else {
            qg50Var.mo2711a(exc);
        }
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: A */
    public void mo6299A(int i, boolean z, float f) {
        if (this.f5543a == null || vwb.J(this.f5546d) || i < 0 || i >= this.f5546d.size()) {
            return;
        }
        this.f5543a.x(0.8f);
        this.f5543a.y(this.f5546d.get(i).lookupUrl, 0.0f);
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: a */
    public void mo6300a() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.a();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: b */
    public void mo6301b(int i) {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.b(i);
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: c */
    public int mo6302c() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return 0;
        }
        return sxlVar.c();
    }

    @Override // p003l.wwl
    public void create() {
        sxl sxlVarA = n500.a();
        this.f5543a = sxlVarA;
        sxlVarA.N(false);
        this.f5544b = n500.b();
        String strAt = CoreModule.N().At();
        this.f5545c = strAt;
        m6313p(strAt);
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: d */
    public int mo6303d() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return 0;
        }
        return sxlVar.d();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: e */
    public boolean mo6304e() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.e();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: f */
    public void mo6305f() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.f();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: g */
    public void mo6306g() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.g();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: h */
    public boolean mo6307h() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.h();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: i */
    public void mo6308i() {
        if (this.f5543a == null) {
            return;
        }
        mo6309j();
        this.f5543a.i();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: j */
    public void mo6309j() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.j();
    }

    /* JADX INFO: renamed from: m */
    public final wlw m6310m() {
        rlw rlwVarA = rlw.A();
        rlwVarA.E(1);
        tif0 tif0Var = new tif0(800, 600);
        rlwVarA.F(tif0Var);
        rlwVarA.R(tif0Var);
        rlwVarA.E(0);
        rlwVarA.U(8388608);
        if ("1:1".equals(CoreModule.b.getResources().getString(R.string.u2))) {
            rlwVarA.O(0);
        } else {
            rlwVarA.O(2);
        }
        rlwVarA.C(1);
        rlwVarA.V(20);
        return new wlw.b(rlwVarA).i();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: n */
    public void mo6311n(int i, int i2) {
        this.f5543a.n(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public void m6312o(List<MMPresetFilter> list) {
        if (this.f5543a == null) {
            return;
        }
        list.size();
        this.f5546d = list;
    }

    /* JADX INFO: renamed from: p */
    public void m6313p(String str) {
        this.f5543a.H(str);
    }

    @Override // p003l.wwl
    public void release() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.release();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: s */
    public void mo6314s() {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.s();
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: w */
    public void mo6315w(SurfaceHolder surfaceHolder) {
        this.f5543a.w(surfaceHolder);
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: x */
    public boolean mo6316x(Act act) {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.R(act, m6310m());
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: y */
    public void mo6317y(final qg50 qg50Var) {
        if (this.f5543a == null) {
            return;
        }
        final String strPd = CoreModule.N().pd();
        if (TextUtils.isEmpty(strPd)) {
            lsi0.t("没有找到SD卡，无法拍照").show();
        } else {
            this.f5543a.C(strPd, true, new rmw() { // from class: l.l500
                /* JADX INFO: renamed from: a */
                public final void m5973a(int i, Exception exc) {
                    m500.m6297k(qg50Var, strPd, i, exc);
                }
            });
        }
    }

    @Override // p003l.wwl
    /* JADX INFO: renamed from: z */
    public void mo6318z(af50 af50Var) {
        sxl sxlVar = this.f5543a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.P(new C0423a(af50Var));
    }
}
