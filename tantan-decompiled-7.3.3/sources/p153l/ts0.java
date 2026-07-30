package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bR\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/ts0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;", "Ll/dum;", "curInfo", "announcementView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;)V", "", Constants.KEY_T, "()V", "", "V3", "()Ljava/lang/String;", VirtualVoiceMotionType.announcement, "P3", "(Ljava/lang/String;)V", "T3", "Ll/l4p0;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "U3", "()Ll/l4p0;", "failDialogPresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ts0 extends i6t<rwn0, AnnouncementView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy failDialogPresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(@NotNull dum<? extends rwn0> dumVar, @NotNull AnnouncementView announcementView) {
        super(dumVar);
        dumVar.getClass();
        announcementView.getClass();
        this.failDialogPresenter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.gs0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ts0.m192532J3(this.f106216a);
            }
        });
        mo52715C(announcementView);
    }

    /* JADX INFO: renamed from: J3 */
    public static l4p0 m192532J3(ts0 ts0Var) {
        dum<? extends T> dumVar = ts0Var.f196918e;
        dumVar.getClass();
        return (l4p0) ts0Var.m153103z2(new l4p0(dumVar));
    }

    /* JADX INFO: renamed from: K3 */
    public static void m192533K3(ts0 ts0Var, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        if (announcementAudit.getOperate() != LongLinkLiveMessage.Operate.reject) {
            if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.approve) {
                o1j0.m165651y(announcementAudit.getNotifyMessage());
            }
        } else {
            l4p0 l4p0VarM192542U3 = ts0Var.m192542U3();
            String notifyMessage = announcementAudit.getNotifyMessage();
            notifyMessage.getClass();
            l4p0VarM192542U3.m152814K3(notifyMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static void m192535M3(ts0 ts0Var, String str, BLiveEnvelope bLiveEnvelope) {
        r1j0.m179419f(R$string.f48530zj);
        if (!Intrinsics.m88377d(VirtualVoiceMotionType.announcement, ((rwn0) ts0Var.m213810E2()).mo183435j().template)) {
            String strM202191k = ((rwn0) ts0Var.m213810E2()).m202191k();
            strM202191k.getClass();
            ts0Var.duringCreated(VoiceVirtualApi.switchTemplate(strM202191k, VirtualVoiceMotionType.announcement)).subscribe(dhw.m115826e(new y20() { // from class: l.os0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ts0.m192538R3((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.qs0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ts0.m192539S3((Throwable) obj);
                }
            }));
        }
        ((rwn0) ts0Var.m213810E2()).mo183440n().announcement = str;
        ts0Var.m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().mo199274m(str);
        ts0Var.m192541T3();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m192537O3(Throwable th) {
        if (!yvr.m217556b(51042, th)) {
            yvr.m217557c(th);
        } else {
            th.getClass();
            r1j0.m179420g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m192539S3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m192540P3(@NotNull final String announcement) {
        announcement.getClass();
        if (bhn0.m104351b(this)) {
            o1j0.m165651y("正在拍拍中，暂无法切换玩法");
            return;
        }
        j4p0 j4p0Var = j4p0.INSTANCE;
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(j4p0Var.m143446a(strM202194o, announcement)).subscribe(dhw.m115826e(new y20() { // from class: l.ks0
            @Override // p153l.y20
            public final void call(Object obj) {
                ts0.m192535M3(this.f128520a, announcement, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ms0
            @Override // p153l.y20
            public final void call(Object obj) {
                ts0.m192537O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m192541T3() {
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(-1);
    }

    /* JADX INFO: renamed from: U3 */
    public final l4p0 m192542U3() {
        Object value = this.failDialogPresenter.getValue();
        value.getClass();
        return (l4p0) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: V3 */
    public final String m192543V3() {
        String str = ((rwn0) m213810E2()).m183409O2().mo122891j().announcement;
        str.getClass();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().f71680W).subscribe(dhw.m115829h(new y20() { // from class: l.is0
            @Override // p153l.y20
            public final void call(Object obj) {
                ts0.m192533K3(this.f116616a, (LongLinkLiveMessage.AnnouncementAudit) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m192538R3(BLiveEnvelope bLiveEnvelope) {
    }
}
