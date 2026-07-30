package p149l;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfho;
import com.meituan.robust.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class afv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f69225a;

    /* JADX INFO: renamed from: b */
    public final blu0 f69226b;

    /* JADX INFO: renamed from: c */
    public final fqu0 f69227c;

    /* JADX INFO: renamed from: d */
    public final cfv0 f69228d;

    public afv0(rmw0 rmw0Var, blu0 blu0Var, fqu0 fqu0Var, cfv0 cfv0Var) {
        this.f69225a = rmw0Var;
        this.f69226b = blu0Var;
        this.f69227c = fqu0Var;
        this.f69228d = cfv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bfv0 m96273a() throws Exception {
        List<String> listAsList = Arrays.asList(((String) d1s0.m109677c().m144697a(m7s0.f132379r1)).split(Constants.PACKNAME_END));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                lzv0 lzv0VarM102563c = this.f69226b.m102563c(str, new JSONObject());
                lzv0VarM102563c.m152373c();
                boolean zM122765t = this.f69227c.m122765t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132194cb)).booleanValue() || zM122765t) {
                    try {
                        zzbvg zzbvgVarM152381k = lzv0VarM102563c.m152381k();
                        if (zzbvgVarM152381k != null) {
                            bundle2.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, zzbvgVarM152381k.toString());
                        }
                    } catch (zzfho unused) {
                    }
                }
                try {
                    zzbvg zzbvgVarM152380j = lzv0VarM102563c.m152380j();
                    if (zzbvgVarM152380j != null) {
                        bundle2.putString("adapter_version", zzbvgVarM152380j.toString());
                    }
                } catch (zzfho unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfho unused3) {
            }
        }
        bfv0 bfv0Var = new bfv0(bundle);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132194cb)).booleanValue()) {
            this.f69228d.m106605b(bfv0Var);
        }
        return bfv0Var;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 1;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        x6s0 x6s0Var = m7s0.f132194cb;
        if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && this.f69228d.m106604a() != null) {
            bfv0 bfv0VarM106604a = this.f69228d.m106604a();
            bfv0VarM106604a.getClass();
            return jmw0.m142235h(bfv0VarM106604a);
        }
        if (yfw0.m214596d((String) d1s0.m109677c().m144697a(m7s0.f132379r1)) || (!((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && (this.f69228d.m106607d() || !this.f69227c.m122765t()))) {
            return jmw0.m142235h(new bfv0(new Bundle()));
        }
        this.f69228d.m106606c(true);
        return this.f69225a.mo122102R(new Callable() { // from class: l.zev0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f202863a.m96273a();
            }
        });
    }
}
