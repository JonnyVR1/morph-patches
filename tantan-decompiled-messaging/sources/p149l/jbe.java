package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class jbe implements uwc0<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    private final g23 f117186a;

    /* JADX INFO: renamed from: b */
    private final uwc0<Bitmap, byte[]> f117187b;

    /* JADX INFO: renamed from: c */
    private final uwc0<lkj, byte[]> f117188c;

    public jbe(@NonNull g23 g23Var, @NonNull uwc0<Bitmap, byte[]> uwc0Var, @NonNull uwc0<lkj, byte[]> uwc0Var2) {
        this.f117186a = g23Var;
        this.f117187b = uwc0Var;
        this.f117188c = uwc0Var2;
    }

    @Override // p149l.uwc0
    @Nullable
    /* JADX INFO: renamed from: a */
    public rvc0<byte[]> mo140781a(@NonNull rvc0<Drawable> rvc0Var, @NonNull px50 px50Var) {
        Drawable drawable = rvc0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f117187b.mo140781a(o23.m162285b(((BitmapDrawable) drawable).getBitmap(), this.f117186a), px50Var);
        }
        if (drawable instanceof lkj) {
            return this.f117188c.mo140781a(m140780b(rvc0Var), px50Var);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: b */
    private static rvc0<lkj> m140780b(@NonNull rvc0<Drawable> rvc0Var) {
        return rvc0Var;
    }
}
