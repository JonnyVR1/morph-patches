package p149l;

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
public final class kbe {

    /* JADX INFO: renamed from: l.kbe$a */
    @RequiresApi(21)
    public static class C17978a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m145285a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m145286b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static ColorFilter m145287c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m145288d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m145289e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m145290f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static void m145291g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static void m145292h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static void m145293i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: l.kbe$b */
    @RequiresApi(23)
    public static class C17979b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m145294a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m145295b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m145267a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        C17978a.m145285a(drawable, theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m145268b(@NonNull Drawable drawable) {
        return C17978a.m145286b(drawable);
    }

    /* JADX INFO: renamed from: c */
    public static void m145269c(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static int m145270d(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static ColorFilter m145271e(@NonNull Drawable drawable) {
        return C17978a.m145287c(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static int m145272f(@NonNull Drawable drawable) {
        return C17979b.m145294a(drawable);
    }

    /* JADX INFO: renamed from: g */
    public static void m145273g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        C17978a.m145288d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m145274h(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m145275i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: j */
    public static void m145276j(@NonNull Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* JADX INFO: renamed from: k */
    public static void m145277k(@NonNull Drawable drawable, float f, float f2) {
        C17978a.m145289e(drawable, f, f2);
    }

    /* JADX INFO: renamed from: l */
    public static void m145278l(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        C17978a.m145290f(drawable, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m145279m(@NonNull Drawable drawable, int i) {
        return C17979b.m145295b(drawable, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m145280n(@NonNull Drawable drawable, @ColorInt int i) {
        C17978a.m145291g(drawable, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m145281o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        C17978a.m145292h(drawable, colorStateList);
    }

    /* JADX INFO: renamed from: p */
    public static void m145282p(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        C17978a.m145293i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static <T extends Drawable> T m145283q(@NonNull Drawable drawable) {
        return drawable instanceof ibq0 ? (T) ((ibq0) drawable).m135269b() : drawable;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static Drawable m145284r(@NonNull Drawable drawable) {
        return drawable;
    }
}
