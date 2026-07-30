package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ComplimentFromOther;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class mp5 {

    /* JADX INFO: renamed from: d */
    public static volatile mp5 f137872d;

    /* JADX INFO: renamed from: e */
    public static final ComplimentFromOther f137873e = new ComplimentFromOther();

    /* JADX INFO: renamed from: a */
    public final Map<String, ComplimentFromOther> f137874a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final Set<String> f137875b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public final C22508b<Pair<String, ComplimentFromOther>> f137876c = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ComplimentFromOther m159338b(Pair pair) {
        return (ComplimentFromOther) pair.second;
    }

    /* JADX INFO: renamed from: h */
    public static mp5 m159342h() {
        if (f137872d == null) {
            synchronized (mp5.class) {
                try {
                    if (f137872d == null) {
                        f137872d = new mp5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f137872d;
    }

    /* JADX INFO: renamed from: f */
    public C22421c<ComplimentFromOther> m159343f(final String str) {
        return this.f137876c.filter(new qcj() { // from class: l.kp5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((CharSequence) ((Pair) obj).first, str));
            }
        }).map(new qcj() { // from class: l.lp5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mp5.m159338b((Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public ComplimentFromOther m159344g(String str) {
        ComplimentFromOther complimentFromOther = this.f137874a.get(str);
        if (complimentFromOther == f137873e) {
            return null;
        }
        return complimentFromOther;
    }

    /* JADX INFO: renamed from: i */
    public boolean m159345i(String str) {
        return this.f137874a.containsKey(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m159346j(String str) {
        this.f137875b.remove(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m159347k(String str, ComplimentFromOther complimentFromOther) {
        this.f137874a.put(str, complimentFromOther != null ? complimentFromOther : f137873e);
        this.f137876c.m137019l(Pair.create(str, complimentFromOther));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m159348l(String str, Throwable th) {
        this.f137874a.put(str, f137873e);
        this.f137876c.m137019l(Pair.create(str, null));
    }

    /* JADX INFO: renamed from: m */
    public void m159349m(final String str) {
        if (TextUtils.isEmpty(str) || this.f137874a.containsKey(str) || !this.f137875b.add(str)) {
            return;
        }
        CoreModule.f18264c.f20435w0.m209450l3(str).doOnTerminate(new x20() { // from class: l.hp5
            @Override // p153l.x20
            public final void call() {
                this.f110980a.m159346j(str);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ip5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116256a.m159347k(str, (ComplimentFromOther) obj);
            }
        }, new y20() { // from class: l.jp5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122074a.m159348l(str, (Throwable) obj);
            }
        }));
    }
}
