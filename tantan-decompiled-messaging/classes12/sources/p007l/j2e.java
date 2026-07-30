package p007l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.e30;
import l.jo0;
import l.mkd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j2e {

    /* JADX INFO: renamed from: d */
    public static volatile j2e f9197d;

    /* JADX INFO: renamed from: a */
    public boolean f9198a;

    /* JADX INFO: renamed from: b */
    public a<String> f9199b = a.b();

    /* JADX INFO: renamed from: c */
    public List<C2398a> f9200c = new ArrayList();

    /* JADX INFO: renamed from: l.j2e$a */
    public static class C2398a {

        /* JADX INFO: renamed from: a */
        public String f9201a;

        /* JADX INFO: renamed from: b */
        public d30 f9202b;
    }

    public j2e() {
        this.f9199b.debounce(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.i2e
            public final void call(Object obj) {
                this.f8874a.m11064d((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static j2e m11062b() {
        if (f9197d == null) {
            synchronized (j2e.class) {
                try {
                    if (f9197d == null) {
                        f9197d = new j2e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9197d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m11063c() {
        return this.f9198a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m11064d(String str) {
        Iterator<C2398a> it = this.f9200c.iterator();
        while (it.hasNext()) {
            C2398a next = it.next();
            if (TextUtils.equals(str, next.f9201a)) {
                if (NullChecker.a(next.f9202b)) {
                    next.f9202b.call();
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11065e(String str) {
        this.f9199b.onNext(str);
    }

    /* JADX INFO: renamed from: f */
    public void m11066f(boolean z, String str) {
        this.f9198a = z;
        if (z || !TextUtils.isEmpty((CharSequence) this.f9199b.e())) {
            return;
        }
        m11065e(str);
    }
}
