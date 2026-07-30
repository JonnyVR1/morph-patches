package com.core.glcore.util;

import android.graphics.Bitmap;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import p153l.mnd0;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
public class BitmapPrivateProtocolUtil {
    private static final int HEAD_SIZE = 20;
    private static final int MAX_IMAGE_WIDTH = 2560;

    public static class BitmapContent {
        public HashMap<String, String> exif;
        public Bitmap mBitmap;

        public Bitmap getBitmap() {
            return this.mBitmap;
        }

        public HashMap<String, String> getExifMap() {
            return this.exif;
        }

        public void setBitmap(Bitmap bitmap) {
            this.mBitmap = bitmap;
        }

        public void setExifMap(HashMap<String, String> map) {
            this.exif = map;
        }
    }

    public static class BitmapInfo {
        public int colorSpace;
        public int dataSize;
        public int exifSize;
        public int height;
        public int width;

        private int convert(byte[] bArr, int i) {
            int i2 = i * 4;
            return (bArr[i2 + 3] & 255) | ((bArr[i2 + 2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
        }

        public byte[] getBytes() {
            return ByteBuffer.allocate(20).putInt(this.width).putInt(this.height).putInt(this.colorSpace).putInt(this.dataSize).putInt(this.exifSize).array();
        }

        public void setData(byte[] bArr) {
            this.width = convert(bArr, 0);
            this.height = convert(bArr, 1);
            this.colorSpace = convert(bArr, 2);
            this.dataSize = convert(bArr, 3);
            this.exifSize = convert(bArr, 4);
        }
    }

    public static Bitmap getBitmap(String str) {
        Bitmap bitmapCreateBitmap;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapInfo bitmapInfo = getBitmapInfo(fileInputStream);
            if (bitmapInfo != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapInfo.dataSize);
                fileInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length);
                Bitmap.Config[] configArrValues = Bitmap.Config.values();
                int i = bitmapInfo.colorSpace;
                if (i < 0) {
                    i = 0;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapInfo.width, bitmapInfo.height, configArrValues[i]);
                byteBufferAllocate.position(0);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
            } else {
                bitmapCreateBitmap = null;
            }
            fileInputStream.close();
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BitmapContent getBitmapContent(String str) {
        BitmapContent bitmapContent = new BitmapContent();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapInfo bitmapInfo = getBitmapInfo(fileInputStream);
            if (bitmapInfo != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapInfo.dataSize);
                fileInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length);
                Bitmap.Config[] configArrValues = Bitmap.Config.values();
                int i = bitmapInfo.colorSpace;
                if (i < 0) {
                    i = 0;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapInfo.width, bitmapInfo.height, configArrValues[i]);
                byteBufferAllocate.position(0);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                bitmapContent.setBitmap(bitmapCreateBitmap);
                String stringFromStream = readStringFromStream(fileInputStream, null);
                if (stringFromStream != null && stringFromStream.length() > 0) {
                    bitmapContent.setExifMap((HashMap) JsonUtil.getInstance().fromJson(stringFromStream, HashMap.class));
                }
            }
            fileInputStream.close();
            return bitmapContent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static BitmapInfo getBitmapInfo(FileInputStream fileInputStream) {
        try {
            byte[] bArr = new byte[20];
            fileInputStream.read(bArr);
            BitmapInfo bitmapInfo = new BitmapInfo();
            bitmapInfo.setData(bArr);
            int i = bitmapInfo.dataSize;
            if (i != 0) {
                int i2 = bitmapInfo.width;
                int i3 = bitmapInfo.height;
                if (i == i2 * i3 * 4 && i2 >= 0 && i3 >= 0) {
                    return bitmapInfo;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int getIntValueFromMap(HashMap<String, String> map, String str) {
        String str2;
        if (map == null || map.size() <= 0 || str == null || str.length() <= 0 || !map.containsKey(str) || (str2 = map.get(str)) == null || str2.length() <= 0) {
            return 0;
        }
        return new Integer(str2).intValue();
    }

    public static String readStringFromStream(InputStream inputStream, String str) {
        String line = "";
        if (str != null) {
            try {
                if (str.equals("")) {
                    str = "utf-8";
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return line;
            } catch (IOException e2) {
                e2.printStackTrace();
                return line;
            }
        } else {
            str = "utf-8";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                return stringBuffer.toString();
            }
            stringBuffer.append(line);
            stringBuffer.append(SignParameters.NEW_LINE);
        }
    }

    public static void saveBitmap(String str, Bitmap bitmap, HashMap<String, String> map) throws Exception {
        if (str == null || bitmap == null) {
            mnd0.m159157a("Bitmap or path is null");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        BitmapInfo bitmapInfo = new BitmapInfo();
        bitmapInfo.width = bitmap.getWidth();
        bitmapInfo.height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        bitmapInfo.colorSpace = config == null ? -1 : config.ordinal();
        bitmapInfo.dataSize = bitmap.getWidth() * bitmap.getHeight() * 4;
        int intValueFromMap = getIntValueFromMap(map, p7f.TAG_PIXEL_X_DIMENSION);
        int intValueFromMap2 = getIntValueFromMap(map, p7f.TAG_PIXEL_Y_DIMENSION);
        int intValueFromMap3 = getIntValueFromMap(map, p7f.TAG_THUMBNAIL_IMAGE_WIDTH);
        int intValueFromMap4 = getIntValueFromMap(map, p7f.TAG_THUMBNAIL_IMAGE_LENGTH);
        int intValueFromMap5 = getIntValueFromMap(map, p7f.TAG_IMAGE_WIDTH);
        int intValueFromMap6 = getIntValueFromMap(map, p7f.TAG_IMAGE_LENGTH);
        int i = bitmapInfo.width;
        if ((i != intValueFromMap5 || bitmapInfo.height != intValueFromMap6) && intValueFromMap6 > 0 && intValueFromMap6 > 0) {
            float f = intValueFromMap5;
            float f2 = (f * 1.0f) / intValueFromMap6;
            int i2 = bitmapInfo.height;
            float f3 = (i * 1.0f) / i2;
            float f4 = (intValueFromMap3 * 1.0f) / f;
            int i3 = (int) (i * f4);
            int i4 = (int) (i2 * f4);
            if (i3 > 0 && i4 > 0 && (intValueFromMap3 > i || intValueFromMap4 > i2 || f2 != f3)) {
                map.put(p7f.TAG_THUMBNAIL_IMAGE_WIDTH, String.valueOf(i3));
                map.put(p7f.TAG_THUMBNAIL_IMAGE_LENGTH, String.valueOf(i4));
            }
            map.put(p7f.TAG_IMAGE_WIDTH, String.valueOf(bitmapInfo.width));
            map.put(p7f.TAG_IMAGE_LENGTH, String.valueOf(bitmapInfo.height));
            if (intValueFromMap2 > 0 && intValueFromMap > 0) {
                map.put(p7f.TAG_PIXEL_X_DIMENSION, String.valueOf(bitmapInfo.width));
                map.put(p7f.TAG_PIXEL_Y_DIMENSION, String.valueOf(bitmapInfo.height));
            }
        }
        String json = (map == null || map.size() <= 0) ? null : JsonUtil.getInstance().toJson(map);
        if (json != null) {
            bitmapInfo.exifSize = json.getBytes().length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(bitmapInfo.getBytes());
        byteBufferAllocate.position(0);
        fileOutputStream.write(byteBufferAllocate.array());
        if (json != null && json.length() > 0) {
            fileOutputStream.write(json.getBytes());
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public static void saveBitmap(String str, Bitmap bitmap) throws Exception {
        saveBitmap(str, bitmap, null);
    }
}
