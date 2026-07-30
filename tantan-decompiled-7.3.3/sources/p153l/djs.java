package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class djs<T extends oo2> extends y8s<T, GiftUserInfoView> {
    public djs(dum<? extends T> dumVar, GiftUserInfoView giftUserInfoView) {
        super(dumVar);
        mo52715C(giftUserInfoView);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: T3 */
    public void m116150T3(coj cojVar) {
        String str = cojVar.f82889e.f107997a;
        p54 p54Var = cojVar.f82890f;
        String str2 = p54Var.f150592a;
        qh80 qh80Var = new qh80(TextUtils.equals(str, m213810E2().m168532l0().f56859id) ? m213810E2().m202191k() : str2, p54Var.f150593b, str);
        if (cojVar.m111664f()) {
            qh80Var.f157519d = cojVar.f82890f.f150597f;
            qh80Var.f157516a = str2;
        }
        m213811F2().PlugPubEvent.openContributeDialog().mo199273j(qh80Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    public void m116151U3(String str, String str2) {
        if (m213810E2().mo183435j().isVoiceLive()) {
            ydn0.m215258k(this, m213810E2().m168532l0().f56859id, str);
        } else {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(700).userId(str).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 700)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 700)).setScene("live").setSource("gift").giftSource(str2).trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ coj m116152V3(ohs ohsVar) {
        return ((GiftUserInfoView) this.viewModel).getCurrentGiftCallInfo();
    }

    /* JADX INFO: renamed from: W3 */
    public void m116153W3(lx50 lx50Var) {
        m213811F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().mo199273j(lx50Var);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(ohs.class, new qcj() { // from class: l.cjs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82211a.m116152V3((ohs) obj);
            }
        });
    }
}
