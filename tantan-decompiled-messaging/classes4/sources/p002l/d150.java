package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l.bul;
import l.e30;
import l.ffw;
import l.hfw;
import l.lsi0;
import l.rwb;
import l.soj0;
import l.u0t;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d150 extends pat<pn40> implements bul, e0m {

    /* JADX INFO: renamed from: i */
    public final nph0 f9014i;

    /* JADX INFO: renamed from: j */
    public final p150 f9015j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f9016k;

    /* JADX INFO: renamed from: l */
    public y680 f9017l;

    /* JADX INFO: renamed from: m */
    public BLiveAbsData f9018m;

    public d150(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        this.f9016k = frameLayout;
        this.f9015j = (p150) z2(new p150(bsmVar, this));
        this.f9017l = new y680();
        nph0 nph0Var = new nph0();
        this.f9014i = nph0Var;
        nph0Var.m18907y(x680.m25692a().m25693b(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m11551T3(iqv iqvVar) {
        int iM15298a = iqvVar.m15298a();
        if (iM15298a == 2) {
            m11568Z3();
        } else if (iM15298a == 3) {
            this.f9014i.m18903u(false);
        } else if (iM15298a == 4) {
            m11552d4();
        }
        m11578i4(iqvVar);
    }

    /* JADX INFO: renamed from: d4 */
    private void m11552d4() {
        this.f9017l.m26379n(false);
        this.f9014i.m18903u(true);
    }

    /* JADX INFO: renamed from: D0 */
    public void m11553D0() {
        m25548F2().ObsPlayerEvent.onVideoEnable().j(Boolean.TRUE);
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: M0 */
    public y680 mo10859M0() {
        return this.f9017l;
    }

    /* JADX INFO: renamed from: O */
    public void m11555O() {
        q880.m21068h(this);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m11557O3() {
        if (pqi.m20636f()) {
            return;
        }
        this.f9014i.m18887e("live");
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: P0 */
    public void mo10864P0(boolean z, String str) {
        this.f9017l.m26379n(z);
        m11558P3(str);
    }

    /* JADX INFO: renamed from: P3 */
    public void m11558P3(String str) {
        this.f9017l.m26376k(str);
        this.f9017l.m26377l(true);
        if (!ConnectivityReceiver.g()) {
            m11577h4(ypv.e.getString(R$string.f2718F9));
        } else if (ConnectivityReceiver.k()) {
            m11577h4(ypv.e.getString(R$string.f2674D9));
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m11559R1(float f) {
        this.f9017l.m26381p(f);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m11560R3() {
        String string = !ConnectivityReceiver.g() ? ypv.e.getString(R$string.f2718F9) : null;
        if (ConnectivityReceiver.k()) {
            string = ypv.e.getString(R$string.f2674D9);
        }
        if (string != null) {
            m11577h4(string);
        } else {
            hfw.a(u0t.c, "audience retryConnect");
            this.f9015j.m19952i4();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m11561S3(BLiveAbsData bLiveAbsData) {
        int iM11569a4 = m11569a4(bLiveAbsData);
        if (iM11569a4 != 0) {
            m11558P3(String.valueOf(iM11569a4));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m11562T() {
        super.T();
        m11563U3();
        m11557O3();
        m11572c4();
        this.f9017l.m26379n(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m11563U3() {
        if (this.f9014i.m18891i()) {
            if (this.f9014i.m18893k()) {
                this.f9014i.m18902t(false);
            } else {
                mo10878m(true);
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m11564V3(soj0 soj0Var) {
        this.f9017l.m26377l(true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m11566X3(Long l2) {
        m25548F2().ObsPlayerEvent.onVideoEnable().j(Boolean.valueOf(this.f9014i.m18892j()));
        return Boolean.valueOf(!this.f9014i.m18892j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m11567Y3(Long l2) {
        this.f9014i.m18897o(this.f9018m, this.f9016k, this, ((pn40) m25547E2()).m17247x(), ((pn40) m25547E2()).mo14591o0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m11568Z3() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataM17234j = ((pn40) m25547E2()).m17234j();
        if (bLiveAbsDataM17234j.streamUrl.useCurrentPullStream || !this.f9014i.m18893k()) {
            m11561S3(bLiveAbsDataM17234j);
        } else {
            hfw.a(u0t.c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final int m11569a4(BLiveAbsData bLiveAbsData) {
        this.f9018m = bLiveAbsData;
        return this.f9014i.m18897o(bLiveAbsData, this.f9016k, this, ((pn40) m25547E2()).m17247x(), ((pn40) m25547E2()).mo14591o0());
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public void m11565W3(BLiveAbsData bLiveAbsData) {
        if (this.f9014i.m18891i()) {
            this.f9017l.m26378m(bLiveAbsData);
            m11561S3(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m11571c0(rwb rwbVar) {
        this.f9017l.m26375j(rwbVar.a, rwbVar.b);
        m11575f4(rwbVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m11572c4() {
        duringCreated(((pn40) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.y050
            public final void call(Object obj) {
                this.f22562a.m11551T3((iqv) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.enterRoomFail().g()).subscribe(ffw.h(new e30() { // from class: l.z050
            public final void call(Object obj) {
                this.f23155a.m11564V3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().ObsPlayerEvent.startObsPlay().g()).subscribe(ffw.d(new e30() { // from class: l.a150
            public final void call(Object obj) {
                this.f7335a.m11565W3((BLive) obj);
            }
        }));
        m14186H3(((pn40) m25547E2()).m14571h2(3, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.b150
            public final Object call(Object obj) {
                return this.f7950a.m11566X3((Long) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.c150
            public final void call(Object obj) {
                this.f8452a.m11567Y3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public void m11573e4() {
        this.f9014i.m18904v();
    }

    /* JADX INFO: renamed from: f2 */
    public void m11574f2() {
        this.f9017l.m26379n(false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m11575f4(int i) {
        int i2;
        boolean z = true;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    z = false;
                    i2 = z;
                }
            }
        } else {
            i2 = z;
        }
        m11576g4(z, i2);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m11578i4(iqv iqvVar) {
        iqvVar.m15305h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m11579l0(int i) {
        m25548F2().ObsPlayerEvent.onVideoEnable().j(Boolean.FALSE);
        if (((pn40) m25547E2()).m17241r()) {
            this.f9017l.m26379n(true);
            this.f9017l.m26377l(true);
            m11560R3();
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        this.f9017l.m26374i();
        this.f9014i.m18906x();
        m11573e4();
        s91.m22253b();
        this.f9014i.m18888f();
        super.mo5949n();
    }

    /* JADX INFO: renamed from: p0 */
    public void m11580p0() {
        mo10878m(false);
    }

    /* JADX INFO: renamed from: q0 */
    public void m11582q0() {
        lsi0.A(ypv.e.getString(R$string.f2828K9), true);
    }

    /* JADX INFO: renamed from: s1 */
    public void m11583s1(ArrayList<String> arrayList) {
        this.f9017l.m26380o(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public void m11584t() {
        super.t();
        this.f9017l.m26378m(null);
    }

    /* JADX INFO: renamed from: u1 */
    public void m11585u1() {
        this.f9017l.m26379n(false);
    }

    /* JADX INFO: renamed from: F1 */
    public void m11554F1() {
    }

    /* JADX INFO: renamed from: O0 */
    public void m11556O0(BLiveCallVolume bLiveCallVolume) {
    }

    /* JADX INFO: renamed from: h4 */
    public void m11577h4(String str) {
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: m */
    public void mo10878m(boolean z) {
    }

    /* JADX INFO: renamed from: p1 */
    public void m11581p1(int i) {
    }

    /* JADX INFO: renamed from: g4 */
    public void m11576g4(boolean z, int i) {
    }
}
