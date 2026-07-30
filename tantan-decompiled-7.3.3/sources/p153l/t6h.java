package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t6h extends AbstractC15662a7<List<User>> {

    /* JADX INFO: renamed from: b */
    public Links f172339b;

    /* JADX INFO: renamed from: c */
    public String f172340c;

    /* JADX INFO: renamed from: d */
    public List<User> f172341d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f172342e;

    /* JADX INFO: renamed from: f */
    public boolean f172343f;

    public t6h(Act act, String str) {
        this.f172340c = str;
        this.f172342e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m189532m(Throwable th) {
        th.printStackTrace();
        m96353b().mo63168a(th);
    }

    /* JADX INFO: renamed from: h */
    public final List<User> m189533h(List<User> list) {
        final String str = FeedModule.m61406H().me_().f56859id;
        jyb.m147522n(list, new qcj() { // from class: l.s6h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!str.equals(((User) obj).f56859id));
            }
        });
        return list;
    }

    /* JADX INFO: renamed from: i */
    public String m189534i() {
        Links links = this.f172339b;
        return links == null ? "" : links.next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m189535j(bkj0 bkj0Var) {
        this.f172339b = (Links) bkj0Var.f77083c;
        this.f172341d.addAll(m189533h((List) bkj0Var.f77082b));
        m96353b().mo63169z0(this.f172341d, (Links) bkj0Var.f77083c);
        this.f172343f = false;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m189536k(Throwable th) {
        th.printStackTrace();
        m96353b().mo63168a(th);
        this.f172343f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m189537l(bkj0 bkj0Var) {
        this.f172341d.clear();
        this.f172341d.addAll(m189533h((List) bkj0Var.f77082b));
        this.f172339b = (Links) bkj0Var.f77083c;
        m96353b().mo63169z0(this.f172341d, (Links) bkj0Var.f77083c);
    }

    @Override // p153l.dsl
    public void next() {
        String strM189534i = m189534i();
        if (TextUtils.isEmpty(strM189534i) || this.f172343f) {
            return;
        }
        this.f172343f = true;
        this.f172342e.duringCreated(FeedModule.f39703d.m145499D7(this.f172340c, 0, strM189534i)).subscribe(psd0.m173597H(new y20() { // from class: l.q6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155812a.m189535j((bkj0) obj);
            }
        }, new y20() { // from class: l.r6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161473a.m189536k((Throwable) obj);
            }
        }));
    }

    @Override // p153l.dsl
    public void previous() {
        this.f172342e.duringCreated(FeedModule.f39703d.m145499D7(this.f172340c, 20, null)).subscribe(psd0.m173597H(new y20() { // from class: l.o6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145167a.m189537l((bkj0) obj);
            }
        }, new y20() { // from class: l.p6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150850a.m189532m((Throwable) obj);
            }
        }));
    }
}
