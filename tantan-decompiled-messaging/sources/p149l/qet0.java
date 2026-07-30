package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class qet0 implements mrv0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f154058a;

    /* JADX INFO: renamed from: b */
    public Context f154059b;

    /* JADX INFO: renamed from: c */
    public String f154060c;

    public /* synthetic */ qet0(iet0 iet0Var, pet0 pet0Var) {
        this.f154058a = iet0Var;
    }

    @Override // p149l.mrv0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mrv0 mo156087a(Context context) {
        context.getClass();
        this.f154059b = context;
        return this;
    }

    @Override // p149l.mrv0
    public final /* synthetic */ mrv0 zza(String str) {
        str.getClass();
        this.f154060c = str;
        return this;
    }

    @Override // p149l.mrv0
    public final nrv0 zzc() {
        wgx0.m203090c(this.f154059b, Context.class);
        wgx0.m203090c(this.f154060c, String.class);
        return new set0(this.f154058a, this.f154059b, this.f154060c, null);
    }
}
