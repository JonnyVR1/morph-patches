package com.tencent.could.huiyansdk.manager;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.PlaybackException;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.could.component.common.p079ai.log.AiLog;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.callback.InterfaceC13886e;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.utils.C13926a;
import com.tencent.could.huiyansdk.utils.C13927b;
import com.tencent.could.huiyansdk.utils.C13930e;
import com.tencent.could.huiyansdk.utils.C13934i;
import com.tencent.could.huiyansdk.utils.C13935j;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.wcdb.FileUtils;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.f */
/* JADX INFO: loaded from: classes2.dex */
public class C13906f {

    /* JADX INFO: renamed from: b */
    public volatile int f57447b;

    /* JADX INFO: renamed from: c */
    public volatile int f57448c;

    /* JADX INFO: renamed from: d */
    public MediaCodec f57449d;

    /* JADX INFO: renamed from: e */
    public MediaMuxer f57450e;

    /* JADX INFO: renamed from: g */
    public String f57452g;

    /* JADX INFO: renamed from: h */
    public String f57453h;

    /* JADX INFO: renamed from: i */
    public Object f57454i;

    /* JADX INFO: renamed from: m */
    public long f57458m;

    /* JADX INFO: renamed from: a */
    public ArrayBlockingQueue<byte[]> f57446a = new ArrayBlockingQueue<>(10);

    /* JADX INFO: renamed from: f */
    public int f57451f = -1;

    /* JADX INFO: renamed from: j */
    public volatile boolean f57455j = false;

    /* JADX INFO: renamed from: k */
    public volatile boolean f57456k = false;

    /* JADX INFO: renamed from: l */
    public int f57457l = 0;

    /* JADX INFO: renamed from: n */
    public volatile boolean f57459n = true;

    /* JADX INFO: renamed from: o */
    public int f57460o = -1;

    /* JADX INFO: renamed from: p */
    public boolean f57461p = false;

    /* JADX INFO: renamed from: q */
    public boolean f57462q = true;

    /* JADX INFO: renamed from: r */
    public boolean f57463r = false;

    /* JADX INFO: renamed from: s */
    public boolean f57464s = true;

    /* JADX INFO: renamed from: t */
    public boolean f57465t = false;

    /* JADX INFO: renamed from: u */
    public int f57466u = 0;

    /* JADX INFO: renamed from: v */
    public int f57467v = 0;

    /* JADX INFO: renamed from: w */
    public final CountDownLatch f57468w = new CountDownLatch(1);

    public C13906f() {
        m82354b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m82343e() {
        String string;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        Context contextM82240a = huiYanBaseApi.m82240a();
        if (contextM82240a == null) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "Context is null");
            return;
        }
        if (huiYanBaseApi.f57356d) {
            StringBuilder sb = new StringBuilder();
            sb.append(contextM82240a.getExternalFilesDir(null));
            String str = File.separator;
            sb.append(str);
            sb.append("cloud-huiyan");
            sb.append(str);
            sb.append("video");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(contextM82240a.getFilesDir());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("cloud-huiyan");
            sb2.append(str2);
            sb2.append("video");
            string = sb2.toString();
        }
        File file = new File(string);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX INFO: renamed from: f */
    public void m82344f() {
        int i;
        if (this.f57462q) {
            this.f57457l = 0;
            int codecCount = MediaCodecList.getCodecCount();
            int i2 = 0;
            MediaCodecInfo mediaCodecInfo = null;
            while (true) {
                if (i2 >= codecCount || mediaCodecInfo != null) {
                    if (mediaCodecInfo != null) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(YtVideoEncoder.MIME_TYPE);
                        i = 21;
                        if (!m82351a(21, capabilitiesForType.colorFormats)) {
                            i = 19;
                            if (!m82351a(19, capabilitiesForType.colorFormats)) {
                            }
                        }
                    }
                    this.f57460o = i;
                    if (i == -1) {
                        this.f57459n = false;
                        C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "this phone not support video!");
                    } else {
                        this.f57454i = new Object();
                        this.f57459n = true;
                        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f57447b, this.f57448c);
                        mediaFormatCreateVideoFormat.setInteger("color-format", this.f57460o);
                        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
                        mediaFormatCreateVideoFormat.setInteger("bitrate", PlaybackException.CUSTOM_ERROR_CODE_BASE);
                        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                        mediaFormatCreateVideoFormat.setInteger("width", this.f57447b);
                        mediaFormatCreateVideoFormat.setInteger("height", this.f57448c);
                        try {
                            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
                            this.f57449d = mediaCodecCreateEncoderByType;
                            mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                            this.f57449d.start();
                            this.f57452g = m82347a("temp.mp4");
                            this.f57453h = m82347a("HuiYanVideo_" + System.currentTimeMillis() + ".mp4");
                            MediaMuxer mediaMuxer = new MediaMuxer(this.f57452g, 0);
                            this.f57450e = mediaMuxer;
                            mediaMuxer.setOrientationHint(m82357c());
                        } catch (Exception e) {
                            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "init error! e: " + e.getMessage());
                            this.f57461p = true;
                            this.f57459n = false;
                        }
                    }
                } else {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                    if (codecInfoAt.isEncoder()) {
                        String[] supportedTypes = codecInfoAt.getSupportedTypes();
                        if (supportedTypes != null) {
                            boolean z = false;
                            for (int i3 = 0; i3 < supportedTypes.length && !z; i3++) {
                                if (supportedTypes[i3].equals(YtVideoEncoder.MIME_TYPE)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                mediaCodecInfo = codecInfoAt;
                            }
                        }
                    }
                    i2++;
                }
                i = -1;
                this.f57460o = i;
                if (i == -1) {
                    this.f57459n = false;
                    C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "this phone not support video!");
                } else {
                    this.f57454i = new Object();
                    this.f57459n = true;
                    MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f57447b, this.f57448c);
                    mediaFormatCreateVideoFormat2.setInteger("color-format", this.f57460o);
                    mediaFormatCreateVideoFormat2.setInteger("frame-rate", 30);
                    mediaFormatCreateVideoFormat2.setInteger("bitrate", PlaybackException.CUSTOM_ERROR_CODE_BASE);
                    mediaFormatCreateVideoFormat2.setInteger("i-frame-interval", 1);
                    mediaFormatCreateVideoFormat2.setInteger("width", this.f57447b);
                    mediaFormatCreateVideoFormat2.setInteger("height", this.f57448c);
                    MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
                    this.f57449d = mediaCodecCreateEncoderByType2;
                    mediaCodecCreateEncoderByType2.configure(mediaFormatCreateVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
                    this.f57449d.start();
                    this.f57452g = m82347a("temp.mp4");
                    this.f57453h = m82347a("HuiYanVideo_" + System.currentTimeMillis() + ".mp4");
                    MediaMuxer mediaMuxer2 = new MediaMuxer(this.f57452g, 0);
                    this.f57450e = mediaMuxer2;
                    mediaMuxer2.setOrientationHint(m82357c());
                }
            }
        } else {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "do not need video");
        }
        this.f57468w.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m82345g() throws Throwable {
        Object obj;
        byte[] bArrM82352a;
        Exception e;
        C13934i<byte[]> c13934i;
        C13934i<byte[]> c13934i2;
        C13934i<byte[]> c13934i3;
        try {
            this.f57468w.await();
        } catch (InterruptedException e2) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "countDownLatch.wait(): " + e2.getLocalizedMessage());
        }
        while (!this.f57455j) {
            long j = this.f57458m;
            if (this.f57446a.size() > 0) {
                byte[] bArrPoll = this.f57446a.poll();
                try {
                    bArrM82352a = m82352a(bArrPoll);
                    C13927b.a.f57501a.m82391a(bArrPoll);
                    try {
                        try {
                            if (this.f57447b == 640) {
                                this.f57448c = FileUtils.S_IRWXU;
                            } else if (this.f57447b == 1280) {
                                this.f57448c = IMediaPlayer.MEDIA_INFO_INITBUFFERING_START;
                            }
                            if (this.f57464s) {
                                m82356b(bArrM82352a, this.f57447b, this.f57448c);
                            }
                            if (this.f57465t) {
                                bArrM82352a = m82359c(bArrM82352a, this.f57447b, this.f57448c);
                            }
                            byte[] bArrM82353a = m82353a(bArrM82352a, this.f57447b, this.f57448c);
                            if (bArrM82353a == null) {
                                m82355b(bArrM82352a);
                                if (bArrM82353a != null && (c13934i3 = C13926a.a.f57499a.f57498a) != null) {
                                    c13934i3.release(bArrM82353a);
                                }
                                m82355b(bArrM82352a);
                            } else {
                                m82350a(bArrM82353a, j);
                                C13934i<byte[]> c13934i4 = C13926a.a.f57499a.f57498a;
                                if (c13934i4 != null) {
                                    c13934i4.release(bArrM82353a);
                                }
                                m82355b(bArrM82352a);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "record video has some error! " + e.getLocalizedMessage());
                            this.f57455j = true;
                            if (0 != 0 && (c13934i2 = C13926a.a.f57499a.f57498a) != null) {
                                c13934i2.release(null);
                            }
                            m82355b(bArrM82352a);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArrPoll = bArrM82352a;
                        if (0 != 0 && (c13934i = C13926a.a.f57499a.f57498a) != null) {
                            c13934i.release(null);
                        }
                        m82355b(bArrPoll);
                        throw th;
                    }
                } catch (Exception e4) {
                    bArrM82352a = bArrPoll;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        synchronized (this.f57454i) {
            try {
                try {
                    MediaMuxer mediaMuxer = this.f57450e;
                    if (mediaMuxer != null) {
                        try {
                            mediaMuxer.stop();
                        } catch (IllegalStateException e5) {
                            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "mediaMuxer.stop(): " + e5.getLocalizedMessage());
                        }
                        this.f57450e.release();
                        this.f57450e = null;
                    }
                    MediaCodec mediaCodec = this.f57449d;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.f57449d.release();
                        this.f57449d = null;
                    }
                    obj = this.f57454i;
                } catch (Throwable th3) {
                    this.f57454i.notifyAll();
                    throw th3;
                }
            } catch (RuntimeException e6) {
                C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "release media state error! e: " + e6.getLocalizedMessage());
                obj = this.f57454i;
            }
            obj.notifyAll();
            if (this.f57456k) {
                m82348a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m82346a(InterfaceC13886e interfaceC13886e) {
        if (m82360d()) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "cutVideoTheVideo do not need video");
            return "";
        }
        HuiYanSdkConfig huiYanSdkConfig = C13880j.a.f57352a.f57343b;
        if (!(huiYanSdkConfig == null ? true : huiYanSdkConfig.isCutRecordVideo())) {
            return this.f57452g;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(this.f57452g);
            int i = 0;
            while (true) {
                if (i >= mediaExtractor.getTrackCount()) {
                    i = 0;
                    break;
                }
                if (mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME).startsWith("video/")) {
                    break;
                }
                i++;
            }
            try {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                mediaExtractor.selectTrack(i);
                long j = trackFormat.getLong("durationUs");
                HuiYanSdkConfig huiYanSdkConfig2 = C13880j.a.f57352a.f57343b;
                long cutVideoDuration = j - ((huiYanSdkConfig2 == null ? 2000L : huiYanSdkConfig2.getCutVideoDuration()) * 1000);
                if (cutVideoDuration < 0) {
                    mediaExtractor.release();
                    C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "use order video!");
                    return this.f57452g;
                }
                mediaExtractor.seekTo(cutVideoDuration, 0);
                if (!trackFormat.containsKey("max-input-size")) {
                    int integer = trackFormat.getInteger("height");
                    if (trackFormat.containsKey("max-height")) {
                        integer = Math.max(integer, trackFormat.getInteger("max-height"));
                    }
                    int integer2 = trackFormat.getInteger("width");
                    if (trackFormat.containsKey("max-width")) {
                        integer2 = Math.max(integer, trackFormat.getInteger("max-width"));
                    }
                    trackFormat.setInteger("max-input-size", ((((integer2 + 15) / 16) * ((integer + 15) / 16)) * 768) / 4);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(trackFormat.getInteger("max-input-size"));
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaMuxer mediaMuxer = new MediaMuxer(this.f57453h, 0);
                int iAddTrack = mediaMuxer.addTrack(trackFormat);
                mediaMuxer.setOrientationHint(m82357c());
                mediaMuxer.start();
                while (true) {
                    int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                    if (sampleData < 0) {
                        break;
                    }
                    int sampleFlags = mediaExtractor.getSampleFlags();
                    bufferInfo.offset = 0;
                    bufferInfo.size = sampleData;
                    bufferInfo.flags = sampleFlags;
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    mediaMuxer.writeSampleData(iAddTrack, byteBufferAllocate, bufferInfo);
                    mediaExtractor.advance();
                }
                mediaExtractor.unselectTrack(i);
                try {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                } catch (IllegalStateException e) {
                    C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "cutMediaMuxer.stop(): " + e.getLocalizedMessage());
                }
                mediaExtractor.release();
                return this.f57453h;
            } catch (IllegalArgumentException unused) {
                mediaExtractor.release();
                if (C13930e.a.f57508a.f57506a) {
                    AiLog.error("VideoRecorderManager", "mediaExtractor.getTrackFormat(sourceVideoTrack) IllegalArgumentException ");
                }
                return this.f57452g;
            }
        } catch (IOException unused2) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "Open Video Fail!");
            if (interfaceC13886e != null) {
                interfaceC13886e.mo82245a(true, "");
            }
            m82348a();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82356b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 * i;
            i4++;
            for (int i6 = (i4 * i) - 1; i5 < i6; i6--) {
                byte b = bArr[i5];
                bArr[i5] = bArr[i6];
                bArr[i6] = b;
                i5++;
            }
        }
        int i7 = i * i2;
        while (i3 < i2 / 2) {
            int i8 = i3 * i;
            i3++;
            for (int i9 = (i3 * i) - 2; i8 < i9; i9 -= 2) {
                int i10 = i8 + i7;
                byte b2 = bArr[i10];
                int i11 = i9 + i7;
                bArr[i10] = bArr[i11];
                bArr[i11] = b2;
                int i12 = i10 + 1;
                byte b3 = bArr[i12];
                int i13 = i11 + 1;
                bArr[i12] = bArr[i13];
                bArr[i13] = b3;
                i8 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m82359c(byte[] bArr, int i, int i2) {
        byte[] bArrM82390a = C13926a.a.f57499a.m82390a();
        if (bArrM82390a == null) {
            bArrM82390a = new byte[((i * i2) * 3) / 2];
        }
        int i3 = i * i2;
        int i4 = 0;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            bArrM82390a[i4] = bArr[i5];
            i4++;
        }
        for (int i6 = ((i3 * 3) / 2) - 1; i6 >= i3; i6 -= 2) {
            int i7 = i4 + 1;
            bArrM82390a[i4] = bArr[i6 - 1];
            i4 += 2;
            bArrM82390a[i7] = bArr[i6];
        }
        m82355b(bArr);
        return bArrM82390a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m82360d() {
        return (this.f57462q && this.f57459n && !this.f57461p) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m82361h() {
        C13905e c13905e = C13905e.a.f57445a;
        c13905e.m82337a(1, "VideoRecorderManager", "start thread encoder video!");
        C13902b.b.f57433a.f57428s = true;
        if (m82360d()) {
            c13905e.m82337a(2, "VideoRecorderManager", "start thread not need video!");
        } else {
            this.f57458m = System.nanoTime();
            C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.asq0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f71470a.m82345g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m82357c() {
        HuiYanSdkConfig huiYanSdkConfigM82235b = C13880j.a.f57352a.m82235b();
        return (huiYanSdkConfigM82235b != null && huiYanSdkConfigM82235b.isLandMode()) ? 0 : 90;
    }

    /* JADX INFO: renamed from: c */
    public void m82358c(final InterfaceC13886e interfaceC13886e) {
        if (m82360d()) {
            if (interfaceC13886e != null) {
                interfaceC13886e.mo82245a(false, "");
            }
        } else if (!this.f57455j) {
            C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.gsq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104207a.m82339b(interfaceC13886e);
                }
            });
        } else if (interfaceC13886e != null) {
            interfaceC13886e.mo82245a(false, "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82355b(byte[] bArr) {
        C13934i<byte[]> c13934i = C13926a.a.f57499a.f57498a;
        if (c13934i == null) {
            return;
        }
        c13934i.release(bArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m82354b() {
        HuiYanSdkConfig huiYanSdkConfigM82235b = C13880j.a.f57352a.m82235b();
        if (huiYanSdkConfigM82235b == null) {
            return;
        }
        this.f57462q = huiYanSdkConfigM82235b.isRecordVideo();
        if (huiYanSdkConfigM82235b.isDeleteVideoCache()) {
            C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.csq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82374a.m82343e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82339b(InterfaceC13886e interfaceC13886e) {
        synchronized (this.f57454i) {
            try {
                this.f57455j = true;
                this.f57454i.wait();
            } catch (InterruptedException unused) {
                C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "wait thread is interrupted!");
            }
            String strM82346a = m82346a(interfaceC13886e);
            if (!TextUtils.isEmpty(strM82346a) && this.f57452g.equals(strM82346a) && CommonUtils.copyFile(this.f57452g, this.f57453h)) {
                strM82346a = this.f57453h;
            }
            if (interfaceC13886e != null) {
                interfaceC13886e.mo82245a(true, strM82346a);
            }
            m82348a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m82347a(String str) {
        String str2;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C13881a.f57357a;
        Context contextM82240a = huiYanBaseApi.m82240a();
        if (contextM82240a == null) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "Context is null");
            return null;
        }
        StringBuilder sb = new StringBuilder("cloud-huiyan");
        String str3 = File.separator;
        sb.append(str3);
        sb.append("video");
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        if (huiYanBaseApi.f57356d) {
            str2 = contextM82240a.getExternalFilesDir(null) + str3 + string;
        } else {
            str2 = contextM82240a.getFilesDir() + str3 + string;
        }
        File file = new File(str2);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "Create parent dir error!");
        }
        if (file.exists() && !file.delete()) {
            C13905e.a.f57445a.m82337a(2, "VideoRecorderManager", "delete last video error!");
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82351a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m82349a(int i, int i2, int i3) {
        this.f57463r = false;
        this.f57447b = i;
        this.f57448c = i2;
        C13880j c13880j = C13880j.a.f57352a;
        if (c13880j.m82237d()) {
            this.f57463r = true;
            this.f57448c = IMediaPlayer.MEDIA_INFO_INITBUFFERING_START;
        } else {
            this.f57448c = FileUtils.S_IRWXU;
        }
        if (5 == i3) {
            this.f57465t = true;
        }
        HuiYanSdkConfig huiYanSdkConfigM82235b = c13880j.m82235b();
        if (huiYanSdkConfigM82235b != null && huiYanSdkConfigM82235b.isUseBackCamera()) {
            this.f57464s = false;
        }
        this.f57466u = i;
        this.f57467v = i2;
        C13935j.a.f57520a.m82410a(new Runnable() { // from class: l.esq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93047a.m82344f();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m82350a(byte[] bArr, long j) {
        ByteBuffer[] inputBuffers = this.f57449d.getInputBuffers();
        ByteBuffer[] outputBuffers = this.f57449d.getOutputBuffers();
        int iDequeueInputBuffer = this.f57449d.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f57449d.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, (System.nanoTime() - j) / 1000, 0);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.f57449d.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -2) {
            int iAddTrack = this.f57450e.addTrack(this.f57449d.getOutputFormat());
            this.f57451f = iAddTrack;
            if (iAddTrack >= 0) {
                this.f57450e.start();
            }
        }
        while (iDequeueOutputBuffer > 0) {
            ByteBuffer byteBuffer2 = outputBuffers[iDequeueOutputBuffer];
            int i = this.f57451f;
            if (i >= 0) {
                this.f57450e.writeSampleData(i, byteBuffer2, bufferInfo);
            }
            this.f57449d.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.f57449d.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m82353a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            return null;
        }
        int i4 = this.f57460o;
        if (i4 == 19) {
            byte[] bArrM82390a = C13926a.a.f57499a.m82390a();
            if (bArrM82390a == null) {
                bArrM82390a = new byte[((i * i2) * 3) / 2];
            }
            int i5 = i * i2;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM82390a, 0, i5);
            int i6 = i5 / 4;
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrM82390a, i5, i6);
            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrM82390a, i5 + i6, i6);
            byteBufferWrap.put(bArr, 0, i5);
            while (i5 < bArr.length) {
                byteBufferWrap3.put(bArr[i5]);
                byteBufferWrap2.put(bArr[i5 + 1]);
                i5 += 2;
            }
            return bArrM82390a;
        }
        if (i4 != 21) {
            return null;
        }
        byte[] bArrM82390a2 = C13926a.a.f57499a.m82390a();
        if (bArrM82390a2 == null) {
            bArrM82390a2 = new byte[((i * i2) * 3) / 2];
        }
        int i7 = i * i2;
        for (int i8 = 0; i8 < i7; i8++) {
            bArrM82390a2[i8] = bArr[i8];
        }
        int i9 = 0;
        while (true) {
            i3 = i7 / 2;
            if (i9 >= i3) {
                break;
            }
            int i10 = i7 + i9;
            bArrM82390a2[i10 - 1] = bArr[i10];
            i9 += 2;
        }
        for (int i11 = 0; i11 < i3; i11 += 2) {
            int i12 = i7 + i11;
            bArrM82390a2[i12] = bArr[i12 - 1];
        }
        return bArrM82390a2;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m82352a(byte[] bArr) {
        boolean z = this.f57463r;
        int i = this.f57466u;
        if (z) {
            int i2 = this.f57467v;
            return CommonUtils.clipNV21(bArr, i, i2, (i - 1280) / 2, (i2 - 704) / 2, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, IMediaPlayer.MEDIA_INFO_INITBUFFERING_START);
        }
        int i3 = this.f57467v;
        return CommonUtils.clipNV21(bArr, i, i3, (i - 640) / 2, (i3 - 448) / 2, 640, FileUtils.S_IRWXU);
    }

    /* JADX INFO: renamed from: a */
    public final void m82348a() {
        String str = this.f57452g;
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            Log.e("VideoRecorderManager", "delete temp video error path:" + str);
        }
    }
}
