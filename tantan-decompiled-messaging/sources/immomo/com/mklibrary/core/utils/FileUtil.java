package immomo.com.mklibrary.core.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.b0g0;
import p149l.m200;
import p149l.rdc0;
import p149l.shw;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FileUtil extends com.immomo.mmutil.FileUtil {
    private static final String DCIM;
    private static String DirectoryName = null;
    public static final int FLAG_IMAGE = 1;
    public static final int FLAG_VIDEO = 2;
    private static String cameraRootDir;
    private static MediaScannerConnection sMediaScannerConnection;

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.utils.FileUtil$a */
    public class C14923a implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f63302a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f63303b;

        public C14923a(int i, String str) {
            this.f63302a = i;
            this.f63303b = str;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            String strM87156s;
            int i = this.f63302a;
            if (1 == i) {
                strM87156s = FileUtil.m87155r(this.f63303b);
            } else {
                strM87156s = 2 == i ? FileUtil.m87156s(this.f63303b) : "";
            }
            try {
                FileUtil.sMediaScannerConnection.scanFile(this.f63303b, strM87156s);
            } catch (Exception unused) {
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            FileUtil.sMediaScannerConnection.disconnect();
        }
    }

    static {
        String string = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString();
        DCIM = string;
        cameraRootDir = string + File.separator + MDLogTag.MOMENT_CAMERA_TAG;
        DirectoryName = "MOMO";
        try {
            try {
                System.loadLibrary("sevenz");
            } catch (Throwable th) {
                MDLog.printErrStackTrace("FileUtil", th);
            }
        } catch (Throwable unused) {
            rdc0.m178959a(shw.m184283c(), "sevenz");
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m87154q(Context context, File file, String str) throws Throwable {
        if (str.endsWith(".jpg_") || str.endsWith(".png_")) {
            str = str.substring(0, str.length() - 1);
        }
        if (Build.VERSION.SDK_INT < 29) {
            File file2 = new File(cameraRootDir, str);
            if (file2.exists() || file == null || !file.exists()) {
                return;
            }
            try {
                com.immomo.mmutil.FileUtil.m18404a(file, file2);
                m87158u(context, file2);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        String strM152647c = m200.m152647c(str);
        if (b0g0.m99772e(strM152647c)) {
            contentValues.put("mime_type", strM152647c);
        }
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + DirectoryName);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null || file == null || !file.exists()) {
            return;
        }
        try {
            com.immomo.mmutil.FileUtil.m18405b(new FileInputStream(file), context.getContentResolver().openOutputStream(uriInsert));
        } catch (IOException e) {
            MDLog.printErrStackTrace("MK_FileUtil", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static String m87155r(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("jpg") && !lowerCase.endsWith("jpeg")) {
            if (lowerCase.endsWith("png")) {
                return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
            }
            if (lowerCase.endsWith("gif")) {
                return "image/gif";
            }
        }
        return DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static String m87156s(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.endsWith("mp4") || lowerCase.endsWith("mpeg4") || lowerCase.endsWith("mp4_") || !lowerCase.endsWith("3gp")) ? DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4 : "video/3gp";
    }

    /* JADX INFO: renamed from: t */
    private static void m87157t(Context context, long j, File file) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", file.getName());
        contentValues.put("_display_name", file.getName());
        contentValues.put("mime_type", m87155r(file.getAbsolutePath()));
        contentValues.put("datetaken", Long.valueOf(j));
        contentValues.put("date_added", Long.valueOf(j));
        contentValues.put("date_modified", Long.valueOf(j));
        contentValues.put(Constants.KEY_ORIENTATION, (Integer) 0);
        contentValues.put("_data", file.getAbsolutePath());
        contentValues.put("_size", Long.valueOf(file.length()));
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        m87159v(context, 1, file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: u */
    private static void m87158u(Context context, File file) {
        m87157t(context, System.currentTimeMillis(), file);
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file));
        intent.addFlags(1);
        context.sendBroadcast(intent);
    }

    private static native int un7zip(String str, String str2);

    /* JADX INFO: renamed from: v */
    private static void m87159v(Context context, int i, String str) {
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context, new C14923a(i, str));
        sMediaScannerConnection = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m87160w(File file, String str) {
        File file2 = new File(str);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return un7zip(file.getAbsolutePath(), str) == 0;
    }
}
