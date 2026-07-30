package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzwt;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ooy0 implements kry0 {

    /* JADX INFO: renamed from: a */
    public final c6r0 f144930a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public j5r0 f144931b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public k5r0 f144932c;

    public ooy0(c6r0 c6r0Var) {
        this.f144930a = c6r0Var;
    }

    @Override // p149l.kry0
    /* JADX INFO: renamed from: a */
    public final void mo147032a(long j, long j2) {
        j5r0 j5r0Var = this.f144931b;
        j5r0Var.getClass();
        j5r0Var.mo100820c(j, j2);
    }

    @Override // p149l.kry0
    /* JADX INFO: renamed from: b */
    public final int mo147033b(s6r0 s6r0Var) throws IOException {
        j5r0 j5r0Var = this.f144931b;
        j5r0Var.getClass();
        k5r0 k5r0Var = this.f144932c;
        k5r0Var.getClass();
        return j5r0Var.mo100823f(k5r0Var, s6r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    @Override // p149l.kry0
    /* JADX INFO: renamed from: c */
    public final void mo147034c(hpy0 hpy0Var, Uri uri, Map map, long j, long j2, m5r0 m5r0Var) throws IOException {
        z4r0 z4r0Var = new z4r0(hpy0Var, j, j2);
        this.f144932c = z4r0Var;
        if (this.f144931b != null) {
            return;
        }
        j5r0[] j5r0VarArrMo95449a = this.f144930a.mo95449a(uri, map);
        int i = 0;
        if (j5r0VarArrMo95449a.length == 1) {
            this.f144931b = j5r0VarArrMo95449a[0];
        } else {
            for (j5r0 j5r0Var : j5r0VarArrMo95449a) {
                try {
                    if (j5r0Var.mo100821d(z4r0Var)) {
                        this.f144931b = j5r0Var;
                        f5v0.m119535f(true);
                        z4r0Var.zzj();
                        break;
                    } else {
                        boolean z = this.f144931b != null || z4r0Var.zzf() == j;
                        f5v0.m119535f(z);
                        z4r0Var.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.f144931b != null || z4r0Var.zzf() == j) {
                    }
                } catch (Throwable th) {
                    f5v0.m119535f(this.f144931b != null || z4r0Var.zzf() == j);
                    z4r0Var.zzj();
                    throw th;
                }
                f5v0.m119535f(z);
                z4r0Var.zzj();
            }
            if (this.f144931b == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length = j5r0VarArrMo95449a.length;
                    if (i >= length) {
                        throw new zzwt("None of the available extractors (" + sb.toString() + ") could read the stream.", uri);
                    }
                    sb.append(j5r0VarArrMo95449a[i].getClass().getSimpleName());
                    if (i < length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.f144931b.mo100822e(m5r0Var);
    }

    @Override // p149l.kry0
    public final long zzb() {
        k5r0 k5r0Var = this.f144932c;
        if (k5r0Var != null) {
            return k5r0Var.zzf();
        }
        return -1L;
    }

    @Override // p149l.kry0
    public final void zzc() {
        j5r0 j5r0Var = this.f144931b;
        if (j5r0Var != null && (j5r0Var instanceof lcr0)) {
            ((lcr0) j5r0Var).m149345a();
        }
    }

    @Override // p149l.kry0
    public final void zze() {
        if (this.f144931b != null) {
            this.f144931b = null;
        }
        this.f144932c = null;
    }
}
