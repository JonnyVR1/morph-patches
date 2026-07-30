package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class sby0 implements t8s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v8s0 f163686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f163687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f163688c;

    public sby0(C2075b c2075b, v8s0 v8s0Var, Context context, Uri uri) {
        this.f163686a = v8s0Var;
        this.f163687b = context;
        this.f163688c = uri;
    }

    @Override // p149l.t8s0
    public final void zza() {
        hyb hybVarM133505a = new hyb.C17431a(this.f163686a.m197515a()).m133505a();
        hybVarM133505a.f110043a.setPackage(fhx0.m121470a(this.f163687b));
        hybVarM133505a.m133504a(this.f163687b, this.f163688c);
        this.f163686a.m197520f((Activity) this.f163687b);
    }
}
