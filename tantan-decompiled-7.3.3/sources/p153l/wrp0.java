package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy.VirtualWebPanelView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/wrp0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/spy/VirtualWebPanelView;", "Ll/d2m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "url", "N3", "(Ljava/lang/String;)V", "", "isCollapse", "Y", "(Z)V", "", "g1", "()I", "Landroid/view/View;", "T1", "()Landroid/view/View;", "G0", BaseSei.f14624X, RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "getCurInfo", "()Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wrp0 extends i6t<rwn0, VirtualWebPanelView> implements d2m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<? extends rwn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrp0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static void m207609J3(wrp0 wrp0Var, String str, AuthData authData) {
        authData.getClass();
        VirtualWebPanelView virtualWebPanelView = (VirtualWebPanelView) wrp0Var.viewModel;
        String str2 = authData.accessToken;
        str2.getClass();
        virtualWebPanelView.m78567o0(str2, str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m207610K3(wrp0 wrp0Var, String str, Throwable th) {
        th.getClass();
        ((VirtualWebPanelView) wrp0Var.viewModel).m78567o0("", str);
        fhw.m125605a("[live]webDialog", "accessOutterToken" + th.getMessage());
    }

    /* JADX INFO: renamed from: L3 */
    public static void m207611L3(wrp0 wrp0Var, BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        String str = bLiveVoiceRoomAsset.undercoverEntranceUrl;
        str.getClass();
        wrp0Var.m207613N3(str);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m207612M3(wrp0 wrp0Var, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16267i) {
            ((VirtualWebPanelView) wrp0Var.viewModel).m78569q0();
        } else if (c4470c == C4470c.f16268j) {
            ((VirtualWebPanelView) wrp0Var.viewModel).m78568p0();
        }
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo113707G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((VirtualWebPanelView) this.viewModel).f48935f;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m207613N3(@NotNull final String url) {
        url.getClass();
        if (ntp0.m164746d(url)) {
            duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.urp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wrp0.m207609J3(this.f180669a, url, (AuthData) obj);
                }
            }, new y20() { // from class: l.vrp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wrp0.m207610K3(this.f185507a, url, (Throwable) obj);
                }
            }));
        } else {
            ((VirtualWebPanelView) this.viewModel).m78567o0("", url);
        }
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo113708P1() {
        return super.mo113708P1();
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
        ((VirtualWebPanelView) this.viewModel).m78566m0(isCollapse);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ void mo113711b0(boolean z) {
        super.mo113711b0(z);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo113712c2() {
        return super.mo113712c2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo113713e2() {
        return super.mo113713e2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo113714f1() {
        return super.mo113714f1();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: g1 */
    public int mo113715g1() {
        return yec0.f198926T6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VirtualWebPanelView) this.viewModel).m78570r();
        duringCreated(((rwn0) m213810E2()).m183426b3(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.srp0
            @Override // p153l.y20
            public final void call(Object obj) {
                wrp0.m207611L3(this.f170364a, (BLiveVoiceRoomAsset) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.trp0
            @Override // p153l.y20
            public final void call(Object obj) {
                wrp0.m207612M3(this.f175915a, (C4470c) obj);
            }
        }));
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: u */
    public /* bridge */ void mo113716u(@NotNull ViewGroup viewGroup) {
        super.mo113716u(viewGroup);
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo113717x() {
        FrameLayout frameLayout = ((VirtualWebPanelView) this.viewModel).f48936g;
        frameLayout.getClass();
        return frameLayout;
    }
}
