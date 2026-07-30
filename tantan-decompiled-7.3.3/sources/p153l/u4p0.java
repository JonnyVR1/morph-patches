package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/u4p0;", "Ll/q4p0;", "Ll/dum;", "Ll/jqm0;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "viewModel", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "", Constants.KEY_T, "()V", "K3", "Ll/t5o0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/t5o0;", "lookTopNoticePresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u4p0 extends q4p0 {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public t5o0 lookTopNoticePresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4p0(@NotNull dum<jqm0> dumVar, @NotNull VoiceTopNoticeView voiceTopNoticeView) {
        super(dumVar, voiceTopNoticeView);
        dumVar.getClass();
        voiceTopNoticeView.getClass();
        this.lookTopNoticePresenter = (t5o0) m153103z2(new t5o0(dumVar));
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m194494P3(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(zrv.f205799a.m207631D0().equals(bLiveVoiceManager != null ? bLiveVoiceManager.userId : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.q4p0, p153l.s4p0
    /* JADX INFO: renamed from: K3 */
    public void mo175252K3() {
        if (y6s.m214494b(((rwn0) m213810E2()).m168538n0().liveMode)) {
            if (i9o0.m139137h(this)) {
                gdn0 editPresenter = getEditPresenter();
                if (editPresenter != null) {
                    editPresenter.m129935R3(getCurrentNotice());
                    return;
                }
                return;
            }
            BLiveExtraData bLiveExtraDataNew_ = BLiveExtraData.new_();
            BLiveVoiceRoomProfile bLiveVoiceRoomProfileNew_ = BLiveVoiceRoomProfile.new_();
            bLiveVoiceRoomProfileNew_.announcement = getCurrentNotice();
            bLiveExtraDataNew_.voiceRoomProfile = bLiveVoiceRoomProfileNew_;
            m213811F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo199273j(new moo0("notice", bLiveExtraDataNew_));
            return;
        }
        List list = (List) m138856F3(new x5o0(4400));
        if (list == null || list.isEmpty() || !jyb.m147520m(list, new qcj() { // from class: l.t4p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u4p0.m194494P3((BLiveVoiceManager) obj);
            }
        })) {
            t5o0 t5o0Var = this.lookTopNoticePresenter;
            if (t5o0Var != null) {
                t5o0Var.m189415L3();
                return;
            }
            return;
        }
        gdn0 editPresenter2 = getEditPresenter();
        if (editPresenter2 != null) {
            editPresenter2.m129935R3(getCurrentNotice());
        }
    }

    @Override // p153l.q4p0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (zrv.m221193k().m203620f6()) {
            ((VoiceTopNoticeView) this.viewModel).m78926e();
        }
    }
}
