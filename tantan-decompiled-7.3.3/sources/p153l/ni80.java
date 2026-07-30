package p153l;

import android.content.Context;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class ni80 {

    /* JADX INFO: renamed from: a */
    public final PointerIcon f142099a;

    /* JADX INFO: renamed from: l.ni80$a */
    @RequiresApi(24)
    public static class C18878a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static PointerIcon m163270a(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }

    public ni80(PointerIcon pointerIcon) {
        this.f142099a = pointerIcon;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ni80 m163268b(@NonNull Context context, int i) {
        return new ni80(C18878a.m163270a(context, i));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public Object m163269a() {
        return this.f142099a;
    }
}
