package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class x3e {

    /* JADX INFO: renamed from: d */
    public static volatile x3e f192248d;

    /* JADX INFO: renamed from: a */
    public boolean f192249a;

    /* JADX INFO: renamed from: b */
    public C22507a<String> f192250b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public List<C21241a> f192251c = new ArrayList();

    /* JADX INFO: renamed from: l.x3e$a */
    public static class C21241a {

        /* JADX INFO: renamed from: a */
        public String f192252a;

        /* JADX INFO: renamed from: b */
        public x20 f192253b;
    }

    public x3e() {
        this.f192250b.debounce(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.w3e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187128a.m209206d((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static x3e m209204b() {
        if (f192248d == null) {
            synchronized (x3e.class) {
                try {
                    if (f192248d == null) {
                        f192248d = new x3e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192248d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m209205c() {
        return this.f192249a;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m209206d(String str) {
        Iterator<C21241a> it = this.f192251c.iterator();
        while (it.hasNext()) {
            C21241a next = it.next();
            if (TextUtils.equals(str, next.f192252a)) {
                if (NullChecker.m82486a(next.f192253b)) {
                    next.f192253b.call();
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m209207e(String str) {
        this.f192250b.onNext(str);
    }

    /* JADX INFO: renamed from: f */
    public void m209208f(boolean z, String str) {
        this.f192249a = z;
        if (z || !TextUtils.isEmpty(this.f192250b.m222761e())) {
            return;
        }
        m209207e(str);
    }
}
