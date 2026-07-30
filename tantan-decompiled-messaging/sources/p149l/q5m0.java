package p149l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class q5m0 implements d8m {

    /* JADX INFO: renamed from: a */
    public ndp0 f152786a;

    /* JADX INFO: renamed from: b */
    public vdo0 f152787b;

    /* JADX INFO: renamed from: c */
    public long f152788c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f152789d = false;

    /* JADX INFO: renamed from: e */
    public final e1m f152790e = new C19432a();

    /* JADX INFO: renamed from: f */
    public lqi<nnn0> f152791f;

    /* JADX INFO: renamed from: l.q5m0$a */
    public class C19432a implements e1m {
        public C19432a() {
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: a */
        public void mo111053a(Dialog dialog) {
            q5m0.this.f152789d = false;
            q5m0.this.m173056h(true);
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: b */
        public void mo111054b(Dialog dialog) {
            q5m0.this.f152789d = true;
            q5m0.this.m173056h(false);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m173051c() {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity != null && (activity instanceof Act)) {
            AnchorStartData anchorStartDataM67560k = AnchorStartData.getBuilder().m67564o(true).m67560k();
            mo110329K1(false, false, "");
            tn0.m189750r((Act) activity, anchorStartDataM67560k);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m173052d(ho2 ho2Var) {
        BLiveAbsData bLiveAbsDataMo149813j = ho2Var.mo149813j();
        String strM151022c = this.f152791f.m151022c();
        Intent intentM182688a = s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67591B(true).m67593D(bLiveAbsDataMo149813j).m67604O(strM151022c).m67615y(this.f152791f.m151020a()).m67611u());
        intentM182688a.addFlags(268435456);
        mo110329K1(false, false, "");
        ypv.f199497e.startActivity(intentM182688a);
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: B0 */
    public void mo110326B0() {
        if (NullChecker.m81303a(this.f152787b)) {
            this.f152787b.m198072i0();
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: G1 */
    public void mo110327G1() {
        if (NullChecker.m81303a(this.f152787b)) {
            this.f152787b.m198077n0();
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: K0 */
    public void mo110328K0(boolean z, boolean z2) {
        mo110329K1(z, z2, "other");
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: K1 */
    public void mo110329K1(boolean z, boolean z2, String str) {
        vdo0 vdo0Var;
        gkh0.m126627j("[live][voiceWindow]", "dismiss:" + z + z2);
        ypv.f199493a.m199376v().mo111896g(false);
        ndp0 ndp0Var = this.f152786a;
        if (ndp0Var == null || !ndp0Var.m159011l() || (vdo0Var = this.f152787b) == null) {
            return;
        }
        vdo0Var.m198074k0(z, z2);
        ypv.f199493a.m199307C0(this.f152790e);
        this.f152786a.destroy();
        this.f152786a = null;
        this.f152787b = null;
        this.f152791f = null;
        this.f152789d = false;
        zvf0.m220371D("e_audio_room_end_floating_bubble", "", vwb.m200311Y("close_type", str));
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: a */
    public boolean mo110330a() {
        if (NullChecker.m81303a(this.f152787b)) {
            return this.f152787b.m198043C();
        }
        return false;
    }

    @Override // p149l.q0m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo51532C(ndp0 ndp0Var) {
        this.f152786a = ndp0Var;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public nnn0 mo110332j() {
        vdo0 vdo0Var = this.f152787b;
        if (vdo0Var != null) {
            return vdo0Var.m198042B();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public e8m m173055g() {
        return this.f152786a.m159010k();
    }

    /* JADX INFO: renamed from: h */
    public void m173056h(boolean z) {
        ndp0 ndp0Var = this.f152786a;
        if (ndp0Var != null) {
            if (!z) {
                ndp0Var.m159009j();
            } else if (vdt.m198092b(3)) {
                this.f152786a.m159015v();
            } else {
                if (this.f152789d) {
                    return;
                }
                this.f152786a.m159015v();
            }
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: i */
    public String mo110331i() {
        return NullChecker.m81303a(this.f152787b) ? this.f152787b.m198044E() : "";
    }

    @Override // p149l.d8m
    public boolean isShowing() {
        return NullChecker.m81303a(this.f152786a) && this.f152786a.m159011l();
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: p */
    public boolean mo110333p(lqi<nnn0> lqiVar) {
        this.f152791f = lqiVar;
        if (this.f152786a.m159011l()) {
            return true;
        }
        if (!this.f152786a.m159015v()) {
            return false;
        }
        ypv.f199493a.m199376v().mo111896g(true);
        vdo0 vdo0Var = new vdo0(this, (nnn0) lqiVar.m151024e());
        this.f152787b = vdo0Var;
        vdo0Var.m198050K();
        ypv.f199493a.m199347g0(this.f152790e);
        if (ypv.f199493a.m199324Q()) {
            m173056h(false);
        }
        return true;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: q */
    public void mo110334q() {
        nnn0 nnn0VarMo147211Y1;
        vdo0 vdo0Var = this.f152787b;
        if (vdo0Var == null || (nnn0VarMo147211Y1 = vdo0Var.mo147211Y1()) == null) {
            return;
        }
        nnn0VarMo147211Y1.m160235F3();
        g4c.m124360a().m124362c(nnn0VarMo147211Y1);
        gkh0.m126627j("[live][voiceWindow]", "openBigWindow.roomState:" + nnn0VarMo147211Y1.m149816m());
        if (nnn0VarMo147211Y1.mo149819q()) {
            m173051c();
        } else {
            m173052d(nnn0VarMo147211Y1);
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: v0 */
    public boolean mo110335v0() {
        vdo0 vdo0Var = this.f152787b;
        if (vdo0Var == null || vdo0Var.mo147211Y1() == null) {
            return true;
        }
        return ((this.f152787b.mo147211Y1().mo149819q() || alk0.m97309h(this.f152787b.mo147211Y1().m160261Y2())) && this.f152787b.mo147211Y1().m149816m().m137794a() == 2) ? false : true;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: y1 */
    public void mo110336y1(View view) {
        if (SystemClock.uptimeMillis() - this.f152788c > 500) {
            this.f152788c = SystemClock.uptimeMillis();
            mo110334q();
        }
    }
}
