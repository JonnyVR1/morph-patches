package p149l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class j2e {

    /* JADX INFO: renamed from: d */
    public static volatile j2e f115915d;

    /* JADX INFO: renamed from: a */
    public boolean f115916a;

    /* JADX INFO: renamed from: b */
    public C22392a<String> f115917b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public List<C17674a> f115918c = new ArrayList();

    /* JADX INFO: renamed from: l.j2e$a */
    public static class C17674a {

        /* JADX INFO: renamed from: a */
        public String f115919a;

        /* JADX INFO: renamed from: b */
        public d30 f115920b;
    }

    public j2e() {
        this.f115917b.debounce(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.i2e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110548a.m139431d((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static j2e m139429b() {
        if (f115915d == null) {
            synchronized (j2e.class) {
                try {
                    if (f115915d == null) {
                        f115915d = new j2e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f115915d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m139430c() {
        return this.f115916a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m139431d(String str) {
        Iterator<C17674a> it = this.f115918c.iterator();
        while (it.hasNext()) {
            C17674a next = it.next();
            if (TextUtils.equals(str, next.f115919a)) {
                if (NullChecker.m81303a(next.f115920b)) {
                    next.f115920b.call();
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m139432e(String str) {
        this.f115917b.onNext(str);
    }

    /* JADX INFO: renamed from: f */
    public void m139433f(boolean z, String str) {
        this.f115916a = z;
        if (z || !TextUtils.isEmpty(this.f115917b.m221515e())) {
            return;
        }
        m139432e(str);
    }
}
