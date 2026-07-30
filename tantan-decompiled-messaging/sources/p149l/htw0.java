package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.zzhr;

/* JADX INFO: loaded from: classes6.dex */
public final class htw0 extends tvw0 {

    /* JADX INFO: renamed from: b */
    public int f109450b;

    /* JADX INFO: renamed from: c */
    public int f109451c;

    /* JADX INFO: renamed from: d */
    public int f109452d;

    public /* synthetic */ htw0(byte[] bArr, int i, int i2, boolean z, ouw0 ouw0Var) {
        super(null);
        this.f109452d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f109450b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m132942c(int i) throws zzhr {
        int i2 = this.f109452d;
        this.f109452d = 0;
        int i3 = this.f109450b + this.f109451c;
        this.f109450b = i3;
        if (i3 <= 0) {
            this.f109451c = 0;
            return i2;
        }
        this.f109451c = i3;
        this.f109450b = 0;
        return i2;
    }
}
