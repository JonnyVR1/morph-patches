package com.tencent.liteav;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.audio.InterfaceC14146d;
import com.tencent.liteav.audio.InterfaceC14147e;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p091a.C14166a;
import com.tencent.liteav.basic.p091a.EnumC14167b;
import com.tencent.liteav.basic.p092b.InterfaceC14169a;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.InterfaceC14313f;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.p089a.C14129a;
import com.tencent.liteav.renderer.C14344a;
import com.tencent.liteav.renderer.C14351h;
import com.tencent.liteav.renderer.InterfaceC14350g;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.liteav.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14272f extends AbstractC14284n implements TXCRenderAndDec.InterfaceC14126a, TXCRenderAndDec.InterfaceC14127b, InterfaceC14146d, InterfaceC14147e, InterfaceC14170b, InterfaceC14313f, C14344a.a, InterfaceC14350g {

    /* JADX INFO: renamed from: A */
    private C14351h f60079A;

    /* JADX INFO: renamed from: B */
    private C14351h f60080B;

    /* JADX INFO: renamed from: C */
    private float[] f60081C;

    /* JADX INFO: renamed from: D */
    private float[] f60082D;

    /* JADX INFO: renamed from: E */
    private String f60083E;

    /* JADX INFO: renamed from: F */
    private int f60084F;

    /* JADX INFO: renamed from: G */
    private boolean f60085G;

    /* JADX INFO: renamed from: H */
    private EnumC14167b f60086H;

    /* JADX INFO: renamed from: I */
    private Object f60087I;

    /* JADX INFO: renamed from: J */
    private InterfaceC14169a f60088J;

    /* JADX INFO: renamed from: K */
    private TXLivePlayer.ITXAudioRawDataListener f60089K;

    /* JADX INFO: renamed from: L */
    private String f60090L;

    /* JADX INFO: renamed from: M */
    private boolean f60091M;

    /* JADX INFO: renamed from: N */
    private long f60092N;

    /* JADX INFO: renamed from: O */
    private long f60093O;

    /* JADX INFO: renamed from: P */
    private a f60094P;

    /* JADX INFO: renamed from: e */
    private TXCRenderAndDec f60095e;

    /* JADX INFO: renamed from: f */
    private C14344a f60096f;

    /* JADX INFO: renamed from: g */
    private TXCStreamDownloader f60097g;

    /* JADX INFO: renamed from: h */
    private Handler f60098h;

    /* JADX INFO: renamed from: i */
    private TextureView f60099i;

    /* JADX INFO: renamed from: j */
    private boolean f60100j;

    /* JADX INFO: renamed from: k */
    private boolean f60101k;

    /* JADX INFO: renamed from: l */
    private int f60102l;

    /* JADX INFO: renamed from: m */
    private int f60103m;

    /* JADX INFO: renamed from: n */
    private int f60104n;

    /* JADX INFO: renamed from: o */
    private boolean f60105o;

    /* JADX INFO: renamed from: p */
    private Surface f60106p;

    /* JADX INFO: renamed from: q */
    private int f60107q;

    /* JADX INFO: renamed from: r */
    private int f60108r;

    /* JADX INFO: renamed from: s */
    private int f60109s;

    /* JADX INFO: renamed from: t */
    private boolean f60110t;

    /* JADX INFO: renamed from: u */
    private boolean f60111u;

    /* JADX INFO: renamed from: v */
    private C14129a f60112v;

    /* JADX INFO: renamed from: w */
    private TXRecordCommon.ITXVideoRecordListener f60113w;

    /* JADX INFO: renamed from: x */
    private C14271e f60114x;

    /* JADX INFO: renamed from: y */
    private int f60115y;

    /* JADX INFO: renamed from: z */
    private int f60116z;

    /* JADX INFO: renamed from: com.tencent.liteav.f$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14272f> f60127a;

        public a(C14272f c14272f) {
            this.f60127a = new WeakReference<>(c14272f);
        }

        @Override // java.lang.Runnable
        public void run() {
            C14272f c14272f = this.f60127a.get();
            if (c14272f == null) {
                return;
            }
            c14272f.m84777g();
            c14272f.m84747u();
        }
    }

    public C14272f(Context context) {
        super(context);
        this.f60095e = null;
        this.f60096f = null;
        this.f60097g = null;
        this.f60100j = false;
        this.f60101k = false;
        this.f60102l = 100;
        this.f60103m = 0;
        this.f60104n = 0;
        this.f60105o = false;
        this.f60107q = 2;
        this.f60108r = 48000;
        this.f60109s = 16;
        this.f60110t = false;
        this.f60111u = false;
        this.f60115y = 0;
        this.f60116z = 0;
        this.f60079A = null;
        this.f60080B = null;
        this.f60081C = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.f60082D = new float[16];
        this.f60083E = "";
        this.f60085G = false;
        this.f60086H = EnumC14167b.UNKNOWN;
        this.f60087I = null;
        this.f60088J = new InterfaceC14169a() { // from class: com.tencent.liteav.f.1
            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.m84149e("TXCLivePlayer", "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC14170b> weakReference = C14272f.this.f60276d;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3));
                    }
                    C14272f.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.m84152i("TXCLivePlayer", "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC14170b> weakReference = C14272f.this.f60276d;
                if ((weakReference == null ? null : weakReference.get()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3));
                    }
                    C14272f.this.onNotifyEvent(i, bundle);
                }
            }
        };
        this.f60090L = "";
        this.f60091M = false;
        this.f60092N = 0L;
        this.f60093O = 0L;
        this.f60094P = null;
        C14188c.m84036a().m84062a(context);
        TXCAudioEngine.CreateInstance(context, C14188c.m84036a().m84065b());
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.f60088J));
        long jM84061a = C14188c.m84036a().m84061a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice(jM84061a == 1 || jM84061a == -1);
        this.f60098h = new Handler(Looper.getMainLooper());
        C14344a c14344a = new C14344a();
        this.f60096f = c14344a;
        c14344a.m85100a((InterfaceC14170b) this);
        this.f60094P = new a(this);
    }

    /* JADX INFO: renamed from: b */
    private int m84728b(String str, int i) {
        if (i == 0) {
            this.f60097g = new TXCStreamDownloader(this.f60274b, 1);
        } else if (i == 5) {
            this.f60097g = new TXCStreamDownloader(this.f60274b, 4);
        } else {
            this.f60097g = new TXCStreamDownloader(this.f60274b, 0);
            if (!TextUtils.isEmpty(this.f60273a.f60193l)) {
                this.f60097g.setFlvSessionKey(this.f60273a.f60193l);
            }
        }
        this.f60097g.setID(this.f60090L);
        this.f60097g.setListener(this);
        this.f60097g.setNotifyListener(this);
        this.f60097g.setHeaders(this.f60273a.f60197p);
        TXCStreamDownloader tXCStreamDownloader = this.f60097g;
        if (i == 5) {
            tXCStreamDownloader.setRetryTimes(5);
            this.f60097g.setRetryInterval(1);
        } else {
            tXCStreamDownloader.setRetryTimes(this.f60273a.f60186e);
            this.f60097g.setRetryInterval(this.f60273a.f60187f);
        }
        TXCStreamDownloader tXCStreamDownloader2 = this.f60097g;
        C14274h c14274h = this.f60273a;
        return tXCStreamDownloader2.start(str, c14274h.f60190i, c14274h.f60194m, c14274h.f60191j, c14274h.f60192k);
    }

    /* JADX INFO: renamed from: f */
    private void m84735f(int i) {
        TextureView textureView = this.f60099i;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.f60274b);
        this.f60095e = tXCRenderAndDec;
        tXCRenderAndDec.setNotifyListener(this);
        this.f60095e.setVideoRender(this.f60096f);
        this.f60095e.setDecListener(this);
        this.f60095e.setRenderAndDecDelegate(this);
        this.f60095e.setConfig(this.f60273a);
        this.f60095e.setID(this.f60090L);
        this.f60095e.start(i == 5);
        this.f60095e.setRenderMode(this.f60104n);
        this.f60095e.setRenderRotation(this.f60103m);
    }

    /* JADX INFO: renamed from: j */
    private void m84736j() {
        if (this.f60112v == null) {
            this.f60115y = this.f60096f.m85114i();
            this.f60116z = this.f60096f.m85115j();
            C14129a.a aVarM84738l = m84738l();
            C14129a c14129a = new C14129a(this.f60274b);
            this.f60112v = c14129a;
            c14129a.m83837a(aVarM84738l);
            this.f60112v.m83838a(new C14129a.b() { // from class: com.tencent.liteav.f.2
                @Override // com.tencent.liteav.p089a.C14129a.b
                /* JADX INFO: renamed from: a */
                public void mo83843a(int i, String str, String str2, String str3) {
                    if (C14272f.this.f60113w != null) {
                        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                        if (i == 0) {
                            tXRecordResult.retCode = 0;
                        } else {
                            tXRecordResult.retCode = -1;
                        }
                        tXRecordResult.descMsg = str;
                        tXRecordResult.videoPath = str2;
                        tXRecordResult.coverPath = str3;
                        C14272f.this.f60113w.onRecordComplete(tXRecordResult);
                    }
                    C14272f.this.f60096f.m85039a((InterfaceC14350g) null);
                    C14272f.this.f60096f.m85038a((C14344a.a) null);
                }

                @Override // com.tencent.liteav.p089a.C14129a.b
                /* JADX INFO: renamed from: a */
                public void mo83844a(long j) {
                    if (C14272f.this.f60113w != null) {
                        C14272f.this.f60113w.onRecordProgress(j);
                    }
                }
            });
        }
        if (this.f60079A == null) {
            C14351h c14351h = new C14351h(Boolean.TRUE);
            this.f60079A = c14351h;
            c14351h.m85132b();
            this.f60079A.m85134b(this.f60115y, this.f60116z);
            this.f60079A.m85128a(this.f60115y, this.f60116z);
        }
        if (this.f60080B == null) {
            C14351h c14351h2 = new C14351h(Boolean.FALSE);
            this.f60080B = c14351h2;
            c14351h2.m85132b();
            this.f60080B.m85134b(this.f60096f.m85112g(), this.f60096f.m85113h());
            this.f60080B.m85128a(this.f60096f.m85112g(), this.f60096f.m85113h());
            Matrix.setIdentityM(this.f60082D, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m84737k() {
        C14351h c14351h = this.f60079A;
        if (c14351h != null) {
            c14351h.m85135c();
            this.f60079A = null;
        }
        C14351h c14351h2 = this.f60080B;
        if (c14351h2 != null) {
            c14351h2.m85135c();
            this.f60080B = null;
        }
    }

    /* JADX INFO: renamed from: l */
    private C14129a.a m84738l() {
        int i;
        int i2 = this.f60115y;
        if (i2 <= 0 || (i = this.f60116z) <= 0) {
            i2 = 480;
            i = 640;
        }
        C14129a.a aVar = new C14129a.a();
        aVar.f58810a = i2;
        aVar.f58811b = i;
        aVar.f58812c = 20;
        aVar.f58813d = (int) (Math.sqrt((((double) (i2 * i2)) * 1.0d) + ((double) (i * i))) * 1.2d);
        aVar.f58817h = this.f60107q;
        aVar.f58818i = this.f60108r;
        aVar.f58819j = this.f60109s;
        aVar.f58815f = C14129a.m83831a(this.f60274b, ".mp4");
        aVar.f58816g = C14129a.m83831a(this.f60274b, ".jpg");
        aVar.f58814e = this.f60096f.m85041b();
        TXCLog.m84147d("TXCLivePlayer", "record config: " + aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: m */
    private void m84739m() {
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stop();
            this.f60095e.setVideoRender(null);
            this.f60095e.setDecListener(null);
            this.f60095e.setNotifyListener(null);
            this.f60095e = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m84740n() {
        boolean z = this.f60084F == 5;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(this.f60085G, 300);
        mo84763a(this.f60089K);
        if (this.f60084F == 5) {
            TXCAudioEngine tXCAudioEngine = TXCAudioEngine.getInstance();
            String str = this.f60090L;
            boolean z2 = !this.f60273a.f60188g;
            float f = C14166a.f58891b;
            tXCAudioEngine.setRemoteAudioCacheParams(str, z2, (int) (f * 1000.0f), (int) (f * 1000.0f), (int) (C14166a.f58892c * 1000.0f));
        } else {
            TXCAudioEngine tXCAudioEngine2 = TXCAudioEngine.getInstance();
            String str2 = this.f60090L;
            C14274h c14274h = this.f60273a;
            tXCAudioEngine2.setRemoteAudioCacheParams(str2, !c14274h.f60188g, (int) (c14274h.f60182a * 1000.0f), (int) (c14274h.f60184c * 1000.0f), (int) (c14274h.f60183b * 1000.0f));
        }
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f60090L, this.f60100j);
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f60090L, this.f60101k);
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f60090L, this.f60102l);
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f60090L, this);
        m84750x();
        TXCAudioEngine.getInstance().startRemoteAudio(this.f60090L, z);
    }

    /* JADX INFO: renamed from: o */
    private void m84741o() {
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f60090L, null);
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f60090L, null);
        TXCAudioEngine.getInstance().stopRemoteAudio(this.f60090L);
    }

    /* JADX INFO: renamed from: p */
    private void m84742p() {
        TXCStreamDownloader tXCStreamDownloader = this.f60097g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setListener(null);
            this.f60097g.setNotifyListener(null);
            this.f60097g.stop();
            this.f60097g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m84743q() {
        C14271e c14271e = new C14271e(this.f60274b);
        this.f60114x = c14271e;
        c14271e.m84718a(this.f60083E);
        this.f60114x.m84719a(this.f60084F == 5);
        this.f60114x.m84724d(this.f60090L);
        this.f60114x.m84725e(this.f60097g.getRTMPProxyUserId());
        this.f60114x.m84716a();
    }

    /* JADX INFO: renamed from: r */
    private void m84744r() {
        C14271e c14271e = this.f60114x;
        if (c14271e != null) {
            c14271e.m84720b();
            this.f60114x = null;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m84745s() {
        this.f60091M = false;
        m84750x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m84746t() {
        if (this.f60092N > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (this.f60092N / 1000));
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) this.f60092N);
            onNotifyEvent(2005, bundle);
        }
        Handler handler = this.f60098h;
        if (handler == null || !this.f60091M) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.f.4
            @Override // java.lang.Runnable
            public void run() {
                if (C14272f.this.f60091M) {
                    C14272f.this.m84746t();
                }
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m84747u() {
        Handler handler = this.f60098h;
        if (handler != null) {
            handler.postDelayed(this.f60094P, 2000L);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m84748v() {
        Handler handler = this.f60098h;
        if (handler != null) {
            handler.removeCallbacks(this.f60094P);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m84749w() {
        ArrayList arrayList = new ArrayList();
        String str = this.f60090L;
        if (str != null) {
            arrayList.add(str);
        }
        C14128a.m83827a("18446744073709551615", arrayList);
    }

    /* JADX INFO: renamed from: x */
    private void m84750x() {
        if (this.f60110t || this.f60089K != null || this.f60091M) {
            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f60090L, this);
        }
        if (this.f60110t || this.f60089K != null || this.f60091M) {
            return;
        }
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f60090L, null);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public int mo84753a(String str, int i) {
        C14344a c14344a;
        if (mo84772c()) {
            TXCLog.m84156w("TXCLivePlayer", "play: ignore start play when is playing");
            return -2;
        }
        C14274h c14274h = this.f60273a;
        if (c14274h != null && c14274h.f60184c > c14274h.f60183b) {
            TXCLog.m84149e("TXCLivePlayer", "play: can not start play while invalid cache config [minAutoAdjustCacheTime(" + this.f60273a.f60184c + ") > maxAutoAdjustCacheTime(" + this.f60273a.f60183b + ")]!!!!!!");
            return -1;
        }
        float f = c14274h.f60182a;
        if (f > c14274h.f60183b || f < c14274h.f60184c) {
            TXCLog.m84156w("TXCLivePlayer", "play: invalid cacheTime " + this.f60273a.f60182a + ", need between minAutoAdjustCacheTime " + this.f60273a.f60184c + " and maxAutoAdjustCacheTime " + this.f60273a.f60183b + " , fix to maxAutoAdjustCacheTime");
            C14274h c14274h2 = this.f60273a;
            c14274h2.f60182a = c14274h2.f60183b;
        }
        this.f60083E = str;
        this.f60084F = i;
        m84730b(str);
        this.f60105o = true;
        this.f60111u = true;
        m84735f(i);
        m84740n();
        int iM84728b = m84728b(str, i);
        if (iM84728b != 0) {
            this.f60105o = false;
            m84742p();
            m84739m();
            m84741o();
            TextureView textureView = this.f60099i;
            if (textureView != null) {
                textureView.setVisibility(8);
                return iM84728b;
            }
        } else {
            mo84759a(this.f60106p);
            m84743q();
            m84747u();
            if (this.f60086H == EnumC14167b.TEXTURE_2D && this.f60099i == null && (c14344a = this.f60096f) != null) {
                c14344a.mo85045c(this.f60087I);
            }
            TXCDRApi.txReportDAU(this.f60274b, C14189a.f59223bt);
            try {
                Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
                TXCDRApi.txReportDAU(this.f60274b, C14189a.f59199bE);
            } catch (Exception unused) {
            }
        }
        return iM84728b;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: c */
    public void mo84770c(int i) {
        this.f60102l = i;
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f60090L, this.f60102l);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: d */
    public int mo84774d(int i) {
        if (this.f60110t) {
            TXCLog.m84149e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
            return -1;
        }
        this.f60110t = true;
        this.f60096f.m85039a((InterfaceC14350g) this);
        this.f60096f.m85038a((C14344a.a) this);
        m84750x();
        TXCDRApi.txReportDAU(this.f60274b, C14189a.f59189av);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m84777g() {
        m84749w();
        int[] iArrM84226a = C14215f.m84226a();
        String str = (iArrM84226a[0] / 10) + "/" + (iArrM84226a[1] / 10) + "%";
        int iM84182c = TXCStatus.m84182c(this.f60090L, 7102);
        int iM84182c2 = TXCStatus.m84182c(this.f60090L, 7101);
        String strM84179b = TXCStatus.m84179b(this.f60090L, 7110);
        int iM84184d = (int) TXCStatus.m84184d(this.f60090L, 6002);
        Bundle bundle = new Bundle();
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, c14344a.m85114i());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, this.f60096f.m85115j());
        }
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, (int) tXCRenderAndDec.getVideoCacheDuration());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, (int) this.f60095e.getVideoCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, this.f60095e.getVideoDecCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, (int) this.f60095e.getAVPlayInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, (int) this.f60095e.getAVNetRecvInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) (((double) (((TXCStatus.m84182c(this.f60090L, 7120) * 10) / (iM84184d == 0 ? 15 : iM84184d)) / 10.0f)) + 0.5d));
        }
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.m84182c(this.f60090L, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + Constants.SEPARATOR_COMMA + TXCStatus.m84182c(this.f60090L, TXLiteAVCode.EVT_VIDEO_DECODER_CACHE_TOO_MANY_FRAMES) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + Constants.SEPARATOR_COMMA + TXCAudioEngine.getInstance().getPlayChannels());
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, TXCStatus.m84182c(this.f60090L, 2007));
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_JITTER, TXCStatus.m84182c(this.f60090L, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, ((float) TXCStatus.m84182c(this.f60090L, TXLiteAVCode.EVT_HW_DECODER_START_SUCC)) / 1000.0f);
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, iM84182c2 + iM84182c);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, iM84184d);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE, iM84182c2);
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE, iM84182c);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_SERVER_IP, strM84179b);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, str);
        C14215f.m84218a(this.f60276d, 15001, bundle);
        TXCRenderAndDec tXCRenderAndDec2 = this.f60095e;
        if (tXCRenderAndDec2 != null) {
            tXCRenderAndDec2.updateLoadInfo();
        }
        C14271e c14271e = this.f60114x;
        if (c14271e != null) {
            c14271e.m84723d();
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: h */
    public int mo84778h() {
        return TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(this.f60090L);
    }

    @Override // com.tencent.liteav.audio.InterfaceC14146d
    public void onAudioJitterBufferNotify(String str, int i, String str2) {
        onNotifyEvent(i, null);
    }

    @Override // com.tencent.liteav.audio.InterfaceC14147e
    public void onAudioPlayPcmData(String str, byte[] bArr, long j, int i, int i2) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener;
        this.f60108r = i;
        this.f60107q = i2;
        if (this.f60112v != null) {
            if (j <= 0) {
                j = TXCTimeUtil.getTimeTick();
            }
            this.f60112v.m83840a(bArr, j);
        }
        if (this.f60093O <= 0 && (iTXAudioRawDataListener = this.f60089K) != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i, i2, 16);
        }
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener2 = this.f60089K;
        if (iTXAudioRawDataListener2 != null) {
            iTXAudioRawDataListener2.onPcmDataAvailable(bArr, j);
        }
        long j2 = this.f60093O;
        if (j2 <= 0) {
            this.f60093O = j;
        } else {
            this.f60092N = j - j2;
        }
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        if (2003 == i || 2026 == i) {
            if (this.f60111u) {
                m84727a(2004, "Video play started");
                this.f60111u = false;
            }
            if (2026 == i) {
                TXCStatus.m84178a(this.f60090L, 2033, Long.valueOf(TXCTimeUtil.getTimeTick()));
                return;
            }
        }
        if (2025 == i) {
            m84727a(2004, "Video play started");
            return;
        }
        if (2023 == i || 2024 == i) {
            m84727a(2007, "Video play loading");
            return;
        }
        Handler handler = this.f60098h;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.f.6
                @Override // java.lang.Runnable
                public void run() {
                    C14215f.m84218a(C14272f.this.f60276d, i, bundle);
                    if (i != 2103 || C14272f.this.f60095e == null) {
                        return;
                    }
                    C14272f.this.f60095e.restartDecoder();
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullAudio(C14204a c14204a) {
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        if (this.f60105o) {
            try {
                TXCRenderAndDec tXCRenderAndDec = this.f60095e;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.decVideo(tXSNALPacket);
                }
            } catch (Exception e) {
                TXCLog.m84149e("TXCLivePlayer", "decode video failed." + e.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC14127b
    public void onRequestKeyFrame(String str, int i) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!this.f60105o || (tXCStreamDownloader = this.f60097g) == null) {
            return;
        }
        tXCStreamDownloader.requestKeyFrame(this.f60083E);
    }

    @Override // com.tencent.liteav.renderer.C14344a.a
    public void onTextureProcess(int i, int i2, int i3, int i4) {
        C14351h c14351h;
        C14129a c14129a = this.f60112v;
        if (this.f60110t && c14129a != null && (c14351h = this.f60080B) != null) {
            c14351h.m85130a(this.f60081C);
            c14129a.m83834a(this.f60080B.m85137d(i), TXCTimeUtil.getTimeTick());
            this.f60080B.m85130a(this.f60082D);
            this.f60080B.m85136c(i);
        }
        if (this.f60110t) {
            m84736j();
        } else {
            m84737k();
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: e */
    public boolean mo84775e() {
        return true;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: c */
    public boolean mo84772c() {
        return this.f60105o;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: c */
    public void mo84771c(boolean z) {
        this.f60101k = z;
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f60090L, z);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: d */
    public int mo84773d() {
        if (!this.f60110t) {
            TXCLog.m84156w("TXCLivePlayer", "stopRecord: no recording task exist");
            return -1;
        }
        this.f60110t = false;
        m84750x();
        C14129a c14129a = this.f60112v;
        if (c14129a != null) {
            c14129a.m83833a();
            this.f60112v = null;
        }
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: f */
    public void mo84776f() {
        this.f60093O = 0L;
        if (this.f60091M) {
            return;
        }
        this.f60091M = true;
        m84750x();
        Handler handler = this.f60098h;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.f.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C14272f.this.f60091M) {
                        C14272f.this.m84746t();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: b */
    public void mo84767b() {
        mo84753a(this.f60083E, this.f60084F);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: b */
    public void mo84768b(int i) {
        this.f60103m = i;
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderRotation(i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: b */
    public void mo84769b(boolean z) {
        this.f60100j = z;
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f60090L, this.f60100j);
    }

    /* JADX INFO: renamed from: b */
    private void m84730b(String str) {
        String str2 = String.format("%s-%d", str, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000));
        this.f60090L = str2;
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setID(str2);
        }
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            c14344a.setID(this.f60090L);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f60097g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setID(this.f60090L);
        }
        C14271e c14271e = this.f60114x;
        if (c14271e != null) {
            c14271e.m84724d(this.f60090L);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84764a(TXCloudVideoView tXCloudVideoView) {
        TextureView videoView;
        TXCloudVideoView tXCloudVideoView2 = this.f60275c;
        if (tXCloudVideoView2 != null && tXCloudVideoView2 != tXCloudVideoView && (videoView = tXCloudVideoView2.getVideoView()) != null) {
            this.f60275c.removeView(videoView);
        }
        super.mo84764a(tXCloudVideoView);
        TXCloudVideoView tXCloudVideoView3 = this.f60275c;
        if (tXCloudVideoView3 != null) {
            TextureView videoView2 = tXCloudVideoView3.getVideoView();
            this.f60099i = videoView2;
            if (videoView2 == null) {
                this.f60099i = new TextureView(this.f60275c.getContext());
            }
            this.f60275c.addVideoView(this.f60099i);
        }
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            c14344a.m85099a(this.f60099i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84759a(Surface surface) {
        this.f60106p = surface;
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            c14344a.m85098a(surface);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84757a(int i, int i2) {
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            c14344a.m85108c(i, i2);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84761a(C14274h c14274h) {
        super.mo84761a(c14274h);
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setConfig(c14274h);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public int mo84754a(boolean z) {
        C14344a c14344a;
        if (!mo84772c()) {
            TXCLog.m84156w("TXCLivePlayer", "play: ignore stop play when not started");
            return -2;
        }
        TXCLog.m84154v("TXCLivePlayer", "play: stop");
        this.f60105o = false;
        m84742p();
        m84739m();
        TextureView textureView = this.f60099i;
        if (textureView != null && z) {
            textureView.setVisibility(8);
        }
        C14344a c14344a2 = this.f60096f;
        if (c14344a2 != null) {
            c14344a2.m85098a((Surface) null);
        }
        if (this.f60099i == null && (c14344a = this.f60096f) != null) {
            c14344a.mo85048e();
        }
        m84741o();
        m84744r();
        m84748v();
        m84745s();
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public int mo84752a(String str) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!mo84772c() || (tXCStreamDownloader = this.f60097g) == null) {
            return -1;
        }
        boolean zSwitchStream = tXCStreamDownloader.switchStream(str);
        if (this.f60095e != null) {
            TXCLog.m84156w("TXCLivePlayer", " stream_switch video cache " + this.f60095e.getVideoCacheDuration() + " audio cache " + TXCStatus.m84182c(this.f60090L, 2007));
        }
        if (!zSwitchStream) {
            return -2;
        }
        this.f60083E = str;
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84755a() {
        mo84754a(false);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84756a(int i) {
        this.f60104n = i;
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderMode(i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84758a(Context context, int i) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setAudioRoute(i);
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84765a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f60113w = iTXVideoRecordListener;
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84763a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.f60089K = iTXAudioRawDataListener;
        m84750x();
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84762a(InterfaceC14318o interfaceC14318o, EnumC14167b enumC14167b, Object obj) {
        C14344a c14344a;
        this.f60086H = enumC14167b;
        this.f60087I = obj;
        if (mo84772c() && this.f60086H == EnumC14167b.TEXTURE_2D && this.f60099i == null && interfaceC14318o != null && (c14344a = this.f60096f) != null) {
            c14344a.mo85045c(this.f60087I);
        }
        TXCRenderAndDec tXCRenderAndDec = this.f60095e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setVideoFrameListener(interfaceC14318o, enumC14167b);
        } else {
            TXCLog.m84156w("TXCLivePlayer", "setVideoFrameListener->enter with renderAndDec is empty");
        }
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84760a(InterfaceC14185o interfaceC14185o) {
        C14344a c14344a = this.f60096f;
        if (c14344a != null) {
            c14344a.m85101a(interfaceC14185o);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84727a(final int i, String str) {
        if (this.f60276d != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("EVT_ID", i);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            if (str != null) {
                bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
            }
            Handler handler = this.f60098h;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.f.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C14215f.m84218a(C14272f.this.f60276d, i, bundle);
                    }
                });
            }
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14350g
    /* JADX INFO: renamed from: a */
    public int mo84751a(int i, float[] fArr) {
        C14351h c14351h;
        C14129a c14129a = this.f60112v;
        if (this.f60110t && c14129a != null && (c14351h = this.f60079A) != null) {
            int iM85137d = c14351h.m85137d(i);
            c14129a.m83834a(iM85137d, TXCTimeUtil.getTimeTick());
            this.f60096f.mo85035a(iM85137d, this.f60115y, this.f60116z, false, 0);
        }
        if (this.f60110t) {
            m84736j();
            return i;
        }
        m84737k();
        return i;
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC14126a
    /* JADX INFO: renamed from: a */
    public void mo83826a(SurfaceTexture surfaceTexture) {
        m84737k();
        mo84773d();
    }

    @Override // com.tencent.liteav.AbstractC14284n
    /* JADX INFO: renamed from: a */
    public void mo84766a(boolean z, int i) {
        this.f60085G = z;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, i);
    }
}
