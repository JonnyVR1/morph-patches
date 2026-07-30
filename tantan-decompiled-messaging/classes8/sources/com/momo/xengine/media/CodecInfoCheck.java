package com.momo.xengine.media;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class CodecInfoCheck {
    private static final String mimetype = "video/avc";

    private static boolean couldHardwareEncode() throws IOException {
        byte[] bArrDecodeFrame;
        byte[] bArr = new byte[777600];
        boolean z = false;
        for (int i = 0; i < 777600; i++) {
            if (i / 720 >= 720) {
                bArr[i] = 0;
            } else {
                int i2 = i % 720;
                if (i2 < 240) {
                    bArr[i] = -128;
                } else if (i2 < 480) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = 127;
                }
            }
        }
        byte[] bArrEncodeYUV = encodeYUV(bArr, 777600);
        if (bArrEncodeYUV == null || (bArrDecodeFrame = decodeFrame(bArrEncodeYUV)) == null) {
            return false;
        }
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[64];
        byte[] bArr7 = new byte[64];
        int i3 = 0;
        while (i3 < 64) {
            int i4 = i3 / 8;
            int i5 = i3 % 8;
            int i6 = (i4 * 720) + i5;
            bArr2[i3] = bArr[i6];
            boolean z2 = z;
            int i7 = ((i4 + 360) * 720) + 240 + i5;
            bArr4[i3] = bArr[i7];
            int i8 = ((i4 + 712) * 720) + 712 + i5;
            bArr6[i3] = bArr[i8];
            bArr3[i3] = bArrDecodeFrame[i6];
            bArr5[i3] = bArrDecodeFrame[i7];
            bArr7[i3] = bArrDecodeFrame[i8];
            i3++;
            z = z2;
        }
        boolean z3 = z;
        PictureDiffenceUtil pictureDiffenceUtil = new PictureDiffenceUtil();
        if (pictureDiffenceUtil.isTwoPictureSame(bArr2, bArr3) && pictureDiffenceUtil.isTwoPictureSame(bArr4, bArr5) && pictureDiffenceUtil.isTwoPictureSame(bArr6, bArr7)) {
            return true;
        }
        return z3;
    }

    private static byte[] decodeFrame(byte[] bArr) throws IOException {
        MediaCodec mediaCodecCreateDecoderByType;
        byte[] bArr2 = null;
        try {
            mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(mimetype);
        } catch (IOException e) {
            e.printStackTrace();
            mediaCodecCreateDecoderByType = null;
        }
        if (mediaCodecCreateDecoderByType != null) {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(mimetype, 720, 720);
            mediaFormatCreateVideoFormat.setInteger("color-format", 21);
            mediaCodecCreateDecoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodecCreateDecoderByType.start();
            int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(-1L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
                if (bArr != null) {
                    inputBuffer.put(bArr);
                    mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 30000L);
                    if (iDequeueOutputBuffer < 0) {
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 30000L);
                    }
                    if (iDequeueOutputBuffer < 0) {
                        mediaCodecCreateDecoderByType.stop();
                        mediaCodecCreateDecoderByType.release();
                        DecodeOneFrameFFmpeg decodeOneFrameFFmpeg = new DecodeOneFrameFFmpeg();
                        decodeOneFrameFFmpeg.init();
                        byte[] bArrDecodeOneFrameToYUV = decodeOneFrameFFmpeg.decodeOneFrameToYUV(bArr, bArr.length);
                        decodeOneFrameFFmpeg.release();
                        return bArrDecodeOneFrameToYUV;
                    }
                    while (iDequeueOutputBuffer >= 0) {
                        ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                        bArr2 = new byte[bufferInfo.size];
                        outputBuffer.get(bArr2);
                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 0L);
                    }
                    mediaCodecCreateDecoderByType.stop();
                    mediaCodecCreateDecoderByType.release();
                    return bArr2;
                }
            }
        }
        return null;
    }

    private static byte[] encodeYUV(byte[] bArr, int i) throws IOException {
        MediaCodec mediaCodecCreateEncoderByType;
        try {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mimetype);
        } catch (IOException e) {
            e.printStackTrace();
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType != null) {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(mimetype, 720, 720);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 2073600);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("color-format", 21);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            mediaCodecCreateEncoderByType.start();
            int iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(-1L);
            if (iDequeueInputBuffer >= 0) {
                mediaCodecCreateEncoderByType.getInputBuffer(iDequeueInputBuffer).put(bArr);
                mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i, 0L, 0);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 30000L);
                if (iDequeueOutputBuffer < 0) {
                    iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 30000L);
                }
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                while (iDequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = mediaCodecCreateEncoderByType.getOutputBuffer(iDequeueOutputBuffer);
                    int i2 = bufferInfo.size;
                    byte[] bArr4 = new byte[i2];
                    outputBuffer.get(bArr4);
                    int i3 = bufferInfo.flags;
                    if (i3 == 2) {
                        byte[] bArr5 = new byte[bufferInfo.size];
                        bArr3 = bArr4;
                    } else if (i3 != 1) {
                        bArr2 = new byte[bufferInfo.size];
                        System.arraycopy(bArr4, 0, bArr2, 0, i2);
                    } else {
                        if (bArr3 == null) {
                            mediaCodecCreateEncoderByType.stop();
                            mediaCodecCreateEncoderByType.release();
                            return null;
                        }
                        bArr2 = new byte[bufferInfo.size + bArr3.length];
                        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                        System.arraycopy(bArr4, 0, bArr2, bArr3.length, i2);
                    }
                    mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
                }
                mediaCodecCreateEncoderByType.stop();
                mediaCodecCreateEncoderByType.release();
                return bArr2;
            }
            mediaCodecCreateEncoderByType.stop();
            mediaCodecCreateEncoderByType.release();
        }
        return null;
    }

    public static int getEncoderMaxSupportBitrate(@NotNull String str) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getSupportedTypes()[0].equals(str)) {
                return ((Integer) mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange().getUpper()).intValue();
            }
        }
        return -1;
    }

    public static int getSupportMaxWidth(int i, @NotNull String str, boolean z) {
        if (i <= 0) {
            return 0;
        }
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!z) {
                break;
            }
            if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getSupportedTypes()[0].equals(str)) {
                return ((Integer) mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedWidthsFor(i).getUpper()).intValue();
            }
        }
        return 0;
    }

    public static boolean isSupportHWEncoding(int i, int i2, int i3, boolean z, Context context) {
        boolean z2;
        boolean z3;
        int i4;
        int supportMaxWidth;
        synchronized (mimetype) {
            try {
                SharePreferenceUtils sharePreferenceUtils = new SharePreferenceUtils();
                boolean zIsSupportNV12 = isSupportNV12(mimetype);
                z2 = false;
                if (context != null) {
                    sharePreferenceUtils.init(context);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (zIsSupportNV12) {
                    i4 = z3 ? sharePreferenceUtils.getInt("couldHardWareEncode") : 0;
                    if (i4 != 1 && i4 != -1) {
                        i4 = couldHardwareEncode() ? 1 : -1;
                    }
                    if (z3) {
                        sharePreferenceUtils.putInt("couldHardWareEncode", i4);
                    }
                } else {
                    i4 = 0;
                }
                int encoderMaxSupportBitrate = getEncoderMaxSupportBitrate(mimetype);
                boolean z4 = encoderMaxSupportBitrate > 0 && i <= encoderMaxSupportBitrate;
                int iIsSupportHeight = isSupportHeight(mimetype, z);
                boolean z5 = iIsSupportHeight > 0 && i3 <= iIsSupportHeight && (supportMaxWidth = getSupportMaxWidth(i3, mimetype, z)) > 0 && i2 <= supportMaxWidth;
                if (z4 && zIsSupportNV12 && z5 && i4 == 1) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static int isSupportHeight(@NotNull String str, boolean z) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!z) {
                break;
            }
            if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getSupportedTypes()[0].equals(str)) {
                return ((Integer) mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeights().getUpper()).intValue();
            }
        }
        return 0;
    }

    public static boolean isSupportNV12(@NotNull String str) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() && mediaCodecInfo.getSupportedTypes()[0].equals(str)) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                int i = 0;
                while (true) {
                    int[] iArr = capabilitiesForType.colorFormats;
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] == 21) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
