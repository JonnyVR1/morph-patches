package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.svip.opads.BoostIntroCardView;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ebe0 implements ool0 {

    /* JADX INFO: renamed from: b */
    public eyl f90321b;

    /* JADX INFO: renamed from: a */
    public int f90320a = 0;

    /* JADX INFO: renamed from: c */
    public e30<SwipeDirection> f90322c = new e30() { // from class: l.dbe0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f85311a.m115468n((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.ebe0$a */
    public static /* synthetic */ class C16567a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90323a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f90324b;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f90324b = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90324b[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90324b[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VirtualCardType.values().length];
            f90323a = iArr2;
            try {
                iArr2[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ebe0(eyl eylVar) {
        this.f90321b = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m115467m(View view) {
        this.f90322c.call(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m115468n(SwipeDirection swipeDirection) {
        this.f90321b.mo36746V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        if (C16567a.f90323a[virtualCardType.ordinal()] != 1) {
            return null;
        }
        return layoutInflater.inflate(i6c0.f111726u, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f90320a = 0;
        if (C16567a.f90323a[virtualCardType.ordinal()] != 1) {
            return;
        }
        ((BoostIntroCardView) view).m55849s(new e30() { // from class: l.bbe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74801a.m115470l((View) obj);
            }
        }, new e30() { // from class: l.cbe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80135a.m115467m((View) obj);
            }
        });
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (t7mVar != null && t7mVar.getIVirtualCardUserInfoProxy().virtualCardType == VirtualCardType.BoostIntroCard) {
            zvf0.m220401w("e_boost_lead_svip_card", "p_suggest_users_home_view", vwb.m200311Y("swipe_type", m115469k(swipeDirection)));
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.m29935P().m94651a().mo33462ah(this.f90321b);
            }
            CoreModule.f17545c.f19663m0.m31031O5();
            this.f90321b.mo36741K(true);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: k */
    public final String m115469k(SwipeDirection swipeDirection) {
        int i = C16567a.f90324b[swipeDirection.ordinal()];
        if (i == 1) {
            return "right";
        }
        if (i != 2) {
            return i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
        }
        return "up";
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m115470l(View view) {
        boolean zMo33573qt = CoreModule.m29935P().m94651a().mo33573qt();
        HashMap map = new HashMap();
        map.put("is_privileged", Boolean.valueOf(!zMo33573qt));
        zvf0.m220397s("e_use_boost_button", "p_suggest_users_home_view", map);
        this.f90322c.call(SwipeDirection.RIGHT);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
