package p149l;

import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m500 implements wwl {

    /* JADX INFO: renamed from: a */
    public sxl f131351a;

    /* JADX INFO: renamed from: b */
    public p7m f131352b;

    /* JADX INFO: renamed from: c */
    public String f131353c;

    /* JADX INFO: renamed from: d */
    public List<MMPresetFilter> f131354d;

    /* JADX INFO: renamed from: l.m500$a */
    public class C18397a implements mmw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ af50 f131355a;

        public C18397a(af50 af50Var) {
            this.f131355a = af50Var;
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: a */
        public void mo101512a(String str) {
            this.f131355a.mo96185a(str);
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: b */
        public void mo101513b(int i) {
            this.f131355a.mo96186b(i);
        }

        @Override // p149l.mmw
        /* JADX INFO: renamed from: c */
        public void mo101514c() {
            this.f131355a.mo96187c(m500.this.f131353c);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m153106k(qg50 qg50Var, String str, int i, Exception exc) {
        if (exc == null) {
            qg50Var.success(str);
        } else {
            qg50Var.mo49562a(exc);
        }
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: A */
    public void mo153108A(int i, boolean z, float f) {
        if (this.f131351a == null || vwb.m200296J(this.f131354d) || i < 0 || i >= this.f131354d.size()) {
            return;
        }
        this.f131351a.mo189610x(0.8f);
        this.f131351a.mo189611y(this.f131354d.get(i).lookupUrl, 0.0f);
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: a */
    public void mo153109a() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189587a();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: b */
    public void mo153110b(int i) {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189588b(i);
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: c */
    public int mo153111c() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return 0;
        }
        return sxlVar.mo189589c();
    }

    @Override // p149l.wwl
    public void create() {
        sxl sxlVarM157980a = n500.m157980a();
        this.f131351a = sxlVarM157980a;
        sxlVarM157980a.mo189584N(false);
        this.f131352b = n500.m157981b();
        String strMo60260At = CoreModule.m29934N().mo60260At();
        this.f131353c = strMo60260At;
        m153122p(strMo60260At);
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: d */
    public int mo153112d() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return 0;
        }
        return sxlVar.mo189590d();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: e */
    public boolean mo153113e() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.mo189591e();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: f */
    public void mo153114f() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189592f();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: g */
    public void mo153115g() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo189593g();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: h */
    public boolean mo153116h() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.mo186451h();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: i */
    public void mo153117i() {
        if (this.f131351a == null) {
            return;
        }
        mo153118j();
        this.f131351a.mo186452i();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: j */
    public void mo153118j() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo186453j();
    }

    /* JADX INFO: renamed from: m */
    public final wlw m153119m() {
        rlw rlwVarM179885A = rlw.m179885A();
        rlwVarM179885A.m179889E(1);
        tif0 tif0Var = new tif0(800, 600);
        rlwVarM179885A.m179890F(tif0Var);
        rlwVarM179885A.m179902R(tif0Var);
        rlwVarM179885A.m179889E(0);
        rlwVarM179885A.m179905U(8388608);
        if ("1:1".equals(CoreModule.f17544b.getResources().getString(R$string.f21095u2))) {
            rlwVarM179885A.m179899O(0);
        } else {
            rlwVarM179885A.m179899O(2);
        }
        rlwVarM179885A.m179887C(1);
        rlwVarM179885A.m179906V(20);
        return new wlw.C20891b(rlwVarM179885A).m203959i();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: n */
    public void mo153120n(int i, int i2) {
        this.f131351a.mo189597n(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public void m153121o(List<MMPresetFilter> list) {
        if (this.f131351a == null) {
            return;
        }
        list.size();
        this.f131354d = list;
    }

    /* JADX INFO: renamed from: p */
    public void m153122p(String str) {
        this.f131351a.mo186445H(str);
    }

    @Override // p149l.wwl
    public void release() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.release();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: s */
    public void mo153123s() {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo186454s();
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: w */
    public void mo153124w(SurfaceHolder surfaceHolder) {
        this.f131351a.mo189609w(surfaceHolder);
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: x */
    public boolean mo153125x(Act act) {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return false;
        }
        return sxlVar.mo186450R(act, m153119m());
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: y */
    public void mo153126y(final qg50 qg50Var) {
        if (this.f131351a == null) {
            return;
        }
        final String strMo60382pd = CoreModule.m29934N().mo60382pd();
        if (TextUtils.isEmpty(strMo60382pd)) {
            lsi0.m151590t("没有找到SD卡，无法拍照").show();
        } else {
            this.f131351a.mo189577C(strMo60382pd, true, new rmw() { // from class: l.l500
                @Override // p149l.rmw
                /* JADX INFO: renamed from: a */
                public final void mo108309a(int i, Exception exc) {
                    m500.m153106k(qg50Var, strMo60382pd, i, exc);
                }
            });
        }
    }

    @Override // p149l.wwl
    /* JADX INFO: renamed from: z */
    public void mo153127z(af50 af50Var) {
        sxl sxlVar = this.f131351a;
        if (sxlVar == null) {
            return;
        }
        sxlVar.mo186449P(new C18397a(af50Var));
    }
}
