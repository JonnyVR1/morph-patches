package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecEncoder {
    private static final String TAG = "MediaCodecEncoder";
    private static boolean mDumpEnable = false;
    private MediaCodec.BufferInfo mAACEncBufferInfo;
    private MediaCodec mAudioAACEncoder;
    private MediaFormat mAudioFormat;
    private int mBitrate;
    private int mChannels;
    private Context mContext;
    private ByteBuffer mEncInBuffer;
    private ByteBuffer mEncOutBuffer;
    private boolean mFormatChangeFlag;
    private ByteBuffer mInputBuffer;
    private ByteBuffer[] mMediaInputBuffers;
    private ByteBuffer[] mMediaOutputBuffers;
    private ByteBuffer mOutputBuffer;
    private File mRecFileDump;
    private FileOutputStream mRecFileOut;
    private int mSampleRate;
    private byte[] mTempBufEncIn;
    private byte[] mTempBufEncOut;
    private int nMaxBitRate;

    public MediaCodecEncoder() {
        this.mAudioAACEncoder = null;
        this.mAudioFormat = null;
        this.mAACEncBufferInfo = null;
        this.mInputBuffer = null;
        this.mOutputBuffer = null;
        this.mSampleRate = 48000;
        this.mChannels = 1;
        this.mBitrate = 32000;
        this.nMaxBitRate = 256000;
        this.mFormatChangeFlag = false;
        this.mRecFileDump = null;
        this.mRecFileOut = null;
        this.mContext = TXCCommonUtil.getAppContext();
        this.mEncInBuffer = ByteBuffer.allocateDirect(7680);
        this.mTempBufEncIn = new byte[7680];
        this.mEncOutBuffer = ByteBuffer.allocateDirect((((this.nMaxBitRate * 2) / 8) / 50) + 100);
        this.mTempBufEncOut = new byte[(((this.nMaxBitRate * 2) / 8) / 50) + 100];
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    private void addADTStoPacket(byte[] bArr, int i) {
        int i2;
        int i3 = this.mSampleRate;
        if (i3 == 48000) {
            i2 = 3;
        } else if (i3 == 44100) {
            i2 = 4;
        } else if (i3 == 32000) {
            i2 = 5;
        } else if (i3 == 24000) {
            i2 = 6;
        } else if (i3 == 16000) {
            i2 = 8;
        } else {
            i2 = 3;
        }
        int i4 = this.mChannels;
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = (byte) (64 + (i2 << 2) + (i4 >> 2));
        bArr[3] = (byte) (((i4 & 3) << 6) + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    private String getDumpFilePath(String str) {
        File externalFilesDir;
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
        }
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "MODEL:" + Build.MODEL);
        }
        Context context = this.mContext;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return null;
        }
        String str2 = externalFilesDir.getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + "-" + str;
        File file = new File(str2);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "dump:".concat(str2));
        }
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "dump replace:" + str2.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "_"));
        }
        return str2.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "_");
    }

    @SuppressLint({"NewApi"})
    public int createAACEncoder(int i, int i2, int i3) {
        try {
            this.mAudioAACEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            this.mAudioFormat = mediaFormatCreateAudioFormat;
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            this.mAudioFormat.setInteger("sample-rate", i);
            this.mAudioFormat.setInteger("channel-count", i2);
            this.mAudioFormat.setInteger("bitrate", i3);
            this.mAudioAACEncoder.configure(this.mAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            MediaCodec mediaCodec = this.mAudioAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.start();
                this.mAACEncBufferInfo = new MediaCodec.BufferInfo();
                this.mSampleRate = i;
                this.mChannels = i2;
                this.mBitrate = i3;
            }
            if (mDumpEnable) {
                this.mRecFileDump = new File(getDumpFilePath("jnirecord.aac"));
                try {
                    this.mRecFileOut = new FileOutputStream(this.mRecFileDump);
                } catch (FileNotFoundException unused) {
                    if (QLog.isColorLevel()) {
                        QLog.m84590e(TAG, 2, "open jnirecord.aac file failed.");
                    }
                }
            }
            if (!QLog.isColorLevel()) {
                return 0;
            }
            QLog.m84595w(TAG, 2, "createAACEncoder succeed!!! : (" + i + ", " + i2 + ", " + i3 + ")");
            return 0;
        } catch (Exception unused2) {
            if (QLog.isColorLevel()) {
                QLog.m84590e(TAG, 2, "create AAC Encoder failed.");
            }
            if (!QLog.isColorLevel()) {
                return -1;
            }
            QLog.m84590e(TAG, 2, "[ERROR] creating aac encode stream failed!!! : (" + i + ", " + i2 + ", " + i3 + ")");
            return -1;
        }
    }

    @SuppressLint({"NewApi"})
    public int encodeAACFrame(int i) {
        if (this.mFormatChangeFlag) {
            this.mFormatChangeFlag = false;
            this.mAudioAACEncoder.stop();
            this.mAudioFormat.setInteger("bitrate", this.mBitrate);
            this.mAudioAACEncoder.configure(this.mAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAudioAACEncoder.start();
        }
        this.mEncInBuffer.get(this.mTempBufEncIn, 0, i);
        int iEncodeInternalAACFrame = encodeInternalAACFrame(i);
        this.mEncOutBuffer.rewind();
        if (iEncodeInternalAACFrame <= 0) {
            return 0;
        }
        this.mEncOutBuffer.put(this.mTempBufEncOut, 0, iEncodeInternalAACFrame);
        if (mDumpEnable && this.mRecFileOut != null) {
            int i2 = iEncodeInternalAACFrame + 7;
            try {
                byte[] bArr = new byte[i2];
                addADTStoPacket(bArr, i2);
                System.arraycopy(this.mTempBufEncOut, 0, bArr, 7, iEncodeInternalAACFrame);
                this.mRecFileOut.write(bArr, 0, i2);
            } catch (IOException unused) {
                if (QLog.isColorLevel()) {
                    QLog.m84590e(TAG, 2, "write file failed.");
                }
            }
        }
        return iEncodeInternalAACFrame;
    }

    @SuppressLint({"NewApi"})
    public int encodeInternalAACFrame(int i) {
        try {
            int iDequeueInputBuffer = this.mAudioAACEncoder.dequeueInputBuffer(2000L);
            if (iDequeueInputBuffer != -1) {
                ByteBuffer inputBuffer = this.mAudioAACEncoder.getInputBuffer(iDequeueInputBuffer);
                this.mInputBuffer = inputBuffer;
                inputBuffer.clear();
                this.mInputBuffer.put(this.mTempBufEncIn, 0, i);
                this.mAudioAACEncoder.queueInputBuffer(iDequeueInputBuffer, 0, i, 0L, 0);
                this.mEncInBuffer.rewind();
            }
            int iDequeueOutputBuffer = this.mAudioAACEncoder.dequeueOutputBuffer(this.mAACEncBufferInfo, 0L);
            if (iDequeueOutputBuffer < 0) {
                return 0;
            }
            int i2 = this.mAACEncBufferInfo.size;
            ByteBuffer outputBuffer = this.mAudioAACEncoder.getOutputBuffer(iDequeueOutputBuffer);
            this.mOutputBuffer = outputBuffer;
            MediaCodec.BufferInfo bufferInfo = this.mAACEncBufferInfo;
            int i3 = (bufferInfo.flags & 2) == 2 ? 0 : bufferInfo.size;
            try {
                outputBuffer.position(bufferInfo.offset);
                this.mOutputBuffer.limit(this.mAACEncBufferInfo.offset + i2);
                this.mOutputBuffer.get(this.mTempBufEncOut, 0, i3);
                this.mOutputBuffer.position(0);
                this.mAudioAACEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return i3;
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m84590e(TAG, 2, "[ERROR] encoding aac stream failed!!!");
                }
                return i3;
            }
        } catch (Exception e) {
            if (!QLog.isColorLevel()) {
                return 0;
            }
            QLog.m84590e(TAG, 2, "encode failed." + e.getMessage());
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public int releaseAACEncoder() {
        try {
            MediaCodec mediaCodec = this.mAudioAACEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAudioAACEncoder.release();
                this.mAudioAACEncoder = null;
                if (!QLog.isColorLevel()) {
                    return 0;
                }
                QLog.m84595w(TAG, 2, "releaseAACEncoder, release aac encode stream succeed!!");
                return 0;
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m84590e(TAG, 2, "release aac encoder failed." + e.getMessage());
            }
        }
        if (!QLog.isColorLevel()) {
            return -1;
        }
        QLog.m84590e(TAG, 2, "[ERROR] releaseAACEncoder, release aac encode stream failed!!!");
        return -1;
    }

    @SuppressLint({"NewApi"})
    public int setAACEncodeBitrate(int i) {
        if (this.mAudioAACEncoder == null || this.mBitrate == i) {
            return 0;
        }
        this.mFormatChangeFlag = true;
        this.mBitrate = i;
        if (!QLog.isColorLevel()) {
            return 0;
        }
        QLog.m84595w(TAG, 2, "Set AAC bitrate = " + i);
        return 0;
    }

    public MediaCodecEncoder(Context context) {
        this.mAudioAACEncoder = null;
        this.mAudioFormat = null;
        this.mAACEncBufferInfo = null;
        this.mInputBuffer = null;
        this.mOutputBuffer = null;
        this.mSampleRate = 48000;
        this.mChannels = 1;
        this.mBitrate = 32000;
        this.nMaxBitRate = 256000;
        this.mFormatChangeFlag = false;
        this.mRecFileDump = null;
        this.mRecFileOut = null;
        this.mContext = context;
        this.mEncInBuffer = ByteBuffer.allocateDirect(7680);
        this.mTempBufEncIn = new byte[7680];
        this.mEncOutBuffer = ByteBuffer.allocateDirect((((this.nMaxBitRate * 2) / 8) / 50) + 100);
        this.mTempBufEncOut = new byte[(((this.nMaxBitRate * 2) / 8) / 50) + 100];
    }
}
