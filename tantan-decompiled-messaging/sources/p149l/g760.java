package p149l;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class g760 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<j760<Rect, Rect>> f101334a = new ThreadLocal<>();

    /* JADX INFO: renamed from: l.g760$a */
    @RequiresApi(23)
    public static class C17017a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m124685a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m124684a(@NonNull Paint paint, @NonNull String str) {
        return C17017a.m124685a(paint, str);
    }
}
