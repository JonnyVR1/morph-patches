package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/t5o0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceLookTopNoticeDialog;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "L3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class t5o0 extends i6t<rwn0, VoiceLookTopNoticeDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5o0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        Act act = act();
        act.getClass();
        mo52715C(new VoiceLookTopNoticeDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public static void m189413J3(t5o0 t5o0Var, BLiveVoiceRoom bLiveVoiceRoom) {
        VoiceLookTopNoticeDialog voiceLookTopNoticeDialog = (VoiceLookTopNoticeDialog) t5o0Var.viewModel;
        String str = bLiveVoiceRoom.announcement;
        str.getClass();
        voiceLookTopNoticeDialog.m78909k(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m189414K3(t5o0 t5o0Var, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        VoiceLookTopNoticeDialog voiceLookTopNoticeDialog = (VoiceLookTopNoticeDialog) t5o0Var.viewModel;
        String announcement = voiceRoomAnnouncementUpdate.getAnnouncement();
        announcement.getClass();
        voiceLookTopNoticeDialog.m78909k(announcement);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m189415L3() {
        ((VoiceLookTopNoticeDialog) this.viewModel).m78908j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183409O2().m188660f()).subscribe(dhw.m115825d(new y20() { // from class: l.r5o0
            @Override // p153l.y20
            public final void call(Object obj) {
                t5o0.m189413J3(this.f161372a, (BLiveVoiceRoom) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71683X).subscribe(dhw.m115825d(new y20() { // from class: l.s5o0
            @Override // p153l.y20
            public final void call(Object obj) {
                t5o0.m189414K3(this.f166441a, (LongLinkLiveMessage.VoiceRoomAnnouncementUpdate) obj);
            }
        }));
    }
}
