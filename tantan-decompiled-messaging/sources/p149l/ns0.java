package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p147v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/ns0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/announcement/AnnouncementView;", "Ll/jzl;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", Constants.KEY_T, "", "isCollapse", "Y", "(Z)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f13930X, "R3", "", "g1", "()I", "T1", "isManager", "b0", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ns0 extends h4t<nnn0, AnnouncementView> implements jzl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<? extends nnn0> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m160748J3(LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        return Boolean.valueOf(voiceRoomAnnouncementUpdate.isInitialized());
    }

    /* JADX INFO: renamed from: K3 */
    public static void m160749K3(ns0 ns0Var, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        AnnouncementView announcementView = (AnnouncementView) ns0Var.viewModel;
        String announcement = voiceRoomAnnouncementUpdate.getAnnouncement();
        announcement.getClass();
        announcementView.m77372e(announcement);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m160750L3(ns0 ns0Var, String str) {
        AnnouncementView announcementView = (AnnouncementView) ns0Var.viewModel;
        str.getClass();
        announcementView.m77372e(str);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m160751M3(ns0 ns0Var, String str) {
        AnnouncementView announcementView = (AnnouncementView) ns0Var.viewModel;
        str.getClass();
        announcementView.m77372e(str);
    }

    /* JADX INFO: renamed from: N3 */
    public static String m160752N3(BLiveVoiceRoom bLiveVoiceRoom) {
        return bLiveVoiceRoom.announcement;
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m160753O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static String m160754P3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo104849G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((AnnouncementView) this.viewModel).f48095c;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo104850P1() {
        return super.mo104850P1();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m160755R3() {
        m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(Integer.valueOf(jtl0.m143154c(VirtualVoiceMotionType.announcement)));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((AnnouncementView) this.viewModel).m77375r();
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
        ((AnnouncementView) this.viewModel).m77373f(isCollapse);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: b0 */
    public void mo104857b0(boolean isManager) {
        ((AnnouncementView) this.viewModel).m77371d();
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
        return t6c0.f168230W6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m160247O2().m165468f());
        final Function1 function1 = new Function1() { // from class: l.as0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ns0.m160752N3((BLiveVoiceRoom) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.cs0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ns0.m160754P3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.es0
            @Override // p149l.e30
            public final void call(Object obj) {
                ns0.m160750L3(this.f92973a, (String) obj);
            }
        }));
        duringCreated(m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.gs0
            @Override // p149l.e30
            public final void call(Object obj) {
                ns0.m160751M3(this.f104131a, (String) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(((nnn0) m206027E2()).m132160q1().m189083Y0());
        final Function1 function2 = new Function1() { // from class: l.is0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ns0.m160748J3((LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
            }
        };
        c22306cDuringCreated2.filter(new w9j() { // from class: l.ks0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ns0.m160753O3(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ms0
            @Override // p149l.e30
            public final void call(Object obj) {
                ns0.m160749K3(this.f135433a, (LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
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
        VLinear vLinear = ((AnnouncementView) this.viewModel).f48096d;
        vLinear.getClass();
        return vLinear;
    }
}
