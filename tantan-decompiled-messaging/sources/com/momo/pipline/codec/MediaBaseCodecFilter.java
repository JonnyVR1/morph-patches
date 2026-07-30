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
import p149l.dix;
import p149l.dxl;
import p149l.eix;
import p149l.ejx;
import p149l.eyx;
import p149l.fjx;
import p149l.g16;
import p149l.hjx;
import p149l.hmx;
import p149l.hu00;
import p149l.imx;
import p149l.lll;
import p149l.n8c;
import p149l.nbj;
import p149l.su10;
import p149l.u3m;
import p149l.vlw;
import p149l.xgf0;
import p149l.yw00;
import p149l.zmx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MediaBaseCodecFilter extends nbj implements hmx.InterfaceC17343b, Handler.Callback, MomoCodec, hu00.InterfaceC17393b, hu00.InterfaceC17395d {

    /* JADX INFO: renamed from: H */
    protected zmx f14268H;

    /* JADX INFO: renamed from: I */
    protected hmx f14269I;

    /* JADX INFO: renamed from: J */
    protected volatile MomoCodec.MomoCodecState f14270J;

    /* JADX INFO: renamed from: K */
    protected u3m f14271K;

    /* JADX INFO: renamed from: L */
    private CodecFilterState f14272L;

    /* JADX INFO: renamed from: M */
    private HandlerThread f14273M;

    /* JADX INFO: renamed from: N */
    private Handler f14274N;

    /* JADX INFO: renamed from: O */
    private final long f14275O;

    /* JADX INFO: renamed from: P */
    private long f14276P;

    /* JADX INFO: renamed from: Q */
    protected boolean f14277Q;

    /* JADX INFO: renamed from: R */
    protected eix f14278R;

    /* JADX INFO: renamed from: r */
    protected WeakReference<Context> f14280r;

    /* JADX INFO: renamed from: s */
    protected vlw f14281s;

    /* JADX INFO: renamed from: t */
    protected int f14282t;

    /* JADX INFO: renamed from: q */
    protected long f14279q = 0;

    /* JADX INFO: renamed from: u */
    private boolean f14283u = false;

    /* JADX INFO: renamed from: v */
    protected String f14284v = "";

    /* JADX INFO: renamed from: x */
    protected String f14285x = "";

    /* JADX INFO: renamed from: y */
    protected String f14286y = "";

    /* JADX INFO: renamed from: z */
    protected su10 f14287z = null;

    /* JADX INFO: renamed from: A */
    protected String f14261A = "";

    /* JADX INFO: renamed from: B */
    private Object f14262B = new Object();

    /* JADX INFO: renamed from: C */
    private Object f14263C = new Object();

    /* JADX INFO: renamed from: D */
    private Object f14264D = new Object();

    /* JADX INFO: renamed from: E */
    private hu00.InterfaceC17393b f14265E = null;

    /* JADX INFO: renamed from: F */
    protected dxl f14266F = null;

    /* JADX INFO: renamed from: G */
    protected int f14267G = 5000;

    public enum CodecFilterState {
        FILTER_IDLE,
        FILTER_STARTING,
        FILTER_PLAY,
        FILTER_STOPPING,
        FILTER_ERROR,
        FILTER_RECONNECTTING
    }

    public MediaBaseCodecFilter(Context context) {
        zmx zmxVar = new zmx();
        this.f14268H = zmxVar;
        this.f14269I = new hmx(zmxVar);
        this.f14270J = MomoCodec.MomoCodecState.STOP;
        this.f14275O = 1000L;
        this.f14276P = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        this.f14277Q = true;
        m19744l2(CodecFilterState.FILTER_IDLE);
        this.f14280r = new WeakReference<>(context);
        this.f14282t = 0;
        try {
            if (fjx.m121638R().m121702V0()) {
                lll.m150502e().m150512o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: V1 */
    private void m19725V1(eix eixVar) {
        String strM116735k;
        if (this.f14287z == null) {
            if (eixVar != null) {
                strM116735k = eixVar.m116735k();
            } else {
                dix.C16387d c16387dM111948h = dix.m111940d().m111948h("mlive");
                strM116735k = c16387dM111948h != null ? c16387dM111948h.f86450c : "";
            }
            this.f14287z = new su10("mdefault", "1a738fb015fe0a8476c4e05a314156d2", strM116735k, "", "", "", dix.m111940d().m111947g("mdefault"), "", this.f14268H.f203848e1, this.f14286y);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
        Handler handler = this.f14274N;
        if (handler != null && this.f14273M != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14273M.quit();
            this.f14274N = null;
            this.f14273M = null;
        }
        n8c.m158483a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":stopRecordonRecordPrepared#############"));
        synchronized (this.f14263C) {
            m19744l2(CodecFilterState.FILTER_STOPPING);
        }
        m19742j2();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H */
    public void mo19649H(int i) {
        this.f14269I.m131787l("setProvider", Integer.valueOf(i));
        this.f14268H.f203890t = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: O */
    public void mo19654O(long j) {
        this.f14279q = j;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        n8c.m158488f("sendMessageEx", "" + this.f14268H.f203843d);
        if (this.f14269I.m131785j()) {
            if (vlwVar.f182035X0) {
                this.f14269I.m131778a();
            }
            this.f14269I.m131776N(this);
            this.f14269I.m131777O();
        }
        synchronized (this.f14263C) {
            n8c.m158483a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":startRecordonRecordPrepared#############"));
            this.f14281s = vlwVar;
            m19744l2(CodecFilterState.FILTER_STARTING);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: S0 */
    public void mo19656S0(eix eixVar) {
        hjx.m131421d("MediaLogsReporters", "mediaCfgParams: " + eixVar);
        if (eixVar == null) {
            this.f14269I.m131787l("setMediaCfgParams", eixVar);
            eyx.m118802c().m118808g("pusher medaicfgparam == null,user default appid ");
            m19725V1(null);
            hmx hmxVar = this.f14269I;
            if (hmxVar != null) {
                hmxVar.m131772J(this.f14287z);
            }
            if (TextUtils.isEmpty(this.f14261A)) {
                return;
            }
            this.f14287z.m185983e(this.f14261A);
            return;
        }
        this.f14278R = eixVar;
        this.f14269I.m131787l("setMediaCfgParams", eixVar.m116737m());
        this.f14268H.f203888s = eixVar.m116727c();
        this.f14268H.f203890t = eixVar.m116730f();
        this.f14268H.f203892u = eixVar.m116734j();
        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(eixVar.m116726b());
        eixVar.m116736l();
        if (c16387dM111948h == null) {
            eyx.m118802c().m118808g("pusher userConfig == null, use default appid");
            m19725V1(eixVar);
            hmx hmxVar2 = this.f14269I;
            if (hmxVar2 != null) {
                hmxVar2.m131772J(this.f14287z);
                return;
            }
            return;
        }
        ejx ejxVar = c16387dM111948h.f86452e;
        if (ejxVar != null) {
            this.f14269I.m131773K(ejxVar.f91881l);
            this.f14269I.m131774L(c16387dM111948h.f86452e.f91878k);
            this.f14269I.m131771I(c16387dM111948h.f86452e.f91875j);
        }
        if (this.f14287z == null) {
            this.f14287z = new su10(eixVar.m116726b(), c16387dM111948h.f86449b, c16387dM111948h.f86450c, eixVar.m116732h(), String.valueOf(eixVar.m116730f()), String.valueOf(eixVar.m116727c()), dix.m111940d().m111947g(eixVar.m116726b()), eixVar.m116734j(), this.f14268H.f203848e1, this.f14286y);
        }
        hmx hmxVar3 = this.f14269I;
        if (hmxVar3 != null) {
            hmxVar3.m131772J(this.f14287z);
        }
        if (!TextUtils.isEmpty(this.f14261A)) {
            this.f14287z.m185983e(this.f14261A);
            this.f14269I.m131787l("setMediaCfgParams", "set mTag=" + this.f14261A);
        }
        hjx.m131421d("MediaLogsReporters", "userConfig: " + c16387dM111948h.f86451d);
    }

    /* JADX INFO: renamed from: W1 */
    public Context m19726W1() {
        WeakReference<Context> weakReference = this.f14280r;
        if (weakReference == null) {
            return g16.f100119a;
        }
        return weakReference.get() == null ? g16.f100119a : this.f14280r.get();
    }

    /* JADX INFO: renamed from: X1 */
    public CodecFilterState m19727X1() {
        return this.f14272L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        n8c.m158483a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":resetCodeconRecordPrepared#############"));
        if (vlwVar == null) {
            return;
        }
        int i = vlwVar.f177152m;
        int i2 = vlwVar.f177154n;
        if (vlwVar.f182017F0) {
            i2 = i;
            i = i2;
        }
        setRenderSize(i, i2);
        reInitialize();
    }

    /* JADX INFO: renamed from: Y1 */
    public long m19728Y1() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14279q;
        if (fjx.m121638R().m121699U0()) {
            jCurrentTimeMillis = fjx.m121638R().m121707X();
            z = true;
        } else {
            z = false;
        }
        n8c.m158483a("MediaBaseCodecFilter", "getNetAnchorTime " + jCurrentTimeMillis + " / " + z);
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: Z1 */
    public vlw m19729Z1() {
        return this.f14281s;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m19730a2(Context context) {
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
    public void m19731b2() {
        if (this.f14268H.f203888s != -1) {
            this.f14269I.m131787l("headSet", m19730a2(m19726W1()) ? "1" : "0");
        }
        if (m19726W1() != null) {
            UsbManager usbManager = (UsbManager) m19726W1().getSystemService(UsbManager.class);
            if (usbManager != null) {
                Iterator<Map.Entry<String, UsbDevice>> it = usbManager.getDeviceList().entrySet().iterator();
                while (it.hasNext()) {
                    String strReplace = it.next().getValue().toString().replace('[', '(').replace(']', ')');
                    this.f14269I.m131786k("UsbDevice", "[" + strReplace + Constants.AES_SUFFIX);
                }
            }
            AudioManager audioManager = (AudioManager) m19726W1().getSystemService("audio");
            if (audioManager != null) {
                StringBuilder sb = new StringBuilder("{");
                AudioDeviceInfo[] devices = audioManager.getDevices(1);
                for (int i = 0; i < devices.length; i++) {
                    if (i != 0) {
                        sb.append("},{");
                    }
                    sb.append(imx.m137093B(devices[i]));
                }
                sb.append("},{");
                AudioDeviceInfo[] devices2 = audioManager.getDevices(2);
                for (int i2 = 0; i2 < devices2.length; i2++) {
                    if (i2 != 0) {
                        sb.append("},{");
                    }
                    sb.append(imx.m137093B(devices2[i2]));
                }
                sb.append("}");
                this.f14269I.m131786k("AudioDeviceInfo", "[" + sb.toString() + Constants.AES_SUFFIX);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: c1 */
    public int mo19659c1() {
        return 0;
    }

    /* JADX INFO: renamed from: c2 */
    public void mo19732c2() {
        this.f14269I.m131765C();
    }

    @Override // p149l.hu00.InterfaceC17395d
    /* JADX INFO: renamed from: d0 */
    public void mo19733d0(Object obj) {
    }

    @Override // p149l.hmx.InterfaceC17343b
    /* JADX INFO: renamed from: d1 */
    public void mo19734d1() {
    }

    /* JADX INFO: renamed from: d2 */
    public void mo19735d2() {
        this.f14269I.m131767E();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo19661e1(u3m u3mVar) {
        this.f14271K = u3mVar;
    }

    /* JADX INFO: renamed from: e2 */
    public void m19736e2(int i, int i2) {
        hu00.InterfaceC17393b interfaceC17393b = this.f14265E;
        if (interfaceC17393b != null) {
            interfaceC17393b.mo19749q0(i, i2, null);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        Handler handler = this.f14274N;
        if (handler != null && this.f14273M != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14273M.quit();
            this.f14274N = null;
            this.f14273M = null;
        }
        n8c.m158483a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(":stopRecordonRecordPrepared#############"));
        synchronized (this.f14263C) {
            m19744l2(CodecFilterState.FILTER_STOPPING);
        }
        m19742j2();
    }

    /* JADX INFO: renamed from: f2 */
    public void mo19737f2() {
        this.f14269I.m131794s();
    }

    /* JADX INFO: renamed from: g2 */
    public void mo19738g2() {
        this.f14269I.m131795t();
    }

    /* JADX INFO: renamed from: h2 */
    public void mo19739h2() {
        this.f14269I.m131766D();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 256:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tencent.connect.common.Constants.f57189TS, m19728Y1());
                    mo19743k2(jSONObject.toString());
                    break;
                } catch (Exception unused) {
                }
                Handler handler = this.f14274N;
                if (handler != null && this.f14273M != null) {
                    handler.sendEmptyMessageDelayed(256, 1000L);
                    break;
                }
                break;
            case 257:
                mo19734d1();
                Handler handler2 = this.f14274N;
                if (handler2 != null && this.f14273M != null) {
                    handler2.sendEmptyMessageDelayed(257, this.f14276P);
                    break;
                }
                break;
            case 258:
                this.f14268H.f203783A0 = imx.m137109p();
                break;
        }
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: i */
    public void mo19663i(int i, int i2, xgf0 xgf0Var) {
        this.f14269I.m131787l("setSimpleMediaLogsUpload", Integer.valueOf(i), Integer.valueOf(i2), xgf0Var);
        if (i > 0) {
            this.f14276P = i;
        }
        this.f14269I.m131775M(i, i2, xgf0Var);
    }

    /* JADX INFO: renamed from: i2 */
    public void mo19740i2() {
        this.f14269I.m131768F();
    }

    @Override // p149l.hu00.InterfaceC17395d
    /* JADX INFO: renamed from: j0 */
    public synchronized void mo19741j0(Object obj) {
        n8c.m158485c("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat(" onRecordStop ################ success"));
    }

    /* JADX INFO: renamed from: j2 */
    public void m19742j2() {
        WeakReference<Context> weakReference = this.f14280r;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public void mo19743k2(String str) {
    }

    /* JADX INFO: renamed from: l2 */
    public void m19744l2(CodecFilterState codecFilterState) {
        this.f14272L = codecFilterState;
    }

    /* JADX INFO: renamed from: m2 */
    public void m19745m2(String str) {
        this.f14261A = str;
        hmx hmxVar = this.f14269I;
        if (hmxVar != null) {
            hmxVar.m131787l("setMtag", str);
        }
        su10 su10Var = this.f14287z;
        if (su10Var != null) {
            su10Var.m185983e(str);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public void mo19746n2(vlw vlwVar) {
        this.f14281s = vlwVar;
    }

    /* JADX INFO: renamed from: o2 */
    public void m19747o2(hu00.InterfaceC17393b interfaceC17393b) {
        this.f14265E = interfaceC17393b;
    }

    /* JADX INFO: renamed from: p2 */
    public void m19748p2() {
        this.f14269I.m131775M(0, 0, null);
    }

    @Override // p149l.hu00.InterfaceC17393b
    /* JADX INFO: renamed from: q0 */
    public void mo19749q0(int i, int i2, Object obj) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo19669r1() {
        return false;
    }

    @Override // p149l.hu00.InterfaceC17393b
    /* JADX INFO: renamed from: w0 */
    public synchronized void mo19750w0(int i, int i2, Object obj) {
        if (obj == this) {
            if (m19727X1() != CodecFilterState.FILTER_STOPPING) {
                synchronized (this.f14262B) {
                }
            }
        }
    }
}
