package p149l;

import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class skt extends jjt<ukt> {
    public skt(mcr mcrVar, hkt hktVar, LinearLayout linearLayout, VRecyclerView vRecyclerView) {
        super(mcrVar, hktVar);
        mo51532C(new ukt(linearLayout, vRecyclerView));
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m184616I2(List list) {
        ((ukt) this.viewModel).m194179b(list);
    }

    /* JADX INFO: renamed from: K2 */
    public void m184617K2(wq2 wq2Var) {
        BLiveAbsData bLiveAbsData = wq2Var.f187610c;
        if (!NullChecker.m81303a(bLiveAbsData) || (!TEnum.equals(bLiveAbsData.state, "onlive") && !TEnum.equals(bLiveAbsData.state, "suspended"))) {
            flt.m122094e(wq2Var.f187610c.anchor.f44419id, false);
            l9s.m149085k0(act(), wq2Var.f187608a.f56011id, "anchor-search", true);
        } else {
            act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67593D(bLiveAbsData).m67604O("live-activity").m67611u()));
            flt.m122098i("p_live_search", wq2Var.f187610c, 0, "recent_browsing");
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        fbn.Companion companion = fbn.INSTANCE;
        duringCreated(companion.m120382v() ? companion.m120376m(l9s.m149093o0()) : LiveSquareApi.getBrowseHistory(l9s.m149093o0())).subscribe(ffw.m121197h(new e30() { // from class: l.rkt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159882a.m184616I2((List) obj);
            }
        }));
    }
}
