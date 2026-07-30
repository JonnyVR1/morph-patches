package com.core.glcore.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import com.cosmos.mdlog.MDLog;
import com.momocv.imgloader.ImageLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p153l.erf0;
import p153l.nmw;
import p153l.p7f;
import p153l.umw;

/* JADX INFO: loaded from: classes.dex */
public class ImageUtils {
    private static final String TAG = "ImageUtils";

    public static Bitmap addIconToBackground(Context context, int i, Bitmap bitmap) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        if (!bitmapDecodeResource.isMutable()) {
            bitmapDecodeResource = bitmapDecodeResource.copy(Bitmap.Config.ARGB_8888, true);
        }
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapDecodeResource);
        int width = bitmapDecodeResource.getWidth();
        int height = bitmapDecodeResource.getHeight();
        int i2 = width - 20;
        int i3 = height - 20;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect((width - i2) / 2, (height - i3) / 2, i2, i3), paint);
        canvas.save();
        canvas.restore();
        return bitmapDecodeResource;
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap createEmotionBitMap(int i, int i2, Bitmap bitmap) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f = i / i2;
        int i3 = (int) width;
        int i4 = (int) (width / f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(125);
        int i5 = (int) ((i4 - height) / 2.0f);
        canvas.drawBitmap(bitmap, new Rect(0, 0, i3, i4), new Rect(0, i5, i3, i4 + i5), (Paint) null);
        return bitmapCreateBitmap;
    }

    public static Bitmap decodeBitmap(String str, int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        float fMax = Math.min(i3, i2) < i ? 1.0f : Math.max(i2, i3) / i;
        if (fMax < 0.0f && !z) {
            return BitmapFactory.decodeFile(str);
        }
        options.inSampleSize = (int) fMax;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (bitmapDecodeFile == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmapDecodeFile, (int) (i2 / fMax), (int) (i3 / fMax), true);
    }

    public static Bitmap decodeBitmapWithUri(Uri uri, Context context, int i, boolean z) {
        return decodeBitmap(getRealPathFromUri(uri, context), i, true);
    }

    public static void decodeMMCVImage(umw umwVar, String str) {
        if (!FileUtil.exist(str)) {
            MDLog.m7445e("ImageUtil", "File [" + str + "] not exist! Just return ");
            return;
        }
        if (umwVar == null) {
            MDLog.m7445e("ImageUtil", "Decode one Image Error , mmcvImage is null");
            return;
        }
        ImageFrame imageFrameImageLoad = PngImageDecoder.imageLoad(str, umwVar.m196798d());
        if (imageFrameImageLoad == null) {
            MDLog.m7445e("ImageUtil", "Decode one Image failed");
            return;
        }
        umwVar.m196807m(imageFrameImageLoad.getWidth());
        umwVar.m196804j(imageFrameImageLoad.getHeight());
        umwVar.m196806l(imageFrameImageLoad.getWidth());
        umwVar.m196805k(imageFrameImageLoad);
    }

    public static void decodeMMCVImage2(umw umwVar, String str) {
        nmw nmwVar = new nmw();
        nmwVar.m163844d(4);
        ImageLoader.Load(str, nmwVar.m163842b(), nmwVar.m163841a());
        if (nmwVar.m163843c() != null) {
            if (umwVar != null) {
                umwVar.m196803i(nmwVar.m163843c());
            } else {
                MDLog.m7445e("ImageUtil", "Decode one Image Error , mmcvImage is null");
            }
        }
    }

    public static int getBitmapDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(p7f.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            MDLog.printErrStackTrace("getImageSpinAngle", e);
            return 0;
        }
    }

    public static Bitmap getBitmapFromView(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private static Rect getBitmapRectCenterInsideHelper(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        long jRound;
        int i5;
        double d3 = i3 < i ? ((double) i3) / ((double) i) : Double.POSITIVE_INFINITY;
        double d4 = i4 < i2 ? ((double) i4) / ((double) i2) : Double.POSITIVE_INFINITY;
        if (d3 == Double.POSITIVE_INFINITY && d4 == Double.POSITIVE_INFINITY) {
            d = i2;
            d2 = i;
        } else if (d3 <= d4) {
            double d5 = i3;
            d = (((double) i2) * d5) / ((double) i);
            d2 = d5;
        } else {
            d = i4;
            d2 = (((double) i) * d) / ((double) i2);
        }
        double d6 = i3;
        int iRound = 0;
        if (d2 != d6) {
            double d7 = i4;
            if (d == d7) {
                iRound = (int) Math.round((d6 - d2) / 2.0d);
                i5 = 0;
            } else {
                iRound = (int) Math.round((d6 - d2) / 2.0d);
                jRound = Math.round((d7 - d) / 2.0d);
            }
            return new Rect(iRound, i5, ((int) Math.ceil(d2)) + iRound, ((int) Math.ceil(d)) + i5);
        }
        jRound = Math.round((((double) i4) - d) / 2.0d);
        i5 = (int) jRound;
        return new Rect(iRound, i5, ((int) Math.ceil(d2)) + iRound, ((int) Math.ceil(d)) + i5);
    }

    public static erf0 getBitmapSize(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new erf0(options.outWidth, options.outHeight);
    }

    public static int getBitmapWidth(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return options.outWidth;
    }

    public static Bitmap getCroppedImage(Bitmap bitmap, int i, int i2) {
        float f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = i / i2;
        float f3 = 0.0f;
        if (width / height > f2) {
            float f4 = f2 * height;
            float f5 = (width - f4) / 2.0f;
            width = f4;
            f = 0.0f;
            f3 = f5;
        } else {
            float f6 = width / f2;
            float f7 = (height - f6) / 2.0f;
            height = f6;
            f = f7;
        }
        return Bitmap.createBitmap(bitmap, (int) f3, (int) f, (int) width, (int) height);
    }

    public static HashMap<String, String> getExifInfo(ExifInterface exifInterface) throws IllegalAccessException {
        Field[] fields = ExifInterface.class.getFields();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < fields.length; i++) {
            String name = fields[i].getName();
            if (!TextUtils.isEmpty(name) && name.startsWith("TAG")) {
                String string = fields[i].get(ExifInterface.class).toString();
                map.put(string, exifInterface.getAttribute(string));
            }
        }
        return map;
    }

    public static float getFitScreenScale(Bitmap bitmap, int i) {
        return bitmap.getWidth() / i;
    }

    public static int getImageOrientation(String str) throws IOException {
        int attributeInt = new ExifInterface(str).getAttributeInt(p7f.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public static String getRealPathFromUri(Uri uri, Context context) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
        cursorQuery.moveToFirst();
        return cursorQuery.getString(columnIndexOrThrow);
    }

    public static Bitmap getScaleBitmap(String str, int i, int i2) {
        return loadResizedImage(new File(str), i, i2);
    }

    public static int[] getScaleSizeOfBitMap(String str) {
        int i;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int i3 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapFactory.decodeStream(new FileInputStream(str), null, options);
            i2 = options.outWidth;
            try {
                i3 = options.outHeight;
                fileInputStream.close();
            } catch (IOException e) {
                e = e;
                int i4 = i3;
                i3 = i2;
                i = i4;
                e.printStackTrace();
                int i5 = i3;
                i3 = i;
                i2 = i5;
            }
        } catch (IOException e2) {
            e = e2;
            i = 0;
        }
        return new int[]{i2, i3};
    }

    @SuppressLint({"NewApi"})
    public static int getScreenHeight(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    @SuppressLint({"NewApi"})
    public static int getScreenWidth(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public static boolean isEdgeColorBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (width + height) * 2;
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < width; i3++) {
            iArr[i2] = rgbToGray(bitmap.getPixel(i3, 0));
            iArr[i2 + 1] = rgbToGray(bitmap.getPixel(i3, height - 1));
            i2 += 2;
        }
        for (int i4 = 0; i4 < height; i4++) {
            iArr[i2] = rgbToGray(bitmap.getPixel(0, i4));
            iArr[i2 + 1] = rgbToGray(bitmap.getPixel(width - 1, i4));
            i2 += 2;
        }
        int[] iArr2 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr2[i5] = 0;
        }
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = iArr[i6];
            iArr2[i7] = iArr2[i7] + 1;
        }
        Arrays.sort(iArr2);
        int i8 = 0;
        for (int i9 = 255; i9 > 252; i9--) {
            i8 += iArr2[i9];
        }
        return ((double) (((float) i8) / ((float) i))) > 0.3d;
    }

    public static Bitmap loadResizedImage(File file, int i, int i2) {
        Bitmap bitmapDecodeFile;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i3 = 1;
        while (true) {
            if (options.outWidth / i3 <= i && options.outHeight / i3 <= i2) {
                break;
            }
            i3++;
        }
        if (i3 > 1) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i3 - 1;
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options2.inPurgeable = true;
            Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
            if (bitmapDecodeFile2 == null) {
                return null;
            }
            double width = bitmapDecodeFile2.getWidth();
            double d = i;
            double d2 = width / d;
            double height = bitmapDecodeFile2.getHeight();
            double d3 = i2;
            if (d2 < height / d3) {
                d = (d3 / height) * width;
            } else {
                d3 = (d / width) * height;
            }
            bitmapDecodeFile = Bitmap.createScaledBitmap(bitmapDecodeFile2, Math.round((float) d), Math.round((float) d3), true);
            bitmapDecodeFile2.recycle();
            System.gc();
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        return rotateImage(bitmapDecodeFile, file);
    }

    public static Bitmap optimizeImageSize(File file, int i, int i2) {
        int i3;
        int i4;
        float f;
        Bitmap bitmapDecodeFile;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        if (i6 > i5) {
            i4 = i6;
            i3 = i5;
        } else {
            i3 = i6;
            i4 = i5;
        }
        if (i4 >= i2) {
            f = i4 / i2;
        } else {
            f = i3 > i ? i3 / i : 1.0f;
        }
        int i7 = (int) (i6 / f);
        int i8 = (int) (i5 / f);
        if (f > 2.0f) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = (int) f;
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, i7, i8, true);
        if (!bitmapDecodeFile.equals(bitmapCreateScaledBitmap) && !bitmapDecodeFile.isRecycled()) {
            bitmapDecodeFile.recycle();
        }
        if (bitmapCreateScaledBitmap == null || bitmapCreateScaledBitmap.isRecycled()) {
            bitmapCreateScaledBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
        }
        return rotateImage(bitmapCreateScaledBitmap, file);
    }

    public static int rgbToGray(int i) {
        return (int) ((((16711680 & i) >> 16) * 0.299f) + (((65280 & i) >> 8) * 0.587f) + ((i & 255) * 0.114f));
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, float f) {
        if (bitmap == null || f == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap rotateImage(Bitmap bitmap, File file) {
        IOException iOException;
        if (bitmap == null) {
            return null;
        }
        try {
            int imageOrientation = getImageOrientation(file.getAbsolutePath());
            if (imageOrientation == 0) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(imageOrientation);
            try {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                try {
                    bitmap.recycle();
                    return bitmap;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                iOException = e2;
                bitmap = bitmap;
            }
        } catch (IOException e3) {
            e = e3;
        }
        iOException = e;
        iOException.printStackTrace();
        return bitmap;
    }

    public static boolean saveImage(Bitmap bitmap, int i, File file) {
        if (file == null) {
            MDLog.m7445e(TAG, "Error creating media file, check storage permissions: ");
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            MDLog.m7445e(TAG, "File not found: " + e.getMessage());
            return false;
        } catch (IOException e2) {
            MDLog.m7445e(TAG, "Error accessing file: " + e2.getMessage());
            return false;
        }
    }

    public static void storeImage(Bitmap bitmap, File file) {
        if (file == null) {
            MDLog.m7443d(TAG, "Error creating media file, check storage permissions: ");
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            MDLog.m7445e(TAG, "File not found: " + e.getMessage());
        } catch (IOException e2) {
            MDLog.m7445e(TAG, "Error accessing file: " + e2.getMessage());
        }
    }

    public static void storeImageToSystemLib(Bitmap bitmap, Context context) {
        MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "title", "description");
    }

    public static Bitmap decodeBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (Math.max(width, height) <= i) {
            return bitmap;
        }
        float fMax = Math.max(width, height) / i;
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
