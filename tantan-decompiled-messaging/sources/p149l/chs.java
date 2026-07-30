package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class chs<T extends ho2> extends x6s<T, GiftUserInfoView> {
    public chs(bsm<? extends T> bsmVar, GiftUserInfoView giftUserInfoView) {
        super(bsmVar);
        mo51532C(giftUserInfoView);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T3 */
    public void m106988T3(mlj mljVar) {
        String str = mljVar.f134444e.f111520a;
        q44 q44Var = mljVar.f134445f;
        String str2 = q44Var.f152537a;
        k980 k980Var = new k980(TextUtils.equals(str, m206027E2().m132146l0().f56011id) ? m206027E2().m149814k() : str2, q44Var.f152538b, str);
        if (mljVar.m155157f()) {
            k980Var.f121921d = mljVar.f134445f.f152542f;
            k980Var.f121918a = str2;
        }
        m206028F2().PlugPubEvent.openContributeDialog().mo172463j(k980Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public void m106989U3(String str, String str2) {
        if (m206027E2().mo149813j().isVoiceLive()) {
            u4n0.m191752k(this, m206027E2().m132146l0().f56011id, str);
        } else {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(700).userId(str).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 700)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 700)).setScene("live").setSource("gift").giftSource(str2).trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ mlj m106990V3(nfs nfsVar) {
        return ((GiftUserInfoView) this.viewModel).getCurrentGiftCallInfo();
    }

    /* JADX INFO: renamed from: W3 */
    public void m106991W3(fp50 fp50Var) {
        m206028F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().mo172463j(fp50Var);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(nfs.class, new w9j() { // from class: l.bhs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75658a.m106990V3((nfs) obj);
            }
        });
    }
}
