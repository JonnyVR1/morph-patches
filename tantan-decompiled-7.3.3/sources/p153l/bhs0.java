package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bhs0 {
    /* JADX INFO: renamed from: a */
    public static final void m104367a(ahs0 ahs0Var, @Nullable ygs0 ygs0Var) {
        if (ygs0Var.m215877a() == null) {
            wg3.m206174a("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (TextUtils.isEmpty(ygs0Var.m215878b())) {
            wg3.m206174a("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else {
            ahs0Var.m97914d(ygs0Var.m215877a(), ygs0Var.m215878b(), ygs0Var.m215879c(), ygs0Var.m215880d());
        }
    }
}
