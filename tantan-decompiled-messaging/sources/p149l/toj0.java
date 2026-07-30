package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class toj0 implements wvc0<Bitmap, Bitmap> {
    @Override // p149l.wvc0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rvc0<Bitmap> mo5553b(@NonNull Bitmap bitmap, int i, int i2, @NonNull px50 px50Var) {
        return new C20223a(bitmap);
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull Bitmap bitmap, @NonNull px50 px50Var) {
        return true;
    }

    /* JADX INFO: renamed from: l.toj0$a */
    public static final class C20223a implements rvc0<Bitmap> {

        /* JADX INFO: renamed from: a */
        private final Bitmap f171378a;

        public C20223a(@NonNull Bitmap bitmap) {
            this.f171378a = bitmap;
        }

        @Override // p149l.rvc0
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f171378a;
        }

        @Override // p149l.rvc0
        @NonNull
        public Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        @Override // p149l.rvc0
        public int getSize() {
            return sck0.m183408h(this.f171378a);
        }

        @Override // p149l.rvc0
        public void recycle() {
        }
    }
}
