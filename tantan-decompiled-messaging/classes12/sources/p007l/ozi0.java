package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ozi0 extends jq2<qzi0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<TopicMoment> f11655a;

    public ozi0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m12880h0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m12887s0(Bundle bundle) {
        ((qzi0) ((jq2) this).viewModel).m13815n(R$string.f507e0);
        ((qzi0) ((jq2) this).viewModel).m13818r();
        m12893q0();
    }

    /* JADX INFO: renamed from: A0 */
    public void m12888A0(Bundle bundle) {
        try {
            ArrayList<TopicMoment> arrayList = (ArrayList) bundle.getSerializable("topic_selected");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            this.f11655a = arrayList;
        } catch (Exception e) {
            this.f11655a = new ArrayList<>();
            CrashHelper.c(e);
            App.d.k(e);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m12889C0(TopicMoment topicMoment) {
        if (vwb.J(this.f11655a)) {
            return false;
        }
        if (this.f11655a.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.y("只能添加一条匿名话题");
            } else if (nkg.m12217O()) {
                lsi0.y("你已添加匿名话题，不可同选当前话题");
            } else {
                lsi0.y("添加了匿名话题，不能再添加普通话题");
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        if (nkg.m12217O()) {
            lsi0.y("匿名话题与已添加话题不可同选");
        } else {
            lsi0.y("添加了普通话题，不能再添加匿名话题");
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m12890a0() {
        creates(new e30() { // from class: l.ezi0
            public final void call(Object obj) {
                this.f7506a.m12887s0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final j760<Links, List<TopicMoment>> m12891o0(j760<Links, List<TopicMoment>> j760Var) {
        Links linksM18297clone = ((Links) j760Var.a).m18297clone();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) j760Var.b).iterator();
        while (it.hasNext()) {
            arrayList.add(((TopicMoment) it.next()).m19794clone());
        }
        return new j760<>(linksM18297clone, arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public void m12892p0() {
        if (NullChecker.a(FeedModule.f316d.m16621d8().e())) {
            xia xiaVar = FeedModule.f316d;
            duringCreated(xiaVar.m16675kd("suggest", ((Links) ((j760) xiaVar.m16621d8().e()).a).next)).subscribe(mkd0.H(new e30() { // from class: l.gzi0
                public final void call(Object obj) {
                    ozi0.m12880h0((roj0) obj);
                }
            }, new e30() { // from class: l.hzi0
                public final void call(Object obj) {
                    lsi0.w(R$string.f442U);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m12893q0() {
        duringCreated(FeedModule.f316d.m16621d8()).subscribe(mkd0.G(new e30() { // from class: l.fzi0
            public final void call(Object obj) {
                this.f8288a.m12894r0((j760) obj);
            }
        }));
        if (FeedModule.f316d.m16621d8().e() == null || ((j760) FeedModule.f316d.m16621d8().e()).b == null || ((List) ((j760) FeedModule.f316d.m16621d8().e()).b).isEmpty()) {
            ((qzi0) ((jq2) this).viewModel).m13814m();
            m12898y0("suggest");
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m12894r0(j760 j760Var) {
        j760<Links, List<TopicMoment>> j760Var2 = new j760<>((Links) j760Var.a, vwb.n((Collection) j760Var.b, new w9j() { // from class: l.izi0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((TopicMoment) obj).isTopicVoteType());
            }
        }));
        for (final TopicMoment topicMoment : (List) j760Var.b) {
            topicMoment.selected = vwb.m(this.f11655a, new w9j() { // from class: l.jzi0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                }
            });
        }
        m12899z0(m12891o0(j760Var2));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m12895t0(roj0 roj0Var) {
        ((qzi0) ((jq2) this).viewModel).m13809e();
        ((qzi0) ((jq2) this).viewModel).m13811j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m12896u0(Throwable th) {
        lsi0.w(R$string.f442U);
        ((qzi0) ((jq2) this).viewModel).m13809e();
        ((qzi0) ((jq2) this).viewModel).m13811j();
    }

    /* JADX INFO: renamed from: x0 */
    public void m12897x0(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f11655a.size() + 1 > 6) {
            lsi0.w(R$string.f481a2);
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.r(this.f11655a, new w9j() { // from class: l.nzi0
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
            }
        });
        if (NullChecker.a(topicMoment2)) {
            topicMoment.selected = false;
            this.f11655a.remove(topicMoment2);
        } else if (!m12889C0(topicMoment)) {
            topicMoment.selected = true;
            this.f11655a.add(topicMoment);
        }
        ((qzi0) ((jq2) this).viewModel).m13812k();
    }

    /* JADX INFO: renamed from: y0 */
    public void m12898y0(String str) {
        duringCreated(FeedModule.f316d.m16682ld(str)).subscribe(mkd0.H(new e30() { // from class: l.kzi0
            public final void call(Object obj) {
                this.f9829a.m12895t0((roj0) obj);
            }
        }, new e30() { // from class: l.lzi0
            public final void call(Object obj) {
                this.f10171a.m12896u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m12899z0(j760<Links, List<TopicMoment>> j760Var) {
        for (final TopicMoment topicMoment : (List) j760Var.b) {
            topicMoment.selected = vwb.m(this.f11655a, new w9j() { // from class: l.mzi0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                }
            });
        }
        ((qzi0) ((jq2) this).viewModel).m13813l(j760Var);
    }

    public void destroy() {
    }
}
