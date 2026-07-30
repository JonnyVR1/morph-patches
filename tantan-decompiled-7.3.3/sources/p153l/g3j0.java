package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveBottomPopup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class g3j0 extends y8s<oo2, z2j0> {
    public g3j0(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new z2j0(act(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m128736a4(vxj0 vxj0Var) {
        m128737d4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    private void m128737d4() {
        duringCreated(LivingNormalApiProvider.m72603b6(true, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.f3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96995a.m128740Z3((BLiveSuperChatDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m128738X3(uxj0 uxj0Var) {
        ((z2j0) this.viewModel).mo73021p();
        r1j0.m179420g("提交成功，审核通过即可展示，审核失败需重新发送。");
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m128739Y3(Throwable th) {
        ((z2j0) this.viewModel).mo73021p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m128740Z3(BLiveSuperChatDetail bLiveSuperChatDetail) {
        ((z2j0) this.viewModel).m218444c0(bLiveSuperChatDetail);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m128741b4(LongLinkLiveBottomPopup.VideoLiveToast videoLiveToast) {
        if (videoLiveToast.getRoomId().equals(m213810E2().m202194o())) {
            r1j0.m179420g(videoLiveToast.getToast());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    public void m128742c4(String str, String str2) {
        duringCreated(geu.m130029b(true, m213810E2().m168526j0(), str, eb20.m120148a(), str2, m213810E2().m202194o(), m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.d3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84912a.m128738X3((uxj0) obj);
            }
        }, new y20() { // from class: l.e3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91977a.m128739Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().TopChatEventGroup.openTopChatDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.b3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74782a.m128736a4((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71699b2).subscribe(dhw.m115829h(new y20() { // from class: l.c3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79627a.m128741b4((LongLinkLiveBottomPopup.VideoLiveToast) obj);
            }
        }));
    }
}
