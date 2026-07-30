package p149l;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class ed80 {

    /* JADX INFO: renamed from: l.ed80$a */
    @RequiresApi(23)
    public static class C16578a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m115792a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m115793b(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m115789a(@NonNull PopupWindow popupWindow, boolean z) {
        C16578a.m115792a(popupWindow, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m115790b(@NonNull PopupWindow popupWindow, int i) {
        C16578a.m115793b(popupWindow, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m115791c(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
