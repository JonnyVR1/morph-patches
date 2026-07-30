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
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.ad60;
import p153l.g8g0;
import p153l.lyv;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.h */
/* JADX INFO: loaded from: classes7.dex */
public class C3994h {

    /* JADX INFO: renamed from: A */
    private boolean f14041A;

    /* JADX INFO: renamed from: B */
    private boolean f14042B;

    /* JADX INFO: renamed from: C */
    private Object f14043C;

    /* JADX INFO: renamed from: D */
    private Object f14044D;

    /* JADX INFO: renamed from: E */
    private String f14045E;

    /* JADX INFO: renamed from: F */
    private boolean f14046F;

    /* JADX INFO: renamed from: G */
    private boolean f14047G;

    /* JADX INFO: renamed from: H */
    private boolean f14048H;

    /* JADX INFO: renamed from: I */
    private ByteBuffer f14049I;

    /* JADX INFO: renamed from: J */
    private MediaCodec.BufferInfo f14050J;

    /* JADX INFO: renamed from: K */
    private d f14051K;

    /* JADX INFO: renamed from: L */
    private int f14052L;

    /* JADX INFO: renamed from: M */
    int f14053M;

    /* JADX INFO: renamed from: N */
    boolean f14054N;

    /* JADX INFO: renamed from: a */
    private final int f14055a;

    /* JADX INFO: renamed from: b */
    private final int f14056b;

    /* JADX INFO: renamed from: c */
    private final String f14057c;

    /* JADX INFO: renamed from: d */
    private final String f14058d;

    /* JADX INFO: renamed from: e */
    private final String f14059e;

    /* JADX INFO: renamed from: f */
    private final long f14060f;

    /* JADX INFO: renamed from: g */
    private final long f14061g;

    /* JADX INFO: renamed from: h */
    private MediaCodec f14062h;

    /* JADX INFO: renamed from: i */
    private Surface f14063i;

    /* JADX INFO: renamed from: j */
    private String f14064j;

    /* JADX INFO: renamed from: k */
    private ByteBuffer[] f14065k;

    /* JADX INFO: renamed from: l */
    private ByteBuffer[] f14066l;

    /* JADX INFO: renamed from: m */
    private Thread f14067m;

    /* JADX INFO: renamed from: n */
    private Thread f14068n;

    /* JADX INFO: renamed from: o */
    private Object f14069o;

    /* JADX INFO: renamed from: p */
    private int f14070p;

    /* JADX INFO: renamed from: q */
    private boolean f14071q;

    /* JADX INFO: renamed from: r */
    private boolean f14072r;

    /* JADX INFO: renamed from: s */
    private b f14073s;

    /* JADX INFO: renamed from: t */
    private a f14074t;

    /* JADX INFO: renamed from: u */
    private LinkedBlockingQueue<ad60> f14075u;

    /* JADX INFO: renamed from: v */
    private LinkedList<Integer> f14076v;

    /* JADX INFO: renamed from: w */
    private Object f14077w;

    /* JADX INFO: renamed from: x */
    private boolean f14078x;

    /* JADX INFO: renamed from: y */
    private boolean f14079y;

    /* JADX INFO: renamed from: z */
    private boolean f14080z;

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
        private MediaCodec.BufferInfo f14081a = new MediaCodec.BufferInfo();

        /* JADX INFO: renamed from: b */
        boolean f14082b = false;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        private boolean m19813a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
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
            while (!C3994h.this.f14072r && !Thread.interrupted()) {
                synchronized (C3994h.this.f14044D) {
                    if (C3994h.this.f14079y) {
                        C3994h.this.f14041A = true;
                        C3994h.this.f14044D.notifyAll();
                        try {
                            Thread.sleep(1L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        C3994h.this.m19795v();
                        try {
                            this.f14081a.flags = 0;
                            boolean zStartsWith = C3994h.this.f14064j.startsWith("audio");
                            C3994h c3994h = C3994h.this;
                            int iDequeueOutputBuffer = zStartsWith ? c3994h.f14062h.dequeueOutputBuffer(this.f14081a, 200L) : c3994h.f14062h.dequeueOutputBuffer(this.f14081a, 10000L);
                            if (iDequeueOutputBuffer == -3) {
                                continue;
                            } else if (iDequeueOutputBuffer != -2) {
                                C3994h c3994h2 = C3994h.this;
                                if (iDequeueOutputBuffer != -1) {
                                    if (c3994h2.f14066l == null) {
                                        C3994h c3994h3 = C3994h.this;
                                        c3994h3.f14066l = c3994h3.f14062h.getOutputBuffers();
                                    }
                                    int i = C3994h.this.f14070p;
                                    C3994h c3994h4 = C3994h.this;
                                    if (i == 1) {
                                        if (c3994h4.f14063i == null) {
                                            if (C3994h.this.f14073s != null) {
                                                C3994h.this.f14073s.onDataOutput(C3994h.this.f14066l[iDequeueOutputBuffer], this.f14081a);
                                            }
                                            C3994h.this.f14062h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            if (C3994h.this.f14064j.startsWith("audio")) {
                                                C3994h.this.f14066l[iDequeueOutputBuffer].clear();
                                            }
                                        } else {
                                            int i2 = this.f14081a.size;
                                            C3994h c3994h5 = C3994h.this;
                                            if (i2 > 0) {
                                                boolean zOnStartRendingImageToTexture = c3994h5.f14074t != null ? C3994h.this.f14074t.onStartRendingImageToTexture(this.f14081a) : true;
                                                C3994h c3994h6 = C3994h.this;
                                                if (zOnStartRendingImageToTexture) {
                                                    synchronized (c3994h6.f14077w) {
                                                        try {
                                                            C3994h.this.f14076v.offer(Integer.valueOf(iDequeueOutputBuffer));
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    c3994h6.f14062h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                                }
                                            } else {
                                                c3994h5.f14062h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                            }
                                        }
                                    } else if (c3994h4.f14070p == 0) {
                                        MediaCodec.BufferInfo bufferInfo = this.f14081a;
                                        if (bufferInfo.flags != 2 && bufferInfo.size != 0 && C3994h.this.f14073s != null) {
                                            C3994h.this.f14073s.onDataOutput(C3994h.this.f14066l[iDequeueOutputBuffer], this.f14081a);
                                        }
                                        C3994h.this.f14062h.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    }
                                    if ((this.f14081a.flags & 4) != 0) {
                                        MDLog.m7445e("MedaiCodecWrapper", "Codec End : " + (C3994h.this.f14070p == 1 ? "decoder " : "encoder") + " ---- " + (C3994h.this.f14064j.startsWith("video") ? "video" : "audio"));
                                        if (C3994h.this.f14051K != null) {
                                            C3994h.this.f14051K.onComplete();
                                        }
                                        if (C3994h.this.f14070p == 0 && C3994h.this.f14064j.startsWith("video") && C3994h.this.f14063i != null) {
                                            C3994h.this.f14072r = true;
                                        } else {
                                            boolean unused = C3994h.this.f14046F;
                                        }
                                    }
                                } else if (c3994h2.f14073s != null) {
                                    C3994h.this.f14073s.onCodecIdle();
                                }
                            } else {
                                MediaFormat outputFormat = C3994h.this.f14062h.getOutputFormat();
                                if (mediaFormat == null || m19813a(mediaFormat, outputFormat)) {
                                    if (C3994h.this.f14073s != null) {
                                        C3994h.this.f14073s.onFormatChanged(outputFormat);
                                    }
                                    mediaFormat = outputFormat;
                                }
                            }
                        } catch (Exception e2) {
                            MDLog.m7445e("MedaiCodecWrapper", "Codec Exception !!!!!!!!!!!!!!!!! " + e2.toString());
                            if (C3994h.this.f14073s != null) {
                                int i3 = C3994h.this.f14070p;
                                C3994h c3994h7 = C3994h.this;
                                if (i3 == 1) {
                                    c3994h7.f14073s.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, g8g0.m129406a(e2) + " codecStatus" + C3994h.this.f14052L);
                                } else {
                                    c3994h7.f14073s.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, g8g0.m129406a(e2) + " codecStatus" + C3994h.this.f14052L);
                                }
                            }
                            this.f14082b = true;
                        }
                    }
                }
            }
            C3994h.this.f14072r = true;
            if (C3994h.this.f14073s == null || this.f14082b || C3994h.this.f14047G) {
                return;
            }
            C3994h.this.f14073s.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.h$d */
    public interface d {
        void onComplete();
    }

    public C3994h(int i, String str) {
        this.f14055a = 401;
        this.f14056b = 402;
        this.f14057c = "MedaiCodecWrapper";
        this.f14058d = "video";
        this.f14059e = "audio";
        this.f14060f = 10000L;
        this.f14061g = 200L;
        this.f14062h = null;
        this.f14063i = null;
        this.f14064j = null;
        this.f14065k = null;
        this.f14066l = null;
        this.f14067m = null;
        this.f14068n = null;
        this.f14069o = new Object();
        this.f14070p = -1;
        this.f14071q = false;
        this.f14072r = false;
        this.f14075u = new LinkedBlockingQueue<>();
        this.f14076v = new LinkedList<>();
        this.f14077w = new Object();
        this.f14078x = false;
        this.f14079y = false;
        this.f14080z = false;
        this.f14041A = false;
        this.f14042B = true;
        this.f14043C = new Object();
        this.f14044D = new Object();
        this.f14045E = null;
        this.f14046F = false;
        this.f14047G = false;
        this.f14048H = false;
        this.f14049I = ByteBuffer.allocate(1048576);
        this.f14050J = new MediaCodec.BufferInfo();
        this.f14052L = 0;
        this.f14053M = 0;
        this.f14054N = false;
        this.f14070p = i;
        this.f14045E = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public boolean m19795v() {
        if (!this.f14042B) {
            return true;
        }
        try {
            if (this.f14065k == null) {
                ByteBuffer[] inputBuffers = this.f14062h.getInputBuffers();
                this.f14065k = inputBuffers;
                if (inputBuffers.length == 0) {
                    return false;
                }
                if (this.f14049I.capacity() > this.f14065k[0].capacity()) {
                    this.f14049I = ByteBuffer.allocate(this.f14065k[0].capacity());
                }
            }
            if (!this.f14054N) {
                if (this.f14073s == null) {
                    return false;
                }
                if (this.f14050J.size == 0) {
                    this.f14049I.position(0);
                    if (!this.f14073s.onFeedingData(this.f14049I, this.f14050J)) {
                        return false;
                    }
                    if (this.f14050J.size == 0) {
                        this.f14054N = true;
                    }
                }
            }
            int iDequeueInputBuffer = this.f14062h.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            int i = this.f14050J.size;
            if (i > 0) {
                this.f14065k[iDequeueInputBuffer].position(0);
                this.f14065k[iDequeueInputBuffer].put(this.f14049I.array(), 0, this.f14050J.size);
                MediaCodec mediaCodec = this.f14062h;
                MediaCodec.BufferInfo bufferInfo = this.f14050J;
                mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, bufferInfo.size, bufferInfo.presentationTimeUs, 0);
            } else {
                MediaCodec mediaCodec2 = this.f14062h;
                if (i == 0) {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.f14054N = false;
                    this.f14052L = 4;
                } else {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.f14046F = true;
                    this.f14052L = 4;
                }
            }
            this.f14050J.size = 0;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            b bVar = this.f14073s;
            if (bVar != null) {
                if (this.f14070p == 1) {
                    bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, g8g0.m129406a(e) + " codecStatus" + this.f14052L);
                } else {
                    bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, g8g0.m129406a(e) + " codecStatus" + this.f14052L);
                }
            }
            return false;
        }
    }

    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: y */
    public static int m19796y(String str) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                            lyv.m156389c("codec", supportedTypes[i2]);
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
    public static boolean m19797z(String str, int i) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (int i3 = 0; i3 < supportedTypes.length; i3++) {
                        lyv.m156389c("codec", supportedTypes[i3]);
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
    public void m19798A() {
        if (this.f14067m != null && !this.f14080z) {
            synchronized (this.f14043C) {
                this.f14078x = true;
            }
            while (!this.f14080z && !this.f14071q) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.f14068n == null || this.f14041A) {
            return;
        }
        synchronized (this.f14044D) {
            this.f14079y = true;
        }
        while (!this.f14041A && !this.f14072r) {
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m19799B() {
        synchronized (this.f14077w) {
            synchronized (this.f14077w) {
                MDLog.m7445e("MedaiCodecWrapper", "release all framebuffer");
                while (this.f14076v.size() > 0) {
                    try {
                        this.f14062h.releaseOutputBuffer(this.f14076v.pollFirst().intValue(), false);
                    } catch (Exception unused) {
                        lyv.m156388b("releaseAllCachedFrames error");
                        this.f14076v.clear();
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
    public void m19800C() {
        MediaCodec mediaCodec;
        synchronized (this.f14069o) {
            this.f14047G = true;
            Thread thread = this.f14067m;
            if (thread != null) {
                this.f14071q = true;
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f14067m = null;
                if (this.f14068n == null) {
                    try {
                        mediaCodec = this.f14062h;
                        if (mediaCodec == null) {
                            if (this.f14063i != null) {
                                this.f14063i = null;
                            }
                            this.f14064j = null;
                            this.f14049I = null;
                            this.f14050J = null;
                        } else {
                            if (this.f14048H) {
                                mediaCodec.stop();
                                this.f14048H = false;
                            }
                            this.f14062h.release();
                            this.f14062h = null;
                            this.f14052L = 0;
                            if (this.f14063i != null) {
                                this.f14063i = null;
                            }
                            this.f14064j = null;
                            this.f14049I = null;
                            this.f14050J = null;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        b bVar = this.f14073s;
                        if (bVar != null) {
                            if (this.f14070p == 1) {
                                bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_ILLEGAL_ARGUMENTS, 0, g8g0.m129406a(e2) + " codecStatus" + this.f14052L);
                            } else {
                                bVar.onError(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, g8g0.m129406a(e2) + " codecStatus" + this.f14052L);
                            }
                        }
                    }
                } else {
                    if (this.f14062h == null && this.f14070p == 0 && this.f14064j.startsWith("video") && this.f14063i != null) {
                        this.f14062h.signalEndOfInputStream();
                    } else {
                        this.f14072r = true;
                    }
                    try {
                        this.f14068n.join();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    this.f14068n = null;
                    mediaCodec = this.f14062h;
                    if (mediaCodec == null) {
                        if (this.f14063i != null) {
                            this.f14063i = null;
                        }
                        this.f14064j = null;
                        this.f14049I = null;
                        this.f14050J = null;
                    } else {
                        if (this.f14048H) {
                            mediaCodec.stop();
                            this.f14048H = false;
                        }
                        this.f14062h.release();
                        this.f14062h = null;
                        this.f14052L = 0;
                        if (this.f14063i != null) {
                            this.f14063i = null;
                        }
                        this.f14064j = null;
                        this.f14049I = null;
                        this.f14050J = null;
                    }
                }
            } else if (this.f14068n == null) {
                mediaCodec = this.f14062h;
                if (mediaCodec == null) {
                    if (this.f14063i != null) {
                        this.f14063i = null;
                    }
                    this.f14064j = null;
                    this.f14049I = null;
                    this.f14050J = null;
                } else {
                    if (this.f14048H) {
                        mediaCodec.stop();
                        this.f14048H = false;
                    }
                    this.f14062h.release();
                    this.f14062h = null;
                    this.f14052L = 0;
                    if (this.f14063i != null) {
                        this.f14063i = null;
                    }
                    this.f14064j = null;
                    this.f14049I = null;
                    this.f14050J = null;
                }
            } else {
                if (this.f14062h == null) {
                    this.f14072r = true;
                } else {
                    this.f14072r = true;
                }
                this.f14068n.join();
                this.f14068n = null;
                mediaCodec = this.f14062h;
                if (mediaCodec == null) {
                    if (this.f14063i != null) {
                        this.f14063i = null;
                    }
                    this.f14064j = null;
                    this.f14049I = null;
                    this.f14050J = null;
                } else {
                    if (this.f14048H) {
                        mediaCodec.stop();
                        this.f14048H = false;
                    }
                    this.f14062h.release();
                    this.f14062h = null;
                    this.f14052L = 0;
                    if (this.f14063i != null) {
                        this.f14063i = null;
                    }
                    this.f14064j = null;
                    this.f14049I = null;
                    this.f14050J = null;
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m19801D(boolean z) {
        synchronized (this.f14077w) {
            try {
                if (this.f14079y) {
                    return;
                }
                if (this.f14076v.size() > 0) {
                    int iIntValue = this.f14076v.pollFirst().intValue();
                    try {
                        this.f14053M++;
                        this.f14062h.releaseOutputBuffer(iIntValue, z);
                    } catch (Exception unused) {
                        MDLog.m7445e("MedaiCodecWrapper", "onPrepareOneFrame error");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m19802E() {
        synchronized (this.f14043C) {
            this.f14079y = false;
            this.f14078x = false;
            this.f14041A = false;
            this.f14080z = false;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m19803F(Surface surface) {
        synchronized (this.f14069o) {
            try {
                if (this.f14070p == 1) {
                    this.f14063i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m19804G(a aVar) {
        synchronized (this.f14069o) {
            this.f14074t = aVar;
        }
    }

    /* JADX INFO: renamed from: H */
    public void m19805H(int i) {
        ByteBuffer byteBuffer = this.f14049I;
        if (byteBuffer != null) {
            if (i > byteBuffer.capacity()) {
                this.f14049I = ByteBuffer.allocate(i);
            }
        } else if (i > 0) {
            this.f14049I = ByteBuffer.allocate(i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m19806I(b bVar) {
        synchronized (this.f14069o) {
            this.f14073s = bVar;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m19807J(d dVar) {
        this.f14051K = dVar;
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: K */
    public void m19808K(Bundle bundle) {
        MediaCodec mediaCodec = this.f14062h;
        if (mediaCodec != null) {
            try {
                mediaCodec.setParameters(bundle);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m19809L(boolean z) {
        synchronized (this.f14069o) {
            try {
                if (this.f14068n == null) {
                    Thread thread = new Thread(new c(), this.f14045E + "_outdata" + g8g0.m129407b());
                    this.f14068n = thread;
                    thread.start();
                }
                this.f14042B = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m19810u(MediaFormat mediaFormat, int i) {
        synchronized (this.f14069o) {
            if (TextUtils.equals(mediaFormat.getString(IMediaFormat.KEY_MIME), "video/dolby-vision")) {
                return true;
            }
            if (i > 1 || i < 0) {
                lyv.m156389c("MedaiCodecWrapper", "Media format is null");
                return false;
            }
            try {
                this.f14070p = i;
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.f14064j = string;
                if (TextUtils.isEmpty(string)) {
                    lyv.m156389c("MedaiCodecWrapper", "Media codec name is null");
                    return false;
                }
                int i2 = this.f14070p;
                if (i2 == 0) {
                    MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.f14064j);
                    this.f14062h = mediaCodecCreateEncoderByType;
                    mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                    if (this.f14064j.startsWith("video") && mediaFormat.getInteger("color-format") == 2130708361) {
                        this.f14063i = this.f14062h.createInputSurface();
                    }
                } else if (i2 == 1) {
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.f14064j);
                    this.f14062h = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(mediaFormat, this.f14063i, (MediaCrypto) null, 0);
                }
                this.f14052L = 1;
                this.f14062h.start();
                this.f14052L = 2;
                this.f14048H = true;
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    this.f14062h.release();
                } catch (Exception unused) {
                }
                this.f14062h = null;
                lyv.m156389c("MedaiCodecWrapper", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m19811w() {
        synchronized (this.f14069o) {
            MediaCodec mediaCodec = this.f14062h;
            if (mediaCodec != null) {
                try {
                    mediaCodec.flush();
                    this.f14052L = 3;
                } catch (IllegalStateException e) {
                    MDLog.printErrStackTrace("MedaiCodecWrapper", e);
                }
                this.f14050J.size = 0;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public Surface m19812x() {
        synchronized (this.f14069o) {
            try {
                if (TextUtils.isEmpty(this.f14064j) || !this.f14064j.startsWith("video")) {
                    return null;
                }
                return this.f14063i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3994h(String str) {
        this.f14055a = 401;
        this.f14056b = 402;
        this.f14057c = "MedaiCodecWrapper";
        this.f14058d = "video";
        this.f14059e = "audio";
        this.f14060f = 10000L;
        this.f14061g = 200L;
        this.f14062h = null;
        this.f14063i = null;
        this.f14064j = null;
        this.f14065k = null;
        this.f14066l = null;
        this.f14067m = null;
        this.f14068n = null;
        this.f14069o = new Object();
        this.f14070p = -1;
        this.f14071q = false;
        this.f14072r = false;
        this.f14075u = new LinkedBlockingQueue<>();
        this.f14076v = new LinkedList<>();
        this.f14077w = new Object();
        this.f14078x = false;
        this.f14079y = false;
        this.f14080z = false;
        this.f14041A = false;
        this.f14042B = true;
        this.f14043C = new Object();
        this.f14044D = new Object();
        this.f14045E = null;
        this.f14046F = false;
        this.f14047G = false;
        this.f14048H = false;
        this.f14049I = ByteBuffer.allocate(1048576);
        this.f14050J = new MediaCodec.BufferInfo();
        this.f14052L = 0;
        this.f14053M = 0;
        this.f14054N = false;
        this.f14045E = str;
    }

    public C3994h() {
        this.f14055a = 401;
        this.f14056b = 402;
        this.f14057c = "MedaiCodecWrapper";
        this.f14058d = "video";
        this.f14059e = "audio";
        this.f14060f = 10000L;
        this.f14061g = 200L;
        this.f14062h = null;
        this.f14063i = null;
        this.f14064j = null;
        this.f14065k = null;
        this.f14066l = null;
        this.f14067m = null;
        this.f14068n = null;
        this.f14069o = new Object();
        this.f14070p = -1;
        this.f14071q = false;
        this.f14072r = false;
        this.f14075u = new LinkedBlockingQueue<>();
        this.f14076v = new LinkedList<>();
        this.f14077w = new Object();
        this.f14078x = false;
        this.f14079y = false;
        this.f14080z = false;
        this.f14041A = false;
        this.f14042B = true;
        this.f14043C = new Object();
        this.f14044D = new Object();
        this.f14045E = null;
        this.f14046F = false;
        this.f14047G = false;
        this.f14048H = false;
        this.f14049I = ByteBuffer.allocate(1048576);
        this.f14050J = new MediaCodec.BufferInfo();
        this.f14052L = 0;
        this.f14053M = 0;
        this.f14054N = false;
    }
}
