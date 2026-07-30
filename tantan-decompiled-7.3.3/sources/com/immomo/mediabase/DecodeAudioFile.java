package com.immomo.mediabase;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class DecodeAudioFile {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "HUOHL_DecodeAudioFile";
    private AudioParameter mSrcAudioParam;
    private String mSourceFile = "";
    private boolean mEnableResample = false;
    private AudioParameter mDstAudioParam = null;
    DecodeAudioFileListener mDecoderListener = null;
    private long mStartDecodeTime = 0;
    private long mEndDeocdeTime = 0;
    private boolean mStopDecode = false;
    private Thread mDecodeThread = null;
    MediaExtractor mExtractor = null;
    int mAudioTrackIndex = -1;
    long mAudioDuration = 0;
    MediaFormat mAudioFormat = null;
    private Runnable mDecodeRunable = new Runnable() { // from class: com.immomo.mediabase.DecodeAudioFile.1
        /* JADX WARN: Code duplicated, block: B:104:0x01d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x016f  */
        /* JADX WARN: Code duplicated, block: B:65:0x0175  */
        /* JADX WARN: Code duplicated, block: B:67:0x0190  */
        /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:77:0x01dc A[EDGE_INSN: B:77:0x01dc->B:87:0x021d BREAK  A[LOOP:1: B:38:0x00f6->B:106:0x00f6]] */
        /* JADX WARN: Code duplicated, block: B:78:0x01e0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:80:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:82:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:84:0x0212  */
        @Override // java.lang.Runnable
        public void run() throws IOException {
            int i;
            MediaCodec mediaCodecCreateDecoderByType;
            long j;
            int i2;
            long j2;
            int iDequeueOutputBuffer;
            MediaFormat outputFormat;
            DecodeAudioFileListener decodeAudioFileListener;
            ByteBuffer byteBuffer;
            int i3;
            DecodeAudioFileListener decodeAudioFileListener2;
            ByteBuffer byteBufferAllocate;
            DecodeAudioFileListener decodeAudioFileListener3;
            int iDequeueInputBuffer;
            int i4;
            boolean z;
            long sampleTime;
            DecodeAudioFile decodeAudioFile = DecodeAudioFile.this;
            if (decodeAudioFile.mAudioFormat == null || (i = decodeAudioFile.mAudioTrackIndex) < 0) {
                DecodeAudioFileListener decodeAudioFileListener4 = decodeAudioFile.mDecoderListener;
                if (decodeAudioFileListener4 != null) {
                    decodeAudioFileListener4.onDecoderError(-2);
                    return;
                }
                return;
            }
            decodeAudioFile.mExtractor.selectTrack(i);
            try {
                mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(DecodeAudioFile.this.mAudioFormat.getString(IMediaFormat.KEY_MIME));
            } catch (IOException e) {
                e.printStackTrace();
                mediaCodecCreateDecoderByType = null;
            }
            mediaCodecCreateDecoderByType.configure(DecodeAudioFile.this.mAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodecCreateDecoderByType.start();
            ByteBuffer[] inputBuffers = mediaCodecCreateDecoderByType.getInputBuffers();
            ByteBuffer[] outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            long j3 = 0;
            if (DecodeAudioFile.this.mStartDecodeTime <= 0 || 0 >= DecodeAudioFile.this.mStartDecodeTime) {
                j = 0;
            } else {
                DecodeAudioFile decodeAudioFile2 = DecodeAudioFile.this;
                decodeAudioFile2.mExtractor.seekTo(decodeAudioFile2.mStartDecodeTime, 2);
                j = 0;
                while (j < DecodeAudioFile.this.mStartDecodeTime && DecodeAudioFile.this.mExtractor.advance()) {
                    long sampleTime2 = DecodeAudioFile.this.mExtractor.getSampleTime();
                    if (sampleTime2 == -1) {
                        break;
                    } else {
                        j = sampleTime2;
                    }
                }
                Log.e(DecodeAudioFile.TAG, "SEEK to " + DecodeAudioFile.this.mStartDecodeTime + " currentPos:" + j);
            }
            int i5 = -3;
            if (DecodeAudioFile.this.mStartDecodeTime > 0 && j < DecodeAudioFile.this.mStartDecodeTime) {
                DecodeAudioFileListener decodeAudioFileListener5 = DecodeAudioFile.this.mDecoderListener;
                if (decodeAudioFileListener5 != null) {
                    decodeAudioFileListener5.onDecoderError(-3);
                }
                Log.e(DecodeAudioFile.TAG, "SEEK Error SEEK to " + DecodeAudioFile.this.mStartDecodeTime + " currentPos:" + j + ", duration:" + DecodeAudioFile.this.mAudioDuration);
                return;
            }
            boolean z2 = false;
            while (!DecodeAudioFile.this.mStopDecode) {
                boolean z3 = z2;
                if (z2 || (iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) < 0) {
                    i2 = i5;
                    j2 = 5000;
                    z2 = z3;
                    iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j2);
                    if (iDequeueOutputBuffer >= 0) {
                        byteBuffer = outputBuffers[iDequeueOutputBuffer];
                        i3 = bufferInfo.size;
                        if (i3 > 0) {
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                decodeAudioFileListener2 = DecodeAudioFile.this.mDecoderListener;
                                if (decodeAudioFileListener2 == null) {
                                    break;
                                }
                                decodeAudioFileListener2.onFinished();
                                break;
                            }
                        } else {
                            byteBufferAllocate = ByteBuffer.allocate(i3);
                            byteBufferAllocate.clear();
                            byteBuffer.position(bufferInfo.offset);
                            byteBuffer.get(byteBufferAllocate.array(), 0, bufferInfo.size);
                            decodeAudioFileListener3 = DecodeAudioFile.this.mDecoderListener;
                            if (decodeAudioFileListener3 != null) {
                                decodeAudioFileListener3.onFrameAvailable(byteBufferAllocate, bufferInfo.presentationTimeUs);
                            }
                            if (DecodeAudioFile.this.mEndDeocdeTime > j3 && bufferInfo.presentationTimeUs > DecodeAudioFile.this.mEndDeocdeTime) {
                                Log.e(DecodeAudioFile.TAG, "audioDecoder 停止解码：截止时间：" + DecodeAudioFile.this.mEndDeocdeTime + "当前解码时间：" + bufferInfo.presentationTimeUs);
                                break;
                            }
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                decodeAudioFileListener2 = DecodeAudioFile.this.mDecoderListener;
                                if (decodeAudioFileListener2 == null) {
                                    break;
                                }
                                decodeAudioFileListener2.onFinished();
                                break;
                            }
                        }
                    } else if (iDequeueOutputBuffer == i2) {
                        outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        outputFormat = mediaCodecCreateDecoderByType.getOutputFormat();
                        DecodeAudioFile.this.mSrcAudioParam.setNumChannels(outputFormat.getInteger("channel-count"));
                        DecodeAudioFile.this.mSrcAudioParam.setSamplingRate(outputFormat.getInteger("sample-rate"));
                        decodeAudioFileListener = DecodeAudioFile.this.mDecoderListener;
                        if (decodeAudioFileListener != null) {
                            decodeAudioFileListener.onForamtChange(outputFormat);
                        }
                        outputFormat.toString();
                    }
                    i5 = i2;
                    j3 = j3;
                } else {
                    int sampleData = DecodeAudioFile.this.mExtractor.readSampleData(inputBuffers[iDequeueInputBuffer], 0);
                    if (sampleData < 0) {
                        z = true;
                        i4 = 0;
                        sampleTime = j3;
                    } else {
                        i4 = sampleData;
                        z = z3;
                        sampleTime = DecodeAudioFile.this.mExtractor.getSampleTime();
                    }
                    if (z || sampleTime >= DecodeAudioFile.this.mStartDecodeTime) {
                        int i6 = z ? 4 : 0;
                        i2 = i5;
                        j2 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                        mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i4, sampleTime, i6);
                        if (!z) {
                            DecodeAudioFile.this.mExtractor.advance();
                        }
                        z2 = z;
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j2);
                        if (iDequeueOutputBuffer >= 0) {
                            byteBuffer = outputBuffers[iDequeueOutputBuffer];
                            i3 = bufferInfo.size;
                            if (i3 > 0) {
                                mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    decodeAudioFileListener2 = DecodeAudioFile.this.mDecoderListener;
                                    if (decodeAudioFileListener2 == null) {
                                        break;
                                    }
                                    decodeAudioFileListener2.onFinished();
                                    break;
                                }
                            } else {
                                byteBufferAllocate = ByteBuffer.allocate(i3);
                                byteBufferAllocate.clear();
                                byteBuffer.position(bufferInfo.offset);
                                byteBuffer.get(byteBufferAllocate.array(), 0, bufferInfo.size);
                                decodeAudioFileListener3 = DecodeAudioFile.this.mDecoderListener;
                                if (decodeAudioFileListener3 != null) {
                                    decodeAudioFileListener3.onFrameAvailable(byteBufferAllocate, bufferInfo.presentationTimeUs);
                                }
                                if (DecodeAudioFile.this.mEndDeocdeTime > j3) {
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        decodeAudioFileListener2 = DecodeAudioFile.this.mDecoderListener;
                                        if (decodeAudioFileListener2 == null) {
                                            break;
                                        }
                                        decodeAudioFileListener2.onFinished();
                                        break;
                                    }
                                } else {
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        decodeAudioFileListener2 = DecodeAudioFile.this.mDecoderListener;
                                        if (decodeAudioFileListener2 == null) {
                                            break;
                                        }
                                        decodeAudioFileListener2.onFinished();
                                        break;
                                    }
                                }
                            }
                        } else if (iDequeueOutputBuffer == i2) {
                            outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                        } else if (iDequeueOutputBuffer == -2) {
                            outputFormat = mediaCodecCreateDecoderByType.getOutputFormat();
                            DecodeAudioFile.this.mSrcAudioParam.setNumChannels(outputFormat.getInteger("channel-count"));
                            DecodeAudioFile.this.mSrcAudioParam.setSamplingRate(outputFormat.getInteger("sample-rate"));
                            decodeAudioFileListener = DecodeAudioFile.this.mDecoderListener;
                            if (decodeAudioFileListener != null) {
                                decodeAudioFileListener.onForamtChange(outputFormat);
                            }
                            outputFormat.toString();
                        }
                        i5 = i2;
                        j3 = j3;
                    } else {
                        DecodeAudioFile.this.mExtractor.advance();
                        i5 = i5;
                        z2 = z;
                    }
                }
            }
            mediaCodecCreateDecoderByType.flush();
            mediaCodecCreateDecoderByType.release();
        }
    };

    public long getDuration() {
        return this.mAudioDuration;
    }

    public AudioParameter getSrcAudioParam() {
        return this.mSrcAudioParam;
    }

    public void release() {
        stopDecode();
        MediaExtractor mediaExtractor = this.mExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mExtractor = null;
        }
        Log.e(TAG, "release: ");
    }

    public boolean setDecodeSource(String str, long j, long j2) {
        this.mSourceFile = str;
        try {
            if (this.mExtractor == null) {
                this.mExtractor = new MediaExtractor();
            }
            this.mExtractor.setDataSource(this.mSourceFile);
            int trackCount = this.mExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i);
                if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                    this.mAudioTrackIndex = i;
                    this.mAudioFormat = trackFormat;
                    if (trackFormat.containsKey("durationUs")) {
                        this.mAudioDuration = this.mAudioFormat.getLong("durationUs");
                    }
                } else {
                    trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("video");
                }
            }
            if (this.mAudioTrackIndex >= 0 && this.mAudioFormat != null) {
                if (this.mSrcAudioParam == null) {
                    this.mSrcAudioParam = new AudioParameter();
                }
                this.mSrcAudioParam.setSamplingRate(this.mAudioFormat.getInteger("sample-rate"));
                this.mSrcAudioParam.setNumChannels(this.mAudioFormat.getInteger("channel-count"));
            }
            this.mStartDecodeTime = j;
            this.mEndDeocdeTime = j2;
            this.mDecodeThread = new Thread(this.mDecodeRunable);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            DecodeAudioFileListener decodeAudioFileListener = this.mDecoderListener;
            if (decodeAudioFileListener != null) {
                decodeAudioFileListener.onDecoderError(-1);
            }
            return false;
        }
    }

    public void setDecoderListener(DecodeAudioFileListener decodeAudioFileListener) {
        this.mDecoderListener = decodeAudioFileListener;
    }

    public void setEnableResample(boolean z, AudioParameter audioParameter) {
        this.mEnableResample = z;
        if (this.mDstAudioParam == null) {
            this.mDstAudioParam = new AudioParameter();
        }
        this.mDstAudioParam.copyOf(audioParameter);
    }

    public void startDecode() {
        this.mStopDecode = false;
        Thread thread = this.mDecodeThread;
        if (thread != null) {
            thread.start();
        }
        Log.e(TAG, "startDecode: ");
    }

    public void stopDecode() {
        this.mStopDecode = true;
        Thread thread = this.mDecodeThread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.mDecodeThread = null;
        }
        Log.e(TAG, "stopDecode: ");
    }
}
