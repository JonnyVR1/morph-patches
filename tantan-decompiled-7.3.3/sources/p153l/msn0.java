package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class msn0 implements dn50 {

    /* JADX INFO: renamed from: b */
    public String f138503b;

    /* JADX INFO: renamed from: d */
    public yvl f138505d;

    /* JADX INFO: renamed from: a */
    public BLiveVoiceKtvGameInfo f138502a = BLiveVoiceKtvGameInfo.new_();

    /* JADX INFO: renamed from: e */
    public Runnable f138506e = new RunnableC18700a();

    /* JADX INFO: renamed from: c */
    public xvl f138504c = new r5r(m159879q().m168456H0());

    /* JADX INFO: renamed from: l.msn0$a */
    public class RunnableC18700a implements Runnable {
        public RunnableC18700a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
            BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = msn0.this.f138502a;
            if (bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0())) {
                return;
            }
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = msn0.this.f138502a.playInfo;
            nsh0.m164608j("[voice][ktv]", "timer end to play music");
            msn0.this.f138504c.mo179910f0(bLiveVoiceKtvPlayInfo2.orderId, bLiveVoiceKtvPlayInfo2.songCode, bLiveVoiceKtvPlayInfo2.songUrl, bLiveVoiceKtvPlayInfo2.lyricUrl, bLiveVoiceKtvPlayInfo2.lyricType, bLiveVoiceKtvPlayInfo2.provider);
        }
    }

    public msn0(@NonNull yvl yvlVar) {
        this.f138505d = yvlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m159838O(BLiveVoiceCall bLiveVoiceCall) {
        this.f138504c.mo179924n0("hang up call");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m159839a(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m159840b(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m159849k(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: t */
    private <T> C22421c<T> m159852t(C22421c<T> c22421c) {
        yvl yvlVar = this.f138505d;
        return yvlVar == null ? c22421c : yvlVar.mo217199L1(c22421c);
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: B */
    public void mo117046B(String str) {
        if (m159862L() && TextUtils.equals(this.f138502a.playInfo.orderId, str)) {
            m159852t(rqn0.m182669l(m159879q().m202191k(), this.f138503b, qd80.f156673h)).subscribe(dhw.m115826e(new y20() { // from class: l.csn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    msn0.m159840b((BLiveEnvelope) obj);
                }
            }, new wnt()));
        }
    }

    /* JADX INFO: renamed from: C */
    public Float m159853C() {
        return Float.valueOf(this.f138504c.mo179909d());
    }

    /* JADX INFO: renamed from: D */
    public boolean m159854D() {
        return this.f138504c.mo179920k0();
    }

    /* JADX INFO: renamed from: E */
    public Integer m159855E() {
        return Integer.valueOf(this.f138504c.getStatus());
    }

    /* JADX INFO: renamed from: F */
    public Float m159856F() {
        return Float.valueOf(this.f138504c.mo179916i());
    }

    /* JADX INFO: renamed from: G */
    public final void m159857G(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo;
        if (m159881u(this.f138502a.playInfo, bLiveVoiceKtvPlayInfo)) {
            m159858H(bLiveVoiceKtvPlayInfo);
            this.f138502a = bLiveVoiceKtvGameInfo;
            if (m159879q().f165194Q && qd80.m176155a(this.f138504c.getStatus()) && BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo)) {
                this.f138504c.mo179929q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
            }
            nsh0.m164608j("[voice][ktv]", "handleCurrentPlayInfo filtered");
            return;
        }
        l51.m152890J(this.f138506e);
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo)) {
            nsh0.m164608j("[voice][ktv]", "playInfo is valid");
            if (TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0())) {
                if (qd80.m176156b(this.f138504c.getStatus()) && NullChecker.m82486a(this.f138502a) && BLiveVoiceKtvPlayInfo.isValid(this.f138502a.playInfo)) {
                    this.f138504c.mo179924n0("play new song and stop old ");
                    nsh0.m164608j("[voice][ktv]", "stop music before play ");
                }
                this.f138504c.setStatus(1);
                l51.m152888H(zrv.f205803e, this.f138506e, bLiveVoiceKtvPlayInfo.prepareRemainSeconds * 1000);
                this.f138504c.mo179907U(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.songUrl);
                nsh0.m164608j("[voice][ktv]", "delay to play music " + bLiveVoiceKtvPlayInfo.prepareRemainSeconds);
            } else if (m159861K()) {
                this.f138504c.mo179924n0("new singer is not me");
            }
            this.f138504c.mo179929q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
            nsh0.m164608j("[voice][ktv]", "songCode:" + bLiveVoiceKtvPlayInfo.songCode + "，useId:" + bLiveVoiceKtvPlayInfo.userId);
            this.f138503b = bLiveVoiceKtvPlayInfo.orderId;
        } else {
            if (m159861K()) {
                this.f138504c.mo179924n0("new song is invalid");
            }
            this.f138503b = "";
        }
        this.f138502a = bLiveVoiceKtvGameInfo;
    }

    /* JADX INFO: renamed from: H */
    public final void m159858H(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo) && BLiveVoiceKtvPlayInfo.isValid(this.f138502a.playInfo) && TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0()) && qd80.m176156b(this.f138504c.getStatus()) && TextUtils.equals(bLiveVoiceKtvPlayInfo.orderId, this.f138502a.playInfo.orderId)) {
            if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "pause") && this.f138504c.getStatus() == 3) {
                this.f138504c.pause();
                nsh0.m164608j("[voice][ktv]", "local started,but remote pause");
            } else if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "playing") && this.f138504c.getStatus() == 4) {
                this.f138504c.resume();
                nsh0.m164608j("[voice][ktv]", "local paused,but remote playing");
            }
        }
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: H0 */
    public void mo117047H0(String str) {
        if (m159862L()) {
            rqn0.m182670m(m159879q().m202191k(), this.f138503b, str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m159859I(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, String str) {
        nsh0.m164608j("[voice][ktv]", "handleKtvGameInfo from" + str + Constants.SEPARATOR_COMMA + bLiveVoiceKtvGameInfo.toJson());
        if (NullChecker.m82486a(this.f138505d)) {
            this.f138505d.mo217213t1(bLiveVoiceKtvGameInfo);
        }
        m159857G(bLiveVoiceKtvGameInfo);
        m159860J(bLiveVoiceKtvGameInfo);
        if (TextUtils.isEmpty(bLiveVoiceKtvGameInfo.toast)) {
            return;
        }
        o1j0.m165651y(bLiveVoiceKtvGameInfo.toast);
    }

    /* JADX INFO: renamed from: J */
    public final void m159860J(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (bLiveVoiceKtvGameInfo == null || !BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvGameInfo.nextPlayInfo)) {
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.nextPlayInfo;
        if (m159881u(this.f138502a.nextPlayInfo, bLiveVoiceKtvPlayInfo)) {
            return;
        }
        this.f138504c.mo179929q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
        if (TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0())) {
            this.f138504c.mo179907U(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.songUrl);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m159861K() {
        return qd80.m176156b(this.f138504c.getStatus()) && m159862L();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m159862L() {
        return NullChecker.m82486a(this.f138502a) && BLiveVoiceKtvPlayInfo.isValid(this.f138502a.playInfo) && TextUtils.equals(zrv.f205799a.m207631D0(), this.f138502a.playInfo.userId);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m159863M(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        m159859I(bLiveVoiceKtvGameInfo, "long link");
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m159864N(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(m159861K());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ C22421c m159865P(NetworkInfo networkInfo) {
        return m159852t(rqn0.m182665h(m159879q().m202191k()));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m159866Q(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        m159859I(bLiveVoiceKtvGameInfo, "http");
    }

    /* JADX INFO: renamed from: R */
    public void m159867R() {
        if (m159861K()) {
            this.f138504c.pause();
        }
        m159852t(rqn0.m182669l(m159879q().m202191k(), this.f138503b, qd80.f156674i)).subscribe(dhw.m115826e(new y20() { // from class: l.bsn0
            @Override // p153l.y20
            public final void call(Object obj) {
                msn0.m159839a((BLiveEnvelope) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: S */
    public void m159868S(dn50 dn50Var) {
        this.f138504c.mo179918j0(dn50Var);
    }

    /* JADX INFO: renamed from: T */
    public void m159869T(dn50 dn50Var) {
        this.f138504c.mo179903J0(dn50Var);
    }

    /* JADX INFO: renamed from: U */
    public void m159870U() {
        if (m159861K()) {
            this.f138504c.resume();
        }
        m159852t(rqn0.m182669l(m159879q().m202191k(), this.f138503b, qd80.f156675j)).subscribe(dhw.m115826e(new y20() { // from class: l.asn0
            @Override // p153l.y20
            public final void call(Object obj) {
                msn0.m159849k((BLiveEnvelope) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: V */
    public void m159871V(int i) {
        this.f138504c.mo179913h(i);
    }

    /* JADX INFO: renamed from: W */
    public void m159872W(Boolean bool) {
        this.f138504c.mo179904M0(bool, true);
    }

    /* JADX INFO: renamed from: X */
    public void m159873X(yvl yvlVar) {
        this.f138505d = yvlVar;
    }

    /* JADX INFO: renamed from: Y */
    public void m159874Y(Boolean bool) {
        this.f138504c.mo179901H(bool);
    }

    /* JADX INFO: renamed from: Z */
    public void m159875Z() {
        this.f138504c.init();
        this.f138504c.mo179918j0(this);
        m159852t(m159879q().m168545q1().m98219B0()).subscribe(dhw.m115829h(new y20() { // from class: l.zrn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205777a.m159863M((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m159852t(m159879q().m183424Z2()).distinctUntilChanged(new qcj() { // from class: l.dsn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).filter(new esn0()).filter(new qcj() { // from class: l.fsn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100666a.m159864N((BLiveVoiceCall) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.gsn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106318a.m159838O((BLiveVoiceCall) obj);
            }
        }));
        m159852t(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged().filter(new qcj() { // from class: l.hsn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).flatMap(new qcj() { // from class: l.isn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116688a.m159865P((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.jsn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122481a.m159866Q((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m159852t(m159879q().m183424Z2()).map(new qcj() { // from class: l.ksn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.lsn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133439a.m159878p((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m159876n(Float f) {
        this.f138504c.mo179899E0(f.floatValue());
    }

    /* JADX INFO: renamed from: o */
    public void m159877o(Float f) {
        this.f138504c.mo179906P0(f.floatValue());
    }

    /* JADX INFO: renamed from: p */
    public final void m159878p(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        xvl xvlVar = this.f138504c;
        if (zBooleanValue) {
            xvlVar.mo179904M0(Boolean.FALSE, false);
        } else {
            xvlVar.mo179904M0(Boolean.valueOf(xvlVar.mo179914h0()), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final rwn0 m159879q() {
        yvl yvlVar = this.f138505d;
        return yvlVar == null ? new rwn0(new szn0(), new ajt("")) : yvlVar.mo217200Y1();
    }

    /* JADX INFO: renamed from: r */
    public void m159880r(boolean z) {
        nsh0.m164608j("[voice][ktv]", "KTV detach ：" + z);
        if (!z) {
            this.f138504c.mo179905O0();
            this.f138504c.mo179918j0(this);
            return;
        }
        l51.m152890J(this.f138506e);
        this.f138504c.mo179903J0(this);
        l6o0 l6o0VarM153068c = l6o0.m153068c(m159879q().m183411P2().m136874m(zrv.f205799a.m207631D0()));
        if (l6o0VarM153068c.m153071d() && l6o0VarM153068c.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            this.f138504c.mo179902H0(false);
        } else {
            this.f138504c.mo179902H0(true);
        }
        this.f138504c.mo179899E0(1.0f);
        this.f138504c.mo179906P0(guk0.m132328g(m159879q().m183423Y2()) ? 0.0f : 1.0f);
        this.f138505d = null;
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: s0 */
    public void mo117052s0() {
        if (m159862L()) {
            this.f138504c.mo179927p0(this.f138502a.playInfo.songCode);
            if (NullChecker.m82486a(m159879q())) {
                rqn0.m182669l(m159879q().m202191k(), this.f138503b, qd80.f156672g);
            }
            if (this.f138502a.playInfo.status.equals("pause")) {
                this.f138504c.pause();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m159881u(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2) {
        if (ValueObject.util_equals(bLiveVoiceKtvPlayInfo, bLiveVoiceKtvPlayInfo2)) {
            return true;
        }
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo) || BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo2)) {
            return NullChecker.m82486a(bLiveVoiceKtvPlayInfo) && NullChecker.m82486a(bLiveVoiceKtvPlayInfo2) && TextUtils.equals(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo2.songCode) && TextUtils.equals(bLiveVoiceKtvPlayInfo.orderId, bLiveVoiceKtvPlayInfo2.orderId) && TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, bLiveVoiceKtvPlayInfo2.userId);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public int m159882v() {
        return this.f138504c.mo179900G0();
    }

    /* JADX INFO: renamed from: w */
    public Long m159883w() {
        return Long.valueOf(this.f138504c.mo179934w());
    }

    /* JADX INFO: renamed from: x */
    public String m159884x() {
        return this.f138503b;
    }

    /* JADX INFO: renamed from: y */
    public boolean m159885y() {
        return this.f138504c.mo179914h0();
    }

    /* JADX INFO: renamed from: z */
    public Long m159886z() {
        return Long.valueOf(this.f138504c.mo179908c());
    }
}
