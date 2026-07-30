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
import com.tencent.liteav.audio.InterfaceC13983d;
import com.tencent.liteav.audio.InterfaceC13984e;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p086a.C14003a;
import com.tencent.liteav.basic.p086a.EnumC14004b;
import com.tencent.liteav.basic.p087b.InterfaceC14006a;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.structs.C14041a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.network.InterfaceC14150f;
import com.tencent.liteav.network.TXCStreamDownloader;
import com.tencent.liteav.p084a.C13966a;
import com.tencent.liteav.renderer.C14181a;
import com.tencent.liteav.renderer.C14188h;
import com.tencent.liteav.renderer.InterfaceC14187g;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.liteav.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14109f extends AbstractC14121n implements TXCRenderAndDec.InterfaceC13963a, TXCRenderAndDec.InterfaceC13964b, InterfaceC13983d, InterfaceC13984e, InterfaceC14007b, InterfaceC14150f, C14181a.a, InterfaceC14187g {

    /* JADX INFO: renamed from: A */
    private C14188h f59231A;

    /* JADX INFO: renamed from: B */
    private C14188h f59232B;

    /* JADX INFO: renamed from: C */
    private float[] f59233C;

    /* JADX INFO: renamed from: D */
    private float[] f59234D;

    /* JADX INFO: renamed from: E */
    private String f59235E;

    /* JADX INFO: renamed from: F */
    private int f59236F;

    /* JADX INFO: renamed from: G */
    private boolean f59237G;

    /* JADX INFO: renamed from: H */
    private EnumC14004b f59238H;

    /* JADX INFO: renamed from: I */
    private Object f59239I;

    /* JADX INFO: renamed from: J */
    private InterfaceC14006a f59240J;

    /* JADX INFO: renamed from: K */
    private TXLivePlayer.ITXAudioRawDataListener f59241K;

    /* JADX INFO: renamed from: L */
    private String f59242L;

    /* JADX INFO: renamed from: M */
    private boolean f59243M;

    /* JADX INFO: renamed from: N */
    private long f59244N;

    /* JADX INFO: renamed from: O */
    private long f59245O;

    /* JADX INFO: renamed from: P */
    private a f59246P;

    /* JADX INFO: renamed from: e */
    private TXCRenderAndDec f59247e;

    /* JADX INFO: renamed from: f */
    private C14181a f59248f;

    /* JADX INFO: renamed from: g */
    private TXCStreamDownloader f59249g;

    /* JADX INFO: renamed from: h */
    private Handler f59250h;

    /* JADX INFO: renamed from: i */
    private TextureView f59251i;

    /* JADX INFO: renamed from: j */
    private boolean f59252j;

    /* JADX INFO: renamed from: k */
    private boolean f59253k;

    /* JADX INFO: renamed from: l */
    private int f59254l;

    /* JADX INFO: renamed from: m */
    private int f59255m;

    /* JADX INFO: renamed from: n */
    private int f59256n;

    /* JADX INFO: renamed from: o */
    private boolean f59257o;

    /* JADX INFO: renamed from: p */
    private Surface f59258p;

    /* JADX INFO: renamed from: q */
    private int f59259q;

    /* JADX INFO: renamed from: r */
    private int f59260r;

    /* JADX INFO: renamed from: s */
    private int f59261s;

    /* JADX INFO: renamed from: t */
    private boolean f59262t;

    /* JADX INFO: renamed from: u */
    private boolean f59263u;

    /* JADX INFO: renamed from: v */
    private C13966a f59264v;

    /* JADX INFO: renamed from: w */
    private TXRecordCommon.ITXVideoRecordListener f59265w;

    /* JADX INFO: renamed from: x */
    private C14108e f59266x;

    /* JADX INFO: renamed from: y */
    private int f59267y;

    /* JADX INFO: renamed from: z */
    private int f59268z;

    /* JADX INFO: renamed from: com.tencent.liteav.f$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14109f> f59279a;

        public a(C14109f c14109f) {
            this.f59279a = new WeakReference<>(c14109f);
        }

        @Override // java.lang.Runnable
        public void run() {
            C14109f c14109f = this.f59279a.get();
            if (c14109f == null) {
                return;
            }
            c14109f.m83594g();
            c14109f.m83564u();
        }
    }

    public C14109f(Context context) {
        super(context);
        this.f59247e = null;
        this.f59248f = null;
        this.f59249g = null;
        this.f59252j = false;
        this.f59253k = false;
        this.f59254l = 100;
        this.f59255m = 0;
        this.f59256n = 0;
        this.f59257o = false;
        this.f59259q = 2;
        this.f59260r = 48000;
        this.f59261s = 16;
        this.f59262t = false;
        this.f59263u = false;
        this.f59267y = 0;
        this.f59268z = 0;
        this.f59231A = null;
        this.f59232B = null;
        this.f59233C = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        this.f59234D = new float[16];
        this.f59235E = "";
        this.f59237G = false;
        this.f59238H = EnumC14004b.UNKNOWN;
        this.f59239I = null;
        this.f59240J = new InterfaceC14006a() { // from class: com.tencent.liteav.f.1
            @Override // com.tencent.liteav.basic.p087b.InterfaceC14006a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.m82966e("TXCLivePlayer", "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC14007b> weakReference = C14109f.this.f59428d;
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
                    C14109f.this.onNotifyEvent(i, bundle);
                }
            }

            @Override // com.tencent.liteav.basic.p087b.InterfaceC14006a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.m82969i("TXCLivePlayer", "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                WeakReference<InterfaceC14007b> weakReference = C14109f.this.f59428d;
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
                    C14109f.this.onNotifyEvent(i, bundle);
                }
            }
        };
        this.f59242L = "";
        this.f59243M = false;
        this.f59244N = 0L;
        this.f59245O = 0L;
        this.f59246P = null;
        C14025c.m82853a().m82879a(context);
        TXCAudioEngine.CreateInstance(context, C14025c.m82853a().m82882b());
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.f59240J));
        long jM82878a = C14025c.m82853a().m82878a("Audio", "EnableAutoRestartDevice");
        TXCAudioEngine.getInstance().enableAutoRestartDevice(jM82878a == 1 || jM82878a == -1);
        this.f59250h = new Handler(Looper.getMainLooper());
        C14181a c14181a = new C14181a();
        this.f59248f = c14181a;
        c14181a.m83917a((InterfaceC14007b) this);
        this.f59246P = new a(this);
    }

    /* JADX INFO: renamed from: b */
    private int m83545b(String str, int i) {
        if (i == 0) {
            this.f59249g = new TXCStreamDownloader(this.f59426b, 1);
        } else if (i == 5) {
            this.f59249g = new TXCStreamDownloader(this.f59426b, 4);
        } else {
            this.f59249g = new TXCStreamDownloader(this.f59426b, 0);
            if (!TextUtils.isEmpty(this.f59425a.f59345l)) {
                this.f59249g.setFlvSessionKey(this.f59425a.f59345l);
            }
        }
        this.f59249g.setID(this.f59242L);
        this.f59249g.setListener(this);
        this.f59249g.setNotifyListener(this);
        this.f59249g.setHeaders(this.f59425a.f59349p);
        TXCStreamDownloader tXCStreamDownloader = this.f59249g;
        if (i == 5) {
            tXCStreamDownloader.setRetryTimes(5);
            this.f59249g.setRetryInterval(1);
        } else {
            tXCStreamDownloader.setRetryTimes(this.f59425a.f59338e);
            this.f59249g.setRetryInterval(this.f59425a.f59339f);
        }
        TXCStreamDownloader tXCStreamDownloader2 = this.f59249g;
        C14111h c14111h = this.f59425a;
        return tXCStreamDownloader2.start(str, c14111h.f59342i, c14111h.f59346m, c14111h.f59343j, c14111h.f59344k);
    }

    /* JADX INFO: renamed from: f */
    private void m83552f(int i) {
        TextureView textureView = this.f59251i;
        if (textureView != null) {
            textureView.setVisibility(0);
        }
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.f59426b);
        this.f59247e = tXCRenderAndDec;
        tXCRenderAndDec.setNotifyListener(this);
        this.f59247e.setVideoRender(this.f59248f);
        this.f59247e.setDecListener(this);
        this.f59247e.setRenderAndDecDelegate(this);
        this.f59247e.setConfig(this.f59425a);
        this.f59247e.setID(this.f59242L);
        this.f59247e.start(i == 5);
        this.f59247e.setRenderMode(this.f59256n);
        this.f59247e.setRenderRotation(this.f59255m);
    }

    /* JADX INFO: renamed from: j */
    private void m83553j() {
        if (this.f59264v == null) {
            this.f59267y = this.f59248f.m83931i();
            this.f59268z = this.f59248f.m83932j();
            C13966a.a aVarM83555l = m83555l();
            C13966a c13966a = new C13966a(this.f59426b);
            this.f59264v = c13966a;
            c13966a.m82654a(aVarM83555l);
            this.f59264v.m82655a(new C13966a.b() { // from class: com.tencent.liteav.f.2
                @Override // com.tencent.liteav.p084a.C13966a.b
                /* JADX INFO: renamed from: a */
                public void mo82660a(int i, String str, String str2, String str3) {
                    if (C14109f.this.f59265w != null) {
                        TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                        if (i == 0) {
                            tXRecordResult.retCode = 0;
                        } else {
                            tXRecordResult.retCode = -1;
                        }
                        tXRecordResult.descMsg = str;
                        tXRecordResult.videoPath = str2;
                        tXRecordResult.coverPath = str3;
                        C14109f.this.f59265w.onRecordComplete(tXRecordResult);
                    }
                    C14109f.this.f59248f.m83856a((InterfaceC14187g) null);
                    C14109f.this.f59248f.m83855a((C14181a.a) null);
                }

                @Override // com.tencent.liteav.p084a.C13966a.b
                /* JADX INFO: renamed from: a */
                public void mo82661a(long j) {
                    if (C14109f.this.f59265w != null) {
                        C14109f.this.f59265w.onRecordProgress(j);
                    }
                }
            });
        }
        if (this.f59231A == null) {
            C14188h c14188h = new C14188h(Boolean.TRUE);
            this.f59231A = c14188h;
            c14188h.m83949b();
            this.f59231A.m83951b(this.f59267y, this.f59268z);
            this.f59231A.m83945a(this.f59267y, this.f59268z);
        }
        if (this.f59232B == null) {
            C14188h c14188h2 = new C14188h(Boolean.FALSE);
            this.f59232B = c14188h2;
            c14188h2.m83949b();
            this.f59232B.m83951b(this.f59248f.m83929g(), this.f59248f.m83930h());
            this.f59232B.m83945a(this.f59248f.m83929g(), this.f59248f.m83930h());
            Matrix.setIdentityM(this.f59234D, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m83554k() {
        C14188h c14188h = this.f59231A;
        if (c14188h != null) {
            c14188h.m83952c();
            this.f59231A = null;
        }
        C14188h c14188h2 = this.f59232B;
        if (c14188h2 != null) {
            c14188h2.m83952c();
            this.f59232B = null;
        }
    }

    /* JADX INFO: renamed from: l */
    private C13966a.a m83555l() {
        int i;
        int i2 = this.f59267y;
        if (i2 <= 0 || (i = this.f59268z) <= 0) {
            i2 = 480;
            i = 640;
        }
        C13966a.a aVar = new C13966a.a();
        aVar.f57962a = i2;
        aVar.f57963b = i;
        aVar.f57964c = 20;
        aVar.f57965d = (int) (Math.sqrt((((double) (i2 * i2)) * 1.0d) + ((double) (i * i))) * 1.2d);
        aVar.f57969h = this.f59259q;
        aVar.f57970i = this.f59260r;
        aVar.f57971j = this.f59261s;
        aVar.f57967f = C13966a.m82648a(this.f59426b, ".mp4");
        aVar.f57968g = C13966a.m82648a(this.f59426b, ".jpg");
        aVar.f57966e = this.f59248f.m83858b();
        TXCLog.m82964d("TXCLivePlayer", "record config: " + aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: m */
    private void m83556m() {
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stop();
            this.f59247e.setVideoRender(null);
            this.f59247e.setDecListener(null);
            this.f59247e.setNotifyListener(null);
            this.f59247e = null;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m83557n() {
        boolean z = this.f59236F == 5;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(this.f59237G, 300);
        mo83580a(this.f59241K);
        if (this.f59236F == 5) {
            TXCAudioEngine tXCAudioEngine = TXCAudioEngine.getInstance();
            String str = this.f59242L;
            boolean z2 = !this.f59425a.f59340g;
            float f = C14003a.f58043b;
            tXCAudioEngine.setRemoteAudioCacheParams(str, z2, (int) (f * 1000.0f), (int) (f * 1000.0f), (int) (C14003a.f58044c * 1000.0f));
        } else {
            TXCAudioEngine tXCAudioEngine2 = TXCAudioEngine.getInstance();
            String str2 = this.f59242L;
            C14111h c14111h = this.f59425a;
            tXCAudioEngine2.setRemoteAudioCacheParams(str2, !c14111h.f59340g, (int) (c14111h.f59334a * 1000.0f), (int) (c14111h.f59336c * 1000.0f), (int) (c14111h.f59335b * 1000.0f));
        }
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f59242L, this.f59252j);
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f59242L, this.f59253k);
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f59242L, this.f59254l);
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f59242L, this);
        m83567x();
        TXCAudioEngine.getInstance().startRemoteAudio(this.f59242L, z);
    }

    /* JADX INFO: renamed from: o */
    private void m83558o() {
        TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(this.f59242L, null);
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f59242L, null);
        TXCAudioEngine.getInstance().stopRemoteAudio(this.f59242L);
    }

    /* JADX INFO: renamed from: p */
    private void m83559p() {
        TXCStreamDownloader tXCStreamDownloader = this.f59249g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setListener(null);
            this.f59249g.setNotifyListener(null);
            this.f59249g.stop();
            this.f59249g = null;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m83560q() {
        C14108e c14108e = new C14108e(this.f59426b);
        this.f59266x = c14108e;
        c14108e.m83535a(this.f59235E);
        this.f59266x.m83536a(this.f59236F == 5);
        this.f59266x.m83541d(this.f59242L);
        this.f59266x.m83542e(this.f59249g.getRTMPProxyUserId());
        this.f59266x.m83533a();
    }

    /* JADX INFO: renamed from: r */
    private void m83561r() {
        C14108e c14108e = this.f59266x;
        if (c14108e != null) {
            c14108e.m83537b();
            this.f59266x = null;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m83562s() {
        this.f59243M = false;
        m83567x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m83563t() {
        if (this.f59244N > 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (this.f59244N / 1000));
            bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) this.f59244N);
            onNotifyEvent(2005, bundle);
        }
        Handler handler = this.f59250h;
        if (handler == null || !this.f59243M) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.f.4
            @Override // java.lang.Runnable
            public void run() {
                if (C14109f.this.f59243M) {
                    C14109f.this.m83563t();
                }
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m83564u() {
        Handler handler = this.f59250h;
        if (handler != null) {
            handler.postDelayed(this.f59246P, 2000L);
        }
    }

    /* JADX INFO: renamed from: v */
    private void m83565v() {
        Handler handler = this.f59250h;
        if (handler != null) {
            handler.removeCallbacks(this.f59246P);
        }
    }

    /* JADX INFO: renamed from: w */
    private void m83566w() {
        ArrayList arrayList = new ArrayList();
        String str = this.f59242L;
        if (str != null) {
            arrayList.add(str);
        }
        C13965a.m82644a("18446744073709551615", arrayList);
    }

    /* JADX INFO: renamed from: x */
    private void m83567x() {
        if (this.f59262t || this.f59241K != null || this.f59243M) {
            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f59242L, this);
        }
        if (this.f59262t || this.f59241K != null || this.f59243M) {
            return;
        }
        TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(this.f59242L, null);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public int mo83570a(String str, int i) {
        C14181a c14181a;
        if (mo83589c()) {
            TXCLog.m82973w("TXCLivePlayer", "play: ignore start play when is playing");
            return -2;
        }
        C14111h c14111h = this.f59425a;
        if (c14111h != null && c14111h.f59336c > c14111h.f59335b) {
            TXCLog.m82966e("TXCLivePlayer", "play: can not start play while invalid cache config [minAutoAdjustCacheTime(" + this.f59425a.f59336c + ") > maxAutoAdjustCacheTime(" + this.f59425a.f59335b + ")]!!!!!!");
            return -1;
        }
        float f = c14111h.f59334a;
        if (f > c14111h.f59335b || f < c14111h.f59336c) {
            TXCLog.m82973w("TXCLivePlayer", "play: invalid cacheTime " + this.f59425a.f59334a + ", need between minAutoAdjustCacheTime " + this.f59425a.f59336c + " and maxAutoAdjustCacheTime " + this.f59425a.f59335b + " , fix to maxAutoAdjustCacheTime");
            C14111h c14111h2 = this.f59425a;
            c14111h2.f59334a = c14111h2.f59335b;
        }
        this.f59235E = str;
        this.f59236F = i;
        m83547b(str);
        this.f59257o = true;
        this.f59263u = true;
        m83552f(i);
        m83557n();
        int iM83545b = m83545b(str, i);
        if (iM83545b != 0) {
            this.f59257o = false;
            m83559p();
            m83556m();
            m83558o();
            TextureView textureView = this.f59251i;
            if (textureView != null) {
                textureView.setVisibility(8);
                return iM83545b;
            }
        } else {
            mo83576a(this.f59258p);
            m83560q();
            m83564u();
            if (this.f59238H == EnumC14004b.TEXTURE_2D && this.f59251i == null && (c14181a = this.f59248f) != null) {
                c14181a.mo83862c(this.f59239I);
            }
            TXCDRApi.txReportDAU(this.f59426b, C14026a.f58375bt);
            try {
                Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
                TXCDRApi.txReportDAU(this.f59426b, C14026a.f58351bE);
            } catch (Exception unused) {
            }
        }
        return iM83545b;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: c */
    public void mo83587c(int i) {
        this.f59254l = i;
        TXCAudioEngine.getInstance().setRemotePlayoutVolume(this.f59242L, this.f59254l);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: d */
    public int mo83591d(int i) {
        if (this.f59262t) {
            TXCLog.m82966e("TXCLivePlayer", "startRecord: there is existing uncompleted record task");
            return -1;
        }
        this.f59262t = true;
        this.f59248f.m83856a((InterfaceC14187g) this);
        this.f59248f.m83855a((C14181a.a) this);
        m83567x();
        TXCDRApi.txReportDAU(this.f59426b, C14026a.f58341av);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m83594g() {
        m83566w();
        int[] iArrM83043a = C14052f.m83043a();
        String str = (iArrM83043a[0] / 10) + "/" + (iArrM83043a[1] / 10) + "%";
        int iM82999c = TXCStatus.m82999c(this.f59242L, 7102);
        int iM82999c2 = TXCStatus.m82999c(this.f59242L, 7101);
        String strM82996b = TXCStatus.m82996b(this.f59242L, 7110);
        int iM83001d = (int) TXCStatus.m83001d(this.f59242L, 6002);
        Bundle bundle = new Bundle();
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, c14181a.m83931i());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, this.f59248f.m83932j());
        }
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE, (int) tXCRenderAndDec.getVideoCacheDuration());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE, (int) this.f59247e.getVideoCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE, this.f59247e.getVideoDecCacheFrameCount());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL, (int) this.f59247e.getAVPlayInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL, (int) this.f59247e.getAVNetRecvInterval());
            bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_GOP, (int) (((double) (((TXCStatus.m82999c(this.f59242L, 7120) * 10) / (iM83001d == 0 ? 15 : iM83001d)) / 10.0f)) + 0.5d));
        }
        bundle.putString(TXLiveConstants.NET_STATUS_AUDIO_INFO, TXCAudioEngine.getInstance().getPlayAECType() + " | " + TXCStatus.m82999c(this.f59242L, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE) + Constants.SEPARATOR_COMMA + TXCStatus.m82999c(this.f59242L, TXLiteAVCode.EVT_VIDEO_DECODER_CACHE_TOO_MANY_FRAMES) + " | " + TXCAudioEngine.getInstance().getPlaySampleRate() + Constants.SEPARATOR_COMMA + TXCAudioEngine.getInstance().getPlayChannels());
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, TXCStatus.m82999c(this.f59242L, 2007));
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_JITTER, TXCStatus.m82999c(this.f59242L, TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED));
        bundle.putFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD, ((float) TXCStatus.m82999c(this.f59242L, TXLiteAVCode.EVT_HW_DECODER_START_SUCC)) / 1000.0f);
        bundle.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, iM82999c2 + iM82999c);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, iM83001d);
        bundle.putInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE, iM82999c2);
        bundle.putInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE, iM82999c);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_SERVER_IP, strM82996b);
        bundle.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, str);
        C14052f.m83035a(this.f59428d, 15001, bundle);
        TXCRenderAndDec tXCRenderAndDec2 = this.f59247e;
        if (tXCRenderAndDec2 != null) {
            tXCRenderAndDec2.updateLoadInfo();
        }
        C14108e c14108e = this.f59266x;
        if (c14108e != null) {
            c14108e.m83540d();
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: h */
    public int mo83595h() {
        return TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(this.f59242L);
    }

    @Override // com.tencent.liteav.audio.InterfaceC13983d
    public void onAudioJitterBufferNotify(String str, int i, String str2) {
        onNotifyEvent(i, null);
    }

    @Override // com.tencent.liteav.audio.InterfaceC13984e
    public void onAudioPlayPcmData(String str, byte[] bArr, long j, int i, int i2) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener;
        this.f59260r = i;
        this.f59259q = i2;
        if (this.f59264v != null) {
            if (j <= 0) {
                j = TXCTimeUtil.getTimeTick();
            }
            this.f59264v.m82657a(bArr, j);
        }
        if (this.f59245O <= 0 && (iTXAudioRawDataListener = this.f59241K) != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i, i2, 16);
        }
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener2 = this.f59241K;
        if (iTXAudioRawDataListener2 != null) {
            iTXAudioRawDataListener2.onPcmDataAvailable(bArr, j);
        }
        long j2 = this.f59245O;
        if (j2 <= 0) {
            this.f59245O = j;
        } else {
            this.f59244N = j - j2;
        }
    }

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        if (2003 == i || 2026 == i) {
            if (this.f59263u) {
                m83544a(2004, "Video play started");
                this.f59263u = false;
            }
            if (2026 == i) {
                TXCStatus.m82995a(this.f59242L, 2033, Long.valueOf(TXCTimeUtil.getTimeTick()));
                return;
            }
        }
        if (2025 == i) {
            m83544a(2004, "Video play started");
            return;
        }
        if (2023 == i || 2024 == i) {
            m83544a(2007, "Video play loading");
            return;
        }
        Handler handler = this.f59250h;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.f.6
                @Override // java.lang.Runnable
                public void run() {
                    C14052f.m83035a(C14109f.this.f59428d, i, bundle);
                    if (i != 2103 || C14109f.this.f59247e == null) {
                        return;
                    }
                    C14109f.this.f59247e.restartDecoder();
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
    public void onPullAudio(C14041a c14041a) {
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        if (this.f59257o) {
            try {
                TXCRenderAndDec tXCRenderAndDec = this.f59247e;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.decVideo(tXSNALPacket);
                }
            } catch (Exception e) {
                TXCLog.m82966e("TXCLivePlayer", "decode video failed." + e.getMessage());
            }
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC13964b
    public void onRequestKeyFrame(String str, int i) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!this.f59257o || (tXCStreamDownloader = this.f59249g) == null) {
            return;
        }
        tXCStreamDownloader.requestKeyFrame(this.f59235E);
    }

    @Override // com.tencent.liteav.renderer.C14181a.a
    public void onTextureProcess(int i, int i2, int i3, int i4) {
        C14188h c14188h;
        C13966a c13966a = this.f59264v;
        if (this.f59262t && c13966a != null && (c14188h = this.f59232B) != null) {
            c14188h.m83947a(this.f59233C);
            c13966a.m82651a(this.f59232B.m83954d(i), TXCTimeUtil.getTimeTick());
            this.f59232B.m83947a(this.f59234D);
            this.f59232B.m83953c(i);
        }
        if (this.f59262t) {
            m83553j();
        } else {
            m83554k();
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: e */
    public boolean mo83592e() {
        return true;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: c */
    public boolean mo83589c() {
        return this.f59257o;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: c */
    public void mo83588c(boolean z) {
        this.f59253k = z;
        TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(this.f59242L, z);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: d */
    public int mo83590d() {
        if (!this.f59262t) {
            TXCLog.m82973w("TXCLivePlayer", "stopRecord: no recording task exist");
            return -1;
        }
        this.f59262t = false;
        m83567x();
        C13966a c13966a = this.f59264v;
        if (c13966a != null) {
            c13966a.m82650a();
            this.f59264v = null;
        }
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: f */
    public void mo83593f() {
        this.f59245O = 0L;
        if (this.f59243M) {
            return;
        }
        this.f59243M = true;
        m83567x();
        Handler handler = this.f59250h;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.f.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C14109f.this.f59243M) {
                        C14109f.this.m83563t();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: b */
    public void mo83584b() {
        mo83570a(this.f59235E, this.f59236F);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: b */
    public void mo83585b(int i) {
        this.f59255m = i;
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderRotation(i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: b */
    public void mo83586b(boolean z) {
        this.f59252j = z;
        TXCAudioEngine.getInstance().muteRemoteAudio(this.f59242L, this.f59252j);
    }

    /* JADX INFO: renamed from: b */
    private void m83547b(String str) {
        String str2 = String.format("%s-%d", str, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000));
        this.f59242L = str2;
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setID(str2);
        }
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            c14181a.setID(this.f59242L);
        }
        TXCStreamDownloader tXCStreamDownloader = this.f59249g;
        if (tXCStreamDownloader != null) {
            tXCStreamDownloader.setID(this.f59242L);
        }
        C14108e c14108e = this.f59266x;
        if (c14108e != null) {
            c14108e.m83541d(this.f59242L);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83581a(TXCloudVideoView tXCloudVideoView) {
        TextureView videoView;
        TXCloudVideoView tXCloudVideoView2 = this.f59427c;
        if (tXCloudVideoView2 != null && tXCloudVideoView2 != tXCloudVideoView && (videoView = tXCloudVideoView2.getVideoView()) != null) {
            this.f59427c.removeView(videoView);
        }
        super.mo83581a(tXCloudVideoView);
        TXCloudVideoView tXCloudVideoView3 = this.f59427c;
        if (tXCloudVideoView3 != null) {
            TextureView videoView2 = tXCloudVideoView3.getVideoView();
            this.f59251i = videoView2;
            if (videoView2 == null) {
                this.f59251i = new TextureView(this.f59427c.getContext());
            }
            this.f59427c.addVideoView(this.f59251i);
        }
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            c14181a.m83916a(this.f59251i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83576a(Surface surface) {
        this.f59258p = surface;
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            c14181a.m83915a(surface);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83574a(int i, int i2) {
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            c14181a.m83925c(i, i2);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83578a(C14111h c14111h) {
        super.mo83578a(c14111h);
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setConfig(c14111h);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public int mo83571a(boolean z) {
        C14181a c14181a;
        if (!mo83589c()) {
            TXCLog.m82973w("TXCLivePlayer", "play: ignore stop play when not started");
            return -2;
        }
        TXCLog.m82971v("TXCLivePlayer", "play: stop");
        this.f59257o = false;
        m83559p();
        m83556m();
        TextureView textureView = this.f59251i;
        if (textureView != null && z) {
            textureView.setVisibility(8);
        }
        C14181a c14181a2 = this.f59248f;
        if (c14181a2 != null) {
            c14181a2.m83915a((Surface) null);
        }
        if (this.f59251i == null && (c14181a = this.f59248f) != null) {
            c14181a.mo83865e();
        }
        m83558o();
        m83561r();
        m83565v();
        m83562s();
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public int mo83569a(String str) {
        TXCStreamDownloader tXCStreamDownloader;
        if (!mo83589c() || (tXCStreamDownloader = this.f59249g) == null) {
            return -1;
        }
        boolean zSwitchStream = tXCStreamDownloader.switchStream(str);
        if (this.f59247e != null) {
            TXCLog.m82973w("TXCLivePlayer", " stream_switch video cache " + this.f59247e.getVideoCacheDuration() + " audio cache " + TXCStatus.m82999c(this.f59242L, 2007));
        }
        if (!zSwitchStream) {
            return -2;
        }
        this.f59235E = str;
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83572a() {
        mo83571a(false);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83573a(int i) {
        this.f59256n = i;
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setRenderMode(i);
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83575a(Context context, int i) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setAudioRoute(i);
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83582a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f59265w = iTXVideoRecordListener;
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83580a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.f59241K = iTXAudioRawDataListener;
        m83567x();
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83579a(InterfaceC14155o interfaceC14155o, EnumC14004b enumC14004b, Object obj) {
        C14181a c14181a;
        this.f59238H = enumC14004b;
        this.f59239I = obj;
        if (mo83589c() && this.f59238H == EnumC14004b.TEXTURE_2D && this.f59251i == null && interfaceC14155o != null && (c14181a = this.f59248f) != null) {
            c14181a.mo83862c(this.f59239I);
        }
        TXCRenderAndDec tXCRenderAndDec = this.f59247e;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setVideoFrameListener(interfaceC14155o, enumC14004b);
        } else {
            TXCLog.m82973w("TXCLivePlayer", "setVideoFrameListener->enter with renderAndDec is empty");
        }
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83577a(InterfaceC14022o interfaceC14022o) {
        C14181a c14181a = this.f59248f;
        if (c14181a != null) {
            c14181a.m83918a(interfaceC14022o);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83544a(final int i, String str) {
        if (this.f59428d != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("EVT_ID", i);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            if (str != null) {
                bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
            }
            Handler handler = this.f59250h;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.f.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C14052f.m83035a(C14109f.this.f59428d, i, bundle);
                    }
                });
            }
        }
    }

    @Override // com.tencent.liteav.renderer.InterfaceC14187g
    /* JADX INFO: renamed from: a */
    public int mo83568a(int i, float[] fArr) {
        C14188h c14188h;
        C13966a c13966a = this.f59264v;
        if (this.f59262t && c13966a != null && (c14188h = this.f59231A) != null) {
            int iM83954d = c14188h.m83954d(i);
            c13966a.m82651a(iM83954d, TXCTimeUtil.getTimeTick());
            this.f59248f.mo83852a(iM83954d, this.f59267y, this.f59268z, false, 0);
        }
        if (this.f59262t) {
            m83553j();
            return i;
        }
        m83554k();
        return i;
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC13963a
    /* JADX INFO: renamed from: a */
    public void mo82643a(SurfaceTexture surfaceTexture) {
        m83554k();
        mo83590d();
    }

    @Override // com.tencent.liteav.AbstractC14121n
    /* JADX INFO: renamed from: a */
    public void mo83583a(boolean z, int i) {
        this.f59237G = z;
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, i);
    }
}
