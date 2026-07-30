package p153l;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class r1i0 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public x0m f160825a;

    /* JADX INFO: renamed from: b */
    public long f160826b = 0;

    /* JADX INFO: renamed from: c */
    public jxd0 f160827c = new jxd0("first_left_slide_" + CoreModule.m30929H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public y20<SwipeDirection> f160828d = new y20() { // from class: l.q1i0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f155192a.m179411j((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f160829e = new ViewOnClickListenerC19733a();

    /* JADX INFO: renamed from: l.r1i0$a */
    public class ViewOnClickListenerC19733a implements View.OnClickListener {
        public ViewOnClickListenerC19733a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r1i0.this.f160825a.mo37763s3(CoreModule.m30933P().m143405a().mo34520hp());
            i4g0.m138520r("e_card_add_tag", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: l.r1i0$b */
    public static /* synthetic */ class C19734b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f160831a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f160831a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160831a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f160831a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public r1i0(x0m x0mVar) {
        this.f160825a = x0mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m179411j(SwipeDirection swipeDirection) {
        this.f160825a.mo37749V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(nec0.f141618c, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qa00.f156322i);
        gradientDrawable.setColor(CoreModule.f18263b.getResources().getColor(e9c0.f92625m));
        VText vText = (VText) viewInflate.findViewById(cdc0.f81173w);
        vText.setBackground(gradientDrawable);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        uqb0.f180374G.m127138Y0((VDraweeView) viewInflate.findViewById(cdc0.f81133K), fbc0.f98082u);
        ImageView imageView = (ImageView) viewInflate.findViewById(cdc0.f81132J);
        double dMo37760p0 = ((double) this.f160825a.mo37760p0()) * 0.4551d;
        bnl0.m105507D0((int) (1.0678d * dMo37760p0), imageView);
        bnl0.m105505C0(imageView, (int) dMo37760p0);
        return viewInflate;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (NullChecker.m82486a(partialListOptM222761e) && i == 0) {
            this.f160825a.mo37745O3();
            CoreSuggested.UserInfo userInfo = partialListOptM222761e.loaded.get(i);
            if (NullChecker.m82486a(userInfo)) {
                Object obj = userInfo.extensionObject;
                if (obj instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
                    pk50.m172568j().m172574f().m181662Z(oMSAdCardInfo.identifier, 0, false);
                    fb0.m124812k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f160826b > 500) {
                        this.f160826b = System.currentTimeMillis();
                        i4g0.m138526x("e_card_add_tag", "p_suggest_users_home_view");
                    }
                }
            }
        }
        view.findViewById(cdc0.f81173w).setOnClickListener(this.f160829e);
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
        if (CoreModule.f18264c.f20405m0.f20147d2.contains("tagCardGuide")) {
            CoreModule.f18264c.f20405m0.f20147d2.remove("tagCardGuide");
            CoreModule.f18264c.f20405m0.f20144c2.add("e_card_add_tag");
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        int i = C19734b.f160831a[swipeDirection.ordinal()];
        if (i == 1) {
            str = "up";
        } else if (i != 2) {
            str = i != 3 ? "" : "right";
        } else {
            str = BLiveGiftBubblePopupTitlePosition.left;
        }
        i4g0.m138525w("e_card_add_tag", "p_suggest_users_home_view", jyb.m147494Y("swipe_directions", str));
        if (swipeDirection.getValue() != SwipeDirection.LEFT.getValue()) {
            this.f160825a.mo37763s3(CoreModule.m30933P().m143405a().mo34520hp());
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (!this.f160827c.get().booleanValue()) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        this.f160825a.mo37747T2();
        this.f160827c.put(Boolean.FALSE);
        return VSwipeStack.OnCardSwipeResult.back;
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
