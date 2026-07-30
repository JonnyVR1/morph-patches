package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class ube implements p7j0<Drawable> {

    /* JADX INFO: renamed from: b */
    private final p7j0<Bitmap> f175683b;

    /* JADX INFO: renamed from: c */
    private final boolean f175684c;

    public ube(p7j0<Bitmap> p7j0Var, boolean z) {
        this.f175683b = p7j0Var;
        this.f175684c = z;
    }

    /* JADX INFO: renamed from: d */
    private rvc0<Drawable> m192819d(Context context, rvc0<Bitmap> rvc0Var) {
        return q7r.m173292b(context.getResources(), rvc0Var);
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        this.f175683b.mo5409a(messageDigest);
    }

    @Override // p149l.p7j0
    @NonNull
    /* JADX INFO: renamed from: b */
    public rvc0<Drawable> mo167760b(@NonNull Context context, @NonNull rvc0<Drawable> rvc0Var, int i, int i2) {
        g23 g23VarM5321f = ComponentCallbacks2C1053a.m5309c(context).m5321f();
        Drawable drawable = rvc0Var.get();
        rvc0<Bitmap> rvc0VarM187852a = tbe.m187852a(g23VarM5321f, drawable, i, i2);
        if (rvc0VarM187852a == null) {
            if (!this.f175684c) {
                return rvc0Var;
            }
            qtc0.m176411a("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        rvc0<Bitmap> rvc0VarMo167760b = this.f175683b.mo167760b(context, rvc0VarM187852a, i, i2);
        if (!rvc0VarMo167760b.equals(rvc0VarM187852a)) {
            return m192819d(context, rvc0VarMo167760b);
        }
        rvc0VarMo167760b.recycle();
        return rvc0Var;
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof ube) {
            return this.f175683b.equals(((ube) obj).f175683b);
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return this.f175683b.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public p7j0<BitmapDrawable> m192820c() {
        return this;
    }
}
