package io.agora.rtc2.video;

import com.clevertap.android.sdk.Constants;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.internal.CalledByNative;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class VideoCaptureFormat {
    static final String keyFPS = "fps";
    static final String keyFormat = "format";
    static final String keyHeight = "height";
    static final String keyWidth = "width";
    final int mFramerate;
    final int mHeight;
    final int mPixelFormat;
    final int mWidth;

    @CalledByNative
    public VideoCaptureFormat(int i, int i2, int i3, int i4) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFramerate = i3;
        this.mPixelFormat = i4;
    }

    public static VideoCaptureFormat fromString(String str) {
        if (str != null && str.startsWith("{")) {
            String[] strArrSplit = str.substring(1, str.length() - 1).split(Constants.SEPARATOR_COMMA);
            HashMap map = new HashMap();
            try {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split("=");
                    map.put(strArrSplit2[0].trim(), Integer.valueOf(Integer.parseInt(strArrSplit2[1].trim())));
                }
                return new VideoCaptureFormat(((Integer) map.get("width")).intValue(), ((Integer) map.get("height")).intValue(), ((Integer) map.get(keyFPS)).intValue(), ((Integer) map.get("format")).intValue());
            } catch (Exception e) {
                ThrowableExtension.printStackTrace(e);
            }
        }
        return null;
    }

    @CalledByNative
    public int getFramerate() {
        return this.mFramerate;
    }

    @CalledByNative
    public int getHeight() {
        return this.mHeight;
    }

    @CalledByNative
    public int getPixelFormat() {
        return this.mPixelFormat;
    }

    @CalledByNative
    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        HashMap map = new HashMap();
        map.put("width", Integer.valueOf(this.mWidth));
        map.put("height", Integer.valueOf(this.mHeight));
        map.put(keyFPS, Integer.valueOf(this.mFramerate));
        map.put("format", Integer.valueOf(this.mPixelFormat));
        return map.toString();
    }
}
