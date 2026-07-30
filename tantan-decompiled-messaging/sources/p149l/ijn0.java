package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class ijn0 implements we50 {

    /* JADX INFO: renamed from: b */
    public String f113581b;

    /* JADX INFO: renamed from: d */
    public ktl f113583d;

    /* JADX INFO: renamed from: a */
    public BLiveVoiceKtvGameInfo f113580a = BLiveVoiceKtvGameInfo.new_();

    /* JADX INFO: renamed from: e */
    public Runnable f113584e = new RunnableC17567a();

    /* JADX INFO: renamed from: c */
    public jtl f113582c = new q3r(m136696q().m132067H0());

    /* JADX INFO: renamed from: l.ijn0$a */
    public class RunnableC17567a implements Runnable {
        public RunnableC17567a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
            BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = ijn0.this.f113580a;
            if (bLiveVoiceKtvGameInfo == null || (bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo) == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0())) {
                return;
            }
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = ijn0.this.f113580a.playInfo;
            gkh0.m126627j("[voice][ktv]", "timer end to play music");
            ijn0.this.f113582c.mo143142f0(bLiveVoiceKtvPlayInfo2.orderId, bLiveVoiceKtvPlayInfo2.songCode, bLiveVoiceKtvPlayInfo2.songUrl, bLiveVoiceKtvPlayInfo2.lyricUrl, bLiveVoiceKtvPlayInfo2.lyricType, bLiveVoiceKtvPlayInfo2.provider);
        }
    }

    public ijn0(@NonNull ktl ktlVar) {
        this.f113583d = ktlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m136653O(BLiveVoiceCall bLiveVoiceCall) {
        this.f113582c.mo143148n0("hang up call");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m136654a(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m136655b(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m136664k(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: t */
    private <T> C22306c<T> m136667t(C22306c<T> c22306c) {
        ktl ktlVar = this.f113583d;
        return ktlVar == null ? c22306c : ktlVar.mo147210L1(c22306c);
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: B */
    public void mo136668B(String str) {
        if (m136679L() && TextUtils.equals(this.f113580a.playInfo.orderId, str)) {
            m136667t(nhn0.m159428l(m136696q().m149814k(), this.f113581b, k580.f121162h)).subscribe(ffw.m121194e(new e30() { // from class: l.yin0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ijn0.m136655b((BLiveEnvelope) obj);
                }
            }, new ult()));
        }
    }

    /* JADX INFO: renamed from: C */
    public Float m136669C() {
        return Float.valueOf(this.f113582c.mo143141d());
    }

    /* JADX INFO: renamed from: D */
    public boolean m136670D() {
        return this.f113582c.mo143147k0();
    }

    /* JADX INFO: renamed from: E */
    public Integer m136671E() {
        return Integer.valueOf(this.f113582c.getStatus());
    }

    /* JADX INFO: renamed from: F */
    public Float m136672F() {
        return Float.valueOf(this.f113582c.mo143145i());
    }

    /* JADX INFO: renamed from: G */
    public final void m136673G(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.playInfo;
        if (m136699u(this.f113580a.playInfo, bLiveVoiceKtvPlayInfo)) {
            m136674H(bLiveVoiceKtvPlayInfo);
            this.f113580a = bLiveVoiceKtvGameInfo;
            if (m136696q().f139747Q && k580.m144520a(this.f113582c.getStatus()) && BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo)) {
                this.f113582c.mo143150q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
            }
            gkh0.m126627j("[voice][ktv]", "handleCurrentPlayInfo filtered");
            return;
        }
        e51.m114745J(this.f113584e);
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo)) {
            gkh0.m126627j("[voice][ktv]", "playInfo is valid");
            if (TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0())) {
                if (k580.m144521b(this.f113582c.getStatus()) && NullChecker.m81303a(this.f113580a) && BLiveVoiceKtvPlayInfo.isValid(this.f113580a.playInfo)) {
                    this.f113582c.mo143148n0("play new song and stop old ");
                    gkh0.m126627j("[voice][ktv]", "stop music before play ");
                }
                this.f113582c.setStatus(1);
                e51.m114743H(ypv.f199497e, this.f113584e, bLiveVoiceKtvPlayInfo.prepareRemainSeconds * 1000);
                this.f113582c.mo143139U(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.songUrl);
                gkh0.m126627j("[voice][ktv]", "delay to play music " + bLiveVoiceKtvPlayInfo.prepareRemainSeconds);
            } else if (m136678K()) {
                this.f113582c.mo143148n0("new singer is not me");
            }
            this.f113582c.mo143150q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
            gkh0.m126627j("[voice][ktv]", "songCode:" + bLiveVoiceKtvPlayInfo.songCode + "，useId:" + bLiveVoiceKtvPlayInfo.userId);
            this.f113581b = bLiveVoiceKtvPlayInfo.orderId;
        } else {
            if (m136678K()) {
                this.f113582c.mo143148n0("new song is invalid");
            }
            this.f113581b = "";
        }
        this.f113580a = bLiveVoiceKtvGameInfo;
    }

    /* JADX INFO: renamed from: H */
    public final void m136674H(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo) && BLiveVoiceKtvPlayInfo.isValid(this.f113580a.playInfo) && TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0()) && k580.m144521b(this.f113582c.getStatus()) && TextUtils.equals(bLiveVoiceKtvPlayInfo.orderId, this.f113580a.playInfo.orderId)) {
            if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "pause") && this.f113582c.getStatus() == 3) {
                this.f113582c.pause();
                gkh0.m126627j("[voice][ktv]", "local started,but remote pause");
            } else if (TEnum.equals(bLiveVoiceKtvPlayInfo.status, "playing") && this.f113582c.getStatus() == 4) {
                this.f113582c.resume();
                gkh0.m126627j("[voice][ktv]", "local paused,but remote playing");
            }
        }
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: H0 */
    public void mo136675H0(String str) {
        if (m136679L()) {
            nhn0.m159429m(m136696q().m149814k(), this.f113581b, str);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m136676I(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, String str) {
        gkh0.m126627j("[voice][ktv]", "handleKtvGameInfo from" + str + Constants.SEPARATOR_COMMA + bLiveVoiceKtvGameInfo.toJson());
        if (NullChecker.m81303a(this.f113583d)) {
            this.f113583d.mo147212t1(bLiveVoiceKtvGameInfo);
        }
        m136673G(bLiveVoiceKtvGameInfo);
        m136677J(bLiveVoiceKtvGameInfo);
        if (TextUtils.isEmpty(bLiveVoiceKtvGameInfo.toast)) {
            return;
        }
        lsi0.m151595y(bLiveVoiceKtvGameInfo.toast);
    }

    /* JADX INFO: renamed from: J */
    public final void m136677J(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        if (bLiveVoiceKtvGameInfo == null || !BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvGameInfo.nextPlayInfo)) {
            return;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.nextPlayInfo;
        if (m136699u(this.f113580a.nextPlayInfo, bLiveVoiceKtvPlayInfo)) {
            return;
        }
        this.f113582c.mo143150q0(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.lyricUrl, bLiveVoiceKtvPlayInfo.lyricType, bLiveVoiceKtvPlayInfo.provider);
        if (TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0())) {
            this.f113582c.mo143139U(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo.songUrl);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m136678K() {
        return k580.m144521b(this.f113582c.getStatus()) && m136679L();
    }

    /* JADX INFO: renamed from: L */
    public final boolean m136679L() {
        return NullChecker.m81303a(this.f113580a) && BLiveVoiceKtvPlayInfo.isValid(this.f113580a.playInfo) && TextUtils.equals(ypv.f199493a.m199309D0(), this.f113580a.playInfo.userId);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m136680M(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        m136676I(bLiveVoiceKtvGameInfo, "long link");
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m136681N(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(m136678K());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ C22306c m136682P(NetworkInfo networkInfo) {
        return m136667t(nhn0.m159424h(m136696q().m149814k()));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m136683Q(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        m136676I(bLiveVoiceKtvGameInfo, "http");
    }

    /* JADX INFO: renamed from: R */
    public void m136684R() {
        if (m136678K()) {
            this.f113582c.pause();
        }
        m136667t(nhn0.m159428l(m136696q().m149814k(), this.f113581b, k580.f121163i)).subscribe(ffw.m121194e(new e30() { // from class: l.xin0
            @Override // p149l.e30
            public final void call(Object obj) {
                ijn0.m136654a((BLiveEnvelope) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: S */
    public void m136685S(we50 we50Var) {
        this.f113582c.mo143146j0(we50Var);
    }

    /* JADX INFO: renamed from: T */
    public void m136686T(we50 we50Var) {
        this.f113582c.mo143135J0(we50Var);
    }

    /* JADX INFO: renamed from: U */
    public void m136687U() {
        if (m136678K()) {
            this.f113582c.resume();
        }
        m136667t(nhn0.m159428l(m136696q().m149814k(), this.f113581b, k580.f121164j)).subscribe(ffw.m121194e(new e30() { // from class: l.win0
            @Override // p149l.e30
            public final void call(Object obj) {
                ijn0.m136664k((BLiveEnvelope) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: V */
    public void m136688V(int i) {
        this.f113582c.mo143143h(i);
    }

    /* JADX INFO: renamed from: W */
    public void m136689W(Boolean bool) {
        this.f113582c.mo143136M0(bool, true);
    }

    /* JADX INFO: renamed from: X */
    public void m136690X(ktl ktlVar) {
        this.f113583d = ktlVar;
    }

    /* JADX INFO: renamed from: Y */
    public void m136691Y(Boolean bool) {
        this.f113582c.mo143133H(bool);
    }

    /* JADX INFO: renamed from: Z */
    public void m136692Z() {
        this.f113582c.init();
        this.f113582c.mo143146j0(this);
        m136667t(m136696q().m132160q1().m189037B0()).subscribe(ffw.m121197h(new e30() { // from class: l.vin0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181620a.m136680M((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m136667t(m136696q().m160262Z2()).distinctUntilChanged(new w9j() { // from class: l.zin0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoiceCall) obj).state;
            }
        }).filter(new ajn0()).filter(new w9j() { // from class: l.bjn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75925a.m136681N((BLiveVoiceCall) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.cjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81210a.m136653O((BLiveVoiceCall) obj);
            }
        }));
        m136667t(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged().filter(new w9j() { // from class: l.djn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).flatMap(new w9j() { // from class: l.ejn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91771a.m136682P((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.fjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97801a.m136683Q((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        m136667t(m136696q().m160262Z2()).map(new w9j() { // from class: l.gjn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.hjn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108098a.m136695p((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m136693n(Float f) {
        this.f113582c.mo143131E0(f.floatValue());
    }

    /* JADX INFO: renamed from: o */
    public void m136694o(Float f) {
        this.f113582c.mo143138P0(f.floatValue());
    }

    /* JADX INFO: renamed from: p */
    public final void m136695p(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        jtl jtlVar = this.f113582c;
        if (zBooleanValue) {
            jtlVar.mo143136M0(Boolean.FALSE, false);
        } else {
            jtlVar.mo143136M0(Boolean.valueOf(jtlVar.mo143144h0()), true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final nnn0 m136696q() {
        ktl ktlVar = this.f113583d;
        return ktlVar == null ? new nnn0(new oqn0(), new zgt("")) : ktlVar.mo147211Y1();
    }

    /* JADX INFO: renamed from: r */
    public void m136697r(boolean z) {
        gkh0.m126627j("[voice][ktv]", "KTV detach ：" + z);
        if (!z) {
            this.f113582c.mo143137O0();
            this.f113582c.mo143146j0(this);
            return;
        }
        e51.m114745J(this.f113584e);
        this.f113582c.mo143135J0(this);
        hxn0 hxn0VarM133350c = hxn0.m133350c(m136696q().m160249P2().m102064m(ypv.f199493a.m199309D0()));
        if (hxn0VarM133350c.m133353d() && hxn0VarM133350c.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            this.f113582c.mo143134H0(false);
        } else {
            this.f113582c.mo143134H0(true);
        }
        this.f113582c.mo143131E0(1.0f);
        this.f113582c.mo143138P0(alk0.m97308g(m136696q().m160261Y2()) ? 0.0f : 1.0f);
        this.f113583d = null;
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: s0 */
    public void mo136698s0() {
        if (m136679L()) {
            this.f113582c.mo143149p0(this.f113580a.playInfo.songCode);
            if (NullChecker.m81303a(m136696q())) {
                nhn0.m159428l(m136696q().m149814k(), this.f113581b, k580.f121161g);
            }
            if (this.f113580a.playInfo.status.equals("pause")) {
                this.f113582c.pause();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m136699u(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2) {
        if (ValueObject.util_equals(bLiveVoiceKtvPlayInfo, bLiveVoiceKtvPlayInfo2)) {
            return true;
        }
        if (BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo) || BLiveVoiceKtvPlayInfo.isValid(bLiveVoiceKtvPlayInfo2)) {
            return NullChecker.m81303a(bLiveVoiceKtvPlayInfo) && NullChecker.m81303a(bLiveVoiceKtvPlayInfo2) && TextUtils.equals(bLiveVoiceKtvPlayInfo.songCode, bLiveVoiceKtvPlayInfo2.songCode) && TextUtils.equals(bLiveVoiceKtvPlayInfo.orderId, bLiveVoiceKtvPlayInfo2.orderId) && TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, bLiveVoiceKtvPlayInfo2.userId);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public int m136700v() {
        return this.f113582c.mo143132G0();
    }

    /* JADX INFO: renamed from: w */
    public Long m136701w() {
        return Long.valueOf(this.f113582c.mo143151w());
    }

    /* JADX INFO: renamed from: x */
    public String m136702x() {
        return this.f113581b;
    }

    /* JADX INFO: renamed from: y */
    public boolean m136703y() {
        return this.f113582c.mo143144h0();
    }

    /* JADX INFO: renamed from: z */
    public Long m136704z() {
        return Long.valueOf(this.f113582c.mo143140c());
    }
}
