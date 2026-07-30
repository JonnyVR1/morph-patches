package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import p147v.VEditText;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class okt extends jjt<plt> {

    /* JADX INFO: renamed from: f */
    public String f144459f;

    /* JADX INFO: renamed from: g */
    public c4g0 f144460g;

    public okt(mcr mcrVar, hkt hktVar, VRecyclerView vRecyclerView, VText vText, VEditText vEditText) {
        super(mcrVar, hktVar);
        this.f144459f = null;
        mo51532C(new plt(this, vRecyclerView, vText, vEditText));
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ void m164892I2(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isFollowForbidden()) {
            lsi0.m151593w(R$string.f44185m);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m164893K2(Followship followship) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m164896Q2(String str) {
        ((plt) this.viewModel).m170278p(str);
    }

    /* JADX INFO: renamed from: L0 */
    public void m164897L0(String str, String str2) {
        l9s.m149085k0(act(), str, "anchor-search", true);
        m141814D2().LiveSearchHistoryEvent.addRecord().mo172463j(str2);
    }

    /* JADX INFO: renamed from: N2 */
    public void m164898N2(BLiveAbsData bLiveAbsData, String str) {
        act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67593D(bLiveAbsData).m67604O("anchor-search").m67615y(bLiveAbsData.recommendInfo.category).m67611u()));
        m141814D2().LiveSearchHistoryEvent.addRecord().mo172463j(str);
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m164899P2(User user) {
        ((plt) this.viewModel).m170276H(user);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m164900R2(LiveAnchorsInfo liveAnchorsInfo) {
        ((plt) this.viewModel).m170275G(liveAnchorsInfo);
        m141814D2().LiveSearchEvent.onSearchResult().mo172463j(liveAnchorsInfo);
    }

    /* JADX INFO: renamed from: S2 */
    public void m164901S2(ijt ijtVar) {
        duringCreated(ijtVar.m136742I("anchorSearch", "anchorSearch")).subscribe(ffw.m121194e(new e30() { // from class: l.mkt
            @Override // p149l.e30
            public final void call(Object obj) {
                okt.m164893K2((Followship) obj);
            }
        }, new e30() { // from class: l.nkt
            @Override // p149l.e30
            public final void call(Object obj) {
                okt.m164892I2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((nj3) s9s.m182763m(gld0.f103312b)).m159630l()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.ikt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113724a.m164899P2((User) obj);
            }
        }));
        duringCreated(m141814D2().LiveSearchEvent.changeText().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jkt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118411a.m164896Q2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public void m164902T2(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService) || ((TantanException.Client.CoreService) th).code != 41037) {
            m141814D2().LiveSearchEvent.onSearchResult().mo172463j(null);
            return;
        }
        LiveAnchorsInfo liveAnchorsInfoEmptyInfo = LiveAnchorsInfo.emptyInfo();
        ((plt) this.viewModel).m170275G(liveAnchorsInfoEmptyInfo);
        m141814D2().LiveSearchEvent.onSearchResult().mo172463j(liveAnchorsInfoEmptyInfo);
    }

    /* JADX INFO: renamed from: U2 */
    public void m164903U2() {
        String str = this.f144459f;
        if (str != null) {
            m164904V2(str);
        }
    }

    /* JADX INFO: renamed from: V2 */
    public void m164904V2(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        this.f144459f = strTrim;
        mkd0.m154992z(this.f144460g);
        m141814D2().LiveSearchEvent.onTextChanged().mo172463j(charSequence);
        if (TextUtils.isEmpty(strTrim)) {
            ((plt) this.viewModel).m170274F();
        } else {
            this.f144460g = duringCreated(LiveSquareApi.getSearchResult(strTrim)).subscribe(ffw.m121194e(new e30() { // from class: l.kkt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123596a.m164900R2((LiveAnchorsInfo) obj);
                }
            }, new e30() { // from class: l.lkt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128600a.m164902T2((Throwable) obj);
                }
            }));
        }
    }
}
