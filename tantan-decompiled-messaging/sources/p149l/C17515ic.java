package p149l;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: l.ic */
/* JADX INFO: loaded from: classes.dex */
public class C17515ic {
    /* JADX INFO: renamed from: a */
    public static void m135298a(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m135299b(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    /* JADX INFO: renamed from: c */
    public static void m135300c(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
