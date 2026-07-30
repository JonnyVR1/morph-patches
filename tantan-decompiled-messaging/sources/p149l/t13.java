package p149l;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class t13 extends qfm<Bitmap> {

    /* JADX INFO: renamed from: b */
    private final g23 f167282b = new h23();

    @Override // p149l.qfm
    /* JADX INFO: renamed from: c */
    public rvc0<Bitmap> mo174357c(ImageDecoder.Source source, int i, int i2, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new o23(bitmapDecodeBitmap, this.f167282b);
    }
}
