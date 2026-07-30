package p153l;

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
import com.momo.pipline.codec.C4238a;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.piplineext.codec.MoMoRtcPushFilter;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fr2 implements c4m {

    /* JADX INFO: renamed from: a */
    protected c410 f100362a;

    /* JADX INFO: renamed from: b */
    protected z5m f100363b;

    /* JADX INFO: renamed from: c */
    protected WeakReference<Context> f100364c;

    /* JADX INFO: renamed from: d */
    protected uow f100365d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC4260a f100366e;

    /* JADX INFO: renamed from: f */
    protected MomoCodec f100367f;

    /* JADX INFO: renamed from: h */
    protected String f100369h;

    /* JADX INFO: renamed from: m */
    private j410.InterfaceC17870b f100374m;

    /* JADX INFO: renamed from: p */
    C4238a f100377p;

    /* JADX INFO: renamed from: q */
    private HandlerThread f100378q;

    /* JADX INFO: renamed from: r */
    private Handler f100379r;

    /* JADX INFO: renamed from: s */
    private l6m.InterfaceC18358a f100380s;

    /* JADX INFO: renamed from: t */
    private Bitmap f100381t;

    /* JADX INFO: renamed from: u */
    private boolean f100382u;

    /* JADX INFO: renamed from: v */
    private brx f100383v;

    /* JADX INFO: renamed from: i */
    protected int f100370i = 0;

    /* JADX INFO: renamed from: j */
    private boolean f100371j = false;

    /* JADX INFO: renamed from: k */
    int f100372k = 0;

    /* JADX INFO: renamed from: l */
    int f100373l = 0;

    /* JADX INFO: renamed from: n */
    protected long f100375n = 0;

    /* JADX INFO: renamed from: o */
    protected long f100376o = 0;

    /* JADX INFO: renamed from: w */
    protected boolean f100384w = false;

    /* JADX INFO: renamed from: x */
    private String f100385x = "";

    /* JADX INFO: renamed from: g */
    protected boolean f100368g = false;

    /* JADX INFO: renamed from: l.fr2$a */
    public class C17043a implements q210.InterfaceC19501b {
        public C17043a() {
        }

        @Override // p153l.q210.InterfaceC19501b
        /* JADX INFO: renamed from: q0 */
        public void mo20748q0(int i, int i2, Object obj) {
            fr2.this.m126856w2(i, i2);
        }

        @Override // p153l.q210.InterfaceC19501b
        /* JADX INFO: renamed from: w0 */
        public void mo20749w0(int i, int i2, Object obj) {
            fr2.this.m126856w2(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.fr2$b */
    public class C17044b implements gb1 {
        public C17044b() {
        }

        @Override // p153l.gb1
        /* JADX INFO: renamed from: a */
        public void mo19382a(Object obj, int i, int i2) {
            int i3;
            Bundle bundle = new Bundle();
            if (i == -1) {
                bundle.putString("RecordDesc", "播放伴奏播放器失败");
                MDLog.m7445e("BasePusherPipline_RecordFile", "播放伴奏播放器失败");
                i3 = -8198;
            } else if (i == 1) {
                bundle.putString("RecordDesc", "播放伴奏播放器Prepared");
                MDLog.m7445e("BasePusherPipline_RecordFile", "播放伴奏播放器Prepared");
                i3 = 8200;
            } else if (i != 2) {
                i3 = 0;
            } else {
                bundle.putString("RecordDesc", "播放伴奏完成");
                Message messageObtainMessage = fr2.this.f100379r.obtainMessage();
                messageObtainMessage.what = 8201;
                messageObtainMessage.setData(bundle);
                fr2.this.f100379r.sendMessage(messageObtainMessage);
                MDLog.m7445e("BasePusherPipline_RecordFile", "播放伴奏完成");
                i3 = 8201;
            }
            if (fr2.this.f100380s != null) {
                fr2.this.f100380s.mo20150a(i3, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: l.fr2$c */
    public class C17045c implements s23.InterfaceC19961a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f100388a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ t23 f100389b;

        public C17045c(String str, t23 t23Var) {
            this.f100388a = str;
            this.f100389b = t23Var;
        }

        @Override // p153l.s23.InterfaceC19961a
        /* JADX INFO: renamed from: a */
        public void mo126860a(Bitmap bitmap) {
            fr2.this.f100381t = bitmap;
            Message messageObtainMessage = fr2.this.f100379r.obtainMessage();
            messageObtainMessage.what = 8225;
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图成功");
            bundle.putString("imagePath", this.f100388a);
            messageObtainMessage.setData(bundle);
            fr2.this.f100379r.sendMessage(messageObtainMessage);
            try {
                fr2 fr2Var = fr2.this;
                c410 c410Var = fr2Var.f100362a;
                if (c410Var != null) {
                    c410Var.mo20688X(fr2Var.f100363b, this.f100389b);
                    c410 c410Var2 = fr2.this.f100362a;
                    c410Var2.mo20682I(this.f100389b, c410Var2.mo20703j0().m128994m());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fr2$d */
    public static class HandlerC17046d extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<fr2> f100391a;

        public HandlerC17046d(fr2 fr2Var, Looper looper) {
            super(looper);
            this.f100391a = new WeakReference<>(fr2Var);
        }

        /* JADX INFO: renamed from: a */
        private void m126861a(int i, Bundle bundle) {
            MDLog.m7449i("BasePusherPipline_RecordFile", bundle.getString("RecordDesc"));
            fr2 fr2Var = this.f100391a.get();
            if (fr2Var == null) {
                MDLog.m7445e("BasePusherPipline_RecordFile", "report RecordListener BasePusherPipline is null");
                return;
            }
            if (i != 8201) {
                if (i == 8208) {
                    fr2Var.m126859z2(bundle.getString("playFile"), bundle.getString("destFile"));
                    return;
                }
                if (i != 8209) {
                    if (i == 8224) {
                        fr2Var.m126849p2(bundle.getString("imagePath"));
                        return;
                    } else if (i == 8225) {
                        fr2Var.m126850q2(bundle.getString("imagePath"));
                        return;
                    } else {
                        if (fr2Var.f100380s != null) {
                            fr2Var.f100380s.mo20150a(i, bundle);
                            return;
                        }
                        return;
                    }
                }
            }
            fr2Var.m126847A2();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m126861a(message.what, message.getData());
        }
    }

    public fr2(@NonNull Context context, @NonNull c410 c410Var, @NonNull z5m z5mVar, @NonNull uow uowVar, @NonNull InterfaceC4260a interfaceC4260a) {
        this.f100378q = null;
        this.f100379r = null;
        this.f100362a = c410Var;
        this.f100363b = z5mVar;
        this.f100364c = new WeakReference<>(context);
        this.f100365d = uowVar;
        this.f100366e = interfaceC4260a;
        HandlerThread handlerThread = new HandlerThread("RecordHandlerThread");
        this.f100378q = handlerThread;
        handlerThread.start();
        if (this.f100379r == null) {
            this.f100379r = new HandlerC17046d(this, this.f100378q.getLooper());
            MDLog.m7449i("BasePusherPipline", "RecordHandler new");
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: A */
    public void mo107888A() {
        this.f100368g = false;
        this.f100362a = null;
        this.f100363b = null;
        this.f100365d = null;
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.stopSurroundMusic();
            this.f100366e = null;
        }
    }

    /* JADX INFO: renamed from: A2 */
    public void m126847A2() {
        C4238a c4238a = this.f100377p;
        if (c4238a != null) {
            c4238a.mo20661f();
            c410 c410Var = this.f100362a;
            if (c410Var != null) {
                c410Var.mo20688X(this.f100363b, this.f100377p);
                c410 c410Var2 = this.f100362a;
                c410Var2.mo20682I(this.f100377p, c410Var2.mo20703j0().m128994m());
            }
            this.f100377p = null;
            new Bundle().putString("RecordDesc", "录制结束");
            mo21106b2();
            this.f100366e.mo21132x0(false);
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "伴奏播放停止");
            l6m.InterfaceC18358a interfaceC18358a = this.f100380s;
            if (interfaceC18358a != null) {
                interfaceC18358a.mo20150a(8199, bundle);
            }
            l6m.InterfaceC18358a interfaceC18358a2 = this.f100380s;
            if (interfaceC18358a2 != null) {
                interfaceC18358a2.mo20150a(8209, bundle);
                MDLog.m7449i("BasePusherPipline_RecordFile", "stopRecordFileIml:" + this.f100380s + "; this:" + this);
            }
            MDLog.m7449i("BasePusherPipline_RecordFile", "录制结束:");
            this.f100382u = false;
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: C1 */
    public void mo107890C1(l6m.InterfaceC18358a interfaceC18358a) {
        this.f100380s = interfaceC18358a;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: F */
    public void mo21081F(String str, String str2) {
        int i;
        this.f100385x = str;
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec instanceof tc0) {
            i = 3;
        } else {
            i = momoCodec instanceof MoMoRtcPushFilter ? 5 : 1;
        }
        s5r.m184749Y(i);
        s5r.m184744C(str, str2);
        this.f100366e.mo21118l(1);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: G1 */
    public void mo21082G1(gb1 gb1Var) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21082G1(gb1Var);
        }
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec != null) {
            ((MediaBaseCodecFilter) momoCodec).m20746o2(new C17043a());
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: H */
    public void mo107892H(int i) {
        brx brxVar = this.f100383v;
        if (brxVar != null) {
            brxVar.m106186r(i);
        }
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec != null) {
            momoCodec.mo20648H(i);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: I1 */
    public void mo107894I1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "localMerge_sei " + str);
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec != null) {
            momoCodec.mo20647C1(str);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: J */
    public void mo107895J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "sei " + str);
        this.f100369h = str;
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec != null) {
            momoCodec.mo20650J(str);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: O */
    public void mo107898O(long j) {
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec != null) {
            momoCodec.mo20653O(j);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: O1 */
    public boolean mo21092O1(String str) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "msec " + str);
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return false;
        }
        return interfaceC4260a.mo21092O1(str);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: R */
    public void mo109296R(fb1 fb1Var) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo109296R(fb1Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: S0 */
    public void mo107900S0(uow uowVar) {
        c410 c410Var;
        MomoCodec momoCodec = this.f100367f;
        if (momoCodec == null || (c410Var = this.f100362a) == null) {
            return;
        }
        c410Var.mo20692b0(momoCodec, uowVar);
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: T0 */
    public void mo107901T0(int i) {
        brx brxVar = this.f100383v;
        if (brxVar != null) {
            brxVar.m106184p(i);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: V */
    public void mo21099V(hb1 hb1Var) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21099V(hb1Var);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: V1 */
    public void mo107904V1(String str) {
        Message messageObtainMessage = this.f100379r.obtainMessage();
        messageObtainMessage.what = 8224;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：开始截屏");
        bundle.putString("imagePath", str);
        messageObtainMessage.setData(bundle);
        this.f100379r.sendMessage(messageObtainMessage);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: W1 */
    public void mo21100W1(float f) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo21100W1(f);
    }

    /* JADX INFO: renamed from: X0 */
    public double mo126848X0(int i) {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: Y0 */
    public void mo21101Y0(long j, boolean z) {
        mo21092O1(this.f100385x);
        if (j > 0) {
            mo21130w0(j);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: Z1 */
    public void mo107905Z1(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        if (this.f100362a != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f100362a.mo107821d(mRtcAudioHandler);
            if (this instanceof t410) {
                this.f100362a.mo107823y(i, i2);
            }
            this.f100372k = i;
            this.f100373l = i2;
            MomoCodec momoCodec = this.f100367f;
            if (momoCodec != null) {
                momoCodec.mo20670y(i, i2);
            }
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: a */
    public void mo107906a(boolean z) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21102a(z);
        }
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo107818a(z);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: b2 */
    public void mo21106b2() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21106b2();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: c */
    public long mo21107c() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return 0L;
        }
        return interfaceC4260a.mo21107c();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: c2 */
    public void mo107908c2(MRtcAudioHandler mRtcAudioHandler, int i, int i2, int i3) {
        if (this.f100362a != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "is true" + i + i2);
            this.f100362a.mo107821d(mRtcAudioHandler);
            if (this instanceof t410) {
                this.f100362a.mo107823y(i, i2);
            }
            this.f100372k = i;
            this.f100373l = i2;
            MomoCodec momoCodec = this.f100367f;
            if (momoCodec != null) {
                momoCodec.mo20671y0(i, i2, i3);
            }
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: e2 */
    public void mo107910e2() {
        Message messageObtainMessage = this.f100379r.obtainMessage();
        messageObtainMessage.what = 8209;
        Bundle bundle = new Bundle();
        bundle.putString("RecordDesc", "发送命令：录制结束");
        messageObtainMessage.setData(bundle);
        this.f100379r.sendMessage(messageObtainMessage);
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: f */
    public void mo107911f() {
        this.f100368g = false;
        this.f100362a = null;
        b7y.m102882c().m102888g("BasePusherPipline stopRecord", "mPipeline == null:" + hashCode());
        this.f100363b = null;
        this.f100365d = null;
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.stopSurroundMusic();
            this.f100366e = null;
        }
        MDLog.m7449i("BasePusherPipline_RecordFile", "stopRecord:" + this);
        MDLog.m7449i("BasePusherPipline_RecordFile", Log.getStackTraceString(new Throwable()));
        m126847A2();
    }

    @Override // p153l.c4m, p153l.hwl
    /* JADX INFO: renamed from: g */
    public mob0 mo107914g() {
        mob0 mob0Var = new mob0();
        wyl wylVar = (wyl) this.f100367f;
        if (wylVar != null) {
            try {
                mob0Var.m159251h(wylVar.mo21043s0());
                mob0Var.m159257n(wylVar.getVideoWidth());
                mob0Var.m159256m(wylVar.mo21021k0());
                mob0Var.m159253j((int) wylVar.mo20943L1());
                mob0Var.m159252i(wylVar.mo21013h1());
                mob0Var.m159254k(wylVar.mo20991Y0());
                mob0Var.m159255l(wylVar.mo20972T0());
            } catch (Exception unused) {
            }
        }
        return mob0Var;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: g0 */
    public void mo109313g0(float f) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo109313g0(f);
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: g1 */
    public boolean mo21114g1(String str) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return false;
        }
        interfaceC4260a.mo21118l(1);
        return this.f100366e.mo21114g1(str);
    }

    public double getEffectsVolume() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: i */
    public void mo107915i(int i, int i2, fpf0 fpf0Var) {
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20700i(i, i2, fpf0Var);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: j */
    public void mo21116j() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo21116j();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: k0 */
    public void mo107916k0() {
        MomoCodec momoCodec;
        int i;
        if (this.f100367f == null) {
            return;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f100367f.getClass().getSimpleName() + " startRecord");
        this.f100367f.mo20649H0(this.f100371j);
        this.f100367f.mo20655S0(this.f100383v);
        j410.InterfaceC17870b interfaceC17870b = this.f100374m;
        if (interfaceC17870b != null) {
            this.f100362a.mo20705l0(interfaceC17870b, this.f100367f);
        }
        int i2 = this.f100372k;
        if (i2 != 0 && (i = this.f100373l) != 0) {
            this.f100367f.mo20670y(i2, i);
        }
        boolean zMo20679F = this.f100362a.mo20679F();
        c410 c410Var = this.f100362a;
        if (zMo20679F) {
            c410Var.mo20689Y(this.f100363b, this.f100367f, this.f100365d);
        } else {
            c410Var.mo20706m0(this.f100363b, this.f100367f, this.f100365d);
            this.f100362a.mo20708n0(this.f100363b);
        }
        String str = this.f100369h;
        if (str != null && (momoCodec = this.f100367f) != null) {
            momoCodec.mo20650J(str);
        }
        this.f100368g = true;
        if (this.f100375n == 0) {
            this.f100375n = System.currentTimeMillis();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m2 */
    public dpl mo107920m2() {
        return f410.m123866a(this.f100365d, this.f100362a.mo20673A0());
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: n */
    public void mo107921n(int i) {
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20707n(i);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: p */
    public void mo107924p(String str, int i) {
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20711p(str, i);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public void m126849p2(String str) {
        t23 t23Var = new t23();
        t23Var.m188941R1(true);
        t23Var.m184108Q1(new C17045c(str, t23Var));
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20720w0(this.f100363b, t23Var);
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: q */
    public void mo21124q() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo21124q();
    }

    /* JADX INFO: renamed from: q2 */
    public void m126850q2(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmap = this.f100381t;
            if (bitmap != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            }
            fileOutputStream.close();
            Bundle bundle = new Bundle();
            bundle.putString("RecordDesc", "截图完成".concat(str));
            l6m.InterfaceC18358a interfaceC18358a = this.f100380s;
            if (interfaceC18358a != null) {
                interfaceC18358a.mo20150a(8225, bundle);
            }
            MDLog.m7449i("BasePusherPipline_RecordFile", "截图完成:".concat(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: r */
    public long mo21126r() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return 0L;
        }
        return interfaceC4260a.mo21126r();
    }

    /* JADX INFO: renamed from: r2 */
    public void m126851r2(z5m z5mVar) {
        this.f100363b = z5mVar;
    }

    @Override // p153l.c4m
    public void release() {
        if (this.f100367f != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f100367f.getClass().getSimpleName() + "release");
        } else {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName().concat("momoCodec already release beforerelease"));
        }
        this.f100367f = null;
        m126855v2();
        Handler handler = this.f100379r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f100379r = null;
        }
        this.f100377p = null;
        HandlerThread handlerThread = this.f100378q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f100378q = null;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public MomoCodec m126852s2() {
        return this.f100367f;
    }

    @Override // p153l.l6m
    public void stopSurroundMusic() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "");
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.stopSurroundMusic();
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t */
    public void mo107926t(int i) {
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            c410Var.mo20716t(i);
        }
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: t0 */
    public int mo107927t0() {
        MomoCodec momoCodec;
        int i;
        if (this.f100367f == null) {
            return -5;
        }
        b7y.m102882c().m102888g(getClass() + " BasePusherPipline startRecord:" + hashCode() + ",codec hashcode:" + this.f100367f.hashCode());
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f100367f.getClass().getSimpleName() + " startRecord");
        this.f100367f.mo20649H0(this.f100371j);
        this.f100367f.mo20655S0(this.f100383v);
        j410.InterfaceC17870b interfaceC17870b = this.f100374m;
        if (interfaceC17870b != null) {
            this.f100362a.mo20705l0(interfaceC17870b, this.f100367f);
        }
        int i2 = this.f100372k;
        if (i2 != 0 && (i = this.f100373l) != 0) {
            this.f100367f.mo20670y(i2, i);
        }
        c410 c410Var = this.f100362a;
        if (c410Var != null) {
            if (c410Var.mo20679F()) {
                b7y.m102882c().m102888g(getClass() + " BasePusherPipline appendCodecFilter:" + hashCode() + ",codec hashcode:" + this.f100367f.hashCode());
                this.f100362a.mo20689Y(this.f100363b, this.f100367f, this.f100365d);
            } else {
                b7y.m102882c().m102888g(getClass() + " BasePusherPipline addMediaCodecFilter:" + hashCode() + ",codec hashcode:" + this.f100367f.hashCode());
                this.f100362a.mo20706m0(this.f100363b, this.f100367f, this.f100365d);
                this.f100362a.mo20686V(this.f100363b);
            }
        }
        String str = this.f100369h;
        if (str != null && (momoCodec = this.f100367f) != null) {
            momoCodec.mo20650J(str);
        }
        this.f100368g = true;
        if (this.f100375n != 0) {
            return 0;
        }
        this.f100375n = System.currentTimeMillis();
        return 0;
    }

    /* JADX INFO: renamed from: t2 */
    public Context m126853t2() {
        WeakReference<Context> weakReference = this.f100364c;
        if (weakReference == null) {
            return l26.f129743a;
        }
        return weakReference.get() == null ? l26.f129743a : this.f100364c.get();
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: u0 */
    public void mo107930u0(boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "is " + z);
    }

    /* JADX INFO: renamed from: u2 */
    public boolean m126854u2() {
        return this.f100384w;
    }

    /* JADX INFO: renamed from: v2 */
    public void m126855v2() {
        WeakReference<Context> weakReference = this.f100364c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: w0 */
    public void mo21130w0(long j) {
        if (this.f100366e == null) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "msec " + j);
        this.f100366e.mo21130w0(j);
    }

    /* JADX INFO: renamed from: w2 */
    public void m126856w2(int i, int i2) {
        MomoCodec momoCodec = this.f100367f;
        int i3 = 30;
        if (!(momoCodec instanceof s410) && (momoCodec instanceof tc0)) {
            i3 = 31;
        }
        s5r.m184748R(i3, i2);
    }

    /* JADX INFO: renamed from: x2 */
    public void m126857x2(brx brxVar) {
        this.f100383v = brxVar;
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: y */
    public boolean mo107933y(String str, String str2) {
        MDLog.m7449i("BasePusherPipline_RecordFile", "startRecordFile~" + str2);
        Message messageObtainMessage = this.f100379r.obtainMessage();
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
        this.f100379r.sendMessage(messageObtainMessage);
        return true;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: y1 */
    public float mo21134y1() {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a == null) {
            return 0.0f;
        }
        return interfaceC4260a.mo21134y1();
    }

    /* JADX INFO: renamed from: y2 */
    public void m126858y2(boolean z) {
        this.f100384w = z;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: z */
    public void mo21135z(boolean z) {
        InterfaceC4260a interfaceC4260a = this.f100366e;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21135z(z);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public boolean m126859z2(String str, String str2) {
        if (this.f100366e == null) {
            return false;
        }
        if (str == null || str.length() > 0) {
            this.f100366e.mo21132x0(true);
            this.f100366e.mo21082G1(new C17044b());
            if (!mo21114g1(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("RecordDesc", "播放伴奏失败");
                l6m.InterfaceC18358a interfaceC18358a = this.f100380s;
                if (interfaceC18358a != null) {
                    interfaceC18358a.mo20150a(-8198, bundle);
                }
                MDLog.m7445e("BasePusherPipline_RecordFile", "播放伴奏失败:" + str);
                return false;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("RecordDesc", "播放伴奏开始");
            l6m.InterfaceC18358a interfaceC18358a2 = this.f100380s;
            if (interfaceC18358a2 != null) {
                interfaceC18358a2.mo20150a(8197, bundle2);
            }
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        if (this.f100377p == null) {
            C4238a c4238a = new C4238a(m126853t2());
            this.f100377p = c4238a;
            c4238a.m20758V2(str2);
        }
        if (this.f100377p != null) {
            boolean zMo20679F = this.f100362a.mo20679F();
            c410 c410Var = this.f100362a;
            if (zMo20679F) {
                c410Var.mo20689Y(this.f100363b, this.f100377p, this.f100365d);
            } else {
                c410Var.mo20706m0(this.f100363b, this.f100377p, this.f100365d);
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("RecordDesc", "开始录制");
            l6m.InterfaceC18358a interfaceC18358a3 = this.f100380s;
            if (interfaceC18358a3 != null) {
                interfaceC18358a3.mo20150a(8208, bundle3);
                MDLog.m7449i("BasePusherPipline_RecordFile", "strartRecord Iml:" + this.f100380s + "; this:" + this);
            }
        }
        this.f100382u = true;
        return true;
    }

    @Override // p153l.l6m
    /* JADX INFO: renamed from: Y */
    public void mo109304Y() {
    }

    public void pauseAllEffects() {
    }

    public void resumeAllEffects() {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: J1 */
    public void mo107896J1(boolean z) {
    }

    /* JADX INFO: renamed from: X */
    public void mo109302X(boolean z) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: f2 */
    public void mo107913f2(int i) {
    }

    /* JADX INFO: renamed from: k2 */
    public void mo109323k2(boolean z) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: m */
    public void mo107918m(boolean z) {
    }

    public void pauseEffect(int i) {
    }

    public void resumeEffect(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void mo109334v(String str) {
    }

    @Override // p153l.c4m
    /* JADX INFO: renamed from: U0 */
    public void mo107902U0(long j, boolean z) {
    }
}
