package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v7s0 {
    /* JADX INFO: renamed from: a */
    public static final void m197385a(u7s0 u7s0Var, @Nullable s7s0 s7s0Var) {
        if (s7s0Var.m182518a() == null) {
            ig3.m135964a("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (TextUtils.isEmpty(s7s0Var.m182519b())) {
            ig3.m135964a("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else {
            u7s0Var.m192160d(s7s0Var.m182518a(), s7s0Var.m182519b(), s7s0Var.m182520c(), s7s0Var.m182521d());
        }
    }
}
