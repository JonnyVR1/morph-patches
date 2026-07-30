package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface akm {
    /* JADX INFO: renamed from: a */
    Point mo98574a(Context context, Uri uri) throws Exception;

    /* JADX INFO: renamed from: b */
    boolean mo98575b();

    /* JADX INFO: renamed from: c */
    Bitmap mo98576c(Rect rect, int i);

    void recycle();
}
