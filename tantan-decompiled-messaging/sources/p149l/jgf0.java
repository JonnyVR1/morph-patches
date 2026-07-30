package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class jgf0 implements twc0<Bitmap> {

    /* JADX INFO: renamed from: a */
    public static jgf0 f117774a;

    /* JADX INFO: renamed from: a */
    public static jgf0 m141281a() {
        if (f117774a == null) {
            f117774a = new jgf0();
        }
        return f117774a;
    }

    @Override // p149l.twc0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
