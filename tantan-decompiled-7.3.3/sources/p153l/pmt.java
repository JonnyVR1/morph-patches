package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import p151v.VEditText;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class pmt extends klt<rnt> {

    /* JADX INFO: renamed from: f */
    public String f153228f;

    /* JADX INFO: renamed from: g */
    public kcg0 f153229g;

    public pmt(ner nerVar, imt imtVar, VRecyclerView vRecyclerView, VText vText, VEditText vEditText) {
        super(nerVar, imtVar);
        this.f153228f = null;
        mo52715C(new rnt(this, vRecyclerView, vText, vEditText));
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ void m172963I2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            o1j0.m165649w(R$string.f45033m);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m172964K2(Followship followship) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m172967Q2(String str) {
        ((rnt) this.viewModel).m182344p(str);
    }

    /* JADX INFO: renamed from: L0 */
    public void m172968L0(String str, String str2) {
        mbs.m157862k0(act(), str, "anchor-search", true);
        m150393D2().LiveSearchHistoryEvent.addRecord().mo199273j(str2);
    }

    /* JADX INFO: renamed from: N2 */
    public void m172969N2(BLiveAbsData bLiveAbsData, String str) {
        act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68776D(bLiveAbsData).m68787O("anchor-search").m68798y(bLiveAbsData.recommendInfo.category).m68794u()));
        m150393D2().LiveSearchHistoryEvent.addRecord().mo199273j(str);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m172970P2(User user) {
        ((rnt) this.viewModel).m182342H(user);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m172971R2(LiveAnchorsInfo liveAnchorsInfo) {
        ((rnt) this.viewModel).m182341G(liveAnchorsInfo);
        m150393D2().LiveSearchEvent.onSearchResult().mo199273j(liveAnchorsInfo);
    }

    /* JADX INFO: renamed from: S2 */
    public void m172972S2(jlt jltVar) {
        duringCreated(jltVar.m146106I("anchorSearch", "anchorSearch")).subscribe(dhw.m115826e(new y20() { // from class: l.nmt
            @Override // p153l.y20
            public final void call(Object obj) {
                pmt.m172964K2((Followship) obj);
            }
        }, new y20() { // from class: l.omt
            @Override // p153l.y20
            public final void call(Object obj) {
                pmt.m172963I2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((fk3) tbs.m190077m(itd0.f116820b)).m125961l()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.jmt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121709a.m172970P2((User) obj);
            }
        }));
        duringCreated(m150393D2().LiveSearchEvent.changeText().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kmt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127533a.m172967Q2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public void m172973T2(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService) || ((TantanException.Client.CoreService) th).code != 41037) {
            m150393D2().LiveSearchEvent.onSearchResult().mo199273j(null);
            return;
        }
        LiveAnchorsInfo liveAnchorsInfoEmptyInfo = LiveAnchorsInfo.emptyInfo();
        ((rnt) this.viewModel).m182341G(liveAnchorsInfoEmptyInfo);
        m150393D2().LiveSearchEvent.onSearchResult().mo199273j(liveAnchorsInfoEmptyInfo);
    }

    /* JADX INFO: renamed from: U2 */
    public void m172974U2() {
        String str = this.f153228f;
        if (str != null) {
            m172975V2(str);
        }
    }

    /* JADX INFO: renamed from: V2 */
    public void m172975V2(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        this.f153228f = strTrim;
        psd0.m173633z(this.f153229g);
        m150393D2().LiveSearchEvent.onTextChanged().mo199273j(charSequence);
        if (TextUtils.isEmpty(strTrim)) {
            ((rnt) this.viewModel).m182340F();
        } else {
            this.f153229g = duringCreated(LiveSquareApi.getSearchResult(strTrim)).subscribe(dhw.m115826e(new y20() { // from class: l.lmt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132717a.m172971R2((LiveAnchorsInfo) obj);
                }
            }, new y20() { // from class: l.mmt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f137634a.m172973T2((Throwable) obj);
                }
            }));
        }
    }
}
