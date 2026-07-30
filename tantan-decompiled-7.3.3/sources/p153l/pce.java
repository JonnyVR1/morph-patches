package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class pce {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f151571a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m171643a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return m171645c(context, context, i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m171644b(Context context, Context context2, @DrawableRes int i) {
        return m171645c(context, context2, i, null);
    }

    /* JADX INFO: renamed from: c */
    private static Drawable m171645c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f151571a) {
                return m171647e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return j26.m143192e(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f151571a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m171646d(context2, i, theme);
    }

    /* JADX INFO: renamed from: d */
    private static Drawable m171646d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return c5d0.m108035e(context.getResources(), i, theme);
    }

    /* JADX INFO: renamed from: e */
    private static Drawable m171647e(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new r26(context, theme);
        }
        return tu0.m192702b(context, i);
    }
}
