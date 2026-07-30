package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import p149l.kwv;
import p149l.u460;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.h */
/* JADX INFO: loaded from: classes7.dex */
public class C3851h {

    /* JADX INFO: renamed from: A */
    private boolean f13347A;

    /* JADX INFO: renamed from: B */
    private boolean f13348B;

    /* JADX INFO: renamed from: C */
    private Object f13349C;

    /* JADX INFO: renamed from: D */
    private Object f13350D;

    /* JADX INFO: renamed from: E */
    private String f13351E;

    /* JADX INFO: renamed from: F */
    private boolean f13352F;

    /* JADX INFO: renamed from: G */
    private boolean f13353G;

    /* JADX INFO: renamed from: H */
    private boolean f13354H;

    /* JADX INFO: renamed from: I */
    private ByteBuffer f13355I;

    /* JADX INFO: renamed from: J */
    private MediaCodec.BufferInfo f13356J;

    /* JADX INFO: renamed from: K */
    private d f13357K;

    /* JADX INFO: renamed from: L */
    private int f13358L;

    /* JADX INFO: renamed from: M */
    int f13359M;

    /* JADX INFO: renamed from: N */
    boolean f13360N;

    /* JADX INFO: renamed from: a */
    private final int f13361a;

    /* JADX INFO: renamed from: b */
    private final int f13362b;

    /* JADX INFO: renamed from: c */
    private final String f13363c;

    /* JADX INFO: renamed from: d */
    private final String f13364d;

    /* JADX INFO: renamed from: e */
    private final String f13365e;

    /* JADX INFO: renamed from: f */
    private final long f13366f;

    /* JADX INFO: renamed from: g */
    private final long f13367g;

    /* JADX INFO: renamed from: h */
    private MediaCodec f13368h;

    /* JADX INFO: renamed from: i */
    private Surface f13369i;

    /* JADX INFO: renamed from: j */
    private String f13370j;

    /* JADX INFO: renamed from: k */
    private ByteBuffer[] f13371k;

    /* JADX INFO: renamed from: l */
    private ByteBuffer[] f13372l;

    /* JADX INFO: renamed from: m */
    private Thread f13373m;

    /* JADX INFO: renamed from: n */
    private Thread f13374n;

    /* JADX INFO: renamed from: o */
    private Object f13375o;

    /* JADX INFO: renamed from: p */
    private int f13376p;

    /* JADX INFO: renamed from: q */
    private boolean f13377q;

    /* JADX INFO: renamed from: r */
    private boolean f13378r;

    /* JADX INFO: renamed from: s */
    private b f13379s;

    /* JADX INFO: renamed from: t */
    private a f13380t;

    /* JADX INFO: renamed from: u */
    private LinkedBlockingQueue<u460> f13381u;

    /* JADX INFO: renamed from: v */
    private LinkedList<Integer> f13382v;

    /* JADX INFO: renamed from: w */
    private Object f13383w;

    /* JADX INFO: renamed from: x */
    private boolean f13384x;

    /* JADX INFO: renamed from: y */
    private boolean f13385y;

    /* JADX INFO: renamed from: z */
    private boolean f13386z;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.h$a */
    public interface a {
        boolean onStartRendingImageToTexture(MediaCodec.BufferInfo bufferInfo);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.h$b */
    public interface b {
        void onCodecIdle();

        void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

        void onError(int i, int i2, String str);

        boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

        void onFinished();

        void onFormatChanged(MediaFormat mediaFormat);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.h$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private MediaCodec.BufferInfo f13387a = new MediaCodec.BufferInfo();

        /* JADX INFO: renamed from: b */
        boolean f13388b = false;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        private boolean m18833a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
            boolean z = mediaFormat2.containsKey("channel-count") != mediaFormat.containsKey("channel-count") || (mediaFormat.containsKey("channel-count") && mediaFormat2.getInteger("channel-count") != mediaFormat.getInteger("channel-count"));
            if (mediaFormat2.containsKey("sample-rate") != mediaFormat.containsKey("sample-rate") || (mediaFormat.containsKey("sample-rate") && mediaFormat2.getInteger("sample-rate") != mediaFormat.getInteger("sample-rate"))) {
                z = true;
            }
            if (mediaFormat2.containsKey("bit-width") != mediaFormat.containsKey("bit-width")) {
                return true;
            }
            if (!mediaFormat.containsKey("bit-width") || mediaFormat2.getInteger("bit-width") == mediaFormat.getInteger("bit-width")) {
                return z;
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaFormat mediaFormat = null;
            while (!C3851h.this.f13378r && !Thread.interrupted()) {
                synchronized (C3851h.this.f13350D) {
                    if (C3851h.this.f13385y) {
                        C3851h.this.f13347A = true;
                        C3851h.this.f13350D.notifyAll();
                        try {
                            Thread.sleep(1L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        C3851h.this.m18815v();
                        try {
                            this.f13387a.flags = 0;
                            boolean zStartsWith = C3851h.this.f13370j.startsWith("audio");
                            C3851h c3851h = C3851h.this;
                            int iDequeueOutputBuffer = zStartsWith ? c3851h.f13368h.dequeueOutputBuffer(this.f13387a, 200L) : c3851h.f13368h.dequeueOutputBuffer(this.f13387a, 10000L);
                            if (iDequeueOutputBuffer == -3) {
                                continue;
                            } else if (iDequeueOutputBuffer != -2) {
                                C3851h c3851h2 = C3851h.this;
                                if (iDequeueOutputBuffer != -1) {
                                    if (c3851h2.f13372l == null) {
                                        C3851h c3851h3 = C3851h.this;
                                        c3851h3.f13372l = c3851h3.f13368h.getOutputBuffers();
                                    }
                                    int i = C3851h.this.f13376p;
                                    C3851h c3851h4 = C3851h.this;
                                    if (i == 1) {
                                        if (c3851h4.f13369i == null) {
                                            if (C3851h.this.f13379s != null) {
                                                C3851h.this.f13379s.onDataOutput(C3851h.this.f13372l[iDequeueOutputBuffer], this.f13387a);
                                            }
                                            C3851h.this.f13368h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            if (C3851h.this.f13370j.startsWith("audio")) {
                                                C3851h.this.f13372l[iDequeueOutputBuffer].clear();
                                            }
                                        } else {
                                            int i2 = this.f13387a.size;
                                            C3851h c3851h5 = C3851h.this;
                                            if (i2 > 0) {
                                                boolean zOnStartRendingImageToTexture = c3851h5.f13380t != null ? C3851h.this.f13380t.onStartRendingImageToTexture(this.f13387a) : true;
                                                C3851h c3851h6 = C3851h.this;
                                                if (zOnStartRendingImageToTexture) {
                                                    synchronized (c3851h6.f13383w) {
                                                        try {
                                                            C3851h.this.f13382v.offer(Integer.valueOf(iDequeueOutputBuffer));
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    c3851h6.f13368h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                }
                                            } else {
                                                c3851h5.f13368h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            }
                                        }
                                    } else if (c3851h4.f13376p == 0) {
                                        MediaCodec.BufferInfo bufferInfo = this.f13387a;
                                        if (bufferInfo.flags != 2 && bufferInfo.size != 0 && C3851h.this.f13379s != null) {
                                            C3851h.this.f13379s.onDataOutput(C3851h.this.f13372l[iDequeueOutputBuffer], this.f13387a);
                                        }
                                        C3851h.this.f13368h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    }
                                    if ((this.f13387a.flags & 4) != 0) {
                                        MDLog.m7391e("MedaiCodecWrapper", "Codec End : " + (C3851h.this.f13376p == 1 ? "decoder " : "encoder") + " ---- " + (C3851h.this.f13370j.startsWith("video") ? "video" : "audio"));
                                        if (C3851h.this.f13357K != null) {
                                            C3851h.this.f13357K.onComplete();
                                        }
                                        if (C3851h.this.f13376p == 0 && C3851h.this.f13370j.startsWith("video") && C3851h.this.f13369i != null) {
                                            C3851h.this.f13378r = true;
                                        } else {
                                            boolean unused = C3851h.this.f13352F;
                                        }
                                    }
                                } else if (c3851h2.f13379s != null) {
                                    C3851h.this.f13379s.onCodecIdle();
                                }
                            } else {
                                MediaFormat outputFormat = C3851h.this.f13368h.getOutputFormat();
                                if (mediaFormat == null || m18833a(mediaFormat, outputFormat)) {
                                    if (C3851h.this.f13379s != null) {
                                        C3851h.this.f13379s.onFormatChanged(outputFormat);
                                    }
                                    mediaFormat = outputFormat;
                                }
                            }
                        } catch (Exception e2) {
                            MDLog.m7391e("MedaiCodecWrapper", "Codec Exception !!!!!!!!!!!!!!!!! " + e2.toString());
                            if (C3851h.this.f13379s != null) {
                                int i3 = C3851h.this.f13376p;
                                C3851h c3851h7 = C3851h.this;
                                if (i3 == 1) {
                                    c3851h7.f13379s.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, zzf0.m221017a(e2) + " codecStatus" + C3851h.this.f13358L);
                                } else {
                                    c3851h7.f13379s.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, zzf0.m221017a(e2) + " codecStatus" + C3851h.this.f13358L);
                                }
                            }
                            this.f13388b = true;
                        }
                    }
                }
            }
            C3851h.this.f13378r = true;
            if (C3851h.this.f13379s == null || this.f13388b || C3851h.this.f13353G) {
                return;
            }
            C3851h.this.f13379s.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.h$d */
    public interface d {
        void onComplete();
    }

    public C3851h(int i, String str) {
        this.f13361a = 401;
        this.f13362b = 402;
        this.f13363c = "MedaiCodecWrapper";
        this.f13364d = "video";
        this.f13365e = "audio";
        this.f13366f = 10000L;
        this.f13367g = 200L;
        this.f13368h = null;
        this.f13369i = null;
        this.f13370j = null;
        this.f13371k = null;
        this.f13372l = null;
        this.f13373m = null;
        this.f13374n = null;
        this.f13375o = new Object();
        this.f13376p = -1;
        this.f13377q = false;
        this.f13378r = false;
        this.f13381u = new LinkedBlockingQueue<>();
        this.f13382v = new LinkedList<>();
        this.f13383w = new Object();
        this.f13384x = false;
        this.f13385y = false;
        this.f13386z = false;
        this.f13347A = false;
        this.f13348B = true;
        this.f13349C = new Object();
        this.f13350D = new Object();
        this.f13351E = null;
        this.f13352F = false;
        this.f13353G = false;
        this.f13354H = false;
        this.f13355I = ByteBuffer.allocate(1048576);
        this.f13356J = new MediaCodec.BufferInfo();
        this.f13358L = 0;
        this.f13359M = 0;
        this.f13360N = false;
        this.f13376p = i;
        this.f13351E = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public boolean m18815v() {
        if (!this.f13348B) {
            return true;
        }
        try {
            if (this.f13371k == null) {
                ByteBuffer[] inputBuffers = this.f13368h.getInputBuffers();
                this.f13371k = inputBuffers;
                if (inputBuffers.length == 0) {
                    return false;
                }
                if (this.f13355I.capacity() > this.f13371k[0].capacity()) {
                    this.f13355I = ByteBuffer.allocate(this.f13371k[0].capacity());
                }
            }
            if (!this.f13360N) {
                if (this.f13379s == null) {
                    return false;
                }
                if (this.f13356J.size == 0) {
                    this.f13355I.position(0);
                    if (!this.f13379s.onFeedingData(this.f13355I, this.f13356J)) {
                        return false;
                    }
                    if (this.f13356J.size == 0) {
                        this.f13360N = true;
                    }
                }
            }
            int iDequeueInputBuffer = this.f13368h.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            int i = this.f13356J.size;
            if (i > 0) {
                this.f13371k[iDequeueInputBuffer].position(0);
                this.f13371k[iDequeueInputBuffer].put(this.f13355I.array(), 0, this.f13356J.size);
                MediaCodec mediaCodec = this.f13368h;
                MediaCodec.BufferInfo bufferInfo = this.f13356J;
                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, bufferInfo.size, bufferInfo.presentationTimeUs, 0);
            } else {
                MediaCodec mediaCodec2 = this.f13368h;
                if (i == 0) {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.f13360N = false;
                    this.f13358L = 4;
                } else {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.f13352F = true;
                    this.f13358L = 4;
                }
            }
            this.f13356J.size = 0;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            b bVar = this.f13379s;
            if (bVar != null) {
                if (this.f13376p == 1) {
                    bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, zzf0.m221017a(e) + " codecStatus" + this.f13358L);
                } else {
                    bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, zzf0.m221017a(e) + " codecStatus" + this.f13358L);
                }
            }
            return false;
        }
    }

    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: y */
    public static int m18816y(String str) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                            kwv.m147653c("codec", supportedTypes[i2]);
                            if (supportedTypes[i2].equalsIgnoreCase(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null) {
                                return ((Integer) encoderCapabilities.getQualityRange().getUpper()).intValue();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m18817z(String str, int i) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (int i3 = 0; i3 < supportedTypes.length; i3++) {
                        kwv.m147653c("codec", supportedTypes[i3]);
                        if (supportedTypes[i3].equalsIgnoreCase(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null) {
                            return encoderCapabilities.isBitrateModeSupported(i);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m18818A() {
        if (this.f13373m != null && !this.f13386z) {
            synchronized (this.f13349C) {
                this.f13384x = true;
            }
            while (!this.f13386z && !this.f13377q) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.f13374n == null || this.f13347A) {
            return;
        }
        synchronized (this.f13350D) {
            this.f13385y = true;
        }
        while (!this.f13347A && !this.f13378r) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m18819B() {
        synchronized (this.f13383w) {
            synchronized (this.f13383w) {
                MDLog.m7391e("MedaiCodecWrapper", "release all framebuffer");
                while (this.f13382v.size() > 0) {
                    try {
                        this.f13368h.releaseOutputBuffer(this.f13382v.pollFirst().intValue(), false);
                    } catch (Exception unused) {
                        kwv.m147652b("releaseAllCachedFrames error");
                        this.f13382v.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001e A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x00ad, B:50:0x00b1, B:51:0x00b3, B:52:0x00b9, B:42:0x0063, B:44:0x006a, B:46:0x006e, B:47:0x008e), top: B:56:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x003a A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x00ad, B:50:0x00b1, B:51:0x00b3, B:52:0x00b9, B:42:0x0063, B:44:0x006a, B:46:0x006e, B:47:0x008e), top: B:56:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x004d A[Catch: all -> 0x0011, Exception -> 0x0057, TryCatch #3 {Exception -> 0x0057, blocks: (B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059), top: B:62:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0051 A[Catch: all -> 0x0011, Exception -> 0x0057, TryCatch #3 {Exception -> 0x0057, blocks: (B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059), top: B:62:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x00ad, B:50:0x00b1, B:51:0x00b3, B:52:0x00b9, B:42:0x0063, B:44:0x006a, B:46:0x006e, B:47:0x008e), top: B:56:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1 A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000b, B:8:0x000d, B:14:0x0018, B:13:0x0015, B:15:0x001a, B:17:0x001e, B:19:0x0022, B:21:0x0026, B:23:0x0030, B:25:0x0034, B:27:0x003c, B:31:0x0046, B:30:0x0043, B:26:0x003a, B:33:0x0049, B:35:0x004d, B:37:0x0051, B:40:0x0059, B:48:0x00ad, B:50:0x00b1, B:51:0x00b3, B:52:0x00b9, B:42:0x0063, B:44:0x006a, B:46:0x006e, B:47:0x008e), top: B:56:0x0004, inners: #1, #2, #3 }] */
    /* JADX INFO: renamed from: C */
    public void m18820C() {
        MediaCodec mediaCodec;
        synchronized (this.f13375o) {
            this.f13353G = true;
            Thread thread = this.f13373m;
            if (thread != null) {
                this.f13377q = true;
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f13373m = null;
                if (this.f13374n == null) {
                    try {
                        mediaCodec = this.f13368h;
                        if (mediaCodec == null) {
                            if (this.f13369i != null) {
                                this.f13369i = null;
                            }
                            this.f13370j = null;
                            this.f13355I = null;
                            this.f13356J = null;
                        } else {
                            if (this.f13354H) {
                                mediaCodec.stop();
                                this.f13354H = false;
                            }
                            this.f13368h.release();
                            this.f13368h = null;
                            this.f13358L = 0;
                            if (this.f13369i != null) {
                                this.f13369i = null;
                            }
                            this.f13370j = null;
                            this.f13355I = null;
                            this.f13356J = null;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        b bVar = this.f13379s;
                        if (bVar != null) {
                            if (this.f13376p == 1) {
                                bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, zzf0.m221017a(e2) + " codecStatus" + this.f13358L);
                            } else {
                                bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, zzf0.m221017a(e2) + " codecStatus" + this.f13358L);
                            }
                        }
                    }
                } else {
                    if (this.f13368h == null && this.f13376p == 0 && this.f13370j.startsWith("video") && this.f13369i != null) {
                        this.f13368h.signalEndOfInputStream();
                    } else {
                        this.f13378r = true;
                    }
                    try {
                        this.f13374n.join();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    this.f13374n = null;
                    mediaCodec = this.f13368h;
                    if (mediaCodec == null) {
                        if (this.f13369i != null) {
                            this.f13369i = null;
                        }
                        this.f13370j = null;
                        this.f13355I = null;
                        this.f13356J = null;
                    } else {
                        if (this.f13354H) {
                            mediaCodec.stop();
                            this.f13354H = false;
                        }
                        this.f13368h.release();
                        this.f13368h = null;
                        this.f13358L = 0;
                        if (this.f13369i != null) {
                            this.f13369i = null;
                        }
                        this.f13370j = null;
                        this.f13355I = null;
                        this.f13356J = null;
                    }
                }
            } else if (this.f13374n == null) {
                mediaCodec = this.f13368h;
                if (mediaCodec == null) {
                    if (this.f13369i != null) {
                        this.f13369i = null;
                    }
                    this.f13370j = null;
                    this.f13355I = null;
                    this.f13356J = null;
                } else {
                    if (this.f13354H) {
                        mediaCodec.stop();
                        this.f13354H = false;
                    }
                    this.f13368h.release();
                    this.f13368h = null;
                    this.f13358L = 0;
                    if (this.f13369i != null) {
                        this.f13369i = null;
                    }
                    this.f13370j = null;
                    this.f13355I = null;
                    this.f13356J = null;
                }
            } else {
                if (this.f13368h == null) {
                    this.f13378r = true;
                } else {
                    this.f13378r = true;
                }
                this.f13374n.join();
                this.f13374n = null;
                mediaCodec = this.f13368h;
                if (mediaCodec == null) {
                    if (this.f13369i != null) {
                        this.f13369i = null;
                    }
                    this.f13370j = null;
                    this.f13355I = null;
                    this.f13356J = null;
                } else {
                    if (this.f13354H) {
                        mediaCodec.stop();
                        this.f13354H = false;
                    }
                    this.f13368h.release();
                    this.f13368h = null;
                    this.f13358L = 0;
                    if (this.f13369i != null) {
                        this.f13369i = null;
                    }
                    this.f13370j = null;
                    this.f13355I = null;
                    this.f13356J = null;
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m18821D(boolean z) {
        synchronized (this.f13383w) {
            try {
                if (this.f13385y) {
                    return;
                }
                if (this.f13382v.size() > 0) {
                    int iIntValue = this.f13382v.pollFirst().intValue();
                    try {
                        this.f13359M++;
                        this.f13368h.releaseOutputBuffer(iIntValue, z);
                    } catch (Exception unused) {
                        MDLog.m7391e("MedaiCodecWrapper", "onPrepareOneFrame error");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m18822E() {
        synchronized (this.f13349C) {
            this.f13385y = false;
            this.f13384x = false;
            this.f13347A = false;
            this.f13386z = false;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18823F(Surface surface) {
        synchronized (this.f13375o) {
            try {
                if (this.f13376p == 1) {
                    this.f13369i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m18824G(a aVar) {
        synchronized (this.f13375o) {
            this.f13380t = aVar;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m18825H(int i) {
        ByteBuffer byteBuffer = this.f13355I;
        if (byteBuffer != null) {
            if (i > byteBuffer.capacity()) {
                this.f13355I = ByteBuffer.allocate(i);
            }
        } else if (i > 0) {
            this.f13355I = ByteBuffer.allocate(i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m18826I(b bVar) {
        synchronized (this.f13375o) {
            this.f13379s = bVar;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m18827J(d dVar) {
        this.f13357K = dVar;
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: K */
    public void m18828K(Bundle bundle) {
        MediaCodec mediaCodec = this.f13368h;
        if (mediaCodec != null) {
            try {
                mediaCodec.setParameters(bundle);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m18829L(boolean z) {
        synchronized (this.f13375o) {
            try {
                if (this.f13374n == null) {
                    Thread thread = new Thread(new c(), this.f13351E + "_outdata" + zzf0.m221018b());
                    this.f13374n = thread;
                    thread.start();
                }
                this.f13348B = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m18830u(MediaFormat mediaFormat, int i) {
        synchronized (this.f13375o) {
            if (TextUtils.equals(mediaFormat.getString(IMediaFormat.KEY_MIME), "video/dolby-vision")) {
                return true;
            }
            if (i > 1 || i < 0) {
                kwv.m147653c("MedaiCodecWrapper", "Media format is null");
                return false;
            }
            try {
                this.f13376p = i;
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.f13370j = string;
                if (TextUtils.isEmpty(string)) {
                    kwv.m147653c("MedaiCodecWrapper", "Media codec name is null");
                    return false;
                }
                int i2 = this.f13376p;
                if (i2 == 0) {
                    MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.f13370j);
                    this.f13368h = mediaCodecCreateEncoderByType;
                    mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                    if (this.f13370j.startsWith("video") && mediaFormat.getInteger("color-format") == 2130708361) {
                        this.f13369i = this.f13368h.createInputSurface();
                    }
                } else if (i2 == 1) {
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.f13370j);
                    this.f13368h = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(mediaFormat, this.f13369i, (MediaCrypto) null, 0);
                }
                this.f13358L = 1;
                this.f13368h.start();
                this.f13358L = 2;
                this.f13354H = true;
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    this.f13368h.release();
                } catch (Exception unused) {
                }
                this.f13368h = null;
                kwv.m147653c("MedaiCodecWrapper", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m18831w() {
        synchronized (this.f13375o) {
            MediaCodec mediaCodec = this.f13368h;
            if (mediaCodec != null) {
                try {
                    mediaCodec.flush();
                    this.f13358L = 3;
                } catch (IllegalStateException e) {
                    MDLog.printErrStackTrace("MedaiCodecWrapper", e);
                }
                this.f13356J.size = 0;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public Surface m18832x() {
        synchronized (this.f13375o) {
            try {
                if (TextUtils.isEmpty(this.f13370j) || !this.f13370j.startsWith("video")) {
                    return null;
                }
                return this.f13369i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3851h(String str) {
        this.f13361a = 401;
        this.f13362b = 402;
        this.f13363c = "MedaiCodecWrapper";
        this.f13364d = "video";
        this.f13365e = "audio";
        this.f13366f = 10000L;
        this.f13367g = 200L;
        this.f13368h = null;
        this.f13369i = null;
        this.f13370j = null;
        this.f13371k = null;
        this.f13372l = null;
        this.f13373m = null;
        this.f13374n = null;
        this.f13375o = new Object();
        this.f13376p = -1;
        this.f13377q = false;
        this.f13378r = false;
        this.f13381u = new LinkedBlockingQueue<>();
        this.f13382v = new LinkedList<>();
        this.f13383w = new Object();
        this.f13384x = false;
        this.f13385y = false;
        this.f13386z = false;
        this.f13347A = false;
        this.f13348B = true;
        this.f13349C = new Object();
        this.f13350D = new Object();
        this.f13351E = null;
        this.f13352F = false;
        this.f13353G = false;
        this.f13354H = false;
        this.f13355I = ByteBuffer.allocate(1048576);
        this.f13356J = new MediaCodec.BufferInfo();
        this.f13358L = 0;
        this.f13359M = 0;
        this.f13360N = false;
        this.f13351E = str;
    }

    public C3851h() {
        this.f13361a = 401;
        this.f13362b = 402;
        this.f13363c = "MedaiCodecWrapper";
        this.f13364d = "video";
        this.f13365e = "audio";
        this.f13366f = 10000L;
        this.f13367g = 200L;
        this.f13368h = null;
        this.f13369i = null;
        this.f13370j = null;
        this.f13371k = null;
        this.f13372l = null;
        this.f13373m = null;
        this.f13374n = null;
        this.f13375o = new Object();
        this.f13376p = -1;
        this.f13377q = false;
        this.f13378r = false;
        this.f13381u = new LinkedBlockingQueue<>();
        this.f13382v = new LinkedList<>();
        this.f13383w = new Object();
        this.f13384x = false;
        this.f13385y = false;
        this.f13386z = false;
        this.f13347A = false;
        this.f13348B = true;
        this.f13349C = new Object();
        this.f13350D = new Object();
        this.f13351E = null;
        this.f13352F = false;
        this.f13353G = false;
        this.f13354H = false;
        this.f13355I = ByteBuffer.allocate(1048576);
        this.f13356J = new MediaCodec.BufferInfo();
        this.f13358L = 0;
        this.f13359M = 0;
        this.f13360N = false;
    }
}
