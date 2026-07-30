package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class zkx0 implements kdx0 {

    /* JADX INFO: renamed from: a */
    public final Context f204862a;

    /* JADX INFO: renamed from: b */
    public final kdx0 f204863b;

    public zkx0(Context context) {
        zmx0 zmx0Var = new zmx0();
        this.f204862a = context.getApplicationContext();
        this.f204863b = zmx0Var;
    }

    @Override // p153l.kdx0
    public final /* bridge */ /* synthetic */ fex0 zza() {
        return new cmx0(this.f204862a, ((zmx0) this.f204863b).zza());
    }
}
