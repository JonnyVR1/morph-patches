package p149l;

import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zkb0 extends y6i {
    public zkb0(mcr mcrVar) {
        super(mcrVar);
        this.f196564c = (QATopicPhotoAlbumFeedFrag) mcrVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m219164A0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    private void m219165D0(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.xkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193281a.m219173F0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ykb0
            @Override // p149l.e30
            public final void call(Object obj) {
                zkb0.m219167u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m219166G0(j760 j760Var) {
        ((ilb0) this.viewModel).m136980t0(j760Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m219167u0(Throwable th) {
    }

    /* JADX INFO: renamed from: C0 */
    public void m219171C0() {
        duringCreated(oe40.m163805G()).subscribe(mkd0.m154955G(new e30() { // from class: l.wkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186739a.m219172E0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m219172E0(Moment moment) {
        V v2 = this.viewModel;
        ((ilb0) v2).m136979s0(moment, ((i7i) v2).m134901x());
        m219165D0(moment.value);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m219173F0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m196568J0(act(), str);
        }
    }

    @Override // p149l.y6i, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(oe40.m163823Y()).subscribe(mkd0.m154956H(new e30() { // from class: l.ukb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176916a.m219166G0((j760) obj);
            }
        }, new e30() { // from class: l.vkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                zkb0.m219164A0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.y6i
    /* JADX INFO: renamed from: t0 */
    public void m213141p0(List<TopicMoment> list) {
        super.m213141p0(list);
        ((ilb0) this.viewModel).m136981u0(this.f196566e);
    }
}
