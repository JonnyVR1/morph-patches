package p149l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import p149l.fhd;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class pgf0<I extends DecoderInputBuffer, O extends fhd, E extends DecoderException> implements bhd<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f148678a;

    /* JADX INFO: renamed from: b */
    public final Object f148679b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f148680c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f148681d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public final I[] f148682e;

    /* JADX INFO: renamed from: f */
    public final O[] f148683f;

    /* JADX INFO: renamed from: g */
    public int f148684g;

    /* JADX INFO: renamed from: h */
    public int f148685h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public I f148686i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public E f148687j;

    /* JADX INFO: renamed from: k */
    public boolean f148688k;

    /* JADX INFO: renamed from: l */
    public boolean f148689l;

    /* JADX INFO: renamed from: m */
    public int f148690m;

    /* JADX INFO: renamed from: l.pgf0$a */
    public class C19203a extends Thread {
        public C19203a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            pgf0.this.m168712t();
        }
    }

    public pgf0(I[] iArr, O[] oArr) {
        this.f148682e = iArr;
        this.f148684g = iArr.length;
        for (int i = 0; i < this.f148684g; i++) {
            ((I[]) this.f148682e)[i] = mo168699g();
        }
        this.f148683f = oArr;
        this.f148685h = oArr.length;
        for (int i2 = 0; i2 < this.f148685h; i2++) {
            ((O[]) this.f148683f)[i2] = mo168700h();
        }
        C19203a c19203a = new C19203a("ExoPlayer:SimpleDecoder");
        this.f148678a = c19203a;
        c19203a.start();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m168698f() {
        return !this.f148680c.isEmpty() && this.f148685h > 0;
    }

    @Override // p149l.bhd
    public final void flush() {
        synchronized (this.f148679b) {
            try {
                this.f148688k = true;
                this.f148690m = 0;
                I i = this.f148686i;
                if (i != null) {
                    m168709q(i);
                    this.f148686i = null;
                }
                while (!this.f148680c.isEmpty()) {
                    m168709q(this.f148680c.removeFirst());
                }
                while (!this.f148681d.isEmpty()) {
                    this.f148681d.removeFirst().mo121353u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract I mo168699g();

    /* JADX INFO: renamed from: h */
    public abstract O mo168700h();

    /* JADX INFO: renamed from: i */
    public abstract E mo168701i(Throwable th);

    @Nullable
    /* JADX INFO: renamed from: j */
    public abstract E mo168702j(I i, O o, boolean z);

    /* JADX INFO: renamed from: k */
    public final boolean m168703k() throws InterruptedException {
        E e;
        synchronized (this.f148679b) {
            while (!this.f148689l && !m168698f()) {
                try {
                    this.f148679b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f148689l) {
                return false;
            }
            I iRemoveFirst = this.f148680c.removeFirst();
            O[] oArr = this.f148683f;
            int i = this.f148685h - 1;
            this.f148685h = i;
            O o = oArr[i];
            boolean z = this.f148688k;
            this.f148688k = false;
            if (iRemoveFirst.m154495p()) {
                o.m154490h(4);
            } else {
                if (iRemoveFirst.m154494o()) {
                    o.m154490h(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.m154496q()) {
                    o.m154490h(134217728);
                }
                try {
                    e = (E) mo168702j(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) mo168701i(e2);
                } catch (RuntimeException e3) {
                    e = (E) mo168701i(e3);
                }
                if (e != null) {
                    synchronized (this.f148679b) {
                        this.f148687j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f148679b) {
                try {
                    if (this.f148688k) {
                        o.mo121353u();
                    } else {
                        boolean zM154494o = o.m154494o();
                        int i2 = this.f148690m;
                        if (zM154494o) {
                            this.f148690m = i2 + 1;
                            o.mo121353u();
                        } else {
                            o.f97499c = i2;
                            this.f148690m = 0;
                            this.f148681d.addLast(o);
                        }
                    }
                    m168709q(iRemoveFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I mo101811a() throws DecoderException {
        I i;
        synchronized (this.f148679b) {
            m168707o();
            p11.m167013g(this.f148686i == null);
            int i2 = this.f148684g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f148682e;
                int i3 = i2 - 1;
                this.f148684g = i3;
                i = iArr[i3];
            }
            this.f148686i = i;
        }
        return i;
    }

    @Override // p149l.bhd
    @Nullable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O mo101812c() throws DecoderException {
        synchronized (this.f148679b) {
            try {
                m168707o();
                if (this.f148681d.isEmpty()) {
                    return null;
                }
                return this.f148681d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m168706n() {
        if (m168698f()) {
            this.f148679b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    /* JADX INFO: renamed from: o */
    public final void m168707o() throws E, DecoderException {
        E e = this.f148687j;
        if (e != null) {
            throw e;
        }
    }

    @Override // p149l.bhd
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo101813d(I i) throws DecoderException {
        synchronized (this.f148679b) {
            m168707o();
            p11.m167007a(i == this.f148686i);
            this.f148680c.addLast(i);
            m168706n();
            this.f148686i = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m168709q(I i) {
        i.mo9803i();
        I[] iArr = this.f148682e;
        int i2 = this.f148684g;
        this.f148684g = i2 + 1;
        iArr[i2] = i;
    }

    @CallSuper
    /* JADX INFO: renamed from: r */
    public void m168710r(O o) {
        synchronized (this.f148679b) {
            m168711s(o);
            m168706n();
        }
    }

    @Override // p149l.bhd
    @CallSuper
    public void release() {
        synchronized (this.f148679b) {
            this.f148689l = true;
            this.f148679b.notify();
        }
        try {
            this.f148678a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m168711s(O o) {
        o.mo9803i();
        O[] oArr = this.f148683f;
        int i = this.f148685h;
        this.f148685h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: renamed from: t */
    public final void m168712t() {
        do {
            try {
            } catch (InterruptedException e) {
                phg0.m168968a(e);
                return;
            }
        } while (m168703k());
    }

    /* JADX INFO: renamed from: u */
    public final void m168713u(int i) {
        p11.m167013g(this.f148684g == this.f148682e.length);
        for (I i2 : this.f148682e) {
            i2.m9805v(i);
        }
    }
}
