package p149l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class pbu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f148112a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f148113b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f148114c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f148115d;

    public pbu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f148112a = ehx0Var;
        this.f148113b = ehx0Var2;
        this.f148114c = ehx0Var3;
        this.f148115d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        pxr0 pxr0Var = (pxr0) this.f148112a.zzb();
        Executor executor = (Executor) this.f148113b.zzb();
        Context context = (Context) this.f148114c.zzb();
        return new lmt0(executor, new qlt0(context, pxr0Var), (Clock) this.f148115d.zzb());
    }
}
