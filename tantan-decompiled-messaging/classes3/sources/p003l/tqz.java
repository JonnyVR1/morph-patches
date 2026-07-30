package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageBase;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageRight;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageCommunityHintFooterView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageSeeletterFooterView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.ConvNextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageChannel;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer;
import com.p1.mobile.putong.core.ui.messages.recycler.MessageRecyclerDispatchLinear;
import com.p1.mobile.putong.core.ui.messages.recycler.opt.ProxyTantanListView;
import com.p1.mobile.putong.core.ui.messages.recycler.wrap.MessageRecyclerView;
import com.p1.mobile.putong.core.ui.messages.view.BlurCoverLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageLayout;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.ui.NotificationSettingsAct;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l.a1c0;
import l.bt0;
import l.c3c0;
import l.e51;
import l.j760;
import l.jf50;
import l.jig;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.r07;
import l.s7m;
import l.t100;
import l.tpd0;
import l.ura;
import l.utl;
import l.vqz;
import l.vwb;
import l.wmz;
import l.wqz;
import l.x4i0;
import l.xdl0;
import l.xma;
import l.yij0;
import l.zvf0;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.servlet.ServletHandler;
import p003l.fcz;
import p014rx.C1099c;
import p014rx.subjects.C1185a;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VList_Horizontal;
import p028v.VRecyclerView;
import p028v.VText;
import p028v.VText_AutoFit;
import p028v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class tqz<P extends fcz<?, ?>> implements s7m<P> {

    /* JADX INFO: renamed from: I1 */
    public static C1185a<Boolean> f7589I1 = C1185a.m9969b();

    /* JADX INFO: renamed from: J1 */
    public static final tpd0 f7590J1 = new tpd0("whitelist_dialog2", 0);

    /* JADX INFO: renamed from: K1 */
    public static int f7591K1 = t100.d(240.0f);

    /* JADX INFO: renamed from: L1 */
    public static String f7592L1 = null;

    /* JADX INFO: renamed from: A */
    public VText f7593A;

    /* JADX INFO: renamed from: B */
    public VButton f7595B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f7597C;

    /* JADX INFO: renamed from: D */
    public VText f7599D;

    /* JADX INFO: renamed from: E */
    public VText f7601E;

    /* JADX INFO: renamed from: E0 */
    public VDraweeView f7602E0;

    /* JADX INFO: renamed from: F */
    public VButton f7604F;

    /* JADX INFO: renamed from: F0 */
    public VText f7605F0;

    /* JADX INFO: renamed from: G */
    public View f7607G;

    /* JADX INFO: renamed from: G0 */
    public LinearLayout f7608G0;

    /* JADX INFO: renamed from: H */
    public LinearLayout f7610H;

    /* JADX INFO: renamed from: H0 */
    public VFrame f7611H0;

    /* JADX INFO: renamed from: I */
    public VText f7613I;

    /* JADX INFO: renamed from: I0 */
    public View f7614I0;

    /* JADX INFO: renamed from: J */
    public VText_AutoFit f7615J;

    /* JADX INFO: renamed from: J0 */
    public VLinear f7616J0;

    /* JADX INFO: renamed from: K */
    public VButton f7617K;

    /* JADX INFO: renamed from: K0 */
    public VImage f7618K0;

    /* JADX INFO: renamed from: L */
    public VImage f7619L;

    /* JADX INFO: renamed from: L0 */
    public VText f7620L0;

    /* JADX INFO: renamed from: M */
    public LinearLayout f7621M;

    /* JADX INFO: renamed from: M0 */
    public VImage f7622M0;

    /* JADX INFO: renamed from: N */
    public VText f7623N;

    /* JADX INFO: renamed from: N0 */
    public VFrame f7624N0;

    /* JADX INFO: renamed from: O */
    public VFrame f7625O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f7626O0;

    /* JADX INFO: renamed from: P */
    public VFrame f7627P;

    /* JADX INFO: renamed from: P0 */
    public VText f7628P0;

    /* JADX INFO: renamed from: Q */
    public RecyclerView f7629Q;

    /* JADX INFO: renamed from: Q0 */
    public MessageCommunityHintFooterView f7630Q0;

    /* JADX INFO: renamed from: R */
    public VFrame f7631R;

    /* JADX INFO: renamed from: R0 */
    public MessageSeeletterFooterView f7632R0;

    /* JADX INFO: renamed from: S */
    public MessageRecyclerDispatchLinear f7633S;

    /* JADX INFO: renamed from: S0 */
    public SVGAnimationView f7634S0;

    /* JADX INFO: renamed from: T */
    public MessageLayout f7635T;

    /* JADX INFO: renamed from: T0 */
    public ConstraintLayout f7636T0;

    /* JADX INFO: renamed from: U */
    public MessageRecyclerView f7637U;

    /* JADX INFO: renamed from: U0 */
    public VText f7638U0;

    /* JADX INFO: renamed from: V */
    public ProxyTantanListView f7639V;

    /* JADX INFO: renamed from: V0 */
    public RelativeLayout f7640V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f7641W;

    /* JADX INFO: renamed from: W0 */
    public VList_Horizontal f7642W0;

    /* JADX INFO: renamed from: X */
    public TextView f7643X;

    /* JADX INFO: renamed from: X0 */
    public SceneView f7644X0;

    /* JADX INFO: renamed from: Y */
    public TextView f7645Y;

    /* JADX INFO: renamed from: Y0 */
    public ViewStub f7646Y0;

    /* JADX INFO: renamed from: Z */
    public TextView f7647Z;

    /* JADX INFO: renamed from: Z0 */
    public FrameLayout f7648Z0;

    /* JADX INFO: renamed from: a */
    public LinearLayout f7649a;

    /* JADX INFO: renamed from: a1 */
    public VText f7650a1;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f7651b;

    /* JADX INFO: renamed from: b1 */
    public VDraweeView f7652b1;

    /* JADX INFO: renamed from: c */
    public TextView f7653c;

    /* JADX INFO: renamed from: c1 */
    public VLinear f7654c1;

    /* JADX INFO: renamed from: d */
    public FrameLayout f7655d;

    /* JADX INFO: renamed from: d1 */
    public VImage f7656d1;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7657e;

    /* JADX INFO: renamed from: e1 */
    public VText f7658e1;

    /* JADX INFO: renamed from: f */
    public TextView f7659f;

    /* JADX INFO: renamed from: f1 */
    public VText f7660f1;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f7661g;

    /* JADX INFO: renamed from: g1 */
    public VNavigationBar f7662g1;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f7663h;

    /* JADX INFO: renamed from: h1 */
    public FrameLayout f7664h1;

    /* JADX INFO: renamed from: i */
    public FrameLayout f7665i;

    /* JADX INFO: renamed from: i1 */
    public VRecyclerView f7666i1;

    /* JADX INFO: renamed from: j */
    public VDraweeView f7667j;

    /* JADX INFO: renamed from: j1 */
    public FrameLayout f7668j1;

    /* JADX INFO: renamed from: k */
    public View f7669k;

    /* JADX INFO: renamed from: k0 */
    public ConvNextView f7670k0;

    /* JADX INFO: renamed from: k1 */
    public CoreGiftLayer f7671k1;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f7672l;

    /* JADX INFO: renamed from: l1 */
    public SVGAnimationView f7673l1;

    /* JADX INFO: renamed from: m */
    public BlurCoverLayout f7674m;

    /* JADX INFO: renamed from: m1 */
    public SVGAnimationView f7675m1;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f7676n;

    /* JADX INFO: renamed from: n1 */
    public utl f7677n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f7678o;

    /* JADX INFO: renamed from: o1 */
    public MessagesAct f7679o1;

    /* JADX INFO: renamed from: p */
    public VLinear f7680p;

    /* JADX INFO: renamed from: p0 */
    public VLinear f7681p0;

    /* JADX INFO: renamed from: p1 */
    public P f7682p1;

    /* JADX INFO: renamed from: q */
    public VText f7683q;

    /* JADX INFO: renamed from: q1 */
    public Menu f7684q1;

    /* JADX INFO: renamed from: r */
    public VText f7685r;

    /* JADX INFO: renamed from: r1 */
    public koy f7686r1;

    /* JADX INFO: renamed from: s */
    public VButton f7687s;

    /* JADX INFO: renamed from: t */
    public VImage f7689t;

    /* JADX INFO: renamed from: t1 */
    public u4z f7690t1;

    /* JADX INFO: renamed from: u */
    public LinearLayout f7691u;

    /* JADX INFO: renamed from: v */
    public VText f7693v;

    /* JADX INFO: renamed from: w */
    public VButton f7695w;

    /* JADX INFO: renamed from: w1 */
    public j000 f7696w1;

    /* JADX INFO: renamed from: x */
    public VImage f7697x;

    /* JADX INFO: renamed from: x1 */
    public c4g0 f7698x1;

    /* JADX INFO: renamed from: y */
    public LinearLayout f7699y;

    /* JADX INFO: renamed from: y1 */
    public int f7700y1;

    /* JADX INFO: renamed from: z */
    public VText f7701z;

    /* JADX INFO: renamed from: z1 */
    public PopupWindow f7702z1;

    /* JADX INFO: renamed from: s1 */
    public TextPaint f7688s1 = null;

    /* JADX INFO: renamed from: u1 */
    public boolean f7692u1 = true;

    /* JADX INFO: renamed from: v1 */
    public Runnable f7694v1 = null;

    /* JADX INFO: renamed from: A1 */
    public boolean f7594A1 = false;

    /* JADX INFO: renamed from: B1 */
    public int f7596B1 = t100.d(104.0f);

    /* JADX INFO: renamed from: C1 */
    public int f7598C1 = t100.d(80.0f);

    /* JADX INFO: renamed from: D1 */
    public boolean f7600D1 = false;

    /* JADX INFO: renamed from: E1 */
    public HashMap<String, String> f7603E1 = new HashMap<>();

    /* JADX INFO: renamed from: F1 */
    public final Interpolator f7606F1 = new jig();

    /* JADX INFO: renamed from: G1 */
    public final int f7609G1 = 350;

    /* JADX INFO: renamed from: H1 */
    public boolean f7612H1 = true;

    /* JADX INFO: renamed from: l.tqz$a */
    public class C0557a extends jf50 {
        public C0557a() {
        }

        /* JADX INFO: renamed from: a */
        public void m7969a(int i) {
            super.a(i);
            if (i == 0) {
                tqz.this.m7885K1();
                tqz.this.m7878G1();
                tqz.this.f7690t1.mo7352e();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m7970b(int i, int i2) {
            super.b(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.tqz$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0558b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener[] f7704a;

        public ViewTreeObserverOnGlobalLayoutListenerC0558b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr) {
            this.f7704a = onGlobalLayoutListenerArr;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m7972b() {
            tqz.this.m7878G1();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!NullChecker.a(tqz.this.f7677n1) || tqz.this.f7677n1.getRealView().getMeasuredHeight() <= 0) {
                return;
            }
            tqz.this.m7885K1();
            e51.G(new Runnable() { // from class: l.uqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8066a.m7972b();
                }
            });
            tqz.this.f7677n1.getRealView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f7704a[0]);
        }
    }

    /* JADX INFO: renamed from: l.tqz$d */
    public class C0560d extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f7707a;

        public C0560d(d30 d30Var) {
            this.f7707a = d30Var;
        }

        public void onFinished() {
            xdl0.M(tqz.this.f7673l1, false);
        }

        public void onStart() {
            this.f7707a.call();
        }
    }

    /* JADX INFO: renamed from: l.tqz$e */
    public class C0561e extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f7709a;

        public C0561e(Runnable runnable) {
            this.f7709a = runnable;
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (tqz.this.f7637U.H()) {
                this.f7709a.run();
                tqz.this.f7637U.removeOnScrollListener(this);
            }
        }
    }

    public tqz(MessagesAct messagesAct) {
        this.f7679o1 = messagesAct;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7829F(MessageBar messageBar, View view) {
        messageBar.getBar_center_text().setFocusable(true);
        messageBar.getBar_center_text().setFocusableInTouchMode(true);
        messageBar.getBar_center_text().requestFocus();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m7839P() {
        if (NullChecker.a(Act.foreground_()) && NullChecker.a(Act.foreground_().a.get())) {
            CoreModule.P().i().y3((Act) Act.foreground_().a.get(), "time_limited_match");
        }
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m7840Q(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    private void m7850b0() {
        PopupWindow popupWindow = new PopupWindow();
        this.f7702z1 = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(l6c0.O5, (ViewGroup) null, false));
        this.f7702z1.setInputMethodMode(1);
        this.f7702z1.setWidth(0);
        this.f7702z1.setHeight(0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7852d(Throwable th) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m7865w() {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m7868z(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m7869A0() {
        if (this.f7608G0 == null) {
            return;
        }
        m7903V1();
        this.f7677n1.getRealView().setTranslationY(0.0f);
        if (NullChecker.a(this.f7681p0) && this.f7612H1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7681p0.getLayoutParams();
            marginLayoutParams.bottomMargin = t100.d(12.0f);
            this.f7681p0.setLayoutParams(marginLayoutParams);
        }
        this.f7670k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: A1 */
    public void m7870A1(int i) {
        this.f7677n1.p(i);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m7871B0() {
        this.f7686r1 = new koy(this.f7679o1);
    }

    /* JADX INFO: renamed from: B1 */
    public void m7872B1() {
        if (NullChecker.a(this.f7696w1)) {
            this.f7696w1.y();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7873C0() {
        return this.f7679o1;
    }

    /* JADX INFO: renamed from: C1 */
    public void m7874C1() {
        if (this.f7696w1.m5287d() > 0) {
            for (int lastVisiblePositionHook = this.f7677n1.getLastVisiblePositionHook() - this.f7677n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewC = this.f7677n1.C(lastVisiblePositionHook);
                if (viewC instanceof ItemMessageRight) {
                    C0107b.m2162p(((ItemMessageRight) viewC).f1138P);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void mo3057D0() {
        this.f7690t1.mo4920k();
        m7875E0();
        if (CoreModule.P().i().G1()) {
            m7958u0();
            if (CoreModule.P().i().E()) {
                this.f7682p1.m4231e4();
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m7875E0() {
    }

    /* JADX INFO: renamed from: E1 */
    public boolean mo3059E1(Menu menu) {
        this.f7684q1 = menu;
        menu.close();
        return true;
    }

    /* JADX INFO: renamed from: F1 */
    public void m7876F1(boolean z) {
        if (z && this.f7682p1.m4207Z5() && NullChecker.a(this.f7702z1) && !this.f7702z1.isShowing()) {
            this.f7702z1.setBackgroundDrawable(new ColorDrawable(0));
            this.f7702z1.showAtLocation(this.f7679o1.getWindow().getDecorView(), 0, 0, 0);
        }
        f7589I1.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: G0 */
    public void m7877G0() {
        u4z u4zVarMo3111f0 = mo3111f0();
        this.f7690t1 = u4zVarMo3111f0;
        u4zVarMo3111f0.mo4918b(this.f7679o1, this.f7677n1, this.f7682p1);
        if (CoreModule.P().i().p4()) {
            this.f7696w1 = new j000(this.f7639V, this.f7682p1);
        } else {
            this.f7696w1 = new j000(this.f7637U, this.f7682p1);
        }
        this.f7696w1.t(this.f7690t1.mo4919g());
        this.f7677n1.setMessageAdapterHook(this.f7696w1);
        this.f7677n1.n(new C0557a());
        if (this.f7682p1.m4226d4()) {
            xdl0.M(this.f7624N0, true);
            xdl0.M(this.f7626O0, true);
            xdl0.M(this.f7630Q0, false);
            xdl0.M(this.f7632R0, false);
        } else if (this.f7682p1.m4266l4()) {
            boolean zM4254i7 = this.f7682p1.m4254i7();
            VFrame vFrame = this.f7624N0;
            if (zM4254i7) {
                xdl0.M(vFrame, true);
                xdl0.M(this.f7632R0, true);
                xdl0.M(this.f7630Q0, false);
                xdl0.M(this.f7626O0, false);
            } else {
                xdl0.M(vFrame, false);
            }
        }
        ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        onGlobalLayoutListenerArr[0] = new ViewTreeObserverOnGlobalLayoutListenerC0558b(onGlobalLayoutListenerArr);
        this.f7677n1.getRealView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        this.f7640V0.setVisibility(8);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m7878G1() {
        if (this.f7677n1 == null || this.f7696w1 == null) {
            return;
        }
        String strM4295r3 = this.f7682p1.m4295r3();
        if ("-1".equals(strM4295r3) || "-11001".equals(strM4295r3)) {
            int firstVisiblePositionHook = this.f7677n1.getFirstVisiblePositionHook();
            ArrayList arrayList = new ArrayList();
            for (int lastVisiblePositionHook = this.f7677n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
                int headerViewsCountHook = lastVisiblePositionHook - this.f7677n1.getHeaderViewsCountHook();
                if (headerViewsCountHook >= 0 && headerViewsCountHook < this.f7696w1.m5287d() && this.f7696w1.m5295p(headerViewsCountHook) < 116) {
                    Message messageM5294m = this.f7696w1.m5294m(headerViewsCountHook);
                    if (NullChecker.a(messageM5294m) && messageM5294m.needRead && !messageM5294m.read) {
                        arrayList.add(messageM5294m);
                    }
                }
            }
            if (arrayList.size() > 0) {
                CoreModule.c.f0.Ao(strM4295r3, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m7879H0() {
        Conversation conversationM4255j3;
        if (CoreModule.P().i().uh() && this.f7698x1 == null && (conversationM4255j3 = this.f7682p1.m4255j3()) != null) {
            final double d = conversationM4255j3.additional.heartbeatMatch.expireTime;
            if (d <= 0.0d) {
                return;
            }
            this.f7698x1 = act().duringCreated(C1099c.interval(1L, TimeUnit.SECONDS)).map(new w9j() { // from class: l.hpz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.P().i().f0(d);
                }
            }).distinctUntilChanged().observeOn(jo0.m5414a()).subscribe((m250) mkd0.H(new e30() { // from class: l.ipz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4456a.m7900U0((String) obj);
                }
            }, new e30() { // from class: l.jpz
                @Override // p003l.e30
                public final void call(Object obj) {
                    tqz.m7868z((Throwable) obj);
                }
            }));
            this.f7658e1.setText(CoreModule.P().i().f0(d));
            if (CoreModule.P().i().uh()) {
                this.f7654c1.setBackgroundResource(c3c0.B5);
            }
            m7880I0();
            this.f7660f1.post(new Runnable() { // from class: l.kpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5005a.m7902V0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m7880I0() {
        xdl0.M(this.f7654c1, true);
        xdl0.E0(this.f7654c1, new View.OnClickListener() { // from class: l.eqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3368a.m7905X0(view);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m7881I1() {
        this.f7660f1.postDelayed(new Runnable() { // from class: l.zpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9398a.m7928g1();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: J0 */
    public void m7882J0() {
        Conversation conversationM4255j3;
        if (this.f7698x1 == null && (conversationM4255j3 = this.f7682p1.m4255j3()) != null) {
            final double d = conversationM4255j3.additional.quickChat.expire;
            if (d <= 0.0d) {
                return;
            }
            this.f7698x1 = act().duringCreated(C1099c.interval(1L, TimeUnit.SECONDS)).map(new w9j() { // from class: l.nqz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.P().i().f0(d);
                }
            }).distinctUntilChanged().observeOn(jo0.m5414a()).subscribe((m250) mkd0.H(new e30() { // from class: l.oqz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6218a.m7908Y0((String) obj);
                }
            }, new e30() { // from class: l.pqz
                @Override // p003l.e30
                public final void call(Object obj) {
                    tqz.m7852d((Throwable) obj);
                }
            }));
            this.f7658e1.setText(CoreModule.P().i().f0(d));
            if (CoreModule.P().i().uh()) {
                this.f7654c1.setBackgroundResource(c3c0.B5);
            }
            m7880I0();
            this.f7660f1.post(new Runnable() { // from class: l.qqz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6674a.m7911Z0();
                }
            });
            if (d < mqi0.o() + 10800000) {
                CoreModule.P().i().r0(this.f7682p1.f3543c);
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m7883J1(d30 d30Var) {
        if (this.f7600D1) {
            this.f7600D1 = false;
            xdl0.M(this.f7673l1, true);
            SVGALoader.with(this.f7679o1).from("https://auto.tancdn.com/v1/raw/d3b79b08-70a6-436f-bfe8-3dbd8395b3d610.so").autoPlay(true).repeatCount(1).animListener(new C0560d(d30Var)).into(this.f7673l1);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m7884K0() {
        final MessageBar messageBarM4844t0 = this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0();
        messageBarM4844t0.getBar_center_text().setOnClickListener(new View.OnClickListener() { // from class: l.sqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tqz.m7829F(messageBarM4844t0, view);
            }
        });
    }

    /* JADX INFO: renamed from: K1 */
    public void m7885K1() {
        if (this.f7677n1 == null || this.f7696w1 == null || !ConnectivityReceiver.l() || this.f7682p1.m4231e4()) {
            return;
        }
        int firstVisiblePositionHook = this.f7677n1.getFirstVisiblePositionHook();
        ArrayList arrayList = new ArrayList();
        for (int lastVisiblePositionHook = this.f7677n1.getLastVisiblePositionHook(); lastVisiblePositionHook >= firstVisiblePositionHook; lastVisiblePositionHook--) {
            int i = lastVisiblePositionHook - 1;
            if (i >= 0 && i < this.f7696w1.m5287d() && ((this.f7696w1.m5295p(i) == 118 || this.f7696w1.m5295p(i) == 2) && NullChecker.a(this.f7696w1.m5294m(i)) && NullChecker.a(this.f7696w1.m5294m(i).media) && NullChecker.a(this.f7696w1.m5294m(i).media.get(0)) && (this.f7696w1.m5294m(i).media.get(0) instanceof Video))) {
                String aspectRatio = ((Video) this.f7696w1.m5294m(i).media.get(0)).formatAspectRatio();
                if (!TextUtils.isEmpty(aspectRatio) && aspectRatio.startsWith("http") && arrayList.size() < 5) {
                    arrayList.add(aspectRatio);
                }
            }
        }
        if (arrayList.size() > 0) {
            qib0.T0(arrayList);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m7886L0() {
        return this.f7600D1;
    }

    /* JADX INFO: renamed from: L1 */
    public void m7887L1(boolean z) {
        if (CoreModule.P().a().kb() && xdl0.O0(this.f7681p0)) {
            AppCompatTextView appCompatTextView = this.f7605F0;
            if (z) {
                if (xdl0.O0(appCompatTextView)) {
                    xdl0.M0(this.f7605F0, false);
                    VLinear vLinear = this.f7681p0;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationX", 0.0f, vLinear.getWidth() - t100.d(44.0f));
                    objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            if (xdl0.O0(appCompatTextView)) {
                return;
            }
            xdl0.M0(this.f7605F0, true);
            VLinear vLinear2 = this.f7681p0;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(vLinear2, "translationX", vLinear2.getWidth() - t100.d(44.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator(0.8f));
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.start();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public void m7888M1() {
        u4z u4zVarMo3111f0 = mo3111f0();
        this.f7690t1 = u4zVarMo3111f0;
        u4zVarMo3111f0.mo4918b(this.f7679o1, this.f7677n1, this.f7682p1);
        this.f7696w1.t(this.f7690t1.mo4919g());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m7889N0() {
        return xdl0.O0(this.f7610H);
    }

    /* JADX INFO: renamed from: O1 */
    public void m7890O1(boolean z) {
        if (CoreModule.P().a().Hd() && xdl0.O0(this.f7670k0)) {
            this.f7670k0.m2624R(z);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m7891P0(float f, float f2, ValueAnimator valueAnimator) {
        if (f != 0.0f) {
            this.f7679o1.m2072w2().f7677n1.getRealView().setTranslationY(f + ((f2 - f) * valueAnimator.getAnimatedFraction()));
        }
        this.f7627P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7627P.requestLayout();
    }

    /* JADX INFO: renamed from: P1 */
    public void m7892P1() {
        if (this.f7629Q.getAdapter() != null) {
            this.f7629Q.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m7893Q0() {
        xdl0.M(this.f7607G, true);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m7894R0(int i, ValueAnimator valueAnimator) {
        if (i != 0) {
            this.f7679o1.m2072w2().f7677n1.getRealView().setTranslationY(i * valueAnimator.getAnimatedFraction());
        }
        this.f7627P.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7627P.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX INFO: renamed from: R1 */
    public void m7895R1(final boolean z, final Runnable runnable) {
        int i;
        if (this.f7608G0.getChildCount() == 0) {
            return;
        }
        final float translationY = this.f7608G0.getTranslationY();
        if (this.f7686r1.m5750q()) {
            translationY = 0.0f;
        }
        this.f7686r1.m5746m();
        this.f7608G0.getHeight();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f7681p0)) {
            ViewGroup.LayoutParams layoutParams = this.f7681p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (!z) {
            m7869A0();
        }
        arrayList.add((NullChecker.a(this.f7681p0) && this.f7612H1) ? bt0.m(this.f7681p0, MessageBarOpt.f1825I0, 0L, 350L, this.f7606F1, new int[]{i, t100.d(12.0f)}) : bt0.j(350));
        if (z) {
            LinearLayout linearLayout = this.f7608G0;
            arrayList.add(bt0.p(linearLayout, "translationY", 0L, 350L, this.f7606F1, new float[]{translationY, linearLayout.getHeight() + translationY}));
            arrayList.add(bt0.p(this.f7608G0, "alpha", 0L, 350L, this.f7606F1, new float[]{1.0f, 0.0f}));
            if (!this.f7682p1.m6497e0().mo2063c0().m8904D0() && this.f7686r1.m5750q()) {
                arrayList.add(bt0.o(this.f7677n1.getRealView(), MessageBarOpt.f1825I0, new int[]{-t100.d(240.0f)}));
            }
        }
        Animator animatorZ = bt0.z((Animator[]) arrayList.toArray(new Animator[arrayList.size()]));
        bt0.f(animatorZ, new Runnable() { // from class: l.vpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f8395a.m7931h1(translationY, z, runnable);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m7896S0() {
        xdl0.M(this.f7607G, false);
    }

    /* JADX INFO: renamed from: S1 */
    public void m7897S1() {
        this.f7690t1.mo8072a();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m7898T0(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        this.f7682p1.m6497e0().mo2063c0().m6499g0().mo5101c().mo3798b(bool, num, bool2, num2);
        if (!bool.booleanValue()) {
            this.f7682p1.m6497e0().mo2046A0().m6499g0().m4824j0();
        }
        mo3076O0(num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: T1 */
    public void m7899T1() {
        xdl0.M(this.f7624N0, false);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m7900U0(String str) {
        this.f7658e1.setText(str);
        if ("00s".equals(str)) {
            m7962w0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m7901U1() {
        this.f7696w1.j(this.f7690t1.mo4919g());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m7902V0() {
        this.f7700y1 = this.f7660f1.getWidth();
    }

    /* JADX INFO: renamed from: V1 */
    public void m7903V1() {
        m7964x0();
        if (this.f7686r1.m5750q()) {
            ViewGroup.LayoutParams layoutParams = this.f7677n1.getRealView().getLayoutParams();
            int i = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0;
            xdl0.U(this.f7677n1.getRealView(), -t100.d(240.0f));
            int height = this.f7635T.getHeight() - (this.f7677n1.getListRenderHeight() - t100.d(480.0f));
            if (height >= 0 && height <= i + t100.d(240.0f)) {
                this.f7677n1.getRealView().setBottom(this.f7677n1.getRealView().getBottom() + height);
            }
        }
        this.f7686r1.m5738B(0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m7904W0(ValueAnimator valueAnimator) {
        this.f7660f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f7654c1.setTranslationX((int) (this.f7700y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m7905X0(View view) {
        if (xdl0.O0(this.f7660f1)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f3686a.m7904W0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        xdl0.M0(this.f7660f1, true);
        bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.gqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3988a.m7881I1();
            }
        });
    }

    /* JADX INFO: renamed from: X1 */
    public void m7906X1() {
        if (this.f7678o == null || this.f7649a == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f7678o.getChildCount(); i++) {
            if (this.f7678o.getChildAt(i).getId() == this.f7649a.getId()) {
                z = true;
            }
        }
        if (z) {
            this.f7678o.removeView(this.f7649a);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m7907Y(View view) {
        vqz.a(this, view);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m7908Y0(String str) {
        this.f7658e1.setText(str);
        if ("00s".equals(str)) {
            m7962w0();
            act().finish();
            e51.H(CoreModule.b, new Runnable() { // from class: l.dqz
                @Override // java.lang.Runnable
                public final void run() {
                    tqz.m7839P();
                }
            }, 400L);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m7909Y1(String str, String str2) {
        xdl0.M(this.f7631R, true);
        this.f7631R.removeAllViews();
        CoreModule.Q().M6().h(this.f7682p1.act(), this.f7631R, str, str2);
    }

    /* JADX INFO: renamed from: Z */
    public View m7910Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wqz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m7911Z0() {
        this.f7700y1 = this.f7660f1.getWidth();
        if (CoreModule.P().i().Y0(this.f7682p1.f3543c)) {
            this.f7654c1.setTranslationX(this.f7700y1);
            xdl0.M0(this.f7660f1, false);
        } else {
            m7881I1();
            CoreModule.P().i().u1(this.f7682p1.f3543c);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m7912Z1() {
        if (this.f7677n1.getLastVisiblePositionHook() == this.f7677n1.getCountHook() - 1) {
            return;
        }
        utl utlVar = this.f7677n1;
        utlVar.x(utlVar.getCountHook() - 1);
    }

    @Nullable
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f7679o1;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m7914a1(Message message, boolean z, Sticker sticker) {
        this.f7682p1.m4140L2(message, z, sticker);
        this.f7677n1.e();
    }

    /* JADX INFO: renamed from: a2 */
    public void m7915a2() {
        if (this.f7677n1.getLastVisiblePositionHook() == this.f7677n1.getCountHook() - 1) {
            return;
        }
        int iAbs = Math.abs(this.f7677n1.getCountHook() - this.f7677n1.getLastVisiblePositionHook());
        utl utlVar = this.f7677n1;
        if (iAbs >= 15) {
            utlVar.e();
        } else {
            utlVar.x(Math.max(0, utlVar.getCountHook() - 1));
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m7916b2() {
        this.f7690t1.mo8076i();
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m7934i1(P p) {
        this.f7682p1 = p;
    }

    /* JADX INFO: renamed from: c2 */
    public void m7918c2(String str) {
        this.f7660f1.setText(str);
        this.f7660f1.measure(0, 0);
        this.f7700y1 = this.f7660f1.getMeasuredWidth();
        this.f7660f1.post(new Runnable() { // from class: l.rqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f7054a.m7937j1();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public void m7919d0() {
        this.f7608G0.setPadding(t100.d(10.0f), 0, 0, 0);
        mo3081Q1(false, new Runnable() { // from class: l.cqz
            @Override // java.lang.Runnable
            public final void run() {
                tqz.m7865w();
            }
        });
        this.f7670k0.setMarginBottom(12);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m7920d1(final Message message, final boolean z, final Sticker sticker) {
        if (this.f7677n1.getLastVisiblePositionHook() == this.f7677n1.getCountHook() - 1) {
            this.f7682p1.m4140L2(message, z, sticker);
        } else {
            act().post(new Runnable() { // from class: l.gpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3963a.m7914a1(message, z, sticker);
                }
            });
        }
        this.f7677n1.e();
        if (CoreModule.P().i().si()) {
            CoreModule.P().i().K0();
            if (CoreModule.c.v1.m3("haveRead", "opening")) {
                CoreModule.P().i().f2(act());
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m7921d2() {
        this.f7600D1 = true;
    }

    /* JADX INFO: renamed from: e0 */
    public void m7922e0() {
        if (this.f7692u1) {
            int height = this.f7627P.getHeight();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
            final float translationY = this.f7679o1.m2072w2().f7677n1.getRealView().getTranslationY();
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
                    this.f3358a.m7891P0(translationY, f, valueAnimator);
                }
            });
            bt0.f(valueAnimatorOfInt, new Runnable() { // from class: l.fpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3669a.m7893Q0();
                }
            }).setDuration(300L).start();
            this.f7682p1.m6497e0().mo2051E().y0().m9202u(true);
            this.f7692u1 = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m7923e1(ValueAnimator valueAnimator) {
        this.f7660f1.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f7654c1.setTranslationX((int) (this.f7700y1 * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: e2 */
    public void m7924e2() {
        xdl0.M(this.f7616J0, true);
        zvf0.x("e_intl_ai_translate_bubble", "p_chat_view");
        xdl0.E0(this.f7622M0, new View.OnClickListener() { // from class: l.spz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7286a.m7938k1(view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public abstract u4z mo3111f0();

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m7925f1() {
        xdl0.M0(this.f7660f1, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m7926f2(final int i, final Runnable runnable) {
        this.f7608G0.setAlpha(0.0f);
        e51.F(this.f7679o1, new Runnable() { // from class: l.hqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f4261a.m7943m1(i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m7927g0() {
        if (NullChecker.a(this.f7702z1) && this.f7702z1.isShowing()) {
            this.f7702z1.dismiss();
            this.f7702z1 = null;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m7928g1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4472a.m7923e1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        bt0.f(valueAnimatorOfFloat, new Runnable() { // from class: l.kqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f5012a.m7925f1();
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g2 */
    public void m7929g2() {
        this.f7597C.setVisibility(8);
        m7960v0();
        if (this.f7682p1.m4249h7()) {
            this.f7680p.setVisibility(8);
            this.f7699y.setVisibility(8);
            this.f7597C.setVisibility(0);
            this.f7604F.setText(this.f7682p1.m4177T5());
            this.f7599D.setText(this.f7682p1.m4186V5());
            this.f7601E.setText(this.f7682p1.m4182U5());
            this.f7682p1.m4279n7();
            xdl0.E0(this.f7604F, new View.OnClickListener() { // from class: l.lpz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5383a.m7945n1(view);
                }
            });
            return;
        }
        if (CoreModule.P().i().V0()) {
            return;
        }
        if (CoreModule.P().i().c() && this.f7682p1.m4256j4() && NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed) {
            xdl0.M(this.f7680p, false);
            xdl0.M(this.f7699y, false);
            m7939k2();
            return;
        }
        if (!CoreModule.P().i().y1() || !CoreModule.P().i().t0()) {
            if (CoreModule.P().i().h0()) {
                if (!xdl0.O0(this.f7699y)) {
                    CoreModule.P().i().G4();
                }
                this.f7699y.setVisibility(0);
                if (NullChecker.a(this.f7682p1.m4191W5()) && TEnum.equals(this.f7682p1.m4191W5().gender, "female")) {
                    this.f7593A.setText(R.string.u5);
                }
                this.f7595B.setOnClickListener(new View.OnClickListener() { // from class: l.ppz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f6488a.m7951q1(view);
                    }
                });
                return;
            }
            if (fcz.f3514H0 || !r07.c) {
                return;
            }
            tpd0 tpd0Var = f7590J1;
            if (((Integer) tpd0Var.get()).intValue() >= 3 || !Network.language().equals("zh-Hans")) {
                return;
            }
            String str = Build.MANUFACTURER;
            if (str.toLowerCase().equals("vivo") || str.toLowerCase().equals("oppo")) {
                fcz.f3514H0 = true;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
                w3z.m8432D(this.f7679o1, new Runnable() { // from class: l.qpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6668a.m7953r1();
                    }
                }, new Runnable() { // from class: l.rpz
                    @Override // java.lang.Runnable
                    public final void run() {
                        tqz.f7590J1.put(3);
                    }
                });
                return;
            }
            return;
        }
        if (!xdl0.O0(this.f7680p)) {
            CoreModule.P().i().G4();
        }
        this.f7680p.setVisibility(0);
        User userPa = CoreModule.c.e0.Pa(this.f7682p1.m4295r3());
        if (NullChecker.a(userPa)) {
            if (this.f7688s1 == null) {
                this.f7688s1 = new TextPaint();
            }
            this.f7688s1.setTextSize(t100.d(15.0f));
            int iY0 = xdl0.y0() - t100.d(155.0f);
            String str2 = userPa.name;
            float f = iY0;
            if (f > this.f7688s1.measureText(act().getString(R.string.j2, str2)) || str2.length() <= 1) {
                this.f7683q.setText(act().getString(R.string.j2, userPa.name));
            } else {
                String strSubstring = str2.substring(0, str2.length() - 1);
                float fMeasureText = this.f7688s1.measureText(act().getString(R.string.j2, strSubstring.concat("…")));
                while (fMeasureText > f && strSubstring.length() > 1) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    fMeasureText = this.f7688s1.measureText(act().getString(R.string.j2, strSubstring.concat("…")));
                }
                this.f7683q.setText(act().getString(R.string.j2, strSubstring.concat("…")));
            }
            boolean zIsFemale = userPa.isFemale();
            AppCompatTextView appCompatTextView = this.f7685r;
            if (zIsFemale) {
                appCompatTextView.setText(R.string.h2);
            } else {
                appCompatTextView.setText(R.string.i2);
            }
        }
        xdl0.E0(this.f7687s, new View.OnClickListener() { // from class: l.mpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5720a.m7947o1(view);
            }
        });
        xdl0.E0(this.f7689t, new View.OnClickListener() { // from class: l.opz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6201a.m7949p1(view);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m7930h0() {
        int i;
        if (this.f7692u1) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, t100.d(141.0f));
        koy koyVar = this.f7686r1;
        final int i2 = (koyVar == null || (i = koyVar.f4991f) == 0) ? 0 : -i;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.aqz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f2262a.m7894R0(i2, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfInt, new Runnable() { // from class: l.bqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f2480a.m7896S0();
            }
        }).setDuration(300L).start();
        this.f7682p1.m6497e0().mo2051E().y0().m9202u(false);
        this.f7692u1 = true;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m7931h1(float f, boolean z, Runnable runnable) {
        if (this.f7608G0.getTranslationY() == this.f7608G0.getHeight() + f) {
            this.f7608G0.setTranslationY(f);
        }
        this.f7686r1.m5738B(0);
        if (z) {
            m7903V1();
            this.f7670k0.setMarginBottom(12);
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m7932h2() {
        if (ItemMessageBase.m1396Y(act())) {
            return;
        }
        this.f7682p1.m6497e0().mo2063c0().m6499g0().mo5108k(3, -1);
    }

    /* JADX INFO: renamed from: i0 */
    public void m7933i0(View view) {
        m7907Y(view);
    }

    /* JADX INFO: renamed from: i2 */
    public void m7935i2() {
        xdl0.M(this.f7610H, true);
        zvf0.x("e_open_button_click", "p_chat_view");
        xdl0.E0(this.f7619L, new View.OnClickListener() { // from class: l.ypz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9113a.m7955s1(view);
            }
        });
        xdl0.E0(this.f7617K, new View.OnClickListener() { // from class: l.jqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4706a.m7959u1(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z = App.b;
        View viewM7910Z = m7910Z(layoutInflater, null);
        if (CoreModule.P().i().p4()) {
            x4i0 x4i0Var = new x4i0();
            x4i0Var.b0(true);
            xdl0.M(this.f7639V, true);
            this.f7639V.setLayoutManager(x4i0Var);
            this.f7677n1 = this.f7639V;
        } else {
            xdl0.M(this.f7637U, true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
            linearLayoutManager.setStackFromEnd(true);
            this.f7637U.setLayoutManager(linearLayoutManager);
            this.f7677n1 = this.f7637U;
        }
        View viewInflateView = this.f7679o1.m2050D2() ? ((quz) this.f7682p1.m6497e0().mo2067m0().m6499g0()).inflateView(layoutInflater, viewGroup) : null;
        if (CoreModule.P().i().M4()) {
            this.f7668j1.addView(((ksz) this.f7682p1.m6497e0().mo2065j0().m6499g0()).inflateView(layoutInflater, viewGroup));
            xdl0.M(this.f7668j1, true);
        }
        guy guyVarM6499g0 = this.f7682p1.m6497e0().mo2046A0().m6499g0();
        guyVarM6499g0.inflateView(layoutInflater, viewGroup);
        LinearLayout linearLayout = this.f7678o;
        if (!this.f7679o1.m2050D2()) {
            viewInflateView = guyVarM6499g0.m4844t0();
        }
        linearLayout.addView(viewInflateView);
        View upKeyboardDetectorLayout = this.f7679o1.setUpKeyboardDetectorLayout(viewM7910Z, ((lwz) this.f7682p1.m6497e0().mo2068t0().m6499g0()).inflateView(layoutInflater, viewGroup), new h30() { // from class: l.npz
            @Override // p003l.h30
            /* JADX INFO: renamed from: b */
            public final void mo3798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f5949a.m7898T0((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (this.f7682p1.m4207Z5()) {
            m7850b0();
        }
        m7884K0();
        this.f7632R0.m2023c0(this.f7682p1);
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j0 */
    public j000 m7936j0() {
        return this.f7696w1;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m7937j1() {
        this.f7700y1 = this.f7654c1.getWidth() - this.f7658e1.getRight();
        if (CoreModule.P().i().Y0(this.f7682p1.f3543c)) {
            this.f7654c1.setTranslationX(this.f7700y1);
            xdl0.M0(this.f7660f1, false);
        } else {
            m7881I1();
            CoreModule.P().i().u1(this.f7682p1.f3543c);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public j760<Integer, Integer> mo3122k0() {
        return null;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m7938k1(View view) {
        m7956t0();
    }

    /* JADX INFO: renamed from: k2 */
    public final void m7939k2() {
        if (CoreModule.P().i().T1(this.f7682p1.m4295r3())) {
            return;
        }
        if (!xdl0.O0(this.f7691u)) {
            CoreModule.P().i().G4();
        }
        this.f7691u.setVisibility(0);
        this.f7693v.setText("打开推送，接收重要信息");
        zvf0.x("e_im_push_banner", this.f7682p1.pageId());
        xdl0.E0(this.f7695w, new View.OnClickListener() { // from class: l.wpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8599a.m7961v1(view);
            }
        });
        xdl0.E0(this.f7697x, new View.OnClickListener() { // from class: l.xpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8817a.m7963w1(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public String m7940l0() {
        return this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0().getBar_center_text().getText() == null ? "" : this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0().getBar_center_text().getText().toString();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m7941l1(int i) {
        if ((this.f7679o1.f1531f instanceof wmz) && koy.m5736r(i)) {
            this.f7679o1.f1531f.Dg();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VNavigationBar m7942m0() {
        return this.f7662g1;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m7943m1(final int i, final Runnable runnable) {
        int height = this.f7608G0.getHeight();
        float translationY = this.f7608G0.getTranslationY();
        if (koy.m5736r(i)) {
            translationY = 0.0f;
        }
        xdl0.U(this.f7670k0, t100.d(26.0f) + height);
        int iD = t100.d(12.0f);
        if (NullChecker.a(this.f7681p0)) {
            ViewGroup.LayoutParams layoutParams = this.f7681p0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                iD = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
        }
        Animator animatorZ = bt0.z(new Animator[]{this.f7686r1.m5750q() ? bt0.o(this.f7677n1.getRealView(), MessageBarOpt.f1825I0, new int[]{height - t100.d(240.0f)}) : bt0.j(350), bt0.p(this.f7608G0, "translationY", 0L, 350L, this.f7606F1, new float[]{height + translationY, translationY}), bt0.p(this.f7608G0, "alpha", 0L, 350L, this.f7606F1, new float[]{0.0f, 1.0f}), (NullChecker.a(this.f7681p0) && this.f7612H1) ? bt0.m(this.f7681p0, MessageBarOpt.f1825I0, 0L, 350L, this.f7606F1, new int[]{iD, t100.d(12.0f) + height}) : bt0.j(350)});
        bt0.v(animatorZ, new Runnable() { // from class: l.lqz
            @Override // java.lang.Runnable
            public final void run() {
                tqz.m7840Q(runnable);
            }
        });
        bt0.f(animatorZ, new Runnable() { // from class: l.mqz
            @Override // java.lang.Runnable
            public final void run() {
                this.f5744a.m7941l1(i);
            }
        });
        animatorZ.start();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m7944n0() {
        return this.f7692u1;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m7945n1(View view) {
        this.f7682p1.m4274m7();
    }

    /* JADX INFO: renamed from: o0 */
    public LinearLayout m7946o0() {
        return this.f7641W;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m7947o1(View view) {
        this.f7680p.setVisibility(8);
        zvf0.r("e_chat_prompt_notification_auth_banner_open_button", this.f7682p1.pageId());
        CoreModule.P().i().T();
        CoreModule.P().i().L3();
    }

    /* JADX INFO: renamed from: p0 */
    public LinearLayout m7948p0() {
        return this.f7608G0;
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m7949p1(View view) {
        this.f7680p.setVisibility(8);
        zvf0.r("e_chat_prompt_notification_auth_banner_close_button", this.f7682p1.pageId());
        CoreModule.P().i().L3();
    }

    /* JADX INFO: renamed from: q0 */
    public View m7950q0() {
        VLinear rightIconContainer = this.f7662g1.getRightIconContainer();
        if (rightIconContainer.getChildCount() > 0) {
            View viewFindViewWithTag = rightIconContainer.findViewWithTag("settingMenuTag");
            if (NullChecker.a(viewFindViewWithTag)) {
                return viewFindViewWithTag;
            }
        }
        return this.f7662g1.getRightIconContainer();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m7951q1(View view) {
        this.f7595B.setOnClickListener(null);
        this.f7699y.setVisibility(8);
        CoreModule.P().i().R1();
        CoreModule.P().i().T();
        CoreModule.P().i().H1();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public void mo3137r() {
        xdl0.C0(this.f7634S0, xdl0.w0());
        this.f7634S0.setScaleX(1.1f);
        this.f7634S0.setScaleY(1.1f);
        xdl0.D0(xdl0.y0(), new View[]{this.f7634S0});
        if (ura.e().d().I4()) {
            this.f7683q.setTextColor(this.f7679o1.getResources().getColor(a1c0.g));
            this.f7685r.setTextColor(this.f7679o1.getResources().getColor(a1c0.i));
            this.f7687s.setBackgroundResource(c3c0.f);
            this.f7689t.setImageResource(c3c0.Q3);
            this.f7701z.setTextColor(this.f7679o1.getResources().getColor(a1c0.g));
            this.f7593A.setTextColor(this.f7679o1.getResources().getColor(a1c0.i));
            this.f7595B.setBackgroundResource(c3c0.f);
            this.f7613I.setTextColor(this.f7679o1.getResources().getColor(a1c0.g));
            this.f7615J.setTextColor(this.f7679o1.getResources().getColor(a1c0.i));
            this.f7617K.setBackgroundResource(c3c0.f);
            this.f7619L.setImageResource(c3c0.Q3);
        }
        m7877G0();
        m7871B0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m7952r0() {
        xdl0.M(this.f7610H, false);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m7953r1() {
        f7590J1.put(3);
        this.f7679o1.startActivity(new Intent((Context) this.f7679o1, (Class<?>) NotificationSettingsAct.class));
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m7954s0() {
        ArrayList arrayListN;
        if (this.f7682p1.m4269l7()) {
            User userPa = CoreModule.c.e0.Pa(this.f7682p1.f3542b);
            if (NullChecker.a(userPa) && (arrayListN = vwb.n(userPa.pictures, new w9j() { // from class: l.dpz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            })) != null && arrayListN.size() > 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m7955s1(View view) {
        xdl0.M(this.f7610H, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m7956t0() {
        xdl0.M(this.f7616J0, false);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m7957t1(SettingGroups settingGroups) {
        lsi0.y("已开启消息通知");
        xdl0.M(this.f7610H, false);
    }

    /* JADX INFO: renamed from: u0 */
    public void m7958u0() {
        xdl0.M(this.f7614I0, false);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m7959u1(View view) {
        if (NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed && !CoreModule.c.e0.p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.c.e0.K9("openWithFriend", true, 0, 0)).subscribe((m250) mkd0.H(new e30() { // from class: l.tpz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7584a.m7957t1((SettingGroups) obj);
                }
            }, new e30() { // from class: l.upz
                @Override // p003l.e30
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        } else {
            act().duringCreated(CoreModule.c.e0.K9("openWithFriend", true, 0, 0)).subscribe((m250) mkd0.L(mkd0.B()));
            CoreModule.P().i().T();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m7960v0() {
        xdl0.M(this.f7691u, false);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m7961v1(View view) {
        this.f7691u.setVisibility(8);
        zvf0.u("e_im_push_banner", this.f7682p1.pageId(), new j760[]{vwb.Y("notification_action", "open")});
        CoreModule.P().i().T();
    }

    /* JADX INFO: renamed from: w0 */
    public void m7962w0() {
        yij0.U(this.f7698x1);
        this.f7698x1 = null;
        xdl0.M(this.f7654c1, false);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m7963w1(View view) {
        this.f7691u.setVisibility(8);
        zvf0.u("e_im_push_banner", this.f7682p1.pageId(), new j760[]{vwb.Y("notification_action", HttpHeaderValues.CLOSE)});
        CoreModule.P().i().X1(this.f7682p1.m4295r3());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m7964x0() {
        this.f7608G0.removeAllViews();
        this.f7608G0.setPadding(t100.i, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7608G0.getLayoutParams();
        layoutParams.rightMargin = 0;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 83;
        this.f7608G0.setLayoutParams(layoutParams);
        this.f7608G0.setBackgroundResource(a1c0.Y);
    }

    /* JADX INFO: renamed from: y0 */
    public void m7965y0(boolean z) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, this.f7640V0.getHeight());
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC0559c());
        translateAnimation.setDuration(800L);
        RelativeLayout relativeLayout = this.f7640V0;
        if (z) {
            relativeLayout.startAnimation(translateAnimation);
        } else {
            relativeLayout.setVisibility(8);
        }
        this.f7594A1 = true;
    }

    /* JADX INFO: renamed from: y1 */
    public void m7966y1(Runnable runnable) {
        if (this.f7637U.G()) {
            runnable.run();
            return;
        }
        this.f7637U.addOnScrollListener(new C0561e(runnable));
        if (Math.abs(this.f7637U.getCount() - this.f7637U.getLastVisiblePosition()) >= 15) {
            this.f7637U.I();
        } else {
            m7912Z1();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m7967z0() {
        yij0.U(this.f7698x1);
        this.f7698x1 = null;
    }

    /* JADX INFO: renamed from: z1 */
    public void m7968z1(final Message message, final boolean z, final Sticker sticker) {
        if (CoreModule.P().i().o1(this.f7682p1.f3543c) && !xma.F3()) {
            lsi0.j("黑金会员已过期，重新开通立即解锁专属客服");
            return;
        }
        if (CoreModule.P().i().De()) {
            if (!NullChecker.a(this.f7682p1.m4325x6()) || this.f7682p1.m4325x6().inactivated) {
                lsi0.j("对方已注销");
                return;
            } else if (this.f7682p1.m4325x6().status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                lsi0.j("对方账号异常");
                return;
            }
        }
        if (User.isBusinessAI1V1(this.f7682p1.m4295r3()) && !xma.z3()) {
            lsi0.y("今天太累了，明天再聊吧");
            return;
        }
        if (this.f7682p1.m4241g4()) {
            return;
        }
        if (CoreModule.P().i().E()) {
            message.channel = MessageChannel.get(this.f7682p1.m4231e4() ? "group" : ServletHandler.__DEFAULT_SERVLET);
        }
        if (CoreModule.K().me_().isChatJailed() && NullChecker.a(this.f7682p1.m4325x6()) && !this.f7682p1.m4325x6().isTeamAccount()) {
            CoreModule.P().i().Z2(act(), false);
            return;
        }
        String stringExtra = act().getIntent().getStringExtra("heartbeat_consume_type");
        if (TextUtils.equals(stringExtra, "quickchat")) {
            message.consumeType = "privilege";
        } else if (TextUtils.equals(stringExtra, "coin")) {
            message.consumeType = "coin";
            message.coinSign = CoreModule.c.H0.s4(SummarizedPrivilegesId.get("quickchatNumber"));
        }
        Runnable runnable = new Runnable() { // from class: l.cpz
            @Override // java.lang.Runnable
            public final void run() {
                this.f2749a.m7920d1(message, z, sticker);
            }
        };
        if (this.f7677n1.m()) {
            runnable.run();
            return;
        }
        int iAbs = Math.abs(this.f7677n1.getCountHook() - this.f7677n1.getLastVisiblePositionHook());
        utl utlVar = this.f7677n1;
        if (iAbs >= 15) {
            utlVar.e();
        } else {
            utlVar.x(Math.max(0, utlVar.getCountHook() - 1));
        }
        this.f7677n1.getRealView().postDelayed(runnable, 200L);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.tqz$c */
    public class AnimationAnimationListenerC0559c implements Animation.AnimationListener {
        public AnimationAnimationListenerC0559c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            tqz.this.f7640V0.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: H1 */
    public void mo3063H1(Message message) {
    }

    /* JADX INFO: renamed from: O0 */
    public void mo3076O0(int i, boolean z) {
    }

    /* JADX INFO: renamed from: Q1 */
    public void mo3081Q1(boolean z, Runnable runnable) {
    }
}
