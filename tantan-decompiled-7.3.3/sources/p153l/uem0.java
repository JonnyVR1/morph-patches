package p153l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public class uem0 implements tam {

    /* JADX INFO: renamed from: a */
    public rmp0 f178673a;

    /* JADX INFO: renamed from: b */
    public zmo0 f178674b;

    /* JADX INFO: renamed from: c */
    public long f178675c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f178676d = false;

    /* JADX INFO: renamed from: e */
    public final x3m f178677e = new C20553a();

    /* JADX INFO: renamed from: f */
    public hti<rwn0> f178678f;

    /* JADX INFO: renamed from: l.uem0$a */
    public class C20553a implements x3m {
        public C20553a() {
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: a */
        public void mo108624a(Dialog dialog) {
            uem0.this.f178676d = false;
            uem0.this.m195787h(true);
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: b */
        public void mo108625b(Dialog dialog) {
            uem0.this.f178676d = true;
            uem0.this.m195787h(false);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m195782c() {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity != null && (activity instanceof Act)) {
            AnchorStartData anchorStartDataM68743k = AnchorStartData.getBuilder().m68747o(true).m68743k();
            mo135958K1(false, false, "");
            pn0.m172994r((Act) activity, anchorStartDataM68743k);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m195783d(oo2 oo2Var) {
        BLiveAbsData bLiveAbsDataMo183435j = oo2Var.mo183435j();
        String strM137078c = this.f178678f.m137078c();
        Intent intentM219041a = z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68774B(true).m68776D(bLiveAbsDataMo183435j).m68787O(strM137078c).m68798y(this.f178678f.m137076a()).m68794u());
        intentM219041a.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        mo135958K1(false, false, "");
        zrv.f205803e.startActivity(intentM219041a);
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: B0 */
    public void mo135956B0() {
        if (NullChecker.m82486a(this.f178674b)) {
            this.f178674b.m220458i0();
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: G1 */
    public void mo189914G1() {
        if (NullChecker.m82486a(this.f178674b)) {
            this.f178674b.m220463n0();
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: K0 */
    public void mo135957K0(boolean z, boolean z2) {
        mo135958K1(z, z2, "other");
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: K1 */
    public void mo135958K1(boolean z, boolean z2, String str) {
        zmo0 zmo0Var;
        nsh0.m164608j("[live][voiceWindow]", "dismiss:" + z + z2);
        zrv.f205799a.m207698v().mo136903g(false);
        rmp0 rmp0Var = this.f178673a;
        if (rmp0Var == null || !rmp0Var.m182097l() || (zmo0Var = this.f178674b) == null) {
            return;
        }
        zmo0Var.m220460k0(z, z2);
        zrv.f205799a.m207629C0(this.f178677e);
        this.f178673a.destroy();
        this.f178673a = null;
        this.f178674b = null;
        this.f178678f = null;
        this.f178676d = false;
        i4g0.m138495D("e_audio_room_end_floating_bubble", "", jyb.m147494Y("close_type", str));
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: a */
    public boolean mo135959a() {
        if (NullChecker.m82486a(this.f178674b)) {
            return this.f178674b.m220429C();
        }
        return false;
    }

    @Override // p153l.k3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo52715C(rmp0 rmp0Var) {
        this.f178673a = rmp0Var;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public rwn0 mo135964j() {
        zmo0 zmo0Var = this.f178674b;
        if (zmo0Var != null) {
            return zmo0Var.m220428B();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public uam m195786g() {
        return this.f178673a.m182096k();
    }

    /* JADX INFO: renamed from: h */
    public void m195787h(boolean z) {
        rmp0 rmp0Var = this.f178673a;
        if (rmp0Var != null) {
            if (!z) {
                rmp0Var.m182095j();
            } else if (wft.m206159b(3)) {
                this.f178673a.m182101v();
            } else {
                if (this.f178676d) {
                    return;
                }
                this.f178673a.m182101v();
            }
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: i */
    public String mo135963i() {
        return NullChecker.m82486a(this.f178674b) ? this.f178674b.m220430E() : "";
    }

    @Override // p153l.tam
    public boolean isShowing() {
        return NullChecker.m82486a(this.f178673a) && this.f178673a.m182097l();
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: p */
    public boolean mo135965p(hti<rwn0> htiVar) {
        this.f178678f = htiVar;
        if (this.f178673a.m182097l()) {
            return true;
        }
        if (!this.f178673a.m182101v()) {
            return false;
        }
        zrv.f205799a.m207698v().mo136903g(true);
        zmo0 zmo0Var = new zmo0(this, (rwn0) htiVar.m137080e());
        this.f178674b = zmo0Var;
        zmo0Var.m220436K();
        zrv.f205799a.m207669g0(this.f178677e);
        if (zrv.f205799a.m207646Q()) {
            m195787h(false);
        }
        return true;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: q */
    public void mo135966q() {
        rwn0 rwn0VarMo217200Y1;
        zmo0 zmo0Var = this.f178674b;
        if (zmo0Var == null || (rwn0VarMo217200Y1 = zmo0Var.mo217200Y1()) == null) {
            return;
        }
        rwn0VarMo217200Y1.m183397F3();
        o5c.m166095a().m166097c(rwn0VarMo217200Y1);
        nsh0.m164608j("[live][voiceWindow]", "openBigWindow.roomState:" + rwn0VarMo217200Y1.m202193m());
        if (rwn0VarMo217200Y1.mo183444q()) {
            m195782c();
        } else {
            m195783d(rwn0VarMo217200Y1);
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: v0 */
    public boolean mo135967v0() {
        zmo0 zmo0Var = this.f178674b;
        if (zmo0Var == null || zmo0Var.mo217200Y1() == null) {
            return true;
        }
        return ((this.f178674b.mo217200Y1().mo183444q() || guk0.m132329h(this.f178674b.mo217200Y1().m183423Y2())) && this.f178674b.mo217200Y1().m202193m().m146875a() == 2) ? false : true;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: y1 */
    public void mo135968y1(View view) {
        if (SystemClock.uptimeMillis() - this.f178675c > 500) {
            this.f178675c = SystemClock.uptimeMillis();
            mo135966q();
        }
    }
}
