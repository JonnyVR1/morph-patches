package p153l;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
public class rc60 {

    /* JADX INFO: renamed from: a */
    public static final String f162070a = qzv.m178831i("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static int m180779a(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m180780b(int i, boolean z) {
        if (i == 0) {
            return z;
        }
        return i == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m180781c(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            if (z == m180780b(m180779a(context, cls.getName()), false)) {
                qzv.m178829e().mo178832a(f162070a, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            qzv qzvVarM178829e = qzv.m178829e();
            String str = f162070a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(z ? "enabled" : "disabled");
            qzvVarM178829e.mo178832a(str, sb.toString());
        } catch (Exception e) {
            qzv qzvVarM178829e2 = qzv.m178829e();
            String str2 = f162070a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            qzvVarM178829e2.mo178833b(str2, sb2.toString(), e);
        }
    }
}
