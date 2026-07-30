package com.immomo.mediabase.MultiAudioPlayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediabase.AudioParameter;
import com.immomo.mediabase.AudioResampleUtils;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class AudioFileDecode {
    private static final String TAG = "AudioFileDecode";
    private boolean decodeFinish;
    private LinkedBlockingQueue<ByteBuffer> mAudioFrameQueue;
    private Runnable mDecodeRunable;
    private AudioParameter mDstAudioParam;
    private AudioParameter mSrcAudioParam;
    private ByteBuffer mTempBuffer;
    private boolean notifyFinishFlag;
    private boolean notifyPlayStartFlag;
    private final Condition pauseCondition;
    private final ReentrantLock pauseLock;
    private PLAYSTATUS playstatus;
    private long seekTime;
    private long totalSendSize;
    private boolean mEnableResample = false;
    private String mSourceFile = "";
    MediaExtractor mExtractor = null;
    int mAudioTrackIndex = -1;
    long mAudioDuration = 0;
    MediaFormat mAudioFormat = null;
    private long mStartDecodeTime = 0;
    private long mEndDeocdeTime = 0;
    private AudioFileDecodeListener mDecoderListener = null;
    private boolean mStopDecode = false;
    private Thread mDecodeThread = null;
    private boolean mDecodeStarted = false;
    private AudioResampleUtils mAudioResample = null;
    private int playId = -1;
    private boolean isLoop = false;
    private boolean isPublish = false;
    private float playbackVolume = 1.0f;
    private float sendoutVolume = 1.0f;
    private boolean mutePlayback = false;
    private boolean muteSendout = false;
    private int pitch = 0;
    private boolean pause = false;

    public AudioFileDecode(AudioParameter audioParameter) {
        this.mDstAudioParam = null;
        this.mAudioFrameQueue = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.pauseLock = reentrantLock;
        this.pauseCondition = reentrantLock.newCondition();
        this.totalSendSize = 0L;
        this.seekTime = 0L;
        this.decodeFinish = false;
        this.notifyFinishFlag = false;
        this.notifyPlayStartFlag = false;
        this.playstatus = PLAYSTATUS.UNINIT;
        this.mDecodeRunable = new Runnable() { // from class: com.immomo.mediabase.MultiAudioPlayer.AudioFileDecode.1
            /* JADX WARN: Code duplicated, block: B:105:0x0285 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:62:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:64:0x01ef  */
            /* JADX WARN: Code duplicated, block: B:74:0x027c  */
            /* JADX WARN: Code duplicated, block: B:78:0x0292 A[EDGE_INSN: B:78:0x0292->B:90:0x02e9 BREAK  A[LOOP:0: B:34:0x0152->B:106:0x0152]] */
            /* JADX WARN: Code duplicated, block: B:79:0x029e  */
            /* JADX WARN: Code duplicated, block: B:80:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:82:0x02a3  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a8  */
            /* JADX WARN: Code duplicated, block: B:85:0x02ab  */
            /* JADX WARN: Code duplicated, block: B:87:0x02d5  */
            @Override // java.lang.Runnable
            public void run() throws IOException {
                MediaCodec mediaCodecCreateDecoderByType;
                long jSeekMusic;
                String str;
                long j;
                int iDequeueOutputBuffer;
                byte b;
                MediaFormat outputFormat;
                ByteBuffer byteBuffer;
                int i;
                ByteBuffer byteBufferAllocate;
                int iDequeueInputBuffer;
                long sampleTime;
                boolean z;
                AudioFileDecode audioFileDecode = AudioFileDecode.this;
                if (audioFileDecode.mAudioFormat == null || audioFileDecode.mAudioTrackIndex < 0) {
                    if (audioFileDecode.mDecoderListener != null) {
                        AudioFileDecode.this.mDecoderListener.onDecoderError(-2, AudioFileDecode.this);
                        return;
                    }
                    return;
                }
                AudioParameter audioParameter2 = audioFileDecode.mSrcAudioParam;
                AudioParameter audioParameter3 = AudioFileDecode.this.mDstAudioParam;
                AudioFileDecode audioFileDecode2 = AudioFileDecode.this;
                if (audioParameter2 != audioParameter3) {
                    audioFileDecode2.mAudioResample = new AudioResampleUtils();
                    AudioFileDecode.this.mAudioResample.initResampleInfo(AudioFileDecode.this.mSrcAudioParam.getSamplingRate(), AudioFileDecode.this.mSrcAudioParam.getNumChannels(), AudioFileDecode.this.mSrcAudioParam.getSampleBits(), AudioFileDecode.this.mDstAudioParam.getSamplingRate(), AudioFileDecode.this.mDstAudioParam.getNumChannels(), AudioFileDecode.this.mDstAudioParam.getSampleBits());
                    AudioFileDecode.this.mEnableResample = true;
                    if (AudioFileDecode.this.mDecoderListener != null) {
                        AudioFileDecode.this.mDecoderListener.onResampleOpen(AudioFileDecode.this.mSrcAudioParam, AudioFileDecode.this.mDstAudioParam, AudioFileDecode.this);
                    }
                } else {
                    audioFileDecode2.mEnableResample = false;
                }
                AudioFileDecode audioFileDecode3 = AudioFileDecode.this;
                audioFileDecode3.mExtractor.selectTrack(audioFileDecode3.mAudioTrackIndex);
                try {
                    mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(AudioFileDecode.this.mAudioFormat.getString(IMediaFormat.KEY_MIME));
                } catch (IOException e) {
                    e.printStackTrace();
                    mediaCodecCreateDecoderByType = null;
                }
                mediaCodecCreateDecoderByType.configure(AudioFileDecode.this.mAudioFormat, (Surface) null, (MediaCrypto) null, 0);
                mediaCodecCreateDecoderByType.start();
                ByteBuffer[] inputBuffers = mediaCodecCreateDecoderByType.getInputBuffers();
                ByteBuffer[] outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                long j2 = 0;
                if (AudioFileDecode.this.mStartDecodeTime <= 0 || 0 >= AudioFileDecode.this.mStartDecodeTime) {
                    jSeekMusic = 0;
                } else {
                    AudioFileDecode audioFileDecode4 = AudioFileDecode.this;
                    jSeekMusic = audioFileDecode4.seekMusic(audioFileDecode4.mStartDecodeTime);
                }
                long j3 = AudioFileDecode.this.mStartDecodeTime;
                String str2 = AudioFileDecode.TAG;
                if (j3 > 0 && jSeekMusic < AudioFileDecode.this.mStartDecodeTime) {
                    if (AudioFileDecode.this.mDecoderListener != null) {
                        AudioFileDecode.this.mDecoderListener.onDecoderError(-3, AudioFileDecode.this);
                    }
                    Log.e(AudioFileDecode.TAG, "SEEK Error SEEK to " + AudioFileDecode.this.mStartDecodeTime + " currentPos:" + jSeekMusic + ", duration:" + AudioFileDecode.this.mAudioDuration);
                    return;
                }
                AudioFileDecode.this.mAudioFrameQueue.clear();
                AudioFileDecode.this.playstatus = PLAYSTATUS.PLAY;
                boolean z2 = false;
                while (!AudioFileDecode.this.mStopDecode) {
                    if (AudioFileDecode.this.seekTime > j2) {
                        AudioFileDecode audioFileDecode5 = AudioFileDecode.this;
                        audioFileDecode5.seekMusic(audioFileDecode5.seekTime * 1000);
                        AudioFileDecode.this.mAudioFrameQueue.clear();
                        AudioFileDecode.this.seekTime = j2;
                    }
                    boolean z3 = z2;
                    if (z2 || (iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) < 0) {
                        str = str2;
                        j = 5000;
                        z2 = z3;
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                        if (iDequeueOutputBuffer >= 0) {
                            byteBuffer = outputBuffers[iDequeueOutputBuffer];
                            i = bufferInfo.size;
                            if (i > 0) {
                                byteBufferAllocate = ByteBuffer.allocate(i);
                                byteBufferAllocate.clear();
                                byteBuffer.position(bufferInfo.offset);
                                byteBuffer.get(byteBufferAllocate.array(), 0, bufferInfo.size);
                                if (AudioFileDecode.this.mEnableResample && AudioFileDecode.this.mAudioResample != null) {
                                    byteBufferAllocate = AudioFileDecode.this.mAudioResample.resamplePcmData(byteBufferAllocate.array(), ((byteBufferAllocate.limit() * 8) / AudioFileDecode.this.mSrcAudioParam.getSampleBits()) / AudioFileDecode.this.mSrcAudioParam.getNumChannels());
                                }
                                AudioFileDecode.this.putSampleData(byteBufferAllocate, bufferInfo);
                                if (AudioFileDecode.this.mEndDeocdeTime <= j2 && bufferInfo.presentationTimeUs > AudioFileDecode.this.mEndDeocdeTime) {
                                    Log.e(str, "audioDecoder 停止解码：截止时间：" + AudioFileDecode.this.mEndDeocdeTime + "当前解码时间：" + bufferInfo.presentationTimeUs);
                                    break;
                                }
                                mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    AudioFileDecode.this.decodeFinish = true;
                                    if (AudioFileDecode.this.mDecoderListener == null) {
                                        break;
                                    }
                                    AudioFileDecode.this.mDecoderListener.onDecodeFinished(AudioFileDecode.this);
                                    break;
                                }
                                b = -3;
                            } else {
                                mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    AudioFileDecode.this.decodeFinish = true;
                                    if (AudioFileDecode.this.mDecoderListener == null) {
                                        break;
                                    }
                                    AudioFileDecode.this.mDecoderListener.onDecodeFinished(AudioFileDecode.this);
                                    break;
                                }
                                b = -3;
                            }
                        } else {
                            b = -3;
                            if (iDequeueOutputBuffer == -3) {
                                outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                            } else if (iDequeueOutputBuffer == -2) {
                                outputFormat = mediaCodecCreateDecoderByType.getOutputFormat();
                                AudioFileDecode.this.mSrcAudioParam.setNumChannels(outputFormat.getInteger("channel-count"));
                                AudioFileDecode.this.mSrcAudioParam.setSamplingRate(outputFormat.getInteger("sample-rate"));
                                if (AudioFileDecode.this.mDecoderListener != null) {
                                    AudioFileDecode.this.mDecoderListener.onForamtChange(outputFormat, AudioFileDecode.this);
                                }
                                outputFormat.toString();
                            }
                        }
                        str2 = str;
                        j2 = j2;
                    } else {
                        int sampleData = AudioFileDecode.this.mExtractor.readSampleData(inputBuffers[iDequeueInputBuffer], 0);
                        if (sampleData < 0) {
                            z = true;
                            sampleData = 0;
                            sampleTime = j2;
                        } else {
                            sampleTime = AudioFileDecode.this.mExtractor.getSampleTime();
                            z = z3;
                        }
                        if (z || sampleTime >= AudioFileDecode.this.mStartDecodeTime) {
                            String str3 = str2;
                            long j4 = sampleTime;
                            int i2 = z ? 4 : 0;
                            str = str3;
                            j = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, j4, i2);
                            if (!z) {
                                AudioFileDecode.this.mExtractor.advance();
                            }
                            z2 = z;
                            iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, j);
                            if (iDequeueOutputBuffer >= 0) {
                                byteBuffer = outputBuffers[iDequeueOutputBuffer];
                                i = bufferInfo.size;
                                if (i > 0) {
                                    byteBufferAllocate = ByteBuffer.allocate(i);
                                    byteBufferAllocate.clear();
                                    byteBuffer.position(bufferInfo.offset);
                                    byteBuffer.get(byteBufferAllocate.array(), 0, bufferInfo.size);
                                    if (AudioFileDecode.this.mEnableResample) {
                                        byteBufferAllocate = AudioFileDecode.this.mAudioResample.resamplePcmData(byteBufferAllocate.array(), ((byteBufferAllocate.limit() * 8) / AudioFileDecode.this.mSrcAudioParam.getSampleBits()) / AudioFileDecode.this.mSrcAudioParam.getNumChannels());
                                    }
                                    AudioFileDecode.this.putSampleData(byteBufferAllocate, bufferInfo);
                                    if (AudioFileDecode.this.mEndDeocdeTime <= j2) {
                                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            AudioFileDecode.this.decodeFinish = true;
                                            if (AudioFileDecode.this.mDecoderListener == null) {
                                                break;
                                            }
                                            AudioFileDecode.this.mDecoderListener.onDecodeFinished(AudioFileDecode.this);
                                            break;
                                        }
                                        b = -3;
                                    } else {
                                        mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            AudioFileDecode.this.decodeFinish = true;
                                            if (AudioFileDecode.this.mDecoderListener == null) {
                                                break;
                                            }
                                            AudioFileDecode.this.mDecoderListener.onDecodeFinished(AudioFileDecode.this);
                                            break;
                                        }
                                        b = -3;
                                    }
                                } else {
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        AudioFileDecode.this.decodeFinish = true;
                                        if (AudioFileDecode.this.mDecoderListener == null) {
                                            break;
                                        }
                                        AudioFileDecode.this.mDecoderListener.onDecodeFinished(AudioFileDecode.this);
                                        break;
                                    }
                                    b = -3;
                                }
                            } else {
                                b = -3;
                                if (iDequeueOutputBuffer == -3) {
                                    outputBuffers = mediaCodecCreateDecoderByType.getOutputBuffers();
                                } else if (iDequeueOutputBuffer == -2) {
                                    outputFormat = mediaCodecCreateDecoderByType.getOutputFormat();
                                    AudioFileDecode.this.mSrcAudioParam.setNumChannels(outputFormat.getInteger("channel-count"));
                                    AudioFileDecode.this.mSrcAudioParam.setSamplingRate(outputFormat.getInteger("sample-rate"));
                                    if (AudioFileDecode.this.mDecoderListener != null) {
                                        AudioFileDecode.this.mDecoderListener.onForamtChange(outputFormat, AudioFileDecode.this);
                                    }
                                    outputFormat.toString();
                                }
                            }
                            str2 = str;
                            j2 = j2;
                        } else {
                            AudioFileDecode.this.mExtractor.advance();
                            z2 = z;
                        }
                    }
                }
                mediaCodecCreateDecoderByType.flush();
                mediaCodecCreateDecoderByType.release();
                AudioFileDecode.this.playstatus = PLAYSTATUS.STOP;
            }
        };
        this.mTempBuffer = ByteBuffer.allocate(16384);
        this.mAudioFrameQueue = new LinkedBlockingQueue<>(10);
        AudioParameter audioParameter2 = new AudioParameter();
        this.mDstAudioParam = audioParameter2;
        audioParameter2.copyOf(audioParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long seekMusic(long j) {
        long j2 = 0;
        if (j > 0) {
            this.mExtractor.seekTo(j, 1);
            while (j2 < j && this.mExtractor.advance()) {
                long sampleTime = this.mExtractor.getSampleTime();
                if (sampleTime == -1) {
                    break;
                }
                j2 = sampleTime;
            }
            Log.e(TAG, "SEEK to " + j + " currentPos:" + j2);
        }
        return j2;
    }

    public long getCurrentPos() {
        AudioParameter audioParameter = this.mDstAudioParam;
        if (audioParameter == null) {
            return -1L;
        }
        int samplingRate = audioParameter.getSamplingRate();
        int numChannels = this.mDstAudioParam.getNumChannels();
        if (samplingRate == 0 || numChannels == 0) {
            return -1L;
        }
        return (((this.totalSendSize * 1000) / ((long) samplingRate)) / ((long) numChannels)) / 2;
    }

    public long getDuration() {
        return this.mAudioDuration / 1000;
    }

    public int getId() {
        return this.playId;
    }

    public int getPitch() {
        return this.pitch;
    }

    public PLAYSTATUS getPlayStatus() {
        return this.playstatus;
    }

    public float getPlaybackVolume() {
        return this.playbackVolume;
    }

    public ByteBuffer getSampleFrame() {
        ByteBuffer byteBufferPoll = this.mAudioFrameQueue.poll();
        if (byteBufferPoll != null) {
            if (!this.notifyPlayStartFlag) {
                this.mDecoderListener.onPlayStart(this);
                this.notifyPlayStartFlag = true;
                return byteBufferPoll;
            }
        } else if (this.decodeFinish && !this.notifyFinishFlag) {
            AudioFileDecodeListener audioFileDecodeListener = this.mDecoderListener;
            if (audioFileDecodeListener != null) {
                audioFileDecodeListener.onPlayFinished(this);
            }
            this.notifyFinishFlag = true;
        }
        return byteBufferPoll;
    }

    public float getSendoutVolume() {
        return this.sendoutVolume;
    }

    public AudioParameter getSrcAudioParam() {
        return this.mSrcAudioParam;
    }

    public String getUrl() {
        return this.mSourceFile;
    }

    public boolean isLoop() {
        return this.isLoop;
    }

    public boolean isMutePlayback() {
        return this.mutePlayback;
    }

    public boolean isMuteSendout() {
        return this.muteSendout;
    }

    public boolean isPublish() {
        return this.isPublish;
    }

    public void pause() {
        this.pauseLock.lock();
        this.pause = true;
        this.playstatus = PLAYSTATUS.PAUSE;
        this.pauseLock.unlock();
    }

    public void putSampleData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (byteBuffer == null) {
            return;
        }
        this.pauseLock.lock();
        while (this.pause) {
            try {
                try {
                    this.pauseCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                this.pauseLock.unlock();
                throw th;
            }
        }
        this.pauseLock.unlock();
        try {
            if (this.mTempBuffer.remaining() < byteBuffer.limit()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((byteBuffer.limit() * 2) + 2048);
                byteBufferAllocate.put(this.mTempBuffer);
                byteBufferAllocate.put(byteBuffer);
                this.mTempBuffer = byteBufferAllocate;
            } else {
                this.mTempBuffer.put(byteBuffer);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.mTempBuffer.flip();
        while (this.mTempBuffer.remaining() >= 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            this.mTempBuffer.get(byteBufferAllocate2.array(), 0, 2048);
            try {
                AudioFileDecodeListener audioFileDecodeListener = this.mDecoderListener;
                if (audioFileDecodeListener != null) {
                    audioFileDecodeListener.onProcessFrame(byteBufferAllocate2, bufferInfo.presentationTimeUs, this);
                }
                this.mAudioFrameQueue.put(byteBufferAllocate2);
                this.totalSendSize += 2048;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
        }
        this.mTempBuffer.compact();
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

    public void resume() {
        this.pauseLock.lock();
        this.pause = false;
        this.playstatus = PLAYSTATUS.PLAY;
        this.pauseCondition.signalAll();
        this.pauseLock.unlock();
    }

    public void seek(long j) {
        if (this.mExtractor != null) {
            this.seekTime = j * 1000;
        }
    }

    public boolean setDecodeSource(int i, String str, long j, long j2, boolean z, boolean z2) {
        if (str.length() < 0) {
            return false;
        }
        this.playId = i;
        this.mSourceFile = str;
        this.mStartDecodeTime = j;
        this.mEndDeocdeTime = j2;
        this.isLoop = z;
        this.isPublish = z2;
        try {
            if (this.mExtractor == null) {
                this.mExtractor = new MediaExtractor();
            }
            this.mExtractor.setDataSource(this.mSourceFile);
            int trackCount = this.mExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i2);
                if (trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                    this.mAudioTrackIndex = i2;
                    this.mAudioFormat = trackFormat;
                    if (trackFormat.containsKey("durationUs")) {
                        this.mAudioDuration = this.mAudioFormat.getLong("durationUs");
                    }
                } else {
                    trackFormat.getString(IMediaFormat.KEY_MIME).startsWith("video");
                }
            }
            if (this.mAudioTrackIndex < 0 || this.mAudioFormat == null) {
                return false;
            }
            if (this.mSrcAudioParam == null) {
                this.mSrcAudioParam = new AudioParameter();
            }
            this.mSrcAudioParam.setSamplingRate(this.mAudioFormat.getInteger("sample-rate"));
            this.mSrcAudioParam.setNumChannels(this.mAudioFormat.getInteger("channel-count"));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            AudioFileDecodeListener audioFileDecodeListener = this.mDecoderListener;
            if (audioFileDecodeListener != null) {
                audioFileDecodeListener.onDecoderError(-1, this);
            }
            return false;
        }
    }

    public void setDecoderListener(AudioFileDecodeListener audioFileDecodeListener) {
        this.mDecoderListener = audioFileDecodeListener;
    }

    public void setEnableResample(boolean z, AudioParameter audioParameter) {
        this.mEnableResample = z;
        if (this.mDstAudioParam == null) {
            this.mDstAudioParam = new AudioParameter();
        }
        this.mDstAudioParam.copyOf(audioParameter);
    }

    public void setMutePlayback(boolean z) {
        this.mutePlayback = z;
    }

    public void setMuteSendout(boolean z) {
        this.muteSendout = z;
    }

    public void setPitch(int i) {
        this.pitch = i;
    }

    public void setPlaybackVolume(float f) {
        this.playbackVolume = f;
    }

    public void setSendoutVolume(float f) {
        this.sendoutVolume = f;
    }

    public void startDecode(long j, long j2) {
        this.mStartDecodeTime = j * 1000;
        this.mEndDeocdeTime = j2 * 1000;
        if (this.mDecodeThread != null && this.mDecodeStarted) {
            AudioFileDecodeListener audioFileDecodeListener = this.mDecoderListener;
            if (audioFileDecodeListener != null) {
                audioFileDecodeListener.onDecoderError(0, this);
            }
            stopDecode();
        }
        Thread thread = new Thread(this.mDecodeRunable);
        this.mDecodeThread = thread;
        thread.start();
    }

    public void stopDecode() {
        this.mStopDecode = true;
        this.mAudioFrameQueue.clear();
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

    public void startDecode() {
        startDecode(0L, 0L);
    }

    public boolean setDecodeSource(int i, String str, boolean z, boolean z2) {
        return setDecodeSource(i, str, 0L, 0L, false, false);
    }

    public boolean setDecodeSource(int i, String str) {
        return setDecodeSource(i, str, 0L, 0L, false, false);
    }
}
