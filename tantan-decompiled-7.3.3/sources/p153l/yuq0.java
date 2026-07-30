package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class yuq0 {

    /* JADX INFO: renamed from: a */
    public static final StringBuilder f201657a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public static final ByteString f201658b = ByteString.encodeUtf8("RIFF");

    /* JADX INFO: renamed from: c */
    public static final ByteString f201659c = ByteString.encodeUtf8("WEBP");

    /* JADX INFO: renamed from: a */
    public static int m217465a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    /* JADX INFO: renamed from: b */
    public static int m217466b(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        xtq0.m213103a("Negative size: ", bitmap);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static long m217467c(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 20971520L), 5242880L);
    }

    /* JADX INFO: renamed from: d */
    public static void m217468d() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        wtq0.m207906a("Method call should happen from the main thread.");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m217469e(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
        }
    }
}
