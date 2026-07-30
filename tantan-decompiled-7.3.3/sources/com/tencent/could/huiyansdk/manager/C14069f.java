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
import com.tencent.could.component.common.p084ai.log.AiLog;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.callback.InterfaceC14049e;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.utils.C14089a;
import com.tencent.could.huiyansdk.utils.C14090b;
import com.tencent.could.huiyansdk.utils.C14093e;
import com.tencent.could.huiyansdk.utils.C14097i;
import com.tencent.could.huiyansdk.utils.C14098j;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14069f {

    /* JADX INFO: renamed from: b */
    public volatile int f58295b;

    /* JADX INFO: renamed from: c */
    public volatile int f58296c;

    /* JADX INFO: renamed from: d */
    public MediaCodec f58297d;

    /* JADX INFO: renamed from: e */
    public MediaMuxer f58298e;

    /* JADX INFO: renamed from: g */
    public String f58300g;

    /* JADX INFO: renamed from: h */
    public String f58301h;

    /* JADX INFO: renamed from: i */
    public Object f58302i;

    /* JADX INFO: renamed from: m */
    public long f58306m;

    /* JADX INFO: renamed from: a */
    public ArrayBlockingQueue<byte[]> f58294a = new ArrayBlockingQueue<>(10);

    /* JADX INFO: renamed from: f */
    public int f58299f = -1;

    /* JADX INFO: renamed from: j */
    public volatile boolean f58303j = false;

    /* JADX INFO: renamed from: k */
    public volatile boolean f58304k = false;

    /* JADX INFO: renamed from: l */
    public int f58305l = 0;

    /* JADX INFO: renamed from: n */
    public volatile boolean f58307n = true;

    /* JADX INFO: renamed from: o */
    public int f58308o = -1;

    /* JADX INFO: renamed from: p */
    public boolean f58309p = false;

    /* JADX INFO: renamed from: q */
    public boolean f58310q = true;

    /* JADX INFO: renamed from: r */
    public boolean f58311r = false;

    /* JADX INFO: renamed from: s */
    public boolean f58312s = true;

    /* JADX INFO: renamed from: t */
    public boolean f58313t = false;

    /* JADX INFO: renamed from: u */
    public int f58314u = 0;

    /* JADX INFO: renamed from: v */
    public int f58315v = 0;

    /* JADX INFO: renamed from: w */
    public final CountDownLatch f58316w = new CountDownLatch(1);

    public C14069f() {
        m83537b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m83526e() {
        String string;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        Context contextM83423a = huiYanBaseApi.m83423a();
        if (contextM83423a == null) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "Context is null");
            return;
        }
        if (huiYanBaseApi.f58204d) {
            StringBuilder sb = new StringBuilder();
            sb.append(contextM83423a.getExternalFilesDir(null));
            String str = File.separator;
            sb.append(str);
            sb.append("cloud-huiyan");
            sb.append(str);
            sb.append("video");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(contextM83423a.getFilesDir());
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
    public void m83527f() {
        int i;
        if (this.f58310q) {
            this.f58305l = 0;
            int codecCount = MediaCodecList.getCodecCount();
            int i2 = 0;
            MediaCodecInfo mediaCodecInfo = null;
            while (true) {
                if (i2 >= codecCount || mediaCodecInfo != null) {
                    if (mediaCodecInfo != null) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(YtVideoEncoder.MIME_TYPE);
                        i = 21;
                        if (!m83534a(21, capabilitiesForType.colorFormats)) {
                            i = 19;
                            if (!m83534a(19, capabilitiesForType.colorFormats)) {
                            }
                        }
                    }
                    this.f58308o = i;
                    if (i == -1) {
                        this.f58307n = false;
                        C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "this phone not support video!");
                    } else {
                        this.f58302i = new Object();
                        this.f58307n = true;
                        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f58295b, this.f58296c);
                        mediaFormatCreateVideoFormat.setInteger("color-format", this.f58308o);
                        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
                        mediaFormatCreateVideoFormat.setInteger("bitrate", PlaybackException.CUSTOM_ERROR_CODE_BASE);
                        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
                        mediaFormatCreateVideoFormat.setInteger("width", this.f58295b);
                        mediaFormatCreateVideoFormat.setInteger("height", this.f58296c);
                        try {
                            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
                            this.f58297d = mediaCodecCreateEncoderByType;
                            mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                            this.f58297d.start();
                            this.f58300g = m83530a("temp.mp4");
                            this.f58301h = m83530a("HuiYanVideo_" + System.currentTimeMillis() + ".mp4");
                            MediaMuxer mediaMuxer = new MediaMuxer(this.f58300g, 0);
                            this.f58298e = mediaMuxer;
                            mediaMuxer.setOrientationHint(m83540c());
                        } catch (Exception e) {
                            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "init error! e: " + e.getMessage());
                            this.f58309p = true;
                            this.f58307n = false;
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
                this.f58308o = i;
                if (i == -1) {
                    this.f58307n = false;
                    C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "this phone not support video!");
                } else {
                    this.f58302i = new Object();
                    this.f58307n = true;
                    MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f58295b, this.f58296c);
                    mediaFormatCreateVideoFormat2.setInteger("color-format", this.f58308o);
                    mediaFormatCreateVideoFormat2.setInteger("frame-rate", 30);
                    mediaFormatCreateVideoFormat2.setInteger("bitrate", PlaybackException.CUSTOM_ERROR_CODE_BASE);
                    mediaFormatCreateVideoFormat2.setInteger("i-frame-interval", 1);
                    mediaFormatCreateVideoFormat2.setInteger("width", this.f58295b);
                    mediaFormatCreateVideoFormat2.setInteger("height", this.f58296c);
                    MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
                    this.f58297d = mediaCodecCreateEncoderByType2;
                    mediaCodecCreateEncoderByType2.configure(mediaFormatCreateVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
                    this.f58297d.start();
                    this.f58300g = m83530a("temp.mp4");
                    this.f58301h = m83530a("HuiYanVideo_" + System.currentTimeMillis() + ".mp4");
                    MediaMuxer mediaMuxer2 = new MediaMuxer(this.f58300g, 0);
                    this.f58298e = mediaMuxer2;
                    mediaMuxer2.setOrientationHint(m83540c());
                }
            }
        } else {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "do not need video");
        }
        this.f58316w.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m83528g() throws Throwable {
        Object obj;
        byte[] bArrM83535a;
        Exception e;
        C14097i<byte[]> c14097i;
        C14097i<byte[]> c14097i2;
        C14097i<byte[]> c14097i3;
        try {
            this.f58316w.await();
        } catch (InterruptedException e2) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "countDownLatch.wait(): " + e2.getLocalizedMessage());
        }
        while (!this.f58303j) {
            long j = this.f58306m;
            if (this.f58294a.size() > 0) {
                byte[] bArrPoll = this.f58294a.poll();
                try {
                    bArrM83535a = m83535a(bArrPoll);
                    C14090b.a.f58349a.m83574a(bArrPoll);
                    try {
                        try {
                            if (this.f58295b == 640) {
                                this.f58296c = 448;
                            } else if (this.f58295b == 1280) {
                                this.f58296c = IMediaPlayer.MEDIA_INFO_INITBUFFERING_START;
                            }
                            if (this.f58312s) {
                                m83539b(bArrM83535a, this.f58295b, this.f58296c);
                            }
                            if (this.f58313t) {
                                bArrM83535a = m83542c(bArrM83535a, this.f58295b, this.f58296c);
                            }
                            byte[] bArrM83536a = m83536a(bArrM83535a, this.f58295b, this.f58296c);
                            if (bArrM83536a == null) {
                                m83538b(bArrM83535a);
                                if (bArrM83536a != null && (c14097i3 = C14089a.a.f58347a.f58346a) != null) {
                                    c14097i3.release(bArrM83536a);
                                }
                                m83538b(bArrM83535a);
                            } else {
                                m83533a(bArrM83536a, j);
                                C14097i<byte[]> c14097i4 = C14089a.a.f58347a.f58346a;
                                if (c14097i4 != null) {
                                    c14097i4.release(bArrM83536a);
                                }
                                m83538b(bArrM83535a);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "record video has some error! " + e.getLocalizedMessage());
                            this.f58303j = true;
                            if (0 != 0 && (c14097i2 = C14089a.a.f58347a.f58346a) != null) {
                                c14097i2.release(null);
                            }
                            m83538b(bArrM83535a);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArrPoll = bArrM83535a;
                        if (0 != 0 && (c14097i = C14089a.a.f58347a.f58346a) != null) {
                            c14097i.release(null);
                        }
                        m83538b(bArrPoll);
                        throw th;
                    }
                } catch (Exception e4) {
                    bArrM83535a = bArrPoll;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        synchronized (this.f58302i) {
            try {
                try {
                    MediaMuxer mediaMuxer = this.f58298e;
                    if (mediaMuxer != null) {
                        try {
                            mediaMuxer.stop();
                        } catch (IllegalStateException e5) {
                            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "mediaMuxer.stop(): " + e5.getLocalizedMessage());
                        }
                        this.f58298e.release();
                        this.f58298e = null;
                    }
                    MediaCodec mediaCodec = this.f58297d;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                        this.f58297d.release();
                        this.f58297d = null;
                    }
                    obj = this.f58302i;
                } catch (Throwable th3) {
                    this.f58302i.notifyAll();
                    throw th3;
                }
            } catch (RuntimeException e6) {
                C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "release media state error! e: " + e6.getLocalizedMessage());
                obj = this.f58302i;
            }
            obj.notifyAll();
            if (this.f58304k) {
                m83531a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m83529a(InterfaceC14049e interfaceC14049e) {
        if (m83543d()) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "cutVideoTheVideo do not need video");
            return "";
        }
        HuiYanSdkConfig huiYanSdkConfig = C14043j.a.f58200a.f58191b;
        if (!(huiYanSdkConfig == null ? true : huiYanSdkConfig.isCutRecordVideo())) {
            return this.f58300g;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(this.f58300g);
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
                HuiYanSdkConfig huiYanSdkConfig2 = C14043j.a.f58200a.f58191b;
                long cutVideoDuration = j - ((huiYanSdkConfig2 == null ? 2000L : huiYanSdkConfig2.getCutVideoDuration()) * 1000);
                if (cutVideoDuration < 0) {
                    mediaExtractor.release();
                    C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "use order video!");
                    return this.f58300g;
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
                MediaMuxer mediaMuxer = new MediaMuxer(this.f58301h, 0);
                int iAddTrack = mediaMuxer.addTrack(trackFormat);
                mediaMuxer.setOrientationHint(m83540c());
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
                    C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "cutMediaMuxer.stop(): " + e.getLocalizedMessage());
                }
                mediaExtractor.release();
                return this.f58301h;
            } catch (IllegalArgumentException unused) {
                mediaExtractor.release();
                if (C14093e.a.f58356a.f58354a) {
                    AiLog.error("VideoRecorderManager", "mediaExtractor.getTrackFormat(sourceVideoTrack) IllegalArgumentException ");
                }
                return this.f58300g;
            }
        } catch (IOException unused2) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "Open Video Fail!");
            if (interfaceC14049e != null) {
                interfaceC14049e.mo83428a(true, "");
            }
            m83531a();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83539b(byte[] bArr, int i, int i2) {
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
    public final byte[] m83542c(byte[] bArr, int i, int i2) {
        byte[] bArrM83573a = C14089a.a.f58347a.m83573a();
        if (bArrM83573a == null) {
            bArrM83573a = new byte[((i * i2) * 3) / 2];
        }
        int i3 = i * i2;
        int i4 = 0;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            bArrM83573a[i4] = bArr[i5];
            i4++;
        }
        for (int i6 = ((i3 * 3) / 2) - 1; i6 >= i3; i6 -= 2) {
            int i7 = i4 + 1;
            bArrM83573a[i4] = bArr[i6 - 1];
            i4 += 2;
            bArrM83573a[i7] = bArr[i6];
        }
        m83538b(bArr);
        return bArrM83573a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m83543d() {
        return (this.f58310q && this.f58307n && !this.f58309p) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m83544h() {
        C14068e c14068e = C14068e.a.f58293a;
        c14068e.m83520a(1, "VideoRecorderManager", "start thread encoder video!");
        C14065b.b.f58281a.f58276s = true;
        if (m83543d()) {
            c14068e.m83520a(2, "VideoRecorderManager", "start thread not need video!");
        } else {
            this.f58306m = System.nanoTime();
            C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.g1r0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f101772a.m83528g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m83540c() {
        HuiYanSdkConfig huiYanSdkConfigM83418b = C14043j.a.f58200a.m83418b();
        return (huiYanSdkConfigM83418b != null && huiYanSdkConfigM83418b.isLandMode()) ? 0 : 90;
    }

    /* JADX INFO: renamed from: c */
    public void m83541c(final InterfaceC14049e interfaceC14049e) {
        if (m83543d()) {
            if (interfaceC14049e != null) {
                interfaceC14049e.mo83428a(false, "");
            }
        } else if (!this.f58303j) {
            C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.m1r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134461a.m83522b(interfaceC14049e);
                }
            });
        } else if (interfaceC14049e != null) {
            interfaceC14049e.mo83428a(false, "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83538b(byte[] bArr) {
        C14097i<byte[]> c14097i = C14089a.a.f58347a.f58346a;
        if (c14097i == null) {
            return;
        }
        c14097i.release(bArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m83537b() {
        HuiYanSdkConfig huiYanSdkConfigM83418b = C14043j.a.f58200a.m83418b();
        if (huiYanSdkConfigM83418b == null) {
            return;
        }
        this.f58310q = huiYanSdkConfigM83418b.isRecordVideo();
        if (huiYanSdkConfigM83418b.isDeleteVideoCache()) {
            C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.i1r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112548a.m83526e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83522b(InterfaceC14049e interfaceC14049e) {
        synchronized (this.f58302i) {
            try {
                this.f58303j = true;
                this.f58302i.wait();
            } catch (InterruptedException unused) {
                C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "wait thread is interrupted!");
            }
            String strM83529a = m83529a(interfaceC14049e);
            if (!TextUtils.isEmpty(strM83529a) && this.f58300g.equals(strM83529a) && CommonUtils.copyFile(this.f58300g, this.f58301h)) {
                strM83529a = this.f58301h;
            }
            if (interfaceC14049e != null) {
                interfaceC14049e.mo83428a(true, strM83529a);
            }
            m83531a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m83530a(String str) {
        String str2;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        Context contextM83423a = huiYanBaseApi.m83423a();
        if (contextM83423a == null) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "Context is null");
            return null;
        }
        StringBuilder sb = new StringBuilder("cloud-huiyan");
        String str3 = File.separator;
        sb.append(str3);
        sb.append("video");
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        if (huiYanBaseApi.f58204d) {
            str2 = contextM83423a.getExternalFilesDir(null) + str3 + string;
        } else {
            str2 = contextM83423a.getFilesDir() + str3 + string;
        }
        File file = new File(str2);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "Create parent dir error!");
        }
        if (file.exists() && !file.delete()) {
            C14068e.a.f58293a.m83520a(2, "VideoRecorderManager", "delete last video error!");
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83534a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m83532a(int i, int i2, int i3) {
        this.f58311r = false;
        this.f58295b = i;
        this.f58296c = i2;
        C14043j c14043j = C14043j.a.f58200a;
        if (c14043j.m83420d()) {
            this.f58311r = true;
            this.f58296c = IMediaPlayer.MEDIA_INFO_INITBUFFERING_START;
        } else {
            this.f58296c = 448;
        }
        if (5 == i3) {
            this.f58313t = true;
        }
        HuiYanSdkConfig huiYanSdkConfigM83418b = c14043j.m83418b();
        if (huiYanSdkConfigM83418b != null && huiYanSdkConfigM83418b.isUseBackCamera()) {
            this.f58312s = false;
        }
        this.f58314u = i;
        this.f58315v = i2;
        C14098j.a.f58368a.m83593a(new Runnable() { // from class: l.k1r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123539a.m83527f();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m83533a(byte[] bArr, long j) {
        ByteBuffer[] inputBuffers = this.f58297d.getInputBuffers();
        ByteBuffer[] outputBuffers = this.f58297d.getOutputBuffers();
        int iDequeueInputBuffer = this.f58297d.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f58297d.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, (System.nanoTime() - j) / 1000, 0);
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueOutputBuffer = this.f58297d.dequeueOutputBuffer(bufferInfo, 0L);
        if (iDequeueOutputBuffer == -2) {
            int iAddTrack = this.f58298e.addTrack(this.f58297d.getOutputFormat());
            this.f58299f = iAddTrack;
            if (iAddTrack >= 0) {
                this.f58298e.start();
            }
        }
        while (iDequeueOutputBuffer > 0) {
            ByteBuffer byteBuffer2 = outputBuffers[iDequeueOutputBuffer];
            int i = this.f58299f;
            if (i >= 0) {
                this.f58298e.writeSampleData(i, byteBuffer2, bufferInfo);
            }
            this.f58297d.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.f58297d.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m83536a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            return null;
        }
        int i4 = this.f58308o;
        if (i4 == 19) {
            byte[] bArrM83573a = C14089a.a.f58347a.m83573a();
            if (bArrM83573a == null) {
                bArrM83573a = new byte[((i * i2) * 3) / 2];
            }
            int i5 = i * i2;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM83573a, 0, i5);
            int i6 = i5 / 4;
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrM83573a, i5, i6);
            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrM83573a, i5 + i6, i6);
            byteBufferWrap.put(bArr, 0, i5);
            while (i5 < bArr.length) {
                byteBufferWrap3.put(bArr[i5]);
                byteBufferWrap2.put(bArr[i5 + 1]);
                i5 += 2;
            }
            return bArrM83573a;
        }
        if (i4 != 21) {
            return null;
        }
        byte[] bArrM83573a2 = C14089a.a.f58347a.m83573a();
        if (bArrM83573a2 == null) {
            bArrM83573a2 = new byte[((i * i2) * 3) / 2];
        }
        int i7 = i * i2;
        for (int i8 = 0; i8 < i7; i8++) {
            bArrM83573a2[i8] = bArr[i8];
        }
        int i9 = 0;
        while (true) {
            i3 = i7 / 2;
            if (i9 >= i3) {
                break;
            }
            int i10 = i7 + i9;
            bArrM83573a2[i10 - 1] = bArr[i10];
            i9 += 2;
        }
        for (int i11 = 0; i11 < i3; i11 += 2) {
            int i12 = i7 + i11;
            bArrM83573a2[i12] = bArr[i12 - 1];
        }
        return bArrM83573a2;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m83535a(byte[] bArr) {
        boolean z = this.f58311r;
        int i = this.f58314u;
        if (z) {
            int i2 = this.f58315v;
            return CommonUtils.clipNV21(bArr, i, i2, (i - 1280) / 2, (i2 - 704) / 2, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, IMediaPlayer.MEDIA_INFO_INITBUFFERING_START);
        }
        int i3 = this.f58315v;
        return CommonUtils.clipNV21(bArr, i, i3, (i - 640) / 2, (i3 - 448) / 2, 640, 448);
    }

    /* JADX INFO: renamed from: a */
    public final void m83531a() {
        String str = this.f58300g;
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            Log.e("VideoRecorderManager", "delete temp video error path:" + str);
        }
    }
}
