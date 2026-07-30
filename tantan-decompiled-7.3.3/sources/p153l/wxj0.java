package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class wxj0 implements z3d0<Bitmap, Bitmap> {
    @Override // p153l.z3d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u3d0<Bitmap> mo5554b(@NonNull Bitmap bitmap, int i, int i2, @NonNull u560 u560Var) {
        return new C21201a(bitmap);
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull Bitmap bitmap, @NonNull u560 u560Var) {
        return true;
    }

    /* JADX INFO: renamed from: l.wxj0$a */
    public static final class C21201a implements u3d0<Bitmap> {

        /* JADX INFO: renamed from: a */
        private final Bitmap f191499a;

        public C21201a(@NonNull Bitmap bitmap) {
            this.f191499a = bitmap;
        }

        @Override // p153l.u3d0
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f191499a;
        }

        @Override // p153l.u3d0
        @NonNull
        public Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        @Override // p153l.u3d0
        public int getSize() {
            return ylk0.m216584h(this.f191499a);
        }

        @Override // p153l.u3d0
        public void recycle() {
        }
    }
}
