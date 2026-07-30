package p153l;

import com.google.android.gms.internal.ads.AbstractC2245p5;
import com.google.android.gms.internal.ads.C2269s5;
import com.google.android.gms.internal.ads.C2277t5;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class tjx0 implements vkx0 {

    /* JADX INFO: renamed from: b */
    public static final dkx0 f174627b = new rjx0();

    /* JADX INFO: renamed from: a */
    public final dkx0 f174628a;

    public tjx0() {
        dkx0 dkx0Var;
        rhx0 rhx0VarM181568a = rhx0.m181568a();
        try {
            dkx0Var = (dkx0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            dkx0Var = f174627b;
        }
        sjx0 sjx0Var = new sjx0(rhx0VarM181568a, dkx0Var);
        Charset charset = gjx0.f104688a;
        this.f174628a = sjx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m191465a(ckx0 ckx0Var) {
        return ckx0Var.zzc() + (-1) != 1;
    }

    @Override // p153l.vkx0
    public final ukx0 zza(Class cls) {
        alx0.m98766y(cls);
        ckx0 ckx0VarZzb = this.f174628a.zzb(cls);
        if (ckx0VarZzb.zzb()) {
            return AbstractC2245p5.class.isAssignableFrom(cls) ? C2277t5.m13382g(alx0.m98762u(), mhx0.m158440b(), ckx0VarZzb.zza()) : C2277t5.m13382g(alx0.m98761t(), mhx0.m158439a(), ckx0VarZzb.zza());
        }
        if (AbstractC2245p5.class.isAssignableFrom(cls)) {
            return m191465a(ckx0VarZzb) ? C2269s5.m13316C(cls, ckx0VarZzb, kkx0.m150337b(), pjx0.m172541e(), alx0.m98762u(), mhx0.m158440b(), bkx0.m104866b()) : C2269s5.m13316C(cls, ckx0VarZzb, kkx0.m150337b(), pjx0.m172541e(), alx0.m98762u(), null, bkx0.m104866b());
        }
        return m191465a(ckx0VarZzb) ? C2269s5.m13316C(cls, ckx0VarZzb, kkx0.m150336a(), pjx0.m172540d(), alx0.m98761t(), mhx0.m158439a(), bkx0.m104865a()) : C2269s5.m13316C(cls, ckx0VarZzb, kkx0.m150336a(), pjx0.m172540d(), alx0.m98761t(), null, bkx0.m104865a());
    }
}
