package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Ll/q4p0;", "Ll/s4p0;", "Ll/dum;", "Ll/rwn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "viewModel", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "", Constants.KEY_T, "()V", "K3", "Ll/gdn0;", RXScreenCaptureService.KEY_INDEX, "Ll/gdn0;", "O3", "()Ll/gdn0;", "setEditPresenter", "(Ll/gdn0;)V", "editPresenter", "Ll/l4p0;", "j", "Ll/l4p0;", "failDialogPresenter", "", "k", "Ljava/lang/String;", "N3", "()Ljava/lang/String;", "setCurrentNotice", "(Ljava/lang/String;)V", "currentNotice", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class q4p0 extends s4p0 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public gdn0 editPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public l4p0 failDialogPresenter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String currentNotice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4p0(@NotNull dum<? extends rwn0> dumVar, @NotNull VoiceTopNoticeView voiceTopNoticeView) {
        super(dumVar, voiceTopNoticeView);
        dumVar.getClass();
        voiceTopNoticeView.getClass();
        this.currentNotice = "";
        this.editPresenter = (gdn0) m153103z2(new gdn0(dumVar));
        this.failDialogPresenter = (l4p0) m153103z2(new l4p0(dumVar));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m175250L3(q4p0 q4p0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        String str = bLiveVoiceRoom.announcement;
        str.getClass();
        q4p0Var.currentNotice = str;
        if (zrv.m221193k().m203620f6()) {
            ((VoiceTopNoticeView) q4p0Var.viewModel).m78926e();
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m175251M3(q4p0 q4p0Var, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.reject) {
            l4p0 l4p0Var = q4p0Var.failDialogPresenter;
            if (l4p0Var != null) {
                String notifyMessage = announcementAudit.getNotifyMessage();
                notifyMessage.getClass();
                l4p0Var.m152814K3(notifyMessage);
                return;
            }
            return;
        }
        if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.approve) {
            gdn0 gdn0Var = q4p0Var.editPresenter;
            if (gdn0Var != null) {
                String announcement = announcementAudit.getAnnouncement();
                announcement.getClass();
                gdn0Var.m129934P3(announcement);
            }
            o1j0.m165651y(announcementAudit.getNotifyMessage());
        }
    }

    @Override // p153l.s4p0
    /* JADX INFO: renamed from: K3 */
    public void mo175252K3() {
        gdn0 gdn0Var = this.editPresenter;
        if (gdn0Var != null) {
            gdn0Var.m129935R3(this.currentNotice);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N3, reason: from getter */
    public final String getCurrentNotice() {
        return this.currentNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final gdn0 getEditPresenter() {
        return this.editPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183409O2().m188660f()).subscribe(dhw.m115825d(new y20() { // from class: l.o4p0
            @Override // p153l.y20
            public final void call(Object obj) {
                q4p0.m175250L3(this.f145001a, (BLiveVoiceRoom) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71680W).subscribe(dhw.m115829h(new y20() { // from class: l.p4p0
            @Override // p153l.y20
            public final void call(Object obj) {
                q4p0.m175251M3(this.f150555a, (LongLinkLiveMessage.AnnouncementAudit) obj);
            }
        }));
    }
}
