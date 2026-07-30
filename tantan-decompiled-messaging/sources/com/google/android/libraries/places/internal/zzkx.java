package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes7.dex */
public final class zzkx {
    @ColorInt
    public static int zza(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        return zzc(i, i2, i3) ? i3 : i2;
    }

    public static void zzb(ImageView imageView, @ColorInt int i) {
        Drawable drawable = imageView.getDrawable();
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(iRgb, PorterDuff.Mode.SRC_ATOP);
        drawableMutate.setAlpha(Color.alpha(i));
    }

    public static boolean zzc(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        double dZzf = zzf(i);
        double dZze = zze(zzf(i2), dZzf);
        return dZze <= 3.0d && dZze <= zze(zzf(i3), dZzf);
    }

    private static double zzd(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    private static double zze(double d, double d2) {
        return Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zzf(@ColorInt int i) {
        return (zzd(((double) Color.red(i)) / 255.0d) * 0.2126d) + (zzd(((double) Color.green(i)) / 255.0d) * 0.7152d) + (zzd(((double) Color.blue(i)) / 255.0d) * 0.0722d);
    }
}
