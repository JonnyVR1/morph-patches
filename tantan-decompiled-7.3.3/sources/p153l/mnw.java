package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class mnw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: a */
    public static Bitmap m159206a(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        ?? r0 = 0;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                inputStreamOpen = context.getResources().getAssets().open(str);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    str = inputStreamOpen;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    str = inputStreamOpen;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                try {
                    r0.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            r0.close();
            throw th;
        }
        try {
            str.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return bitmapDecodeStream;
    }
}
