package p006l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.d70;
import l.e30;
import l.e520;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o0n implements d70 {

    /* JADX INFO: renamed from: a */
    public e520 f17964a;

    /* JADX INFO: renamed from: b */
    public AdView f17965b;

    /* JADX INFO: renamed from: c */
    public Act f17966c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f17967d;

    /* JADX INFO: renamed from: e */
    public bds f17968e;

    /* JADX INFO: renamed from: f */
    public xcs f17969f;

    /* JADX INFO: renamed from: g */
    public Map<String, Object> f17970g = new HashMap();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20289e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m20291i(c cVar) {
        String str = cVar.c;
        if (c.m == cVar) {
            if (NullChecker.a(this.f17964a)) {
                this.f17964a.a();
            }
            if (NullChecker.a(this.f17965b)) {
                this.f17965b.a();
                return;
            }
            return;
        }
        if (c.j == cVar) {
            if (NullChecker.a(this.f17965b)) {
                this.f17965b.c();
            }
        } else if (c.i == cVar && NullChecker.a(this.f17965b)) {
            this.f17965b.d();
        }
    }

    /* JADX INFO: renamed from: g */
    public o0n m20292g(int i) {
        switch (i) {
            case 1:
                return new c70();
            case 2:
            case 10:
                return new tf90(i);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return new x250();
            case CameraSticker.STATE_ERROR /* 4 */:
                return new l9e0();
            case 5:
                return new b6m0();
            case 6:
                if (this.f17968e == null) {
                    this.f17968e = new bds();
                }
                return this.f17968e;
            case 7:
                if (this.f17969f == null) {
                    this.f17969f = new xcs();
                }
                return this.f17969f;
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
    public void mo12565h(Act act, ViewGroup viewGroup) {
        this.f17966c = act;
        this.f17967d = viewGroup;
        if (b()) {
            act.lifecycle().filter(new w9j() { // from class: l.l0n
                public final Object call(Object obj) {
                    c cVar = (c) obj;
                    return Boolean.valueOf(cVar == c.m || cVar == c.i || cVar == c.j);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.m0n
                public final void call(Object obj) {
                    this.f16744a.m20291i((c) obj);
                }
            }, new e30() { // from class: l.n0n
                public final void call(Object obj) {
                    o0n.m20289e((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public o0n m20293j(String str, Object obj) {
        this.f17970g.put(str, obj);
        return this;
    }
}
