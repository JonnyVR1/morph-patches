package p149l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class c1r0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m104873a(Context context, Intent intent, l1r0 l1r0Var, @Nullable pvy0 pvy0Var, boolean z) {
        if (z) {
            return m104875c(context, intent.getData(), l1r0Var, pvy0Var);
        }
        try {
            xsu0.m210834k("Launching an intent: " + intent.toURI());
            vny0.m199080r();
            C2075b.m12326s(context, intent);
            if (l1r0Var != null) {
                l1r0Var.zzg();
            }
            if (pvy0Var != null) {
                pvy0Var.mo111829a(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            x2t0.m206869g(e.getMessage());
            if (pvy0Var != null) {
                pvy0Var.mo111829a(false);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m104874b(Context context, @Nullable zzc zzcVar, l1r0 l1r0Var, @Nullable pvy0 pvy0Var) {
        int i = 0;
        if (zzcVar == null) {
            x2t0.m206869g("No intent data for launcher overlay.");
            return false;
        }
        m7s0.m153417a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return m104873a(context, intent, l1r0Var, pvy0Var, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            x2t0.m206869g("Open GMSG did not contain a URL.");
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
                x2t0.m206869g("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                x2t0.m206869g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132431v4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132419u4)).booleanValue()) {
                vny0.m199080r();
                C2075b.m12296Q(context, intent2);
            }
        }
        return m104873a(context, intent2, l1r0Var, pvy0Var, zzcVar.zzj);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m104875c(Context context, Uri uri, l1r0 l1r0Var, pvy0 pvy0Var) {
        int iM12343O;
        try {
            iM12343O = vny0.m199080r().m12343O(context, uri);
            if (l1r0Var != null) {
                l1r0Var.zzg();
            }
        } catch (ActivityNotFoundException e) {
            x2t0.m206869g(e.getMessage());
            iM12343O = 6;
        }
        if (pvy0Var != null) {
            pvy0Var.mo111830e(iM12343O);
        }
        return iM12343O == 5;
    }
}
