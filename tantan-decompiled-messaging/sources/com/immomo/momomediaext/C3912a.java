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
import com.p046p1.mobile.putong.core.data.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.b2l0;
import p149l.cbl0;
import p149l.eix;
import p149l.eyx;
import p149l.hgd0;
import p149l.igb0;
import p149l.ikw;
import p149l.iql;
import p149l.qmr;
import p149l.ttl;
import p149l.xgf0;
import p149l.ya1;
import p149l.ymw;
import p149l.z1l0;

/* JADX INFO: renamed from: com.immomo.momomediaext.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3912a {

    /* JADX INFO: renamed from: A */
    private ikw f13875A;

    /* JADX INFO: renamed from: a */
    private ttl f13884a;

    /* JADX INFO: renamed from: b */
    private MMLiveRoomParams.MMLivePushType f13885b;

    /* JADX INFO: renamed from: c */
    private MMLiveMediaConfig f13886c;

    /* JADX INFO: renamed from: d */
    private MMLiveRoomParams f13887d;

    /* JADX INFO: renamed from: e */
    private MomoPipelineModuleRegister f13888e;

    /* JADX INFO: renamed from: f */
    private MRtcEventHandler f13889f;

    /* JADX INFO: renamed from: g */
    private z1l0 f13890g;

    /* JADX INFO: renamed from: h */
    private b2l0 f13891h;

    /* JADX INFO: renamed from: i */
    private cbl0 f13892i;

    /* JADX INFO: renamed from: j */
    private hgd0 f13893j;

    /* JADX INFO: renamed from: k */
    private ya1 f13894k;

    /* JADX INFO: renamed from: p */
    private iql f13899p;

    /* JADX INFO: renamed from: q */
    private MMLiveUserConfig f13900q;

    /* JADX INFO: renamed from: l */
    private boolean f13895l = true;

    /* JADX INFO: renamed from: m */
    private boolean f13896m = true;

    /* JADX INFO: renamed from: n */
    private boolean f13897n = false;

    /* JADX INFO: renamed from: o */
    private boolean f13898o = false;

    /* JADX INFO: renamed from: r */
    private int f13901r = 0;

    /* JADX INFO: renamed from: s */
    private int f13902s = 0;

    /* JADX INFO: renamed from: t */
    private String f13903t = "";

    /* JADX INFO: renamed from: u */
    private MMLiveRoomParams.MMLiveRoomMode f13904u = MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODELIVE;

    /* JADX INFO: renamed from: v */
    private boolean f13905v = false;

    /* JADX INFO: renamed from: w */
    private long f13906w = -1;

    /* JADX INFO: renamed from: x */
    private boolean f13907x = false;

    /* JADX INFO: renamed from: y */
    private ymw f13908y = null;

    /* JADX INFO: renamed from: z */
    private int f13909z = -2;

    /* JADX INFO: renamed from: B */
    private int f13876B = -1;

    /* JADX INFO: renamed from: C */
    private List<String> f13877C = new ArrayList();

    /* JADX INFO: renamed from: D */
    private boolean f13878D = false;

    /* JADX INFO: renamed from: E */
    private MRtcChannelHandler f13879E = null;

    /* JADX INFO: renamed from: F */
    private MRtcTokenWillExpireHander f13880F = null;

    /* JADX INFO: renamed from: G */
    private MRtcReceiveSeiHandler f13881G = null;

    /* JADX INFO: renamed from: H */
    private MRtcPusherHandler f13882H = null;

    /* JADX INFO: renamed from: I */
    private MRtcAudioHandler f13883I = null;

    /* JADX INFO: renamed from: com.immomo.momomediaext.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13910a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f13911b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f13912c;

        static {
            int[] iArr = new int[MMLiveRoomParams.MMLivePushType.values().length];
            f13912c = iArr;
            try {
                iArr[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13912c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13912c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13912c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfWL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13912c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13912c[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[MMLiveRoomParams.MMLiveClientRole.values().length];
            f13911b = iArr2;
            try {
                iArr2[MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13911b[MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[MMLiveRoomParams.MMLiveRoomMode.values().length];
            f13910a = iArr3;
            try {
                iArr3[MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODELIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13910a[MMLiveRoomParams.MMLiveRoomMode.MMLIVEROOMMODECOMMUNICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public C3912a(MomoPipelineModuleRegister momoPipelineModuleRegister, MMLiveUserConfig mMLiveUserConfig, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        this.f13885b = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        this.f13900q = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        this.f13888e = momoPipelineModuleRegister;
        this.f13885b = mMLivePushType;
        if (mMLiveUserConfig != null) {
            this.f13900q = mMLiveUserConfig;
        } else {
            this.f13900q = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m19232Q(List<String> list) {
        if (this.f13884a != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f13884a.mo162752v(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public int m19233A(int i) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160334e0(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public int m19234B(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        if (this.f13884a != null) {
            int i = a.f13911b[mMLiveClientRole.ordinal()];
            int i2 = 2;
            if (i != 1) {
                i2 = i != 2 ? -1 : 1;
            }
            if (i2 > 0) {
                return this.f13884a.mo160297E0(i2);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public int m19235C(int i, ikw ikwVar) {
        this.f13909z = i;
        this.f13875A = ikwVar;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160323W0(i, ikwVar);
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public void m19236D(boolean z) {
        this.f13896m = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160354u1(z);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m19237E(boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.setEnableSpeakerphone(z);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m19238F(boolean z) {
        this.f13895l = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160292C0(z);
            boolean z2 = this.f13895l;
            ttl ttlVar2 = this.f13884a;
            if (z2) {
                ttlVar2.mo139370t1(1);
            } else {
                ttlVar2.mo139370t1(2);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m19239G(xgf0 xgf0Var) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13888e;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20164i(5000, 6, xgf0Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m19240H(MMLiveTranscoding mMLiveTranscoding) {
        int i;
        if (this.f13884a == null || mMLiveTranscoding == null) {
            return;
        }
        qmr parameters = this.f13888e.getParameters();
        if (parameters != null && (i = mMLiveTranscoding.canvasHeight) > 0 && i > 0) {
            parameters.f177150l = i;
            parameters.f177148k = mMLiveTranscoding.canvasWidth;
        }
        this.f13884a.mo139337J(mMLiveTranscoding.toString());
    }

    /* JADX INFO: renamed from: I */
    public void m19241I(boolean z) {
        this.f13898o = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160300G(z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m19242J(String str) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139336I1(str);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19243K(boolean z) {
        this.f13897n = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139331B1(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m19244L(float f) {
        eyx.m118802c().m118808g("setMasterAudioVolume", Float.valueOf(f));
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160335g0(f);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m19245M(int i) {
        eyx.m118802c().m118808g("setMusicVolumeRTC:" + i);
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160305K0(i);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m19246N(long j) {
        this.f13906w = j;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139340O(j);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m19247O(ya1 ya1Var) {
        this.f13894k = ya1Var;
    }

    /* JADX INFO: renamed from: P */
    public void m19248P(String str) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo162752v(str);
        } else {
            this.f13877C.add(str);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m19249R(int i, boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139341Q0(i, z);
        }
    }

    /* JADX INFO: renamed from: S */
    public int m19250S(int i) {
        this.f13876B = i;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160341i2(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: T */
    public void m19251T(String str) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139351e(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m19252U(boolean z) {
        this.f13907x = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160349q1(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m19253V(hgd0 hgd0Var) {
        this.f13893j = hgd0Var;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160343j2(hgd0Var);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m19254W(MRtcEventHandler mRtcEventHandler, z1l0 z1l0Var, cbl0 cbl0Var) {
        this.f13889f = mRtcEventHandler;
        this.f13890g = z1l0Var;
        this.f13892i = cbl0Var;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160325X1(mRtcEventHandler);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m19255X(b2l0 b2l0Var) {
        this.f13891h = b2l0Var;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160315P0(b2l0Var);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m19256Y(String str) {
        this.f13903t = str;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160290B(str);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m19257Z(String str, boolean z, int i) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160350r0(str, z, false, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m19258a(String str, String str2, String str3) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160339h2(str, str2, str3);
        }
        return -2;
    }

    /* JADX INFO: renamed from: a0 */
    public void m19259a0() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.stopSurroundMusic();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19260b(MRtcAudioHandler mRtcAudioHandler) {
        this.f13883I = mRtcAudioHandler;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139347Z1(mRtcAudioHandler, 100, 100);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public int m19261b0(String str) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160355x1(str);
        }
        return -2;
    }

    /* JADX INFO: renamed from: c */
    public void m19262c(MRtcChannelHandler mRtcChannelHandler) {
        this.f13879E = mRtcChannelHandler;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160340i0(mRtcChannelHandler);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m19263c0(String str) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160346l2(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19264d(ymw ymwVar) {
        this.f13908y = ymwVar;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160301H0(ymwVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m19265e(MRtcPusherHandler mRtcPusherHandler) {
        this.f13882H = mRtcPusherHandler;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160296E(mRtcPusherHandler);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19266f(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f13880F = mRtcTokenWillExpireHander;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160321U(mRtcTokenWillExpireHander);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m19267g(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f13881G = mRtcReceiveSeiHandler;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160327Y1(mRtcReceiveSeiHandler);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m19268h(int i, int i2, int i3) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139350c2(this.f13883I, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m19269i(boolean z, String str) {
        if (this.f13884a == null || !z || TextUtils.isEmpty(str)) {
            return;
        }
        this.f13884a.mo160322W(z, str);
    }

    /* JADX INFO: renamed from: j */
    public void m19270j(boolean z) {
        this.f13878D = z;
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160345l1(z);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m19271k(boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139371u(z);
            this.f13884a.mo160320T1(z);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m19272l(boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139373v0(z);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m19273m(@NonNull MMLiveMediaConfig mMLiveMediaConfig, @NonNull MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f13886c = mMLiveMediaConfig;
        this.f13887d = mMLiveRoomParams;
        qmr parameters = this.f13888e.getParameters();
        int i5 = mMLiveMediaConfig.encodeWidth;
        parameters.f177152m = i5;
        parameters.f177164s = i5;
        parameters.f177148k = i5;
        int i6 = mMLiveMediaConfig.encodeHeight;
        parameters.f177154n = i6;
        parameters.f177166t = i6;
        parameters.f177150l = i6;
        int i7 = mMLiveMediaConfig.videoFPS;
        parameters.f177107F = i7;
        parameters.f182030S0 = i7;
        parameters.f182043v0 = mMLiveMediaConfig.url;
        parameters.f177109H = mMLiveMediaConfig.videoBitRate;
        parameters.f177119R = mMLiveMediaConfig.audioChannels;
        parameters.f177117P = mMLiveMediaConfig.audioSampleRate;
        parameters.f177120S = mMLiveMediaConfig.audioBitrate;
        parameters.f182014C0 = mMLiveRoomParams.userSig;
        parameters.f182018G0 = true;
        parameters.f182039b1 = mMLiveRoomParams.blueToothType;
        parameters.f182038a1 = mMLiveRoomParams.degradationPrefer;
        try {
            String str = mMLiveRoomParams.userId;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(mMLiveRoomParams.channel) && !TextUtils.isEmpty(mMLiveRoomParams.confId)) {
                int i8 = (int) Long.parseLong(mMLiveRoomParams.userId);
                parameters.f155327i1 = i8;
                parameters.f182013B0 = i8;
                if (mMLiveTranscoding != null && (i3 = mMLiveTranscoding.canvasWidth) > 0 && (i4 = mMLiveTranscoding.canvasHeight) > 0) {
                    parameters.f177148k = i3;
                    parameters.f177150l = i4;
                }
                parameters.f155325g1 = mMLiveRoomParams.channel;
                parameters.f155323e1 = mMLiveRoomParams.role == MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience ? 2 : 1;
                parameters.f155326h1 = mMLiveRoomParams.isHost;
                parameters.f155330l1 = mMLiveMediaConfig.cdnType;
                parameters.f155332n1 = mMLiveRoomParams.sourceLanguage;
                parameters.f182040c1 = mMLiveRoomParams.agoraRtcKeepAlive;
                parameters.f182041d1 = mMLiveRoomParams.volcRtcKeepAlive;
                parameters.f155333o1 = mMLiveRoomParams.enableRtcPlaybackCallback;
                this.f13888e.mo20180y(parameters);
                MomoPipelineModuleRegister.LinkType linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
                switch (a.f13912c[this.f13885b.ordinal()]) {
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
                this.f13899p = this.f13888e.mo20152L();
                eix eixVar = new eix();
                eixVar.m116739o(this.f13900q.getAppid());
                eixVar.m116745u(this.f13900q.getMomoid());
                eixVar.m116743s(this.f13900q.getRoomid());
                eixVar.m116742r(mMLiveMediaConfig.cdnType);
                eixVar.m116744t(this.f13900q.getSecret());
                eixVar.m116740p(mMLiveMediaConfig.businessType);
                ttl ttlVarMo20153M = this.f13888e.mo20153M(linkType, str2, eixVar);
                this.f13884a = ttlVarMo20153M;
                if (ttlVarMo20153M == null) {
                    return -4;
                }
                ttlVarMo20153M.mo139355f2(mMLiveMediaConfig.videoBitRate);
                this.f13884a.mo160337h0(this.f13887d.channelKey);
                this.f13884a.mo139342S0(parameters);
                this.f13884a.mo139331B1(this.f13897n);
                this.f13884a.mo160300G(this.f13898o);
                this.f13884a.mo160292C0(this.f13895l);
                this.f13884a.mo160354u1(this.f13896m);
                boolean z = this.f13895l;
                ttl ttlVar = this.f13884a;
                if (z) {
                    ttlVar.mo139370t1(1);
                } else {
                    ttlVar.mo139370t1(2);
                }
                this.f13884a.mo160293D(parameters.f155323e1);
                this.f13884a.mo139343T0(mMLiveMediaConfig.businessType);
                this.f13884a.mo160325X1(this.f13889f);
                this.f13884a.mo160347m0(this.f13890g);
                this.f13884a.mo160351r1(this.f13892i);
                this.f13884a.mo160315P0(this.f13891h);
                this.f13884a.mo160310M0(mMLiveRoomParams.audioProfile.value(), mMLiveRoomParams.audioScenario.value());
                this.f13884a.mo160343j2(this.f13893j);
                this.f13884a.mo160318R(this.f13894k);
                if (mMLiveTranscoding != null && (i = mMLiveTranscoding.videoBitrate) > 0 && (i2 = mMLiveTranscoding.videoFps) > 0) {
                    if (i > 0) {
                        this.f13884a.mo160304K(i, i2, parameters.f177148k, parameters.f177150l);
                    }
                    String str3 = mMLiveTranscoding.mid;
                    if (str3 == null || str3.length() <= 0) {
                        mMLiveTranscoding.mid = this.f13887d.userId;
                    }
                    m19240H(mMLiveTranscoding);
                }
                if (linkType == MomoPipelineModuleRegister.LinkType.WEILALINK) {
                    this.f13884a.mo160329Z0(true);
                }
                this.f13884a.mo160340i0(this.f13879E);
                this.f13884a.mo160321U(this.f13880F);
                this.f13884a.mo160327Y1(this.f13881G);
                this.f13884a.mo160296E(this.f13882H);
                this.f13884a.mo160301H0(this.f13908y);
                this.f13884a.mo162750X(true);
                this.f13884a.mo139360m(this.f13905v);
                this.f13884a.mo160290B(this.f13903t);
                this.f13884a.mo160349q1(this.f13907x);
                this.f13884a.mo160348o1(mMLiveRoomParams.enableConferenceReconnect);
                long j = this.f13906w;
                if (j >= 0) {
                    this.f13884a.mo139340O(j);
                }
                m19232Q(this.f13877C);
                boolean z2 = this.f13878D;
                if (z2) {
                    this.f13884a.mo160345l1(z2);
                }
                return this.f13884a.mo139369t0();
            }
            MRtcEventHandler mRtcEventHandler = this.f13889f;
            if (mRtcEventHandler != null) {
                mRtcEventHandler.onError(808);
            }
            eyx.m118802c().m118803a("enterRoom", "userid:" + str + ",channel:" + mMLiveRoomParams.channel + ",appid:" + mMLiveRoomParams.confId, LogLevel.FATAL);
            return -3;
        } catch (NumberFormatException e) {
            eyx.m118802c().m118807f("enterRoom", UserId.TYPE, mMLiveRoomParams.userId);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public int m19274n() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160344k();
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public igb0 m19275o() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo139356g();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public long m19276p() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo20108c();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public long m19277q() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo20127r();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public void m19278r() {
        if (this.f13884a != null) {
            iql iqlVar = this.f13899p;
            if (iqlVar != null) {
                this.f13888e.mo20142B(iqlVar);
                this.f13899p = null;
            }
            this.f13884a.mo139353f();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m19279s() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo20117j();
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m19280t(int i, String str, int i2, double d, double d2, boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar == null) {
            return true;
        }
        ttlVar.mo160306K1(i, str, i2, d, d2, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m19281u() {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo20125q();
        }
    }

    /* JADX INFO: renamed from: v */
    public int m19282v(int i) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: w */
    public int m19283w(byte[] bArr) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo160308L0(bArr);
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public void m19284x(boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139374x(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m19285y(boolean z) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            ttlVar.mo139354f1(z);
        }
    }

    /* JADX INFO: renamed from: z */
    public int m19286z(int i) {
        ttl ttlVar = this.f13884a;
        if (ttlVar != null) {
            return ttlVar.mo160336h(i);
        }
        return -1;
    }
}
