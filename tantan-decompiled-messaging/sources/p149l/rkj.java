package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class rkj {

    /* JADX INFO: renamed from: a */
    private final kkj f159846a;

    /* JADX INFO: renamed from: b */
    private final Handler f159847b;

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC19726b> f159848c;

    /* JADX INFO: renamed from: d */
    final juc0 f159849d;

    /* JADX INFO: renamed from: e */
    private final g23 f159850e;

    /* JADX INFO: renamed from: f */
    private boolean f159851f;

    /* JADX INFO: renamed from: g */
    private boolean f159852g;

    /* JADX INFO: renamed from: h */
    private boolean f159853h;

    /* JADX INFO: renamed from: i */
    private vtc0<Bitmap> f159854i;

    /* JADX INFO: renamed from: j */
    private C19725a f159855j;

    /* JADX INFO: renamed from: k */
    private boolean f159856k;

    /* JADX INFO: renamed from: l */
    private C19725a f159857l;

    /* JADX INFO: renamed from: m */
    private Bitmap f159858m;

    /* JADX INFO: renamed from: n */
    private p7j0<Bitmap> f159859n;

    /* JADX INFO: renamed from: o */
    private C19725a f159860o;

    /* JADX INFO: renamed from: p */
    private int f159861p;

    /* JADX INFO: renamed from: q */
    private int f159862q;

    /* JADX INFO: renamed from: r */
    private int f159863r;

    /* JADX INFO: renamed from: l.rkj$a */
    @VisibleForTesting
    public static class C19725a extends myb<Bitmap> {

        /* JADX INFO: renamed from: d */
        private final Handler f159864d;

        /* JADX INFO: renamed from: e */
        final int f159865e;

        /* JADX INFO: renamed from: f */
        private final long f159866f;

        /* JADX INFO: renamed from: g */
        private Bitmap f159867g;

        public C19725a(Handler handler, int i, long j) {
            this.f159864d = handler;
            this.f159865e = i;
            this.f159866f = j;
        }

        /* JADX INFO: renamed from: b */
        public Bitmap m179761b() {
            return this.f159867g;
        }

        @Override // p149l.cci0
        /* JADX INFO: renamed from: e */
        public void mo103910e(@Nullable Drawable drawable) {
            this.f159867g = null;
        }

        @Override // p149l.cci0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo103913i(@NonNull Bitmap bitmap, @Nullable v7j0<? super Bitmap> v7j0Var) {
            this.f159867g = bitmap;
            this.f159864d.sendMessageAtTime(this.f159864d.obtainMessage(1, this), this.f159866f);
        }
    }

    /* JADX INFO: renamed from: l.rkj$b */
    public interface InterfaceC19726b {
        /* JADX INFO: renamed from: a */
        void mo150278a();
    }

    /* JADX INFO: renamed from: l.rkj$c */
    public class C19727c implements Handler.Callback {
        public C19727c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                rkj.this.m179757m((C19725a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            rkj.this.f159849d.m143270n((C19725a) message.obj);
            return false;
        }
    }

    public rkj(g23 g23Var, juc0 juc0Var, kkj kkjVar, Handler handler, vtc0<Bitmap> vtc0Var, p7j0<Bitmap> p7j0Var, Bitmap bitmap) {
        this.f159848c = new ArrayList();
        this.f159849d = juc0Var;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C19727c()) : handler;
        this.f159850e = g23Var;
        this.f159847b = handler;
        this.f159854i = vtc0Var;
        this.f159846a = kkjVar;
        m179758o(p7j0Var, bitmap);
    }

    /* JADX INFO: renamed from: g */
    private static kxq m179742g() {
        return new o050(Double.valueOf(Math.random()));
    }

    /* JADX INFO: renamed from: i */
    private static vtc0<Bitmap> m179743i(juc0 juc0Var, int i, int i2) {
        return juc0Var.m143267f().mo199417a(muc0.m156388m0(p2e.f146846b).m199433k0(true).m199426f0(true).m199414W(i, i2));
    }

    /* JADX INFO: renamed from: l */
    private void m179744l() {
        if (!this.f159851f || this.f159852g) {
            return;
        }
        if (this.f159853h) {
            qf80.m174273a(this.f159860o == null, "Pending target must be null when starting from the first frame");
            this.f159846a.mo127938b();
            this.f159853h = false;
        }
        C19725a c19725a = this.f159860o;
        if (c19725a != null) {
            this.f159860o = null;
            m179757m(c19725a);
            return;
        }
        this.f159852g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f159846a.mo127941e());
        this.f159846a.advance();
        this.f159857l = new C19725a(this.f159847b, this.f159846a.mo127939c(), jUptimeMillis);
        this.f159854i.mo199417a(muc0.m156389n0(m179742g())).m199984A0(this.f159846a).m199991t0(this.f159857l);
    }

    /* JADX INFO: renamed from: n */
    private void m179745n() {
        Bitmap bitmap = this.f159858m;
        if (bitmap != null) {
            this.f159850e.mo124142c(bitmap);
            this.f159858m = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m179746p() {
        if (this.f159851f) {
            return;
        }
        this.f159851f = true;
        this.f159856k = false;
        m179744l();
    }

    /* JADX INFO: renamed from: q */
    private void m179747q() {
        this.f159851f = false;
    }

    /* JADX INFO: renamed from: a */
    public void m179748a() {
        this.f159848c.clear();
        m179745n();
        m179747q();
        C19725a c19725a = this.f159855j;
        if (c19725a != null) {
            this.f159849d.m143270n(c19725a);
            this.f159855j = null;
        }
        C19725a c19725a2 = this.f159857l;
        if (c19725a2 != null) {
            this.f159849d.m143270n(c19725a2);
            this.f159857l = null;
        }
        C19725a c19725a3 = this.f159860o;
        if (c19725a3 != null) {
            this.f159849d.m143270n(c19725a3);
            this.f159860o = null;
        }
        this.f159846a.clear();
        this.f159856k = true;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m179749b() {
        return this.f159846a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: c */
    public Bitmap m179750c() {
        C19725a c19725a = this.f159855j;
        return c19725a != null ? c19725a.m179761b() : this.f159858m;
    }

    /* JADX INFO: renamed from: d */
    public int m179751d() {
        C19725a c19725a = this.f159855j;
        if (c19725a != null) {
            return c19725a.f159865e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public Bitmap m179752e() {
        return this.f159858m;
    }

    /* JADX INFO: renamed from: f */
    public int m179753f() {
        return this.f159846a.getFrameCount();
    }

    /* JADX INFO: renamed from: h */
    public int m179754h() {
        return this.f159863r;
    }

    /* JADX INFO: renamed from: j */
    public int m179755j() {
        return this.f159846a.mo127940d() + this.f159861p;
    }

    /* JADX INFO: renamed from: k */
    public int m179756k() {
        return this.f159862q;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: m */
    public void m179757m(C19725a c19725a) {
        this.f159852g = false;
        if (this.f159856k) {
            this.f159847b.obtainMessage(2, c19725a).sendToTarget();
            return;
        }
        if (!this.f159851f) {
            this.f159860o = c19725a;
            return;
        }
        if (c19725a.m179761b() != null) {
            m179745n();
            C19725a c19725a2 = this.f159855j;
            this.f159855j = c19725a;
            for (int size = this.f159848c.size() - 1; size >= 0; size--) {
                this.f159848c.get(size).mo150278a();
            }
            if (c19725a2 != null) {
                this.f159847b.obtainMessage(2, c19725a2).sendToTarget();
            }
        }
        m179744l();
    }

    /* JADX INFO: renamed from: o */
    public void m179758o(p7j0<Bitmap> p7j0Var, Bitmap bitmap) {
        this.f159859n = (p7j0) qf80.m174276d(p7j0Var);
        this.f159858m = (Bitmap) qf80.m174276d(bitmap);
        this.f159854i = this.f159854i.mo199417a(new muc0().m199429i0(p7j0Var));
        this.f159861p = sck0.m183408h(bitmap);
        this.f159862q = bitmap.getWidth();
        this.f159863r = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: r */
    public void m179759r(InterfaceC19726b interfaceC19726b) {
        if (this.f159856k) {
            qkq0.m175383a("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (this.f159848c.contains(interfaceC19726b)) {
            qkq0.m175383a("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = this.f159848c.isEmpty();
        this.f159848c.add(interfaceC19726b);
        if (zIsEmpty) {
            m179746p();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m179760s(InterfaceC19726b interfaceC19726b) {
        this.f159848c.remove(interfaceC19726b);
        if (this.f159848c.isEmpty()) {
            m179747q();
        }
    }

    public rkj(ComponentCallbacks2C1053a componentCallbacks2C1053a, kkj kkjVar, int i, int i2, p7j0<Bitmap> p7j0Var, Bitmap bitmap) {
        this(componentCallbacks2C1053a.m5321f(), ComponentCallbacks2C1053a.m5316u(componentCallbacks2C1053a.m5323h()), kkjVar, null, m179743i(ComponentCallbacks2C1053a.m5316u(componentCallbacks2C1053a.m5323h()), i, i2), p7j0Var, bitmap);
    }
}
