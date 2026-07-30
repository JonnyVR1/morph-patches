package p153l;

import com.meituan.robust.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public class bpx0 implements Iterator, Closeable, gyr0 {

    /* JADX INFO: renamed from: g */
    public static final fyr0 f77830g = new apx0("eof ");

    /* JADX INFO: renamed from: h */
    public static final ipx0 f77831h = ipx0.m141544b(bpx0.class);

    /* JADX INFO: renamed from: a */
    public cyr0 f77832a;

    /* JADX INFO: renamed from: b */
    public cpx0 f77833b;

    /* JADX INFO: renamed from: c */
    public fyr0 f77834c = null;

    /* JADX INFO: renamed from: d */
    public long f77835d = 0;

    /* JADX INFO: renamed from: e */
    public long f77836e = 0;

    /* JADX INFO: renamed from: f */
    public final List f77837f = new ArrayList();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fyr0 fyr0Var = this.f77834c;
        if (fyr0Var == f77830g) {
            return false;
        }
        if (fyr0Var != null) {
            return true;
        }
        try {
            this.f77834c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f77834c = f77830g;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final fyr0 next() {
        fyr0 fyr0VarMo107032a;
        fyr0 fyr0Var = this.f77834c;
        if (fyr0Var != null && fyr0Var != f77830g) {
            this.f77834c = null;
            return fyr0Var;
        }
        cpx0 cpx0Var = this.f77833b;
        if (cpx0Var == null || this.f77835d >= this.f77836e) {
            this.f77834c = f77830g;
            mor.m159308a();
            return null;
        }
        try {
            synchronized (cpx0Var) {
                this.f77833b.mo111835l(this.f77835d);
                fyr0VarMo107032a = this.f77832a.mo107032a(this.f77833b, this);
                this.f77835d = this.f77833b.zzb();
            }
            return fyr0VarMo107032a;
        } catch (EOFException unused) {
            mor.m159308a();
            return null;
        } catch (IOException unused2) {
            mor.m159308a();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final List m105856m() {
        return (this.f77833b == null || this.f77834c == f77830g) ? this.f77837f : new hpx0(this.f77837f, this);
    }

    /* JADX INFO: renamed from: n */
    public final void m105857n(cpx0 cpx0Var, long j, cyr0 cyr0Var) throws IOException {
        this.f77833b = cpx0Var;
        this.f77835d = cpx0Var.zzb();
        cpx0Var.mo111835l(cpx0Var.zzb() + j);
        this.f77836e = cpx0Var.zzb();
        this.f77832a = cyr0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f77837f.size(); i++) {
            if (i > 0) {
                sb.append(Constants.PACKNAME_END);
            }
            sb.append(((fyr0) this.f77837f.get(i)).toString());
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
