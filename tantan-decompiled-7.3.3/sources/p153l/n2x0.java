package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.zzhr;

/* JADX INFO: loaded from: classes6.dex */
public final class n2x0 extends z4x0 {

    /* JADX INFO: renamed from: b */
    public int f139896b;

    /* JADX INFO: renamed from: c */
    public int f139897c;

    /* JADX INFO: renamed from: d */
    public int f139898d;

    public /* synthetic */ n2x0(byte[] bArr, int i, int i2, boolean z, u3x0 u3x0Var) {
        super(null);
        this.f139898d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f139896b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m161258c(int i) throws zzhr {
        int i2 = this.f139898d;
        this.f139898d = 0;
        int i3 = this.f139896b + this.f139897c;
        this.f139896b = i3;
        if (i3 <= 0) {
            this.f139897c = 0;
            return i2;
        }
        this.f139897c = i3;
        this.f139896b = 0;
        return i2;
    }
}
