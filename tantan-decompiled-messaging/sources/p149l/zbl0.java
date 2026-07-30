package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class zbl0 {

    /* JADX INFO: renamed from: a */
    public static boolean f202451a = true;

    /* JADX INFO: renamed from: a */
    public static xbl0 m217910a(@NonNull ViewGroup viewGroup) {
        return new wbl0(viewGroup);
    }

    @RequiresApi(18)
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public static void m217911b(@NonNull ViewGroup viewGroup, boolean z) {
        if (f202451a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f202451a = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m217912c(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m217911b(viewGroup, z);
        }
    }
}
