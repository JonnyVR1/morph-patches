package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.video.VideoBuzzAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ#\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/wal0;", "Ll/bq2;", "Ll/ner;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/ner;Ljava/lang/String;)V", "", "h1", "()V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "state", "", "f1", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;)Z", "e1", "g1", "Ll/pf60;", "", "pair", "A0", "(Ll/pf60;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wal0 extends bq2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wal0(@NotNull ner nerVar, @NotNull String str) {
        super(nerVar, str);
        nerVar.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m205659h1() {
        Act act = act();
        if (k8w.INSTANCE.m148752a(act) && (act instanceof VideoBuzzAct)) {
            ((VideoBuzzAct) act).m48252a2(true);
        }
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: A0 */
    public boolean mo97752A0(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        return Intrinsics.m88377d("intl.videoBuzz.notify", pair.f152156a) || Intrinsics.m88377d("media_buzz_reaction", pair.f152156a);
    }

    @Override // p153l.bq2
    /* JADX INFO: renamed from: e1 */
    public void mo105859e1() {
        super.mo105859e1();
        if (k8w.INSTANCE.m148752a(act())) {
            Act act = act();
            VideoBuzzAct videoBuzzAct = act instanceof VideoBuzzAct ? (VideoBuzzAct) act : null;
            if (videoBuzzAct != null) {
                videoBuzzAct.mo48105X1("video_call");
            }
        }
    }

    @Override // p153l.bq2
    /* JADX INFO: renamed from: f1 */
    public boolean mo105860f1(@NotNull BuzzCallState state) {
        state.getClass();
        return state == BuzzCallState.PEER_VIDEO_JOIN || state == BuzzCallState.RECEIVE_PEER_VIDEO_FIRST;
    }

    @Override // p153l.bq2
    /* JADX INFO: renamed from: g1 */
    public void mo105861g1() {
        m205659h1();
        super.mo105861g1();
    }
}
