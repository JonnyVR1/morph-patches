package com.immomo.momomediaext;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p051p1.mobile.putong.core.data.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.b7y;
import p153l.brx;
import p153l.ebl0;
import p153l.fb1;
import p153l.fpf0;
import p153l.gbl0;
import p153l.gkl0;
import p153l.hnw;
import p153l.hwl;
import p153l.kod0;
import p153l.mob0;
import p153l.ror;
import p153l.usl;
import p153l.wpw;

/* JADX INFO: renamed from: com.immomo.momomediaext.a */
/* JADX INFO: loaded from: classes7.dex */
public class C4055a {

    /* JADX INFO: renamed from: A */
    private hnw f14569A;

    /* JADX INFO: renamed from: a */
    private hwl f14578a;

    /* JADX INFO: renamed from: b */
    private MMLiveRoomParams.MMLivePushType f14579b;

    /* JADX INFO: renamed from: c */
    private MMLiveMediaConfig f14580c;

    /* JADX INFO: renamed from: d */
    private MMLiveRoomParams f14581d;

    /* JADX INFO: renamed from: e */
    private MomoPipelineModuleRegister f14582e;

    /* JADX INFO: renamed from: f */
    private MRtcEventHandler f14583f;

    /* JADX INFO: renamed from: g */
    private ebl0 f14584g;

    /* JADX INFO: renamed from: h */
    private gbl0 f14585h;

    /* JADX INFO: renamed from: i */
    private gkl0 f14586i;

    /* JADX INFO: renamed from: j */
    private kod0 f14587j;

    /* JADX INFO: renamed from: k */
    private fb1 f14588k;

    /* JADX INFO: renamed from: p */
    private usl f14593p;

    /* JADX INFO: renamed from: q */
    private MMLiveUserConfig f14594q;

    /* JADX INFO: renamed from: l */
    private boolean f14589l = true;

    /* JADX INFO: renamed from: m */
    private boolean f14590m = true;

    /* JADX INFO: renamed from: n */
    private boolean f14591n = false;

    /* JADX INFO: renamed from: o */
    private boolean f14592o = false;

    /* JADX INFO: renamed from: r */
    private int f14595r = 0;

    /* JADX INFO: renamed from: s */
    private int f14596s = 0;

    /* JADX INFO: renamed from: t */
    private String f14597t = "";

    /* JADX INFO: renamed from: u */
    private MMLiveRoomParams.MMLiveRoomMode f14598u = MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODELIVE;

    /* JADX INFO: renamed from: v */
    private boolean f14599v = false;

    /* JADX INFO: renamed from: w */
    private long f14600w = -1;

    /* JADX INFO: renamed from: x */
    private boolean f14601x = false;

    /* JADX INFO: renamed from: y */
    private wpw f14602y = null;

    /* JADX INFO: renamed from: z */
    private int f14603z = -2;

    /* JADX INFO: renamed from: B */
    private int f14570B = -1;

    /* JADX INFO: renamed from: C */
    private List<String> f14571C = new ArrayList();

    /* JADX INFO: renamed from: D */
    private boolean f14572D = false;

    /* JADX INFO: renamed from: E */
    private MRtcChannelHandler f14573E = null;

    /* JADX INFO: renamed from: F */
    private MRtcTokenWillExpireHander f14574F = null;

    /* JADX INFO: renamed from: G */
    private MRtcReceiveSeiHandler f14575G = null;

    /* JADX INFO: renamed from: H */
    private MRtcPusherHandler f14576H = null;

    /* JADX INFO: renamed from: I */
    private MRtcAudioHandler f14577I = null;

    /* JADX INFO: renamed from: com.immomo.momomediaext.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14604a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f14605b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f14606c;

        static {
            int[] iArr = new int[MMLiveRoomParams.MMLivePushType.values().length];
            f14606c = iArr;
            try {
                iArr[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14606c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14606c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14606c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfWL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14606c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14606c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[MMLiveRoomParams.MMLiveClientRole.values().length];
            f14605b = iArr2;
            try {
                iArr2[MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14605b[MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[MMLiveRoomParams.MMLiveRoomMode.values().length];
            f14604a = iArr3;
            try {
                iArr3[MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODELIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14604a[MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODECOMMUNICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public C4055a(MomoPipelineModuleRegister momoPipelineModuleRegister, MMLiveUserConfig mMLiveUserConfig, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        this.f14579b = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        this.f14594q = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        this.f14582e = momoPipelineModuleRegister;
        this.f14579b = mMLivePushType;
        if (mMLiveUserConfig != null) {
            this.f14594q = mMLiveUserConfig;
        } else {
            this.f14594q = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m20212Q(List<String> list) {
        if (this.f14578a != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f14578a.mo109334v(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public int m20213A(int i) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109312e0(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public int m20214B(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        if (this.f14578a != null) {
            int i = a.f14605b[mMLiveClientRole.ordinal()];
            int i2 = 2;
            if (i != 1) {
                i2 = i != 2 ? -1 : 1;
            }
            if (i2 > 0) {
                return this.f14578a.mo109275E0(i2);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public int m20215C(int i, hnw hnwVar) {
        this.f14603z = i;
        this.f14569A = hnwVar;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109301W0(i, hnwVar);
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public void m20216D(boolean z) {
        this.f14590m = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109333u1(z);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m20217E(boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.setEnableSpeakerphone(z);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m20218F(boolean z) {
        this.f14589l = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109270C0(z);
            boolean z2 = this.f14589l;
            hwl hwlVar2 = this.f14578a;
            if (z2) {
                hwlVar2.mo107928t1(1);
            } else {
                hwlVar2.mo107928t1(2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m20219G(fpf0 fpf0Var) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14582e;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21163i(5000, 6, fpf0Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m20220H(MMLiveTranscoding mMLiveTranscoding) {
        int i;
        if (this.f14578a == null || mMLiveTranscoding == null) {
            return;
        }
        ror parameters = this.f14582e.getParameters();
        if (parameters != null && (i = mMLiveTranscoding.canvasHeight) > 0 && i > 0) {
            parameters.f175492l = i;
            parameters.f175490k = mMLiveTranscoding.canvasWidth;
        }
        this.f14578a.mo107895J(mMLiveTranscoding.toString());
    }

    /* JADX INFO: renamed from: I */
    public void m20221I(boolean z) {
        this.f14592o = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109278G(z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m20222J(String str) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107894I1(str);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m20223K(boolean z) {
        this.f14591n = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107889B1(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m20224L(float f) {
        b7y.m102882c().m102888g("setMasterAudioVolume", Float.valueOf(f));
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109313g0(f);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m20225M(int i) {
        b7y.m102882c().m102888g("setMusicVolumeRTC:" + i);
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109283K0(i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m20226N(long j) {
        this.f14600w = j;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107898O(j);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m20227O(fb1 fb1Var) {
        this.f14588k = fb1Var;
    }

    /* JADX INFO: renamed from: P */
    public void m20228P(String str) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109334v(str);
        } else {
            this.f14571C.add(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m20229R(int i, boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107899Q0(i, z);
        }
    }

    /* JADX INFO: renamed from: S */
    public int m20230S(int i) {
        this.f14570B = i;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109319i2(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: T */
    public void m20231T(String str) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107909e(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m20232U(boolean z) {
        this.f14601x = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109328q1(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m20233V(kod0 kod0Var) {
        this.f14587j = kod0Var;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109321j2(kod0Var);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m20234W(MRtcEventHandler mRtcEventHandler, ebl0 ebl0Var, gkl0 gkl0Var) {
        this.f14583f = mRtcEventHandler;
        this.f14584g = ebl0Var;
        this.f14586i = gkl0Var;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109303X1(mRtcEventHandler);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m20235X(gbl0 gbl0Var) {
        this.f14585h = gbl0Var;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109293P0(gbl0Var);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m20236Y(String str) {
        this.f14597t = str;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109268B(str);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m20237Z(String str, boolean z, int i) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109329r0(str, z, false, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m20238a(String str, String str2, String str3) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109317h2(str, str2, str3);
        }
        return -2;
    }

    /* JADX INFO: renamed from: a0 */
    public void m20239a0() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20240b(MRtcAudioHandler mRtcAudioHandler) {
        this.f14577I = mRtcAudioHandler;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107905Z1(mRtcAudioHandler, 100, 100);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public int m20241b0(String str) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109335x1(str);
        }
        return -2;
    }

    /* JADX INFO: renamed from: c */
    public void m20242c(MRtcChannelHandler mRtcChannelHandler) {
        this.f14573E = mRtcChannelHandler;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109318i0(mRtcChannelHandler);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m20243c0(String str) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109325l2(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m20244d(wpw wpwVar) {
        this.f14602y = wpwVar;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109279H0(wpwVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20245e(MRtcPusherHandler mRtcPusherHandler) {
        this.f14576H = mRtcPusherHandler;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109274E(mRtcPusherHandler);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m20246f(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f14574F = mRtcTokenWillExpireHander;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109299U(mRtcTokenWillExpireHander);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m20247g(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f14575G = mRtcReceiveSeiHandler;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109305Y1(mRtcReceiveSeiHandler);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m20248h(int i, int i2, int i3) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107908c2(this.f14577I, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m20249i(boolean z, String str) {
        if (this.f14578a == null || !z || TextUtils.isEmpty(str)) {
            return;
        }
        this.f14578a.mo109300W(z, str);
    }

    /* JADX INFO: renamed from: j */
    public void m20250j(boolean z) {
        this.f14572D = z;
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109324l1(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m20251k(boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107929u(z);
            this.f14578a.mo109298T1(z);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m20252l(boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107931v0(z);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m20253m(@NonNull MMLiveMediaConfig mMLiveMediaConfig, @NonNull MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f14580c = mMLiveMediaConfig;
        this.f14581d = mMLiveRoomParams;
        ror parameters = this.f14582e.getParameters();
        int i5 = mMLiveMediaConfig.encodeWidth;
        parameters.f175494m = i5;
        parameters.f175506s = i5;
        parameters.f175490k = i5;
        int i6 = mMLiveMediaConfig.encodeHeight;
        parameters.f175496n = i6;
        parameters.f175508t = i6;
        parameters.f175492l = i6;
        int i7 = mMLiveMediaConfig.videoFPS;
        parameters.f175449F = i7;
        parameters.f180174S0 = i7;
        parameters.f180187v0 = mMLiveMediaConfig.url;
        parameters.f175451H = mMLiveMediaConfig.videoBitRate;
        parameters.f175461R = mMLiveMediaConfig.audioChannels;
        parameters.f175459P = mMLiveMediaConfig.audioSampleRate;
        parameters.f175462S = mMLiveMediaConfig.audioBitrate;
        parameters.f180158C0 = mMLiveRoomParams.userSig;
        parameters.f180162G0 = true;
        parameters.f180183b1 = mMLiveRoomParams.blueToothType;
        parameters.f180182a1 = mMLiveRoomParams.degradationPrefer;
        try {
            String str = mMLiveRoomParams.userId;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(mMLiveRoomParams.channel) && !TextUtils.isEmpty(mMLiveRoomParams.confId)) {
                int i8 = (int) Long.parseLong(mMLiveRoomParams.userId);
                parameters.f164228i1 = i8;
                parameters.f180157B0 = i8;
                if (mMLiveTranscoding != null && (i3 = mMLiveTranscoding.canvasWidth) > 0 && (i4 = mMLiveTranscoding.canvasHeight) > 0) {
                    parameters.f175490k = i3;
                    parameters.f175492l = i4;
                }
                parameters.f164226g1 = mMLiveRoomParams.channel;
                parameters.f164224e1 = mMLiveRoomParams.role == MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience ? 2 : 1;
                parameters.f164227h1 = mMLiveRoomParams.isHost;
                parameters.f164231l1 = mMLiveMediaConfig.cdnType;
                parameters.f164233n1 = mMLiveRoomParams.sourceLanguage;
                parameters.f180184c1 = mMLiveRoomParams.agoraRtcKeepAlive;
                parameters.f180185d1 = mMLiveRoomParams.volcRtcKeepAlive;
                parameters.f164234o1 = mMLiveRoomParams.enableRtcPlaybackCallback;
                this.f14582e.mo21179y(parameters);
                MomoPipelineModuleRegister.LinkType linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
                switch (a.f14606c[this.f14579b.ordinal()]) {
                    case 2:
                        linkType = MomoPipelineModuleRegister.LinkType.MOMORTCLINK;
                        break;
                    case 3:
                        linkType = MomoPipelineModuleRegister.LinkType.TXLINK;
                        break;
                    case 4:
                        linkType = MomoPipelineModuleRegister.LinkType.WEILALINK;
                        break;
                    case 5:
                        linkType = MomoPipelineModuleRegister.LinkType.VOLCLINK;
                        break;
                    case 6:
                        return -2;
                }
                String str2 = mMLiveRoomParams.confId;
                this.f14593p = this.f14582e.mo21151L();
                brx brxVar = new brx();
                brxVar.m106183o(this.f14594q.getAppid());
                brxVar.m106189u(this.f14594q.getMomoid());
                brxVar.m106187s(this.f14594q.getRoomid());
                brxVar.m106186r(mMLiveMediaConfig.cdnType);
                brxVar.m106188t(this.f14594q.getSecret());
                brxVar.m106184p(mMLiveMediaConfig.businessType);
                hwl hwlVarMo21152M = this.f14582e.mo21152M(linkType, str2, brxVar);
                this.f14578a = hwlVarMo21152M;
                if (hwlVarMo21152M == null) {
                    return -4;
                }
                hwlVarMo21152M.mo107913f2(mMLiveMediaConfig.videoBitRate);
                this.f14578a.mo109315h0(this.f14581d.channelKey);
                this.f14578a.mo107900S0(parameters);
                this.f14578a.mo107889B1(this.f14591n);
                this.f14578a.mo109278G(this.f14592o);
                this.f14578a.mo109270C0(this.f14589l);
                this.f14578a.mo109333u1(this.f14590m);
                boolean z = this.f14589l;
                hwl hwlVar = this.f14578a;
                if (z) {
                    hwlVar.mo107928t1(1);
                } else {
                    hwlVar.mo107928t1(2);
                }
                this.f14578a.mo109271D(parameters.f164224e1);
                this.f14578a.mo107901T0(mMLiveMediaConfig.businessType);
                this.f14578a.mo109303X1(this.f14583f);
                this.f14578a.mo109326m0(this.f14584g);
                this.f14578a.mo109330r1(this.f14586i);
                this.f14578a.mo109293P0(this.f14585h);
                this.f14578a.mo109288M0(mMLiveRoomParams.audioProfile.value(), mMLiveRoomParams.audioScenario.value());
                this.f14578a.mo109321j2(this.f14587j);
                this.f14578a.mo109296R(this.f14588k);
                if (mMLiveTranscoding != null && (i = mMLiveTranscoding.videoBitrate) > 0 && (i2 = mMLiveTranscoding.videoFps) > 0) {
                    if (i > 0) {
                        this.f14578a.mo109282K(i, i2, parameters.f175490k, parameters.f175492l);
                    }
                    String str3 = mMLiveTranscoding.mid;
                    if (str3 == null || str3.length() <= 0) {
                        mMLiveTranscoding.mid = this.f14581d.userId;
                    }
                    m20220H(mMLiveTranscoding);
                }
                if (linkType == MomoPipelineModuleRegister.LinkType.WEILALINK) {
                    this.f14578a.mo109307Z0(true);
                }
                this.f14578a.mo109318i0(this.f14573E);
                this.f14578a.mo109299U(this.f14574F);
                this.f14578a.mo109305Y1(this.f14575G);
                this.f14578a.mo109274E(this.f14576H);
                this.f14578a.mo109279H0(this.f14602y);
                this.f14578a.mo109302X(true);
                this.f14578a.mo107918m(this.f14599v);
                this.f14578a.mo109268B(this.f14597t);
                this.f14578a.mo109328q1(this.f14601x);
                this.f14578a.mo109327o1(mMLiveRoomParams.enableConferenceReconnect);
                long j = this.f14600w;
                if (j >= 0) {
                    this.f14578a.mo107898O(j);
                }
                m20212Q(this.f14571C);
                boolean z2 = this.f14572D;
                if (z2) {
                    this.f14578a.mo109324l1(z2);
                }
                return this.f14578a.mo107927t0();
            }
            MRtcEventHandler mRtcEventHandler = this.f14583f;
            if (mRtcEventHandler != null) {
                mRtcEventHandler.onError(808);
            }
            b7y.m102882c().m102883a("enterRoom", "userid:" + str + ",channel:" + mMLiveRoomParams.channel + ",appid:" + mMLiveRoomParams.confId, LogLevel.FATAL);
            return -3;
        } catch (NumberFormatException e) {
            b7y.m102882c().m102887f("enterRoom", UserId.TYPE, mMLiveRoomParams.userId);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public int m20254n() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109322k();
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public mob0 m20255o() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo107914g();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public long m20256p() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo21107c();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public long m20257q() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo21126r();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public void m20258r() {
        if (this.f14578a != null) {
            usl uslVar = this.f14593p;
            if (uslVar != null) {
                this.f14582e.mo21141B(uslVar);
                this.f14593p = null;
            }
            this.f14578a.mo107911f();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m20259s() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo21116j();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m20260t(int i, String str, int i2, double d, double d2, boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar == null) {
            return true;
        }
        hwlVar.mo109284K1(i, str, i2, d, d2, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m20261u() {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo21124q();
        }
    }

    /* JADX INFO: renamed from: v */
    public int m20262v(int i) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m20263w(byte[] bArr) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo109286L0(bArr);
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public void m20264x(boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107932x(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m20265y(boolean z) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            hwlVar.mo107912f1(z);
        }
    }

    /* JADX INFO: renamed from: z */
    public int m20266z(int i) {
        hwl hwlVar = this.f14578a;
        if (hwlVar != null) {
            return hwlVar.mo109314h(i);
        }
        return -1;
    }
}
