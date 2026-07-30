package p153l;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l.gb */
/* JADX INFO: loaded from: classes.dex */
public final class C17188gb {
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public static int m129752a(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static void m129753b(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
