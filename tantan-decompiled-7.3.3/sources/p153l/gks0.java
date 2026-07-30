package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.internal.ads.zzaqj;

/* JADX INFO: loaded from: classes6.dex */
public final class gks0 implements nwr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f104766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mps0 f104767b;

    public gks0(bts0 bts0Var, String str, mps0 mps0Var) {
        this.f104766a = str;
        this.f104767b = mps0Var;
    }

    @Override // p153l.nwr0
    /* JADX INFO: renamed from: a */
    public final void mo130599a(zzaqj zzaqjVar) {
        dct0.m115298g("Failed to load URL: " + this.f104766a + SignParameters.NEW_LINE + zzaqjVar.toString());
        this.f104767b.zza(null);
    }
}
