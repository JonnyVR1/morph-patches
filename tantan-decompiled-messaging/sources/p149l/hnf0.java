package p149l;

import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import com.momo.mcamera.util.MDLogTag;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class hnf0 extends uhm {

    /* JADX INFO: renamed from: k */
    public static int f108616k = 66666;

    /* JADX INFO: renamed from: l */
    public static int f108617l = 33333;

    /* JADX INFO: renamed from: g */
    private List<TimeRangeScale> f108621g;

    /* JADX INFO: renamed from: d */
    private long f108618d = -1;

    /* JADX INFO: renamed from: e */
    private long f108619e = 0;

    /* JADX INFO: renamed from: f */
    private int f108620f = 0;

    /* JADX INFO: renamed from: h */
    private LinkedList<C17348a> f108622h = new LinkedList<>();

    /* JADX INFO: renamed from: i */
    private Object f108623i = new Object();

    /* JADX INFO: renamed from: j */
    private Object f108624j = new Object();

    /* JADX INFO: renamed from: l.hnf0$a */
    public class C17348a {

        /* JADX INFO: renamed from: a */
        public long f108625a;

        public C17348a(long j) {
            this.f108625a = j;
        }
    }

    /* JADX INFO: renamed from: h */
    private int m131916h(long j) {
        boolean z;
        if (this.f108618d < 0) {
            this.f108618d = j;
            z = true;
        } else {
            z = false;
        }
        long speed = j - this.f108618d;
        List<TimeRangeScale> list = this.f108621g;
        if (list == null || list.size() == 0) {
            this.f108619e += speed;
            this.f108618d = j;
            synchronized (this.f108623i) {
                this.f108622h.offer(new C17348a(this.f108619e));
            }
            return 0;
        }
        for (int i = 0; this.f108621g.size() > 0 && i < this.f108621g.size(); i++) {
            TimeRangeScale timeRangeScale = this.f108621g.get(i);
            if (j >= timeRangeScale.getStart() * 1000 && j <= timeRangeScale.getEnd() * 1000) {
                speed = (long) (speed * timeRangeScale.getSpeed());
                break;
            }
            timeRangeScale.getEnd();
        }
        if (!z && speed < f108617l) {
            return -1;
        }
        int i2 = ((int) speed) / f108616k;
        this.f108619e += speed;
        this.f108618d = j;
        int i3 = i2;
        do {
            if (i3 > 0) {
                i3--;
            }
            synchronized (this.f108623i) {
                this.f108622h.offer(new C17348a(this.f108619e - ((long) (f108616k * i3))));
            }
        } while (i3 > 0);
        return i2;
    }

    @Override // p149l.uhm
    /* JADX INFO: renamed from: a */
    public boolean mo131917a() {
        boolean zMo131917a;
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "SpeedControlProcesser reset!!!");
        synchronized (this.f108624j) {
            this.f108618d = -1L;
            this.f108619e = 0L;
            this.f108622h.clear();
            zMo131917a = super.mo131917a();
        }
        return zMo131917a;
    }

    /* JADX INFO: renamed from: b */
    public long m131918b() {
        return this.f108619e;
    }

    /* JADX INFO: renamed from: c */
    public long m131919c() {
        synchronized (this.f108623i) {
            try {
                if (this.f108622h.size() <= 0) {
                    return -1L;
                }
                return this.f108622h.pollFirst().f108625a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m131920d() {
        return this.f108620f;
    }

    /* JADX INFO: renamed from: e */
    public void m131921e(Buffer buffer, int i, long j) {
        synchronized (this.f108624j) {
            this.f108620f = m131916h(j);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m131922f() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "SpeedControlProcesser release!!!");
    }

    /* JADX INFO: renamed from: g */
    public void m131923g(List<TimeRangeScale> list) {
        synchronized (this.f108624j) {
            this.f108618d = -1L;
            this.f108619e = 0L;
            this.f108622h.clear();
            this.f108621g = list;
        }
    }
}
