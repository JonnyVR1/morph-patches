package p006l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import l.nt2;
import l.vwb;
import l.w9j;
import l.ytj0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class muj0 extends ytj0 {

    /* JADX INFO: renamed from: c */
    public static volatile muj0 f17292c;

    /* JADX INFO: renamed from: a */
    public boolean f17293a = false;

    /* JADX INFO: renamed from: b */
    public a<Integer> f17294b = a.b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Calendar m19513d(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static muj0 m19514e() {
        if (f17292c == null) {
            synchronized (muj0.class) {
                try {
                    if (f17292c == null) {
                        f17292c = new muj0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17292c;
    }

    /* JADX INFO: renamed from: f */
    public static List<Calendar> m19515f() {
        return vwb.Q(nt2.c(), new w9j() { // from class: l.luj0
            public final Object call(Object obj) {
                return muj0.m19513d((Date) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m19516a(int i, int i2) {
        this.f17294b.onNext(Integer.valueOf(((i + 1) * 100) / i2));
    }

    /* JADX INFO: renamed from: b */
    public void m19517b(Throwable th) {
        this.f17293a = false;
        this.f17294b.onNext(102);
        CrashHelper.c(new Exception("upload log error:" + th.getMessage(), th));
    }

    /* JADX INFO: renamed from: c */
    public void m19518c() {
        this.f17293a = false;
        this.f17294b.onNext(101);
        this.f17294b.onNext(0);
    }

    /* JADX INFO: renamed from: g */
    public c<Integer> m19519g(Calendar calendar) {
        if (!this.f17293a) {
            au2.m12214D(Collections.singletonList(calendar.getTime()), "user", 0L, this);
        }
        return this.f17294b.asObservable();
    }
}
