package p149l;

import android.text.TextUtils;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class xuy {

    /* JADX INFO: renamed from: a */
    public String f194565a = "MessageCenter";

    /* JADX INFO: renamed from: b */
    public long f194566b = 0;

    /* JADX INFO: renamed from: c */
    public C22393b<lql> f194567c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public C22393b<lql> f194568d = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ lql m211224a(lql lqlVar) {
        return lqlVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ lql m211227d(lql lqlVar) {
        return lqlVar;
    }

    /* JADX INFO: renamed from: e */
    public <T extends lql> C22306c<T> m211228e(final Class<T> cls) {
        return (C22306c<T>) this.f194568d.asObservable().filter(new w9j() { // from class: l.vuy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183137a.m211232i(cls, (lql) obj);
            }
        }).map(new w9j() { // from class: l.wuy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xuy.m211227d((lql) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final <T extends lql> boolean m211229f(Class<T> cls, lql lqlVar) {
        return TextUtils.equals(cls.getName(), lqlVar.getClass().getName());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m211230g(int[] iArr, lql lqlVar) {
        if (iArr.length == 0) {
            return true;
        }
        for (int i : iArr) {
            if (i == lqlVar.getAction()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public <T extends lql> C22306c<T> m211231h(final Class<T> cls, final int... iArr) {
        return (C22306c<T>) this.f194567c.asObservable().filter(new w9j() { // from class: l.tuy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172230a.m211233j(cls, iArr, (lql) obj);
            }
        }).map(new w9j() { // from class: l.uuy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xuy.m211224a((lql) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m211232i(Class cls, lql lqlVar) {
        return Boolean.valueOf(m211229f(cls, lqlVar));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Boolean m211233j(Class cls, int[] iArr, lql lqlVar) {
        return Boolean.valueOf(m211229f(cls, lqlVar) && m211230g(iArr, lqlVar));
    }

    /* JADX INFO: renamed from: k */
    public <T> void m211234k(lnl<T> lnlVar) {
        this.f194568d.onNext(lnlVar);
    }

    /* JADX INFO: renamed from: l */
    public void m211235l(lql lqlVar) {
        this.f194567c.onNext(lqlVar);
    }
}
