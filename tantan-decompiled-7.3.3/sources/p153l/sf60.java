package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\u001dR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m88121d2 = {"Ll/sf60;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/unknown/PanelUnknownView;", "Ll/d2m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "", "isCollapse", "Y", "(Z)V", "f1", "()Z", "Landroid/view/ViewGroup;", "root", "u", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f14624X, "", "g1", "()I", "e2", "T1", "isManager", "b0", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;", "template", "K3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;)V", "c2", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "getCurInfo", "()Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sf60 extends i6t<rwn0, PanelUnknownView> implements d2m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<? extends rwn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf60(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static void m185582J3(sf60 sf60Var, BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        PanelUnknownView panelUnknownView = (PanelUnknownView) sf60Var.viewModel;
        List<BLiveVoiceGuideTemplate> list = bLiveVoiceRoomAsset.templates;
        list.getClass();
        panelUnknownView.m78588j(list);
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo113707G0() {
        VLinear vLinear = ((PanelUnknownView) this.viewModel).f48991c;
        vLinear.getClass();
        return vLinear;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final void m185583K3(@NotNull BLiveVoiceGuideTemplate template) {
        template.getClass();
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(Integer.valueOf(n2m0.m161244c(template.template)));
        i4g0.m138523u("e_audio_game_panel", jkp0.m145875f(((rwn0) m213810E2()).mo118373p()), jyb.m147494Y("roomId", ((rwn0) m213810E2()).m202194o()), jyb.m147494Y("anchorId", ((rwn0) m213810E2()).m168526j0()), jyb.m147494Y("liveId", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("game_type", template.template), jyb.m147494Y("user_type", i9o0.m139140l(this)));
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo113708P1() {
        return super.mo113708P1();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((PanelUnknownView) this.viewModel).m78590r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo113709T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: Y */
    public void mo113710Y(boolean isCollapse) {
        ((PanelUnknownView) this.viewModel).m78587i(isCollapse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d2m
    /* JADX INFO: renamed from: b0 */
    public void mo113711b0(boolean isManager) {
        super.mo113711b0(isManager);
        bnl0.m105524M((View) this.viewModel, isManager);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: c2 */
    public int mo113712c2() {
        return ((PanelUnknownView) this.viewModel).getExpandViewHeight() + qa00.m175859d(53.0f);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: e2 */
    public boolean mo113713e2() {
        return true;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: f1 */
    public boolean mo113714f1() {
        return false;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: g1 */
    public int mo113715g1() {
        return yec0.f199115i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVoiceRoomAsset(strM202194o)).subscribe(dhw.m115829h(new y20() { // from class: l.rf60
            @Override // p153l.y20
            public final void call(Object obj) {
                sf60.m185582J3(this.f162763a, (BLiveVoiceRoomAsset) obj);
            }
        }));
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: u */
    public void mo113716u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo113716u(root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo113717x() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }
}
