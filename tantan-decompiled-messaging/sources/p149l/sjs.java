package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\n¨\u0006\u0016"}, m87232d2 = {"Ll/sjs;", "Ll/x6s;", "Ll/ho2;", "Ll/ojs;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "R3", "()V", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "V3", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "", "helpUrl", "", "height", "U3", "(Ljava/lang/String;I)V", "W3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sjs extends x6s<ho2, ojs> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjs(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m184553S3(sjs sjsVar, BLiveNewGiftSkinListData bLiveNewGiftSkinListData) {
        if (bLiveNewGiftSkinListData != null) {
            if (sjsVar.viewModel == 0) {
                Act act = sjsVar.f188513f;
                act.getClass();
                ojs ojsVar = new ojs(act, sjsVar);
                sjsVar.viewModel = ojsVar;
                ojsVar.mo21065i1(sjsVar);
            }
            if (!((ojs) sjsVar.viewModel).isShowing()) {
                ((ojs) sjsVar.viewModel).m71834E();
            }
            ((ojs) sjsVar.viewModel).m164783g0(bLiveNewGiftSkinListData);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m184554T3(sjs sjsVar, soj0 soj0Var) {
        sjsVar.m184557W3();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        m144512z2(new wjs(bsmVar));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m184555U3(@NotNull String helpUrl, int height) {
        helpUrl.getClass();
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7014).m142598B(helpUrl).m142599p(CommonH5Builder.BgType.TRAN_BG).m142603t(80).m142602s(24).m142597A(xdl0.m208412y0(), height).m142600q());
    }

    /* JADX INFO: renamed from: V3 */
    public final void m184556V3(@NotNull BLiveNewGiftSkin info) {
        info.getClass();
        m206028F2().LiveGiftSkinEventGroup.showGiftSkinDetail().mo172463j(info);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public final void m184557W3() {
        duringCreated(zfv.m218613x0((String) m129297F3(new ovj(7014)), m206027E2().m149818o(), m206027E2().mo149813j().liveMode, x350.m206896R2(m206027E2(), m206027E2().m132140j0()), w220.m201014a())).subscribe(ffw.m121197h(new e30() { // from class: l.rjs
            @Override // p149l.e30
            public final void call(Object obj) {
                sjs.m184553S3(this.f159751a, (BLiveNewGiftSkinListData) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LiveGiftSkinEventGroup.showGiftSkinList().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.qjs
            @Override // p149l.e30
            public final void call(Object obj) {
                sjs.m184554T3(this.f154987a, (soj0) obj);
            }
        }));
    }
}
