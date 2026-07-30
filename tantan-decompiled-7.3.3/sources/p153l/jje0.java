package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.svip.opads.BoostIntroCardView;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class jje0 implements sxl0 {

    /* JADX INFO: renamed from: b */
    public x0m f121168b;

    /* JADX INFO: renamed from: a */
    public int f121167a = 0;

    /* JADX INFO: renamed from: c */
    public y20<SwipeDirection> f121169c = new y20() { // from class: l.ije0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f115215a.m145027n((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.jje0$a */
    public static /* synthetic */ class C17961a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f121170a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f121171b;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f121171b = iArr;
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121171b[SwipeDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121171b[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VirtualCardType.values().length];
            f121170a = iArr2;
            try {
                iArr2[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public jje0(x0m x0mVar) {
        this.f121168b = x0mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m145026m(View view) {
        this.f121169c.call(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m145027n(SwipeDirection swipeDirection) {
        this.f121168b.mo37749V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        if (C17961a.f121170a[virtualCardType.ordinal()] != 1) {
            return null;
        }
        return layoutInflater.inflate(nec0.f141636u, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f121167a = 0;
        if (C17961a.f121170a[virtualCardType.ordinal()] != 1) {
            return;
        }
        ((BoostIntroCardView) view).m57032s(new y20() { // from class: l.gje0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104627a.m145029l((View) obj);
            }
        }, new y20() { // from class: l.hje0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110184a.m145026m((View) obj);
            }
        });
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        if (jamVar != null && jamVar.getIVirtualCardUserInfoProxy().virtualCardType == VirtualCardType.BoostIntroCard) {
            i4g0.m138525w("e_boost_lead_svip_card", "p_suggest_users_home_view", jyb.m147494Y("swipe_type", m145028k(swipeDirection)));
            if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
                CoreModule.m30933P().m143405a().mo34465ah(this.f121168b);
            }
            CoreModule.f18264c.f20405m0.m32034O5();
            this.f121168b.mo37744K(true);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: k */
    public final String m145028k(SwipeDirection swipeDirection) {
        int i = C17961a.f121171b[swipeDirection.ordinal()];
        if (i == 1) {
            return "right";
        }
        if (i != 2) {
            return i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
        }
        return "up";
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m145029l(View view) {
        boolean zMo34576qt = CoreModule.m30933P().m143405a().mo34576qt();
        HashMap map = new HashMap();
        map.put("is_privileged", Boolean.valueOf(!zMo34576qt));
        i4g0.m138521s("e_use_boost_button", "p_suggest_users_home_view", map);
        this.f121169c.call(SwipeDirection.RIGHT);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
