package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bjf0 implements bfm {
    @Override // p149l.bfm
    /* JADX INFO: renamed from: a */
    public Bitmap mo101546a(Context context, Uri uri) throws Exception {
        Bitmap bitmapDecodeFile;
        String string = uri.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        InputStream inputStream = null;
        if (string.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            int identifier = 0;
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    CrashHelper.m81296c(e);
                }
            }
            bitmapDecodeFile = BitmapFactory.decodeResource(context.getResources(), identifier, options);
        } else if (string.startsWith("file:///android_asset/")) {
            bitmapDecodeFile = BitmapFactory.decodeStream(context.getResources().getAssets().open(string.substring(22)), null, options);
        } else if (string.startsWith("file://")) {
            bitmapDecodeFile = BitmapFactory.decodeFile(string.substring(7), options);
        } else {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception e2) {
                            CrashHelper.m81296c(e2);
                        }
                    }
                    bitmapDecodeFile = bitmapDecodeStream;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            CrashHelper.m81296c(e3);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        upk0.m194883a("Skia image region decoder returned null bitmap - image format may not be supported");
        return null;
    }
}
