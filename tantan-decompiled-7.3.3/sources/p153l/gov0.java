package p153l;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfho;
import com.meituan.robust.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class gov0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f105394a;

    /* JADX INFO: renamed from: b */
    public final huu0 f105395b;

    /* JADX INFO: renamed from: c */
    public final lzu0 f105396c;

    /* JADX INFO: renamed from: d */
    public final iov0 f105397d;

    public gov0(xvw0 xvw0Var, huu0 huu0Var, lzu0 lzu0Var, iov0 iov0Var) {
        this.f105394a = xvw0Var;
        this.f105395b = huu0Var;
        this.f105396c = lzu0Var;
        this.f105397d = iov0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hov0 m131190a() throws Exception {
        List<String> listAsList = Arrays.asList(((String) jas0.m144075c().m176505a(sgs0.f168450r1)).split(Constants.PACKNAME_END));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                r8w0 r8w0VarM137255c = this.f105395b.m137255c(str, new JSONObject());
                r8w0VarM137255c.m180257c();
                boolean zM156496t = this.f105396c.m156496t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168265cb)).booleanValue() || zM156496t) {
                    try {
                        zzbvg zzbvgVarM180265k = r8w0VarM137255c.m180265k();
                        if (zzbvgVarM180265k != null) {
                            bundle2.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, zzbvgVarM180265k.toString());
                        }
                    } catch (zzfho unused) {
                    }
                }
                try {
                    zzbvg zzbvgVarM180264j = r8w0VarM137255c.m180264j();
                    if (zzbvgVarM180264j != null) {
                        bundle2.putString("adapter_version", zzbvgVarM180264j.toString());
                    }
                } catch (zzfho unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfho unused3) {
            }
        }
        hov0 hov0Var = new hov0(bundle);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168265cb)).booleanValue()) {
            this.f105397d.m141354b(hov0Var);
        }
        return hov0Var;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 1;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        dgs0 dgs0Var = sgs0.f168265cb;
        if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && this.f105397d.m141353a() != null) {
            hov0 hov0VarM141353a = this.f105397d.m141353a();
            hov0VarM141353a.getClass();
            return pvw0.m173981h(hov0VarM141353a);
        }
        if (epw0.m121875d((String) jas0.m144075c().m176505a(sgs0.f168450r1)) || (!((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && (this.f105397d.m141356d() || !this.f105396c.m156496t()))) {
            return pvw0.m173981h(new hov0(new Bundle()));
        }
        this.f105397d.m141355c(true);
        return this.f105394a.mo155969R(new Callable() { // from class: l.fov0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f100094a.m131190a();
            }
        });
    }
}
