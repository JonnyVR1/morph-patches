package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class yce implements tgj0<Drawable> {

    /* JADX INFO: renamed from: b */
    private final tgj0<Bitmap> f198499b;

    /* JADX INFO: renamed from: c */
    private final boolean f198500c;

    public yce(tgj0<Bitmap> tgj0Var, boolean z) {
        this.f198499b = tgj0Var;
        this.f198500c = z;
    }

    /* JADX INFO: renamed from: d */
    private u3d0<Drawable> m215145d(Context context, u3d0<Bitmap> u3d0Var) {
        return s9r.m185217b(context.getResources(), u3d0Var);
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        this.f198499b.mo5434a(messageDigest);
    }

    @Override // p153l.tgj0
    @NonNull
    /* JADX INFO: renamed from: b */
    public u3d0<Drawable> mo100877b(@NonNull Context context, @NonNull u3d0<Drawable> u3d0Var, int i, int i2) {
        w23 w23VarM5330f = ComponentCallbacks2C1057a.m5319c(context).m5330f();
        Drawable drawable = u3d0Var.get();
        u3d0<Bitmap> u3d0VarM210144a = xce.m210144a(w23VarM5330f, drawable, i, i2);
        if (u3d0VarM210144a == null) {
            if (!this.f198500c) {
                return u3d0Var;
            }
            v1d0.m199002a("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        u3d0<Bitmap> u3d0VarMo100877b = this.f198499b.mo100877b(context, u3d0VarM210144a, i, i2);
        if (!u3d0VarMo100877b.equals(u3d0VarM210144a)) {
            return m215145d(context, u3d0VarMo100877b);
        }
        u3d0VarMo100877b.recycle();
        return u3d0Var;
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof yce) {
            return this.f198499b.equals(((yce) obj).f198499b);
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return this.f198499b.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public tgj0<BitmapDrawable> m215146c() {
        return this;
    }
}
