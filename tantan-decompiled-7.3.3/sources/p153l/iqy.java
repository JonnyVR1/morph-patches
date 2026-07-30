package p153l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class iqy {

    /* JADX INFO: renamed from: l.iqy$a */
    @RequiresApi(26)
    public static class C17777a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MenuItem m141740a(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static MenuItem m141741b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static MenuItem m141742c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static MenuItem m141743d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static MenuItem m141744e(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static MenuItem m141745f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static MenuItem m141733a(@NonNull MenuItem menuItem, @Nullable t30 t30Var) {
        return menuItem instanceof h7h0 ? ((h7h0) menuItem).setSupportActionProvider(t30Var) : menuItem;
    }

    /* JADX INFO: renamed from: b */
    public static void m141734b(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141740a(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m141735c(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141741b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m141736d(@NonNull MenuItem menuItem, @Nullable ColorStateList colorStateList) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141742c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m141737e(@NonNull MenuItem menuItem, @Nullable PorterDuff.Mode mode) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141743d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m141738f(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141744e(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m141739g(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof h7h0) {
            ((h7h0) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C17777a.m141745f(menuItem, charSequence);
        }
    }
}
