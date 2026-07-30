package com.tencent.could.component.common.p079ai.utils;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
public class ImageCompressUtils {
    public static final int DEFAULT_LEVEL = 1;
    public static final int MINIMUM_LEVEL = 2;

    public static byte[] compressBitmap(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5 = 88;
        int i6 = i2 == 88 ? 85 : 88;
        if (i2 == 2) {
            i4 = i;
            i3 = 5;
        } else {
            i3 = 10;
            i5 = i6;
            i4 = 1024;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream);
                while (byteArrayOutputStream.toByteArray().length / 1024 > i4 && i5 > 5) {
                    byteArrayOutputStream.reset();
                    i5 -= i3;
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.e("ImageCompressUtils", "compressBitmap io error: " + e.getLocalizedMessage());
            return null;
        }
    }

    public static Bitmap createBitMapByUri(Context context, Uri uri, int i, Point point) {
        int iMin;
        if (i != 2 || point == null) {
            iMin = 2;
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                int i4 = point.x;
                iMin = Math.min(i2 / i4, i3 / i4);
            } catch (FileNotFoundException e) {
                Log.e("ImageCompressUtils", "getCurrentSampleSize e: " + e.getLocalizedMessage());
                iMin = 2;
            }
            if (iMin > 5) {
                iMin = 5;
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i == 2) {
            options2.inSampleSize = iMin;
        }
        return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options2);
    }

    public static byte[] doCompressYuvImage(YuvImage yuvImage, int i) {
        int width = yuvImage.getWidth();
        int height = yuvImage.getHeight();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (i == 1) {
                    yuvImage.compressToJpeg(new Rect(0, 0, width, height), 88, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                if (i != 2) {
                    byteArrayOutputStream.close();
                    return null;
                }
                yuvImage.compressToJpeg(new Rect(0, 0, width, height), 88, byteArrayOutputStream);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inSampleSize = 2;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options);
                byteArrayOutputStream.reset();
                bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Log.e("ImageCompressUtils", "Compress error");
            return null;
        }
    }

    public static byte[] doCompressYuvImageByQuality(YuvImage yuvImage, int i) {
        int iMax = Math.max(0, Math.min(100, i));
        int width = yuvImage.getWidth();
        int height = yuvImage.getHeight();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, width, height), iMax, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Log.e("ImageCompressUtils", "Compress error");
            return null;
        }
    }

    public static int getBitmapDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(j6f.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            Log.e("ImageCompressUtils", "getBitmapDegree error : " + e.getLocalizedMessage());
            return 0;
        }
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (isMediaDocument(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static Bitmap rotateBitmapByDegree(Bitmap bitmap, int i) {
        Bitmap bitmap2;
        Bitmap bitmapCreateBitmap;
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmap2 = bitmap;
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (OutOfMemoryError unused) {
                bitmapCreateBitmap = null;
            }
        } catch (OutOfMemoryError unused2) {
            bitmap2 = bitmap;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap2;
        }
        if (bitmap2 != bitmapCreateBitmap) {
            bitmap2.recycle();
        }
        return bitmapCreateBitmap;
    }
}
