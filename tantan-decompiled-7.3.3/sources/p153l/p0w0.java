package p153l;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class p0w0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f150103a;

    public p0w0(xvw0 xvw0Var) {
        this.f150103a = xvw0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 51;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f150103a.mo155969R(new Callable() { // from class: l.o0w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) jas0.m144075c().m176505a(sgs0.f168035K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) jas0.m144075c().m176505a(sgs0.f168047L)).intValue()) {
                        for (String str2 : str.split(Constants.SEPARATOR_COMMA, -1)) {
                            map.put(str2, fnt0.m126381a(str2));
                        }
                    }
                }
                return new q0w0(map);
            }
        });
    }
}
