package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class hnj {

    /* JADX INFO: renamed from: a */
    private final anj f110774a;

    /* JADX INFO: renamed from: b */
    private final Handler f110775b;

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC17520b> f110776c;

    /* JADX INFO: renamed from: d */
    final m2d0 f110777d;

    /* JADX INFO: renamed from: e */
    private final w23 f110778e;

    /* JADX INFO: renamed from: f */
    private boolean f110779f;

    /* JADX INFO: renamed from: g */
    private boolean f110780g;

    /* JADX INFO: renamed from: h */
    private boolean f110781h;

    /* JADX INFO: renamed from: i */
    private a2d0<Bitmap> f110782i;

    /* JADX INFO: renamed from: j */
    private C17519a f110783j;

    /* JADX INFO: renamed from: k */
    private boolean f110784k;

    /* JADX INFO: renamed from: l */
    private C17519a f110785l;

    /* JADX INFO: renamed from: m */
    private Bitmap f110786m;

    /* JADX INFO: renamed from: n */
    private tgj0<Bitmap> f110787n;

    /* JADX INFO: renamed from: o */
    private C17519a f110788o;

    /* JADX INFO: renamed from: p */
    private int f110789p;

    /* JADX INFO: renamed from: q */
    private int f110790q;

    /* JADX INFO: renamed from: r */
    private int f110791r;

    /* JADX INFO: renamed from: l.hnj$a */
    @VisibleForTesting
    public static class C17519a extends a0c<Bitmap> {

        /* JADX INFO: renamed from: d */
        private final Handler f110792d;

        /* JADX INFO: renamed from: e */
        final int f110793e;

        /* JADX INFO: renamed from: f */
        private final long f110794f;

        /* JADX INFO: renamed from: g */
        private Bitmap f110795g;

        public C17519a(Handler handler, int i, long j) {
            this.f110792d = handler;
            this.f110793e = i;
            this.f110794f = j;
        }

        /* JADX INFO: renamed from: b */
        public Bitmap m136145b() {
            return this.f110795g;
        }

        @Override // p153l.cli0
        /* JADX INFO: renamed from: e */
        public void mo104923e(@Nullable Drawable drawable) {
            this.f110795g = null;
        }

        @Override // p153l.cli0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo104924i(@NonNull Bitmap bitmap, @Nullable zgj0<? super Bitmap> zgj0Var) {
            this.f110795g = bitmap;
            this.f110792d.sendMessageAtTime(this.f110792d.obtainMessage(1, this), this.f110794f);
        }
    }

    /* JADX INFO: renamed from: l.hnj$b */
    public interface InterfaceC17520b {
        /* JADX INFO: renamed from: a */
        void mo105405a();
    }

    /* JADX INFO: renamed from: l.hnj$c */
    public class C17521c implements Handler.Callback {
        public C17521c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                hnj.this.m136141m((C17519a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            hnj.this.f110777d.m156815n((C17519a) message.obj);
            return false;
        }
    }

    public hnj(w23 w23Var, m2d0 m2d0Var, anj anjVar, Handler handler, a2d0<Bitmap> a2d0Var, tgj0<Bitmap> tgj0Var, Bitmap bitmap) {
        this.f110776c = new ArrayList();
        this.f110777d = m2d0Var;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C17521c()) : handler;
        this.f110778e = w23Var;
        this.f110775b = handler;
        this.f110782i = a2d0Var;
        this.f110774a = anjVar;
        m136142o(tgj0Var, bitmap);
    }

    /* JADX INFO: renamed from: g */
    private static kzq m136126g() {
        return new d950(Double.valueOf(Math.random()));
    }

    /* JADX INFO: renamed from: i */
    private static a2d0<Bitmap> m136127i(m2d0 m2d0Var, int i, int i2) {
        return m2d0Var.m156812f().mo95645a(p2d0.m170344n0(d4e.f85034b).m155562l0(true).m155554g0(true).m155543X(i, i2));
    }

    /* JADX INFO: renamed from: l */
    private void m136128l() {
        if (!this.f110779f || this.f110780g) {
            return;
        }
        if (this.f110781h) {
            vn80.m201941a(this.f110788o == null, "Pending target must be null when starting from the first frame");
            this.f110774a.mo98985b();
            this.f110781h = false;
        }
        C17519a c17519a = this.f110788o;
        if (c17519a != null) {
            this.f110788o = null;
            m136141m(c17519a);
            return;
        }
        this.f110780g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f110774a.mo98988e());
        this.f110774a.advance();
        this.f110785l = new C17519a(this.f110775b, this.f110774a.mo98986c(), jUptimeMillis);
        this.f110782i.mo95645a(p2d0.m170345o0(m136126g())).m95641C0(this.f110774a).m95650u0(this.f110785l);
    }

    /* JADX INFO: renamed from: n */
    private void m136129n() {
        Bitmap bitmap = this.f110786m;
        if (bitmap != null) {
            this.f110778e.mo191126c(bitmap);
            this.f110786m = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m136130p() {
        if (this.f110779f) {
            return;
        }
        this.f110779f = true;
        this.f110784k = false;
        m136128l();
    }

    /* JADX INFO: renamed from: q */
    private void m136131q() {
        this.f110779f = false;
    }

    /* JADX INFO: renamed from: a */
    public void m136132a() {
        this.f110776c.clear();
        m136129n();
        m136131q();
        C17519a c17519a = this.f110783j;
        if (c17519a != null) {
            this.f110777d.m156815n(c17519a);
            this.f110783j = null;
        }
        C17519a c17519a2 = this.f110785l;
        if (c17519a2 != null) {
            this.f110777d.m156815n(c17519a2);
            this.f110785l = null;
        }
        C17519a c17519a3 = this.f110788o;
        if (c17519a3 != null) {
            this.f110777d.m156815n(c17519a3);
            this.f110788o = null;
        }
        this.f110774a.clear();
        this.f110784k = true;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m136133b() {
        return this.f110774a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m136134c() {
        C17519a c17519a = this.f110783j;
        return c17519a != null ? c17519a.m136145b() : this.f110786m;
    }

    /* JADX INFO: renamed from: d */
    public int m136135d() {
        C17519a c17519a = this.f110783j;
        if (c17519a != null) {
            return c17519a.f110793e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m136136e() {
        return this.f110786m;
    }

    /* JADX INFO: renamed from: f */
    public int m136137f() {
        return this.f110774a.getFrameCount();
    }

    /* JADX INFO: renamed from: h */
    public int m136138h() {
        return this.f110791r;
    }

    /* JADX INFO: renamed from: j */
    public int m136139j() {
        return this.f110774a.mo98987d() + this.f110789p;
    }

    /* JADX INFO: renamed from: k */
    public int m136140k() {
        return this.f110790q;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public void m136141m(C17519a c17519a) {
        this.f110780g = false;
        if (this.f110784k) {
            this.f110775b.obtainMessage(2, c17519a).sendToTarget();
            return;
        }
        if (!this.f110779f) {
            if (this.f110781h) {
                this.f110775b.obtainMessage(2, c17519a).sendToTarget();
                return;
            } else {
                this.f110788o = c17519a;
                return;
            }
        }
        if (c17519a.m136145b() != null) {
            m136129n();
            C17519a c17519a2 = this.f110783j;
            this.f110783j = c17519a;
            for (int size = this.f110776c.size() - 1; size >= 0; size--) {
                this.f110776c.get(size).mo105405a();
            }
            if (c17519a2 != null) {
                this.f110775b.obtainMessage(2, c17519a2).sendToTarget();
            }
        }
        m136128l();
    }

    /* JADX INFO: renamed from: o */
    public void m136142o(tgj0<Bitmap> tgj0Var, Bitmap bitmap) {
        this.f110787n = (tgj0) vn80.m201944d(tgj0Var);
        this.f110786m = (Bitmap) vn80.m201944d(bitmap);
        this.f110782i = this.f110782i.mo95645a(new p2d0().m155558j0(tgj0Var));
        this.f110789p = ylk0.m216584h(bitmap);
        this.f110790q = bitmap.getWidth();
        this.f110791r = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: r */
    public void m136143r(InterfaceC17520b interfaceC17520b) {
        if (this.f110784k) {
            wtq0.m207906a("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (this.f110776c.contains(interfaceC17520b)) {
            wtq0.m207906a("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = this.f110776c.isEmpty();
        this.f110776c.add(interfaceC17520b);
        if (zIsEmpty) {
            m136130p();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m136144s(InterfaceC17520b interfaceC17520b) {
        this.f110776c.remove(interfaceC17520b);
        if (this.f110776c.isEmpty()) {
            m136131q();
        }
    }

    public hnj(ComponentCallbacks2C1057a componentCallbacks2C1057a, anj anjVar, int i, int i2, tgj0<Bitmap> tgj0Var, Bitmap bitmap) {
        this(componentCallbacks2C1057a.m5330f(), ComponentCallbacks2C1057a.m5325t(componentCallbacks2C1057a.m5332h()), anjVar, null, m136127i(ComponentCallbacks2C1057a.m5325t(componentCallbacks2C1057a.m5332h()), i, i2), tgj0Var, bitmap);
    }
}
