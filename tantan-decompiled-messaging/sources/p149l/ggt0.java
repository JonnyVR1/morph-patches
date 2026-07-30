package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class ggt0 implements gvv0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f102533a;

    /* JADX INFO: renamed from: b */
    public Context f102534b;

    /* JADX INFO: renamed from: c */
    public String f102535c;

    /* JADX INFO: renamed from: d */
    public zzq f102536d;

    public /* synthetic */ ggt0(iet0 iet0Var, fgt0 fgt0Var) {
        this.f102533a = iet0Var;
    }

    @Override // p149l.gvv0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gvv0 mo126002a(zzq zzqVar) {
        zzqVar.getClass();
        this.f102536d = zzqVar;
        return this;
    }

    @Override // p149l.gvv0
    public final /* synthetic */ gvv0 zzb(String str) {
        str.getClass();
        this.f102535c = str;
        return this;
    }

    @Override // p149l.gvv0
    public final /* synthetic */ gvv0 zzc(Context context) {
        context.getClass();
        this.f102534b = context;
        return this;
    }

    @Override // p149l.gvv0
    public final hvv0 zzd() {
        wgx0.m203090c(this.f102534b, Context.class);
        wgx0.m203090c(this.f102535c, String.class);
        wgx0.m203090c(this.f102536d, zzq.class);
        return new igt0(this.f102533a, this.f102534b, this.f102535c, this.f102536d, null);
    }
}
