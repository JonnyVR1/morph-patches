package p153l;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class dwv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Executor f91046a;

    /* JADX INFO: renamed from: b */
    public final String f91047b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PackageInfo f91048c;

    /* JADX INFO: renamed from: d */
    public final vat0 f91049d;

    public dwv0(vat0 vat0Var, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.f91049d = vat0Var;
        this.f91046a = executor;
        this.f91047b = str;
        this.f91048c = packageInfo;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m118422a(Throwable th) throws Exception {
        return pvw0.m173981h(new ewv0(this.f91047b));
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 41;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return pvw0.m173979f(pvw0.m173986m(pvw0.m173981h(this.f91047b), new eow0() { // from class: l.bwv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                return new ewv0((String) obj);
            }
        }, this.f91046a), Throwable.class, new xuw0() { // from class: l.cwv0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f84151a.m118422a((Throwable) obj);
            }
        }, this.f91046a);
    }
}
