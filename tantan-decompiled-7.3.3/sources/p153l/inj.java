package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class inj implements z3d0<anj, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final w23 f115980a;

    public inj(w23 w23Var) {
        this.f115980a = w23Var;
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull anj anjVar, int i, int i2, @NonNull u560 u560Var) {
        return e33.m119246b(anjVar.getNextFrame(), this.f115980a);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull anj anjVar, @NonNull u560 u560Var) {
        return true;
    }
}
