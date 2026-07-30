package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.codec.C4087a;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oq2 implements j1m {

    /* JADX INFO: renamed from: a */
    protected uv00 f145075a;

    /* JADX INFO: renamed from: b */
    protected i3m f145076b;

    /* JADX INFO: renamed from: c */
    protected WeakReference<Context> f145077c;

    /* JADX INFO: renamed from: d */
    protected vlw f145078d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC4109a f145079e;

    /* JADX INFO: renamed from: f */
    protected MomoCodec f145080f;

    /* JADX INFO: renamed from: h */
    protected String f145082h;

    /* JADX INFO: renamed from: m */
    private bw00.InterfaceC15993b f145087m;

    /* JADX INFO: renamed from: p */
    C4087a f145090p;

    /* JADX INFO: renamed from: q */
    private HandlerThread f145091q;

    /* JADX INFO: renamed from: r */
    private Handler f145092r;

    /* JADX INFO: renamed from: s */
    private u3m.InterfaceC20352a f145093s;

    /* JADX INFO: renamed from: t */
    private Bitmap f145094t;

    /* JADX INFO: renamed from: u */
    private boolean f145095u;

    /* JADX INFO: renamed from: v */
    private eix f145096v;

    /* JADX INFO: renamed from: i */
    protected int f145083i = 0;

    /* JADX INFO: renamed from: j */
    private boolean f145084j = false;

    /* JADX INFO: renamed from: k */
    int f145085k = 0;

    /* JADX INFO: renamed from: l */
    int f145086l = 0;

    /* JADX INFO: renamed from: n */
    protected long f145088n = 0;

    /* JADX INFO: renamed from: o */
    protected long f145089o = 0;

    /* JADX INFO: renamed from: w */
    protected boolean f145097w = false;

    /* JADX INFO: renamed from: x */
    private String f145098x = "";

    /* JADX INFO: renamed from: g */
    protected boolean f145081g = false;

    /* JADX INFO: renamed from: l.oq2$a */
    public class C18996a implements hu00.InterfaceC17393b {
        public C18996a() {
        }

        @Override // p149l.hu00.InterfaceC17393b
        /* JADX INFO: renamed from: q0 */
        public void mo19749q0(int i, int i2, Object obj) {
            oq2.this.m165396w2(i, i2);
        }

        @Override // p149l.hu00.InterfaceC17393b
        /* JADX INFO: renamed from: w0 */
        public void mo19750w0(int i, int i2, Object obj) {
            oq2.this.m165396w2(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.oq2$b */
    public class C18997b implements za1 {
        public C18997b() {
        }

        @Override // p149l.za1
        /* JADX INFO: renamed from: a */
        public void mo18373a(Object obj, int i, int i2) {
            int i3;
            Bundle bundle = new Bundle();
            if (i == -1) {
                bundle.putString("RecordDesc", "播放伴奏播放器失败");
                MDLog.m7391e("BasePusherPipline_RecordFile", "播放伴奏播放器失败");
                i3 = -8198;
            } else if (i == 1) {
                bundle.putString("RecordDesc", "播放伴奏播放器Prepared");
                MDLog.m7391e("BasePusherPipline_RecordFile", "播放伴奏播放器Prepared");
                i3 = 8200;
            } else if (i != 2) {
                i3 = 0;
            } else {
                bundle.putString("RecordDesc", "播放伴奏完成");
                Message messageObtainMessage = oq2.this.f145092r.obtainMessage();
                messageObtainMessage.what = 8201;
                messageObtainMessage.setData(bundle);
                oq2.this.f145092r.sendMessage(messageObtainMessage);
                MDLog.m7391e("BasePusherPipline_RecordFile", "播放伴奏完成");
                i3 = 8201;
            }
            if (oq2.this.f145093s != null) {
                oq2.this.f145093s.mo19170a(i3, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: l.oq2$c */
    public class C18998c implements c23.InterfaceC16042a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f145101a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d23 f145102b;

        public C18998c(String str, d23 d23Var) {
            this.f145101a = str;
            this.f145102b = d23Var;
        }

        @Override // p149l.c23.InterfaceC16042a
        /* JADX INFO: renamed from: a */
        public void mo104905a(Bitmap bitmap) {
            oq2.this.f145094t = bitmap;
            Message messageObtainMessage = oq2.this.f145092r.obtainMessage();
            messageObtainMessage.what = 8225;
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图成功");
            bundle.putString("imagePath", this.f145101a);
            messageObtainMessage.setData(bundle);
            oq2.this.f145092r.sendMessage(messageObtainMessage);
            try {
                oq2 oq2Var = oq2.this;
                uv00 uv00Var = oq2Var.f145075a;
                if (uv00Var != null) {
                    uv00Var.mo19689X(oq2Var.f145076b, this.f145102b);
                    uv00 uv00Var2 = oq2.this.f145075a;
                    uv00Var2.mo19683I(this.f145102b, uv00Var2.mo19704j0().m216279m());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.oq2$d */
    public static class HandlerC18999d extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<oq2> f145104a;

        public HandlerC18999d(oq2 oq2Var, Looper looper) {
            super(looper);
            this.f145104a = new WeakReference<>(oq2Var);
        }

        /* JADX INFO: renamed from: a */
        private void m165400a(int i, Bundle bundle) {
            MDLog.m7395i("BasePusherPipline_RecordFile", bundle.getString("RecordDesc"));
            oq2 oq2Var = this.f145104a.get();
            if (oq2Var == null) {
                MDLog.m7391e("BasePusherPipline_RecordFile", "report RecordListener BasePusherPipline is null");
                return;
            }
            if (i != 8201) {
                if (i == 8208) {
                    oq2Var.m165399z2(bundle.getString("playFile"), bundle.getString("destFile"));
                    return;
                }
                if (i != 8209) {
                    if (i == 8224) {
                        oq2Var.m165389p2(bundle.getString("imagePath"));
                        return;
                    } else if (i == 8225) {
                        oq2Var.m165390q2(bundle.getString("imagePath"));
                        return;
                    } else {
                        if (oq2Var.f145093s != null) {
                            oq2Var.f145093s.mo19170a(i, bundle);
                            return;
                        }
                        return;
                    }
                }
            }
            oq2Var.m165388A2();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m165400a(message.what, message.getData());
        }
    }

    public oq2(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC4109a interfaceC4109a) {
        this.f145091q = null;
        this.f145092r = null;
        this.f145075a = uv00Var;
        this.f145076b = i3mVar;
        this.f145077c = new WeakReference<>(context);
        this.f145078d = vlwVar;
        this.f145079e = interfaceC4109a;
        HandlerThread handlerThread = new HandlerThread("RecordHandlerThread");
        this.f145091q = handlerThread;
        handlerThread.start();
        if (this.f145092r == null) {
            this.f145092r = new HandlerC18999d(this, this.f145091q.getLooper());
            MDLog.m7395i("BasePusherPipline", "RecordHandler new");
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: A */
    public void mo139330A() {
        this.f145081g = false;
        this.f145075a = null;
        this.f145076b = null;
        this.f145078d = null;
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.stopSurroundMusic();
            this.f145079e = null;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m165388A2() {
        C4087a c4087a = this.f145090p;
        if (c4087a != null) {
            c4087a.mo19662f();
            uv00 uv00Var = this.f145075a;
            if (uv00Var != null) {
                uv00Var.mo19689X(this.f145076b, this.f145090p);
                uv00 uv00Var2 = this.f145075a;
                uv00Var2.mo19683I(this.f145090p, uv00Var2.mo19704j0().m216279m());
            }
            this.f145090p = null;
            new Bundle().putString("RecordDesc", "录制结束");
            mo20107b2();
            this.f145079e.mo20133x0(false);
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "伴奏播放停止");
            u3m.InterfaceC20352a interfaceC20352a = this.f145093s;
            if (interfaceC20352a != null) {
                interfaceC20352a.mo19170a(8199, bundle);
            }
            u3m.InterfaceC20352a interfaceC20352a2 = this.f145093s;
            if (interfaceC20352a2 != null) {
                interfaceC20352a2.mo19170a(8209, bundle);
                MDLog.m7395i("BasePusherPipline_RecordFile", "stopRecordFileIml:" + this.f145093s + "; this:" + this);
            }
            MDLog.m7395i("BasePusherPipline_RecordFile", "录制结束:");
            this.f145095u = false;
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: C1 */
    public void mo139332C1(u3m.InterfaceC20352a interfaceC20352a) {
        this.f145093s = interfaceC20352a;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: F */
    public void mo20082F(String str, String str2) {
        int i;
        this.f145098x = str;
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec instanceof xc0) {
            i = 3;
        } else {
            i = momoCodec instanceof MoMoRtcPushFilter ? 5 : 1;
        }
        r3r.m177693Y(i);
        r3r.m177688C(str, str2);
        this.f145079e.mo20119l(1);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: G1 */
    public void mo20083G1(za1 za1Var) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20083G1(za1Var);
        }
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec != null) {
            ((MediaBaseCodecFilter) momoCodec).m19747o2(new C18996a());
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: H */
    public void mo139334H(int i) {
        eix eixVar = this.f145096v;
        if (eixVar != null) {
            eixVar.m116742r(i);
        }
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec != null) {
            momoCodec.mo19649H(i);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: I1 */
    public void mo139336I1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "localMerge_sei " + str);
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec != null) {
            momoCodec.mo19648C1(str);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: J */
    public void mo139337J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "sei " + str);
        this.f145082h = str;
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec != null) {
            momoCodec.mo19651J(str);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: O */
    public void mo139340O(long j) {
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec != null) {
            momoCodec.mo19654O(j);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo20093O1(String str) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "msec " + str);
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return false;
        }
        return interfaceC4109a.mo20093O1(str);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: R */
    public void mo160318R(ya1 ya1Var) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo160318R(ya1Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: S0 */
    public void mo139342S0(vlw vlwVar) {
        uv00 uv00Var;
        MomoCodec momoCodec = this.f145080f;
        if (momoCodec == null || (uv00Var = this.f145075a) == null) {
            return;
        }
        uv00Var.mo19693b0(momoCodec, vlwVar);
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo139343T0(int i) {
        eix eixVar = this.f145096v;
        if (eixVar != null) {
            eixVar.m116740p(i);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: V */
    public void mo20100V(ab1 ab1Var) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20100V(ab1Var);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: V1 */
    public void mo139346V1(String str) {
        Message messageObtainMessage = this.f145092r.obtainMessage();
        messageObtainMessage.what = 8224;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：开始截屏");
        bundle.putString("imagePath", str);
        messageObtainMessage.setData(bundle);
        this.f145092r.sendMessage(messageObtainMessage);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: W1 */
    public void mo20101W1(float f) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo20101W1(f);
    }

    /* JADX INFO: renamed from: X0 */
    public double mo160324X0(int i) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: Y0 */
    public void mo20102Y0(long j, boolean z) {
        mo20093O1(this.f145098x);
        if (j > 0) {
            mo20131w0(j);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo139347Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        if (this.f145075a != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f145075a.mo196051d(mRtcAudioHandler);
            if (this instanceof lw00) {
                this.f145075a.mo196053y(i, i2);
            }
            this.f145085k = i;
            this.f145086l = i2;
            MomoCodec momoCodec = this.f145080f;
            if (momoCodec != null) {
                momoCodec.mo19671y(i, i2);
            }
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: a */
    public void mo139348a(boolean z) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20103a(z);
        }
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo196048a(z);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: b2 */
    public void mo20107b2() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20107b2();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: c */
    public long mo20108c() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return 0L;
        }
        return interfaceC4109a.mo20108c();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo139350c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        if (this.f145075a != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f145075a.mo196051d(mRtcAudioHandler);
            if (this instanceof lw00) {
                this.f145075a.mo196053y(i, i2);
            }
            this.f145085k = i;
            this.f145086l = i2;
            MomoCodec momoCodec = this.f145080f;
            if (momoCodec != null) {
                momoCodec.mo19672y0(i, i2, i3);
            }
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: e2 */
    public void mo139352e2() {
        Message messageObtainMessage = this.f145092r.obtainMessage();
        messageObtainMessage.what = 8209;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：录制结束");
        messageObtainMessage.setData(bundle);
        this.f145092r.sendMessage(messageObtainMessage);
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: f */
    public void mo139353f() {
        this.f145081g = false;
        this.f145075a = null;
        eyx.m118802c().m118808g("BasePusherPipline stopRecord", "mPipeline == null:" + hashCode());
        this.f145076b = null;
        this.f145078d = null;
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.stopSurroundMusic();
            this.f145079e = null;
        }
        MDLog.m7395i("BasePusherPipline_RecordFile", "stopRecord:" + this);
        MDLog.m7395i("BasePusherPipline_RecordFile", Log.getStackTraceString(new Throwable()));
        m165388A2();
    }

    @Override // p149l.j1m, p149l.ttl
    /* JADX INFO: renamed from: g */
    public igb0 mo139356g() {
        igb0 igb0Var = new igb0();
        ewl ewlVar = (ewl) this.f145080f;
        if (ewlVar != null) {
            try {
                igb0Var.m135973h(ewlVar.mo20044s0());
                igb0Var.m135979n(ewlVar.getVideoWidth());
                igb0Var.m135978m(ewlVar.mo20022k0());
                igb0Var.m135975j((int) ewlVar.mo19944L1());
                igb0Var.m135974i(ewlVar.mo20014h1());
                igb0Var.m135976k(ewlVar.mo19992Y0());
                igb0Var.m135977l(ewlVar.mo19973T0());
            } catch (Exception unused) {
            }
        }
        return igb0Var;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: g0 */
    public void mo160335g0(float f) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo160335g0(f);
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: g1 */
    public boolean mo20115g1(String str) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return false;
        }
        interfaceC4109a.mo20119l(1);
        return this.f145079e.mo20115g1(str);
    }

    public double getEffectsVolume() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: i */
    public void mo139357i(int i, int i2, xgf0 xgf0Var) {
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19701i(i, i2, xgf0Var);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: j */
    public void mo20117j() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo20117j();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo139358k0() {
        MomoCodec momoCodec;
        int i;
        if (this.f145080f == null) {
            return;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f145080f.getClass().getSimpleName() + " startRecord");
        this.f145080f.mo19650H0(this.f145084j);
        this.f145080f.mo19656S0(this.f145096v);
        bw00.InterfaceC15993b interfaceC15993b = this.f145087m;
        if (interfaceC15993b != null) {
            this.f145075a.mo19706l0(interfaceC15993b, this.f145080f);
        }
        int i2 = this.f145085k;
        if (i2 != 0 && (i = this.f145086l) != 0) {
            this.f145080f.mo19671y(i2, i);
        }
        boolean zMo19680F = this.f145075a.mo19680F();
        uv00 uv00Var = this.f145075a;
        if (zMo19680F) {
            uv00Var.mo19690Y(this.f145076b, this.f145080f, this.f145078d);
        } else {
            uv00Var.mo19707m0(this.f145076b, this.f145080f, this.f145078d);
            this.f145075a.mo19709n0(this.f145076b);
        }
        String str = this.f145082h;
        if (str != null && (momoCodec = this.f145080f) != null) {
            momoCodec.mo19651J(str);
        }
        this.f145081g = true;
        if (this.f145088n == 0) {
            this.f145088n = System.currentTimeMillis();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo139362m2() {
        return xv00.m211238a(this.f145078d, this.f145075a.mo19674A0());
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: n */
    public void mo139363n(int i) {
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19708n(i);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: p */
    public void mo139366p(String str, int i) {
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19712p(str, i);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m165389p2(String str) {
        d23 d23Var = new d23();
        d23Var.m109707R1(true);
        d23Var.m104904Q1(new C18998c(str, d23Var));
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19721w0(this.f145076b, d23Var);
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: q */
    public void mo20125q() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo20125q();
    }

    /* JADX INFO: renamed from: q2 */
    public void m165390q2(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmap = this.f145094t;
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.close();
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图完成".concat(str));
            u3m.InterfaceC20352a interfaceC20352a = this.f145093s;
            if (interfaceC20352a != null) {
                interfaceC20352a.mo19170a(8225, bundle);
            }
            MDLog.m7395i("BasePusherPipline_RecordFile", "截图完成:".concat(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: r */
    public long mo20127r() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return 0L;
        }
        return interfaceC4109a.mo20127r();
    }

    /* JADX INFO: renamed from: r2 */
    public void m165391r2(i3m i3mVar) {
        this.f145076b = i3mVar;
    }

    @Override // p149l.j1m
    public void release() {
        if (this.f145080f != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f145080f.getClass().getSimpleName() + "release");
        } else {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("momoCodec already release beforerelease"));
        }
        this.f145080f = null;
        m165395v2();
        Handler handler = this.f145092r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f145092r = null;
        }
        this.f145090p = null;
        HandlerThread handlerThread = this.f145091q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f145091q = null;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public MomoCodec m165392s2() {
        return this.f145080f;
    }

    @Override // p149l.u3m
    public void stopSurroundMusic() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "");
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.stopSurroundMusic();
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t */
    public void mo139368t(int i) {
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            uv00Var.mo19717t(i);
        }
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo139369t0() {
        MomoCodec momoCodec;
        int i;
        if (this.f145080f == null) {
            return -5;
        }
        eyx.m118802c().m118808g(getClass() + " BasePusherPipline startRecord:" + hashCode() + ",codec hashcode:" + this.f145080f.hashCode());
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f145080f.getClass().getSimpleName() + " startRecord");
        this.f145080f.mo19650H0(this.f145084j);
        this.f145080f.mo19656S0(this.f145096v);
        bw00.InterfaceC15993b interfaceC15993b = this.f145087m;
        if (interfaceC15993b != null) {
            this.f145075a.mo19706l0(interfaceC15993b, this.f145080f);
        }
        int i2 = this.f145085k;
        if (i2 != 0 && (i = this.f145086l) != 0) {
            this.f145080f.mo19671y(i2, i);
        }
        uv00 uv00Var = this.f145075a;
        if (uv00Var != null) {
            if (uv00Var.mo19680F()) {
                eyx.m118802c().m118808g(getClass() + " BasePusherPipline appendCodecFilter:" + hashCode() + ",codec hashcode:" + this.f145080f.hashCode());
                this.f145075a.mo19690Y(this.f145076b, this.f145080f, this.f145078d);
            } else {
                eyx.m118802c().m118808g(getClass() + " BasePusherPipline addMediaCodecFilter:" + hashCode() + ",codec hashcode:" + this.f145080f.hashCode());
                this.f145075a.mo19707m0(this.f145076b, this.f145080f, this.f145078d);
                this.f145075a.mo19687V(this.f145076b);
            }
        }
        String str = this.f145082h;
        if (str != null && (momoCodec = this.f145080f) != null) {
            momoCodec.mo19651J(str);
        }
        this.f145081g = true;
        if (this.f145088n != 0) {
            return 0;
        }
        this.f145088n = System.currentTimeMillis();
        return 0;
    }

    /* JADX INFO: renamed from: t2 */
    public Context m165393t2() {
        WeakReference<Context> weakReference = this.f145077c;
        if (weakReference == null) {
            return g16.f100119a;
        }
        return weakReference.get() == null ? g16.f100119a : this.f145077c.get();
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo139372u0(boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "is " + z);
    }

    /* JADX INFO: renamed from: u2 */
    public boolean m165394u2() {
        return this.f145097w;
    }

    /* JADX INFO: renamed from: v2 */
    public void m165395v2() {
        WeakReference<Context> weakReference = this.f145077c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: w0 */
    public void mo20131w0(long j) {
        if (this.f145079e == null) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "msec " + j);
        this.f145079e.mo20131w0(j);
    }

    /* JADX INFO: renamed from: w2 */
    public void m165396w2(int i, int i2) {
        MomoCodec momoCodec = this.f145080f;
        int i3 = 30;
        if (!(momoCodec instanceof kw00) && (momoCodec instanceof xc0)) {
            i3 = 31;
        }
        r3r.m177692R(i3, i2);
    }

    /* JADX INFO: renamed from: x2 */
    public void m165397x2(eix eixVar) {
        this.f145096v = eixVar;
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: y */
    public boolean mo139375y(String str, String str2) {
        MDLog.m7395i("BasePusherPipline_RecordFile", "startRecordFile~" + str2);
        Message messageObtainMessage = this.f145092r.obtainMessage();
        messageObtainMessage.what = 8208;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：开始录制");
        if (str == null) {
            str = "";
        }
        bundle.putString("playFile", str);
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("destFile", str2);
        messageObtainMessage.setData(bundle);
        this.f145092r.sendMessage(messageObtainMessage);
        return true;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: y1 */
    public float mo20135y1() {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a == null) {
            return 0.0f;
        }
        return interfaceC4109a.mo20135y1();
    }

    /* JADX INFO: renamed from: y2 */
    public void m165398y2(boolean z) {
        this.f145097w = z;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: z */
    public void mo20136z(boolean z) {
        InterfaceC4109a interfaceC4109a = this.f145079e;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20136z(z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public boolean m165399z2(String str, String str2) {
        if (this.f145079e == null) {
            return false;
        }
        if (str == null || str.length() > 0) {
            this.f145079e.mo20133x0(true);
            this.f145079e.mo20083G1(new C18997b());
            if (!mo20115g1(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("RecordDesc", "播放伴奏失败");
                u3m.InterfaceC20352a interfaceC20352a = this.f145093s;
                if (interfaceC20352a != null) {
                    interfaceC20352a.mo19170a(-8198, bundle);
                }
                MDLog.m7391e("BasePusherPipline_RecordFile", "播放伴奏失败:" + str);
                return false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("RecordDesc", "播放伴奏开始");
            u3m.InterfaceC20352a interfaceC20352a2 = this.f145093s;
            if (interfaceC20352a2 != null) {
                interfaceC20352a2.mo19170a(8197, bundle2);
            }
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        if (this.f145090p == null) {
            C4087a c4087a = new C4087a(m165393t2());
            this.f145090p = c4087a;
            c4087a.m19759V2(str2);
        }
        if (this.f145090p != null) {
            boolean zMo19680F = this.f145075a.mo19680F();
            uv00 uv00Var = this.f145075a;
            if (zMo19680F) {
                uv00Var.mo19690Y(this.f145076b, this.f145090p, this.f145078d);
            } else {
                uv00Var.mo19707m0(this.f145076b, this.f145090p, this.f145078d);
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("RecordDesc", "开始录制");
            u3m.InterfaceC20352a interfaceC20352a3 = this.f145093s;
            if (interfaceC20352a3 != null) {
                interfaceC20352a3.mo19170a(8208, bundle3);
                MDLog.m7395i("BasePusherPipline_RecordFile", "strartRecord Iml:" + this.f145093s + "; this:" + this);
            }
        }
        this.f145095u = true;
        return true;
    }

    @Override // p149l.u3m
    /* JADX INFO: renamed from: Y */
    public void mo160326Y() {
    }

    public void pauseAllEffects() {
    }

    public void resumeAllEffects() {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: J1 */
    public void mo139338J1(boolean z) {
    }

    /* JADX INFO: renamed from: X */
    public void mo162750X(boolean z) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: f2 */
    public void mo139355f2(int i) {
    }

    /* JADX INFO: renamed from: k2 */
    public void mo162751k2(boolean z) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: m */
    public void mo139360m(boolean z) {
    }

    public void pauseEffect(int i) {
    }

    public void resumeEffect(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void mo162752v(String str) {
    }

    @Override // p149l.j1m
    /* JADX INFO: renamed from: U0 */
    public void mo139344U0(long j, boolean z) {
    }
}
