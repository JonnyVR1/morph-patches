package p003l;

import com.p000p1.mobile.putong.core.p001ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzCallState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.j760;
import l.kp2;
import l.m6w;
import l.mcr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ#\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/egy;", "Ll/kp2;", "Ll/mcr;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/mcr;Ljava/lang/String;)V", "", "h1", "()V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "state", "", "f1", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;)Z", "e1", "g1", "Ll/j760;", "", "pair", "A0", "(Ll/j760;)Z", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class egy extends kp2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egy(@NotNull mcr mcrVar, @NotNull String str) {
        super(mcrVar, str);
        mcrVar.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: h1 */
    private final void m3830h1() {
        Act act = act();
        if (m6w.INSTANCE.a(act) && (act instanceof MemojiBuzzAct)) {
            ((MemojiBuzzAct) act).m19Z1(true);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m3831A0(@NotNull j760<String, Object> pair) {
        pair.getClass();
        return Intrinsics.d("intl.memojiBuzz.notify", pair.a) || Intrinsics.d("media_buzz_reaction", pair.a);
    }

    /* JADX INFO: renamed from: e1 */
    public void m3832e1() {
        super.e1();
        if (m6w.INSTANCE.a(act())) {
            MemojiBuzzAct memojiBuzzActAct = act();
            MemojiBuzzAct memojiBuzzAct = memojiBuzzActAct instanceof MemojiBuzzAct ? memojiBuzzActAct : null;
            if (memojiBuzzAct != null) {
                memojiBuzzAct.m16V1("memoji_call");
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public boolean m3833f1(@NotNull BuzzCallState state) {
        state.getClass();
        return state == BuzzCallState.PEER_VIDEO_JOIN || state == BuzzCallState.RECEIVE_PEER_VIDEO_FIRST;
    }

    /* JADX INFO: renamed from: g1 */
    public void m3834g1() {
        m3830h1();
        super.g1();
    }
}
