package com.momo.pipline.codec;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.momo.pipline.MomoInterface.MomoCodec;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p153l.a320;
import p153l.aol;
import p153l.arx;
import p153l.b7y;
import p153l.brx;
import p153l.bsx;
import p153l.csx;
import p153l.esx;
import p153l.evx;
import p153l.fpf0;
import p153l.fvx;
import p153l.g510;
import p153l.hej;
import p153l.l26;
import p153l.l6m;
import p153l.q210;
import p153l.t9c;
import p153l.uow;
import p153l.wvx;
import p153l.wzl;

/* JADX INFO: loaded from: classes8.dex */
public abstract class MediaBaseCodecFilter extends hej implements evx.InterfaceC16844b, Handler.Callback, MomoCodec, q210.InterfaceC19501b, q210.InterfaceC19503d {

    /* JADX INFO: renamed from: H */
    protected wvx f14987H;

    /* JADX INFO: renamed from: I */
    protected evx f14988I;

    /* JADX INFO: renamed from: J */
    protected volatile MomoCodec.MomoCodecState f14989J;

    /* JADX INFO: renamed from: K */
    protected l6m f14990K;

    /* JADX INFO: renamed from: L */
    private CodecFilterState f14991L;

    /* JADX INFO: renamed from: M */
    private HandlerThread f14992M;

    /* JADX INFO: renamed from: N */
    private Handler f14993N;

    /* JADX INFO: renamed from: O */
    private final long f14994O;

    /* JADX INFO: renamed from: P */
    private long f14995P;

    /* JADX INFO: renamed from: Q */
    protected boolean f14996Q;

    /* JADX INFO: renamed from: R */
    protected brx f14997R;

    /* JADX INFO: renamed from: r */
    protected WeakReference<Context> f14999r;

    /* JADX INFO: renamed from: s */
    protected uow f15000s;

    /* JADX INFO: renamed from: t */
    protected int f15001t;

    /* JADX INFO: renamed from: q */
    protected long f14998q = 0;

    /* JADX INFO: renamed from: u */
    private boolean f15002u = false;

    /* JADX INFO: renamed from: v */
    protected String f15003v = "";

    /* JADX INFO: renamed from: x */
    protected String f15004x = "";

    /* JADX INFO: renamed from: y */
    protected String f15005y = "";

    /* JADX INFO: renamed from: z */
    protected a320 f15006z = null;

    /* JADX INFO: renamed from: A */
    protected String f14980A = "";

    /* JADX INFO: renamed from: B */
    private Object f14981B = new Object();

    /* JADX INFO: renamed from: C */
    private Object f14982C = new Object();

    /* JADX INFO: renamed from: D */
    private Object f14983D = new Object();

    /* JADX INFO: renamed from: E */
    private q210.InterfaceC19501b f14984E = null;

    /* JADX INFO: renamed from: F */
    protected wzl f14985F = null;

    /* JADX INFO: renamed from: G */
    protected int f14986G = 5000;

    public enum CodecFilterState {
        FILTER_IDLE,
        FILTER_STARTING,
        FILTER_PLAY,
        FILTER_STOPPING,
        FILTER_ERROR,
        FILTER_RECONNECTTING
    }

    public MediaBaseCodecFilter(Context context) {
        wvx wvxVar = new wvx();
        this.f14987H = wvxVar;
        this.f14988I = new evx(wvxVar);
        this.f14989J = MomoCodec.MomoCodecState.STOP;
        this.f14994O = 1000L;
        this.f14995P = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        this.f14996Q = true;
        m20743l2(CodecFilterState.FILTER_IDLE);
        this.f14999r = new WeakReference<>(context);
        this.f15001t = 0;
        try {
            if (csx.m112235R().m112299V0()) {
                aol.m99098e().m99108o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: V1 */
    private void m20724V1(brx brxVar) {
        String strM106179k;
        if (this.f15006z == null) {
            if (brxVar != null) {
                strM106179k = brxVar.m106179k();
            } else {
                arx.C15814d c15814dM99797h = arx.m99789d().m99797h("mlive");
                strM106179k = c15814dM99797h != null ? c15814dM99797h.f73010c : "";
            }
            this.f15006z = new a320("mdefault", "1a738fb015fe0a8476c4e05a314156d2", strM106179k, "", "", "", arx.m99789d().m99796g("mdefault"), "", this.f14987H.f191064e1, this.f15005y);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
        Handler handler = this.f14993N;
        if (handler != null && this.f14992M != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14992M.quit();
            this.f14993N = null;
            this.f14992M = null;
        }
        t9c.m189743a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":stopRecordonRecordPrepared#############"));
        synchronized (this.f14982C) {
            m20743l2(CodecFilterState.FILTER_STOPPING);
        }
        m20741j2();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H */
    public void mo20648H(int i) {
        this.f14988I.m122843l("setProvider", Integer.valueOf(i));
        this.f14987H.f191106t = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: O */
    public void mo20653O(long j) {
        this.f14998q = j;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        t9c.m189748f("sendMessageEx", "" + this.f14987H.f191059d);
        if (this.f14988I.m122841j()) {
            if (uowVar.f180179X0) {
                this.f14988I.m122834a();
            }
            this.f14988I.m122832N(this);
            this.f14988I.m122833O();
        }
        synchronized (this.f14982C) {
            t9c.m189743a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":startRecordonRecordPrepared#############"));
            this.f15000s = uowVar;
            m20743l2(CodecFilterState.FILTER_STARTING);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: S0 */
    public void mo20655S0(brx brxVar) {
        esx.m122399d("MediaLogsReporters", "mediaCfgParams: " + brxVar);
        if (brxVar == null) {
            this.f14988I.m122843l("setMediaCfgParams", brxVar);
            b7y.m102882c().m102888g("pusher medaicfgparam == null,user default appid ");
            m20724V1(null);
            evx evxVar = this.f14988I;
            if (evxVar != null) {
                evxVar.m122828J(this.f15006z);
            }
            if (TextUtils.isEmpty(this.f14980A)) {
                return;
            }
            this.f15006z.m95757e(this.f14980A);
            return;
        }
        this.f14997R = brxVar;
        this.f14988I.m122843l("setMediaCfgParams", brxVar.m106181m());
        this.f14987H.f191104s = brxVar.m106171c();
        this.f14987H.f191106t = brxVar.m106174f();
        this.f14987H.f191108u = brxVar.m106178j();
        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(brxVar.m106170b());
        brxVar.m106180l();
        if (c15814dM99797h == null) {
            b7y.m102882c().m102888g("pusher userConfig == null, use default appid");
            m20724V1(brxVar);
            evx evxVar2 = this.f14988I;
            if (evxVar2 != null) {
                evxVar2.m122828J(this.f15006z);
                return;
            }
            return;
        }
        bsx bsxVar = c15814dM99797h.f73012e;
        if (bsxVar != null) {
            this.f14988I.m122829K(bsxVar.f78281l);
            this.f14988I.m122830L(c15814dM99797h.f73012e.f78278k);
            this.f14988I.m122827I(c15814dM99797h.f73012e.f78275j);
        }
        if (this.f15006z == null) {
            this.f15006z = new a320(brxVar.m106170b(), c15814dM99797h.f73009b, c15814dM99797h.f73010c, brxVar.m106176h(), String.valueOf(brxVar.m106174f()), String.valueOf(brxVar.m106171c()), arx.m99789d().m99796g(brxVar.m106170b()), brxVar.m106178j(), this.f14987H.f191064e1, this.f15005y);
        }
        evx evxVar3 = this.f14988I;
        if (evxVar3 != null) {
            evxVar3.m122828J(this.f15006z);
        }
        if (!TextUtils.isEmpty(this.f14980A)) {
            this.f15006z.m95757e(this.f14980A);
            this.f14988I.m122843l("setMediaCfgParams", "set mTag=" + this.f14980A);
        }
        esx.m122399d("MediaLogsReporters", "userConfig: " + c15814dM99797h.f73011d);
    }

    /* JADX INFO: renamed from: W1 */
    public Context m20725W1() {
        WeakReference<Context> weakReference = this.f14999r;
        if (weakReference == null) {
            return l26.f129743a;
        }
        return weakReference.get() == null ? l26.f129743a : this.f14999r.get();
    }

    /* JADX INFO: renamed from: X1 */
    public CodecFilterState m20726X1() {
        return this.f14991L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo20656Y(g510 g510Var, uow uowVar) {
        t9c.m189743a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":resetCodeconRecordPrepared#############"));
        if (uowVar == null) {
            return;
        }
        int i = uowVar.f175494m;
        int i2 = uowVar.f175496n;
        if (uowVar.f180161F0) {
            i2 = i;
            i = i2;
        }
        setRenderSize(i, i2);
        reInitialize();
    }

    /* JADX INFO: renamed from: Y1 */
    public long m20727Y1() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14998q;
        if (csx.m112235R().m112296U0()) {
            jCurrentTimeMillis = csx.m112235R().m112304X();
            z = true;
        } else {
            z = false;
        }
        t9c.m189743a("MediaBaseCodecFilter", "getNetAnchorTime " + jCurrentTimeMillis + " / " + z);
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: Z1 */
    public uow m20728Z1() {
        return this.f15000s;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m20729a2(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b2 */
    public void m20730b2() {
        if (this.f14987H.f191104s != -1) {
            this.f14988I.m122843l("headSet", m20729a2(m20725W1()) ? "1" : "0");
        }
        if (m20725W1() != null) {
            UsbManager usbManager = (UsbManager) m20725W1().getSystemService(UsbManager.class);
            if (usbManager != null) {
                Iterator<Map.Entry<String, UsbDevice>> it = usbManager.getDeviceList().entrySet().iterator();
                while (it.hasNext()) {
                    String strReplace = it.next().getValue().toString().replace('[', '(').replace(']', ')');
                    this.f14988I.m122842k("UsbDevice", "[" + strReplace + Constants.AES_SUFFIX);
                }
            }
            AudioManager audioManager = (AudioManager) m20725W1().getSystemService("audio");
            if (audioManager != null) {
                StringBuilder sb = new StringBuilder("{");
                AudioDeviceInfo[] devices = audioManager.getDevices(1);
                for (int i = 0; i < devices.length; i++) {
                    if (i != 0) {
                        sb.append("},{");
                    }
                    sb.append(fvx.m127714B(devices[i]));
                }
                sb.append("},{");
                AudioDeviceInfo[] devices2 = audioManager.getDevices(2);
                for (int i2 = 0; i2 < devices2.length; i2++) {
                    if (i2 != 0) {
                        sb.append("},{");
                    }
                    sb.append(fvx.m127714B(devices2[i2]));
                }
                sb.append("}");
                this.f14988I.m122842k("AudioDeviceInfo", "[" + sb.toString() + Constants.AES_SUFFIX);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: c1 */
    public int mo20658c1() {
        return 0;
    }

    /* JADX INFO: renamed from: c2 */
    public void mo20731c2() {
        this.f14988I.m122821C();
    }

    @Override // p153l.q210.InterfaceC19503d
    /* JADX INFO: renamed from: d0 */
    public void mo20732d0(Object obj) {
    }

    @Override // p153l.evx.InterfaceC16844b
    /* JADX INFO: renamed from: d1 */
    public void mo20733d1() {
    }

    /* JADX INFO: renamed from: d2 */
    public void mo20734d2() {
        this.f14988I.m122823E();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo20660e1(l6m l6mVar) {
        this.f14990K = l6mVar;
    }

    /* JADX INFO: renamed from: e2 */
    public void m20735e2(int i, int i2) {
        q210.InterfaceC19501b interfaceC19501b = this.f14984E;
        if (interfaceC19501b != null) {
            interfaceC19501b.mo20748q0(i, i2, null);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        Handler handler = this.f14993N;
        if (handler != null && this.f14992M != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14992M.quit();
            this.f14993N = null;
            this.f14992M = null;
        }
        t9c.m189743a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":stopRecordonRecordPrepared#############"));
        synchronized (this.f14982C) {
            m20743l2(CodecFilterState.FILTER_STOPPING);
        }
        m20741j2();
    }

    /* JADX INFO: renamed from: f2 */
    public void mo20736f2() {
        this.f14988I.m122850s();
    }

    /* JADX INFO: renamed from: g2 */
    public void mo20737g2() {
        this.f14988I.m122851t();
    }

    /* JADX INFO: renamed from: h2 */
    public void mo20738h2() {
        this.f14988I.m122822D();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 256:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tencent.connect.common.Constants.f58037TS, m20727Y1());
                    mo20742k2(jSONObject.toString());
                    break;
                } catch (Exception unused) {
                }
                Handler handler = this.f14993N;
                if (handler != null && this.f14992M != null) {
                    handler.sendEmptyMessageDelayed(256, 1000L);
                    break;
                }
                break;
            case 257:
                mo20733d1();
                Handler handler2 = this.f14993N;
                if (handler2 != null && this.f14992M != null) {
                    handler2.sendEmptyMessageDelayed(257, this.f14995P);
                    break;
                }
                break;
            case 258:
                this.f14987H.f190999A0 = fvx.m127730p();
                break;
        }
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: i */
    public void mo20662i(int i, int i2, fpf0 fpf0Var) {
        this.f14988I.m122843l("setSimpleMediaLogsUpload", Integer.valueOf(i), Integer.valueOf(i2), fpf0Var);
        if (i > 0) {
            this.f14995P = i;
        }
        this.f14988I.m122831M(i, i2, fpf0Var);
    }

    /* JADX INFO: renamed from: i2 */
    public void mo20739i2() {
        this.f14988I.m122824F();
    }

    @Override // p153l.q210.InterfaceC19503d
    /* JADX INFO: renamed from: j0 */
    public synchronized void mo20740j0(Object obj) {
        t9c.m189745c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(" onRecordStop ################ success"));
    }

    /* JADX INFO: renamed from: j2 */
    public void m20741j2() {
        WeakReference<Context> weakReference = this.f14999r;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public void mo20742k2(String str) {
    }

    /* JADX INFO: renamed from: l2 */
    public void m20743l2(CodecFilterState codecFilterState) {
        this.f14991L = codecFilterState;
    }

    /* JADX INFO: renamed from: m2 */
    public void m20744m2(String str) {
        this.f14980A = str;
        evx evxVar = this.f14988I;
        if (evxVar != null) {
            evxVar.m122843l("setMtag", str);
        }
        a320 a320Var = this.f15006z;
        if (a320Var != null) {
            a320Var.m95757e(str);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public void mo20745n2(uow uowVar) {
        this.f15000s = uowVar;
    }

    /* JADX INFO: renamed from: o2 */
    public void m20746o2(q210.InterfaceC19501b interfaceC19501b) {
        this.f14984E = interfaceC19501b;
    }

    /* JADX INFO: renamed from: p2 */
    public void m20747p2() {
        this.f14988I.m122831M(0, 0, null);
    }

    @Override // p153l.q210.InterfaceC19501b
    /* JADX INFO: renamed from: q0 */
    public void mo20748q0(int i, int i2, Object obj) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo20668r1() {
        return false;
    }

    @Override // p153l.q210.InterfaceC19501b
    /* JADX INFO: renamed from: w0 */
    public synchronized void mo20749w0(int i, int i2, Object obj) {
        if (obj == this) {
            if (m20726X1() != CodecFilterState.FILTER_STOPPING) {
                synchronized (this.f14981B) {
                }
            }
        }
    }
}
