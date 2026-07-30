package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CardInfo;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p051p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s9l extends ar2<w9l> {

    /* JADX INFO: renamed from: a */
    public opf f166945a;

    /* JADX INFO: renamed from: b */
    public HomeExploreFrag f166946b;

    /* JADX INFO: renamed from: c */
    public final String f166947c;

    public s9l(HomeExploreFrag homeExploreFrag, String str) {
        super(homeExploreFrag);
        this.f166946b = homeExploreFrag;
        this.f166947c = str;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m185207j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m185208k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m185209r0(C4470c c4470c) {
        m185210l0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.lifecycleProviderImpl.lifecycle().filter(new qcj() { // from class: l.l9l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.m9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135424a.m185209r0((C4470c) obj);
            }
        }, new y20() { // from class: l.n9l
            @Override // p153l.y20
            public final void call(Object obj) {
                s9l.m185207j0((Throwable) obj);
            }
        }));
        m185211m0();
        m185212n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m185210l0() {
        duringCreated(CoreModule.f18264c.f20347S1.m113535B3(this.f166947c, gra.m131596L3())).subscribe(psd0.m173597H(new y20() { // from class: l.o9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145598a.m185213o0((Explore) obj);
            }
        }, new y20() { // from class: l.p9l
            @Override // p153l.y20
            public final void call(Object obj) {
                s9l.m185208k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m185211m0() {
        duringCreated(CoreModule.f18264c.f20347S1.m113551R3(this.f166947c, gra.m131596L3())).subscribe(psd0.m173597H(new y20() { // from class: l.q9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156246a.m185214p0((Explore) obj);
            }
        }, new y20() { // from class: l.r9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161834a.m185215q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m185212n0() {
        qyf.m178643f().m178645e(duringCreated(CoreModule.f18264c.f20381e0.m116596o9()), act(), this.f166946b, 4132);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m185213o0(Explore explore) {
        if (!NullChecker.m82486a(explore)) {
            this.f166946b.m37361S4();
        } else {
            ((w9l) this.viewModel).f188038t = explore.can_swiped;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m185214p0(Explore explore) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(explore) && !jyb.m147479J(explore.cards)) {
            ((w9l) this.viewModel).f188038t = explore.can_swiped;
            ExploreDialogData exploreDialogData = new ExploreDialogData(explore.pop_up_icon, explore.pop_up_title, explore.pop_up_sub_title, explore.skip, explore.new_pop_up_title, explore.new_pop_up_sub_title, explore.new_pop_up_box_title, explore.new_pop_up_warning, this.f166947c);
            List<CardInfo> list = explore.cards;
            for (int i = 0; i < list.size(); i++) {
                CardInfo cardInfo = list.get(i);
                ExploreDialogData exploreDialogData2 = exploreDialogData;
                epf epfVar = new epf(cardInfo.user, cardInfo.tags, explore.tag_icon, explore.background_color, explore.tag_background_color, exploreDialogData2, null);
                exploreDialogData = exploreDialogData2;
                int i2 = explore.Remaining_swipes;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i == i2) {
                    epfVar.f95247h = true;
                } else if (i == list.size() - 1) {
                    epfVar.f95248i = true;
                }
                arrayList.add(epfVar);
            }
        }
        boolean zM147479J = jyb.m147479J(arrayList);
        V v2 = this.viewModel;
        if (zM147479J) {
            ((w9l) v2).m205596y();
        } else {
            ((w9l) v2).m205593v(arrayList);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m185215q0(Throwable th) {
        ((w9l) this.viewModel).m205596y();
    }

    /* JADX INFO: renamed from: s0 */
    public void m185216s0(boolean z) {
        if (NullChecker.m82486a(this.viewModel)) {
            ((w9l) this.viewModel).f188038t = z;
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
