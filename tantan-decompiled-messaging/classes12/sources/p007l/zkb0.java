package p007l;

import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zkb0 extends y6i {
    public zkb0(mcr mcrVar) {
        super(mcrVar);
        this.f15275c = (QATopicPhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m17500A0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    private void m17501D0(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.xkb0
            public final void call(Object obj) {
                this.f15025a.m17509F0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ykb0
            public final void call(Object obj) {
                zkb0.m17503u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m17502G0(j760 j760Var) {
        ((ilb0) ((jq2) this).viewModel).m10977t0(j760Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m17503u0(Throwable th) {
    }

    /* JADX INFO: renamed from: C0 */
    public void m17507C0() {
        duringCreated(oe40.m12542G()).subscribe(mkd0.G(new e30() { // from class: l.wkb0
            public final void call(Object obj) {
                this.f14560a.m17508E0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m17508E0(Moment moment) {
        s7m s7mVar = ((jq2) this).viewModel;
        ((ilb0) s7mVar).m10976s0(moment, ((i7i) s7mVar).m10822x());
        m17501D0(moment.value);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m17509F0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m15207J0(act(), str);
        }
    }

    @Override // p007l.y6i
    /* JADX INFO: renamed from: a0 */
    public void mo16956a0() {
        super.mo16956a0();
        duringCreated(oe40.m12560Y()).subscribe(mkd0.H(new e30() { // from class: l.ukb0
            public final void call(Object obj) {
                this.f13846a.m17502G0((j760) obj);
            }
        }, new e30() { // from class: l.vkb0
            public final void call(Object obj) {
                zkb0.m17500A0((Throwable) obj);
            }
        }));
    }

    @Override // p007l.y6i
    /* JADX INFO: renamed from: t0 */
    public void m16961p0(List<TopicMoment> list) {
        super.m16961p0(list);
        ((ilb0) ((jq2) this).viewModel).m10978u0(this.f15277e);
    }
}
