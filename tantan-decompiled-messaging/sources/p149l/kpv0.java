package p149l;

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
public final class kpv0 {
    /* JADX INFO: renamed from: a */
    public static String m146887a(@Nullable String str) {
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
    public static String m146888b(zzl zzlVar) {
        Bundle bundle;
        return (zzlVar == null || (bundle = zzlVar.zzc) == null) ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    /* JADX INFO: renamed from: c */
    public static void m146889c(final wnu0 wnu0Var, @Nullable final mnu0 mnu0Var, final String str, final Pair... pairArr) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132164a7)).booleanValue()) {
            i3t0.f111372a.execute(new Runnable() { // from class: l.ysu0
                @Override // java.lang.Runnable
                public final void run() {
                    kpv0.m146890d(wnu0Var, mnu0Var, str, pairArr);
                }
            });
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static void m146890d(wnu0 wnu0Var, @Nullable mnu0 mnu0Var, String str, Pair... pairArr) {
        Map mapM219490c = mnu0Var == null ? wnu0Var.m219490c() : mnu0Var.m155566a();
        m146892f(mapM219490c, "action", str);
        for (Pair pair : pairArr) {
            m146892f(mapM219490c, (String) pair.first, (String) pair.second);
        }
        wnu0Var.m219493f(mapM219490c);
    }

    /* JADX INFO: renamed from: e */
    public static int m146891e(iyv0 iyv0Var) {
        if (iyv0Var.f115507q) {
            return 2;
        }
        zzl zzlVar = iyv0Var.f115494d;
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
    public static void m146892f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
