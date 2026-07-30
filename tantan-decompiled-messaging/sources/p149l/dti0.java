package p149l;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class dti0 {
    /* JADX INFO: renamed from: a */
    public static void m113570a(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            eti0.m118119f(view, charSequence);
        }
    }
}
