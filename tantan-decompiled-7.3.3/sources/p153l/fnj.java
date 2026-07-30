package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class fnj implements tgj0<bnj> {

    /* JADX INFO: renamed from: b */
    private final tgj0<Bitmap> f99925b;

    public fnj(tgj0<Bitmap> tgj0Var) {
        this.f99925b = (tgj0) vn80.m201944d(tgj0Var);
    }

    @Override // p153l.kzq
    /* JADX INFO: renamed from: a */
    public void mo5434a(@NonNull MessageDigest messageDigest) {
        this.f99925b.mo5434a(messageDigest);
    }

    @Override // p153l.tgj0
    @NonNull
    /* JADX INFO: renamed from: b */
    public u3d0<bnj> mo100877b(@NonNull Context context, @NonNull u3d0<bnj> u3d0Var, int i, int i2) {
        bnj bnjVar = u3d0Var.get();
        e33 e33Var = new e33(bnjVar.m105407e(), ComponentCallbacks2C1057a.m5319c(context).m5330f());
        u3d0<Bitmap> u3d0VarMo100877b = this.f99925b.mo100877b(context, e33Var, i, i2);
        if (e33Var != u3d0VarMo100877b) {
            e33Var.recycle();
        }
        bnjVar.m105412m(this.f99925b, u3d0VarMo100877b.get());
        return u3d0Var;
    }

    @Override // p153l.kzq
    public boolean equals(Object obj) {
        if (obj instanceof fnj) {
            return this.f99925b.equals(((fnj) obj).f99925b);
        }
        return false;
    }

    @Override // p153l.kzq
    public int hashCode() {
        return this.f99925b.hashCode();
    }
}
