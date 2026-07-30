package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzwt;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class uxy0 implements q0z0 {

    /* JADX INFO: renamed from: a */
    public final ifr0 f181520a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public per0 f181521b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public qer0 f181522c;

    public uxy0(ifr0 ifr0Var) {
        this.f181520a = ifr0Var;
    }

    @Override // p153l.q0z0
    /* JADX INFO: renamed from: a */
    public final void mo174797a(long j, long j2) {
        per0 per0Var = this.f181521b;
        per0Var.getClass();
        per0Var.mo97906c(j, j2);
    }

    @Override // p153l.q0z0
    /* JADX INFO: renamed from: b */
    public final int mo174798b(yfr0 yfr0Var) throws IOException {
        per0 per0Var = this.f181521b;
        per0Var.getClass();
        qer0 qer0Var = this.f181522c;
        qer0Var.getClass();
        return per0Var.mo97909f(qer0Var, yfr0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    @Override // p153l.q0z0
    /* JADX INFO: renamed from: c */
    public final void mo174799c(nyy0 nyy0Var, Uri uri, Map map, long j, long j2, ser0 ser0Var) throws IOException {
        fer0 fer0Var = new fer0(nyy0Var, j, j2);
        this.f181522c = fer0Var;
        if (this.f181521b != null) {
            return;
        }
        per0[] per0VarArrMo99028a = this.f181520a.mo99028a(uri, map);
        int i = 0;
        if (per0VarArrMo99028a.length == 1) {
            this.f181521b = per0VarArrMo99028a[0];
        } else {
            for (per0 per0Var : per0VarArrMo99028a) {
                try {
                    if (per0Var.mo97907d(fer0Var)) {
                        this.f181521b = per0Var;
                        lev0.m153958f(true);
                        fer0Var.zzj();
                        break;
                    } else {
                        boolean z = this.f181521b != null || fer0Var.zzf() == j;
                        lev0.m153958f(z);
                        fer0Var.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.f181521b != null || fer0Var.zzf() == j) {
                    }
                } catch (Throwable th) {
                    lev0.m153958f(this.f181521b != null || fer0Var.zzf() == j);
                    fer0Var.zzj();
                    throw th;
                }
                lev0.m153958f(z);
                fer0Var.zzj();
            }
            if (this.f181521b == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length = per0VarArrMo99028a.length;
                    if (i >= length) {
                        throw new zzwt("None of the available extractors (" + sb.toString() + ") could read the stream.", uri);
                    }
                    sb.append(per0VarArrMo99028a[i].getClass().getSimpleName());
                    if (i < length - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.f181521b.mo97908e(ser0Var);
    }

    @Override // p153l.q0z0
    public final long zzb() {
        qer0 qer0Var = this.f181522c;
        if (qer0Var != null) {
            return qer0Var.zzf();
        }
        return -1L;
    }

    @Override // p153l.q0z0
    public final void zzc() {
        per0 per0Var = this.f181521b;
        if (per0Var != null && (per0Var instanceof rlr0)) {
            ((rlr0) per0Var).m182025a();
        }
    }

    @Override // p153l.q0z0
    public final void zze() {
        if (this.f181521b != null) {
            this.f181521b = null;
        }
        this.f181522c = null;
    }
}
