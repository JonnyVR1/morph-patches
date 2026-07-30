package p153l;

import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class vd2 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public VText f183527a;

    /* JADX INFO: renamed from: b */
    public VText f183528b;

    /* JADX INFO: renamed from: c */
    public final Runnable f183529c;

    /* JADX INFO: renamed from: l.vd2$a */
    public class C20812a extends ViewOutlineProvider {
        public C20812a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qa00.f156328o);
        }
    }

    /* JADX INFO: renamed from: l.vd2$b */
    public static /* synthetic */ class C20813b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183531a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f183531a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183531a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183531a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vd2(Runnable runnable) {
        this.f183529c = runnable;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
        if (NullChecker.m82486a(this.f183529c)) {
            this.f183529c.run();
            i4g0.m138520r("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        CardView cardView = (CardView) m200907h(layoutInflater, viewGroup);
        cardView.setOutlineProvider(new C20812a());
        cardView.setClipToOutline(true);
        this.f183527a.getPaint().setFakeBoldText(true);
        this.f183528b.getPaint().setFakeBoldText(true);
        return cardView;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (i == 0) {
            i4g0.m138526x("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        String str;
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            xd2.m210443b((Act) jamVar.getIVirtualCardContext());
        }
        int i = C20813b.f183531a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = BLiveGiftBubblePopupTitlePosition.left;
        }
        i4g0.m138525w("e_bar_activity_card", "p_suggest_users_home_view", jyb.m147494Y("swipe_directions", str));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public View m200907h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wd2.m205838b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }
}
