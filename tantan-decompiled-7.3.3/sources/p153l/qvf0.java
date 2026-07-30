package p153l;

import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.momo.mcamera.util.MDLogTag;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class qvf0 extends xjm {

    /* JADX INFO: renamed from: k */
    public static int f159746k = 66666;

    /* JADX INFO: renamed from: l */
    public static int f159747l = 33333;

    /* JADX INFO: renamed from: g */
    private List<TimeRangeScale> f159751g;

    /* JADX INFO: renamed from: d */
    private long f159748d = -1;

    /* JADX INFO: renamed from: e */
    private long f159749e = 0;

    /* JADX INFO: renamed from: f */
    private int f159750f = 0;

    /* JADX INFO: renamed from: h */
    private LinkedList<C19680a> f159752h = new LinkedList<>();

    /* JADX INFO: renamed from: i */
    private Object f159753i = new Object();

    /* JADX INFO: renamed from: j */
    private Object f159754j = new Object();

    /* JADX INFO: renamed from: l.qvf0$a */
    public class C19680a {

        /* JADX INFO: renamed from: a */
        public long f159755a;

        public C19680a(long j) {
            this.f159755a = j;
        }
    }

    /* JADX INFO: renamed from: h */
    private int m178282h(long j) {
        boolean z;
        if (this.f159748d < 0) {
            this.f159748d = j;
            z = true;
        } else {
            z = false;
        }
        long speed = j - this.f159748d;
        List<TimeRangeScale> list = this.f159751g;
        if (list == null || list.size() == 0) {
            this.f159749e += speed;
            this.f159748d = j;
            synchronized (this.f159753i) {
                this.f159752h.offer(new C19680a(this.f159749e));
            }
            return 0;
        }
        for (int i = 0; this.f159751g.size() > 0 && i < this.f159751g.size(); i++) {
            TimeRangeScale timeRangeScale = this.f159751g.get(i);
            if (j >= timeRangeScale.getStart() * 1000 && j <= timeRangeScale.getEnd() * 1000) {
                speed = (long) (speed * timeRangeScale.getSpeed());
                break;
            }
            timeRangeScale.getEnd();
        }
        if (!z && speed < f159747l) {
            return -1;
        }
        int i2 = ((int) speed) / f159746k;
        this.f159749e += speed;
        this.f159748d = j;
        int i3 = i2;
        do {
            if (i3 > 0) {
                i3--;
            }
            synchronized (this.f159753i) {
                this.f159752h.offer(new C19680a(this.f159749e - ((long) (f159746k * i3))));
            }
        } while (i3 > 0);
        return i2;
    }

    @Override // p153l.xjm
    /* JADX INFO: renamed from: a */
    public boolean mo178283a() {
        boolean zMo178283a;
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "SpeedControlProcesser reset!!!");
        synchronized (this.f159754j) {
            this.f159748d = -1L;
            this.f159749e = 0L;
            this.f159752h.clear();
            zMo178283a = super.mo178283a();
        }
        return zMo178283a;
    }

    /* JADX INFO: renamed from: b */
    public long m178284b() {
        return this.f159749e;
    }

    /* JADX INFO: renamed from: c */
    public long m178285c() {
        synchronized (this.f159753i) {
            try {
                if (this.f159752h.size() <= 0) {
                    return -1L;
                }
                return this.f159752h.pollFirst().f159755a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m178286d() {
        return this.f159750f;
    }

    /* JADX INFO: renamed from: e */
    public void m178287e(Buffer buffer, int i, long j) {
        synchronized (this.f159754j) {
            this.f159750f = m178282h(j);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m178288f() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "SpeedControlProcesser release!!!");
    }

    /* JADX INFO: renamed from: g */
    public void m178289g(List<TimeRangeScale> list) {
        synchronized (this.f159754j) {
            this.f159748d = -1L;
            this.f159749e = 0L;
            this.f159752h.clear();
            this.f159751g = list;
        }
    }
}
