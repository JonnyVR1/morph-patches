package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ozi0 extends jq2<qzi0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<TopicMoment> f146455a;

    public ozi0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m166846h0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m166853s0(Bundle bundle) {
        ((qzi0) this.viewModel).m177213n(R$string.f39046e0);
        ((qzi0) this.viewModel).m177216r();
        m166858q0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m166854A0(Bundle bundle) {
        try {
            ArrayList<TopicMoment> arrayList = (ArrayList) bundle.getSerializable("topic_selected");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.f146455a = arrayList;
        } catch (Exception e) {
            this.f146455a = new ArrayList<>();
            CrashHelper.m81296c(e);
            App.f15368d.m20433k(e);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m166855C0(TopicMoment topicMoment) {
        if (vwb.m200296J(this.f146455a)) {
            return false;
        }
        if (this.f146455a.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.m151595y("只能添加一条匿名话题");
            } else if (nkg.m159858O()) {
                lsi0.m151595y("你已添加匿名话题，不可同选当前话题");
            } else {
                lsi0.m151595y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (nkg.m159858O()) {
            lsi0.m151595y("匿名话题与已添加话题不可同选");
        } else {
            lsi0.m151595y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ezi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93902a.m166853s0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final j760<Links, List<TopicMoment>> m166856o0(j760<Links, List<TopicMoment>> j760Var) {
        Links linksMo223809clone = j760Var.f116564a.mo223809clone();
        ArrayList arrayList = new ArrayList();
        Iterator<TopicMoment> it = j760Var.f116565b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo223809clone());
        }
        return new j760<>(linksMo223809clone, arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public void m166857p0() {
        if (NullChecker.m81303a(FeedModule.f38855d.m209440d8().m221515e())) {
            xia xiaVar = FeedModule.f38855d;
            duringCreated(xiaVar.m209494kd("suggest", xiaVar.m209440d8().m221515e().f116564a.next)).subscribe(mkd0.m154956H(new e30() { // from class: l.gzi0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ozi0.m166846h0((roj0) obj);
                }
            }, new e30() { // from class: l.hzi0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151593w(R$string.f38981U);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m166858q0() {
        duringCreated(FeedModule.f38855d.m209440d8()).subscribe(mkd0.m154955G(new e30() { // from class: l.fzi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99971a.m166859r0((j760) obj);
            }
        }));
        if (FeedModule.f38855d.m209440d8().m221515e() == null || FeedModule.f38855d.m209440d8().m221515e().f116565b == null || FeedModule.f38855d.m209440d8().m221515e().f116565b.isEmpty()) {
            ((qzi0) this.viewModel).m177212m();
            m166863y0("suggest");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m166859r0(j760 j760Var) {
        j760<Links, List<TopicMoment>> j760Var2 = new j760<>((Links) j760Var.f116564a, vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.izi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        }));
        for (final TopicMoment topicMoment : (List) j760Var.f116565b) {
            topicMoment.selected = vwb.m200337m(this.f146455a, new w9j() { // from class: l.jzi0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                }
            });
        }
        m166864z0(m166856o0(j760Var2));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m166860t0(roj0 roj0Var) {
        ((qzi0) this.viewModel).m177208e();
        ((qzi0) this.viewModel).m177209j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m166861u0(Throwable th) {
        lsi0.m151593w(R$string.f38981U);
        ((qzi0) this.viewModel).m177208e();
        ((qzi0) this.viewModel).m177209j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m166862x0(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f146455a.size() + 1 > 6) {
            lsi0.m151593w(R$string.f39020a2);
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.m200346r(this.f146455a, new w9j() { // from class: l.nzi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
            }
        });
        if (NullChecker.m81303a(topicMoment2)) {
            topicMoment.selected = false;
            this.f146455a.remove(topicMoment2);
        } else if (!m166855C0(topicMoment)) {
            topicMoment.selected = true;
            this.f146455a.add(topicMoment);
        }
        ((qzi0) this.viewModel).m177210k();
    }

    /* JADX INFO: renamed from: y0 */
    public void m166863y0(String str) {
        duringCreated(FeedModule.f38855d.m209501ld(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.kzi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125386a.m166860t0((roj0) obj);
            }
        }, new e30() { // from class: l.lzi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130654a.m166861u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m166864z0(j760<Links, List<TopicMoment>> j760Var) {
        for (final TopicMoment topicMoment : j760Var.f116565b) {
            topicMoment.selected = vwb.m200337m(this.f146455a, new w9j() { // from class: l.mzi0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                }
            });
        }
        ((qzi0) this.viewModel).m177211l(j760Var);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
