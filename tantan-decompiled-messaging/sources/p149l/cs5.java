package p149l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class cs5 {

    /* JADX INFO: renamed from: l.cs5$a */
    @RequiresApi(21)
    public static class C16233a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ColorStateList m108483a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m108484b(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m108485c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: l.cs5$b */
    @RequiresApi(23)
    public static class C16234b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m108486a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Drawable m108479a(@NonNull CompoundButton compoundButton) {
        return C16234b.m108486a(compoundButton);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ColorStateList m108480b(@NonNull CompoundButton compoundButton) {
        return C16233a.m108483a(compoundButton);
    }

    /* JADX INFO: renamed from: c */
    public static void m108481c(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        C16233a.m108484b(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m108482d(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        C16233a.m108485c(compoundButton, mode);
    }
}
