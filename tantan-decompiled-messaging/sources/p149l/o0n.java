package p149l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class o0n implements d70 {

    /* JADX INFO: renamed from: a */
    public e520 f141343a;

    /* JADX INFO: renamed from: b */
    public AdView f141344b;

    /* JADX INFO: renamed from: c */
    public Act f141345c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f141346d;

    /* JADX INFO: renamed from: e */
    public bds f141347e;

    /* JADX INFO: renamed from: f */
    public xcs f141348f;

    /* JADX INFO: renamed from: g */
    public Map<String, Object> f141349g = new HashMap();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m162158e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m162160i(C4319c c4319c) {
        String str = c4319c.f15557c;
        if (C4319c.f15552m == c4319c) {
            if (NullChecker.m81303a(this.f141343a)) {
                this.f141343a.mo98603a();
            }
            if (NullChecker.m81303a(this.f141344b)) {
                this.f141344b.m12218a();
                return;
            }
            return;
        }
        if (C4319c.f15549j == c4319c) {
            if (NullChecker.m81303a(this.f141344b)) {
                this.f141344b.m12220c();
            }
        } else if (C4319c.f15548i == c4319c && NullChecker.m81303a(this.f141344b)) {
            this.f141344b.m12221d();
        }
    }

    /* JADX INFO: renamed from: g */
    public o0n m162161g(int i) {
        switch (i) {
            case 1:
                return new c70();
            case 2:
            case 10:
                return new tf90(i);
            case 3:
                return new x250();
            case 4:
                return new l9e0();
            case 5:
                return new b6m0();
            case 6:
                if (this.f141347e == null) {
                    this.f141347e = new bds();
                }
                return this.f141347e;
            case 7:
                if (this.f141348f == null) {
                    this.f141348f = new xcs();
                }
                return this.f141348f;
            case 8:
                return new o7y();
            case 9:
                return new o6y();
            case 11:
                return new gpw();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo100438h(Act act, ViewGroup viewGroup) {
        this.f141345c = act;
        this.f141346d = viewGroup;
        if (mo100436b()) {
            act.lifecycle().filter(new w9j() { // from class: l.l0n
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    C4319c c4319c = (C4319c) obj;
                    return Boolean.valueOf(c4319c == C4319c.f15552m || c4319c == C4319c.f15548i || c4319c == C4319c.f15549j);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.m0n
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130749a.m162160i((C4319c) obj);
                }
            }, new e30() { // from class: l.n0n
                @Override // p149l.e30
                public final void call(Object obj) {
                    o0n.m162158e((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public o0n m162162j(String str, Object obj) {
        this.f141349g.put(str, obj);
        return this;
    }
}
