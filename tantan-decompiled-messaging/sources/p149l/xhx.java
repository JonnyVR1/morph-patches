package p149l;

import android.media.AudioManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.google.gson.Gson;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.MMLiveEngine;
import com.immomo.momomediaext.utils.MMLiveAudioVolumeConfig;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.mediacall.EventData;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class xhx {

    /* JADX INFO: renamed from: u */
    public static xhx f192929u = null;

    /* JADX INFO: renamed from: v */
    public static long f192930v = 12;

    /* JADX INFO: renamed from: w */
    public static long f192931w;

    /* JADX INFO: renamed from: a */
    public MMLiveEngine f192932a;

    /* JADX INFO: renamed from: e */
    public c4g0 f192936e;

    /* JADX INFO: renamed from: f */
    public c4g0 f192937f;

    /* JADX INFO: renamed from: g */
    public c4g0 f192938g;

    /* JADX INFO: renamed from: h */
    public c4g0 f192939h;

    /* JADX INFO: renamed from: i */
    public c4g0 f192940i;

    /* JADX INFO: renamed from: b */
    public boolean f192933b = false;

    /* JADX INFO: renamed from: j */
    public C22392a<u44> f192941j = C22392a.m221513c(u44.f173683c);

    /* JADX INFO: renamed from: k */
    public C22392a<Integer> f192942k = C22392a.m221513c(-1);

    /* JADX INFO: renamed from: l */
    public C22392a<Long> f192943l = C22392a.m221513c(-1L);

    /* JADX INFO: renamed from: m */
    public long f192944m = 60;

    /* JADX INFO: renamed from: n */
    public boolean f192945n = false;

    /* JADX INFO: renamed from: p */
    public long f192947p = 0;

    /* JADX INFO: renamed from: q */
    public long f192948q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f192949r = true;

    /* JADX INFO: renamed from: s */
    public fkw f192950s = new C21153a();

    /* JADX INFO: renamed from: t */
    public boolean f192951t = false;

    /* JADX INFO: renamed from: c */
    public Gson f192934c = new Gson();

    /* JADX INFO: renamed from: d */
    public EventData f192935d = new EventData();

    /* JADX INFO: renamed from: o */
    public AudioManager f192946o = (AudioManager) CoreModule.f17544b.getSystemService("audio");

    /* JADX INFO: renamed from: l.xhx$a */
    public class C21153a extends fkw {
        public C21153a() {
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: A */
        public void mo46992A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46992A(str, i, mMLivePushType);
            xhx.m208851T("onUserOffline " + i);
            mqm0.m155965h().m155973f("onUserOffline", "channel:" + str + ",reason:" + i);
            e51.m114748M(new Runnable() { // from class: l.uhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176607a.m208907p0();
                }
            });
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: Z */
        public void mo46995Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46995Z(str, str2, mMLivePushType);
            if (TextUtils.equals(CoreModule.m29931H().userId(), str2) || ((Integer) xhx.this.f192942k.m221515e()).intValue() == 2 || !xhx.this.m208878F()) {
                return;
            }
            xhx.this.f192942k.onNext(2);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: a0 */
        public void mo46996a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo46996a0(str, i, mMLivePushType);
            xhx.m208851T("onUserOffline " + i);
            mqm0.m155965h().m155973f("onUserOffline", "uid:" + str + ",reason:" + i);
            e51.m114748M(new Runnable() { // from class: l.whx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186479a.m208908q0();
                }
            });
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: e0 */
        public void mo46998e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            int i;
            super.mo46998e0(audioVolumeWeightArr, mMLivePushType);
            StringBuilder sb = new StringBuilder();
            if (audioVolumeWeightArr == null || audioVolumeWeightArr.length <= 0) {
                i = 0;
            } else {
                for (int i2 = 0; i2 < audioVolumeWeightArr.length; i2++) {
                    AudioVolumeWeight audioVolumeWeight = audioVolumeWeightArr[i2];
                    sb.append("user:");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(audioVolumeWeight.uid);
                    sb.append("value:");
                    sb.append(audioVolumeWeight.volume);
                    sb.append("#");
                }
                i = audioVolumeWeightArr[0].totalVolume;
                sb.append("total:");
                sb.append(audioVolumeWeightArr[0].totalVolume);
            }
            mqm0.m155965h().m155973f("onAudioVolumeIndication:", sb.toString());
            if (i <= xhx.f192931w || xhx.this.m208900w() != u44.f173687g) {
                return;
            }
            long j = xhx.this.f192948q;
            xhx xhxVar = xhx.this;
            if (j >= 2) {
                xhxVar.f192949r = false;
            } else if (xhxVar.f192949r && xhx.this.f192948q >= xhx.f192930v) {
                xhx.this.f192949r = false;
                mqm0.m155968l();
            }
            if (xhx.this.f192949r) {
                xhx.this.f192948q++;
            }
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: o */
        public void mo46999o(MMLiveRoomParams.MMLivePushType mMLivePushType, final MMLiveErrorInfo mMLiveErrorInfo) {
            super.mo46999o(mMLivePushType, mMLiveErrorInfo);
            e51.m114748M(new Runnable() { // from class: l.vhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181537a.m208906o0(mMLiveErrorInfo);
                }
            });
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m208906o0(MMLiveErrorInfo mMLiveErrorInfo) {
            xhx.this.m208891S(mMLiveErrorInfo.what);
            xhx.this.m208893V();
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m208907p0() {
            xhx.this.m208891S(0);
            xhx.this.m208893V();
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m208908q0() {
            xhx.this.m208891S(0);
            xhx.this.m208893V();
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: z */
        public void mo47006z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo47006z(str, j, mMLivePushType);
            xhx.m208851T("onJoinChannelSuccess ");
            xhx.this.m208902z(false);
            xhx.this.m208898a0("channelJoined", null);
            xhx.this.f192941j.onNext(u44.f173686f);
            xhx.this.f192946o.setMode(3);
        }
    }

    /* JADX INFO: renamed from: C */
    public static xhx m208850C() {
        if (f192929u == null) {
            synchronized (xhx.class) {
                try {
                    if (f192929u == null) {
                        f192929u = new xhx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192929u;
    }

    /* JADX INFO: renamed from: T */
    public static void m208851T(String str) {
        hfw.m130790a("MediaCallManager", str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m208853b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m208856e(Envelope envelope) {
    }

    /* JADX INFO: renamed from: y */
    public static void m208873y() {
        if (NullChecker.m81303a(f192929u)) {
            f192929u.m208893V();
        }
        f192929u = null;
    }

    /* JADX INFO: renamed from: A */
    public boolean m208874A(String str, String str2) {
        try {
            if (!ghd0.m126179c()) {
                return false;
            }
            xhx xhxVarM208850C = m208850C();
            return !NullChecker.m81303a(xhxVarM208850C) || xhxVarM208850C.m208879G() || xhxVarM208850C.m208877E(str, str2);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public long m208875B() {
        return this.f192943l.m221515e().longValue();
    }

    /* JADX INFO: renamed from: D */
    public MMLiveRoomParams.MMLivePushType m208876D(String str) {
        if (str.contains("momo")) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
        }
        if (str.contains("agora")) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
        if (str.contains("tencent")) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        }
        return str.contains("volcengine") ? MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc : MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
    }

    @MainThread
    /* JADX INFO: renamed from: E */
    public boolean m208877E(String str, String str2) {
        if (this.f192933b) {
            CrashHelper.m81296c(new Exception("mRtcEngine already init"));
            m208851T("already init");
            return false;
        }
        MMLiveEngine mMLiveEngine = new MMLiveEngine(new MMLiveUserConfig(CoreModule.m29936Q().mo67270ih(), CoreModule.m29936Q().mo67222Hh(), CoreModule.f17545c.f19639e0.m169527p9().publicId, str, px0.m171778b(App.f15369e), px0.m171777a(App.f15369e), true), CoreModule.f17544b);
        this.f192932a = mMLiveEngine;
        mMLiveEngine.m19119p0(true);
        this.f192932a.m19115l0(false);
        this.f192932a.m19109f0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster);
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = 3000;
        mMLiveAudioVolumeConfig.smooth = 3;
        this.f192932a.m19111h0(mMLiveAudioVolumeConfig);
        this.f192932a.m19110g0(true);
        this.f192932a.m19126t0(this.f192950s);
        try {
            this.f192946o.setSpeakerphoneOn(false);
            this.f192938g = m208899v().filter(new w9j() { // from class: l.phx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    u44 u44Var = (u44) obj;
                    return Boolean.valueOf(u44Var == u44.f173689i || u44Var == u44.f173688h);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.qhx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154527a.m208885M((u44) obj);
                }
            }));
            this.f192939h = this.f192942k.filter(new w9j() { // from class: l.rhx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f159498a.m208886N((Integer) obj);
                }
            }).subscribe(new e30() { // from class: l.shx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164660a.m208887O((Integer) obj);
                }
            });
            this.f192933b = true;
            this.f192940i = m208899v().subscribe(mkd0.m154955G(new e30() { // from class: l.thx
                @Override // p149l.e30
                public final void call(Object obj) {
                    xhx.m208851T("media callState== " + ((u44) obj));
                }
            }));
            this.f192941j.onNext(u44.f173684d);
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m208851T("init " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m208878F() {
        return m208900w() == u44.f173686f || m208900w() == u44.f173687g;
    }

    /* JADX INFO: renamed from: G */
    public boolean m208879G() {
        return this.f192933b;
    }

    /* JADX INFO: renamed from: H */
    public boolean m208880H() {
        u44 u44VarM221515e = this.f192941j.m221515e();
        return u44VarM221515e == u44.f173689i || u44VarM221515e == u44.f173688h;
    }

    /* JADX INFO: renamed from: I */
    public boolean m208881I() {
        return this.f192945n;
    }

    /* JADX INFO: renamed from: J */
    public boolean m208882J() {
        return this.f192951t;
    }

    /* JADX INFO: renamed from: K */
    public boolean m208883K(String str, String str2, String str3, String str4, final String str5, String str6) {
        m208874A(str2, str3);
        this.f192941j.onNext(u44.f173685e);
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.businessType = Integer.parseInt(str3);
        mMLiveMediaConfig.cdnType = 25;
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.linkType = m208876D(str4);
        mMLiveRoomParams.userId = CoreModule.m29931H().userId();
        mMLiveRoomParams.channel = str5;
        mMLiveRoomParams.confId = str;
        mMLiveRoomParams.channelKey = str6;
        mMLiveRoomParams.isHost = false;
        MMLiveEngine mMLiveEngine = this.f192932a;
        boolean z = true;
        if (mMLiveEngine != null) {
            z = mMLiveEngine.m19130w(mMLiveMediaConfig, mMLiveRoomParams, new MMLiveTranscoding()) == 0;
        }
        if (z) {
            this.f192936e = C22306c.timer(this.f192944m, TimeUnit.SECONDS).subscribe(mkd0.m154955G(new e30() { // from class: l.nhx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139042a.m208888P(str5, (Long) obj);
                }
            }));
            this.f192935d.setChannelID(str5);
        }
        m208851T("joinChannel resule : " + z);
        return z;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m208884L(Long l2) {
        this.f192943l.onNext(Long.valueOf(l2.longValue() + 1));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m208885M(u44 u44Var) {
        m208896Y();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m208886N(Integer num) {
        return Boolean.valueOf(num.intValue() == 2 && m208900w() == u44.f173686f);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m208887O(Integer num) {
        mkd0.m154992z(this.f192936e);
        this.f192936e = null;
        this.f192941j.onNext(u44.f173687g);
        m208901x();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m208888P(String str, Long l2) {
        m208851T("jointimeout   " + str);
        this.f192941j.onNext(u44.f173688h);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ stc0 m208889Q() {
        return qib0.f154693H.auth().m185898q(C4728a.m31270Y1(Integer.parseInt(CoreModule.m29931H().userId()))).m185892k(utc0.create(Network.JSON, this.f192934c.toJson(this.f192935d))).m185883b();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ C22306c m208890R() {
        return new la20(new v9j() { // from class: l.ohx
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f144070a.m208889Q();
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: S */
    public void m208891S(int i) {
        m208894W();
        mkd0.m154992z(this.f192936e);
        if (m208880H()) {
            return;
        }
        if (m208900w() == u44.f173687g) {
            u44 u44Var = u44.f173689i;
            u44Var.m191671b(i);
            this.f192941j.onNext(u44Var);
            uyx.m196374a();
        } else {
            u44 u44Var2 = u44.f173688h;
            u44Var2.m191671b(i);
            this.f192941j.onNext(u44Var2);
        }
        MMLiveEngine mMLiveEngine = this.f192932a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19085L();
        }
        m208851T("leaveChannel");
        m208897Z("leavedChannel");
        this.f192942k.onNext(-1);
        mqm0.m155965h().m155972e("leaveChannel", "rctLevel");
    }

    /* JADX INFO: renamed from: U */
    public boolean m208892U(boolean z) {
        MMLiveEngine mMLiveEngine = this.f192932a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19118o0(z);
        }
        this.f192945n = z;
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m208893V() {
        m208851T("releasrtc");
        m208894W();
        if (this.f192933b) {
            m208891S(0);
            this.f192941j.onNext(u44.f173683c);
            this.f192946o.setMode(0);
            this.f192943l.onNext(-1L);
            this.f192946o.setSpeakerphoneOn(false);
            this.f192945n = false;
            mkd0.m154992z(this.f192938g);
            mkd0.m154992z(this.f192939h);
            mkd0.m154992z(this.f192940i);
            this.f192947p = 0L;
        }
        this.f192933b = false;
        MMLiveEngine mMLiveEngine = this.f192932a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19096S();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m208894W() {
        this.f192949r = true;
        this.f192948q = 0L;
    }

    /* JADX INFO: renamed from: X */
    public void m208895X(long j) {
        this.f192944m = j;
    }

    /* JADX INFO: renamed from: Y */
    public final void m208896Y() {
        m208894W();
        m208851T("stopCountDuration");
        this.f192947p = this.f192943l.m221515e().longValue();
        mkd0.m154992z(this.f192937f);
        this.f192937f = null;
        this.f192943l.onNext(-1L);
    }

    /* JADX INFO: renamed from: Z */
    public final void m208897Z(String str) {
        m208898a0(str, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m208898a0(String str, Object obj) {
        this.f192935d.setEventName(str);
        this.f192935d.setEventProperties(obj);
        CoreModule.f17545c.scheduled("patch_rtc_" + str, -1, new v9j() { // from class: l.jhx
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f118034a.m208890R();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.lhx
            @Override // p149l.e30
            public final void call(Object obj2) {
                xhx.m208856e((Envelope) obj2);
            }
        }, new e30() { // from class: l.mhx
            @Override // p149l.e30
            public final void call(Object obj2) {
                xhx.m208853b((Throwable) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public C22306c<u44> m208899v() {
        return this.f192941j.distinctUntilChanged().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: w */
    public u44 m208900w() {
        return this.f192941j.m221515e();
    }

    /* JADX INFO: renamed from: x */
    public final void m208901x() {
        if (this.f192937f == null) {
            uyx.m196375b();
            m208851T("start countDuration");
            this.f192937f = C22306c.interval(1L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.khx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123236a.m208884L((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m208902z(boolean z) {
        if (this.f192946o.getMode() != 3) {
            this.f192946o.setMode(3);
        }
        this.f192946o.setSpeakerphoneOn(z);
        MMLiveEngine mMLiveEngine = this.f192932a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19113j0(z);
        }
        this.f192951t = z;
        return true;
    }
}
