package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageChannel;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageRight;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageCommunityHintFooterView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageSeeletterFooterView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.ConvNextView;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.ProxyTantanListView;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.wrap.MessageRecyclerView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.BlurCoverLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.NotificationSettingsAct;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList_Horizontal;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.VText_AutoFit;
import p147v.navigationbar.VNavigationBar;
import p149l.fcz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tqz<P extends fcz<?, ?>> implements s7m<P> {

    /* JADX INFO: renamed from: I1 */
    public static C22392a<Boolean> f171657I1 = C22392a.m221512b();

    /* JADX INFO: renamed from: J1 */
    public static final tpd0 f171658J1 = new tpd0("whitelist_dialog2", 0);

    /* JADX INFO: renamed from: K1 */
    public static int f171659K1 = t100.m186890d(240.0f);

    /* JADX INFO: renamed from: L1 */
    public static String f171660L1 = null;

    /* JADX INFO: renamed from: A */
    public VText f171661A;

    /* JADX INFO: renamed from: B */
    public VButton f171663B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f171665C;

    /* JADX INFO: renamed from: D */
    public VText f171667D;

    /* JADX INFO: renamed from: E */
    public VText f171669E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f171670E0;

    /* JADX INFO: renamed from: F */
    public VButton f171672F;

    /* JADX INFO: renamed from: F0 */
    public VText f171673F0;

    /* JADX INFO: renamed from: G */
    public View f171675G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f171676G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f171678H;

    /* JADX INFO: renamed from: H0 */
    public VFrame f171679H0;

    /* JADX INFO: renamed from: I */
    public VText f171681I;

    /* JADX INFO: renamed from: I0 */
    public View f171682I0;

    /* JADX INFO: renamed from: J */
    public VText_AutoFit f171683J;

    /* JADX INFO: renamed from: J0 */
    public VLinear f171684J0;

    /* JADX INFO: renamed from: K */
    public VButton f171685K;

    /* JADX INFO: renamed from: K0 */
    public VImage f171686K0;

    /* JADX INFO: renamed from: L */
    public VImage f171687L;

    /* JADX INFO: renamed from: L0 */
    public VText f171688L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f171689M;

    /* JADX INFO: renamed from: M0 */
    public VImage f171690M0;

    /* JADX INFO: renamed from: N */
    public VText f171691N;

    /* JADX INFO: renamed from: N0 */
    public VFrame f171692N0;

    /* JADX INFO: renamed from: O */
    public VFrame f171693O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f171694O0;

    /* JADX INFO: renamed from: P */
    public VFrame f171695P;

    /* JADX INFO: renamed from: P0 */
    public VText f171696P0;

    /* JADX INFO: renamed from: Q */
    public RecyclerView f171697Q;

    /* JADX INFO: renamed from: Q0 */
    public MessageCommunityHintFooterView f171698Q0;

    /* JADX INFO: renamed from: R */
    public VFrame f171699R;

    /* JADX INFO: renamed from: R0 */
    public MessageSeeletterFooterView f171700R0;

    /* JADX INFO: renamed from: S */
    public MessageRecyclerDispatchLinear f171701S;

    /* JADX INFO: renamed from: S0 */
    public SVGAnimationView f171702S0;

    /* JADX INFO: renamed from: T */
    public MessageLayout f171703T;

    /* JADX INFO: renamed from: T0 */
    public ConstraintLayout f171704T0;

    /* JADX INFO: renamed from: U */
    public MessageRecyclerView f171705U;

    /* JADX INFO: renamed from: U0 */
    public VText f171706U0;

    /* JADX INFO: renamed from: V */
    public ProxyTantanListView f171707V;

    /* JADX INFO: renamed from: V0 */
    public RelativeLayout f171708V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f171709W;

    /* JADX INFO: renamed from: W0 */
    public VList_Horizontal f171710W0;

    /* JADX INFO: renamed from: X */
    public TextView f171711X;

    /* JADX INFO: renamed from: X0 */
    public SceneView f171712X0;

    /* JADX INFO: renamed from: Y */
    public TextView f171713Y;

    /* JADX INFO: renamed from: Y0 */
    public ViewStub f171714Y0;

    /* JADX INFO: renamed from: Z */
    public TextView f171715Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f171716Z0;

    /* JADX INFO: renamed from: a */
    public LinearLayout f171717a;

    /* JADX INFO: renamed from: a1 */
    public VText f171718a1;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f171719b;

    /* JADX INFO: renamed from: b1 */
    public VDraweeView f171720b1;

    /* JADX INFO: renamed from: c */
    public TextView f171721c;

    /* JADX INFO: renamed from: c1 */
    public VLinear f171722c1;

    /* JADX INFO: renamed from: d */
    public FrameLayout f171723d;

    /* JADX INFO: renamed from: d1 */
    public VImage f171724d1;

    /* JADX INFO: renamed from: e */
    public VDraweeView f171725e;

    /* JADX INFO: renamed from: e1 */
    public VText f171726e1;

    /* JADX INFO: renamed from: f */
    public TextView f171727f;

    /* JADX INFO: renamed from: f1 */
    public VText f171728f1;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f171729g;

    /* JADX INFO: renamed from: g1 */
    public VNavigationBar f171730g1;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f171731h;

    /* JADX INFO: renamed from: h1 */
    public FrameLayout f171732h1;

    /* JADX INFO: renamed from: i */
    public FrameLayout f171733i;

    /* JADX INFO: renamed from: i1 */
    public VRecyclerView f171734i1;

    /* JADX INFO: renamed from: j */
    public VDraweeView f171735j;

    /* JADX INFO: renamed from: j1 */
    public FrameLayout f171736j1;

    /* JADX INFO: renamed from: k */
    public View f171737k;

    /* JADX INFO: renamed from: k0 */
    public ConvNextView f171738k0;

    /* JADX INFO: renamed from: k1 */
    public CoreGiftLayer f171739k1;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f171740l;

    /* JADX INFO: renamed from: l1 */
    public SVGAnimationView f171741l1;

    /* JADX INFO: renamed from: m */
    public BlurCoverLayout f171742m;

    /* JADX INFO: renamed from: m1 */
    public SVGAnimationView f171743m1;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f171744n;

    /* JADX INFO: renamed from: n1 */
    public utl f171745n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f171746o;

    /* JADX INFO: renamed from: o1 */
    public MessagesAct f171747o1;

    /* JADX INFO: renamed from: p */
    public VLinear f171748p;

    /* JADX INFO: renamed from: p0 */
    public VLinear f171749p0;

    /* JADX INFO: renamed from: p1 */
    public P f171750p1;

    /* JADX INFO: renamed from: q */
    public VText f171751q;

    /* JADX INFO: renamed from: q1 */
    public Menu f171752q1;

    /* JADX INFO: renamed from: r */
    public VText f171753r;

    /* JADX INFO: renamed from: r1 */
    public koy f171754r1;

    /* JADX INFO: renamed from: s */
    public VButton f171755s;

    /* JADX INFO: renamed from: t */
    public VImage f171757t;

    /* JADX INFO: renamed from: t1 */
    public u4z f171758t1;

    /* JADX INFO: renamed from: u */
    public LinearLayout f171759u;

    /* JADX INFO: renamed from: v */
    public VText f171761v;

    /* JADX INFO: renamed from: w */
    public VButton f171763w;

    /* JADX INFO: renamed from: w1 */
    public j000 f171764w1;

    /* JADX INFO: renamed from: x */
    public VImage f171765x;

    /* JADX INFO: renamed from: x1 */
    public c4g0 f171766x1;

    /* JADX INFO: renamed from: y */
    public LinearLayout f171767y;

    /* JADX INFO: renamed from: y1 */
    public int f171768y1;

    /* JADX INFO: renamed from: z */
    public VText f171769z;

    /* JADX INFO: renamed from: z1 */
    public PopupWindow f171770z1;

    /* JADX INFO: renamed from: s1 */
    public TextPaint f171756s1 = null;

    /* JADX INFO: renamed from: u1 */
    public boolean f171760u1 = true;

    /* JADX INFO: renamed from: v1 */
    public Runnable f171762v1 = null;

    /* JADX INFO: renamed from: A1 */
    public boolean f171662A1 = false;

    /* JADX INFO: renamed from: B1 */
    public int f171664B1 = t100.m186890d(104.0f);

    /* JADX INFO: renamed from: C1 */
    public int f171666C1 = t100.m186890d(80.0f);

    /* JADX INFO: renamed from: D1 */
    public boolean f171668D1 = false;

    /* JADX INFO: renamed from: E1 */
    public HashMap<String, String> f171671E1 = new HashMap<>();

    /* JADX INFO: renamed from: F1 */
    public final Interpolator f171674F1 = new jig();

    /* JADX INFO: renamed from: G1 */
    public final int f171677G1 = 350;

    /* JADX INFO: renamed from: H1 */
    public boolean f171680H1 = true;

    /* JADX INFO: renamed from: l.tqz$a */
    public class C20253a extends jf50 {
        public C20253a() {
        }

        @Override // p149l.jf50
        /* JADX INFO: renamed from: a */
        public void mo141174a(int i) {
            super.mo141174a(i);
            if (i == 0) {
                tqz.this.m190260K1();
                tqz.this.m190253G1();
                tqz.this.f171758t1.mo180267e();
            }
        }

        @Override // p149l.jf50
        /* JADX INFO: renamed from: b */
        public void mo48377b(int i, int i2) {
            super.mo48377b(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.tqz$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC20254b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener[] f171772a;

        public ViewTreeObserverOnGlobalLayoutListenerC20254b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr) {
            this.f171772a = onGlobalLayoutListenerArr;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m190344b() {
            tqz.this.m190253G1();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!NullChecker.m81303a(tqz.this.f171745n1) || tqz.this.f171745n1.getRealView().getMeasuredHeight() <= 0) {
                return;
            }
            tqz.this.m190260K1();
            e51.m114742G(new Runnable() { // from class: l.uqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177796a.m190344b();
                }
            });
            tqz.this.f171745n1.getRealView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f171772a[0]);
        }
    }

    /* JADX INFO: renamed from: l.tqz$d */
    public class C20256d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f171775a;

        public C20256d(d30 d30Var) {
            this.f171775a = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208344M(tqz.this.f171741l1, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            this.f171775a.call();
        }
    }

    /* JADX INFO: renamed from: l.tqz$e */
    public class C20257e extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f171777a;

        public C20257e(Runnable runnable) {
            this.f171777a = runnable;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (tqz.this.f171705U.m49737H()) {
                this.f171777a.run();
                tqz.this.f171705U.removeOnScrollListener(this);
            }
        }
    }

    public tqz(MessagesAct messagesAct) {
        this.f171747o1 = messagesAct;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m190205F(MessageBar messageBar, View view) {
        messageBar.getBar_center_text().setFocusable(true);
        messageBar.getBar_center_text().setFocusableInTouchMode(true);
        messageBar.getBar_center_text().requestFocus();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m190215P() {
        if (NullChecker.m81303a(Act.foreground_()) && NullChecker.m81303a(Act.foreground_().f15343a.get())) {
            CoreModule.m29935P().m94658i().mo158475y3((Act) Act.foreground_().f15343a.get(), "time_limited_match");
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m190216Q(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m190226b0() {
        PopupWindow popupWindow = new PopupWindow();
        this.f171770z1 = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(l6c0.f126359O5, (ViewGroup) null, false));
        this.f171770z1.setInputMethodMode(1);
        this.f171770z1.setWidth(0);
        this.f171770z1.setHeight(0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m190228d(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m190241w() {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m190244z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m190245A0() {
        if (this.f171676G0 == null) {
            return;
        }
        m190278V1();
        this.f171745n1.getRealView().setTranslationY(0.0f);
        if (NullChecker.m81303a(this.f171749p0) && this.f171680H1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f171749p0.getLayoutParams();
            marginLayoutParams.bottomMargin = t100.m186890d(12.0f);
            this.f171749p0.setLayoutParams(marginLayoutParams);
        }
        this.f171738k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: A1 */
    public void m190246A1(int i) {
        this.f171745n1.mo49618p(i);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m190247B0() {
        this.f171754r1 = new koy(this.f171747o1);
    }

    /* JADX INFO: renamed from: B1 */
    public void m190248B1() {
        if (NullChecker.m81303a(this.f171764w1)) {
            this.f171764w1.m162104y();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f171747o1;
    }

    /* JADX INFO: renamed from: C1 */
    public void m190249C1() {
        if (this.f171764w1.mo139112d() > 0) {
            for (int lastVisiblePositionHook = this.f171745n1.getLastVisiblePositionHook() - this.f171745n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewMo49611C = this.f171745n1.mo49611C(lastVisiblePositionHook);
                if (viewMo49611C instanceof ItemMessageRight) {
                    C8524b.m49064p(((ItemMessageRight) viewMo49611C).f31247P);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void mo103177D0() {
        this.f171758t1.mo129346k();
        m190250E0();
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            m190332u0();
            if (CoreModule.m29935P().m94658i().mo158222E()) {
                this.f171750p1.mo120764e4();
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m190250E0() {
    }

    /* JADX INFO: renamed from: E1 */
    public boolean mo103179E1(Menu menu) {
        this.f171752q1 = menu;
        menu.close();
        return true;
    }

    /* JADX INFO: renamed from: F1 */
    public void m190251F1(boolean z) {
        if (z && this.f171750p1.m120741Z5() && NullChecker.m81303a(this.f171770z1) && !this.f171770z1.isShowing()) {
            this.f171770z1.setBackgroundDrawable(new ColorDrawable(0));
            this.f171770z1.showAtLocation(this.f171747o1.getWindow().getDecorView(), 0, 0, 0);
        }
        f171657I1.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: G0 */
    public void m190252G0() {
        u4z u4zVarMo103231f0 = mo103231f0();
        this.f171758t1 = u4zVarMo103231f0;
        u4zVarMo103231f0.mo129344b(this.f171747o1, this.f171745n1, this.f171750p1);
        if (CoreModule.m29935P().m94658i().mo158429p4()) {
            this.f171764w1 = new j000(this.f171707V, this.f171750p1);
        } else {
            this.f171764w1 = new j000(this.f171705U, this.f171750p1);
        }
        this.f171764w1.mo147987t(this.f171758t1.mo129345g());
        this.f171745n1.setMessageAdapterHook(this.f171764w1);
        this.f171745n1.mo49617n(new C20253a());
        if (this.f171750p1.m120759d4()) {
            xdl0.m208344M(this.f171692N0, true);
            xdl0.m208344M(this.f171694O0, true);
            xdl0.m208344M(this.f171698Q0, false);
            xdl0.m208344M(this.f171700R0, false);
        } else if (this.f171750p1.mo120799l4()) {
            boolean zMo120787i7 = this.f171750p1.mo120787i7();
            VFrame vFrame = this.f171692N0;
            if (zMo120787i7) {
                xdl0.m208344M(vFrame, true);
                xdl0.m208344M(this.f171700R0, true);
                xdl0.m208344M(this.f171698Q0, false);
                xdl0.m208344M(this.f171694O0, false);
            } else {
                xdl0.m208344M(vFrame, false);
            }
        }
        ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        onGlobalLayoutListenerArr[0] = new ViewTreeObserverOnGlobalLayoutListenerC20254b(onGlobalLayoutListenerArr);
        this.f171745n1.getRealView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        this.f171708V0.setVisibility(8);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m190253G1() {
        if (this.f171745n1 == null || this.f171764w1 == null) {
            return;
        }
        String strMo120828r3 = this.f171750p1.mo120828r3();
        if (User.ID_TEAM_ACCOUNT.equals(strMo120828r3) || User.ID_LIVE_SERVICE.equals(strMo120828r3)) {
            int firstVisiblePositionHook = this.f171745n1.getFirstVisiblePositionHook();
            ArrayList arrayList = new ArrayList();
            for (int lastVisiblePositionHook = this.f171745n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
                int headerViewsCountHook = lastVisiblePositionHook - this.f171745n1.getHeaderViewsCountHook();
                if (headerViewsCountHook >= 0 && headerViewsCountHook < this.f171764w1.mo139112d() && this.f171764w1.mo139120p(headerViewsCountHook) < 116) {
                    Message messageMo139119m = this.f171764w1.mo139119m(headerViewsCountHook);
                    if (NullChecker.m81303a(messageMo139119m) && messageMo139119m.needRead && !messageMo139119m.read) {
                        arrayList.add(messageMo139119m);
                    }
                }
            }
            if (arrayList.size() > 0) {
                CoreModule.f17545c.f19642f0.m32585Ao(strMo120828r3, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m190254H0() {
        Conversation conversationM120788j3;
        if (CoreModule.m29935P().m94658i().mo33602uh() && this.f171766x1 == null && (conversationM120788j3 = this.f171750p1.m120788j3()) != null) {
            final double d = conversationM120788j3.additional.heartbeatMatch.expireTime;
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f171766x1 = act().duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).map(new w9j() { // from class: l.hpz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.m29935P().m94658i().mo158372f0(d);
                }
            }).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ipz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114363a.m190275U0((String) obj);
                }
            }, new e30() { // from class: l.jpz
                @Override // p149l.e30
                public final void call(Object obj) {
                    tqz.m190244z((Throwable) obj);
                }
            }));
            this.f171726e1.setText(CoreModule.m29935P().m94658i().mo158372f0(d));
            if (CoreModule.m29935P().m94658i().mo33602uh()) {
                this.f171722c1.setBackgroundResource(c3c0.f78482B5);
            }
            m190255I0();
            this.f171728f1.post(new Runnable() { // from class: l.kpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124212a.m190277V0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m190255I0() {
        xdl0.m208344M(this.f171722c1, true);
        xdl0.m208329E0(this.f171722c1, new View.OnClickListener() { // from class: l.eqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92872a.m190280X0(view);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m190256I1() {
        this.f171728f1.postDelayed(new Runnable() { // from class: l.zpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f204331a.m190303g1();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: J0 */
    public void m190257J0() {
        Conversation conversationM120788j3;
        if (this.f171766x1 == null && (conversationM120788j3 = this.f171750p1.m120788j3()) != null) {
            final double d = conversationM120788j3.additional.quickChat.expire;
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f171766x1 = act().duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).map(new w9j() { // from class: l.nqz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.m29935P().m94658i().mo158372f0(d);
                }
            }).distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.oqz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145209a.m190283Y0((String) obj);
                }
            }, new e30() { // from class: l.pqz
                @Override // p149l.e30
                public final void call(Object obj) {
                    tqz.m190228d((Throwable) obj);
                }
            }));
            this.f171726e1.setText(CoreModule.m29935P().m94658i().mo158372f0(d));
            if (CoreModule.m29935P().m94658i().mo33602uh()) {
                this.f171722c1.setBackgroundResource(c3c0.f78482B5);
            }
            m190255I0();
            this.f171728f1.post(new Runnable() { // from class: l.qqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155952a.m190286Z0();
                }
            });
            if (d < mqi0.m155944o() + 10800000) {
                CoreModule.m29935P().m94658i().mo158436r0(this.f171750p1.f96911c);
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m190258J1(d30 d30Var) {
        if (this.f171668D1) {
            this.f171668D1 = false;
            xdl0.m208344M(this.f171741l1, true);
            SVGALoader.with(this.f171747o1).from("https://auto.tancdn.com/v1/raw/d3b79b08-70a6-436f-bfe8-3dbd8395b3d610.so").autoPlay(true).repeatCount(1).animListener(new C20256d(d30Var)).into(this.f171741l1);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m190259K0() {
        final MessageBar messageBarM128210t0 = this.f171750p1.m156455e0().mo48954A0().m156457g0().m128210t0();
        messageBarM128210t0.getBar_center_text().setOnClickListener(new View.OnClickListener() { // from class: l.sqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tqz.m190205F(messageBarM128210t0, view);
            }
        });
    }

    /* JADX INFO: renamed from: K1 */
    public void m190260K1() {
        if (this.f171745n1 == null || this.f171764w1 == null || !ConnectivityReceiver.m81289l() || this.f171750p1.mo120764e4()) {
            return;
        }
        int firstVisiblePositionHook = this.f171745n1.getFirstVisiblePositionHook();
        ArrayList arrayList = new ArrayList();
        for (int lastVisiblePositionHook = this.f171745n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
            int i = lastVisiblePositionHook - 1;
            if (i >= 0 && i < this.f171764w1.mo139112d() && ((this.f171764w1.mo139120p(i) == 118 || this.f171764w1.mo139120p(i) == 2) && NullChecker.m81303a(this.f171764w1.mo139119m(i)) && NullChecker.m81303a(this.f171764w1.mo139119m(i).media) && NullChecker.m81303a(this.f171764w1.mo139119m(i).media.get(0)) && (this.f171764w1.mo139119m(i).media.get(0) instanceof Video))) {
                String aspectRatio = ((Video) this.f171764w1.mo139119m(i).media.get(0)).formatAspectRatio();
                if (!TextUtils.isEmpty(aspectRatio) && aspectRatio.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(aspectRatio);
                }
            }
        }
        if (arrayList.size() > 0) {
            qib0.m174794T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m190261L0() {
        return this.f171668D1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m190262L1(boolean z) {
        if (CoreModule.m29935P().m94651a().mo33531kb() && xdl0.m208349O0(this.f171749p0)) {
            VText vText = this.f171673F0;
            if (z) {
                if (xdl0.m208349O0(vText)) {
                    xdl0.m208345M0(this.f171673F0, false);
                    VLinear vLinear = this.f171749p0;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationX", 0.0f, vLinear.getWidth() - t100.m186890d(44.0f));
                    objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            if (xdl0.m208349O0(vText)) {
                return;
            }
            xdl0.m208345M0(this.f171673F0, true);
            VLinear vLinear2 = this.f171749p0;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vLinear2, "translationX", vLinear2.getWidth() - t100.m186890d(44.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(0.8f));
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.start();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public void m190263M1() {
        u4z u4zVarMo103231f0 = mo103231f0();
        this.f171758t1 = u4zVarMo103231f0;
        u4zVarMo103231f0.mo129344b(this.f171747o1, this.f171745n1, this.f171750p1);
        this.f171764w1.mo147987t(this.f171758t1.mo129345g());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m190264N0() {
        return xdl0.m208349O0(this.f171678H);
    }

    /* JADX INFO: renamed from: O1 */
    public void m190265O1(boolean z) {
        if (CoreModule.m29935P().m94651a().mo33332Hd() && xdl0.m208349O0(this.f171738k0)) {
            this.f171738k0.m49477R(z);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m190266P0(float f, float f2, ValueAnimator valueAnimator) {
        if (f != 0.0f) {
            this.f171747o1.m48980w2().f171745n1.getRealView().setTranslationY(f + ((f2 - f) * valueAnimator.getAnimatedFraction()));
        }
        this.f171695P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f171695P.requestLayout();
    }

    /* JADX INFO: renamed from: P1 */
    public void m190267P1() {
        if (this.f171697Q.getAdapter() != null) {
            this.f171697Q.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m190268Q0() {
        xdl0.m208344M(this.f171675G, true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m190269R0(int i, ValueAnimator valueAnimator) {
        if (i != 0) {
            this.f171747o1.m48980w2().f171745n1.getRealView().setTranslationY(i * valueAnimator.getAnimatedFraction());
        }
        this.f171695P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f171695P.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX INFO: renamed from: R1 */
    public void m190270R1(final boolean z, final Runnable runnable) {
        int i;
        if (this.f171676G0.getChildCount() == 0) {
            return;
        }
        final float translationY = this.f171676G0.getTranslationY();
        if (this.f171754r1.m146784q()) {
            translationY = 0.0f;
        }
        this.f171754r1.m146780m();
        this.f171676G0.getHeight();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f171749p0)) {
            ViewGroup.LayoutParams layoutParams = this.f171749p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (!z) {
            m190245A0();
        }
        arrayList.add((NullChecker.m81303a(this.f171749p0) && this.f171680H1) ? bt0.m103740m(this.f171749p0, MessageBarOpt.f31934I0, 0L, 350L, this.f171674F1, i, t100.m186890d(12.0f)) : bt0.m103737j(350));
        if (z) {
            LinearLayout linearLayout = this.f171676G0;
            arrayList.add(bt0.m103743p(linearLayout, "translationY", 0L, 350L, this.f171674F1, translationY, linearLayout.getHeight() + translationY));
            arrayList.add(bt0.m103743p(this.f171676G0, "alpha", 0L, 350L, this.f171674F1, 1.0f, 0.0f));
            if (!this.f171750p1.m156455e0().mo48971c0().m213050D0() && this.f171754r1.m146784q()) {
                arrayList.add(bt0.m103742o(this.f171745n1.getRealView(), MessageBarOpt.f31934I0, -t100.m186890d(240.0f)));
            }
        }
        Animator animatorM103753z = bt0.m103753z((Animator[]) arrayList.toArray(new Animator[arrayList.size()]));
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.vpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f182554a.m190306h1(translationY, z, runnable);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m190271S0() {
        xdl0.m208344M(this.f171675G, false);
    }

    /* JADX INFO: renamed from: S1 */
    public void m190272S1() {
        this.f171758t1.mo191239a();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m190273T0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        this.f171750p1.m156455e0().mo48971c0().m156457g0().mo134704c().mo105798b(bool, num, bool2, num2);
        if (!bool.booleanValue()) {
            this.f171750p1.m156455e0().mo48954A0().m156457g0().m128190j0();
        }
        mo103196O0(num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: T1 */
    public void m190274T1() {
        xdl0.m208344M(this.f171692N0, false);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m190275U0(String str) {
        this.f171726e1.setText(str);
        if ("00s".equals(str)) {
            m190336w0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m190276U1() {
        this.f171764w1.mo147983j(this.f171758t1.mo129345g());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m190277V0() {
        this.f171768y1 = this.f171728f1.getWidth();
    }

    /* JADX INFO: renamed from: V1 */
    public void m190278V1() {
        m190338x0();
        if (this.f171754r1.m146784q()) {
            ViewGroup.LayoutParams layoutParams = this.f171745n1.getRealView().getLayoutParams();
            int i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0;
            xdl0.m208357U(this.f171745n1.getRealView(), -t100.m186890d(240.0f));
            int height = this.f171703T.getHeight() - (this.f171745n1.getListRenderHeight() - t100.m186890d(480.0f));
            if (height >= 0 && height <= i + t100.m186890d(240.0f)) {
                this.f171745n1.getRealView().setBottom(this.f171745n1.getRealView().getBottom() + height);
            }
        }
        this.f171754r1.m146772B(0);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m190279W0(ValueAnimator valueAnimator) {
        this.f171728f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f171722c1.setTranslationX((int) (this.f171768y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m190280X0(View view) {
        if (xdl0.m208349O0(this.f171728f1)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f98866a.m190279W0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        xdl0.m208345M0(this.f171728f1, true);
        bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.gqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f104001a.m190256I1();
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m190281X1() {
        if (this.f171746o == null || this.f171717a == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f171746o.getChildCount(); i++) {
            if (this.f171746o.getChildAt(i).getId() == this.f171717a.getId()) {
                z = true;
            }
        }
        if (z) {
            this.f171746o.removeView(this.f171717a);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m190282Y(View view) {
        vqz.m199608a(this, view);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m190283Y0(String str) {
        this.f171726e1.setText(str);
        if ("00s".equals(str)) {
            m190336w0();
            act().lambda$debugItems$19();
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.dqz
                @Override // java.lang.Runnable
                public final void run() {
                    tqz.m190215P();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m190284Y1(String str, String str2) {
        xdl0.m208344M(this.f171699R, true);
        this.f171699R.removeAllViews();
        CoreModule.m29936Q().mo67229M6().mo102423h(this.f171750p1.act(), this.f171699R, str, str2);
    }

    /* JADX INFO: renamed from: Z */
    public View m190285Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wqz.m205075b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m190286Z0() {
        this.f171768y1 = this.f171728f1.getWidth();
        if (CoreModule.m29935P().m94658i().mo158335Y0(this.f171750p1.f96911c)) {
            this.f171722c1.setTranslationX(this.f171768y1);
            xdl0.m208345M0(this.f171728f1, false);
        } else {
            m190256I1();
            CoreModule.m29935P().m94658i().mo158451u1(this.f171750p1.f96911c);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m190287Z1() {
        if (this.f171745n1.getLastVisiblePositionHook() == this.f171745n1.getCountHook() - 1) {
            return;
        }
        utl utlVar = this.f171745n1;
        utlVar.mo49622x(utlVar.getCountHook() - 1);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f171747o1;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m190289a1(Message message, boolean z, Sticker sticker) {
        this.f171750p1.m120675L2(message, z, sticker);
        this.f171745n1.mo49613e();
    }

    /* JADX INFO: renamed from: a2 */
    public void m190290a2() {
        if (this.f171745n1.getLastVisiblePositionHook() == this.f171745n1.getCountHook() - 1) {
            return;
        }
        int iAbs = Math.abs(this.f171745n1.getCountHook() - this.f171745n1.getLastVisiblePositionHook());
        utl utlVar = this.f171745n1;
        if (iAbs >= 15) {
            utlVar.mo49613e();
        } else {
            utlVar.mo49622x(Math.max(0, utlVar.getCountHook() - 1));
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m190291b2() {
        this.f171758t1.mo191243i();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f171750p1 = p;
    }

    /* JADX INFO: renamed from: c2 */
    public void m190293c2(String str) {
        this.f171728f1.setText(str);
        this.f171728f1.measure(0, 0);
        this.f171768y1 = this.f171728f1.getMeasuredWidth();
        this.f171728f1.post(new Runnable() { // from class: l.rqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f160705a.m190311j1();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m190294d0() {
        this.f171676G0.setPadding(t100.m186890d(10.0f), 0, 0, 0);
        mo103201Q1(false, new Runnable() { // from class: l.cqz
            @Override // java.lang.Runnable
            public final void run() {
                tqz.m190241w();
            }
        });
        this.f171738k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m190295d1(final Message message, final boolean z, final Sticker sticker) {
        if (this.f171745n1.getLastVisiblePositionHook() == this.f171745n1.getCountHook() - 1) {
            this.f171750p1.m120675L2(message, z, sticker);
        } else {
            act().post(new Runnable() { // from class: l.gpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103864a.m190289a1(message, z, sticker);
                }
            });
        }
        this.f171745n1.mo49613e();
        if (CoreModule.m29935P().m94658i().mo33588si()) {
            CoreModule.m29935P().m94658i().mo158255K0();
            if (CoreModule.f17545c.f19691v1.m205157m3("haveRead", "opening")) {
                CoreModule.m29935P().m94658i().mo158374f2(act());
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m190296d2() {
        this.f171668D1 = true;
    }

    /* JADX INFO: renamed from: e0 */
    public void m190297e0() {
        if (this.f171760u1) {
            int height = this.f171695P.getHeight();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
            final float translationY = this.f171747o1.m48980w2().f171745n1.getRealView().getTranslationY();
            final float f = 0.0f;
            if (translationY < 0.0f) {
                float f2 = height;
                if (f2 < Math.abs(translationY)) {
                    f = translationY + f2;
                }
            }
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.epz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f92729a.m190266P0(translationY, f, valueAnimator);
                }
            });
            bt0.m103733f(valueAnimatorOfInt, new Runnable() { // from class: l.fpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98753a.m190268Q0();
                }
            }).setDuration(300L).start();
            this.f171750p1.m156455e0().mo48959E().m194283y0().m215323u(true);
            this.f171760u1 = false;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m190298e1(ValueAnimator valueAnimator) {
        this.f171728f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f171722c1.setTranslationX((int) (this.f171768y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: e2 */
    public void m190299e2() {
        xdl0.m208344M(this.f171684J0, true);
        zvf0.m220402x("e_intl_ai_translate_bubble", OMSDialogPositon.p_chat_view);
        xdl0.m208329E0(this.f171690M0, new View.OnClickListener() { // from class: l.spz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165894a.m190312k1(view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public abstract u4z mo103231f0();

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m190300f1() {
        xdl0.m208345M0(this.f171728f1, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m190301f2(final int i, final Runnable runnable) {
        this.f171676G0.setAlpha(0.0f);
        e51.m114741F(this.f171747o1, new Runnable() { // from class: l.hqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f109168a.m190317m1(i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m190302g0() {
        if (NullChecker.m81303a(this.f171770z1) && this.f171770z1.isShowing()) {
            this.f171770z1.dismiss();
            this.f171770z1 = null;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m190303g1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114572a.m190298e1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        bt0.m103733f(valueAnimatorOfFloat, new Runnable() { // from class: l.kqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f124315a.m190300f1();
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public void m190304g2() {
        this.f171665C.setVisibility(8);
        m190334v0();
        if (this.f171750p1.m120782h7()) {
            this.f171748p.setVisibility(8);
            this.f171767y.setVisibility(8);
            this.f171665C.setVisibility(0);
            this.f171672F.setText(this.f171750p1.m120712T5());
            this.f171667D.setText(this.f171750p1.m120721V5());
            this.f171669E.setText(this.f171750p1.m120717U5());
            this.f171750p1.m120812n7();
            xdl0.m208329E0(this.f171672F, new View.OnClickListener() { // from class: l.lpz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129263a.m190319n1(view);
                }
            });
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158317V0()) {
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && this.f171750p1.m120789j4() && NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
            xdl0.m208344M(this.f171748p, false);
            xdl0.m208344M(this.f171767y, false);
            m190313k2();
            return;
        }
        if (!CoreModule.m29935P().m94658i().mo158473y1() || !CoreModule.m29935P().m94658i().mo158446t0()) {
            if (CoreModule.m29935P().m94658i().mo158384h0()) {
                if (!xdl0.m208349O0(this.f171767y)) {
                    CoreModule.m29935P().m94658i().mo158235G4();
                }
                this.f171767y.setVisibility(0);
                if (NullChecker.m81303a(this.f171750p1.m120726W5()) && TEnum.equals(this.f171750p1.m120726W5().gender, "female")) {
                    this.f171661A.setText(R$string.f21098u5);
                }
                this.f171663B.setOnClickListener(new View.OnClickListener() { // from class: l.ppz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f150734a.m190325q1(view);
                    }
                });
                return;
            }
            if (fcz.f96882H0 || !r07.f157143c) {
                return;
            }
            tpd0 tpd0Var = f171658J1;
            if (tpd0Var.get().intValue() >= 3 || !Network.language().equals(Network.LANGUAGE_ZH_HANS)) {
                return;
            }
            String str = Build.MANUFACTURER;
            if (str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_VIVO) || str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
                fcz.f96882H0 = true;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
                w3z.m201398D(this.f171747o1, new Runnable() { // from class: l.qpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f155843a.m190327r1();
                    }
                }, new Runnable() { // from class: l.rpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        tqz.f171658J1.put(3);
                    }
                });
                return;
            }
            return;
        }
        if (!xdl0.m208349O0(this.f171748p)) {
            CoreModule.m29935P().m94658i().mo158235G4();
        }
        this.f171748p.setVisibility(0);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f171750p1.mo120828r3());
        if (NullChecker.m81303a(userM169430Pa)) {
            if (this.f171756s1 == null) {
                this.f171756s1 = new TextPaint();
            }
            this.f171756s1.setTextSize(t100.m186890d(15.0f));
            int iM208412y0 = xdl0.m208412y0() - t100.m186890d(155.0f);
            String str2 = userM169430Pa.name;
            float f = iM208412y0;
            if (f > this.f171756s1.measureText(act().getString(R$string.f21000j2, str2)) || str2.length() <= 1) {
                this.f171751q.setText(act().getString(R$string.f21000j2, userM169430Pa.name));
            } else {
                String strSubstring = str2.substring(0, str2.length() - 1);
                float fMeasureText = this.f171756s1.measureText(act().getString(R$string.f21000j2, strSubstring.concat("…")));
                while (fMeasureText > f && strSubstring.length() > 1) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    fMeasureText = this.f171756s1.measureText(act().getString(R$string.f21000j2, strSubstring.concat("…")));
                }
                this.f171751q.setText(act().getString(R$string.f21000j2, strSubstring.concat("…")));
            }
            boolean zIsFemale = userM169430Pa.isFemale();
            VText vText = this.f171753r;
            if (zIsFemale) {
                vText.setText(R$string.f20982h2);
            } else {
                vText.setText(R$string.f20991i2);
            }
        }
        xdl0.m208329E0(this.f171755s, new View.OnClickListener() { // from class: l.mpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135134a.m190321o1(view);
            }
        });
        xdl0.m208329E0(this.f171757t, new View.OnClickListener() { // from class: l.opz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145070a.m190323p1(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m190305h0() {
        int i;
        if (this.f171760u1) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.m186890d(141.0f));
        koy koyVar = this.f171754r1;
        final int i2 = (koyVar == null || (i = koyVar.f124075f) == 0) ? 0 : -i;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.aqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f71224a.m190269R0(i2, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfInt, new Runnable() { // from class: l.bqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f76825a.m190271S0();
            }
        }).setDuration(300L).start();
        this.f171750p1.m156455e0().mo48959E().m194283y0().m215323u(false);
        this.f171760u1 = true;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m190306h1(float f, boolean z, Runnable runnable) {
        if (this.f171676G0.getTranslationY() == this.f171676G0.getHeight() + f) {
            this.f171676G0.setTranslationY(f);
        }
        this.f171754r1.m146772B(0);
        if (z) {
            m190278V1();
            this.f171738k0.setMarginBottom(12);
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m190307h2() {
        if (ItemMessageBase.m48312Y(act())) {
            return;
        }
        this.f171750p1.m156455e0().mo48971c0().m156457g0().mo134710k(3, -1);
    }

    /* JADX INFO: renamed from: i0 */
    public void m190308i0(View view) {
        m190282Y(view);
    }

    /* JADX INFO: renamed from: i2 */
    public void m190309i2() {
        xdl0.m208344M(this.f171678H, true);
        zvf0.m220402x("e_open_button_click", OMSDialogPositon.p_chat_view);
        xdl0.m208329E0(this.f171687L, new View.OnClickListener() { // from class: l.ypz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199511a.m190329s1(view);
            }
        });
        xdl0.m208329E0(this.f171685K, new View.OnClickListener() { // from class: l.jqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119340a.m190333u1(view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = App.f15366b;
        View viewM190285Z = m190285Z(layoutInflater, null);
        if (CoreModule.m29935P().m94658i().mo158429p4()) {
            x4i0 x4i0Var = new x4i0();
            x4i0Var.m49672b0(true);
            xdl0.m208344M(this.f171707V, true);
            this.f171707V.setLayoutManager(x4i0Var);
            this.f171745n1 = this.f171707V;
        } else {
            xdl0.m208344M(this.f171705U, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setStackFromEnd(true);
            this.f171705U.setLayoutManager(linearLayoutManager);
            this.f171745n1 = this.f171705U;
        }
        View viewInflateView = this.f171747o1.m48958D2() ? this.f171750p1.m156455e0().mo48975m0().m156457g0().inflateView(layoutInflater, viewGroup) : null;
        if (CoreModule.m29935P().m94658i().mo158270M4()) {
            this.f171736j1.addView(this.f171750p1.m156455e0().mo48973j0().m156457g0().inflateView(layoutInflater, viewGroup));
            xdl0.m208344M(this.f171736j1, true);
        }
        guy guyVarM156457g0 = this.f171750p1.m156455e0().mo48954A0().m156457g0();
        guyVarM156457g0.inflateView(layoutInflater, viewGroup);
        LinearLayout linearLayout = this.f171746o;
        if (!this.f171747o1.m48958D2()) {
            viewInflateView = guyVarM156457g0.m128210t0();
        }
        linearLayout.addView(viewInflateView);
        View upKeyboardDetectorLayout = this.f171747o1.setUpKeyboardDetectorLayout(viewM190285Z, this.f171750p1.m156455e0().mo48976t0().m156457g0().inflateView(layoutInflater, viewGroup), new h30() { // from class: l.npz
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f140021a.m190273T0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (this.f171750p1.m120741Z5()) {
            m190226b0();
        }
        m190259K0();
        this.f171700R0.m48931c0(this.f171750p1);
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j0 */
    public j000 m190310j0() {
        return this.f171764w1;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m190311j1() {
        this.f171768y1 = this.f171722c1.getWidth() - this.f171726e1.getRight();
        if (CoreModule.m29935P().m94658i().mo158335Y0(this.f171750p1.f96911c)) {
            this.f171722c1.setTranslationX(this.f171768y1);
            xdl0.m208345M0(this.f171728f1, false);
        } else {
            m190256I1();
            CoreModule.m29935P().m94658i().mo158451u1(this.f171750p1.f96911c);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public j760<Integer, Integer> mo103242k0() {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m190312k1(View view) {
        m190330t0();
    }

    /* JADX INFO: renamed from: k2 */
    public final void m190313k2() {
        if (CoreModule.m29935P().m94658i().mo158307T1(this.f171750p1.mo120828r3())) {
            return;
        }
        if (!xdl0.m208349O0(this.f171759u)) {
            CoreModule.m29935P().m94658i().mo158235G4();
        }
        this.f171759u.setVisibility(0);
        this.f171761v.setText("打开推送，接收重要信息");
        zvf0.m220402x("e_im_push_banner", this.f171750p1.pageId());
        xdl0.m208329E0(this.f171763w, new View.OnClickListener() { // from class: l.wpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187596a.m190335v1(view);
            }
        });
        xdl0.m208329E0(this.f171765x, new View.OnClickListener() { // from class: l.xpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193971a.m190337w1(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public String m190314l0() {
        return this.f171750p1.m156455e0().mo48954A0().m156457g0().m128210t0().getBar_center_text().getText() == null ? "" : this.f171750p1.m156455e0().mo48954A0().m156457g0().m128210t0().getBar_center_text().getText().toString();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m190315l1(int i) {
        if ((this.f171747o1.f31640f instanceof wmz) && koy.m146770r(i)) {
            ((wmz) this.f171747o1.f31640f).m204334Dg();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VNavigationBar m190316m0() {
        return this.f171730g1;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m190317m1(final int i, final Runnable runnable) {
        int height = this.f171676G0.getHeight();
        float translationY = this.f171676G0.getTranslationY();
        if (koy.m146770r(i)) {
            translationY = 0.0f;
        }
        xdl0.m208357U(this.f171738k0, t100.m186890d(26.0f) + height);
        int iM186890d = t100.m186890d(12.0f);
        if (NullChecker.m81303a(this.f171749p0)) {
            ViewGroup.LayoutParams layoutParams = this.f171749p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                iM186890d = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
        }
        Animator animatorM103753z = bt0.m103753z(this.f171754r1.m146784q() ? bt0.m103742o(this.f171745n1.getRealView(), MessageBarOpt.f31934I0, height - t100.m186890d(240.0f)) : bt0.m103737j(350), bt0.m103743p(this.f171676G0, "translationY", 0L, 350L, this.f171674F1, height + translationY, translationY), bt0.m103743p(this.f171676G0, "alpha", 0L, 350L, this.f171674F1, 0.0f, 1.0f), (NullChecker.m81303a(this.f171749p0) && this.f171680H1) ? bt0.m103740m(this.f171749p0, MessageBarOpt.f31934I0, 0L, 350L, this.f171674F1, iM186890d, t100.m186890d(12.0f) + height) : bt0.m103737j(350));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.lqz
            @Override // java.lang.Runnable
            public final void run() {
                tqz.m190216Q(runnable);
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.mqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f135317a.m190315l1(i);
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m190318n0() {
        return this.f171760u1;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m190319n1(View view) {
        this.f171750p1.m120807m7();
    }

    /* JADX INFO: renamed from: o0 */
    public LinearLayout m190320o0() {
        return this.f171709W;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m190321o1(View view) {
        this.f171748p.setVisibility(8);
        zvf0.m220396r("e_chat_prompt_notification_auth_banner_open_button", this.f171750p1.pageId());
        CoreModule.m29935P().m94658i().mo158305T();
        CoreModule.m29935P().m94658i().mo158263L3();
    }

    /* JADX INFO: renamed from: p0 */
    public LinearLayout m190322p0() {
        return this.f171676G0;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m190323p1(View view) {
        this.f171748p.setVisibility(8);
        zvf0.m220396r("e_chat_prompt_notification_auth_banner_close_button", this.f171750p1.pageId());
        CoreModule.m29935P().m94658i().mo158263L3();
    }

    /* JADX INFO: renamed from: q0 */
    public View m190324q0() {
        VLinear rightIconContainer = this.f171730g1.getRightIconContainer();
        if (rightIconContainer.getChildCount() > 0) {
            View viewFindViewWithTag = rightIconContainer.findViewWithTag("settingMenuTag");
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                return viewFindViewWithTag;
            }
        }
        return this.f171730g1.getRightIconContainer();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m190325q1(View view) {
        this.f171663B.setOnClickListener(null);
        this.f171767y.setVisibility(8);
        CoreModule.m29935P().m94658i().mo158294R1();
        CoreModule.m29935P().m94658i().mo158305T();
        CoreModule.m29935P().m94658i().mo158238H1();
    }

    /* JADX INFO: renamed from: r */
    public void mo103257r() {
        xdl0.m208325C0(this.f171702S0, xdl0.m208408w0());
        this.f171702S0.setScaleX(1.1f);
        this.f171702S0.setScaleY(1.1f);
        xdl0.m208327D0(xdl0.m208412y0(), this.f171702S0);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f171751q.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67153g));
            this.f171753r.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67155i));
            this.f171755s.setBackgroundResource(c3c0.f78737f);
            this.f171757t.setImageResource(c3c0.f78615Q3);
            this.f171769z.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67153g));
            this.f171661A.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67155i));
            this.f171663B.setBackgroundResource(c3c0.f78737f);
            this.f171681I.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67153g));
            this.f171683J.setTextColor(this.f171747o1.getResources().getColor(a1c0.f67155i));
            this.f171685K.setBackgroundResource(c3c0.f78737f);
            this.f171687L.setImageResource(c3c0.f78615Q3);
        }
        m190252G0();
        m190247B0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m190326r0() {
        xdl0.m208344M(this.f171678H, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m190327r1() {
        f171658J1.put(3);
        this.f171747o1.startActivity(new Intent(this.f171747o1, (Class<?>) NotificationSettingsAct.class));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m190328s0() {
        ArrayList arrayListM200339n;
        if (this.f171750p1.mo120802l7()) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f171750p1.f96910b);
            if (NullChecker.m81303a(userM169430Pa) && (arrayListM200339n = vwb.m200339n(userM169430Pa.pictures, new w9j() { // from class: l.dpz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            })) != null && arrayListM200339n.size() > 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m190329s1(View view) {
        xdl0.m208344M(this.f171678H, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m190330t0() {
        xdl0.m208344M(this.f171684J0, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m190331t1(SettingGroups settingGroups) {
        lsi0.m151595y("已开启消息通知");
        xdl0.m208344M(this.f171678H, false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m190332u0() {
        xdl0.m208344M(this.f171682I0, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m190333u1(View view) {
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed && !CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("openWithFriend", true, 0, 0)).subscribe(mkd0.m154956H(new e30() { // from class: l.tpz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171534a.m190331t1((SettingGroups) obj);
                }
            }, new e30() { // from class: l.upz
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        } else {
            act().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("openWithFriend", true, 0, 0)).subscribe(mkd0.m154960L(mkd0.m154950B()));
            CoreModule.m29935P().m94658i().mo158305T();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m190334v0() {
        xdl0.m208344M(this.f171759u, false);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m190335v1(View view) {
        this.f171759u.setVisibility(8);
        zvf0.m220399u("e_im_push_banner", this.f171750p1.pageId(), vwb.m200311Y("notification_action", "open"));
        CoreModule.m29935P().m94658i().mo158305T();
    }

    /* JADX INFO: renamed from: w0 */
    public void m190336w0() {
        yij0.m214943U(this.f171766x1);
        this.f171766x1 = null;
        xdl0.m208344M(this.f171722c1, false);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m190337w1(View view) {
        this.f171759u.setVisibility(8);
        zvf0.m220399u("e_im_push_banner", this.f171750p1.pageId(), vwb.m200311Y("notification_action", "close"));
        CoreModule.m29935P().m94658i().mo158331X1(this.f171750p1.mo120828r3());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m190338x0() {
        this.f171676G0.removeAllViews();
        this.f171676G0.setPadding(t100.f167260i, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f171676G0.getLayoutParams();
        layoutParams.rightMargin = 0;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 83;
        this.f171676G0.setLayoutParams(layoutParams);
        this.f171676G0.setBackgroundResource(a1c0.f67143Y);
    }

    /* JADX INFO: renamed from: y0 */
    public void m190339y0(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, this.f171708V0.getHeight());
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC20255c());
        translateAnimation.setDuration(800L);
        RelativeLayout relativeLayout = this.f171708V0;
        if (z) {
            relativeLayout.startAnimation(translateAnimation);
        } else {
            relativeLayout.setVisibility(8);
        }
        this.f171662A1 = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void m190340y1(Runnable runnable) {
        if (this.f171705U.m49736G()) {
            runnable.run();
            return;
        }
        this.f171705U.addOnScrollListener(new C20257e(runnable));
        if (Math.abs(this.f171705U.getCount() - this.f171705U.getLastVisiblePosition()) >= 15) {
            this.f171705U.m49738I();
        } else {
            m190287Z1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m190341z0() {
        yij0.m214943U(this.f171766x1);
        this.f171766x1 = null;
    }

    /* JADX INFO: renamed from: z1 */
    public void m190342z1(final Message message, final boolean z, final Sticker sticker) {
        if (CoreModule.m29935P().m94658i().mo158420o1(this.f171750p1.f96911c) && !xma.m210043F3()) {
            lsi0.m151580j("黑金会员已过期，重新开通立即解锁专属客服");
            return;
        }
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            if (!NullChecker.m81303a(this.f171750p1.mo120858x6()) || this.f171750p1.mo120858x6().inactivated) {
                lsi0.m151580j("对方已注销");
                return;
            } else if (this.f171750p1.mo120858x6().status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                lsi0.m151580j("对方账号异常");
                return;
            }
        }
        if (User.isBusinessAI1V1(this.f171750p1.mo120828r3()) && !xma.m210099z3()) {
            lsi0.m151595y("今天太累了，明天再聊吧");
            return;
        }
        if (this.f171750p1.m120774g4()) {
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            message.channel = MessageChannel.get(this.f171750p1.mo120764e4() ? "group" : "default");
        }
        if (CoreModule.m29932K().me_().isChatJailed() && NullChecker.m81303a(this.f171750p1.mo120858x6()) && !this.f171750p1.mo120858x6().isTeamAccount()) {
            CoreModule.m29935P().m94658i().mo158341Z2(act(), false);
            return;
        }
        String stringExtra = act().getIntent().getStringExtra("heartbeat_consume_type");
        if (TextUtils.equals(stringExtra, "quickchat")) {
            message.consumeType = "privilege";
        } else if (TextUtils.equals(stringExtra, "coin")) {
            message.consumeType = "coin";
            message.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("quickchatNumber"));
        }
        Runnable runnable = new Runnable() { // from class: l.cpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f82009a.m190295d1(message, z, sticker);
            }
        };
        if (this.f171745n1.mo49616m()) {
            runnable.run();
            return;
        }
        int iAbs = Math.abs(this.f171745n1.getCountHook() - this.f171745n1.getLastVisiblePositionHook());
        utl utlVar = this.f171745n1;
        if (iAbs >= 15) {
            utlVar.mo49613e();
        } else {
            utlVar.mo49622x(Math.max(0, utlVar.getCountHook() - 1));
        }
        this.f171745n1.getRealView().postDelayed(runnable, 200L);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.tqz$c */
    public class AnimationAnimationListenerC20255c implements Animation.AnimationListener {
        public AnimationAnimationListenerC20255c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            tqz.this.f171708V0.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void mo103183H1(Message message) {
    }

    /* JADX INFO: renamed from: O0 */
    public void mo103196O0(int i, boolean z) {
    }

    /* JADX INFO: renamed from: Q1 */
    public void mo103201Q1(boolean z, Runnable runnable) {
    }
}
