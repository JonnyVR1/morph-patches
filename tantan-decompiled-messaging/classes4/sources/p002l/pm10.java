package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import java.util.List;
import kotlin.Metadata;
import l.ool0;
import l.qib0;
import l.t7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010\b¨\u0006#"}, d2 = {"Ll/pm10;", "Ll/ool0;", "<init>", "()V", "Landroid/view/View;", "card", "", "i", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pm10 implements ool0 {
    /* JADX INFO: renamed from: i */
    private final void m20478i(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.om10
                @Override // java.lang.Runnable
                public final void run() {
                    pm10.m20479j(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m20479j(VSwipeCard vSwipeCard) {
        vSwipeCard.O0(true);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m20482d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewH = qib0.b0.c.oo().h(inflater, parent);
        viewH.getClass();
        return viewH;
    }

    /* JADX INFO: renamed from: e */
    public void m20483e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (position == 0) {
            m20478i(card);
        }
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt == null) {
            return;
        }
        List list = partialListOpt.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position) {
            return;
        }
        qib0.b0.c.oo().c(position, view, ((CoreSuggested.UserInfo) list.get(position)).extensionObject);
    }

    /* JADX INFO: renamed from: f */
    public boolean m20484f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m20485g(@Nullable SwipeDirection swipeDirection, @NotNull t7m card) {
        card.getClass();
        qib0.b0.c.oo().f();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m20480b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m20481c(@Nullable View view) {
    }
}
