package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapi;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bts0 {

    /* JADX INFO: renamed from: a */
    public static mwr0 f78395a;

    /* JADX INFO: renamed from: b */
    public static final Object f78396b = new Object();

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final wms0 f78397c = new yis0();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public bts0(Context context) {
        mwr0 mwr0VarM222072a;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f78396b) {
            try {
                if (f78395a == null) {
                    sgs0.m185829a(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        mwr0VarM222072a = zxr0.m222072a(context, null);
                    } else {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168453r4)).booleanValue()) {
                            mwr0VarM222072a = h7s0.m133835b(context);
                        } else {
                            mwr0VarM222072a = zxr0.m222072a(context, null);
                        }
                    }
                    f78395a = mwr0VarM222072a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final hpr m106382a(String str) {
        tct0 tct0Var = new tct0();
        f78395a.m160591a(new srs0(str, null, tct0Var));
        return tct0Var;
    }

    /* JADX INFO: renamed from: b */
    public final hpr m106383b(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        mps0 mps0Var = new mps0(null);
        gks0 gks0Var = new gks0(this, str, mps0Var);
        cct0 cct0Var = new cct0(null);
        mls0 mls0Var = new mls0(this, i, str, mps0Var, gks0Var, bArr, map, cct0Var);
        if (cct0.m109067k()) {
            try {
                cct0Var.m109072d(str, "GET", mls0Var.mo147203p(), mls0Var.mo147192B());
            } catch (zzapi e) {
                dct0.m115298g(e.getMessage());
            }
        }
        f78395a.m160591a(mls0Var);
        return mps0Var;
    }
}
