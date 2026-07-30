package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class p3k0 extends b3k0 {

    /* JADX INFO: renamed from: c */
    public static volatile p3k0 f150413c;

    /* JADX INFO: renamed from: a */
    public boolean f150414a = false;

    /* JADX INFO: renamed from: b */
    public C22507a<Integer> f150415b = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Calendar m170493d(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static p3k0 m170494e() {
        if (f150413c == null) {
            synchronized (p3k0.class) {
                try {
                    if (f150413c == null) {
                        f150413c = new p3k0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150413c;
    }

    /* JADX INFO: renamed from: f */
    public static List<Calendar> m170495f() {
        return jyb.m147486Q(du2.m118043c(), new qcj() { // from class: l.o3k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p3k0.m170493d((Date) obj);
            }
        });
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: a */
    public void mo102341a(int i, int i2) {
        this.f150415b.onNext(Integer.valueOf(((i + 1) * 100) / i2));
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: b */
    public void mo102342b(Throwable th) {
        this.f150414a = false;
        this.f150415b.onNext(102);
        CrashHelper.m82479c(new Exception("upload log error:" + th.getMessage(), th));
    }

    @Override // p153l.b3k0
    /* JADX INFO: renamed from: c */
    public void mo102343c() {
        this.f150414a = false;
        this.f150415b.onNext(101);
        this.f150415b.onNext(0);
    }

    /* JADX INFO: renamed from: g */
    public C22421c<Integer> m170496g(Calendar calendar) {
        if (!this.f150414a) {
            qu2.m178104D(Collections.singletonList(calendar.getTime()), "user", 0L, this);
        }
        return this.f150415b.asObservable();
    }
}
