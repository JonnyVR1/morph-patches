package com.p069ss.bytertc.engine.live;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.realx.base.CalledByNative;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class TranscodingDataManager {
    private static Context mContext;

    public static void SetContext(Context context) {
        mContext = context;
    }

    @CalledByNative
    public static byte[] getCompressImageBuf(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        byteBuffer.rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
