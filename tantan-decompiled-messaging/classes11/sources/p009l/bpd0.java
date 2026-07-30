package p009l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import l.t95;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bpd0 {
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX INFO: renamed from: a */
    public static boolean m12187a(String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = null;
        try {
            if (TextUtils.isEmpty(str)) {
                if (NullChecker.a((Object) null)) {
                    throw null;
                }
                t95.b((Closeable) null);
                return false;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    App.e.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                    if (NullChecker.a(bitmapDecodeByteArray)) {
                        bitmapDecodeByteArray.recycle();
                    }
                    t95.b(fileOutputStream);
                    return true;
                } catch (FileNotFoundException e) {
                    e = e;
                    bitmap = bitmapDecodeByteArray;
                    CrashHelper.c(e);
                    if (NullChecker.a(bitmap)) {
                        bitmap.recycle();
                    }
                    t95.b(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bitmap = bitmapDecodeByteArray;
                    if (NullChecker.a(bitmap)) {
                        bitmap.recycle();
                    }
                    t95.b(fileOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            CrashHelper.c(e);
            if (NullChecker.a(bitmap)) {
                bitmap.recycle();
            }
            t95.b(fileOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            if (NullChecker.a(bitmap)) {
                bitmap.recycle();
            }
            t95.b(fileOutputStream);
            throw th;
        }
    }
}
