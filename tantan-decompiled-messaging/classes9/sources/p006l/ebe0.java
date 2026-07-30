package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.svip.opads.BoostIntroCardView;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import java.util.HashMap;
import l.e30;
import l.eyl;
import l.j760;
import l.ool0;
import l.t7m;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ebe0 implements ool0 {

    /* JADX INFO: renamed from: b */
    public eyl f11042b;

    /* JADX INFO: renamed from: a */
    public int f11041a = 0;

    /* JADX INFO: renamed from: c */
    public e30<SwipeDirection> f11043c = new e30() { // from class: l.dbe0
        public final void call(Object obj) {
            this.f10278a.m14426n((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.ebe0$a */
    public static /* synthetic */ class C0666a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11044a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11045b;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f11045b = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11045b[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11045b[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VirtualCardType.values().length];
            f11044a = iArr2;
            try {
                iArr2[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ebe0(eyl eylVar) {
        this.f11042b = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m14425m(View view) {
        this.f11043c.call(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m14426n(SwipeDirection swipeDirection) {
        this.f11042b.V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: d */
    public View m14429d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        if (C0666a.f11044a[virtualCardType.ordinal()] != 1) {
            return null;
        }
        return layoutInflater.inflate(i6c0.f14260u, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m14430e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f11041a = 0;
        if (C0666a.f11044a[virtualCardType.ordinal()] != 1) {
            return;
        }
        ((BoostIntroCardView) view).m9247s(new e30() { // from class: l.bbe0
            public final void call(Object obj) {
                this.f8806a.m14434l((View) obj);
            }
        }, new e30() { // from class: l.cbe0
            public final void call(Object obj) {
                this.f9582a.m14425m((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m14431f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m14432g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (t7mVar != null && t7mVar.getIVirtualCardUserInfoProxy().virtualCardType == VirtualCardType.BoostIntroCard) {
            zvf0.w("e_boost_lead_svip_card", "p_suggest_users_home_view", new j760[]{vwb.Y("swipe_type", m14433k(swipeDirection))});
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.m1854P().m11706a().m5399ah(this.f11042b);
            }
            CoreModule.f1534c.f3652m0.m2961O5();
            this.f11042b.K(true);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: k */
    public final String m14433k(SwipeDirection swipeDirection) {
        int i = C0666a.f11045b[swipeDirection.ordinal()];
        if (i == 1) {
            return "right";
        }
        if (i != 2) {
            return i != 3 ? "" : "left";
        }
        return "up";
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m14434l(View view) {
        boolean zM5510qt = CoreModule.m1854P().m11706a().m5510qt();
        HashMap map = new HashMap();
        map.put("is_privileged", Boolean.valueOf(!zM5510qt));
        zvf0.s("e_use_boost_button", "p_suggest_users_home_view", map);
        this.f11043c.call(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: b */
    public void m14427b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m14428c(View view) {
    }
}
