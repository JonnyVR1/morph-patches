package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class qof0 implements w4d0<Bitmap> {

    /* JADX INFO: renamed from: a */
    public static qof0 f158732a;

    /* JADX INFO: renamed from: a */
    public static qof0 m177300a() {
        if (f158732a == null) {
            f158732a = new qof0();
        }
        return f158732a;
    }

    @Override // p153l.w4d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
