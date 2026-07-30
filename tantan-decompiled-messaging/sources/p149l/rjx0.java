package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rjx0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final z4x0 f159755a;

    /* JADX INFO: renamed from: b */
    public long f159756b;

    /* JADX INFO: renamed from: c */
    public Uri f159757c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    public Map f159758d = Collections.EMPTY_MAP;

    public rjx0(z4x0 z4x0Var) {
        this.f159755a = z4x0Var;
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        int iMo12727a = this.f159755a.mo12727a(bArr, i, i2);
        if (iMo12727a != -1) {
            this.f159756b += (long) iMo12727a;
        }
        return iMo12727a;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        this.f159757c = uax0Var.f175648a;
        this.f159758d = Collections.EMPTY_MAP;
        long jMo12728e = this.f159755a.mo12728e(uax0Var);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.f159757c = uriZzc;
        this.f159758d = zze();
        return jMo12728e;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
        vjx0Var.getClass();
        this.f159755a.mo128921f(vjx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final long m179665j() {
        return this.f159756b;
    }

    /* JADX INFO: renamed from: k */
    public final Uri m179666k() {
        return this.f159757c;
    }

    /* JADX INFO: renamed from: l */
    public final Map m179667l() {
        return this.f159758d;
    }

    @Override // p149l.z4x0
    @Nullable
    public final Uri zzc() {
        return this.f159755a.zzc();
    }

    @Override // p149l.z4x0
    public final void zzd() throws IOException {
        this.f159755a.zzd();
    }

    @Override // p149l.z4x0, p149l.djx0
    public final Map zze() {
        return this.f159755a.zze();
    }
}
