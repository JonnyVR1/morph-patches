package com.tencent.liteav.audio.impl.Record;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.audio.InterfaceC14148f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Vector;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.Record.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14152b extends Thread {

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f58844a;

    /* JADX INFO: renamed from: b */
    private MediaCodecInfo f58845b;

    /* JADX INFO: renamed from: c */
    private MediaFormat f58846c;

    /* JADX INFO: renamed from: d */
    private MediaCodec f58847d;

    /* JADX INFO: renamed from: e */
    private Vector<byte[]> f58848e;

    /* JADX INFO: renamed from: f */
    private WeakReference<InterfaceC14148f> f58849f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f58850g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f58851h;

    /* JADX INFO: renamed from: i */
    private final Object f58852i;

    /* JADX INFO: renamed from: j */
    private long f58853j;

    /* JADX INFO: renamed from: k */
    private int f58854k;

    /* JADX INFO: renamed from: l */
    private int f58855l;

    /* JADX INFO: renamed from: m */
    private int f58856m;

    /* JADX INFO: renamed from: n */
    private byte[] f58857n;

    static {
        C14215f.m84239f();
    }

    @TargetApi(16)
    public C14152b() {
        super("TXAudioRecordThread");
        this.f58850g = false;
        this.f58851h = false;
        this.f58852i = new Object();
        this.f58853j = 0L;
        this.f58854k = 48000;
        this.f58855l = 1;
        this.f58856m = 16;
    }

    /* JADX INFO: renamed from: a */
    private void m83864a(ByteBuffer byteBuffer, int i, long j) {
        int iDequeueOutputBuffer;
        if (this.f58851h) {
            return;
        }
        ByteBuffer[] inputBuffers = this.f58847d.getInputBuffers();
        int iDequeueInputBuffer = this.f58847d.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
            byteBuffer2.clear();
            if (byteBuffer != null) {
                byteBuffer2.put(byteBuffer);
            }
            if (i <= 0) {
                TXCLog.m84152i("AudioCenter:TXCAudioHWEncoder", "send BUFFER_FLAG_END_OF_STREAM");
                this.f58847d.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
            } else {
                this.f58847d.queueInputBuffer(iDequeueInputBuffer, 0, i, j, 0);
            }
        }
        ByteBuffer[] outputBuffers = this.f58847d.getOutputBuffers();
        do {
            iDequeueOutputBuffer = this.f58847d.dequeueOutputBuffer(this.f58844a, 10000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = this.f58847d.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    this.f58847d.getOutputFormat();
                } else if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer3 = outputBuffers[iDequeueOutputBuffer];
                    if ((this.f58844a.flags & 2) != 0) {
                        TXCLog.m84147d("AudioCenter:TXCAudioHWEncoder", "drain:BUFFER_FLAG_CODEC_CONFIG");
                        this.f58844a.size = 0;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f58844a;
                    if (bufferInfo.size != 0) {
                        bufferInfo.presentationTimeUs = m83870f();
                        byte[] bArr = new byte[byteBuffer3.limit()];
                        this.f58857n = bArr;
                        byteBuffer3.get(bArr);
                        m83866b(this.f58857n, this.f58844a.presentationTimeUs);
                        this.f58853j = this.f58844a.presentationTimeUs;
                    }
                    this.f58847d.releaseOutputBuffer(iDequeueOutputBuffer, false);
                }
            }
        } while (iDequeueOutputBuffer >= 0);
    }

    /* JADX INFO: renamed from: b */
    private void m83865b() {
        MediaCodecInfo mediaCodecInfoM83863a = m83863a("audio/mp4a-latm");
        this.f58845b = mediaCodecInfoM83863a;
        if (mediaCodecInfoM83863a == null) {
            TXCLog.m84149e("AudioCenter:TXCAudioHWEncoder", "Unable to find an appropriate codec for audio/mp4a-latm");
            return;
        }
        TXCLog.m84152i("AudioCenter:TXCAudioHWEncoder", "selected codec: " + this.f58845b.getName());
        int i = this.f58854k;
        int i2 = i >= 32000 ? 64000 : 32000;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, this.f58855l);
        this.f58846c = mediaFormatCreateAudioFormat;
        mediaFormatCreateAudioFormat.setInteger("bitrate", i2);
        this.f58846c.setInteger("channel-count", this.f58855l);
        this.f58846c.setInteger("sample-rate", this.f58854k);
        this.f58846c.setInteger("aac-profile", 2);
        TXCLog.m84152i("AudioCenter:TXCAudioHWEncoder", "format: " + this.f58846c);
        try {
            m83868d();
        } catch (Exception e) {
            TXCLog.m84150e("AudioCenter:TXCAudioHWEncoder", "start media codec failed.", e);
        }
        start();
    }

    /* JADX INFO: renamed from: c */
    private void m83867c() {
        this.f58851h = true;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: d */
    private void m83868d() throws IOException {
        if (this.f58847d != null) {
            return;
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f58847d = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(this.f58846c, (Surface) null, (MediaCrypto) null, 1);
        this.f58847d.start();
        TXCLog.m84152i("AudioCenter:TXCAudioHWEncoder", "prepare finishing");
        this.f58850g = true;
    }

    /* JADX INFO: renamed from: e */
    private void m83869e() {
        MediaCodec mediaCodec = this.f58847d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f58847d.release();
            this.f58847d = null;
        }
        this.f58850g = false;
    }

    /* JADX INFO: renamed from: f */
    private long m83870f() {
        long timeTick = TXCTimeUtil.getTimeTick();
        long j = this.f58853j;
        return timeTick < j ? (j - timeTick) + timeTick : timeTick;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean zIsEmpty;
        byte[] bArrRemove;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1024);
        while (!this.f58851h) {
            if (this.f58850g) {
                synchronized (this.f58848e) {
                    zIsEmpty = this.f58848e.isEmpty();
                }
                if (zIsEmpty) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.f58848e) {
                        bArrRemove = this.f58848e.remove(0);
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
                            m83864a(byteBufferAllocateDirect, bArrRemove.length, m83870f());
                        } catch (Exception e) {
                            TXCLog.m84150e("AudioCenter:TXCAudioHWEncoder", "encode frame failed.", e);
                        }
                    }
                }
            } else {
                synchronized (this.f58852i) {
                    try {
                        this.f58852i.wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            }
        }
        m83869e();
    }

    /* JADX INFO: renamed from: b */
    private void m83866b(byte[] bArr, long j) {
        InterfaceC14148f interfaceC14148f;
        WeakReference<InterfaceC14148f> weakReference = this.f58849f;
        if (weakReference == null || (interfaceC14148f = weakReference.get()) == null) {
            return;
        }
        interfaceC14148f.onRecordEncData(bArr, j, this.f58854k, this.f58855l, this.f58856m);
    }

    /* JADX INFO: renamed from: a */
    public void m83873a(byte[] bArr, long j) {
        Vector<byte[]> vector = this.f58848e;
        if (vector != null && bArr != null) {
            synchronized (vector) {
                try {
                    Vector<byte[]> vector2 = this.f58848e;
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
        synchronized (this.f58852i) {
            this.f58852i.notify();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83871a() {
        m83867c();
    }

    /* JADX INFO: renamed from: a */
    public void m83872a(int i, int i2, int i3, int i4, WeakReference<InterfaceC14148f> weakReference) {
        this.f58849f = weakReference;
        this.f58844a = new MediaCodec.BufferInfo();
        this.f58848e = new Vector<>();
        this.f58854k = i2;
        this.f58855l = i3;
        this.f58856m = i4;
        m83865b();
    }

    /* JADX INFO: renamed from: a */
    private static final MediaCodecInfo m83863a(String str) {
        TXCLog.m84154v("AudioCenter:TXCAudioHWEncoder", "selectAudioCodec:");
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    TXCLog.m84152i("AudioCenter:TXCAudioHWEncoder", "supportedType:" + codecInfoAt.getName() + ",MIME=" + supportedTypes[i2]);
                    if (supportedTypes[i2].equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }
}
