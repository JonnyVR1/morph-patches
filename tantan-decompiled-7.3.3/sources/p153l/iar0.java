package p153l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2098b;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class iar0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m139204a(Context context, Intent intent, rar0 rar0Var, @Nullable v4z0 v4z0Var, boolean z) {
        if (z) {
            return m139206c(context, intent.getData(), rar0Var, v4z0Var);
        }
        try {
            d2v0.m113737k("Launching an intent: " + intent.toURI());
            bxy0.m106934r();
            C2098b.m12380s(context, intent);
            if (rar0Var != null) {
                rar0Var.zzg();
            }
            if (v4z0Var != null) {
                v4z0Var.mo146633a(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            dct0.m115298g(e.getMessage());
            if (v4z0Var != null) {
                v4z0Var.mo146633a(false);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m139205b(Context context, @Nullable zzc zzcVar, rar0 rar0Var, @Nullable v4z0 v4z0Var) {
        int i = 0;
        if (zzcVar == null) {
            dct0.m115298g("No intent data for launcher overlay.");
            return false;
        }
        sgs0.m185829a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return m139204a(context, intent, rar0Var, v4z0Var, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            dct0.m115298g("Open GMSG did not contain a URL.");
            return false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(zzcVar.zzc);
        String str = zzcVar.zzb;
        if (zIsEmpty) {
            intent2.setData(Uri.parse(str));
        } else {
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                dct0.m115298g("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                dct0.m115298g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168502v4)).booleanValue()) {
            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168490u4)).booleanValue()) {
                bxy0.m106934r();
                C2098b.m12350Q(context, intent2);
            }
        }
        return m139204a(context, intent2, rar0Var, v4z0Var, zzcVar.zzj);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m139206c(Context context, Uri uri, rar0 rar0Var, v4z0 v4z0Var) {
        int iM12397O;
        try {
            iM12397O = bxy0.m106934r().m12397O(context, uri);
            if (rar0Var != null) {
                rar0Var.zzg();
            }
        } catch (ActivityNotFoundException e) {
            dct0.m115298g(e.getMessage());
            iM12397O = 6;
        }
        if (v4z0Var != null) {
            v4z0Var.mo146634e(iM12397O);
        }
        return iM12397O == 5;
    }
}
