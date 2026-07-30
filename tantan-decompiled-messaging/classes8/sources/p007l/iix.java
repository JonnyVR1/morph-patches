package p007l;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.text.TextUtils;
import android.view.Surface;
import com.tantanapp.common.utils.CrashHelper;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class iix implements l7m {

    /* JADX INFO: renamed from: a */
    public MediaMetadataRetriever f2894a;

    /* JADX INFO: renamed from: b */
    public MediaExtractor f2895b;

    /* JADX INFO: renamed from: c */
    public MediaMuxer f2896c;

    /* JADX INFO: renamed from: d */
    public boolean f2897d;

    /* JADX INFO: renamed from: e */
    public String f2898e;

    /* JADX INFO: renamed from: f */
    public int f2899f;

    /* JADX INFO: renamed from: g */
    public int f2900g;

    /* JADX INFO: renamed from: h */
    public int f2901h;

    /* JADX INFO: renamed from: i */
    public long f2902i;

    /* JADX INFO: renamed from: j */
    public long f2903j;

    /* JADX INFO: renamed from: k */
    public int[] f2904k = {-1, -1};

    /* JADX INFO: renamed from: l */
    public int f2905l = -5;

    /* JADX INFO: renamed from: m */
    public int f2906m = -5;

    /* JADX INFO: renamed from: n */
    public MediaFormat f2907n;

    /* JADX INFO: renamed from: o */
    public MediaFormat f2908o;

    /* JADX INFO: renamed from: p */
    public int f2909p;

    /* JADX INFO: renamed from: q */
    public int f2910q;

    public iix(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2898e = str;
        m9408d(str);
    }

    @Override // p007l.l7m
    /* JADX INFO: renamed from: a */
    public boolean mo9405a(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC0598c interfaceC0598c, l7m.InterfaceC0599d interfaceC0599d, l7m.InterfaceC0596a interfaceC0596a, l7m.InterfaceC0597b interfaceC0597b) {
        return mo9406b(str, ds5Var, es5Var, new C0565a(interfaceC0597b, interfaceC0599d, interfaceC0598c, interfaceC0596a));
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0381 A[Catch: all -> 0x003f, Exception -> 0x0385, TRY_ENTER, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0398 A[Catch: all -> 0x003f, Exception -> 0x0385, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x039d A[Catch: all -> 0x003f, Exception -> 0x0385, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x03a2 A[Catch: all -> 0x003f, Exception -> 0x0385, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x03aa A[Catch: all -> 0x003f, Exception -> 0x0385, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x03b2 A[Catch: all -> 0x003f, Exception -> 0x0385, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c2 A[Catch: all -> 0x003f, Exception -> 0x0385, TRY_LEAVE, TryCatch #14 {Exception -> 0x0385, blocks: (B:9:0x0022, B:204:0x0381, B:208:0x038b, B:210:0x0398, B:212:0x039d, B:214:0x03a2, B:216:0x03aa, B:218:0x03b2, B:222:0x03c2), top: B:297:0x0022, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:228:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:295:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    @Override // p007l.l7m
    /* JADX INFO: renamed from: b */
    public boolean mo9406b(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC0600e interfaceC0600e) {
        long j;
        boolean z;
        MediaExtractor mediaExtractor;
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        ez50 ez50Var;
        btm btmVar;
        boolean z2;
        MediaCodec mediaCodec2;
        boolean z3;
        boolean z4;
        int iDequeueInputBuffer;
        MediaCodec mediaCodec3;
        boolean z5;
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2;
        int i;
        long j2 = es5Var.f2638h;
        long j3 = es5Var.f2639i;
        System.currentTimeMillis();
        if (interfaceC0600e != null) {
            interfaceC0600e.mo9412a(this.f2898e, 0);
        }
        m9409e(str, 0, es5Var, interfaceC0600e);
        if (this.f2909p == 0 || this.f2910q == 0) {
            return false;
        }
        try {
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int i2 = this.f2904k[0];
                if (i2 >= 0) {
                    MediaCodec mediaCodecCreateEncoderByType = null;
                    try {
                        this.f2895b.selectTrack(i2);
                        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                        MediaExtractor mediaExtractor2 = this.f2895b;
                        if (i3 > 0) {
                            try {
                                mediaExtractor2.seekTo(j2, 0);
                            } catch (Exception e) {
                                e = e;
                                j2 = j2;
                                bufferInfo = bufferInfo;
                                j3 = j3;
                                mediaCodec = null;
                                ez50Var = null;
                                btmVar = null;
                            }
                        } else {
                            mediaExtractor2.seekTo(0L, 0);
                        }
                        MediaFormat trackFormat = this.f2895b.getTrackFormat(this.f2904k[0]);
                        mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
                        try {
                            mediaCodecCreateEncoderByType.configure(this.f2907n, (Surface) null, (MediaCrypto) null, 1);
                            btmVar = new btm(mediaCodecCreateEncoderByType.createInputSurface());
                            try {
                                btmVar.m8687c();
                                mediaCodecCreateEncoderByType.start();
                                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                                try {
                                    j2 = j2;
                                    try {
                                        ez50Var = new ez50(this.f2899f, this.f2900g, this.f2901h, es5Var.f2642l);
                                        try {
                                            mediaCodecCreateDecoderByType.configure(trackFormat, ez50Var.m9077c(), (MediaCrypto) null, 0);
                                            mediaCodecCreateDecoderByType.start();
                                            long j4 = -1;
                                            boolean z6 = false;
                                            boolean z7 = false;
                                            boolean z8 = false;
                                            while (!z7) {
                                                boolean z9 = z7;
                                                if (z6) {
                                                    bufferInfo = bufferInfo;
                                                    mediaCodec = mediaCodecCreateDecoderByType;
                                                } else {
                                                    try {
                                                        int sampleTrackIndex = this.f2895b.getSampleTrackIndex();
                                                        if (sampleTrackIndex == this.f2904k[0]) {
                                                            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                                                            try {
                                                                int iDequeueInputBuffer2 = mediaCodecCreateDecoderByType.dequeueInputBuffer(2500L);
                                                                if (iDequeueInputBuffer2 >= 0) {
                                                                    bufferInfo = bufferInfo2;
                                                                    try {
                                                                        int sampleData = this.f2895b.readSampleData(mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer2), 0);
                                                                        if (sampleData < 0) {
                                                                            MediaCodec mediaCodec4 = mediaCodecCreateDecoderByType;
                                                                            try {
                                                                                mediaCodec4.queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                                                                                mediaCodec = mediaCodec4;
                                                                                z6 = true;
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                mediaCodec = mediaCodec4;
                                                                                bufferInfo = bufferInfo;
                                                                                if (interfaceC0600e != null) {
                                                                                    interfaceC0600e.mo9414c(e, str);
                                                                                }
                                                                                mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                                                                                z2 = false;
                                                                                mediaCodec2 = mediaCodec;
                                                                                long j5 = j2;
                                                                                this.f2895b.unselectTrack(this.f2904k[0]);
                                                                                if (ez50Var != null) {
                                                                                    ez50Var.m9078d();
                                                                                }
                                                                                if (btmVar != null) {
                                                                                    btmVar.m8688d();
                                                                                }
                                                                                if (mediaCodec2 != null) {
                                                                                    mediaCodec2.stop();
                                                                                    mediaCodec2.release();
                                                                                }
                                                                                if (mediaCodecCreateEncoderByType != null) {
                                                                                    mediaCodecCreateEncoderByType.stop();
                                                                                    mediaCodecCreateEncoderByType.release();
                                                                                }
                                                                                if (interfaceC0600e != null) {
                                                                                    interfaceC0600e.onSuccess(str);
                                                                                }
                                                                                z = z2;
                                                                                j = j5;
                                                                                if (z) {
                                                                                    m9411g(bufferInfo, j, j3);
                                                                                }
                                                                                mediaExtractor = this.f2895b;
                                                                                if (mediaExtractor != null) {
                                                                                    mediaExtractor.release();
                                                                                }
                                                                                mediaMuxer = this.f2896c;
                                                                                if (mediaMuxer != null) {
                                                                                    return z;
                                                                                }
                                                                                return z;
                                                                            }
                                                                        } else {
                                                                            MediaCodec mediaCodec5 = mediaCodecCreateDecoderByType;
                                                                            mediaCodec5.queueInputBuffer(iDequeueInputBuffer2, 0, sampleData, this.f2895b.getSampleTime(), 0);
                                                                            mediaCodec = mediaCodec5;
                                                                            this.f2895b.advance();
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        mediaCodec = mediaCodecCreateDecoderByType;
                                                                        bufferInfo = bufferInfo;
                                                                        if (interfaceC0600e != null) {
                                                                            interfaceC0600e.mo9414c(e, str);
                                                                        }
                                                                        mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                                                                        z2 = false;
                                                                        mediaCodec2 = mediaCodec;
                                                                        long j6 = j2;
                                                                        this.f2895b.unselectTrack(this.f2904k[0]);
                                                                        if (ez50Var != null) {
                                                                            ez50Var.m9078d();
                                                                        }
                                                                        if (btmVar != null) {
                                                                            btmVar.m8688d();
                                                                        }
                                                                        if (mediaCodec2 != null) {
                                                                            mediaCodec2.stop();
                                                                            mediaCodec2.release();
                                                                        }
                                                                        if (mediaCodecCreateEncoderByType != null) {
                                                                            mediaCodecCreateEncoderByType.stop();
                                                                            mediaCodecCreateEncoderByType.release();
                                                                        }
                                                                        if (interfaceC0600e != null) {
                                                                            interfaceC0600e.onSuccess(str);
                                                                        }
                                                                        z = z2;
                                                                        j = j6;
                                                                        if (z) {
                                                                            m9411g(bufferInfo, j, j3);
                                                                        }
                                                                        mediaExtractor = this.f2895b;
                                                                        if (mediaExtractor != null) {
                                                                            mediaExtractor.release();
                                                                        }
                                                                        mediaMuxer = this.f2896c;
                                                                        if (mediaMuxer != null) {
                                                                            return z;
                                                                        }
                                                                        return z;
                                                                    }
                                                                } else {
                                                                    bufferInfo = bufferInfo2;
                                                                    mediaCodec = mediaCodecCreateDecoderByType;
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                bufferInfo = bufferInfo2;
                                                            }
                                                        } else {
                                                            bufferInfo = bufferInfo;
                                                            mediaCodec = mediaCodecCreateDecoderByType;
                                                            if (sampleTrackIndex == -1) {
                                                                z3 = z6;
                                                                z4 = true;
                                                            }
                                                            if (z4) {
                                                                try {
                                                                    iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2500L);
                                                                    if (iDequeueInputBuffer >= 0) {
                                                                        mediaCodec3 = mediaCodec;
                                                                        try {
                                                                            mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                                                            z6 = true;
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                            mediaCodec = mediaCodec3;
                                                                            bufferInfo = bufferInfo;
                                                                            if (interfaceC0600e != null) {
                                                                                interfaceC0600e.mo9414c(e, str);
                                                                            }
                                                                            mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                                                                            z2 = false;
                                                                            mediaCodec2 = mediaCodec;
                                                                            long j7 = j2;
                                                                            this.f2895b.unselectTrack(this.f2904k[0]);
                                                                            if (ez50Var != null) {
                                                                                ez50Var.m9078d();
                                                                            }
                                                                            if (btmVar != null) {
                                                                                btmVar.m8688d();
                                                                            }
                                                                            if (mediaCodec2 != null) {
                                                                                mediaCodec2.stop();
                                                                                mediaCodec2.release();
                                                                            }
                                                                            if (mediaCodecCreateEncoderByType != null) {
                                                                                mediaCodecCreateEncoderByType.stop();
                                                                                mediaCodecCreateEncoderByType.release();
                                                                            }
                                                                            if (interfaceC0600e != null) {
                                                                                interfaceC0600e.onSuccess(str);
                                                                            }
                                                                            z = z2;
                                                                            j = j7;
                                                                            if (z) {
                                                                                m9411g(bufferInfo, j, j3);
                                                                            }
                                                                            mediaExtractor = this.f2895b;
                                                                            if (mediaExtractor != null) {
                                                                                mediaExtractor.release();
                                                                            }
                                                                            mediaMuxer = this.f2896c;
                                                                            if (mediaMuxer != null) {
                                                                                return z;
                                                                            }
                                                                            return z;
                                                                        }
                                                                    } else {
                                                                        z6 = z3;
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                }
                                                            } else {
                                                                z6 = z3;
                                                            }
                                                        }
                                                        z3 = z6;
                                                        z4 = false;
                                                        if (z4) {
                                                            iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(2500L);
                                                            if (iDequeueInputBuffer >= 0) {
                                                                mediaCodec3 = mediaCodec;
                                                                mediaCodec3.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                                                z6 = true;
                                                            } else {
                                                                z6 = z3;
                                                            }
                                                        } else {
                                                            z6 = z3;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        bufferInfo = bufferInfo;
                                                    }
                                                }
                                                boolean z10 = !z8;
                                                boolean z11 = true;
                                                z7 = z9;
                                                while (true) {
                                                    if (z10 || z11) {
                                                        boolean z12 = z6;
                                                        boolean z13 = z7;
                                                        boolean z14 = z10;
                                                        bufferInfo = bufferInfo;
                                                        try {
                                                            int iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                                            if (iDequeueOutputBuffer == -1) {
                                                                j3 = j3;
                                                                i3 = i3;
                                                                z8 = z8;
                                                                z5 = true;
                                                                z11 = false;
                                                                i = -1;
                                                                z7 = z13;
                                                            } else {
                                                                if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer == -2) {
                                                                    z7 = z13;
                                                                    i3 = i3;
                                                                    z8 = z8;
                                                                    z5 = true;
                                                                } else {
                                                                    if (iDequeueOutputBuffer < 0) {
                                                                        throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                                                                    }
                                                                    ByteBuffer outputBuffer = mediaCodecCreateEncoderByType.getOutputBuffer(iDequeueOutputBuffer);
                                                                    if (outputBuffer == null) {
                                                                        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                                                                    }
                                                                    int i4 = bufferInfo.size;
                                                                    if (i4 > 1) {
                                                                        if ((bufferInfo.flags & 2) == 0) {
                                                                            this.f2896c.writeSampleData(this.f2905l, outputBuffer, bufferInfo);
                                                                        } else if (this.f2905l == -5) {
                                                                            byte[] bArr = new byte[i4];
                                                                            outputBuffer.limit(bufferInfo.offset + i4);
                                                                            outputBuffer.position(bufferInfo.offset);
                                                                            outputBuffer.get(bArr);
                                                                            byte b = 1;
                                                                            int i5 = bufferInfo.size - 1;
                                                                            while (true) {
                                                                                if (i5 < 0 || i5 <= 3) {
                                                                                    byteBufferAllocate = null;
                                                                                    byteBufferAllocate2 = null;
                                                                                    break;
                                                                                }
                                                                                if (bArr[i5] == b && bArr[i5 - 1] == 0 && bArr[i5 - 2] == 0) {
                                                                                    int i6 = i5 - 3;
                                                                                    if (bArr[i6] == 0) {
                                                                                        byteBufferAllocate = ByteBuffer.allocate(i6);
                                                                                        byteBufferAllocate2 = ByteBuffer.allocate(bufferInfo.size - i6);
                                                                                        byteBufferAllocate.put(bArr, 0, i6).position(0);
                                                                                        byteBufferAllocate2.put(bArr, i6, bufferInfo.size - i6).position(0);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                i5--;
                                                                                i3 = i3;
                                                                                z8 = z8;
                                                                                b = 1;
                                                                            }
                                                                            if (byteBufferAllocate != null && byteBufferAllocate2 != null) {
                                                                                this.f2907n.setByteBuffer("csd-0", byteBufferAllocate);
                                                                                this.f2907n.setByteBuffer("csd-1", byteBufferAllocate2);
                                                                            }
                                                                            this.f2905l = this.f2896c.addTrack(this.f2907n);
                                                                            this.f2896c.start();
                                                                            z5 = true;
                                                                            this.f2897d = true;
                                                                        }
                                                                        i3 = i3;
                                                                        z8 = z8;
                                                                        z5 = true;
                                                                    } else {
                                                                        z5 = true;
                                                                        i3 = i3;
                                                                        z8 = z8;
                                                                    }
                                                                    z7 = (bufferInfo.flags & 4) != 0 ? z5 : false;
                                                                    mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                                    mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                                                                    if (interfaceC0600e != null) {
                                                                        interfaceC0600e.mo9414c(e, str);
                                                                    }
                                                                    mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                                                                    z2 = false;
                                                                    mediaCodec2 = mediaCodec;
                                                                    long j8 = j2;
                                                                    this.f2895b.unselectTrack(this.f2904k[0]);
                                                                    if (ez50Var != null) {
                                                                        ez50Var.m9078d();
                                                                    }
                                                                    if (btmVar != null) {
                                                                        btmVar.m8688d();
                                                                    }
                                                                    if (mediaCodec2 != null) {
                                                                        mediaCodec2.stop();
                                                                        mediaCodec2.release();
                                                                    }
                                                                    if (mediaCodecCreateEncoderByType != null) {
                                                                        mediaCodecCreateEncoderByType.stop();
                                                                        mediaCodecCreateEncoderByType.release();
                                                                    }
                                                                    if (interfaceC0600e != null) {
                                                                        interfaceC0600e.onSuccess(str);
                                                                    }
                                                                    z = z2;
                                                                    j = j8;
                                                                }
                                                                i = -1;
                                                            }
                                                            if (iDequeueOutputBuffer != i) {
                                                                z10 = z14;
                                                                z6 = z12;
                                                            } else {
                                                                if (!z8) {
                                                                    try {
                                                                        int iDequeueOutputBuffer2 = mediaCodec.dequeueOutputBuffer(bufferInfo, 2500L);
                                                                        if (iDequeueOutputBuffer2 != i) {
                                                                            if (iDequeueOutputBuffer2 != -3) {
                                                                                if (iDequeueOutputBuffer2 == -2) {
                                                                                    mediaCodec.getOutputFormat();
                                                                                } else {
                                                                                    if (iDequeueOutputBuffer2 < 0) {
                                                                                        throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + iDequeueOutputBuffer2);
                                                                                    }
                                                                                    boolean z15 = bufferInfo.size != 0 ? z5 : false;
                                                                                    if (j3 > 0 && bufferInfo.presentationTimeUs >= j3) {
                                                                                        bufferInfo.flags |= 4;
                                                                                        z15 = false;
                                                                                        z12 = true;
                                                                                        z8 = true;
                                                                                    }
                                                                                    if (i3 > 0 && j4 == -1) {
                                                                                        long j9 = bufferInfo.presentationTimeUs;
                                                                                        if (j9 < j2) {
                                                                                            z15 = false;
                                                                                        } else {
                                                                                            j4 = j9;
                                                                                        }
                                                                                    }
                                                                                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer2, z15);
                                                                                    if (z15) {
                                                                                        try {
                                                                                            ez50Var.m9075a();
                                                                                            ez50Var.m9076b(false);
                                                                                            btmVar.m8689e(bufferInfo.presentationTimeUs * 1000);
                                                                                            if (interfaceC0600e != null) {
                                                                                                interfaceC0600e.mo9413b((int) ((bufferInfo.presentationTimeUs / this.f2902i) * 100.0f));
                                                                                            }
                                                                                            btmVar.m8690f();
                                                                                        } catch (Exception e8) {
                                                                                            CrashHelper.c(e8);
                                                                                        }
                                                                                    }
                                                                                    if ((bufferInfo.flags & 4) != 0) {
                                                                                        mediaCodecCreateEncoderByType.signalEndOfInputStream();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        z6 = z12;
                                                                        z10 = false;
                                                                    } catch (Exception e9) {
                                                                        e = e9;
                                                                    }
                                                                }
                                                                z10 = z14;
                                                                z6 = z12;
                                                            }
                                                            j3 = j3;
                                                            i3 = i3;
                                                            z8 = z8;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            j3 = j3;
                                                        }
                                                    }
                                                }
                                                mediaCodecCreateDecoderByType = mediaCodec;
                                                bufferInfo = bufferInfo;
                                            }
                                            bufferInfo = bufferInfo;
                                            j3 = j3;
                                            mediaCodec = mediaCodecCreateDecoderByType;
                                            if (j4 != -1) {
                                                j2 = j4;
                                            }
                                            z2 = true;
                                        } catch (Exception e11) {
                                            e = e11;
                                            bufferInfo = bufferInfo;
                                            j3 = j3;
                                            mediaCodec = mediaCodecCreateDecoderByType;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        mediaCodec = mediaCodecCreateDecoderByType;
                                        ez50Var = null;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    j2 = j2;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                j2 = j2;
                                mediaCodec = null;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            mediaCodecCreateEncoderByType = mediaCodecCreateEncoderByType;
                            mediaCodec = null;
                            ez50Var = null;
                            btmVar = null;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        mediaCodec = null;
                        ez50Var = null;
                        mediaCodecCreateEncoderByType = null;
                    }
                    mediaCodec2 = mediaCodec;
                    long j10 = j2;
                    this.f2895b.unselectTrack(this.f2904k[0]);
                    if (ez50Var != null) {
                        ez50Var.m9078d();
                    }
                    if (btmVar != null) {
                        btmVar.m8688d();
                    }
                    if (mediaCodec2 != null) {
                        mediaCodec2.stop();
                        mediaCodec2.release();
                    }
                    if (mediaCodecCreateEncoderByType != null) {
                        mediaCodecCreateEncoderByType.stop();
                        mediaCodecCreateEncoderByType.release();
                    }
                    if (interfaceC0600e != null) {
                        interfaceC0600e.onSuccess(str);
                    }
                    z = z2;
                    j = j10;
                } else {
                    bufferInfo = bufferInfo;
                    j3 = j3;
                    j = j2;
                    z = false;
                }
                if (z) {
                    m9411g(bufferInfo, j, j3);
                }
                mediaExtractor = this.f2895b;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                mediaMuxer = this.f2896c;
                if (mediaMuxer != null || !this.f2897d) {
                    return z;
                }
                try {
                    this.f2897d = false;
                    mediaMuxer.release();
                    return z;
                } catch (Exception e17) {
                    if (interfaceC0600e == null) {
                        return z;
                    }
                    interfaceC0600e.mo9414c(e17, str);
                    return z;
                }
            } catch (Exception e18) {
                if (interfaceC0600e != null) {
                    interfaceC0600e.mo9414c(e18, str);
                }
                MediaExtractor mediaExtractor3 = this.f2895b;
                if (mediaExtractor3 != null) {
                    mediaExtractor3.release();
                }
                MediaMuxer mediaMuxer2 = this.f2896c;
                if (mediaMuxer2 != null && this.f2897d) {
                    try {
                        this.f2897d = false;
                        mediaMuxer2.release();
                    } catch (Exception e19) {
                        if (interfaceC0600e != null) {
                            interfaceC0600e.mo9414c(e19, str);
                        }
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            MediaExtractor mediaExtractor4 = this.f2895b;
            if (mediaExtractor4 != null) {
                mediaExtractor4.release();
            }
            MediaMuxer mediaMuxer3 = this.f2896c;
            if (mediaMuxer3 == null || !this.f2897d) {
                throw th;
            }
            try {
                this.f2897d = false;
                mediaMuxer3.release();
                throw th;
            } catch (Exception e20) {
                if (interfaceC0600e == null) {
                    throw th;
                }
                interfaceC0600e.mo9414c(e20, str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final MediaFormat m9407c(es5 es5Var) {
        boolean z = es5Var.f2642l;
        int i = es5Var.f2634d;
        if (z) {
            int i2 = es5Var.f2635e;
            if (i < i2) {
                this.f2909p = i;
                this.f2910q = i;
            } else {
                this.f2909p = i2;
                this.f2910q = i2;
            }
        } else {
            this.f2909p = i;
            this.f2910q = es5Var.f2635e;
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f2909p, this.f2910q);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", es5Var.f2632b);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", es5Var.f2631a);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", es5Var.f2633c);
        return mediaFormatCreateVideoFormat;
    }

    /* JADX INFO: renamed from: d */
    public final void m9408d(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f2894a = mediaMetadataRetriever;
            mediaMetadataRetriever.setDataSource(str);
            this.f2899f = Integer.parseInt(this.f2894a.extractMetadata(18));
            this.f2900g = Integer.parseInt(this.f2894a.extractMetadata(19));
            this.f2901h = Integer.parseInt(this.f2894a.extractMetadata(24));
            this.f2902i = Long.valueOf(this.f2894a.extractMetadata(9)).longValue() * 1000;
            this.f2903j = Long.valueOf(this.f2894a.extractMetadata(20)).longValue();
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.f2895b = mediaExtractor;
            mediaExtractor.setDataSource(str);
            m9410f(this.f2895b);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9409e(String str, int i, es5 es5Var, l7m.InterfaceC0600e interfaceC0600e) {
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
            this.f2896c = mediaMuxer;
            mediaMuxer.setOrientationHint(i);
            this.f2907n = m9407c(es5Var);
            int i2 = this.f2904k[1];
            if (i2 >= 0) {
                MediaFormat trackFormat = this.f2895b.getTrackFormat(i2);
                this.f2908o = trackFormat;
                this.f2906m = this.f2896c.addTrack(trackFormat);
            }
        } catch (Exception e) {
            if (interfaceC0600e != null) {
                interfaceC0600e.mo9414c(e, str);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9410f(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string.startsWith("audio/")) {
                this.f2904k[1] = i;
            } else if (string.startsWith("video/")) {
                this.f2904k[0] = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b A[PHI: r13
      0x006b: PHI (r13v3 long) = (r13v1 long), (r13v5 long) binds: [B:30:0x0088, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: g */
    public final long m9411g(MediaCodec.BufferInfo bufferInfo, long j, long j2) {
        boolean z;
        if (this.f2906m < 0) {
            return -1L;
        }
        this.f2895b.selectTrack(this.f2904k[1]);
        int integer = this.f2908o.getInteger("max-input-size");
        MediaExtractor mediaExtractor = this.f2895b;
        if (j > 0) {
            mediaExtractor.seekTo(j, 0);
        } else {
            mediaExtractor.seekTo(0L, 0);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(integer);
        boolean z2 = false;
        long j3 = -1;
        while (true) {
            MediaExtractor mediaExtractor2 = this.f2895b;
            if (z2) {
                mediaExtractor2.unselectTrack(this.f2904k[1]);
                return j3;
            }
            int sampleTrackIndex = mediaExtractor2.getSampleTrackIndex();
            if (sampleTrackIndex == this.f2904k[1]) {
                int sampleData = this.f2895b.readSampleData(byteBufferAllocateDirect, 0);
                bufferInfo.size = sampleData;
                if (sampleData < 0) {
                    bufferInfo.size = 0;
                    z = true;
                } else {
                    long sampleTime = this.f2895b.getSampleTime();
                    bufferInfo.presentationTimeUs = sampleTime;
                    if (j > 0 && j3 == -1) {
                        j3 = sampleTime;
                    }
                    if (j2 < 0 || sampleTime < j2) {
                        bufferInfo.offset = 0;
                        bufferInfo.flags = this.f2895b.getSampleFlags();
                        this.f2896c.writeSampleData(this.f2906m, byteBufferAllocateDirect, bufferInfo);
                        this.f2895b.advance();
                        z = false;
                    } else {
                        z = true;
                    }
                }
            } else if (sampleTrackIndex == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: l.iix$a */
    public class C0565a implements l7m.InterfaceC0600e {
        public C0565a(l7m.InterfaceC0597b interfaceC0597b, l7m.InterfaceC0599d interfaceC0599d, l7m.InterfaceC0598c interfaceC0598c, l7m.InterfaceC0596a interfaceC0596a) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: b */
        public void mo9413b(int i) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        public void onSuccess(String str) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: a */
        public void mo9412a(String str, int i) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: c */
        public void mo9414c(Throwable th, String str) {
        }
    }
}
