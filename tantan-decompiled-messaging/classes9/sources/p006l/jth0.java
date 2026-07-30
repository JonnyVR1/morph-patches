package p006l;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.eyl;
import l.hpd0;
import l.ic50;
import l.j760;
import l.ool0;
import l.t100;
import l.t7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jth0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f15390a;

    /* JADX INFO: renamed from: b */
    public long f15391b = 0;

    /* JADX INFO: renamed from: c */
    public hpd0 f15392c = new hpd0("first_left_slide_" + CoreModule.m1850H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public e30<SwipeDirection> f15393d = new e30() { // from class: l.ith0
        public final void call(Object obj) {
            this.f14781a.m17796j((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f15394e = new ViewOnClickListenerC0903a();

    /* JADX INFO: renamed from: l.jth0$a */
    public class ViewOnClickListenerC0903a implements View.OnClickListener {
        public ViewOnClickListenerC0903a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jth0.this.f15390a.s3(CoreModule.m1854P().m11706a().m5454hp());
            zvf0.r("e_card_add_tag", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: l.jth0$b */
    public static /* synthetic */ class C0904b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15396a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f15396a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15396a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15396a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jth0(eyl eylVar) {
        this.f15390a = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m17796j(SwipeDirection swipeDirection) {
        this.f15390a.V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: d */
    public View m17799d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(i6c0.f14242c, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.i);
        gradientDrawable.setColor(CoreModule.f1533b.getResources().getColor(y0c0.f27849m));
        VText vTextFindViewById = viewInflate.findViewById(w4c0.f24970w);
        vTextFindViewById.setBackground(gradientDrawable);
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        qib0.f19782G.m12767Y0((VDraweeView) viewInflate.findViewById(w4c0.f24930K), z2c0.f28589u);
        ImageView imageView = (ImageView) viewInflate.findViewById(w4c0.f24929J);
        double dP0 = ((double) this.f15390a.p0()) * 0.4551d;
        xdl0.D0((int) (1.0678d * dP0), new View[]{imageView});
        xdl0.C0(imageView, (int) dP0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public void m17800e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (NullChecker.a(partialListOpt) && i == 0) {
            this.f15390a.O3();
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
            if (NullChecker.a(userInfo)) {
                Object obj = userInfo.extensionObject;
                if (obj instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
                    ic50.j().f().Z(oMSAdCardInfo.identifier, 0, false);
                    jb0.m17424k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f15391b > 500) {
                        this.f15391b = System.currentTimeMillis();
                        zvf0.x("e_card_add_tag", "p_suggest_users_home_view");
                    }
                }
            }
        }
        view.findViewById(w4c0.f24970w).setOnClickListener(this.f15394e);
    }

    /* JADX INFO: renamed from: f */
    public boolean m17801f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m17802g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        if (CoreModule.f1534c.f3652m0.f3394d2.contains("tagCardGuide")) {
            CoreModule.f1534c.f3652m0.f3394d2.remove("tagCardGuide");
            CoreModule.f1534c.f3652m0.f3391c2.add("e_card_add_tag");
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        int i = C0904b.f15396a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = "left";
        }
        zvf0.w("e_card_add_tag", "p_suggest_users_home_view", new j760[]{vwb.Y("swipe_directions", str)});
        if (swipeDirection.getValue() != SwipeDirection.LEFT.getValue()) {
            this.f15390a.s3(CoreModule.m1854P().m11706a().m5454hp());
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (!((Boolean) this.f15392c.get()).booleanValue()) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f15390a.T2();
        this.f15392c.put(Boolean.FALSE);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: b */
    public void m17797b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m17798c(View view) {
    }
}
