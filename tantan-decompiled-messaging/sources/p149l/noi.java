package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes7.dex */
public class noi extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return BitmapFactory.decodeResource(ev0.m118233a().getResources(), t2c0.f167458a);
    }
}
