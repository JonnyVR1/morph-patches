package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p151v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/ss0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/announcement/AnnouncementView;", "Ll/d2m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "", "isCollapse", "Y", "(Z)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f14624X, "R3", "", "g1", "()I", "T1", "isManager", "b0", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "getCurInfo", "()Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ss0 extends i6t<rwn0, AnnouncementView> implements d2m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<? extends rwn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m187661J3(LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        return Boolean.valueOf(voiceRoomAnnouncementUpdate.isInitialized());
    }

    /* JADX INFO: renamed from: K3 */
    public static void m187662K3(ss0 ss0Var, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        AnnouncementView announcementView = (AnnouncementView) ss0Var.viewModel;
        String announcement = voiceRoomAnnouncementUpdate.getAnnouncement();
        announcement.getClass();
        announcementView.m78555e(announcement);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m187663L3(ss0 ss0Var, String str) {
        AnnouncementView announcementView = (AnnouncementView) ss0Var.viewModel;
        str.getClass();
        announcementView.m78555e(str);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m187664M3(ss0 ss0Var, String str) {
        AnnouncementView announcementView = (AnnouncementView) ss0Var.viewModel;
        str.getClass();
        announcementView.m78555e(str);
    }

    /* JADX INFO: renamed from: N3 */
    public static String m187665N3(BLiveVoiceRoom bLiveVoiceRoom) {
        return bLiveVoiceRoom.announcement;
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m187666O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static String m187667P3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo113707G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((AnnouncementView) this.viewModel).f48943c;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo113708P1() {
        return super.mo113708P1();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m187668R3() {
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(Integer.valueOf(n2m0.m161244c(VirtualVoiceMotionType.announcement)));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((AnnouncementView) this.viewModel).m78558r();
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
        ((AnnouncementView) this.viewModel).m78556f(isCollapse);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: b0 */
    public void mo113711b0(boolean isManager) {
        ((AnnouncementView) this.viewModel).m78554d();
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
        return yec0.f198962W6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m183409O2().m188660f());
        final Function1 function1 = new Function1() { // from class: l.fs0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ss0.m187665N3((BLiveVoiceRoom) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.hs0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ss0.m187667P3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.js0
            @Override // p153l.y20
            public final void call(Object obj) {
                ss0.m187663L3(this.f122418a, (String) obj);
            }
        }));
        duringCreated(m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ls0
            @Override // p153l.y20
            public final void call(Object obj) {
                ss0.m187664M3(this.f133380a, (String) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(((rwn0) m213810E2()).m168545q1().m98265Y0());
        final Function1 function2 = new Function1() { // from class: l.ns0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ss0.m187661J3((LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.ps0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ss0.m187666O3(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.rs0
            @Override // p153l.y20
            public final void call(Object obj) {
                ss0.m187662K3(this.f164621a, (LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
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
        VLinear vLinear = ((AnnouncementView) this.viewModel).f48944d;
        vLinear.getClass();
        return vLinear;
    }
}
