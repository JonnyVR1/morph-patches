package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes7.dex */
public class jri extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return BitmapFactory.decodeResource(lv0.m155971a().getResources(), xac0.f193010a);
    }
}
