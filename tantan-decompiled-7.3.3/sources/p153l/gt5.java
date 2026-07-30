package p153l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class gt5 {

    /* JADX INFO: renamed from: l.gt5$a */
    @RequiresApi(21)
    public static class C17309a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ColorStateList m132205a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m132206b(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m132207c(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: l.gt5$b */
    @RequiresApi(23)
    public static class C17310b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Drawable m132208a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Drawable m132201a(@NonNull CompoundButton compoundButton) {
        return C17310b.m132208a(compoundButton);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ColorStateList m132202b(@NonNull CompoundButton compoundButton) {
        return C17309a.m132205a(compoundButton);
    }

    /* JADX INFO: renamed from: c */
    public static void m132203c(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        C17309a.m132206b(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m132204d(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        C17309a.m132207c(compoundButton, mode);
    }
}
