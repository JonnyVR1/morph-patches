package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class pkj implements p7j0<lkj> {

    /* JADX INFO: renamed from: b */
    private final p7j0<Bitmap> f150002b;

    public pkj(p7j0<Bitmap> p7j0Var) {
        this.f150002b = (p7j0) qf80.m174276d(p7j0Var);
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        this.f150002b.mo5409a(messageDigest);
    }

    @Override // p149l.p7j0
    @NonNull
    /* JADX INFO: renamed from: b */
    public rvc0<lkj> mo167760b(@NonNull Context context, @NonNull rvc0<lkj> rvc0Var, int i, int i2) {
        lkj lkjVar = rvc0Var.get();
        o23 o23Var = new o23(lkjVar.m150280e(), ComponentCallbacks2C1053a.m5309c(context).m5321f());
        rvc0<Bitmap> rvc0VarMo167760b = this.f150002b.mo167760b(context, o23Var, i, i2);
        if (o23Var != rvc0VarMo167760b) {
            o23Var.recycle();
        }
        lkjVar.m150285n(this.f150002b, rvc0VarMo167760b.get());
        return rvc0Var;
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof pkj) {
            return this.f150002b.equals(((pkj) obj).f150002b);
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return this.f150002b.hashCode();
    }
}
