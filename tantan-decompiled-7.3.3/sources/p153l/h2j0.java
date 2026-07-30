package p153l;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class h2j0 {
    /* JADX INFO: renamed from: a */
    public static void m133392a(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            i2j0.m138220f(view, charSequence);
        }
    }
}
