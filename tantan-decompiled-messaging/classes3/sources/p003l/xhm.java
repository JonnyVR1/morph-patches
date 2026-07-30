package p003l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface xhm {
    /* JADX INFO: renamed from: a */
    Point mo3339a(Context context, Uri uri) throws Exception;

    /* JADX INFO: renamed from: b */
    boolean mo3340b();

    /* JADX INFO: renamed from: c */
    Bitmap mo3341c(Rect rect, int i);

    void recycle();
}
