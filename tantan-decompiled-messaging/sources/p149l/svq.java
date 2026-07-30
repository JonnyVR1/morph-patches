package p149l;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0006\"\u0011\u0010\u0003\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Landroid/util/DisplayMetrics;", "a", "()Landroid/util/DisplayMetrics;", "displayMetrics", "", "", "b", "(F)I", "dp", "c", "(I)I", "utils_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class svq {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DisplayMetrics m186101a() {
        DisplayMetrics displayMetrics = qx0.m176935a().getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    /* JADX INFO: renamed from: b */
    public static final int m186102b(float f) {
        return (int) (f * m186101a().density);
    }

    /* JADX INFO: renamed from: c */
    public static final int m186103c(int i) {
        return m186102b(i);
    }
}
