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
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.List;
import p153l.g8g0;
import p153l.spw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.i */
/* JADX INFO: loaded from: classes7.dex */
public class C3995i extends AbstractC3999m {

    /* JADX INFO: renamed from: K */
    private final String f14084K = "MediaDecoderWrapper";

    /* JADX INFO: renamed from: L */
    private AbstractC3992f f14085L = null;

    /* JADX INFO: renamed from: M */
    private AbstractC3992f f14086M = null;

    /* JADX INFO: renamed from: N */
    private C3994h f14087N = null;

    /* JADX INFO: renamed from: O */
    private C3994h f14088O = null;

    /* JADX INFO: renamed from: P */
    private String f14089P = null;

    /* JADX INFO: renamed from: Q */
    private Boolean f14090Q = Boolean.FALSE;

    /* JADX INFO: renamed from: R */
    private Object f14091R = new Object();

    /* JADX INFO: renamed from: S */
    private boolean f14092S = false;

    /* JADX INFO: renamed from: T */
    private boolean f14093T = false;

    /* JADX INFO: renamed from: U */
    private boolean f14094U = false;

    /* JADX INFO: renamed from: V */
    private boolean f14095V = false;

    /* JADX INFO: renamed from: W */
    private List<MediaFormat> f14096W = null;

    /* JADX INFO: renamed from: X */
    private AudioResampleUtils f14097X = null;

    /* JADX INFO: renamed from: Y */
    private long f14098Y = 0;

    /* JADX INFO: renamed from: Z */
    private ByteBuffer f14099Z = null;

    /* JADX INFO: renamed from: a0 */
    private boolean f14100a0 = false;

    /* JADX INFO: renamed from: b0 */
    private boolean f14101b0 = true;

    /* JADX INFO: renamed from: c0 */
    private long f14102c0 = 0;

    /* JADX INFO: renamed from: d0 */
    private long f14103d0 = 0;

    /* JADX INFO: renamed from: e0 */
    private long f14104e0 = -1;

    /* JADX INFO: renamed from: f0 */
    private Thread f14105f0 = null;

    /* JADX INFO: renamed from: g0 */
    private boolean f14106g0 = false;

    /* JADX INFO: renamed from: h0 */
    private boolean f14107h0 = true;

    /* JADX INFO: renamed from: i0 */
    private long f14108i0 = -1;

    /* JADX INFO: renamed from: j0 */
    private long f14109j0 = -1;

    /* JADX INFO: renamed from: k0 */
    boolean f14110k0 = true;

    /* JADX INFO: renamed from: l0 */
    boolean f14111l0 = true;

    /* JADX INFO: renamed from: m0 */
    private int f14112m0 = SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH;

    /* JADX INFO: renamed from: n0 */
    private long f14113n0 = -1;

    /* JADX INFO: renamed from: o0 */
    private boolean f14114o0 = false;

    /* JADX INFO: renamed from: p0 */
    Runnable f14115p0 = new h();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$a */
    public class a implements AbstractC3992f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3992f.a
        /* JADX INFO: renamed from: a */
        public void mo19679a(String str) {
            spw spwVar = C3995i.this.f14242z;
            if (spwVar != null) {
                spwVar.onFail(ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, "Audio demuxer create error ! Exception:" + str + " sourcePath:" + C3995i.this.f14089P);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$b */
    public class b implements AbstractC3992f.a {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3992f.a
        /* JADX INFO: renamed from: a */
        public void mo19679a(String str) {
            spw spwVar = C3995i.this.f14242z;
            if (spwVar != null) {
                spwVar.onFail(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "Video demuxer create error ! Exception:" + str + " sourcePath:" + C3995i.this.f14089P);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$c */
    public class c implements C3994h.d {
        public c() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.d
        public void onComplete() {
            C3995i.this.m19837a0(1);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$d */
    public class d implements C3994h.b {
        public d() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (!C3995i.this.m19835Y(bufferInfo.presentationTimeUs)) {
                long j = bufferInfo.presentationTimeUs;
                C3995i c3995i = C3995i.this;
                if (j > c3995i.f14233q) {
                    c3995i.f14111l0 = false;
                    c3995i.m19837a0(1);
                    return;
                }
                return;
            }
            C3995i c3995i2 = C3995i.this;
            if (c3995i2.f14240x == null || byteBuffer == null || bufferInfo.size <= 0) {
                return;
            }
            AudioResampleUtils audioResampleUtils = c3995i2.f14097X;
            C3995i c3995i3 = C3995i.this;
            if (audioResampleUtils == null) {
                c3995i3.f14103d0 = bufferInfo.presentationTimeUs;
                C3995i.this.f14240x.mo19923e(byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                return;
            }
            if (c3995i3.f14104e0 < 0) {
                C3995i.this.f14104e0 = bufferInfo.presentationTimeUs;
            }
            if (C3995i.this.f14099Z == null || C3995i.this.f14099Z.capacity() < bufferInfo.size) {
                C3995i.this.f14099Z = ByteBuffer.allocate(bufferInfo.size);
            }
            byteBuffer.position(0);
            byteBuffer.get(C3995i.this.f14099Z.array(), 0, bufferInfo.size);
            int i = bufferInfo.size * 8;
            C3995i c3995i4 = C3995i.this;
            ByteBuffer byteBufferResamplePcmData = c3995i4.f14097X.resamplePcmData(C3995i.this.f14099Z.array(), (i / c3995i4.f14221e) / c3995i4.f14220d);
            if (byteBufferResamplePcmData != null) {
                int iLimit = byteBufferResamplePcmData.limit();
                C3995i c3995i5 = C3995i.this;
                int i2 = ((iLimit * 8) / c3995i5.f14223g) / c3995i5.f14224h;
                c3995i5.f14240x.mo19923e(byteBufferResamplePcmData, iLimit, c3995i5.f14098Y + C3995i.this.f14104e0);
                C3995i c3995i6 = C3995i.this;
                C3995i.m19830T(c3995i6, ((i2 * 1.0f) / c3995i6.f14222f) * 1000000.0f);
                C3995i c3995i7 = C3995i.this;
                c3995i7.f14103d0 = c3995i7.f14098Y + C3995i.this.f14104e0;
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            spw spwVar = C3995i.this.f14242z;
            if (spwVar != null) {
                spwVar.onFail(ErrorCode.DECODE_AUDIO_DECODE_FAILED, "[" + i2 + Constants.AES_SUFFIX + str + " sourcePath:" + C3995i.this.f14089P);
            }
            MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "Audio decode error " + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            C3995i c3995i = C3995i.this;
            if (!c3995i.f14111l0) {
                return false;
            }
            if (c3995i.f14103d0 - C3995i.this.f14102c0 > 8000000 && C3995i.this.f14110k0) {
                return false;
            }
            int iM19842c0 = C3995i.this.m19842c0(byteBuffer, bufferInfo);
            C3995i c3995i2 = C3995i.this;
            if (iM19842c0 <= 0) {
                if (c3995i2.f14235s) {
                    bufferInfo.set(0, -1, 0L, 0);
                } else {
                    bufferInfo.set(0, 0, 0L, 0);
                }
                C3995i.this.f14111l0 = false;
                return true;
            }
            long j = c3995i2.f14233q;
            if (j <= 0 || bufferInfo.presentationTimeUs <= j + 500000) {
                return true;
            }
            bufferInfo.set(0, 0, 0L, 0);
            C3995i.this.f14111l0 = false;
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            C3995i c3995i = C3995i.this;
            if (c3995i.f14240x != null) {
                c3995i.m19837a0(1);
                C3995i.this.f14240x.mo19920a();
            }
            MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "Audio decoder finished !!!");
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "Audio format changed !!!");
            C3995i.this.m19838b0(mediaFormat);
            C3995i c3995i = C3995i.this;
            if (c3995i.f14207A == null) {
                c3995i.f14207A = new MediaFormat();
            }
            C3995i c3995i2 = C3995i.this;
            c3995i2.f14207A.setInteger("channel-count", c3995i2.f14221e);
            C3995i c3995i3 = C3995i.this;
            c3995i3.f14207A.setInteger("sample-rate", c3995i3.f14219c);
            C3995i c3995i4 = C3995i.this;
            c3995i4.f14207A.setInteger("bit-width", c3995i4.f14220d);
            C3995i c3995i5 = C3995i.this;
            if (c3995i5.f14223g != c3995i5.f14220d || c3995i5.f14224h != c3995i5.f14221e || c3995i5.f14222f != c3995i5.f14219c) {
                if (c3995i5.f14097X != null) {
                    C3995i.this.f14097X.release();
                }
                C3995i.this.f14097X = new AudioResampleUtils();
                AudioResampleUtils audioResampleUtils = C3995i.this.f14097X;
                C3995i c3995i6 = C3995i.this;
                audioResampleUtils.initResampleInfo(c3995i6.f14219c, c3995i6.f14221e, c3995i6.f14220d, c3995i6.f14222f, c3995i6.f14224h, c3995i6.f14223g);
                C3995i c3995i7 = C3995i.this;
                c3995i7.f14207A.setInteger("channel-count", c3995i7.f14224h);
                C3995i c3995i8 = C3995i.this;
                c3995i8.f14207A.setInteger("sample-rate", c3995i8.f14222f);
            }
            C3995i c3995i9 = C3995i.this;
            AbstractC3999m.c cVar = c3995i9.f14240x;
            if (cVar != null) {
                cVar.mo19922d(c3995i9.f14207A);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$e */
    public class e implements C3994h.a {
        public e() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.a
        public boolean onStartRendingImageToTexture(MediaCodec.BufferInfo bufferInfo) {
            C3995i.this.f14102c0 = bufferInfo.presentationTimeUs;
            if (C3995i.this.f14102c0 == 0 && bufferInfo.presentationTimeUs - C3995i.this.f14232p > 500000) {
                return false;
            }
            if (C3995i.this.m19835Y(bufferInfo.presentationTimeUs)) {
                C3995i.this.f14241y.mo19928e(bufferInfo);
                return true;
            }
            long j = bufferInfo.presentationTimeUs;
            C3995i c3995i = C3995i.this;
            if (j > c3995i.f14233q) {
                if (!c3995i.f14093T) {
                    C3995i.this.f14241y.mo19928e(null);
                }
                C3995i.this.f14093T = true;
                C3995i.this.m19837a0(16);
                MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "video end " + bufferInfo.presentationTimeUs);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$f */
    public class f implements C3994h.d {
        public f() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.d
        public void onComplete() {
            MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "video end complete endPts = " + C3995i.this.f14102c0);
            AbstractC3999m.e eVar = C3995i.this.f14241y;
            if (eVar != null) {
                eVar.mo19928e(null);
            }
            C3995i.this.m19837a0(16);
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.i$g */
    public class g implements C3994h.b {
        public g() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            spw spwVar = C3995i.this.f14242z;
            if (spwVar != null) {
                spwVar.onFail(ErrorCode.DECODE_VIDEO_DECODE_FAILED, "[" + i2 + Constants.AES_SUFFIX + str + " sourcePath:" + C3995i.this.f14089P);
            }
            MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "[" + i2 + Constants.AES_SUFFIX + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            C3995i c3995i = C3995i.this;
            if (!c3995i.f14110k0) {
                return false;
            }
            int iM19843d0 = c3995i.m19843d0(byteBuffer, bufferInfo);
            C3995i c3995i2 = C3995i.this;
            if (iM19843d0 <= 0) {
                if (c3995i2.f14235s) {
                    bufferInfo.set(0, -1, 0L, 0);
                } else {
                    bufferInfo.set(0, 0, 0L, 0);
                }
                C3995i.this.f14110k0 = false;
                return true;
            }
            long j = c3995i2.f14233q;
            if (j <= 0 || bufferInfo.presentationTimeUs <= j + 2000000) {
                return true;
            }
            c3995i2.f14110k0 = false;
            bufferInfo.set(0, 0, 0L, 0);
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "video end finished endpts = " + C3995i.this.f14102c0);
            AbstractC3999m.e eVar = C3995i.this.f14241y;
            if (eVar != null) {
                eVar.mo19928e(null);
                C3995i.this.f14241y.mo19924a();
            }
            C3995i.this.m19837a0(16);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "Video format changed !!!");
            C3995i c3995i = C3995i.this;
            if (c3995i.f14208B == null) {
                c3995i.f14208B = new MediaFormat();
            }
            if (mediaFormat.containsKey("stride")) {
                C3995i.this.f14225i = mediaFormat.getInteger("stride");
            }
            if (mediaFormat.containsKey("color-format")) {
                C3995i.this.f14226j = mediaFormat.getInteger("color-format");
            }
            if (mediaFormat.containsKey("rotation-degrees")) {
                C3995i.this.f14227k = mediaFormat.getInteger("rotation-degrees");
            }
            C3995i c3995i2 = C3995i.this;
            c3995i2.f14208B.setInteger("width", c3995i2.f14217a);
            C3995i c3995i3 = C3995i.this;
            c3995i3.f14208B.setInteger("height", c3995i3.f14218b);
            C3995i c3995i4 = C3995i.this;
            c3995i4.f14208B.setInteger("color-format", c3995i4.f14226j);
            C3995i c3995i5 = C3995i.this;
            c3995i5.f14208B.setInteger("stride", c3995i5.f14225i);
            C3995i c3995i6 = C3995i.this;
            c3995i6.f14208B.setInteger("rotation-degrees", c3995i6.f14227k);
            C3995i c3995i7 = C3995i.this;
            AbstractC3999m.e eVar = c3995i7.f14241y;
            if (eVar != null) {
                eVar.mo19927d(c3995i7.f14208B);
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
            C3995i c3995i = C3995i.this;
            if (c3995i.f14222f <= 0) {
                c3995i.f14222f = c3995i.f14219c;
            }
            if (c3995i.f14224h <= 0) {
                c3995i.f14224h = c3995i.f14221e;
            }
            if (c3995i.f14223g <= 0) {
                c3995i.f14223g = c3995i.f14220d;
            }
            if (c3995i.f14207A == null) {
                c3995i.f14207A = new MediaFormat();
            }
            C3995i c3995i2 = C3995i.this;
            c3995i2.f14207A.setInteger("channel-count", c3995i2.f14221e);
            C3995i c3995i3 = C3995i.this;
            c3995i3.f14207A.setInteger("sample-rate", c3995i3.f14219c);
            C3995i c3995i4 = C3995i.this;
            c3995i4.f14207A.setInteger("bit-width", c3995i4.f14220d);
            C3995i c3995i5 = C3995i.this;
            AbstractC3999m.c cVar = c3995i5.f14240x;
            if (cVar != null) {
                cVar.mo19922d(c3995i5.f14207A);
            }
            C3995i c3995i6 = C3995i.this;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((c3995i6.f14220d * 1024) * c3995i6.f14224h) / 8);
            C3995i c3995i7 = C3995i.this;
            long j2 = c3995i7.f14231o;
            if (j2 >= 0) {
                long j3 = c3995i7.f14233q;
                if (j3 <= 0 || j3 <= j2) {
                    j = c3995i7.f14229m;
                    j2 = 0;
                } else {
                    long j4 = j3 - j2;
                    j = c3995i7.f14229m;
                    if (j4 <= j) {
                        j = j4 + j2;
                    }
                }
            } else {
                j = c3995i7.f14229m;
                j2 = 0;
            }
            while (!C3995i.this.f14100a0) {
                if (C3995i.this.f14106g0 || (C3995i.this.f14103d0 - C3995i.this.f14102c0 > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT && C3995i.this.f14110k0)) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    C3995i c3995i8 = C3995i.this;
                    if (j2 <= j) {
                        if (c3995i8.f14240x != null) {
                            byteBufferAllocate.position(0);
                            C3995i.this.f14240x.mo19923e(byteBufferAllocate, byteBufferAllocate.capacity(), j2);
                        }
                        C3995i c3995i9 = C3995i.this;
                        long j5 = (long) (j2 + ((1024.0d / ((double) c3995i9.f14222f)) * 1000000.0d));
                        c3995i9.f14103d0 = j5;
                        j2 = j5;
                    } else {
                        if (c3995i8.f14235s) {
                            break;
                        }
                        c3995i8.m19837a0(1);
                        try {
                            Thread.sleep(5L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            C3995i c3995i10 = C3995i.this;
            if (c3995i10.f14240x == null || !c3995i10.f14107h0) {
                return;
            }
            C3995i.this.m19837a0(1);
            C3995i.this.f14240x.mo19920a();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ long m19830T(C3995i c3995i, float f2) {
        long j = (long) (c3995i.f14098Y + f2);
        c3995i.f14098Y = j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public boolean m19835Y(long j) {
        long j2 = this.f14231o;
        if (j2 >= 0) {
            long j3 = this.f14233q;
            if (j3 > 0 && j3 > j2) {
                return j >= this.f14232p && j <= j3;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    private void m19836Z() {
        C3994h c3994h = this.f14087N;
        if (c3994h != null) {
            c3994h.m19811w();
        }
        C3994h c3994h2 = this.f14088O;
        if (c3994h2 != null) {
            c3994h2.m19811w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m19837a0(int i) {
        if (i != 1) {
            if (i != 16 || this.f14241y == null || this.f14095V) {
                return;
            }
            this.f14095V = true;
            if (this.f14094U) {
                this.f14232p = this.f14231o;
                return;
            }
            return;
        }
        AbstractC3999m.c cVar = this.f14240x;
        if (cVar == null || this.f14094U) {
            return;
        }
        cVar.mo19921c();
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "audio Finished");
        this.f14094U = true;
        if (this.f14095V) {
            this.f14232p = this.f14231o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m19838b0(MediaFormat mediaFormat) {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper init audio info !!!");
        if (mediaFormat.containsKey("channel-count")) {
            int integer = mediaFormat.getInteger("channel-count");
            this.f14221e = integer;
            if (this.f14224h <= 0) {
                this.f14224h = integer;
            }
        }
        if (mediaFormat.containsKey("sample-rate")) {
            int integer2 = mediaFormat.getInteger("sample-rate");
            this.f14219c = integer2;
            if (this.f14222f <= 0) {
                this.f14222f = integer2;
            }
        }
        if (mediaFormat.containsKey("bit-width")) {
            int integer3 = mediaFormat.getInteger("bit-width");
            this.f14220d = integer3;
            if (this.f14223g <= 0) {
                this.f14223g = integer3;
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    private boolean m19839f0(String str, int i) {
        AbstractC3992f abstractC3992f;
        synchronized (this.f14091R) {
            try {
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    if (str != null) {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (strExtractMetadata != null && strExtractMetadata.length() > 0) {
                        this.f14228l = Integer.valueOf(strExtractMetadata).intValue();
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    this.f14228l = 0;
                }
                this.f14089P = str;
                if ((i & 1) != 0 && this.f14085L == null) {
                    C3996j c3996j = new C3996j();
                    this.f14085L = c3996j;
                    c3996j.m19742h(new a());
                    if (!this.f14085L.mo19737c(this.f14089P)) {
                        MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "media demuxer create error !");
                        return false;
                    }
                }
                if ((i & 16) != 0 && this.f14086M == null) {
                    C3996j c3996j2 = new C3996j();
                    this.f14086M = c3996j2;
                    c3996j2.m19742h(new b());
                    if (!this.f14086M.mo19737c(this.f14089P)) {
                        MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "media demuxer create error !");
                        return false;
                    }
                }
                AbstractC3992f abstractC3992f2 = this.f14085L;
                if (abstractC3992f2 != null) {
                    this.f14096W = abstractC3992f2.mo19736b();
                } else {
                    AbstractC3992f abstractC3992f3 = this.f14086M;
                    if (abstractC3992f3 == null) {
                        spw spwVar = this.f14242z;
                        if (spwVar != null) {
                            spwVar.onFail(ErrorCode.DECODE_DEMUXER_FORMAT_FAILED, "Video demuxer getMediaFormatList failed! sourcePath:" + this.f14089P);
                        }
                        return false;
                    }
                    this.f14096W = abstractC3992f3.mo19736b();
                }
                for (MediaFormat mediaFormat : this.f14096W) {
                    if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio") && this.f14085L != null) {
                        m19838b0(mediaFormat);
                        if (mediaFormat.containsKey("durationUs")) {
                            this.f14229m = this.f14229m < mediaFormat.getLong("durationUs") ? mediaFormat.getLong("durationUs") : this.f14229m;
                        }
                        if (!this.f14085L.mo19741g(mediaFormat)) {
                            spw spwVar2 = this.f14242z;
                            if (spwVar2 != null) {
                                spwVar2.onFail(ErrorCode.DECODE_DEMUXER_SELECT_AUDIO_FAILED, "demuxer select audio failed! sourcePath:" + this.f14089P);
                            }
                            return false;
                        }
                        C3994h c3994h = new C3994h("audio");
                        this.f14087N = c3994h;
                        if (!c3994h.m19810u(mediaFormat, 1)) {
                            spw spwVar3 = this.f14242z;
                            if (spwVar3 != null) {
                                spwVar3.onFail(ErrorCode.DECODE_AUDIO_CODEC_FAILED, "Create audio media codec error ! sourcePath:" + this.f14089P);
                            }
                            MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "Create audio media codec error !");
                            return false;
                        }
                        this.f14087N.m19805H(this.f14085L.mo19735a());
                        this.f14087N.m19807J(new c());
                        this.f14087N.m19806I(new d());
                    } else if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("video") && (abstractC3992f = this.f14086M) != null) {
                        if (!abstractC3992f.mo19741g(mediaFormat)) {
                            spw spwVar4 = this.f14242z;
                            if (spwVar4 != null) {
                                spwVar4.onFail(ErrorCode.DECODE_DEMUXER_SELECT_VIDEO_FAILED, "demuxer select video failed! sourcePath:" + this.f14089P);
                            }
                            return false;
                        }
                        if (mediaFormat.containsKey("width")) {
                            this.f14217a = mediaFormat.getInteger("width");
                        }
                        if (mediaFormat.containsKey("height")) {
                            this.f14218b = mediaFormat.getInteger("height");
                        }
                        if (mediaFormat.containsKey("stride")) {
                            this.f14225i = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("rotation-degrees")) {
                            this.f14227k = mediaFormat.getInteger("rotation-degrees");
                        }
                        if (mediaFormat.containsKey("durationUs")) {
                            this.f14229m = this.f14229m < mediaFormat.getLong("durationUs") ? mediaFormat.getLong("durationUs") : this.f14229m;
                        }
                        C3994h c3994h2 = new C3994h(1, "video");
                        this.f14088O = c3994h2;
                        c3994h2.m19805H(this.f14086M.mo19735a());
                        this.f14088O.m19803F(this.f14238v);
                        if (!this.f14088O.m19810u(mediaFormat, 1)) {
                            MDLog.m7445e(MDLogTag.MEDIA_DECODE_TAG, "Create video media codec erorr !");
                            spw spwVar5 = this.f14242z;
                            if (spwVar5 != null) {
                                spwVar5.onFail(ErrorCode.DECODE_VIDEO_CODEC_FAILED, "Create video media codec erorr ! sourcePath:" + this.f14089P);
                            }
                            return false;
                        }
                        if (this.f14238v != null) {
                            this.f14088O.m19804G(new e());
                        }
                        this.f14088O.m19807J(new f());
                        this.f14088O.m19806I(new g());
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    private boolean m19840g0(long j) {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper startDecoding !!!");
        synchronized (this.f14091R) {
            try {
                if (this.f14090Q.booleanValue()) {
                    m19844e0(j);
                    return true;
                }
                C3994h c3994h = this.f14087N;
                if (c3994h != null) {
                    c3994h.m19809L(true);
                }
                C3994h c3994h2 = this.f14088O;
                if (c3994h2 != null) {
                    c3994h2.m19809L(true);
                }
                if ((this.f14234r & 1) != 0 && this.f14087N == null && this.f14101b0) {
                    this.f14100a0 = false;
                    Thread thread = new Thread(this.f14115p0, "InsertMuteAudioData" + g8g0.m129407b());
                    this.f14105f0 = thread;
                    thread.start();
                }
                this.f14232p = j;
                this.f14090Q = Boolean.TRUE;
                if (j > 0) {
                    m19844e0(j);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m19841h0() {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper stopDecoding !!!");
        synchronized (this.f14091R) {
            try {
                this.f14090Q = Boolean.FALSE;
                this.f14100a0 = true;
                C3994h c3994h = this.f14087N;
                if (c3994h != null) {
                    c3994h.m19800C();
                    this.f14087N = null;
                }
                C3994h c3994h2 = this.f14088O;
                if (c3994h2 != null) {
                    c3994h2.m19799B();
                    this.f14088O.m19800C();
                    this.f14088O = null;
                }
                AbstractC3992f abstractC3992f = this.f14085L;
                if (abstractC3992f != null) {
                    abstractC3992f.mo19739e();
                    this.f14085L = null;
                }
                AbstractC3992f abstractC3992f2 = this.f14086M;
                if (abstractC3992f2 != null) {
                    abstractC3992f2.mo19739e();
                    this.f14086M = null;
                }
                Thread thread = this.f14105f0;
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

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: B */
    public boolean mo19766B() {
        return m19840g0(this.f14231o);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: C */
    public boolean mo19767C(long j) {
        return m19840g0(j);
    }

    /* JADX INFO: renamed from: c0 */
    public int m19842c0(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        AbstractC3992f abstractC3992f = this.f14085L;
        if (abstractC3992f != null) {
            return abstractC3992f.mo19738d(byteBuffer, bufferInfo);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d0 */
    public int m19843d0(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        AbstractC3992f abstractC3992f = this.f14086M;
        if (abstractC3992f == null) {
            return -1;
        }
        if (!this.f14215I) {
            return abstractC3992f.mo19738d(byteBuffer, bufferInfo);
        }
        if (this.f14216J == -1) {
            this.f14216J = this.f14233q;
        }
        long j = this.f14216J;
        long j2 = this.f14233q;
        if (j > j2) {
            this.f14216J = j2;
        }
        while (true) {
            long j3 = this.f14216J;
            if (j3 < 0) {
                return -1;
            }
            this.f14086M.mo19740f(j3);
            byteBuffer.position(0);
            int iMo19738d = this.f14086M.mo19738d(byteBuffer, bufferInfo);
            if (iMo19738d == -1) {
                MDLog.m7453w(MDLogTag.MEDIA_DECODE_TAG, "invalid seekTime:" + this.f14216J);
            }
            this.f14216J -= (long) this.f14112m0;
            long j4 = bufferInfo.presentationTimeUs;
            if (j4 != this.f14113n0 && iMo19738d != -1) {
                this.f14113n0 = j4;
                bufferInfo.presentationTimeUs = (this.f14231o + this.f14233q) - j4;
                return iMo19738d;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m19844e0(long j) {
        synchronized (this.f14091R) {
            try {
                if (this.f14090Q.booleanValue() && j >= 0) {
                    long j2 = this.f14229m;
                    if (j <= j2 || j2 <= 0) {
                        mo19769o();
                        m19836Z();
                        this.f14092S = false;
                        this.f14093T = false;
                        this.f14111l0 = true;
                        this.f14110k0 = true;
                        this.f14094U = false;
                        this.f14095V = false;
                        this.f14109j0 = -1L;
                        this.f14108i0 = -1L;
                        this.f14098Y = 0L;
                        C3994h c3994h = this.f14087N;
                        if (c3994h != null) {
                            AbstractC3992f abstractC3992f = this.f14085L;
                            if (abstractC3992f != null) {
                                abstractC3992f.mo19740f(j);
                            }
                        } else if ((this.f14234r & 1) != 0 && c3994h == null && this.f14101b0) {
                            this.f14100a0 = true;
                            this.f14107h0 = false;
                            Thread thread = this.f14105f0;
                            if (thread != null) {
                                try {
                                    thread.join();
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            this.f14100a0 = false;
                            this.f14107h0 = true;
                            Thread thread2 = new Thread(this.f14115p0, "InsertMuteAudioData" + g8g0.m129407b());
                            this.f14105f0 = thread2;
                            thread2.start();
                        }
                        C3994h c3994h2 = this.f14088O;
                        if (c3994h2 != null) {
                            c3994h2.m19799B();
                            AbstractC3992f abstractC3992f2 = this.f14086M;
                            if (abstractC3992f2 != null) {
                                if (this.f14215I) {
                                    long j3 = (this.f14231o + this.f14233q) - j;
                                    this.f14216J = j3;
                                    if (j3 == 0) {
                                        this.f14216J = -1L;
                                        this.f14232p = 0L;
                                    } else {
                                        this.f14232p = j;
                                    }
                                } else {
                                    abstractC3992f2.mo19740f(j);
                                    this.f14232p = j;
                                }
                            }
                        }
                        this.f14103d0 = 0L;
                        this.f14102c0 = 0L;
                        mo19773s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: o */
    public void mo19769o() {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper pause !!!");
        C3994h c3994h = this.f14087N;
        if (c3994h != null) {
            c3994h.m19798A();
        } else {
            this.f14106g0 = true;
        }
        C3994h c3994h2 = this.f14088O;
        if (c3994h2 != null) {
            c3994h2.m19798A();
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: p */
    public boolean mo19770p(String str, int i) {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper prepare path = " + str + " sourceType = " + i);
        if (str == null) {
            return false;
        }
        this.f14234r = i;
        if (this.f14230n == 16 && this.f14238v == null && !m19903d()) {
            return false;
        }
        return m19839f0(str, this.f14234r);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: q */
    public void mo19771q() {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper release !!!");
        synchronized (this.f14091R) {
            m19841h0();
            super.mo19771q();
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: r */
    public void mo19772r(Boolean bool) {
        C3994h c3994h = this.f14088O;
        if (c3994h != null) {
            c3994h.m19801D(bool.booleanValue());
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: s */
    public void mo19773s() {
        MDLog.m7449i(MDLogTag.MEDIA_DECODE_TAG, "MediaDecoderWrapper resume !!!");
        C3994h c3994h = this.f14087N;
        if (c3994h != null) {
            c3994h.m19802E();
        } else {
            this.f14106g0 = false;
        }
        C3994h c3994h2 = this.f14088O;
        if (c3994h2 != null) {
            c3994h2.m19802E();
        }
    }
}
