package p153l;

import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class s950 extends qct<dw40> implements pwl, y2m {

    /* JADX INFO: renamed from: i */
    public final uxh0 f166901i;

    /* JADX INFO: renamed from: j */
    public final ea50 f166902j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f166903k;

    /* JADX INFO: renamed from: l */
    public ef80 f166904l;

    /* JADX INFO: renamed from: m */
    public BLiveAbsData f166905m;

    public s950(dum dumVar, FrameLayout frameLayout) {
        super(dumVar);
        this.f166903k = frameLayout;
        this.f166902j = (ea50) m153103z2(new ea50(dumVar, this));
        this.f166904l = new ef80();
        uxh0 uxh0Var = new uxh0();
        this.f166901i = uxh0Var;
        uxh0Var.m198481y(df80.m115507a().m115508b(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m185139T3(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m185150Z3();
        } else if (iM146875a == 3) {
            this.f166901i.m198477u(false);
        } else if (iM146875a == 4) {
            m185140d4();
        }
        m185158i4(jsvVar);
    }

    /* JADX INFO: renamed from: d4 */
    private void m185140d4() {
        this.f166904l.m120645n(false);
        this.f166901i.m198477u(true);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: D0 */
    public void mo120245D0() {
        m213811F2().ObsPlayerEvent.onVideoEnable().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: M0 */
    public ef80 mo139883M0() {
        return this.f166904l;
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O */
    public void mo120246O() {
        wg80.m206188h(this);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m185141O3() {
        if (lti.m155791f()) {
            return;
        }
        this.f166901i.m198461e("live");
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: P0 */
    public void mo139887P0(boolean z, String str) {
        this.f166904l.m120645n(z);
        m185142P3(str);
    }

    /* JADX INFO: renamed from: P3 */
    public void m185142P3(String str) {
        this.f166904l.m120642k(str);
        this.f166904l.m120643l(true);
        if (!ConnectivityReceiver.m82467g()) {
            m185157h4(zrv.f205803e.getString(R$string.f47524F9));
        } else if (ConnectivityReceiver.m82471k()) {
            m185157h4(zrv.f205803e.getString(R$string.f47480D9));
        }
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: R1 */
    public void mo120247R1(float f) {
        this.f166904l.m120647p(f);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m185143R3() {
        String string = !ConnectivityReceiver.m82467g() ? zrv.f205803e.getString(R$string.f47524F9) : null;
        if (ConnectivityReceiver.m82471k()) {
            string = zrv.f205803e.getString(R$string.f47480D9);
        }
        if (string != null) {
            m185157h4(string);
        } else {
            fhw.m125605a(v2t.f182113c, "audience retryConnect");
            this.f166902j.m120035i4();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m185144S3(BLiveAbsData bLiveAbsData) {
        int iM185151a4 = m185151a4(bLiveAbsData);
        if (iM185151a4 != 0) {
            m185142P3(String.valueOf(iM185151a4));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m185145U3();
        m185141O3();
        m185153c4();
        this.f166904l.m120645n(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m185145U3() {
        if (this.f166901i.m198465i()) {
            if (this.f166901i.m198467k()) {
                this.f166901i.m198476t(false);
            } else {
                mo139897m(true);
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m185146V3(vxj0 vxj0Var) {
        this.f166904l.m120643l(true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ Boolean m185148X3(Long l2) {
        m213811F2().ObsPlayerEvent.onVideoEnable().mo199273j(Boolean.valueOf(this.f166901i.m198466j()));
        return Boolean.valueOf(!this.f166901i.m198466j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m185149Y3(Long l2) {
        this.f166901i.m198471o(this.f166905m, this.f166903k, this, ((dw40) m213810E2()).m202200x(), ((dw40) m213810E2()).mo160117o0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final void m185150Z3() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataMo183435j = ((dw40) m213810E2()).mo183435j();
        if (bLiveAbsDataMo183435j.streamUrl.useCurrentPullStream || !this.f166901i.m198467k()) {
            m185144S3(bLiveAbsDataMo183435j);
        } else {
            fhw.m125605a(v2t.f182113c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final int m185151a4(BLiveAbsData bLiveAbsData) {
        this.f166905m = bLiveAbsData;
        return this.f166901i.m198471o(bLiveAbsData, this.f166903k, this, ((dw40) m213810E2()).m202200x(), ((dw40) m213810E2()).mo160117o0());
    }

    /* JADX INFO: renamed from: b4, reason: merged with bridge method [inline-methods] */
    public void m185147W3(BLiveAbsData bLiveAbsData) {
        if (this.f166901i.m198465i()) {
            this.f166904l.m120644m(bLiveAbsData);
            m185144S3(bLiveAbsData);
        }
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: c0 */
    public void mo139894c0(fyb fybVar) {
        this.f166904l.m120641j(fybVar.f101357a, fybVar.f101358b);
        m185155f4(fybVar.f101357a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m185153c4() {
        duringCreated(((dw40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.n950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140745a.m185139T3((jsv) obj);
            }
        }));
        duringCreated(m213811F2().PlayerEvent.enterRoomFail().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.o950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145496a.m185146V3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().ObsPlayerEvent.startObsPlay().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.p950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151108a.m185147W3((BLive) obj);
            }
        }));
        m138858H3(((dw40) m213810E2()).m168521h2(3, TimeUnit.SECONDS)).filter(new qcj() { // from class: l.q950
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156196a.m185148X3((Long) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.r950
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161793a.m185149Y3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public void m185154e4() {
        this.f166901i.m198478v();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: f2 */
    public void mo120248f2() {
        this.f166904l.m120645n(false);
    }

    /* JADX INFO: renamed from: f4 */
    public void m185155f4(int i) {
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
        m185156g4(z, i2);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m185158i4(jsv jsvVar) {
        jsvVar.m146882h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.pwl
    /* JADX INFO: renamed from: l0 */
    public void mo123267l0(int i) {
        m213811F2().ObsPlayerEvent.onVideoEnable().mo199273j(Boolean.FALSE);
        if (((dw40) m213810E2()).m202195r()) {
            this.f166904l.m120645n(true);
            this.f166904l.m120643l(true);
            m185143R3();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f166904l.m120640i();
        this.f166901i.m198480x();
        m185154e4();
        z91.m219042b();
        this.f166901i.m198462f();
        super.mo70300n();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: p0 */
    public void mo139898p0() {
        mo139897m(false);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: q0 */
    public void mo139901q0() {
        o1j0.m165619A(zrv.f205803e.getString(R$string.f47634K9), true);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: s1 */
    public void mo139904s1(ArrayList<String> arrayList) {
        this.f166904l.m120646o(arrayList);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f166904l.m120644m(null);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: u1 */
    public void mo120249u1() {
        this.f166904l.m120645n(false);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O0 */
    public void mo139885O0(BLiveCallVolume bLiveCallVolume) {
    }

    /* JADX INFO: renamed from: h4 */
    public void m185157h4(String str) {
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: m */
    public void mo139897m(boolean z) {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: p1 */
    public void mo139899p1(int i) {
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: F1 */
    public void mo139876F1() {
    }

    /* JADX INFO: renamed from: g4 */
    public void m185156g4(boolean z, int i) {
    }
}
