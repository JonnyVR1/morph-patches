package p149l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class lhy {

    /* JADX INFO: renamed from: l.lhy$a */
    @RequiresApi(26)
    public static class C18225a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MenuItem m149870a(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static MenuItem m149871b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static MenuItem m149872c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static MenuItem m149873d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static MenuItem m149874e(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static MenuItem m149875f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static MenuItem m149863a(@NonNull MenuItem menuItem, @Nullable z30 z30Var) {
        return menuItem instanceof zyg0 ? ((zyg0) menuItem).setSupportActionProvider(z30Var) : menuItem;
    }

    /* JADX INFO: renamed from: b */
    public static void m149864b(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149870a(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m149865c(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149871b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m149866d(@NonNull MenuItem menuItem, @Nullable ColorStateList colorStateList) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149872c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m149867e(@NonNull MenuItem menuItem, @Nullable PorterDuff.Mode mode) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149873d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m149868f(@NonNull MenuItem menuItem, char c, int i) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149874e(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m149869g(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof zyg0) {
            ((zyg0) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18225a.m149875f(menuItem, charSequence);
        }
    }
}
