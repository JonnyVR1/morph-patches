package p153l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class oce {

    /* JADX INFO: renamed from: l.oce$a */
    @RequiresApi(21)
    public static class C19097a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m167179a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m167180b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static ColorFilter m167181c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m167182d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m167183e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m167184f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static void m167185g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static void m167186h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static void m167187i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: l.oce$b */
    @RequiresApi(23)
    public static class C19098b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m167188a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m167189b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167161a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        C19097a.m167179a(drawable, theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m167162b(@NonNull Drawable drawable) {
        return C19097a.m167180b(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m167163c(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static int m167164d(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static ColorFilter m167165e(@NonNull Drawable drawable) {
        return C19097a.m167181c(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static int m167166f(@NonNull Drawable drawable) {
        return C19098b.m167188a(drawable);
    }

    /* JADX INFO: renamed from: g */
    public static void m167167g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        C19097a.m167182d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m167168h(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m167169i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: j */
    public static void m167170j(@NonNull Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* JADX INFO: renamed from: k */
    public static void m167171k(@NonNull Drawable drawable, float f, float f2) {
        C19097a.m167183e(drawable, f, f2);
    }

    /* JADX INFO: renamed from: l */
    public static void m167172l(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        C19097a.m167184f(drawable, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m167173m(@NonNull Drawable drawable, int i) {
        return C19098b.m167189b(drawable, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m167174n(@NonNull Drawable drawable, @ColorInt int i) {
        C19097a.m167185g(drawable, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m167175o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        C19097a.m167186h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: p */
    public static void m167176p(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        C19097a.m167187i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static <T extends Drawable> T m167177q(@NonNull Drawable drawable) {
        return drawable instanceof nkq0 ? (T) ((nkq0) drawable).m163664b() : drawable;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static Drawable m167178r(@NonNull Drawable drawable) {
        return drawable;
    }
}
