package com.tencent.youtu.sdkkitframework.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.aqg0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class YTImageData {

    /* JADX INFO: renamed from: a */
    public static final String f61411a = "YTImageData";

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f61412b = true;
    public String checksum;
    public int height;
    public byte[] imgData;
    public String imgDataBase64;
    public long timeStamp;
    public int width;

    public YTImageData(byte[] bArr, int i, int i2) {
        this.imgData = bArr;
        this.width = i;
        this.height = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m85807a(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i = 0;
        int i2 = length % 3 != 0 ? 1 : 0;
        int i3 = (length / 3) + i2;
        int[] iArr = new int[i3];
        if (i2 == 0) {
            while (i < i3) {
                int i4 = i * 3;
                iArr[i] = ((bArr[i4 + 2] << Tnaf.POW_2_WIDTH) & 16711680) | (bArr[i4] & 255) | ((bArr[i4 + 1] << 8) & 65280) | RoundedDrawable.DEFAULT_BORDER_COLOR;
                i++;
            }
            return iArr;
        }
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                iArr[i5] = -16777216;
                return iArr;
            }
            int i6 = i * 3;
            iArr[i] = ((bArr[i6 + 2] << Tnaf.POW_2_WIDTH) & 16711680) | (bArr[i6] & 255) | ((bArr[i6 + 1] << 8) & 65280) | RoundedDrawable.DEFAULT_BORDER_COLOR;
            i++;
        }
    }

    public Bitmap bgr2Bitmap() {
        int[] iArrM85807a = m85807a(this.imgData);
        if (f61412b || iArrM85807a != null) {
            int i = this.width;
            return Bitmap.createBitmap(iArrM85807a, 0, i, i, this.height, Bitmap.Config.ARGB_8888);
        }
        aqg0.m99478a();
        return null;
    }

    public byte[] bgr2JPEG(int i) {
        int[] iArrM85807a = m85807a((byte[]) this.imgData.clone());
        if (!f61412b && iArrM85807a == null) {
            aqg0.m99478a();
            return null;
        }
        int i2 = this.width;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrM85807a, 0, i2, i2, this.height, Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            YtLogger.m85809e(f61411a, "close error", e);
            return byteArray;
        }
    }

    public Object clone() {
        YTImageData yTImageData = new YTImageData();
        yTImageData.imgData = (byte[]) this.imgData.clone();
        yTImageData.width = this.width;
        yTImageData.height = this.height;
        return yTImageData;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getImgData() {
        return this.imgData;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImgData(byte[] bArr) {
        this.imgData = bArr;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("img", this.imgData);
            jSONObject.put("checksum", this.checksum);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.m85809e(f61411a, "video data tojson error", e);
            return new JSONObject();
        }
    }

    public JSONObject toJSON64Img() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("img", this.imgDataBase64);
            jSONObject.put("checksum", this.checksum);
            return jSONObject;
        } catch (JSONException e) {
            YtLogger.m85809e(f61411a, "video data tojson error", e);
            return new JSONObject();
        }
    }

    public String toString() {
        return "ImageData{imgDataSize=" + this.imgData.length + ", width=" + this.width + ", height=" + this.height + '}';
    }

    public void writeImg2LocalDisk(Bitmap bitmap, String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FileUtils.createFile(str, str2));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public Bitmap yuv2Bitmap() {
        YuvImage yuvImage = new YuvImage(this.imgData, 17, this.width, this.height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 95, byteArrayOutputStream);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        try {
            byteArrayOutputStream.close();
            return bitmapDecodeByteArray;
        } catch (IOException e) {
            YtLogger.m85809e(f61411a, "close error", e);
            return bitmapDecodeByteArray;
        }
    }

    public YTImageData() {
    }

    public YTImageData(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.imgDataBase64 = str;
    }

    public byte[] bgr2JPEG() {
        return bgr2JPEG(100);
    }
}
