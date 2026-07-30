package p007l;

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
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.codec.a;
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import l.ab1;
import l.bw00;
import l.c23;
import l.d23;
import l.eix;
import l.ewl;
import l.eyx;
import l.g16;
import l.hu00;
import l.i3m;
import l.ii70;
import l.sml;
import l.u3m;
import l.uv00;
import l.vlw;
import l.xgf0;
import l.ya1;
import l.za1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class oq2 implements j1m {

    /* JADX INFO: renamed from: a */
    protected uv00 f3550a;

    /* JADX INFO: renamed from: b */
    protected i3m f3551b;

    /* JADX INFO: renamed from: c */
    protected WeakReference<Context> f3552c;

    /* JADX INFO: renamed from: d */
    protected vlw f3553d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC0021a f3554e;

    /* JADX INFO: renamed from: f */
    protected MomoCodec f3555f;

    /* JADX INFO: renamed from: h */
    protected String f3557h;

    /* JADX INFO: renamed from: m */
    private bw00.b f3562m;

    /* JADX INFO: renamed from: p */
    a f3565p;

    /* JADX INFO: renamed from: q */
    private HandlerThread f3566q;

    /* JADX INFO: renamed from: r */
    private Handler f3567r;

    /* JADX INFO: renamed from: s */
    private u3m.a f3568s;

    /* JADX INFO: renamed from: t */
    private Bitmap f3569t;

    /* JADX INFO: renamed from: u */
    private boolean f3570u;

    /* JADX INFO: renamed from: v */
    private eix f3571v;

    /* JADX INFO: renamed from: i */
    protected int f3558i = 0;

    /* JADX INFO: renamed from: j */
    private boolean f3559j = false;

    /* JADX INFO: renamed from: k */
    int f3560k = 0;

    /* JADX INFO: renamed from: l */
    int f3561l = 0;

    /* JADX INFO: renamed from: n */
    protected long f3563n = 0;

    /* JADX INFO: renamed from: o */
    protected long f3564o = 0;

    /* JADX INFO: renamed from: w */
    protected boolean f3572w = false;

    /* JADX INFO: renamed from: x */
    private String f3573x = "";

    /* JADX INFO: renamed from: g */
    protected boolean f3556g = false;

    /* JADX INFO: renamed from: l.oq2$a */
    public class C0637a implements hu00.b {
        public C0637a() {
        }

        /* JADX INFO: renamed from: q0 */
        public void m10236q0(int i, int i2, Object obj) {
            oq2.this.m10232w2(i, i2);
        }

        /* JADX INFO: renamed from: w0 */
        public void m10237w0(int i, int i2, Object obj) {
            oq2.this.m10232w2(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.oq2$b */
    public class C0638b implements za1 {
        public C0638b() {
        }

        /* JADX INFO: renamed from: a */
        public void m10238a(Object obj, int i, int i2) {
            int i3;
            Bundle bundle = new Bundle();
            if (i == -1) {
                bundle.putString("RecordDesc", "播放伴奏播放器失败");
                MDLog.e("BasePusherPipline_RecordFile", "播放伴奏播放器失败");
                i3 = -8198;
            } else if (i == 1) {
                bundle.putString("RecordDesc", "播放伴奏播放器Prepared");
                MDLog.e("BasePusherPipline_RecordFile", "播放伴奏播放器Prepared");
                i3 = 8200;
            } else if (i != 2) {
                i3 = 0;
            } else {
                bundle.putString("RecordDesc", "播放伴奏完成");
                Message messageObtainMessage = oq2.this.f3567r.obtainMessage();
                messageObtainMessage.what = 8201;
                messageObtainMessage.setData(bundle);
                oq2.this.f3567r.sendMessage(messageObtainMessage);
                MDLog.e("BasePusherPipline_RecordFile", "播放伴奏完成");
                i3 = 8201;
            }
            if (oq2.this.f3568s != null) {
                oq2.this.f3568s.a(i3, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: l.oq2$c */
    public class C0639c implements c23.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f3576a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d23 f3577b;

        public C0639c(String str, d23 d23Var) {
            this.f3576a = str;
            this.f3577b = d23Var;
        }

        /* JADX INFO: renamed from: a */
        public void m10239a(Bitmap bitmap) {
            oq2.this.f3569t = bitmap;
            Message messageObtainMessage = oq2.this.f3567r.obtainMessage();
            messageObtainMessage.what = 8225;
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图成功");
            bundle.putString("imagePath", this.f3576a);
            messageObtainMessage.setData(bundle);
            oq2.this.f3567r.sendMessage(messageObtainMessage);
            try {
                oq2 oq2Var = oq2.this;
                uv00 uv00Var = oq2Var.f3550a;
                if (uv00Var != null) {
                    uv00Var.X(oq2Var.f3551b, this.f3577b);
                    uv00 uv00Var2 = oq2.this.f3550a;
                    uv00Var2.I(this.f3577b, uv00Var2.j0().m());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.oq2$d */
    public static class HandlerC0640d extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<oq2> f3579a;

        public HandlerC0640d(oq2 oq2Var, Looper looper) {
            super(looper);
            this.f3579a = new WeakReference<>(oq2Var);
        }

        /* JADX INFO: renamed from: a */
        private void m10240a(int i, Bundle bundle) {
            MDLog.i("BasePusherPipline_RecordFile", bundle.getString("RecordDesc"));
            oq2 oq2Var = this.f3579a.get();
            if (oq2Var == null) {
                MDLog.e("BasePusherPipline_RecordFile", "report RecordListener BasePusherPipline is null");
                return;
            }
            if (i != 8201) {
                if (i == 8208) {
                    oq2Var.m10235z2(bundle.getString("playFile"), bundle.getString("destFile"));
                    return;
                }
                if (i != 8209) {
                    if (i == 8224) {
                        oq2Var.m10225p2(bundle.getString("imagePath"));
                        return;
                    } else if (i == 8225) {
                        oq2Var.m10226q2(bundle.getString("imagePath"));
                        return;
                    } else {
                        if (oq2Var.f3568s != null) {
                            oq2Var.f3568s.a(i, bundle);
                            return;
                        }
                        return;
                    }
                }
            }
            oq2Var.m10220A2();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m10240a(message.what, message.getData());
        }
    }

    public oq2(@NonNull Context context, @NonNull uv00 uv00Var, @NonNull i3m i3mVar, @NonNull vlw vlwVar, @NonNull InterfaceC0021a interfaceC0021a) {
        this.f3566q = null;
        this.f3567r = null;
        this.f3550a = uv00Var;
        this.f3551b = i3mVar;
        this.f3552c = new WeakReference<>(context);
        this.f3553d = vlwVar;
        this.f3554e = interfaceC0021a;
        HandlerThread handlerThread = new HandlerThread("RecordHandlerThread");
        this.f3566q = handlerThread;
        handlerThread.start();
        if (this.f3567r == null) {
            this.f3567r = new HandlerC0640d(this, this.f3566q.getLooper());
            MDLog.i("BasePusherPipline", "RecordHandler new");
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: A */
    public void mo9455A() {
        this.f3556g = false;
        this.f3550a = null;
        this.f3551b = null;
        this.f3553d = null;
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.stopSurroundMusic();
            this.f3554e = null;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m10220A2() {
        a aVar = this.f3565p;
        if (aVar != null) {
            aVar.f();
            uv00 uv00Var = this.f3550a;
            if (uv00Var != null) {
                uv00Var.X(this.f3551b, this.f3565p);
                uv00 uv00Var2 = this.f3550a;
                uv00Var2.I(this.f3565p, uv00Var2.j0().m());
            }
            this.f3565p = null;
            new Bundle().putString("RecordDesc", "录制结束");
            m10223b2();
            this.f3554e.mo399x0(false);
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "伴奏播放停止");
            u3m.a aVar2 = this.f3568s;
            if (aVar2 != null) {
                aVar2.a(8199, bundle);
            }
            u3m.a aVar3 = this.f3568s;
            if (aVar3 != null) {
                aVar3.a(8209, bundle);
                MDLog.i("BasePusherPipline_RecordFile", "stopRecordFileIml:" + this.f3568s + "; this:" + this);
            }
            MDLog.i("BasePusherPipline_RecordFile", "录制结束:");
            this.f3570u = false;
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: C1 */
    public void mo9457C1(u3m.a aVar) {
        this.f3568s = aVar;
    }

    /* JADX INFO: renamed from: F */
    public void mo10004F(String str, String str2) {
        int i;
        this.f3573x = str;
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec instanceof xc0) {
            i = 3;
        } else {
            i = momoCodec instanceof MoMoRtcPushFilter ? 5 : 1;
        }
        r3r.m10495Y(i);
        r3r.m10490C(str, str2);
        this.f3554e.mo385l(1);
    }

    /* JADX INFO: renamed from: G1 */
    public void m10221G1(za1 za1Var) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.G1(za1Var);
        }
        MediaBaseCodecFilter mediaBaseCodecFilter = this.f3555f;
        if (mediaBaseCodecFilter != null) {
            mediaBaseCodecFilter.o2(new C0637a());
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: H */
    public void mo9459H(int i) {
        eix eixVar = this.f3571v;
        if (eixVar != null) {
            eixVar.r(i);
        }
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec != null) {
            momoCodec.H(i);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: I1 */
    public void mo9461I1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "localMerge_sei " + str);
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec != null) {
            momoCodec.C1(str);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: J */
    public void mo9462J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "sei " + str);
        this.f3557h = str;
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec != null) {
            momoCodec.J(str);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: O */
    public void mo9465O(long j) {
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec != null) {
            momoCodec.O(j);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public boolean mo9854O1(String str) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "msec " + str);
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return false;
        }
        return interfaceC0021a.O1(str);
    }

    /* JADX INFO: renamed from: R */
    public void mo10025R(ya1 ya1Var) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.R(ya1Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: S0 */
    public void mo9467S0(vlw vlwVar) {
        uv00 uv00Var;
        MomoCodec momoCodec = this.f3555f;
        if (momoCodec == null || (uv00Var = this.f3550a) == null) {
            return;
        }
        uv00Var.b0(momoCodec, vlwVar);
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: T0 */
    public void mo9468T0(int i) {
        eix eixVar = this.f3571v;
        if (eixVar != null) {
            eixVar.p(i);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m10222V(ab1 ab1Var) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.V(ab1Var);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: V1 */
    public void mo9471V1(String str) {
        Message messageObtainMessage = this.f3567r.obtainMessage();
        messageObtainMessage.what = 8224;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：开始截屏");
        bundle.putString("imagePath", str);
        messageObtainMessage.setData(bundle);
        this.f3567r.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: W1 */
    public void mo10031W1(float f) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return;
        }
        interfaceC0021a.W1(f);
    }

    /* JADX INFO: renamed from: X0 */
    public double mo10032X0(int i) {
        return 0.0d;
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo10035Y0(long j, boolean z) {
        mo9854O1(this.f3573x);
        if (j > 0) {
            mo10074w0(j);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: Z1 */
    public void mo9472Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        if (this.f3550a != null) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f3550a.d(mRtcAudioHandler);
            if (this instanceof lw00) {
                this.f3550a.y(i, i2);
            }
            this.f3560k = i;
            this.f3561l = i2;
            MomoCodec momoCodec = this.f3555f;
            if (momoCodec != null) {
                momoCodec.y(i, i2);
            }
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: a */
    public void mo9473a(boolean z) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.mo369a(z);
        }
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.a(z);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m10223b2() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.b2();
        }
    }

    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return 0L;
        }
        return interfaceC0021a.c();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: c2 */
    public void mo9475c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        if (this.f3550a != null) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f3550a.d(mRtcAudioHandler);
            if (this instanceof lw00) {
                this.f3550a.y(i, i2);
            }
            this.f3560k = i;
            this.f3561l = i2;
            MomoCodec momoCodec = this.f3555f;
            if (momoCodec != null) {
                momoCodec.y0(i, i2, i3);
            }
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: e2 */
    public void mo9477e2() {
        Message messageObtainMessage = this.f3567r.obtainMessage();
        messageObtainMessage.what = 8209;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：录制结束");
        messageObtainMessage.setData(bundle);
        this.f3567r.sendMessage(messageObtainMessage);
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: f */
    public void mo9478f() {
        this.f3556g = false;
        this.f3550a = null;
        eyx.c().g(new Object[]{"BasePusherPipline stopRecord", "mPipeline == null:" + hashCode()});
        this.f3551b = null;
        this.f3553d = null;
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.stopSurroundMusic();
            this.f3554e = null;
        }
        MDLog.i("BasePusherPipline_RecordFile", "stopRecord:" + this);
        MDLog.i("BasePusherPipline_RecordFile", Log.getStackTraceString(new Throwable()));
        m10220A2();
    }

    @Override // p007l.j1m, p007l.ttl
    /* JADX INFO: renamed from: g */
    public igb0 mo9481g() {
        igb0 igb0Var = new igb0();
        ewl ewlVar = this.f3555f;
        if (ewlVar != null) {
            try {
                igb0Var.m9395h(ewlVar.s0());
                igb0Var.m9401n(ewlVar.getVideoWidth());
                igb0Var.m9400m(ewlVar.k0());
                igb0Var.m9397j((int) ewlVar.L1());
                igb0Var.m9396i(ewlVar.h1());
                igb0Var.m9398k(ewlVar.Y0());
                igb0Var.m9399l(ewlVar.T0());
            } catch (Exception unused) {
            }
        }
        return igb0Var;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo10046g0(float f) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return;
        }
        interfaceC0021a.g0(f);
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m10224g1(String str) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return false;
        }
        interfaceC0021a.mo385l(1);
        return this.f3554e.g1(str);
    }

    public double getEffectsVolume() {
        return 0.0d;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: i */
    public void mo9482i(int i, int i2, xgf0 xgf0Var) {
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.i(i, i2, xgf0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo10053j() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return;
        }
        interfaceC0021a.j();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: k0 */
    public void mo9483k0() {
        MomoCodec momoCodec;
        int i;
        if (this.f3555f == null) {
            return;
        }
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + " " + this.f3555f.getClass().getSimpleName() + " startRecord");
        this.f3555f.H0(this.f3559j);
        this.f3555f.S0(this.f3571v);
        bw00.b bVar = this.f3562m;
        if (bVar != null) {
            this.f3550a.l0(bVar, this.f3555f);
        }
        int i2 = this.f3560k;
        if (i2 != 0 && (i = this.f3561l) != 0) {
            this.f3555f.y(i2, i);
        }
        boolean zF = this.f3550a.F();
        uv00 uv00Var = this.f3550a;
        if (zF) {
            uv00Var.Y(this.f3551b, this.f3555f, this.f3553d);
        } else {
            uv00Var.m0(this.f3551b, this.f3555f, this.f3553d);
            this.f3550a.n0(this.f3551b);
        }
        String str = this.f3557h;
        if (str != null && (momoCodec = this.f3555f) != null) {
            momoCodec.J(str);
        }
        this.f3556g = true;
        if (this.f3563n == 0) {
            this.f3563n = System.currentTimeMillis();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m2 */
    public sml mo9487m2() {
        return xv00.m11846a(this.f3553d, this.f3550a.A0());
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: n */
    public void mo9488n(int i) {
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.n(i);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: p */
    public void mo9491p(String str, int i) {
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.p(str, i);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m10225p2(String str) {
        d23 d23Var = new d23();
        d23Var.R1(true);
        d23Var.Q1(new C0639c(str, d23Var));
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.w0(this.f3551b, d23Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo10063q() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return;
        }
        interfaceC0021a.q();
    }

    /* JADX INFO: renamed from: q2 */
    public void m10226q2(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmap = this.f3569t;
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.close();
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图完成".concat(str));
            u3m.a aVar = this.f3568s;
            if (aVar != null) {
                aVar.a(8225, bundle);
            }
            MDLog.i("BasePusherPipline_RecordFile", "截图完成:".concat(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: r */
    public long mo10066r() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return 0L;
        }
        return interfaceC0021a.r();
    }

    /* JADX INFO: renamed from: r2 */
    public void m10227r2(i3m i3mVar) {
        this.f3551b = i3mVar;
    }

    @Override // p007l.j1m
    public void release() {
        if (this.f3555f != null) {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + " " + this.f3555f.getClass().getSimpleName() + "release");
        } else {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("momoCodec already release beforerelease"));
        }
        this.f3555f = null;
        m10231v2();
        Handler handler = this.f3567r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3567r = null;
        }
        this.f3565p = null;
        HandlerThread handlerThread = this.f3566q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3566q = null;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public MomoCodec m10228s2() {
        return this.f3555f;
    }

    public void stopSurroundMusic() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "");
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.stopSurroundMusic();
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t */
    public void mo9493t(int i) {
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            uv00Var.t(i);
        }
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: t0 */
    public int mo9494t0() {
        MomoCodec momoCodec;
        int i;
        if (this.f3555f == null) {
            return -5;
        }
        eyx.c().g(new Object[]{getClass() + " BasePusherPipline startRecord:" + hashCode() + ",codec hashcode:" + this.f3555f.hashCode()});
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + " " + this.f3555f.getClass().getSimpleName() + " startRecord");
        this.f3555f.H0(this.f3559j);
        this.f3555f.S0(this.f3571v);
        bw00.b bVar = this.f3562m;
        if (bVar != null) {
            this.f3550a.l0(bVar, this.f3555f);
        }
        int i2 = this.f3560k;
        if (i2 != 0 && (i = this.f3561l) != 0) {
            this.f3555f.y(i2, i);
        }
        uv00 uv00Var = this.f3550a;
        if (uv00Var != null) {
            if (uv00Var.F()) {
                eyx.c().g(new Object[]{getClass() + " BasePusherPipline appendCodecFilter:" + hashCode() + ",codec hashcode:" + this.f3555f.hashCode()});
                this.f3550a.Y(this.f3551b, this.f3555f, this.f3553d);
            } else {
                eyx.c().g(new Object[]{getClass() + " BasePusherPipline addMediaCodecFilter:" + hashCode() + ",codec hashcode:" + this.f3555f.hashCode()});
                this.f3550a.m0(this.f3551b, this.f3555f, this.f3553d);
                this.f3550a.V(this.f3551b);
            }
        }
        String str = this.f3557h;
        if (str != null && (momoCodec = this.f3555f) != null) {
            momoCodec.J(str);
        }
        this.f3556g = true;
        if (this.f3563n != 0) {
            return 0;
        }
        this.f3563n = System.currentTimeMillis();
        return 0;
    }

    /* JADX INFO: renamed from: t2 */
    public Context m10229t2() {
        WeakReference<Context> weakReference = this.f3552c;
        if (weakReference == null) {
            return g16.a;
        }
        return weakReference.get() == null ? g16.a : this.f3552c.get();
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: u0 */
    public void mo9497u0(boolean z) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "is " + z);
    }

    /* JADX INFO: renamed from: u2 */
    public boolean m10230u2() {
        return this.f3572w;
    }

    /* JADX INFO: renamed from: v2 */
    public void m10231v2() {
        WeakReference<Context> weakReference = this.f3552c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void mo10074w0(long j) {
        if (this.f3554e == null) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "msec " + j);
        this.f3554e.w0(j);
    }

    /* JADX INFO: renamed from: w2 */
    public void m10232w2(int i, int i2) {
        MomoCodec momoCodec = this.f3555f;
        int i3 = 30;
        if (!(momoCodec instanceof kw00) && (momoCodec instanceof xc0)) {
            i3 = 31;
        }
        r3r.m10494R(i3, i2);
    }

    /* JADX INFO: renamed from: x2 */
    public void m10233x2(eix eixVar) {
        this.f3571v = eixVar;
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: y */
    public boolean mo9500y(String str, String str2) {
        MDLog.i("BasePusherPipline_RecordFile", "startRecordFile~" + str2);
        Message messageObtainMessage = this.f3567r.obtainMessage();
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
        this.f3567r.sendMessage(messageObtainMessage);
        return true;
    }

    /* JADX INFO: renamed from: y1 */
    public float mo10077y1() {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a == null) {
            return 0.0f;
        }
        return interfaceC0021a.y1();
    }

    /* JADX INFO: renamed from: y2 */
    public void m10234y2(boolean z) {
        this.f3572w = z;
    }

    /* JADX INFO: renamed from: z */
    public void mo10078z(boolean z) {
        InterfaceC0021a interfaceC0021a = this.f3554e;
        if (interfaceC0021a != null) {
            interfaceC0021a.z(z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public boolean m10235z2(String str, String str2) {
        if (this.f3554e == null) {
            return false;
        }
        if (str == null || str.length() > 0) {
            this.f3554e.mo399x0(true);
            this.f3554e.G1(new C0638b());
            if (!m10224g1(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("RecordDesc", "播放伴奏失败");
                u3m.a aVar = this.f3568s;
                if (aVar != null) {
                    aVar.a(-8198, bundle);
                }
                MDLog.e("BasePusherPipline_RecordFile", "播放伴奏失败:" + str);
                return false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("RecordDesc", "播放伴奏开始");
            u3m.a aVar2 = this.f3568s;
            if (aVar2 != null) {
                aVar2.a(8197, bundle2);
            }
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        if (this.f3565p == null) {
            a aVar3 = new a(m10229t2());
            this.f3565p = aVar3;
            aVar3.V2(str2);
        }
        if (this.f3565p != null) {
            boolean zF = this.f3550a.F();
            uv00 uv00Var = this.f3550a;
            if (zF) {
                uv00Var.Y(this.f3551b, this.f3565p, this.f3553d);
            } else {
                uv00Var.m0(this.f3551b, this.f3565p, this.f3553d);
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("RecordDesc", "开始录制");
            u3m.a aVar4 = this.f3568s;
            if (aVar4 != null) {
                aVar4.a(8208, bundle3);
                MDLog.i("BasePusherPipline_RecordFile", "strartRecord Iml:" + this.f3568s + "; this:" + this);
            }
        }
        this.f3570u = true;
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public void mo10034Y() {
    }

    public void pauseAllEffects() {
    }

    public void resumeAllEffects() {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: J1 */
    public void mo9463J1(boolean z) {
    }

    /* JADX INFO: renamed from: X */
    public void mo10176X(boolean z) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: f2 */
    public void mo9480f2(int i) {
    }

    /* JADX INFO: renamed from: k2 */
    public void mo10178k2(boolean z) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: m */
    public void mo9485m(boolean z) {
    }

    public void pauseEffect(int i) {
    }

    public void resumeEffect(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void mo10182v(String str) {
    }

    @Override // p007l.j1m
    /* JADX INFO: renamed from: U0 */
    public void mo9469U0(long j, boolean z) {
    }
}
