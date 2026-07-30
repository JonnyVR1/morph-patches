package p153l;

import android.media.MediaCodec;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.Log4Cam;
import com.immomo.medialog.LogLevel;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes8.dex */
public class dyx extends Thread {

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f91291a;

    /* JADX INFO: renamed from: b */
    private MediaCodec f91292b;

    /* JADX INFO: renamed from: c */
    private g220 f91293c;

    /* JADX INFO: renamed from: d */
    private int f91294d;

    /* JADX INFO: renamed from: e */
    private boolean f91295e;

    /* JADX INFO: renamed from: f */
    private int f91296f;

    /* JADX INFO: renamed from: g */
    private long f91297g;

    /* JADX INFO: renamed from: h */
    private LinkedList<C16668a> f91298h;

    /* JADX INFO: renamed from: i */
    private long f91299i;

    /* JADX INFO: renamed from: j */
    private int f91300j;

    /* JADX INFO: renamed from: k */
    private boolean f91301k;

    /* JADX INFO: renamed from: l */
    private boolean f91302l;

    /* JADX INFO: renamed from: m */
    private int f91303m;

    /* JADX INFO: renamed from: l.dyx$a */
    public class C16668a {

        /* JADX INFO: renamed from: a */
        private ByteBuffer f91304a;

        /* JADX INFO: renamed from: b */
        private MediaCodec.BufferInfo f91305b;

        public C16668a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f91304a = null;
            this.f91305b = null;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo.size);
            this.f91304a = byteBufferAllocate;
            byteBuffer.get(byteBufferAllocate.array());
            this.f91304a.rewind();
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.f91305b = bufferInfo2;
            bufferInfo2.size = bufferInfo.size;
            bufferInfo2.offset = bufferInfo.offset;
            bufferInfo2.flags = bufferInfo.flags;
            bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m118728a() {
            return this.f91304a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m118729b() {
            return this.f91305b;
        }
    }

    public dyx(String str, MediaCodec mediaCodec, g220 g220Var, int i, int i2) throws InvalidParameterException {
        super(str);
        this.f91293c = null;
        this.f91294d = 1;
        this.f91295e = false;
        this.f91296f = 0;
        this.f91297g = 0L;
        this.f91298h = null;
        this.f91299i = 0L;
        this.f91300j = 0;
        this.f91301k = false;
        this.f91302l = false;
        this.f91303m = 0;
        this.f91291a = new MediaCodec.BufferInfo();
        if (mediaCodec == null || g220Var == null || i > 2 || i < 1) {
            throw new InvalidParameterException("encoder parameter is null");
        }
        this.f91292b = mediaCodec;
        this.f91293c = g220Var;
        this.f91294d = i;
        this.f91296f = i2;
        this.f91298h = new LinkedList<>();
    }

    /* JADX INFO: renamed from: a */
    private long m118726a() {
        long jNanoTime = System.nanoTime() / 1000;
        long j = this.f91297g;
        return jNanoTime < j ? (j - jNanoTime) + jNanoTime : jNanoTime;
    }

    /* JADX INFO: renamed from: b */
    public void m118727b() {
        this.f91295e = true;
        try {
            join(3000L);
        } catch (Exception e) {
            interrupt();
            e.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @RequiresApi(api = 16)
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!Thread.interrupted() && !this.f91295e && this.f91292b != null) {
            Process.setThreadPriority(-19);
            try {
                int iDequeueOutputBuffer = this.f91292b.dequeueOutputBuffer(this.f91291a, 10000L);
                if (iDequeueOutputBuffer != -3) {
                    if (iDequeueOutputBuffer == -2) {
                        Log.e("Mp4MuxerWrapper", "INFO_OUTPUT_FORMAT_CHANGED " + this.f91296f + " start");
                        if (this.f91296f < 0) {
                            this.f91296f = this.f91293c.mo20764x0(this.f91292b.getOutputFormat(), this.f91294d);
                            Log.e("Mp4MuxerWrapper", "INFO_OUTPUT_FORMAT_CHANGED " + this.f91296f + " end");
                            this.f91293c.mo20755O1();
                        }
                    } else if (iDequeueOutputBuffer != -1) {
                        this.f91299i += System.currentTimeMillis() - jCurrentTimeMillis;
                        this.f91300j++;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        MediaCodec.BufferInfo bufferInfo = this.f91291a;
                        if (bufferInfo.flags != 2 && bufferInfo.size != 0) {
                            bufferInfo.presentationTimeUs = m118726a();
                            this.f91297g = this.f91291a.presentationTimeUs;
                            ByteBuffer byteBuffer = this.f91292b.getOutputBuffers()[iDequeueOutputBuffer];
                            MediaCodec.BufferInfo bufferInfoM118729b = this.f91291a;
                            this.f91302l = true;
                            if (this.f91293c.isStarting()) {
                                if (this.f91298h.size() > 0) {
                                    this.f91298h.offerLast(new C16668a(byteBuffer, bufferInfoM118729b));
                                    C16668a c16668aPollFirst = this.f91298h.pollFirst();
                                    ByteBuffer byteBufferM118728a = c16668aPollFirst.m118728a();
                                    bufferInfoM118729b = c16668aPollFirst.m118729b();
                                    byteBuffer = byteBufferM118728a;
                                }
                                this.f91293c.mo20750B1(this.f91296f, byteBuffer, bufferInfoM118729b);
                            } else {
                                Log4Cam.m7375d("MediaMuxerThread", "media muxer is not starting ! cache data ! Muxer thrad name:" + getName());
                                this.f91298h.offerLast(new C16668a(byteBuffer, bufferInfoM118729b));
                            }
                        }
                        this.f91292b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } else if (this.f91293c.isStarting() && this.f91298h.size() > 0) {
                        C16668a c16668aPollFirst2 = this.f91298h.pollFirst();
                        this.f91293c.mo20750B1(this.f91296f, c16668aPollFirst2.m118728a(), c16668aPollFirst2.m118729b());
                    }
                }
            } catch (IllegalStateException unused) {
                int i = this.f91303m + 1;
                this.f91303m = i;
                if (i > 5 && !this.f91302l && !this.f91301k) {
                    b7y.m102882c().m102888g("MediaMuxerThread IllegalStateException");
                    p4f.m170561a(4097);
                    b410.m102397a(20736, this.f91294d, 2, null);
                    b7y.m102882c().m102886e("encoder", "encoder_error", 1, "MediaMuxerThread IllegalStateException", LogLevel.ERROR.value());
                    this.f91301k = true;
                }
            } catch (Exception e) {
                Log.e("MediaMuxerThread", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX + jq70.m146558d());
            }
        }
    }
}
