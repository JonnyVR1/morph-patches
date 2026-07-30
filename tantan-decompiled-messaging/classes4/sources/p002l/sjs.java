package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import kotlin.Metadata;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Ll/sjs;", "Ll/x6s;", "Ll/ho2;", "Ll/ojs;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "R3", "()V", "t", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "", "helpUrl", "", "height", "U3", "(Ljava/lang/String;I)V", "W3", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sjs extends x6s<ho2, ojs> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjs(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m22491S3(sjs sjsVar, BLiveNewGiftSkinListData bLiveNewGiftSkinListData) {
        if (bLiveNewGiftSkinListData != null) {
            if (((bwr) sjsVar).viewModel == null) {
                Act act = sjsVar.f22037f;
                act.getClass();
                ojs ojsVar = new ojs(act, sjsVar);
                ((bwr) sjsVar).viewModel = ojsVar;
                ojsVar.mo5212i1(sjsVar);
            }
            if (!((ojs) ((bwr) sjsVar).viewModel).isShowing()) {
                ((ojs) ((bwr) sjsVar).viewModel).m5211E();
            }
            ((ojs) ((bwr) sjsVar).viewModel).m19592g0(bLiveNewGiftSkinListData);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m22492T3(sjs sjsVar, soj0 soj0Var) {
        sjsVar.m22495W3();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        super.mo9823R3();
        bsm<? extends T> bsmVar = this.f22036e;
        bsmVar.getClass();
        z2(new wjs(bsmVar));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m22493U3(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m25548F2().OpenH5Event.open().j(jp50.m16064c(7014).m16094B(helpUrl).m16095p(CommonH5Builder.BgType.TRAN_BG).m16099t(80).m16098s(24).m16093A(xdl0.y0(), height).m16096q());
    }

    /* JADX INFO: renamed from: V3 */
    public final void m22494V3(@NotNull BLiveNewGiftSkin info) {
        info.getClass();
        m25548F2().LiveGiftSkinEventGroup.showGiftSkinDetail().j(info);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public final void m22495W3() {
        duringCreated(zfv.m27316x0((String) m14184F3(new ovj(7014)), m25547E2().m17239o(), m25547E2().m17234j().liveMode, x350.m25673R2(m25547E2(), m25547E2().m14576j0()), w220.m24290a())).subscribe(ffw.h(new e30() { // from class: l.rjs
            public final void call(Object obj) {
                sjs.m22491S3(this.f18568a, (BLiveNewGiftSkinListData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m22496t() {
        super.t();
        duringCreated((c) m25548F2().LiveGiftSkinEventGroup.showGiftSkinList().g()).subscribe(ffw.h(new e30() { // from class: l.qjs
            public final void call(Object obj) {
                sjs.m22492T3(this.f18015a, (soj0) obj);
            }
        }));
    }
}
