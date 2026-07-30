package p153l;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcef;

/* JADX INFO: loaded from: classes6.dex */
public final class gct0 {
    /* JADX INFO: renamed from: a */
    public static Context m129903a(Context context) throws zzcef {
        return m129905c(context).m12538b();
    }

    /* JADX INFO: renamed from: b */
    public static Object m129904b(Context context, String str, fct0 fct0Var) throws zzcef {
        try {
            return fct0Var.zza(m129905c(context).m12539d(str));
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static DynamiteModule m129905c(Context context) throws zzcef {
        try {
            return DynamiteModule.m12530e(context, DynamiteModule.f9840b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzcef(e);
        }
    }
}
