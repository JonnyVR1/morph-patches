package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\n¨\u0006\u0016"}, m88121d2 = {"Ll/tls;", "Ll/y8s;", "Ll/oo2;", "Ll/pls;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "R3", "()V", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "", "helpUrl", "", "height", "U3", "(Ljava/lang/String;I)V", "W3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tls extends y8s<oo2, pls> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tls(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m191697S3(tls tlsVar, BLiveNewGiftSkinListData bLiveNewGiftSkinListData) {
        if (bLiveNewGiftSkinListData != null) {
            if (tlsVar.viewModel == 0) {
                Act act = tlsVar.f196919f;
                act.getClass();
                pls plsVar = new pls(act, tlsVar);
                tlsVar.viewModel = plsVar;
                plsVar.mo22064i1(tlsVar);
            }
            if (!((pls) tlsVar.viewModel).isShowing()) {
                ((pls) tlsVar.viewModel).m73017E();
            }
            ((pls) tlsVar.viewModel).m172880g0(bLiveNewGiftSkinListData);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m191698T3(tls tlsVar, vxj0 vxj0Var) {
        tlsVar.m191701W3();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        m153103z2(new xls(dumVar));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m191699U3(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7014).m174141B(helpUrl).m174142p(CommonH5Builder.BgType.TRAN_BG).m174146t(80).m174145s(24).m174140A(bnl0.m105592y0(), height).m174143q());
    }

    /* JADX INFO: renamed from: V3 */
    public final void m191700V3(@NotNull BLiveNewGiftSkin info) {
        info.getClass();
        m213811F2().LiveGiftSkinEventGroup.showGiftSkinDetail().mo199273j(info);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public final void m191701W3() {
        duringCreated(aiv.m98147x0((String) m138856F3(new eyj(7014)), m213810E2().m202194o(), m213810E2().mo183435j().liveMode, mc50.m157912R2(m213810E2(), m213810E2().m168526j0()), eb20.m120148a())).subscribe(dhw.m115829h(new y20() { // from class: l.sls
            @Override // p153l.y20
            public final void call(Object obj) {
                tls.m191697S3(this.f169457a, (BLiveNewGiftSkinListData) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LiveGiftSkinEventGroup.showGiftSkinList().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.rls
            @Override // p153l.y20
            public final void call(Object obj) {
                tls.m191698T3(this.f163799a, (vxj0) obj);
            }
        }));
    }
}
