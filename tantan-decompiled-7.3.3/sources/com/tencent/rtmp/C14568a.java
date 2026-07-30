package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.liteav.AbstractC14284n;
import com.tencent.liteav.C14274h;
import com.tencent.liteav.C14276j;
import com.tencent.liteav.C14319p;
import com.tencent.liteav.InterfaceC14318o;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p091a.EnumC14167b;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.rtmp.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14568a implements InterfaceC14170b {

    /* JADX INFO: renamed from: A */
    private long f61216A;

    /* JADX INFO: renamed from: B */
    private String f61217B;

    /* JADX INFO: renamed from: I */
    private TXLivePlayer.ITXAudioRawDataListener f61224I;

    /* JADX INFO: renamed from: a */
    private TXCloudVideoView f61225a;

    /* JADX INFO: renamed from: b */
    private Surface f61226b;

    /* JADX INFO: renamed from: c */
    private int f61227c;

    /* JADX INFO: renamed from: d */
    private int f61228d;

    /* JADX INFO: renamed from: f */
    private TXLivePlayConfig f61230f;

    /* JADX INFO: renamed from: i */
    private int f61233i;

    /* JADX INFO: renamed from: j */
    private int f61234j;

    /* JADX INFO: renamed from: r */
    private Context f61242r;

    /* JADX INFO: renamed from: s */
    private Handler f61243s;

    /* JADX INFO: renamed from: t */
    private AbstractC14284n f61244t;

    /* JADX INFO: renamed from: y */
    private C14276j f61249y;

    /* JADX INFO: renamed from: z */
    private boolean f61250z;

    /* JADX INFO: renamed from: g */
    private boolean f61231g = false;

    /* JADX INFO: renamed from: h */
    private boolean f61232h = true;

    /* JADX INFO: renamed from: k */
    private String f61235k = "";

    /* JADX INFO: renamed from: l */
    private boolean f61236l = false;

    /* JADX INFO: renamed from: m */
    private int f61237m = 100;

    /* JADX INFO: renamed from: n */
    private TXLivePlayer.ITXVideoRawDataListener f61238n = null;

    /* JADX INFO: renamed from: o */
    private byte[] f61239o = null;

    /* JADX INFO: renamed from: p */
    private Object f61240p = null;

    /* JADX INFO: renamed from: q */
    private TXLivePlayer.ITXLivePlayVideoRenderListener f61241q = null;

    /* JADX INFO: renamed from: u */
    private boolean f61245u = true;

    /* JADX INFO: renamed from: v */
    private float f61246v = 1.0f;

    /* JADX INFO: renamed from: w */
    private boolean f61247w = false;

    /* JADX INFO: renamed from: x */
    private int f61248x = 0;

    /* JADX INFO: renamed from: C */
    private int f61218C = -1;

    /* JADX INFO: renamed from: D */
    private Vector<String> f61219D = new Vector<>();

    /* JADX INFO: renamed from: E */
    private long f61220E = 0;

    /* JADX INFO: renamed from: F */
    private TXLivePlayer.ITXAudioVolumeEvaluationListener f61221F = null;

    /* JADX INFO: renamed from: G */
    private int f61222G = 0;

    /* JADX INFO: renamed from: H */
    private a f61223H = null;

    /* JADX INFO: renamed from: e */
    private ITXLivePlayListener f61229e = null;

    /* JADX INFO: renamed from: com.tencent.rtmp.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private int f61260b;

        private a() {
            this.f61260b = 300;
        }

        /* JADX INFO: renamed from: a */
        public void m85761a(int i) {
            this.f61260b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C14568a.this.f61244t != null && C14568a.this.f61244t.mo84772c()) {
                int iMo84778h = C14568a.this.f61244t.mo84778h();
                if (C14568a.this.f61221F != null) {
                    C14568a.this.f61221F.onAudioVolumeEvaluationNotify(iMo84778h);
                }
            }
            if (C14568a.this.f61243s == null || this.f61260b <= 0) {
                return;
            }
            C14568a.this.f61243s.postDelayed(C14568a.this.f61223H, this.f61260b);
        }
    }

    public C14568a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f61242r = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
        this.f61243s = new Handler(Looper.getMainLooper());
        TXCCommonUtil.setAppContext(this.f61242r);
        TXCLog.init();
    }

    /* JADX INFO: renamed from: c */
    private String m85720c(String str, int i) {
        if (i != 6) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder(bytes.length);
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    int i3 = bytes[i2];
                    if (i3 < 0) {
                        i3 += 256;
                    }
                    if (i3 <= 32 || i3 >= 127 || i3 == 34 || i3 == 37 || i3 == 60 || i3 == 62 || i3 == 91 || i3 == 125 || i3 == 92 || i3 == 93 || i3 == 94 || i3 == 96 || i3 == 123 || i3 == 124) {
                        sb.append(String.format("%%%02X", Integer.valueOf(i3)));
                    } else {
                        sb.append((char) i3);
                    }
                }
                str = sb.toString();
            } catch (Exception e) {
                TXCLog.m84150e(TXLivePlayer.TAG, "check play url failed.", e);
            }
        }
        return str.trim();
    }

    /* JADX INFO: renamed from: f */
    private void m85723f() {
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            int i = this.f61222G;
            abstractC14284n.mo84766a(i > 0, i);
            if (this.f61222G > 0) {
                if (this.f61223H == null) {
                    this.f61223H = new a();
                }
                this.f61223H.m85761a(this.f61222G);
                Handler handler = this.f61243s;
                if (handler != null) {
                    handler.removeCallbacks(this.f61223H);
                    this.f61243s.postDelayed(this.f61223H, this.f61222G);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m85727h() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    /* JADX INFO: renamed from: a */
    public int m85730a(String str, int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api startPlay " + this);
        if (TextUtils.isEmpty(str)) {
            TXCLog.m84149e(TXLivePlayer.TAG, "start play error when url is empty " + this);
            return -1;
        }
        if (!TextUtils.isEmpty(this.f61235k)) {
            if (this.f61235k.equalsIgnoreCase(str) && m85744a()) {
                TXCLog.m84149e(TXLivePlayer.TAG, "start play error when new url is the same with old url  " + this);
                if (this.f61250z) {
                    onNotifyEvent(2004, new Bundle());
                }
                return this.f61250z ? 0 : -1;
            }
            TXCLog.m84156w(TXLivePlayer.TAG, " stop old play when new url is not the same with old url  " + this);
            AbstractC14284n abstractC14284n = this.f61244t;
            if (abstractC14284n != null) {
                abstractC14284n.mo84754a(false);
            }
            this.f61235k = "";
        }
        TXCDRApi.initCrashReport(this.f61242r);
        TXCLog.m84152i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m84152i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m84152i(TXLivePlayer.TAG, "=====  StartPlay url = " + str + " playType = " + i + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.m84152i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m84152i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        int i2 = this.f61218C;
        if (i2 == -1 || i2 != i) {
            this.f61244t = C14319p.m84942a(this.f61242r, i);
        }
        this.f61218C = i;
        if (this.f61244t == null) {
            return -2;
        }
        this.f61235k = m85720c(str, i);
        m85737a(this.f61230f);
        TXCloudVideoView tXCloudVideoView = this.f61225a;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f61225a.setVisibility(0);
        }
        this.f61244t.mo84764a(this.f61225a);
        this.f61244t.m84847a(this);
        this.f61244t.m84848d(this.f61245u);
        Surface surface = this.f61226b;
        if (surface != null) {
            this.f61244t.mo84759a(surface);
            this.f61244t.mo84757a(this.f61227c, this.f61228d);
        }
        this.f61244t.mo84753a(this.f61235k, i);
        this.f61244t.mo84769b(this.f61236l);
        this.f61244t.mo84770c(this.f61237m);
        this.f61244t.m84846a(this.f61246v);
        this.f61244t.mo84768b(this.f61234j);
        this.f61244t.mo84756a(this.f61233i);
        m85755d(this.f61248x);
        this.f61244t.mo84763a(this.f61224I);
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.f61238n;
        if (iTXVideoRawDataListener != null) {
            m85741a(iTXVideoRawDataListener);
        }
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.f61241q;
        if (iTXLivePlayVideoRenderListener != null) {
            m85728a(iTXLivePlayVideoRenderListener, this.f61240p);
        }
        if (this.f61244t.mo84775e()) {
            this.f61217B = this.f61235k;
            C14276j c14276j = this.f61249y;
            long jM84800a = c14276j != null ? c14276j.m84800a() : 0L;
            this.f61216A = jM84800a;
            if (jM84800a > 0) {
                this.f61244t.mo84776f();
            }
        }
        m85723f();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m85749b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("api")) {
                TXCLog.m84149e(TXLivePlayer.TAG, "callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            String string = jSONObject.getString("api");
            JSONObject jSONObject2 = jSONObject.has(CommandMessage.PARAMS) ? jSONObject.getJSONObject(CommandMessage.PARAMS) : null;
            if (!string.equals("muteRemoteAudioInSpeaker")) {
                TXCLog.m84149e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: ".concat(string));
                return;
            }
            if (jSONObject2 == null) {
                TXCLog.m84149e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]");
                return;
            }
            if (!jSONObject2.has("enable")) {
                TXCLog.m84149e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]: enable");
                return;
            }
            int i = jSONObject2.getInt("enable");
            AbstractC14284n abstractC14284n = this.f61244t;
            if (abstractC14284n != null) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                abstractC14284n.mo84771c(z);
            }
        } catch (Exception unused) {
            TXCLog.m84149e(TXLivePlayer.TAG, "callExperimentalAPI[failed]: " + str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85755d(int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setAudioRoute " + i);
        this.f61248x = i;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84758a(this.f61242r, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m85758e(int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i);
        if (i <= 0) {
            this.f61222G = 0;
            m85726g();
        } else {
            if (i < 100) {
                i = 100;
            }
            this.f61222G = i;
            m85723f();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m85760g(int i) {
        TXCLog.m84147d(TXLivePlayer.TAG, "liteav_api seek " + i);
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            if (!abstractC14284n.mo84775e() && !this.f61250z) {
                this.f61244t.m84849e(i);
                return;
            }
            C14276j c14276j = this.f61249y;
            String strM84801a = c14276j != null ? c14276j.m84801a(i) : "";
            if (TextUtils.isEmpty(strM84801a)) {
                ITXLivePlayListener iTXLivePlayListener = this.f61229e;
                if (iTXLivePlayListener != null) {
                    iTXLivePlayListener.onPlayEvent(-2301, new Bundle());
                    return;
                }
                return;
            }
            boolean z = m85730a(strM84801a, 3) == 0;
            this.f61250z = z;
            if (z) {
                this.f61216A = i * 1000;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x00b3 A[PHI: r3
      0x00b3: PHI (r3v1 int) = (r3v0 int), (r3v0 int), (r3v2 int), (r3v2 int) binds: [B:23:0x0049, B:42:0x006f, B:60:0x0095, B:62:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00b8 A[PHI: r2
      0x00b8: PHI (r2v3 int) = 
      (r2v2 int)
      (r2v4 int)
      (r2v5 int)
      (r2v6 int)
      (r2v7 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v13 int)
      (r2v17 int)
     binds: [B:25:0x004d, B:27:0x0051, B:29:0x0055, B:31:0x0059, B:33:0x005d, B:35:0x0061, B:37:0x0065, B:39:0x0069, B:41:0x006d, B:44:0x0073, B:46:0x0077, B:54:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ba  */
    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 15001) {
            TXCloudVideoView tXCloudVideoView = this.f61225a;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setLogText(bundle, null, 0);
            }
            ITXLivePlayListener iTXLivePlayListener = this.f61229e;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
                return;
            }
            return;
        }
        if (i == 2005) {
            long j = ((long) bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS)) + this.f61216A;
            if (j > 0) {
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (j / 1000));
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) j);
                ITXLivePlayListener iTXLivePlayListener2 = this.f61229e;
                if (iTXLivePlayListener2 != null) {
                    iTXLivePlayListener2.onPlayEvent(i, bundle);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2026) {
            return;
        }
        int i2 = -2301;
        if (i != -2309) {
            int i3 = -2307;
            if (i != -2307) {
                i3 = -2304;
                if (i != -2304) {
                    i3 = 2015;
                    if (i != 2015) {
                        i3 = 2028;
                        if (i != 2028) {
                            i3 = 2031;
                            if (i != 2031) {
                                i3 = 2101;
                                if (i != 2101) {
                                    i3 = 2103;
                                    if (i != 2103) {
                                        i3 = 3003;
                                        if (i != 3003) {
                                            i3 = -2302;
                                            if (i == -2302) {
                                                i = i3;
                                            } else if (i != -2301) {
                                                i3 = 2012;
                                                if (i != 2012) {
                                                    i3 = 2013;
                                                    if (i == 2013) {
                                                        i = i3;
                                                    } else if (i == 2021 || i == 2022) {
                                                        i = 2008;
                                                    } else if (i != 2105) {
                                                        i3 = 2106;
                                                        if (i == 2106) {
                                                            i = i3;
                                                        } else if (i == 3006 || i == 3007) {
                                                            i = 3005;
                                                        } else {
                                                            i2 = 3002;
                                                            if (i != 3009 && i != 3010) {
                                                                switch (i) {
                                                                    case 2001:
                                                                        i = 2001;
                                                                        break;
                                                                    case 2002:
                                                                        i = 2002;
                                                                        break;
                                                                    case 2003:
                                                                        break;
                                                                    case 2004:
                                                                        i = 2004;
                                                                        break;
                                                                    case 2005:
                                                                        i = 2005;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 2007:
                                                                                i = 2007;
                                                                                break;
                                                                            case 2008:
                                                                                i = 2008;
                                                                                break;
                                                                            case 2009:
                                                                                i = 2009;
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                return;
                                                            }
                                                            i = i2;
                                                        }
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            i = i3;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                } else {
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i3;
            }
        } else {
            i = i2;
        }
        TXCloudVideoView tXCloudVideoView2 = this.f61225a;
        if (tXCloudVideoView2 != null) {
            tXCloudVideoView2.setLogText(null, bundle, i);
        }
        ITXLivePlayListener iTXLivePlayListener3 = this.f61229e;
        if (iTXLivePlayListener3 != null) {
            iTXLivePlayListener3.onPlayEvent(i, bundle);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m85754d() {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api stopRecord " + this);
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            return abstractC14284n.mo84773d();
        }
        return -1;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public void m85756d(boolean z) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setAutoPlay " + z);
        this.f61245u = z;
    }

    /* JADX INFO: renamed from: e */
    public int m85757e() {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api resumeLive " + this);
        if (!this.f61250z) {
            return -1;
        }
        this.f61250z = false;
        return m85730a(this.f61217B, 1);
    }

    /* JADX INFO: renamed from: f */
    public int m85759f(int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api startRecord " + this);
        if (!m85744a()) {
            TXCLog.m84149e(TXLivePlayer.TAG, "startRecord: there is no playing stream");
            return -1;
        }
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            return abstractC14284n.mo84774d(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    private void m85726g() {
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84766a(false, 0);
        }
        Handler handler = this.f61243s;
        if (handler != null) {
            handler.removeCallbacks(this.f61223H);
        }
        this.f61223H = null;
        this.f61222G = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m85747b() {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api pause " + this);
        if (this.f61244t != null) {
            TXCLog.m84156w(TXLivePlayer.TAG, "pause play");
            this.f61244t.mo84755a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m85751c() {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api resume " + this);
        if (this.f61244t != null) {
            TXCLog.m84156w(TXLivePlayer.TAG, "resume play");
            this.f61244t.mo84767b();
            if (this.f61244t.mo84775e()) {
                C14276j c14276j = this.f61249y;
                long jM84800a = c14276j != null ? c14276j.m84800a() : 0L;
                this.f61216A = jM84800a;
                if (jM84800a > 0) {
                    this.f61244t.mo84776f();
                }
            }
            m85755d(this.f61248x);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85748b(int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setRenderRotation " + i);
        this.f61234j = i;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84768b(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m85750b(boolean z) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api enableHardwareDecode " + z);
        if (z && m85727h()) {
            TXCLog.m84149e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
            return false;
        }
        this.f61231g = z;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n == null) {
            return true;
        }
        C14274h c14274hM84850i = abstractC14284n.m84850i();
        if (c14274hM84850i == null) {
            c14274hM84850i = new C14274h();
        }
        c14274hM84850i.f60189h = this.f61231g;
        this.f61244t.mo84761a(c14274hM84850i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m85753c(boolean z) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setMute " + z);
        this.f61236l = z;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84769b(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m85752c(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setVolume volume = " + i);
        this.f61237m = i;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84770c(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m85746b(String str, int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api prepareLiveSeek " + this);
        if (this.f61249y == null) {
            this.f61249y = new C14276j();
        }
        C14276j c14276j = this.f61249y;
        if (c14276j != null) {
            return c14276j.m84799a(this.f61235k, str, i, new C14276j.a() { // from class: com.tencent.rtmp.a.4
                @Override // com.tencent.liteav.C14276j.a
                /* JADX INFO: renamed from: a */
                public void mo84802a(long j) {
                    C14568a.this.f61216A = j;
                    if (C14568a.this.f61244t != null) {
                        C14568a.this.f61244t.mo84776f();
                    }
                }
            });
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void m85737a(TXLivePlayConfig tXLivePlayConfig) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setConfig " + this);
        this.f61230f = tXLivePlayConfig;
        if (tXLivePlayConfig == null) {
            this.f61230f = new TXLivePlayConfig();
        }
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            C14274h c14274hM84850i = abstractC14284n.m84850i();
            if (c14274hM84850i == null) {
                c14274hM84850i = new C14274h();
            }
            TXLivePlayConfig tXLivePlayConfig2 = this.f61230f;
            c14274hM84850i.f60182a = tXLivePlayConfig2.mCacheTime;
            c14274hM84850i.f60188g = tXLivePlayConfig2.mAutoAdjustCacheTime;
            c14274hM84850i.f60184c = tXLivePlayConfig2.mMinAutoAdjustCacheTime;
            c14274hM84850i.f60183b = tXLivePlayConfig2.mMaxAutoAdjustCacheTime;
            c14274hM84850i.f60185d = tXLivePlayConfig2.mVideoBlockThreshold;
            c14274hM84850i.f60186e = tXLivePlayConfig2.mConnectRetryCount;
            c14274hM84850i.f60187f = tXLivePlayConfig2.mConnectRetryInterval;
            c14274hM84850i.f60190i = tXLivePlayConfig2.mEnableNearestIP;
            c14274hM84850i.f60194m = tXLivePlayConfig2.mRtmpChannelType;
            c14274hM84850i.f60189h = this.f61231g;
            c14274hM84850i.f60195n = tXLivePlayConfig2.mCacheFolderPath;
            c14274hM84850i.f60196o = tXLivePlayConfig2.mMaxCacheItems;
            c14274hM84850i.f60191j = tXLivePlayConfig2.mEnableMessage;
            c14274hM84850i.f60192k = tXLivePlayConfig2.mEnableMetaData;
            c14274hM84850i.f60193l = tXLivePlayConfig2.mFlvSessionKey;
            c14274hM84850i.f60197p = tXLivePlayConfig2.mHeaders;
            this.f61244t.mo84761a(c14274hM84850i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85736a(ITXLivePlayListener iTXLivePlayListener) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setPlayListener " + this);
        this.f61229e = iTXLivePlayListener;
    }

    /* JADX INFO: renamed from: a */
    public void m85742a(TXCloudVideoView tXCloudVideoView) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setPlayerView old view : " + this.f61225a + ", new view : " + tXCloudVideoView + ", " + this);
        this.f61225a = tXCloudVideoView;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84764a(tXCloudVideoView);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m85731a(boolean z) {
        TXCloudVideoView tXCloudVideoView;
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api stopPlay " + z + ", " + this);
        if (z && (tXCloudVideoView = this.f61225a) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        m85726g();
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84754a(z);
        }
        this.f61235k = "";
        this.f61216A = 0L;
        this.f61249y = null;
        this.f61250z = false;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85744a() {
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            return abstractC14284n.mo84772c();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m85735a(Surface surface) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setSurface old : " + this.f61226b + ", new : " + surface + ", " + this);
        this.f61226b = surface;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84759a(surface);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85734a(int i, int i2) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setSurfaceSize " + i + BaseSei.f14624X + i2 + ", " + this);
        this.f61227c = i;
        this.f61228d = i2;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84757a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85733a(int i) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setRenderMode " + i);
        this.f61233i = i;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84756a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m85729a(String str) {
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            return abstractC14284n.mo84752a(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void m85739a(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f61221F = iTXAudioVolumeEvaluationListener;
    }

    /* JADX INFO: renamed from: a */
    public void m85743a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setVideoRecordListener");
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84765a(iTXVideoRecordListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85740a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api snapshot " + iTXSnapshotListener);
        if (this.f61247w || iTXSnapshotListener == null) {
            return;
        }
        this.f61247w = true;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84760a(new InterfaceC14185o() { // from class: com.tencent.rtmp.a.1
                @Override // com.tencent.liteav.basic.p093c.InterfaceC14185o
                public void onTakePhotoComplete(Bitmap bitmap) {
                    C14568a.this.m85714a(iTXSnapshotListener, bitmap);
                }
            });
        } else {
            this.f61247w = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m85745a(byte[] bArr) {
        String str = this.f61235k;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (this.f61231g) {
            TXLog.m85709e(TXLivePlayer.TAG, "can not addVideoRawData because of hw decode has set!");
            return false;
        }
        if (this.f61244t == null) {
            TXCLog.m84149e(TXLivePlayer.TAG, "player hasn't created or not instanceof live player");
            return false;
        }
        this.f61239o = bArr;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m85728a(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        if (obj != null && !(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
            TXCLog.m84156w(TXLivePlayer.TAG, "liteav_api setVideoRenderListener error when glContext error " + obj);
            return -1;
        }
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setVideoRenderListener " + iTXLivePlayVideoRenderListener + ", context " + obj);
        this.f61240p = obj;
        this.f61241q = iTXLivePlayVideoRenderListener;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n == null) {
            return 0;
        }
        if (iTXLivePlayVideoRenderListener != null) {
            abstractC14284n.mo84762a(new InterfaceC14318o() { // from class: com.tencent.rtmp.a.2
                @Override // com.tencent.liteav.InterfaceC14318o
                public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                    TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener2;
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0 || (iTXLivePlayVideoRenderListener2 = C14568a.this.f61241q) == null) {
                        return;
                    }
                    TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
                    tXLiteAVTexture.textureId = tXSVideoFrame.textureId;
                    tXLiteAVTexture.width = tXSVideoFrame.width;
                    tXLiteAVTexture.height = tXSVideoFrame.height;
                    tXLiteAVTexture.eglContext = tXSVideoFrame.eglContext;
                    iTXLivePlayVideoRenderListener2.onRenderVideoFrame(tXLiteAVTexture);
                }
            }, EnumC14167b.TEXTURE_2D, obj);
            return 0;
        }
        abstractC14284n.mo84762a(null, EnumC14167b.UNKNOWN, null);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m85741a(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setVideoRawDataListener " + iTXVideoRawDataListener);
        this.f61238n = iTXVideoRawDataListener;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n == null) {
            return;
        }
        if (iTXVideoRawDataListener != null) {
            abstractC14284n.mo84762a(new InterfaceC14318o() { // from class: com.tencent.rtmp.a.3
                @Override // com.tencent.liteav.InterfaceC14318o
                public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0) {
                        return;
                    }
                    byte[] bArr = C14568a.this.f61239o;
                    C14568a.this.f61239o = null;
                    TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener2 = C14568a.this.f61238n;
                    if (iTXVideoRawDataListener2 == null || bArr == null) {
                        return;
                    }
                    if (bArr.length < ((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2) {
                        TXCLog.m84149e(TXLivePlayer.TAG, "raw data buffer length is too large");
                        return;
                    }
                    tXSVideoFrame.loadYUVArray(bArr);
                    iTXVideoRawDataListener2.onVideoRawDataAvailable(bArr, tXSVideoFrame.width, tXSVideoFrame.height, (int) tXSVideoFrame.pts);
                    tXSVideoFrame.release();
                }
            }, EnumC14167b.I420, null);
        } else {
            abstractC14284n.mo84762a(null, EnumC14167b.UNKNOWN, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85738a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setAudioRawDataListener " + iTXAudioRawDataListener);
        this.f61224I = iTXAudioRawDataListener;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.mo84763a(iTXAudioRawDataListener);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m85732a(float f) {
        TXCLog.m84152i(TXLivePlayer.TAG, "liteav_api setRate " + f);
        this.f61246v = f;
        AbstractC14284n abstractC14284n = this.f61244t;
        if (abstractC14284n != null) {
            abstractC14284n.m84846a(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85714a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
        if (iTXSnapshotListener == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.a.5
            @Override // java.lang.Runnable
            public void run() {
                TXLivePlayer.ITXSnapshotListener iTXSnapshotListener2 = iTXSnapshotListener;
                if (iTXSnapshotListener2 != null) {
                    iTXSnapshotListener2.onSnapshot(bitmap);
                }
                C14568a.this.f61247w = false;
            }
        });
    }
}
