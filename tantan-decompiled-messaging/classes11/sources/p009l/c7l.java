package p009l;

import com.p000p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p000p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CardInfo;
import com.p1.mobile.putong.core.data.Explore;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cxf;
import l.e30;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.upa;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c7l extends jq2<g7l> {

    /* JADX INFO: renamed from: a */
    public hof f10451a;

    /* JADX INFO: renamed from: b */
    public HomeExploreFrag f10452b;

    /* JADX INFO: renamed from: c */
    public final String f10453c;

    public c7l(HomeExploreFrag homeExploreFrag, String str) {
        super(homeExploreFrag);
        this.f10452b = homeExploreFrag;
        this.f10453c = str;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m12393j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m12394k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m12395r0(c cVar) {
        m12397l0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m12396a0() {
        super.a0();
        ((jq2) this).lifecycleProviderImpl.lifecycle().filter(new w9j() { // from class: l.v6l
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.w6l
            public final void call(Object obj) {
                this.f21925a.m12395r0((c) obj);
            }
        }, new e30() { // from class: l.x6l
            public final void call(Object obj) {
                c7l.m12393j0((Throwable) obj);
            }
        }));
        m12398m0();
        m12399n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m12397l0() {
        duringCreated(CoreModule.c.S1.B3(this.f10453c, upa.L3())).subscribe(mkd0.H(new e30() { // from class: l.y6l
            public final void call(Object obj) {
                this.f22910a.m12400o0((Explore) obj);
            }
        }, new e30() { // from class: l.z6l
            public final void call(Object obj) {
                c7l.m12394k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m12398m0() {
        duringCreated(CoreModule.c.S1.R3(this.f10453c, upa.L3())).subscribe(mkd0.H(new e30() { // from class: l.a7l
            public final void call(Object obj) {
                this.f9322a.m12401p0((Explore) obj);
            }
        }, new e30() { // from class: l.b7l
            public final void call(Object obj) {
                this.f9945a.m12402q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m12399n0() {
        cxf.f().e(duringCreated(CoreModule.c.e0.o9()), act(), this.f10452b, 4132);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m12400o0(Explore explore) {
        if (!NullChecker.a(explore)) {
            this.f10452b.m285S4();
        } else {
            ((g7l) ((jq2) this).viewModel).f13361t = explore.can_swiped;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m12401p0(Explore explore) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(explore) && !vwb.J(explore.cards)) {
            ((g7l) ((jq2) this).viewModel).f13361t = explore.can_swiped;
            ExploreDialogData exploreDialogData = new ExploreDialogData(explore.pop_up_icon, explore.pop_up_title, explore.pop_up_sub_title, explore.skip, explore.new_pop_up_title, explore.new_pop_up_sub_title, explore.new_pop_up_box_title, explore.new_pop_up_warning, this.f10453c);
            List list = explore.cards;
            for (int i = 0; i < list.size(); i++) {
                CardInfo cardInfo = (CardInfo) list.get(i);
                ExploreDialogData exploreDialogData2 = exploreDialogData;
                xnf xnfVar = new xnf(cardInfo.user, cardInfo.tags, explore.tag_icon, explore.background_color, explore.tag_background_color, exploreDialogData2, null);
                exploreDialogData = exploreDialogData2;
                int i2 = explore.Remaining_swipes;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i == i2) {
                    xnfVar.f22660h = true;
                } else if (i == list.size() - 1) {
                    xnfVar.f22661i = true;
                }
                arrayList.add(xnfVar);
            }
        }
        boolean zJ = vwb.J(arrayList);
        s7m s7mVar = ((jq2) this).viewModel;
        if (zJ) {
            ((g7l) s7mVar).m14820y();
        } else {
            ((g7l) s7mVar).m14817v(arrayList);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m12402q0(Throwable th) {
        ((g7l) ((jq2) this).viewModel).m14820y();
    }

    /* JADX INFO: renamed from: s0 */
    public void m12403s0(boolean z) {
        if (NullChecker.a(((jq2) this).viewModel)) {
            ((g7l) ((jq2) this).viewModel).f13361t = z;
        }
    }

    public void destroy() {
    }
}
