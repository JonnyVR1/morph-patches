package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;

/* JADX INFO: loaded from: classes4.dex */
public class x9g extends vk2 {
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.oo2] */
    @Override // p153l.vk2
    /* JADX INFO: renamed from: f */
    public void mo162170f(final ycg ycgVar, final y20<Boolean> y20Var) {
        if (ycgVar.m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId())) {
            y20Var.call(Boolean.TRUE);
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentNew_ = BLiveJoinFanBaseContent.new_();
        bLiveJoinFanBaseContentNew_.userId = zrv.f205799a.m207631D0();
        bLiveJoinFanBaseContentNew_.anchorId = ycgVar.m213810E2().m168532l0().f56859id;
        ycgVar.m213811F2().FansClubEntryEvent.companyFansGift().mo199273j(new co5(ycgVar.f198505k, bLiveJoinFanBaseContentNew_.toJson(), new y20() { // from class: l.w9g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188008a.m209800m(ycgVar, y20Var, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m209800m(ycg ycgVar, y20 y20Var, String str) {
        BLiveGiftItem bLiveGiftItem = (BLiveGiftItem) ycgVar.m138856F3(new e9g(7001));
        if (bLiveGiftItem != null) {
            m209802o(ycgVar, bLiveGiftItem);
        }
        if (!TextUtils.equals("1", str)) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        if (bLiveGiftItem != null) {
            m209801n(ycgVar, bLiveGiftItem);
        }
        y20Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.oo2] */
    /* JADX INFO: renamed from: n */
    public final void m209801n(ycg ycgVar, BLiveGiftItem bLiveGiftItem) {
        qzj.m178784a(ycgVar.f198506l, ycgVar.mo78457R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.f45225id), bLiveGiftItem.name, 1, ycgVar.m213810E2().m168532l0().f56859id, ycgVar.f198505k);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.oo2] */
    /* JADX INFO: renamed from: o */
    public final void m209802o(ycg ycgVar, BLiveGiftItem bLiveGiftItem) {
        qzj.m178785b(ycgVar.f198506l, ycgVar.mo78457R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.f45225id), bLiveGiftItem.name, 1, ycgVar.m213810E2().m168532l0().f56859id, ycgVar.f198505k);
    }
}
