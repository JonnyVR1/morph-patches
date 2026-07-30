package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;

/* JADX INFO: loaded from: classes4.dex */
public class j8g extends nk2 {
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    @Override // p149l.nk2
    /* JADX INFO: renamed from: f */
    public void mo105792f(final kbg kbgVar, final e30<Boolean> e30Var) {
        if (kbgVar.m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId())) {
            e30Var.call(Boolean.TRUE);
            return;
        }
        BLiveJoinFanBaseContent bLiveJoinFanBaseContentNew_ = BLiveJoinFanBaseContent.new_();
        bLiveJoinFanBaseContentNew_.userId = ypv.f199493a.m199309D0();
        bLiveJoinFanBaseContentNew_.anchorId = kbgVar.m206027E2().m132146l0().f56011id;
        kbgVar.m206028F2().FansClubEntryEvent.companyFansGift().mo172463j(new ym5(kbgVar.f122236k, bLiveJoinFanBaseContentNew_.toJson(), new e30() { // from class: l.i8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112036a.m140204m(kbgVar, e30Var, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m140204m(kbg kbgVar, e30 e30Var, String str) {
        BLiveGiftItem bLiveGiftItem = (BLiveGiftItem) kbgVar.m129297F3(new q7g(7001));
        if (bLiveGiftItem != null) {
            m140206o(kbgVar, bLiveGiftItem);
        }
        if (!TextUtils.equals("1", str)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (bLiveGiftItem != null) {
            m140205n(kbgVar, bLiveGiftItem);
        }
        e30Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public final void m140205n(kbg kbgVar, BLiveGiftItem bLiveGiftItem) {
        axj.m99427a(kbgVar.f122237l, kbgVar.mo77274R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.f44377id), bLiveGiftItem.name, 1, kbgVar.m206027E2().m132146l0().f56011id, kbgVar.f122236k);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [l.ho2] */
    /* JADX INFO: renamed from: o */
    public final void m140206o(kbg kbgVar, BLiveGiftItem bLiveGiftItem) {
        axj.m99428b(kbgVar.f122237l, kbgVar.mo77274R2(), "fans_club_accompany", String.valueOf(bLiveGiftItem.f44377id), bLiveGiftItem.name, 1, kbgVar.m206027E2().m132146l0().f56011id, kbgVar.f122236k);
    }
}
