package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class lnn0 extends ar2<onn0> {
    public lnn0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public void m154989f0() {
        ner nerVar = this.lifecycleProviderImpl;
        if (nerVar instanceof Act) {
            ((Act) nerVar).lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m154990g0(List list) {
        ((onn0) this.viewModel).m168342j(list);
    }

    /* JADX INFO: renamed from: h0 */
    public void m154991h0() {
        duringCreated(LiveVoiceInternalSquareApi.getLikedVoiceRooms("liked_audio_room")).subscribe(dhw.m115829h(new y20() { // from class: l.knn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127612a.m154990g0((List) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
