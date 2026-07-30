package p149l;

import com.google.android.gms.internal.ads.AbstractC2222p5;
import com.google.android.gms.internal.ads.C2246s5;
import com.google.android.gms.internal.ads.C2254t5;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class nax0 implements pbx0 {

    /* JADX INFO: renamed from: b */
    public static final xax0 f137985b = new lax0();

    /* JADX INFO: renamed from: a */
    public final xax0 f137986a;

    public nax0() {
        xax0 xax0Var;
        l8x0 l8x0VarM148953a = l8x0.m148953a();
        try {
            xax0Var = (xax0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            xax0Var = f137985b;
        }
        max0 max0Var = new max0(l8x0VarM148953a, xax0Var);
        Charset charset = aax0.f68607a;
        this.f137986a = max0Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m158725a(wax0 wax0Var) {
        return wax0Var.zzc() + (-1) != 1;
    }

    @Override // p149l.pbx0
    public final obx0 zza(Class cls) {
        ubx0.m192971y(cls);
        wax0 wax0VarZzb = this.f137986a.zzb(cls);
        if (wax0VarZzb.zzb()) {
            return AbstractC2222p5.class.isAssignableFrom(cls) ? C2254t5.m13328g(ubx0.m192967u(), g8x0.m124774b(), wax0VarZzb.zza()) : C2254t5.m13328g(ubx0.m192966t(), g8x0.m124773a(), wax0VarZzb.zza());
        }
        if (AbstractC2222p5.class.isAssignableFrom(cls)) {
            return m158725a(wax0VarZzb) ? C2246s5.m13262C(cls, wax0VarZzb, ebx0.m115534b(), jax0.m140720e(), ubx0.m192967u(), g8x0.m124774b(), vax0.m197660b()) : C2246s5.m13262C(cls, wax0VarZzb, ebx0.m115534b(), jax0.m140720e(), ubx0.m192967u(), null, vax0.m197660b());
        }
        return m158725a(wax0VarZzb) ? C2246s5.m13262C(cls, wax0VarZzb, ebx0.m115533a(), jax0.m140719d(), ubx0.m192966t(), g8x0.m124773a(), vax0.m197659a()) : C2246s5.m13262C(cls, wax0VarZzb, ebx0.m115533a(), jax0.m140719d(), ubx0.m192966t(), null, vax0.m197659a());
    }
}
