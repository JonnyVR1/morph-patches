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
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p074ss.bytertc.engine.type.WarningCode;
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
import p153l.a320;
import p153l.arx;
import p153l.aul;
import p153l.b7y;
import p153l.brx;
import p153l.bsx;
import p153l.c4m;
import p153l.ce00;
import p153l.csx;
import p153l.d410;
import p153l.ebl0;
import p153l.enw;
import p153l.esx;
import p153l.f5m;
import p153l.fb1;
import p153l.fpf0;
import p153l.fvx;
import p153l.gb1;
import p153l.gbl0;
import p153l.gkl0;
import p153l.gnw;
import p153l.h410;
import p153l.hnw;
import p153l.ib4;
import p153l.imw;
import p153l.inw;
import p153l.kg60;
import p153l.kod0;
import p153l.kpl;
import p153l.l26;
import p153l.l6m;
import p153l.lvl;
import p153l.mob0;
import p153l.omw;
import p153l.oq70;
import p153l.oxd0;
import p153l.p4k0;
import p153l.qj20;
import p153l.ror;
import p153l.t410;
import p153l.tpw;
import p153l.uc0;
import p153l.vnk0;
import p153l.wpw;
import p153l.ww5;
import p153l.xmj0;
import p153l.y310;
import p153l.ymp0;
import p153l.ytl;
import p153l.yuf;
import p153l.zmw;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveEngine {

    /* JADX INFO: renamed from: v0 */
    private static final ArrayList<String> f14353v0 = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    private a320 f14354A;

    /* JADX INFO: renamed from: L */
    private MMLiveTranscoding f14365L;

    /* JADX INFO: renamed from: Q */
    private zmw f14370Q;

    /* JADX INFO: renamed from: S */
    private hnw f14372S;

    /* JADX INFO: renamed from: e */
    private String f14388e;

    /* JADX INFO: renamed from: i */
    private WeakReference<Context> f14396i;

    /* JADX INFO: renamed from: j */
    private MMLiveUserConfig f14398j;

    /* JADX INFO: renamed from: k */
    private MMLiveMediaConfig f14400k;

    /* JADX INFO: renamed from: l */
    private ror f14402l;

    /* JADX INFO: renamed from: m */
    private MomoPipelineModuleRegister f14404m;

    /* JADX INFO: renamed from: n */
    private MMLiveSource f14406n;

    /* JADX INFO: renamed from: o */
    private gnw f14408o;

    /* JADX INFO: renamed from: p */
    private C4055a f14410p;

    /* JADX INFO: renamed from: q */
    private Handler f14412q;

    /* JADX INFO: renamed from: r */
    private MMLiveRoomParams f14414r;

    /* JADX INFO: renamed from: s */
    private enw f14416s;

    /* JADX INFO: renamed from: z */
    private Timer f14426z;

    /* JADX INFO: renamed from: a */
    private boolean f14380a = false;

    /* JADX INFO: renamed from: b */
    private float f14382b = 1.0f;

    /* JADX INFO: renamed from: c */
    private float f14384c = 1.0f;

    /* JADX INFO: renamed from: d */
    private float f14386d = 1.0f;

    /* JADX INFO: renamed from: f */
    private long f14390f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f14392g = false;

    /* JADX INFO: renamed from: h */
    private boolean f14394h = false;

    /* JADX INFO: renamed from: t */
    private boolean f14418t = false;

    /* JADX INFO: renamed from: u */
    private boolean f14420u = false;

    /* JADX INFO: renamed from: v */
    private boolean f14422v = true;

    /* JADX INFO: renamed from: w */
    private boolean f14423w = true;

    /* JADX INFO: renamed from: x */
    private boolean f14424x = false;

    /* JADX INFO: renamed from: y */
    private boolean f14425y = false;

    /* JADX INFO: renamed from: B */
    private MMLiveRoomParams.MMLiveAudioProfile f14355B = MMLiveRoomParams.MMLiveAudioProfile.MMLiveAudioProfileNone;

    /* JADX INFO: renamed from: C */
    private MMLiveRoomParams.MMLiveAudioScenario f14356C = MMLiveRoomParams.MMLiveAudioScenario.MMLiveAudioScenarioNone;

    /* JADX INFO: renamed from: D */
    private String f14357D = "";

    /* JADX INFO: renamed from: E */
    private MomoMediaConstants$BEAUTY_TYPE f14358E = MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_DOKI;

    /* JADX INFO: renamed from: F */
    private String f14359F = "";

    /* JADX INFO: renamed from: G */
    private boolean f14360G = false;

    /* JADX INFO: renamed from: H */
    private boolean f14361H = false;

    /* JADX INFO: renamed from: I */
    private boolean f14362I = false;

    /* JADX INFO: renamed from: J */
    private MMLiveRoomParams.MMLivePushType f14363J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;

    /* JADX INFO: renamed from: K */
    private int f14364K = 0;

    /* JADX INFO: renamed from: M */
    private MMLiveVideoEncoderConfig f14366M = new MMLiveVideoEncoderConfig();

    /* JADX INFO: renamed from: N */
    private Object f14367N = new Object();

    /* JADX INFO: renamed from: O */
    private lvl f14368O = null;

    /* JADX INFO: renamed from: P */
    private boolean f14369P = false;

    /* JADX INFO: renamed from: R */
    private MomoMediaConstants$MMLiveSimulcastStreamMode f14371R = MomoMediaConstants$MMLiveSimulcastStreamMode.NO_SET;

    /* JADX INFO: renamed from: T */
    private MomoMediaConstants$MMLiveSimulcastStreamType f14373T = MomoMediaConstants$MMLiveSimulcastStreamType.DEFAULT;

    /* JADX INFO: renamed from: U */
    private List<String> f14374U = new ArrayList();

    /* JADX INFO: renamed from: V */
    private boolean f14375V = false;

    /* JADX INFO: renamed from: W */
    private MRtcChannelHandler f14376W = new C4035x();

    /* JADX INFO: renamed from: X */
    private MRtcTokenWillExpireHander f14377X = new C4036y();

    /* JADX INFO: renamed from: Y */
    private MRtcReceiveSeiHandler f14378Y = new C4037z();

    /* JADX INFO: renamed from: Z */
    private wpw f14379Z = new C4009a0();

    /* JADX INFO: renamed from: a0 */
    private MRtcAudioHandler f14381a0 = new C4011b0();

    /* JADX INFO: renamed from: b0 */
    private MRtcPusherHandler f14383b0 = new C4013c0();

    /* JADX INFO: renamed from: c0 */
    private OnPlayerStateCallback f14385c0 = new C4014d();

    /* JADX INFO: renamed from: d0 */
    private gb1 f14387d0 = new C4016e();

    /* JADX INFO: renamed from: e0 */
    private gb1 f14389e0 = new C4017f();

    /* JADX INFO: renamed from: f0 */
    private gb1 f14391f0 = new C4018g();

    /* JADX INFO: renamed from: g0 */
    private MomoPipelineModuleRegister.InterfaceC4261a f14393g0 = new C4019h();

    /* JADX INFO: renamed from: h0 */
    private MomoPipelineModuleRegister.InterfaceC4263c f14395h0 = new C4020i();

    /* JADX INFO: renamed from: i0 */
    private MomoPipelineModuleRegister.InterfaceC4262b f14397i0 = new C4021j();

    /* JADX INFO: renamed from: j0 */
    private h410.InterfaceC17387e f14399j0 = new C4024m();

    /* JADX INFO: renamed from: k0 */
    private kod0 f14401k0 = new C4025n();

    /* JADX INFO: renamed from: l0 */
    private yuf f14403l0 = new C4026o();

    /* JADX INFO: renamed from: m0 */
    private MRtcEventHandler f14405m0 = new C4027p();

    /* JADX INFO: renamed from: n0 */
    private gkl0 f14407n0 = null;

    /* JADX INFO: renamed from: o0 */
    private ebl0 f14409o0 = null;

    /* JADX INFO: renamed from: p0 */
    private gbl0 f14411p0 = null;

    /* JADX INFO: renamed from: q0 */
    private fb1 f14413q0 = new C4028q();

    /* JADX INFO: renamed from: r0 */
    private ib4.InterfaceC17689l f14415r0 = new C4029r();

    /* JADX INFO: renamed from: s0 */
    private f5m f14417s0 = new C4030s();

    /* JADX INFO: renamed from: t0 */
    fpf0 f14419t0 = null;

    /* JADX INFO: renamed from: u0 */
    private l6m.InterfaceC18358a f14421u0 = new C4032u();

    public enum MMLiveEngineType {
        LIVE_ENGINE_TYPE_PLAY,
        LIVE_ENGINE_TYPE_PUSH,
        LIVE_ENGINE_TYPE_NONE
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$a */
    public class C4008a implements ebl0 {
        public C4008a() {
        }

        @Override // p153l.ebl0
        /* JADX INFO: renamed from: a */
        public void mo20117a(long j, SurfaceView surfaceView, int i, int i2) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.mo48176S(String.valueOf(j), surfaceView, MMLiveEngine.this.f14414r.linkType);
            }
        }

        @Override // p153l.ebl0
        /* JADX INFO: renamed from: b */
        public void mo20118b(long j, int i) {
            Handler handler = MMLiveEngine.this.f14412q;
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
    public class C4009a0 implements wpw {
        public C4009a0() {
        }

        @Override // p153l.wpw
        /* JADX INFO: renamed from: a */
        public void mo20119a(tpw tpwVar) {
            MMLiveEngine.this.f14416s.m121589b0(tpwVar);
        }

        @Override // p153l.wpw
        /* JADX INFO: renamed from: b */
        public void mo20120b(imw imwVar) {
            MMLiveEngine.this.f14416s.m121565B(imwVar);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b */
    public class C4010b implements gbl0 {
        public C4010b() {
        }

        @Override // p153l.gbl0
        /* JADX INFO: renamed from: a */
        public void mo20121a(long j, TextureView textureView, int i, int i2) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.m20027M("onVideoChannelAdded TextureViewOut");
                MMLiveEngine.this.f14416s.m121582T(String.valueOf(j), textureView, MMLiveEngine.this.f14414r.linkType);
            }
        }

        @Override // p153l.gbl0
        /* JADX INFO: renamed from: b */
        public void mo20122b(long j, int i) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.m20027M("onVideoChannelRemove TextureViewOut");
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b0 */
    public class C4011b0 implements MRtcAudioHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$b0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AudioVolumeWeight[] f14431a;

            public a(AudioVolumeWeight[] audioVolumeWeightArr) {
                this.f14431a = audioVolumeWeightArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s == null || this.f14431a == null) {
                    return;
                }
                MMLiveEngine.this.f14416s.mo48181e0(this.f14431a, MMLiveEngine.this.f14414r.linkType);
            }
        }

        public C4011b0() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcAudioHandler
        public void onAudioVolumeIndication(AudioVolumeWeight[] audioVolumeWeightArr, int i) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(audioVolumeWeightArr));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0 */
    public class C4013c0 implements MRtcPusherHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14435a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f14436b;

            public a(int i, int i2) {
                this.f14435a = i;
                this.f14436b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.mo121577N(this.f14435a, this.f14436b);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c0$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f14438a;

            public b(String str) {
                this.f14438a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.mo121576M(this.f14438a);
                }
            }
        }

        public C4013c0() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcPusherHandler
        public void onPushChangeStreamUrl(String str) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new b(str));
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcPusherHandler
        public void onPushLevelChange(int i, int i2) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(i, i2));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$d */
    public class C4014d implements OnPlayerStateCallback {
        public C4014d() {
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121594f(i);
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121602j();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            if (MMLiveEngine.this.f14416s == null) {
                return false;
            }
            MMLiveEngine.this.f14416s.m121610w(i, i2);
            return false;
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121575L();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121597g0();
            }
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
        }

        @Override // tv.danmaku.ijk.media.player.OnPlayerStateCallback
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121605k0(i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$d0 */
    public class HandlerC4015d0 extends Handler {
        public HandlerC4015d0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (MMLiveEngine.this.f14416s == null) {
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
                int iM20026L0 = MMLiveEngine.this.m20026L0(i, i2, i4);
                MMLiveEngine.m20027M("PUBLISH_ERROR", Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
                if (iM20026L0 == 809 || iM20026L0 == 807 || iM20026L0 == 808 || iM20026L0 == 810 || iM20026L0 == 811 || iM20026L0 == 809) {
                    MMLiveEngine.m20027M("rtc engine error should leaveRoom");
                    if (MMLiveEngine.this.f14410p != null) {
                        MMLiveEngine.this.f14410p.m20258r();
                    }
                } else if (iM20026L0 == 12 || iM20026L0 == 11 || iM20026L0 == 13 || iM20026L0 == 14) {
                    MMLiveEngine.m20027M("rtmp push error should stopPush");
                    if (MMLiveEngine.this.f14408o != null) {
                        MMLiveEngine.this.f14408o.m131005n();
                        p4k0 p4k0VarM130997e = MMLiveEngine.this.f14408o.m130997e();
                        if (p4k0VarM130997e != null && p4k0VarM130997e.m170572b() == UrlType.IPV6 && !MMLiveEngine.this.f14375V) {
                            qj20.m176806f().m176824w(p4k0VarM130997e, false);
                            MMLiveEngine mMLiveEngine = MMLiveEngine.this;
                            mMLiveEngine.m20054D0(mMLiveEngine.f14400k);
                            return;
                        }
                    }
                } else if (iM20026L0 == 806) {
                    MMLiveEngine.m20027M("rtc engine appid invalid");
                    MMLiveEngine.this.f14410p = null;
                }
                MMLiveEngine.m20027M("onEngineError", "type :" + MMLiveRoomParams.MMLivePushType.values()[i4] + "what:" + iM20026L0 + ",extra:" + i2);
                MMLiveEngine.this.f14416s.mo48182o(MMLiveRoomParams.MMLivePushType.values()[i4], new MMLiveErrorInfo(iM20026L0, i2, kg60.m149742a(MMLiveRoomParams.MMLivePushType.values()[i4], i, i2)));
                return;
            }
            if (i3 == -5005) {
                MMLiveEngine.m20027M("PUBLISH_LINK_JOINROOM_ERROR");
                MMLiveErrorInfo mMLiveErrorInfo = new MMLiveErrorInfo(Constants.RHYTHM_PLAYER_STATE_IDLE, 0, kg60.m149742a(MMLiveEngine.this.f14414r.linkType, Constants.RHYTHM_PLAYER_STATE_IDLE, 0));
                mMLiveErrorInfo.uid = j;
                MMLiveEngine.this.f14416s.mo48182o(MMLiveEngine.this.f14414r.linkType, mMLiveErrorInfo);
                return;
            }
            if (i3 == -4211) {
                MMLiveEngine.m20027M("PUBLISH_EVT_CV_DOWNLOAD_FAILED");
                return;
            }
            if (i3 == 4212) {
                MMLiveRoomParams.MMLivePushType mMLivePushType2 = MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype")];
                MMLiveEngine.m20027M("PUBLISH_EVT_PUB_PREPARED", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType2);
                MMLiveEngine.this.f14416s.mo48185r(mMLivePushType2, 0);
                return;
            }
            if (i3 == 5016) {
                MMLiveEngine.this.f14416s.mo121570G(MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5021) {
                MMLiveEngine.m20027M("PUBLISH_LINK_ERROR", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f14416s.mo48182o(MMLiveEngine.this.f14414r.linkType, new MMLiveErrorInfo(i, i2, kg60.m149742a(MMLiveEngine.this.f14414r.linkType, i, i2)));
                return;
            }
            if (i3 == 5042) {
                MMLiveEngine.this.f14416s.mo48180d(data.getInt("routing"));
                return;
            }
            if (i3 == 6005) {
                MMLiveEngine.m20027M("AID_INFO", "Aid", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f14416s.m121588b(i, i2);
                return;
            }
            if (i3 == -4202 || i3 == -4201) {
                MMLiveEngine.m20027M("PUBLISH_EVT_PUB_SYS_ERROR", Integer.valueOf(i), Integer.valueOf(i2));
                MMLiveEngine.this.f14416s.mo48182o(MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE, new MMLiveErrorInfo(i, i2, kg60.m149742a(MMLiveEngine.this.f14414r.linkType, i, i2)));
                return;
            }
            if (i3 == 4207) {
                MMLiveEngine.this.f14416s.mo48183p(mMLivePushType);
                return;
            }
            if (i3 == 4208) {
                MMLiveEngine.this.f14416s.mo48184q(mMLivePushType);
                return;
            }
            if (i3 == 5000) {
                MMLiveEngine.this.f14416s.mo48189z(string, j, MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5001) {
                MMLiveEngine.this.f14416s.mo48178Z(string, strValueOf, MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5010) {
                MMLiveEngine.this.f14416s.mo48175A(string, data.getInt(Reason.TYPE), MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5011) {
                MMLiveEngine.this.f14416s.mo48179a0(strValueOf, data.getInt(Reason.TYPE), MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5031) {
                MMLiveEngine.this.f14416s.mo121586Y(strValueOf, data.getBoolean("muted"), MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5032) {
                MMLiveEngine.this.f14416s.mo121591c0(strValueOf, data.getBoolean("muted"), MMLiveEngine.this.f14414r.linkType);
                return;
            }
            if (i3 == 5055) {
                MMLiveEngine.this.f14416s.mo48188v(data.getInt("faceCount"));
                return;
            }
            if (i3 == 5056) {
                data.getInt("pushtype", 0);
                MMLiveEngine.this.f14416s.m121593e(new MMLiveErrorInfo(5056, data.getInt("errorCode"), data.getString("errorMsg")));
                return;
            }
            switch (i3) {
                case 4203:
                    if (MMLiveEngine.this.f14408o != null) {
                        MMLiveEngine.m20027M("MMLiveEngine", "PUBLISH_EVT_PUB_PUBLISHING rtmpPrepared true");
                        qj20.m176806f().m176824w(MMLiveEngine.this.f14408o.m130997e(), true);
                        MMLiveEngine.this.f14375V = true;
                    }
                    MMLiveEngine.this.f14416s.mo48186t(mMLivePushType);
                    break;
                case 4204:
                    MMLiveEngine.m20027M("PUBLISH_EVT_PUB_PUBLISHED, onEnginePushReplaced", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType);
                    MMLiveEngine.this.f14416s.mo121609s(mMLivePushType);
                    MMLiveEngine.this.m20112x0(false);
                    break;
                case 4205:
                    MMLiveEngine.this.f14416s.mo48187u(MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype")]);
                    break;
                default:
                    switch (i3) {
                        case 5051:
                            MMLiveEngine.this.f14416s.mo48186t(MMLiveRoomParams.MMLivePushType.values()[data.getInt("pushtype", 0)]);
                            break;
                        case 5052:
                            int i5 = data.getInt("pushtype", 0);
                            MMLiveEngine.m20027M("PUBLISH_EVT_PUB_PUBLISHED, onEnginePushReplaced", Integer.valueOf(i), Integer.valueOf(i2), "type:" + mMLivePushType);
                            MMLiveEngine.this.f14416s.mo121609s(MMLiveRoomParams.MMLivePushType.values()[i5]);
                            MMLiveEngine.this.m20112x0(false);
                            break;
                        case 5053:
                            int i6 = data.getInt("state");
                            int i7 = data.getInt(Reason.TYPE);
                            int i8 = data.getInt("elapsed");
                            MMLiveEngine.m20027M("PUBLISH_LINK_REMOTE_VIDEO_STATE");
                            MMLiveEngine.this.f14416s.m121592d0((int) j, i6, i7, i8);
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$e */
    public class C4016e implements gb1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14443a;

            public a(int i) {
                this.f14443a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s == null) {
                    return;
                }
                int i = this.f14443a;
                if (i != -1) {
                    if (i == 2 || i == 19) {
                        MMLiveEngine.this.f14416s.mo121566C(0);
                        return;
                    } else if (i != 25) {
                        return;
                    }
                }
                MMLiveEngine.this.f14416s.mo121567D(-1);
                MMLiveEngine.m20027M("onMusicPlayError");
            }
        }

        public C4016e() {
        }

        @Override // p153l.gb1
        /* JADX INFO: renamed from: a */
        public void mo19382a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$f */
    public class C4017f implements gb1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14446a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f14447b;

            public a(int i, int i2) {
                this.f14446a = i;
                this.f14447b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s == null) {
                    return;
                }
                int i = this.f14446a;
                if (i == -1) {
                    MMLiveEngine.this.f14416s.m121569F(MMLiveEngine.this.f14414r.linkType);
                    MMLiveEngine.m20027M("onSurroundMusicError:" + this.f14447b);
                    return;
                }
                if (i == 1) {
                    MMLiveEngine.this.f14416s.mo121572I(MMLiveEngine.this.f14414r.linkType);
                    MMLiveEngine.m20027M("onSurroundMusicStart");
                } else if (i == 2) {
                    MMLiveEngine.this.f14416s.mo121573J(MMLiveEngine.this.f14414r.linkType);
                    MMLiveEngine.m20027M("onSurroundMusicStoped");
                } else {
                    if (i != 3) {
                        return;
                    }
                    MMLiveEngine.this.f14416s.m121571H(MMLiveEngine.this.f14414r.linkType);
                    MMLiveEngine.m20027M("onSurroundMusicPause:" + this.f14447b);
                }
            }
        }

        public C4017f() {
        }

        @Override // p153l.gb1
        /* JADX INFO: renamed from: a */
        public void mo19382a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(i, i2));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$g */
    public class C4018g implements gb1 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$g$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14450a;

            public a(int i) {
                this.f14450a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s == null) {
                    return;
                }
                int i = this.f14450a;
                if (i == -1) {
                    MMLiveEngine.this.f14416s.mo121608n(-1);
                    MMLiveEngine.m20027M("onEffectPlayError");
                } else {
                    if (i != 2) {
                        return;
                    }
                    MMLiveEngine.this.f14416s.mo121607m(0, 0);
                }
            }
        }

        public C4018g() {
        }

        @Override // p153l.gb1
        /* JADX INFO: renamed from: a */
        public void mo19382a(Object obj, int i, int i2) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(i));
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$h */
    public class C4019h implements MomoPipelineModuleRegister.InterfaceC4261a {
        public C4019h() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: a */
        public void mo19371a(int i, int i2, c4m c4mVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("pushtype", MMLiveEngine.this.f14414r.linkType.ordinal());
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = -5800;
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: b */
        public void mo19372b(int i, int i2, c4m c4mVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("pushtype", MMLiveEngine.this.f14414r.linkType.ordinal());
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = -5801;
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$i */
    public class C4020i implements MomoPipelineModuleRegister.InterfaceC4263c {
        public C4020i() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: a */
        public void mo19380a(c4m c4mVar) {
            Bundle bundle = new Bundle();
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 4205;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish Stopped");
                MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
                if (!(c4mVar instanceof t410)) {
                    if (c4mVar instanceof uc0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
                    } else if (c4mVar instanceof xmj0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
                    } else if (c4mVar instanceof ce00) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
                    }
                }
                bundle.putInt("pushtype", mMLivePushType.ordinal());
                handler.sendMessage(messageObtainMessage);
            }
            synchronized (MMLiveEngine.this.f14367N) {
                try {
                    if (MMLiveEngine.this.f14404m != null) {
                        MMLiveEngine.this.f14404m.mo21180z(c4mVar);
                        c4mVar.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: b */
        public void mo19381b(c4m c4mVar) {
            oq70.m168791d().m168795c("MomoCamera", "onRecordPrepared");
            Bundle bundle = new Bundle();
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 4212;
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "publish prepared");
                MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
                if (!(c4mVar instanceof t410)) {
                    if (c4mVar instanceof uc0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
                    } else if (c4mVar instanceof xmj0) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
                    } else if (c4mVar instanceof ce00) {
                        mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
                    }
                }
                bundle.putInt("pushtype", mMLivePushType.ordinal());
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$j */
    public class C4021j implements MomoPipelineModuleRegister.InterfaceC4262b {
        public C4021j() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4262b
        /* JADX INFO: renamed from: a */
        public void mo19379a(int i, int i2, c4m c4mVar) {
            Handler handler;
            if (c4mVar == null || (handler = MMLiveEngine.this.f14412q) == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("what", i);
            bundle.putInt("extra", i2);
            Message messageObtainMessage = handler.obtainMessage();
            bundle.putInt("pushtype", MMLiveEngine.this.m20053D(c4mVar).ordinal());
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
    public class C4022k implements aul {
        public C4022k() {
        }

        @Override // p153l.aul
        /* JADX INFO: renamed from: a */
        public void mo20126a(omw omwVar) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5055;
                bundle.putInt("faceCount", omwVar.m168299n());
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$l */
    public class C4023l implements ytl {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$l$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121611x();
                }
            }
        }

        public C4023l() {
        }

        @Override // p153l.ytl
        /* JADX INFO: renamed from: b */
        public void mo20127b() {
            MMLiveEngine.m20027M("beauty", "lightingEngine init");
            if (MMLiveEngine.this.f14412q != null) {
                MMLiveEngine.this.f14412q.post(new a());
            }
        }

        @Override // p153l.ytl
        public void onBeautyError(int i, String str) {
            MMLiveEngine.m20027M("beauty", "beauty init error");
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                messageObtainMessage.what = 5056;
                bundle.putInt("pushtype", MMLiveEngine.this.f14414r.linkType.ordinal());
                bundle.putInt("errorCode", i);
                bundle.putString("errorMsg", str);
                handler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$m */
    public class C4024m implements h410.InterfaceC17387e {
        public C4024m() {
        }

        @Override // p153l.h410.InterfaceC17387e
        /* JADX INFO: renamed from: a */
        public void mo20128a(ror rorVar) {
            enw unused = MMLiveEngine.this.f14416s;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n */
    public class C4025n extends kod0 {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14460a;

            public a(int i) {
                this.f14460a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    int i = this.f14460a;
                    C4025n c4025n = C4025n.this;
                    if (i == 1) {
                        MMLiveEngine.this.f14416s.m121587a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateConnected);
                    } else {
                        MMLiveEngine.this.f14416s.m121587a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateFailed);
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
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121587a(MMLiveAcrossRoomState.MMLiveAcrossRoomStateDisconnected);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14463a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f14464b;

            public c(int i, int i2) {
                this.f14463a = i;
                this.f14464b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121600i(this.f14463a, this.f14464b);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("MMLiveEngine onPlayMusicPaused");
                    MMLiveEngine.this.f14416s.m121571H(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$e */
        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("MMLiveEngine onPlayMusicStared");
                    MMLiveEngine.this.f14416s.mo121572I(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$f */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("MMLiveEngine onPlayMusicFailed");
                    MMLiveEngine.this.f14416s.m121569F(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$g */
        public class g implements Runnable {
            public g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("MMLiveEngine onPlayMusicStopped");
                    MMLiveEngine.this.f14416s.mo121573J(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14470a;

            public h(int i) {
                this.f14470a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121604k(this.f14470a);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$n$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14472a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f14473b;

            public i(int i, int i2) {
                this.f14472a = i;
                this.f14473b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121612y(this.f14472a, this.f14473b);
                }
            }
        }

        public C4025n() {
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: a */
        public void mo20129a() {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new f());
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: b */
        public void mo20130b() {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new d());
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: c */
        public void mo20131c() {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new e());
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: d */
        public void mo20132d() {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new g());
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: e */
        public void mo20133e(int i2, int i3) {
            super.mo20133e(i2, i3);
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new c(i2, i3));
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: f */
        public void mo20134f(long j, int i2, String str) {
            super.mo20134f(j, i2, str);
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(i2));
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: g */
        public void mo20135g(int i2) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new h(i2));
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: h */
        public void mo20136h(int i2, int i3) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121606l(i2, i3);
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: i */
        public void mo20137i(int i2, String str) {
            super.mo20137i(i2, str);
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new b());
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: k */
        public void mo20138k(int i2, int i3) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new i(i2, i3));
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: l */
        public void mo20139l(int i2, int i3, int i4) {
            super.mo20139l(i2, i3, i4);
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121568E(i2, i3, i4);
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: m */
        public void mo20140m(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121574K(bArr, i2, i3);
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: n */
        public void mo20141n(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121583V(bArr, i2, i3);
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: o */
        public void mo20142o(byte[] bArr, int i2, int i3) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121584W(bArr, i2, i3);
            }
        }

        @Override // p153l.kod0
        /* JADX INFO: renamed from: p */
        public void mo20143p(String str, int i2) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121579P(i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0048  */
        /* JADX WARN: Code duplicated, block: B:12:0x0054  */
        /* JADX WARN: Code duplicated, block: B:13:0x0057  */
        /* JADX WARN: Code duplicated, block: B:8:0x0040  */
        @Override // p153l.kod0
        /* JADX INFO: renamed from: q */
        public void mo20144q(String str, int i2, int i3, String str2, String str3, int i4) {
            String str4;
            MMLiveEngine mMLiveEngine;
            super.mo20144q(str, i2, i3, str2, str3, i4);
            MMLiveEngine.m20027M("onRtmpStreamingStateChanged", "stage :" + i2 + ",enableStreamReplace:" + MMLiveEngine.this.f14420u);
            if (MMLiveEngine.this.f14420u) {
                MMLiveEngine mMLiveEngine2 = MMLiveEngine.this;
                if (mMLiveEngine2.m20063K(mMLiveEngine2.f14363J)) {
                    str4 = "up";
                } else if (MMLiveEngine.this.f14420u) {
                    mMLiveEngine = MMLiveEngine.this;
                    if (mMLiveEngine.m20063K(mMLiveEngine.f14363J)) {
                        str4 = "none";
                    } else {
                        str4 = "down";
                    }
                } else {
                    str4 = "none";
                }
            } else if (MMLiveEngine.this.f14420u) {
                mMLiveEngine = MMLiveEngine.this;
                if (mMLiveEngine.m20063K(mMLiveEngine.f14363J)) {
                    str4 = "down";
                } else {
                    str4 = "none";
                }
            } else {
                str4 = "none";
            }
            b7y.m102882c().m102889h(new b7y.C15943b(i2, i3, str2, str4, str3, i4, str));
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$o */
    public class C4026o implements yuf {
        public C4026o() {
        }

        @Override // p153l.yuf
        /* JADX INFO: renamed from: a */
        public void mo20145a(byte[][] bArr) {
            MMLiveEngine.this.f14416s.m121598h(bArr);
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$p */
    public class C4027p implements MRtcEventHandler {
        public C4027p() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcEventHandler
        public void onAudioMixingFinished() {
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                if (Long.valueOf(MMLiveEngine.this.f14414r.userId).longValue() == j || Long.valueOf(MMLiveEngine.this.f14398j.getMomoid()).longValue() == j) {
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
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
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                Bundle bundle = new Bundle();
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.setData(bundle);
                if (Long.valueOf(MMLiveEngine.this.f14414r.userId).longValue() == j || Long.valueOf(MMLiveEngine.this.f14398j.getMomoid()).longValue() == j) {
                    messageObtainMessage.what = 5010;
                    if (MMLiveEngine.this.f14414r != null) {
                        bundle.putString("channel", MMLiveEngine.this.f14414r.channel);
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
            Handler handler = MMLiveEngine.this.f14412q;
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
    public class C4028q implements fb1 {
        public C4028q() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            return MMLiveEngine.this.f14416s != null ? MMLiveEngine.this.f14416s.m121590c(oxd0Var) : oxd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$r */
    public class C4029r implements ib4.InterfaceC17689l {
        public C4029r() {
        }

        @Override // p153l.ib4.InterfaceC17689l
        /* JADX INFO: renamed from: K */
        public void mo20146K(byte[] bArr, int i, int i2) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.mo121596g(bArr, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s */
    public class C4030s implements f5m {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ inw f14480a;

            public a(inw inwVar) {
                this.f14480a = inwVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121599h0(this.f14480a);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$s$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ MMLiveSubtitleState f14482a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ MMLiveSubtitleErrorCode f14483b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f14484c;

            public b(MMLiveSubtitleState mMLiveSubtitleState, MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode, String str) {
                this.f14482a = mMLiveSubtitleState;
                this.f14483b = mMLiveSubtitleErrorCode;
                this.f14484c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.m121601i0(this.f14482a, this.f14483b, this.f14484c);
                }
            }
        }

        public C4030s() {
        }

        @Override // p153l.f5m
        /* JADX INFO: renamed from: a */
        public void mo20147a(MMLiveSubtitleState mMLiveSubtitleState, MMLiveSubtitleErrorCode mMLiveSubtitleErrorCode, String str) {
            if (MMLiveEngine.this.f14412q == null) {
                return;
            }
            MMLiveEngine.this.f14412q.post(new b(mMLiveSubtitleState, mMLiveSubtitleErrorCode, str));
        }

        @Override // p153l.f5m
        /* JADX INFO: renamed from: b */
        public void mo20148b(inw inwVar) {
            if (MMLiveEngine.this.f14412q == null) {
                return;
            }
            MMLiveEngine.this.f14412q.post(new a(inwVar));
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$t */
    public class C4031t extends fpf0 {
        public C4031t() {
        }

        @Override // p153l.fpf0
        /* JADX INFO: renamed from: a */
        public void mo20149a(String str, String str2, String str3) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.mo121578O(str, str2, str3);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$u */
    public class C4032u implements l6m.InterfaceC18358a {
        public C4032u() {
        }

        @Override // p153l.l6m.InterfaceC18358a
        /* JADX INFO: renamed from: a */
        public void mo20150a(int i, Bundle bundle) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121585X(i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$v */
    public static /* synthetic */ class C4033v {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f14488a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f14489b;

        static {
            int[] iArr = new int[MomoCodec.MomoCodecState.values().length];
            f14489b = iArr;
            try {
                iArr[MomoCodec.MomoCodecState.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14489b[MomoCodec.MomoCodecState.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14489b[MomoCodec.MomoCodecState.WAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MMLiveRoomParams.MMLivePushType.values().length];
            f14488a = iArr2;
            try {
                iArr2[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14488a[MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$w */
    public class C4034w extends TimerTask {
        public C4034w() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            esx.m122396a("MMLiveEngine", "traceLogTimer start.");
            MMLiveEngine.this.m20046x();
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x */
    public class C4035x implements MRtcChannelHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("onRequestChannelKey");
                    MMLiveEngine.this.f14416s.mo121595f0(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$x$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14493a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ byte[] f14494b;

            public b(int i, byte[] bArr) {
                this.f14493a = i;
                this.f14494b = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.mo48177U(this.f14493a, this.f14494b);
                }
            }
        }

        public C4035x() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onRequestChannelKey() {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a());
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onStreamMessage(int i, int i2, byte[] bArr) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new b(i, bArr));
            }
        }

        @Override // com.immomo.mediacore.coninf.MRtcChannelHandler
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$y */
    public class C4036y implements MRtcTokenWillExpireHander {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$y$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.m20027M("onTokenPrivilegeWillExpire");
                    MMLiveEngine.this.f14416s.mo121603j0(MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        public C4036y() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcTokenWillExpireHander
        public void onTokenPrivilegeWillExpire(String str) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$z */
    public class C4037z implements MRtcReceiveSeiHandler {

        /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$z$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ byte[] f14499a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f14500b;

            public a(byte[] bArr, long j) {
                this.f14499a = bArr;
                this.f14500b = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MMLiveEngine.this.f14416s != null) {
                    MMLiveEngine.this.f14416s.mo121580Q(new String(this.f14499a), String.valueOf(this.f14500b), MMLiveEngine.this.f14414r.linkType);
                }
            }
        }

        public C4037z() {
        }

        @Override // com.immomo.mediacore.coninf.MRtcReceiveSeiHandler
        public void OnReceiveH264Sei(byte[] bArr, long j, String str) {
            Handler handler = MMLiveEngine.this.f14412q;
            if (handler != null) {
                handler.post(new a(bArr, j));
            }
        }
    }

    public MMLiveEngine(MMLiveUserConfig mMLiveUserConfig, @NonNull Context context) {
        bsx bsxVar;
        this.f14398j = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        if (mMLiveUserConfig != null) {
            this.f14398j = mMLiveUserConfig;
        } else {
            this.f14398j = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        }
        this.f14396i = new WeakReference<>(context);
        l26.m152569a(context.getApplicationContext());
        XEnginePreferences.setApplicationContext(context.getApplicationContext());
        this.f14414r = new MMLiveRoomParams();
        this.f14412q = new HandlerC4015d0(Looper.getMainLooper());
        m20058G();
        brx brxVar = new brx();
        brxVar.m106183o(this.f14398j.getAppid());
        brxVar.m106189u(this.f14398j.getMomoid());
        brxVar.m106187s(this.f14398j.getRoomid());
        brxVar.m106188t(this.f14398j.getSecret());
        brxVar.m106182n(this.f14398j.getAppVersion());
        brxVar.m106185q(this.f14398j.getAppPatch());
        this.f14404m = d410.m114077n(context.getApplicationContext(), brxVar);
        b7y.m102882c().m102896o(this.f14398j.getAppid(), this.f14398j.getSecret());
        b7y.m102882c().m102894m(arx.m99789d().m99796g(this.f14398j.getAppid()));
        b7y.m102882c().m102895n(this.f14398j.getMomoid());
        b7y.m102882c().m102893l(this.f14398j.getRoomid());
        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f14398j.getAppid());
        if (c15814dM99797h != null && (bsxVar = c15814dM99797h.f73012e) != null) {
            this.f14402l.f175483g0 = bsxVar.f78242X == 1;
        }
        this.f14404m.mo21179y(this.f14402l);
        arx.m99789d().m99800o(y310.m214113a());
        MMLiveSource mMLiveSource = new MMLiveSource(this.f14404m, context.getApplicationContext(), this.f14398j);
        this.f14406n = mMLiveSource;
        mMLiveSource.m20181P(new C4022k());
        this.f14406n.m20174I(new C4023l());
        csx.m112235R().m112383s1(true);
        this.f14404m.mo21159e(this.f14393g0);
        this.f14404m.mo21140A(this.f14397i0);
        this.f14404m.mo21161g(this.f14399j0);
        this.f14404m.mo21160f(this.f14395h0);
        this.f14406n.m20167B(this.f14362I);
        this.f14406n.m20183R(this.f14403l0);
        arx.C15814d c15814dM99797h2 = arx.m99789d().m99797h(this.f14398j.getAppid());
        if (c15814dM99797h2 != null && c15814dM99797h2.f73012e != null) {
            vnk0.m201997a().m202001e(c15814dM99797h2.f73012e);
        }
        if (c15814dM99797h2 != null) {
            this.f14354A = new a320(this.f14398j.getAppid(), this.f14398j.getSecret(), this.f14398j.getMomoid(), this.f14398j.getRoomid(), "", "", arx.m99789d().m99796g(this.f14398j.getAppid()), "", String.valueOf(hashCode()), "");
        } else {
            b7y.m102882c().m102888g("MMLiveEning constr userConfig1 == null, not create MyHttpMediaLogsUpload");
        }
        if (this.f14426z == null) {
            Timer timer = new Timer();
            this.f14426z = timer;
            timer.scheduleAtFixedRate(new C4034w(), 200L, 10000L);
        }
        csx.m112235R().m112244C1(1);
        m20027M("MMLiveEngine", mMLiveUserConfig != null ? mMLiveUserConfig.toString() : "");
    }

    /* JADX INFO: renamed from: E0 */
    private int m20022E0(MMLiveMediaConfig mMLiveMediaConfig, String str) {
        m20027M("startPush", mMLiveMediaConfig == null ? "" : mMLiveMediaConfig.toString());
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m131005n();
            this.f14408o = null;
        }
        this.f14400k = mMLiveMediaConfig;
        this.f14408o = new gnw(this.f14404m, this.f14398j);
        if (this.f14414r == null) {
            this.f14414r = new MMLiveRoomParams();
        }
        MMLiveRoomParams mMLiveRoomParams = this.f14414r;
        MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        mMLiveRoomParams.linkType = mMLivePushType;
        this.f14363J = mMLivePushType;
        this.f14375V = false;
        MMLiveSource mMLiveSource = this.f14406n;
        MMLiveMediaConfig mMLiveMediaConfig2 = this.f14400k;
        mMLiveSource.m20180O(mMLiveMediaConfig2.encodeWidth, mMLiveMediaConfig2.encodeHeight);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20264x(true);
        }
        fpf0 fpf0Var = this.f14419t0;
        if (fpf0Var != null) {
            this.f14408o.m131000i(fpf0Var);
        }
        if (this.f14408o != null) {
            C4055a c4055a2 = this.f14410p;
            if (c4055a2 != null) {
                c4055a2.m20250j(false);
            }
            m20092i0(this.f14418t);
            int i = this.f14364K;
            if (i != 0) {
                this.f14408o.m130999h(i);
            }
            this.f14408o.m131002k(this.f14413q0);
            m20045u(mMLiveMediaConfig);
            this.f14408o.m131003l(mMLiveMediaConfig, str);
            this.f14406n.m20207u().mo21118l(0);
            this.f14408o.m130993a(this.f14381a0);
        }
        if (this.f14420u) {
            m20112x0(true);
        }
        return 0;
    }

    /* JADX INFO: renamed from: H */
    private void m20023H() {
        MMLiveRoomParams mMLiveRoomParams = this.f14414r;
        if (mMLiveRoomParams != null) {
            MMLiveRoomParams.MMRenderViewType mMRenderViewType = mMLiveRoomParams.renderViewType;
            if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.SurfaceViewOut) {
                this.f14409o0 = new C4008a();
            } else if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.TextureViewOut) {
                this.f14411p0 = new C4010b();
            } else if (mMRenderViewType == MMLiveRoomParams.MMRenderViewType.SurfaceTextureOut) {
                this.f14407n0 = new C4012c();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private boolean m20024I() {
        return this.f14410p != null;
    }

    /* JADX INFO: renamed from: J */
    private boolean m20025J() {
        return this.f14408o != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public int m20026L0(int i, int i2, int i3) {
        m20027M("transWhatCode", Integer.valueOf(i), Integer.valueOf(i2));
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
    public static void m20027M(Object... objArr) {
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
        ArrayList<String> arrayList = f14353v0;
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
    private void m20045u(MMLiveMediaConfig mMLiveMediaConfig) {
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig = this.f14366M;
        if (mMLiveVideoEncoderConfig != null) {
            mMLiveVideoEncoderConfig.encodeWidth = mMLiveMediaConfig.encodeWidth;
            mMLiveVideoEncoderConfig.encodeHeight = mMLiveMediaConfig.encodeHeight;
            mMLiveVideoEncoderConfig.videoBitRate = mMLiveMediaConfig.videoBitRate;
            mMLiveVideoEncoderConfig.videoFPS = mMLiveMediaConfig.videoFPS;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m20046x() {
        StringBuilder sb;
        ArrayList<String> arrayList;
        esx.m122399d("MMLiveEngine", "flushMediaLogs");
        ArrayList<String> arrayList2 = f14353v0;
        synchronized (arrayList2) {
            try {
                if (arrayList2.size() > 0) {
                    sb = new StringBuilder();
                    int i = 0;
                    while (true) {
                        arrayList = f14353v0;
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
                    if (sb.length() > 0 && this.f14354A != null) {
                        this.f14354A.mo20149a("nonConf", "v2.mediaLogs", fvx.m127737w(Long.valueOf(System.currentTimeMillis()), "traceLog", "[" + sb.toString().replace(com.clevertap.android.sdk.Constants.AES_SUFFIX, ")") + com.clevertap.android.sdk.Constants.AES_SUFFIX));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public zmw m20047A() {
        MMLiveSource mMLiveSource;
        if (this.f14370Q != null && (mMLiveSource = this.f14406n) != null && mMLiveSource.m20205s() != null) {
            this.f14370Q.m220494K(this.f14406n.m20205s().mo124852c()).m220484A(this.f14406n.m20205s().mo124854d()).m220493J(this.f14406n.m20205s().mo124859h()).m220495L(this.f14406n.m20205s().mo124858g());
        }
        return ww5.m208152b(this.f14370Q);
    }

    /* JADX INFO: renamed from: A0 */
    public void m20048A0(String str) {
        this.f14357D = str;
        m20027M("setVideoMixerBackgroundImgUrl url:" + str);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20236Y(str);
        }
    }

    /* JADX INFO: renamed from: B */
    public float m20049B() {
        return this.f14386d;
    }

    /* JADX INFO: renamed from: B0 */
    public void m20050B0(String str) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20192a0(str);
        }
    }

    /* JADX INFO: renamed from: C */
    public mob0 m20051C() {
        return m20025J() ? this.f14408o.m130996d() : m20024I() ? this.f14410p.m20255o() : null;
    }

    /* JADX INFO: renamed from: C0 */
    public void m20052C0(zmw zmwVar) {
        if (zmwVar == null) {
            m20027M("startCamera", "MMLiveCameraConfiguration is NULL");
            return;
        }
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null && mMLiveSource.m20208w()) {
            m20027M("startCamera", "camera is already start");
            ror parameters = this.f14404m.getParameters();
            this.f14406n.m20180O(parameters.f175494m, parameters.f175496n);
            this.f14406n.m20193b0(zmwVar.m220503d(), zmwVar.m220516q());
            return;
        }
        m20027M("startCamera", "cameraID: " + zmwVar.m220503d() + " cameraWidth: " + zmwVar.m220504e() + " cameraHeight: " + zmwVar.m220502c() + " cameraFPS: " + zmwVar.m220501b());
        ror rorVar = this.f14402l;
        if (rorVar != null) {
            rorVar.f175512w = zmwVar.m220504e();
            this.f14402l.f175513x = zmwVar.m220502c();
        }
        if (this.f14406n != null) {
            ror parameters2 = this.f14404m.getParameters();
            this.f14406n.m20179N(zmwVar.m220504e(), zmwVar.m220502c());
            this.f14406n.m20180O(parameters2.f175494m, parameters2.f175496n);
            this.f14406n.m20177L(zmwVar.m220501b());
            this.f14406n.m20193b0(zmwVar.m220503d(), zmwVar.m220516q());
        }
        m20070O0(zmwVar);
    }

    /* JADX INFO: renamed from: D */
    public MMLiveRoomParams.MMLivePushType m20053D(c4m c4mVar) {
        MMLiveRoomParams.MMLivePushType mMLivePushType = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
        if (c4mVar == null) {
            return mMLivePushType;
        }
        if (c4mVar instanceof t410) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfNONE;
        }
        if (c4mVar instanceof uc0) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
        if (c4mVar instanceof xmj0) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        }
        if (c4mVar instanceof ce00) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
        }
        return c4mVar instanceof ymp0 ? MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc : mMLivePushType;
    }

    /* JADX INFO: renamed from: D0 */
    public int m20054D0(MMLiveMediaConfig mMLiveMediaConfig) {
        return m20022E0(mMLiveMediaConfig, mMLiveMediaConfig.sei);
    }

    /* JADX INFO: renamed from: E */
    public float m20055E() {
        return this.f14382b;
    }

    /* JADX INFO: renamed from: F */
    public MMLiveVideoEncoderConfig m20056F() {
        return this.f14366M;
    }

    /* JADX INFO: renamed from: F0 */
    public void m20057F0() {
        m20027M("stopAllEffect");
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20194c0();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m20058G() {
        ror rorVar = new ror();
        this.f14402l = rorVar;
        rorVar.f180162G0 = true;
        rorVar.f175462S = 64000;
        rorVar.f175461R = 2;
        rorVar.f175459P = 44100;
        rorVar.f175494m = 360;
        rorVar.f175496n = 640;
        rorVar.f175490k = 360;
        rorVar.f175492l = 640;
        rorVar.f175510u = 360;
        rorVar.f175511v = 640;
        rorVar.f175478e = 360;
        rorVar.f175480f = 640;
        rorVar.f175451H = 1200000;
        rorVar.f180159D0 = 20;
        rorVar.f180160E0 = 15;
    }

    /* JADX INFO: renamed from: G0 */
    public void m20059G0() {
        if (this.f14406n != null) {
            m20027M("MMLiveEngine", "stopPreview");
            this.f14406n.m20197f0();
            this.f14370Q = null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m20060H0(int i) {
        m20027M("stopEffect", Integer.valueOf(i));
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20195d0(i);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m20061I0() {
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m131006o();
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20239a0();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m20062J0() {
        m20027M("stopPush");
        if (csx.m112235R().m112321c()) {
            gnw gnwVar = this.f14408o;
            if (gnwVar != null) {
                gnwVar.m130995c(false);
                this.f14408o.m131005n();
                this.f14408o = null;
            }
            if (this.f14420u) {
                C4055a c4055a = this.f14410p;
                if (c4055a != null) {
                    c4055a.m20251k(false);
                }
                this.f14420u = false;
            }
        } else {
            if (this.f14420u) {
                gnw gnwVar2 = this.f14408o;
                if (gnwVar2 != null) {
                    gnwVar2.m130994b(false);
                }
                C4055a c4055a2 = this.f14410p;
                if (c4055a2 != null) {
                    c4055a2.m20251k(false);
                }
                this.f14420u = false;
            }
            gnw gnwVar3 = this.f14408o;
            if (gnwVar3 != null) {
                gnwVar3.m131005n();
                this.f14408o = null;
            }
        }
        this.f14375V = false;
        if (!m20024I()) {
            this.f14363J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
        }
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20190Y(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m20063K(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        return mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
    }

    /* JADX INFO: renamed from: K0 */
    public int m20064K0() {
        m20027M(BLiveButtonType.switchCamera);
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            this.f14370Q = ww5.m208151a(mMLiveSource.m20198g0(), this.f14370Q);
        }
        zmw zmwVar = this.f14370Q;
        if (zmwVar != null) {
            return zmwVar.m220503d();
        }
        return 1;
    }

    /* JADX INFO: renamed from: L */
    public void m20065L() {
        m20027M("leaveRoom");
        if (this.f14420u) {
            gnw gnwVar = this.f14408o;
            if (gnwVar != null) {
                gnwVar.m130994b(false);
            }
            C4055a c4055a = this.f14410p;
            if (c4055a != null) {
                c4055a.m20251k(false);
            }
        }
        C4055a c4055a2 = this.f14410p;
        if (c4055a2 != null) {
            c4055a2.m20258r();
            this.f14410p = null;
        }
        this.f14420u = false;
        if (m20025J()) {
            return;
        }
        this.f14363J = MMLiveRoomParams.MMLivePushType.MMLiveTypeDefault;
    }

    /* JADX INFO: renamed from: M0 */
    public int m20066M0(String str) {
        m20027M("unaccrossOtherRoom", str);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            return c4055a.m20241b0(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public long m20067N() {
        if (this.f14410p != null && m20063K(this.f14363J)) {
            return this.f14410p.m20257q();
        }
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20210z();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m20068N0(String str, String str2, float f) {
        m20027M("updateBeautyValue id:" + str + ", key:" + str2 + ", value:" + f);
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20199h0(str, str2, f);
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public long m20069O() {
        if (this.f14410p != null && m20063K(this.f14363J)) {
            return this.f14410p.m20256p();
        }
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20166A();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: O0 */
    public void m20070O0(@NonNull zmw zmwVar) {
        if (this.f14406n == null) {
            m20027M("MMLiveEngine", "updateCameraConfiguration mLiveSource: null");
            return;
        }
        m20027M("MMLiveEngine", "updateCameraConfiguration previewWidth: " + zmwVar.m220513n() + " previewHeight: " + zmwVar.m220512m() + " enableCameraRawData: " + zmwVar.m220519t() + " warpType: " + zmwVar.m220517r() + " videoRotation: " + zmwVar.m220515p() + " enableFilterScale: " + zmwVar.m220521v() + " enableBlinkDetect: " + zmwVar.m220518s() + " enableFaceExpressionDetect: " + zmwVar.m220520u());
        if (this.f14370Q == null || (zmwVar.m220513n() != 0 && zmwVar.m220512m() != 0)) {
            ror rorVar = this.f14402l;
            if (rorVar != null) {
                rorVar.f175510u = zmwVar.m220513n();
                this.f14402l.f175511v = zmwVar.m220512m();
            }
            if (this.f14368O == null) {
                this.f14406n.m20173H();
            }
            if (this.f14406n != null && zmwVar.m220513n() != 0 && zmwVar.m220512m() != 0) {
                this.f14406n.m20188W(zmwVar.m220513n(), zmwVar.m220512m());
            }
            zmw zmwVar2 = this.f14370Q;
            if (zmwVar2 != null) {
                zmwVar2.m220496M(zmwVar.m220513n(), zmwVar.m220512m());
            }
        }
        if (this.f14370Q != null && zmwVar.m220505f() != this.f14370Q.m220505f()) {
            MMLiveSource mMLiveSource = this.f14406n;
            if (mMLiveSource != null && mMLiveSource.m20205s() != null) {
                this.f14406n.m20205s().mo124850b(zmwVar.m220505f());
            }
            zmw zmwVar3 = this.f14370Q;
            if (zmwVar3 != null) {
                zmwVar3.m220484A(zmwVar.m220505f());
            }
        }
        if (this.f14370Q != null && zmwVar.m220500a() != this.f14370Q.m220500a()) {
            MMLiveSource mMLiveSource2 = this.f14406n;
            if (mMLiveSource2 != null && mMLiveSource2.m20205s() != null) {
                this.f14406n.m20205s().mo124860m(zmwVar.m220500a());
            }
            zmw zmwVar4 = this.f14370Q;
            if (zmwVar4 != null) {
                zmwVar4.m220523x(zmwVar.m220500a());
            }
        }
        if (this.f14370Q != null && zmwVar.m220506g() != this.f14370Q.m220506g()) {
            MMLiveSource mMLiveSource3 = this.f14406n;
            if (mMLiveSource3 != null && mMLiveSource3.m20205s() != null) {
                this.f14406n.m20205s().setExposureCompensation(zmwVar.m220506g());
            }
            zmw zmwVar5 = this.f14370Q;
            if (zmwVar5 != null) {
                zmwVar5.m220490G(zmwVar.m220506g());
            }
        }
        if (this.f14370Q != null && zmwVar.m220519t() != this.f14370Q.m220519t()) {
            MMLiveSource mMLiveSource4 = this.f14406n;
            if (mMLiveSource4 != null && mMLiveSource4.m20205s() != null) {
                this.f14406n.m20178M(zmwVar.m220519t() ? this.f14415r0 : null);
            }
            zmw zmwVar6 = this.f14370Q;
            if (zmwVar6 != null) {
                zmwVar6.m220486C(zmwVar.m220519t());
            }
        }
        if (this.f14370Q != null && zmwVar.m220517r() != this.f14370Q.m220517r()) {
            MMLiveSource mMLiveSource5 = this.f14406n;
            if (mMLiveSource5 != null) {
                mMLiveSource5.m20191Z(zmwVar.m220517r());
            }
            zmw zmwVar7 = this.f14370Q;
            if (zmwVar7 != null) {
                zmwVar7.m220499P(zmwVar.m220517r());
            }
        }
        if (this.f14370Q != null && zmwVar.m220515p() != this.f14370Q.m220515p()) {
            MMLiveSource mMLiveSource6 = this.f14406n;
            if (mMLiveSource6 != null) {
                mMLiveSource6.m20189X(zmwVar.m220515p());
            }
            zmw zmwVar8 = this.f14370Q;
            if (zmwVar8 != null) {
                zmwVar8.m220498O(zmwVar.m220515p());
            }
        }
        if (this.f14370Q != null && zmwVar.m220521v() != this.f14370Q.m220521v()) {
            MMLiveSource mMLiveSource7 = this.f14406n;
            if (mMLiveSource7 != null) {
                mMLiveSource7.m20185T(zmwVar.m220521v());
            }
            zmw zmwVar9 = this.f14370Q;
            if (zmwVar9 != null) {
                zmwVar9.m220488E(zmwVar.m220521v());
            }
        }
        if (this.f14370Q != null && zmwVar.m220518s() != this.f14370Q.m220518s()) {
            MMLiveSource mMLiveSource8 = this.f14406n;
            if (mMLiveSource8 != null) {
                mMLiveSource8.m20176K(zmwVar.m220518s());
            }
            zmw zmwVar10 = this.f14370Q;
            if (zmwVar10 != null) {
                zmwVar10.m220485B(zmwVar.m220518s());
            }
        }
        if (this.f14370Q != null && zmwVar.m220520u() != this.f14370Q.m220520u()) {
            MMLiveSource mMLiveSource9 = this.f14406n;
            if (mMLiveSource9 != null) {
                mMLiveSource9.m20182Q(zmwVar.m220520u());
            }
            zmw zmwVar11 = this.f14370Q;
            if (zmwVar11 != null) {
                zmwVar11.m220487D(zmwVar.m220520u());
            }
        }
        if (this.f14370Q != null && zmwVar.m220507h() != this.f14370Q.m220507h()) {
            MMLiveSource mMLiveSource10 = this.f14406n;
            if (mMLiveSource10 != null && mMLiveSource10.m20206t() != null) {
                this.f14406n.m20206t().mo122379s(zmwVar.m220507h());
            }
            zmw zmwVar12 = this.f14370Q;
            if (zmwVar12 != null) {
                zmwVar12.m220491H(zmwVar.m220507h());
            }
        }
        if (this.f14370Q != null && zmwVar.m220522w() != this.f14370Q.m220522w()) {
            MMLiveSource mMLiveSource11 = this.f14406n;
            if (mMLiveSource11 != null && mMLiveSource11.m20206t() != null) {
                this.f14406n.m20206t().mo122376j(zmwVar.m220522w());
            }
            zmw zmwVar13 = this.f14370Q;
            if (zmwVar13 != null) {
                zmwVar13.m220489F(zmwVar.m220522w());
            }
        }
        if (this.f14370Q != null && zmwVar.m220508i() != this.f14370Q.m220508i()) {
            MMLiveSource mMLiveSource12 = this.f14406n;
            if (mMLiveSource12 != null && mMLiveSource12.m20206t() != null) {
                this.f14406n.m20206t().mo122380u(zmwVar.m220508i());
            }
            zmw zmwVar14 = this.f14370Q;
            if (zmwVar14 != null) {
                zmwVar14.m220492I(zmwVar.m220508i());
            }
        }
        if (this.f14370Q != null && zmwVar.m220514o() != this.f14370Q.m220514o()) {
            MMLiveSource mMLiveSource13 = this.f14406n;
            if (mMLiveSource13 != null && mMLiveSource13.m20205s() != null) {
                this.f14406n.m20205s().mo124861n(zmwVar.m220514o());
            }
            zmw zmwVar15 = this.f14370Q;
            if (zmwVar15 != null) {
                zmwVar15.m220497N(zmwVar.m220514o());
            }
        }
        if (this.f14370Q != null && zmwVar.m220504e() != 0 && zmwVar.m220502c() != 0 && zmwVar.m220504e() != this.f14370Q.m220504e() && zmwVar.m220502c() != this.f14370Q.m220502c()) {
            this.f14370Q.m220525z(zmwVar.m220504e(), zmwVar.m220502c());
        }
        if (this.f14370Q != null && zmwVar.m220501b() != 0 && zmwVar.m220501b() != this.f14370Q.m220501b()) {
            this.f14370Q.m220524y(zmwVar.m220501b());
        }
        if (this.f14370Q == null) {
            this.f14370Q = ww5.m208152b(zmwVar);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m20071P() {
        m20027M("pauseMusic");
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m130998g();
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20259s();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m20072P0(String str) {
        m20027M("updateChannelKey", str);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20243c0(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m20073Q(int i, String str, int i2, double d, double d2, boolean z) {
        m20027M("playEffect", Integer.valueOf(i), str, Integer.valueOf(i2), Double.valueOf(d), Double.valueOf(d2), Boolean.valueOf(z));
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20260t(i, str, i2, d, d2, z);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m20074Q0(String str, String str2, float f) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20200i0(str, str2, f);
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public void m20075R(MMLivePlayMusicConfig mMLivePlayMusicConfig) {
        m20027M("MMLiveEngine playMusic", mMLivePlayMusicConfig.musicUrl, "loopback" + mMLivePlayMusicConfig.playMusicType, "repeatCount:" + mMLivePlayMusicConfig.repeatCount);
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m131004m(mMLivePlayMusicConfig.musicUrl);
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20237Z(mMLivePlayMusicConfig.musicUrl, mMLivePlayMusicConfig.playMusicType == MMLivePlayMusicConfig.MMLivePlayMusicType.MMLivePlayMusicTypePlayout, mMLivePlayMusicConfig.repeatCount);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m20076S() {
        m20027M("release");
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20168C();
            this.f14406n = null;
        }
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m131005n();
            this.f14408o = null;
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20258r();
            this.f14410p = null;
        }
        synchronized (this.f14367N) {
            try {
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14404m;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo21174t();
                    this.f14404m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        WeakReference<Context> weakReference = this.f14396i;
        if (weakReference != null) {
            weakReference.clear();
            this.f14396i = null;
        }
        if (this.f14426z != null) {
            m20046x();
            esx.m122396a("MMLiveEngine", "traceLogTimer release.");
            this.f14426z.cancel();
            this.f14426z = null;
        }
        synchronized (this) {
            try {
                if (this.f14354A != null) {
                    this.f14354A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Handler handler = this.f14412q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14412q = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m20077T(String str) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20169D(str);
        }
    }

    /* JADX INFO: renamed from: U */
    public boolean m20078U(String str, String str2) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20170E(str, str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public void m20079V(MaskModel maskModel) {
        m20027M("remove3DSticker：" + maskModel);
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20171F(maskModel);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m20080W() {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20172G();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m20081X() {
        m20027M("resumeMusic");
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m130998g();
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20261u();
        }
    }

    /* JADX INFO: renamed from: Y */
    public int m20082Y(int i) {
        m20027M("selectAudioIndex:" + i);
        if (m20024I()) {
            return this.f14410p.m20262v(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z */
    public int m20083Z(byte[] bArr) {
        if (m20024I()) {
            return this.f14410p.m20263w(bArr);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a0 */
    public void m20084a0(boolean z) {
        m20027M("setAllRemoteAudioMute", Boolean.valueOf(z));
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20264x(z);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m20085b0(boolean z) {
        m20027M("setAllRemoteVideoMute", Boolean.valueOf(z));
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20265y(z);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public int m20086c0(MomoMediaConstants$MMLiveAudioEffectPreset momoMediaConstants$MMLiveAudioEffectPreset) {
        m20027M("setAudioEffectPreset:" + momoMediaConstants$MMLiveAudioEffectPreset);
        if (m20024I()) {
            return this.f14410p.m20266z(momoMediaConstants$MMLiveAudioEffectPreset.getValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: d0 */
    public int m20087d0(MomoMediaConstants$MMLiveAudioMixingDualMonoMode momoMediaConstants$MMLiveAudioMixingDualMonoMode) {
        m20027M("setAudioMixingDualMonoMode:" + momoMediaConstants$MMLiveAudioMixingDualMonoMode);
        if (m20024I()) {
            return this.f14410p.m20213A(momoMediaConstants$MMLiveAudioMixingDualMonoMode.getValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: e0 */
    public void m20088e0(MomoMediaConstants$BEAUTY_TYPE momoMediaConstants$BEAUTY_TYPE) {
        m20027M("setBeautyType:" + momoMediaConstants$BEAUTY_TYPE);
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20175J(momoMediaConstants$BEAUTY_TYPE);
            this.f14358E = momoMediaConstants$BEAUTY_TYPE;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public int m20089f0(MMLiveRoomParams.MMLiveClientRole mMLiveClientRole) {
        m20027M("setClientRole", mMLiveClientRole);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            return c4055a.m20214B(mMLiveClientRole);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g0 */
    public void m20090g0(boolean z) {
        m20027M("setEnableAudio", Boolean.valueOf(z));
        this.f14423w = z;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20216D(z);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m20091h0(MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig) {
        m20027M("enableAudioVolumeIndication", Integer.valueOf(mMLiveAudioVolumeConfig.interval), Integer.valueOf(mMLiveAudioVolumeConfig.smooth), Integer.valueOf(mMLiveAudioVolumeConfig.report_vad));
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20248h(mMLiveAudioVolumeConfig.interval, mMLiveAudioVolumeConfig.smooth, mMLiveAudioVolumeConfig.report_vad);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m20092i0(boolean z) {
        m20027M("enableInEarMonitoring:" + z);
        this.f14418t = z;
        if (m20024I() && m20063K(this.f14363J)) {
            this.f14410p.m20250j(z);
            return;
        }
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20190Y(z);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m20093j0(boolean z) {
        m20027M("setEnableSpeakerphone", Boolean.valueOf(z));
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20217E(z);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m20094k0(boolean z) {
        m20027M("enableStreamReplace", Boolean.valueOf(z));
        this.f14420u = z;
    }

    /* JADX INFO: renamed from: l0 */
    public void m20095l0(boolean z) {
        m20027M("setEnableVideo", Boolean.valueOf(z));
        this.f14422v = z;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20218F(z);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m20096m0(float f) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20184S(f);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m20097n0(MMLiveTranscoding mMLiveTranscoding) {
        m20027M("setLiveTranscoding V2");
        this.f14365L = mMLiveTranscoding;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20220H(mMLiveTranscoding);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m20098o0(boolean z) {
        m20027M("setLocalAudioMute", Boolean.valueOf(z));
        this.f14425y = z;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20221I(z);
        }
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m131001j(z);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m20099p0(boolean z) {
        m20027M("setLocalVideoMute", Boolean.valueOf(z));
        this.f14424x = z;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20223K(z);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m20100q0(String str) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20186U(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public int m20101r(String str, String str2, String str3) {
        m20027M("accrossOtherRoom", str, str2, str3);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            return c4055a.m20238a(str, str2, str3);
        }
        return -1;
    }

    /* JADX INFO: renamed from: r0 */
    public void m20102r0(float f) {
        m20027M("MMLiveEngine setMusicVolume", Float.valueOf(f));
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20187V(f);
        }
        this.f14386d = f;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20225M((int) (f * 100.0f));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m20103s(String str, MaskModel maskModel) {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20202p(str, maskModel);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m20104s0(String str) {
        m20027M("MMLiveEngine setParameters", str);
        m20027M("setParameters", str);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20228P(str);
        } else {
            this.f14374U.add(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m20105t(MaskModel maskModel) {
        m20027M("add3DSticker：" + maskModel);
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            mMLiveSource.m20203q(maskModel);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m20106t0(enw enwVar) {
        this.f14416s = enwVar;
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20234W(this.f14405m0, this.f14409o0, this.f14407n0);
            this.f14410p.m20233V(this.f14401k0);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m20107u0(float f) {
        this.f14382b = f;
        m20027M("setRecordVolume volume:" + f);
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20224L(f);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m20108v(boolean z) {
        m20027M("enablePusherStatisticWatch" + z);
        if (z) {
            this.f14419t0 = new C4031t();
        } else {
            this.f14419t0 = null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m20109v0(int i, boolean z) {
        C4055a c4055a;
        m20027M("setRemoteAudioStreamMute", Integer.valueOf(i), Boolean.valueOf(z));
        try {
            MMLiveRoomParams mMLiveRoomParams = this.f14414r;
            if ((mMLiveRoomParams == null || Integer.valueOf(mMLiveRoomParams.userId).intValue() != i) && (c4055a = this.f14410p) != null) {
                c4055a.m20229R(i, z);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public int m20110w(MMLiveMediaConfig mMLiveMediaConfig, MMLiveRoomParams mMLiveRoomParams, MMLiveTranscoding mMLiveTranscoding) {
        String str;
        String string = mMLiveMediaConfig == null ? "" : mMLiveMediaConfig.toString();
        String string2 = mMLiveRoomParams != null ? mMLiveRoomParams.toString() : "";
        if (mMLiveTranscoding == null) {
            str = "transcodeing is null";
        } else {
            str = "transcodeing:" + mMLiveTranscoding.toString2();
        }
        m20027M("enterRoom", string, string2, str);
        int iM20253m = 0;
        if (mMLiveRoomParams.onlyAudio) {
            m20099p0(true);
            m20095l0(false);
        }
        this.f14365L = mMLiveTranscoding;
        this.f14400k = mMLiveMediaConfig;
        this.f14414r = mMLiveRoomParams;
        if (this.f14410p != null) {
            m20027M("rtc not null , leaveRoom first");
            this.f14410p.m20258r();
            this.f14410p = null;
        }
        MMLiveRoomParams.MMLivePushType mMLivePushType = this.f14414r.linkType;
        if (mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfWL || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX || mMLivePushType == MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM) {
            enw enwVar = this.f14416s;
            if (enwVar != null) {
                enwVar.mo48182o(mMLivePushType, new MMLiveErrorInfo(Constants.RHYTHM_PLAYER_STATE_PLAYING, 100, kg60.m149742a(mMLivePushType, Constants.RHYTHM_PLAYER_STATE_PLAYING, 100)));
            }
            b7y.m102882c().m102887f("enterRoom", "linkType", String.valueOf(this.f14414r.linkType));
            return -2;
        }
        int i = C4033v.f14488a[mMLivePushType.ordinal()];
        if (i == 1 || i == 2) {
            this.f14410p = new C4055a(this.f14404m, this.f14398j, this.f14414r.linkType);
        }
        this.f14363J = this.f14414r.linkType;
        m20023H();
        try {
            if (this.f14410p != null) {
                MMLiveSource mMLiveSource = this.f14406n;
                if (mMLiveSource != null) {
                    mMLiveSource.m20190Y(false);
                }
                this.f14410p.m20242c(this.f14376W);
                this.f14410p.m20246f(this.f14377X);
                this.f14410p.m20247g(this.f14378Y);
                this.f14410p.m20245e(this.f14383b0);
                this.f14410p.m20240b(this.f14381a0);
                this.f14410p.m20234W(this.f14405m0, this.f14409o0, this.f14407n0);
                this.f14410p.m20235X(this.f14411p0);
                this.f14410p.m20233V(this.f14401k0);
                m20092i0(this.f14418t);
                this.f14410p.m20218F(this.f14422v);
                this.f14410p.m20216D(this.f14423w);
                this.f14410p.m20223K(this.f14424x);
                this.f14410p.m20221I(this.f14425y);
                MMLiveSource mMLiveSource2 = this.f14406n;
                if (mMLiveSource2 != null) {
                    MMLiveMediaConfig mMLiveMediaConfig2 = this.f14400k;
                    mMLiveSource2.m20180O(mMLiveMediaConfig2.encodeWidth, mMLiveMediaConfig2.encodeHeight);
                }
                this.f14355B = mMLiveRoomParams.audioProfile;
                this.f14356C = mMLiveRoomParams.audioScenario;
                this.f14410p.m20219G(this.f14419t0);
                this.f14410p.m20236Y(this.f14357D);
                this.f14410p.m20249i(this.f14360G, this.f14359F);
                this.f14410p.m20252l(this.f14361H);
                this.f14410p.m20244d(this.f14379Z);
                if (!TextUtils.isEmpty(this.f14388e)) {
                    this.f14410p.m20222J(this.f14388e);
                }
                this.f14410p.m20227O(this.f14413q0);
                this.f14410p.m20226N(this.f14390f);
                this.f14410p.m20232U(this.f14414r.enableFullTimeMode);
                MomoMediaConstants$MMLiveSimulcastStreamMode momoMediaConstants$MMLiveSimulcastStreamMode = this.f14371R;
                if (momoMediaConstants$MMLiveSimulcastStreamMode != MomoMediaConstants$MMLiveSimulcastStreamMode.NO_SET && this.f14372S != null) {
                    this.f14410p.m20215C(momoMediaConstants$MMLiveSimulcastStreamMode.getValue(), this.f14372S);
                }
                MomoMediaConstants$MMLiveSimulcastStreamType momoMediaConstants$MMLiveSimulcastStreamType = this.f14373T;
                if (momoMediaConstants$MMLiveSimulcastStreamType != MomoMediaConstants$MMLiveSimulcastStreamType.DEFAULT) {
                    this.f14410p.m20230S(momoMediaConstants$MMLiveSimulcastStreamType.getValue());
                }
                Iterator<String> it = this.f14374U.iterator();
                while (it.hasNext()) {
                    this.f14410p.m20228P(it.next());
                }
                m20045u(mMLiveMediaConfig);
                iM20253m = this.f14410p.m20253m(mMLiveMediaConfig, this.f14414r, mMLiveTranscoding);
                MMLiveSource mMLiveSource3 = this.f14406n;
                if (mMLiveSource3 != null) {
                    mMLiveSource3.m20207u().mo21118l(1);
                }
                b7y.m102882c().m102891j(mMLiveMediaConfig.businessType);
            } else {
                enw enwVar2 = this.f14416s;
                if (enwVar2 != null) {
                    MMLiveRoomParams.MMLivePushType mMLivePushType2 = this.f14414r.linkType;
                    enwVar2.mo48182o(mMLivePushType2, new MMLiveErrorInfo(1000001, 100, kg60.m149742a(mMLivePushType2, 1000001, 100)));
                    iM20253m = -2;
                }
            }
        } catch (NullPointerException unused) {
            enw enwVar3 = this.f14416s;
            if (enwVar3 != null) {
                MMLiveRoomParams.MMLivePushType mMLivePushType3 = this.f14414r.linkType;
                enwVar3.mo48182o(mMLivePushType3, new MMLiveErrorInfo(1000001, 101, kg60.m149742a(mMLivePushType3, 1000001, 101)));
            }
        }
        if (this.f14420u) {
            m20112x0(true);
        }
        return iM20253m;
    }

    /* JADX INFO: renamed from: w0 */
    public void m20111w0(String str) {
        m20027M("MMLiveEngine", "setRestartWithURL:" + str);
        if (m20024I()) {
            this.f14410p.m20231T(str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m20112x0(boolean z) {
        m20027M("setStreamReplaceMode", Boolean.valueOf(z));
        gnw gnwVar = this.f14408o;
        if (gnwVar != null) {
            gnwVar.m130994b(z);
        }
        C4055a c4055a = this.f14410p;
        if (c4055a != null) {
            c4055a.m20251k(z);
        }
    }

    /* JADX INFO: renamed from: y */
    public int m20113y() {
        m20027M("getAudioTrackCount");
        if (m20024I()) {
            return this.f14410p.m20254n();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y0 */
    public void m20114y0(MMLiveUserConfig mMLiveUserConfig) {
        m20027M("setUserConfig", mMLiveUserConfig == null ? "" : mMLiveUserConfig.toString());
        if (mMLiveUserConfig != null) {
            this.f14398j = mMLiveUserConfig;
        }
    }

    /* JADX INFO: renamed from: z */
    public kpl m20115z() {
        MMLiveSource mMLiveSource = this.f14406n;
        if (mMLiveSource != null) {
            return mMLiveSource.m20204r();
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public void m20116z0(MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig) {
        int i = (mMLiveVideoEncoderConfig.encodeWidth / 2) * 2;
        int i2 = (mMLiveVideoEncoderConfig.encodeHeight / 2) * 2;
        m20027M("setVideoEncoderConfig", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(mMLiveVideoEncoderConfig.videoBitRate));
        MMLiveVideoEncoderConfig mMLiveVideoEncoderConfig2 = this.f14366M;
        mMLiveVideoEncoderConfig2.encodeWidth = mMLiveVideoEncoderConfig.encodeWidth;
        mMLiveVideoEncoderConfig2.encodeHeight = mMLiveVideoEncoderConfig.encodeHeight;
        mMLiveVideoEncoderConfig2.videoFPS = mMLiveVideoEncoderConfig.videoFPS;
        mMLiveVideoEncoderConfig2.videoBitRate = mMLiveVideoEncoderConfig.videoBitRate;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.f14404m;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.getParameters().f175494m = i;
            ror parameters = this.f14404m.getParameters();
            parameters.f175494m = i;
            parameters.f175496n = i2;
            parameters.f175451H = mMLiveVideoEncoderConfig.videoBitRate;
            parameters.f180174S0 = mMLiveVideoEncoderConfig.videoFPS;
            MMLiveSource mMLiveSource = this.f14406n;
            if (mMLiveSource != null) {
                mMLiveSource.m20180O(i, i2);
            }
            if (this.f14368O != null) {
                this.f14404m.mo21157c(parameters);
                this.f14404m.mo21162h(parameters, this.f14392g);
                return;
            }
            boolean zM20063K = m20063K(this.f14363J);
            MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.f14404m;
            if (zM20063K) {
                momoPipelineModuleRegister2.mo21170p(parameters);
            } else {
                momoPipelineModuleRegister2.mo21156b(parameters);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.momomediaext.MMLiveEngine$c */
    public class C4012c implements gkl0 {
        public C4012c() {
        }

        @Override // p153l.gkl0
        /* JADX INFO: renamed from: b */
        public void mo20124b(long j, int i) {
            enw unused = MMLiveEngine.this.f14416s;
        }

        @Override // p153l.gkl0
        /* JADX INFO: renamed from: c */
        public void mo20125c(long j, gkl0.InterfaceC17239b interfaceC17239b, int i, int i2) {
            if (MMLiveEngine.this.f14416s != null) {
                MMLiveEngine.this.f14416s.m121581R(j, interfaceC17239b, MMLiveEngine.this.f14414r.linkType);
            }
        }

        @Override // p153l.gkl0
        /* JADX INFO: renamed from: a */
        public void mo20123a(long j, gkl0.InterfaceC17240c interfaceC17240c, int i, int i2) {
        }
    }
}
