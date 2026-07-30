package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.marquee.BuzzMarqueeRecyclerView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0011\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m88121d2 = {"Ll/eri0;", "Ll/kg2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "r", "()V", "q", "Ll/pf60;", "", "pair", "", StickerBundle.TYPE, "j0", "(Ll/pf60;Z)V", "B", "destroy", "", "M", "()I", "I", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "A", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/marquee/BuzzMarqueeRecyclerView;", "marquee", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class eri0 extends kg2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public BuzzMarqueeRecyclerView marquee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eri0(@NotNull Act act, @NotNull String str) {
        super(act, str, null, 4, null);
        act.getClass();
        str.getClass();
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: B */
    public void mo99381B() {
        int i;
        super.mo99381B();
        m149719h0("p_buzz_text_connecting");
        haw.Companion companion = haw.INSTANCE;
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 == null || (i = loveBuzzDataM134315v0.remainingTextBuzz) == getNOT_LIMIT_VALUE()) {
            return;
        }
        loveBuzzDataM134315v0.remainingTextBuzz = C15274a.m88486b(i - 1, 0);
        companion.m134320a().m134263A0().m137019l(loveBuzzDataM134315v0);
    }

    @Override // p153l.kg2
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo99382I() {
        return kq3.INSTANCE.m150807a();
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: M */
    public int mo99383M() {
        return ebc0.f92889k0;
    }

    @Override // p153l.kg2, p153l.iam
    public void destroy() {
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m48450f();
        }
        super.destroy();
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: j0 */
    public void mo99385j0(@NotNull pf60<String, Object> pair, boolean bundle) {
        pair.getClass();
        super.mo99385j0(pair, bundle);
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            bnl0.m105524M(buzzMarqueeRecyclerView, false);
            buzzMarqueeRecyclerView.m48450f();
        }
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: q */
    public void mo99386q() {
        super.mo99386q();
        m149719h0("p_buzz_text_searching");
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: r */
    public void mo99387r() {
        super.mo99387r();
        m149719h0("p_buzz_text_searching");
        if (this.marquee == null) {
            this.marquee = (BuzzMarqueeRecyclerView) m149705R().inflate();
        }
        BuzzMarqueeRecyclerView buzzMarqueeRecyclerView = this.marquee;
        if (buzzMarqueeRecyclerView != null) {
            buzzMarqueeRecyclerView.m48449e();
        }
    }
}
