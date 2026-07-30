package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ComplimentFromOther;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class io5 {

    /* JADX INFO: renamed from: d */
    public static volatile io5 f114100d;

    /* JADX INFO: renamed from: e */
    public static final ComplimentFromOther f114101e = new ComplimentFromOther();

    /* JADX INFO: renamed from: a */
    public final Map<String, ComplimentFromOther> f114102a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Set<String> f114103b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public final C22393b<Pair<String, ComplimentFromOther>> f114104c = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ComplimentFromOther m137288b(Pair pair) {
        return (ComplimentFromOther) pair.second;
    }

    /* JADX INFO: renamed from: h */
    public static io5 m137292h() {
        if (f114100d == null) {
            synchronized (io5.class) {
                try {
                    if (f114100d == null) {
                        f114100d = new io5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f114100d;
    }

    /* JADX INFO: renamed from: f */
    public C22306c<ComplimentFromOther> m137293f(final String str) {
        return this.f114104c.filter(new w9j() { // from class: l.go5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new w9j() { // from class: l.ho5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return io5.m137288b((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public ComplimentFromOther m137294g(String str) {
        ComplimentFromOther complimentFromOther = this.f114102a.get(str);
        if (complimentFromOther == f114101e) {
            return null;
        }
        return complimentFromOther;
    }

    /* JADX INFO: renamed from: i */
    public boolean m137295i(String str) {
        return this.f114102a.containsKey(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m137296j(String str) {
        this.f114103b.remove(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m137297k(String str, ComplimentFromOther complimentFromOther) {
        this.f114102a.put(str, complimentFromOther != null ? complimentFromOther : f114101e);
        this.f114104c.m132487l(Pair.create(str, complimentFromOther));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m137298l(String str, Throwable th) {
        this.f114102a.put(str, f114101e);
        this.f114104c.m132487l(Pair.create(str, null));
    }

    /* JADX INFO: renamed from: m */
    public void m137299m(final String str) {
        if (TextUtils.isEmpty(str) || this.f114102a.containsKey(str) || !this.f114103b.add(str)) {
            return;
        }
        CoreModule.f17545c.f19693w0.m162769l3(str).doOnTerminate(new d30() { // from class: l.do5
            @Override // p149l.d30
            public final void call() {
                this.f87129a.m137296j(str);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.eo5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92420a.m137297k(str, (ComplimentFromOther) obj);
            }
        }, new e30() { // from class: l.fo5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98505a.m137298l(str, (Throwable) obj);
            }
        }));
    }
}
