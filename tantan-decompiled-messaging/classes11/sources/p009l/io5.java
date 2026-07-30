package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ComplimentFromOther;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.e30;
import l.mkd0;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class io5 {

    /* JADX INFO: renamed from: d */
    public static volatile io5 f14723d;

    /* JADX INFO: renamed from: e */
    public static final ComplimentFromOther f14724e = new ComplimentFromOther();

    /* JADX INFO: renamed from: a */
    public final Map<String, ComplimentFromOther> f14725a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Set<String> f14726b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public final b<Pair<String, ComplimentFromOther>> f14727c = b.b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ComplimentFromOther m16646b(Pair pair) {
        return (ComplimentFromOther) pair.second;
    }

    /* JADX INFO: renamed from: h */
    public static io5 m16650h() {
        if (f14723d == null) {
            synchronized (io5.class) {
                try {
                    if (f14723d == null) {
                        f14723d = new io5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14723d;
    }

    /* JADX INFO: renamed from: f */
    public c<ComplimentFromOther> m16651f(final String str) {
        return this.f14727c.filter(new w9j() { // from class: l.go5
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new w9j() { // from class: l.ho5
            public final Object call(Object obj) {
                return io5.m16646b((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public ComplimentFromOther m16652g(String str) {
        ComplimentFromOther complimentFromOther = this.f14725a.get(str);
        if (complimentFromOther == f14724e) {
            return null;
        }
        return complimentFromOther;
    }

    /* JADX INFO: renamed from: i */
    public boolean m16653i(String str) {
        return this.f14725a.containsKey(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m16654j(String str) {
        this.f14726b.remove(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m16655k(String str, ComplimentFromOther complimentFromOther) {
        this.f14725a.put(str, complimentFromOther != null ? complimentFromOther : f14724e);
        this.f14727c.onNext(Pair.create(str, complimentFromOther));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m16656l(String str, Throwable th) {
        this.f14725a.put(str, f14724e);
        this.f14727c.onNext(Pair.create(str, null));
    }

    /* JADX INFO: renamed from: m */
    public void m16657m(final String str) {
        if (TextUtils.isEmpty(str) || this.f14725a.containsKey(str) || !this.f14726b.add(str)) {
            return;
        }
        CoreModule.c.w0.l3(str).doOnTerminate(new d30() { // from class: l.do5
            public final void call() {
                this.f11923a.m16654j(str);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.eo5
            public final void call(Object obj) {
                this.f12628a.m16655k(str, (ComplimentFromOther) obj);
            }
        }, new e30() { // from class: l.fo5
            public final void call(Object obj) {
                this.f13110a.m16656l(str, (Throwable) obj);
            }
        }));
    }
}
