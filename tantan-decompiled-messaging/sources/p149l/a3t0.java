package p149l;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class a3t0 {
    /* JADX INFO: renamed from: a */
    public static Context m94732a(Context context) throws zzcef {
        return m94734c(context).m12484b();
    }

    /* JADX INFO: renamed from: b */
    public static Object m94733b(Context context, String str, z2t0 z2t0Var) throws zzcef {
        try {
            return z2t0Var.zza(m94734c(context).m12485d(str));
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static DynamiteModule m94734c(Context context) throws zzcef {
        try {
            return DynamiteModule.m12476e(context, DynamiteModule.f9803b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }
}
