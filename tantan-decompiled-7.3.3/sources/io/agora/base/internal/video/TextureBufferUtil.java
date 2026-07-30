package io.agora.base.internal.video;

import io.agora.base.JavaI010Buffer;
import io.agora.base.NV12Buffer;
import io.agora.base.NV21Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class TextureBufferUtil {

    public @interface BufferType {
        public static final int I010 = 7;
        public static final int I420 = 0;
        public static final int I422 = 5;
        public static final int NV12 = 4;
        public static final int NV21 = 3;
        public static final int OES_TEXTURE = 1;
        public static final int RGBA = 6;
        public static final int RGB_TEXTURE = 2;
    }

    @CalledByNative
    public static int getVideoFrameBufferType(VideoFrame.Buffer buffer) {
        if (buffer instanceof VideoFrame.I420Buffer) {
            return 0;
        }
        if (buffer instanceof NV12Buffer) {
            return 4;
        }
        if (buffer instanceof NV21Buffer) {
            return 3;
        }
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (VideoFrame.TextureBuffer.Type.OES.equals(textureBuffer.getType())) {
                return 1;
            }
            if (VideoFrame.TextureBuffer.Type.RGB.equals(textureBuffer.getType())) {
                return 2;
            }
        } else {
            if (buffer instanceof VideoFrame.I422Buffer) {
                return 5;
            }
            if (buffer instanceof VideoFrame.RgbaBuffer) {
                return 6;
            }
            if (buffer instanceof JavaI010Buffer) {
                return 7;
            }
        }
        wtq0.m207906a("unknown buffer type");
        return 0;
    }
}
