package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class muj0 extends ytj0 {

    /* JADX INFO: renamed from: c */
    public static volatile muj0 f135796c;

    /* JADX INFO: renamed from: a */
    public boolean f135797a = false;

    /* JADX INFO: renamed from: b */
    public C22392a<Integer> f135798b = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Calendar m156411d(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static muj0 m156412e() {
        if (f135796c == null) {
            synchronized (muj0.class) {
                try {
                    if (f135796c == null) {
                        f135796c = new muj0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135796c;
    }

    /* JADX INFO: renamed from: f */
    public static List<Calendar> m156413f() {
        return vwb.m200303Q(nt2.m160812c(), new w9j() { // from class: l.luj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return muj0.m156411d((Date) obj);
            }
        });
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: a */
    public void mo134437a(int i, int i2) {
        this.f135798b.onNext(Integer.valueOf(((i + 1) * 100) / i2));
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: b */
    public void mo134438b(Throwable th) {
        this.f135797a = false;
        this.f135798b.onNext(102);
        CrashHelper.m81296c(new Exception("upload log error:" + th.getMessage(), th));
    }

    @Override // p149l.ytj0
    /* JADX INFO: renamed from: c */
    public void mo134439c() {
        this.f135797a = false;
        this.f135798b.onNext(101);
        this.f135798b.onNext(0);
    }

    /* JADX INFO: renamed from: g */
    public C22306c<Integer> m156414g(Calendar calendar) {
        if (!this.f135797a) {
            au2.m98911D(Collections.singletonList(calendar.getTime()), "user", 0L, this);
        }
        return this.f135798b.asObservable();
    }
}
