package p149l;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class jrv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f119450a;

    public jrv0(rmw0 rmw0Var) {
        this.f119450a = rmw0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 51;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f119450a.mo122102R(new Callable() { // from class: l.irv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) d1s0.m109677c().m144697a(m7s0.f131964K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) d1s0.m109677c().m144697a(m7s0.f131976L)).intValue()) {
                        for (String str2 : str.split(Constants.SEPARATOR_COMMA, -1)) {
                            map.put(str2, zdt0.m218204a(str2));
                        }
                    }
                }
                return new krv0(map);
            }
        });
    }
}
