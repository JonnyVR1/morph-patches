package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class q7r implements rvc0<BitmapDrawable>, dsm {

    /* JADX INFO: renamed from: a */
    private final Resources f153067a;

    /* JADX INFO: renamed from: b */
    private final rvc0<Bitmap> f153068b;

    private q7r(@NonNull Resources resources, @NonNull rvc0<Bitmap> rvc0Var) {
        this.f153067a = (Resources) qf80.m174276d(resources);
        this.f153068b = (rvc0) qf80.m174276d(rvc0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static rvc0<BitmapDrawable> m173292b(@NonNull Resources resources, @Nullable rvc0<Bitmap> rvc0Var) {
        if (rvc0Var == null) {
            return null;
        }
        return new q7r(resources, rvc0Var);
    }

    @Override // p149l.rvc0
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f153067a, this.f153068b.get());
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // p149l.rvc0
    public int getSize() {
        return this.f153068b.getSize();
    }

    @Override // p149l.dsm
    public void initialize() {
        rvc0<Bitmap> rvc0Var = this.f153068b;
        if (rvc0Var instanceof dsm) {
            ((dsm) rvc0Var).initialize();
        }
    }

    @Override // p149l.rvc0
    public void recycle() {
        this.f153068b.recycle();
    }
}
