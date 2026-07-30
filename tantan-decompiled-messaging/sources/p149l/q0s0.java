package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbyk;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class q0s0 {

    /* JADX INFO: renamed from: a */
    public final Context f152078a;

    /* JADX INFO: renamed from: b */
    public boolean f152079b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final qzs0 f152080c;

    /* JADX INFO: renamed from: d */
    public final zzbyk f152081d = new zzbyk(false, Collections.EMPTY_LIST);

    public q0s0(Context context, @Nullable qzs0 qzs0Var, @Nullable zzbyk zzbykVar) {
        this.f152078a = context;
        this.f152080c = qzs0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m172356a() {
        this.f152079b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m172357b(@Nullable String str) {
        List<String> list;
        if (m172359d()) {
            if (str == null) {
                str = "";
            }
            qzs0 qzs0Var = this.f152080c;
            if (qzs0Var != null) {
                qzs0Var.mo157166b(str, null, 3);
                return;
            }
            zzbyk zzbykVar = this.f152081d;
            if (!zzbykVar.zza || (list = zzbykVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f152078a;
                    vny0.m199080r();
                    C2075b.m12318k(context, "", strReplace);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m172358c() {
        return !m172359d() || this.f152079b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m172359d() {
        qzs0 qzs0Var = this.f152080c;
        return (qzs0Var != null && qzs0Var.zza().zzf) || this.f152081d.zza;
    }
}
