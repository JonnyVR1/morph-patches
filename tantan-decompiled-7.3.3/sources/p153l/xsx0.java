package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xsx0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final fex0 f196143a;

    /* JADX INFO: renamed from: b */
    public long f196144b;

    /* JADX INFO: renamed from: c */
    public Uri f196145c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    public Map f196146d = Collections.EMPTY_MAP;

    public xsx0(fex0 fex0Var) {
        this.f196143a = fex0Var;
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        int iMo12781a = this.f196143a.mo12781a(bArr, i, i2);
        if (iMo12781a != -1) {
            this.f196144b += (long) iMo12781a;
        }
        return iMo12781a;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        this.f196145c = akx0Var.f72047a;
        this.f196146d = Collections.EMPTY_MAP;
        long jMo12782e = this.f196143a.mo12782e(akx0Var);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.f196145c = uriZzc;
        this.f196146d = zze();
        return jMo12782e;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
        btx0Var.getClass();
        this.f196143a.mo101236f(btx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final long m212997j() {
        return this.f196144b;
    }

    /* JADX INFO: renamed from: k */
    public final Uri m212998k() {
        return this.f196145c;
    }

    /* JADX INFO: renamed from: l */
    public final Map m212999l() {
        return this.f196146d;
    }

    @Override // p153l.fex0
    @Nullable
    public final Uri zzc() {
        return this.f196143a.zzc();
    }

    @Override // p153l.fex0
    public final void zzd() throws IOException {
        this.f196143a.zzd();
    }

    @Override // p153l.fex0, p153l.jsx0
    public final Map zze() {
        return this.f196143a.zze();
    }
}
