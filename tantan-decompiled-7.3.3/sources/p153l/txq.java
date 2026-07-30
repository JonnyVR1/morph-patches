package p153l;

import android.util.DisplayMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0006\"\u0011\u0010\u0003\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Landroid/util/DisplayMetrics;", "a", "()Landroid/util/DisplayMetrics;", "displayMetrics", "", "", "b", "(F)I", "dp", "c", "(I)I", "utils_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class txq {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final DisplayMetrics m193528a() {
        DisplayMetrics displayMetrics = xx0.m213454a().getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    /* JADX INFO: renamed from: b */
    public static final int m193529b(float f) {
        return (int) (f * m193528a().density);
    }

    /* JADX INFO: renamed from: c */
    public static final int m193530c(int i) {
        return m193529b(i);
    }
}
