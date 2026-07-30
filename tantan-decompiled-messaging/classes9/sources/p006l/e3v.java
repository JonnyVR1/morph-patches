package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.data.PushMessage;
import java.util.List;
import kotlin.Metadata;
import l.ool0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ll/e3v;", "Ll/ool0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "Landroid/view/View;", "card", "", "i", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e3v implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    public e3v(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: i */
    private final void m14396i(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m7089O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.d3v
                @Override // java.lang.Runnable
                public final void run() {
                    e3v.m14397j(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m14397j(VSwipeCard vSwipeCard) {
        vSwipeCard.m7089O0(true);
    }

    /* JADX INFO: renamed from: c */
    public void m14399c(@NotNull View view) {
        view.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m14400d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        View viewA = qib0.f19804b0.f17708c.co().a(inflater, parent);
        viewA.getClass();
        return viewA;
    }

    /* JADX INFO: renamed from: e */
    public void m14401e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (position == 0) {
            m14396i(card);
        }
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (partialListOpt == null) {
            return;
        }
        List list = partialListOpt.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position || !(((CoreSuggested.UserInfo) list.get(position)).extensionObject instanceof PushMessage)) {
            return;
        }
        qib0.f19804b0.f17708c.co().c(position, view, (PushMessage) ((CoreSuggested.UserInfo) list.get(position)).extensionObject);
    }

    /* JADX INFO: renamed from: f */
    public boolean m14402f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m14403g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        swipeDirection.getClass();
        card.getClass();
        qib0.f19804b0.f17708c.co().b(swipeDirection.getValue());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m14398b(@Nullable VSwipeCard card) {
    }
}
