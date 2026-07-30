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
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class ddp0 implements d8m {

    /* JADX INFO: renamed from: a */
    public ndp0 f85614a;

    /* JADX INFO: renamed from: b */
    public rgo0 f85615b;

    /* JADX INFO: renamed from: c */
    public Runnable f85616c;

    /* JADX INFO: renamed from: d */
    public nnn0 f85617d;

    /* JADX INFO: renamed from: e */
    public long f85618e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f85619f = false;

    /* JADX INFO: renamed from: g */
    public final z91 f85620g = new ptn.C19336a(new d30() { // from class: l.adp0
        @Override // p149l.d30
        public final void call() {
            this.f68953a.m111048k();
        }
    }, null);

    /* JADX INFO: renamed from: h */
    public final e1m f85621h = new C16338a();

    /* JADX INFO: renamed from: l.ddp0$a */
    public class C16338a implements e1m {
        public C16338a() {
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: a */
        public void mo111053a(Dialog dialog) {
            ddp0.this.f85619f = false;
            ddp0.this.m111049l(true);
        }

        @Override // p149l.e1m
        /* JADX INFO: renamed from: b */
        public void mo111054b(Dialog dialog) {
            ddp0.this.f85619f = true;
            ddp0.this.m111049l(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m111048k() {
        mo110328K0(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m111049l(boolean z) {
        ndp0 ndp0Var = this.f85614a;
        if (ndp0Var != null) {
            if (!z) {
                ndp0Var.m159009j();
            } else if (vdt.m198092b(3)) {
                this.f85614a.m159015v();
            } else {
                if (this.f85619f) {
                    return;
                }
                this.f85614a.m159015v();
            }
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: B0 */
    public void mo110326B0() {
        if (NullChecker.m81303a(this.f85615b)) {
            this.f85615b.m179219W();
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
        ptn.m171361a();
        gkh0.m126627j("[live][voiceWindow]", "dismiss:" + z + z2);
        ypv.f199493a.m199376v().mo111896g(false);
        ndp0 ndp0Var = this.f85614a;
        if (ndp0Var == null || !ndp0Var.m159011l() || this.f85615b == null) {
            return;
        }
        Runnable runnable = this.f85616c;
        if (runnable != null) {
            e51.m114745J(runnable);
            this.f85616c = null;
        }
        this.f85615b.m179221Y(z, z2);
        ypv.f199493a.m199307C0(this.f85621h);
        this.f85614a.destroy();
        this.f85614a = null;
        this.f85615b = null;
        this.f85617d = null;
        this.f85619f = false;
        zvf0.m220371D("e_audio_room_end_floating_bubble", "", vwb.m200311Y("close_type", str));
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: a */
    public boolean mo110330a() {
        if (NullChecker.m81303a(this.f85615b)) {
            return this.f85615b.m179240x();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m111050f() {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f15343a.get();
        if (activity != null && (activity instanceof Act)) {
            AnchorStartData anchorStartDataM67560k = AnchorStartData.getBuilder().m67564o(true).m67560k();
            mo110329K1(false, false, "");
            tn0.m189750r((Act) activity, anchorStartDataM67560k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m111051g(ho2 ho2Var) {
        BLiveAbsData bLiveAbsDataMo149813j = ho2Var.mo149813j();
        String strM179238v = this.f85615b.m179238v();
        Intent intentM182688a = s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67591B(true).m67593D(bLiveAbsDataMo149813j).m67604O(strM179238v).m67615y(this.f85615b.m179237u()).m67611u());
        intentM182688a.addFlags(268435456);
        mo110329K1(false, false, "");
        ypv.f199497e.startActivity(intentM182688a);
    }

    @Override // p149l.q0m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo51532C(ndp0 ndp0Var) {
        this.f85614a = ndp0Var;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: i */
    public String mo110331i() {
        return NullChecker.m81303a(this.f85615b) ? this.f85615b.m179242z() : "";
    }

    @Override // p149l.d8m
    public boolean isShowing() {
        return NullChecker.m81303a(this.f85614a) && this.f85614a.m159011l();
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: j */
    public ho2 mo110332j() {
        if (NullChecker.m81303a(this.f85615b)) {
            return this.f85615b.m179239w();
        }
        return null;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: p */
    public boolean mo110333p(lqi<nnn0> lqiVar) {
        this.f85617d = (nnn0) lqiVar.m151024e();
        if (this.f85614a.m159011l()) {
            return true;
        }
        if (!this.f85614a.m159015v()) {
            return false;
        }
        AudioBusinessType.CHAT_ROOM_WINDOW.setBusinessMsg(hvc0.m133156c(R$string.f47530t));
        ptn.m171364d(true, this.f85620g);
        ypv.f199493a.m199376v().mo111896g(true);
        rgo0 rgo0Var = new rgo0((nnn0) lqiVar.m151024e(), new j7j0((View) this.f85614a.m159010k(), null, lqiVar.m151022c(), lqiVar.m151020a()), new f30() { // from class: l.bdp0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f75048a.mo110328K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, new e30() { // from class: l.cdp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80399a.m111049l(((Boolean) obj).booleanValue());
            }
        });
        this.f85615b = rgo0Var;
        rgo0Var.m179201E();
        ypv.f199493a.m199347g0(this.f85621h);
        if (ypv.f199493a.m199324Q()) {
            m111049l(false);
        }
        return true;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: q */
    public void mo110334q() {
        ho2 ho2VarM179239w;
        rgo0 rgo0Var = this.f85615b;
        if (rgo0Var == null || (ho2VarM179239w = rgo0Var.m179239w()) == null) {
            return;
        }
        if (ho2VarM179239w instanceof nnn0) {
            ((nnn0) ho2VarM179239w).m160235F3();
        }
        g4c.m124360a().m124362c(ho2VarM179239w);
        gkh0.m126627j("[live][voiceWindow]", "openBigWindow.roomState:" + ho2VarM179239w.m149816m());
        if (ho2VarM179239w.mo149819q()) {
            m111050f();
        } else {
            m111051g(ho2VarM179239w);
        }
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: v0 */
    public boolean mo110335v0() {
        nnn0 nnn0Var = this.f85617d;
        if (nnn0Var != null) {
            return ((nnn0Var.mo149819q() || alk0.m97309h(this.f85617d.m160261Y2())) && this.f85617d.m149816m().m137794a() == 2) ? false : true;
        }
        return true;
    }

    @Override // p149l.d8m
    /* JADX INFO: renamed from: y1 */
    public void mo110336y1(View view) {
        if (SystemClock.uptimeMillis() - this.f85618e > 500) {
            this.f85618e = SystemClock.uptimeMillis();
            mo110334q();
        }
    }
}
