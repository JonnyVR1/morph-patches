package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class aft0 implements jtv0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f69217a;

    /* JADX INFO: renamed from: b */
    public Context f69218b;

    /* JADX INFO: renamed from: c */
    public String f69219c;

    /* JADX INFO: renamed from: d */
    public zzq f69220d;

    public /* synthetic */ aft0(iet0 iet0Var, zet0 zet0Var) {
        this.f69217a = iet0Var;
    }

    @Override // p149l.jtv0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jtv0 mo96272a(zzq zzqVar) {
        zzqVar.getClass();
        this.f69220d = zzqVar;
        return this;
    }

    @Override // p149l.jtv0
    public final /* synthetic */ jtv0 zzb(String str) {
        str.getClass();
        this.f69219c = str;
        return this;
    }

    @Override // p149l.jtv0
    public final /* synthetic */ jtv0 zzc(Context context) {
        context.getClass();
        this.f69218b = context;
        return this;
    }

    @Override // p149l.jtv0
    public final ktv0 zzd() {
        wgx0.m203090c(this.f69218b, Context.class);
        wgx0.m203090c(this.f69219c, String.class);
        wgx0.m203090c(this.f69220d, zzq.class);
        return new cft0(this.f69217a, this.f69218b, this.f69219c, this.f69220d, null);
    }
}
