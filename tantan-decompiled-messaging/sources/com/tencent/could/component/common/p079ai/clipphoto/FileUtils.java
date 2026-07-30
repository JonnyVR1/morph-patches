package com.tencent.could.component.common.p079ai.clipphoto;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    public static final int ANDROID_R = 30;
    public static final String TAG = "FileUtils";
    public static Uri uri;

    public static File createImageFile(Context context, boolean z) {
        String str;
        try {
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            if (z) {
                str = "txc_ocr_" + str2 + "_crop.jpg";
            } else {
                str = "txc_ocr_" + str2 + ".jpg";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(getAppRootDirPath(context));
            String str3 = File.separator;
            sb.append(str3);
            sb.append("capture");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            if (Build.VERSION.SDK_INT < 30) {
                return new File(file.getAbsolutePath() + str3 + str);
            }
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + str3 + str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", file2.getAbsolutePath());
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
            uri = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            return file2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteFile(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    public static File getAppRootDirPath(Context context) {
        return context.getExternalFilesDir(null).getAbsoluteFile();
    }
}
