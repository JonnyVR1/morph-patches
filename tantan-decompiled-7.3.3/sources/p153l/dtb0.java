package p153l;

import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class dtb0 extends n8i {
    public dtb0(ner nerVar) {
        super(nerVar);
        this.f140685c = (QATopicPhotoAlbumFeedFrag) nerVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m117838A0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    private void m117839D0(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.btb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78347a.m117847F0(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.ctb0
            @Override // p153l.y20
            public final void call(Object obj) {
                dtb0.m117841u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m117840G0(pf60 pf60Var) {
        ((mtb0) this.viewModel).m159979t0(pf60Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m117841u0(Throwable th) {
    }

    /* JADX INFO: renamed from: C0 */
    public void m117845C0() {
        duringCreated(cn40.m111355G()).subscribe(psd0.m173596G(new y20() { // from class: l.atb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73219a.m117846E0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m117846E0(Moment moment) {
        V v2 = this.viewModel;
        ((mtb0) v2).m159978s0(moment, ((x8i) v2).m209729x());
        m117839D0(moment.value);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m117847F0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            k3h.m148045J0(act(), str);
        }
    }

    @Override // p153l.n8i, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(cn40.m111373Y()).subscribe(psd0.m173597H(new y20() { // from class: l.ysb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201387a.m117840G0((pf60) obj);
            }
        }, new y20() { // from class: l.zsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                dtb0.m117838A0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.n8i
    /* JADX INFO: renamed from: t0 */
    public void m161938p0(List<TopicMoment> list) {
        super.m161938p0(list);
        ((mtb0) this.viewModel).m159980u0(this.f140687e);
    }
}
