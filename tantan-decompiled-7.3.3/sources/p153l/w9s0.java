package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzbyk;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w9s0 {

    /* JADX INFO: renamed from: a */
    public final Context f188058a;

    /* JADX INFO: renamed from: b */
    public boolean f188059b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final w8t0 f188060c;

    /* JADX INFO: renamed from: d */
    public final zzbyk f188061d = new zzbyk(false, Collections.EMPTY_LIST);

    public w9s0(Context context, @Nullable w8t0 w8t0Var, @Nullable zzbyk zzbykVar) {
        this.f188058a = context;
        this.f188060c = w8t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m205625a() {
        this.f188059b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m205626b(@Nullable String str) {
        List<String> list;
        if (m205628d()) {
            if (str == null) {
                str = "";
            }
            w8t0 w8t0Var = this.f188060c;
            if (w8t0Var != null) {
                w8t0Var.mo185108b(str, null, 3);
                return;
            }
            zzbyk zzbykVar = this.f188061d;
            if (!zzbykVar.zza || (list = zzbykVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f188058a;
                    bxy0.m106934r();
                    C2098b.m12372k(context, "", strReplace);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m205627c() {
        return !m205628d() || this.f188059b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m205628d() {
        w8t0 w8t0Var = this.f188060c;
        return (w8t0Var != null && w8t0Var.zza().zzf) || this.f188061d.zza;
    }
}
