package p149l;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jth0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f119600a;

    /* JADX INFO: renamed from: b */
    public long f119601b = 0;

    /* JADX INFO: renamed from: c */
    public hpd0 f119602c = new hpd0("first_left_slide_" + CoreModule.m29931H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public e30<SwipeDirection> f119603d = new e30() { // from class: l.ith0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f114883a.m143105j((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f119604e = new ViewOnClickListenerC17854a();

    /* JADX INFO: renamed from: l.jth0$a */
    public class ViewOnClickListenerC17854a implements View.OnClickListener {
        public ViewOnClickListenerC17854a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jth0.this.f119600a.mo36760s3(CoreModule.m29935P().m94651a().mo33517hp());
            zvf0.m220396r("e_card_add_tag", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: l.jth0$b */
    public static /* synthetic */ class C17855b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119606a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f119606a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119606a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119606a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jth0(eyl eylVar) {
        this.f119600a = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m143105j(SwipeDirection swipeDirection) {
        this.f119600a.mo36746V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(i6c0.f111708c, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.f167260i);
        gradientDrawable.setColor(CoreModule.f17544b.getResources().getColor(y0c0.f195301m));
        VText vText = (VText) viewInflate.findViewById(w4c0.f184544w);
        vText.setBackground(gradientDrawable);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        qib0.f154691G.m102354Y0((VDraweeView) viewInflate.findViewById(w4c0.f184504K), z2c0.f201213u);
        ImageView imageView = (ImageView) viewInflate.findViewById(w4c0.f184503J);
        double dMo36757p0 = ((double) this.f119600a.mo36757p0()) * 0.4551d;
        xdl0.m208327D0((int) (1.0678d * dMo36757p0), imageView);
        xdl0.m208325C0(imageView, (int) dMo36757p0);
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (NullChecker.m81303a(partialListOptM221515e) && i == 0) {
            this.f119600a.mo36742O3();
            CoreSuggested.UserInfo userInfo = partialListOptM221515e.loaded.get(i);
            if (NullChecker.m81303a(userInfo)) {
                Object obj = userInfo.extensionObject;
                if (obj instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
                    ic50.m135327j().m135333f().m145239Z(oMSAdCardInfo.identifier, 0, false);
                    jb0.m140733k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f119601b > 500) {
                        this.f119601b = System.currentTimeMillis();
                        zvf0.m220402x("e_card_add_tag", "p_suggest_users_home_view");
                    }
                }
            }
        }
        view.findViewById(w4c0.f184544w).setOnClickListener(this.f119604e);
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
        if (CoreModule.f17545c.f19663m0.f19405d2.contains("tagCardGuide")) {
            CoreModule.f17545c.f19663m0.f19405d2.remove("tagCardGuide");
            CoreModule.f17545c.f19663m0.f19402c2.add("e_card_add_tag");
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        int i = C17855b.f119606a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = BLiveGiftBubblePopupTitlePosition.left;
        }
        zvf0.m220401w("e_card_add_tag", "p_suggest_users_home_view", vwb.m200311Y("swipe_directions", str));
        if (swipeDirection.getValue() != SwipeDirection.LEFT.getValue()) {
            this.f119600a.mo36760s3(CoreModule.m29935P().m94651a().mo33517hp());
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (!this.f119602c.get().booleanValue()) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f119600a.mo36744T2();
        this.f119602c.put(Boolean.FALSE);
        return VSwipeStack.OnCardSwipeResult.back;
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
