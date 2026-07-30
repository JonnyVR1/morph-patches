package p153l;

import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class tmt extends klt<vmt> {
    public tmt(ner nerVar, imt imtVar, LinearLayout linearLayout, VRecyclerView vRecyclerView) {
        super(nerVar, imtVar);
        mo52715C(new vmt(linearLayout, vRecyclerView));
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m191809I2(List list) {
        ((vmt) this.viewModel).m201771b(list);
    }

    /* JADX INFO: renamed from: K2 */
    public void m191810K2(mr2 mr2Var) {
        BLiveAbsData bLiveAbsData = mr2Var.f138293c;
        if (!NullChecker.m82486a(bLiveAbsData) || (!TEnum.equals(bLiveAbsData.state, "onlive") && !TEnum.equals(bLiveAbsData.state, "suspended"))) {
            gnt.m130985e(mr2Var.f138293c.anchor.f45267id, false);
            mbs.m157862k0(act(), mr2Var.f138291a.f56859id, "anchor-search", true);
        } else {
            act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68776D(bLiveAbsData).m68787O("live-activity").m68794u()));
            gnt.m130989i("p_live_search", mr2Var.f138293c, 0, "recent_browsing");
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        fdn.Companion companion = fdn.INSTANCE;
        duringCreated(companion.m125126v() ? companion.m125120m(mbs.m157870o0()) : LiveSquareApi.getBrowseHistory(mbs.m157870o0())).subscribe(dhw.m115829h(new y20() { // from class: l.smt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169612a.m191809I2((List) obj);
            }
        }));
    }
}
