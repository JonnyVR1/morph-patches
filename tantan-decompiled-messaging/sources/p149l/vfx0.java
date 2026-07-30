package p149l;

import com.meituan.robust.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public class vfx0 implements Iterator, Closeable, apr0 {

    /* JADX INFO: renamed from: g */
    public static final zor0 f181327g = new ufx0("eof ");

    /* JADX INFO: renamed from: h */
    public static final cgx0 f181328h = cgx0.m106844b(vfx0.class);

    /* JADX INFO: renamed from: a */
    public wor0 f181329a;

    /* JADX INFO: renamed from: b */
    public wfx0 f181330b;

    /* JADX INFO: renamed from: c */
    public zor0 f181331c = null;

    /* JADX INFO: renamed from: d */
    public long f181332d = 0;

    /* JADX INFO: renamed from: e */
    public long f181333e = 0;

    /* JADX INFO: renamed from: f */
    public final List f181334f = new ArrayList();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zor0 zor0Var = this.f181331c;
        if (zor0Var == f181327g) {
            return false;
        }
        if (zor0Var != null) {
            return true;
        }
        try {
            this.f181331c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f181331c = f181327g;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zor0 next() {
        zor0 zor0VarMo199194a;
        zor0 zor0Var = this.f181331c;
        if (zor0Var != null && zor0Var != f181327g) {
            this.f181331c = null;
            return zor0Var;
        }
        wfx0 wfx0Var = this.f181330b;
        if (wfx0Var == null || this.f181332d >= this.f181333e) {
            this.f181331c = f181327g;
            lmr.m150601a();
            return null;
        }
        try {
            synchronized (wfx0Var) {
                this.f181330b.mo202997l(this.f181332d);
                zor0VarMo199194a = this.f181329a.mo199194a(this.f181330b, this);
                this.f181332d = this.f181330b.zzb();
            }
            return zor0VarMo199194a;
        } catch (EOFException unused) {
            lmr.m150601a();
            return null;
        } catch (IOException unused2) {
            lmr.m150601a();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final List m198299m() {
        return (this.f181330b == null || this.f181331c == f181327g) ? this.f181334f : new bgx0(this.f181334f, this);
    }

    /* JADX INFO: renamed from: n */
    public final void m198300n(wfx0 wfx0Var, long j, wor0 wor0Var) throws IOException {
        this.f181330b = wfx0Var;
        this.f181332d = wfx0Var.zzb();
        wfx0Var.mo202997l(wfx0Var.zzb() + j);
        this.f181333e = wfx0Var.zzb();
        this.f181329a = wor0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f181334f.size(); i++) {
            if (i > 0) {
                sb.append(Constants.PACKNAME_END);
            }
            sb.append(((zor0) this.f181334f.get(i)).toString());
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
