package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/ovo0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "Ll/bsm;", BaseSei.INFO, "viewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "K3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class ovo0 extends h4t<nnn0, VoiceTopNoticeView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovo0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull VoiceTopNoticeView voiceTopNoticeView) {
        super(bsmVar);
        bsmVar.getClass();
        voiceTopNoticeView.getClass();
        mo51532C(voiceTopNoticeView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m166203J3(ovo0 ovo0Var) {
        ovo0Var.mo156574K3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129303g3(m206028F2().TopNoticeEvent.showNoticePanel(), new d30() { // from class: l.nvo0
            @Override // p149l.d30
            public final void call() {
                ovo0.m166203J3(this.f140783a);
            }
        });
    }

    /* JADX INFO: renamed from: K3 */
    public void mo156574K3() {
    }
}
