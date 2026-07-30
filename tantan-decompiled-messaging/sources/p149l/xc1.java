package p149l;

import com.immomo.moment.mediautils.AudioResampleUtils;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class xc1 extends ub1 {

    /* JADX INFO: renamed from: d */
    AudioResampleUtils f192170d;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f192173g;

    /* JADX INFO: renamed from: h */
    private List<TimeRangeScale> f192174h;

    /* JADX INFO: renamed from: e */
    private String f192171e = "AudioScaleProcessor";

    /* JADX INFO: renamed from: f */
    private float f192172f = 1.0f;

    /* JADX INFO: renamed from: i */
    private int f192175i = 0;

    /* JADX INFO: renamed from: j */
    private int f192176j = 0;

    /* JADX INFO: renamed from: k */
    private Object f192177k = new Object();

    @Override // p149l.ub1
    /* JADX INFO: renamed from: a */
    public boolean mo192813a() {
        synchronized (this.f192177k) {
            try {
                if (this.f192170d == null) {
                    AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                    this.f192170d = audioResampleUtils;
                    audioResampleUtils.initScaleInfo(this.f175667a, this.f175669c, this.f175668b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: b */
    public u460 mo130258b(u460 u460Var, int i, long j) {
        synchronized (this.f192177k) {
            try {
                float speed = this.f192172f;
                if (this.f192174h == null && speed == 1.0f) {
                    return u460Var;
                }
                int i2 = 0;
                while (true) {
                    List<TimeRangeScale> list = this.f192174h;
                    if (list != null && list.size() > 0 && i2 < this.f192174h.size()) {
                        TimeRangeScale timeRangeScale = this.f192174h.get(i2);
                        if (j >= timeRangeScale.getStart() * 1000 && j <= timeRangeScale.getEnd() * 1000) {
                            speed = 1.0f / timeRangeScale.getSpeed();
                            break;
                        }
                        timeRangeScale.getEnd();
                        i2++;
                    } else {
                        break;
                    }
                }
                ByteBuffer byteBufferM191672a = u460Var.m191672a();
                if (speed == 1.0d) {
                    byteBufferM191672a.position(0);
                    int i3 = u460Var.m191673b().size;
                    int i4 = this.f192175i;
                    long j2 = (long) (((i4 * 1.0f) / this.f175667a) * 1000000.0f);
                    this.f192175i = i4 + (i3 / this.f192176j);
                    u460Var.m191675d(i3, 0, 0, j2, 0);
                    return u460Var;
                }
                ByteBuffer byteBuffer = this.f192173g;
                if (byteBuffer == null || i * 8 > byteBuffer.capacity()) {
                    this.f192173g = ByteBuffer.allocate(i * 8);
                }
                int iScalePcmData = this.f192170d.scalePcmData(byteBufferM191672a, i, speed, this.f192173g);
                if (iScalePcmData <= 0) {
                    return null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iScalePcmData);
                this.f192173g.get(byteBufferAllocate.array());
                this.f192173g.position(0);
                byteBufferAllocate.position(0);
                long j3 = (long) (((this.f192175i * 1.0f) / this.f175667a) * 1000000.0f);
                u460Var.m191676e(byteBufferAllocate);
                u460Var.m191675d(iScalePcmData, 0, 0, j3, 0);
                this.f192175i += iScalePcmData / this.f192176j;
                return u460Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: c */
    public boolean mo130259c() {
        this.f192175i = 0;
        return super.mo130259c();
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: d */
    public void mo192814d(int i, int i2, int i3) {
        super.mo192814d(i, i2, i3);
        this.f192176j = (i2 * i3) / 8;
    }

    /* JADX INFO: renamed from: e */
    public u460 m208056e(u460 u460Var, float f) {
        synchronized (this.f192177k) {
            if (u460Var != null) {
                try {
                    if (u460Var.m191673b() != null) {
                        int i = u460Var.m191673b().size;
                        float f2 = 1.0f / f;
                        ByteBuffer byteBufferM191672a = u460Var.m191672a();
                        if (f2 == 1.0d) {
                            byteBufferM191672a.position(0);
                            int i2 = u460Var.m191673b().size;
                            int i3 = this.f192175i;
                            long j = (long) (((i3 * 1.0f) / this.f175667a) * 1000000.0f);
                            this.f192175i = i3 + (i2 / this.f192176j);
                            u460Var.m191675d(i2, 0, 0, j, 0);
                            return u460Var;
                        }
                        ByteBuffer byteBuffer = this.f192173g;
                        if (byteBuffer == null || i * 8 > byteBuffer.capacity()) {
                            this.f192173g = ByteBuffer.allocate(i * 8);
                        }
                        int iScalePcmData = this.f192170d.scalePcmData(byteBufferM191672a, i, f2, this.f192173g);
                        if (iScalePcmData <= 0) {
                            return null;
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iScalePcmData);
                        this.f192173g.get(byteBufferAllocate.array());
                        this.f192173g.position(0);
                        byteBufferAllocate.position(0);
                        long j2 = (long) (((this.f192175i * 1.0f) / this.f175667a) * 1000000.0f);
                        u460Var.m191676e(byteBufferAllocate);
                        u460Var.m191675d(iScalePcmData, 0, 0, j2, 0);
                        this.f192175i += iScalePcmData / this.f192176j;
                        return u460Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m208058g(List<TimeRangeScale> list) {
        synchronized (this.f192177k) {
            this.f192175i = 0;
            this.f192174h = list;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m208059h(float f) {
        synchronized (this.f192177k) {
            try {
                List<TimeRangeScale> list = this.f192174h;
                if (list != null && list.size() == 1) {
                    this.f192174h.get(0).setSpeed(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m208057f() {
    }
}
