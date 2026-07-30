package p153l;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class o2n implements z60 {

    /* JADX INFO: renamed from: a */
    public md20 f144749a;

    /* JADX INFO: renamed from: b */
    public AdView f144750b;

    /* JADX INFO: renamed from: c */
    public Act f144751c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f144752d;

    /* JADX INFO: renamed from: e */
    public cfs f144753e;

    /* JADX INFO: renamed from: f */
    public yes f144754f;

    /* JADX INFO: renamed from: g */
    public Map<String, Object> f144755g = new HashMap();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m165736e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m165738i(C4470c c4470c) {
        String str = c4470c.f16276c;
        if (C4470c.f16271m == c4470c) {
            if (NullChecker.m82486a(this.f144749a)) {
                this.f144749a.mo128555a();
            }
            if (NullChecker.m82486a(this.f144750b)) {
                this.f144750b.m12272a();
                return;
            }
            return;
        }
        if (C4470c.f16268j == c4470c) {
            if (NullChecker.m82486a(this.f144750b)) {
                this.f144750b.m12274c();
            }
        } else if (C4470c.f16267i == c4470c && NullChecker.m82486a(this.f144750b)) {
            this.f144750b.m12275d();
        }
    }

    /* JADX INFO: renamed from: g */
    public o2n m165739g(int i) {
        switch (i) {
            case 1:
                return new y60();
            case 2:
            case 10:
                return new xn90(i);
            case 3:
                return new mb50();
            case 4:
                return new qhe0();
            case 5:
                return new ffm0();
            case 6:
                if (this.f144753e == null) {
                    this.f144753e = new cfs();
                }
                return this.f144753e;
            case 7:
                if (this.f144754f == null) {
                    this.f144754f = new yes();
                }
                return this.f144754f;
            case 8:
                return new lgy();
            case 9:
                return new lfy();
            case 11:
                return new fsw();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo125406h(Act act, ViewGroup viewGroup) {
        this.f144751c = act;
        this.f144752d = viewGroup;
        if (mo109583b()) {
            act.lifecycle().filter(new qcj() { // from class: l.l2n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    C4470c c4470c = (C4470c) obj;
                    return Boolean.valueOf(c4470c == C4470c.f16271m || c4470c == C4470c.f16267i || c4470c == C4470c.f16268j);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.m2n
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f134589a.m165738i((C4470c) obj);
                }
            }, new y20() { // from class: l.n2n
                @Override // p153l.y20
                public final void call(Object obj) {
                    o2n.m165736e((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public o2n m165740j(String str, Object obj) {
        this.f144755g.put(str, obj);
        return this;
    }
}
