package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class xqv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f195845a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f195846b;

    public xqv0(Context context, xvw0 xvw0Var) {
        this.f195845a = context;
        this.f195846b = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 19;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f195846b.mo155969R(new Callable() { // from class: l.wqv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strM200261e;
                bxy0.m106934r();
                f8s0 f8s0VarZzg = bxy0.m106933q().m120264i().zzg();
                Bundle bundle = null;
                if (f8s0VarZzg != null && (!bxy0.m106933q().m120264i().zzN() || !bxy0.m106933q().m120264i().zzO())) {
                    if (f8s0VarZzg.m124561h()) {
                        f8s0VarZzg.m124560g();
                    }
                    v7s0 v7s0VarM124554a = f8s0VarZzg.m124554a();
                    if (v7s0VarM124554a != null) {
                        strZzj = v7s0VarM124554a.m200260d();
                        strM200261e = v7s0VarM124554a.m200261e();
                        strZzk = v7s0VarM124554a.m200262f();
                        if (strZzj != null) {
                            bxy0.m106933q().m120264i().mo131909s(strZzj);
                        }
                        if (strZzk != null) {
                            bxy0.m106933q().m120264i().mo131913w(strZzk);
                        }
                    } else {
                        strZzj = bxy0.m106933q().m120264i().zzj();
                        strZzk = bxy0.m106933q().m120264i().zzk();
                        strM200261e = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!bxy0.m106933q().m120264i().zzO()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !bxy0.m106933q().m120264i().zzN()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strM200261e)) {
                            bundle2.putString("v_fp", strM200261e);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new yqv0(bundle);
            }
        });
    }
}
