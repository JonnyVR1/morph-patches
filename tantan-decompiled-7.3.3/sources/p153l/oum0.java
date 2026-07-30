package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.VoiceBuzzAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/oum0;", "Ll/bq2;", "Ll/ner;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/ner;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "state", "", "f1", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;)Z", "", "e1", "()V", "Ll/pf60;", "", "pair", "A0", "(Ll/pf60;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class oum0 extends bq2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oum0(@NotNull ner nerVar, @NotNull String str) {
        super(nerVar, str);
        nerVar.getClass();
        str.getClass();
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: A0 */
    public boolean mo97752A0(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        return Intrinsics.m88377d("intl.voiceBuzz.notify", pair.f152156a) || Intrinsics.m88377d("media_buzz_reaction", pair.f152156a);
    }

    @Override // p153l.bq2
    /* JADX INFO: renamed from: e1 */
    public void mo105859e1() {
        super.mo105859e1();
        if (k8w.INSTANCE.m148752a(act())) {
            Act act = act();
            VoiceBuzzAct voiceBuzzAct = act instanceof VoiceBuzzAct ? (VoiceBuzzAct) act : null;
            if (voiceBuzzAct != null) {
                voiceBuzzAct.mo48105X1("voice_call");
            }
        }
    }

    @Override // p153l.bq2
    /* JADX INFO: renamed from: f1 */
    public boolean mo105860f1(@NotNull BuzzCallState state) {
        state.getClass();
        return state == BuzzCallState.PEER_JOINED_STATE;
    }
}
