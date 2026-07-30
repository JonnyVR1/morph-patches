package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import p153l.lid;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class wof0<I extends DecoderInputBuffer, O extends lid, E extends DecoderException> implements hid<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f190026a;

    /* JADX INFO: renamed from: b */
    public final Object f190027b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f190028c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f190029d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public final I[] f190030e;

    /* JADX INFO: renamed from: f */
    public final O[] f190031f;

    /* JADX INFO: renamed from: g */
    public int f190032g;

    /* JADX INFO: renamed from: h */
    public int f190033h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public I f190034i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public E f190035j;

    /* JADX INFO: renamed from: k */
    public boolean f190036k;

    /* JADX INFO: renamed from: l */
    public boolean f190037l;

    /* JADX INFO: renamed from: m */
    public int f190038m;

    /* JADX INFO: renamed from: l.wof0$a */
    public class C21158a extends Thread {
        public C21158a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            wof0.this.m207297t();
        }
    }

    public wof0(I[] iArr, O[] oArr) {
        this.f190030e = iArr;
        this.f190032g = iArr.length;
        for (int i = 0; i < this.f190032g; i++) {
            ((I[]) this.f190030e)[i] = mo207284g();
        }
        this.f190031f = oArr;
        this.f190033h = oArr.length;
        for (int i2 = 0; i2 < this.f190033h; i2++) {
            ((O[]) this.f190031f)[i2] = mo207285h();
        }
        C21158a c21158a = new C21158a("ExoPlayer:SimpleDecoder");
        this.f190026a = c21158a;
        c21158a.start();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m207283f() {
        return !this.f190028c.isEmpty() && this.f190033h > 0;
    }

    @Override // p153l.hid
    public final void flush() {
        synchronized (this.f190027b) {
            try {
                this.f190036k = true;
                this.f190038m = 0;
                I i = this.f190034i;
                if (i != null) {
                    m207294q(i);
                    this.f190034i = null;
                }
                while (!this.f190028c.isEmpty()) {
                    m207294q(this.f190028c.removeFirst());
                }
                while (!this.f190029d.isEmpty()) {
                    this.f190029d.removeFirst().mo150584u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract I mo207284g();

    /* JADX INFO: renamed from: h */
    public abstract O mo207285h();

    /* JADX INFO: renamed from: i */
    public abstract E mo207286i(Throwable th);

    @Nullable
    /* JADX INFO: renamed from: j */
    public abstract E mo207287j(I i, O o, boolean z);

    /* JADX INFO: renamed from: k */
    public final boolean m207288k() throws InterruptedException {
        E e;
        synchronized (this.f190027b) {
            while (!this.f190037l && !m207283f()) {
                try {
                    this.f190027b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f190037l) {
                return false;
            }
            I iRemoveFirst = this.f190028c.removeFirst();
            O[] oArr = this.f190031f;
            int i = this.f190033h - 1;
            this.f190033h = i;
            O o = oArr[i];
            boolean z = this.f190036k;
            this.f190036k = false;
            if (iRemoveFirst.m97779p()) {
                o.m97774h(4);
            } else {
                if (iRemoveFirst.m97778o()) {
                    o.m97774h(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.m97780q()) {
                    o.m97774h(134217728);
                }
                try {
                    e = (E) mo207287j(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) mo207286i(e2);
                } catch (RuntimeException e3) {
                    e = (E) mo207286i(e3);
                }
                if (e != null) {
                    synchronized (this.f190027b) {
                        this.f190035j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f190027b) {
                try {
                    if (this.f190036k) {
                        o.mo150584u();
                    } else {
                        boolean zM97778o = o.m97778o();
                        int i2 = this.f190038m;
                        if (zM97778o) {
                            this.f190038m = i2 + 1;
                            o.mo150584u();
                        } else {
                            o.f132211c = i2;
                            this.f190038m = 0;
                            this.f190029d.addLast(o);
                        }
                    }
                    m207294q(iRemoveFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I mo135120a() throws DecoderException {
        I i;
        synchronized (this.f190027b) {
            m207292o();
            w11.m204371g(this.f190034i == null);
            int i2 = this.f190032g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f190030e;
                int i3 = i2 - 1;
                this.f190032g = i3;
                i = iArr[i3];
            }
            this.f190034i = i;
        }
        return i;
    }

    @Override // p153l.hid
    @Nullable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O mo131056c() throws DecoderException {
        synchronized (this.f190027b) {
            try {
                m207292o();
                if (this.f190029d.isEmpty()) {
                    return null;
                }
                return this.f190029d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m207291n() {
        if (m207283f()) {
            this.f190027b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    /* JADX INFO: renamed from: o */
    public final void m207292o() throws E, DecoderException {
        E e = this.f190035j;
        if (e != null) {
            throw e;
        }
    }

    @Override // p153l.hid
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo135121d(I i) throws DecoderException {
        synchronized (this.f190027b) {
            m207292o();
            w11.m204365a(i == this.f190034i);
            this.f190028c.addLast(i);
            m207291n();
            this.f190034i = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m207294q(I i) {
        i.mo9857i();
        I[] iArr = this.f190030e;
        int i2 = this.f190032g;
        this.f190032g = i2 + 1;
        iArr[i2] = i;
    }

    @CallSuper
    /* JADX INFO: renamed from: r */
    public void m207295r(O o) {
        synchronized (this.f190027b) {
            m207296s(o);
            m207291n();
        }
    }

    @Override // p153l.hid
    @CallSuper
    public void release() {
        synchronized (this.f190027b) {
            this.f190037l = true;
            this.f190027b.notify();
        }
        try {
            this.f190026a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m207296s(O o) {
        o.mo9857i();
        O[] oArr = this.f190031f;
        int i = this.f190033h;
        this.f190033h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: renamed from: t */
    public final void m207297t() {
        do {
            try {
            } catch (InterruptedException e) {
                xpg0.m212648a(e);
                return;
            }
        } while (m207288k());
    }

    /* JADX INFO: renamed from: u */
    public final void m207298u(int i) {
        w11.m204371g(this.f190032g == this.f190030e.length);
        for (I i2 : this.f190030e) {
            i2.m9859v(i);
        }
    }
}
