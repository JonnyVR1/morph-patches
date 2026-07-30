package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class v3d0 implements z3d0<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final b4d0 f182179a;

    /* JADX INFO: renamed from: b */
    private final w23 f182180b;

    public v3d0(b4d0 b4d0Var, w23 w23Var) {
        this.f182179a = b4d0Var;
        this.f182180b = w23Var;
    }

    @Override // p153l.z3d0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        u3d0<Drawable> u3d0VarMo5554b = this.f182179a.mo5554b(uri, i, i2, u560Var);
        if (u3d0VarMo5554b == null) {
            return null;
        }
        return xce.m210144a(this.f182180b, u3d0VarMo5554b.get(), i, i2);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull Uri uri, @NonNull u560 u560Var) {
        return "android.resource".equals(uri.getScheme());
    }
}
