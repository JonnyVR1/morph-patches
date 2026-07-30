package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class hgg extends ar2<igg> {

    /* JADX INFO: renamed from: a */
    public boolean f109405a;

    /* JADX INFO: renamed from: b */
    public boolean f109406b;

    public hgg(ner nerVar) {
        super(nerVar);
        this.f109406b = this.f109406b;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m134928f0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f45771r);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m134936n0("");
    }

    /* JADX INFO: renamed from: i0 */
    public void m134931i0(final int i, String str, String str2, final boolean z) {
        ((igg) this.viewModel).m139919k(i, "approved");
        duringCreated(sfg.m185586a(str, str2, z)).subscribe(dhw.m115826e(new y20() { // from class: l.fgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98931a.m134933k0(z, i, (BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.ggg
            @Override // p153l.y20
            public final void call(Object obj) {
                hgg.m134928f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m134932j0() {
        return this.f109405a;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m134933k0(boolean z, int i, BaseLiveBean baseLiveBean) {
        V v2 = this.viewModel;
        if (z) {
            ((igg) v2).m139919k(i, "approved");
            o1j0.m165649w(R$string.f45773s);
        } else {
            ((igg) v2).m139919k(i, "rejected");
            o1j0.m165649w(R$string.f45777u);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m134934l0(String str, BaseLiveListBean baseLiveListBean) {
        this.f109405a = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((igg) v2).m139918j(baseLiveListBean);
        } else {
            ((igg) v2).m139916d(baseLiveListBean);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m134935m0(String str, Throwable th) {
        this.f109405a = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((igg) v2).m139918j(null);
        } else {
            ((igg) v2).m139917i();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m134936n0(final String str) {
        this.f109405a = true;
        duringCreated(sfg.m185591f(mbs.m157870o0(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.dgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88298a.m134934l0(str, (BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.egg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93928a.m134935m0(str, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
