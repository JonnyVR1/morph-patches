package p003l;

import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.t100;
import l.vwb;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class od2 implements ool0 {

    /* JADX INFO: renamed from: a */
    public VText f6645a;

    /* JADX INFO: renamed from: b */
    public VText f6646b;

    /* JADX INFO: renamed from: c */
    public final Runnable f6647c;

    /* JADX INFO: renamed from: l.od2$a */
    public class C3391a extends ViewOutlineProvider {
        public C3391a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), t100.o);
        }
    }

    /* JADX INFO: renamed from: l.od2$b */
    public static /* synthetic */ class C3392b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6649a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f6649a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6649a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6649a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public od2(Runnable runnable) {
        this.f6647c = runnable;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
        if (NullChecker.a(this.f6647c)) {
            this.f6647c.run();
            zvf0.r("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        CardView cardViewM8440h = m8440h(layoutInflater, viewGroup);
        cardViewM8440h.setOutlineProvider(new C3391a());
        cardViewM8440h.setClipToOutline(true);
        this.f6645a.getPaint().setFakeBoldText(true);
        this.f6646b.getPaint().setFakeBoldText(true);
        return cardViewM8440h;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (i == 0) {
            zvf0.x("e_bar_activity_card", "p_suggest_users_home_view");
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            qd2.m8956b(t7mVar.getIVirtualCardContext());
        }
        int i = C3392b.f6649a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = "left";
        }
        zvf0.w("e_bar_activity_card", "p_suggest_users_home_view", new j760[]{vwb.Y("swipe_directions", str)});
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public View m8440h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pd2.m8733b(this, layoutInflater, viewGroup);
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }
}
