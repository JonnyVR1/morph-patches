package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/mvo0;", "Ll/ovo0;", "Ll/bsm;", "Ll/nnn0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "viewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "", Constants.KEY_T, "()V", "K3", "Ll/c4n0;", RXScreenCaptureService.KEY_INDEX, "Ll/c4n0;", "O3", "()Ll/c4n0;", "setEditPresenter", "(Ll/c4n0;)V", "editPresenter", "Ll/hvo0;", "j", "Ll/hvo0;", "failDialogPresenter", "", "k", "Ljava/lang/String;", "N3", "()Ljava/lang/String;", "setCurrentNotice", "(Ljava/lang/String;)V", "currentNotice", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class mvo0 extends ovo0 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public c4n0 editPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public hvo0 failDialogPresenter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String currentNotice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvo0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull VoiceTopNoticeView voiceTopNoticeView) {
        super(bsmVar, voiceTopNoticeView);
        bsmVar.getClass();
        voiceTopNoticeView.getClass();
        this.currentNotice = "";
        this.editPresenter = (c4n0) m144512z2(new c4n0(bsmVar));
        this.failDialogPresenter = (hvo0) m144512z2(new hvo0(bsmVar));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m156572L3(mvo0 mvo0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        String str = bLiveVoiceRoom.announcement;
        str.getClass();
        mvo0Var.currentNotice = str;
        if (ypv.m215672k().m195833f6()) {
            ((VoiceTopNoticeView) mvo0Var.viewModel).m77743e();
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m156573M3(mvo0 mvo0Var, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.reject) {
            hvo0 hvo0Var = mvo0Var.failDialogPresenter;
            if (hvo0Var != null) {
                String notifyMessage = announcementAudit.getNotifyMessage();
                notifyMessage.getClass();
                hvo0Var.m133196K3(notifyMessage);
                return;
            }
            return;
        }
        if (announcementAudit.getOperate() == LongLinkLiveMessage.Operate.approve) {
            c4n0 c4n0Var = mvo0Var.editPresenter;
            if (c4n0Var != null) {
                String announcement = announcementAudit.getAnnouncement();
                announcement.getClass();
                c4n0Var.m105231P3(announcement);
            }
            lsi0.m151595y(announcementAudit.getNotifyMessage());
        }
    }

    @Override // p149l.ovo0
    /* JADX INFO: renamed from: K3 */
    public void mo156574K3() {
        c4n0 c4n0Var = this.editPresenter;
        if (c4n0Var != null) {
            c4n0Var.m105232R3(this.currentNotice);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: N3, reason: from getter */
    public final String getCurrentNotice() {
        return this.currentNotice;
    }

    @Nullable
    /* JADX INFO: renamed from: O3, reason: from getter */
    public final c4n0 getEditPresenter() {
        return this.editPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160247O2().m165468f()).subscribe(ffw.m121193d(new e30() { // from class: l.kvo0
            @Override // p149l.e30
            public final void call(Object obj) {
                mvo0.m156572L3(this.f124785a, (BLiveVoiceRoom) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170413W).subscribe(ffw.m121197h(new e30() { // from class: l.lvo0
            @Override // p149l.e30
            public final void call(Object obj) {
                mvo0.m156573M3(this.f130181a, (LongLinkLiveMessage.AnnouncementAudit) obj);
            }
        }));
    }
}
