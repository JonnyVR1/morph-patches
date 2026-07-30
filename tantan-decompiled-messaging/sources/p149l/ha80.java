package p149l;

import android.content.Context;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class ha80 {

    /* JADX INFO: renamed from: a */
    public final PointerIcon f106714a;

    /* JADX INFO: renamed from: l.ha80$a */
    @RequiresApi(24)
    public static class C17251a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static PointerIcon m130072a(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }

    public ha80(PointerIcon pointerIcon) {
        this.f106714a = pointerIcon;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ha80 m130070b(@NonNull Context context, int i) {
        return new ha80(C17251a.m130072a(context, i));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public Object m130071a() {
        return this.f106714a;
    }
}
