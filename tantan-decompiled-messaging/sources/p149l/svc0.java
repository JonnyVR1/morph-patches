package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class svc0 implements wvc0<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    private final yvc0 f166555a;

    /* JADX INFO: renamed from: b */
    private final g23 f166556b;

    public svc0(yvc0 yvc0Var, g23 g23Var) {
        this.f166555a = yvc0Var;
        this.f166556b = g23Var;
    }

    @Override // p149l.wvc0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        rvc0<Drawable> rvc0VarMo5553b = this.f166555a.mo5553b(uri, i, i2, px50Var);
        if (rvc0VarMo5553b == null) {
            return null;
        }
        return tbe.m187852a(this.f166556b, rvc0VarMo5553b.get(), i, i2);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull Uri uri, @NonNull px50 px50Var) {
        return "android.resource".equals(uri.getScheme());
    }
}
