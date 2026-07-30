package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class cui0 extends x6s<ho2, vti0> {
    public cui0(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new vti0(act(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m108777a4(soj0 soj0Var) {
        m108778d4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    private void m108778d4() {
        duringCreated(LivingNormalApiProvider.m71420b6(true, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.bui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77326a.m108781Z3((BLiveSuperChatDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m108779X3(roj0 roj0Var) {
        ((vti0) this.viewModel).mo71838p();
        osi0.m165783g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m108780Y3(Throwable th) {
        ((vti0) this.viewModel).mo71838p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m108781Z3(BLiveSuperChatDetail bLiveSuperChatDetail) {
        ((vti0) this.viewModel).m200027c0(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m108782b4(LongLinkLiveBottomPopup.VideoLiveToast videoLiveToast) {
        if (videoLiveToast.getRoomId().equals(m206027E2().m149818o())) {
            osi0.m165783g(videoLiveToast.getToast());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public void m108783c4(String str, String str2) {
        duringCreated(fcu.m120464b(true, m206027E2().m132140j0(), str, w220.m201014a(), str2, m206027E2().m149818o(), m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.zti0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204728a.m108779X3((roj0) obj);
            }
        }, new e30() { // from class: l.aui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71779a.m108780Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().TopChatEventGroup.openTopChatDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xti0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194392a.m108777a4((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170432b2).subscribe(ffw.m121197h(new e30() { // from class: l.yti0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199950a.m108782b4((LongLinkLiveBottomPopup.VideoLiveToast) obj);
            }
        }));
    }
}
