package p003l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cjf0 implements xhm {

    /* JADX INFO: renamed from: a */
    public BitmapRegionDecoder f2696a;

    /* JADX INFO: renamed from: b */
    public final Object f2697b = new Object();

    @Override // p003l.xhm
    /* JADX INFO: renamed from: a */
    public Point mo3339a(Context context, Uri uri) throws Exception {
        int identifier;
        String string = uri.toString();
        if (string.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    CrashHelper.c(e);
                    identifier = 0;
                }
            } else {
                identifier = 0;
            }
            this.f2696a = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            this.f2696a = BitmapRegionDecoder.newInstance(context.getResources().getAssets().open(string.substring(22), 1), false);
        } else if (string.startsWith("file://")) {
            this.f2696a = BitmapRegionDecoder.newInstance(string.substring(7), false);
        } else {
            InputStream inputStreamOpenInputStream = null;
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                this.f2696a = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
            } finally {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception e2) {
                        CrashHelper.c(e2);
                    }
                }
            }
        }
        return new Point(this.f2696a.getWidth(), this.f2696a.getHeight());
    }

    @Override // p003l.xhm
    /* JADX INFO: renamed from: b */
    public boolean mo3340b() {
        BitmapRegionDecoder bitmapRegionDecoder = this.f2696a;
        return (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) ? false : true;
    }

    @Override // p003l.xhm
    /* JADX INFO: renamed from: c */
    public Bitmap mo3341c(Rect rect, int i) {
        Bitmap bitmapDecodeRegion;
        synchronized (this.f2697b) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = i;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                bitmapDecodeRegion = this.f2696a.decodeRegion(rect, options);
                if (bitmapDecodeRegion == null) {
                    throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmapDecodeRegion;
    }

    @Override // p003l.xhm
    public void recycle() {
        this.f2696a.recycle();
    }
}
