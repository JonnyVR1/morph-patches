package p149l;

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

/* JADX INFO: loaded from: classes6.dex */
public class gpx extends Thread {

    /* JADX INFO: renamed from: a */
    private MediaCodec.BufferInfo f103846a;

    /* JADX INFO: renamed from: b */
    private MediaCodec f103847b;

    /* JADX INFO: renamed from: c */
    private yt10 f103848c;

    /* JADX INFO: renamed from: d */
    private int f103849d;

    /* JADX INFO: renamed from: e */
    private boolean f103850e;

    /* JADX INFO: renamed from: f */
    private int f103851f;

    /* JADX INFO: renamed from: g */
    private long f103852g;

    /* JADX INFO: renamed from: h */
    private LinkedList<C17138a> f103853h;

    /* JADX INFO: renamed from: i */
    private long f103854i;

    /* JADX INFO: renamed from: j */
    private int f103855j;

    /* JADX INFO: renamed from: k */
    private boolean f103856k;

    /* JADX INFO: renamed from: l */
    private boolean f103857l;

    /* JADX INFO: renamed from: m */
    private int f103858m;

    /* JADX INFO: renamed from: l.gpx$a */
    public class C17138a {

        /* JADX INFO: renamed from: a */
        private ByteBuffer f103859a;

        /* JADX INFO: renamed from: b */
        private MediaCodec.BufferInfo f103860b;

        public C17138a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f103859a = null;
            this.f103860b = null;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo.size);
            this.f103859a = byteBufferAllocate;
            byteBuffer.get(byteBufferAllocate.array());
            this.f103859a.rewind();
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.f103860b = bufferInfo2;
            bufferInfo2.size = bufferInfo.size;
            bufferInfo2.offset = bufferInfo.offset;
            bufferInfo2.flags = bufferInfo.flags;
            bufferInfo2.presentationTimeUs = bufferInfo.presentationTimeUs;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m127497a() {
            return this.f103859a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m127498b() {
            return this.f103860b;
        }
    }

    public gpx(String str, MediaCodec mediaCodec, yt10 yt10Var, int i, int i2) throws InvalidParameterException {
        super(str);
        this.f103848c = null;
        this.f103849d = 1;
        this.f103850e = false;
        this.f103851f = 0;
        this.f103852g = 0L;
        this.f103853h = null;
        this.f103854i = 0L;
        this.f103855j = 0;
        this.f103856k = false;
        this.f103857l = false;
        this.f103858m = 0;
        this.f103846a = new MediaCodec.BufferInfo();
        if (mediaCodec == null || yt10Var == null || i > 2 || i < 1) {
            throw new InvalidParameterException("encoder parameter is null");
        }
        this.f103847b = mediaCodec;
        this.f103848c = yt10Var;
        this.f103849d = i;
        this.f103851f = i2;
        this.f103853h = new LinkedList<>();
    }

    /* JADX INFO: renamed from: a */
    private long m127495a() {
        long jNanoTime = System.nanoTime() / 1000;
        long j = this.f103852g;
        return jNanoTime < j ? (j - jNanoTime) + jNanoTime : jNanoTime;
    }

    /* JADX INFO: renamed from: b */
    public void m127496b() {
        this.f103850e = true;
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
        while (!Thread.interrupted() && !this.f103850e && this.f103847b != null) {
            Process.setThreadPriority(-19);
            try {
                int iDequeueOutputBuffer = this.f103847b.dequeueOutputBuffer(this.f103846a, 10000L);
                if (iDequeueOutputBuffer != -3) {
                    if (iDequeueOutputBuffer == -2) {
                        Log.e("Mp4MuxerWrapper", "INFO_OUTPUT_FORMAT_CHANGED " + this.f103851f + " start");
                        if (this.f103851f < 0) {
                            this.f103851f = this.f103848c.mo19765x0(this.f103847b.getOutputFormat(), this.f103849d);
                            Log.e("Mp4MuxerWrapper", "INFO_OUTPUT_FORMAT_CHANGED " + this.f103851f + " end");
                            this.f103848c.mo19756O1();
                        }
                    } else if (iDequeueOutputBuffer != -1) {
                        this.f103854i += System.currentTimeMillis() - jCurrentTimeMillis;
                        this.f103855j++;
                        jCurrentTimeMillis = System.currentTimeMillis();
                        MediaCodec.BufferInfo bufferInfo = this.f103846a;
                        if (bufferInfo.flags != 2 && bufferInfo.size != 0) {
                            bufferInfo.presentationTimeUs = m127495a();
                            this.f103852g = this.f103846a.presentationTimeUs;
                            ByteBuffer byteBuffer = this.f103847b.getOutputBuffers()[iDequeueOutputBuffer];
                            MediaCodec.BufferInfo bufferInfoM127498b = this.f103846a;
                            this.f103857l = true;
                            if (this.f103848c.isStarting()) {
                                if (this.f103853h.size() > 0) {
                                    this.f103853h.offerLast(new C17138a(byteBuffer, bufferInfoM127498b));
                                    C17138a c17138aPollFirst = this.f103853h.pollFirst();
                                    ByteBuffer byteBufferM127497a = c17138aPollFirst.m127497a();
                                    bufferInfoM127498b = c17138aPollFirst.m127498b();
                                    byteBuffer = byteBufferM127497a;
                                }
                                this.f103848c.mo19751B1(this.f103851f, byteBuffer, bufferInfoM127498b);
                            } else {
                                Log4Cam.m7321d("MediaMuxerThread", "media muxer is not starting ! cache data ! Muxer thrad name:" + getName());
                                this.f103853h.offerLast(new C17138a(byteBuffer, bufferInfoM127498b));
                            }
                        }
                        this.f103847b.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    } else if (this.f103848c.isStarting() && this.f103853h.size() > 0) {
                        C17138a c17138aPollFirst2 = this.f103853h.pollFirst();
                        this.f103848c.mo19751B1(this.f103851f, c17138aPollFirst2.m127497a(), c17138aPollFirst2.m127498b());
                    }
                }
            } catch (IllegalStateException unused) {
                int i = this.f103858m + 1;
                this.f103858m = i;
                if (i > 5 && !this.f103857l && !this.f103856k) {
                    eyx.m118802c().m118808g("MediaMuxerThread IllegalStateException");
                    k3f.m144382a(4097);
                    tv00.m190718a(20736, this.f103849d, 2, null);
                    eyx.m118802c().m118806e("encoder", "encoder_error", 1, "MediaMuxerThread IllegalStateException", LogLevel.ERROR.value());
                    this.f103856k = true;
                }
            } catch (Exception e) {
                Log.e("MediaMuxerThread", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX + di70.m111867d());
            }
        }
    }
}
