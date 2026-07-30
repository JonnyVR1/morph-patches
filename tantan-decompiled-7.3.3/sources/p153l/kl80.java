package p153l;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class kl80 {

    /* JADX INFO: renamed from: l.kl80$a */
    @RequiresApi(23)
    public static class C18205a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m150359a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m150360b(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m150356a(@NonNull PopupWindow popupWindow, boolean z) {
        C18205a.m150359a(popupWindow, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m150357b(@NonNull PopupWindow popupWindow, int i) {
        C18205a.m150360b(popupWindow, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m150358c(@NonNull PopupWindow popupWindow, @NonNull View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
