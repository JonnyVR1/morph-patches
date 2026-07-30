package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.nio.ByteBuffer;
import java.util.List;
import p149l.tmw;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.i */
/* JADX INFO: loaded from: classes7.dex */
public class C3852i extends AbstractC3856m {

    /* JADX INFO: renamed from: K */
    private final String f13390K = "MediaDecoderWrapper";

    /* JADX INFO: renamed from: L */
    private AbstractC3849f f13391L = null;

    /* JADX INFO: renamed from: M */
    private AbstractC3849f f13392M = null;

    /* JADX INFO: renamed from: N */
    private C3851h f13393N = null;

    /* JADX INFO: renamed from: O */
    private C3851h f13394O = null;

    /* JADX INFO: renamed from: P */
    private String f13395P = null;

    /* JADX INFO: renamed from: Q */
    private Boolean f13396Q = Boolean.FALSE;

    /* JADX INFO: renamed from: R */
    private Object f13397R = new Object();

    /* JADX INFO: renamed from: S */
    private boolean f13398S = false;

    /* JADX INFO: renamed from: T */
    private boolean f13399T = false;

    /* JADX INFO: renamed from: U */
    private boolean f13400U = false;

    /* JADX INFO: renamed from: V */
    private boolean f13401V = false;

    /* JADX INFO: renamed from: W */
    private List<MediaFormat> f13402W = null;

    /* JADX INFO: renamed from: X */
    private AudioResampleUtils f13403X = null;

    /* JADX INFO: renamed from: Y */
    private long f13404Y = 0;

    /* JADX INFO: renamed from: Z */
    private ByteBuffer f13405Z = null;

    /* JADX INFO: renamed from: a0 */
    private boolean f13406a0 = false;

    /* JADX INFO: renamed from: b0 */
    private boolean f13407b0 = true;

    /* JADX INFO: renamed from: c0 */
    private long f13408c0 = 0;

    /* JADX INFO: renamed from: d0 */
    private long f13409d0 = 0;

    /* JADX INFO: renamed from: e0 */
    private long f13410e0 = -1;

    /* JADX INFO: renamed from: f0 */
    private Thread f13411f0 = null;

    /* JADX INFO: renamed from: g0 */
    private boolean f13412g0 = false;

    /* JADX INFO: renamed from: h0 */
    private boolean f13413h0 = true;

    /* JADX INFO: renamed from: i0 */
    private long f13414i0 = -1;

    /* JADX INFO: renamed from: j0 */
    private long f13415j0 = -1;

    /* JADX INFO: renamed from: k0 */
    boolean f13416k0 = true;

    /* JADX INFO: renamed from: l0 */
    boolean f13417l0 = true;

    /* JADX INFO: renamed from: m0 */
    private int f13418m0 = 50000;

    /* JADX INFO: renamed from: n0 */
    private long f13419n0 = -1;

    /* JADX INFO: renamed from: o0 */
    private boolean f13420o0 = false;

    /* JADX INFO: renamed from: p0 */
    Runnable f13421p0 = new h();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$a */
    public class a implements AbstractC3849f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3849f.a
        /* JADX INFO: renamed from: a */
        public void mo18699a(String str) {
            tmw tmwVar = C3852i.this.f13548z;
            if (tmwVar != null) {
                tmwVar.onFail(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, "Audio demuxer create error ! Exception:" + str + " sourcePath:" + C3852i.this.f13395P);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$b */
    public class b implements AbstractC3849f.a {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3849f.a
        /* JADX INFO: renamed from: a */
        public void mo18699a(String str) {
            tmw tmwVar = C3852i.this.f13548z;
            if (tmwVar != null) {
                tmwVar.onFail(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "Video demuxer create error ! Exception:" + str + " sourcePath:" + C3852i.this.f13395P);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$c */
    public class c implements C3851h.d {
        public c() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.d
        public void onComplete() {
            C3852i.this.m18857a0(1);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$d */
    public class d implements C3851h.b {
        public d() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (!C3852i.this.m18855Y(bufferInfo.presentationTimeUs)) {
                long j = bufferInfo.presentationTimeUs;
                C3852i c3852i = C3852i.this;
                if (j > c3852i.f13539q) {
                    c3852i.f13417l0 = false;
                    c3852i.m18857a0(1);
                    return;
                }
                return;
            }
            C3852i c3852i2 = C3852i.this;
            if (c3852i2.f13546x == null || byteBuffer == null || bufferInfo.size <= 0) {
                return;
            }
            AudioResampleUtils audioResampleUtils = c3852i2.f13403X;
            C3852i c3852i3 = C3852i.this;
            if (audioResampleUtils == null) {
                c3852i3.f13409d0 = bufferInfo.presentationTimeUs;
                C3852i.this.f13546x.mo18943e(byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                return;
            }
            if (c3852i3.f13410e0 < 0) {
                C3852i.this.f13410e0 = bufferInfo.presentationTimeUs;
            }
            if (C3852i.this.f13405Z == null || C3852i.this.f13405Z.capacity() < bufferInfo.size) {
                C3852i.this.f13405Z = ByteBuffer.allocate(bufferInfo.size);
            }
            byteBuffer.position(0);
            byteBuffer.get(C3852i.this.f13405Z.array(), 0, bufferInfo.size);
            int i = bufferInfo.size * 8;
            C3852i c3852i4 = C3852i.this;
            ByteBuffer byteBufferResamplePcmData = c3852i4.f13403X.resamplePcmData(C3852i.this.f13405Z.array(), (i / c3852i4.f13527e) / c3852i4.f13526d);
            if (byteBufferResamplePcmData != null) {
                int iLimit = byteBufferResamplePcmData.limit();
                C3852i c3852i5 = C3852i.this;
                int i2 = ((iLimit * 8) / c3852i5.f13529g) / c3852i5.f13530h;
                c3852i5.f13546x.mo18943e(byteBufferResamplePcmData, iLimit, c3852i5.f13404Y + C3852i.this.f13410e0);
                C3852i c3852i6 = C3852i.this;
                C3852i.m18850T(c3852i6, ((i2 * 1.0f) / c3852i6.f13528f) * 1000000.0f);
                C3852i c3852i7 = C3852i.this;
                c3852i7.f13409d0 = c3852i7.f13404Y + C3852i.this.f13410e0;
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            tmw tmwVar = C3852i.this.f13548z;
            if (tmwVar != null) {
                tmwVar.onFail(ErrorCode.DECODE_AUDIO_DECODE_FAILED, "[" + i2 + Constants.AES_SUFFIX + str + " sourcePath:" + C3852i.this.f13395P);
            }
            MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "Audio decode error " + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            C3852i c3852i = C3852i.this;
            if (!c3852i.f13417l0) {
                return false;
            }
            if (c3852i.f13409d0 - C3852i.this.f13408c0 > 8000000 && C3852i.this.f13416k0) {
                return false;
            }
            int iM18862c0 = C3852i.this.m18862c0(byteBuffer, bufferInfo);
            C3852i c3852i2 = C3852i.this;
            if (iM18862c0 <= 0) {
                if (c3852i2.f13541s) {
                    bufferInfo.set(0, -1, 0L, 0);
                } else {
                    bufferInfo.set(0, 0, 0L, 0);
                }
                C3852i.this.f13417l0 = false;
                return true;
            }
            long j = c3852i2.f13539q;
            if (j <= 0 || bufferInfo.presentationTimeUs <= j + 500000) {
                return true;
            }
            bufferInfo.set(0, 0, 0L, 0);
            C3852i.this.f13417l0 = false;
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            C3852i c3852i = C3852i.this;
            if (c3852i.f13546x != null) {
                c3852i.m18857a0(1);
                C3852i.this.f13546x.mo18940a();
            }
            MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "Audio decoder finished !!!");
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "Audio format changed !!!");
            C3852i.this.m18858b0(mediaFormat);
            C3852i c3852i = C3852i.this;
            if (c3852i.f13513A == null) {
                c3852i.f13513A = new MediaFormat();
            }
            C3852i c3852i2 = C3852i.this;
            c3852i2.f13513A.setInteger("channel-count", c3852i2.f13527e);
            C3852i c3852i3 = C3852i.this;
            c3852i3.f13513A.setInteger("sample-rate", c3852i3.f13525c);
            C3852i c3852i4 = C3852i.this;
            c3852i4.f13513A.setInteger("bit-width", c3852i4.f13526d);
            C3852i c3852i5 = C3852i.this;
            if (c3852i5.f13529g != c3852i5.f13526d || c3852i5.f13530h != c3852i5.f13527e || c3852i5.f13528f != c3852i5.f13525c) {
                if (c3852i5.f13403X != null) {
                    C3852i.this.f13403X.release();
                }
                C3852i.this.f13403X = new AudioResampleUtils();
                AudioResampleUtils audioResampleUtils = C3852i.this.f13403X;
                C3852i c3852i6 = C3852i.this;
                audioResampleUtils.initResampleInfo(c3852i6.f13525c, c3852i6.f13527e, c3852i6.f13526d, c3852i6.f13528f, c3852i6.f13530h, c3852i6.f13529g);
                C3852i c3852i7 = C3852i.this;
                c3852i7.f13513A.setInteger("channel-count", c3852i7.f13530h);
                C3852i c3852i8 = C3852i.this;
                c3852i8.f13513A.setInteger("sample-rate", c3852i8.f13528f);
            }
            C3852i c3852i9 = C3852i.this;
            AbstractC3856m.c cVar = c3852i9.f13546x;
            if (cVar != null) {
                cVar.mo18942d(c3852i9.f13513A);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$e */
    public class e implements C3851h.a {
        public e() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.a
        public boolean onStartRendingImageToTexture(MediaCodec.BufferInfo bufferInfo) {
            C3852i.this.f13408c0 = bufferInfo.presentationTimeUs;
            if (C3852i.this.f13408c0 == 0 && bufferInfo.presentationTimeUs - C3852i.this.f13538p > 500000) {
                return false;
            }
            if (C3852i.this.m18855Y(bufferInfo.presentationTimeUs)) {
                C3852i.this.f13547y.mo18948e(bufferInfo);
                return true;
            }
            long j = bufferInfo.presentationTimeUs;
            C3852i c3852i = C3852i.this;
            if (j > c3852i.f13539q) {
                if (!c3852i.f13399T) {
                    C3852i.this.f13547y.mo18948e(null);
                }
                C3852i.this.f13399T = true;
                C3852i.this.m18857a0(16);
                MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "video end " + bufferInfo.presentationTimeUs);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$f */
    public class f implements C3851h.d {
        public f() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.d
        public void onComplete() {
            MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "video end complete endPts = " + C3852i.this.f13408c0);
            AbstractC3856m.e eVar = C3852i.this.f13547y;
            if (eVar != null) {
                eVar.mo18948e(null);
            }
            C3852i.this.m18857a0(16);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$g */
    public class g implements C3851h.b {
        public g() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            tmw tmwVar = C3852i.this.f13548z;
            if (tmwVar != null) {
                tmwVar.onFail(ErrorCode.DECODE_VIDEO_DECODE_FAILED, "[" + i2 + Constants.AES_SUFFIX + str + " sourcePath:" + C3852i.this.f13395P);
            }
            MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "[" + i2 + Constants.AES_SUFFIX + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            C3852i c3852i = C3852i.this;
            if (!c3852i.f13416k0) {
                return false;
            }
            int iM18863d0 = c3852i.m18863d0(byteBuffer, bufferInfo);
            C3852i c3852i2 = C3852i.this;
            if (iM18863d0 <= 0) {
                if (c3852i2.f13541s) {
                    bufferInfo.set(0, -1, 0L, 0);
                } else {
                    bufferInfo.set(0, 0, 0L, 0);
                }
                C3852i.this.f13416k0 = false;
                return true;
            }
            long j = c3852i2.f13539q;
            if (j <= 0 || bufferInfo.presentationTimeUs <= j + 2000000) {
                return true;
            }
            c3852i2.f13416k0 = false;
            bufferInfo.set(0, 0, 0L, 0);
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "video end finished endpts = " + C3852i.this.f13408c0);
            AbstractC3856m.e eVar = C3852i.this.f13547y;
            if (eVar != null) {
                eVar.mo18948e(null);
                C3852i.this.f13547y.mo18944a();
            }
            C3852i.this.m18857a0(16);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "Video format changed !!!");
            C3852i c3852i = C3852i.this;
            if (c3852i.f13514B == null) {
                c3852i.f13514B = new MediaFormat();
            }
            if (mediaFormat.containsKey("stride")) {
                C3852i.this.f13531i = mediaFormat.getInteger("stride");
            }
            if (mediaFormat.containsKey("color-format")) {
                C3852i.this.f13532j = mediaFormat.getInteger("color-format");
            }
            if (mediaFormat.containsKey("rotation-degrees")) {
                C3852i.this.f13533k = mediaFormat.getInteger("rotation-degrees");
            }
            C3852i c3852i2 = C3852i.this;
            c3852i2.f13514B.setInteger("width", c3852i2.f13523a);
            C3852i c3852i3 = C3852i.this;
            c3852i3.f13514B.setInteger("height", c3852i3.f13524b);
            C3852i c3852i4 = C3852i.this;
            c3852i4.f13514B.setInteger("color-format", c3852i4.f13532j);
            C3852i c3852i5 = C3852i.this;
            c3852i5.f13514B.setInteger("stride", c3852i5.f13531i);
            C3852i c3852i6 = C3852i.this;
            c3852i6.f13514B.setInteger("rotation-degrees", c3852i6.f13533k);
            C3852i c3852i7 = C3852i.this;
            AbstractC3856m.e eVar = c3852i7.f13547y;
            if (eVar != null) {
                eVar.mo18947d(c3852i7.f13514B);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$h */
    public class h implements Runnable {
        public h() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007f  */
        @Override // java.lang.Runnable
        public void run() {
            long j;
            C3852i c3852i = C3852i.this;
            if (c3852i.f13528f <= 0) {
                c3852i.f13528f = c3852i.f13525c;
            }
            if (c3852i.f13530h <= 0) {
                c3852i.f13530h = c3852i.f13527e;
            }
            if (c3852i.f13529g <= 0) {
                c3852i.f13529g = c3852i.f13526d;
            }
            if (c3852i.f13513A == null) {
                c3852i.f13513A = new MediaFormat();
            }
            C3852i c3852i2 = C3852i.this;
            c3852i2.f13513A.setInteger("channel-count", c3852i2.f13527e);
            C3852i c3852i3 = C3852i.this;
            c3852i3.f13513A.setInteger("sample-rate", c3852i3.f13525c);
            C3852i c3852i4 = C3852i.this;
            c3852i4.f13513A.setInteger("bit-width", c3852i4.f13526d);
            C3852i c3852i5 = C3852i.this;
            AbstractC3856m.c cVar = c3852i5.f13546x;
            if (cVar != null) {
                cVar.mo18942d(c3852i5.f13513A);
            }
            C3852i c3852i6 = C3852i.this;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((c3852i6.f13526d * 1024) * c3852i6.f13530h) / 8);
            C3852i c3852i7 = C3852i.this;
            long j2 = c3852i7.f13537o;
            if (j2 >= 0) {
                long j3 = c3852i7.f13539q;
                if (j3 <= 0 || j3 <= j2) {
                    j = c3852i7.f13535m;
                    j2 = 0;
                } else {
                    long j4 = j3 - j2;
                    j = c3852i7.f13535m;
                    if (j4 <= j) {
                        j = j4 + j2;
                    }
                }
            } else {
                j = c3852i7.f13535m;
                j2 = 0;
            }
            while (!C3852i.this.f13406a0) {
                if (C3852i.this.f13412g0 || (C3852i.this.f13409d0 - C3852i.this.f13408c0 > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && C3852i.this.f13416k0)) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    C3852i c3852i8 = C3852i.this;
                    if (j2 <= j) {
                        if (c3852i8.f13546x != null) {
                            byteBufferAllocate.position(0);
                            C3852i.this.f13546x.mo18943e(byteBufferAllocate, byteBufferAllocate.capacity(), j2);
                        }
                        C3852i c3852i9 = C3852i.this;
                        long j5 = (long) (j2 + ((1024.0d / ((double) c3852i9.f13528f)) * 1000000.0d));
                        c3852i9.f13409d0 = j5;
                        j2 = j5;
                    } else {
                        if (c3852i8.f13541s) {
                            break;
                        }
                        c3852i8.m18857a0(1);
                        try {
                            Thread.sleep(5L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            C3852i c3852i10 = C3852i.this;
            if (c3852i10.f13546x == null || !c3852i10.f13413h0) {
                return;
            }
            C3852i.this.m18857a0(1);
            C3852i.this.f13546x.mo18940a();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ long m18850T(C3852i c3852i, float f2) {
        long j = (long) (c3852i.f13404Y + f2);
        c3852i.f13404Y = j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public boolean m18855Y(long j) {
        long j2 = this.f13537o;
        if (j2 >= 0) {
            long j3 = this.f13539q;
            if (j3 > 0 && j3 > j2) {
                return j >= this.f13538p && j <= j3;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private void m18856Z() {
        C3851h c3851h = this.f13393N;
        if (c3851h != null) {
            c3851h.m18831w();
        }
        C3851h c3851h2 = this.f13394O;
        if (c3851h2 != null) {
            c3851h2.m18831w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m18857a0(int i) {
        if (i != 1) {
            if (i != 16 || this.f13547y == null || this.f13401V) {
                return;
            }
            this.f13401V = true;
            if (this.f13400U) {
                this.f13538p = this.f13537o;
                return;
            }
            return;
        }
        AbstractC3856m.c cVar = this.f13546x;
        if (cVar == null || this.f13400U) {
            return;
        }
        cVar.mo18941c();
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "audio Finished");
        this.f13400U = true;
        if (this.f13401V) {
            this.f13538p = this.f13537o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m18858b0(MediaFormat mediaFormat) {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper init audio info !!!");
        if (mediaFormat.containsKey("channel-count")) {
            int integer = mediaFormat.getInteger("channel-count");
            this.f13527e = integer;
            if (this.f13530h <= 0) {
                this.f13530h = integer;
            }
        }
        if (mediaFormat.containsKey("sample-rate")) {
            int integer2 = mediaFormat.getInteger("sample-rate");
            this.f13525c = integer2;
            if (this.f13528f <= 0) {
                this.f13528f = integer2;
            }
        }
        if (mediaFormat.containsKey("bit-width")) {
            int integer3 = mediaFormat.getInteger("bit-width");
            this.f13526d = integer3;
            if (this.f13529g <= 0) {
                this.f13529g = integer3;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private boolean m18859f0(String str, int i) {
        AbstractC3849f abstractC3849f;
        synchronized (this.f13397R) {
            try {
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    if (str != null) {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (strExtractMetadata != null && strExtractMetadata.length() > 0) {
                        this.f13534l = Integer.valueOf(strExtractMetadata).intValue();
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    this.f13534l = 0;
                }
                this.f13395P = str;
                if ((i & 1) != 0 && this.f13391L == null) {
                    C3853j c3853j = new C3853j();
                    this.f13391L = c3853j;
                    c3853j.m18762h(new a());
                    if (!this.f13391L.mo18757c(this.f13395P)) {
                        MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "media demuxer create error !");
                        return false;
                    }
                }
                if ((i & 16) != 0 && this.f13392M == null) {
                    C3853j c3853j2 = new C3853j();
                    this.f13392M = c3853j2;
                    c3853j2.m18762h(new b());
                    if (!this.f13392M.mo18757c(this.f13395P)) {
                        MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "media demuxer create error !");
                        return false;
                    }
                }
                AbstractC3849f abstractC3849f2 = this.f13391L;
                if (abstractC3849f2 != null) {
                    this.f13402W = abstractC3849f2.mo18756b();
                } else {
                    AbstractC3849f abstractC3849f3 = this.f13392M;
                    if (abstractC3849f3 == null) {
                        tmw tmwVar = this.f13548z;
                        if (tmwVar != null) {
                            tmwVar.onFail(ErrorCode.DECODE_DEMUXER_FORMAT_FAILED, "Video demuxer getMediaFormatList failed! sourcePath:" + this.f13395P);
                        }
                        return false;
                    }
                    this.f13402W = abstractC3849f3.mo18756b();
                }
                for (MediaFormat mediaFormat : this.f13402W) {
                    if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio") && this.f13391L != null) {
                        m18858b0(mediaFormat);
                        if (mediaFormat.containsKey("durationUs")) {
                            this.f13535m = this.f13535m < mediaFormat.getLong("durationUs") ? mediaFormat.getLong("durationUs") : this.f13535m;
                        }
                        if (!this.f13391L.mo18761g(mediaFormat)) {
                            tmw tmwVar2 = this.f13548z;
                            if (tmwVar2 != null) {
                                tmwVar2.onFail(ErrorCode.DECODE_DEMUXER_SELECT_AUDIO_FAILED, "demuxer select audio failed! sourcePath:" + this.f13395P);
                            }
                            return false;
                        }
                        C3851h c3851h = new C3851h("audio");
                        this.f13393N = c3851h;
                        if (!c3851h.m18830u(mediaFormat, 1)) {
                            tmw tmwVar3 = this.f13548z;
                            if (tmwVar3 != null) {
                                tmwVar3.onFail(ErrorCode.DECODE_AUDIO_CODEC_FAILED, "Create audio media codec error ! sourcePath:" + this.f13395P);
                            }
                            MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "Create audio media codec error !");
                            return false;
                        }
                        this.f13393N.m18825H(this.f13391L.mo18755a());
                        this.f13393N.m18827J(new c());
                        this.f13393N.m18826I(new d());
                    } else if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("video") && (abstractC3849f = this.f13392M) != null) {
                        if (!abstractC3849f.mo18761g(mediaFormat)) {
                            tmw tmwVar4 = this.f13548z;
                            if (tmwVar4 != null) {
                                tmwVar4.onFail(ErrorCode.DECODE_DEMUXER_SELECT_VIDEO_FAILED, "demuxer select video failed! sourcePath:" + this.f13395P);
                            }
                            return false;
                        }
                        if (mediaFormat.containsKey("width")) {
                            this.f13523a = mediaFormat.getInteger("width");
                        }
                        if (mediaFormat.containsKey("height")) {
                            this.f13524b = mediaFormat.getInteger("height");
                        }
                        if (mediaFormat.containsKey("stride")) {
                            this.f13531i = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("rotation-degrees")) {
                            this.f13533k = mediaFormat.getInteger("rotation-degrees");
                        }
                        if (mediaFormat.containsKey("durationUs")) {
                            this.f13535m = this.f13535m < mediaFormat.getLong("durationUs") ? mediaFormat.getLong("durationUs") : this.f13535m;
                        }
                        C3851h c3851h2 = new C3851h(1, "video");
                        this.f13394O = c3851h2;
                        c3851h2.m18825H(this.f13392M.mo18755a());
                        this.f13394O.m18823F(this.f13544v);
                        if (!this.f13394O.m18830u(mediaFormat, 1)) {
                            MDLog.m7391e(MDLogTag.MEDIA_DECODE_TAG, "Create video media codec erorr !");
                            tmw tmwVar5 = this.f13548z;
                            if (tmwVar5 != null) {
                                tmwVar5.onFail(ErrorCode.DECODE_VIDEO_CODEC_FAILED, "Create video media codec erorr ! sourcePath:" + this.f13395P);
                            }
                            return false;
                        }
                        if (this.f13544v != null) {
                            this.f13394O.m18824G(new e());
                        }
                        this.f13394O.m18827J(new f());
                        this.f13394O.m18826I(new g());
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m18860g0(long j) {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper startDecoding !!!");
        synchronized (this.f13397R) {
            try {
                if (this.f13396Q.booleanValue()) {
                    m18864e0(j);
                    return true;
                }
                C3851h c3851h = this.f13393N;
                if (c3851h != null) {
                    c3851h.m18829L(true);
                }
                C3851h c3851h2 = this.f13394O;
                if (c3851h2 != null) {
                    c3851h2.m18829L(true);
                }
                if ((this.f13540r & 1) != 0 && this.f13393N == null && this.f13407b0) {
                    this.f13406a0 = false;
                    Thread thread = new Thread(this.f13421p0, "InsertMuteAudioData" + zzf0.m221018b());
                    this.f13411f0 = thread;
                    thread.start();
                }
                this.f13538p = j;
                this.f13396Q = Boolean.TRUE;
                if (j > 0) {
                    m18864e0(j);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m18861h0() {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper stopDecoding !!!");
        synchronized (this.f13397R) {
            try {
                this.f13396Q = Boolean.FALSE;
                this.f13406a0 = true;
                C3851h c3851h = this.f13393N;
                if (c3851h != null) {
                    c3851h.m18820C();
                    this.f13393N = null;
                }
                C3851h c3851h2 = this.f13394O;
                if (c3851h2 != null) {
                    c3851h2.m18819B();
                    this.f13394O.m18820C();
                    this.f13394O = null;
                }
                AbstractC3849f abstractC3849f = this.f13391L;
                if (abstractC3849f != null) {
                    abstractC3849f.mo18759e();
                    this.f13391L = null;
                }
                AbstractC3849f abstractC3849f2 = this.f13392M;
                if (abstractC3849f2 != null) {
                    abstractC3849f2.mo18759e();
                    this.f13392M = null;
                }
                Thread thread = this.f13411f0;
                if (thread != null) {
                    try {
                        thread.join();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: B */
    public boolean mo18786B() {
        return m18860g0(this.f13537o);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: C */
    public boolean mo18787C(long j) {
        return m18860g0(j);
    }

    /* JADX INFO: renamed from: c0 */
    public int m18862c0(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        AbstractC3849f abstractC3849f = this.f13391L;
        if (abstractC3849f != null) {
            return abstractC3849f.mo18758d(byteBuffer, bufferInfo);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d0 */
    public int m18863d0(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        AbstractC3849f abstractC3849f = this.f13392M;
        if (abstractC3849f == null) {
            return -1;
        }
        if (!this.f13521I) {
            return abstractC3849f.mo18758d(byteBuffer, bufferInfo);
        }
        if (this.f13522J == -1) {
            this.f13522J = this.f13539q;
        }
        long j = this.f13522J;
        long j2 = this.f13539q;
        if (j > j2) {
            this.f13522J = j2;
        }
        while (true) {
            long j3 = this.f13522J;
            if (j3 < 0) {
                return -1;
            }
            this.f13392M.mo18760f(j3);
            byteBuffer.position(0);
            int iMo18758d = this.f13392M.mo18758d(byteBuffer, bufferInfo);
            if (iMo18758d == -1) {
                MDLog.m7399w(MDLogTag.MEDIA_DECODE_TAG, "invalid seekTime:" + this.f13522J);
            }
            this.f13522J -= (long) this.f13418m0;
            long j4 = bufferInfo.presentationTimeUs;
            if (j4 != this.f13419n0 && iMo18758d != -1) {
                this.f13419n0 = j4;
                bufferInfo.presentationTimeUs = (this.f13537o + this.f13539q) - j4;
                return iMo18758d;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m18864e0(long j) {
        synchronized (this.f13397R) {
            try {
                if (this.f13396Q.booleanValue() && j >= 0) {
                    long j2 = this.f13535m;
                    if (j <= j2 || j2 <= 0) {
                        mo18789o();
                        m18856Z();
                        this.f13398S = false;
                        this.f13399T = false;
                        this.f13417l0 = true;
                        this.f13416k0 = true;
                        this.f13400U = false;
                        this.f13401V = false;
                        this.f13415j0 = -1L;
                        this.f13414i0 = -1L;
                        this.f13404Y = 0L;
                        C3851h c3851h = this.f13393N;
                        if (c3851h != null) {
                            AbstractC3849f abstractC3849f = this.f13391L;
                            if (abstractC3849f != null) {
                                abstractC3849f.mo18760f(j);
                            }
                        } else if ((this.f13540r & 1) != 0 && c3851h == null && this.f13407b0) {
                            this.f13406a0 = true;
                            this.f13413h0 = false;
                            Thread thread = this.f13411f0;
                            if (thread != null) {
                                try {
                                    thread.join();
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            this.f13406a0 = false;
                            this.f13413h0 = true;
                            Thread thread2 = new Thread(this.f13421p0, "InsertMuteAudioData" + zzf0.m221018b());
                            this.f13411f0 = thread2;
                            thread2.start();
                        }
                        C3851h c3851h2 = this.f13394O;
                        if (c3851h2 != null) {
                            c3851h2.m18819B();
                            AbstractC3849f abstractC3849f2 = this.f13392M;
                            if (abstractC3849f2 != null) {
                                if (this.f13521I) {
                                    long j3 = (this.f13537o + this.f13539q) - j;
                                    this.f13522J = j3;
                                    if (j3 == 0) {
                                        this.f13522J = -1L;
                                        this.f13538p = 0L;
                                    } else {
                                        this.f13538p = j;
                                    }
                                } else {
                                    abstractC3849f2.mo18760f(j);
                                    this.f13538p = j;
                                }
                            }
                        }
                        this.f13409d0 = 0L;
                        this.f13408c0 = 0L;
                        mo18793s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: o */
    public void mo18789o() {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper pause !!!");
        C3851h c3851h = this.f13393N;
        if (c3851h != null) {
            c3851h.m18818A();
        } else {
            this.f13412g0 = true;
        }
        C3851h c3851h2 = this.f13394O;
        if (c3851h2 != null) {
            c3851h2.m18818A();
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: p */
    public boolean mo18790p(String str, int i) {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper prepare path = " + str + " sourceType = " + i);
        if (str == null) {
            return false;
        }
        this.f13540r = i;
        if (this.f13536n == 16 && this.f13544v == null && !m18923d()) {
            return false;
        }
        return m18859f0(str, this.f13540r);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: q */
    public void mo18791q() {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper release !!!");
        synchronized (this.f13397R) {
            m18861h0();
            super.mo18791q();
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: r */
    public void mo18792r(Boolean bool) {
        C3851h c3851h = this.f13394O;
        if (c3851h != null) {
            c3851h.m18821D(bool.booleanValue());
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: s */
    public void mo18793s() {
        MDLog.m7395i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper resume !!!");
        C3851h c3851h = this.f13393N;
        if (c3851h != null) {
            c3851h.m18822E();
        } else {
            this.f13412g0 = false;
        }
        C3851h c3851h2 = this.f13394O;
        if (c3851h2 != null) {
            c3851h2.m18822E();
        }
    }
}
