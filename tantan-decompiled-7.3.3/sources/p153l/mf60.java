package p153l;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class mf60 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<pf60<Rect, Rect>> f136616a = new ThreadLocal<>();

    /* JADX INFO: renamed from: l.mf60$a */
    @RequiresApi(23)
    public static class C18606a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m158148a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m158147a(@NonNull Paint paint, @NonNull String str) {
        return C18606a.m158148a(paint, str);
    }
}
