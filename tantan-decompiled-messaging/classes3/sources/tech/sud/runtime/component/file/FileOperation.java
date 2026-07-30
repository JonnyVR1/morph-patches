package tech.sud.runtime.component.file;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import tech.sud.runtime.core.C1236b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FileOperation {
    /* JADX INFO: renamed from: a */
    public static void m10275a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m10275a(file2);
                    try {
                        file2.delete();
                    } catch (Exception unused) {
                    }
                } else if (file2.exists()) {
                    m10275a(file2);
                    file2.delete();
                }
            }
        }
    }

    public static float getMediaDuration(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (str.startsWith("/")) {
                mediaMetadataRetriever.setDataSource(str);
            } else {
                AssetFileDescriptor assetFileDescriptorOpenFd = C1236b.m10405b().getAssets().openFd(str);
                mediaMetadataRetriever.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            }
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) * 0.001f;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static void saveImageDataToAlbum(String str, byte[] bArr) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        if (file.exists() || file.mkdirs()) {
            try {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (bitmapDecodeByteArray == null) {
                    return;
                }
                File file2 = new File(file, str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriFromFile = Uri.fromFile(file2);
                Context contextM10405b = C1236b.m10405b();
                if (contextM10405b != null) {
                    contextM10405b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriFromFile));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
