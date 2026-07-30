package p003l;

import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.a;
import l.dg2;
import l.j760;
import l.j8w;
import l.kp3;
import l.xdl0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0011\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ll/eii0;", "Ll/dg2;", "Lcom/p1/mobile/android/app/Act;", "act", "", "pageType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "r", "()V", "q", "Ll/j760;", "", "pair", "", "bundle", "j0", "(Ll/j760;Z)V", "B", "destroy", "", "M", "()I", "I", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "A", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "marquee", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class eii0 extends dg2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public BuzzMarqueeRecyclerView marquee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eii0(@NotNull Act act, @NotNull String str) {
        super(act, str, (String) null, 4, (DefaultConstructorMarker) null);
        act.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: B */
    public void m3840B() {
        int i;
        super.B();
        h0("p_buzz_text_connecting");
        j8w.a aVar = j8w.Companion;
        LoveBuzzData loveBuzzDataV0 = aVar.a().v0();
        if (loveBuzzDataV0 == null || (i = loveBuzzDataV0.remainingTextBuzz) == L()) {
            return;
        }
        loveBuzzDataV0.remainingTextBuzz = a.b(i - 1, 0);
        aVar.a().A0().onNext(loveBuzzDataV0);
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public String m3841I() {
        return kp3.INSTANCE.a();
    }

    /* JADX INFO: renamed from: M */
    public int m3842M() {
        return y2c0.k0;
    }

    public void destroy() {
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m297f();
        }
        super.destroy();
    }

    /* JADX INFO: renamed from: j0 */
    public void m3843j0(@NotNull j760<String, Object> pair, boolean bundle) {
        pair.getClass();
        super.j0(pair, bundle);
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            xdl0.M(buzzMarqueeRecyclerView, false);
            buzzMarqueeRecyclerView.m297f();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3844q() {
        super.q();
        h0("p_buzz_text_searching");
    }

    /* JADX INFO: renamed from: r */
    public void m3845r() {
        super.r();
        h0("p_buzz_text_searching");
        if (this.marquee == null) {
            this.marquee = (BuzzMarqueeRecyclerView) R().inflate();
        }
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m296e();
        }
    }
}
