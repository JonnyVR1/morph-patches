package p149l;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class vbl0 {

    /* JADX INFO: renamed from: l.vbl0$a */
    @RequiresApi(21)
    public static class C20610a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m197724a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m197722a(@NonNull ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m197723b(@NonNull ViewGroup viewGroup) {
        return C20610a.m197724a(viewGroup);
    }
}
