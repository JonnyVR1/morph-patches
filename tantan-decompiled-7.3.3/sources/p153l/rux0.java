package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2403d0;
import com.google.android.gms.internal.play_billing.C2411h0;
import com.google.android.gms.internal.play_billing.C2413i0;
import com.google.android.gms.internal.play_billing.C2415j0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class rux0 implements zxx0 {

    /* JADX INFO: renamed from: b */
    public static final pvx0 f164948b = new hux0();

    /* JADX INFO: renamed from: a */
    public final pvx0 f164949a;

    public rux0() {
        snx0 snx0VarM187028a = snx0.m187028a();
        gxx0 gxx0Var = gxx0.f107009c;
        mux0 mux0Var = new mux0(snx0VarM187028a, f164948b);
        Charset charset = srx0.f170385a;
        this.f164949a = mux0Var;
    }

    @Override // p153l.zxx0
    public final uxx0 zza(Class cls) {
        k0y0 k0y0Var = C2415j0.f10388a;
        if (!AbstractC2403d0.class.isAssignableFrom(cls)) {
            gxx0 gxx0Var = gxx0.f107009c;
        }
        lvx0 lvx0VarZzb = this.f164949a.zzb(cls);
        if (lvx0VarZzb.zzb()) {
            gxx0 gxx0Var2 = gxx0.f107009c;
            return C2413i0.m14884f(C2415j0.m14907r(), chx0.m109849a(), lvx0VarZzb.zza());
        }
        gxx0 gxx0Var3 = gxx0.f107009c;
        return C2411h0.m14856w(cls, lvx0VarZzb, xwx0.m213453a(), ztx0.m221577a(), C2415j0.m14907r(), lvx0VarZzb.zzc() + (-1) != 1 ? chx0.m109849a() : null, hvx0.m137411a());
    }
}
