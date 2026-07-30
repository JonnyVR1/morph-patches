package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CardInfo;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p046p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class c7l extends jq2<g7l> {

    /* JADX INFO: renamed from: a */
    public hof f79626a;

    /* JADX INFO: renamed from: b */
    public HomeExploreFrag f79627b;

    /* JADX INFO: renamed from: c */
    public final String f79628c;

    public c7l(HomeExploreFrag homeExploreFrag, String str) {
        super(homeExploreFrag);
        this.f79627b = homeExploreFrag;
        this.f79628c = str;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m105583j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m105584k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m105585r0(C4319c c4319c) {
        m105586l0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.lifecycleProviderImpl.lifecycle().filter(new w9j() { // from class: l.v6l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.w6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184931a.m105585r0((C4319c) obj);
            }
        }, new e30() { // from class: l.x6l
            @Override // p149l.e30
            public final void call(Object obj) {
                c7l.m105583j0((Throwable) obj);
            }
        }));
        m105587m0();
        m105588n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m105586l0() {
        duringCreated(CoreModule.f17545c.f19605S1.m200711B3(this.f79628c, upa.m194665L3())).subscribe(mkd0.m154956H(new e30() { // from class: l.y6l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196576a.m105589o0((Explore) obj);
            }
        }, new e30() { // from class: l.z6l
            @Override // p149l.e30
            public final void call(Object obj) {
                c7l.m105584k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m105587m0() {
        duringCreated(CoreModule.f17545c.f19605S1.m200727R3(this.f79628c, upa.m194665L3())).subscribe(mkd0.m154956H(new e30() { // from class: l.a7l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67936a.m105590p0((Explore) obj);
            }
        }, new e30() { // from class: l.b7l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73999a.m105591q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m105588n0() {
        cxf.m109094f().m109096e(duringCreated(CoreModule.f17545c.f19639e0.m169523o9()), act(), this.f79627b, 4132);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m105589o0(Explore explore) {
        if (!NullChecker.m81303a(explore)) {
            this.f79627b.m36358S4();
        } else {
            ((g7l) this.viewModel).f101411t = explore.can_swiped;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m105590p0(Explore explore) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(explore) && !vwb.m200296J(explore.cards)) {
            ((g7l) this.viewModel).f101411t = explore.can_swiped;
            ExploreDialogData exploreDialogData = new ExploreDialogData(explore.pop_up_icon, explore.pop_up_title, explore.pop_up_sub_title, explore.skip, explore.new_pop_up_title, explore.new_pop_up_sub_title, explore.new_pop_up_box_title, explore.new_pop_up_warning, this.f79628c);
            List<CardInfo> list = explore.cards;
            for (int i = 0; i < list.size(); i++) {
                CardInfo cardInfo = list.get(i);
                ExploreDialogData exploreDialogData2 = exploreDialogData;
                xnf xnfVar = new xnf(cardInfo.user, cardInfo.tags, explore.tag_icon, explore.background_color, explore.tag_background_color, exploreDialogData2, null);
                exploreDialogData = exploreDialogData2;
                int i2 = explore.Remaining_swipes;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i == i2) {
                    xnfVar.f193678h = true;
                } else if (i == list.size() - 1) {
                    xnfVar.f193679i = true;
                }
                arrayList.add(xnfVar);
            }
        }
        boolean zM200296J = vwb.m200296J(arrayList);
        V v2 = this.viewModel;
        if (zM200296J) {
            ((g7l) v2).m124715y();
        } else {
            ((g7l) v2).m124712v(arrayList);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m105591q0(Throwable th) {
        ((g7l) this.viewModel).m124715y();
    }

    /* JADX INFO: renamed from: s0 */
    public void m105592s0(boolean z) {
        if (NullChecker.m81303a(this.viewModel)) {
            ((g7l) this.viewModel).f101411t = z;
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
