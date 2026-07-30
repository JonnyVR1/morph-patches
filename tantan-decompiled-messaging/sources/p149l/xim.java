package p149l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class xim {

    /* JADX INFO: renamed from: l.xim$a */
    @RequiresApi(21)
    public static class C21161a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ColorStateList m209670a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m209671b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m209672c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m209673d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static ColorStateList m209666a(@NonNull ImageView imageView) {
        return C21161a.m209670a(imageView);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m209667b(@NonNull ImageView imageView) {
        return C21161a.m209671b(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static void m209668c(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        C21161a.m209672c(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m209669d(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        C21161a.m209673d(imageView, mode);
    }
}
