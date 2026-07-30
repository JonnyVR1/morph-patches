package com.sina.weibo.sdk.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import p153l.wg3;
import p153l.zpg0;

/* JADX INFO: loaded from: classes11.dex */
public class ImageUtils {
    private static void delete(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        throw new RuntimeException(file.getAbsolutePath() + " doesn't be deleted!");
    }

    private static boolean deleteDependon(String str) {
        boolean zDelete = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        int i = 1;
        while (!zDelete && i <= 5 && file.isFile() && file.exists()) {
            zDelete = file.delete();
            if (!zDelete) {
                i++;
            }
        }
        return zDelete;
    }

    @TargetApi(10)
    public static long getVideoDuring(String str) {
        if (!new File(str).exists()) {
            return 0L;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static boolean isFileExisted(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    private static boolean isParentExist(File file) {
        File parentFile;
        if (file == null || (parentFile = file.getParentFile()) == null || parentFile.exists()) {
            return false;
        }
        return file.exists() || file.mkdirs();
    }

    public static boolean isWifi(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    private static void makesureFileExist(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists() || !isParentExist(file)) {
            return;
        }
        if (file.exists()) {
            delete(file);
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void revitionImageSize(String str, int i, int i2) throws IOException {
        int i3;
        if (i <= 0) {
            wg3.m206174a("size must be greater than 0!");
            return;
        }
        if (!isFileExisted(str)) {
            if (str == null) {
                str = "null";
            }
            throw new FileNotFoundException(str);
        }
        if (!BitmapHelper.verifyBitmap(str)) {
            zpg0.m220844a("");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(fileInputStream, null, options);
        try {
            fileInputStream.close();
            while (true) {
                if ((options.outWidth >> i3) <= i && (options.outHeight >> i3) <= i) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        i3 = 0;
        options.inSampleSize = (int) Math.pow(2.0d, i3);
        options.inJustDecodeBounds = false;
        Bitmap bitmapSafeDecodeBimtapFile = safeDecodeBimtapFile(str, options);
        if (bitmapSafeDecodeBimtapFile == null) {
            zpg0.m220844a("Bitmap decode error!");
            return;
        }
        deleteDependon(str);
        makesureFileExist(str);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        String str2 = options.outMimeType;
        if (str2 == null || !str2.contains("png")) {
            bitmapSafeDecodeBimtapFile.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
        } else {
            bitmapSafeDecodeBimtapFile.compress(Bitmap.CompressFormat.PNG, i2, fileOutputStream);
        }
        try {
            fileOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        bitmapSafeDecodeBimtapFile.recycle();
    }

    private static void revitionImageSizeHD(String str, int i, int i2) throws IOException {
        int i3;
        Bitmap bitmapCreateBitmap;
        if (i <= 0) {
            wg3.m206174a("size must be greater than 0!");
            return;
        }
        if (!isFileExisted(str)) {
            if (str == null) {
                str = "null";
            }
            throw new FileNotFoundException(str);
        }
        if (!BitmapHelper.verifyBitmap(str)) {
            zpg0.m220844a("");
            return;
        }
        int i4 = i * 2;
        FileInputStream fileInputStream = new FileInputStream(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(fileInputStream, null, options);
        try {
            fileInputStream.close();
            while (true) {
                if ((options.outWidth >> i3) <= i4 && (options.outHeight >> i3) <= i4) {
                    break;
                } else {
                    i3++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        i3 = 0;
        options.inSampleSize = (int) Math.pow(2.0d, i3);
        options.inJustDecodeBounds = false;
        Bitmap bitmapSafeDecodeBimtapFile = safeDecodeBimtapFile(str, options);
        if (bitmapSafeDecodeBimtapFile == null) {
            zpg0.m220844a("Bitmap decode error!");
            return;
        }
        deleteDependon(str);
        makesureFileExist(str);
        float width = i / (bitmapSafeDecodeBimtapFile.getWidth() > bitmapSafeDecodeBimtapFile.getHeight() ? bitmapSafeDecodeBimtapFile.getWidth() : bitmapSafeDecodeBimtapFile.getHeight());
        if (width < 1.0f) {
            while (true) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmapSafeDecodeBimtapFile.getWidth() * width), (int) (bitmapSafeDecodeBimtapFile.getHeight() * width), Bitmap.Config.ARGB_8888);
                    break;
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    width = (float) (((double) width) * 0.8d);
                }
            }
            if (bitmapCreateBitmap == null) {
                bitmapSafeDecodeBimtapFile.recycle();
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            matrix.setScale(width, width);
            canvas.drawBitmap(bitmapSafeDecodeBimtapFile, matrix, new Paint());
            bitmapSafeDecodeBimtapFile.recycle();
            bitmapSafeDecodeBimtapFile = bitmapCreateBitmap;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        String str2 = options.outMimeType;
        if (str2 == null || !str2.contains("png")) {
            bitmapSafeDecodeBimtapFile.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
        } else {
            bitmapSafeDecodeBimtapFile.compress(Bitmap.CompressFormat.PNG, i2, fileOutputStream);
        }
        try {
            fileOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        bitmapSafeDecodeBimtapFile.recycle();
    }

    private static Bitmap safeDecodeBimtapFile(String str, BitmapFactory.Options options) {
        BitmapFactory.Options options2;
        FileInputStream fileInputStream;
        OutOfMemoryError e;
        if (options == null) {
            options2 = new BitmapFactory.Options();
            options2.inSampleSize = 1;
        } else {
            options2 = options;
        }
        int i = 0;
        Bitmap bitmapDecodeStream = null;
        FileInputStream fileInputStream2 = null;
        while (i < 5) {
            try {
                try {
                    fileInputStream = new FileInputStream(str);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                        try {
                            fileInputStream.close();
                            break;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            break;
                        }
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        e.printStackTrace();
                        options2.inSampleSize *= 2;
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        i++;
                        fileInputStream2 = fileInputStream;
                    }
                } catch (FileNotFoundException unused) {
                }
            } catch (OutOfMemoryError e5) {
                fileInputStream = fileInputStream2;
                e = e5;
            }
        }
        return bitmapDecodeStream;
    }
}
