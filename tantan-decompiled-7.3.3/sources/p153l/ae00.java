package p153l;

import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ae00 implements ozl {

    /* JADX INFO: renamed from: a */
    public l0m f70749a;

    /* JADX INFO: renamed from: b */
    public fam f70750b;

    /* JADX INFO: renamed from: c */
    public String f70751c;

    /* JADX INFO: renamed from: d */
    public List<MMPresetFilter> f70752d;

    /* JADX INFO: renamed from: l.ae00$a */
    public class C15689a implements lpw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hn50 f70753a;

        public C15689a(hn50 hn50Var) {
            this.f70753a = hn50Var;
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: a */
        public void mo97168a(String str) {
            this.f70753a.mo101233a(str);
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: b */
        public void mo97169b(int i) {
            this.f70753a.mo101234b(i);
        }

        @Override // p153l.lpw
        /* JADX INFO: renamed from: c */
        public void mo97170c() {
            this.f70753a.mo101235c(ae00.this.f70751c);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m97146k(wo50 wo50Var, String str, int i, Exception exc) {
        if (exc == null) {
            wo50Var.success(str);
        } else {
            wo50Var.mo50745a(exc);
        }
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: A */
    public void mo97148A(int i, boolean z, float f) {
        if (this.f70749a == null || jyb.m147479J(this.f70752d) || i < 0 || i >= this.f70752d.size()) {
            return;
        }
        this.f70749a.mo118026x(0.8f);
        this.f70749a.mo118027y(this.f70752d.get(i).lookupUrl, 0.0f);
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: a */
    public void mo97149a() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo117999a();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: b */
    public void mo97150b(int i) {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118000b(i);
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: c */
    public int mo97151c() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return 0;
        }
        return l0mVar.mo118001c();
    }

    @Override // p153l.ozl
    public void create() {
        l0m l0mVarM103674a = be00.m103674a();
        this.f70749a = l0mVarM103674a;
        l0mVarM103674a.mo117994N(false);
        this.f70750b = be00.m103675b();
        String strMo61444At = CoreModule.m30932N().mo61444At();
        this.f70751c = strMo61444At;
        m97162p(strMo61444At);
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: d */
    public int mo97152d() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return 0;
        }
        return l0mVar.mo118002d();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: e */
    public boolean mo97153e() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return false;
        }
        return l0mVar.mo118003e();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: f */
    public void mo97154f() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118004f();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: g */
    public void mo97155g() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118005g();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: h */
    public boolean mo97156h() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return false;
        }
        return l0mVar.mo118006h();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: i */
    public void mo97157i() {
        if (this.f70749a == null) {
            return;
        }
        mo97158j();
        this.f70749a.mo118007i();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: j */
    public void mo97158j() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118008j();
    }

    /* JADX INFO: renamed from: m */
    public final vow m97159m() {
        qow qowVarM177325A = qow.m177325A();
        qowVarM177325A.m177329E(1);
        crf0 crf0Var = new crf0(800, 600);
        qowVarM177325A.m177330F(crf0Var);
        qowVarM177325A.m177342R(crf0Var);
        qowVarM177325A.m177329E(0);
        qowVarM177325A.m177345U(8388608);
        if ("1:1".equals(CoreModule.f18263b.getResources().getString(R$string.f21837u2))) {
            qowVarM177325A.m177339O(0);
        } else {
            qowVarM177325A.m177339O(2);
        }
        qowVarM177325A.m177327C(1);
        qowVarM177325A.m177346V(20);
        return new vow.C20896b(qowVarM177325A).m202180i();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: n */
    public void mo97160n(int i, int i2) {
        this.f70749a.mo118012n(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public void m97161o(List<MMPresetFilter> list) {
        if (this.f70749a == null) {
            return;
        }
        list.size();
        this.f70752d = list;
    }

    /* JADX INFO: renamed from: p */
    public void m97162p(String str) {
        this.f70749a.mo117988H(str);
    }

    @Override // p153l.ozl
    public void release() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.release();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: s */
    public void mo97163s() {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo118020s();
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: w */
    public void mo97164w(SurfaceHolder surfaceHolder) {
        this.f70749a.mo118025w(surfaceHolder);
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: x */
    public boolean mo97165x(Act act) {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return false;
        }
        return l0mVar.mo117998R(act, m97159m());
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: y */
    public void mo97166y(final wo50 wo50Var) {
        if (this.f70749a == null) {
            return;
        }
        final String strMo61566pd = CoreModule.m30932N().mo61566pd();
        if (TextUtils.isEmpty(strMo61566pd)) {
            o1j0.m165646t("没有找到SD卡，无法拍照").show();
        } else {
            this.f70749a.mo117982C(strMo61566pd, true, new qpw() { // from class: l.zd00
                @Override // p153l.qpw
                /* JADX INFO: renamed from: a */
                public final void mo118030a(int i, Exception exc) {
                    ae00.m97146k(wo50Var, strMo61566pd, i, exc);
                }
            });
        }
    }

    @Override // p153l.ozl
    /* JADX INFO: renamed from: z */
    public void mo97167z(hn50 hn50Var) {
        l0m l0mVar = this.f70749a;
        if (l0mVar == null) {
            return;
        }
        l0mVar.mo117996P(new C15689a(hn50Var));
    }
}
