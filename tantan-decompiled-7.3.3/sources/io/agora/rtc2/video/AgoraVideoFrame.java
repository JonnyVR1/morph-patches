package io.agora.rtc2.video;

import io.agora.base.VideoFrame;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraVideoFrame {
    public static final int BUFFER_TYPE_ARRAY = 2;
    public static final int BUFFER_TYPE_BUFFER = 1;
    public static final int BUFFER_TYPE_NONE = -1;
    public static final int BUFFER_TYPE_TEXTURE = 3;
    public static final int FORMAT_BGRA = 2;
    public static final int FORMAT_I420 = 1;
    public static final int FORMAT_I422 = 16;
    public static final int FORMAT_NONE = -1;
    public static final int FORMAT_NV21 = 3;
    public static final int FORMAT_RGBA = 4;
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    public int format = 10;
    public long timeStamp = 0;
    public int stride = 0;
    public int height = 0;
    public int textureID = 0;
    public boolean syncMode = true;
    public float[] transform = null;
    public EGLContext eglContext10 = null;
    public android.opengl.EGLContext eglContext14 = null;
    public byte[] buf = null;
    public int cropLeft = 0;
    public int cropTop = 0;
    public int cropRight = 0;
    public int cropBottom = 0;
    public int rotation = 0;
    public VideoFrame.AlphaStitchMode alphaStitchMode = VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH;

    public String toString() {
        StringBuilder sb = new StringBuilder("AgoraVideoFrame{format=");
        sb.append(this.format);
        sb.append(", timeStamp=");
        sb.append(this.timeStamp);
        sb.append(", stride=");
        sb.append(this.stride);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", textureID=");
        sb.append(this.textureID);
        sb.append(", buf.length=");
        byte[] bArr = this.buf;
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(", cropLeft=");
        sb.append(this.cropLeft);
        sb.append(", cropTop=");
        sb.append(this.cropTop);
        sb.append(", cropRight=");
        sb.append(this.cropRight);
        sb.append(", cropBottom=");
        sb.append(this.cropBottom);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", alphaStitchMode=");
        sb.append(this.alphaStitchMode);
        sb.append('}');
        return sb.toString();
    }
}
