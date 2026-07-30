package p149l;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.lb */
/* JADX INFO: loaded from: classes.dex */
public final class C18183lb {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static int m149182a(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static void m149183b(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
