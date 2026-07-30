package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import p149l.c31;
import p149l.gnr;
import p149l.qvc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {
    private static final String AUTHORITY_SUFFIX = ".image_provider";
    private static final String CLIP_DATA_LABEL = "image_provider_uris";
    private static final String CONTENT_SCHEME = "content";
    private static final String FILE_EXTENSION = ".png";
    private static final String FILE_SUB_DIR = "image_provider";
    private static final String FILE_SUB_DIR_NAME = "image_provider_images/";
    private static final String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    private static final String TAG = "BrowserServiceFP";
    static Object sFileCleanupLock = new Object();

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$a */
    public class RunnableC0183a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ContentResolver f931a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Uri f932b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qvc0 f933c;

        public RunnableC0183a(ContentResolver contentResolver, Uri uri, qvc0 qvc0Var) {
            this.f931a = contentResolver;
            this.f932b = uri;
            this.f933c = qvc0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f931a.openFileDescriptor(this.f932b, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    this.f933c.setException(new FileNotFoundException());
                    return;
                }
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
                qvc0 qvc0Var = this.f933c;
                if (bitmapDecodeFileDescriptor == null) {
                    qvc0Var.setException(new IOException("File could not be decoded."));
                } else {
                    qvc0Var.set(bitmapDecodeFileDescriptor);
                }
            } catch (IOException e) {
                this.f933c.setException(e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$b */
    public static class AsyncTaskC0184b extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: b */
        public static final long f934b = 604800000;

        /* JADX INFO: renamed from: c */
        public static final long f935c = 604800000;

        /* JADX INFO: renamed from: d */
        public static final long f936d = 86400000;

        /* JADX INFO: renamed from: a */
        public final Context f937a;

        public AsyncTaskC0184b(Context context) {
            this.f937a = context.getApplicationContext();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m801b(File file) {
            return file.getName().endsWith("..png");
        }

        /* JADX INFO: renamed from: c */
        public static boolean m802c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, System.currentTimeMillis()) + f935c;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f937a.getSharedPreferences(this.f937a.getPackageName() + BrowserServiceFileProvider.AUTHORITY_SUFFIX, 0);
            if (!m802c(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    File file = new File(this.f937a.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
                    if (!file.exists()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    long jCurrentTimeMillis = System.currentTimeMillis() - f934b;
                    boolean z = true;
                    for (File file2 : fileArrListFiles) {
                        if (m801b(file2) && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                            Log.e(BrowserServiceFileProvider.TAG, "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    long jCurrentTimeMillis2 = z ? System.currentTimeMillis() : (System.currentTimeMillis() - f935c) + f936d;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, jCurrentTimeMillis2);
                    editorEdit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$c */
    public static class AsyncTaskC0185c extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: a */
        public final Context f938a;

        /* JADX INFO: renamed from: b */
        public final String f939b;

        /* JADX INFO: renamed from: c */
        public final Bitmap f940c;

        /* JADX INFO: renamed from: d */
        public final Uri f941d;

        /* JADX INFO: renamed from: e */
        public final qvc0<Uri> f942e;

        public AsyncTaskC0185c(Context context, String str, Bitmap bitmap, Uri uri, qvc0<Uri> qvc0Var) {
            this.f938a = context.getApplicationContext();
            this.f939b = str;
            this.f940c = bitmap;
            this.f941d = uri;
            this.f942e = qvc0Var;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            m807d();
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r2) {
            new AsyncTaskC0184b(this.f938a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        /* JADX INFO: renamed from: c */
        public final void m806c(File file) {
            FileOutputStream fileOutputStreamM104970d;
            c31 c31Var = new c31(file);
            try {
                fileOutputStreamM104970d = c31Var.m104970d();
                try {
                    this.f940c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamM104970d);
                    fileOutputStreamM104970d.close();
                    c31Var.m104969b(fileOutputStreamM104970d);
                    this.f942e.set(this.f941d);
                } catch (IOException e) {
                    e = e;
                    c31Var.m104968a(fileOutputStreamM104970d);
                    this.f942e.setException(e);
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStreamM104970d = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m807d() {
            File file = new File(this.f938a.getFilesDir(), BrowserServiceFileProvider.FILE_SUB_DIR);
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.f942e.setException(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.f939b + BrowserServiceFileProvider.FILE_EXTENSION);
                    if (file2.exists()) {
                        this.f942e.set(this.f941d);
                    } else {
                        m806c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static Uri generateUri(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + AUTHORITY_SUFFIX).path(FILE_SUB_DIR_NAME + str + FILE_EXTENSION).build();
    }

    public static void grantReadPermission(@NonNull Intent intent, @Nullable List<Uri> list, @NonNull Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData clipDataNewUri = ClipData.newUri(contentResolver, CLIP_DATA_LABEL, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipDataNewUri.addItem(new ClipData.Item(list.get(i)));
        }
        intent.setClipData(clipDataNewUri);
    }

    @NonNull
    public static gnr<Bitmap> loadBitmap(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        qvc0 qvc0VarM176696a = qvc0.m176696a();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC0183a(contentResolver, uri, qvc0VarM176696a));
        return qvc0VarM176696a;
    }

    @NonNull
    @UiThread
    public static qvc0<Uri> saveBitmap(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i) {
        String str2 = str + "_" + Integer.toString(i);
        Uri uriGenerateUri = generateUri(context, str2);
        qvc0<Uri> qvc0VarM176696a = qvc0.m176696a();
        new AsyncTaskC0185c(context, str2, bitmap, uriGenerateUri, qvc0VarM176696a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return qvc0VarM176696a;
    }
}
