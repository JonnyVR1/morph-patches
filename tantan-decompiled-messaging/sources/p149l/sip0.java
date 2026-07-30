package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy.VirtualWebPanelView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/sip0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/spy/VirtualWebPanelView;", "Ll/jzl;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "url", "N3", "(Ljava/lang/String;)V", "", "isCollapse", "Y", "(Z)V", "", "g1", "()I", "Landroid/view/View;", "T1", "()Landroid/view/View;", "G0", BaseSei.f13930X, RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class sip0 extends h4t<nnn0, VirtualWebPanelView> implements jzl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<? extends nnn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sip0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static void m184346J3(sip0 sip0Var, String str, AuthData authData) {
        authData.getClass();
        VirtualWebPanelView virtualWebPanelView = (VirtualWebPanelView) sip0Var.viewModel;
        String str2 = authData.accessToken;
        str2.getClass();
        virtualWebPanelView.m77384o0(str2, str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m184347K3(sip0 sip0Var, String str, Throwable th) {
        th.getClass();
        ((VirtualWebPanelView) sip0Var.viewModel).m77384o0("", str);
        hfw.m130790a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: L3 */
    public static void m184348L3(sip0 sip0Var, BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        String str = bLiveVoiceRoomAsset.undercoverEntranceUrl;
        str.getClass();
        sip0Var.m184350N3(str);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m184349M3(sip0 sip0Var, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15548i) {
            ((VirtualWebPanelView) sip0Var.viewModel).m77386q0();
        } else if (c4319c == C4319c.f15549j) {
            ((VirtualWebPanelView) sip0Var.viewModel).m77385p0();
        }
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo104849G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((VirtualWebPanelView) this.viewModel).f48087f;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m184350N3(@NotNull final String url) {
        url.getClass();
        if (jkp0.m141904d(url)) {
            duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.qip0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sip0.m184346J3(this.f154791a, url, (AuthData) obj);
                }
            }, new e30() { // from class: l.rip0
                @Override // p149l.e30
                public final void call(Object obj) {
                    sip0.m184347K3(this.f159575a, url, (Throwable) obj);
                }
            }));
        } else {
            ((VirtualWebPanelView) this.viewModel).m77384o0("", url);
        }
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo104850P1() {
        return super.mo104850P1();
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
        ((VirtualWebPanelView) this.viewModel).m77383m0(isCollapse);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ void mo104857b0(boolean z) {
        super.mo104857b0(z);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo104858c2() {
        return super.mo104858c2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo104859e2() {
        return super.mo104859e2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo104860f1() {
        return super.mo104860f1();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: g1 */
    public int mo104861g1() {
        return t6c0.f168194T6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VirtualWebPanelView) this.viewModel).m77387r();
        duringCreated(((nnn0) m206027E2()).m160264b3(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.oip0
            @Override // p149l.e30
            public final void call(Object obj) {
                sip0.m184348L3(this.f144146a, (BLiveVoiceRoomAsset) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.pip0
            @Override // p149l.e30
            public final void call(Object obj) {
                sip0.m184349M3(this.f149672a, (C4319c) obj);
            }
        }));
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: u */
    public /* bridge */ void mo104862u(@NotNull ViewGroup viewGroup) {
        super.mo104862u(viewGroup);
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo104863x() {
        FrameLayout frameLayout = ((VirtualWebPanelView) this.viewModel).f48088g;
        frameLayout.getClass();
        return frameLayout;
    }
}
