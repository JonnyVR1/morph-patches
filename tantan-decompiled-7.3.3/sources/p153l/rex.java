package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class rex implements qyl<ydx> {

    /* JADX INFO: renamed from: A */
    public FrameLayout f162706A;

    /* JADX INFO: renamed from: B */
    public VText f162707B;

    /* JADX INFO: renamed from: C */
    public TextView f162708C;

    /* JADX INFO: renamed from: D */
    public VImage f162709D;

    /* JADX INFO: renamed from: E */
    public MatchAct f162710E;

    /* JADX INFO: renamed from: F */
    public ydx f162711F;

    /* JADX INFO: renamed from: H */
    public int f162713H;

    /* JADX INFO: renamed from: L */
    public f0r f162717L;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f162719a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f162720b;

    /* JADX INFO: renamed from: c */
    public VImage f162721c;

    /* JADX INFO: renamed from: d */
    public VText f162722d;

    /* JADX INFO: renamed from: e */
    public TextView f162723e;

    /* JADX INFO: renamed from: f */
    public VText f162724f;

    /* JADX INFO: renamed from: g */
    public Guideline f162725g;

    /* JADX INFO: renamed from: h */
    public VRelative f162726h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f162727i;

    /* JADX INFO: renamed from: j */
    public VRelative f162728j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f162729k;

    /* JADX INFO: renamed from: l */
    public VImage f162730l;

    /* JADX INFO: renamed from: m */
    public VImage f162731m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f162732n;

    /* JADX INFO: renamed from: o */
    public TextView f162733o;

    /* JADX INFO: renamed from: p */
    public TextView f162734p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f162735q;

    /* JADX INFO: renamed from: r */
    public VEditText f162736r;

    /* JADX INFO: renamed from: s */
    public VText f162737s;

    /* JADX INFO: renamed from: t */
    public VLinear f162738t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f162739u;

    /* JADX INFO: renamed from: v */
    public VText f162740v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f162741w;

    /* JADX INFO: renamed from: x */
    public VText f162742x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f162743y;

    /* JADX INFO: renamed from: z */
    public VText f162744z;

    /* JADX INFO: renamed from: G */
    public boolean f162712G = false;

    /* JADX INFO: renamed from: I */
    public int f162714I = 0;

    /* JADX INFO: renamed from: J */
    public User f162715J = null;

    /* JADX INFO: renamed from: K */
    public final View.OnClickListener f162716K = new View.OnClickListener() { // from class: l.zdx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f203952a.m181124y0(view);
        }
    };

    /* JADX INFO: renamed from: M */
    public Animator f162718M = null;

    /* JADX INFO: renamed from: l.rex$b */
    public class RunnableC19819b implements Runnable {
        public RunnableC19819b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (rex.this.getAct() == null) {
                return;
            }
            rex.this.getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: l.rex$d */
    public static class C19821d {
        /* JADX INFO: renamed from: b */
        public static void m181157b(rex rexVar, View view) {
            rexVar.f162719a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            rexVar.f162720b = (SVGAnimationView) viewGroup.getChildAt(0);
            rexVar.f162721c = (VImage) viewGroup.getChildAt(1);
            rexVar.f162722d = (VText) viewGroup.getChildAt(2);
            rexVar.f162723e = (TextView) viewGroup.getChildAt(3);
            rexVar.f162724f = (VText) viewGroup.getChildAt(4);
            rexVar.f162725g = (Guideline) viewGroup.getChildAt(5);
            rexVar.f162726h = (VRelative) viewGroup.getChildAt(6);
            rexVar.f162727i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            rexVar.f162728j = (VRelative) viewGroup.getChildAt(7);
            rexVar.f162729k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
            rexVar.f162730l = (VImage) viewGroup.getChildAt(8);
            rexVar.f162731m = (VImage) viewGroup.getChildAt(9);
            rexVar.f162732n = (VDraweeView) viewGroup.getChildAt(10);
            rexVar.f162733o = (TextView) viewGroup.getChildAt(11);
            rexVar.f162734p = (TextView) viewGroup.getChildAt(12);
            rexVar.f162735q = (LinearLayout) viewGroup.getChildAt(13);
            rexVar.f162736r = (VEditText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            rexVar.f162737s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            rexVar.f162738t = (VLinear) viewGroup.getChildAt(14);
            rexVar.f162739u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
            rexVar.f162740v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0)).getChildAt(0);
            rexVar.f162741w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2);
            rexVar.f162742x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2)).getChildAt(0);
            rexVar.f162743y = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4);
            rexVar.f162744z = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4)).getChildAt(0);
            rexVar.f162706A = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6);
            rexVar.f162707B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6)).getChildAt(0);
            rexVar.f162708C = (TextView) viewGroup.getChildAt(15);
            rexVar.f162709D = (VImage) viewGroup.getChildAt(16);
        }

        /* JADX INFO: renamed from: c */
        public static View m181158c(rex rexVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125964n7, viewGroup, false);
            m181157b(rexVar, viewInflate);
            return viewInflate;
        }
    }

    public rex(MatchAct matchAct) {
        this.f162710E = matchAct;
    }

    /* JADX INFO: renamed from: O0 */
    private Animator m181077O0(int i) {
        return gt0.m132180z(m181088W0(i, 500, qa00.m175859d(60.0f), 0), m181105i0(500, 0, 1), gt0.m132166l(this.f162721c, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f162721c, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), qa00.m175859d(40.0f), 0.0f), m181145j0(400, 100, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: P0 */
    private Animator m181079P0() {
        this.f162726h.setTranslationX(-qa00.m175859d(108.0f));
        this.f162728j.setTranslationX(qa00.m175859d(108.0f));
        fzf0 fzf0Var = new fzf0(0.4f);
        VRelative vRelative = this.f162726h;
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vRelative, property, 200L, 700L, fzf0Var, -qa00.m175859d(108.0f), qa00.m175859d(28.0f));
        Animator animatorM132166l2 = gt0.m132166l(this.f162728j, property, 200L, 700L, fzf0Var, qa00.m175859d(108.0f), -qa00.m175859d(10.0f));
        VRelative vRelative2 = this.f162726h;
        Property property2 = View.ALPHA;
        return gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f162728j, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: R0 */
    private void m181082R0() {
        SVGALoader.with(getAct()).from("https://fe-static.tancdn.com/v1/raw/6359b74d-b432-4c84-9eb3-811b887a9bdf14.svga").autoPlay(true).repeatCount(1).into(this.f162720b);
    }

    /* JADX INFO: renamed from: W0 */
    private Animator m181088W0(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f162733o;
        Property property = View.TRANSLATION_Y;
        long j = i2;
        float f = i3;
        float f2 = i4;
        return gt0.m132180z(gt0.m132166l(this.f162722d, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162723e, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(textView, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: i0 */
    private Animator m181105i0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VText vText = this.f162722d;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return gt0.m132180z(gt0.m132166l(vText, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162723e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: l0 */
    private void m181109l0() {
        m181146k0(false);
    }

    /* JADX INFO: renamed from: m0 */
    private void m181111m0() {
        m181146k0(true);
    }

    /* JADX INFO: renamed from: t0 */
    private void m181116t0() {
        this.f162736r.addTextChangedListener(new C19818a());
        this.f162736r.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.hex
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f109205a.m181153w0(textView, i, keyEvent);
            }
        });
        bnl0.m105509E0(this.f162737s, this.f162716K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m181118u0() {
        this.f162717L.m123510h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m181120v0(View view) {
        getAct().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m181124y0(View view) {
        String strTrim = this.f162736r.getText().toString().trim();
        if (gra.m131701j2()) {
            d810.m114775h(getAct(), this.f162715J, strTrim, true, new Runnable() { // from class: l.pex
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152132a.m181154x0();
                }
            });
        } else {
            this.f162711F.m215331u1(strTrim, this.f162712G);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m181126A0(User user, View view) {
        getAct().startActivity(ProfileAct.m51920o2(getAct(), user.f56859id, "from_match", false));
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m181127B0(User user, View view) {
        getAct().startActivity(ProfileAct.m51920o2(getAct(), user.f56859id, "from_match", false));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f162710E;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m181128D0(View view) {
        this.f162711F.m215332v1(false);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m181129E0(View view) {
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m181130G0(View view) {
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m181131H0(View view) {
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m181132I0() {
        this.f162724f.setAlpha(0.0f);
        bnl0.m105524M(this.f162724f, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m181133J0() {
        this.f162724f.setAlpha(0.0f);
        bnl0.m105524M(this.f162724f, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m181134K0(User user, View view) {
        m181149p0("[" + getAct().getString(R$string.f18522Hj) + Constants.AES_SUFFIX, "NEW_EMOJI_HAHE", 1, user);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m181135L0(User user, View view) {
        m181149p0("[" + getAct().getString(R$string.f18491Gj) + Constants.AES_SUFFIX, "NEW_EMOJI_BEER", 2, user);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m181136M0(User user, View view) {
        m181149p0("[" + getAct().getString(R$string.f19357j4) + Constants.AES_SUFFIX, "EMOJI_70", 3, user);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m181137N0(User user, View view) {
        m181149p0("[" + getAct().getString(R$string.f19328i4) + Constants.AES_SUFFIX, "EMOJI_63", 4, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m181138Q0(final User user, final User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.m82487b(user);
            NullChecker.m82487b(user2);
            getAct().m68056e2();
            return;
        }
        this.f162715J = user2;
        if (i == 45) {
            bnl0.m105524M(this.f162735q, true);
            bnl0.m105524M(this.f162738t, true);
            bnl0.m105524M(this.f162733o, false);
            this.f162722d.setText("SVIP配对成功");
            this.f162723e.setText("谁喜欢我特权已生效，\n帮你大幅提升配对概率！");
            this.f162724f.setText("打个招呼");
            bnl0.m105509E0(this.f162727i, new View.OnClickListener() { // from class: l.iex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114634a.m181126A0(user, view);
                }
            });
            bnl0.m105509E0(this.f162729k, new View.OnClickListener() { // from class: l.jex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120529a.m181127B0(user2, view);
                }
            });
            this.f162708C.setText("继续探索");
            m181116t0();
            m181140T0(user2);
        } else {
            LinearLayout linearLayout = this.f162735q;
            if (i == 43) {
                bnl0.m105524M(linearLayout, false);
                bnl0.m105524M(this.f162738t, false);
                boolean zM126491b = Cfor.INSTANCE.m126491b();
                VText vText = this.f162722d;
                if (zM126491b) {
                    vText.setText(String.format("%s喜欢了你", user2.isFemale() ? "她" : "他"));
                    this.f162723e.setText(String.format("试用解密谁喜欢我特权，立即和%s聊天", user2.isFemale() ? "她" : "他"));
                } else {
                    vText.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                    this.f162723e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                }
                this.f162733o.setText("发消息");
                this.f162734p.setText(String.format("放弃%s", user2.isFemale() ? "她" : "他"));
                bnl0.m105509E0(this.f162733o, new View.OnClickListener() { // from class: l.kex
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f126218a.m181128D0(view);
                    }
                });
            } else {
                bnl0.m105524M(linearLayout, false);
                bnl0.m105524M(this.f162738t, false);
                this.f162722d.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f162723e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f162733o.setText("继续探索");
                this.f162734p.setText("继续探索");
                bnl0.m105509E0(this.f162733o, new View.OnClickListener() { // from class: l.lex
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f131791a.m181129E0(view);
                    }
                });
            }
        }
        bnl0.m105509E0(this.f162734p, new View.OnClickListener() { // from class: l.mex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136577a.m181130G0(view);
            }
        });
        bnl0.m105509E0(this.f162708C, new View.OnClickListener() { // from class: l.nex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141693a.m181131H0(view);
            }
        });
        bnl0.m105509E0(this.f162709D, new View.OnClickListener() { // from class: l.oex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147024a.m181155z0(view);
            }
        });
        uqb0.f180374G.m127111J0(this.f162727i, user.m61308fp().profileMiddle(), false);
        uqb0.f180374G.m127111J0(this.f162729k, user2.m61308fp().profileMiddle(), false);
        uqb0.f180374G.m127109I0(this.f162732n, user2.isFemale() ? "https://static.tancdn.com/pe-webplatform/wYCGSOB598qnOBOaxgSNC6Ke.webp" : "https://static.tancdn.com/pe-webplatform/11RRvmgTlw6-1KRaLGFnlfqk.webp", qa00.m175859d(106.0f), qa00.m175859d(71.0f));
    }

    /* JADX INFO: renamed from: S0 */
    public final Animator m181139S0(boolean z, int i) {
        Animator animatorM132168n = gt0.m132168n(this.f162724f, View.ALPHA, 0.0f, i, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        if (z) {
            gt0.m132176v(animatorM132168n, new Runnable() { // from class: l.fex
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98722a.m181132I0();
                }
            });
            return animatorM132168n;
        }
        gt0.m132160f(animatorM132168n, new Runnable() { // from class: l.gex
            @Override // java.lang.Runnable
            public final void run() {
                this.f103864a.m181133J0();
            }
        });
        return animatorM132168n;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m181140T0(final User user) {
        this.f162740v.setText("[" + getAct().getString(R$string.f18522Hj) + Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f162739u, new View.OnClickListener() { // from class: l.qex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157221a.m181134K0(user, view);
            }
        });
        this.f162742x.setText("[" + getAct().getString(R$string.f18491Gj) + Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f162741w, new View.OnClickListener() { // from class: l.aex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70831a.m181135L0(user, view);
            }
        });
        this.f162744z.setText("[" + getAct().getString(R$string.f19357j4) + Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f162743y, new View.OnClickListener() { // from class: l.bex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76421a.m181136M0(user, view);
            }
        });
        this.f162707B.setText("[" + getAct().getString(R$string.f19328i4) + Constants.AES_SUFFIX);
        bnl0.m105509E0(this.f162706A, new View.OnClickListener() { // from class: l.cex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81434a.m181137N0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m181141U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VImage vImage = this.f162721c;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return gt0.m132180z(gt0.m132166l(vImage, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162722d, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162723e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: V0 */
    public final Animator m181142V0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VImage vImage = this.f162721c;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return gt0.m132180z(gt0.m132166l(vImage, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162722d, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f162723e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        m181082R0();
        return gt0.m132180z(m181079P0(), m181077O0(this.f162711F.m215322d1()));
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return gt0.m132164j(1);
    }

    /* JADX INFO: renamed from: g0 */
    public View m181143g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19821d.m181158c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
        if (this.f162711F.m215322d1() == 45) {
            int i3 = this.f162713H;
            if (i - i3 > 0 || i > 0) {
                this.f162714I = i;
                if (!this.f162712G || i3 != i) {
                    m181111m0();
                }
                this.f162712G = true;
            } else if (i - i3 < 0) {
                if (this.f162712G) {
                    m181109l0();
                }
                this.f162712G = false;
            }
            this.f162713H = i;
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f162710E;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m181143g0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final Animator m181145j0(int i, int i2, float f, float f2) {
        this.f162730l.setAlpha(0.0f);
        this.f162731m.setAlpha(0.0f);
        this.f162732n.setAlpha(0.0f);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (!bnl0.m105529O0(this.f162734p)) {
            VImage vImage = this.f162730l;
            Property property = View.ALPHA;
            long j = i;
            long j2 = i2;
            return gt0.m132180z(gt0.m132166l(vImage, property, j, j2, decelerateInterpolator, f, f2), gt0.m132166l(this.f162731m, property, j, j2, decelerateInterpolator, f, f2), gt0.m132166l(this.f162732n, property, j, j2, decelerateInterpolator, f, f2));
        }
        this.f162734p.setAlpha(0.0f);
        VImage vImage2 = this.f162730l;
        Property property2 = View.ALPHA;
        long j3 = i;
        long j4 = i2;
        return gt0.m132180z(gt0.m132166l(vImage2, property2, j3, j4, decelerateInterpolator, f, f2), gt0.m132166l(this.f162731m, property2, j3, j4, decelerateInterpolator, f, f2), gt0.m132166l(this.f162732n, property2, j3, j4, decelerateInterpolator, f, f2), gt0.m132166l(this.f162734p, property2, j3, j4, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: k0 */
    public void m181146k0(boolean z) {
        int iMax = Math.max(this.f162714I, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
        this.f162714I = iMax;
        int iM105592y0 = bnl0.m105592y0() / 2;
        int iM105588w0 = bnl0.m105588w0();
        Animator animatorM181141U0 = m181141U0(300, z ? 1 : 0, !z ? 1 : 0);
        int iM175859d = qa00.m175859d(40.0f) * (-1);
        int i = z ? 0 : iM175859d;
        if (!z) {
            iM175859d = 0;
        }
        Animator animatorM181142V0 = m181142V0(300, i, iM175859d);
        int i2 = iM105588w0 - iMax;
        Animator animatorM181150q0 = m181150q0(z, 300, iM105592y0 - (this.f162726h.getRight() - (this.f162726h.getMeasuredWidth() / 2)), (i2 - qa00.m175859d(112.0f)) - this.f162726h.getBottom());
        Animator animatorM181151r0 = m181151r0(z, 300, iM105592y0 - (this.f162728j.getLeft() + (this.f162728j.getMeasuredWidth() / 2)), (i2 - qa00.m175859d(112.0f)) - this.f162728j.getBottom());
        Animator animatorM181148o0 = m181148o0(z, 300, i2 - this.f162735q.getBottom());
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f162724f.getLayoutParams();
        int iM175859d2 = iMax + qa00.m175859d(380.0f);
        if (((ViewGroup.MarginLayoutParams) c0221a).bottomMargin != iM175859d2) {
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = iM175859d2;
            this.f162724f.setLayoutParams(c0221a);
        }
        Animator animatorM181139S0 = m181139S0(z, 300);
        if (NullChecker.m82486a(this.f162718M)) {
            this.f162718M.cancel();
        }
        Animator animatorM132180z = gt0.m132180z(animatorM181141U0, animatorM181142V0, animatorM181150q0, animatorM181151r0, animatorM181148o0, animatorM181139S0);
        this.f162718M = animatorM132180z;
        animatorM132180z.setInterpolator(new DecelerateInterpolator());
        this.f162718M.setDuration(300L);
        this.f162718M.addListener(new C19820c(z));
        this.f162718M.start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ydx ydxVar) {
        this.f162711F = ydxVar;
    }

    /* JADX INFO: renamed from: o0 */
    public final Animator m181148o0(boolean z, int i, int i2) {
        return gt0.m132166l(this.f162735q, View.TRANSLATION_Y, 0L, i, new DecelerateInterpolator(), z ? 0.0f : i2, z ? i2 : 0.0f);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m181149p0(String str, String str2, int i, User user) {
        tye.m193572c().m193583l(str2);
        d810.m114775h(getAct(), user, str, false, new RunnableC19819b());
    }

    /* JADX INFO: renamed from: q0 */
    public final Animator m181150q0(boolean z, int i, int i2, int i3) {
        int iM175859d = i2;
        Property property = View.TRANSLATION_X;
        float fM175859d = z ? qa00.m175859d(28.0f) : iM175859d;
        if (!z) {
            iM175859d = qa00.m175859d(28.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, fM175859d, iM175859d);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f162726h, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f162727i, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return gt0.m132180z(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
    }

    /* JADX INFO: renamed from: r0 */
    public final Animator m181151r0(boolean z, int i, int i2, int i3) {
        int i4 = i2;
        Property property = View.TRANSLATION_X;
        float f = z ? -qa00.m175859d(10.0f) : i4;
        if (!z) {
            i4 = -qa00.m175859d(10.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, f, i4);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f162728j, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f162729k, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return gt0.m132180z(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
    }

    /* JADX INFO: renamed from: s0 */
    public void m181152s0(boolean z, int i) {
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) this.f162721c.getLayoutParams())).topMargin = bnl0.m105511F0() + qa00.f156328o;
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) this.f162709D.getLayoutParams())).topMargin = bnl0.m105511F0() + qa00.m175859d(7.0f);
        this.f162722d.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105524M(this.f162709D, false);
        if (i == 43) {
            bnl0.m105524M(this.f162734p, true);
            bnl0.m105524M(this.f162708C, false);
        } else if (i == 45) {
            bnl0.m105524M(this.f162734p, false);
            bnl0.m105524M(this.f162708C, true);
            bnl0.m105524M(this.f162709D, true);
            if (this.f162717L == null) {
                this.f162717L = new f0r(getAct());
            }
            getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.dex
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88103a.m181118u0();
                }
            });
            bnl0.m105509E0(this.f162719a, new View.OnClickListener() { // from class: l.eex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93679a.m181120v0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m181153w0(TextView textView, int i, KeyEvent keyEvent) {
        if (!qt4.f159383e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f162736r.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m82486a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f162716K.onClick(this.f162737s);
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m181154x0() {
        if (getAct() == null) {
            return;
        }
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m181155z0(View view) {
        getAct().m68056e2();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.qyl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.rex$c */
    public class C19820c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f162747a;

        public C19820c(boolean z) {
            this.f162747a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f162747a) {
                return;
            }
            bnl0.m105524M(rex.this.f162731m, true);
            bnl0.m105524M(rex.this.f162730l, true);
            bnl0.m105524M(rex.this.f162732n, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f162747a) {
                bnl0.m105524M(rex.this.f162731m, false);
                bnl0.m105524M(rex.this.f162730l, false);
                bnl0.m105524M(rex.this.f162732n, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.rex$a */
    public class C19818a implements TextWatcher {
        public C19818a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (gra.m131701j2()) {
                rex.this.f162737s.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            rex rexVar = rex.this;
            if (zIsEmpty) {
                bnl0.m105525M0(rexVar.f162737s, false);
            } else {
                bnl0.m105525M0(rexVar.f162737s, true);
            }
            rex.this.f162737s.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
