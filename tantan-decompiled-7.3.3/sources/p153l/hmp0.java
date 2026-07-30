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
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public class hmp0 implements tam {

    /* JADX INFO: renamed from: a */
    public rmp0 f110651a;

    /* JADX INFO: renamed from: b */
    public vpo0 f110652b;

    /* JADX INFO: renamed from: c */
    public Runnable f110653c;

    /* JADX INFO: renamed from: d */
    public rwn0 f110654d;

    /* JADX INFO: renamed from: e */
    public long f110655e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f110656f = false;

    /* JADX INFO: renamed from: g */
    public final ga1 f110657g = new pvn.C19456a(new x20() { // from class: l.emp0
        @Override // p153l.x20
        public final void call() {
            this.f94677a.m135954k();
        }
    }, null);

    /* JADX INFO: renamed from: h */
    public final x3m f110658h = new C17510a();

    /* JADX INFO: renamed from: l.hmp0$a */
    public class C17510a implements x3m {
        public C17510a() {
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: a */
        public void mo108624a(Dialog dialog) {
            hmp0.this.f110656f = false;
            hmp0.this.m135955l(true);
        }

        @Override // p153l.x3m
        /* JADX INFO: renamed from: b */
        public void mo108625b(Dialog dialog) {
            hmp0.this.f110656f = true;
            hmp0.this.m135955l(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m135954k() {
        mo135957K0(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m135955l(boolean z) {
        rmp0 rmp0Var = this.f110651a;
        if (rmp0Var != null) {
            if (!z) {
                rmp0Var.m182095j();
            } else if (wft.m206159b(3)) {
                this.f110651a.m182101v();
            } else {
                if (this.f110656f) {
                    return;
                }
                this.f110651a.m182101v();
            }
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: B0 */
    public void mo135956B0() {
        if (NullChecker.m82486a(this.f110652b)) {
            this.f110652b.m202308W();
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
        pvn.m173966a();
        nsh0.m164608j("[live][voiceWindow]", "dismiss:" + z + z2);
        zrv.f205799a.m207698v().mo136903g(false);
        rmp0 rmp0Var = this.f110651a;
        if (rmp0Var == null || !rmp0Var.m182097l() || this.f110652b == null) {
            return;
        }
        Runnable runnable = this.f110653c;
        if (runnable != null) {
            l51.m152890J(runnable);
            this.f110653c = null;
        }
        this.f110652b.m202310Y(z, z2);
        zrv.f205799a.m207629C0(this.f110658h);
        this.f110651a.destroy();
        this.f110651a = null;
        this.f110652b = null;
        this.f110654d = null;
        this.f110656f = false;
        i4g0.m138495D("e_audio_room_end_floating_bubble", "", jyb.m147494Y("close_type", str));
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: a */
    public boolean mo135959a() {
        if (NullChecker.m82486a(this.f110652b)) {
            return this.f110652b.m202329x();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m135960f() {
        Activity activity = Act.foreground_() == null ? null : Act.foreground_().f16062a.get();
        if (activity != null && (activity instanceof Act)) {
            AnchorStartData anchorStartDataM68743k = AnchorStartData.getBuilder().m68747o(true).m68743k();
            mo135958K1(false, false, "");
            pn0.m172994r((Act) activity, anchorStartDataM68743k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m135961g(oo2 oo2Var) {
        BLiveAbsData bLiveAbsDataMo183435j = oo2Var.mo183435j();
        String strM202327v = this.f110652b.m202327v();
        Intent intentM219041a = z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68774B(true).m68776D(bLiveAbsDataMo183435j).m68787O(strM202327v).m68798y(this.f110652b.m202326u()).m68794u());
        intentM219041a.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        mo135958K1(false, false, "");
        zrv.f205803e.startActivity(intentM219041a);
    }

    @Override // p153l.k3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo52715C(rmp0 rmp0Var) {
        this.f110651a = rmp0Var;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: i */
    public String mo135963i() {
        return NullChecker.m82486a(this.f110652b) ? this.f110652b.m202331z() : "";
    }

    @Override // p153l.tam
    public boolean isShowing() {
        return NullChecker.m82486a(this.f110651a) && this.f110651a.m182097l();
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: j */
    public oo2 mo135964j() {
        if (NullChecker.m82486a(this.f110652b)) {
            return this.f110652b.m202328w();
        }
        return null;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: p */
    public boolean mo135965p(hti<rwn0> htiVar) {
        this.f110654d = (rwn0) htiVar.m137080e();
        if (this.f110651a.m182097l()) {
            return true;
        }
        if (!this.f110651a.m182101v()) {
            return false;
        }
        AudioBusinessType.CHAT_ROOM_WINDOW.setBusinessMsg(k3d0.m148007c(R$string.f48378t));
        pvn.m173969d(true, this.f110657g);
        zrv.f205799a.m207698v().mo136903g(true);
        vpo0 vpo0Var = new vpo0((rwn0) htiVar.m137080e(), new ngj0((View) this.f110651a.m182096k(), null, htiVar.m137078c(), htiVar.m137076a()), new z20() { // from class: l.fmp0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f99822a.mo135957K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        }, new y20() { // from class: l.gmp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105021a.m135955l(((Boolean) obj).booleanValue());
            }
        });
        this.f110652b = vpo0Var;
        vpo0Var.m202290E();
        zrv.f205799a.m207669g0(this.f110658h);
        if (zrv.f205799a.m207646Q()) {
            m135955l(false);
        }
        return true;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: q */
    public void mo135966q() {
        oo2 oo2VarM202328w;
        vpo0 vpo0Var = this.f110652b;
        if (vpo0Var == null || (oo2VarM202328w = vpo0Var.m202328w()) == null) {
            return;
        }
        if (oo2VarM202328w instanceof rwn0) {
            ((rwn0) oo2VarM202328w).m183397F3();
        }
        o5c.m166095a().m166097c(oo2VarM202328w);
        nsh0.m164608j("[live][voiceWindow]", "openBigWindow.roomState:" + oo2VarM202328w.m202193m());
        if (oo2VarM202328w.mo183444q()) {
            m135960f();
        } else {
            m135961g(oo2VarM202328w);
        }
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: v0 */
    public boolean mo135967v0() {
        rwn0 rwn0Var = this.f110654d;
        if (rwn0Var != null) {
            return ((rwn0Var.mo183444q() || guk0.m132329h(this.f110654d.m183423Y2())) && this.f110654d.m202193m().m146875a() == 2) ? false : true;
        }
        return true;
    }

    @Override // p153l.tam
    /* JADX INFO: renamed from: y1 */
    public void mo135968y1(View view) {
        if (SystemClock.uptimeMillis() - this.f110655e > 500) {
            this.f110655e = SystemClock.uptimeMillis();
            mo135966q();
        }
    }
}
