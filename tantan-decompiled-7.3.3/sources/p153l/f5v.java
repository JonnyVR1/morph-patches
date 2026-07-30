package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m88121d2 = {"Ll/f5v;", "Ll/sxl0;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;)V", "Landroid/view/View;", "card", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f5v implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag frag;

    public f5v(@NotNull NewNewHomeFrag newNewHomeFrag) {
        newNewHomeFrag.getClass();
        this.frag = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: i */
    private final void m124249i(View card) {
        if (card instanceof VSwipeCard) {
            final VSwipeCard vSwipeCard = (VSwipeCard) card;
            vSwipeCard.m36150O0(false);
            vSwipeCard.postDelayed(new Runnable() { // from class: l.e5v
                @Override // java.lang.Runnable
                public final void run() {
                    f5v.m124250j(vSwipeCard);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m124250j(VSwipeCard vSwipeCard) {
        vSwipeCard.m36150O0(true);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@NotNull View view) {
        view.getClass();
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        parent.getClass();
        View viewMo99018a = uqb0.f180396b0.f170326c.mo68445co().mo99018a(inflater, parent);
        viewMo99018a.getClass();
        return viewMo99018a;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @Nullable VirtualCardType cardType, @Nullable View card) {
        view.getClass();
        if (position == 0) {
            m124249i(card);
        }
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null) {
            return;
        }
        List<CoreSuggested.UserInfo> list = partialListOptM222761e.loaded;
        list.getClass();
        if (list.isEmpty() || list.size() <= position || !(list.get(position).extensionObject instanceof PushMessage)) {
            return;
        }
        uqb0.f180396b0.f170326c.mo68445co().mo99020c(position, view, (PushMessage) list.get(position).extensionObject);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        swipeDirection.getClass();
        card.getClass();
        uqb0.f180396b0.f170326c.mo68445co().mo99019b(swipeDirection.getValue());
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }
}
