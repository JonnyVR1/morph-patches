package p153l;

import com.immomo.moment.mediautils.AudioResampleUtils;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ed1 extends bc1 {

    /* JADX INFO: renamed from: d */
    AudioResampleUtils f93126d;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f93129g;

    /* JADX INFO: renamed from: h */
    private List<TimeRangeScale> f93130h;

    /* JADX INFO: renamed from: e */
    private String f93127e = "AudioScaleProcessor";

    /* JADX INFO: renamed from: f */
    private float f93128f = 1.0f;

    /* JADX INFO: renamed from: i */
    private int f93131i = 0;

    /* JADX INFO: renamed from: j */
    private int f93132j = 0;

    /* JADX INFO: renamed from: k */
    private Object f93133k = new Object();

    @Override // p153l.bc1
    /* JADX INFO: renamed from: a */
    public boolean mo103471a() {
        synchronized (this.f93133k) {
            try {
                if (this.f93126d == null) {
                    AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                    this.f93126d = audioResampleUtils;
                    audioResampleUtils.initScaleInfo(this.f76086a, this.f76088c, this.f76087b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: b */
    public ad60 mo103472b(ad60 ad60Var, int i, long j) {
        synchronized (this.f93133k) {
            try {
                float speed = this.f93128f;
                if (this.f93130h == null && speed == 1.0f) {
                    return ad60Var;
                }
                int i2 = 0;
                while (true) {
                    List<TimeRangeScale> list = this.f93130h;
                    if (list != null && list.size() > 0 && i2 < this.f93130h.size()) {
                        TimeRangeScale timeRangeScale = this.f93130h.get(i2);
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
                ByteBuffer byteBufferM97015a = ad60Var.m97015a();
                if (speed == 1.0d) {
                    byteBufferM97015a.position(0);
                    int i3 = ad60Var.m97016b().size;
                    int i4 = this.f93131i;
                    long j2 = (long) (((i4 * 1.0f) / this.f76086a) * 1000000.0f);
                    this.f93131i = i4 + (i3 / this.f93132j);
                    ad60Var.m97018d(i3, 0, 0, j2, 0);
                    return ad60Var;
                }
                ByteBuffer byteBuffer = this.f93129g;
                if (byteBuffer == null || i * 8 > byteBuffer.capacity()) {
                    this.f93129g = ByteBuffer.allocate(i * 8);
                }
                int iScalePcmData = this.f93126d.scalePcmData(byteBufferM97015a, i, speed, this.f93129g);
                if (iScalePcmData <= 0) {
                    return null;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iScalePcmData);
                this.f93129g.get(byteBufferAllocate.array());
                this.f93129g.position(0);
                byteBufferAllocate.position(0);
                long j3 = (long) (((this.f93131i * 1.0f) / this.f76086a) * 1000000.0f);
                ad60Var.m97019e(byteBufferAllocate);
                ad60Var.m97018d(iScalePcmData, 0, 0, j3, 0);
                this.f93131i += iScalePcmData / this.f93132j;
                return ad60Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: c */
    public boolean mo103473c() {
        this.f93131i = 0;
        return super.mo103473c();
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: d */
    public void mo103474d(int i, int i2, int i3) {
        super.mo103474d(i, i2, i3);
        this.f93132j = (i2 * i3) / 8;
    }

    /* JADX INFO: renamed from: e */
    public ad60 m120417e(ad60 ad60Var, float f) {
        synchronized (this.f93133k) {
            if (ad60Var != null) {
                try {
                    if (ad60Var.m97016b() != null) {
                        int i = ad60Var.m97016b().size;
                        float f2 = 1.0f / f;
                        ByteBuffer byteBufferM97015a = ad60Var.m97015a();
                        if (f2 == 1.0d) {
                            byteBufferM97015a.position(0);
                            int i2 = ad60Var.m97016b().size;
                            int i3 = this.f93131i;
                            long j = (long) (((i3 * 1.0f) / this.f76086a) * 1000000.0f);
                            this.f93131i = i3 + (i2 / this.f93132j);
                            ad60Var.m97018d(i2, 0, 0, j, 0);
                            return ad60Var;
                        }
                        ByteBuffer byteBuffer = this.f93129g;
                        if (byteBuffer == null || i * 8 > byteBuffer.capacity()) {
                            this.f93129g = ByteBuffer.allocate(i * 8);
                        }
                        int iScalePcmData = this.f93126d.scalePcmData(byteBufferM97015a, i, f2, this.f93129g);
                        if (iScalePcmData <= 0) {
                            return null;
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iScalePcmData);
                        this.f93129g.get(byteBufferAllocate.array());
                        this.f93129g.position(0);
                        byteBufferAllocate.position(0);
                        long j2 = (long) (((this.f93131i * 1.0f) / this.f76086a) * 1000000.0f);
                        ad60Var.m97019e(byteBufferAllocate);
                        ad60Var.m97018d(iScalePcmData, 0, 0, j2, 0);
                        this.f93131i += iScalePcmData / this.f93132j;
                        return ad60Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m120419g(List<TimeRangeScale> list) {
        synchronized (this.f93133k) {
            this.f93131i = 0;
            this.f93130h = list;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m120420h(float f) {
        synchronized (this.f93133k) {
            try {
                List<TimeRangeScale> list = this.f93130h;
                if (list != null && list.size() == 1) {
                    this.f93130h.get(0).setSpeed(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m120418f() {
    }
}
