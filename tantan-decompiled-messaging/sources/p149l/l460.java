package p149l;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
public class l460 {

    /* JADX INFO: renamed from: a */
    public static final String f125971a = txv.m190978i("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static int m148425a(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m148426b(int i, boolean z) {
        if (i == 0) {
            return z;
        }
        return i == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m148427c(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            if (z == m148426b(m148425a(context, cls.getName()), false)) {
                txv.m190976e().mo190979a(f125971a, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            txv txvVarM190976e = txv.m190976e();
            String str = f125971a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(z ? "enabled" : "disabled");
            txvVarM190976e.mo190979a(str, sb.toString());
        } catch (Exception e) {
            txv txvVarM190976e2 = txv.m190976e();
            String str2 = f125971a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            txvVarM190976e2.mo190980b(str2, sb2.toString(), e);
        }
    }
}
