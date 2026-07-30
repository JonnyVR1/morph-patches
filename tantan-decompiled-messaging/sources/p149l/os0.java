package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/os0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;", "Ll/bsm;", "curInfo", "announcementView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;)V", "", Constants.KEY_T, "()V", "", "V3", "()Ljava/lang/String;", VirtualVoiceMotionType.announcement, "P3", "(Ljava/lang/String;)V", "T3", "Ll/hvo0;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "U3", "()Ll/hvo0;", "failDialogPresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class os0 extends h4t<nnn0, AnnouncementView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy failDialogPresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull AnnouncementView announcementView) {
        super(bsmVar);
        bsmVar.getClass();
        announcementView.getClass();
        this.failDialogPresenter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.bs0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return os0.m165684J3(this.f76966a);
            }
        });
        mo51532C(announcementView);
    }

    /* JADX INFO: renamed from: J3 */
    public static hvo0 m165684J3(os0 os0Var) {
        bsm<? extends T> bsmVar = os0Var.f188512e;
        bsmVar.getClass();
        return (hvo0) os0Var.m144512z2(new hvo0(bsmVar));
    }

    /* JADX INFO: renamed from: K3 */
    public static void m165685K3(os0 os0Var, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        if (announcementAudit.getOperate() != LongLinkLiveMessage.Operate.reject) {
            if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.approve) {
                lsi0.m151595y(announcementAudit.getNotifyMessage());
            }
        } else {
            hvo0 hvo0VarM165694U3 = os0Var.m165694U3();
            String notifyMessage = announcementAudit.getNotifyMessage();
            notifyMessage.getClass();
            hvo0VarM165694U3.m133196K3(notifyMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static void m165687M3(os0 os0Var, String str, BLiveEnvelope bLiveEnvelope) {
        osi0.m165782f(R$string.f47682zj);
        if (!Intrinsics.m87488d(VirtualVoiceMotionType.announcement, ((nnn0) os0Var.m206027E2()).mo149813j().template)) {
            String strM149814k = ((nnn0) os0Var.m206027E2()).m149814k();
            strM149814k.getClass();
            os0Var.duringCreated(VoiceVirtualApi.switchTemplate(strM149814k, VirtualVoiceMotionType.announcement)).subscribe(ffw.m121194e(new e30() { // from class: l.js0
                @Override // p149l.e30
                public final void call(Object obj) {
                    os0.m165690R3((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.ls0
                @Override // p149l.e30
                public final void call(Object obj) {
                    os0.m165691S3((Throwable) obj);
                }
            }));
        }
        ((nnn0) os0Var.m206027E2()).mo149817n().announcement = str;
        os0Var.m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().mo172464m(str);
        os0Var.m165693T3();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m165689O3(Throwable th) {
        if (!xtr.m211022b(51042, th)) {
            xtr.m211023c(th);
        } else {
            th.getClass();
            osi0.m165783g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m165691S3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m165692P3(@NotNull final String announcement) {
        announcement.getClass();
        if (x7n0.m207302b(this)) {
            lsi0.m151595y("正在拍拍中，暂无法切换玩法");
            return;
        }
        fvo0 fvo0Var = fvo0.INSTANCE;
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(fvo0Var.m123346a(strM149818o, announcement)).subscribe(ffw.m121194e(new e30() { // from class: l.fs0
            @Override // p149l.e30
            public final void call(Object obj) {
                os0.m165687M3(this.f99023a, announcement, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hs0
            @Override // p149l.e30
            public final void call(Object obj) {
                os0.m165689O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m165693T3() {
        m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(-1);
    }

    /* JADX INFO: renamed from: U3 */
    public final hvo0 m165694U3() {
        Object value = this.failDialogPresenter.getValue();
        value.getClass();
        return (hvo0) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: V3 */
    public final String m165695V3() {
        String str = ((nnn0) m206027E2()).m160247O2().mo165469j().announcement;
        str.getClass();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().f170413W).subscribe(ffw.m121197h(new e30() { // from class: l.ds0
            @Override // p149l.e30
            public final void call(Object obj) {
                os0.m165685K3(this.f87710a, (LongLinkLiveMessage.AnnouncementAudit) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m165690R3(BLiveEnvelope bLiveEnvelope) {
    }
}
