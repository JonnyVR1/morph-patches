package com.tencent.liteav.audio.impl.Record;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.audio.InterfaceC13985f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.Record.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13989b extends Thread {

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f57996a;

    /* JADX INFO: renamed from: b */
    private MediaCodecInfo f57997b;

    /* JADX INFO: renamed from: c */
    private MediaFormat f57998c;

    /* JADX INFO: renamed from: d */
    private MediaCodec f57999d;

    /* JADX INFO: renamed from: e */
    private Vector<byte[]> f58000e;

    /* JADX INFO: renamed from: f */
    private WeakReference<InterfaceC13985f> f58001f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f58002g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f58003h;

    /* JADX INFO: renamed from: i */
    private final Object f58004i;

    /* JADX INFO: renamed from: j */
    private long f58005j;

    /* JADX INFO: renamed from: k */
    private int f58006k;

    /* JADX INFO: renamed from: l */
    private int f58007l;

    /* JADX INFO: renamed from: m */
    private int f58008m;

    /* JADX INFO: renamed from: n */
    private byte[] f58009n;

    static {
        C14052f.m83056f();
    }

    @TargetApi(16)
    public C13989b() {
        super("TXAudioRecordThread");
        this.f58002g = false;
        this.f58003h = false;
        this.f58004i = new Object();
        this.f58005j = 0L;
        this.f58006k = 48000;
        this.f58007l = 1;
        this.f58008m = 16;
    }

    /* JADX INFO: renamed from: a */
    private void m82681a(ByteBuffer byteBuffer, int i, long j) {
        int iDequeueOutputBuffer;
        if (this.f58003h) {
            return;
        }
        ByteBuffer[] inputBuffers = this.f57999d.getInputBuffers();
        int iDequeueInputBuffer = this.f57999d.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
            byteBuffer2.clear();
            if (byteBuffer != null) {
                byteBuffer2.put(byteBuffer);
            }
            if (i <= 0) {
                TXCLog.m82969i("AudioCenter:TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
                this.f57999d.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
            } else {
                this.f57999d.queueInputBuffer(iDequeueInputBuffer, 0, i, j, 0);
            }
        }
        ByteBuffer[] outputBuffers = this.f57999d.getOutputBuffers();
        do {
            iDequeueOutputBuffer = this.f57999d.dequeueOutputBuffer(this.f57996a, 10000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = this.f57999d.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    this.f57999d.getOutputFormat();
                } else if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = outputBuffers[iDequeueOutputBuffer];
                    if ((this.f57996a.flags & 2) != 0) {
                        TXCLog.m82964d("AudioCenter:TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
                        this.f57996a.size = 0;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f57996a;
                    if (bufferInfo.size != 0) {
                        bufferInfo.presentationTimeUs = m82687f();
                        byte[] bArr = new byte[byteBuffer3.limit()];
                        this.f58009n = bArr;
                        byteBuffer3.get(bArr);
                        m82683b(this.f58009n, this.f57996a.presentationTimeUs);
                        this.f58005j = this.f57996a.presentationTimeUs;
                    }
                    this.f57999d.releaseOutputBuffer(iDequeueOutputBuffer, false);
                }
            }
        } while (iDequeueOutputBuffer >= 0);
    }

    /* JADX INFO: renamed from: b */
    private void m82682b() {
        MediaCodecInfo mediaCodecInfoM82680a = m82680a("audio/mp4a-latm");
        this.f57997b = mediaCodecInfoM82680a;
        if (mediaCodecInfoM82680a == null) {
            TXCLog.m82966e("AudioCenter:TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
            return;
        }
        TXCLog.m82969i("AudioCenter:TXCAudioHWEncoder", "selected codec: " + this.f57997b.getName());
        int i = this.f58006k;
        int i2 = i >= 32000 ? 64000 : 32000;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, this.f58007l);
        this.f57998c = mediaFormatCreateAudioFormat;
        mediaFormatCreateAudioFormat.setInteger("bitrate", i2);
        this.f57998c.setInteger("channel-count", this.f58007l);
        this.f57998c.setInteger("sample-rate", this.f58006k);
        this.f57998c.setInteger("aac-profile", 2);
        TXCLog.m82969i("AudioCenter:TXCAudioHWEncoder", "format: " + this.f57998c);
        try {
            m82685d();
        } catch (Exception e) {
            TXCLog.m82967e("AudioCenter:TXCAudioHWEncoder", "start media codec failed.", e);
        }
        start();
    }

    /* JADX INFO: renamed from: c */
    private void m82684c() {
        this.f58003h = true;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: d */
    private void m82685d() throws IOException {
        if (this.f57999d != null) {
            return;
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f57999d = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(this.f57998c, (Surface) null, (MediaCrypto) null, 1);
        this.f57999d.start();
        TXCLog.m82969i("AudioCenter:TXCAudioHWEncoder", "prepare finishing");
        this.f58002g = true;
    }

    /* JADX INFO: renamed from: e */
    private void m82686e() {
        MediaCodec mediaCodec = this.f57999d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f57999d.release();
            this.f57999d = null;
        }
        this.f58002g = false;
    }

    /* JADX INFO: renamed from: f */
    private long m82687f() {
        long timeTick = TXCTimeUtil.getTimeTick();
        long j = this.f58005j;
        return timeTick < j ? (j - timeTick) + timeTick : timeTick;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean zIsEmpty;
        byte[] bArrRemove;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1024);
        while (!this.f58003h) {
            if (this.f58002g) {
                synchronized (this.f58000e) {
                    zIsEmpty = this.f58000e.isEmpty();
                }
                if (zIsEmpty) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.f58000e) {
                        bArrRemove = this.f58000e.remove(0);
                    }
                    if (bArrRemove != null) {
                        try {
                            byteBufferAllocateDirect.clear();
                            if (bArrRemove.length > byteBufferAllocateDirect.capacity()) {
                                byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrRemove.length);
                            }
                            byteBufferAllocateDirect.clear();
                            byteBufferAllocateDirect.put(bArrRemove);
                            byteBufferAllocateDirect.flip();
                            m82681a(byteBufferAllocateDirect, bArrRemove.length, m82687f());
                        } catch (Exception e) {
                            TXCLog.m82967e("AudioCenter:TXCAudioHWEncoder", "encode frame failed.", e);
                        }
                    }
                }
            } else {
                synchronized (this.f58004i) {
                    try {
                        this.f58004i.wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        m82686e();
    }

    /* JADX INFO: renamed from: b */
    private void m82683b(byte[] bArr, long j) {
        InterfaceC13985f interfaceC13985f;
        WeakReference<InterfaceC13985f> weakReference = this.f58001f;
        if (weakReference == null || (interfaceC13985f = weakReference.get()) == null) {
            return;
        }
        interfaceC13985f.onRecordEncData(bArr, j, this.f58006k, this.f58007l, this.f58008m);
    }

    /* JADX INFO: renamed from: a */
    public void m82690a(byte[] bArr, long j) {
        Vector<byte[]> vector = this.f58000e;
        if (vector != null && bArr != null) {
            synchronized (vector) {
                try {
                    Vector<byte[]> vector2 = this.f58000e;
                    if (vector2 == null) {
                        return;
                    } else {
                        vector2.add(bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.f58004i) {
            this.f58004i.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82688a() {
        m82684c();
    }

    /* JADX INFO: renamed from: a */
    public void m82689a(int i, int i2, int i3, int i4, WeakReference<InterfaceC13985f> weakReference) {
        this.f58001f = weakReference;
        this.f57996a = new MediaCodec.BufferInfo();
        this.f58000e = new Vector<>();
        this.f58006k = i2;
        this.f58007l = i3;
        this.f58008m = i4;
        m82682b();
    }

    /* JADX INFO: renamed from: a */
    private static final MediaCodecInfo m82680a(String str) {
        TXCLog.m82971v("AudioCenter:TXCAudioHWEncoder", "selectAudioCodec:");
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    TXCLog.m82969i("AudioCenter:TXCAudioHWEncoder", "supportedType:" + codecInfoAt.getName() + ",MIME=" + supportedTypes[i2]);
                    if (supportedTypes[i2].equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }
}
