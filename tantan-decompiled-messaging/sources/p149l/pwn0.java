package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/pwn0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceLookTopNoticeDialog;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "L3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class pwn0 extends h4t<nnn0, VoiceLookTopNoticeDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwn0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = act();
        act.getClass();
        mo51532C(new VoiceLookTopNoticeDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public static void m171760J3(pwn0 pwn0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        VoiceLookTopNoticeDialog voiceLookTopNoticeDialog = (VoiceLookTopNoticeDialog) pwn0Var.viewModel;
        String str = bLiveVoiceRoom.announcement;
        str.getClass();
        voiceLookTopNoticeDialog.m77726k(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m171761K3(pwn0 pwn0Var, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        VoiceLookTopNoticeDialog voiceLookTopNoticeDialog = (VoiceLookTopNoticeDialog) pwn0Var.viewModel;
        String announcement = voiceRoomAnnouncementUpdate.getAnnouncement();
        announcement.getClass();
        voiceLookTopNoticeDialog.m77726k(announcement);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m171762L3() {
        ((VoiceLookTopNoticeDialog) this.viewModel).m77725j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160247O2().m165468f()).subscribe(ffw.m121193d(new e30() { // from class: l.nwn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pwn0.m171760J3(this.f140957a, (BLiveVoiceRoom) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170416X).subscribe(ffw.m121193d(new e30() { // from class: l.own0
            @Override // p149l.e30
            public final void call(Object obj) {
                pwn0.m171761K3(this.f146073a, (LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
            }
        }));
    }
}
