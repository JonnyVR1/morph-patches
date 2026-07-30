package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.mediacall.EventData;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class uqx {

    /* JADX INFO: renamed from: u */
    public static uqx f180516u = null;

    /* JADX INFO: renamed from: v */
    public static long f180517v = 12;

    /* JADX INFO: renamed from: w */
    public static long f180518w;

    /* JADX INFO: renamed from: a */
    public MMLiveEngine f180519a;

    /* JADX INFO: renamed from: e */
    public kcg0 f180523e;

    /* JADX INFO: renamed from: f */
    public kcg0 f180524f;

    /* JADX INFO: renamed from: g */
    public kcg0 f180525g;

    /* JADX INFO: renamed from: h */
    public kcg0 f180526h;

    /* JADX INFO: renamed from: i */
    public kcg0 f180527i;

    /* JADX INFO: renamed from: b */
    public boolean f180520b = false;

    /* JADX INFO: renamed from: j */
    public C22507a<t54> f180528j = C22507a.m222759c(t54.f172172c);

    /* JADX INFO: renamed from: k */
    public C22507a<Integer> f180529k = C22507a.m222759c(-1);

    /* JADX INFO: renamed from: l */
    public C22507a<Long> f180530l = C22507a.m222759c(-1L);

    /* JADX INFO: renamed from: m */
    public long f180531m = 60;

    /* JADX INFO: renamed from: n */
    public boolean f180532n = false;

    /* JADX INFO: renamed from: p */
    public long f180534p = 0;

    /* JADX INFO: renamed from: q */
    public long f180535q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f180536r = true;

    /* JADX INFO: renamed from: s */
    public enw f180537s = new C20634a();

    /* JADX INFO: renamed from: t */
    public boolean f180538t = false;

    /* JADX INFO: renamed from: c */
    public Gson f180521c = new Gson();

    /* JADX INFO: renamed from: d */
    public EventData f180522d = new EventData();

    /* JADX INFO: renamed from: o */
    public AudioManager f180533o = (AudioManager) CoreModule.f18263b.getSystemService("audio");

    /* JADX INFO: renamed from: l.uqx$a */
    public class C20634a extends enw {
        public C20634a() {
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: A */
        public void mo48175A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48175A(str, i, mMLivePushType);
            uqx.m197380T("onUserOffline " + i);
            qzm0.m178812h().m178820f("onUserOffline", "channel:" + str + ",reason:" + i);
            l51.m152893M(new Runnable() { // from class: l.rqx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164531a.m197436p0();
                }
            });
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: Z */
        public void mo48178Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48178Z(str, str2, mMLivePushType);
            if (TextUtils.equals(CoreModule.m30929H().userId(), str2) || ((Integer) uqx.this.f180529k.m222761e()).intValue() == 2 || !uqx.this.m197407F()) {
                return;
            }
            uqx.this.f180529k.onNext(2);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: a0 */
        public void mo48179a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48179a0(str, i, mMLivePushType);
            uqx.m197380T("onUserOffline " + i);
            qzm0.m178812h().m178820f("onUserOffline", "uid:" + str + ",reason:" + i);
            l51.m152893M(new Runnable() { // from class: l.tqx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175789a.m197437q0();
                }
            });
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: e0 */
        public void mo48181e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            int i;
            super.mo48181e0(audioVolumeWeightArr, mMLivePushType);
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
            qzm0.m178812h().m178820f("onAudioVolumeIndication:", sb.toString());
            if (i <= uqx.f180518w || uqx.this.m197429w() != t54.f172176g) {
                return;
            }
            long j = uqx.this.f180535q;
            uqx uqxVar = uqx.this;
            if (j >= 2) {
                uqxVar.f180536r = false;
            } else if (uqxVar.f180536r && uqx.this.f180535q >= uqx.f180517v) {
                uqx.this.f180536r = false;
                qzm0.m178815l();
            }
            if (uqx.this.f180536r) {
                uqx.this.f180535q++;
            }
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: o */
        public void mo48182o(MMLiveRoomParams.MMLivePushType mMLivePushType, final MMLiveErrorInfo mMLiveErrorInfo) {
            super.mo48182o(mMLivePushType, mMLiveErrorInfo);
            l51.m152893M(new Runnable() { // from class: l.sqx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170273a.m197435o0(mMLiveErrorInfo);
                }
            });
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m197435o0(MMLiveErrorInfo mMLiveErrorInfo) {
            uqx.this.m197420S(mMLiveErrorInfo.what);
            uqx.this.m197422V();
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m197436p0() {
            uqx.this.m197420S(0);
            uqx.this.m197422V();
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m197437q0() {
            uqx.this.m197420S(0);
            uqx.this.m197422V();
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: z */
        public void mo48189z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.mo48189z(str, j, mMLivePushType);
            uqx.m197380T("onJoinChannelSuccess ");
            uqx.this.m197431z(false);
            uqx.this.m197427a0("channelJoined", null);
            uqx.this.f180528j.onNext(t54.f172175f);
            uqx.this.f180533o.setMode(3);
        }
    }

    /* JADX INFO: renamed from: C */
    public static uqx m197379C() {
        if (f180516u == null) {
            synchronized (uqx.class) {
                try {
                    if (f180516u == null) {
                        f180516u = new uqx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f180516u;
    }

    /* JADX INFO: renamed from: T */
    public static void m197380T(String str) {
        fhw.m125605a("MediaCallManager", str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m197382b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m197385e(Envelope envelope) {
    }

    /* JADX INFO: renamed from: y */
    public static void m197402y() {
        if (NullChecker.m82486a(f180516u)) {
            f180516u.m197422V();
        }
        f180516u = null;
    }

    /* JADX INFO: renamed from: A */
    public boolean m197403A(String str, String str2) {
        try {
            if (!jpd0.m146488c()) {
                return false;
            }
            uqx uqxVarM197379C = m197379C();
            return !NullChecker.m82486a(uqxVarM197379C) || uqxVarM197379C.m197408G() || uqxVarM197379C.m197406E(str, str2);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public long m197404B() {
        return this.f180530l.m222761e().longValue();
    }

    /* JADX INFO: renamed from: D */
    public MMLiveRoomParams.MMLivePushType m197405D(String str) {
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
    public boolean m197406E(String str, String str2) {
        if (this.f180520b) {
            CrashHelper.m82479c(new Exception("mRtcEngine already init"));
            m197380T("already init");
            return false;
        }
        MMLiveEngine mMLiveEngine = new MMLiveEngine(new MMLiveUserConfig(CoreModule.m30934Q().mo68453ih(), CoreModule.m30934Q().mo68405Hh(), CoreModule.f18264c.f20381e0.m116600p9().publicId, str, wx0.m208362b(App.f16088e), wx0.m208361a(App.f16088e), true), CoreModule.f18263b);
        this.f180519a = mMLiveEngine;
        mMLiveEngine.m20099p0(true);
        this.f180519a.m20095l0(false);
        this.f180519a.m20089f0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster);
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = 3000;
        mMLiveAudioVolumeConfig.smooth = 3;
        this.f180519a.m20091h0(mMLiveAudioVolumeConfig);
        this.f180519a.m20090g0(true);
        this.f180519a.m20106t0(this.f180537s);
        try {
            this.f180533o.setSpeakerphoneOn(false);
            this.f180525g = m197428v().filter(new qcj() { // from class: l.mqx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    t54 t54Var = (t54) obj;
                    return Boolean.valueOf(t54Var == t54.f172178i || t54Var == t54.f172177h);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.nqx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143264a.m197414M((t54) obj);
                }
            }));
            this.f180526h = this.f180529k.filter(new qcj() { // from class: l.oqx
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f148654a.m197415N((Integer) obj);
                }
            }).subscribe(new y20() { // from class: l.pqx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153714a.m197416O((Integer) obj);
                }
            });
            this.f180520b = true;
            this.f180527i = m197428v().subscribe(psd0.m173596G(new y20() { // from class: l.qqx
                @Override // p153l.y20
                public final void call(Object obj) {
                    uqx.m197380T("media callState== " + ((t54) obj));
                }
            }));
            this.f180528j.onNext(t54.f172173d);
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m197380T("init " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m197407F() {
        return m197429w() == t54.f172175f || m197429w() == t54.f172176g;
    }

    /* JADX INFO: renamed from: G */
    public boolean m197408G() {
        return this.f180520b;
    }

    /* JADX INFO: renamed from: H */
    public boolean m197409H() {
        t54 t54VarM222761e = this.f180528j.m222761e();
        return t54VarM222761e == t54.f172178i || t54VarM222761e == t54.f172177h;
    }

    /* JADX INFO: renamed from: I */
    public boolean m197410I() {
        return this.f180532n;
    }

    /* JADX INFO: renamed from: J */
    public boolean m197411J() {
        return this.f180538t;
    }

    /* JADX INFO: renamed from: K */
    public boolean m197412K(String str, String str2, String str3, String str4, final String str5, String str6) {
        m197403A(str2, str3);
        this.f180528j.onNext(t54.f172174e);
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.businessType = Integer.parseInt(str3);
        mMLiveMediaConfig.cdnType = 25;
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.linkType = m197405D(str4);
        mMLiveRoomParams.userId = CoreModule.m30929H().userId();
        mMLiveRoomParams.channel = str5;
        mMLiveRoomParams.confId = str;
        mMLiveRoomParams.channelKey = str6;
        mMLiveRoomParams.isHost = false;
        MMLiveEngine mMLiveEngine = this.f180519a;
        boolean z = true;
        if (mMLiveEngine != null) {
            z = mMLiveEngine.m20110w(mMLiveMediaConfig, mMLiveRoomParams, new MMLiveTranscoding()) == 0;
        }
        if (z) {
            this.f180523e = C22421c.timer(this.f180531m, TimeUnit.SECONDS).subscribe(psd0.m173596G(new y20() { // from class: l.kqx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128400a.m197417P(str5, (Long) obj);
                }
            }));
            this.f180522d.setChannelID(str5);
        }
        m197380T("joinChannel resule : " + z);
        return z;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m197413L(Long l2) {
        this.f180530l.onNext(Long.valueOf(l2.longValue() + 1));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m197414M(t54 t54Var) {
        m197425Y();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m197415N(Integer num) {
        return Boolean.valueOf(num.intValue() == 2 && m197429w() == t54.f172175f);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m197416O(Integer num) {
        psd0.m173633z(this.f180523e);
        this.f180523e = null;
        this.f180528j.onNext(t54.f172176g);
        m197430x();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m197417P(String str, Long l2) {
        m197380T("jointimeout   " + str);
        this.f180528j.onNext(t54.f172177h);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ x1d0 m197418Q() {
        return uqb0.f180376H.auth().m209043q(C4879a.m32273Y1(Integer.parseInt(CoreModule.m30929H().userId()))).m209037k(z1d0.create(Network.JSON, this.f180521c.toJson(this.f180522d))).m209028b();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ C22421c m197419R() {
        return new ti20(new pcj() { // from class: l.lqx
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133253a.m197418Q();
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: S */
    public void m197420S(int i) {
        m197423W();
        psd0.m173633z(this.f180523e);
        if (m197409H()) {
            return;
        }
        if (m197429w() == t54.f172176g) {
            t54 t54Var = t54.f172178i;
            t54Var.m189374b(i);
            this.f180528j.onNext(t54Var);
            r7y.m180167a();
        } else {
            t54 t54Var2 = t54.f172177h;
            t54Var2.m189374b(i);
            this.f180528j.onNext(t54Var2);
        }
        MMLiveEngine mMLiveEngine = this.f180519a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20065L();
        }
        m197380T("leaveChannel");
        m197426Z("leavedChannel");
        this.f180529k.onNext(-1);
        qzm0.m178812h().m178819e("leaveChannel", "rctLevel");
    }

    /* JADX INFO: renamed from: U */
    public boolean m197421U(boolean z) {
        MMLiveEngine mMLiveEngine = this.f180519a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20098o0(z);
        }
        this.f180532n = z;
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m197422V() {
        m197380T("releasrtc");
        m197423W();
        if (this.f180520b) {
            m197420S(0);
            this.f180528j.onNext(t54.f172172c);
            this.f180533o.setMode(0);
            this.f180530l.onNext(-1L);
            this.f180533o.setSpeakerphoneOn(false);
            this.f180532n = false;
            psd0.m173633z(this.f180525g);
            psd0.m173633z(this.f180526h);
            psd0.m173633z(this.f180527i);
            this.f180534p = 0L;
        }
        this.f180520b = false;
        MMLiveEngine mMLiveEngine = this.f180519a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20076S();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m197423W() {
        this.f180536r = true;
        this.f180535q = 0L;
    }

    /* JADX INFO: renamed from: X */
    public void m197424X(long j) {
        this.f180531m = j;
    }

    /* JADX INFO: renamed from: Y */
    public final void m197425Y() {
        m197423W();
        m197380T("stopCountDuration");
        this.f180534p = this.f180530l.m222761e().longValue();
        psd0.m173633z(this.f180524f);
        this.f180524f = null;
        this.f180530l.onNext(-1L);
    }

    /* JADX INFO: renamed from: Z */
    public final void m197426Z(String str) {
        m197427a0(str, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m197427a0(String str, Object obj) {
        this.f180522d.setEventName(str);
        this.f180522d.setEventProperties(obj);
        CoreModule.f18264c.scheduled("patch_rtc_" + str, -1, new pcj() { // from class: l.gqx
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f105975a.m197419R();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.iqx
            @Override // p153l.y20
            public final void call(Object obj2) {
                uqx.m197385e((Envelope) obj2);
            }
        }, new y20() { // from class: l.jqx
            @Override // p153l.y20
            public final void call(Object obj2) {
                uqx.m197382b((Throwable) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public C22421c<t54> m197428v() {
        return this.f180528j.distinctUntilChanged().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: w */
    public t54 m197429w() {
        return this.f180528j.m222761e();
    }

    /* JADX INFO: renamed from: x */
    public final void m197430x() {
        if (this.f180524f == null) {
            r7y.m180168b();
            m197380T("start countDuration");
            this.f180524f = C22421c.interval(1L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hqx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111197a.m197413L((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m197431z(boolean z) {
        if (this.f180533o.getMode() != 3) {
            this.f180533o.setMode(3);
        }
        this.f180533o.setSpeakerphoneOn(z);
        MMLiveEngine mMLiveEngine = this.f180519a;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20093j0(z);
        }
        this.f180538t = z;
        return true;
    }
}
