package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class sbx implements yvl<zax> {

    /* JADX INFO: renamed from: A */
    public FrameLayout f163639A;

    /* JADX INFO: renamed from: B */
    public VText f163640B;

    /* JADX INFO: renamed from: C */
    public TextView f163641C;

    /* JADX INFO: renamed from: D */
    public VImage f163642D;

    /* JADX INFO: renamed from: E */
    public MatchAct f163643E;

    /* JADX INFO: renamed from: F */
    public zax f163644F;

    /* JADX INFO: renamed from: H */
    public int f163646H;

    /* JADX INFO: renamed from: L */
    public fyq f163650L;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f163652a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f163653b;

    /* JADX INFO: renamed from: c */
    public VImage f163654c;

    /* JADX INFO: renamed from: d */
    public VText f163655d;

    /* JADX INFO: renamed from: e */
    public TextView f163656e;

    /* JADX INFO: renamed from: f */
    public VText f163657f;

    /* JADX INFO: renamed from: g */
    public Guideline f163658g;

    /* JADX INFO: renamed from: h */
    public VRelative f163659h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f163660i;

    /* JADX INFO: renamed from: j */
    public VRelative f163661j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f163662k;

    /* JADX INFO: renamed from: l */
    public VImage f163663l;

    /* JADX INFO: renamed from: m */
    public VImage f163664m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f163665n;

    /* JADX INFO: renamed from: o */
    public TextView f163666o;

    /* JADX INFO: renamed from: p */
    public TextView f163667p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f163668q;

    /* JADX INFO: renamed from: r */
    public VEditText f163669r;

    /* JADX INFO: renamed from: s */
    public VText f163670s;

    /* JADX INFO: renamed from: t */
    public VLinear f163671t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f163672u;

    /* JADX INFO: renamed from: v */
    public VText f163673v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f163674w;

    /* JADX INFO: renamed from: x */
    public VText f163675x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f163676y;

    /* JADX INFO: renamed from: z */
    public VText f163677z;

    /* JADX INFO: renamed from: G */
    public boolean f163645G = false;

    /* JADX INFO: renamed from: I */
    public int f163647I = 0;

    /* JADX INFO: renamed from: J */
    public User f163648J = null;

    /* JADX INFO: renamed from: K */
    public final View.OnClickListener f163649K = new View.OnClickListener() { // from class: l.abx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f68754a.m183326y0(view);
        }
    };

    /* JADX INFO: renamed from: M */
    public Animator f163651M = null;

    /* JADX INFO: renamed from: l.sbx$b */
    public class RunnableC19902b implements Runnable {
        public RunnableC19902b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sbx.this.getAct() == null) {
                return;
            }
            sbx.this.getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: l.sbx$d */
    public static class C19904d {
        /* JADX INFO: renamed from: b */
        public static void m183359b(sbx sbxVar, View view) {
            sbxVar.f163652a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            sbxVar.f163653b = (SVGAnimationView) viewGroup.getChildAt(0);
            sbxVar.f163654c = (VImage) viewGroup.getChildAt(1);
            sbxVar.f163655d = (VText) viewGroup.getChildAt(2);
            sbxVar.f163656e = (TextView) viewGroup.getChildAt(3);
            sbxVar.f163657f = (VText) viewGroup.getChildAt(4);
            sbxVar.f163658g = (Guideline) viewGroup.getChildAt(5);
            sbxVar.f163659h = (VRelative) viewGroup.getChildAt(6);
            sbxVar.f163660i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            sbxVar.f163661j = (VRelative) viewGroup.getChildAt(7);
            sbxVar.f163662k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
            sbxVar.f163663l = (VImage) viewGroup.getChildAt(8);
            sbxVar.f163664m = (VImage) viewGroup.getChildAt(9);
            sbxVar.f163665n = (VDraweeView) viewGroup.getChildAt(10);
            sbxVar.f163666o = (TextView) viewGroup.getChildAt(11);
            sbxVar.f163667p = (TextView) viewGroup.getChildAt(12);
            sbxVar.f163668q = (LinearLayout) viewGroup.getChildAt(13);
            sbxVar.f163669r = (VEditText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            sbxVar.f163670s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            sbxVar.f163671t = (VLinear) viewGroup.getChildAt(14);
            sbxVar.f163672u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
            sbxVar.f163673v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0)).getChildAt(0);
            sbxVar.f163674w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2);
            sbxVar.f163675x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2)).getChildAt(0);
            sbxVar.f163676y = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4);
            sbxVar.f163677z = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4)).getChildAt(0);
            sbxVar.f163639A = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6);
            sbxVar.f163640B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6)).getChildAt(0);
            sbxVar.f163641C = (TextView) viewGroup.getChildAt(15);
            sbxVar.f163642D = (VImage) viewGroup.getChildAt(16);
        }

        /* JADX INFO: renamed from: c */
        public static View m183360c(sbx sbxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95893m7, viewGroup, false);
            m183359b(sbxVar, viewInflate);
            return viewInflate;
        }
    }

    public sbx(MatchAct matchAct) {
        this.f163643E = matchAct;
    }

    /* JADX INFO: renamed from: O0 */
    private Animator m183279O0(int i) {
        return bt0.m103753z(m183290W0(i, 500, t100.m186890d(60.0f), 0), m183307i0(500, 0, 1), bt0.m103739l(this.f163654c, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f163654c, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), t100.m186890d(40.0f), 0.0f), m183347j0(400, 100, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: P0 */
    private Animator m183281P0() {
        this.f163659h.setTranslationX(-t100.m186890d(108.0f));
        this.f163661j.setTranslationX(t100.m186890d(108.0f));
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f163659h;
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vRelative, property, 200L, 700L, wqf0Var, -t100.m186890d(108.0f), t100.m186890d(28.0f));
        Animator animatorM103739l2 = bt0.m103739l(this.f163661j, property, 200L, 700L, wqf0Var, t100.m186890d(108.0f), -t100.m186890d(10.0f));
        VRelative vRelative2 = this.f163659h;
        Property property2 = View.ALPHA;
        return bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f163661j, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: R0 */
    private void m183284R0() {
        SVGALoader.with(getAct()).from("https://fe-static.tancdn.com/v1/raw/6359b74d-b432-4c84-9eb3-811b887a9bdf14.svga").autoPlay(true).repeatCount(1).into(this.f163653b);
    }

    /* JADX INFO: renamed from: W0 */
    private Animator m183290W0(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f163666o;
        Property property = View.TRANSLATION_Y;
        long j = i2;
        float f = i3;
        float f2 = i4;
        return bt0.m103753z(bt0.m103739l(this.f163655d, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163656e, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(textView, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: i0 */
    private Animator m183307i0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VText vText = this.f163655d;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.m103753z(bt0.m103739l(vText, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163656e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: l0 */
    private void m183311l0() {
        m183348k0(false);
    }

    /* JADX INFO: renamed from: m0 */
    private void m183313m0() {
        m183348k0(true);
    }

    /* JADX INFO: renamed from: t0 */
    private void m183318t0() {
        this.f163669r.addTextChangedListener(new C19901a());
        this.f163669r.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ibx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f112390a.m183355w0(textView, i, keyEvent);
            }
        });
        xdl0.m208329E0(this.f163670s, this.f163649K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m183320u0() {
        this.f163650L.m123795h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m183322v0(View view) {
        getAct().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m183326y0(View view) {
        String strTrim = this.f163669r.getText().toString().trim();
        if (upa.m194770j2()) {
            tz00.m191126h(getAct(), this.f163648J, strTrim, true, new Runnable() { // from class: l.qbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153712a.m183356x0();
                }
            });
        } else {
            this.f163644F.m217798u1(strTrim, this.f163645G);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m183328A0(User user, View view) {
        getAct().startActivity(ProfileAct.m50736n2(getAct(), user.f56011id, "from_match", false));
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m183329B0(User user, View view) {
        getAct().startActivity(ProfileAct.m50736n2(getAct(), user.f56011id, "from_match", false));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163643E;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m183330D0(View view) {
        this.f163644F.m217799v1(false);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m183331E0(View view) {
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m183332G0(View view) {
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m183333H0(View view) {
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m183334I0() {
        this.f163657f.setAlpha(0.0f);
        xdl0.m208344M(this.f163657f, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m183335J0() {
        this.f163657f.setAlpha(0.0f);
        xdl0.m208344M(this.f163657f, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m183336K0(User user, View view) {
        m183351p0("[" + getAct().getString(R$string.f18704lj) + Constants.AES_SUFFIX, "NEW_EMOJI_HAHE", 1, user);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m183337L0(User user, View view) {
        m183351p0("[" + getAct().getString(R$string.f18673kj) + Constants.AES_SUFFIX, "NEW_EMOJI_BEER", 2, user);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m183338M0(User user, View view) {
        m183351p0("[" + getAct().getString(R$string.f18567h4) + Constants.AES_SUFFIX, "EMOJI_70", 3, user);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m183339N0(User user, View view) {
        m183351p0("[" + getAct().getString(R$string.f18536g4) + Constants.AES_SUFFIX, "EMOJI_63", 4, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m183340Q0(final User user, final User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.m81304b(user);
            NullChecker.m81304b(user2);
            getAct().m66873d2();
            return;
        }
        this.f163648J = user2;
        if (i == 45) {
            xdl0.m208344M(this.f163668q, true);
            xdl0.m208344M(this.f163671t, true);
            xdl0.m208344M(this.f163666o, false);
            this.f163655d.setText("SVIP配对成功");
            this.f163656e.setText("谁喜欢我特权已生效，\n帮你大幅提升配对概率！");
            this.f163657f.setText("打个招呼");
            xdl0.m208329E0(this.f163660i, new View.OnClickListener() { // from class: l.jbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117226a.m183328A0(user, view);
                }
            });
            xdl0.m208329E0(this.f163662k, new View.OnClickListener() { // from class: l.kbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122271a.m183329B0(user2, view);
                }
            });
            this.f163641C.setText("继续探索");
            m183318t0();
            m183342T0(user2);
        } else {
            LinearLayout linearLayout = this.f163668q;
            if (i == 43) {
                xdl0.m208344M(linearLayout, false);
                xdl0.m208344M(this.f163671t, false);
                boolean zM117220b = emr.INSTANCE.m117220b();
                VText vText = this.f163655d;
                if (zM117220b) {
                    vText.setText(String.format("%s喜欢了你", user2.isFemale() ? "她" : "他"));
                    this.f163656e.setText(String.format("试用解密谁喜欢我特权，立即和%s聊天", user2.isFemale() ? "她" : "他"));
                } else {
                    vText.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                    this.f163656e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                }
                this.f163666o.setText("发消息");
                this.f163667p.setText(String.format("放弃%s", user2.isFemale() ? "她" : "他"));
                xdl0.m208329E0(this.f163666o, new View.OnClickListener() { // from class: l.lbx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f127349a.m183330D0(view);
                    }
                });
            } else {
                xdl0.m208344M(linearLayout, false);
                xdl0.m208344M(this.f163671t, false);
                this.f163655d.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f163656e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f163666o.setText("继续探索");
                this.f163667p.setText("继续探索");
                xdl0.m208329E0(this.f163666o, new View.OnClickListener() { // from class: l.mbx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f133067a.m183331E0(view);
                    }
                });
            }
        }
        xdl0.m208329E0(this.f163667p, new View.OnClickListener() { // from class: l.nbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138077a.m183332G0(view);
            }
        });
        xdl0.m208329E0(this.f163641C, new View.OnClickListener() { // from class: l.obx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142987a.m183333H0(view);
            }
        });
        xdl0.m208329E0(this.f163642D, new View.OnClickListener() { // from class: l.pbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148121a.m183357z0(view);
            }
        });
        qib0.f154691G.m102327J0(this.f163660i, user.m60124fp().profileMiddle(), false);
        qib0.f154691G.m102327J0(this.f163662k, user2.m60124fp().profileMiddle(), false);
        qib0.f154691G.m102325I0(this.f163665n, user2.isFemale() ? "https://static.tancdn.com/pe-webplatform/wYCGSOB598qnOBOaxgSNC6Ke.webp" : "https://static.tancdn.com/pe-webplatform/11RRvmgTlw6-1KRaLGFnlfqk.webp", t100.m186890d(106.0f), t100.m186890d(71.0f));
    }

    /* JADX INFO: renamed from: S0 */
    public final Animator m183341S0(boolean z, int i) {
        Animator animatorM103741n = bt0.m103741n(this.f163657f, View.ALPHA, 0.0f, i, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        if (z) {
            bt0.m103749v(animatorM103741n, new Runnable() { // from class: l.gbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101922a.m183334I0();
                }
            });
            return animatorM103741n;
        }
        bt0.m103733f(animatorM103741n, new Runnable() { // from class: l.hbx
            @Override // java.lang.Runnable
            public final void run() {
                this.f106980a.m183335J0();
            }
        });
        return animatorM103741n;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m183342T0(final User user) {
        this.f163673v.setText("[" + getAct().getString(R$string.f18704lj) + Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f163672u, new View.OnClickListener() { // from class: l.rbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158694a.m183336K0(user, view);
            }
        });
        this.f163675x.setText("[" + getAct().getString(R$string.f18673kj) + Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f163674w, new View.OnClickListener() { // from class: l.bbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74887a.m183337L0(user, view);
            }
        });
        this.f163677z.setText("[" + getAct().getString(R$string.f18567h4) + Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f163676y, new View.OnClickListener() { // from class: l.cbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80186a.m183338M0(user, view);
            }
        });
        this.f163640B.setText("[" + getAct().getString(R$string.f18536g4) + Constants.AES_SUFFIX);
        xdl0.m208329E0(this.f163639A, new View.OnClickListener() { // from class: l.dbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85346a.m183339N0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m183343U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VImage vImage = this.f163654c;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.m103753z(bt0.m103739l(vImage, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163655d, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163656e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: V0 */
    public final Animator m183344V0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        VImage vImage = this.f163654c;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.m103753z(bt0.m103739l(vImage, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163655d, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f163656e, property, 0L, j, decelerateInterpolator, f, f2));
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        m183284R0();
        return bt0.m103753z(m183281P0(), m183279O0(this.f163644F.m217789d1()));
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return bt0.m103737j(1);
    }

    /* JADX INFO: renamed from: g0 */
    public View m183345g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19904d.m183360c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
        if (this.f163644F.m217789d1() == 45) {
            int i3 = this.f163646H;
            if (i - i3 > 0 || i > 0) {
                this.f163647I = i;
                if (!this.f163645G || i3 != i) {
                    m183313m0();
                }
                this.f163645G = true;
            } else if (i - i3 < 0) {
                if (this.f163645G) {
                    m183311l0();
                }
                this.f163645G = false;
            }
            this.f163646H = i;
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f163643E;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183345g0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final Animator m183347j0(int i, int i2, float f, float f2) {
        this.f163663l.setAlpha(0.0f);
        this.f163664m.setAlpha(0.0f);
        this.f163665n.setAlpha(0.0f);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (!xdl0.m208349O0(this.f163667p)) {
            VImage vImage = this.f163663l;
            Property property = View.ALPHA;
            long j = i;
            long j2 = i2;
            return bt0.m103753z(bt0.m103739l(vImage, property, j, j2, decelerateInterpolator, f, f2), bt0.m103739l(this.f163664m, property, j, j2, decelerateInterpolator, f, f2), bt0.m103739l(this.f163665n, property, j, j2, decelerateInterpolator, f, f2));
        }
        this.f163667p.setAlpha(0.0f);
        VImage vImage2 = this.f163663l;
        Property property2 = View.ALPHA;
        long j3 = i;
        long j4 = i2;
        return bt0.m103753z(bt0.m103739l(vImage2, property2, j3, j4, decelerateInterpolator, f, f2), bt0.m103739l(this.f163664m, property2, j3, j4, decelerateInterpolator, f, f2), bt0.m103739l(this.f163665n, property2, j3, j4, decelerateInterpolator, f, f2), bt0.m103739l(this.f163667p, property2, j3, j4, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: k0 */
    public void m183348k0(boolean z) {
        int iMax = Math.max(this.f163647I, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
        this.f163647I = iMax;
        int iM208412y0 = xdl0.m208412y0() / 2;
        int iM208408w0 = xdl0.m208408w0();
        Animator animatorM183343U0 = m183343U0(300, z ? 1 : 0, !z ? 1 : 0);
        int iM186890d = t100.m186890d(40.0f) * (-1);
        int i = z ? 0 : iM186890d;
        if (!z) {
            iM186890d = 0;
        }
        Animator animatorM183344V0 = m183344V0(300, i, iM186890d);
        int i2 = iM208408w0 - iMax;
        Animator animatorM183352q0 = m183352q0(z, 300, iM208412y0 - (this.f163659h.getRight() - (this.f163659h.getMeasuredWidth() / 2)), (i2 - t100.m186890d(112.0f)) - this.f163659h.getBottom());
        Animator animatorM183353r0 = m183353r0(z, 300, iM208412y0 - (this.f163661j.getLeft() + (this.f163661j.getMeasuredWidth() / 2)), (i2 - t100.m186890d(112.0f)) - this.f163661j.getBottom());
        Animator animatorM183350o0 = m183350o0(z, 300, i2 - this.f163668q.getBottom());
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f163657f.getLayoutParams();
        int iM186890d2 = iMax + t100.m186890d(380.0f);
        if (((ViewGroup.MarginLayoutParams) c0220a).bottomMargin != iM186890d2) {
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = iM186890d2;
            this.f163657f.setLayoutParams(c0220a);
        }
        Animator animatorM183341S0 = m183341S0(z, 300);
        if (NullChecker.m81303a(this.f163651M)) {
            this.f163651M.cancel();
        }
        Animator animatorM103753z = bt0.m103753z(animatorM183343U0, animatorM183344V0, animatorM183352q0, animatorM183353r0, animatorM183350o0, animatorM183341S0);
        this.f163651M = animatorM103753z;
        animatorM103753z.setInterpolator(new DecelerateInterpolator());
        this.f163651M.setDuration(300L);
        this.f163651M.addListener(new C19903c(z));
        this.f163651M.start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zax zaxVar) {
        this.f163644F = zaxVar;
    }

    /* JADX INFO: renamed from: o0 */
    public final Animator m183350o0(boolean z, int i, int i2) {
        return bt0.m103739l(this.f163668q, View.TRANSLATION_Y, 0L, i, new DecelerateInterpolator(), z ? 0.0f : i2, z ? i2 : 0.0f);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m183351p0(String str, String str2, int i, User user) {
        pxe.m171835c().m171846l(str2);
        tz00.m191126h(getAct(), user, str, false, new RunnableC19902b());
    }

    /* JADX INFO: renamed from: q0 */
    public final Animator m183352q0(boolean z, int i, int i2, int i3) {
        int iM186890d = i2;
        Property property = View.TRANSLATION_X;
        float fM186890d = z ? t100.m186890d(28.0f) : iM186890d;
        if (!z) {
            iM186890d = t100.m186890d(28.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, fM186890d, iM186890d);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f163659h, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f163660i, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return bt0.m103753z(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
    }

    /* JADX INFO: renamed from: r0 */
    public final Animator m183353r0(boolean z, int i, int i2, int i3) {
        int i4 = i2;
        Property property = View.TRANSLATION_X;
        float f = z ? -t100.m186890d(10.0f) : i4;
        if (!z) {
            i4 = -t100.m186890d(10.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, f, i4);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f163661j, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f163662k, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return bt0.m103753z(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
    }

    /* JADX INFO: renamed from: s0 */
    public void m183354s0(boolean z, int i) {
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) this.f163654c.getLayoutParams())).topMargin = xdl0.m208331F0() + t100.f167266o;
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) this.f163642D.getLayoutParams())).topMargin = xdl0.m208331F0() + t100.m186890d(7.0f);
        this.f163655d.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208344M(this.f163642D, false);
        if (i == 43) {
            xdl0.m208344M(this.f163667p, true);
            xdl0.m208344M(this.f163641C, false);
        } else if (i == 45) {
            xdl0.m208344M(this.f163667p, false);
            xdl0.m208344M(this.f163641C, true);
            xdl0.m208344M(this.f163642D, true);
            if (this.f163650L == null) {
                this.f163650L = new fyq(getAct());
            }
            getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.ebx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90393a.m183320u0();
                }
            });
            xdl0.m208329E0(this.f163652a, new View.OnClickListener() { // from class: l.fbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96757a.m183322v0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m183355w0(TextView textView, int i, KeyEvent keyEvent) {
        if (!rs4.f160804e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f163669r.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m81303a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f163649K.onClick(this.f163670s);
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m183356x0() {
        if (getAct() == null) {
            return;
        }
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m183357z0(View view) {
        getAct().m66873d2();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.sbx$c */
    public class C19903c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f163680a;

        public C19903c(boolean z) {
            this.f163680a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f163680a) {
                return;
            }
            xdl0.m208344M(sbx.this.f163664m, true);
            xdl0.m208344M(sbx.this.f163663l, true);
            xdl0.m208344M(sbx.this.f163665n, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f163680a) {
                xdl0.m208344M(sbx.this.f163664m, false);
                xdl0.m208344M(sbx.this.f163663l, false);
                xdl0.m208344M(sbx.this.f163665n, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.sbx$a */
    public class C19901a implements TextWatcher {
        public C19901a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (upa.m194770j2()) {
                sbx.this.f163670s.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            sbx sbxVar = sbx.this;
            if (zIsEmpty) {
                xdl0.m208345M0(sbxVar.f163670s, false);
            } else {
                xdl0.m208345M0(sbxVar.f163670s, true);
            }
            sbx.this.f163670s.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
