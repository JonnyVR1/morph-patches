package p003l;

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
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.mediacall.EventData;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.e51;
import l.fkw;
import l.hfw;
import l.jo0;
import l.la20;
import l.mkd0;
import l.mqm0;
import l.px0;
import l.qib0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xhx {

    /* JADX INFO: renamed from: u */
    public static xhx f8463u = null;

    /* JADX INFO: renamed from: v */
    public static long f8464v = 12;

    /* JADX INFO: renamed from: w */
    public static long f8465w;

    /* JADX INFO: renamed from: a */
    public MMLiveEngine f8466a;

    /* JADX INFO: renamed from: e */
    public c4g0 f8470e;

    /* JADX INFO: renamed from: f */
    public c4g0 f8471f;

    /* JADX INFO: renamed from: g */
    public c4g0 f8472g;

    /* JADX INFO: renamed from: h */
    public c4g0 f8473h;

    /* JADX INFO: renamed from: i */
    public c4g0 f8474i;

    /* JADX INFO: renamed from: b */
    public boolean f8467b = false;

    /* JADX INFO: renamed from: j */
    public a<u44> f8475j = a.c(u44.f7656c);

    /* JADX INFO: renamed from: k */
    public a<Integer> f8476k = a.c(-1);

    /* JADX INFO: renamed from: l */
    public a<Long> f8477l = a.c(-1L);

    /* JADX INFO: renamed from: m */
    public long f8478m = 60;

    /* JADX INFO: renamed from: n */
    public boolean f8479n = false;

    /* JADX INFO: renamed from: p */
    public long f8481p = 0;

    /* JADX INFO: renamed from: q */
    public long f8482q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f8483r = true;

    /* JADX INFO: renamed from: s */
    public fkw f8484s = new C3480a();

    /* JADX INFO: renamed from: t */
    public boolean f8485t = false;

    /* JADX INFO: renamed from: c */
    public Gson f8468c = new Gson();

    /* JADX INFO: renamed from: d */
    public EventData f8469d = new EventData();

    /* JADX INFO: renamed from: o */
    public AudioManager f8480o = (AudioManager) CoreModule.b.getSystemService("audio");

    /* JADX INFO: renamed from: l.xhx$a */
    public class C3480a extends fkw {
        public C3480a() {
        }

        /* JADX INFO: renamed from: A */
        public void m10856A(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.A(str, i, mMLivePushType);
            xhx.m10801T("onUserOffline " + i);
            mqm0.h().f("onUserOffline", "channel:" + str + ",reason:" + i);
            e51.M(new Runnable() { // from class: l.uhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7750a.m10862p0();
                }
            });
        }

        /* JADX INFO: renamed from: Z */
        public void m10857Z(String str, String str2, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.Z(str, str2, mMLivePushType);
            if (TextUtils.equals(CoreModule.H().userId(), str2) || ((Integer) xhx.this.f8476k.e()).intValue() == 2 || !xhx.this.m10828F()) {
                return;
            }
            xhx.this.f8476k.onNext(2);
        }

        /* JADX INFO: renamed from: a0 */
        public void m10858a0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.a0(str, i, mMLivePushType);
            xhx.m10801T("onUserOffline " + i);
            mqm0.h().f("onUserOffline", "uid:" + str + ",reason:" + i);
            e51.M(new Runnable() { // from class: l.whx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8191a.m10863q0();
                }
            });
        }

        /* JADX INFO: renamed from: e0 */
        public void m10859e0(AudioVolumeWeight[] audioVolumeWeightArr, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            int i;
            super.e0(audioVolumeWeightArr, mMLivePushType);
            StringBuilder sb = new StringBuilder();
            if (audioVolumeWeightArr == null || audioVolumeWeightArr.length <= 0) {
                i = 0;
            } else {
                for (int i2 = 0; i2 < audioVolumeWeightArr.length; i2++) {
                    AudioVolumeWeight audioVolumeWeight = audioVolumeWeightArr[i2];
                    sb.append("user:");
                    sb.append(i2);
                    sb.append(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR);
                    sb.append(audioVolumeWeight.uid);
                    sb.append("value:");
                    sb.append(audioVolumeWeight.volume);
                    sb.append("#");
                }
                i = audioVolumeWeightArr[0].totalVolume;
                sb.append("total:");
                sb.append(audioVolumeWeightArr[0].totalVolume);
            }
            mqm0.h().f("onAudioVolumeIndication:", sb.toString());
            if (i <= xhx.f8465w || xhx.this.m10850w() != u44.f7660g) {
                return;
            }
            long j = xhx.this.f8482q;
            xhx xhxVar = xhx.this;
            if (j >= 2) {
                xhxVar.f8483r = false;
            } else if (xhxVar.f8483r && xhx.this.f8482q >= xhx.f8464v) {
                xhx.this.f8483r = false;
                mqm0.l();
            }
            if (xhx.this.f8483r) {
                xhx.this.f8482q++;
            }
        }

        /* JADX INFO: renamed from: o */
        public void m10860o(MMLiveRoomParams.MMLivePushType mMLivePushType, final MMLiveErrorInfo mMLiveErrorInfo) {
            super.o(mMLivePushType, mMLiveErrorInfo);
            e51.M(new Runnable() { // from class: l.vhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7986a.m10861o0(mMLiveErrorInfo);
                }
            });
        }

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ void m10861o0(MMLiveErrorInfo mMLiveErrorInfo) {
            xhx.this.m10841S(mMLiveErrorInfo.what);
            xhx.this.m10843V();
        }

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ void m10862p0() {
            xhx.this.m10841S(0);
            xhx.this.m10843V();
        }

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ void m10863q0() {
            xhx.this.m10841S(0);
            xhx.this.m10843V();
        }

        /* JADX INFO: renamed from: z */
        public void m10864z(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
            super.z(str, j, mMLivePushType);
            xhx.m10801T("onJoinChannelSuccess ");
            xhx.this.m10852z(false);
            xhx.this.m10848a0("channelJoined", null);
            xhx.this.f8475j.onNext(u44.f7659f);
            xhx.this.f8480o.setMode(3);
        }
    }

    /* JADX INFO: renamed from: C */
    public static xhx m10800C() {
        if (f8463u == null) {
            synchronized (xhx.class) {
                try {
                    if (f8463u == null) {
                        f8463u = new xhx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8463u;
    }

    /* JADX INFO: renamed from: T */
    public static void m10801T(String str) {
        hfw.a("MediaCallManager", str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10803b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10806e(Envelope envelope) {
    }

    /* JADX INFO: renamed from: y */
    public static void m10823y() {
        if (NullChecker.a(f8463u)) {
            f8463u.m10843V();
        }
        f8463u = null;
    }

    /* JADX INFO: renamed from: A */
    public boolean m10824A(String str, String str2) {
        try {
            if (!ghd0.m6641c()) {
                return false;
            }
            xhx xhxVarM10800C = m10800C();
            return !NullChecker.a(xhxVarM10800C) || xhxVarM10800C.m10829G() || xhxVarM10800C.m10827E(str, str2);
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: B */
    public long m10825B() {
        return ((Long) this.f8477l.e()).longValue();
    }

    /* JADX INFO: renamed from: D */
    public MMLiveRoomParams.MMLivePushType m10826D(String str) {
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
    public boolean m10827E(String str, String str2) {
        if (this.f8467b) {
            CrashHelper.c(new Exception("mRtcEngine already init"));
            m10801T("already init");
            return false;
        }
        MMLiveEngine mMLiveEngine = new MMLiveEngine(new MMLiveUserConfig(CoreModule.Q().ih(), CoreModule.Q().Hh(), CoreModule.c.e0.p9().publicId, str, px0.b(App.e), px0.a(App.e), true), CoreModule.b);
        this.f8466a = mMLiveEngine;
        mMLiveEngine.p0(true);
        this.f8466a.l0(false);
        this.f8466a.f0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster);
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = 3000;
        mMLiveAudioVolumeConfig.smooth = 3;
        this.f8466a.h0(mMLiveAudioVolumeConfig);
        this.f8466a.g0(true);
        this.f8466a.t0(this.f8484s);
        try {
            this.f8480o.setSpeakerphoneOn(false);
            this.f8472g = m10849v().filter(new w9j() { // from class: l.phx
                public final Object call(Object obj) {
                    u44 u44Var = (u44) obj;
                    return Boolean.valueOf(u44Var == u44.f7662i || u44Var == u44.f7661h);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.qhx
                public final void call(Object obj) {
                    this.f7026a.m10835M((u44) obj);
                }
            }));
            this.f8473h = this.f8476k.filter(new w9j() { // from class: l.rhx
                public final Object call(Object obj) {
                    return this.f7180a.m10836N((Integer) obj);
                }
            }).subscribe(new e30() { // from class: l.shx
                public final void call(Object obj) {
                    this.f7369a.m10837O((Integer) obj);
                }
            });
            this.f8467b = true;
            this.f8474i = m10849v().subscribe(mkd0.G(new e30() { // from class: l.thx
                public final void call(Object obj) {
                    xhx.m10801T("media callState== " + ((u44) obj));
                }
            }));
            this.f8475j.onNext(u44.f7657d);
            return true;
        } catch (Exception e) {
            CrashHelper.c(e);
            m10801T("init " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m10828F() {
        return m10850w() == u44.f7659f || m10850w() == u44.f7660g;
    }

    /* JADX INFO: renamed from: G */
    public boolean m10829G() {
        return this.f8467b;
    }

    /* JADX INFO: renamed from: H */
    public boolean m10830H() {
        u44 u44Var = (u44) this.f8475j.e();
        return u44Var == u44.f7662i || u44Var == u44.f7661h;
    }

    /* JADX INFO: renamed from: I */
    public boolean m10831I() {
        return this.f8479n;
    }

    /* JADX INFO: renamed from: J */
    public boolean m10832J() {
        return this.f8485t;
    }

    /* JADX INFO: renamed from: K */
    public boolean m10833K(String str, String str2, String str3, String str4, final String str5, String str6) {
        m10824A(str2, str3);
        this.f8475j.onNext(u44.f7658e);
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.businessType = Integer.parseInt(str3);
        mMLiveMediaConfig.cdnType = 25;
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.linkType = m10826D(str4);
        mMLiveRoomParams.userId = CoreModule.H().userId();
        mMLiveRoomParams.channel = str5;
        mMLiveRoomParams.confId = str;
        mMLiveRoomParams.channelKey = str6;
        mMLiveRoomParams.isHost = false;
        MMLiveEngine mMLiveEngine = this.f8466a;
        boolean z = true;
        if (mMLiveEngine != null) {
            z = mMLiveEngine.w(mMLiveMediaConfig, mMLiveRoomParams, new MMLiveTranscoding()) == 0;
        }
        if (z) {
            this.f8470e = c.timer(this.f8478m, TimeUnit.SECONDS).subscribe(mkd0.G(new e30() { // from class: l.nhx
                public final void call(Object obj) {
                    this.f6509a.m10838P(str5, (Long) obj);
                }
            }));
            this.f8469d.setChannelID(str5);
        }
        m10801T("joinChannel resule : " + z);
        return z;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10834L(Long l2) {
        this.f8477l.onNext(Long.valueOf(l2.longValue() + 1));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10835M(u44 u44Var) {
        m10846Y();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m10836N(Integer num) {
        return Boolean.valueOf(num.intValue() == 2 && m10850w() == u44.f7659f);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10837O(Integer num) {
        mkd0.z(this.f8470e);
        this.f8470e = null;
        this.f8475j.onNext(u44.f7660g);
        m10851x();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10838P(String str, Long l2) {
        m10801T("jointimeout   " + str);
        this.f8475j.onNext(u44.f7661h);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ stc0 m10839Q() {
        return qib0.H.auth().q(com.p1.mobile.putong.core.api.a.Y1(Integer.parseInt(CoreModule.H().userId()))).k(utc0.create(Network.JSON, this.f8468c.toJson(this.f8469d))).b();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ c m10840R() {
        return new la20(new v9j() { // from class: l.ohx
            public final Object call() {
                return this.f6665a.m10839Q();
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: S */
    public void m10841S(int i) {
        m10844W();
        mkd0.z(this.f8470e);
        if (m10830H()) {
            return;
        }
        if (m10850w() == u44.f7660g) {
            u44 u44Var = u44.f7662i;
            u44Var.m9647b(i);
            this.f8475j.onNext(u44Var);
            uyx.m9795a();
        } else {
            u44 u44Var2 = u44.f7661h;
            u44Var2.m9647b(i);
            this.f8475j.onNext(u44Var2);
        }
        MMLiveEngine mMLiveEngine = this.f8466a;
        if (mMLiveEngine != null) {
            mMLiveEngine.L();
        }
        m10801T("leaveChannel");
        m10847Z("leavedChannel");
        this.f8476k.onNext(-1);
        mqm0.h().e("leaveChannel", "rctLevel");
    }

    /* JADX INFO: renamed from: U */
    public boolean m10842U(boolean z) {
        MMLiveEngine mMLiveEngine = this.f8466a;
        if (mMLiveEngine != null) {
            mMLiveEngine.o0(z);
        }
        this.f8479n = z;
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m10843V() {
        m10801T("releasrtc");
        m10844W();
        if (this.f8467b) {
            m10841S(0);
            this.f8475j.onNext(u44.f7656c);
            this.f8480o.setMode(0);
            this.f8477l.onNext(-1L);
            this.f8480o.setSpeakerphoneOn(false);
            this.f8479n = false;
            mkd0.z(this.f8472g);
            mkd0.z(this.f8473h);
            mkd0.z(this.f8474i);
            this.f8481p = 0L;
        }
        this.f8467b = false;
        MMLiveEngine mMLiveEngine = this.f8466a;
        if (mMLiveEngine != null) {
            mMLiveEngine.S();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m10844W() {
        this.f8483r = true;
        this.f8482q = 0L;
    }

    /* JADX INFO: renamed from: X */
    public void m10845X(long j) {
        this.f8478m = j;
    }

    /* JADX INFO: renamed from: Y */
    public final void m10846Y() {
        m10844W();
        m10801T("stopCountDuration");
        this.f8481p = ((Long) this.f8477l.e()).longValue();
        mkd0.z(this.f8471f);
        this.f8471f = null;
        this.f8477l.onNext(-1L);
    }

    /* JADX INFO: renamed from: Z */
    public final void m10847Z(String str) {
        m10848a0(str, null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10848a0(String str, Object obj) {
        this.f8469d.setEventName(str);
        this.f8469d.setEventProperties(obj);
        CoreModule.c.scheduled("patch_rtc_" + str, -1, new v9j() { // from class: l.jhx
            public final Object call() {
                return this.f5328a.m10840R();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.lhx
            public final void call(Object obj2) {
                xhx.m10806e((Envelope) obj2);
            }
        }, new e30() { // from class: l.mhx
            public final void call(Object obj2) {
                xhx.m10803b((Throwable) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public c<u44> m10849v() {
        return this.f8475j.distinctUntilChanged().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: w */
    public u44 m10850w() {
        return (u44) this.f8475j.e();
    }

    /* JADX INFO: renamed from: x */
    public final void m10851x() {
        if (this.f8471f == null) {
            uyx.m9796b();
            m10801T("start countDuration");
            this.f8471f = c.interval(1L, 1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.khx
                public final void call(Object obj) {
                    this.f5655a.m10834L((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m10852z(boolean z) {
        if (this.f8480o.getMode() != 3) {
            this.f8480o.setMode(3);
        }
        this.f8480o.setSpeakerphoneOn(z);
        MMLiveEngine mMLiveEngine = this.f8466a;
        if (mMLiveEngine != null) {
            mMLiveEngine.j0(z);
        }
        this.f8485t = z;
        return true;
    }
}
