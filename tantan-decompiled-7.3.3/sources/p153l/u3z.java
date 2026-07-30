package p153l;

import android.text.TextUtils;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class u3z {

    /* JADX INFO: renamed from: a */
    public String f177412a = "MessageCenter";

    /* JADX INFO: renamed from: b */
    public long f177413b = 0;

    /* JADX INFO: renamed from: c */
    public C22508b<xsl> f177414c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public C22508b<xsl> f177415d = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ xsl m194440a(xsl xslVar) {
        return xslVar;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xsl m194443d(xsl xslVar) {
        return xslVar;
    }

    /* JADX INFO: renamed from: e */
    public <T extends xsl> C22421c<T> m194444e(final Class<T> cls) {
        return (C22421c<T>) this.f177415d.asObservable().filter(new qcj() { // from class: l.s3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166044a.m194448i(cls, (xsl) obj);
            }
        }).map(new qcj() { // from class: l.t3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u3z.m194443d((xsl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final <T extends xsl> boolean m194445f(Class<T> cls, xsl xslVar) {
        return TextUtils.equals(cls.getName(), xslVar.getClass().getName());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m194446g(int[] iArr, xsl xslVar) {
        if (iArr.length == 0) {
            return true;
        }
        for (int i : iArr) {
            if (i == xslVar.getAction()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public <T extends xsl> C22421c<T> m194447h(final Class<T> cls, final int... iArr) {
        return (C22421c<T>) this.f177414c.asObservable().filter(new qcj() { // from class: l.q3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155501a.m194449j(cls, iArr, (xsl) obj);
            }
        }).map(new qcj() { // from class: l.r3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u3z.m194440a((xsl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m194448i(Class cls, xsl xslVar) {
        return Boolean.valueOf(m194445f(cls, xslVar));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Boolean m194449j(Class cls, int[] iArr, xsl xslVar) {
        return Boolean.valueOf(m194445f(cls, xslVar) && m194446g(iArr, xslVar));
    }

    /* JADX INFO: renamed from: k */
    public <T> void m194450k(wpl<T> wplVar) {
        this.f177415d.onNext(wplVar);
    }

    /* JADX INFO: renamed from: l */
    public void m194451l(xsl xslVar) {
        this.f177414c.onNext(xslVar);
    }
}
