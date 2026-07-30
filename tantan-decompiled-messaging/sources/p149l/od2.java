package p149l;

import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class od2 implements ool0 {

    /* JADX INFO: renamed from: a */
    public VText f143160a;

    /* JADX INFO: renamed from: b */
    public VText f143161b;

    /* JADX INFO: renamed from: c */
    public final Runnable f143162c;

    /* JADX INFO: renamed from: l.od2$a */
    public class C18895a extends ViewOutlineProvider {
        public C18895a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.f167266o);
        }
    }

    /* JADX INFO: renamed from: l.od2$b */
    public static /* synthetic */ class C18896b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f143164a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f143164a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f143164a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f143164a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public od2(Runnable runnable) {
        this.f143162c = runnable;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
        if (NullChecker.m81303a(this.f143162c)) {
            this.f143162c.run();
            zvf0.m220396r("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        CardView cardView = (CardView) m163646h(layoutInflater, viewGroup);
        cardView.setOutlineProvider(new C18895a());
        cardView.setClipToOutline(true);
        this.f143160a.getPaint().setFakeBoldText(true);
        this.f143161b.getPaint().setFakeBoldText(true);
        return cardView;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (i == 0) {
            zvf0.m220402x("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            qd2.m173940b((Act) t7mVar.getIVirtualCardContext());
        }
        int i = C18896b.f143164a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = BLiveGiftBubblePopupTitlePosition.left;
        }
        zvf0.m220401w("e_bar_activity_card", "p_suggest_users_home_view", vwb.m200311Y("swipe_directions", str));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public View m163646h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pd2.m168379b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }
}
