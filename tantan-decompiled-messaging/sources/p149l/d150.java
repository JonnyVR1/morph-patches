package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class d150 extends pat<pn40> implements bul, e0m {

    /* JADX INFO: renamed from: i */
    public final nph0 f83236i;

    /* JADX INFO: renamed from: j */
    public final p150 f83237j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f83238k;

    /* JADX INFO: renamed from: l */
    public y680 f83239l;

    /* JADX INFO: renamed from: m */
    public BLiveAbsData f83240m;

    public d150(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        this.f83238k = frameLayout;
        this.f83237j = (p150) m144512z2(new p150(bsmVar, this));
        this.f83239l = new y680();
        nph0 nph0Var = new nph0();
        this.f83236i = nph0Var;
        nph0Var.m160502y(x680.m207168a().m207169b(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m109576T3(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m109587Z3();
        } else if (iM137794a == 3) {
            this.f83236i.m160498u(false);
        } else if (iM137794a == 4) {
            m109577d4();
        }
        m109595i4(iqvVar);
    }

    /* JADX INFO: renamed from: d4 */
    private void m109577d4() {
        this.f83239l.m213107n(false);
        this.f83236i.m160498u(true);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: D0 */
    public void mo103933D0() {
        m206028F2().ObsPlayerEvent.onVideoEnable().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: M0 */
    public y680 mo105721M0() {
        return this.f83239l;
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O */
    public void mo103935O() {
        q880.m173352h(this);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m109578O3() {
        if (pqi.m170914f()) {
            return;
        }
        this.f83236i.m160482e("live");
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: P0 */
    public void mo105724P0(boolean z, String str) {
        this.f83239l.m213107n(z);
        m109579P3(str);
    }

    /* JADX INFO: renamed from: P3 */
    public void m109579P3(String str) {
        this.f83239l.m213104k(str);
        this.f83239l.m213105l(true);
        if (!ConnectivityReceiver.m81284g()) {
            m109594h4(ypv.f199497e.getString(R$string.f46676F9));
        } else if (ConnectivityReceiver.m81288k()) {
            m109594h4(ypv.f199497e.getString(R$string.f46632D9));
        }
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: R1 */
    public void mo103937R1(float f) {
        this.f83239l.m213109p(f);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m109580R3() {
        String string = !ConnectivityReceiver.m81284g() ? ypv.f199497e.getString(R$string.f46676F9) : null;
        if (ConnectivityReceiver.m81288k()) {
            string = ypv.f199497e.getString(R$string.f46632D9);
        }
        if (string != null) {
            m109594h4(string);
        } else {
            hfw.m130790a(u0t.f172944c, "audience retryConnect");
            this.f83237j.m167052i4();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m109581S3(BLiveAbsData bLiveAbsData) {
        int iM109588a4 = m109588a4(bLiveAbsData);
        if (iM109588a4 != 0) {
            m109579P3(String.valueOf(iM109588a4));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m109582U3();
        m109578O3();
        m109590c4();
        this.f83239l.m213107n(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m109582U3() {
        if (this.f83236i.m160486i()) {
            if (this.f83236i.m160488k()) {
                this.f83236i.m160497t(false);
            } else {
                mo105733m(true);
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m109583V3(soj0 soj0Var) {
        this.f83239l.m213105l(true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m109585X3(Long l2) {
        m206028F2().ObsPlayerEvent.onVideoEnable().mo172463j(Boolean.valueOf(this.f83236i.m160487j()));
        return Boolean.valueOf(!this.f83236i.m160487j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m109586Y3(Long l2) {
        this.f83236i.m160492o(this.f83240m, this.f83238k, this, ((pn40) m206027E2()).m149826x(), ((pn40) m206027E2()).mo132155o0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m109587Z3() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataMo149813j = ((pn40) m206027E2()).mo149813j();
        if (bLiveAbsDataMo149813j.streamUrl.useCurrentPullStream || !this.f83236i.m160488k()) {
            m109581S3(bLiveAbsDataMo149813j);
        } else {
            hfw.m130790a(u0t.f172944c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final int m109588a4(BLiveAbsData bLiveAbsData) {
        this.f83240m = bLiveAbsData;
        return this.f83236i.m160492o(bLiveAbsData, this.f83238k, this, ((pn40) m206027E2()).m149826x(), ((pn40) m206027E2()).mo132155o0());
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public void m109584W3(BLiveAbsData bLiveAbsData) {
        if (this.f83236i.m160486i()) {
            this.f83239l.m213106m(bLiveAbsData);
            m109581S3(bLiveAbsData);
        }
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: c0 */
    public void mo103938c0(rwb rwbVar) {
        this.f83239l.m213103j(rwbVar.f161324a, rwbVar.f161325b);
        m109592f4(rwbVar.f161324a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m109590c4() {
        duringCreated(((pn40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.y050
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195277a.m109576T3((iqv) obj);
            }
        }));
        duringCreated(m206028F2().PlayerEvent.enterRoomFail().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.z050
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200934a.m109583V3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().ObsPlayerEvent.startObsPlay().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.a150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67096a.m109584W3((BLive) obj);
            }
        }));
        m129299H3(((pn40) m206027E2()).m132135h2(3, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.b150
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f72492a.m109585X3((Long) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.c150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78228a.m109586Y3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public void m109591e4() {
        this.f83236i.m160499v();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: f2 */
    public void mo103939f2() {
        this.f83239l.m213107n(false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m109592f4(int i) {
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
        m109593g4(z, i2);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m109595i4(iqv iqvVar) {
        iqvVar.m137801h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bul
    /* JADX INFO: renamed from: l0 */
    public void mo103940l0(int i) {
        m206028F2().ObsPlayerEvent.onVideoEnable().mo172463j(Boolean.FALSE);
        if (((pn40) m206027E2()).m149820r()) {
            this.f83239l.m213107n(true);
            this.f83239l.m213105l(true);
            m109580R3();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f83239l.m213102i();
        this.f83236i.m160501x();
        m109591e4();
        s91.m182689b();
        this.f83236i.m160483f();
        super.mo69117n();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: p0 */
    public void mo103941p0() {
        mo105733m(false);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: q0 */
    public void mo103943q0() {
        lsi0.m151563A(ypv.f199497e.getString(R$string.f46786K9), true);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: s1 */
    public void mo103944s1(ArrayList<String> arrayList) {
        this.f83239l.m213108o(arrayList);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f83239l.m213106m(null);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: u1 */
    public void mo103945u1() {
        this.f83239l.m213107n(false);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: F1 */
    public void mo103934F1() {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O0 */
    public void mo103936O0(BLiveCallVolume bLiveCallVolume) {
    }

    /* JADX INFO: renamed from: h4 */
    public void m109594h4(String str) {
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: m */
    public void mo105733m(boolean z) {
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: p1 */
    public void mo103942p1(int i) {
    }

    /* JADX INFO: renamed from: g4 */
    public void m109593g4(boolean z, int i) {
    }
}
