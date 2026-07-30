package p153l;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class zkl0 {

    /* JADX INFO: renamed from: l.zkl0$a */
    @RequiresApi(21)
    public static class C21830a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m220116a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m220114a(@NonNull ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m220115b(@NonNull ViewGroup viewGroup) {
        return C21830a.m220116a(viewGroup);
    }
}
