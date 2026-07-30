package com.bytedance.bae.webrtc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.TXLiteAVCode;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.agora.utils2.internal.CommonUtility;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
class WebRtcAudioFile {
    private static final int MAX_DECODER_RETRY_COUNT = 100;
    private static final String TAG = "WebRtcAudioRecordFile";
    private boolean eoInputStream;
    private boolean eoOutputStream;

    @Nullable
    private byte[] mDecodedData;

    @Nullable
    private MediaExtractor mExtractor;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;

    @Nullable
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private int mRetryCount;
    private Vector<Integer> mTrackIds;

    @Nullable
    private MediaFormat mUsedTrackFormat;
    private int mUsedTrackIdx;

    /* JADX INFO: renamed from: oc */
    private HttpURLConnection f4703oc;
    private int mSampleRate = 0;
    private int mChannels = 0;

    @CalledByNative
    public WebRtcAudioFile() {
        RXLogging.m5688e(TAG, "AudioMix WebRtcAudioFile");
    }

    private boolean checkInfoChange() {
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            boolean z = (this.mSampleRate == integer && this.mChannels == integer2) ? false : true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when checking file's new format");
            return false;
        }
    }

    private boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when releasing audio file stream");
            return false;
        }
    }

    private String encodeUrl(String str) {
        RXLogging.m5688e(TAG, "encodedUrl");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private boolean isAvailableOnlineURL(String str) {
        boolean z;
        RXLogging.m5688e(TAG, "isAvailableOnlineURL");
        this.f4703oc = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            this.f4703oc = httpURLConnection;
            httpURLConnection.setUseCaches(false);
            this.f4703oc.setConnectTimeout(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
            RXLogging.m5688e(TAG, "connect done....");
            int responseCode = this.f4703oc.getResponseCode();
            if (200 == responseCode) {
                z = true;
            } else {
                RXLogging.m5688e(TAG, "url is not available, error:" + responseCode);
                z = false;
            }
            InputStream inputStream = this.f4703oc.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "++Error when test online url: " + e.getMessage());
            return false;
        } finally {
            HttpURLConnection httpURLConnection2 = this.f4703oc;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        }
    }

    @CalledByNative
    public void disConnectURL() {
        RXLogging.m5688e(TAG, "disConnectURL");
        HttpURLConnection httpURLConnection = this.f4703oc;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @CalledByNative
    public int getAudioTrackCount() {
        Vector<Integer> vector = this.mTrackIds;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    @CalledByNative
    public int getChannelCount() {
        return this.mChannels;
    }

    @CalledByNative
    public long getCurrentFilePosition() {
        try {
            return this.mExtractor.getSampleTime() / 1000;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when getCurrentFilePosition");
            return 0L;
        }
    }

    @Nullable
    @CalledByNative
    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    @CalledByNative
    public long getFileLength() {
        return this.mFileLength / 1000;
    }

    @CalledByNative
    public int getSampleRate() {
        return this.mSampleRate;
    }

    @CalledByNative
    public int getUsedTrackIdx() {
        return this.mUsedTrackIdx;
    }

    @CalledByNative
    public boolean init(String str, int i) {
        try {
            RXLogging.m5690i(TAG, "Try to decode audio file : " + str);
            this.mTrackIds = new Vector<>();
            if (URLUtil.isNetworkUrl(str)) {
                if (!checkUrlEncoded(str)) {
                    str = encodeUrl(str);
                }
                if (str != null) {
                    if (!isAvailableOnlineURL(str)) {
                    }
                }
                return false;
            }
            this.mRetryCount = 0;
            this.mExtractor = new MediaExtractor();
            Context applicationContext = ContextUtils.getApplicationContext();
            if (str.startsWith("/assets/") && applicationContext != null) {
                AssetFileDescriptor assetFileDescriptorOpenFd = applicationContext.getAssets().openFd(str.substring(8));
                this.mExtractor.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            } else if (!str.startsWith(CommonUtility.PREFIX_URI) || applicationContext == null) {
                this.mExtractor.setDataSource(str);
            } else {
                this.mExtractor.setDataSource(applicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                this.mExtractor.unselectTrack(i2);
            }
            if (i + 1 > trackCount) {
                RXLogging.m5688e(TAG, "useTrack > trackCount");
                return false;
            }
            this.mChannels = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < trackCount; i4++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i4);
                String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                if (string.contains("audio/")) {
                    if (i == i3) {
                        this.mExtractor.selectTrack(i4);
                        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                        this.mMediaCodec = mediaCodecCreateDecoderByType;
                        mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                        this.mUsedTrackFormat = trackFormat;
                        this.mUsedTrackIdx = i3;
                    }
                    i3++;
                    this.mTrackIds.addElement(new Integer(i4));
                    int integer = trackFormat.getInteger("channel-count");
                    if (integer > this.mChannels) {
                        this.mChannels = integer;
                    }
                }
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec == null) {
                RXLogging.m5688e(TAG, "mMediaCodec is null");
                return false;
            }
            mediaCodec.start();
            this.mSampleRate = this.mUsedTrackFormat.getInteger("sample-rate");
            this.mFileLength = this.mUsedTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when creating audio file decode, error:" + e.getMessage());
            RXLogging.m5688e(TAG, "stack track: " + Log.getStackTraceString(e));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0119 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0008, B:5:0x000c, B:8:0x0012, B:10:0x001a, B:12:0x0020, B:14:0x002e, B:18:0x0036, B:20:0x0046, B:21:0x0048, B:22:0x0055, B:24:0x0059, B:30:0x0070, B:32:0x0074, B:34:0x007a, B:35:0x007c, B:39:0x0091, B:40:0x009b, B:42:0x00a0, B:43:0x00c5, B:46:0x00dd, B:45:0x00cb, B:47:0x00e4, B:49:0x00ed, B:51:0x00f9, B:53:0x0105, B:55:0x010f, B:57:0x0119, B:58:0x0149, B:59:0x0153, B:60:0x0158), top: B:65:0x0008 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0119, please report this as an issue */
    @CalledByNative
    public boolean readAudioData() {
        int iDequeueInputBuffer;
        int i;
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null && this.mExtractor != null) {
                if (!this.eoInputStream && (iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L)) >= 0) {
                    int sampleData = this.mExtractor.readSampleData(this.mMediaCodec.getInputBuffer(iDequeueInputBuffer), 0);
                    if (sampleData <= 0) {
                        this.eoInputStream = true;
                        i = 0;
                    } else {
                        i = sampleData;
                    }
                    long sampleTime = this.mExtractor.getSampleTime();
                    int sampleFlags = this.mExtractor.getSampleFlags();
                    if (this.eoInputStream) {
                        sampleFlags |= 4;
                    }
                    this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                    this.mExtractor.advance();
                }
                if (!this.eoOutputStream) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    this.mDecodedData = null;
                    if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer == -2) {
                        this.mDecodedData = new byte[0];
                    } else if (iDequeueOutputBuffer != -1) {
                        this.mRetryCount = 0;
                        if (iDequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                            int integer = this.mUsedTrackFormat.getInteger("channel-count");
                            int i2 = this.mChannels;
                            if (integer != i2 && i2 == 2) {
                                this.mDecodedData = new byte[outputBuffer.limit() * 2];
                                for (int i3 = 0; i3 < bufferInfo.size / 2; i3++) {
                                    int i4 = i3 * 4;
                                    this.mDecodedData[i4] = outputBuffer.get();
                                    byte[] bArr = this.mDecodedData;
                                    bArr[i4 + 2] = bArr[i4];
                                    int i5 = i4 + 1;
                                    bArr[i5] = outputBuffer.get();
                                    byte[] bArr2 = this.mDecodedData;
                                    bArr2[i4 + 3] = bArr2[i5];
                                }
                                outputBuffer.clear();
                            } else if (integer == i2) {
                                byte[] bArr3 = new byte[outputBuffer.limit()];
                                this.mDecodedData = bArr3;
                                outputBuffer.get(bArr3, bufferInfo.offset, bufferInfo.size);
                                outputBuffer.clear();
                            }
                            this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        }
                    } else {
                        int i6 = this.mRetryCount + 1;
                        this.mRetryCount = i6;
                        if (i6 >= 100) {
                            String str = Build.BRAND;
                            if (str.toLowerCase().contains("meizu")) {
                                RXLogging.m5688e(TAG, "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                                this.eoOutputStream = true;
                                this.mRetryCount = 0;
                            } else {
                                String str2 = Build.MANUFACTURER;
                                if (str2.toLowerCase().contains("meizu") || str.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO) || str2.toLowerCase().contains(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
                                    RXLogging.m5688e(TAG, "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                                    this.eoOutputStream = true;
                                    this.mRetryCount = 0;
                                }
                            }
                        }
                        this.mDecodedData = new byte[0];
                        Thread.sleep(3L);
                    }
                }
                return this.eoOutputStream;
            }
            return this.eoInputStream;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @CalledByNative
    public void selectTrack(int i) {
        try {
            Vector<Integer> vector = this.mTrackIds;
            if (vector == null || i + 1 > vector.size() || this.mUsedTrackIdx == i) {
                return;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null && this.mMediaCodec != null) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(this.mTrackIds.get(i).intValue());
                if (this.mSampleRate != trackFormat.getInteger("sample-rate")) {
                    RXLogging.m5688e(TAG, "mSampleRate = " + this.mSampleRate + ", used_SampleRate = " + trackFormat.getInteger("sample-rate"));
                    return;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                RXLogging.m5688e(TAG, "++current_postion = " + sampleTime);
                this.mExtractor.unselectTrack(this.mTrackIds.get(this.mUsedTrackIdx).intValue());
                this.mMediaCodec.stop();
                trackFormat.getString(IMediaFormat.KEY_MIME);
                this.mExtractor.selectTrack(this.mTrackIds.get(i).intValue());
                this.mExtractor.seekTo(sampleTime, 2);
                this.mMediaCodec.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                this.mMediaCodec.start();
                this.mUsedTrackFormat = trackFormat;
                this.mUsedTrackIdx = i;
                return;
            }
            RXLogging.m5688e(TAG, "mExtractor or mMediaCodec is null, mExtractor = " + this.mExtractor + ", mMediaCodec = " + this.mMediaCodec);
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when selectTrack");
        }
    }

    @CalledByNative
    public void setCurrentFilePosition(long j) {
        if (this.eoOutputStream) {
            try {
                this.mMediaCodec.flush();
            } catch (Exception e) {
                e.printStackTrace();
                RXLogging.m5688e(TAG, "Error when setCurrentFilePosition, mMediaCodec.flush");
            }
        }
        try {
            this.mExtractor.seekTo(j * 1000, 2);
            this.eoInputStream = false;
            this.eoOutputStream = false;
        } catch (Exception e2) {
            e2.printStackTrace();
            RXLogging.m5688e(TAG, "Error when setCurrentFilePosition, mExtractor.seekTo");
        }
    }

    @CalledByNative
    public void uninit() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            MediaExtractor mediaExtractor = this.mExtractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            RXLogging.m5688e(TAG, "Error when releasing audio file stream" + e.getMessage());
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }
}
