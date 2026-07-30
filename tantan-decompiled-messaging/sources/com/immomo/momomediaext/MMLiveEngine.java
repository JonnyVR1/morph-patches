package com.immomo.momomediaext;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.immomo.momomediaext.utils.MMLiveAcrossRoomState;
import com.immomo.momomediaext.utils.MMLiveAudioVolumeConfig;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLivePlayMusicConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.immomo.momomediaext.utils.MMLiveVideoEncoderConfig;
import com.immomo.network.bean.UrlType;
import com.momo.mcamera.mask.MaskModel;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.piplineext.bean.MMLiveSubtitleErrorCode;
import com.momo.piplineext.bean.MMLiveSubtitleState;
import com.momo.pub.MomoPipelineModuleRegister;
import com.momo.xeengine.XEnginePreferences;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p069ss.bytertc.engine.type.WarningCode;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc2.Constants;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import p149l.akw;
import p149l.b2l0;
import p149l.cbl0;
import p149l.dix;
import p149l.eix;
import p149l.ejx;
import p149l.eyx;
import p149l.f860;
import p149l.fjx;
import p149l.fkw;
import p149l.g16;
import p149l.hb20;
import p149l.hgd0;
import p149l.hjx;
import p149l.hkw;
import p149l.igb0;
import p149l.ii70;
import p149l.ikw;
import p149l.imx;
import p149l.j1m;
import p149l.ja4;
import p149l.jjw;
import p149l.jkw;
import p149l.ktf;
import p149l.lrl;
import p149l.lw00;
import p149l.m2m;
import p149l.mpd0;
import p149l.mvj0;
import p149l.nrl;
import p149l.o500;
import p149l.pek0;
import p149l.pjw;
import p149l.qmr;
import p149l.qv00;
import p149l.rv5;
import p149l.su10;
import p149l.tdj0;
import p149l.u3m;
import p149l.udp0;
import p149l.vmw;
import p149l.vv00;
import p149l.xgf0;
import p149l.xsl;
import p149l.ya1;
import p149l.yc0;
import p149l.ymw;
import p149l.z1l0;
import p149l.za1;
import p149l.zml;
import p149l.zv00;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveEngine {

    /* JADX INFO: renamed from: v0 */
    private static final ArrayList<String> f13659v0 = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    private su10 f13660A;

    /* JADX INFO: renamed from: L */
    private MMLiveTranscoding f13671L;

    /* JADX INFO: renamed from: Q */
    private akw f13676Q;

    /* JADX INFO: renamed from: S */
    private ikw f13678S;

    /* JADX INFO: renamed from: e */
    private String f13694e;

    /* JADX INFO: renamed from: i */
    private WeakReference<Context> f13702i;

    /* JADX INFO: renamed from: j */
    private MMLiveUserConfig f13704j;

    /* JADX INFO: renamed from: k */
    private MMLiveMediaConfig f13706k;

    /* JADX INFO: renamed from: l */
    private qmr f13708l;

    /* JADX INFO: renamed from: m */
    private MomoPipelineModuleRegister f13710m;

    /* JADX INFO: renamed from: n */
    private MMLiveSource f13712n;

    /* JADX INFO: renamed from: o */
    private hkw f13714o;

    /* JADX INFO: renamed from: p */
    private C3912a f13716p;

    /* JADX INFO: renamed from: q */
    private Handler f13718q;

    /* JADX INFO: renamed from: r */
    private MMLiveRoomParams f13720r;

    /* JADX INFO: renamed from: s */
    private fkw f13722s;

    /* JADX INFO: renamed from: z */
    private Timer f13732z;

    /* JADX INFO: renamed from: a */
    private boolean f13686a = false;

    /* JADX INFO: renamed from: b */
    private float f13688b = 1.0f;

    /* JADX INFO: renamed from: c */
    private float f13690c = 1.0f;

    /* JADX INFO: renamed from: d */
    private float f13692d = 1.0f;

    /* JADX INFO: renamed from: f */
    private long f13696f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f13698g = false;

    /* JADX INFO: renamed from: h */
    private boolean f13700h = false;

    /* JADX INFO: renamed from: t */
    private boolean f13724t = false;

    /* JADX INFO: renamed from: u */
    private boolean f13726u = false;

    /* JADX INFO: renamed from: v */
    private boolean f13728v = true;

    /* JADX INFO: renamed from: w */
    private boolean f13729w = true;

    /* JADX INFO: renamed from: x */
    private boolean f13730x = false;

    /* JADX INFO: renamed from: y */
    private boolean f13731y = false;

    /* JADX INFO: renamed from: B */
    private MMLiveRoomParams.MMLiveAudioProfile f13661B = MMLiveRoomParams.MMLiveAudioProfile.MMLiveAudioProfileNone;

    /* JADX INFO: renamed from: C */
    private MMLiveRoomParams.MMLiveAudioScenario f13662C = MMLiveRoomParams.MMLiveAudioScenario.MMLiveAudioScenarioNone;

    /* JADX INFO: renamed from: D */
    private String f13663D = "";

    /* JADX INFO: renamed from: E */
    private MomoMediaConstants$BEAUTY_TYPE f13664E = MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_DOKI;

    /* JADX INFO: renamed from: F */
    private String f13665F = "";

    /* JADX INFO: renamed from: G */
    private boolean f13666G = false;

    /* JADX INFO: renamed from: H */
    private boolean f13667H = false;

    /* JADX INFO: renamed from: I */
    private boolean f13668I = false;

    /* JADX INFO: renamed from: J */
    private MMLiveRoomParams.MMLivePushType f13669J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;

    /* JADX INFO: renamed from: K */
    private int f13670K = 0;

    /* JADX INFO: renamed from: M */
    private MMLiveVideoEncoderConfig f13672M = new MMLiveVideoEncoderConfig();

    /* JADX INFO: renamed from: N */
    private Object f13673N = new Object();

    /* JADX INFO: renamed from: O */
    private xsl f13674O = null;

    /* JADX INFO: renamed from: P */
    private boolean f13675P = false;

    /* JADX INFO: renamed from: R */
    private MomoMediaConstants$MMLiveSimulcastStreamMode f13677R = MomoMediaConstants$MMLiveSimulcastStreamMode.NO_SET;

    /* JADX INFO: renamed from: T */
    private MomoMediaConstants$MMLiveSimulcastStreamType f13679T = MomoMediaConstants$MMLiveSimulcastStreamType.DEFAULT;

    /* JADX INFO: renamed from: U */
    private List<String> f13680U = new ArrayList();

    /* JADX INFO: renamed from: V */
    private boolean f13681V = false;

    /* JADX INFO: renamed from: W */
    private MRtcChannelHandler f13682W = new C3892x();

    /* JADX INFO: renamed from: X */
    private MRtcTokenWillExpireHander f13683X = new C3893y();

    /* JADX INFO: renamed from: Y */
    private MRtcReceiveSeiHandler f13684Y = new C3894z();

    /* JADX INFO: renamed from: Z */
    private ymw f13685Z = new C3866a0();

    /* JADX INFO: renamed from: a0 */
    private MRtcAudioHandler f13687a0 = new C3868b0();

    /* JADX INFO: renamed from: b0 */
    private MRtcPusherHandler f13689b0 = new C3870c0();

    /* JADX INFO: renamed from: c0 */
    private OnPlayerStateCallback f13691c0 = new C3871d();

    /* JADX INFO: renamed from: d0 */
    private za1 f13693d0 = new C3873e();

    /* JADX INFO: renamed from: e0 */
    private za1 f13695e0 = new C3874f();

    /* JADX INFO: renamed from: f0 */
    private za1 f13697f0 = new C3875g();

    /* JADX INFO: renamed from: g0 */
    private MomoPipelineModuleRegister.InterfaceC4110a f13699g0 = new C3876h();

    /* JADX INFO: renamed from: h0 */
    private MomoPipelineModuleRegister.InterfaceC4112c f13701h0 = new C3877i();

    /* JADX INFO: renamed from: i0 */
    private MomoPipelineModuleRegister.InterfaceC4111b f13703i0 = new C3878j();

    /* JADX INFO: renamed from: j0 */
    private zv00.InterfaceC21782e f13705j0 = new C3881m();

    /* JADX INFO: renamed from: k0 */
    private hgd0 f13707k0 = new C3882n();

    /* JADX INFO: renamed from: l0 */
    private ktf f13709l0 = new C3883o();

    /* JADX INFO: renamed from: m0 */
    private MRtcEventHandler f13711m0 = new C3884p();

    /* JADX INFO: renamed from: n0 */
    private cbl0 f13713n0 = null;

    /* JADX INFO: renamed from: o0 */
    private z1l0 f13715o0 = null;

    /* JADX INFO: renamed from: p0 */
    private b2l0 f13717p0 = null;

    /* JADX INFO: renamed from: q0 */
    private ya1 f13719q0 = new C3885q();

    /* JADX INFO: renamed from: r0 */
    private ja4.InterfaceC17734l f13721r0 = new C3886r();

    /* JADX INFO: renamed from: s0 */
    private m2m f13723s0 = new C3887s();

    /* JADX INFO: renamed from: t0 */
    xgf0 f13725t0 = null;

    /* JADX INFO: renamed from: u0 */
    private u3m.InterfaceC20352a f13727u0 = new C3889u();

    public enum MMLiveEngineType {
        LIVE_ENGINE_TYPE_PLAY,
        LIVE_ENGINE_TYPE_PUSH,
        LIVE_ENGINE_TYPE_NONE
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$a */
    public class C3865a implements z1l0 {
        public C3865a() {
        }

        @Override // p149l.z1l0
        /* JADX INFO: renamed from: a */
        public void mo19137a(long j, SurfaceView surfaceView, int i, int i2) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.mo46993S(String.valueOf(j), surfaceView, MMLiveEngine.this.f13720r.linkType);
            }
        }

        @Override // p149l.z1l0
        /* JADX INFO: renamed from: b */
        public void mo19138b(long j, int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5043;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Video Channel Remove");
                bundle.putInt(Oauth2AccessToken.KEY_UID, (int) j);
                bundle.putInt(Reason.TYPE, i);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$a0 */
    public class C3866a0 implements ymw {
        public C3866a0() {
        }

        @Override // p149l.ymw
        /* JADX INFO: renamed from: a */
        public void mo19139a(vmw vmwVar) {
            MMLiveEngine.this.f13722s.m121919b0(vmwVar);
        }

        @Override // p149l.ymw
        /* JADX INFO: renamed from: b */
        public void mo19140b(jjw jjwVar) {
            MMLiveEngine.this.f13722s.m121895B(jjwVar);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b */
    public class C3867b implements b2l0 {
        public C3867b() {
        }

        @Override // p149l.b2l0
        /* JADX INFO: renamed from: a */
        public void mo19141a(long j, TextureView textureView, int i, int i2) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.m19047M("onVideoChannelAdded TextureViewOut");
                MMLiveEngine.this.f13722s.m121912T(String.valueOf(j), textureView, MMLiveEngine.this.f13720r.linkType);
            }
        }

        @Override // p149l.b2l0
        /* JADX INFO: renamed from: b */
        public void mo19142b(long j, int i) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.m19047M("onVideoChannelRemove TextureViewOut");
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b0 */
    public class C3868b0 implements MRtcAudioHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AudioVolumeWeight[] f13737a;

            public a(AudioVolumeWeight[] audioVolumeWeightArr) {
                this.f13737a = audioVolumeWeightArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s == null || this.f13737a == null) {
                    return;
                }
                MMLiveEngine.this.f13722s.mo46998e0(this.f13737a, MMLiveEngine.this.f13720r.linkType);
            }
        }

        public C3868b0() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcAudioHandler
        public void onAudioVolumeIndication(AudioVolumeWeight[] audioVolumeWeightArr, int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(audioVolumeWeightArr));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0 */
    public class C3870c0 implements MRtcPusherHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13741a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f13742b;

            public a(int i, int i2) {
                this.f13741a = i;
                this.f13742b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.mo121907N(this.f13741a, this.f13742b);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f13744a;

            public b(String str) {
                this.f13744a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.mo121906M(this.f13744a);
                }
            }
        }

        public C3870c0() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcPusherHandler
        public void onPushChangeStreamUrl(String str) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new b(str));
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcPusherHandler
        public void onPushLevelChange(int i, int i2) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(i, i2));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$d */
    public class C3871d implements OnPlayerStateCallback {
        public C3871d() {
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121924f(i);
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121932j();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            if (MMLiveEngine.this.f13722s == null) {
                return false;
            }
            MMLiveEngine.this.f13722s.m121940w(i, i2);
            return false;
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121905L();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121927g0();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121935k0(i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$d0 */
    public class HandlerC3872d0 extends Handler {
        public HandlerC3872d0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (MMLiveEngine.this.f13722s == null) {
                return;
            }
            Bundle data = message.getData();
            long j = data.getInt(Oauth2AccessToken.KEY_UID, 0);
            int i = data.getInt("what", 0);
            int i2 = data.getInt("extra", 0);
            data.getInt("width", 0);
            data.getInt("height", 0);
            String string = data.getString("channel");
            String strValueOf = String.valueOf(j);
            MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype")];
            int i3 = message.what;
            if (i3 == -5801 || i3 == -5800) {
                int i4 = data.getInt("pushtype", 0);
                int iM19046L0 = MMLiveEngine.this.m19046L0(i, i2, i4);
                MMLiveEngine.m19047M("PUBLISH_ERROR", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
                if (iM19046L0 == 809 || iM19046L0 == 807 || iM19046L0 == 808 || iM19046L0 == 810 || iM19046L0 == 811 || iM19046L0 == 809) {
                    MMLiveEngine.m19047M("rtc engine error should leaveRoom");
                    if (MMLiveEngine.this.f13716p != null) {
                        MMLiveEngine.this.f13716p.m19278r();
                    }
                } else if (iM19046L0 == 12 || iM19046L0 == 11 || iM19046L0 == 13 || iM19046L0 == 14) {
                    MMLiveEngine.m19047M("rtmp push error should stopPush");
                    if (MMLiveEngine.this.f13714o != null) {
                        MMLiveEngine.this.f13714o.m131599n();
                        mvj0 mvj0VarM131591e = MMLiveEngine.this.f13714o.m131591e();
                        if (mvj0VarM131591e != null && mvj0VarM131591e.m156528b() == UrlType.IPV6 && !MMLiveEngine.this.f13681V) {
                            hb20.m130275f().m130293w(mvj0VarM131591e, false);
                            MMLiveEngine mMLiveEngine = MMLiveEngine.this;
                            mMLiveEngine.m19074D0(mMLiveEngine.f13706k);
                            return;
                        }
                    }
                } else if (iM19046L0 == 806) {
                    MMLiveEngine.m19047M("rtc engine appid invalid");
                    MMLiveEngine.this.f13716p = null;
                }
                MMLiveEngine.m19047M("onEngineError", "type :" + MMLiveRoomParams.MMLivePushType.values()[i4] + "what:" + iM19046L0 + ",extra:" + i2);
                MMLiveEngine.this.f13722s.mo46999o(MMLiveRoomParams.MMLivePushType.values()[i4], new MMLiveErrorInfo(iM19046L0, i2, f860.m119872a(MMLiveRoomParams.MMLivePushType.values()[i4], i, i2)));
                return;
            }
            if (i3 == -5005) {
                MMLiveEngine.m19047M("PUBLISH_LINK_JOINROOM_ERROR");
                MMLiveErrorInfo mMLiveErrorInfo = new MMLiveErrorInfo(Constants.RHYTHM_PLAYER_STATE_IDLE, 0, f860.m119872a(MMLiveEngine.this.f13720r.linkType, Constants.RHYTHM_PLAYER_STATE_IDLE, 0));
                mMLiveErrorInfo.uid = j;
                MMLiveEngine.this.f13722s.mo46999o(MMLiveEngine.this.f13720r.linkType, mMLiveErrorInfo);
                return;
            }
            if (i3 == -4211) {
                MMLiveEngine.m19047M("PUBLISH_EVT_CV_DOWNLOAD_FAILED");
                return;
            }
            if (i3 == 4212) {
                MMLiveRoomParams.MMLivePushType mMLivePushType2 = MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype")];
                MMLiveEngine.m19047M("PUBLISH_EVT_PUB_PREPARED", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType2);
                MMLiveEngine.this.f13722s.mo47002r(mMLivePushType2, 0);
                return;
            }
            if (i3 == 5016) {
                MMLiveEngine.this.f13722s.mo121900G(MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5021) {
                MMLiveEngine.m19047M("PUBLISH_LINK_ERROR", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f13722s.mo46999o(MMLiveEngine.this.f13720r.linkType, new MMLiveErrorInfo(i, i2, f860.m119872a(MMLiveEngine.this.f13720r.linkType, i, i2)));
                return;
            }
            if (i3 == 5042) {
                MMLiveEngine.this.f13722s.mo46997d(data.getInt("routing"));
                return;
            }
            if (i3 == 6005) {
                MMLiveEngine.m19047M("AID_INFO", "Aid", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f13722s.m121918b(i, i2);
                return;
            }
            if (i3 == -4202 || i3 == -4201) {
                MMLiveEngine.m19047M("PUBLISH_EVT_PUB_SYS_ERROR", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f13722s.mo46999o(MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE, new MMLiveErrorInfo(i, i2, f860.m119872a(MMLiveEngine.this.f13720r.linkType, i, i2)));
                return;
            }
            if (i3 == 4207) {
                MMLiveEngine.this.f13722s.mo47000p(mMLivePushType);
                return;
            }
            if (i3 == 4208) {
                MMLiveEngine.this.f13722s.mo47001q(mMLivePushType);
                return;
            }
            if (i3 == 5000) {
                MMLiveEngine.this.f13722s.mo47006z(string, j, MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5001) {
                MMLiveEngine.this.f13722s.mo46995Z(string, strValueOf, MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5010) {
                MMLiveEngine.this.f13722s.mo46992A(string, data.getInt(Reason.TYPE), MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5011) {
                MMLiveEngine.this.f13722s.mo46996a0(strValueOf, data.getInt(Reason.TYPE), MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5031) {
                MMLiveEngine.this.f13722s.mo121916Y(strValueOf, data.getBoolean("muted"), MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5032) {
                MMLiveEngine.this.f13722s.mo121921c0(strValueOf, data.getBoolean("muted"), MMLiveEngine.this.f13720r.linkType);
                return;
            }
            if (i3 == 5055) {
                MMLiveEngine.this.f13722s.mo47005v(data.getInt("faceCount"));
                return;
            }
            if (i3 == 5056) {
                data.getInt("pushtype", 0);
                MMLiveEngine.this.f13722s.m121923e(new MMLiveErrorInfo(5056, data.getInt("errorCode"), data.getString("errorMsg")));
                return;
            }
            switch (i3) {
                case 4203:
                    if (MMLiveEngine.this.f13714o != null) {
                        MMLiveEngine.m19047M("MMLiveEngine", "PUBLISH_EVT_PUB_PUBLISHING rtmpPrepared true");
                        hb20.m130275f().m130293w(MMLiveEngine.this.f13714o.m131591e(), true);
                        MMLiveEngine.this.f13681V = true;
                    }
                    MMLiveEngine.this.f13722s.mo47003t(mMLivePushType);
                    break;
                case 4204:
                    MMLiveEngine.m19047M("PUBLISH_EVT_PUB_PUBLISHED, onEnginePushReplaced", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType);
                    MMLiveEngine.this.f13722s.mo121939s(mMLivePushType);
                    MMLiveEngine.this.m19132x0(false);
                    break;
                case 4205:
                    MMLiveEngine.this.f13722s.mo47004u(MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype")]);
                    break;
                default:
                    switch (i3) {
                        case 5051:
                            MMLiveEngine.this.f13722s.mo47003t(MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype", 0)]);
                            break;
                        case 5052:
                            int i5 = data.getInt("pushtype", 0);
                            MMLiveEngine.m19047M("PUBLISH_EVT_PUB_PUBLISHED, onEnginePushReplaced", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType);
                            MMLiveEngine.this.f13722s.mo121939s(MMLiveRoomParams.MMLivePushType.values()[i5]);
                            MMLiveEngine.this.m19132x0(false);
                            break;
                        case 5053:
                            int i6 = data.getInt("state");
                            int i7 = data.getInt(Reason.TYPE);
                            int i8 = data.getInt("elapsed");
                            MMLiveEngine.m19047M("PUBLISH_LINK_REMOTE_VIDEO_STATE");
                            MMLiveEngine.this.f13722s.m121922d0((int) j, i6, i7, i8);
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$e */
    public class C3873e implements za1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13749a;

            public a(int i) {
                this.f13749a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s == null) {
                    return;
                }
                int i = this.f13749a;
                if (i != -1) {
                    if (i == 2 || i == 19) {
                        MMLiveEngine.this.f13722s.mo121896C(0);
                        return;
                    } else if (i != 25) {
                        return;
                    }
                }
                MMLiveEngine.this.f13722s.mo121897D(-1);
                MMLiveEngine.m19047M("onMusicPlayError");
            }
        }

        public C3873e() {
        }

        @Override // p149l.za1
        /* JADX INFO: renamed from: a */
        public void mo18373a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$f */
    public class C3874f implements za1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13752a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f13753b;

            public a(int i, int i2) {
                this.f13752a = i;
                this.f13753b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s == null) {
                    return;
                }
                int i = this.f13752a;
                if (i == -1) {
                    MMLiveEngine.this.f13722s.m121899F(MMLiveEngine.this.f13720r.linkType);
                    MMLiveEngine.m19047M("onSurroundMusicError:" + this.f13753b);
                    return;
                }
                if (i == 1) {
                    MMLiveEngine.this.f13722s.mo121902I(MMLiveEngine.this.f13720r.linkType);
                    MMLiveEngine.m19047M("onSurroundMusicStart");
                } else if (i == 2) {
                    MMLiveEngine.this.f13722s.mo121903J(MMLiveEngine.this.f13720r.linkType);
                    MMLiveEngine.m19047M("onSurroundMusicStoped");
                } else {
                    if (i != 3) {
                        return;
                    }
                    MMLiveEngine.this.f13722s.m121901H(MMLiveEngine.this.f13720r.linkType);
                    MMLiveEngine.m19047M("onSurroundMusicPause:" + this.f13753b);
                }
            }
        }

        public C3874f() {
        }

        @Override // p149l.za1
        /* JADX INFO: renamed from: a */
        public void mo18373a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(i, i2));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$g */
    public class C3875g implements za1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$g$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13756a;

            public a(int i) {
                this.f13756a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s == null) {
                    return;
                }
                int i = this.f13756a;
                if (i == -1) {
                    MMLiveEngine.this.f13722s.mo121938n(-1);
                    MMLiveEngine.m19047M("onEffectPlayError");
                } else {
                    if (i != 2) {
                        return;
                    }
                    MMLiveEngine.this.f13722s.mo121937m(0, 0);
                }
            }
        }

        public C3875g() {
        }

        @Override // p149l.za1
        /* JADX INFO: renamed from: a */
        public void mo18373a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$h */
    public class C3876h implements MomoPipelineModuleRegister.InterfaceC4110a {
        public C3876h() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: a */
        public void mo18362a(int i, int i2, j1m j1mVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("pushtype", MMLiveEngine.this.f13720r.linkType.ordinal());
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = -5800;
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: b */
        public void mo18363b(int i, int i2, j1m j1mVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("pushtype", MMLiveEngine.this.f13720r.linkType.ordinal());
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = -5801;
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$i */
    public class C3877i implements MomoPipelineModuleRegister.InterfaceC4112c {
        public C3877i() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: a */
        public void mo18371a(j1m j1mVar) {
            Bundle bundle = new Bundle();
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 4205;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish Stopped");
                MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
                if (!(j1mVar instanceof lw00)) {
                    if (j1mVar instanceof yc0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
                    } else if (j1mVar instanceof tdj0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
                    } else if (j1mVar instanceof o500) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
                    }
                }
                bundle.putInt("pushtype", mMLivePushType.ordinal());
                handler.sendMessage(messageObtainMessage);
            }
            synchronized (MMLiveEngine.this.f13673N) {
                try {
                    if (MMLiveEngine.this.f13710m != null) {
                        MMLiveEngine.this.f13710m.mo20181z(j1mVar);
                        j1mVar.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: b */
        public void mo18372b(j1m j1mVar) {
            ii70.m136344d().m136348c("MomoCamera", "onRecordPrepared");
            Bundle bundle = new Bundle();
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 4212;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish prepared");
                MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
                if (!(j1mVar instanceof lw00)) {
                    if (j1mVar instanceof yc0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
                    } else if (j1mVar instanceof tdj0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
                    } else if (j1mVar instanceof o500) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
                    }
                }
                bundle.putInt("pushtype", mMLivePushType.ordinal());
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$j */
    public class C3878j implements MomoPipelineModuleRegister.InterfaceC4111b {
        public C3878j() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4111b
        /* JADX INFO: renamed from: a */
        public void mo18370a(int i, int i2, j1m j1mVar) {
            Handler handler;
            if (j1mVar == null || (handler = MMLiveEngine.this.f13718q) == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Message messageObtainMessage = handler.obtainMessage();
            bundle.putInt("pushtype", MMLiveEngine.this.m19073D(j1mVar).ordinal());
            messageObtainMessage.setData(bundle);
            if (i == 103) {
                messageObtainMessage.what = 4207;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish buffering start");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 105) {
                messageObtainMessage.what = 4208;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish buffering stop");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 8197) {
                messageObtainMessage.what = PlaybackException.ERROR_CODE_DRM_UNSPECIFIED;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "PUBLISH_PUSH_LEVEL_CHANGE");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 12289) {
                messageObtainMessage.what = 4205;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish stopped");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 12292) {
                messageObtainMessage.what = 4203;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish start");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 12305) {
                messageObtainMessage.what = 4204;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish started,OK");
                handler.sendMessage(messageObtainMessage);
                return;
            }
            if (i == 32770) {
                messageObtainMessage.what = PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "AID_INFO");
                handler.sendMessage(messageObtainMessage);
            } else if (i == 4103) {
                messageObtainMessage.what = 5051;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "link start rtmp publish");
                handler.sendMessage(messageObtainMessage);
            } else {
                if (i != 4104) {
                    return;
                }
                messageObtainMessage.what = 5052;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "link rtmp published");
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$k */
    public class C3879k implements nrl {
        public C3879k() {
        }

        @Override // p149l.nrl
        /* JADX INFO: renamed from: a */
        public void mo19146a(pjw pjwVar) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5055;
                bundle.putInt("faceCount", pjwVar.m169950n());
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$l */
    public class C3880l implements lrl {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$l$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121941x();
                }
            }
        }

        public C3880l() {
        }

        @Override // p149l.lrl
        /* JADX INFO: renamed from: b */
        public void mo19147b() {
            MMLiveEngine.m19047M("beauty", "lightingEngine init");
            if (MMLiveEngine.this.f13718q != null) {
                MMLiveEngine.this.f13718q.post(new a());
            }
        }

        @Override // p149l.lrl
        public void onBeautyError(int i, String str) {
            MMLiveEngine.m19047M("beauty", "beauty init error");
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5056;
                bundle.putInt("pushtype", MMLiveEngine.this.f13720r.linkType.ordinal());
                bundle.putInt("errorCode", i);
                bundle.putString("errorMsg", str);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$m */
    public class C3881m implements zv00.InterfaceC21782e {
        public C3881m() {
        }

        @Override // p149l.zv00.InterfaceC21782e
        /* JADX INFO: renamed from: a */
        public void mo19148a(qmr qmrVar) {
            fkw unused = MMLiveEngine.this.f13722s;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n */
    public class C3882n extends hgd0 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13766a;

            public a(int i) {
                this.f13766a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    int i = this.f13766a;
                    C3882n c3882n = C3882n.this;
                    if (i == 1) {
                        MMLiveEngine.this.f13722s.m121917a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateConnected);
                    } else {
                        MMLiveEngine.this.f13722s.m121917a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateFailed);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121917a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateDisconnected);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13769a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f13770b;

            public c(int i, int i2) {
                this.f13769a = i;
                this.f13770b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121930i(this.f13769a, this.f13770b);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("MMLiveEngine onPlayMusicPaused");
                    MMLiveEngine.this.f13722s.m121901H(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$e */
        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("MMLiveEngine onPlayMusicStared");
                    MMLiveEngine.this.f13722s.mo121902I(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$f */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("MMLiveEngine onPlayMusicFailed");
                    MMLiveEngine.this.f13722s.m121899F(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$g */
        public class g implements Runnable {
            public g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("MMLiveEngine onPlayMusicStopped");
                    MMLiveEngine.this.f13722s.mo121903J(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13776a;

            public h(int i) {
                this.f13776a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121934k(this.f13776a);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13778a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f13779b;

            public i(int i, int i2) {
                this.f13778a = i;
                this.f13779b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121942y(this.f13778a, this.f13779b);
                }
            }
        }

        public C3882n() {
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: a */
        public void mo19149a() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new f());
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: b */
        public void mo19150b() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new d());
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: c */
        public void mo19151c() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new e());
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: d */
        public void mo19152d() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new g());
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: e */
        public void mo19153e(int i2, int i3) {
            super.mo19153e(i2, i3);
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new c(i2, i3));
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: f */
        public void mo19154f(long j, int i2, String str) {
            super.mo19154f(j, i2, str);
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(i2));
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: g */
        public void mo19155g(int i2) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new h(i2));
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: h */
        public void mo19156h(int i2, int i3) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121936l(i2, i3);
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: i */
        public void mo19157i(int i2, String str) {
            super.mo19157i(i2, str);
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new b());
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: k */
        public void mo19158k(int i2, int i3) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new i(i2, i3));
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: l */
        public void mo19159l(int i2, int i3, int i4) {
            super.mo19159l(i2, i3, i4);
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121898E(i2, i3, i4);
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: m */
        public void mo19160m(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121904K(bArr, i2, i3);
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: n */
        public void mo19161n(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121913V(bArr, i2, i3);
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: o */
        public void mo19162o(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121914W(bArr, i2, i3);
            }
        }

        @Override // p149l.hgd0
        /* JADX INFO: renamed from: p */
        public void mo19163p(String str, int i2) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121909P(i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0048  */
        /* JADX WARN: Code duplicated, block: B:12:0x0054  */
        /* JADX WARN: Code duplicated, block: B:13:0x0057  */
        /* JADX WARN: Code duplicated, block: B:8:0x0040  */
        @Override // p149l.hgd0
        /* JADX INFO: renamed from: q */
        public void mo19164q(String str, int i2, int i3, String str2, String str3, int i4) {
            String str4;
            MMLiveEngine mMLiveEngine;
            super.mo19164q(str, i2, i3, str2, str3, i4);
            MMLiveEngine.m19047M("onRtmpStreamingStateChanged", "stage :" + i2 + ",enableStreamReplace:" + MMLiveEngine.this.f13726u);
            if (MMLiveEngine.this.f13726u) {
                MMLiveEngine mMLiveEngine2 = MMLiveEngine.this;
                if (mMLiveEngine2.m19083K(mMLiveEngine2.f13669J)) {
                    str4 = "up";
                } else if (MMLiveEngine.this.f13726u) {
                    mMLiveEngine = MMLiveEngine.this;
                    if (mMLiveEngine.m19083K(mMLiveEngine.f13669J)) {
                        str4 = "none";
                    } else {
                        str4 = "down";
                    }
                } else {
                    str4 = "none";
                }
            } else if (MMLiveEngine.this.f13726u) {
                mMLiveEngine = MMLiveEngine.this;
                if (mMLiveEngine.m19083K(mMLiveEngine.f13669J)) {
                    str4 = "down";
                } else {
                    str4 = "none";
                }
            } else {
                str4 = "none";
            }
            eyx.m118802c().m118809h(new eyx.C16725b(i2, i3, str2, str4, str3, i4, str));
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$o */
    public class C3883o implements ktf {
        public C3883o() {
        }

        @Override // p149l.ktf
        /* JADX INFO: renamed from: a */
        public void mo19165a(byte[][] bArr) {
            MMLiveEngine.this.f13722s.m121928h(bArr);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$p */
    public class C3884p implements MRtcEventHandler {
        public C3884p() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onAudioMixingFinished() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5016;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Audio Mixing Finished");
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onConnectionLost() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5015;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Connect Lost");
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onError(int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5021;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Link Error:" + i);
                bundle.putInt("extra", i);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onFirstRemoteVideoDecoded(long j, int i, int i2, int i3) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5041;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "First Remote Video Frame Decoded");
                bundle.putInt(Oauth2AccessToken.KEY_UID, (int) j);
                bundle.putInt("width", i);
                bundle.putInt("height", i2);
                bundle.putInt("elapsed", i3);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onJoinChannelSuccess(String str, long j, int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                if (Long.valueOf(MMLiveEngine.this.f13720r.userId).longValue() == j || Long.valueOf(MMLiveEngine.this.f13704j.getMomoid()).longValue() == j) {
                    messageObtainMessage.what = 5000;
                } else {
                    messageObtainMessage.what = 5001;
                }
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "join channel sucess, channel:" + str);
                bundle.putInt(Oauth2AccessToken.KEY_UID, (int) j);
                bundle.putString("channel", str);
                bundle.putInt("elapsed", i);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onJoinChannelfail(String str, long j, int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = WarningCode.WARNING_CODE_NO_RECORDING_DEVICE;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "join channel Error, channel:" + str);
                bundle.putInt(Oauth2AccessToken.KEY_UID, (int) j);
                bundle.putString("channel", str);
                bundle.putInt("elapsed", i);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onUserMuteAudio(int i, boolean z) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5031;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "user mute audio:" + z + ", uid:" + i);
                bundle.putInt(Oauth2AccessToken.KEY_UID, i);
                bundle.putBoolean("muted", z);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onUserMuteVideo(int i, boolean z) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5032;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "user mute video:" + z + ", uid:" + i);
                bundle.putInt(Oauth2AccessToken.KEY_UID, i);
                bundle.putBoolean("muted", z);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onUserOffline(long j, int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                if (Long.valueOf(MMLiveEngine.this.f13720r.userId).longValue() == j || Long.valueOf(MMLiveEngine.this.f13704j.getMomoid()).longValue() == j) {
                    messageObtainMessage.what = 5010;
                    if (MMLiveEngine.this.f13720r != null) {
                        bundle.putString("channel", MMLiveEngine.this.f13720r.channel);
                    }
                } else {
                    messageObtainMessage.what = 5011;
                }
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "user offlinne, reason:" + i + ", uid:" + j);
                bundle.putInt(Oauth2AccessToken.KEY_UID, (int) j);
                bundle.putInt(Reason.TYPE, i);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onWarning(int i) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5020;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Link Warn:" + i);
                bundle.putInt("warn", i);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$q */
    public class C3885q implements ya1 {
        public C3885q() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            return MMLiveEngine.this.f13722s != null ? MMLiveEngine.this.f13722s.m121920c(mpd0Var) : mpd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$r */
    public class C3886r implements ja4.InterfaceC17734l {
        public C3886r() {
        }

        @Override // p149l.ja4.InterfaceC17734l
        /* JADX INFO: renamed from: K */
        public void mo19166K(byte[] bArr, int i, int i2) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.mo121926g(bArr, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s */
    public class C3887s implements m2m {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ jkw f13786a;

            public a(jkw jkwVar) {
                this.f13786a = jkwVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121929h0(this.f13786a);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ MMLiveSubtitleState f13788a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ MMLiveSubtitleErrorCode f13789b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f13790c;

            public b(MMLiveSubtitleState mMLiveSubtitleState, MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode, String str) {
                this.f13788a = mMLiveSubtitleState;
                this.f13789b = mMLiveSubtitleErrorCode;
                this.f13790c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.m121931i0(this.f13788a, this.f13789b, this.f13790c);
                }
            }
        }

        public C3887s() {
        }

        @Override // p149l.m2m
        /* JADX INFO: renamed from: a */
        public void mo19167a(MMLiveSubtitleState mMLiveSubtitleState, MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode, String str) {
            if (MMLiveEngine.this.f13718q == null) {
                return;
            }
            MMLiveEngine.this.f13718q.post(new b(mMLiveSubtitleState, mMLiveSubtitleErrorCode, str));
        }

        @Override // p149l.m2m
        /* JADX INFO: renamed from: b */
        public void mo19168b(jkw jkwVar) {
            if (MMLiveEngine.this.f13718q == null) {
                return;
            }
            MMLiveEngine.this.f13718q.post(new a(jkwVar));
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$t */
    public class C3888t extends xgf0 {
        public C3888t() {
        }

        @Override // p149l.xgf0
        /* JADX INFO: renamed from: a */
        public void mo19169a(String str, String str2, String str3) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.mo121908O(str, str2, str3);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$u */
    public class C3889u implements u3m.InterfaceC20352a {
        public C3889u() {
        }

        @Override // p149l.u3m.InterfaceC20352a
        /* JADX INFO: renamed from: a */
        public void mo19170a(int i, Bundle bundle) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121915X(i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$v */
    public static /* synthetic */ class C3890v {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f13794a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f13795b;

        static {
            int[] iArr = new int[MomoCodec.MomoCodecState.values().length];
            f13795b = iArr;
            try {
                iArr[MomoCodec.MomoCodecState.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13795b[MomoCodec.MomoCodecState.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13795b[MomoCodec.MomoCodecState.WAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MMLiveRoomParams.MMLivePushType.values().length];
            f13794a = iArr2;
            try {
                iArr2[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13794a[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$w */
    public class C3891w extends TimerTask {
        public C3891w() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            hjx.m131418a("MMLiveEngine", "traceLogTimer start.");
            MMLiveEngine.this.m19066x();
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x */
    public class C3892x implements MRtcChannelHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("onRequestChannelKey");
                    MMLiveEngine.this.f13722s.mo121925f0(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13799a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ byte[] f13800b;

            public b(int i, byte[] bArr) {
                this.f13799a = i;
                this.f13800b = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.mo46994U(this.f13799a, this.f13800b);
                }
            }
        }

        public C3892x() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onRequestChannelKey() {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a());
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onStreamMessage(int i, int i2, byte[] bArr) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new b(i, bArr));
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$y */
    public class C3893y implements MRtcTokenWillExpireHander {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$y$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.m19047M("onTokenPrivilegeWillExpire");
                    MMLiveEngine.this.f13722s.mo121933j0(MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        public C3893y() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcTokenWillExpireHander
        public void onTokenPrivilegeWillExpire(String str) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$z */
    public class C3894z implements MRtcReceiveSeiHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$z$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ byte[] f13805a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f13806b;

            public a(byte[] bArr, long j) {
                this.f13805a = bArr;
                this.f13806b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f13722s != null) {
                    MMLiveEngine.this.f13722s.mo121910Q(new String(this.f13805a), String.valueOf(this.f13806b), MMLiveEngine.this.f13720r.linkType);
                }
            }
        }

        public C3894z() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcReceiveSeiHandler
        public void OnReceiveH264Sei(byte[] bArr, long j, String str) {
            Handler handler = MMLiveEngine.this.f13718q;
            if (handler != null) {
                handler.post(new a(bArr, j));
            }
        }
    }

    public MMLiveEngine(MMLiveUserConfig mMLiveUserConfig, @NonNull Context context) {
        ejx ejxVar;
        this.f13704j = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        if (mMLiveUserConfig != null) {
            this.f13704j = mMLiveUserConfig;
        } else {
            this.f13704j = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        }
        this.f13702i = new WeakReference<>(context);
        g16.m124054a(context.getApplicationContext());
        XEnginePreferences.setApplicationContext(context.getApplicationContext());
        this.f13720r = new MMLiveRoomParams();
        this.f13718q = new HandlerC3872d0(Looper.getMainLooper());
        m19078G();
        eix eixVar = new eix();
        eixVar.m116739o(this.f13704j.getAppid());
        eixVar.m116745u(this.f13704j.getMomoid());
        eixVar.m116743s(this.f13704j.getRoomid());
        eixVar.m116744t(this.f13704j.getSecret());
        eixVar.m116738n(this.f13704j.getAppVersion());
        eixVar.m116741q(this.f13704j.getAppPatch());
        this.f13710m = vv00.m200150n(context.getApplicationContext(), eixVar);
        eyx.m118802c().m118816o(this.f13704j.getAppid(), this.f13704j.getSecret());
        eyx.m118802c().m118814m(dix.m111940d().m111947g(this.f13704j.getAppid()));
        eyx.m118802c().m118815n(this.f13704j.getMomoid());
        eyx.m118802c().m118813l(this.f13704j.getRoomid());
        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f13704j.getAppid());
        if (c16387dM111948h != null && (ejxVar = c16387dM111948h.f86452e) != null) {
            this.f13708l.f177141g0 = ejxVar.f91842X == 1;
        }
        this.f13710m.mo20180y(this.f13708l);
        dix.m111940d().m111951o(qv00.m176690a());
        MMLiveSource mMLiveSource = new MMLiveSource(this.f13710m, context.getApplicationContext(), this.f13704j);
        this.f13712n = mMLiveSource;
        mMLiveSource.m19201P(new C3879k());
        this.f13712n.m19194I(new C3880l());
        fjx.m121638R().m121786s1(true);
        this.f13710m.mo20160e(this.f13699g0);
        this.f13710m.mo20141A(this.f13703i0);
        this.f13710m.mo20162g(this.f13705j0);
        this.f13710m.mo20161f(this.f13701h0);
        this.f13712n.m19187B(this.f13668I);
        this.f13712n.m19203R(this.f13709l0);
        dix.C16387d c16387dM111948h2 = dix.m111940d().m111948h(this.f13704j.getAppid());
        if (c16387dM111948h2 != null && c16387dM111948h2.f86452e != null) {
            pek0.m168517a().m168521e(c16387dM111948h2.f86452e);
        }
        if (c16387dM111948h2 != null) {
            this.f13660A = new su10(this.f13704j.getAppid(), this.f13704j.getSecret(), this.f13704j.getMomoid(), this.f13704j.getRoomid(), "", "", dix.m111940d().m111947g(this.f13704j.getAppid()), "", String.valueOf(hashCode()), "");
        } else {
            eyx.m118802c().m118808g("MMLiveEning constr userConfig1 == null, not create MyHttpMediaLogsUpload");
        }
        if (this.f13732z == null) {
            Timer timer = new Timer();
            this.f13732z = timer;
            timer.scheduleAtFixedRate(new C3891w(), 200L, 10000L);
        }
        fjx.m121638R().m121647C1(1);
        m19047M("MMLiveEngine", mMLiveUserConfig != null ? mMLiveUserConfig.toString() : "");
    }

    /* JADX INFO: renamed from: E0 */
    private int m19042E0(MMLiveMediaConfig mMLiveMediaConfig, String str) {
        m19047M("startPush", mMLiveMediaConfig == null ? "" : mMLiveMediaConfig.toString());
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131599n();
            this.f13714o = null;
        }
        this.f13706k = mMLiveMediaConfig;
        this.f13714o = new hkw(this.f13710m, this.f13704j);
        if (this.f13720r == null) {
            this.f13720r = new MMLiveRoomParams();
        }
        MMLiveRoomParams mMLiveRoomParams = this.f13720r;
        MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        mMLiveRoomParams.linkType = mMLivePushType;
        this.f13669J = mMLivePushType;
        this.f13681V = false;
        MMLiveSource mMLiveSource = this.f13712n;
        MMLiveMediaConfig mMLiveMediaConfig2 = this.f13706k;
        mMLiveSource.m19200O(mMLiveMediaConfig2.encodeWidth, mMLiveMediaConfig2.encodeHeight);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19284x(true);
        }
        xgf0 xgf0Var = this.f13725t0;
        if (xgf0Var != null) {
            this.f13714o.m131594i(xgf0Var);
        }
        if (this.f13714o != null) {
            C3912a c3912a2 = this.f13716p;
            if (c3912a2 != null) {
                c3912a2.m19270j(false);
            }
            m19112i0(this.f13724t);
            int i = this.f13670K;
            if (i != 0) {
                this.f13714o.m131593h(i);
            }
            this.f13714o.m131596k(this.f13719q0);
            m19065u(mMLiveMediaConfig);
            this.f13714o.m131597l(mMLiveMediaConfig, str);
            this.f13712n.m19227u().mo20119l(0);
            this.f13714o.m131587a(this.f13687a0);
        }
        if (this.f13726u) {
            m19132x0(true);
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    private void m19043H() {
        MMLiveRoomParams mMLiveRoomParams = this.f13720r;
        if (mMLiveRoomParams != null) {
            MMLiveRoomParams.MMRenderViewType mMRenderViewType = mMLiveRoomParams.renderViewType;
            if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.SurfaceViewOut) {
                this.f13715o0 = new C3865a();
            } else if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.TextureViewOut) {
                this.f13717p0 = new C3867b();
            } else if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.SurfaceTextureOut) {
                this.f13713n0 = new C3869c();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private boolean m19044I() {
        return this.f13716p != null;
    }

    /* JADX INFO: renamed from: J */
    private boolean m19045J() {
        return this.f13714o != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public int m19046L0(int i, int i2, int i3) {
        m19047M("transWhatCode", Integer.valueOf(i), Integer.valueOf(i2));
        if (20736 == i) {
            return i2 == 0 ? 5 : 4;
        }
        if (4352 == i || 4352 == i || 4353 == i || 4353 == i || 8448 == i || 8449 == i) {
            return i2 == 10 ? Constants.RHYTHM_PLAYER_STATE_DECODING : i2;
        }
        if ((i & 257) != 257) {
            return i;
        }
        if (i == 12545) {
            int i4 = 11;
            if (i2 != 1 && i2 != 11) {
                i4 = 12;
                if (i2 != 12 && i2 != 13) {
                    i4 = 14;
                    if (i2 == 14) {
                    }
                }
            }
            return i4;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static void m19047M(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{" + new SimpleDateFormat("HH:mm:ss.SSS", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis())) + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        ArrayList<String> arrayList = f13659v0;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 300) {
                    arrayList.add(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private void m19065u(MMLiveMediaConfig mMLiveMediaConfig) {
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig = this.f13672M;
        if (mMLiveVideoEncoderConfig != null) {
            mMLiveVideoEncoderConfig.encodeWidth = mMLiveMediaConfig.encodeWidth;
            mMLiveVideoEncoderConfig.encodeHeight = mMLiveMediaConfig.encodeHeight;
            mMLiveVideoEncoderConfig.videoBitRate = mMLiveMediaConfig.videoBitRate;
            mMLiveVideoEncoderConfig.videoFPS = mMLiveMediaConfig.videoFPS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m19066x() {
        StringBuilder sb;
        ArrayList<String> arrayList;
        hjx.m131421d("MMLiveEngine", "flushMediaLogs");
        ArrayList<String> arrayList2 = f13659v0;
        synchronized (arrayList2) {
            try {
                if (arrayList2.size() > 0) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        arrayList = f13659v0;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        sb.append(arrayList.get(i));
                        i++;
                    }
                    arrayList.clear();
                } else {
                    sb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            if (sb != null) {
                try {
                    if (sb.length() > 0 && this.f13660A != null) {
                        this.f13660A.mo19169a("nonConf", "v2.mediaLogs", imx.m137116w(Long.valueOf(System.currentTimeMillis()), "traceLog", "[" + sb.toString().replace(com.clevertap.android.sdk.Constants.AES_SUFFIX, ")") + com.clevertap.android.sdk.Constants.AES_SUFFIX));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public akw m19067A() {
        MMLiveSource mMLiveSource;
        if (this.f13676Q != null && (mMLiveSource = this.f13712n) != null && mMLiveSource.m19225s() != null) {
            this.f13676Q.m97189K(this.f13712n.m19225s().mo124900c()).m97179A(this.f13712n.m19225s().mo124902d()).m97188J(this.f13712n.m19225s().mo124909h()).m97190L(this.f13712n.m19225s().mo124908g());
        }
        return rv5.m181231b(this.f13676Q);
    }

    /* JADX INFO: renamed from: A0 */
    public void m19068A0(String str) {
        this.f13663D = str;
        m19047M("setVideoMixerBackgroundImgUrl url:" + str);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19256Y(str);
        }
    }

    /* JADX INFO: renamed from: B */
    public float m19069B() {
        return this.f13692d;
    }

    /* JADX INFO: renamed from: B0 */
    public void m19070B0(String str) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19212a0(str);
        }
    }

    /* JADX INFO: renamed from: C */
    public igb0 m19071C() {
        return m19045J() ? this.f13714o.m131590d() : m19044I() ? this.f13716p.m19275o() : null;
    }

    /* JADX INFO: renamed from: C0 */
    public void m19072C0(akw akwVar) {
        if (akwVar == null) {
            m19047M("startCamera", "MMLiveCameraConfiguration is NULL");
            return;
        }
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null && mMLiveSource.m19228w()) {
            m19047M("startCamera", "camera is already start");
            qmr parameters = this.f13710m.getParameters();
            this.f13712n.m19200O(parameters.f177152m, parameters.f177154n);
            this.f13712n.m19213b0(akwVar.m97198d(), akwVar.m97211q());
            return;
        }
        m19047M("startCamera", "cameraID: " + akwVar.m97198d() + " cameraWidth: " + akwVar.m97199e() + " cameraHeight: " + akwVar.m97197c() + " cameraFPS: " + akwVar.m97196b());
        qmr qmrVar = this.f13708l;
        if (qmrVar != null) {
            qmrVar.f177170w = akwVar.m97199e();
            this.f13708l.f177171x = akwVar.m97197c();
        }
        if (this.f13712n != null) {
            qmr parameters2 = this.f13710m.getParameters();
            this.f13712n.m19199N(akwVar.m97199e(), akwVar.m97197c());
            this.f13712n.m19200O(parameters2.f177152m, parameters2.f177154n);
            this.f13712n.m19197L(akwVar.m97196b());
            this.f13712n.m19213b0(akwVar.m97198d(), akwVar.m97211q());
        }
        m19090O0(akwVar);
    }

    /* JADX INFO: renamed from: D */
    public MMLiveRoomParams.MMLivePushType m19073D(j1m j1mVar) {
        MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
        if (j1mVar == null) {
            return mMLivePushType;
        }
        if (j1mVar instanceof lw00) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        }
        if (j1mVar instanceof yc0) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
        if (j1mVar instanceof tdj0) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        }
        if (j1mVar instanceof o500) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
        }
        return j1mVar instanceof udp0 ? MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc : mMLivePushType;
    }

    /* JADX INFO: renamed from: D0 */
    public int m19074D0(MMLiveMediaConfig mMLiveMediaConfig) {
        return m19042E0(mMLiveMediaConfig, mMLiveMediaConfig.sei);
    }

    /* JADX INFO: renamed from: E */
    public float m19075E() {
        return this.f13688b;
    }

    /* JADX INFO: renamed from: F */
    public MMLiveVideoEncoderConfig m19076F() {
        return this.f13672M;
    }

    /* JADX INFO: renamed from: F0 */
    public void m19077F0() {
        m19047M("stopAllEffect");
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19214c0();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m19078G() {
        qmr qmrVar = new qmr();
        this.f13708l = qmrVar;
        qmrVar.f182018G0 = true;
        qmrVar.f177120S = 64000;
        qmrVar.f177119R = 2;
        qmrVar.f177117P = 44100;
        qmrVar.f177152m = 360;
        qmrVar.f177154n = 640;
        qmrVar.f177148k = 360;
        qmrVar.f177150l = 640;
        qmrVar.f177168u = 360;
        qmrVar.f177169v = 640;
        qmrVar.f177136e = 360;
        qmrVar.f177138f = 640;
        qmrVar.f177109H = 1200000;
        qmrVar.f182015D0 = 20;
        qmrVar.f182016E0 = 15;
    }

    /* JADX INFO: renamed from: G0 */
    public void m19079G0() {
        if (this.f13712n != null) {
            m19047M("MMLiveEngine", "stopPreview");
            this.f13712n.m19217f0();
            this.f13676Q = null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m19080H0(int i) {
        m19047M("stopEffect", Integer.valueOf(i));
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19215d0(i);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m19081I0() {
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131600o();
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19259a0();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m19082J0() {
        m19047M("stopPush");
        if (fjx.m121638R().m121724c()) {
            hkw hkwVar = this.f13714o;
            if (hkwVar != null) {
                hkwVar.m131589c(false);
                this.f13714o.m131599n();
                this.f13714o = null;
            }
            if (this.f13726u) {
                C3912a c3912a = this.f13716p;
                if (c3912a != null) {
                    c3912a.m19271k(false);
                }
                this.f13726u = false;
            }
        } else {
            if (this.f13726u) {
                hkw hkwVar2 = this.f13714o;
                if (hkwVar2 != null) {
                    hkwVar2.m131588b(false);
                }
                C3912a c3912a2 = this.f13716p;
                if (c3912a2 != null) {
                    c3912a2.m19271k(false);
                }
                this.f13726u = false;
            }
            hkw hkwVar3 = this.f13714o;
            if (hkwVar3 != null) {
                hkwVar3.m131599n();
                this.f13714o = null;
            }
        }
        this.f13681V = false;
        if (!m19044I()) {
            this.f13669J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
        }
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19210Y(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m19083K(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        return mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
    }

    /* JADX INFO: renamed from: K0 */
    public int m19084K0() {
        m19047M(BLiveButtonType.switchCamera);
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            this.f13676Q = rv5.m181230a(mMLiveSource.m19218g0(), this.f13676Q);
        }
        akw akwVar = this.f13676Q;
        if (akwVar != null) {
            return akwVar.m97198d();
        }
        return 1;
    }

    /* JADX INFO: renamed from: L */
    public void m19085L() {
        m19047M("leaveRoom");
        if (this.f13726u) {
            hkw hkwVar = this.f13714o;
            if (hkwVar != null) {
                hkwVar.m131588b(false);
            }
            C3912a c3912a = this.f13716p;
            if (c3912a != null) {
                c3912a.m19271k(false);
            }
        }
        C3912a c3912a2 = this.f13716p;
        if (c3912a2 != null) {
            c3912a2.m19278r();
            this.f13716p = null;
        }
        this.f13726u = false;
        if (m19045J()) {
            return;
        }
        this.f13669J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
    }

    /* JADX INFO: renamed from: M0 */
    public int m19086M0(String str) {
        m19047M("unaccrossOtherRoom", str);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            return c3912a.m19261b0(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public long m19087N() {
        if (this.f13716p != null && m19083K(this.f13669J)) {
            return this.f13716p.m19277q();
        }
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19230z();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m19088N0(String str, String str2, float f) {
        m19047M("updateBeautyValue id:" + str + ", key:" + str2 + ", value:" + f);
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19219h0(str, str2, f);
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public long m19089O() {
        if (this.f13716p != null && m19083K(this.f13669J)) {
            return this.f13716p.m19276p();
        }
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19186A();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O0 */
    public void m19090O0(@NonNull akw akwVar) {
        if (this.f13712n == null) {
            m19047M("MMLiveEngine", "updateCameraConfiguration mLiveSource: null");
            return;
        }
        m19047M("MMLiveEngine", "updateCameraConfiguration previewWidth: " + akwVar.m97208n() + " previewHeight: " + akwVar.m97207m() + " enableCameraRawData: " + akwVar.m97214t() + " warpType: " + akwVar.m97212r() + " videoRotation: " + akwVar.m97210p() + " enableFilterScale: " + akwVar.m97216v() + " enableBlinkDetect: " + akwVar.m97213s() + " enableFaceExpressionDetect: " + akwVar.m97215u());
        if (this.f13676Q == null || (akwVar.m97208n() != 0 && akwVar.m97207m() != 0)) {
            qmr qmrVar = this.f13708l;
            if (qmrVar != null) {
                qmrVar.f177168u = akwVar.m97208n();
                this.f13708l.f177169v = akwVar.m97207m();
            }
            if (this.f13674O == null) {
                this.f13712n.m19193H();
            }
            if (this.f13712n != null && akwVar.m97208n() != 0 && akwVar.m97207m() != 0) {
                this.f13712n.m19208W(akwVar.m97208n(), akwVar.m97207m());
            }
            akw akwVar2 = this.f13676Q;
            if (akwVar2 != null) {
                akwVar2.m97191M(akwVar.m97208n(), akwVar.m97207m());
            }
        }
        if (this.f13676Q != null && akwVar.m97200f() != this.f13676Q.m97200f()) {
            MMLiveSource mMLiveSource = this.f13712n;
            if (mMLiveSource != null && mMLiveSource.m19225s() != null) {
                this.f13712n.m19225s().mo124898b(akwVar.m97200f());
            }
            akw akwVar3 = this.f13676Q;
            if (akwVar3 != null) {
                akwVar3.m97179A(akwVar.m97200f());
            }
        }
        if (this.f13676Q != null && akwVar.m97195a() != this.f13676Q.m97195a()) {
            MMLiveSource mMLiveSource2 = this.f13712n;
            if (mMLiveSource2 != null && mMLiveSource2.m19225s() != null) {
                this.f13712n.m19225s().mo124914m(akwVar.m97195a());
            }
            akw akwVar4 = this.f13676Q;
            if (akwVar4 != null) {
                akwVar4.m97218x(akwVar.m97195a());
            }
        }
        if (this.f13676Q != null && akwVar.m97201g() != this.f13676Q.m97201g()) {
            MMLiveSource mMLiveSource3 = this.f13712n;
            if (mMLiveSource3 != null && mMLiveSource3.m19225s() != null) {
                this.f13712n.m19225s().setExposureCompensation(akwVar.m97201g());
            }
            akw akwVar5 = this.f13676Q;
            if (akwVar5 != null) {
                akwVar5.m97185G(akwVar.m97201g());
            }
        }
        if (this.f13676Q != null && akwVar.m97214t() != this.f13676Q.m97214t()) {
            MMLiveSource mMLiveSource4 = this.f13712n;
            if (mMLiveSource4 != null && mMLiveSource4.m19225s() != null) {
                this.f13712n.m19198M(akwVar.m97214t() ? this.f13721r0 : null);
            }
            akw akwVar6 = this.f13676Q;
            if (akwVar6 != null) {
                akwVar6.m97181C(akwVar.m97214t());
            }
        }
        if (this.f13676Q != null && akwVar.m97212r() != this.f13676Q.m97212r()) {
            MMLiveSource mMLiveSource5 = this.f13712n;
            if (mMLiveSource5 != null) {
                mMLiveSource5.m19211Z(akwVar.m97212r());
            }
            akw akwVar7 = this.f13676Q;
            if (akwVar7 != null) {
                akwVar7.m97194P(akwVar.m97212r());
            }
        }
        if (this.f13676Q != null && akwVar.m97210p() != this.f13676Q.m97210p()) {
            MMLiveSource mMLiveSource6 = this.f13712n;
            if (mMLiveSource6 != null) {
                mMLiveSource6.m19209X(akwVar.m97210p());
            }
            akw akwVar8 = this.f13676Q;
            if (akwVar8 != null) {
                akwVar8.m97193O(akwVar.m97210p());
            }
        }
        if (this.f13676Q != null && akwVar.m97216v() != this.f13676Q.m97216v()) {
            MMLiveSource mMLiveSource7 = this.f13712n;
            if (mMLiveSource7 != null) {
                mMLiveSource7.m19205T(akwVar.m97216v());
            }
            akw akwVar9 = this.f13676Q;
            if (akwVar9 != null) {
                akwVar9.m97183E(akwVar.m97216v());
            }
        }
        if (this.f13676Q != null && akwVar.m97213s() != this.f13676Q.m97213s()) {
            MMLiveSource mMLiveSource8 = this.f13712n;
            if (mMLiveSource8 != null) {
                mMLiveSource8.m19196K(akwVar.m97213s());
            }
            akw akwVar10 = this.f13676Q;
            if (akwVar10 != null) {
                akwVar10.m97180B(akwVar.m97213s());
            }
        }
        if (this.f13676Q != null && akwVar.m97215u() != this.f13676Q.m97215u()) {
            MMLiveSource mMLiveSource9 = this.f13712n;
            if (mMLiveSource9 != null) {
                mMLiveSource9.m19202Q(akwVar.m97215u());
            }
            akw akwVar11 = this.f13676Q;
            if (akwVar11 != null) {
                akwVar11.m97182D(akwVar.m97215u());
            }
        }
        if (this.f13676Q != null && akwVar.m97202h() != this.f13676Q.m97202h()) {
            MMLiveSource mMLiveSource10 = this.f13712n;
            if (mMLiveSource10 != null && mMLiveSource10.m19226t() != null) {
                this.f13712n.m19226t().mo124916s(akwVar.m97202h());
            }
            akw akwVar12 = this.f13676Q;
            if (akwVar12 != null) {
                akwVar12.m97186H(akwVar.m97202h());
            }
        }
        if (this.f13676Q != null && akwVar.m97217w() != this.f13676Q.m97217w()) {
            MMLiveSource mMLiveSource11 = this.f13712n;
            if (mMLiveSource11 != null && mMLiveSource11.m19226t() != null) {
                this.f13712n.m19226t().mo124911j(akwVar.m97217w());
            }
            akw akwVar13 = this.f13676Q;
            if (akwVar13 != null) {
                akwVar13.m97184F(akwVar.m97217w());
            }
        }
        if (this.f13676Q != null && akwVar.m97203i() != this.f13676Q.m97203i()) {
            MMLiveSource mMLiveSource12 = this.f13712n;
            if (mMLiveSource12 != null && mMLiveSource12.m19226t() != null) {
                this.f13712n.m19226t().mo124917u(akwVar.m97203i());
            }
            akw akwVar14 = this.f13676Q;
            if (akwVar14 != null) {
                akwVar14.m97187I(akwVar.m97203i());
            }
        }
        if (this.f13676Q != null && akwVar.m97209o() != this.f13676Q.m97209o()) {
            MMLiveSource mMLiveSource13 = this.f13712n;
            if (mMLiveSource13 != null && mMLiveSource13.m19225s() != null) {
                this.f13712n.m19225s().mo124915n(akwVar.m97209o());
            }
            akw akwVar15 = this.f13676Q;
            if (akwVar15 != null) {
                akwVar15.m97192N(akwVar.m97209o());
            }
        }
        if (this.f13676Q != null && akwVar.m97199e() != 0 && akwVar.m97197c() != 0 && akwVar.m97199e() != this.f13676Q.m97199e() && akwVar.m97197c() != this.f13676Q.m97197c()) {
            this.f13676Q.m97220z(akwVar.m97199e(), akwVar.m97197c());
        }
        if (this.f13676Q != null && akwVar.m97196b() != 0 && akwVar.m97196b() != this.f13676Q.m97196b()) {
            this.f13676Q.m97219y(akwVar.m97196b());
        }
        if (this.f13676Q == null) {
            this.f13676Q = rv5.m181231b(akwVar);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m19091P() {
        m19047M("pauseMusic");
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131592g();
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19279s();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m19092P0(String str) {
        m19047M("updateChannelKey", str);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19263c0(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m19093Q(int i, String str, int i2, double d, double d2, boolean z) {
        m19047M("playEffect", Integer.valueOf(i), str, Integer.valueOf(i2), Double.valueOf(d), Double.valueOf(d2), Boolean.valueOf(z));
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19280t(i, str, i2, d, d2, z);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m19094Q0(String str, String str2, float f) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19220i0(str, str2, f);
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public void m19095R(MMLivePlayMusicConfig mMLivePlayMusicConfig) {
        m19047M("MMLiveEngine playMusic", mMLivePlayMusicConfig.musicUrl, "loopback" + mMLivePlayMusicConfig.playMusicType, "repeatCount:" + mMLivePlayMusicConfig.repeatCount);
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131598m(mMLivePlayMusicConfig.musicUrl);
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19257Z(mMLivePlayMusicConfig.musicUrl, mMLivePlayMusicConfig.playMusicType == MMLivePlayMusicConfig.MMLivePlayMusicType.MMLivePlayMusicTypePlayout, mMLivePlayMusicConfig.repeatCount);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m19096S() {
        m19047M("release");
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19188C();
            this.f13712n = null;
        }
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131599n();
            this.f13714o = null;
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19278r();
            this.f13716p = null;
        }
        synchronized (this.f13673N) {
            try {
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13710m;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo20175t();
                    this.f13710m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        WeakReference<Context> weakReference = this.f13702i;
        if (weakReference != null) {
            weakReference.clear();
            this.f13702i = null;
        }
        if (this.f13732z != null) {
            m19066x();
            hjx.m131418a("MMLiveEngine", "traceLogTimer release.");
            this.f13732z.cancel();
            this.f13732z = null;
        }
        synchronized (this) {
            try {
                if (this.f13660A != null) {
                    this.f13660A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Handler handler = this.f13718q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f13718q = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m19097T(String str) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19189D(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public boolean m19098U(String str, String str2) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19190E(str, str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public void m19099V(MaskModel maskModel) {
        m19047M("remove3DSticker：" + maskModel);
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19191F(maskModel);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m19100W() {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19192G();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m19101X() {
        m19047M("resumeMusic");
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131592g();
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19281u();
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m19102Y(int i) {
        m19047M("selectAudioIndex:" + i);
        if (m19044I()) {
            return this.f13716p.m19282v(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z */
    public int m19103Z(byte[] bArr) {
        if (m19044I()) {
            return this.f13716p.m19283w(bArr);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a0 */
    public void m19104a0(boolean z) {
        m19047M("setAllRemoteAudioMute", Boolean.valueOf(z));
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19284x(z);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m19105b0(boolean z) {
        m19047M("setAllRemoteVideoMute", Boolean.valueOf(z));
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19285y(z);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public int m19106c0(MomoMediaConstants$MMLiveAudioEffectPreset momoMediaConstants$MMLiveAudioEffectPreset) {
        m19047M("setAudioEffectPreset:" + momoMediaConstants$MMLiveAudioEffectPreset);
        if (m19044I()) {
            return this.f13716p.m19286z(momoMediaConstants$MMLiveAudioEffectPreset.getValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: d0 */
    public int m19107d0(MomoMediaConstants$MMLiveAudioMixingDualMonoMode momoMediaConstants$MMLiveAudioMixingDualMonoMode) {
        m19047M("setAudioMixingDualMonoMode:" + momoMediaConstants$MMLiveAudioMixingDualMonoMode);
        if (m19044I()) {
            return this.f13716p.m19233A(momoMediaConstants$MMLiveAudioMixingDualMonoMode.getValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: e0 */
    public void m19108e0(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        m19047M("setBeautyType:" + momoMediaConstants$BEAUTY_TYPE);
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19195J(momoMediaConstants$BEAUTY_TYPE);
            this.f13664E = momoMediaConstants$BEAUTY_TYPE;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public int m19109f0(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        m19047M("setClientRole", mMLiveClientRole);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            return c3912a.m19234B(mMLiveClientRole);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g0 */
    public void m19110g0(boolean z) {
        m19047M("setEnableAudio", Boolean.valueOf(z));
        this.f13729w = z;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19236D(z);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m19111h0(MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig) {
        m19047M("enableAudioVolumeIndication", Integer.valueOf(mMLiveAudioVolumeConfig.interval), Integer.valueOf(mMLiveAudioVolumeConfig.smooth), Integer.valueOf(mMLiveAudioVolumeConfig.report_vad));
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19268h(mMLiveAudioVolumeConfig.interval, mMLiveAudioVolumeConfig.smooth, mMLiveAudioVolumeConfig.report_vad);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m19112i0(boolean z) {
        m19047M("enableInEarMonitoring:" + z);
        this.f13724t = z;
        if (m19044I() && m19083K(this.f13669J)) {
            this.f13716p.m19270j(z);
            return;
        }
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19210Y(z);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m19113j0(boolean z) {
        m19047M("setEnableSpeakerphone", Boolean.valueOf(z));
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19237E(z);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m19114k0(boolean z) {
        m19047M("enableStreamReplace", Boolean.valueOf(z));
        this.f13726u = z;
    }

    /* JADX INFO: renamed from: l0 */
    public void m19115l0(boolean z) {
        m19047M("setEnableVideo", Boolean.valueOf(z));
        this.f13728v = z;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19238F(z);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m19116m0(float f) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19204S(f);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m19117n0(MMLiveTranscoding mMLiveTranscoding) {
        m19047M("setLiveTranscoding V2");
        this.f13671L = mMLiveTranscoding;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19240H(mMLiveTranscoding);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m19118o0(boolean z) {
        m19047M("setLocalAudioMute", Boolean.valueOf(z));
        this.f13731y = z;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19241I(z);
        }
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131595j(z);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m19119p0(boolean z) {
        m19047M("setLocalVideoMute", Boolean.valueOf(z));
        this.f13730x = z;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19243K(z);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m19120q0(String str) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19206U(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public int m19121r(String str, String str2, String str3) {
        m19047M("accrossOtherRoom", str, str2, str3);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            return c3912a.m19258a(str, str2, str3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: r0 */
    public void m19122r0(float f) {
        m19047M("MMLiveEngine setMusicVolume", Float.valueOf(f));
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19207V(f);
        }
        this.f13692d = f;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19245M((int) (f * 100.0f));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m19123s(String str, MaskModel maskModel) {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19222p(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m19124s0(String str) {
        m19047M("MMLiveEngine setParameters", str);
        m19047M("setParameters", str);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19248P(str);
        } else {
            this.f13680U.add(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m19125t(MaskModel maskModel) {
        m19047M("add3DSticker：" + maskModel);
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            mMLiveSource.m19223q(maskModel);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m19126t0(fkw fkwVar) {
        this.f13722s = fkwVar;
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19254W(this.f13711m0, this.f13715o0, this.f13713n0);
            this.f13716p.m19253V(this.f13707k0);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m19127u0(float f) {
        this.f13688b = f;
        m19047M("setRecordVolume volume:" + f);
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19244L(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m19128v(boolean z) {
        m19047M("enablePusherStatisticWatch" + z);
        if (z) {
            this.f13725t0 = new C3888t();
        } else {
            this.f13725t0 = null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m19129v0(int i, boolean z) {
        C3912a c3912a;
        m19047M("setRemoteAudioStreamMute", Integer.valueOf(i), Boolean.valueOf(z));
        try {
            MMLiveRoomParams mMLiveRoomParams = this.f13720r;
            if ((mMLiveRoomParams == null || Integer.valueOf(mMLiveRoomParams.userId).intValue() != i) && (c3912a = this.f13716p) != null) {
                c3912a.m19249R(i, z);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public int m19130w(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        String str;
        String string = mMLiveMediaConfig == null ? "" : mMLiveMediaConfig.toString();
        String string2 = mMLiveRoomParams != null ? mMLiveRoomParams.toString() : "";
        if (mMLiveTranscoding == null) {
            str = "transcodeing is null";
        } else {
            str = "transcodeing:" + mMLiveTranscoding.toString2();
        }
        m19047M("enterRoom", string, string2, str);
        int iM19273m = 0;
        if (mMLiveRoomParams.onlyAudio) {
            m19119p0(true);
            m19115l0(false);
        }
        this.f13671L = mMLiveTranscoding;
        this.f13706k = mMLiveMediaConfig;
        this.f13720r = mMLiveRoomParams;
        if (this.f13716p != null) {
            m19047M("rtc not null , leaveRoom first");
            this.f13716p.m19278r();
            this.f13716p = null;
        }
        MMLiveRoomParams.MMLivePushType mMLivePushType = this.f13720r.linkType;
        if (mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfWL || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM) {
            fkw fkwVar = this.f13722s;
            if (fkwVar != null) {
                fkwVar.mo46999o(mMLivePushType, new MMLiveErrorInfo(Constants.RHYTHM_PLAYER_STATE_PLAYING, 100, f860.m119872a(mMLivePushType, Constants.RHYTHM_PLAYER_STATE_PLAYING, 100)));
            }
            eyx.m118802c().m118807f("enterRoom", "linkType", String.valueOf(this.f13720r.linkType));
            return -2;
        }
        int i = C3890v.f13794a[mMLivePushType.ordinal()];
        if (i == 1 || i == 2) {
            this.f13716p = new C3912a(this.f13710m, this.f13704j, this.f13720r.linkType);
        }
        this.f13669J = this.f13720r.linkType;
        m19043H();
        try {
            if (this.f13716p != null) {
                MMLiveSource mMLiveSource = this.f13712n;
                if (mMLiveSource != null) {
                    mMLiveSource.m19210Y(false);
                }
                this.f13716p.m19262c(this.f13682W);
                this.f13716p.m19266f(this.f13683X);
                this.f13716p.m19267g(this.f13684Y);
                this.f13716p.m19265e(this.f13689b0);
                this.f13716p.m19260b(this.f13687a0);
                this.f13716p.m19254W(this.f13711m0, this.f13715o0, this.f13713n0);
                this.f13716p.m19255X(this.f13717p0);
                this.f13716p.m19253V(this.f13707k0);
                m19112i0(this.f13724t);
                this.f13716p.m19238F(this.f13728v);
                this.f13716p.m19236D(this.f13729w);
                this.f13716p.m19243K(this.f13730x);
                this.f13716p.m19241I(this.f13731y);
                MMLiveSource mMLiveSource2 = this.f13712n;
                if (mMLiveSource2 != null) {
                    MMLiveMediaConfig mMLiveMediaConfig2 = this.f13706k;
                    mMLiveSource2.m19200O(mMLiveMediaConfig2.encodeWidth, mMLiveMediaConfig2.encodeHeight);
                }
                this.f13661B = mMLiveRoomParams.audioProfile;
                this.f13662C = mMLiveRoomParams.audioScenario;
                this.f13716p.m19239G(this.f13725t0);
                this.f13716p.m19256Y(this.f13663D);
                this.f13716p.m19269i(this.f13666G, this.f13665F);
                this.f13716p.m19272l(this.f13667H);
                this.f13716p.m19264d(this.f13685Z);
                if (!TextUtils.isEmpty(this.f13694e)) {
                    this.f13716p.m19242J(this.f13694e);
                }
                this.f13716p.m19247O(this.f13719q0);
                this.f13716p.m19246N(this.f13696f);
                this.f13716p.m19252U(this.f13720r.enableFullTimeMode);
                MomoMediaConstants$MMLiveSimulcastStreamMode momoMediaConstants$MMLiveSimulcastStreamMode = this.f13677R;
                if (momoMediaConstants$MMLiveSimulcastStreamMode != MomoMediaConstants$MMLiveSimulcastStreamMode.NO_SET && this.f13678S != null) {
                    this.f13716p.m19235C(momoMediaConstants$MMLiveSimulcastStreamMode.getValue(), this.f13678S);
                }
                MomoMediaConstants$MMLiveSimulcastStreamType momoMediaConstants$MMLiveSimulcastStreamType = this.f13679T;
                if (momoMediaConstants$MMLiveSimulcastStreamType != MomoMediaConstants$MMLiveSimulcastStreamType.DEFAULT) {
                    this.f13716p.m19250S(momoMediaConstants$MMLiveSimulcastStreamType.getValue());
                }
                Iterator<String> it = this.f13680U.iterator();
                while (it.hasNext()) {
                    this.f13716p.m19248P(it.next());
                }
                m19065u(mMLiveMediaConfig);
                iM19273m = this.f13716p.m19273m(mMLiveMediaConfig, this.f13720r, mMLiveTranscoding);
                MMLiveSource mMLiveSource3 = this.f13712n;
                if (mMLiveSource3 != null) {
                    mMLiveSource3.m19227u().mo20119l(1);
                }
                eyx.m118802c().m118811j(mMLiveMediaConfig.businessType);
            } else {
                fkw fkwVar2 = this.f13722s;
                if (fkwVar2 != null) {
                    MMLiveRoomParams.MMLivePushType mMLivePushType2 = this.f13720r.linkType;
                    fkwVar2.mo46999o(mMLivePushType2, new MMLiveErrorInfo(1000001, 100, f860.m119872a(mMLivePushType2, 1000001, 100)));
                    iM19273m = -2;
                }
            }
        } catch (NullPointerException unused) {
            fkw fkwVar3 = this.f13722s;
            if (fkwVar3 != null) {
                MMLiveRoomParams.MMLivePushType mMLivePushType3 = this.f13720r.linkType;
                fkwVar3.mo46999o(mMLivePushType3, new MMLiveErrorInfo(1000001, 101, f860.m119872a(mMLivePushType3, 1000001, 101)));
            }
        }
        if (this.f13726u) {
            m19132x0(true);
        }
        return iM19273m;
    }

    /* JADX INFO: renamed from: w0 */
    public void m19131w0(String str) {
        m19047M("MMLiveEngine", "setRestartWithURL:" + str);
        if (m19044I()) {
            this.f13716p.m19251T(str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m19132x0(boolean z) {
        m19047M("setStreamReplaceMode", Boolean.valueOf(z));
        hkw hkwVar = this.f13714o;
        if (hkwVar != null) {
            hkwVar.m131588b(z);
        }
        C3912a c3912a = this.f13716p;
        if (c3912a != null) {
            c3912a.m19271k(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public int m19133y() {
        m19047M("getAudioTrackCount");
        if (m19044I()) {
            return this.f13716p.m19274n();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y0 */
    public void m19134y0(MMLiveUserConfig mMLiveUserConfig) {
        m19047M("setUserConfig", mMLiveUserConfig == null ? "" : mMLiveUserConfig.toString());
        if (mMLiveUserConfig != null) {
            this.f13704j = mMLiveUserConfig;
        }
    }

    /* JADX INFO: renamed from: z */
    public zml m19135z() {
        MMLiveSource mMLiveSource = this.f13712n;
        if (mMLiveSource != null) {
            return mMLiveSource.m19224r();
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public void m19136z0(MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig) {
        int i = (mMLiveVideoEncoderConfig.encodeWidth / 2) * 2;
        int i2 = (mMLiveVideoEncoderConfig.encodeHeight / 2) * 2;
        m19047M("setVideoEncoderConfig", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(mMLiveVideoEncoderConfig.videoBitRate));
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig2 = this.f13672M;
        mMLiveVideoEncoderConfig2.encodeWidth = mMLiveVideoEncoderConfig.encodeWidth;
        mMLiveVideoEncoderConfig2.encodeHeight = mMLiveVideoEncoderConfig.encodeHeight;
        mMLiveVideoEncoderConfig2.videoFPS = mMLiveVideoEncoderConfig.videoFPS;
        mMLiveVideoEncoderConfig2.videoBitRate = mMLiveVideoEncoderConfig.videoBitRate;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f13710m;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.getParameters().f177152m = i;
            qmr parameters = this.f13710m.getParameters();
            parameters.f177152m = i;
            parameters.f177154n = i2;
            parameters.f177109H = mMLiveVideoEncoderConfig.videoBitRate;
            parameters.f182030S0 = mMLiveVideoEncoderConfig.videoFPS;
            MMLiveSource mMLiveSource = this.f13712n;
            if (mMLiveSource != null) {
                mMLiveSource.m19200O(i, i2);
            }
            if (this.f13674O != null) {
                this.f13710m.mo20158c(parameters);
                this.f13710m.mo20163h(parameters, this.f13698g);
                return;
            }
            boolean zM19083K = m19083K(this.f13669J);
            MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.f13710m;
            if (zM19083K) {
                momoPipelineModuleRegister2.mo20171p(parameters);
            } else {
                momoPipelineModuleRegister2.mo20157b(parameters);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c */
    public class C3869c implements cbl0 {
        public C3869c() {
        }

        @Override // p149l.cbl0
        /* JADX INFO: renamed from: b */
        public void mo19144b(long j, int i) {
            fkw unused = MMLiveEngine.this.f13722s;
        }

        @Override // p149l.cbl0
        /* JADX INFO: renamed from: c */
        public void mo19145c(long j, cbl0.InterfaceC16102b interfaceC16102b, int i, int i2) {
            if (MMLiveEngine.this.f13722s != null) {
                MMLiveEngine.this.f13722s.m121911R(j, interfaceC16102b, MMLiveEngine.this.f13720r.linkType);
            }
        }

        @Override // p149l.cbl0
        /* JADX INFO: renamed from: a */
        public void mo19143a(long j, cbl0.InterfaceC16103c interfaceC16103c, int i, int i2) {
        }
    }
}
