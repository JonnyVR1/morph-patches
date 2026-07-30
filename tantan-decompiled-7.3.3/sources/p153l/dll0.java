package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class dll0 {

    /* JADX INFO: renamed from: a */
    public static boolean f89547a = true;

    /* JADX INFO: renamed from: a */
    public static bll0 m116770a(@NonNull ViewGroup viewGroup) {
        return new all0(viewGroup);
    }

    @RequiresApi(18)
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public static void m116771b(@NonNull ViewGroup viewGroup, boolean z) {
        if (f89547a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f89547a = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m116772c(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m116771b(viewGroup, z);
        }
    }
}
