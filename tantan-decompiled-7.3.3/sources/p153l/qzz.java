package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageChannel;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageRight;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageCommunityHintFooterView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageSeeletterFooterView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.ConvNextView;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.ProxyTantanListView;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.wrap.MessageRecyclerView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.BlurCoverLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.NotificationSettingsAct;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList_Horizontal;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.VText_AutoFit;
import p151v.navigationbar.VNavigationBar;
import p153l.clz;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qzz<P extends clz<?, ?>> implements iam<P> {

    /* JADX INFO: renamed from: I1 */
    public static C22507a<Boolean> f160320I1 = C22507a.m222758b();

    /* JADX INFO: renamed from: J1 */
    public static final vxd0 f160321J1 = new vxd0("whitelist_dialog2", 0);

    /* JADX INFO: renamed from: K1 */
    public static int f160322K1 = qa00.m175859d(240.0f);

    /* JADX INFO: renamed from: L1 */
    public static String f160323L1 = null;

    /* JADX INFO: renamed from: A */
    public VText f160324A;

    /* JADX INFO: renamed from: B */
    public VButton f160326B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f160328C;

    /* JADX INFO: renamed from: D */
    public VText f160330D;

    /* JADX INFO: renamed from: E */
    public VText f160332E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f160333E0;

    /* JADX INFO: renamed from: F */
    public VButton f160335F;

    /* JADX INFO: renamed from: F0 */
    public VText f160336F0;

    /* JADX INFO: renamed from: G */
    public View f160338G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f160339G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f160341H;

    /* JADX INFO: renamed from: H0 */
    public VFrame f160342H0;

    /* JADX INFO: renamed from: I */
    public VText f160344I;

    /* JADX INFO: renamed from: I0 */
    public View f160345I0;

    /* JADX INFO: renamed from: J */
    public VText_AutoFit f160346J;

    /* JADX INFO: renamed from: J0 */
    public VLinear f160347J0;

    /* JADX INFO: renamed from: K */
    public VButton f160348K;

    /* JADX INFO: renamed from: K0 */
    public VImage f160349K0;

    /* JADX INFO: renamed from: L */
    public VImage f160350L;

    /* JADX INFO: renamed from: L0 */
    public VText f160351L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f160352M;

    /* JADX INFO: renamed from: M0 */
    public VImage f160353M0;

    /* JADX INFO: renamed from: N */
    public VText f160354N;

    /* JADX INFO: renamed from: N0 */
    public VFrame f160355N0;

    /* JADX INFO: renamed from: O */
    public VFrame f160356O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f160357O0;

    /* JADX INFO: renamed from: P */
    public VFrame f160358P;

    /* JADX INFO: renamed from: P0 */
    public VText f160359P0;

    /* JADX INFO: renamed from: Q */
    public RecyclerView f160360Q;

    /* JADX INFO: renamed from: Q0 */
    public MessageCommunityHintFooterView f160361Q0;

    /* JADX INFO: renamed from: R */
    public VFrame f160362R;

    /* JADX INFO: renamed from: R0 */
    public MessageSeeletterFooterView f160363R0;

    /* JADX INFO: renamed from: S */
    public MessageRecyclerDispatchLinear f160364S;

    /* JADX INFO: renamed from: S0 */
    public SVGAnimationView f160365S0;

    /* JADX INFO: renamed from: T */
    public MessageLayout f160366T;

    /* JADX INFO: renamed from: T0 */
    public ConstraintLayout f160367T0;

    /* JADX INFO: renamed from: U */
    public MessageRecyclerView f160368U;

    /* JADX INFO: renamed from: U0 */
    public VText f160369U0;

    /* JADX INFO: renamed from: V */
    public ProxyTantanListView f160370V;

    /* JADX INFO: renamed from: V0 */
    public RelativeLayout f160371V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f160372W;

    /* JADX INFO: renamed from: W0 */
    public VList_Horizontal f160373W0;

    /* JADX INFO: renamed from: X */
    public TextView f160374X;

    /* JADX INFO: renamed from: X0 */
    public SceneView f160375X0;

    /* JADX INFO: renamed from: Y */
    public TextView f160376Y;

    /* JADX INFO: renamed from: Y0 */
    public ViewStub f160377Y0;

    /* JADX INFO: renamed from: Z */
    public TextView f160378Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f160379Z0;

    /* JADX INFO: renamed from: a */
    public LinearLayout f160380a;

    /* JADX INFO: renamed from: a1 */
    public VText f160381a1;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f160382b;

    /* JADX INFO: renamed from: b1 */
    public VDraweeView f160383b1;

    /* JADX INFO: renamed from: c */
    public TextView f160384c;

    /* JADX INFO: renamed from: c1 */
    public VLinear f160385c1;

    /* JADX INFO: renamed from: d */
    public FrameLayout f160386d;

    /* JADX INFO: renamed from: d1 */
    public VImage f160387d1;

    /* JADX INFO: renamed from: e */
    public VDraweeView f160388e;

    /* JADX INFO: renamed from: e1 */
    public VText f160389e1;

    /* JADX INFO: renamed from: f */
    public TextView f160390f;

    /* JADX INFO: renamed from: f1 */
    public VText f160391f1;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f160392g;

    /* JADX INFO: renamed from: g1 */
    public VNavigationBar f160393g1;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f160394h;

    /* JADX INFO: renamed from: h1 */
    public FrameLayout f160395h1;

    /* JADX INFO: renamed from: i */
    public FrameLayout f160396i;

    /* JADX INFO: renamed from: i1 */
    public VRecyclerView f160397i1;

    /* JADX INFO: renamed from: j */
    public VDraweeView f160398j;

    /* JADX INFO: renamed from: j1 */
    public FrameLayout f160399j1;

    /* JADX INFO: renamed from: k */
    public View f160400k;

    /* JADX INFO: renamed from: k0 */
    public ConvNextView f160401k0;

    /* JADX INFO: renamed from: k1 */
    public CoreGiftLayer f160402k1;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f160403l;

    /* JADX INFO: renamed from: l1 */
    public SVGAnimationView f160404l1;

    /* JADX INFO: renamed from: m */
    public BlurCoverLayout f160405m;

    /* JADX INFO: renamed from: m1 */
    public SVGAnimationView f160406m1;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f160407n;

    /* JADX INFO: renamed from: n1 */
    public iwl f160408n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f160409o;

    /* JADX INFO: renamed from: o1 */
    public MessagesAct f160410o1;

    /* JADX INFO: renamed from: p */
    public VLinear f160411p;

    /* JADX INFO: renamed from: p0 */
    public VLinear f160412p0;

    /* JADX INFO: renamed from: p1 */
    public P f160413p1;

    /* JADX INFO: renamed from: q */
    public VText f160414q;

    /* JADX INFO: renamed from: q1 */
    public Menu f160415q1;

    /* JADX INFO: renamed from: r */
    public VText f160416r;

    /* JADX INFO: renamed from: r1 */
    public hxy f160417r1;

    /* JADX INFO: renamed from: s */
    public VButton f160418s;

    /* JADX INFO: renamed from: t */
    public VImage f160420t;

    /* JADX INFO: renamed from: t1 */
    public rdz f160421t1;

    /* JADX INFO: renamed from: u */
    public LinearLayout f160422u;

    /* JADX INFO: renamed from: v */
    public VText f160424v;

    /* JADX INFO: renamed from: w */
    public VButton f160426w;

    /* JADX INFO: renamed from: w1 */
    public g900 f160427w1;

    /* JADX INFO: renamed from: x */
    public VImage f160428x;

    /* JADX INFO: renamed from: x1 */
    public kcg0 f160429x1;

    /* JADX INFO: renamed from: y */
    public LinearLayout f160430y;

    /* JADX INFO: renamed from: y1 */
    public int f160431y1;

    /* JADX INFO: renamed from: z */
    public VText f160432z;

    /* JADX INFO: renamed from: z1 */
    public PopupWindow f160433z1;

    /* JADX INFO: renamed from: s1 */
    public TextPaint f160419s1 = null;

    /* JADX INFO: renamed from: u1 */
    public boolean f160423u1 = true;

    /* JADX INFO: renamed from: v1 */
    public Runnable f160425v1 = null;

    /* JADX INFO: renamed from: A1 */
    public boolean f160325A1 = false;

    /* JADX INFO: renamed from: B1 */
    public int f160327B1 = qa00.m175859d(104.0f);

    /* JADX INFO: renamed from: C1 */
    public int f160329C1 = qa00.m175859d(80.0f);

    /* JADX INFO: renamed from: D1 */
    public boolean f160331D1 = false;

    /* JADX INFO: renamed from: E1 */
    public HashMap<String, String> f160334E1 = new HashMap<>();

    /* JADX INFO: renamed from: F1 */
    public final Interpolator f160337F1 = new xjg();

    /* JADX INFO: renamed from: G1 */
    public final int f160340G1 = 350;

    /* JADX INFO: renamed from: H1 */
    public boolean f160343H1 = true;

    /* JADX INFO: renamed from: l.qzz$a */
    public class C19701a extends pn50 {
        public C19701a() {
        }

        @Override // p153l.pn50
        /* JADX INFO: renamed from: a */
        public void mo173031a(int i) {
            super.mo173031a(i);
            if (i == 0) {
                qzz.this.m178901K1();
                qzz.this.m178893G1();
                qzz.this.f160421t1.mo169750e();
            }
        }

        @Override // p153l.pn50
        /* JADX INFO: renamed from: b */
        public void mo49560b(int i, int i2) {
            super.mo49560b(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.qzz$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC19702b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener[] f160435a;

        public ViewTreeObserverOnGlobalLayoutListenerC19702b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr) {
            this.f160435a = onGlobalLayoutListenerArr;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m178989b() {
            qzz.this.m178893G1();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!NullChecker.m82486a(qzz.this.f160408n1) || qzz.this.f160408n1.getRealView().getMeasuredHeight() <= 0) {
                return;
            }
            qzz.this.m178901K1();
            l51.m152887G(new Runnable() { // from class: l.rzz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165646a.m178989b();
                }
            });
            qzz.this.f160408n1.getRealView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f160435a[0]);
        }
    }

    /* JADX INFO: renamed from: l.qzz$d */
    public class C19704d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f160438a;

        public C19704d(x20 x20Var) {
            this.f160438a = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105524M(qzz.this.f160404l1, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            this.f160438a.call();
        }
    }

    /* JADX INFO: renamed from: l.qzz$e */
    public class C19705e extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f160440a;

        public C19705e(Runnable runnable) {
            this.f160440a = runnable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (qzz.this.f160368U.m50920H()) {
                this.f160440a.run();
                qzz.this.f160368U.removeOnScrollListener(this);
            }
        }
    }

    public qzz(MessagesAct messagesAct) {
        this.f160410o1 = messagesAct;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m178845F(MessageBar messageBar, View view) {
        messageBar.getBar_center_text().setFocusable(true);
        messageBar.getBar_center_text().setFocusableInTouchMode(true);
        messageBar.getBar_center_text().requestFocus();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m178855P() {
        if (NullChecker.m82486a(Act.foreground_()) && NullChecker.m82486a(Act.foreground_().f16062a.get())) {
            CoreModule.m30933P().m143412i().mo180567y3((Act) Act.foreground_().f16062a.get(), "time_limited_match");
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m178856Q(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m178866b0() {
        PopupWindow popupWindow = new PopupWindow();
        this.f160433z1 = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(qec0.f156915O5, (ViewGroup) null, false));
        this.f160433z1.setInputMethodMode(1);
        this.f160433z1.setWidth(0);
        this.f160433z1.setHeight(0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178868d(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m178881w() {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m178884z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m178885A0() {
        if (this.f160339G0 == null) {
            return;
        }
        m178921V1();
        this.f160408n1.getRealView().setTranslationY(0.0f);
        if (NullChecker.m82486a(this.f160412p0) && this.f160343H1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f160412p0.getLayoutParams();
            marginLayoutParams.bottomMargin = qa00.m175859d(12.0f);
            this.f160412p0.setLayoutParams(marginLayoutParams);
        }
        this.f160401k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: A1 */
    public void m178886A1(int i) {
        this.f160408n1.mo50801p(i);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m178887B0() {
        this.f160417r1 = new hxy(this.f160410o1);
    }

    /* JADX INFO: renamed from: B1 */
    public void m178888B1() {
        if (NullChecker.m82486a(this.f160427w1)) {
            this.f160427w1.m153307y();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160410o1;
    }

    /* JADX INFO: renamed from: C1 */
    public void m178889C1() {
        if (this.f160427w1.mo129499d() > 0) {
            for (int lastVisiblePositionHook = this.f160408n1.getLastVisiblePositionHook() - this.f160408n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewMo50794C = this.f160408n1.mo50794C(lastVisiblePositionHook);
                if (viewMo50794C instanceof ItemMessageRight) {
                    C8687b.m50247p(((ItemMessageRight) viewMo50794C).f32095P);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void mo154145D0() {
        this.f160421t1.mo120539k();
        m178890E0();
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            m178977u0();
            if (CoreModule.m30933P().m143412i().mo180314E()) {
                this.f160413p1.mo110970e4();
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m178890E0() {
    }

    /* JADX INFO: renamed from: E1 */
    public boolean mo154146E1(Menu menu) {
        this.f160415q1 = menu;
        menu.close();
        return true;
    }

    /* JADX INFO: renamed from: F1 */
    public void m178891F1(boolean z) {
        if (z && this.f160413p1.m110947Z5() && NullChecker.m82486a(this.f160433z1) && !this.f160433z1.isShowing()) {
            this.f160433z1.setBackgroundDrawable(new ColorDrawable(0));
            this.f160433z1.showAtLocation(this.f160410o1.getWindow().getDecorView(), 0, 0, 0);
        }
        f160320I1.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: G0 */
    public void m178892G0() {
        rdz rdzVarMo154147f0 = mo154147f0();
        this.f160421t1 = rdzVarMo154147f0;
        rdzVarMo154147f0.mo120537b(this.f160410o1, this.f160408n1, this.f160413p1);
        if (CoreModule.m30933P().m143412i().mo180521p4()) {
            this.f160427w1 = new g900(this.f160370V, this.f160413p1);
        } else {
            this.f160427w1 = new g900(this.f160368U, this.f160413p1);
        }
        this.f160427w1.mo139060t(this.f160421t1.mo120538g());
        this.f160408n1.setMessageAdapterHook(this.f160427w1);
        this.f160408n1.mo50800n(new C19701a());
        if (this.f160413p1.m110965d4()) {
            bnl0.m105524M(this.f160355N0, true);
            bnl0.m105524M(this.f160357O0, true);
            bnl0.m105524M(this.f160361Q0, false);
            bnl0.m105524M(this.f160363R0, false);
        } else if (this.f160413p1.mo111005l4()) {
            boolean zMo110993i7 = this.f160413p1.mo110993i7();
            VFrame vFrame = this.f160355N0;
            if (zMo110993i7) {
                bnl0.m105524M(vFrame, true);
                bnl0.m105524M(this.f160363R0, true);
                bnl0.m105524M(this.f160361Q0, false);
                bnl0.m105524M(this.f160357O0, false);
            } else {
                bnl0.m105524M(vFrame, false);
            }
        }
        ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        onGlobalLayoutListenerArr[0] = new ViewTreeObserverOnGlobalLayoutListenerC19702b(onGlobalLayoutListenerArr);
        this.f160408n1.getRealView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        this.f160371V0.setVisibility(8);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m178893G1() {
        if (this.f160408n1 == null || this.f160427w1 == null) {
            return;
        }
        String strMo111034r3 = this.f160413p1.mo111034r3();
        if (User.ID_TEAM_ACCOUNT.equals(strMo111034r3) || User.ID_LIVE_SERVICE.equals(strMo111034r3)) {
            int firstVisiblePositionHook = this.f160408n1.getFirstVisiblePositionHook();
            ArrayList arrayList = new ArrayList();
            for (int lastVisiblePositionHook = this.f160408n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
                int headerViewsCountHook = lastVisiblePositionHook - this.f160408n1.getHeaderViewsCountHook();
                if (headerViewsCountHook >= 0 && headerViewsCountHook < this.f160427w1.mo129499d() && this.f160427w1.mo129507p(headerViewsCountHook) < 116) {
                    Message messageMo129506m = this.f160427w1.mo129506m(headerViewsCountHook);
                    if (NullChecker.m82486a(messageMo129506m) && messageMo129506m.needRead && !messageMo129506m.read) {
                        arrayList.add(messageMo129506m);
                    }
                }
            }
            if (arrayList.size() > 0) {
                CoreModule.f18264c.f20384f0.m33588Ao(strMo111034r3, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m178894H0() {
        Conversation conversationM110994j3;
        if (CoreModule.m30933P().m143412i().mo34605uh() && this.f160429x1 == null && (conversationM110994j3 = this.f160413p1.m110994j3()) != null) {
            final double d = conversationM110994j3.additional.heartbeatMatch.expireTime;
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f160429x1 = act().duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).map(new qcj() { // from class: l.eyz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.m30933P().m143412i().mo180464f0(d);
                }
            }).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.fyz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101428a.m178918U0((String) obj);
                }
            }, new y20() { // from class: l.gyz
                @Override // p153l.y20
                public final void call(Object obj) {
                    qzz.m178884z((Throwable) obj);
                }
            }));
            this.f160389e1.setText(CoreModule.m30933P().m143412i().mo180464f0(d));
            if (CoreModule.m30933P().m143412i().mo34605uh()) {
                this.f160385c1.setBackgroundResource(ibc0.f113757B5);
            }
            m178896I0();
            this.f160391f1.post(new Runnable() { // from class: l.hyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112181a.m178920V0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m178896I0() {
        bnl0.m105524M(this.f160385c1, true);
        bnl0.m105509E0(this.f160385c1, new View.OnClickListener() { // from class: l.bzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79189a.m178923X0(view);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m178897I1() {
        this.f160391f1.postDelayed(new Runnable() { // from class: l.wyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f191721a.m178946g1();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: J0 */
    public void m178898J0() {
        Conversation conversationM110994j3;
        if (this.f160429x1 == null && (conversationM110994j3 = this.f160413p1.m110994j3()) != null) {
            final double d = conversationM110994j3.additional.quickChat.expire;
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f160429x1 = act().duringCreated(C22421c.interval(1L, TimeUnit.SECONDS)).map(new qcj() { // from class: l.kzz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.m30933P().m143412i().mo180464f0(d);
                }
            }).distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.lzz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f134285a.m178926Y0((String) obj);
                }
            }, new y20() { // from class: l.mzz
                @Override // p153l.y20
                public final void call(Object obj) {
                    qzz.m178868d((Throwable) obj);
                }
            }));
            this.f160389e1.setText(CoreModule.m30933P().m143412i().mo180464f0(d));
            if (CoreModule.m30933P().m143412i().mo34605uh()) {
                this.f160385c1.setBackgroundResource(ibc0.f113757B5);
            }
            m178896I0();
            this.f160391f1.post(new Runnable() { // from class: l.nzz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144484a.m178929Z0();
                }
            });
            if (d < pzi0.m174454o() + 10800000) {
                CoreModule.m30933P().m143412i().mo180528r0(this.f160413p1.f82474c);
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m178899J1(x20 x20Var) {
        if (this.f160331D1) {
            this.f160331D1 = false;
            bnl0.m105524M(this.f160404l1, true);
            SVGALoader.with(this.f160410o1).from("https://auto.tancdn.com/v1/raw/d3b79b08-70a6-436f-bfe8-3dbd8395b3d610.so").autoPlay(true).repeatCount(1).animListener(new C19704d(x20Var)).into(this.f160404l1);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m178900K0() {
        final MessageBar messageBarM114041t0 = this.f160413p1.m143372e0().mo50138B0().m143374g0().m114041t0();
        messageBarM114041t0.getBar_center_text().setOnClickListener(new View.OnClickListener() { // from class: l.pzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qzz.m178845F(messageBarM114041t0, view);
            }
        });
    }

    /* JADX INFO: renamed from: K1 */
    public void m178901K1() {
        if (this.f160408n1 == null || this.f160427w1 == null || !ConnectivityReceiver.m82472l() || this.f160413p1.mo110970e4()) {
            return;
        }
        int firstVisiblePositionHook = this.f160408n1.getFirstVisiblePositionHook();
        ArrayList arrayList = new ArrayList();
        for (int lastVisiblePositionHook = this.f160408n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
            int i = lastVisiblePositionHook - 1;
            if (i >= 0 && i < this.f160427w1.mo129499d() && ((this.f160427w1.mo129507p(i) == 118 || this.f160427w1.mo129507p(i) == 2) && NullChecker.m82486a(this.f160427w1.mo129506m(i)) && NullChecker.m82486a(this.f160427w1.mo129506m(i).media) && NullChecker.m82486a(this.f160427w1.mo129506m(i).media.get(0)) && (this.f160427w1.mo129506m(i).media.get(0) instanceof Video))) {
                String aspectRatio = ((Video) this.f160427w1.mo129506m(i).media.get(0)).formatAspectRatio();
                if (!TextUtils.isEmpty(aspectRatio) && aspectRatio.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(aspectRatio);
                }
            }
        }
        if (arrayList.size() > 0) {
            uqb0.m197248T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m178902L0() {
        return this.f160331D1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m178903L1(boolean z) {
        if (CoreModule.m30933P().m143405a().mo34534kb() && bnl0.m105529O0(this.f160412p0)) {
            VText vText = this.f160336F0;
            if (z) {
                if (bnl0.m105529O0(vText)) {
                    bnl0.m105525M0(this.f160336F0, false);
                    VLinear vLinear = this.f160412p0;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationX", 0.0f, vLinear.getWidth() - qa00.m175859d(44.0f));
                    objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            if (bnl0.m105529O0(vText)) {
                return;
            }
            bnl0.m105525M0(this.f160336F0, true);
            VLinear vLinear2 = this.f160412p0;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vLinear2, "translationX", vLinear2.getWidth() - qa00.m175859d(44.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(0.8f));
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.start();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public void m178904M1() {
        rdz rdzVarMo154147f0 = mo154147f0();
        this.f160421t1 = rdzVarMo154147f0;
        rdzVarMo154147f0.mo120537b(this.f160410o1, this.f160408n1, this.f160413p1);
        this.f160427w1.mo139060t(this.f160421t1.mo120538g());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m178905N0() {
        return bnl0.m105529O0(this.f160341H);
    }

    /* JADX INFO: renamed from: O1 */
    public void m178907O1(boolean z) {
        if (CoreModule.m30933P().m143405a().mo34335Hd() && bnl0.m105529O0(this.f160401k0)) {
            this.f160401k0.m50660R(z);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m178908P0(float f, float f2, ValueAnimator valueAnimator) {
        if (f != 0.0f) {
            this.f160410o1.m50164y2().f160408n1.getRealView().setTranslationY(f + ((f2 - f) * valueAnimator.getAnimatedFraction()));
        }
        this.f160358P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f160358P.requestLayout();
    }

    /* JADX INFO: renamed from: P1 */
    public void m178909P1() {
        if (this.f160360Q.getAdapter() != null) {
            this.f160360Q.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m178910Q0() {
        bnl0.m105524M(this.f160338G, true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m178912R0(int i, ValueAnimator valueAnimator) {
        if (i != 0) {
            this.f160410o1.m50164y2().f160408n1.getRealView().setTranslationY(i * valueAnimator.getAnimatedFraction());
        }
        this.f160358P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f160358P.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX INFO: renamed from: R1 */
    public void m178913R1(final boolean z, final Runnable runnable) {
        int i;
        if (this.f160339G0.getChildCount() == 0) {
            return;
        }
        final float translationY = this.f160339G0.getTranslationY();
        if (this.f160417r1.m137695q()) {
            translationY = 0.0f;
        }
        this.f160417r1.m137691m();
        this.f160339G0.getHeight();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f160412p0)) {
            ViewGroup.LayoutParams layoutParams = this.f160412p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (!z) {
            m178885A0();
        }
        arrayList.add((NullChecker.m82486a(this.f160412p0) && this.f160343H1) ? gt0.m132167m(this.f160412p0, MessageBarOpt.f32782I0, 0L, 350L, this.f160337F1, i, qa00.m175859d(12.0f)) : gt0.m132164j(350));
        if (z) {
            LinearLayout linearLayout = this.f160339G0;
            arrayList.add(gt0.m132170p(linearLayout, "translationY", 0L, 350L, this.f160337F1, translationY, linearLayout.getHeight() + translationY));
            arrayList.add(gt0.m132170p(this.f160339G0, "alpha", 0L, 350L, this.f160337F1, 1.0f, 0.0f));
            if (!this.f160413p1.m143372e0().mo50155d0().m201095D0() && this.f160417r1.m137695q()) {
                arrayList.add(gt0.m132169o(this.f160408n1.getRealView(), MessageBarOpt.f32782I0, -qa00.m175859d(240.0f)));
            }
        }
        Animator animatorM132180z = gt0.m132180z((Animator[]) arrayList.toArray(new Animator[arrayList.size()]));
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.syz
            @Override // java.lang.Runnable
            public final void run() {
                this.f171341a.m178949h1(translationY, z, runnable);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m178914S0() {
        bnl0.m105524M(this.f160338G, false);
    }

    /* JADX INFO: renamed from: S1 */
    public void m178915S1() {
        this.f160421t1.mo175735a();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m178916T0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        this.f160413p1.m143372e0().mo50155d0().m143374g0().mo125459c().mo102266b(bool, num, bool2, num2);
        if (!bool.booleanValue()) {
            this.f160413p1.m143372e0().mo50138B0().m143374g0().m114021j0();
        }
        mo178906O0(num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: T1 */
    public void m178917T1() {
        bnl0.m105524M(this.f160355N0, false);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m178918U0(String str) {
        this.f160389e1.setText(str);
        if ("00s".equals(str)) {
            m178981w0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m178919U1() {
        this.f160427w1.mo139056j(this.f160421t1.mo120538g());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m178920V0() {
        this.f160431y1 = this.f160391f1.getWidth();
    }

    /* JADX INFO: renamed from: V1 */
    public void m178921V1() {
        m178983x0();
        if (this.f160417r1.m137695q()) {
            ViewGroup.LayoutParams layoutParams = this.f160408n1.getRealView().getLayoutParams();
            int i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0;
            bnl0.m105537U(this.f160408n1.getRealView(), -qa00.m175859d(240.0f));
            int height = this.f160366T.getHeight() - (this.f160408n1.getListRenderHeight() - qa00.m175859d(480.0f));
            if (height >= 0 && height <= i + qa00.m175859d(240.0f)) {
                this.f160408n1.getRealView().setBottom(this.f160408n1.getRealView().getBottom() + height);
            }
        }
        this.f160417r1.m137683B(0);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m178922W0(ValueAnimator valueAnimator) {
        this.f160391f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f160385c1.setTranslationX((int) (this.f160431y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m178923X0(View view) {
        if (bnl0.m105529O0(this.f160391f1)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.czz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f84514a.m178922W0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        bnl0.m105525M0(this.f160391f1, true);
        gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.dzz
            @Override // java.lang.Runnable
            public final void run() {
                this.f91395a.m178897I1();
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m178924X1() {
        if (this.f160409o == null || this.f160380a == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f160409o.getChildCount(); i++) {
            if (this.f160409o.getChildAt(i).getId() == this.f160380a.getId()) {
                z = true;
            }
        }
        if (z) {
            this.f160409o.removeView(this.f160380a);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m178925Y(View view) {
        szz.m188688a(this, view);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m178926Y0(String str) {
        this.f160389e1.setText(str);
        if ("00s".equals(str)) {
            m178981w0();
            act().lambda$debugItems$19();
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.azz
                @Override // java.lang.Runnable
                public final void run() {
                    qzz.m178855P();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m178927Y1(String str, String str2) {
        bnl0.m105524M(this.f160362R, true);
        this.f160362R.removeAllViews();
        CoreModule.m30934Q().mo68412M6().mo127337h(this.f160413p1.act(), this.f160362R, str, str2);
    }

    /* JADX INFO: renamed from: Z */
    public View m178928Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tzz.m193752b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m178929Z0() {
        this.f160431y1 = this.f160391f1.getWidth();
        if (CoreModule.m30933P().m143412i().mo180427Y0(this.f160413p1.f82474c)) {
            this.f160385c1.setTranslationX(this.f160431y1);
            bnl0.m105525M0(this.f160391f1, false);
        } else {
            m178897I1();
            CoreModule.m30933P().m143412i().mo180543u1(this.f160413p1.f82474c);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m178930Z1() {
        if (this.f160408n1.getLastVisiblePositionHook() == this.f160408n1.getCountHook() - 1) {
            return;
        }
        iwl iwlVar = this.f160408n1;
        iwlVar.mo50805x(iwlVar.getCountHook() - 1);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f160410o1;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m178932a1(Message message, boolean z, Sticker sticker) {
        this.f160413p1.m110881L2(message, z, sticker);
        this.f160408n1.mo50796e();
    }

    /* JADX INFO: renamed from: a2 */
    public void m178933a2() {
        if (this.f160408n1.getLastVisiblePositionHook() == this.f160408n1.getCountHook() - 1) {
            return;
        }
        int iAbs = Math.abs(this.f160408n1.getCountHook() - this.f160408n1.getLastVisiblePositionHook());
        iwl iwlVar = this.f160408n1;
        if (iAbs >= 15) {
            iwlVar.mo50796e();
        } else {
            iwlVar.mo50805x(Math.max(0, iwlVar.getCountHook() - 1));
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m178934b2() {
        this.f160421t1.mo175739i();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f160413p1 = p;
    }

    /* JADX INFO: renamed from: c2 */
    public void m178936c2(String str) {
        this.f160391f1.setText(str);
        this.f160391f1.measure(0, 0);
        this.f160431y1 = this.f160391f1.getMeasuredWidth();
        this.f160391f1.post(new Runnable() { // from class: l.ozz
            @Override // java.lang.Runnable
            public final void run() {
                this.f149984a.m178954j1();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m178937d0() {
        this.f160339G0.setPadding(qa00.m175859d(10.0f), 0, 0, 0);
        mo178911Q1(false, new Runnable() { // from class: l.zyz
            @Override // java.lang.Runnable
            public final void run() {
                qzz.m178881w();
            }
        });
        this.f160401k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m178938d1(final Message message, final boolean z, final Sticker sticker) {
        if (this.f160408n1.getLastVisiblePositionHook() == this.f160408n1.getCountHook() - 1) {
            this.f160413p1.m110881L2(message, z, sticker);
        } else {
            act().post(new Runnable() { // from class: l.dyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91312a.m178932a1(message, z, sticker);
                }
            });
        }
        this.f160408n1.mo50796e();
        if (CoreModule.m30933P().m143412i().mo34591si()) {
            CoreModule.m30933P().m143412i().mo180347K0();
            if (CoreModule.f18264c.f20433v1.m117813m3("haveRead", "opening")) {
                CoreModule.m30933P().m143412i().mo180466f2(act());
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m178939d2() {
        this.f160331D1 = true;
    }

    /* JADX INFO: renamed from: e0 */
    public void m178940e0() {
        if (this.f160423u1) {
            int height = this.f160358P.getHeight();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
            final float translationY = this.f160410o1.m50164y2().f160408n1.getRealView().getTranslationY();
            final float f = 0.0f;
            if (translationY < 0.0f) {
                float f2 = height;
                if (f2 < Math.abs(translationY)) {
                    f = translationY + f2;
                }
            }
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.byz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f79084a.m178908P0(translationY, f, valueAnimator);
                }
            });
            gt0.m132160f(valueAnimatorOfInt, new Runnable() { // from class: l.cyz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84412a.m178910Q0();
                }
            }).setDuration(300L).start();
            this.f160413p1.m143372e0().mo50143F().m183232y0().m202981u(true);
            this.f160423u1 = false;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m178941e1(ValueAnimator valueAnimator) {
        this.f160391f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f160385c1.setTranslationX((int) (this.f160431y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: e2 */
    public void m178942e2() {
        bnl0.m105524M(this.f160347J0, true);
        i4g0.m138526x("e_intl_ai_translate_bubble", OMSDialogPositon.p_chat_view);
        bnl0.m105509E0(this.f160353M0, new View.OnClickListener() { // from class: l.pyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154700a.m178956k1(view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public abstract rdz mo154147f0();

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m178943f1() {
        bnl0.m105525M0(this.f160391f1, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m178944f2(final int i, final Runnable runnable) {
        this.f160339G0.setAlpha(0.0f);
        l51.m152886F(this.f160410o1, new Runnable() { // from class: l.ezz
            @Override // java.lang.Runnable
            public final void run() {
                this.f96636a.m178961m1(i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m178945g0() {
        if (NullChecker.m82486a(this.f160433z1) && this.f160433z1.isShowing()) {
            this.f160433z1.dismiss();
            this.f160433z1 = null;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m178946g1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fzz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f101570a.m178941e1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        gt0.m132160f(valueAnimatorOfFloat, new Runnable() { // from class: l.hzz
            @Override // java.lang.Runnable
            public final void run() {
                this.f112316a.m178943f1();
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public void m178947g2() {
        this.f160328C.setVisibility(8);
        m178979v0();
        if (this.f160413p1.m110988h7()) {
            this.f160411p.setVisibility(8);
            this.f160430y.setVisibility(8);
            this.f160328C.setVisibility(0);
            this.f160335F.setText(this.f160413p1.m110918T5());
            this.f160330D.setText(this.f160413p1.m110927V5());
            this.f160332E.setText(this.f160413p1.m110923U5());
            this.f160413p1.m111018n7();
            bnl0.m105509E0(this.f160335F, new View.OnClickListener() { // from class: l.iyz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117650a.m178963n1(view);
                }
            });
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180409V0()) {
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && this.f160413p1.m110995j4() && NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
            bnl0.m105524M(this.f160411p, false);
            bnl0.m105524M(this.f160430y, false);
            m178957k2();
            return;
        }
        if (!CoreModule.m30933P().m143412i().mo180565y1() || !CoreModule.m30933P().m143412i().mo180538t0()) {
            if (CoreModule.m30933P().m143412i().mo180476h0()) {
                if (!bnl0.m105529O0(this.f160430y)) {
                    CoreModule.m30933P().m143412i().mo180327G4();
                }
                this.f160430y.setVisibility(0);
                if (NullChecker.m82486a(this.f160413p1.m110932W5()) && TEnum.equals(this.f160413p1.m110932W5().gender, "female")) {
                    this.f160324A.setText(R$string.f21840u5);
                }
                this.f160326B.setOnClickListener(new View.OnClickListener() { // from class: l.myz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f139448a.m178969q1(view);
                    }
                });
                return;
            }
            if (clz.f82445H0 || !u17.f176975c) {
                return;
            }
            vxd0 vxd0Var = f160321J1;
            if (vxd0Var.get().intValue() >= 3 || !Network.language().equals(Network.LANGUAGE_ZH_HANS)) {
                return;
            }
            String str = Build.MANUFACTURER;
            if (str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_VIVO) || str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
                clz.f82445H0 = true;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
                tcz.m190526D(this.f160410o1, new Runnable() { // from class: l.nyz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144400a.m178972r1();
                    }
                }, new Runnable() { // from class: l.oyz
                    @Override // java.lang.Runnable
                    public final void run() {
                        qzz.f160321J1.put(3);
                    }
                });
                return;
            }
            return;
        }
        if (!bnl0.m105529O0(this.f160411p)) {
            CoreModule.m30933P().m143412i().mo180327G4();
        }
        this.f160411p.setVisibility(0);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f160413p1.mo111034r3());
        if (NullChecker.m82486a(userM116503Pa)) {
            if (this.f160419s1 == null) {
                this.f160419s1 = new TextPaint();
            }
            this.f160419s1.setTextSize(qa00.m175859d(15.0f));
            int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(155.0f);
            String str2 = userM116503Pa.name;
            float f = iM105592y0;
            if (f > this.f160419s1.measureText(act().getString(R$string.f21742j2, str2)) || str2.length() <= 1) {
                this.f160414q.setText(act().getString(R$string.f21742j2, userM116503Pa.name));
            } else {
                String strSubstring = str2.substring(0, str2.length() - 1);
                float fMeasureText = this.f160419s1.measureText(act().getString(R$string.f21742j2, strSubstring.concat("…")));
                while (fMeasureText > f && strSubstring.length() > 1) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    fMeasureText = this.f160419s1.measureText(act().getString(R$string.f21742j2, strSubstring.concat("…")));
                }
                this.f160414q.setText(act().getString(R$string.f21742j2, strSubstring.concat("…")));
            }
            boolean zIsFemale = userM116503Pa.isFemale();
            VText vText = this.f160416r;
            if (zIsFemale) {
                vText.setText(R$string.f21724h2);
            } else {
                vText.setText(R$string.f21733i2);
            }
        }
        bnl0.m105509E0(this.f160418s, new View.OnClickListener() { // from class: l.jyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123215a.m178965o1(view);
            }
        });
        bnl0.m105509E0(this.f160420t, new View.OnClickListener() { // from class: l.lyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134149a.m178967p1(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m178948h0() {
        int i;
        if (this.f160423u1) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, qa00.m175859d(141.0f));
        hxy hxyVar = this.f160417r1;
        final int i2 = (hxyVar == null || (i = hxyVar.f112076f) == 0) ? 0 : -i;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xyz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f196803a.m178912R0(i2, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfInt, new Runnable() { // from class: l.yyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f202162a.m178914S0();
            }
        }).setDuration(300L).start();
        this.f160413p1.m143372e0().mo50143F().m183232y0().m202981u(false);
        this.f160423u1 = true;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m178949h1(float f, boolean z, Runnable runnable) {
        if (this.f160339G0.getTranslationY() == this.f160339G0.getHeight() + f) {
            this.f160339G0.setTranslationY(f);
        }
        this.f160417r1.m137683B(0);
        if (z) {
            m178921V1();
            this.f160401k0.setMarginBottom(12);
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m178950h2() {
        if (ItemMessageBase.m49495Y(act())) {
            return;
        }
        this.f160413p1.m143372e0().mo50155d0().m143374g0().mo125465k(3, -1);
    }

    /* JADX INFO: renamed from: i0 */
    public void m178951i0(View view) {
        m178925Y(view);
    }

    /* JADX INFO: renamed from: i2 */
    public void m178952i2() {
        bnl0.m105524M(this.f160341H, true);
        i4g0.m138526x("e_open_button_click", OMSDialogPositon.p_chat_view);
        bnl0.m105509E0(this.f160350L, new View.OnClickListener() { // from class: l.vyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186435a.m178974s1(view);
            }
        });
        bnl0.m105509E0(this.f160348K, new View.OnClickListener() { // from class: l.gzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107257a.m178978u1(view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = App.f16085b;
        View viewM178928Z = m178928Z(layoutInflater, null);
        if (CoreModule.m30933P().m143412i().mo180521p4()) {
            idi0 idi0Var = new idi0();
            idi0Var.m50855b0(true);
            bnl0.m105524M(this.f160370V, true);
            this.f160370V.setLayoutManager(idi0Var);
            this.f160408n1 = this.f160370V;
        } else {
            bnl0.m105524M(this.f160368U, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setStackFromEnd(true);
            this.f160368U.setLayoutManager(linearLayoutManager);
            this.f160408n1 = this.f160368U;
        }
        View viewInflateView = this.f160410o1.m50142E2() ? this.f160413p1.m143372e0().mo50159o0().m143374g0().inflateView(layoutInflater, viewGroup) : null;
        if (CoreModule.m30933P().m143412i().mo180362M4()) {
            this.f160399j1.addView(this.f160413p1.m143372e0().mo50157k0().m143374g0().inflateView(layoutInflater, viewGroup));
            bnl0.m105524M(this.f160399j1, true);
        }
        d3z d3zVarM143374g0 = this.f160413p1.m143372e0().mo50138B0().m143374g0();
        d3zVarM143374g0.inflateView(layoutInflater, viewGroup);
        LinearLayout linearLayout = this.f160409o;
        if (!this.f160410o1.m50142E2()) {
            viewInflateView = d3zVarM143374g0.m114041t0();
        }
        linearLayout.addView(viewInflateView);
        View upKeyboardDetectorLayout = this.f160410o1.setUpKeyboardDetectorLayout(viewM178928Z, this.f160413p1.m143372e0().mo50160u0().m143374g0().inflateView(layoutInflater, viewGroup), new b30() { // from class: l.kyz
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f129375a.m178916T0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (this.f160413p1.m110947Z5()) {
            m178866b0();
        }
        m178900K0();
        this.f160363R0.m50114c0(this.f160413p1);
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j0 */
    public g900 m178953j0() {
        return this.f160427w1;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m178954j1() {
        this.f160431y1 = this.f160385c1.getWidth() - this.f160389e1.getRight();
        if (CoreModule.m30933P().m143412i().mo180427Y0(this.f160413p1.f82474c)) {
            this.f160385c1.setTranslationX(this.f160431y1);
            bnl0.m105525M0(this.f160391f1, false);
        } else {
            m178897I1();
            CoreModule.m30933P().m143412i().mo180543u1(this.f160413p1.f82474c);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public pf60<Integer, Integer> mo178955k0() {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m178956k1(View view) {
        m178975t0();
    }

    /* JADX INFO: renamed from: k2 */
    public final void m178957k2() {
        if (CoreModule.m30933P().m143412i().mo180399T1(this.f160413p1.mo111034r3())) {
            return;
        }
        if (!bnl0.m105529O0(this.f160422u)) {
            CoreModule.m30933P().m143412i().mo180327G4();
        }
        this.f160422u.setVisibility(0);
        this.f160424v.setText("打开推送，接收重要信息");
        i4g0.m138526x("e_im_push_banner", this.f160413p1.pageId());
        bnl0.m105509E0(this.f160426w, new View.OnClickListener() { // from class: l.tyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176730a.m178980v1(view);
            }
        });
        bnl0.m105509E0(this.f160428x, new View.OnClickListener() { // from class: l.uyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181693a.m178982w1(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public String m178958l0() {
        return this.f160413p1.m143372e0().mo50138B0().m143374g0().m114041t0().getBar_center_text().getText() == null ? "" : this.f160413p1.m143372e0().mo50138B0().m143374g0().m114041t0().getBar_center_text().getText().toString();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m178959l1(int i) {
        if ((this.f160410o1.f32488f instanceof tvz) && hxy.m137681r(i)) {
            ((tvz) this.f160410o1.f32488f).m193122Dg();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VNavigationBar m178960m0() {
        return this.f160393g1;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m178961m1(final int i, final Runnable runnable) {
        int height = this.f160339G0.getHeight();
        float translationY = this.f160339G0.getTranslationY();
        if (hxy.m137681r(i)) {
            translationY = 0.0f;
        }
        bnl0.m105537U(this.f160401k0, qa00.m175859d(26.0f) + height);
        int iM175859d = qa00.m175859d(12.0f);
        if (NullChecker.m82486a(this.f160412p0)) {
            ViewGroup.LayoutParams layoutParams = this.f160412p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                iM175859d = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
        }
        Animator animatorM132180z = gt0.m132180z(this.f160417r1.m137695q() ? gt0.m132169o(this.f160408n1.getRealView(), MessageBarOpt.f32782I0, height - qa00.m175859d(240.0f)) : gt0.m132164j(350), gt0.m132170p(this.f160339G0, "translationY", 0L, 350L, this.f160337F1, height + translationY, translationY), gt0.m132170p(this.f160339G0, "alpha", 0L, 350L, this.f160337F1, 0.0f, 1.0f), (NullChecker.m82486a(this.f160412p0) && this.f160343H1) ? gt0.m132167m(this.f160412p0, MessageBarOpt.f32782I0, 0L, 350L, this.f160337F1, iM175859d, qa00.m175859d(12.0f) + height) : gt0.m132164j(350));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.izz
            @Override // java.lang.Runnable
            public final void run() {
                qzz.m178856Q(runnable);
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.jzz
            @Override // java.lang.Runnable
            public final void run() {
                this.f123344a.m178959l1(i);
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m178962n0() {
        return this.f160423u1;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m178963n1(View view) {
        this.f160413p1.m111013m7();
    }

    /* JADX INFO: renamed from: o0 */
    public LinearLayout m178964o0() {
        return this.f160372W;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m178965o1(View view) {
        this.f160411p.setVisibility(8);
        i4g0.m138520r("e_chat_prompt_notification_auth_banner_open_button", this.f160413p1.pageId());
        CoreModule.m30933P().m143412i().mo180397T();
        CoreModule.m30933P().m143412i().mo180355L3();
    }

    /* JADX INFO: renamed from: p0 */
    public LinearLayout m178966p0() {
        return this.f160339G0;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m178967p1(View view) {
        this.f160411p.setVisibility(8);
        i4g0.m138520r("e_chat_prompt_notification_auth_banner_close_button", this.f160413p1.pageId());
        CoreModule.m30933P().m143412i().mo180355L3();
    }

    /* JADX INFO: renamed from: q0 */
    public View m178968q0() {
        VLinear rightIconContainer = this.f160393g1.getRightIconContainer();
        if (rightIconContainer.getChildCount() > 0) {
            View viewFindViewWithTag = rightIconContainer.findViewWithTag("settingMenuTag");
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                return viewFindViewWithTag;
            }
        }
        return this.f160393g1.getRightIconContainer();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m178969q1(View view) {
        this.f160326B.setOnClickListener(null);
        this.f160430y.setVisibility(8);
        CoreModule.m30933P().m143412i().mo180386R1();
        CoreModule.m30933P().m143412i().mo180397T();
        CoreModule.m30933P().m143412i().mo180330H1();
    }

    /* JADX INFO: renamed from: r */
    public void mo178970r() {
        bnl0.m105505C0(this.f160365S0, bnl0.m105588w0());
        this.f160365S0.setScaleX(1.1f);
        this.f160365S0.setScaleY(1.1f);
        bnl0.m105507D0(bnl0.m105592y0(), this.f160365S0);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f160414q.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102817g));
            this.f160416r.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102819i));
            this.f160418s.setBackgroundResource(ibc0.f114012f);
            this.f160420t.setImageResource(ibc0.f113890Q3);
            this.f160432z.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102817g));
            this.f160324A.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102819i));
            this.f160326B.setBackgroundResource(ibc0.f114012f);
            this.f160344I.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102817g));
            this.f160346J.setTextColor(this.f160410o1.getResources().getColor(g9c0.f102819i));
            this.f160348K.setBackgroundResource(ibc0.f114012f);
            this.f160350L.setImageResource(ibc0.f113890Q3);
        }
        m178892G0();
        m178887B0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m178971r0() {
        bnl0.m105524M(this.f160341H, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m178972r1() {
        f160321J1.put(3);
        this.f160410o1.startActivity(new Intent(this.f160410o1, (Class<?>) NotificationSettingsAct.class));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m178973s0() {
        ArrayList arrayListM147522n;
        if (this.f160413p1.mo111008l7()) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f160413p1.f82473b);
            if (NullChecker.m82486a(userM116503Pa) && (arrayListM147522n = jyb.m147522n(userM116503Pa.pictures, new qcj() { // from class: l.ayz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            })) != null && arrayListM147522n.size() > 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m178974s1(View view) {
        bnl0.m105524M(this.f160341H, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m178975t0() {
        bnl0.m105524M(this.f160347J0, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m178976t1(SettingGroups settingGroups) {
        o1j0.m165651y("已开启消息通知");
        bnl0.m105524M(this.f160341H, false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m178977u0() {
        bnl0.m105524M(this.f160345I0, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m178978u1(View view) {
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed && !CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("openWithFriend", true, 0, 0)).subscribe(psd0.m173597H(new y20() { // from class: l.qyz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160210a.m178976t1((SettingGroups) obj);
                }
            }, new y20() { // from class: l.ryz
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        } else {
            act().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("openWithFriend", true, 0, 0)).subscribe(psd0.m173601L(psd0.m173591B()));
            CoreModule.m30933P().m143412i().mo180397T();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m178979v0() {
        bnl0.m105524M(this.f160422u, false);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m178980v1(View view) {
        this.f160422u.setVisibility(8);
        i4g0.m138523u("e_im_push_banner", this.f160413p1.pageId(), jyb.m147494Y("notification_action", "open"));
        CoreModule.m30933P().m143412i().mo180397T();
    }

    /* JADX INFO: renamed from: w0 */
    public void m178981w0() {
        bsj0.m106263U(this.f160429x1);
        this.f160429x1 = null;
        bnl0.m105524M(this.f160385c1, false);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m178982w1(View view) {
        this.f160422u.setVisibility(8);
        i4g0.m138523u("e_im_push_banner", this.f160413p1.pageId(), jyb.m147494Y("notification_action", "close"));
        CoreModule.m30933P().m143412i().mo180423X1(this.f160413p1.mo111034r3());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m178983x0() {
        this.f160339G0.removeAllViews();
        this.f160339G0.setPadding(qa00.f156322i, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160339G0.getLayoutParams();
        layoutParams.rightMargin = 0;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 83;
        this.f160339G0.setLayoutParams(layoutParams);
        this.f160339G0.setBackgroundResource(g9c0.f102807Y);
    }

    /* JADX INFO: renamed from: y0 */
    public void m178984y0(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, this.f160371V0.getHeight());
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC19703c());
        translateAnimation.setDuration(800L);
        RelativeLayout relativeLayout = this.f160371V0;
        if (z) {
            relativeLayout.startAnimation(translateAnimation);
        } else {
            relativeLayout.setVisibility(8);
        }
        this.f160325A1 = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void m178985y1(Runnable runnable) {
        if (this.f160368U.m50919G()) {
            runnable.run();
            return;
        }
        this.f160368U.addOnScrollListener(new C19705e(runnable));
        if (Math.abs(this.f160368U.getCount() - this.f160368U.getLastVisiblePosition()) >= 15) {
            this.f160368U.m50921I();
        } else {
            m178930Z1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m178986z0() {
        bsj0.m106263U(this.f160429x1);
        this.f160429x1 = null;
    }

    /* JADX INFO: renamed from: z1 */
    public void m178987z1(final Message message, final boolean z, final Sticker sticker) {
        if (CoreModule.m30933P().m143412i().mo180512o1(this.f160413p1.f82474c) && !joa.m146357G3()) {
            o1j0.m165636j("黑金会员已过期，重新开通立即解锁专属客服");
            return;
        }
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            if (!NullChecker.m82486a(this.f160413p1.mo111064x6()) || this.f160413p1.mo111064x6().inactivated) {
                o1j0.m165636j("对方已注销");
                return;
            } else if (this.f160413p1.mo111064x6().status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                o1j0.m165636j("对方账号异常");
                return;
            }
        }
        if (User.isBusinessAI1V1(this.f160413p1.mo111034r3()) && !joa.m146349A3()) {
            o1j0.m165651y("今天太累了，明天再聊吧");
            return;
        }
        if (this.f160413p1.m110980g4()) {
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            message.channel = MessageChannel.get(this.f160413p1.mo110970e4() ? "group" : "default");
        }
        if (CoreModule.m30930K().me_().isChatJailed() && NullChecker.m82486a(this.f160413p1.mo111064x6()) && !this.f160413p1.mo111064x6().isTeamAccount()) {
            CoreModule.m30933P().m143412i().mo180433Z2(act(), false);
            return;
        }
        String stringExtra = act().getIntent().getStringExtra("heartbeat_consume_type");
        if (TextUtils.equals(stringExtra, "quickchat")) {
            message.consumeType = "privilege";
        } else if (TextUtils.equals(stringExtra, "coin")) {
            message.consumeType = "coin";
            message.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("quickchatNumber"));
        }
        Runnable runnable = new Runnable() { // from class: l.zxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f206534a.m178938d1(message, z, sticker);
            }
        };
        if (this.f160408n1.mo50799m()) {
            runnable.run();
            return;
        }
        int iAbs = Math.abs(this.f160408n1.getCountHook() - this.f160408n1.getLastVisiblePositionHook());
        iwl iwlVar = this.f160408n1;
        if (iAbs >= 15) {
            iwlVar.mo50796e();
        } else {
            iwlVar.mo50805x(Math.max(0, iwlVar.getCountHook() - 1));
        }
        this.f160408n1.getRealView().postDelayed(runnable, 200L);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.qzz$c */
    public class AnimationAnimationListenerC19703c implements Animation.AnimationListener {
        public AnimationAnimationListenerC19703c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            qzz.this.f160371V0.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void mo178895H1(Message message) {
    }

    /* JADX INFO: renamed from: O0 */
    public void mo178906O0(int i, boolean z) {
    }

    /* JADX INFO: renamed from: Q1 */
    public void mo178911Q1(boolean z, Runnable runnable) {
    }
}
