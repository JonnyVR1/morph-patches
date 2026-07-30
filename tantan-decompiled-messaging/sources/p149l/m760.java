package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m87232d2 = {"Ll/m760;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/unknown/PanelUnknownView;", "Ll/jzl;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "", "isCollapse", "Y", "(Z)V", "f1", "()Z", "Landroid/view/ViewGroup;", "root", "u", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f13930X, "", "g1", "()I", "e2", "T1", "isManager", "b0", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;", "template", "K3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;)V", "c2", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m760 extends h4t<nnn0, PanelUnknownView> implements jzl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<? extends nnn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m760(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static void m153350J3(m760 m760Var, BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        PanelUnknownView panelUnknownView = (PanelUnknownView) m760Var.viewModel;
        List<BLiveVoiceGuideTemplate> list = bLiveVoiceRoomAsset.templates;
        list.getClass();
        panelUnknownView.m77405j(list);
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo104849G0() {
        VLinear vLinear = ((PanelUnknownView) this.viewModel).f48143c;
        vLinear.getClass();
        return vLinear;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final void m153351K3(@NotNull BLiveVoiceGuideTemplate template) {
        template.getClass();
        m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(Integer.valueOf(jtl0.m143154c(template.template)));
        zvf0.m220399u("e_audio_game_panel", fbp0.m120390f(((nnn0) m206027E2()).mo97490p()), vwb.m200311Y("roomId", ((nnn0) m206027E2()).m149818o()), vwb.m200311Y("anchorId", ((nnn0) m206027E2()).m132140j0()), vwb.m200311Y("liveId", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("game_type", template.template), vwb.m200311Y("user_type", e0o0.m114325l(this)));
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo104850P1() {
        return super.mo104850P1();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((PanelUnknownView) this.viewModel).m77407r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo104853T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: Y */
    public void mo104856Y(boolean isCollapse) {
        ((PanelUnknownView) this.viewModel).m77404i(isCollapse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jzl
    /* JADX INFO: renamed from: b0 */
    public void mo104857b0(boolean isManager) {
        super.mo104857b0(isManager);
        xdl0.m208344M((View) this.viewModel, isManager);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: c2 */
    public int mo104858c2() {
        return ((PanelUnknownView) this.viewModel).getExpandViewHeight() + t100.m186890d(53.0f);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: e2 */
    public boolean mo104859e2() {
        return true;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: f1 */
    public boolean mo104860f1() {
        return false;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: g1 */
    public int mo104861g1() {
        return t6c0.f168383i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVoiceRoomAsset(strM149818o)).subscribe(ffw.m121197h(new e30() { // from class: l.l760
            @Override // p149l.e30
            public final void call(Object obj) {
                m760.m153350J3(this.f126695a, (BLiveVoiceRoomAsset) obj);
            }
        }));
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: u */
    public void mo104862u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo104862u(root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo104863x() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }
}
