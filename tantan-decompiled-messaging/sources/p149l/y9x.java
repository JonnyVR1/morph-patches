package p149l;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core.view.HeartView;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sunshine.engine.bone.StageView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.spongycastle.crypto.tls.CipherSuite;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class y9x implements yvl<y8x> {

    /* JADX INFO: renamed from: A */
    public VLinear f197001A;

    /* JADX INFO: renamed from: B */
    public VText f197002B;

    /* JADX INFO: renamed from: C */
    public VImage f197003C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f197004D;

    /* JADX INFO: renamed from: E */
    public VEditText f197005E;

    /* JADX INFO: renamed from: E0 */
    public int f197006E0;

    /* JADX INFO: renamed from: F */
    public VText f197007F;

    /* JADX INFO: renamed from: F0 */
    public Animator f197008F0;

    /* JADX INFO: renamed from: G */
    public VLinear f197009G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f197011H;

    /* JADX INFO: renamed from: H0 */
    public int f197012H0;

    /* JADX INFO: renamed from: I */
    public SVGAnimationView f197013I;

    /* JADX INFO: renamed from: J */
    public ImageView f197015J;

    /* JADX INFO: renamed from: K */
    public VText f197017K;

    /* JADX INFO: renamed from: L */
    public FrameLayout f197019L;

    /* JADX INFO: renamed from: L0 */
    public boolean f197020L0;

    /* JADX INFO: renamed from: M */
    public SVGAnimationView f197021M;

    /* JADX INFO: renamed from: N */
    public ImageView f197023N;

    /* JADX INFO: renamed from: O */
    public VText f197025O;

    /* JADX INFO: renamed from: P */
    public FrameLayout f197027P;

    /* JADX INFO: renamed from: P0 */
    public fyq f197028P0;

    /* JADX INFO: renamed from: Q */
    public SVGAnimationView f197029Q;

    /* JADX INFO: renamed from: R */
    public ImageView f197031R;

    /* JADX INFO: renamed from: S */
    public VText f197033S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f197035T;

    /* JADX INFO: renamed from: T0 */
    public int f197036T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f197037U;

    /* JADX INFO: renamed from: U0 */
    public C21344g f197038U0;

    /* JADX INFO: renamed from: V */
    public ImageView f197039V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayoutManager f197040V0;

    /* JADX INFO: renamed from: W */
    public VText f197041W;

    /* JADX INFO: renamed from: X */
    public VButton_FakeShadow f197043X;

    /* JADX INFO: renamed from: Y */
    public VButton f197045Y;

    /* JADX INFO: renamed from: Z */
    public MatchAct f197047Z;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f197048a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f197049b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f197050c;

    /* JADX INFO: renamed from: d */
    public HeartView f197051d;

    /* JADX INFO: renamed from: e */
    public StageView f197052e;

    /* JADX INFO: renamed from: f */
    public VText f197053f;

    /* JADX INFO: renamed from: g */
    public TextView f197054g;

    /* JADX INFO: renamed from: h */
    public VText f197055h;

    /* JADX INFO: renamed from: i */
    public TextView f197056i;

    /* JADX INFO: renamed from: j */
    public VText f197057j;

    /* JADX INFO: renamed from: k */
    public VRelative f197058k;

    /* JADX INFO: renamed from: k0 */
    public y8x f197059k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f197060l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f197061m;

    /* JADX INFO: renamed from: n */
    public VImage f197062n;

    /* JADX INFO: renamed from: o */
    public Guideline f197063o;

    /* JADX INFO: renamed from: p */
    public VRelative f197064p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f197066q;

    /* JADX INFO: renamed from: r */
    public VImage f197067r;

    /* JADX INFO: renamed from: s */
    public VFrame f197068s;

    /* JADX INFO: renamed from: t */
    public VIcon f197069t;

    /* JADX INFO: renamed from: u */
    public VIcon f197070u;

    /* JADX INFO: renamed from: v */
    public View f197071v;

    /* JADX INFO: renamed from: w */
    public VImage f197072w;

    /* JADX INFO: renamed from: x */
    public VRecyclerView f197073x;

    /* JADX INFO: renamed from: y */
    public TextView f197074y;

    /* JADX INFO: renamed from: z */
    public TextView f197075z;

    /* JADX INFO: renamed from: p0 */
    public boolean f197065p0 = false;

    /* JADX INFO: renamed from: G0 */
    public boolean f197010G0 = false;

    /* JADX INFO: renamed from: I0 */
    public float f197014I0 = 811.0f;

    /* JADX INFO: renamed from: J0 */
    public boolean f197016J0 = true;

    /* JADX INFO: renamed from: K0 */
    public User f197018K0 = null;

    /* JADX INFO: renamed from: M0 */
    public View.OnClickListener f197022M0 = new View.OnClickListener() { // from class: l.k9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f122078a.m213634t1(view);
        }
    };

    /* JADX INFO: renamed from: N0 */
    public View.OnClickListener f197024N0 = new View.OnClickListener() { // from class: l.q9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f153487a.m213637u1(view);
        }
    };

    /* JADX INFO: renamed from: O0 */
    public View.OnClickListener f197026O0 = new View.OnClickListener() { // from class: l.r9x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f158458a.m213640v1(view);
        }
    };

    /* JADX INFO: renamed from: Q0 */
    public float f197030Q0 = 1.0f;

    /* JADX INFO: renamed from: R0 */
    public float f197032R0 = 1.0f;

    /* JADX INFO: renamed from: S0 */
    public int f197034S0 = t100.m186890d(1.0f * 51.0f);

    /* JADX INFO: renamed from: W0 */
    public C4348d f197042W0 = C4348d.m20896l();

    /* JADX INFO: renamed from: X0 */
    public tpd0 f197044X0 = new tpd0("core_match_ice_break_guide_shown_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: Y0 */
    public Set<String> f197046Y0 = new HashSet();

    /* JADX INFO: renamed from: l.y9x$a */
    public class RunnableC21338a implements Runnable {
        public RunnableC21338a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y9x.this.getAct() == null) {
                return;
            }
            y9x.this.getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: l.y9x$b */
    public class RunnableC21339b implements Runnable {
        public RunnableC21339b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y9x.this.getAct() == null) {
                return;
            }
            y9x.this.getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: l.y9x$c */
    public class C21340c extends RecyclerView.AbstractC0582t {
        public C21340c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                y9x.this.m213678b2(y9x.this.f197040V0.findFirstVisibleItemPosition(), y9x.this.f197040V0.findLastVisibleItemPosition(), "swipe");
            }
        }
    }

    /* JADX INFO: renamed from: l.y9x$d */
    public class RunnableC21341d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f197079a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f197080b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f197081c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f197082d;

        public RunnableC21341d(int i, TextView textView, String str, String str2) {
            this.f197079a = i;
            this.f197080b = textView;
            this.f197081c = str;
            this.f197082d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (upa.m194809r1() && this.f197079a == 44) {
                y9x.this.f197055h.setText("重逢配对");
                y9x.this.f197056i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
                xdl0.m208358V(y9x.this.f197056i, t100.m186890d(32.0f));
                xdl0.m208359W(y9x.this.f197056i, t100.m186890d(32.0f));
                y9x.this.f197056i.setTextColor(Color.parseColor("#66E8CA8A"));
                return;
            }
            boolean zM194770j2 = upa.m194770j2();
            y9x y9xVar = y9x.this;
            if (zM194770j2) {
                y9xVar.m213688h2(this.f197080b, this.f197081c, this.f197082d);
            } else {
                y9xVar.m213686g2(this.f197080b, this.f197081c, this.f197082d);
            }
        }
    }

    /* JADX INFO: renamed from: l.y9x$g */
    public class C21344g extends dac0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public List<BreakIce> f197087c;

        public C21344g() {
            this.f197087c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m213704H(BreakIce breakIce, View view) {
            zvf0.m220399u("e_breakice_content", y9x.this.getAct().pageId(), vwb.m200311Y("actor_user_id", CoreModule.m29931H().userId()), vwb.m200311Y(Constants.MessagePayloadKeys.MSGID_SERVER, breakIce.tipId), vwb.m200311Y("chat_content", breakIce.content));
            y9x.this.f197059k0.m213501a2(breakIce, y9x.this.f197059k0.m148671o0());
            CoreModule.f17545c.f19639e0.m169401I9(y9x.this.f197059k0.m148671o0(), breakIce.tipId);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f197087c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(y9x.this.getContext()).inflate(f6c0.f95826i7, (ViewGroup) null, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final BreakIce breakIce, int i, int i2) {
            TextView textView = (TextView) view.findViewById(u4c0.f173985Pd);
            textView.setText(breakIce.content);
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.z9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f202315a.m213704H(breakIce, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f197087c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m213707I(List<BreakIce> list) {
            if (vwb.m200296J(list)) {
                return;
            }
            this.f197087c.clear();
            this.f197087c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.y9x$h */
    public static class C21345h {
        /* JADX INFO: renamed from: b */
        public static void m213709b(y9x y9xVar, View view) {
            y9xVar.f197048a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            y9xVar.f197049b = (SVGAnimationView) viewGroup.getChildAt(0);
            y9xVar.f197050c = (ConstraintLayout) viewGroup.getChildAt(1);
            y9xVar.f197051d = (HeartView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            y9xVar.f197052e = (StageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            y9xVar.f197053f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            y9xVar.f197054g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
            y9xVar.f197055h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
            y9xVar.f197056i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
            y9xVar.f197057j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
            y9xVar.f197058k = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
            y9xVar.f197060l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(0);
            y9xVar.f197061m = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(1);
            y9xVar.f197062n = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7)).getChildAt(2);
            y9xVar.f197063o = (Guideline) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
            y9xVar.f197064p = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
            y9xVar.f197066q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(0);
            y9xVar.f197067r = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(1);
            y9xVar.f197068s = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2);
            y9xVar.f197069t = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(0);
            y9xVar.f197070u = (VIcon) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(2)).getChildAt(1);
            y9xVar.f197071v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(3);
            y9xVar.f197072w = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9)).getChildAt(4);
            y9xVar.f197073x = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
            y9xVar.f197074y = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
            y9xVar.f197075z = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
            y9xVar.f197001A = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
            y9xVar.f197002B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(0);
            y9xVar.f197003C = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13)).getChildAt(1);
            y9xVar.f197004D = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
            y9xVar.f197005E = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
            y9xVar.f197007F = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(1);
            y9xVar.f197009G = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
            y9xVar.f197011H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0);
            y9xVar.f197013I = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(0);
            y9xVar.f197015J = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(1);
            y9xVar.f197017K = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(0)).getChildAt(2);
            y9xVar.f197019L = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2);
            y9xVar.f197021M = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(0);
            y9xVar.f197023N = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(1);
            y9xVar.f197025O = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(2)).getChildAt(2);
            y9xVar.f197027P = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4);
            y9xVar.f197029Q = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(0);
            y9xVar.f197031R = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(1);
            y9xVar.f197033S = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(4)).getChildAt(2);
            y9xVar.f197035T = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6);
            y9xVar.f197037U = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(0);
            y9xVar.f197039V = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(1);
            y9xVar.f197041W = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15)).getChildAt(6)).getChildAt(2);
            y9xVar.f197043X = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
            y9xVar.f197045Y = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        }

        /* JADX INFO: renamed from: c */
        public static View m213710c(y9x y9xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95859k7, viewGroup, false);
            m213709b(y9xVar, viewInflate);
            return viewInflate;
        }
    }

    public y9x(MatchAct matchAct) {
        this.f197047Z = matchAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m213590W0() {
        m213671V0(false);
    }

    /* JADX INFO: renamed from: Y1 */
    private void m213593Y1() {
        xdl0.m208344M(this.f197067r, true);
        boolean zM191827f0 = u59.m191827f0();
        VImage vImage = this.f197067r;
        if (zM191827f0) {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f189980ae));
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m213595Z1() {
        xdl0.m208344M(this.f197062n, true);
        boolean zM191827f0 = u59.m191827f0();
        VImage vImage = this.f197062n;
        if (zM191827f0) {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f189980ae));
        }
    }

    /* JADX INFO: renamed from: a2 */
    private void m213598a2() {
        getAct();
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f197059k0.m213512s1();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f15343a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f197059k0.m213512s1();
        } else {
            a5x.m95061a(activity, getAct(), 0);
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m213603c2() {
        int i;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Settings settings = userM169527p9.settings;
        boolean z = NullChecker.m81303a(userM169527p9) && NullChecker.m81303a(settings) && qib0.f154713b0.f139230a.mo28172rq(settings.getSettingGroup()) && NullChecker.m81303a(this.f197018K0) && NullChecker.m81303a(this.f197018K0.settings) && NullChecker.m81303a(this.f197018K0.settings.getSettingGroup().gender.newGender);
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                if (z) {
                    i = x2c0.f189510L9;
                    break;
                } else {
                    i = x2c0.f189758T9;
                    break;
                }
                break;
            case "ja":
                if (z) {
                    i = x2c0.f189541M9;
                    break;
                } else {
                    i = x2c0.f189789U9;
                    break;
                }
                break;
            case "ko":
                if (z) {
                    i = x2c0.f189572N9;
                    break;
                } else {
                    i = x2c0.f189820V9;
                    break;
                }
                break;
            case "th":
                if (z) {
                    i = x2c0.f189603O9;
                    break;
                } else {
                    i = x2c0.f189851W9;
                    break;
                }
                break;
            case "vi":
                if (z) {
                    i = x2c0.f189634P9;
                    break;
                } else {
                    i = x2c0.f189882X9;
                    break;
                }
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = !z ? x2c0.f189913Y9 : x2c0.f189665Q9;
                    break;
                } else {
                    if (!z) {
                        i = x2c0.f189944Z9;
                    } else {
                        i = x2c0.f189696R9;
                    }
                    break;
                }
                break;
            default:
                if (z) {
                    i = x2c0.f189479K9;
                    break;
                } else {
                    i = x2c0.f189727S9;
                    break;
                }
                break;
        }
        this.f197072w.setBackgroundResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m213622m1(View view) {
        getAct().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m213634t1(View view) {
        o6j0.m162859c("e_matched_later", "p_successful_match_view", o6j0.C18854a.m162878h("match_source", this.f197059k0.m148672p0(getAct().f30469e)));
        getAct().f30473i = true;
        this.f197059k0.m213500Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m213637u1(View view) {
        if (this.f197016J0) {
            zvf0.m220396r("e_matched_share", "p_successful_match_view");
            this.f197059k0.m213504d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m213640v1(View view) {
        o6j0.m162859c("e_matched_send_message", getAct().pageId(), new o6j0.C18854a[0]);
        String strTrim = this.f197005E.getText().toString().trim();
        if (upa.m194770j2()) {
            tz00.m191127i(getAct(), this.f197018K0, strTrim, true, new RunnableC21338a(), this.f197059k0.f196896i);
        } else {
            this.f197059k0.m213503c2(strTrim, this.f197065p0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m213649A1(View view) {
        o6j0.m162859c("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new o6j0.C18854a[0]);
        if (!xma.m210040C3()) {
            this.f197059k0.m213506f2(false);
        } else if (C8455a.m47588w().m47589A()) {
            C8455a.m47588w().m47598J(getAct(), this.f197018K0, new d30() { // from class: l.f9x
                @Override // p149l.d30
                public final void call() {
                    this.f96542a.m213702z1();
                }
            });
        } else {
            lsi0.m151568F(getAct(), getAct().getString(R$string.f18787o9));
            getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m213650B1(View view) {
        o6j0.m162859c("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new o6j0.C18854a[0]);
        getAct().m66873d2();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197047Z;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m213651C1(View view) {
        o6j0.m162859c("e_intl_match_sayhi", getAct().pageId(), new o6j0.C18854a[0]);
        this.f197059k0.m213505e2(false);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m213652E1(View view) {
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m213653F1(int i, View view) {
        if (i == 43) {
            this.f197059k0.m213510j2(false);
        } else {
            getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m213654G1(View view) {
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m213655H1(User user, View view) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
        } else if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
        } else {
            qp4.m175811q(getAct());
        }
        zvf0.m220399u("e_successful_match_view_verification", "p_successful_match_view", vwb.m200311Y("receiver_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m213656I1(ValueAnimator valueAnimator) {
        this.f197051d.setPercent(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m213657J1(View view) {
        m213679d1("[" + getAct().getString(R$string.f18704lj) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "NEW_EMOJI_HAHE", 1);
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m213658K1(View view) {
        m213679d1("[" + getAct().getString(R$string.f18673kj) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "NEW_EMOJI_BEER", 2);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m213659L1(View view) {
        m213679d1("[" + getAct().getString(R$string.f18567h4) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "EMOJI_70", 3);
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m213660M1(View view) {
        m213679d1("[" + getAct().getString(R$string.f18536g4) + com.clevertap.android.sdk.Constants.AES_SUFFIX, "EMOJI_63", 4);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m213661O1(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f197056i.setText(R$string.f18078R1);
        } else if (i == 12 || i == 11 || i == 13) {
            if (i == 12) {
                m213680d2(this.f197056i, getAct().getString(R$string.f18257X0), user.name, i);
            } else if (i == 13) {
                m213680d2(this.f197056i, getAct().getString(R$string.f17719F2), user.name, i);
            } else if (i == 11) {
                m213680d2(this.f197056i, getAct().getString(R$string.f18227W0), user.name, i);
            }
        } else if (i == 0 || i == 39 || i == 37 || i == 38 || i == 47 || i == 10) {
            m213680d2(this.f197056i, getAct().getString(R$string.f17854Jh), user.name, i);
        } else if (i == 1) {
            if (arrayList.size() > 0) {
                str = user.name + " (" + arrayList.get(0) + ")";
            } else {
                str = user.name;
            }
            m213680d2(this.f197056i, getAct().getString(R$string.f18981um), str, i);
        } else if (i == 26) {
            m213680d2(this.f197056i, getAct().getString(R$string.f17854Jh), user.name, i);
        }
        if (this.f197016J0) {
            return;
        }
        m213680d2(this.f197056i, getAct().getString(R$string.f18051Q4), user.name, i);
    }

    /* JADX INFO: renamed from: P1 */
    public final Animator m213662P1(int i) {
        return bt0.m103753z(m213692k2(i, 500, t100.m186890d(this.f197030Q0 * 40.0f), 0), m213669U0(500, 0, 1), bt0.m103739l(this.f197054g, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f197054g, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), t100.m186890d(40.0f), 0.0f));
    }

    /* JADX INFO: renamed from: Q1 */
    public void m213663Q1() {
        this.f197043X.setClickable(false);
    }

    /* JADX INFO: renamed from: R1 */
    public final Animator m213664R1() {
        this.f197058k.setTranslationX(-t100.m186890d(this.f197032R0 * 108.0f));
        this.f197064p.setTranslationX(t100.m186890d(this.f197032R0 * 108.0f));
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f197058k;
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vRelative, property, 200L, 700L, wqf0Var, (-t100.m186890d(108.0f)) * this.f197032R0, t100.m186890d(30.0f) * this.f197032R0);
        Animator animatorM103739l2 = bt0.m103739l(this.f197064p, property, 200L, 700L, wqf0Var, t100.m186890d(108.0f) * this.f197032R0, (-t100.m186890d(30.0f)) * this.f197032R0);
        VRelative vRelative2 = this.f197058k;
        Property property2 = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f197064p, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
        this.f197008F0 = animatorM103753z;
        return animatorM103753z;
    }

    /* JADX INFO: renamed from: S0 */
    public View m213665S0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21345h.m213710c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S1 */
    public void m213666S1(List<BreakIce> list) {
        xdl0.m208345M0(this.f197073x, true);
        this.f197040V0 = (LinearLayoutManager) this.f197073x.getLayoutManager();
        C21344g c21344g = new C21344g();
        this.f197038U0 = c21344g;
        this.f197073x.setAdapter(c21344g);
        this.f197038U0.m213707I(list);
        xdl0.m208353Q0(this.f197073x, new e30() { // from class: l.b9x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74636a.m213700w1((int[]) obj);
            }
        });
        this.f197073x.addOnScrollListener(new C21340c());
        int iM186890d = t100.m186890d(this.f197030Q0 * 100.0f);
        this.f197036T0 = iM186890d;
        xdl0.m208360X(this.f197004D, iM186890d);
        xdl0.m208357U(this.f197073x, t100.m186890d(this.f197030Q0 * 10.0f));
        m213668T1();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f197047Z;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m213668T1() {
        if (this.f197044X0.get().intValue() >= upa.m194751f3()) {
            return;
        }
        getAct().duringCreated(C22306c.timer(2L, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.g9x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101607a.m213701y1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m213669U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (upa.m194770j2()) {
            TextView textView = this.f197056i;
            Property property = View.ALPHA;
            long j = i;
            float f = i2;
            float f2 = i3;
            return bt0.m103753z(bt0.m103739l(textView, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f197057j, property, 0L, j, decelerateInterpolator, f, f2));
        }
        VText vText = this.f197055h;
        Property property2 = View.ALPHA;
        long j2 = i;
        float f3 = i2;
        float f4 = i3;
        return bt0.m103753z(bt0.m103739l(vText, property2, 0L, j2, decelerateInterpolator, f3, f4), bt0.m103739l(this.f197056i, property2, 0L, j2, decelerateInterpolator, f3, f4));
    }

    /* JADX INFO: renamed from: U1 */
    public void m213670U1(User user, final User user2, final int i, ArrayList<String> arrayList) {
        String str;
        if (user == null || user2 == null) {
            NullChecker.m81304b(user);
            NullChecker.m81304b(user2);
            getAct().m66873d2();
            return;
        }
        if (this.f197059k0.m213511r1() == 50 || this.f197059k0.m213511r1() == 51) {
            this.f197051d.m59536d("https://auto.tancdn.com/v1/images/eyJpZCI6IjU0SU1CU0ZaRktSNkJSTTY2UEpXUklTTkdNQlo2UzE0IiwidyI6MTUzNSwiaCI6MTM0MywiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjg2ODY1NzI1MzAwODg4OTEzOX0.png");
            this.f197051d.setBackgroundColor(Color.parseColor("#F3E1FF"));
        } else {
            this.f197051d.m59535c();
        }
        this.f197018K0 = user2;
        if (this.f197059k0.m213511r1() == 40) {
            qib0.f154691G.m102331L0(this.f197060l, user.m60124fp().profileBig().formatted());
            this.f197075z.setText(getAct().getResources().getText(user2.isFemale() ? R$string.f17824Ih : R$string.f17794Hh));
            qib0.f154691G.m102336O(this.f197066q, user2.m60124fp().profileBig().formatted(), 4, 30);
            return;
        }
        if (this.f197059k0.m213511r1() == 41) {
            qib0.f154691G.m102325I0(this.f197060l, user.m60124fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            if (sb90.m183207c(user2)) {
                qib0.f154691G.m102336O(this.f197066q, user2.m60124fp().profileBig().formatted(), 4, 30);
            } else {
                qib0.f154691G.m102325I0(this.f197066q, user2.m60124fp().profileMiddle().formatted(), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256);
            }
            this.f197056i.setText(String.format("开通黑金会员立即与%s聊天！", user2.isFemale() ? "她" : "他"));
            this.f197075z.setText(getAct().getResources().getText(user2.isFemale() ? R$string.f17824Ih : R$string.f17794Hh));
            return;
        }
        boolean z = false;
        if (this.f197059k0.m213511r1() == 50) {
            xdl0.m208344M(this.f197004D, false);
            xdl0.m208344M(this.f197043X, false);
            xdl0.m208344M(this.f197045Y, false);
            xdl0.m208344M(this.f197074y, true);
            xdl0.m208344M(this.f197075z, true);
            xdl0.m208344M(this.f197072w, true);
            xdl0.m208344M(this.f197054g, true);
            this.f197054g.setText(getAct().getString(R$string.f19104yp));
            this.f197055h.setText(getAct().getString(R$string.f18425cg));
            this.f197055h.setAutoSizeTextTypeWithDefaults(1);
            this.f197056i.setText(String.format(getAct().getString(R$string.f18394bg), user2.name));
            this.f197056i.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            rza.m181737Q0(this.f197056i, R$string.f18394bg);
            this.f197056i.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208325C0(this.f197074y, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197074y.setText(getAct().getString(R$string.f18332Zf));
            this.f197074y.setTextSize(this.f197030Q0 * 16.0f);
            this.f197074y.setBackgroundResource(x2c0.f190262jb);
            this.f197074y.setTextColor(Color.parseColor("#F9E7FF"));
            xdl0.m208325C0(this.f197075z, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197075z.setText(getAct().getString(R$string.f18363ag));
            this.f197075z.setTextSize(this.f197030Q0 * 16.0f);
            o6j0.m162864h("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new o6j0.C18854a[0]);
            o6j0.m162864h("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new o6j0.C18854a[0]);
            this.f197074y.setOnClickListener(new View.OnClickListener() { // from class: l.s9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163245a.m213649A1(view);
                }
            });
            this.f197075z.setOnClickListener(new View.OnClickListener() { // from class: l.t9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169079a.m213650B1(view);
                }
            });
            qib0.f154691G.m102327J0(this.f197060l, user.m60124fp().profileMiddle(), false);
            qib0.f154691G.m102327J0(this.f197066q, user2.m60124fp().profileMiddle(), false);
            return;
        }
        if (i == 48 || i == 49) {
            xdl0.m208344M(this.f197004D, false);
            xdl0.m208344M(this.f197043X, false);
            xdl0.m208344M(this.f197045Y, false);
            xdl0.m208344M(this.f197074y, true);
            xdl0.m208344M(this.f197075z, true);
            xdl0.m208344M(this.f197072w, true);
            xdl0.m208344M(this.f197054g, true);
            m213603c2();
            this.f197054g.setText(getAct().getString(R$string.f19104yp));
            this.f197055h.setText(getAct().getString(R$string.f17728Fb));
            this.f197055h.setAutoSizeTextTypeWithDefaults(1);
            this.f197056i.setText(getAct().getString(R$string.f18482ec));
            this.f197056i.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208325C0(this.f197074y, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197074y.setText(getAct().getString(R$string.f18421cc));
            this.f197074y.setTextSize(this.f197030Q0 * 16.0f);
            this.f197074y.setTextColor(Color.parseColor("#FF4B72"));
            xdl0.m208325C0(this.f197075z, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197075z.setText(getAct().getString(R$string.f18452dc));
            this.f197075z.setTextSize(this.f197030Q0 * 16.0f);
            this.f197074y.setOnClickListener(new View.OnClickListener() { // from class: l.u9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f175512a.m213651C1(view);
                }
            });
            this.f197075z.setOnClickListener(new View.OnClickListener() { // from class: l.v9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180681a.m213652E1(view);
                }
            });
            qib0.f154691G.m102327J0(this.f197060l, user.m60124fp().profileMiddle(), false);
            qib0.f154691G.m102327J0(this.f197066q, user2.m60124fp().profileMiddle(), false);
            return;
        }
        if (i == 42 || i == 43) {
            xdl0.m208344M(this.f197004D, false);
            xdl0.m208344M(this.f197043X, false);
            xdl0.m208344M(this.f197045Y, false);
            xdl0.m208344M(this.f197074y, true);
            xdl0.m208344M(this.f197075z, true);
            this.f197054g.setText("Congratulations！");
            this.f197055h.setText("互相喜欢");
            this.f197056i.setText(String.format("开通SVIP会员立即和%s聊天！", user2.isFemale() ? "她" : "他"));
            xdl0.m208325C0(this.f197074y, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197074y.setText(i == 43 ? "发消息" : "确定");
            this.f197074y.setTextSize(this.f197030Q0 * 16.0f);
            xdl0.m208325C0(this.f197075z, t100.m186890d(this.f197030Q0 * 56.0f));
            TextView textView = this.f197075z;
            if (i == 43) {
                str = String.format("放弃%s", user2.isFemale() ? "她" : "他");
            } else {
                str = "继续探索";
            }
            textView.setText(str);
            this.f197075z.setTextSize(this.f197030Q0 * 16.0f);
            this.f197074y.setOnClickListener(new View.OnClickListener() { // from class: l.w9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185410a.m213653F1(i, view);
                }
            });
            this.f197075z.setOnClickListener(new View.OnClickListener() { // from class: l.x9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191664a.m213654G1(view);
                }
            });
            qib0.f154691G.m102327J0(this.f197060l, user.m60124fp().profileMiddle(), false);
            qib0.f154691G.m102327J0(this.f197066q, user2.m60124fp().profileMiddle(), false);
            return;
        }
        if (i == 47) {
            this.f197054g.setText(getAct().getString(R$string.f19104yp));
            this.f197055h.setText(getAct().getString(R$string.f17728Fb));
            this.f197055h.setAutoSizeTextTypeWithDefaults(1);
            this.f197056i.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f197072w, true);
            m213603c2();
            qib0.f154691G.m102327J0(this.f197060l, user.m60124fp().profileMiddle(), false);
            qib0.f154691G.m102327J0(this.f197066q, user2.m60124fp().profileMiddle(), false);
        } else {
            qib0.f154691G.m102327J0(this.f197060l, user.m60124fp().profileMiddle(), false);
            qib0.f154691G.m102327J0(this.f197066q, user2.m60124fp().profileMiddle(), false);
        }
        if (i == 51) {
            this.f197056i.setText(getAct().getString(R$string.f18456dg, user2.name));
            this.f197056i.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            rza.m181737Q0(this.f197056i, R$string.f18456dg);
            this.f197007F.setTextColor(Color.parseColor("#33000000"));
            mep0.m154303e1(this.f197005E, x2c0.f190408nt);
        }
        if (C8140a.m41831p(user2.f56011id)) {
            this.f197016J0 = false;
            xdl0.m208345M0(this.f197054g, false);
            this.f197043X.setText(R$string.f17991O4);
            this.f197045Y.setCompoundDrawables(null, null, null, null);
            this.f197045Y.setCompoundDrawablePadding(t100.m186890d(0.0f));
            this.f197045Y.setText(R$string.f18021P4);
            this.f197005E.setHint(R$string.f18081R4);
            this.f197055h.setText(R$string.f18111S4);
            xdl0.m208345M0(this.f197058k, false);
            this.f197064p.setTranslationX(-t100.m186890d(this.f197032R0 * 95.0f));
        }
        m213661O1(user2, i, arrayList);
        if (upa.m194770j2()) {
            m213674X1(user2);
            xdl0.m208344M(this.f197009G, true);
            o6j0.m162864h("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("emoji_quantity", 4));
        }
        if (upa.m194809r1() && i == 44) {
            this.f197055h.setText("重逢配对");
            this.f197056i.setText("再次重逢你们依然互相喜欢，去聊聊吧");
            xdl0.m208358V(this.f197056i, t100.m186890d(32.0f));
            xdl0.m208359W(this.f197056i, t100.m186890d(32.0f));
        }
        if (this.f197016J0) {
            this.f197058k.setTranslationX(t100.m186890d(30.0f));
            this.f197064p.setTranslationX(-t100.m186890d(30.0f));
        }
        if (jjb0.m141784b() && !CertificationUtil.m58153l() && user2.isPicVerificationVerified()) {
            z = true;
        }
        this.f197020L0 = z;
        if (z) {
            xdl0.m208360X(this.f197004D, t100.m186890d(this.f197030Q0 * 64.0f));
            xdl0.m208329E0(this.f197001A, new View.OnClickListener() { // from class: l.a9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68215a.m213655H1(user2, view);
                }
            });
            xdl0.m208344M(this.f197001A, true);
            zvf0.m220368A("e_successful_match_view_verification", "p_successful_match_view", vwb.m200311Y("receiver_user_id", user2.f56011id));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m213671V0(boolean z) {
        Animator animatorM103737j;
        int i = this.f197036T0;
        if (i > 0) {
            LinearLayout linearLayout = this.f197004D;
            if (z) {
                xdl0.m208360X(linearLayout, this.f197034S0);
                if (upa.m194750f2()) {
                    xdl0.m208345M0(this.f197073x, false);
                }
            } else {
                xdl0.m208360X(linearLayout, i);
                if (upa.m194750f2()) {
                    xdl0.m208345M0(this.f197073x, true);
                }
            }
        }
        Integer num = Act.savedKeyboardHeight.get();
        int bottom = t100.m186889c().heightPixels - this.f197004D.getBottom();
        if (this.f197012H0 + bottom < num.intValue() + t100.m186890d(this.f197030Q0 * 50.0f)) {
            this.f197012H0 = (num.intValue() - bottom) + t100.m186890d(this.f197030Q0 * 50.0f);
        }
        this.f197010G0 = z;
        int measuredWidth = this.f197058k.getMeasuredWidth();
        bt0.m103753z(m213692k2(-1, 300, z ? 0 : -t100.m186890d(this.f197030Q0 * 40.0f), z ? -t100.m186890d(this.f197030Q0 * 40.0f) : 0), m213669U0(300, z ? 1 : 0, !z ? 1 : 0)).start();
        VImage vImage = this.f197062n;
        if (z) {
            Property property = View.ALPHA;
            bt0.m103739l(vImage, property, 0L, 300L, new DecelerateInterpolator(), 1.0f, 0.0f).start();
            bt0.m103739l(this.f197067r, property, 0L, 300L, new DecelerateInterpolator(), 1.0f, 0.0f).start();
        } else {
            Property property2 = View.ALPHA;
            bt0.m103739l(vImage, property2, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
            bt0.m103739l(this.f197067r, property2, 0L, 300L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
        }
        VRelative vRelative = this.f197058k;
        Property property3 = View.TRANSLATION_X;
        Animator animatorM103741n = bt0.m103741n(vRelative, property3, z ? t100.m186890d(34.0f) : measuredWidth / 2, z ? measuredWidth / 2 : t100.m186890d(34.0f));
        VRelative vRelative2 = this.f197058k;
        Property property4 = View.TRANSLATION_Y;
        Animator animatorM103741n2 = bt0.m103741n(vRelative2, property4, z ? 0.0f : -(this.f197012H0 - t100.m186890d(this.f197030Q0 * 20.0f)), z ? -(this.f197012H0 - t100.m186890d(this.f197030Q0 * 20.0f)) : 0.0f);
        Animator animatorM103741n3 = bt0.m103741n(this.f197064p, property4, z ? 0.0f : -(this.f197012H0 - t100.m186890d(this.f197030Q0 * 20.0f)), z ? -(this.f197012H0 - t100.m186890d(this.f197030Q0 * 20.0f)) : 0.0f);
        Animator animatorM103741n4 = bt0.m103741n(this.f197064p, View.SCALE_X, z ? 1.0f : 1.01f, z ? 1.01f : 1.0f);
        Animator animatorM103741n5 = bt0.m103741n(this.f197064p, View.SCALE_Y, z ? 1.0f : 1.01f, z ? 1.01f : 1.0f);
        Animator animatorM103741n6 = bt0.m103741n(this.f197004D, property4, z ? 0.0f : -this.f197012H0, z ? -this.f197012H0 : 0.0f);
        Animator animatorM103737j2 = bt0.m103737j(0);
        if (this.f197016J0) {
            animatorM103737j = bt0.m103741n(this.f197064p, property3, z ? -t100.m186890d(34.0f) : (-measuredWidth) / 2, z ? (-measuredWidth) / 2 : -t100.m186890d(34.0f));
        } else {
            animatorM103737j = bt0.m103737j(0);
        }
        Animator animatorM103753z = bt0.m103753z((Animator[]) Arrays.asList(animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4, animatorM103741n5, animatorM103741n6, animatorM103737j2, animatorM103737j).toArray(new Animator[0]));
        animatorM103753z.setInterpolator(new DecelerateInterpolator());
        animatorM103753z.setDuration(300L);
        animatorM103753z.addListener(new C21342e(z));
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: V1 */
    public final void m213672V1() {
        if (this.f197059k0.m213511r1() == 50 || this.f197059k0.m213511r1() == 51) {
            xdl0.m208344M(this.f197051d, false);
            xdl0.m208344M(this.f197052e, false);
            SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/7036ab37-664e-486d-a3b1-3162a0f94c9214.svga").autoPlay(true).repeatCount(1).into(this.f197049b);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.z8x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f202242a.m213656I1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.start();
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/45411073-a242-4383-adb6-d088856a7c6a10.so").autoPlay(true).repeatCount(1).into(this.f197049b);
        this.f197052e.m80918d("animations/match_heart_success/config.xml", "animations/match_heart_success/pic");
    }

    /* JADX INFO: renamed from: X0 */
    public final void m213673X0(int i) {
        m213671V0(true);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m213674X1(User user) {
        String strM213681e1 = m213681e1(user);
        boolean zIsEmpty = TextUtils.isEmpty(strM213681e1);
        VText vText = this.f197057j;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(strM213681e1);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y8x y8xVar) {
        this.f197059k0 = y8xVar;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m213676Z0() {
        xdl0.m208344M(this.f197062n, false);
        xdl0.m208344M(this.f197067r, false);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m213677a1() {
        if (upa.m194750f2()) {
            this.f197042W0.m20900k("MatchIceBreakBubble");
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m213678b2(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = i; i3 <= i2; i3++) {
            String str2 = this.f197038U0.getItem(i3).tipId;
            if (!this.f197046Y0.contains(str2)) {
                if (i3 > i && sb2.length() > 0) {
                    sb.append(com.meituan.robust.Constants.PACKNAME_END);
                    sb2.append(com.meituan.robust.Constants.PACKNAME_END);
                }
                sb.append(this.f197038U0.getItem(i3).content);
                sb2.append(str2);
                this.f197046Y0.add(str2);
            }
        }
        if (sb2.length() > 0) {
            zvf0.m220368A("e_breakice_content", getAct().pageId(), vwb.m200311Y(NotificationCompat.CATEGORY_STATUS, str), vwb.m200311Y(Constants.MessagePayloadKeys.MSGID_SERVER, sb2.toString()), vwb.m200311Y("chat_content", sb.toString()));
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m213679d1(String str, String str2, int i) {
        pxe.m171835c().m171846l(str2);
        tz00.m191126h(getAct(), this.f197018K0, str, false, new RunnableC21339b());
        o6j0.m162859c("e_match_emoji", "p_successful_match_view", o6j0.C18854a.m162876f("select_emoji", i));
    }

    /* JADX INFO: renamed from: d2 */
    public final void m213680d2(TextView textView, String str, String str2, int i) {
        e51.m114743H(getAct(), new RunnableC21341d(i, textView, str, str2), 350L);
    }

    @Override // p149l.s7m
    public void destroy() {
        m213677a1();
    }

    /* JADX INFO: renamed from: e1 */
    public final String m213681e1(User user) {
        StringBuilder sb = new StringBuilder(user.description);
        if (TextUtils.isEmpty(sb.toString())) {
            if (!TextUtils.isEmpty(user.location.region.city) && !user.isHideLocationFromSVip()) {
                sb.append(user.location.region.city);
                String strM133876p = i0g0.m133876p(user.location.distance, true);
                if (!TextUtils.isEmpty(strM133876p)) {
                    sb.append("(");
                    sb.append(strM133876p);
                    sb.append(")");
                }
            }
            if (!TextUtils.isEmpty(i0g0.m133869j0(user.profile.zodiac))) {
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append(i0g0.m133869j0(user.profile.zodiac));
                } else {
                    sb.append(" · ");
                    sb.append(i0g0.m133869j0(user.profile.zodiac));
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
        return ddj0.m111024e(sb.toString());
    }

    /* JADX INFO: renamed from: e2 */
    public final void m213682e2() {
        this.f197017K.setText("[" + getAct().getString(R$string.f18704lj) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f197011H, new View.OnClickListener() { // from class: l.i9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112264a.m213657J1(view);
            }
        });
        this.f197025O.setText("[" + getAct().getString(R$string.f18673kj) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f197019L, new View.OnClickListener() { // from class: l.j9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116983a.m213658K1(view);
            }
        });
        this.f197033S.setText("[" + getAct().getString(R$string.f18567h4) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f197027P, new View.OnClickListener() { // from class: l.l9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127151a.m213659L1(view);
            }
        });
        this.f197041W.setText("[" + getAct().getString(R$string.f18536g4) + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f197035T, new View.OnClickListener() { // from class: l.m9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132818a.m213660M1(view);
            }
        });
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        m213672V1();
        return this.f197016J0 ? bt0.m103753z(m213664R1(), m213662P1(this.f197059k0.m213511r1())) : bt0.m103753z(m213662P1(this.f197059k0.m213511r1()));
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return bt0.m103737j(1);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m213683f1() {
        xdl0.m208344M(this.f197062n, false);
    }

    /* JADX INFO: renamed from: f2 */
    public void m213684f2() {
        this.f197005E.clearFocus();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m213685g1() {
        xdl0.m208344M(this.f197067r, false);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m213686g2(TextView textView, String str, String str2) {
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
                str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "... ";
                str4 = String.format(str, str3);
            } else {
                str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2.substring(0, lineEnd) + "... ";
                str4 = String.format(str, str3);
            }
            SpannableString spannableString2 = new SpannableString(str4);
            spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
            textView.setText(spannableString2);
        }
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
        int i3 = this.f197006E0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f197065p0) {
                m213673X0(i);
            }
            this.f197065p0 = true;
        } else if (i - i3 < 0) {
            if (this.f197065p0) {
                m213590W0();
            }
            this.f197065p0 = false;
        }
        this.f197006E0 = i;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m213687h1(int i) {
        if (i == 12 || i == 11 || (i == 13 && vdj.m198001c())) {
            if (i == 12) {
                m213595Z1();
                m213685g1();
                return;
            } else if (i == 11) {
                m213593Y1();
                m213683f1();
                return;
            } else {
                if (i == 13) {
                    m213593Y1();
                    m213595Z1();
                    return;
                }
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            m213676Z0();
            return;
        }
        if (i == 38) {
            xdl0.m208344M(this.f197062n, true);
            xdl0.m208344M(this.f197067r, false);
            this.f197062n.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else if (i == 37) {
            xdl0.m208344M(this.f197062n, false);
            xdl0.m208344M(this.f197067r, true);
            this.f197067r.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else if (i == 39) {
            xdl0.m208344M(this.f197062n, true);
            xdl0.m208344M(this.f197067r, true);
            this.f197062n.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
            this.f197067r.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m213688h2(TextView textView, String str, String str2) {
        String str3;
        String str4;
        if (str == null || textView == null || !str.contains("%s")) {
            return;
        }
        int iIndexOf = str.indexOf("%s");
        String str5 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
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
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + "... ";
            str4 = String.format(str, str3);
        } else {
            str3 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2.substring(0, lineEnd) + "... ";
            str4 = String.format(str, str3);
        }
        SpannableString spannableString2 = new SpannableString(str4);
        spannableString2.setSpan(new StyleSpan(1), iIndexOf, str3.length() + iIndexOf, 33);
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#CC000000")), iIndexOf, str3.length() + iIndexOf, 33);
        textView.setText(spannableString2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m213665S0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j1 */
    public void m213690j1(boolean z, final int i) {
        this.f197030Q0 = ikf0.m136795i(xdl0.m208408w0()) / this.f197014I0;
        if (ikf0.m136795i(xdl0.m208412y0()) < 360.0f) {
            this.f197032R0 = ikf0.m136795i(xdl0.m208412y0()) / 375.0f;
        } else {
            this.f197032R0 = this.f197030Q0;
        }
        this.f197012H0 = t100.m186890d(this.f197030Q0 * 130.0f);
        xdl0.m208360X(this.f197054g, t100.m186890d(this.f197030Q0 * 73.0f));
        xdl0.m208360X(this.f197055h, t100.m186890d(this.f197030Q0 * 31.0f));
        xdl0.m208360X(this.f197056i, t100.m186890d(this.f197030Q0 * 5.0f));
        xdl0.m208360X(this.f197058k, t100.m186890d(this.f197030Q0 * 181.0f));
        xdl0.m208360X(this.f197064p, t100.m186890d(this.f197030Q0 * 181.0f));
        xdl0.m208325C0(this.f197058k, t100.m186890d(this.f197032R0 * 200.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 190.0f), this.f197058k);
        xdl0.m208325C0(this.f197060l, t100.m186890d(this.f197032R0 * 190.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 190.0f), this.f197060l);
        xdl0.m208325C0(this.f197064p, t100.m186890d(this.f197032R0 * 200.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 190.0f), this.f197064p);
        xdl0.m208325C0(this.f197066q, t100.m186890d(this.f197032R0 * 190.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 190.0f), this.f197066q);
        xdl0.m208325C0(this.f197062n, t100.m186890d(this.f197032R0 * 30.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 30.0f), this.f197062n);
        xdl0.m208325C0(this.f197067r, t100.m186890d(this.f197032R0 * 30.0f));
        xdl0.m208327D0(t100.m186890d(this.f197032R0 * 30.0f), this.f197067r);
        xdl0.m208325C0(this.f197004D, t100.m186890d(this.f197030Q0 * 64.0f));
        xdl0.m208325C0(this.f197007F, t100.m186890d(this.f197030Q0 * 48.0f));
        xdl0.m208360X(this.f197043X, t100.m186890d(this.f197030Q0 * 25.0f));
        xdl0.m208360X(this.f197045Y, t100.m186890d(this.f197030Q0 * 14.0f));
        this.f197054g.setText(getAct().getString(R$string.f19104yp));
        this.f197054g.setTextSize(this.f197030Q0 * 18.0f);
        this.f197055h.setText(getAct().getString(R$string.f19074xp));
        this.f197055h.setTextSize(this.f197030Q0 * 34.0f);
        this.f197056i.setTextSize(this.f197030Q0 * 18.0f);
        this.f197005E.setTextSize(this.f197030Q0 * 18.0f);
        this.f197007F.setTextSize(this.f197030Q0 * 16.0f);
        this.f197043X.setTextSize(this.f197030Q0 * 16.0f);
        this.f197045Y.setTextSize(this.f197030Q0 * 16.0f);
        this.f197007F.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f197045Y, this.f197024N0);
        xdl0.m208329E0(this.f197043X, this.f197022M0);
        xdl0.m208329E0(this.f197007F, this.f197026O0);
        xdl0.m208329E0(this.f197048a, new View.OnClickListener() { // from class: l.c9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79988a.m213622m1(view);
            }
        });
        m213693l1();
        m213691k1();
        m213687h1(i);
        if (!IntlCountryCodeController.m28126v() && z) {
            m213598a2();
        }
        if (i == 40 || i == 41) {
            xdl0.m208344M(this.f197004D, false);
            xdl0.m208344M(this.f197043X, false);
            xdl0.m208344M(this.f197045Y, false);
            xdl0.m208344M(this.f197074y, true);
            xdl0.m208344M(this.f197075z, true);
            this.f197054g.setText("Congratulations！");
            xdl0.m208325C0(this.f197074y, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197074y.setTextSize(this.f197030Q0 * 16.0f);
            xdl0.m208325C0(this.f197075z, t100.m186890d(this.f197030Q0 * 56.0f));
            this.f197075z.setTextSize(this.f197030Q0 * 16.0f);
            this.f197074y.setOnClickListener(new View.OnClickListener() { // from class: l.d9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85161a.m213694n1(i, view);
                }
            });
            this.f197075z.setOnClickListener(new View.OnClickListener() { // from class: l.e9x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90154a.m213695o1(i, view);
                }
            });
        }
        if (upa.m194770j2()) {
            xdl0.m208344M(this.f197054g, false);
            xdl0.m208344M(this.f197057j, true);
            this.f197055h.setTextSize(this.f197030Q0 * 32.0f);
            this.f197055h.setTextColor(Color.parseColor("#CC000000"));
            this.f197055h.setTypeface(Typeface.defaultFromStyle(1));
            this.f197056i.setTextSize(this.f197030Q0 * 18.0f);
            this.f197056i.setTextColor(Color.parseColor("#66000000"));
            this.f197057j.setTextSize(this.f197030Q0 * 16.0f);
            this.f197045Y.setTypeface(Typeface.defaultFromStyle(1));
            this.f197053f.setTextSize(this.f197030Q0 * 18.0f);
            this.f197053f.setTypeface(Typeface.defaultFromStyle(1));
            this.f197007F.setTextColor(Color.parseColor("#33000000"));
            this.f197005E.setTextSize(this.f197030Q0 * 16.0f);
            xdl0.m208325C0(this.f197004D, t100.m186890d(this.f197030Q0 * 56.0f));
            xdl0.m208360X(this.f197055h, t100.m186890d(this.f197030Q0 * 59.0f));
            xdl0.m208360X(this.f197056i, t100.m186890d(this.f197030Q0 * 24.0f));
            xdl0.m208360X(this.f197057j, t100.m186890d(this.f197030Q0 * 5.0f));
            xdl0.m208360X(this.f197043X, t100.m186890d(this.f197030Q0 * 20.0f));
            xdl0.m208360X(this.f197058k, t100.m186890d(this.f197030Q0 * 228.0f));
            xdl0.m208360X(this.f197064p, t100.m186890d(this.f197030Q0 * 228.0f));
            xdl0.m208360X(this.f197004D, t100.m186890d(this.f197030Q0 * 40.0f));
            xdl0.m208360X(this.f197053f, t100.m186890d(this.f197030Q0 * 47.0f));
            m213682e2();
            o6j0.m162864h("e_matched_send_message", "p_successful_match_view", new o6j0.C18854a[0]);
            o6j0.m162864h("e_matched_text_box", "p_successful_match_view", new o6j0.C18854a[0]);
            o6j0.m162864h("e_matched_later", "p_successful_match_view", new o6j0.C18854a[0]);
        } else {
            xdl0.m208344M(this.f197057j, false);
            xdl0.m208344M(this.f197009G, false);
            xdl0.m208344M(this.f197053f, false);
        }
        xdl0.m208360X(this.f197001A, t100.m186890d(this.f197030Q0 * 28.0f));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m213691k1() {
        xdl0.m208329E0(this.f197005E, new View.OnClickListener() { // from class: l.n9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137842a.m213696p1(view);
            }
        });
        this.f197005E.addTextChangedListener(new C21343f());
        this.f197005E.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.o9x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f142748a.m213697q1(textView, i, keyEvent);
            }
        });
        this.f197005E.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.p9x
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f147828a.m213698r1(view, z);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final Animator m213692k2(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        Animator animatorM103739l = i == 40 ? bt0.m103739l(this.f197074y, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, i3, i4) : bt0.m103739l(this.f197004D, View.TRANSLATION_Y, 0L, i2, decelerateInterpolator, i3, i4);
        if (upa.m194770j2()) {
            TextView textView = this.f197056i;
            Property property = View.TRANSLATION_Y;
            long j = i2;
            float f = i3;
            float f2 = i4;
            return bt0.m103753z(bt0.m103739l(textView, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f197057j, property, 0L, j, decelerateInterpolator, f, f2), animatorM103739l);
        }
        VText vText = this.f197055h;
        Property property2 = View.TRANSLATION_Y;
        long j2 = i2;
        float f3 = i3;
        float f4 = i4;
        return bt0.m103753z(bt0.m103739l(vText, property2, 0L, j2, decelerateInterpolator, f3, f4), bt0.m103739l(this.f197056i, property2, 0L, j2, decelerateInterpolator, f3, f4), animatorM103739l);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m213693l1() {
        if (this.f197028P0 == null) {
            this.f197028P0 = new fyq(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.h9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f106642a.m213699s1();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m213694n1(int i, View view) {
        y8x y8xVar = this.f197059k0;
        if (i == 41) {
            y8xVar.m213507g2(false);
        } else {
            y8xVar.m213508h2(false);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m213695o1(int i, View view) {
        getAct().m66873d2();
        if (i == 40) {
            lsi0.m151595y(String.format(getAct().getResources().getString(com.p046p1.mobile.putong.core.member.R$string.f20579F0), new Object[0]));
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m213696p1(View view) {
        zvf0.m220396r("e_matched_text_box", getAct().pageId());
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ boolean m213697q1(TextView textView, int i, KeyEvent keyEvent) {
        if (!rs4.f160804e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f197005E.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m81303a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f197026O0.onClick(this.f197007F);
        }
        return true;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m213698r1(View view, boolean z) {
        if (z) {
            zvf0.m220396r("e_matched_text_box", getAct().pageId());
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m213699s1() {
        this.f197028P0.m123795h();
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m213700w1(int[] iArr) {
        m213678b2(0, this.f197040V0.findLastVisibleItemPosition(), "init");
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m213701y1(Long l2) {
        this.f197042W0.m20909u(new C4345a(getAct()).m20849D("左滑可以选择更多内容哦～").m20870k(e16.m114375c(getAct(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(14.0f).m20864e(false).m20850E(false).m20882x(-t100.f167254c).m20861b(com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20875q(jtk.f119617D | jtk.f119618E), this.f197073x, "MatchIceBreakBubble");
        tpd0 tpd0Var = this.f197044X0;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m213702z1() {
        C8455a.m47588w().m47619z(getAct(), this.f197018K0);
        CoreModule.f17545c.f19595P1.f179756R.m132487l(roj0.f160388a);
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: i2 */
    public void m213689i2() {
    }

    @Override // p149l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.y9x$e */
    public class C21342e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f197084a;

        public C21342e(boolean z) {
            this.f197084a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f197084a && y9x.this.f197020L0) {
                xdl0.m208344M(y9x.this.f197001A, true);
            }
            boolean zM194770j2 = upa.m194770j2();
            boolean z = this.f197084a;
            if (zM194770j2) {
                y9x y9xVar = y9x.this;
                if (z) {
                    xdl0.m208345M0(y9xVar.f197055h, false);
                    xdl0.m208344M(y9x.this.f197053f, true);
                    return;
                } else {
                    xdl0.m208345M0(y9xVar.f197055h, true);
                    xdl0.m208344M(y9x.this.f197053f, false);
                    return;
                }
            }
            y9x y9xVar2 = y9x.this;
            if (z) {
                xdl0.m208345M0(y9xVar2.f197054g, true);
                y9x.this.f197054g.setText(y9x.this.getAct().getString(R$string.f18197V0));
            } else {
                xdl0.m208345M0(y9xVar2.f197054g, y9x.this.f197016J0);
                y9x.this.f197054g.setText(y9x.this.getAct().getString(R$string.f19104yp));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f197084a) {
                xdl0.m208344M(y9x.this.f197001A, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.y9x$f */
    public class C21343f implements TextWatcher {
        public C21343f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (upa.m194770j2()) {
                y9x.this.f197007F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            if (y9x.this.f197059k0.m213511r1() == 51) {
                y9x.this.f197007F.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#7439B3"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            y9x y9xVar = y9x.this;
            if (zIsEmpty) {
                xdl0.m208345M0(y9xVar.f197007F, false);
            } else {
                xdl0.m208345M0(y9xVar.f197007F, true);
            }
            y9x.this.f197007F.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
