package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.u4n0;
import l.w9j;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class chs<T extends ho2> extends x6s<T, GiftUserInfoView> {
    public chs(bsm<? extends T> bsmVar, GiftUserInfoView giftUserInfoView) {
        super(bsmVar);
        C(giftUserInfoView);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T3 */
    public void m11049T3(mlj mljVar) {
        String str = mljVar.f15446e.a;
        q44 q44Var = mljVar.f15447f;
        String str2 = q44Var.f17800a;
        k980 k980Var = new k980(TextUtils.equals(str, ((DbObject) m25547E2().m14582l0()).id) ? m25547E2().m17235k() : str2, q44Var.f17801b, str);
        if (mljVar.m18006f()) {
            k980Var.f14258d = mljVar.f15447f.f17805f;
            k980Var.f14255a = str2;
        }
        m25548F2().PlugPubEvent.openContributeDialog().j(k980Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public void m11050U3(String str, String str2) {
        if (m25547E2().m17234j().isVoiceLive()) {
            u4n0.k(this, ((DbObject) m25547E2().m14582l0()).id, str);
        } else {
            m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(700).userId(str).setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, str, 700)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, str, 700)).setScene("live").setSource("gift").giftSource(str2).trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ mlj m11051V3(nfs nfsVar) {
        return ((GiftUserInfoView) ((bwr) this).viewModel).getCurrentGiftCallInfo();
    }

    /* JADX INFO: renamed from: W3 */
    public void m11052W3(fp50 fp50Var) {
        m25548F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().j(fp50Var);
    }

    /* JADX INFO: renamed from: t */
    public void m11053t() {
        super.t();
        m14188d3(nfs.class, new w9j() { // from class: l.bhs
            public final Object call(Object obj) {
                return this.f8147a.m11051V3((nfs) obj);
            }
        });
    }
}
