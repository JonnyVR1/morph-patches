package com.immomo.mediabase;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class MediaCodecWrapper {
    public static final int CODEC_DECODE = 1;
    public static final int CODEC_ENCODE = 0;
    private final String AUDIO_MIME;
    private final long AUDIO_WAIT_TIME_US;
    private final int DECODER_ERROR;
    private final int ENCODER_ERROR;
    private final String TAG;
    private final String VIDEO_MIME;
    private final long WAIT_TIME_US;
    private boolean mCodecFeedingExit;
    private boolean mCodecIsStarted;
    private String mCodecName;
    private boolean mCodecOutputExit;
    private Surface mCodecSurface;
    private int mCodecType;
    private OnMediaDataComplete mCompleteListener;
    private DecodecCodecStatusListener mDecStatusListener;
    private ByteBuffer mFeedBuffer;
    private MediaCodec.BufferInfo mFeedBufferInfo;
    private boolean mFeedingIsPaused;
    private boolean mFeedingPauseFlag;
    private MediaCodec mMediaCodec;
    private Thread mMediaCodecFeedingThread;
    private ByteBuffer[] mMediaCodecInputBuffers;
    private ByteBuffer[] mMediaCodecOutBuffers;
    private Thread mMediaCodecOutingThread;
    private Object mMediaCodecSync;
    private String mName;
    boolean mNeedFlushCodec;
    private boolean mNeedStopAllThread;
    private boolean mOutterIsPaused;
    private boolean mOutterPauseFlag;
    private Object mPauseFeedingSync;
    private Object mPauseOutterSync;
    private LinkedBlockingQueue<PacketData> mRawFrameQueue;
    private boolean mReleaseManual;
    private MediaCodecStatusListener mStatusListener;
    private OnTextureRenderStatusListener mTextureRenderListener;
    private boolean needFeedData;

    public interface DecodecCodecStatusListener {
        boolean onStartRendingImageToTexture(MediaCodec.BufferInfo bufferInfo);
    }

    public class MediaCodecFeedingRunable implements Runnable {
        public MediaCodecFeedingRunable() {
        }

        private boolean checkPauseFeeding() {
            synchronized (MediaCodecWrapper.this.mPauseFeedingSync) {
                try {
                    if (!MediaCodecWrapper.this.mFeedingPauseFlag) {
                        return false;
                    }
                    MediaCodecWrapper.this.mPauseFeedingSync.notifyAll();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void waitms(long j) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int iDequeueInputBuffer;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.size = -1;
            ByteBuffer byteBufferAllocate = MediaCodecWrapper.this.mCodecName.startsWith("video") ? ByteBuffer.allocate(1048576) : ByteBuffer.allocate(524288);
            loop0: while (true) {
                boolean z = true;
                while (true) {
                    if (Thread.interrupted() || MediaCodecWrapper.this.mCodecFeedingExit) {
                        break loop0;
                    }
                    boolean zCheckPauseFeeding = checkPauseFeeding();
                    MediaCodecWrapper mediaCodecWrapper = MediaCodecWrapper.this;
                    if (zCheckPauseFeeding) {
                        mediaCodecWrapper.mFeedingIsPaused = true;
                        waitms(1L);
                    } else {
                        try {
                            if (mediaCodecWrapper.mStatusListener != null) {
                                if (z) {
                                    byteBufferAllocate.position(0);
                                    if (MediaCodecWrapper.this.mStatusListener.onFeedingData(byteBufferAllocate, bufferInfo)) {
                                        z = false;
                                    } else {
                                        waitms(5L);
                                    }
                                }
                                if (MediaCodecWrapper.this.mMediaCodecInputBuffers == null) {
                                    MediaCodecWrapper mediaCodecWrapper2 = MediaCodecWrapper.this;
                                    mediaCodecWrapper2.mMediaCodecInputBuffers = mediaCodecWrapper2.mMediaCodec.getInputBuffers();
                                }
                                iDequeueInputBuffer = MediaCodecWrapper.this.mMediaCodec.dequeueInputBuffer(10000L);
                                if (iDequeueInputBuffer >= 0) {
                                    break;
                                }
                            } else {
                                waitms(5L);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (MediaCodecWrapper.this.mStatusListener != null) {
                                int i = MediaCodecWrapper.this.mCodecType;
                                MediaCodecWrapper mediaCodecWrapper3 = MediaCodecWrapper.this;
                                if (i == 1) {
                                    mediaCodecWrapper3.mStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, null);
                                } else {
                                    mediaCodecWrapper3.mStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
                                }
                            }
                        }
                    }
                }
                int i2 = bufferInfo.size;
                if (i2 <= 0) {
                    MediaCodecWrapper mediaCodecWrapper4 = MediaCodecWrapper.this;
                    if (i2 != 0) {
                        mediaCodecWrapper4.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        MediaCodecWrapper.this.mNeedStopAllThread = true;
                        break;
                    } else {
                        mediaCodecWrapper4.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        MediaCodecWrapper.this.mNeedStopAllThread = false;
                    }
                } else {
                    MediaCodecWrapper.this.mMediaCodecInputBuffers[iDequeueInputBuffer].position(0);
                    MediaCodecWrapper.this.mMediaCodecInputBuffers[iDequeueInputBuffer].put(byteBufferAllocate.array(), 0, bufferInfo.size);
                    MediaCodecWrapper.this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, bufferInfo.size, bufferInfo.presentationTimeUs, 0);
                }
            }
            MediaCodecWrapper.this.mCodecFeedingExit = true;
        }
    }

    public interface MediaCodecStatusListener {
        void onCodecIdle();

        void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

        void onError(int i, int i2, String str);

        boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

        void onFinished();

        void onFormatChanged(MediaFormat mediaFormat);
    }

    public class MediacodecOutputRunable implements Runnable {
        private MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
        boolean errorOcurr = false;
        boolean needWaitFrameProcessComplete = false;

        public MediacodecOutputRunable() {
        }

        /* JADX WARN: Code duplicated, block: B:141:0x00ac A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0220 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x020f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x01a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x0215 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x0228 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x00af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:0x0000 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:0x0000 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x0000 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:161:0x0000 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x008d A[Catch: Exception -> 0x009a, TRY_ENTER, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x009d A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00ba A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00d1 A[Catch: Exception -> 0x009a, TRY_ENTER, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x00df A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0109 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0116 A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x011e A[Catch: Exception -> 0x009a, TRY_ENTER, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0124 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x0131  */
        /* JADX WARN: Code duplicated, block: B:73:0x0146 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x015c A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0164 A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x016a A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:94:0x01da A[Catch: Exception -> 0x009a, TryCatch #2 {Exception -> 0x009a, blocks: (B:37:0x0079, B:40:0x008d, B:50:0x00b4, B:52:0x00ba, B:53:0x00c7, B:56:0x00d1, B:58:0x00d7, B:60:0x00df, B:61:0x00f2, B:63:0x0109, B:86:0x0199, B:88:0x01a1, B:92:0x01c8, B:94:0x01da, B:95:0x01e3, B:97:0x01eb, B:99:0x01f9, B:101:0x0201, B:102:0x0208, B:64:0x0116, B:67:0x011e, B:69:0x0124, B:71:0x0132, B:73:0x0146, B:74:0x0159, B:75:0x015c, B:76:0x0164, B:78:0x016a, B:80:0x0171, B:82:0x0175, B:84:0x017d, B:85:0x0190, B:103:0x020f, B:105:0x0215, B:106:0x0220, B:108:0x0228, B:43:0x009d), top: B:131:0x0079 }] */
        @Override // java.lang.Runnable
        public void run() {
            boolean zStartsWith;
            MediaCodecWrapper mediaCodecWrapper;
            int iDequeueOutputBuffer;
            MediaCodecWrapper mediaCodecWrapper2;
            int i;
            MediaCodecWrapper mediaCodecWrapper3;
            MediaCodec.BufferInfo bufferInfo;
            String str;
            int i2;
            MediaCodecWrapper mediaCodecWrapper4;
            boolean zOnStartRendingImageToTexture;
            while (!MediaCodecWrapper.this.mCodecOutputExit && !Thread.interrupted()) {
                synchronized (MediaCodecWrapper.this.mPauseOutterSync) {
                    if (MediaCodecWrapper.this.mOutterPauseFlag) {
                        MediaCodecWrapper.this.mOutterIsPaused = true;
                        MediaCodecWrapper.this.mPauseOutterSync.notifyAll();
                        this.needWaitFrameProcessComplete = false;
                        try {
                            Thread.sleep(1L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        MediaCodecWrapper.this.feedData();
                        if (MediaCodecWrapper.this.mTextureRenderListener == null || MediaCodecWrapper.this.mCodecType != 1 || MediaCodecWrapper.this.mCodecSurface == null || !this.needWaitFrameProcessComplete) {
                            try {
                                this.mBufferInfo.flags = 0;
                                zStartsWith = MediaCodecWrapper.this.mCodecName.startsWith("audio");
                                mediaCodecWrapper = MediaCodecWrapper.this;
                                if (zStartsWith) {
                                    iDequeueOutputBuffer = mediaCodecWrapper.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 1000L);
                                } else {
                                    iDequeueOutputBuffer = mediaCodecWrapper.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 10000L);
                                }
                                if (iDequeueOutputBuffer == -3) {
                                    if (iDequeueOutputBuffer != -2) {
                                        mediaCodecWrapper2 = MediaCodecWrapper.this;
                                        if (iDequeueOutputBuffer != -1) {
                                            if (mediaCodecWrapper2.mMediaCodecOutBuffers == null) {
                                                MediaCodecWrapper mediaCodecWrapper5 = MediaCodecWrapper.this;
                                                mediaCodecWrapper5.mMediaCodecOutBuffers = mediaCodecWrapper5.mMediaCodec.getOutputBuffers();
                                            }
                                            i = MediaCodecWrapper.this.mCodecType;
                                            mediaCodecWrapper3 = MediaCodecWrapper.this;
                                            if (i == 1) {
                                                if (mediaCodecWrapper3.mCodecSurface == null) {
                                                    if (MediaCodecWrapper.this.mStatusListener != null) {
                                                        MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                                    }
                                                    MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                    if (MediaCodecWrapper.this.mCodecName.startsWith("audio")) {
                                                        MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer].clear();
                                                    }
                                                } else {
                                                    i2 = this.mBufferInfo.size;
                                                    mediaCodecWrapper4 = MediaCodecWrapper.this;
                                                    if (i2 > 0) {
                                                        if (mediaCodecWrapper4.mDecStatusListener != null) {
                                                            zOnStartRendingImageToTexture = MediaCodecWrapper.this.mDecStatusListener.onStartRendingImageToTexture(this.mBufferInfo);
                                                        } else {
                                                            zOnStartRendingImageToTexture = true;
                                                        }
                                                        MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, zOnStartRendingImageToTexture);
                                                        System.currentTimeMillis();
                                                        if (MediaCodecWrapper.this.mStatusListener != null) {
                                                            MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                                        }
                                                        this.needWaitFrameProcessComplete = true;
                                                    } else {
                                                        mediaCodecWrapper4.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                    }
                                                }
                                            } else if (mediaCodecWrapper3.mCodecType == 0) {
                                                bufferInfo = this.mBufferInfo;
                                                if (bufferInfo.flags != 2 && bufferInfo.size != 0 && MediaCodecWrapper.this.mStatusListener != null) {
                                                    MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                                }
                                                MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            }
                                            if ((this.mBufferInfo.flags & 4) != 0) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("OutputBuffer BUFFER_FLAG_END_OF_STREAM medai type ");
                                                sb.append(MediaCodecWrapper.this.mCodecName);
                                                sb.append(" coder ");
                                                if (MediaCodecWrapper.this.mCodecType == 1) {
                                                    str = " decoder ";
                                                } else {
                                                    str = " encoder ";
                                                }
                                                sb.append(str);
                                                Log4Cam.m18379e("MedaiCodecWrapper", sb.toString());
                                                if (MediaCodecWrapper.this.mCompleteListener != null) {
                                                    MediaCodecWrapper.this.mCompleteListener.onComplete();
                                                }
                                                if (MediaCodecWrapper.this.mCodecType == 0 || !MediaCodecWrapper.this.mCodecName.startsWith("video") || MediaCodecWrapper.this.mCodecSurface == null) {
                                                    boolean unused = MediaCodecWrapper.this.mNeedStopAllThread;
                                                } else {
                                                    MediaCodecWrapper.this.mCodecOutputExit = true;
                                                }
                                            }
                                        } else if (mediaCodecWrapper2.mStatusListener != null) {
                                            MediaCodecWrapper.this.mStatusListener.onCodecIdle();
                                        }
                                    } else if (MediaCodecWrapper.this.mStatusListener != null) {
                                        MediaCodecWrapper.this.mStatusListener.onFormatChanged(MediaCodecWrapper.this.mMediaCodec.getOutputFormat());
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                Log4Cam.m18379e("MedaiCodecWrapper", "Codec Exception !!!!!!!!!!!!!!!!!");
                                if (MediaCodecWrapper.this.mStatusListener != null) {
                                    int i3 = MediaCodecWrapper.this.mCodecType;
                                    MediaCodecWrapper mediaCodecWrapper6 = MediaCodecWrapper.this;
                                    if (i3 == 1) {
                                        mediaCodecWrapper6.mStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, null);
                                    } else {
                                        mediaCodecWrapper6.mStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
                                    }
                                }
                                this.errorOcurr = true;
                            }
                        } else if (MediaCodecWrapper.this.mTextureRenderListener.getTextureRenderStatus() > 0) {
                            try {
                                Thread.sleep(2L);
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        } else {
                            this.needWaitFrameProcessComplete = false;
                            this.mBufferInfo.flags = 0;
                            zStartsWith = MediaCodecWrapper.this.mCodecName.startsWith("audio");
                            mediaCodecWrapper = MediaCodecWrapper.this;
                            if (zStartsWith) {
                                iDequeueOutputBuffer = mediaCodecWrapper.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 1000L);
                            } else {
                                iDequeueOutputBuffer = mediaCodecWrapper.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 10000L);
                            }
                            if (iDequeueOutputBuffer == -3) {
                                if (iDequeueOutputBuffer != -2) {
                                    mediaCodecWrapper2 = MediaCodecWrapper.this;
                                    if (iDequeueOutputBuffer != -1) {
                                        if (mediaCodecWrapper2.mMediaCodecOutBuffers == null) {
                                            MediaCodecWrapper mediaCodecWrapper7 = MediaCodecWrapper.this;
                                            mediaCodecWrapper7.mMediaCodecOutBuffers = mediaCodecWrapper7.mMediaCodec.getOutputBuffers();
                                        }
                                        i = MediaCodecWrapper.this.mCodecType;
                                        mediaCodecWrapper3 = MediaCodecWrapper.this;
                                        if (i == 1) {
                                            if (mediaCodecWrapper3.mCodecSurface == null) {
                                                if (MediaCodecWrapper.this.mStatusListener != null) {
                                                    MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                                }
                                                MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                if (MediaCodecWrapper.this.mCodecName.startsWith("audio")) {
                                                    MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer].clear();
                                                }
                                            } else {
                                                i2 = this.mBufferInfo.size;
                                                mediaCodecWrapper4 = MediaCodecWrapper.this;
                                                if (i2 > 0) {
                                                    if (mediaCodecWrapper4.mDecStatusListener != null) {
                                                        zOnStartRendingImageToTexture = MediaCodecWrapper.this.mDecStatusListener.onStartRendingImageToTexture(this.mBufferInfo);
                                                    } else {
                                                        zOnStartRendingImageToTexture = true;
                                                    }
                                                    MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, zOnStartRendingImageToTexture);
                                                    System.currentTimeMillis();
                                                    if (MediaCodecWrapper.this.mStatusListener != null) {
                                                        MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                                    }
                                                    this.needWaitFrameProcessComplete = true;
                                                } else {
                                                    mediaCodecWrapper4.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                }
                                            }
                                        } else if (mediaCodecWrapper3.mCodecType == 0) {
                                            bufferInfo = this.mBufferInfo;
                                            if (bufferInfo.flags != 2) {
                                                MediaCodecWrapper.this.mStatusListener.onDataOutput(MediaCodecWrapper.this.mMediaCodecOutBuffers[iDequeueOutputBuffer], this.mBufferInfo);
                                            }
                                            MediaCodecWrapper.this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        }
                                        if ((this.mBufferInfo.flags & 4) != 0) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("OutputBuffer BUFFER_FLAG_END_OF_STREAM medai type ");
                                            sb2.append(MediaCodecWrapper.this.mCodecName);
                                            sb2.append(" coder ");
                                            if (MediaCodecWrapper.this.mCodecType == 1) {
                                                str = " decoder ";
                                            } else {
                                                str = " encoder ";
                                            }
                                            sb2.append(str);
                                            Log4Cam.m18379e("MedaiCodecWrapper", sb2.toString());
                                            if (MediaCodecWrapper.this.mCompleteListener != null) {
                                                MediaCodecWrapper.this.mCompleteListener.onComplete();
                                            }
                                            if (MediaCodecWrapper.this.mCodecType == 0) {
                                            }
                                            boolean unused2 = MediaCodecWrapper.this.mNeedStopAllThread;
                                        }
                                    } else if (mediaCodecWrapper2.mStatusListener != null) {
                                        MediaCodecWrapper.this.mStatusListener.onCodecIdle();
                                    }
                                } else if (MediaCodecWrapper.this.mStatusListener != null) {
                                    MediaCodecWrapper.this.mStatusListener.onFormatChanged(MediaCodecWrapper.this.mMediaCodec.getOutputFormat());
                                }
                            }
                        }
                    }
                }
            }
            MediaCodecWrapper.this.mCodecOutputExit = true;
            if (MediaCodecWrapper.this.mStatusListener == null || this.errorOcurr || MediaCodecWrapper.this.mReleaseManual) {
                return;
            }
            MediaCodecWrapper.this.mStatusListener.onFinished();
        }
    }

    public interface OnMediaDataComplete {
        void onComplete();
    }

    public interface OnTextureRenderStatusListener {
        int getTextureRenderStatus();
    }

    public MediaCodecWrapper(int i, String str) {
        this.DECODER_ERROR = 401;
        this.ENCODER_ERROR = 402;
        this.TAG = "MedaiCodecWrapper";
        this.VIDEO_MIME = "video";
        this.AUDIO_MIME = "audio";
        this.WAIT_TIME_US = 10000L;
        this.AUDIO_WAIT_TIME_US = 1000L;
        this.mMediaCodec = null;
        this.mCodecSurface = null;
        this.mCodecName = null;
        this.mMediaCodecInputBuffers = null;
        this.mMediaCodecOutBuffers = null;
        this.mMediaCodecFeedingThread = null;
        this.mMediaCodecOutingThread = null;
        this.mMediaCodecSync = new Object();
        this.mCodecType = -1;
        this.mCodecFeedingExit = false;
        this.mCodecOutputExit = false;
        this.mRawFrameQueue = new LinkedBlockingQueue<>();
        this.mFeedingPauseFlag = false;
        this.mOutterPauseFlag = false;
        this.mFeedingIsPaused = false;
        this.mOutterIsPaused = false;
        this.needFeedData = true;
        this.mPauseFeedingSync = new Object();
        this.mPauseOutterSync = new Object();
        this.mName = null;
        this.mNeedStopAllThread = false;
        this.mReleaseManual = false;
        this.mCodecIsStarted = false;
        this.mFeedBuffer = ByteBuffer.allocate(1048576);
        this.mFeedBufferInfo = new MediaCodec.BufferInfo();
        this.mNeedFlushCodec = false;
        this.mCodecType = i;
        this.mName = str;
    }

    private boolean checkDecoderCapability() {
        return true;
    }

    @TargetApi(21)
    private boolean checkEncoderCapability(MediaFormat mediaFormat) {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null || this.mCodecName == null) {
            return false;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(this.mCodecName);
        MediaFormat mediaFormat2 = new MediaFormat();
        if (this.mCodecName.startsWith("audio")) {
            if (mediaFormat.containsKey("sample-rate")) {
                mediaFormat2.setInteger("sample-rate", mediaFormat.getInteger("sample-rate"));
            }
            if (mediaFormat.containsKey("channel-count")) {
                mediaFormat2.setInteger("channel-count", mediaFormat.getInteger("channel-count"));
            }
            if (mediaFormat.containsKey(IMediaFormat.KEY_MIME)) {
                mediaFormat2.setString(IMediaFormat.KEY_MIME, mediaFormat.getString(IMediaFormat.KEY_MIME));
            }
            Log4Cam.m18379e("MedaiCodecWrapper", "audio issupported !!!!!! " + capabilitiesForType.isFormatSupported(mediaFormat2));
            return capabilitiesForType.isFormatSupported(mediaFormat2);
        }
        if (!this.mCodecName.startsWith("video")) {
            return true;
        }
        if (mediaFormat.containsKey(IMediaFormat.KEY_MIME)) {
            mediaFormat2.setString(IMediaFormat.KEY_MIME, mediaFormat.getString(IMediaFormat.KEY_MIME));
        }
        if (mediaFormat.containsKey("width")) {
            mediaFormat2.setInteger("width", mediaFormat.getInteger("width"));
        }
        if (mediaFormat.containsKey("height")) {
            mediaFormat2.setInteger("height", mediaFormat.getInteger("height"));
        }
        Log4Cam.m18379e("MedaiCodecWrapper", "video issupported !!!!!! " + capabilitiesForType.isFormatSupported(mediaFormat2));
        return capabilitiesForType.isFormatSupported(mediaFormat2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean feedData() {
        if (!this.needFeedData) {
            return true;
        }
        try {
            if (this.mMediaCodecInputBuffers == null) {
                this.mMediaCodecInputBuffers = this.mMediaCodec.getInputBuffers();
                if (this.mFeedBuffer.capacity() > this.mMediaCodecInputBuffers[0].capacity()) {
                    this.mFeedBuffer = ByteBuffer.allocate(this.mMediaCodecInputBuffers[0].capacity());
                }
            }
            if (!this.mNeedFlushCodec) {
                if (this.mStatusListener == null) {
                    return false;
                }
                if (this.mFeedBufferInfo.size == 0) {
                    this.mFeedBuffer.position(0);
                    if (!this.mStatusListener.onFeedingData(this.mFeedBuffer, this.mFeedBufferInfo)) {
                        return false;
                    }
                    if (this.mFeedBufferInfo.size == 0) {
                        this.mNeedFlushCodec = true;
                    }
                }
            }
            int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            int i = this.mFeedBufferInfo.size;
            if (i > 0) {
                this.mMediaCodecInputBuffers[iDequeueInputBuffer].position(0);
                this.mMediaCodecInputBuffers[iDequeueInputBuffer].put(this.mFeedBuffer.array(), 0, this.mFeedBufferInfo.size);
                MediaCodec mediaCodec = this.mMediaCodec;
                MediaCodec.BufferInfo bufferInfo = this.mFeedBufferInfo;
                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, bufferInfo.size, bufferInfo.presentationTimeUs, 0);
            } else {
                MediaCodec mediaCodec2 = this.mMediaCodec;
                if (i == 0) {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.mNeedFlushCodec = false;
                } else {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.mNeedStopAllThread = true;
                }
            }
            this.mFeedBufferInfo.size = 0;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            MediaCodecStatusListener mediaCodecStatusListener = this.mStatusListener;
            if (mediaCodecStatusListener != null) {
                if (this.mCodecType == 1) {
                    mediaCodecStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, null);
                } else {
                    mediaCodecStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
                }
            }
            return false;
        }
    }

    public static boolean isEncodeSupportBitrateMode(String str, int i) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (int i3 = 0; i3 < supportedTypes.length; i3++) {
                        Log4Cam.m18379e("codec", supportedTypes[i3]);
                        if (supportedTypes[i3].equalsIgnoreCase(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null) {
                            return encoderCapabilities.isBitrateModeSupported(i);
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSurpportH265Dec() {
        String[] supportedTypes;
        int iMax;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            Log4Cam.m18378e("codec" + codecInfoAt.getName());
            if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    Log4Cam.m18379e("codec", supportedTypes[i2]);
                    if (supportedTypes[i2].equalsIgnoreCase("video/hevc")) {
                        if (codecInfoAt.getName().equalsIgnoreCase("OMX.MTK.VIDEO.DECODER.HEVC")) {
                            return false;
                        }
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType("video/hevc");
                            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                                iMax = 0;
                            } else {
                                iMax = 0;
                                int iMax2 = 0;
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                    if (codecProfileLevel != null) {
                                        iMax = Math.max(iMax, codecProfileLevel.profile);
                                        iMax2 = Math.max(iMax2, codecProfileLevel.level);
                                    }
                                }
                            }
                            return iMax >= 1;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean createMediaCodec(MediaFormat mediaFormat, int i) {
        synchronized (this.mMediaCodecSync) {
            if (mediaFormat == null || i > 1 || i < 0) {
                Log4Cam.m18379e("MedaiCodecWrapper", "Media format is null");
                return false;
            }
            try {
                this.mCodecType = i;
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.mCodecName = string;
                if (string == null) {
                    Log4Cam.m18379e("MedaiCodecWrapper", "Media codec name is null");
                    return false;
                }
                int i2 = this.mCodecType;
                if (i2 == 0) {
                    MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                    this.mMediaCodec = mediaCodecCreateEncoderByType;
                    mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                    if (this.mCodecName.startsWith("video") && mediaFormat.getInteger("color-format") == 2130708361) {
                        this.mCodecSurface = this.mMediaCodec.createInputSurface();
                    }
                } else if (i2 == 1) {
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                    this.mMediaCodec = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(mediaFormat, this.mCodecSurface, (MediaCrypto) null, 0);
                }
                this.mMediaCodec.start();
                this.mCodecIsStarted = true;
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    this.mMediaCodec.release();
                } catch (Exception unused) {
                }
                this.mMediaCodec = null;
                Log4Cam.m18379e("MedaiCodecWrapper", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX);
                return false;
            }
        }
    }

    public void flush() {
        this.mMediaCodec.flush();
        this.mFeedBufferInfo.size = 0;
    }

    public Surface getCodecInputSurface() {
        synchronized (this.mMediaCodecSync) {
            try {
                String str = this.mCodecName;
                if (str == null || !str.startsWith("video")) {
                    return null;
                }
                return this.mCodecSurface;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MediaFormat getCodecOutputFormat() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            return mediaCodec.getOutputFormat();
        }
        return null;
    }

    public void pause() {
        if (this.mMediaCodecFeedingThread != null && !this.mFeedingIsPaused) {
            synchronized (this.mPauseFeedingSync) {
                this.mFeedingPauseFlag = true;
            }
            while (!this.mFeedingIsPaused && !this.mCodecFeedingExit) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.mMediaCodecOutingThread == null || this.mOutterIsPaused) {
            return;
        }
        synchronized (this.mPauseOutterSync) {
            this.mOutterPauseFlag = true;
        }
        while (!this.mOutterIsPaused && !this.mCodecOutputExit) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001e A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x0077, B:49:0x007f, B:42:0x0061, B:44:0x0068, B:46:0x006c, B:47:0x0072), top: B:53:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x003a A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x0077, B:49:0x007f, B:42:0x0061, B:44:0x0068, B:46:0x006c, B:47:0x0072), top: B:53:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x004d A[Catch: all -> 0x0011, Exception -> 0x0057, TryCatch #3 {Exception -> 0x0057, blocks: (B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059), top: B:59:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0051 A[Catch: all -> 0x0011, Exception -> 0x0057, TryCatch #3 {Exception -> 0x0057, blocks: (B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059), top: B:59:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0077 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x0077, B:49:0x007f, B:42:0x0061, B:44:0x0068, B:46:0x006c, B:47:0x0072), top: B:53:0x0004, inners: #1, #2, #3 }] */
    public void releaseMediaCodec() {
        MediaCodec mediaCodec;
        synchronized (this.mMediaCodecSync) {
            this.mReleaseManual = true;
            Thread thread = this.mMediaCodecFeedingThread;
            if (thread != null) {
                this.mCodecFeedingExit = true;
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.mMediaCodecFeedingThread = null;
                if (this.mMediaCodecOutingThread == null) {
                    try {
                        mediaCodec = this.mMediaCodec;
                        if (mediaCodec == null) {
                            this.mCodecName = null;
                            this.mCodecSurface = null;
                            this.mFeedBuffer = null;
                            this.mFeedBufferInfo = null;
                        } else {
                            if (this.mCodecIsStarted) {
                                mediaCodec.stop();
                                this.mCodecIsStarted = false;
                            }
                            this.mMediaCodec.release();
                            this.mMediaCodec = null;
                            this.mCodecName = null;
                            this.mCodecSurface = null;
                            this.mFeedBuffer = null;
                            this.mFeedBufferInfo = null;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        MediaCodecStatusListener mediaCodecStatusListener = this.mStatusListener;
                        if (mediaCodecStatusListener != null) {
                            if (this.mCodecType == 1) {
                                mediaCodecStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, null);
                            } else {
                                mediaCodecStatusListener.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
                            }
                        }
                    }
                } else {
                    if (this.mMediaCodec == null && this.mCodecType == 0 && this.mCodecName.startsWith("video") && this.mCodecSurface != null) {
                        this.mMediaCodec.signalEndOfInputStream();
                    } else {
                        this.mCodecOutputExit = true;
                    }
                    try {
                        this.mMediaCodecOutingThread.join();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    this.mMediaCodecOutingThread = null;
                    mediaCodec = this.mMediaCodec;
                    if (mediaCodec == null) {
                        this.mCodecName = null;
                        this.mCodecSurface = null;
                        this.mFeedBuffer = null;
                        this.mFeedBufferInfo = null;
                    } else {
                        if (this.mCodecIsStarted) {
                            mediaCodec.stop();
                            this.mCodecIsStarted = false;
                        }
                        this.mMediaCodec.release();
                        this.mMediaCodec = null;
                        this.mCodecName = null;
                        this.mCodecSurface = null;
                        this.mFeedBuffer = null;
                        this.mFeedBufferInfo = null;
                    }
                }
            } else if (this.mMediaCodecOutingThread == null) {
                mediaCodec = this.mMediaCodec;
                if (mediaCodec == null) {
                    this.mCodecName = null;
                    this.mCodecSurface = null;
                    this.mFeedBuffer = null;
                    this.mFeedBufferInfo = null;
                } else {
                    if (this.mCodecIsStarted) {
                        mediaCodec.stop();
                        this.mCodecIsStarted = false;
                    }
                    this.mMediaCodec.release();
                    this.mMediaCodec = null;
                    this.mCodecName = null;
                    this.mCodecSurface = null;
                    this.mFeedBuffer = null;
                    this.mFeedBufferInfo = null;
                }
            } else {
                if (this.mMediaCodec == null) {
                    this.mCodecOutputExit = true;
                } else {
                    this.mCodecOutputExit = true;
                }
                this.mMediaCodecOutingThread.join();
                this.mMediaCodecOutingThread = null;
                mediaCodec = this.mMediaCodec;
                if (mediaCodec == null) {
                    this.mCodecName = null;
                    this.mCodecSurface = null;
                    this.mFeedBuffer = null;
                    this.mFeedBufferInfo = null;
                } else {
                    if (this.mCodecIsStarted) {
                        mediaCodec.stop();
                        this.mCodecIsStarted = false;
                    }
                    this.mMediaCodec.release();
                    this.mMediaCodec = null;
                    this.mCodecName = null;
                    this.mCodecSurface = null;
                    this.mFeedBuffer = null;
                    this.mFeedBufferInfo = null;
                }
            }
            throw th;
        }
    }

    public void resume(boolean z) {
        synchronized (this.mPauseFeedingSync) {
            if (z) {
                try {
                    if (this.mOutterIsPaused || this.mFeedingIsPaused) {
                        this.mMediaCodec.flush();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mOutterPauseFlag = false;
            this.mFeedingPauseFlag = false;
            this.mOutterIsPaused = false;
            this.mFeedingIsPaused = false;
        }
    }

    public void setCodecInputSurface(Surface surface) {
        synchronized (this.mMediaCodecSync) {
            try {
                if (this.mCodecType == 1) {
                    this.mCodecSurface = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDecStatusListener(DecodecCodecStatusListener decodecCodecStatusListener) {
        synchronized (this.mMediaCodecSync) {
            this.mDecStatusListener = decodecCodecStatusListener;
        }
    }

    public void setMaxFeedBufferSize(int i) {
        ByteBuffer byteBuffer = this.mFeedBuffer;
        if (byteBuffer != null) {
            if (i > byteBuffer.capacity()) {
                this.mFeedBuffer = ByteBuffer.allocate(i);
            }
        } else if (i > 0) {
            this.mFeedBuffer = ByteBuffer.allocate(i);
        }
    }

    public void setMediaCodecStatusListener(MediaCodecStatusListener mediaCodecStatusListener) {
        synchronized (this.mMediaCodecSync) {
            this.mStatusListener = mediaCodecStatusListener;
        }
    }

    public void setOnCompleteListener(OnMediaDataComplete onMediaDataComplete) {
        this.mCompleteListener = onMediaDataComplete;
    }

    public void setParams(Bundle bundle) {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            try {
                mediaCodec.setParameters(bundle);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void setTextureRenderStatusListener(OnTextureRenderStatusListener onTextureRenderStatusListener) {
        this.mTextureRenderListener = onTextureRenderStatusListener;
    }

    public void starMediaCodec(boolean z) {
        synchronized (this.mMediaCodecSync) {
            try {
                if (this.mMediaCodecOutingThread == null) {
                    Thread thread = new Thread(new MediacodecOutputRunable(), this.mName + "_outdata");
                    this.mMediaCodecOutingThread = thread;
                    thread.start();
                }
                this.needFeedData = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resume() {
        synchronized (this.mPauseFeedingSync) {
            this.mOutterPauseFlag = false;
            this.mFeedingPauseFlag = false;
            this.mOutterIsPaused = false;
            this.mFeedingIsPaused = false;
        }
    }

    public MediaCodecWrapper(String str) {
        this.DECODER_ERROR = 401;
        this.ENCODER_ERROR = 402;
        this.TAG = "MedaiCodecWrapper";
        this.VIDEO_MIME = "video";
        this.AUDIO_MIME = "audio";
        this.WAIT_TIME_US = 10000L;
        this.AUDIO_WAIT_TIME_US = 1000L;
        this.mMediaCodec = null;
        this.mCodecSurface = null;
        this.mCodecName = null;
        this.mMediaCodecInputBuffers = null;
        this.mMediaCodecOutBuffers = null;
        this.mMediaCodecFeedingThread = null;
        this.mMediaCodecOutingThread = null;
        this.mMediaCodecSync = new Object();
        this.mCodecType = -1;
        this.mCodecFeedingExit = false;
        this.mCodecOutputExit = false;
        this.mRawFrameQueue = new LinkedBlockingQueue<>();
        this.mFeedingPauseFlag = false;
        this.mOutterPauseFlag = false;
        this.mFeedingIsPaused = false;
        this.mOutterIsPaused = false;
        this.needFeedData = true;
        this.mPauseFeedingSync = new Object();
        this.mPauseOutterSync = new Object();
        this.mName = null;
        this.mNeedStopAllThread = false;
        this.mReleaseManual = false;
        this.mCodecIsStarted = false;
        this.mFeedBuffer = ByteBuffer.allocate(1048576);
        this.mFeedBufferInfo = new MediaCodec.BufferInfo();
        this.mNeedFlushCodec = false;
        this.mName = str;
    }

    public MediaCodecWrapper(int i) {
        this.DECODER_ERROR = 401;
        this.ENCODER_ERROR = 402;
        this.TAG = "MedaiCodecWrapper";
        this.VIDEO_MIME = "video";
        this.AUDIO_MIME = "audio";
        this.WAIT_TIME_US = 10000L;
        this.AUDIO_WAIT_TIME_US = 1000L;
        this.mMediaCodec = null;
        this.mCodecSurface = null;
        this.mCodecName = null;
        this.mMediaCodecInputBuffers = null;
        this.mMediaCodecOutBuffers = null;
        this.mMediaCodecFeedingThread = null;
        this.mMediaCodecOutingThread = null;
        this.mMediaCodecSync = new Object();
        this.mCodecType = -1;
        this.mCodecFeedingExit = false;
        this.mCodecOutputExit = false;
        this.mRawFrameQueue = new LinkedBlockingQueue<>();
        this.mFeedingPauseFlag = false;
        this.mOutterPauseFlag = false;
        this.mFeedingIsPaused = false;
        this.mOutterIsPaused = false;
        this.needFeedData = true;
        this.mPauseFeedingSync = new Object();
        this.mPauseOutterSync = new Object();
        this.mName = null;
        this.mNeedStopAllThread = false;
        this.mReleaseManual = false;
        this.mCodecIsStarted = false;
        this.mFeedBuffer = ByteBuffer.allocate(1048576);
        this.mFeedBufferInfo = new MediaCodec.BufferInfo();
        this.mNeedFlushCodec = false;
        this.mCodecType = i;
    }

    public MediaCodecWrapper() {
        this.DECODER_ERROR = 401;
        this.ENCODER_ERROR = 402;
        this.TAG = "MedaiCodecWrapper";
        this.VIDEO_MIME = "video";
        this.AUDIO_MIME = "audio";
        this.WAIT_TIME_US = 10000L;
        this.AUDIO_WAIT_TIME_US = 1000L;
        this.mMediaCodec = null;
        this.mCodecSurface = null;
        this.mCodecName = null;
        this.mMediaCodecInputBuffers = null;
        this.mMediaCodecOutBuffers = null;
        this.mMediaCodecFeedingThread = null;
        this.mMediaCodecOutingThread = null;
        this.mMediaCodecSync = new Object();
        this.mCodecType = -1;
        this.mCodecFeedingExit = false;
        this.mCodecOutputExit = false;
        this.mRawFrameQueue = new LinkedBlockingQueue<>();
        this.mFeedingPauseFlag = false;
        this.mOutterPauseFlag = false;
        this.mFeedingIsPaused = false;
        this.mOutterIsPaused = false;
        this.needFeedData = true;
        this.mPauseFeedingSync = new Object();
        this.mPauseOutterSync = new Object();
        this.mName = null;
        this.mNeedStopAllThread = false;
        this.mReleaseManual = false;
        this.mCodecIsStarted = false;
        this.mFeedBuffer = ByteBuffer.allocate(1048576);
        this.mFeedBufferInfo = new MediaCodec.BufferInfo();
        this.mNeedFlushCodec = false;
    }
}
