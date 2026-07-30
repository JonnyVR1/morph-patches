package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class lbe {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f127289a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m149218a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return m149220c(context, context, i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m149219b(Context context, Context context2, @DrawableRes int i) {
        return m149220c(context, context2, i, null);
    }

    /* JADX INFO: renamed from: c */
    private static Drawable m149220c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f127289a) {
                return m149222e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return e16.m114377e(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f127289a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m149221d(context2, i, theme);
    }

    /* JADX INFO: renamed from: d */
    private static Drawable m149221d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return ywc0.m216334e(context.getResources(), i, theme);
    }

    /* JADX INFO: renamed from: e */
    private static Drawable m149222e(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new m16(context, theme);
        }
        return nu0.m161424b(context, i);
    }
}
