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
import com.tencent.liteav.AbstractC14121n;
import com.tencent.liteav.C14111h;
import com.tencent.liteav.C14113j;
import com.tencent.liteav.C14156p;
import com.tencent.liteav.InterfaceC14155o;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p086a.EnumC14004b;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.rtmp.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14405a implements InterfaceC14007b {

    /* JADX INFO: renamed from: A */
    private long f60368A;

    /* JADX INFO: renamed from: B */
    private String f60369B;

    /* JADX INFO: renamed from: I */
    private TXLivePlayer.ITXAudioRawDataListener f60376I;

    /* JADX INFO: renamed from: a */
    private TXCloudVideoView f60377a;

    /* JADX INFO: renamed from: b */
    private Surface f60378b;

    /* JADX INFO: renamed from: c */
    private int f60379c;

    /* JADX INFO: renamed from: d */
    private int f60380d;

    /* JADX INFO: renamed from: f */
    private TXLivePlayConfig f60382f;

    /* JADX INFO: renamed from: i */
    private int f60385i;

    /* JADX INFO: renamed from: j */
    private int f60386j;

    /* JADX INFO: renamed from: r */
    private Context f60394r;

    /* JADX INFO: renamed from: s */
    private Handler f60395s;

    /* JADX INFO: renamed from: t */
    private AbstractC14121n f60396t;

    /* JADX INFO: renamed from: y */
    private C14113j f60401y;

    /* JADX INFO: renamed from: z */
    private boolean f60402z;

    /* JADX INFO: renamed from: g */
    private boolean f60383g = false;

    /* JADX INFO: renamed from: h */
    private boolean f60384h = true;

    /* JADX INFO: renamed from: k */
    private String f60387k = "";

    /* JADX INFO: renamed from: l */
    private boolean f60388l = false;

    /* JADX INFO: renamed from: m */
    private int f60389m = 100;

    /* JADX INFO: renamed from: n */
    private TXLivePlayer.ITXVideoRawDataListener f60390n = null;

    /* JADX INFO: renamed from: o */
    private byte[] f60391o = null;

    /* JADX INFO: renamed from: p */
    private Object f60392p = null;

    /* JADX INFO: renamed from: q */
    private TXLivePlayer.ITXLivePlayVideoRenderListener f60393q = null;

    /* JADX INFO: renamed from: u */
    private boolean f60397u = true;

    /* JADX INFO: renamed from: v */
    private float f60398v = 1.0f;

    /* JADX INFO: renamed from: w */
    private boolean f60399w = false;

    /* JADX INFO: renamed from: x */
    private int f60400x = 0;

    /* JADX INFO: renamed from: C */
    private int f60370C = -1;

    /* JADX INFO: renamed from: D */
    private Vector<String> f60371D = new Vector<>();

    /* JADX INFO: renamed from: E */
    private long f60372E = 0;

    /* JADX INFO: renamed from: F */
    private TXLivePlayer.ITXAudioVolumeEvaluationListener f60373F = null;

    /* JADX INFO: renamed from: G */
    private int f60374G = 0;

    /* JADX INFO: renamed from: H */
    private a f60375H = null;

    /* JADX INFO: renamed from: e */
    private ITXLivePlayListener f60381e = null;

    /* JADX INFO: renamed from: com.tencent.rtmp.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        private int f60412b;

        private a() {
            this.f60412b = 300;
        }

        /* JADX INFO: renamed from: a */
        public void m84578a(int i) {
            this.f60412b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C14405a.this.f60396t != null && C14405a.this.f60396t.mo83589c()) {
                int iMo83595h = C14405a.this.f60396t.mo83595h();
                if (C14405a.this.f60373F != null) {
                    C14405a.this.f60373F.onAudioVolumeEvaluationNotify(iMo83595h);
                }
            }
            if (C14405a.this.f60395s == null || this.f60412b <= 0) {
                return;
            }
            C14405a.this.f60395s.postDelayed(C14405a.this.f60375H, this.f60412b);
        }
    }

    public C14405a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f60394r = applicationContext;
        TXCCommonUtil.setAppContext(applicationContext);
        TXCLog.init();
        this.f60395s = new Handler(Looper.getMainLooper());
        TXCCommonUtil.setAppContext(this.f60394r);
        TXCLog.init();
    }

    /* JADX INFO: renamed from: c */
    private String m84537c(String str, int i) {
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
                TXCLog.m82967e(TXLivePlayer.TAG, "check play url failed.", e);
            }
        }
        return str.trim();
    }

    /* JADX INFO: renamed from: f */
    private void m84540f() {
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            int i = this.f60374G;
            abstractC14121n.mo83583a(i > 0, i);
            if (this.f60374G > 0) {
                if (this.f60375H == null) {
                    this.f60375H = new a();
                }
                this.f60375H.m84578a(this.f60374G);
                Handler handler = this.f60395s;
                if (handler != null) {
                    handler.removeCallbacks(this.f60375H);
                    this.f60395s.postDelayed(this.f60375H, this.f60374G);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m84544h() {
        return Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("Che2-TL00");
    }

    /* JADX INFO: renamed from: a */
    public int m84547a(String str, int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api startPlay " + this);
        if (TextUtils.isEmpty(str)) {
            TXCLog.m82966e(TXLivePlayer.TAG, "start play error when url is empty " + this);
            return -1;
        }
        if (!TextUtils.isEmpty(this.f60387k)) {
            if (this.f60387k.equalsIgnoreCase(str) && m84561a()) {
                TXCLog.m82966e(TXLivePlayer.TAG, "start play error when new url is the same with old url  " + this);
                if (this.f60402z) {
                    onNotifyEvent(2004, new Bundle());
                }
                return this.f60402z ? 0 : -1;
            }
            TXCLog.m82973w(TXLivePlayer.TAG, " stop old play when new url is not the same with old url  " + this);
            AbstractC14121n abstractC14121n = this.f60396t;
            if (abstractC14121n != null) {
                abstractC14121n.mo83571a(false);
            }
            this.f60387k = "";
        }
        TXCDRApi.initCrashReport(this.f60394r);
        TXCLog.m82969i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m82969i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m82969i(TXLivePlayer.TAG, "=====  StartPlay url = " + str + " playType = " + i + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.m82969i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        TXCLog.m82969i(TXLivePlayer.TAG, "===========================================================================================================================================================");
        int i2 = this.f60370C;
        if (i2 == -1 || i2 != i) {
            this.f60396t = C14156p.m83759a(this.f60394r, i);
        }
        this.f60370C = i;
        if (this.f60396t == null) {
            return -2;
        }
        this.f60387k = m84537c(str, i);
        m84554a(this.f60382f);
        TXCloudVideoView tXCloudVideoView = this.f60377a;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f60377a.setVisibility(0);
        }
        this.f60396t.mo83581a(this.f60377a);
        this.f60396t.m83664a(this);
        this.f60396t.m83665d(this.f60397u);
        Surface surface = this.f60378b;
        if (surface != null) {
            this.f60396t.mo83576a(surface);
            this.f60396t.mo83574a(this.f60379c, this.f60380d);
        }
        this.f60396t.mo83570a(this.f60387k, i);
        this.f60396t.mo83586b(this.f60388l);
        this.f60396t.mo83587c(this.f60389m);
        this.f60396t.m83663a(this.f60398v);
        this.f60396t.mo83585b(this.f60386j);
        this.f60396t.mo83573a(this.f60385i);
        m84572d(this.f60400x);
        this.f60396t.mo83580a(this.f60376I);
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.f60390n;
        if (iTXVideoRawDataListener != null) {
            m84558a(iTXVideoRawDataListener);
        }
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.f60393q;
        if (iTXLivePlayVideoRenderListener != null) {
            m84545a(iTXLivePlayVideoRenderListener, this.f60392p);
        }
        if (this.f60396t.mo83592e()) {
            this.f60369B = this.f60387k;
            C14113j c14113j = this.f60401y;
            long jM83617a = c14113j != null ? c14113j.m83617a() : 0L;
            this.f60368A = jM83617a;
            if (jM83617a > 0) {
                this.f60396t.mo83593f();
            }
        }
        m84540f();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m84566b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("api")) {
                TXCLog.m82966e(TXLivePlayer.TAG, "callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            String string = jSONObject.getString("api");
            JSONObject jSONObject2 = jSONObject.has(CommandMessage.PARAMS) ? jSONObject.getJSONObject(CommandMessage.PARAMS) : null;
            if (!string.equals("muteRemoteAudioInSpeaker")) {
                TXCLog.m82966e(TXLivePlayer.TAG, "callExperimentalAPI[illegal api]: ".concat(string));
                return;
            }
            if (jSONObject2 == null) {
                TXCLog.m82966e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]");
                return;
            }
            if (!jSONObject2.has("enable")) {
                TXCLog.m82966e(TXLivePlayer.TAG, "muteRemoteAudioInSpeaker[lack parameter]: enable");
                return;
            }
            int i = jSONObject2.getInt("enable");
            AbstractC14121n abstractC14121n = this.f60396t;
            if (abstractC14121n != null) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                abstractC14121n.mo83588c(z);
            }
        } catch (Exception unused) {
            TXCLog.m82966e(TXLivePlayer.TAG, "callExperimentalAPI[failed]: " + str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84572d(int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setAudioRoute " + i);
        this.f60400x = i;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83575a(this.f60394r, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m84575e(int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api enableAudioVolumeEvaluation intervalMs = " + i);
        if (i <= 0) {
            this.f60374G = 0;
            m84543g();
        } else {
            if (i < 100) {
                i = 100;
            }
            this.f60374G = i;
            m84540f();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m84577g(int i) {
        TXCLog.m82964d(TXLivePlayer.TAG, "liteav_api seek " + i);
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            if (!abstractC14121n.mo83592e() && !this.f60402z) {
                this.f60396t.m83666e(i);
                return;
            }
            C14113j c14113j = this.f60401y;
            String strM83618a = c14113j != null ? c14113j.m83618a(i) : "";
            if (TextUtils.isEmpty(strM83618a)) {
                ITXLivePlayListener iTXLivePlayListener = this.f60381e;
                if (iTXLivePlayListener != null) {
                    iTXLivePlayListener.onPlayEvent(-2301, new Bundle());
                    return;
                }
                return;
            }
            boolean z = m84547a(strM83618a, 3) == 0;
            this.f60402z = z;
            if (z) {
                this.f60368A = i * 1000;
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
    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 15001) {
            TXCloudVideoView tXCloudVideoView = this.f60377a;
            if (tXCloudVideoView != null) {
                tXCloudVideoView.setLogText(bundle, null, 0);
            }
            ITXLivePlayListener iTXLivePlayListener = this.f60381e;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
                return;
            }
            return;
        }
        if (i == 2005) {
            long j = ((long) bundle.getInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS)) + this.f60368A;
            if (j > 0) {
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS, (int) (j / 1000));
                bundle.putInt(TXLiveConstants.EVT_PLAY_PROGRESS_MS, (int) j);
                ITXLivePlayListener iTXLivePlayListener2 = this.f60381e;
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
        TXCloudVideoView tXCloudVideoView2 = this.f60377a;
        if (tXCloudVideoView2 != null) {
            tXCloudVideoView2.setLogText(null, bundle, i);
        }
        ITXLivePlayListener iTXLivePlayListener3 = this.f60381e;
        if (iTXLivePlayListener3 != null) {
            iTXLivePlayListener3.onPlayEvent(i, bundle);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m84571d() {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api stopRecord " + this);
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            return abstractC14121n.mo83590d();
        }
        return -1;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public void m84573d(boolean z) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setAutoPlay " + z);
        this.f60397u = z;
    }

    /* JADX INFO: renamed from: e */
    public int m84574e() {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api resumeLive " + this);
        if (!this.f60402z) {
            return -1;
        }
        this.f60402z = false;
        return m84547a(this.f60369B, 1);
    }

    /* JADX INFO: renamed from: f */
    public int m84576f(int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api startRecord " + this);
        if (!m84561a()) {
            TXCLog.m82966e(TXLivePlayer.TAG, "startRecord: there is no playing stream");
            return -1;
        }
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            return abstractC14121n.mo83591d(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    private void m84543g() {
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83583a(false, 0);
        }
        Handler handler = this.f60395s;
        if (handler != null) {
            handler.removeCallbacks(this.f60375H);
        }
        this.f60375H = null;
        this.f60374G = 0;
    }

    /* JADX INFO: renamed from: b */
    public void m84564b() {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api pause " + this);
        if (this.f60396t != null) {
            TXCLog.m82973w(TXLivePlayer.TAG, "pause play");
            this.f60396t.mo83572a();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m84568c() {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api resume " + this);
        if (this.f60396t != null) {
            TXCLog.m82973w(TXLivePlayer.TAG, "resume play");
            this.f60396t.mo83584b();
            if (this.f60396t.mo83592e()) {
                C14113j c14113j = this.f60401y;
                long jM83617a = c14113j != null ? c14113j.m83617a() : 0L;
                this.f60368A = jM83617a;
                if (jM83617a > 0) {
                    this.f60396t.mo83593f();
                }
            }
            m84572d(this.f60400x);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84565b(int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setRenderRotation " + i);
        this.f60386j = i;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83585b(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m84567b(boolean z) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api enableHardwareDecode " + z);
        if (z && m84544h()) {
            TXCLog.m82966e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
            return false;
        }
        this.f60383g = z;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n == null) {
            return true;
        }
        C14111h c14111hM83667i = abstractC14121n.m83667i();
        if (c14111hM83667i == null) {
            c14111hM83667i = new C14111h();
        }
        c14111hM83667i.f59341h = this.f60383g;
        this.f60396t.mo83578a(c14111hM83667i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m84570c(boolean z) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setMute " + z);
        this.f60388l = z;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83586b(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m84569c(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setVolume volume = " + i);
        this.f60389m = i;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83587c(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m84563b(String str, int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api prepareLiveSeek " + this);
        if (this.f60401y == null) {
            this.f60401y = new C14113j();
        }
        C14113j c14113j = this.f60401y;
        if (c14113j != null) {
            return c14113j.m83616a(this.f60387k, str, i, new C14113j.a() { // from class: com.tencent.rtmp.a.4
                @Override // com.tencent.liteav.C14113j.a
                /* JADX INFO: renamed from: a */
                public void mo83619a(long j) {
                    C14405a.this.f60368A = j;
                    if (C14405a.this.f60396t != null) {
                        C14405a.this.f60396t.mo83593f();
                    }
                }
            });
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void m84554a(TXLivePlayConfig tXLivePlayConfig) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setConfig " + this);
        this.f60382f = tXLivePlayConfig;
        if (tXLivePlayConfig == null) {
            this.f60382f = new TXLivePlayConfig();
        }
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            C14111h c14111hM83667i = abstractC14121n.m83667i();
            if (c14111hM83667i == null) {
                c14111hM83667i = new C14111h();
            }
            TXLivePlayConfig tXLivePlayConfig2 = this.f60382f;
            c14111hM83667i.f59334a = tXLivePlayConfig2.mCacheTime;
            c14111hM83667i.f59340g = tXLivePlayConfig2.mAutoAdjustCacheTime;
            c14111hM83667i.f59336c = tXLivePlayConfig2.mMinAutoAdjustCacheTime;
            c14111hM83667i.f59335b = tXLivePlayConfig2.mMaxAutoAdjustCacheTime;
            c14111hM83667i.f59337d = tXLivePlayConfig2.mVideoBlockThreshold;
            c14111hM83667i.f59338e = tXLivePlayConfig2.mConnectRetryCount;
            c14111hM83667i.f59339f = tXLivePlayConfig2.mConnectRetryInterval;
            c14111hM83667i.f59342i = tXLivePlayConfig2.mEnableNearestIP;
            c14111hM83667i.f59346m = tXLivePlayConfig2.mRtmpChannelType;
            c14111hM83667i.f59341h = this.f60383g;
            c14111hM83667i.f59347n = tXLivePlayConfig2.mCacheFolderPath;
            c14111hM83667i.f59348o = tXLivePlayConfig2.mMaxCacheItems;
            c14111hM83667i.f59343j = tXLivePlayConfig2.mEnableMessage;
            c14111hM83667i.f59344k = tXLivePlayConfig2.mEnableMetaData;
            c14111hM83667i.f59345l = tXLivePlayConfig2.mFlvSessionKey;
            c14111hM83667i.f59349p = tXLivePlayConfig2.mHeaders;
            this.f60396t.mo83578a(c14111hM83667i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84553a(ITXLivePlayListener iTXLivePlayListener) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setPlayListener " + this);
        this.f60381e = iTXLivePlayListener;
    }

    /* JADX INFO: renamed from: a */
    public void m84559a(TXCloudVideoView tXCloudVideoView) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setPlayerView old view : " + this.f60377a + ", new view : " + tXCloudVideoView + ", " + this);
        this.f60377a = tXCloudVideoView;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83581a(tXCloudVideoView);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m84548a(boolean z) {
        TXCloudVideoView tXCloudVideoView;
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api stopPlay " + z + ", " + this);
        if (z && (tXCloudVideoView = this.f60377a) != null) {
            tXCloudVideoView.setVisibility(8);
        }
        m84543g();
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83571a(z);
        }
        this.f60387k = "";
        this.f60368A = 0L;
        this.f60401y = null;
        this.f60402z = false;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m84561a() {
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            return abstractC14121n.mo83589c();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m84552a(Surface surface) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setSurface old : " + this.f60378b + ", new : " + surface + ", " + this);
        this.f60378b = surface;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83576a(surface);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84551a(int i, int i2) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setSurfaceSize " + i + BaseSei.f13930X + i2 + ", " + this);
        this.f60379c = i;
        this.f60380d = i2;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83574a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84550a(int i) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setRenderMode " + i);
        this.f60385i = i;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83573a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m84546a(String str) {
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            return abstractC14121n.mo83569a(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void m84556a(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f60373F = iTXAudioVolumeEvaluationListener;
    }

    /* JADX INFO: renamed from: a */
    public void m84560a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setVideoRecordListener");
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83582a(iTXVideoRecordListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84557a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api snapshot " + iTXSnapshotListener);
        if (this.f60399w || iTXSnapshotListener == null) {
            return;
        }
        this.f60399w = true;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83577a(new InterfaceC14022o() { // from class: com.tencent.rtmp.a.1
                @Override // com.tencent.liteav.basic.p088c.InterfaceC14022o
                public void onTakePhotoComplete(Bitmap bitmap) {
                    C14405a.this.m84531a(iTXSnapshotListener, bitmap);
                }
            });
        } else {
            this.f60399w = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m84562a(byte[] bArr) {
        String str = this.f60387k;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (this.f60383g) {
            TXLog.m84526e(TXLivePlayer.TAG, "can not addVideoRawData because of hw decode has set!");
            return false;
        }
        if (this.f60396t == null) {
            TXCLog.m82966e(TXLivePlayer.TAG, "player hasn't created or not instanceof live player");
            return false;
        }
        this.f60391o = bArr;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m84545a(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        if (obj != null && !(obj instanceof EGLContext) && !(obj instanceof android.opengl.EGLContext)) {
            TXCLog.m82973w(TXLivePlayer.TAG, "liteav_api setVideoRenderListener error when glContext error " + obj);
            return -1;
        }
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setVideoRenderListener " + iTXLivePlayVideoRenderListener + ", context " + obj);
        this.f60392p = obj;
        this.f60393q = iTXLivePlayVideoRenderListener;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n == null) {
            return 0;
        }
        if (iTXLivePlayVideoRenderListener != null) {
            abstractC14121n.mo83579a(new InterfaceC14155o() { // from class: com.tencent.rtmp.a.2
                @Override // com.tencent.liteav.InterfaceC14155o
                public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                    TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener2;
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0 || (iTXLivePlayVideoRenderListener2 = C14405a.this.f60393q) == null) {
                        return;
                    }
                    TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
                    tXLiteAVTexture.textureId = tXSVideoFrame.textureId;
                    tXLiteAVTexture.width = tXSVideoFrame.width;
                    tXLiteAVTexture.height = tXSVideoFrame.height;
                    tXLiteAVTexture.eglContext = tXSVideoFrame.eglContext;
                    iTXLivePlayVideoRenderListener2.onRenderVideoFrame(tXLiteAVTexture);
                }
            }, EnumC14004b.TEXTURE_2D, obj);
            return 0;
        }
        abstractC14121n.mo83579a(null, EnumC14004b.UNKNOWN, null);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m84558a(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setVideoRawDataListener " + iTXVideoRawDataListener);
        this.f60390n = iTXVideoRawDataListener;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n == null) {
            return;
        }
        if (iTXVideoRawDataListener != null) {
            abstractC14121n.mo83579a(new InterfaceC14155o() { // from class: com.tencent.rtmp.a.3
                @Override // com.tencent.liteav.InterfaceC14155o
                public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
                    if (tXSVideoFrame == null || tXSVideoFrame.width <= 0 || tXSVideoFrame.height <= 0) {
                        return;
                    }
                    byte[] bArr = C14405a.this.f60391o;
                    C14405a.this.f60391o = null;
                    TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener2 = C14405a.this.f60390n;
                    if (iTXVideoRawDataListener2 == null || bArr == null) {
                        return;
                    }
                    if (bArr.length < ((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2) {
                        TXCLog.m82966e(TXLivePlayer.TAG, "raw data buffer length is too large");
                        return;
                    }
                    tXSVideoFrame.loadYUVArray(bArr);
                    iTXVideoRawDataListener2.onVideoRawDataAvailable(bArr, tXSVideoFrame.width, tXSVideoFrame.height, (int) tXSVideoFrame.pts);
                    tXSVideoFrame.release();
                }
            }, EnumC14004b.I420, null);
        } else {
            abstractC14121n.mo83579a(null, EnumC14004b.UNKNOWN, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84555a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setAudioRawDataListener " + iTXAudioRawDataListener);
        this.f60376I = iTXAudioRawDataListener;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.mo83580a(iTXAudioRawDataListener);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m84549a(float f) {
        TXCLog.m82969i(TXLivePlayer.TAG, "liteav_api setRate " + f);
        this.f60398v = f;
        AbstractC14121n abstractC14121n = this.f60396t;
        if (abstractC14121n != null) {
            abstractC14121n.m83663a(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84531a(final TXLivePlayer.ITXSnapshotListener iTXSnapshotListener, final Bitmap bitmap) {
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
                C14405a.this.f60399w = false;
            }
        });
    }
}
