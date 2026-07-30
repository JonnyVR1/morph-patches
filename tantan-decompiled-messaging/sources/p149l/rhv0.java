package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class rhv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f159496a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f159497b;

    public rhv0(Context context, rmw0 rmw0Var) {
        this.f159496a = context;
        this.f159497b = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 19;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f159497b.mo122102R(new Callable() { // from class: l.qhv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strM172153e;
                vny0.m199080r();
                zyr0 zyr0VarZzg = vny0.m199079q().m212279i().zzg();
                Bundle bundle = null;
                if (zyr0VarZzg != null && (!vny0.m199079q().m212279i().zzN() || !vny0.m199079q().m212279i().zzO())) {
                    if (zyr0VarZzg.m220944h()) {
                        zyr0VarZzg.m220943g();
                    }
                    pyr0 pyr0VarM220937a = zyr0VarZzg.m220937a();
                    if (pyr0VarM220937a != null) {
                        strZzj = pyr0VarM220937a.m172152d();
                        strM172153e = pyr0VarM220937a.m172153e();
                        strZzk = pyr0VarM220937a.m172154f();
                        if (strZzj != null) {
                            vny0.m199079q().m212279i().mo96960s(strZzj);
                        }
                        if (strZzk != null) {
                            vny0.m199079q().m212279i().mo96964w(strZzk);
                        }
                    } else {
                        strZzj = vny0.m199079q().m212279i().zzj();
                        strZzk = vny0.m199079q().m212279i().zzk();
                        strM172153e = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!vny0.m199079q().m212279i().zzO()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !vny0.m199079q().m212279i().zzN()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strM172153e)) {
                            bundle2.putString("v_fp", strM172153e);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new shv0(bundle);
            }
        });
    }
}
