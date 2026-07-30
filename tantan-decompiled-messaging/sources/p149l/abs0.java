package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.internal.ads.zzaqj;

/* JADX INFO: loaded from: classes6.dex */
public final class abs0 implements hnr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f68745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ggs0 f68746b;

    public abs0(vjs0 vjs0Var, String str, ggs0 ggs0Var) {
        this.f68745a = str;
        this.f68746b = ggs0Var;
    }

    @Override // p149l.hnr0
    /* JADX INFO: renamed from: a */
    public final void mo95697a(zzaqj zzaqjVar) {
        x2t0.m206869g("Failed to load URL: " + this.f68745a + SignParameters.NEW_LINE + zzaqjVar.toString());
        this.f68746b.zza(null);
    }
}
