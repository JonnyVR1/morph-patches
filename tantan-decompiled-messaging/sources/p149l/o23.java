package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o23 implements rvc0<Bitmap>, dsm {

    /* JADX INFO: renamed from: a */
    private final Bitmap f141504a;

    /* JADX INFO: renamed from: b */
    private final g23 f141505b;

    public o23(@NonNull Bitmap bitmap, @NonNull g23 g23Var) {
        this.f141504a = (Bitmap) qf80.m174277e(bitmap, "Bitmap must not be null");
        this.f141505b = (g23) qf80.m174277e(g23Var, "BitmapPool must not be null");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static o23 m162285b(@Nullable Bitmap bitmap, @NonNull g23 g23Var) {
        if (bitmap == null) {
            return null;
        }
        return new o23(bitmap, g23Var);
    }

    @Override // p149l.rvc0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f141504a;
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // p149l.rvc0
    public int getSize() {
        return sck0.m183408h(this.f141504a);
    }

    @Override // p149l.dsm
    public void initialize() {
        this.f141504a.prepareToDraw();
    }

    @Override // p149l.rvc0
    public void recycle() {
        this.f141505b.mo124142c(this.f141504a);
    }
}
