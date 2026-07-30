package com.p074ss.bytertc.engine;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.realx.base.CalledByNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class TranscodingDataManager {
    private static Context mContext;

    public static void SetContext(Context context) {
        mContext = context;
    }

    @CalledByNative
    public static byte[] getCompressImageBuf(ByteBuffer byteBuffer, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static native void nativeEndProcessRoomRegionTranscodingData(String str);

    public static native void nativeProcessRoomRegionTranscodingData(int i, String str, String str2, byte[] bArr, int i2, int i3);

    public static native void nativeStartProcessRoomRegionTranscodingData(String str);
}
