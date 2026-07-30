package com.momo.mcamera.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Environment;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class MediaMuxerWrapper {
    private static final boolean DEBUG = false;
    private static final String DIR_NAME = "AVRecSample";
    private static final String TAG = "MediaMuxerWrapper";
    private static final SimpleDateFormat mDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
    private MediaEncoder mAudioEncoder;
    private final MediaMuxer mMediaMuxer;
    private String mOutputPath;
    private MediaEncoder mVideoEncoder;
    private int mStatredCount = 0;
    private int mEncoderCount = 0;
    private boolean mIsStarted = false;

    @TargetApi(18)
    public MediaMuxerWrapper(String str) throws IOException {
        this.mOutputPath = str;
        this.mMediaMuxer = new MediaMuxer(this.mOutputPath, 0);
    }

    public static final File getCaptureFile(String str, String str2) {
        File file = new File(Environment.getExternalStoragePublicDirectory(str), DIR_NAME);
        file.mkdirs();
        if (!file.canWrite()) {
            return null;
        }
        return new File(file, getDateTimeString() + str2);
    }

    private static final String getDateTimeString() {
        return mDateTimeFormat.format(new GregorianCalendar().getTime());
    }

    public void addEncoder(MediaEncoder mediaEncoder) {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper addEncoder");
        if (!(mediaEncoder instanceof MediaVideoEncoder)) {
            wg3.m206174a("unsupported encoder");
        } else if (this.mVideoEncoder != null) {
            wg3.m206174a("Video encoder already added.");
        } else {
            this.mVideoEncoder = mediaEncoder;
            this.mEncoderCount = 1 + (this.mAudioEncoder != null ? 1 : 0);
        }
    }

    @TargetApi(18)
    public synchronized int addTrack(MediaFormat mediaFormat) {
        if (this.mIsStarted) {
            throw new IllegalStateException("muxer already started");
        }
        return this.mMediaMuxer.addTrack(mediaFormat);
    }

    public String getOutputPath() {
        return this.mOutputPath;
    }

    public synchronized boolean isStarted() {
        return this.mIsStarted;
    }

    public void prepare(ProcessSurface processSurface, MediaFormat mediaFormat) throws IOException {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper prepare");
        MediaEncoder mediaEncoder = this.mVideoEncoder;
        if (mediaEncoder != null) {
            mediaEncoder.prepare(processSurface, mediaFormat);
        }
        MediaEncoder mediaEncoder2 = this.mAudioEncoder;
        if (mediaEncoder2 != null) {
            mediaEncoder2.prepare(null, mediaFormat);
        }
    }

    public void prepareAudio(ProcessSurface processSurface, MediaFormat mediaFormat) throws IOException {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper prepareAudio");
        MediaEncoder mediaEncoder = this.mAudioEncoder;
        if (mediaEncoder != null) {
            mediaEncoder.prepare(null, mediaFormat);
        }
    }

    public void prepareVideo(ProcessSurface processSurface, MediaFormat mediaFormat) throws IOException {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper prepareVideo");
        MediaEncoder mediaEncoder = this.mVideoEncoder;
        if (mediaEncoder != null) {
            mediaEncoder.prepare(processSurface, mediaFormat);
        }
    }

    @TargetApi(18)
    public synchronized boolean start() {
        try {
            int i = this.mStatredCount + 1;
            this.mStatredCount = i;
            int i2 = this.mEncoderCount;
            if (i2 > 0 && i == i2) {
                this.mMediaMuxer.start();
                this.mIsStarted = true;
                notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mIsStarted;
    }

    public void startRecording() {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper startRecording");
        MediaEncoder mediaEncoder = this.mVideoEncoder;
        if (mediaEncoder != null) {
            mediaEncoder.startRecording();
        }
        MediaEncoder mediaEncoder2 = this.mAudioEncoder;
        if (mediaEncoder2 != null) {
            mediaEncoder2.startRecording();
        }
    }

    @TargetApi(18)
    public synchronized void stop() {
        int i = this.mStatredCount - 1;
        this.mStatredCount = i;
        if (this.mEncoderCount > 0 && i <= 0) {
            this.mMediaMuxer.stop();
            this.mMediaMuxer.release();
            this.mIsStarted = false;
        }
    }

    public void stopRecording() {
        MDLog.m7449i(MDLogTag.MEDIA_MUXER_TAG, "MediaMuxerWrapper stopRecording");
        MediaEncoder mediaEncoder = this.mVideoEncoder;
        if (mediaEncoder != null) {
            mediaEncoder.stopRecording();
        }
        this.mVideoEncoder = null;
        MediaEncoder mediaEncoder2 = this.mAudioEncoder;
        if (mediaEncoder2 != null) {
            mediaEncoder2.stopRecording();
        }
        this.mAudioEncoder = null;
    }

    @TargetApi(18)
    public synchronized void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.mStatredCount > 0) {
            this.mMediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        }
    }
}
