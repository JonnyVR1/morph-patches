package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.qib0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j8g extends nk2 {
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    @Override // p002l.nk2
    /* JADX INFO: renamed from: f */
    public void mo10899f(final kbg kbgVar, final e30<Boolean> e30Var) {
        if (kbgVar.m25547E2().m14597r0().c(qib0.b0.a.userId())) {
            e30Var.call(Boolean.TRUE);
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentNew_ = BLiveJoinFanBaseContent.new_();
        bLiveJoinFanBaseContentNew_.userId = ypv.a.D0();
        bLiveJoinFanBaseContentNew_.anchorId = ((DbObject) kbgVar.m25547E2().m14582l0()).id;
        kbgVar.m25548F2().FansClubEntryEvent.companyFansGift().j(new ym5(kbgVar.f14272k, bLiveJoinFanBaseContentNew_.toJson(), new e30() { // from class: l.i8g
            public final void call(Object obj) {
                this.f13104a.m15773m(kbgVar, e30Var, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m15773m(kbg kbgVar, e30 e30Var, String str) {
        BLiveGiftItem bLiveGiftItem = (BLiveGiftItem) kbgVar.m14184F3(new q7g(7001));
        if (bLiveGiftItem != null) {
            m15775o(kbgVar, bLiveGiftItem);
        }
        if (!TextUtils.equals("1", str)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (bLiveGiftItem != null) {
            m15774n(kbgVar, bLiveGiftItem);
        }
        e30Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public final void m15774n(kbg kbgVar, BLiveGiftItem bLiveGiftItem) {
        axj.m10087a(kbgVar.f14273l, kbgVar.mo21430R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.id), bLiveGiftItem.name, 1, ((DbObject) kbgVar.m25547E2().m14582l0()).id, kbgVar.f14272k);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2] */
    /* JADX INFO: renamed from: o */
    public final void m15775o(kbg kbgVar, BLiveGiftItem bLiveGiftItem) {
        axj.m10088b(kbgVar.f14273l, kbgVar.mo21430R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.id), bLiveGiftItem.name, 1, ((DbObject) kbgVar.m25547E2().m14582l0()).id, kbgVar.f14272k);
    }
}
