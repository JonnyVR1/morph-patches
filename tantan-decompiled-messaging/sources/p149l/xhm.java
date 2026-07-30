package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface xhm {
    /* JADX INFO: renamed from: a */
    Point mo107152a(Context context, Uri uri) throws Exception;

    /* JADX INFO: renamed from: b */
    boolean mo107153b();

    /* JADX INFO: renamed from: c */
    Bitmap mo107154c(Rect rect, int i);

    void recycle();
}
