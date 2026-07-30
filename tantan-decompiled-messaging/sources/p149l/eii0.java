package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0011\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m87232d2 = {"Ll/eii0;", "Ll/dg2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "r", "()V", "q", "Ll/j760;", "", "pair", "", StickerBundle.TYPE, "j0", "(Ll/j760;Z)V", "B", "destroy", "", "M", "()I", "I", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "A", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "marquee", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class eii0 extends dg2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public BuzzMarqueeRecyclerView marquee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eii0(@NotNull Act act, @NotNull String str) {
        super(act, str, null, 4, null);
        act.getClass();
        str.getClass();
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: B */
    public void mo111561B() {
        int i;
        super.mo111561B();
        m111589h0("p_buzz_text_connecting");
        j8w.Companion companion = j8w.INSTANCE;
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 == null || (i = loveBuzzDataM140468v0.remainingTextBuzz) == getNOT_LIMIT_VALUE()) {
            return;
        }
        loveBuzzDataM140468v0.remainingTextBuzz = C15167a.m87596b(i - 1, 0);
        companion.m140473a().m140416A0().m132487l(loveBuzzDataM140468v0);
    }

    @Override // p149l.dg2
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo111565I() {
        return kp3.INSTANCE.m146811a();
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: M */
    public int mo111569M() {
        return y2c0.f195567k0;
    }

    @Override // p149l.dg2, p149l.s7m
    public void destroy() {
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m47267f();
        }
        super.destroy();
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: j0 */
    public void mo111591j0(@NotNull j760<String, Object> pair, boolean bundle) {
        pair.getClass();
        super.mo111591j0(pair, bundle);
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            xdl0.m208344M(buzzMarqueeRecyclerView, false);
            buzzMarqueeRecyclerView.m47267f();
        }
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: q */
    public void mo111598q() {
        super.mo111598q();
        m111589h0("p_buzz_text_searching");
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: r */
    public void mo111599r() {
        super.mo111599r();
        m111589h0("p_buzz_text_searching");
        if (this.marquee == null) {
            this.marquee = (BuzzMarqueeRecyclerView) m111574R().inflate();
        }
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m47266e();
        }
    }
}
