package com.idv.identity.face.photinus;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.ixq0;
import p149l.k3j;
import p149l.upk0;
import p149l.whq0;
import p149l.zyp;

/* JADX INFO: loaded from: classes7.dex */
class VideoWriter {

    /* JADX INFO: renamed from: b */
    private MediaCodec f12091b;

    /* JADX INFO: renamed from: c */
    private MediaMuxer f12092c;

    /* JADX INFO: renamed from: d */
    private int f12093d;

    /* JADX INFO: renamed from: e */
    private boolean f12094e;

    /* JADX INFO: renamed from: f */
    private int f12095f;

    /* JADX INFO: renamed from: g */
    private int f12096g;

    /* JADX INFO: renamed from: h */
    private long f12097h;

    /* JADX INFO: renamed from: i */
    private int f12098i;

    /* JADX INFO: renamed from: l */
    private int f12101l;

    /* JADX INFO: renamed from: m */
    private InterfaceC3542c f12102m;

    /* JADX INFO: renamed from: a */
    private File f12090a = null;

    /* JADX INFO: renamed from: j */
    private boolean f12099j = false;

    /* JADX INFO: renamed from: k */
    private boolean f12100k = false;

    /* JADX INFO: renamed from: o */
    private final ArrayList<C3543d> f12104o = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private Thread f12103n = new Thread(new RunnableC3540a(this));

    public enum RequestType {
        rStartNewMovie,
        rAddMovieFrame,
        rCloseMoveFile
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$a */
    public class RunnableC3540a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoWriter f12105a;

        public RunnableC3540a(VideoWriter videoWriter) {
            this.f12105a = videoWriter;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (VideoWriter.this.f12099j) {
                C3543d c3543dM17563D = VideoWriter.this.m17563D();
                if (c3543dM17563D == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Exception unused) {
                    }
                } else {
                    int i = C3541b.f12107a[c3543dM17563D.f12108a.ordinal()];
                    if (i == 1) {
                        VideoWriter.this.f12097h = System.currentTimeMillis();
                        VideoWriter.this.f12090a = new File(c3543dM17563D.f12109b.getPath());
                        VideoWriter.this.m17594y();
                        VideoWriter.this.f12098i = 0;
                    } else if (i == 2) {
                        try {
                            k3j k3jVar = c3543dM17563D.f12110c;
                            k3jVar.f120844a = VideoWriter.m17565F(k3jVar.f120844a, VideoWriter.this.f12095f, VideoWriter.this.f12096g, VideoWriter.this.f12101l);
                            VideoWriter videoWriter = VideoWriter.this;
                            videoWriter.m17562A(videoWriter.f12098i, c3543dM17563D.f12110c);
                            VideoWriter.m17587p(VideoWriter.this);
                            ixq0.m138885b("DTF", "VideoWriter encoded frame " + VideoWriter.this.f12098i);
                        } catch (Exception e) {
                            if (VideoWriter.this.f12102m != null) {
                                VideoWriter.this.f12102m.onException(e);
                            }
                        }
                    } else if (i != 3) {
                        continue;
                    } else {
                        try {
                            VideoWriter videoWriter2 = VideoWriter.this;
                            videoWriter2.m17562A(videoWriter2.f12098i, null);
                            if (VideoWriter.this.f12091b != null) {
                                VideoWriter.this.f12091b.stop();
                                VideoWriter.this.f12091b.release();
                                VideoWriter.this.f12091b = null;
                            }
                            if (VideoWriter.this.f12092c != null) {
                                VideoWriter.this.f12092c.stop();
                                VideoWriter.this.f12092c.release();
                                VideoWriter.this.f12092c = null;
                                VideoWriter.this.f12094e = false;
                            }
                            if (VideoWriter.this.f12102m != null) {
                                VideoWriter.this.f12102m.mo17550a(this.f12105a);
                            }
                            ixq0.m138885b("DTF", "rCloseMoveFile, took " + (System.currentTimeMillis() - VideoWriter.this.f12097h) + "ms");
                        } catch (Throwable th) {
                            try {
                                if (VideoWriter.this.f12102m != null) {
                                    VideoWriter.this.f12102m.onException(th);
                                }
                            } catch (Throwable th2) {
                                VideoWriter.this.f12099j = false;
                                throw th2;
                            }
                        }
                        VideoWriter.this.f12099j = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$b */
    public static /* synthetic */ class C3541b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12107a;

        static {
            int[] iArr = new int[RequestType.values().length];
            f12107a = iArr;
            try {
                iArr[RequestType.rStartNewMovie.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12107a[RequestType.rAddMovieFrame.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12107a[RequestType.rCloseMoveFile.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$c */
    public interface InterfaceC3542c {
        /* JADX INFO: renamed from: a */
        void mo17550a(VideoWriter videoWriter);

        void onException(Throwable th);
    }

    public VideoWriter(InterfaceC3542c interfaceC3542c) {
        this.f12102m = interfaceC3542c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m17562A(int i, k3j k3jVar) throws Exception {
        ByteBuffer[] inputBuffers = this.f12091b.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.f12091b.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            long jM17593x = m17593x(i);
            if (k3jVar == null) {
                this.f12091b.queueInputBuffer(iDequeueInputBuffer, 0, 0, jM17593x, 4);
                m17595z(true, bufferInfo);
                return;
            }
            byte[] bArr = k3jVar.f120844a;
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            if (byteBuffer.position() == byteBuffer.capacity()) {
                this.f12091b.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jM17593x, 0);
                m17595z(false, bufferInfo);
                return;
            }
            String str = "position=" + byteBuffer.position() + "   capacity=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit();
            ixq0.m138885b("DTF", "input buffer not large enough to hold frame data>>>>".concat(str));
            whq0.m203241a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public C3543d m17563D() {
        synchronized (this.f12104o) {
            try {
                if (this.f12104o.isEmpty()) {
                    return null;
                }
                return this.f12104o.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m17564E(C3543d c3543d) {
        synchronized (this.f12104o) {
            try {
                if (this.f12100k) {
                    if (c3543d.f12108a == RequestType.rCloseMoveFile) {
                        this.f12100k = false;
                    }
                    this.f12104o.add(c3543d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static byte[] m17565F(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 270) {
            return m17568I(bArr, i, i2);
        }
        if (i3 == 180) {
            return m17567H(bArr, i, i2);
        }
        return i3 == 90 ? m17569J(bArr, i, i2) : m17566G(bArr, i, i2);
    }

    /* JADX INFO: renamed from: G */
    private static byte[] m17566G(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i5] = bArr[i5];
        }
        while (i3 < i4) {
            int i6 = i3 + 1;
            bArr2[i3] = bArr[i6];
            bArr2[i6] = bArr[i3];
            i3 += 2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: H */
    private static byte[] m17567H(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            bArr2[i5] = bArr[i6];
            i5++;
        }
        for (int i7 = i4 - 1; i7 >= i3; i7 -= 2) {
            int i8 = i5 + 1;
            bArr2[i5] = bArr[i7];
            i5 += 2;
            bArr2[i8] = bArr[i7 - 1];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: I */
    public static byte[] m17568I(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i * i2;
        int i5 = (i4 * 3) / 2;
        byte[] bArr2 = new byte[i5];
        if (i == 0 && i2 == 0) {
            i4 = 0;
            i3 = 0;
        } else {
            i3 = i2 >> 1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                bArr2[i6] = bArr[i8 + i7];
                i6++;
                i8 += i;
            }
        }
        for (int i10 = 0; i10 < i; i10 += 2) {
            int i11 = i4;
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = i11 + i10;
                if (i13 >= i5 - 2) {
                    break;
                }
                bArr2[i6] = bArr[i13];
                bArr2[i6 + 1] = bArr[i13 + 1];
                i6 += 2;
                i11 += i;
            }
        }
        return m17567H(bArr2, i, i2);
    }

    /* JADX INFO: renamed from: J */
    private static byte[] m17569J(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = i2 - 1;
        int i6 = i5 * i;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i6;
            for (int i10 = i5; i10 >= 0; i10--) {
                bArr2[i7] = bArr[i9 + i8];
                i7++;
                i9 -= i;
            }
        }
        int i11 = i4 - 1;
        for (int i12 = i - 1; i12 > 0; i12 -= 2) {
            int i13 = i3;
            for (int i14 = 0; i14 < i2 / 2; i14++) {
                int i15 = i13 + i12;
                bArr2[i11] = bArr[i15 - 1];
                bArr2[i11 - 1] = bArr[i15];
                i11 -= 2;
                i13 += i;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: K */
    private static MediaCodecInfo m17570K(String str) {
        MediaCodecInfo mediaCodecInfoM17571L = m17571L(str);
        if (mediaCodecInfoM17571L != null) {
            return mediaCodecInfoM17571L;
        }
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    private static MediaCodecInfo m17571L(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (name == null) {
                    name = "";
                }
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str) && name.contains("google")) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m17587p(VideoWriter videoWriter) {
        int i = videoWriter.f12098i;
        videoWriter.f12098i = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: w */
    private static String m17592w(int i) {
        if (i == 39) {
            return "COLOR_FormatYUV420PackedSemiPlanar";
        }
        if (i == 2130706688) {
            return "COLOR_TI_FormatYUV420PackedSemiPlanar";
        }
        switch (i) {
            case 19:
                return "COLOR_FormatYUV420Planar";
            case 20:
                return "COLOR_FormatYUV420PackedPlanar";
            case 21:
                return "COLOR_FormatYUV420SemiPlanar";
            default:
                return "Unknown color format";
        }
    }

    /* JADX INFO: renamed from: x */
    public static long m17593x(int i) {
        return ((i * PlaybackException.CUSTOM_ERROR_CODE_BASE) / 30) + CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m17594y() {
        try {
            MediaCodecInfo mediaCodecInfoM17570K = m17570K(YtVideoEncoder.MIME_TYPE);
            if (mediaCodecInfoM17570K == null) {
                Log.e("DTF", "Unable to find an appropriate codec for video/avc");
                return;
            }
            mediaCodecInfoM17570K.getName();
            m17592w(21);
            int i = this.f12101l;
            MediaFormat mediaFormatCreateVideoFormat = (i == 90 || i == 270) ? MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f12096g, this.f12095f) : MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f12095f, this.f12096g);
            mediaFormatCreateVideoFormat.setInteger("color-format", 21);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 3000000);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
            mediaFormatCreateVideoFormat.toString();
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoM17570K.getName());
            this.f12091b = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f12091b.start();
            this.f12092c = new MediaMuxer(this.f12090a.getAbsolutePath(), 0);
        } catch (Throwable th) {
            InterfaceC3542c interfaceC3542c = this.f12102m;
            if (interfaceC3542c != null) {
                interfaceC3542c.onException(th);
            }
            this.f12099j = false;
            this.f12100k = false;
            this.f12104o.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m17595z(boolean z, MediaCodec.BufferInfo bufferInfo) {
        if (z) {
            try {
                this.f12091b.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = this.f12091b.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f12091b.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f12091b.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f12094e) {
                    upk0.m194883a("format changed twice");
                    return;
                }
                MediaFormat outputFormat = this.f12091b.getOutputFormat();
                Objects.toString(outputFormat);
                this.f12093d = this.f12092c.addTrack(outputFormat);
                this.f12092c.start();
                this.f12094e = true;
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    zyp.m220936a("encoderOutputBuffer ", iDequeueOutputBuffer, " was null");
                    return;
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f12094e) {
                        upk0.m194883a("muxer hasn't started");
                        return;
                    } else {
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        try {
                            this.f12092c.writeSampleData(this.f12093d, byteBuffer, bufferInfo);
                        } catch (Exception unused2) {
                        }
                    }
                }
                this.f12091b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m17596B() {
        return this.f12099j;
    }

    /* JADX INFO: renamed from: C */
    public void m17597C(Uri uri, int i, int i2, int i3) {
        if (this.f12099j) {
            return;
        }
        this.f12099j = true;
        this.f12100k = true;
        this.f12095f = i;
        this.f12096g = i2;
        this.f12101l = i3;
        m17564E(new C3543d(uri));
        this.f12103n.start();
    }

    /* JADX INFO: renamed from: u */
    public void m17598u(k3j k3jVar) {
        m17564E(new C3543d(k3jVar));
    }

    /* JADX INFO: renamed from: v */
    public void m17599v() {
        m17564E(new C3543d());
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$d */
    public static class C3543d {

        /* JADX INFO: renamed from: a */
        RequestType f12108a;

        /* JADX INFO: renamed from: b */
        Uri f12109b;

        /* JADX INFO: renamed from: c */
        k3j f12110c;

        public C3543d(Uri uri) {
            this.f12109b = uri;
            this.f12108a = RequestType.rStartNewMovie;
        }

        public C3543d(k3j k3jVar) {
            this.f12110c = k3jVar;
            this.f12108a = RequestType.rAddMovieFrame;
        }

        public C3543d() {
            this.f12108a = RequestType.rCloseMoveFile;
        }
    }
}
