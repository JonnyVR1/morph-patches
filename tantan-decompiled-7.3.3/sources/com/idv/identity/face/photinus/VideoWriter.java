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
import p153l.azk0;
import p153l.brq0;
import p153l.f6j;
import p153l.o6r0;
import p153l.z0q;

/* JADX INFO: loaded from: classes7.dex */
class VideoWriter {

    /* JADX INFO: renamed from: b */
    private MediaCodec f12832b;

    /* JADX INFO: renamed from: c */
    private MediaMuxer f12833c;

    /* JADX INFO: renamed from: d */
    private int f12834d;

    /* JADX INFO: renamed from: e */
    private boolean f12835e;

    /* JADX INFO: renamed from: f */
    private int f12836f;

    /* JADX INFO: renamed from: g */
    private int f12837g;

    /* JADX INFO: renamed from: h */
    private long f12838h;

    /* JADX INFO: renamed from: i */
    private int f12839i;

    /* JADX INFO: renamed from: l */
    private int f12842l;

    /* JADX INFO: renamed from: m */
    private InterfaceC3701c f12843m;

    /* JADX INFO: renamed from: a */
    private File f12831a = null;

    /* JADX INFO: renamed from: j */
    private boolean f12840j = false;

    /* JADX INFO: renamed from: k */
    private boolean f12841k = false;

    /* JADX INFO: renamed from: o */
    private final ArrayList<C3702d> f12845o = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private Thread f12844n = new Thread(new RunnableC3699a(this));

    public enum RequestType {
        rStartNewMovie,
        rAddMovieFrame,
        rCloseMoveFile
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$a */
    public class RunnableC3699a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ VideoWriter f12846a;

        public RunnableC3699a(VideoWriter videoWriter) {
            this.f12846a = videoWriter;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (VideoWriter.this.f12840j) {
                C3702d c3702dM18640D = VideoWriter.this.m18640D();
                if (c3702dM18640D == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Exception unused) {
                    }
                } else {
                    int i = C3700b.f12848a[c3702dM18640D.f12849a.ordinal()];
                    if (i == 1) {
                        VideoWriter.this.f12838h = System.currentTimeMillis();
                        VideoWriter.this.f12831a = new File(c3702dM18640D.f12850b.getPath());
                        VideoWriter.this.m18671y();
                        VideoWriter.this.f12839i = 0;
                    } else if (i == 2) {
                        try {
                            f6j f6jVar = c3702dM18640D.f12851c;
                            f6jVar.f97404a = VideoWriter.m18642F(f6jVar.f97404a, VideoWriter.this.f12836f, VideoWriter.this.f12837g, VideoWriter.this.f12842l);
                            VideoWriter videoWriter = VideoWriter.this;
                            videoWriter.m18639A(videoWriter.f12839i, c3702dM18640D.f12851c);
                            VideoWriter.m18664p(VideoWriter.this);
                            o6r0.m166282b("DTF", "VideoWriter encoded frame " + VideoWriter.this.f12839i);
                        } catch (Exception e) {
                            if (VideoWriter.this.f12843m != null) {
                                VideoWriter.this.f12843m.onException(e);
                            }
                        }
                    } else if (i != 3) {
                        continue;
                    } else {
                        try {
                            VideoWriter videoWriter2 = VideoWriter.this;
                            videoWriter2.m18639A(videoWriter2.f12839i, null);
                            if (VideoWriter.this.f12832b != null) {
                                VideoWriter.this.f12832b.stop();
                                VideoWriter.this.f12832b.release();
                                VideoWriter.this.f12832b = null;
                            }
                            if (VideoWriter.this.f12833c != null) {
                                VideoWriter.this.f12833c.stop();
                                VideoWriter.this.f12833c.release();
                                VideoWriter.this.f12833c = null;
                                VideoWriter.this.f12835e = false;
                            }
                            if (VideoWriter.this.f12843m != null) {
                                VideoWriter.this.f12843m.mo18627a(this.f12846a);
                            }
                            o6r0.m166282b("DTF", "rCloseMoveFile, took " + (System.currentTimeMillis() - VideoWriter.this.f12838h) + "ms");
                        } catch (Throwable th) {
                            try {
                                if (VideoWriter.this.f12843m != null) {
                                    VideoWriter.this.f12843m.onException(th);
                                }
                            } catch (Throwable th2) {
                                VideoWriter.this.f12840j = false;
                                throw th2;
                            }
                        }
                        VideoWriter.this.f12840j = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$b */
    public static /* synthetic */ class C3700b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12848a;

        static {
            int[] iArr = new int[RequestType.values().length];
            f12848a = iArr;
            try {
                iArr[RequestType.rStartNewMovie.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12848a[RequestType.rAddMovieFrame.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12848a[RequestType.rCloseMoveFile.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$c */
    public interface InterfaceC3701c {
        /* JADX INFO: renamed from: a */
        void mo18627a(VideoWriter videoWriter);

        void onException(Throwable th);
    }

    public VideoWriter(InterfaceC3701c interfaceC3701c) {
        this.f12843m = interfaceC3701c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m18639A(int i, f6j f6jVar) throws Exception {
        ByteBuffer[] inputBuffers = this.f12832b.getInputBuffers();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.f12832b.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            long jM18670x = m18670x(i);
            if (f6jVar == null) {
                this.f12832b.queueInputBuffer(iDequeueInputBuffer, 0, 0, jM18670x, 4);
                m18672z(true, bufferInfo);
                return;
            }
            byte[] bArr = f6jVar.f97404a;
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            if (byteBuffer.position() == byteBuffer.capacity()) {
                this.f12832b.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, jM18670x, 0);
                m18672z(false, bufferInfo);
                return;
            }
            String str = "position=" + byteBuffer.position() + "   capacity=" + byteBuffer.capacity() + "limit=" + byteBuffer.limit();
            o6r0.m166282b("DTF", "input buffer not large enough to hold frame data>>>>".concat(str));
            brq0.m106161a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public C3702d m18640D() {
        synchronized (this.f12845o) {
            try {
                if (this.f12845o.isEmpty()) {
                    return null;
                }
                return this.f12845o.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m18641E(C3702d c3702d) {
        synchronized (this.f12845o) {
            try {
                if (this.f12841k) {
                    if (c3702d.f12849a == RequestType.rCloseMoveFile) {
                        this.f12841k = false;
                    }
                    this.f12845o.add(c3702d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static byte[] m18642F(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 270) {
            return m18645I(bArr, i, i2);
        }
        if (i3 == 180) {
            return m18644H(bArr, i, i2);
        }
        return i3 == 90 ? m18646J(bArr, i, i2) : m18643G(bArr, i, i2);
    }

    /* JADX INFO: renamed from: G */
    private static byte[] m18643G(byte[] bArr, int i, int i2) {
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
    private static byte[] m18644H(byte[] bArr, int i, int i2) {
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
    public static byte[] m18645I(byte[] bArr, int i, int i2) {
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
        return m18644H(bArr2, i, i2);
    }

    /* JADX INFO: renamed from: J */
    private static byte[] m18646J(byte[] bArr, int i, int i2) {
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
    private static MediaCodecInfo m18647K(String str) {
        MediaCodecInfo mediaCodecInfoM18648L = m18648L(str);
        if (mediaCodecInfoM18648L != null) {
            return mediaCodecInfoM18648L;
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
    private static MediaCodecInfo m18648L(String str) {
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
    public static /* synthetic */ int m18664p(VideoWriter videoWriter) {
        int i = videoWriter.f12839i;
        videoWriter.f12839i = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: w */
    private static String m18669w(int i) {
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
    public static long m18670x(int i) {
        return ((i * PlaybackException.CUSTOM_ERROR_CODE_BASE) / 30) + CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m18671y() {
        try {
            MediaCodecInfo mediaCodecInfoM18647K = m18647K(YtVideoEncoder.MIME_TYPE);
            if (mediaCodecInfoM18647K == null) {
                Log.e("DTF", "Unable to find an appropriate codec for video/avc");
                return;
            }
            mediaCodecInfoM18647K.getName();
            m18669w(21);
            int i = this.f12842l;
            MediaFormat mediaFormatCreateVideoFormat = (i == 90 || i == 270) ? MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f12837g, this.f12836f) : MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, this.f12836f, this.f12837g);
            mediaFormatCreateVideoFormat.setInteger("color-format", 21);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 3000000);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 10);
            mediaFormatCreateVideoFormat.toString();
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoM18647K.getName());
            this.f12832b = mediaCodecCreateByCodecName;
            mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f12832b.start();
            this.f12833c = new MediaMuxer(this.f12831a.getAbsolutePath(), 0);
        } catch (Throwable th) {
            InterfaceC3701c interfaceC3701c = this.f12843m;
            if (interfaceC3701c != null) {
                interfaceC3701c.onException(th);
            }
            this.f12840j = false;
            this.f12841k = false;
            this.f12845o.clear();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m18672z(boolean z, MediaCodec.BufferInfo bufferInfo) {
        if (z) {
            try {
                this.f12832b.signalEndOfInputStream();
            } catch (Exception unused) {
            }
        }
        ByteBuffer[] outputBuffers = this.f12832b.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f12832b.dequeueOutputBuffer(bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f12832b.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f12835e) {
                    azk0.m101074a("format changed twice");
                    return;
                }
                MediaFormat outputFormat = this.f12832b.getOutputFormat();
                Objects.toString(outputFormat);
                this.f12834d = this.f12833c.addTrack(outputFormat);
                this.f12833c.start();
                this.f12835e = true;
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    z0q.m218147a("encoderOutputBuffer ", iDequeueOutputBuffer, " was null");
                    return;
                }
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (!this.f12835e) {
                        azk0.m101074a("muxer hasn't started");
                        return;
                    } else {
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        try {
                            this.f12833c.writeSampleData(this.f12834d, byteBuffer, bufferInfo);
                        } catch (Exception unused2) {
                        }
                    }
                }
                this.f12832b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m18673B() {
        return this.f12840j;
    }

    /* JADX INFO: renamed from: C */
    public void m18674C(Uri uri, int i, int i2, int i3) {
        if (this.f12840j) {
            return;
        }
        this.f12840j = true;
        this.f12841k = true;
        this.f12836f = i;
        this.f12837g = i2;
        this.f12842l = i3;
        m18641E(new C3702d(uri));
        this.f12844n.start();
    }

    /* JADX INFO: renamed from: u */
    public void m18675u(f6j f6jVar) {
        m18641E(new C3702d(f6jVar));
    }

    /* JADX INFO: renamed from: v */
    public void m18676v() {
        m18641E(new C3702d());
    }

    /* JADX INFO: renamed from: com.idv.identity.face.photinus.VideoWriter$d */
    public static class C3702d {

        /* JADX INFO: renamed from: a */
        RequestType f12849a;

        /* JADX INFO: renamed from: b */
        Uri f12850b;

        /* JADX INFO: renamed from: c */
        f6j f12851c;

        public C3702d(Uri uri) {
            this.f12850b = uri;
            this.f12849a = RequestType.rStartNewMovie;
        }

        public C3702d(f6j f6jVar) {
            this.f12851c = f6jVar;
            this.f12849a = RequestType.rAddMovieFrame;
        }

        public C3702d() {
            this.f12849a = RequestType.rCloseMoveFile;
        }
    }
}
