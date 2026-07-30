package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.messages.a;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core.view.HeartView;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sunshine.engine.bone.StageView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.ddj0;
import l.e16;
import l.e51;
import l.f6c0;
import l.fyq;
import l.i0g0;
import l.j760;
import l.jjb0;
import l.jtk;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.o7r;
import l.osi0;
import l.qib0;
import l.qp4;
import l.roj0;
import l.rs4;
import l.rza;
import l.sb90;
import l.t100;
import l.tpd0;
import l.tz00;
import l.u4c0;
import l.u59;
import l.upa;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.wqf0;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;
import p014rx.C1099c;
import p028v.VButton;
import p028v.VButton_FakeShadow;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VFrame;
import p028v.VIcon;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRecyclerView;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class y9x implements yvl<y8x> {

    /* JADX INFO: renamed from: A */
    public VLinear f8949A;

    /* JADX INFO: renamed from: B */
    public VText f8950B;

    /* JADX INFO: renamed from: C */
    public VImage f8951C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f8952D;

    /* JADX INFO: renamed from: E */
    public VEditText f8953E;

    /* JADX INFO: renamed from: E0 */
    public int f8954E0;

    /* JADX INFO: renamed from: F */
    public VText f8955F;

    /* JADX INFO: renamed from: F0 */
    public Animator f8956F0;

    /* JADX INFO: renamed from: G */
    public VLinear f8957G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f8959H;

    /* JADX INFO: renamed from: H0 */
    public int f8960H0;

    /* JADX INFO: renamed from: I */
    public SVGAnimationView f8961I;

    /* JADX INFO: renamed from: J */
    public ImageView f8963J;

    /* JADX INFO: renamed from: K */
    public VText f8965K;

    /* JADX INFO: renamed from: L */
    public FrameLayout f8967L;

    /* JADX INFO: renamed from: L0 */
    public boolean f8968L0;

    /* JADX INFO: renamed from: M */
    public SVGAnimationView f8969M;

    /* JADX INFO: renamed from: N */
    public ImageView f8971N;

    /* JADX INFO: renamed from: O */
    public VText f8973O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f8975P;

    /* JADX INFO: renamed from: P0 */
    public fyq f8976P0;

    /* JADX INFO: renamed from: Q */
    public SVGAnimationView f8977Q;

    /* JADX INFO: renamed from: R */
    public ImageView f8979R;

    /* JADX INFO: renamed from: S */
    public VText f8981S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f8983T;

    /* JADX INFO: renamed from: T0 */
    public int f8984T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f8985U;

    /* JADX INFO: renamed from: U0 */
    public C0661g f8986U0;

    /* JADX INFO: renamed from: V */
    public ImageView f8987V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayoutManager f8988V0;

    /* JADX INFO: renamed from: W */
    public VText f8989W;

    /* JADX INFO: renamed from: X */
    public VButton_FakeShadow f8991X;

    /* JADX INFO: renamed from: Y */
    public VButton f8993Y;

    /* JADX INFO: renamed from: Z */
    public MatchAct f8995Z;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f8996a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f8997b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f8998c;

    /* JADX INFO: renamed from: d */
    public HeartView f8999d;

    /* JADX INFO: renamed from: e */
    public StageView f9000e;

    /* JADX INFO: renamed from: f */
    public VText f9001f;

    /* JADX INFO: renamed from: g */
    public TextView f9002g;

    /* JADX INFO: renamed from: h */
    public VText f9003h;

    /* JADX INFO: renamed from: i */
    public TextView f9004i;

    /* JADX INFO: renamed from: j */
    public VText f9005j;

    /* JADX INFO: renamed from: k */
    public VRelative f9006k;

    /* JADX INFO: renamed from: k0 */
    public y8x f9007k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f9008l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f9009m;

    /* JADX INFO: renamed from: n */
    public VImage f9010n;

    /* JADX INFO: renamed from: o */
    public Guideline f9011o;

    /* JADX INFO: renamed from: p */
    public VRelative f9012p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f9014q;

    /* JADX INFO: renamed from: r */
    public VImage f9015r;

    /* JADX INFO: renamed from: s */
    public VFrame f9016s;

    /* JADX INFO: renamed from: t */
    public VIcon f9017t;

    /* JADX INFO: renamed from: u */
    public VIcon f9018u;

    /* JADX INFO: renamed from: v */
    public View f9019v;

    /* JADX INFO: renamed from: w */
    public VImage f9020w;

    /* JADX INFO: renamed from: x */
    public VRecyclerView f9021x;

    /* JADX INFO: renamed from: y */
    public TextView f9022y;

    /* JADX INFO: renamed from: z */
    public TextView f9023z;

    /* JADX INFO: renamed from: p0 */
    public boolean f9013p0 = false;

    /* JADX INFO: renamed from: G0 */
    public boolean f8958G0 = false;

    /* JADX INFO: renamed from: I0 */
    public float f8962I0 = 811.0f;

    /* JADX INFO: renamed from: J0 */
    public boolean f8964J0 = true;

    /* JADX INFO: renamed from: K0 */
    public User f8966K0 = null;

    /* JADX INFO: renamed from: M0 */
    public View.OnClickListener f8970M0 = new View.OnClickListener() { // from class: l.k9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f4877a.m9093t1(view);
        }
    };

    /* JADX INFO: renamed from: N0 */
    public View.OnClickListener f8972N0 = new View.OnClickListener() { // from class: l.q9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f6613a.m9096u1(view);
        }
    };

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener f8974O0 = new View.OnClickListener() { // from class: l.r9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f6821a.m9099v1(view);
        }
    };

    /* JADX INFO: renamed from: Q0 */
    public float f8978Q0 = 1.0f;

    /* JADX INFO: renamed from: R0 */
    public float f8980R0 = 1.0f;

    /* JADX INFO: renamed from: S0 */
    public int f8982S0 = t100.d(1.0f * 51.0f);

    /* JADX INFO: renamed from: W0 */
    public d f8990W0 = d.l();

    /* JADX INFO: renamed from: X0 */
    public tpd0 f8992X0 = new tpd0("core_match_ice_break_guide_shown_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: Y0 */
    public Set<String> f8994Y0 = new HashSet();

    /* JADX INFO: renamed from: l.y9x$a */
    public class RunnableC0655a implements Runnable {
        public RunnableC0655a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y9x.this.act() == null) {
                return;
            }
            y9x.this.act().finish();
        }
    }

    /* JADX INFO: renamed from: l.y9x$b */
    public class RunnableC0656b implements Runnable {
        public RunnableC0656b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y9x.this.act() == null) {
                return;
            }
            y9x.this.act().finish();
        }
    }

    /* JADX INFO: renamed from: l.y9x$c */
    public class C0657c extends RecyclerView.t {
        public C0657c() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                y9x.this.m9138b2(y9x.this.f8988V0.findFirstVisibleItemPosition(), y9x.this.f8988V0.findLastVisibleItemPosition(), "swipe");
            }
        }
    }

    /* JADX INFO: renamed from: l.y9x$d */
    public class RunnableC0658d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f9028b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f9029c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f9030d;

        public RunnableC0658d(int i, TextView textView, String str, String str2) {
            this.f9027a = i;
            this.f9028b = textView;
            this.f9029c = str;
            this.f9030d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (upa.r1() && this.f9027a == 44) {
                y9x.this.f9003h.setText("重逢配对");
                y9x.this.f9004i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
                xdl0.V(y9x.this.f9004i, t100.d(32.0f));
                xdl0.W(y9x.this.f9004i, t100.d(32.0f));
                y9x.this.f9004i.setTextColor(Color.parseColor("#66E8CA8A"));
                return;
            }
            boolean zJ2 = upa.j2();
            y9x y9xVar = y9x.this;
            if (zJ2) {
                y9xVar.m9148h2(this.f9028b, this.f9029c, this.f9030d);
            } else {
                y9xVar.m9146g2(this.f9028b, this.f9029c, this.f9030d);
            }
        }
    }

    /* JADX INFO: renamed from: l.y9x$g */
    public class C0661g extends dac0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public List<BreakIce> f9035c;

        public C0661g() {
            this.f9035c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m9165H(BreakIce breakIce, View view) {
            zvf0.u("e_breakice_content", y9x.this.act().pageId(), new j760[]{vwb.Y("actor_user_id", CoreModule.H().userId()), vwb.Y("message_id", breakIce.tipId), vwb.Y("chat_content", breakIce.content)});
            y9x.this.f9007k0.m8995a2(breakIce, y9x.this.f9007k0.m5985o0());
            CoreModule.c.e0.I9(y9x.this.f9007k0.m5985o0(), breakIce.tipId);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f9035c.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return o7r.a(y9x.this.m9110C0()).inflate(f6c0.i7, (ViewGroup) null, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final BreakIce breakIce, int i, int i2) {
            TextView textView = (TextView) view.findViewById(u4c0.Pd);
            textView.setText(breakIce.content);
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.z9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9278a.m9165H(breakIce, view2);
                }
            });
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f9035c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m9168I(List<BreakIce> list) {
            if (vwb.J(list)) {
                return;
            }
            this.f9035c.clear();
            this.f9035c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.y9x$h */
    public static class C0662h {
        /* JADX INFO: renamed from: b */
        public static void m9170b(y9x y9xVar, View view) {
            y9xVar.f8996a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            y9xVar.f8997b = viewGroup.getChildAt(0);
            y9xVar.f8998c = viewGroup.getChildAt(1);
            y9xVar.f8999d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            y9xVar.f9000e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            y9xVar.f9001f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            y9xVar.f9002g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
            y9xVar.f9003h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
            y9xVar.f9004i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
            y9xVar.f9005j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
            y9xVar.f9006k = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
            y9xVar.f9008l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0);
            y9xVar.f9009m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
            y9xVar.f9010n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(2);
            y9xVar.f9011o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
            y9xVar.f9012p = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
            y9xVar.f9014q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(0);
            y9xVar.f9015r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(1);
            y9xVar.f9016s = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2);
            y9xVar.f9017t = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(0);
            y9xVar.f9018u = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(1);
            y9xVar.f9019v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(3);
            y9xVar.f9020w = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(4);
            y9xVar.f9021x = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
            y9xVar.f9022y = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
            y9xVar.f9023z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
            y9xVar.f8949A = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
            y9xVar.f8950B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(0);
            y9xVar.f8951C = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(1);
            y9xVar.f8952D = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
            y9xVar.f8953E = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
            y9xVar.f8955F = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(1);
            y9xVar.f8957G = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
            y9xVar.f8959H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0);
            y9xVar.f8961I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(0);
            y9xVar.f8963J = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(1);
            y9xVar.f8965K = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(2);
            y9xVar.f8967L = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2);
            y9xVar.f8969M = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(0);
            y9xVar.f8971N = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(1);
            y9xVar.f8973O = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(2);
            y9xVar.f8975P = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4);
            y9xVar.f8977Q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(0);
            y9xVar.f8979R = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(1);
            y9xVar.f8981S = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(2);
            y9xVar.f8983T = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6);
            y9xVar.f8985U = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(0);
            y9xVar.f8987V = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(1);
            y9xVar.f8989W = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(2);
            y9xVar.f8991X = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
            y9xVar.f8993Y = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        }

        /* JADX INFO: renamed from: c */
        public static View m9171c(y9x y9xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.k7, viewGroup, false);
            m9170b(y9xVar, viewInflate);
            return viewInflate;
        }
    }

    public y9x(MatchAct matchAct) {
        this.f8995Z = matchAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m9049W0() {
        m9131V0(false);
    }

    /* JADX INFO: renamed from: Y1 */
    private void m9052Y1() {
        xdl0.M(this.f9015r, true);
        boolean zF0 = u59.f0();
        VImage vImage = this.f9015r;
        if (zF0) {
            vImage.setImageDrawable(e16.e(act(), x2c0.be));
        } else {
            vImage.setImageDrawable(e16.e(act(), x2c0.ae));
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m9054Z1() {
        xdl0.M(this.f9010n, true);
        boolean zF0 = u59.f0();
        VImage vImage = this.f9010n;
        if (zF0) {
            vImage.setImageDrawable(e16.e(act(), x2c0.be));
        } else {
            vImage.setImageDrawable(e16.e(act(), x2c0.ae));
        }
    }

    /* JADX INFO: renamed from: a2 */
    private void m9057a2() {
        act();
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            this.f9007k0.m9006s1();
            return;
        }
        Activity activity = arrayList.size() > 0 ? (Activity) ((Act.r) arrayList.get(0)).a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f9007k0.m9006s1();
        } else {
            a5x.m2744a(activity, act(), 0);
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m9062c2() {
        int i;
        User userP9 = CoreModule.c.e0.p9();
        Settings settings = userP9.settings;
        boolean z = NullChecker.a(userP9) && NullChecker.a(settings) && qib0.b0.a.rq(settings.getSettingGroup()) && NullChecker.a(this.f8966K0) && NullChecker.a(this.f8966K0.settings) && NullChecker.a(this.f8966K0.settings.getSettingGroup().gender.newGender);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                if (z) {
                    i = x2c0.L9;
                    break;
                } else {
                    i = x2c0.T9;
                    break;
                }
                break;
            case "ja":
                if (z) {
                    i = x2c0.M9;
                    break;
                } else {
                    i = x2c0.U9;
                    break;
                }
                break;
            case "ko":
                if (z) {
                    i = x2c0.N9;
                    break;
                } else {
                    i = x2c0.V9;
                    break;
                }
                break;
            case "th":
                if (z) {
                    i = x2c0.O9;
                    break;
                } else {
                    i = x2c0.W9;
                    break;
                }
                break;
            case "vi":
                if (z) {
                    i = x2c0.P9;
                    break;
                } else {
                    i = x2c0.X9;
                    break;
                }
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = !z ? x2c0.Y9 : x2c0.Q9;
                    break;
                } else {
                    if (!z) {
                        i = x2c0.Z9;
                    } else {
                        i = x2c0.R9;
                    }
                    break;
                }
                break;
            default:
                if (z) {
                    i = x2c0.K9;
                    break;
                } else {
                    i = x2c0.S9;
                    break;
                }
                break;
        }
        this.f9020w.setBackgroundResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m9081m1(View view) {
        act().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m9093t1(View view) {
        o6j0.c("e_matched_later", "p_successful_match_view", new o6j0.a[]{o6j0.a.h("match_source", this.f9007k0.m5986p0(act().f360e))});
        act().f364i = true;
        this.f9007k0.m8993Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m9096u1(View view) {
        if (this.f8964J0) {
            zvf0.r("e_matched_share", "p_successful_match_view");
            this.f9007k0.m8998d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m9099v1(View view) {
        o6j0.c("e_matched_send_message", act().pageId(), new o6j0.a[0]);
        String strTrim = this.f8953E.getText().toString().trim();
        if (upa.j2()) {
            tz00.i(act(), this.f8966K0, strTrim, true, new RunnableC0655a(), this.f9007k0.f8944i);
        } else {
            this.f9007k0.m8997c2(strTrim, this.f9013p0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m9108A1(View view) {
        o6j0.c("e_intl_instantmatch_no_ultra_click", act().pageId(), new o6j0.a[0]);
        if (!xma.C3()) {
            this.f9007k0.m9000f2(false);
        } else if (C0038a.m652w().m653A()) {
            C0038a.m652w().m662J(act(), this.f8966K0, new d30() { // from class: l.f9x
                @Override // p003l.d30
                public final void call() {
                    this.f3472a.m9163z1();
                }
            });
        } else {
            lsi0.F(act(), act().getString(R.string.o9));
            act().finish();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m9109B1(View view) {
        o6j0.c("e_intl_instantmatch_no_ultra_giveup", act().pageId(), new o6j0.a[0]);
        act().finish();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9110C0() {
        return this.f8995Z;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m9111C1(View view) {
        o6j0.c("e_intl_match_sayhi", act().pageId(), new o6j0.a[0]);
        this.f9007k0.m8999e2(false);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m9112E1(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m9113F1(int i, View view) {
        if (i == 43) {
            this.f9007k0.m9004j2(false);
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m9114G1(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m9115H1(User user, View view) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
        } else if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
        } else {
            qp4.q(act());
        }
        zvf0.u("e_successful_match_view_verification", "p_successful_match_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) user).id)});
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m9116I1(ValueAnimator valueAnimator) {
        this.f8999d.setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m9117J1(View view) {
        m9139d1("[" + act().getString(R.string.lj) + "]", "NEW_EMOJI_HAHE", 1);
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m9118K1(View view) {
        m9139d1("[" + act().getString(R.string.kj) + "]", "NEW_EMOJI_BEER", 2);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m9119L1(View view) {
        m9139d1("[" + act().getString(R.string.h4) + "]", "EMOJI_70", 3);
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m9120M1(View view) {
        m9139d1("[" + act().getString(R.string.g4) + "]", "EMOJI_63", 4);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m9121O1(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f9004i.setText(R.string.R1);
        } else if (i == 12 || i == 11 || i == 13) {
            if (i == 12) {
                m9140d2(this.f9004i, act().getString(R.string.X0), user.name, i);
            } else if (i == 13) {
                m9140d2(this.f9004i, act().getString(R.string.F2), user.name, i);
            } else if (i == 11) {
                m9140d2(this.f9004i, act().getString(R.string.W0), user.name, i);
            }
        } else if (i == 0 || i == 39 || i == 37 || i == 38 || i == 47 || i == 10) {
            m9140d2(this.f9004i, act().getString(R.string.Jh), user.name, i);
        } else if (i == 1) {
            if (arrayList.size() > 0) {
                str = user.name + " (" + arrayList.get(0) + ")";
            } else {
                str = user.name;
            }
            m9140d2(this.f9004i, act().getString(R.string.um), str, i);
        } else if (i == 26) {
            m9140d2(this.f9004i, act().getString(R.string.Jh), user.name, i);
        }
        if (this.f8964J0) {
            return;
        }
        m9140d2(this.f9004i, act().getString(R.string.Q4), user.name, i);
    }

    /* JADX INFO: renamed from: P1 */
    public final Animator m9122P1(int i) {
        return bt0.z(new Animator[]{m9153k2(i, HttpStatus.INTERNAL_SERVER_ERROR_500, t100.d(this.f8978Q0 * 40.0f), 0), m9129U0(HttpStatus.INTERNAL_SERVER_ERROR_500, 0, 1), bt0.l(this.f9002g, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f9002g, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), new float[]{t100.d(40.0f), 0.0f})});
    }

    /* JADX INFO: renamed from: Q1 */
    public void m9123Q1() {
        this.f8991X.setClickable(false);
    }

    /* JADX INFO: renamed from: R1 */
    public final Animator m9124R1() {
        this.f9006k.setTranslationX(-t100.d(this.f8980R0 * 108.0f));
        this.f9012p.setTranslationX(t100.d(this.f8980R0 * 108.0f));
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f9006k;
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(vRelative, property, 200L, 700L, wqf0Var, new float[]{(-t100.d(108.0f)) * this.f8980R0, t100.d(30.0f) * this.f8980R0});
        Animator animatorL2 = bt0.l(this.f9012p, property, 200L, 700L, wqf0Var, new float[]{t100.d(108.0f) * this.f8980R0, (-t100.d(30.0f)) * this.f8980R0});
        VRelative vRelative2 = this.f9006k;
        Property property2 = View.ALPHA;
        Animator animatorZ = bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f9012p, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f})});
        this.f8956F0 = animatorZ;
        return animatorZ;
    }

    /* JADX INFO: renamed from: S0 */
    public View m9125S0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0662h.m9171c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S1 */
    public void m9126S1(List<BreakIce> list) {
        xdl0.M0(this.f9021x, true);
        this.f8988V0 = this.f9021x.getLayoutManager();
        C0661g c0661g = new C0661g();
        this.f8986U0 = c0661g;
        this.f9021x.setAdapter(c0661g);
        this.f8986U0.m9168I(list);
        xdl0.Q0(this.f9021x, new e30() { // from class: l.b9x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2361a.m9161w1((int[]) obj);
            }
        });
        this.f9021x.addOnScrollListener(new C0657c());
        int iD = t100.d(this.f8978Q0 * 100.0f);
        this.f8984T0 = iD;
        xdl0.X(this.f8952D, iD);
        xdl0.U(this.f9021x, t100.d(this.f8978Q0 * 10.0f));
        m9128T1();
    }

    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f8995Z;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m9128T1() {
        if (((Integer) this.f8992X0.get()).intValue() >= upa.f3()) {
            return;
        }
        act().duringCreated(C1099c.timer(2L, TimeUnit.SECONDS)).observeOn(jo0.m5414a()).subscribe((m250) mkd0.G(new e30() { // from class: l.g9x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3821a.m9162y1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m9129U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (upa.j2()) {
            TextView textView = this.f9004i;
            Property property = View.ALPHA;
            long j = i;
            float f = i2;
            float f2 = i3;
            return bt0.z(new Animator[]{bt0.l(textView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f9005j, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
        }
        AppCompatTextView appCompatTextView = this.f9003h;
        Property property2 = View.ALPHA;
        long j2 = i;
        float f3 = i2;
        float f4 = i3;
        return bt0.z(new Animator[]{bt0.l(appCompatTextView, property2, 0L, j2, decelerateInterpolator, new float[]{f3, f4}), bt0.l(this.f9004i, property2, 0L, j2, decelerateInterpolator, new float[]{f3, f4})});
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
    /* JADX INFO: renamed from: U1 */
    public void m9130U1(User user, final User user2, final int i, ArrayList<String> arrayList) {
        String str;
        if (user == null || user2 == null) {
            NullChecker.b(user);
            NullChecker.b(user2);
            act().finish();
            return;
        }
        if (this.f9007k0.m9005r1() == 50 || this.f9007k0.m9005r1() == 51) {
            this.f8999d.d("https://auto.tancdn.com/v1/images/eyJpZCI6IjU0SU1CU0ZaRktSNkJSTTY2UEpXUklTTkdNQlo2UzE0IiwidyI6MTUzNSwiaCI6MTM0MywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjg2ODY1NzI1MzAwODg4OTEzOX0.png");
            this.f8999d.setBackgroundColor(Color.parseColor("#F3E1FF"));
        } else {
            this.f8999d.c();
        }
        this.f8966K0 = user2;
        if (this.f9007k0.m9005r1() == 40) {
            qib0.G.L0(this.f9008l, user.fp().profileBig().formatted());
            this.f9023z.setText(act().getResources().getText(user2.isFemale() ? R.string.Ih : R.string.Hh));
            qib0.G.O(this.f9014q, user2.fp().profileBig().formatted(), 4, 30);
            return;
        }
        if (this.f9007k0.m9005r1() == 41) {
            qib0.G.I0(this.f9008l, user.fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            if (sb90.c(user2)) {
                qib0.G.O(this.f9014q, user2.fp().profileBig().formatted(), 4, 30);
            } else {
                qib0.G.I0(this.f9014q, user2.fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            }
            this.f9004i.setText(String.format("开通黑金会员立即与%s聊天！", user2.isFemale() ? "她" : "他"));
            this.f9023z.setText(act().getResources().getText(user2.isFemale() ? R.string.Ih : R.string.Hh));
            return;
        }
        boolean z = false;
        if (this.f9007k0.m9005r1() == 50) {
            xdl0.M(this.f8952D, false);
            xdl0.M(this.f8991X, false);
            xdl0.M(this.f8993Y, false);
            xdl0.M(this.f9022y, true);
            xdl0.M(this.f9023z, true);
            xdl0.M(this.f9020w, true);
            xdl0.M(this.f9002g, true);
            this.f9002g.setText(act().getString(R.string.yp));
            this.f9003h.setText(act().getString(R.string.cg));
            this.f9003h.setAutoSizeTextTypeWithDefaults(1);
            this.f9004i.setText(String.format(act().getString(R.string.bg), user2.name));
            this.f9004i.setMaxLines(Integer.MAX_VALUE);
            rza.Q0(this.f9004i, R.string.bg);
            this.f9004i.setTextColor(Color.parseColor("#66000000"));
            xdl0.C0(this.f9022y, t100.d(this.f8978Q0 * 56.0f));
            this.f9022y.setText(act().getString(R.string.Zf));
            this.f9022y.setTextSize(this.f8978Q0 * 16.0f);
            this.f9022y.setBackgroundResource(x2c0.jb);
            this.f9022y.setTextColor(Color.parseColor("#F9E7FF"));
            xdl0.C0(this.f9023z, t100.d(this.f8978Q0 * 56.0f));
            this.f9023z.setText(act().getString(R.string.ag));
            this.f9023z.setTextSize(this.f8978Q0 * 16.0f);
            o6j0.h("e_intl_instantmatch_no_ultra_click", act().pageId(), new o6j0.a[0]);
            o6j0.h("e_intl_instantmatch_no_ultra_giveup", act().pageId(), new o6j0.a[0]);
            this.f9022y.setOnClickListener(new View.OnClickListener() { // from class: l.s9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7164a.m9108A1(view);
                }
            });
            this.f9023z.setOnClickListener(new View.OnClickListener() { // from class: l.t9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7425a.m9109B1(view);
                }
            });
            qib0.G.J0(this.f9008l, user.fp().profileMiddle(), false);
            qib0.G.J0(this.f9014q, user2.fp().profileMiddle(), false);
            return;
        }
        if (i == 48 || i == 49) {
            xdl0.M(this.f8952D, false);
            xdl0.M(this.f8991X, false);
            xdl0.M(this.f8993Y, false);
            xdl0.M(this.f9022y, true);
            xdl0.M(this.f9023z, true);
            xdl0.M(this.f9020w, true);
            xdl0.M(this.f9002g, true);
            m9062c2();
            this.f9002g.setText(act().getString(R.string.yp));
            this.f9003h.setText(act().getString(R.string.Fb));
            this.f9003h.setAutoSizeTextTypeWithDefaults(1);
            this.f9004i.setText(act().getString(R.string.ec));
            this.f9004i.setTextColor(Color.parseColor("#66000000"));
            xdl0.C0(this.f9022y, t100.d(this.f8978Q0 * 56.0f));
            this.f9022y.setText(act().getString(R.string.cc));
            this.f9022y.setTextSize(this.f8978Q0 * 16.0f);
            this.f9022y.setTextColor(Color.parseColor("#FF4B72"));
            xdl0.C0(this.f9023z, t100.d(this.f8978Q0 * 56.0f));
            this.f9023z.setText(act().getString(R.string.dc));
            this.f9023z.setTextSize(this.f8978Q0 * 16.0f);
            this.f9022y.setOnClickListener(new View.OnClickListener() { // from class: l.u9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7942a.m9111C1(view);
                }
            });
            this.f9023z.setOnClickListener(new View.OnClickListener() { // from class: l.v9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8251a.m9112E1(view);
                }
            });
            qib0.G.J0(this.f9008l, user.fp().profileMiddle(), false);
            qib0.G.J0(this.f9014q, user2.fp().profileMiddle(), false);
            return;
        }
        if (i == 42 || i == 43) {
            xdl0.M(this.f8952D, false);
            xdl0.M(this.f8991X, false);
            xdl0.M(this.f8993Y, false);
            xdl0.M(this.f9022y, true);
            xdl0.M(this.f9023z, true);
            this.f9002g.setText("Congratulations！");
            this.f9003h.setText("互相喜欢");
            this.f9004i.setText(String.format("开通SVIP会员立即和%s聊天！", user2.isFemale() ? "她" : "他"));
            xdl0.C0(this.f9022y, t100.d(this.f8978Q0 * 56.0f));
            this.f9022y.setText(i == 43 ? "发消息" : "确定");
            this.f9022y.setTextSize(this.f8978Q0 * 16.0f);
            xdl0.C0(this.f9023z, t100.d(this.f8978Q0 * 56.0f));
            TextView textView = this.f9023z;
            if (i == 43) {
                str = String.format("放弃%s", user2.isFemale() ? "她" : "他");
            } else {
                str = "继续探索";
            }
            textView.setText(str);
            this.f9023z.setTextSize(this.f8978Q0 * 16.0f);
            this.f9022y.setOnClickListener(new View.OnClickListener() { // from class: l.w9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8521a.m9113F1(i, view);
                }
            });
            this.f9023z.setOnClickListener(new View.OnClickListener() { // from class: l.x9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8748a.m9114G1(view);
                }
            });
            qib0.G.J0(this.f9008l, user.fp().profileMiddle(), false);
            qib0.G.J0(this.f9014q, user2.fp().profileMiddle(), false);
            return;
        }
        if (i == 47) {
            this.f9002g.setText(act().getString(R.string.yp));
            this.f9003h.setText(act().getString(R.string.Fb));
            this.f9003h.setAutoSizeTextTypeWithDefaults(1);
            this.f9004i.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f9020w, true);
            m9062c2();
            qib0.G.J0(this.f9008l, user.fp().profileMiddle(), false);
            qib0.G.J0(this.f9014q, user2.fp().profileMiddle(), false);
        } else {
            qib0.G.J0(this.f9008l, user.fp().profileMiddle(), false);
            qib0.G.J0(this.f9014q, user2.fp().profileMiddle(), false);
        }
        if (i == 51) {
            this.f9004i.setText(act().getString(R.string.dg, user2.name));
            this.f9004i.setMaxLines(Integer.MAX_VALUE);
            rza.Q0(this.f9004i, R.string.dg);
            this.f8955F.setTextColor(Color.parseColor("#33000000"));
            mep0.m6391e1(this.f8953E, x2c0.nt);
        }
        if (a.p(((DbObject) user2).id)) {
            this.f8964J0 = false;
            xdl0.M0(this.f9002g, false);
            this.f8991X.setText(R.string.O4);
            this.f8993Y.setCompoundDrawables(null, null, null, null);
            this.f8993Y.setCompoundDrawablePadding(t100.d(0.0f));
            this.f8993Y.setText(R.string.P4);
            this.f8953E.setHint(R.string.R4);
            this.f9003h.setText(R.string.S4);
            xdl0.M0(this.f9006k, false);
            this.f9012p.setTranslationX(-t100.d(this.f8980R0 * 95.0f));
        }
        m9121O1(user2, i, arrayList);
        if (upa.j2()) {
            m9134X1(user2);
            xdl0.M(this.f8957G, true);
            o6j0.h("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("emoji_quantity", 4)});
        }
        if (upa.r1() && i == 44) {
            this.f9003h.setText("重逢配对");
            this.f9004i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
            xdl0.V(this.f9004i, t100.d(32.0f));
            xdl0.W(this.f9004i, t100.d(32.0f));
        }
        if (this.f8964J0) {
            this.f9006k.setTranslationX(t100.d(30.0f));
            this.f9012p.setTranslationX(-t100.d(30.0f));
        }
        if (jjb0.b() && !CertificationUtil.l() && user2.isPicVerificationVerified()) {
            z = true;
        }
        this.f8968L0 = z;
        if (z) {
            xdl0.X(this.f8952D, t100.d(this.f8978Q0 * 64.0f));
            xdl0.E0(this.f8949A, new View.OnClickListener() { // from class: l.a9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2096a.m9115H1(user2, view);
                }
            });
            xdl0.M(this.f8949A, true);
            zvf0.A("e_successful_match_view_verification", "p_successful_match_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) user2).id)});
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m9131V0(boolean z) {
        Animator animatorJ;
        int i = this.f8984T0;
        if (i > 0) {
            LinearLayout linearLayout = this.f8952D;
            if (z) {
                xdl0.X(linearLayout, this.f8982S0);
                if (upa.f2()) {
                    xdl0.M0(this.f9021x, false);
                }
            } else {
                xdl0.X(linearLayout, i);
                if (upa.f2()) {
                    xdl0.M0(this.f9021x, true);
                }
            }
        }
        Integer num = (Integer) Act.savedKeyboardHeight.get();
        int bottom = t100.c().heightPixels - this.f8952D.getBottom();
        if (this.f8960H0 + bottom < num.intValue() + t100.d(this.f8978Q0 * 50.0f)) {
            this.f8960H0 = (num.intValue() - bottom) + t100.d(this.f8978Q0 * 50.0f);
        }
        this.f8958G0 = z;
        int measuredWidth = this.f9006k.getMeasuredWidth();
        bt0.z(new Animator[]{m9153k2(-1, HttpStatus.MULTIPLE_CHOICES_300, z ? 0 : -t100.d(this.f8978Q0 * 40.0f), z ? -t100.d(this.f8978Q0 * 40.0f) : 0), m9129U0(HttpStatus.MULTIPLE_CHOICES_300, z ? 1 : 0, !z ? 1 : 0)}).start();
        AppCompatImageView appCompatImageView = this.f9010n;
        if (z) {
            Property property = View.ALPHA;
            bt0.l(appCompatImageView, property, 0L, 300L, new DecelerateInterpolator(), new float[]{1.0f, 0.0f}).start();
            bt0.l(this.f9015r, property, 0L, 300L, new DecelerateInterpolator(), new float[]{1.0f, 0.0f}).start();
        } else {
            Property property2 = View.ALPHA;
            bt0.l(appCompatImageView, property2, 0L, 300L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}).start();
            bt0.l(this.f9015r, property2, 0L, 300L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}).start();
        }
        VRelative vRelative = this.f9006k;
        Property property3 = View.TRANSLATION_X;
        Animator animatorN = bt0.n(vRelative, property3, new float[]{z ? t100.d(34.0f) : measuredWidth / 2, z ? measuredWidth / 2 : t100.d(34.0f)});
        VRelative vRelative2 = this.f9006k;
        Property property4 = View.TRANSLATION_Y;
        Animator animatorN2 = bt0.n(vRelative2, property4, new float[]{z ? 0.0f : -(this.f8960H0 - t100.d(this.f8978Q0 * 20.0f)), z ? -(this.f8960H0 - t100.d(this.f8978Q0 * 20.0f)) : 0.0f});
        Animator animatorN3 = bt0.n(this.f9012p, property4, new float[]{z ? 0.0f : -(this.f8960H0 - t100.d(this.f8978Q0 * 20.0f)), z ? -(this.f8960H0 - t100.d(this.f8978Q0 * 20.0f)) : 0.0f});
        Animator animatorN4 = bt0.n(this.f9012p, View.SCALE_X, new float[]{z ? 1.0f : 1.01f, z ? 1.01f : 1.0f});
        Animator animatorN5 = bt0.n(this.f9012p, View.SCALE_Y, new float[]{z ? 1.0f : 1.01f, z ? 1.01f : 1.0f});
        Animator animatorN6 = bt0.n(this.f8952D, property4, new float[]{z ? 0.0f : -this.f8960H0, z ? -this.f8960H0 : 0.0f});
        Animator animatorJ2 = bt0.j(0);
        if (this.f8964J0) {
            animatorJ = bt0.n(this.f9012p, property3, new float[]{z ? -t100.d(34.0f) : (-measuredWidth) / 2, z ? (-measuredWidth) / 2 : -t100.d(34.0f)});
        } else {
            animatorJ = bt0.j(0);
        }
        Animator animatorZ = bt0.z((Animator[]) Arrays.asList(animatorN, animatorN2, animatorN3, animatorN4, animatorN5, animatorN6, animatorJ2, animatorJ).toArray(new Animator[0]));
        animatorZ.setInterpolator(new DecelerateInterpolator());
        animatorZ.setDuration(300L);
        animatorZ.addListener(new C0659e(z));
        animatorZ.start();
    }

    /* JADX INFO: renamed from: V1 */
    public final void m9132V1() {
        if (this.f9007k0.m9005r1() == 50 || this.f9007k0.m9005r1() == 51) {
            xdl0.M(this.f8999d, false);
            xdl0.M(this.f9000e, false);
            SVGALoader.with(act()).from("https://auto.tancdn.com/v1/raw/7036ab37-664e-486d-a3b1-3162a0f94c9214.svga").autoPlay(true).repeatCount(1).into(this.f8997b);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.z8x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9277a.m9116I1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.start();
        SVGALoader.with(act()).from("https://auto.tancdn.com/v1/raw/45411073-a242-4383-adb6-d088856a7c6a10.so").autoPlay(true).repeatCount(1).into(this.f8997b);
        this.f9000e.d(new String[]{"animations/match_heart_success/config.xml", "animations/match_heart_success/pic"});
    }

    /* JADX INFO: renamed from: X0 */
    public final void m9133X0(int i) {
        m9131V0(true);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m9134X1(User user) {
        CharSequence charSequenceM9141e1 = m9141e1(user);
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceM9141e1);
        AppCompatTextView appCompatTextView = this.f9005j;
        if (zIsEmpty) {
            xdl0.M(appCompatTextView, false);
        } else {
            appCompatTextView.setText(charSequenceM9141e1);
        }
    }

    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public void m9149i1(y8x y8xVar) {
        this.f9007k0 = y8xVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m9136Z0() {
        xdl0.M(this.f9010n, false);
        xdl0.M(this.f9015r, false);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m9137a1() {
        if (upa.f2()) {
            this.f8990W0.k("MatchIceBreakBubble");
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m9138b2(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = i; i3 <= i2; i3++) {
            String str2 = this.f8986U0.getItem(i3).tipId;
            if (!this.f8994Y0.contains(str2)) {
                if (i3 > i && sb2.length() > 0) {
                    sb.append(";");
                    sb2.append(";");
                }
                sb.append(this.f8986U0.getItem(i3).content);
                sb2.append(str2);
                this.f8994Y0.add(str2);
            }
        }
        if (sb2.length() > 0) {
            zvf0.A("e_breakice_content", act().pageId(), new j760[]{vwb.Y("status", str), vwb.Y("message_id", sb2.toString()), vwb.Y("chat_content", sb.toString())});
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m9139d1(String str, String str2, int i) {
        pxe.m6948c().m6959l(str2);
        tz00.h(act(), this.f8966K0, str, false, new RunnableC0656b());
        o6j0.c("e_match_emoji", "p_successful_match_view", new o6j0.a[]{o6j0.a.f("select_emoji", i)});
    }

    /* JADX INFO: renamed from: d2 */
    public final void m9140d2(TextView textView, String str, String str2, int i) {
        e51.H(act(), new RunnableC0658d(i, textView, str, str2), 350L);
    }

    public void destroy() {
        m9137a1();
    }

    /* JADX INFO: renamed from: e1 */
    public final String m9141e1(User user) {
        StringBuilder sb = new StringBuilder(user.description);
        if (TextUtils.isEmpty(sb.toString())) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(user.location.region.city);
                String strP = i0g0.p(user.location.distance, true);
                if (!TextUtils.isEmpty(strP)) {
                    sb.append("(");
                    sb.append(strP);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(i0g0.j0(user.profile.zodiac))) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(i0g0.j0(user.profile.zodiac));
                } else {
                    sb.append(" · ");
                    sb.append(i0g0.j0(user.profile.zodiac));
                }
            }
            if (user.age.intValue() > 0 && !user.isHideAgeFromSVip()) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(user.age);
                    sb.append("岁");
                } else {
                    sb.append(" · ");
                    sb.append(user.age);
                    sb.append("岁");
                }
            }
        }
        return ddj0.e(sb.toString());
    }

    /* JADX INFO: renamed from: e2 */
    public final void m9142e2() {
        this.f8965K.setText("[" + act().getString(R.string.lj) + "]");
        xdl0.E0(this.f8959H, new View.OnClickListener() { // from class: l.i9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4383a.m9117J1(view);
            }
        });
        this.f8973O.setText("[" + act().getString(R.string.kj) + "]");
        xdl0.E0(this.f8967L, new View.OnClickListener() { // from class: l.j9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4598a.m9118K1(view);
            }
        });
        this.f8981S.setText("[" + act().getString(R.string.h4) + "]");
        xdl0.E0(this.f8975P, new View.OnClickListener() { // from class: l.l9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5235a.m9119L1(view);
            }
        });
        this.f8989W.setText("[" + act().getString(R.string.g4) + "]");
        xdl0.E0(this.f8983T, new View.OnClickListener() { // from class: l.m9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5570a.m9120M1(view);
            }
        });
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        m9132V1();
        return this.f8964J0 ? bt0.z(new Animator[]{m9124R1(), m9122P1(this.f9007k0.m9005r1())}) : bt0.z(new Animator[]{m9122P1(this.f9007k0.m9005r1())});
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return bt0.j(1);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m9143f1() {
        xdl0.M(this.f9010n, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m9144f2() {
        this.f8953E.clearFocus();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m9145g1() {
        xdl0.M(this.f9015r, false);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m9146g2(TextView textView, String str, String str2) {
        String str3;
        String str4;
        if (str.contains("%s")) {
            int iIndexOf = str.indexOf("%s");
            String str5 = "  " + str2 + "  ";
            int length = str5.length();
            SpannableString spannableString = new SpannableString(String.format(str, str5));
            spannableString.setSpan(new StyleSpan(1), iIndexOf, length + iIndexOf, 33);
            textView.setText(spannableString);
            if (textView.getLineCount() <= 2) {
                return;
            }
            int lineEnd = (textView.getLayout().getLineEnd(1) - str.length()) - 3;
            if (lineEnd < 0) {
                str3 = " " + str2 + "... ";
                str4 = String.format(str, str3);
            } else {
                str3 = " " + str2.substring(0, lineEnd) + "... ";
                str4 = String.format(str, str3);
            }
            SpannableString spannableString2 = new SpannableString(str4);
            spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
            textView.setText(spannableString2);
        }
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
        int i3 = this.f8954E0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f9013p0) {
                m9133X0(i);
            }
            this.f9013p0 = true;
        } else if (i - i3 < 0) {
            if (this.f9013p0) {
                m9049W0();
            }
            this.f9013p0 = false;
        }
        this.f8954E0 = i;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m9147h1(int i) {
        if (i == 12 || i == 11 || (i == 13 && vdj.c())) {
            if (i == 12) {
                m9054Z1();
                m9145g1();
                return;
            } else if (i == 11) {
                m9052Y1();
                m9143f1();
                return;
            } else {
                if (i == 13) {
                    m9052Y1();
                    m9054Z1();
                    return;
                }
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            m9136Z0();
            return;
        }
        if (i == 38) {
            xdl0.M(this.f9010n, true);
            xdl0.M(this.f9015r, false);
            this.f9010n.setImageDrawable(e16.e(act(), x2c0.be));
        } else if (i == 37) {
            xdl0.M(this.f9010n, false);
            xdl0.M(this.f9015r, true);
            this.f9015r.setImageDrawable(e16.e(act(), x2c0.be));
        } else if (i == 39) {
            xdl0.M(this.f9010n, true);
            xdl0.M(this.f9015r, true);
            this.f9010n.setImageDrawable(e16.e(act(), x2c0.be));
            this.f9015r.setImageDrawable(e16.e(act(), x2c0.be));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m9148h2(TextView textView, String str, String str2) {
        String str3;
        String str4;
        if (str == null || textView == null || !str.contains("%s")) {
            return;
        }
        int iIndexOf = str.indexOf("%s");
        String str5 = " " + str2 + " ";
        int length = str5.length();
        SpannableString spannableString = new SpannableString(String.format(str, str5));
        spannableString.setSpan(new StyleSpan(1), iIndexOf, length + iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), iIndexOf, str5.length() + iIndexOf, 33);
        textView.setText(spannableString);
        if (textView.getLineCount() <= 2) {
            return;
        }
        int lineEnd = (textView.getLayout().getLineEnd(1) - str.length()) - 3;
        if (lineEnd < 0) {
            str3 = " " + str2 + "... ";
            str4 = String.format(str, str3);
        } else {
            str3 = " " + str2.substring(0, lineEnd) + "... ";
            str4 = String.format(str, str3);
        }
        SpannableString spannableString2 = new SpannableString(str4);
        spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), iIndexOf, str3.length() + iIndexOf, 33);
        textView.setText(spannableString2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9125S0(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: j1 */
    public void m9151j1(boolean z, final int i) {
        this.f8978Q0 = ikf0.m5152i(xdl0.w0()) / this.f8962I0;
        if (ikf0.m5152i(xdl0.y0()) < 360.0f) {
            this.f8980R0 = ikf0.m5152i(xdl0.y0()) / 375.0f;
        } else {
            this.f8980R0 = this.f8978Q0;
        }
        this.f8960H0 = t100.d(this.f8978Q0 * 130.0f);
        xdl0.X(this.f9002g, t100.d(this.f8978Q0 * 73.0f));
        xdl0.X(this.f9003h, t100.d(this.f8978Q0 * 31.0f));
        xdl0.X(this.f9004i, t100.d(this.f8978Q0 * 5.0f));
        xdl0.X(this.f9006k, t100.d(this.f8978Q0 * 181.0f));
        xdl0.X(this.f9012p, t100.d(this.f8978Q0 * 181.0f));
        xdl0.C0(this.f9006k, t100.d(this.f8980R0 * 200.0f));
        xdl0.D0(t100.d(this.f8980R0 * 190.0f), new View[]{this.f9006k});
        xdl0.C0(this.f9008l, t100.d(this.f8980R0 * 190.0f));
        xdl0.D0(t100.d(this.f8980R0 * 190.0f), new View[]{this.f9008l});
        xdl0.C0(this.f9012p, t100.d(this.f8980R0 * 200.0f));
        xdl0.D0(t100.d(this.f8980R0 * 190.0f), new View[]{this.f9012p});
        xdl0.C0(this.f9014q, t100.d(this.f8980R0 * 190.0f));
        xdl0.D0(t100.d(this.f8980R0 * 190.0f), new View[]{this.f9014q});
        xdl0.C0(this.f9010n, t100.d(this.f8980R0 * 30.0f));
        xdl0.D0(t100.d(this.f8980R0 * 30.0f), new View[]{this.f9010n});
        xdl0.C0(this.f9015r, t100.d(this.f8980R0 * 30.0f));
        xdl0.D0(t100.d(this.f8980R0 * 30.0f), new View[]{this.f9015r});
        xdl0.C0(this.f8952D, t100.d(this.f8978Q0 * 64.0f));
        xdl0.C0(this.f8955F, t100.d(this.f8978Q0 * 48.0f));
        xdl0.X(this.f8991X, t100.d(this.f8978Q0 * 25.0f));
        xdl0.X(this.f8993Y, t100.d(this.f8978Q0 * 14.0f));
        this.f9002g.setText(act().getString(R.string.yp));
        this.f9002g.setTextSize(this.f8978Q0 * 18.0f);
        this.f9003h.setText(act().getString(R.string.xp));
        this.f9003h.setTextSize(this.f8978Q0 * 34.0f);
        this.f9004i.setTextSize(this.f8978Q0 * 18.0f);
        this.f8953E.setTextSize(this.f8978Q0 * 18.0f);
        this.f8955F.setTextSize(this.f8978Q0 * 16.0f);
        this.f8991X.setTextSize(this.f8978Q0 * 16.0f);
        this.f8993Y.setTextSize(this.f8978Q0 * 16.0f);
        this.f8955F.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f8993Y, this.f8972N0);
        xdl0.E0(this.f8991X, this.f8970M0);
        xdl0.E0(this.f8955F, this.f8974O0);
        xdl0.E0(this.f8996a, new View.OnClickListener() { // from class: l.c9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2597a.m9081m1(view);
            }
        });
        m9154l1();
        m9152k1();
        m9147h1(i);
        if (!IntlCountryCodeController.v() && z) {
            m9057a2();
        }
        if (i == 40 || i == 41) {
            xdl0.M(this.f8952D, false);
            xdl0.M(this.f8991X, false);
            xdl0.M(this.f8993Y, false);
            xdl0.M(this.f9022y, true);
            xdl0.M(this.f9023z, true);
            this.f9002g.setText("Congratulations！");
            xdl0.C0(this.f9022y, t100.d(this.f8978Q0 * 56.0f));
            this.f9022y.setTextSize(this.f8978Q0 * 16.0f);
            xdl0.C0(this.f9023z, t100.d(this.f8978Q0 * 56.0f));
            this.f9023z.setTextSize(this.f8978Q0 * 16.0f);
            this.f9022y.setOnClickListener(new View.OnClickListener() { // from class: l.d9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2919a.m9155n1(i, view);
                }
            });
            this.f9023z.setOnClickListener(new View.OnClickListener() { // from class: l.e9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3227a.m9156o1(i, view);
                }
            });
        }
        if (upa.j2()) {
            xdl0.M(this.f9002g, false);
            xdl0.M(this.f9005j, true);
            this.f9003h.setTextSize(this.f8978Q0 * 32.0f);
            this.f9003h.setTextColor(Color.parseColor("#CC000000"));
            this.f9003h.setTypeface(Typeface.defaultFromStyle(1));
            this.f9004i.setTextSize(this.f8978Q0 * 18.0f);
            this.f9004i.setTextColor(Color.parseColor("#66000000"));
            this.f9005j.setTextSize(this.f8978Q0 * 16.0f);
            this.f8993Y.setTypeface(Typeface.defaultFromStyle(1));
            this.f9001f.setTextSize(this.f8978Q0 * 18.0f);
            this.f9001f.setTypeface(Typeface.defaultFromStyle(1));
            this.f8955F.setTextColor(Color.parseColor("#33000000"));
            this.f8953E.setTextSize(this.f8978Q0 * 16.0f);
            xdl0.C0(this.f8952D, t100.d(this.f8978Q0 * 56.0f));
            xdl0.X(this.f9003h, t100.d(this.f8978Q0 * 59.0f));
            xdl0.X(this.f9004i, t100.d(this.f8978Q0 * 24.0f));
            xdl0.X(this.f9005j, t100.d(this.f8978Q0 * 5.0f));
            xdl0.X(this.f8991X, t100.d(this.f8978Q0 * 20.0f));
            xdl0.X(this.f9006k, t100.d(this.f8978Q0 * 228.0f));
            xdl0.X(this.f9012p, t100.d(this.f8978Q0 * 228.0f));
            xdl0.X(this.f8952D, t100.d(this.f8978Q0 * 40.0f));
            xdl0.X(this.f9001f, t100.d(this.f8978Q0 * 47.0f));
            m9142e2();
            o6j0.h("e_matched_send_message", "p_successful_match_view", new o6j0.a[0]);
            o6j0.h("e_matched_text_box", "p_successful_match_view", new o6j0.a[0]);
            o6j0.h("e_matched_later", "p_successful_match_view", new o6j0.a[0]);
        } else {
            xdl0.M(this.f9005j, false);
            xdl0.M(this.f8957G, false);
            xdl0.M(this.f9001f, false);
        }
        xdl0.X(this.f8949A, t100.d(this.f8978Q0 * 28.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m9152k1() {
        xdl0.E0(this.f8953E, new View.OnClickListener() { // from class: l.n9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5852a.m9157p1(view);
            }
        });
        this.f8953E.addTextChangedListener(new C0660f());
        this.f8953E.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.o9x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f6073a.m9158q1(textView, i, keyEvent);
            }
        });
        this.f8953E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.p9x
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f6336a.m9159r1(view, z);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final Animator m9153k2(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        Animator animatorL = i == 40 ? bt0.l(this.f9022y, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, new float[]{i3, i4}) : bt0.l(this.f8952D, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, new float[]{i3, i4});
        if (upa.j2()) {
            TextView textView = this.f9004i;
            Property property = View.TRANSLATION_Y;
            long j = i2;
            float f = i3;
            float f2 = i4;
            return bt0.z(new Animator[]{bt0.l(textView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f9005j, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), animatorL});
        }
        AppCompatTextView appCompatTextView = this.f9003h;
        Property property2 = View.TRANSLATION_Y;
        long j2 = i2;
        float f3 = i3;
        float f4 = i4;
        return bt0.z(new Animator[]{bt0.l(appCompatTextView, property2, 0L, j2, decelerateInterpolator, new float[]{f3, f4}), bt0.l(this.f9004i, property2, 0L, j2, decelerateInterpolator, new float[]{f3, f4}), animatorL});
    }

    /* JADX INFO: renamed from: l1 */
    public final void m9154l1() {
        if (this.f8976P0 == null) {
            this.f8976P0 = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.h9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4160a.m9160s1();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m9155n1(int i, View view) {
        y8x y8xVar = this.f9007k0;
        if (i == 41) {
            y8xVar.m9001g2(false);
        } else {
            y8xVar.m9002h2(false);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m9156o1(int i, View view) {
        act().finish();
        if (i == 40) {
            lsi0.y(String.format(act().getResources().getString(com.p1.mobile.putong.core.member.R.string.F0), new Object[0]));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m9157p1(View view) {
        zvf0.r("e_matched_text_box", act().pageId());
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ boolean m9158q1(TextView textView, int i, KeyEvent keyEvent) {
        if (!((Boolean) rs4.e.get()).booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f8953E.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f8974O0.onClick(this.f8955F);
        }
        return true;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m9159r1(View view, boolean z) {
        if (z) {
            zvf0.r("e_matched_text_box", act().pageId());
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m9160s1() {
        this.f8976P0.h();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m9161w1(int[] iArr) {
        m9138b2(0, this.f8988V0.findLastVisibleItemPosition(), "init");
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m9162y1(Long l2) {
        this.f8990W0.u(new com.p1.mobile.android.ui.bubble.a(act()).D("左滑可以选择更多内容哦～").k(new int[]{e16.c(act(), w0c0.I)}).G(w0c0.N).t(true).J(14.0f).e(false).E(false).x(-t100.c).b(5000L).q(jtk.D | jtk.E), this.f9021x, "MatchIceBreakBubble");
        tpd0 tpd0Var = this.f8992X0;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m9163z1() {
        C0038a.m652w().m683z(act(), this.f8966K0);
        CoreModule.c.P1.R.onNext(roj0.a);
        act().finish();
    }

    /* JADX INFO: renamed from: i2 */
    public void m9150i2() {
    }

    @Override // p003l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.y9x$e */
    public class C0659e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f9032a;

        public C0659e(boolean z) {
            this.f9032a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f9032a && y9x.this.f8968L0) {
                xdl0.M(y9x.this.f8949A, true);
            }
            boolean zJ2 = upa.j2();
            boolean z = this.f9032a;
            if (zJ2) {
                y9x y9xVar = y9x.this;
                if (z) {
                    xdl0.M0(y9xVar.f9003h, false);
                    xdl0.M(y9x.this.f9001f, true);
                    return;
                } else {
                    xdl0.M0(y9xVar.f9003h, true);
                    xdl0.M(y9x.this.f9001f, false);
                    return;
                }
            }
            y9x y9xVar2 = y9x.this;
            if (z) {
                xdl0.M0(y9xVar2.f9002g, true);
                y9x.this.f9002g.setText(y9x.this.act().getString(R.string.V0));
            } else {
                xdl0.M0(y9xVar2.f9002g, y9x.this.f8964J0);
                y9x.this.f9002g.setText(y9x.this.act().getString(R.string.yp));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f9032a) {
                xdl0.M(y9x.this.f8949A, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.y9x$f */
    public class C0660f implements TextWatcher {
        public C0660f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (upa.j2()) {
                y9x.this.f8955F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            if (y9x.this.f9007k0.m9005r1() == 51) {
                y9x.this.f8955F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#7439B3"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            y9x y9xVar = y9x.this;
            if (zIsEmpty) {
                xdl0.M0(y9xVar.f8955F, false);
            } else {
                xdl0.M0(y9xVar.f8955F, true);
            }
            y9x.this.f8955F.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
