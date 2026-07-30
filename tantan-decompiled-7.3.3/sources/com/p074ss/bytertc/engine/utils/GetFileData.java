package com.p074ss.bytertc.engine.utils;

import android.content.Context;
import android.net.Uri;
import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.base.utils.RtcContextUtils;
import io.agora.utils2.internal.CommonUtility;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class GetFileData {
    private static ByteBuffer convertDirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static ByteBuffer getAssets(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            if (inputStreamOpen == null) {
                return null;
            }
            byte[] bArr = new byte[inputStreamOpen.available()];
            int i = inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            if (i <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (IOException unused) {
            return null;
        }
    }

    public static ByteBuffer getOthers(Context context, String str) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            byte[] bArr = new byte[inputStreamOpenInputStream.available()];
            int i = inputStreamOpenInputStream.read(bArr);
            inputStreamOpenInputStream.close();
            if (i <= 0) {
                return null;
            }
            return convertDirectBuffer(ByteBuffer.wrap(bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    @CalledByNative
    public static ByteBuffer readFile(String str) {
        Context applicationContext = RtcContextUtils.getApplicationContext();
        if (str.startsWith("/assets/") && applicationContext != null) {
            return getAssets(applicationContext, str.substring(8));
        }
        if (!str.startsWith(CommonUtility.PREFIX_URI) || applicationContext == null) {
            return null;
        }
        return getOthers(applicationContext, str);
    }
}
