package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/qvo0;", "Ll/mvo0;", "Ll/bsm;", "Ll/fhm0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "viewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "", Constants.KEY_T, "()V", "K3", "Ll/pwn0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/pwn0;", "lookTopNoticePresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qvo0 extends mvo0 {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public pwn0 lookTopNoticePresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvo0(@NotNull bsm<fhm0> bsmVar, @NotNull VoiceTopNoticeView voiceTopNoticeView) {
        super(bsmVar, voiceTopNoticeView);
        bsmVar.getClass();
        voiceTopNoticeView.getClass();
        this.lookTopNoticePresenter = (pwn0) m144512z2(new pwn0(bsmVar));
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m176708P3(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(ypv.f199493a.m199309D0().equals(bLiveVoiceManager != null ? bLiveVoiceManager.userId : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.mvo0, p149l.ovo0
    /* JADX INFO: renamed from: K3 */
    public void mo156574K3() {
        if (x4s.m207012b(((nnn0) m206027E2()).m132152n0().liveMode)) {
            if (e0o0.m114322h(this)) {
                c4n0 editPresenter = getEditPresenter();
                if (editPresenter != null) {
                    editPresenter.m105232R3(getCurrentNotice());
                    return;
                }
                return;
            }
            BLiveExtraData bLiveExtraDataNew_ = BLiveExtraData.new_();
            BLiveVoiceRoomProfile bLiveVoiceRoomProfileNew_ = BLiveVoiceRoomProfile.new_();
            bLiveVoiceRoomProfileNew_.announcement = getCurrentNotice();
            bLiveExtraDataNew_.voiceRoomProfile = bLiveVoiceRoomProfileNew_;
            m206028F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo172463j(new ifo0("notice", bLiveExtraDataNew_));
            return;
        }
        List list = (List) m129297F3(new twn0(4400));
        if (list == null || list.isEmpty() || !vwb.m200337m(list, new w9j() { // from class: l.pvo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qvo0.m176708P3((BLiveVoiceManager) obj);
            }
        })) {
            pwn0 pwn0Var = this.lookTopNoticePresenter;
            if (pwn0Var != null) {
                pwn0Var.m171762L3();
                return;
            }
            return;
        }
        c4n0 editPresenter2 = getEditPresenter();
        if (editPresenter2 != null) {
            editPresenter2.m105232R3(getCurrentNotice());
        }
    }

    @Override // p149l.mvo0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (ypv.m215672k().m195833f6()) {
            ((VoiceTopNoticeView) this.viewModel).m77743e();
        }
    }
}
