package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hen0 extends jq2<ken0> {
    public hen0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public void m130660f0() {
        mcr mcrVar = this.lifecycleProviderImpl;
        if (mcrVar instanceof Act) {
            ((Act) mcrVar).lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m130661g0(List list) {
        ((ken0) this.viewModel).m145801j(list);
    }

    /* JADX INFO: renamed from: h0 */
    public void m130662h0() {
        duringCreated(LiveVoiceInternalSquareApi.getLikedVoiceRooms("liked_audio_room")).subscribe(ffw.m121197h(new e30() { // from class: l.gen0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102277a.m130661g0((List) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
