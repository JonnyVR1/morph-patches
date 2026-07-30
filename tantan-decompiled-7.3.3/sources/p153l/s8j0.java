package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class s8j0 extends ar2<u8j0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<TopicMoment> f166830a;

    public s8j0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m185081h0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m185088s0(Bundle bundle) {
        ((u8j0) this.viewModel).m195059n(R$string.f39894e0);
        ((u8j0) this.viewModel).m195062r();
        m185093q0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m185089A0(Bundle bundle) {
        try {
            ArrayList<TopicMoment> arrayList = (ArrayList) bundle.getSerializable("topic_selected");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.f166830a = arrayList;
        } catch (Exception e) {
            this.f166830a = new ArrayList<>();
            CrashHelper.m82479c(e);
            App.f16087d.m21432k(e);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m185090C0(TopicMoment topicMoment) {
        if (jyb.m147479J(this.f166830a)) {
            return false;
        }
        if (this.f166830a.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                o1j0.m165651y("只能添加一条匿名话题");
            } else if (cmg.m111187O()) {
                o1j0.m165651y("你已添加匿名话题，不可同选当前话题");
            } else {
                o1j0.m165651y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (cmg.m111187O()) {
            o1j0.m165651y("匿名话题与已添加话题不可同选");
        } else {
            o1j0.m165651y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.i8j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113349a.m185088s0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final pf60<Links, List<TopicMoment>> m185091o0(pf60<Links, List<TopicMoment>> pf60Var) {
        Links linksMo225055clone = pf60Var.f152156a.mo225055clone();
        ArrayList arrayList = new ArrayList();
        Iterator<TopicMoment> it = pf60Var.f152157b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo225055clone());
        }
        return new pf60<>(linksMo225055clone, arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public void m185092p0() {
        if (NullChecker.m82486a(FeedModule.f39703d.m145681d8().m222761e())) {
            jka jkaVar = FeedModule.f39703d;
            duringCreated(jkaVar.m145735kd("suggest", jkaVar.m145681d8().m222761e().f152156a.next)).subscribe(psd0.m173597H(new y20() { // from class: l.k8j0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s8j0.m185081h0((uxj0) obj);
                }
            }, new y20() { // from class: l.l8j0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165649w(R$string.f39829U);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m185093q0() {
        duringCreated(FeedModule.f39703d.m145681d8()).subscribe(psd0.m173596G(new y20() { // from class: l.j8j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118785a.m185094r0((pf60) obj);
            }
        }));
        if (FeedModule.f39703d.m145681d8().m222761e() == null || FeedModule.f39703d.m145681d8().m222761e().f152157b == null || FeedModule.f39703d.m145681d8().m222761e().f152157b.isEmpty()) {
            ((u8j0) this.viewModel).m195058m();
            m185098y0("suggest");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m185094r0(pf60 pf60Var) {
        pf60<Links, List<TopicMoment>> pf60Var2 = new pf60<>((Links) pf60Var.f152156a, jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.m8j0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        }));
        for (final TopicMoment topicMoment : (List) pf60Var.f152157b) {
            topicMoment.selected = jyb.m147520m(this.f166830a, new qcj() { // from class: l.n8j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                }
            });
        }
        m185099z0(m185091o0(pf60Var2));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m185095t0(uxj0 uxj0Var) {
        ((u8j0) this.viewModel).m195054e();
        ((u8j0) this.viewModel).m195055j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m185096u0(Throwable th) {
        o1j0.m165649w(R$string.f39829U);
        ((u8j0) this.viewModel).m195054e();
        ((u8j0) this.viewModel).m195055j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m185097x0(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f166830a.size() + 1 > 6) {
            o1j0.m165649w(R$string.f39868a2);
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) jyb.m147529r(this.f166830a, new qcj() { // from class: l.r8j0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
            }
        });
        if (NullChecker.m82486a(topicMoment2)) {
            topicMoment.selected = false;
            this.f166830a.remove(topicMoment2);
        } else if (!m185090C0(topicMoment)) {
            topicMoment.selected = true;
            this.f166830a.add(topicMoment);
        }
        ((u8j0) this.viewModel).m195056k();
    }

    /* JADX INFO: renamed from: y0 */
    public void m185098y0(String str) {
        duringCreated(FeedModule.f39703d.m145742ld(str)).subscribe(psd0.m173597H(new y20() { // from class: l.o8j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145418a.m185095t0((uxj0) obj);
            }
        }, new y20() { // from class: l.p8j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151037a.m185096u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m185099z0(pf60<Links, List<TopicMoment>> pf60Var) {
        for (final TopicMoment topicMoment : pf60Var.f152157b) {
            topicMoment.selected = jyb.m147520m(this.f166830a, new qcj() { // from class: l.q8j0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                }
            });
        }
        ((u8j0) this.viewModel).m195057l(pf60Var);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
