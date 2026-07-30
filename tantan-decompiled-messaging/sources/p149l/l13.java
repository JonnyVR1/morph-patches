package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class l13 implements uwc0<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    private final Resources f125613a;

    public l13(@NonNull Resources resources) {
        this.f125613a = (Resources) qf80.m174276d(resources);
    }

    @Override // p149l.uwc0
    @Nullable
    /* JADX INFO: renamed from: a */
    public rvc0<BitmapDrawable> mo140781a(@NonNull rvc0<Bitmap> rvc0Var, @NonNull px50 px50Var) {
        return q7r.m173292b(this.f125613a, rvc0Var);
    }
}
