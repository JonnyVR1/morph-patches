package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.firebase.ktx.BuildConfig;
import com.tencent.connect.common.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qyv0 {
    /* JADX INFO: renamed from: a */
    public static String m178750a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? Constants.VIA_SHARE_TYPE_INFO : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? Constants.VIA_SHARE_TYPE_PUBLISHVIDEO : str;
            default:
                return str;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m178751b(zzl zzlVar) {
        Bundle bundle;
        return (zzlVar == null || (bundle = zzlVar.zzc) == null) ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    /* JADX INFO: renamed from: c */
    public static void m178752c(final cxu0 cxu0Var, @Nullable final swu0 swu0Var, final String str, final Pair... pairArr) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168235a7)).booleanValue()) {
            oct0.f146733a.execute(new Runnable() { // from class: l.e2v0
                @Override // java.lang.Runnable
                public final void run() {
                    qyv0.m178753d(cxu0Var, swu0Var, str, pairArr);
                }
            });
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m178753d(cxu0 cxu0Var, @Nullable swu0 swu0Var, String str, Pair... pairArr) {
        Map mapM128025c = swu0Var == null ? cxu0Var.m128025c() : swu0Var.m188363a();
        m178755f(mapM128025c, "action", str);
        for (Pair pair : pairArr) {
            m178755f(mapM128025c, (String) pair.first, (String) pair.second);
        }
        cxu0Var.m128028f(mapM128025c);
    }

    /* JADX INFO: renamed from: e */
    public static int m178754e(o7w0 o7w0Var) {
        if (o7w0Var.f145331q) {
            return 2;
        }
        zzl zzlVar = o7w0Var.f145318d;
        zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzlVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    /* JADX INFO: renamed from: f */
    public static void m178755f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
