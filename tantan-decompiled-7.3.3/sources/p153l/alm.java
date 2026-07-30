package p153l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class alm {

    /* JADX INFO: renamed from: l.alm$a */
    @RequiresApi(21)
    public static class C15741a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ColorStateList m98697a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m98698b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m98699c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m98700d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static ColorStateList m98693a(@NonNull ImageView imageView) {
        return C15741a.m98697a(imageView);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m98694b(@NonNull ImageView imageView) {
        return C15741a.m98698b(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static void m98695c(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        C15741a.m98699c(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m98696d(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        C15741a.m98700d(imageView, mode);
    }
}
