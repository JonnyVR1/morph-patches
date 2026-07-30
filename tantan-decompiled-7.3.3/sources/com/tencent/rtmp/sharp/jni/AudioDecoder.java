package com.tencent.rtmp.sharp.jni;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes2.dex */
public class AudioDecoder {
    private static final String TAG = "AudioDecoder";
    private String srcPath;
    private MediaCodec mediaDecode = null;
    private MediaExtractor mediaExtractor = null;
    private ByteBuffer[] decodeInputBuffers = null;
    private ByteBuffer[] decodeOutputBuffers = null;
    private MediaCodec.BufferInfo decodeBufferInfo = null;
    private OnCompleteListener onCompleteListener = null;
    private OnProgressListener onProgressListener = null;
    private long fileTotalMs = 0;
    private RingBuffer decRingBuffer = null;
    int sampleRate = 0;
    int channels = 0;
    int nFrameSize = 3840;
    boolean IsTenFramesReady = false;
    int nFirstThreeFrameInfo = 3;
    int m_nIndex = 0;
    private boolean codeOver = true;

    public interface OnCompleteListener {
        void completed();
    }

    public interface OnProgressListener {
        void progress();
    }

    private int initMediaDecode(int i) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.mediaExtractor = mediaExtractor;
            mediaExtractor.setDataSource(this.srcPath);
            if (this.mediaExtractor.getTrackCount() > 1) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode mediaExtractor container video, getTrackCount: " + this.mediaExtractor.getTrackCount());
                }
                this.codeOver = true;
                return -2;
            }
            for (int i2 = 0; i2 < this.mediaExtractor.getTrackCount(); i2++) {
                MediaFormat trackFormat = this.mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode mediaExtractor audio type:" + string);
                }
                if (string.startsWith(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG)) {
                    this.mediaExtractor.selectTrack(i2);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                    this.mediaDecode = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.sampleRate = trackFormat.getInteger("sample-rate");
                    this.channels = trackFormat.getInteger("channel-count");
                    this.fileTotalMs = trackFormat.getLong("durationUs") / 1000;
                    int i3 = ((this.sampleRate * this.channels) * 40) / 1000;
                    this.nFrameSize = i3;
                    this.decRingBuffer = new RingBuffer(i3 * i);
                    if (!QLog.isColorLevel()) {
                        break;
                    }
                    QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode open succeed, mp3 format:(" + this.sampleRate + Constants.SEPARATOR_COMMA + this.channels + "), fileTotalMs:" + this.fileTotalMs + "ms RingBufferFrame:" + i);
                    break;
                }
            }
            MediaCodec mediaCodec = this.mediaDecode;
            if (mediaCodec == null) {
                Log.e("AudioDecoder", "m_nIndex: " + this.m_nIndex + " initMediaDecode create mediaDecode failed");
                this.codeOver = true;
                return -1;
            }
            if (this.decRingBuffer == null) {
                Log.e("AudioDecoder", "m_nIndex: " + this.m_nIndex + " initMediaDecode create decRingBuffer failed");
                this.codeOver = true;
                return -1;
            }
            mediaCodec.start();
            this.decodeInputBuffers = this.mediaDecode.getInputBuffers();
            this.decodeOutputBuffers = this.mediaDecode.getOutputBuffers();
            this.decodeBufferInfo = new MediaCodec.BufferInfo();
            this.codeOver = false;
            this.IsTenFramesReady = false;
            this.nFirstThreeFrameInfo = 3;
            return 0;
        } catch (IOException e) {
            TXCLog.m84150e("AudioDecoder", "init media decode failed.", e);
            this.codeOver = true;
            return -1;
        }
    }

    private void showLog(String str) {
        Log.e("AudioCodec", str);
    }

    private void srcAudioFormatToPCM() {
        int i;
        if (this.decodeInputBuffers.length <= 1) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM decodeInputBuffers.length to small," + this.decodeInputBuffers.length);
            }
            this.codeOver = true;
            return;
        }
        int iDequeueInputBuffer = this.mediaDecode.dequeueInputBuffer(-1L);
        if (iDequeueInputBuffer < 0) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM decodeInputBuffers.inputIndex <0");
            }
            this.codeOver = true;
            return;
        }
        ByteBuffer inputBuffer = this.mediaDecode.getInputBuffer(iDequeueInputBuffer);
        inputBuffer.clear();
        int sampleData = this.mediaExtractor.readSampleData(inputBuffer, 0);
        if (sampleData < 0) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM readSampleData over,end");
            }
            this.codeOver = true;
        } else {
            this.mediaDecode.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, 0L, 0);
            this.mediaExtractor.advance();
        }
        int iDequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(this.decodeBufferInfo, 10000L);
        while (iDequeueOutputBuffer >= 0) {
            ByteBuffer outputBuffer = this.mediaDecode.getOutputBuffer(iDequeueOutputBuffer);
            byte[] bArr = new byte[this.decodeBufferInfo.size];
            try {
                outputBuffer.get(bArr);
                outputBuffer.clear();
                RingBuffer ringBuffer = this.decRingBuffer;
                if (ringBuffer != null && (i = this.decodeBufferInfo.size) > 0) {
                    ringBuffer.Push(bArr, i);
                    int i2 = this.nFirstThreeFrameInfo;
                    this.nFirstThreeFrameInfo = i2 - 1;
                    if (i2 > 0 && QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " DecodeOneFrame size: " + this.decodeBufferInfo.size + " Remain: " + (this.decRingBuffer.RemainRead() / this.nFrameSize));
                    }
                }
                this.mediaDecode.releaseOutputBuffer(iDequeueOutputBuffer, false);
                MediaCodec.BufferInfo bufferInfo = this.decodeBufferInfo;
                if (bufferInfo.size > 0) {
                    return;
                } else {
                    iDequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(bufferInfo, 10000L);
                }
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM wrong outputIndex: " + iDequeueOutputBuffer);
                }
                this.codeOver = true;
                return;
            }
        }
    }

    public int ReadOneFrame(byte[] bArr, int i) {
        int i2 = 20;
        if (!this.IsTenFramesReady) {
            int i3 = 20;
            while (this.decRingBuffer.RemainRead() / this.nFrameSize < 10) {
                int i4 = i3 - 1;
                if (i3 <= 0 || this.codeOver) {
                    break;
                }
                srcAudioFormatToPCM();
                i3 = i4;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " 10 FramesReady Remain frame: " + (this.decRingBuffer.RemainRead() / this.nFrameSize));
            }
            this.IsTenFramesReady = true;
        }
        while (!this.codeOver && this.decRingBuffer.RemainRead() / this.nFrameSize < 10) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            srcAudioFormatToPCM();
            i2 = i5;
        }
        if (this.decRingBuffer.RemainRead() < i) {
            return -1;
        }
        this.decRingBuffer.Pop(bArr, i);
        return i;
    }

    public int SeekTo(int i) {
        MediaExtractor mediaExtractor = this.mediaExtractor;
        if (mediaExtractor == null) {
            return 0;
        }
        long sampleTime = mediaExtractor.getSampleTime();
        int iRemainRead = i + ((this.decRingBuffer.RemainRead() * 20) / this.nFrameSize);
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " current PlayMs: " + (sampleTime / 1000) + " SeekTo: " + iRemainRead);
        }
        this.mediaExtractor.seekTo(iRemainRead * 1000, 2);
        long sampleTime2 = this.mediaExtractor.getSampleTime();
        int i2 = (int) ((sampleTime2 - sampleTime) / 1000);
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " total SeekTo time: " + i2 + " t2:" + (sampleTime2 / 1000));
        }
        return i2;
    }

    public int getChannels() {
        return this.channels;
    }

    public long getFileTotalMs() {
        return this.fileTotalMs;
    }

    public int getFrameSize() {
        return this.nFrameSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int prepare(int i) {
        if (this.srcPath == null) {
            return -1;
        }
        return initMediaDecode(i);
    }

    public void release() {
        MediaCodec mediaCodec = this.mediaDecode;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mediaDecode.release();
            this.mediaDecode = null;
        }
        MediaExtractor mediaExtractor = this.mediaExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mediaExtractor = null;
        }
        if (this.onCompleteListener != null) {
            this.onCompleteListener = null;
        }
        if (this.onProgressListener != null) {
            this.onProgressListener = null;
        }
        showLog("release");
    }

    public void setIOPath(String str) {
        this.srcPath = str;
    }

    public void setIndex(int i) {
        this.m_nIndex = i;
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    public void setOnProgressListener(OnProgressListener onProgressListener) {
        this.onProgressListener = onProgressListener;
    }
}
