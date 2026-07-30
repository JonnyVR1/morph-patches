package p003l;

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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bt0;
import l.emr;
import l.f6c0;
import l.fyq;
import l.qib0;
import l.rs4;
import l.t100;
import l.tz00;
import l.upa;
import l.wqf0;
import l.xdl0;
import org.eclipse.jetty.http.HttpStatus;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sbx implements yvl<zax> {

    /* JADX INFO: renamed from: A */
    public FrameLayout f7172A;

    /* JADX INFO: renamed from: B */
    public VText f7173B;

    /* JADX INFO: renamed from: C */
    public TextView f7174C;

    /* JADX INFO: renamed from: D */
    public VImage f7175D;

    /* JADX INFO: renamed from: E */
    public MatchAct f7176E;

    /* JADX INFO: renamed from: F */
    public zax f7177F;

    /* JADX INFO: renamed from: H */
    public int f7179H;

    /* JADX INFO: renamed from: L */
    public fyq f7183L;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f7185a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f7186b;

    /* JADX INFO: renamed from: c */
    public VImage f7187c;

    /* JADX INFO: renamed from: d */
    public VText f7188d;

    /* JADX INFO: renamed from: e */
    public TextView f7189e;

    /* JADX INFO: renamed from: f */
    public VText f7190f;

    /* JADX INFO: renamed from: g */
    public Guideline f7191g;

    /* JADX INFO: renamed from: h */
    public VRelative f7192h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7193i;

    /* JADX INFO: renamed from: j */
    public VRelative f7194j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f7195k;

    /* JADX INFO: renamed from: l */
    public VImage f7196l;

    /* JADX INFO: renamed from: m */
    public VImage f7197m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f7198n;

    /* JADX INFO: renamed from: o */
    public TextView f7199o;

    /* JADX INFO: renamed from: p */
    public TextView f7200p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f7201q;

    /* JADX INFO: renamed from: r */
    public VEditText f7202r;

    /* JADX INFO: renamed from: s */
    public VText f7203s;

    /* JADX INFO: renamed from: t */
    public VLinear f7204t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f7205u;

    /* JADX INFO: renamed from: v */
    public VText f7206v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f7207w;

    /* JADX INFO: renamed from: x */
    public VText f7208x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f7209y;

    /* JADX INFO: renamed from: z */
    public VText f7210z;

    /* JADX INFO: renamed from: G */
    public boolean f7178G = false;

    /* JADX INFO: renamed from: I */
    public int f7180I = 0;

    /* JADX INFO: renamed from: J */
    public User f7181J = null;

    /* JADX INFO: renamed from: K */
    public final View.OnClickListener f7182K = new View.OnClickListener() { // from class: l.abx
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f2105a.m7517y0(view);
        }
    };

    /* JADX INFO: renamed from: M */
    public Animator f7184M = null;

    /* JADX INFO: renamed from: l.sbx$b */
    public class RunnableC0526b implements Runnable {
        public RunnableC0526b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sbx.this.act() == null) {
                return;
            }
            sbx.this.act().finish();
        }
    }

    /* JADX INFO: renamed from: l.sbx$d */
    public static class C0528d {
        /* JADX INFO: renamed from: b */
        public static void m7552b(sbx sbxVar, View view) {
            sbxVar.f7185a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            sbxVar.f7186b = viewGroup.getChildAt(0);
            sbxVar.f7187c = (VImage) viewGroup.getChildAt(1);
            sbxVar.f7188d = (VText) viewGroup.getChildAt(2);
            sbxVar.f7189e = (TextView) viewGroup.getChildAt(3);
            sbxVar.f7190f = (VText) viewGroup.getChildAt(4);
            sbxVar.f7191g = viewGroup.getChildAt(5);
            sbxVar.f7192h = (VRelative) viewGroup.getChildAt(6);
            sbxVar.f7193i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            sbxVar.f7194j = (VRelative) viewGroup.getChildAt(7);
            sbxVar.f7195k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
            sbxVar.f7196l = (VImage) viewGroup.getChildAt(8);
            sbxVar.f7197m = (VImage) viewGroup.getChildAt(9);
            sbxVar.f7198n = (VDraweeView) viewGroup.getChildAt(10);
            sbxVar.f7199o = (TextView) viewGroup.getChildAt(11);
            sbxVar.f7200p = (TextView) viewGroup.getChildAt(12);
            sbxVar.f7201q = (LinearLayout) viewGroup.getChildAt(13);
            sbxVar.f7202r = (VEditText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            sbxVar.f7203s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            sbxVar.f7204t = (VLinear) viewGroup.getChildAt(14);
            sbxVar.f7205u = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0);
            sbxVar.f7206v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(0)).getChildAt(0);
            sbxVar.f7207w = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2);
            sbxVar.f7208x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(2)).getChildAt(0);
            sbxVar.f7209y = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4);
            sbxVar.f7210z = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(4)).getChildAt(0);
            sbxVar.f7172A = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6);
            sbxVar.f7173B = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(14)).getChildAt(6)).getChildAt(0);
            sbxVar.f7174C = (TextView) viewGroup.getChildAt(15);
            sbxVar.f7175D = (VImage) viewGroup.getChildAt(16);
        }

        /* JADX INFO: renamed from: c */
        public static View m7553c(sbx sbxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.m7, viewGroup, false);
            m7552b(sbxVar, viewInflate);
            return viewInflate;
        }
    }

    public sbx(MatchAct matchAct) {
        this.f7176E = matchAct;
    }

    /* JADX INFO: renamed from: O0 */
    private Animator m7470O0(int i) {
        return bt0.z(new Animator[]{m7481W0(i, HttpStatus.INTERNAL_SERVER_ERROR_500, t100.d(60.0f), 0), m7498i0(HttpStatus.INTERNAL_SERVER_ERROR_500, 0, 1), bt0.l(this.f7187c, View.ALPHA, 0L, 500L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f7187c, View.TRANSLATION_Y, 0L, 500L, new DecelerateInterpolator(), new float[]{t100.d(40.0f), 0.0f}), m7540j0(HttpStatus.BAD_REQUEST_400, 100, 0.0f, 1.0f)});
    }

    /* JADX INFO: renamed from: P0 */
    private Animator m7472P0() {
        this.f7192h.setTranslationX(-t100.d(108.0f));
        this.f7194j.setTranslationX(t100.d(108.0f));
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f7192h;
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(vRelative, property, 200L, 700L, wqf0Var, new float[]{-t100.d(108.0f), t100.d(28.0f)});
        Animator animatorL2 = bt0.l(this.f7194j, property, 200L, 700L, wqf0Var, new float[]{t100.d(108.0f), -t100.d(10.0f)});
        VRelative vRelative2 = this.f7192h;
        Property property2 = View.ALPHA;
        return bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f7194j, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: R0 */
    private void m7475R0() {
        SVGALoader.with(act()).from("https://fe-static.tancdn.com/v1/raw/6359b74d-b432-4c84-9eb3-811b887a9bdf14.svga").autoPlay(true).repeatCount(1).into(this.f7186b);
    }

    /* JADX INFO: renamed from: W0 */
    private Animator m7481W0(int i, int i2, int i3, int i4) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f7199o;
        Property property = View.TRANSLATION_Y;
        long j = i2;
        float f = i3;
        float f2 = i4;
        return bt0.z(new Animator[]{bt0.l(this.f7188d, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7189e, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(textView, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    /* JADX INFO: renamed from: i0 */
    private Animator m7498i0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        AppCompatTextView appCompatTextView = this.f7188d;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.z(new Animator[]{bt0.l(appCompatTextView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7189e, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    /* JADX INFO: renamed from: l0 */
    private void m7502l0() {
        m7541k0(false);
    }

    /* JADX INFO: renamed from: m0 */
    private void m7504m0() {
        m7541k0(true);
    }

    /* JADX INFO: renamed from: t0 */
    private void m7509t0() {
        this.f7202r.addTextChangedListener(new C0525a());
        this.f7202r.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ibx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f4387a.m7548w0(textView, i, keyEvent);
            }
        });
        xdl0.E0(this.f7203s, this.f7182K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m7511u0() {
        this.f7183L.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m7513v0(View view) {
        act().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m7517y0(View view) {
        String strTrim = this.f7202r.getText().toString().trim();
        if (upa.j2()) {
            tz00.h(act(), this.f7181J, strTrim, true, new Runnable() { // from class: l.qbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6623a.m7549x0();
                }
            });
        } else {
            this.f7177F.m9385u1(strTrim, this.f7178G);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m7519A0(User user, View view) {
        act().startActivity(ProfileAct.n2(act(), ((DbObject) user).id, "from_match", false));
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m7520B0(User user, View view) {
        act().startActivity(ProfileAct.n2(act(), ((DbObject) user).id, "from_match", false));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7521C0() {
        return this.f7176E;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m7522D0(View view) {
        this.f7177F.m9386v1(false);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m7523E0(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m7524G0(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m7525H0(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m7526I0() {
        this.f7190f.setAlpha(0.0f);
        xdl0.M(this.f7190f, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m7527J0() {
        this.f7190f.setAlpha(0.0f);
        xdl0.M(this.f7190f, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m7528K0(User user, View view) {
        m7544p0("[" + act().getString(R.string.lj) + "]", "NEW_EMOJI_HAHE", 1, user);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m7529L0(User user, View view) {
        m7544p0("[" + act().getString(R.string.kj) + "]", "NEW_EMOJI_BEER", 2, user);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m7530M0(User user, View view) {
        m7544p0("[" + act().getString(R.string.h4) + "]", "EMOJI_70", 3, user);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m7531N0(User user, View view) {
        m7544p0("[" + act().getString(R.string.g4) + "]", "EMOJI_63", 4, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m7532Q0(final User user, final User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.b(user);
            NullChecker.b(user2);
            act().finish();
            return;
        }
        this.f7181J = user2;
        if (i == 45) {
            xdl0.M(this.f7201q, true);
            xdl0.M(this.f7204t, true);
            xdl0.M(this.f7199o, false);
            this.f7188d.setText("SVIP配对成功");
            this.f7189e.setText("谁喜欢我特权已生效，\n帮你大幅提升配对概率！");
            this.f7190f.setText("打个招呼");
            xdl0.E0(this.f7193i, new View.OnClickListener() { // from class: l.jbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4613a.m7519A0(user, view);
                }
            });
            xdl0.E0(this.f7195k, new View.OnClickListener() { // from class: l.kbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4894a.m7520B0(user2, view);
                }
            });
            this.f7174C.setText("继续探索");
            m7509t0();
            m7534T0(user2);
        } else {
            LinearLayout linearLayout = this.f7201q;
            if (i == 43) {
                xdl0.M(linearLayout, false);
                xdl0.M(this.f7204t, false);
                boolean zB = emr.INSTANCE.b();
                AppCompatTextView appCompatTextView = this.f7188d;
                if (zB) {
                    appCompatTextView.setText(String.format("%s喜欢了你", user2.isFemale() ? "她" : "他"));
                    this.f7189e.setText(String.format("试用解密谁喜欢我特权，立即和%s聊天", user2.isFemale() ? "她" : "他"));
                } else {
                    appCompatTextView.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                    this.f7189e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                }
                this.f7199o.setText("发消息");
                this.f7200p.setText(String.format("放弃%s", user2.isFemale() ? "她" : "他"));
                xdl0.E0(this.f7199o, new View.OnClickListener() { // from class: l.lbx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5252a.m7522D0(view);
                    }
                });
            } else {
                xdl0.M(linearLayout, false);
                xdl0.M(this.f7204t, false);
                this.f7188d.setText(String.format("和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f7189e.setText(String.format("开通SVIP会员立即和%s聊天", user2.isFemale() ? "她" : "他"));
                this.f7199o.setText("继续探索");
                this.f7200p.setText("继续探索");
                xdl0.E0(this.f7199o, new View.OnClickListener() { // from class: l.mbx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5577a.m7523E0(view);
                    }
                });
            }
        }
        xdl0.E0(this.f7200p, new View.OnClickListener() { // from class: l.nbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5870a.m7524G0(view);
            }
        });
        xdl0.E0(this.f7174C, new View.OnClickListener() { // from class: l.obx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6094a.m7525H0(view);
            }
        });
        xdl0.E0(this.f7175D, new View.OnClickListener() { // from class: l.pbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6357a.m7550z0(view);
            }
        });
        qib0.G.J0(this.f7193i, user.fp().profileMiddle(), false);
        qib0.G.J0(this.f7195k, user2.fp().profileMiddle(), false);
        qib0.G.I0(this.f7198n, user2.isFemale() ? "https://static.tancdn.com/pe-webplatform/wYCGSOB598qnOBOaxgSNC6Ke.webp" : "https://static.tancdn.com/pe-webplatform/11RRvmgTlw6-1KRaLGFnlfqk.webp", t100.d(106.0f), t100.d(71.0f));
    }

    /* JADX INFO: renamed from: S0 */
    public final Animator m7533S0(boolean z, int i) {
        Animator animatorN = bt0.n(this.f7190f, View.ALPHA, new float[]{0.0f, i, z ? 0.0f : 1.0f, z ? 1.0f : 0.0f});
        if (z) {
            bt0.v(animatorN, new Runnable() { // from class: l.gbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3844a.m7526I0();
                }
            });
            return animatorN;
        }
        bt0.f(animatorN, new Runnable() { // from class: l.hbx
            @Override // java.lang.Runnable
            public final void run() {
                this.f4167a.m7527J0();
            }
        });
        return animatorN;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m7534T0(final User user) {
        this.f7206v.setText("[" + act().getString(R.string.lj) + "]");
        xdl0.E0(this.f7205u, new View.OnClickListener() { // from class: l.rbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6883a.m7528K0(user, view);
            }
        });
        this.f7208x.setText("[" + act().getString(R.string.kj) + "]");
        xdl0.E0(this.f7207w, new View.OnClickListener() { // from class: l.bbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2370a.m7529L0(user, view);
            }
        });
        this.f7210z.setText("[" + act().getString(R.string.h4) + "]");
        xdl0.E0(this.f7209y, new View.OnClickListener() { // from class: l.cbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2613a.m7530M0(user, view);
            }
        });
        this.f7173B.setText("[" + act().getString(R.string.g4) + "]");
        xdl0.E0(this.f7172A, new View.OnClickListener() { // from class: l.dbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2935a.m7531N0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final Animator m7535U0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        AppCompatImageView appCompatImageView = this.f7187c;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.z(new Animator[]{bt0.l(appCompatImageView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7188d, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7189e, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    /* JADX INFO: renamed from: V0 */
    public final Animator m7536V0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        AppCompatImageView appCompatImageView = this.f7187c;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.z(new Animator[]{bt0.l(appCompatImageView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7188d, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7189e, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        m7475R0();
        return bt0.z(new Animator[]{m7472P0(), m7470O0(this.f7177F.m9376d1())});
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return bt0.j(1);
    }

    /* JADX INFO: renamed from: g0 */
    public View m7537g0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0528d.m7553c(this, layoutInflater, viewGroup);
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
        if (this.f7177F.m9376d1() == 45) {
            int i3 = this.f7179H;
            if (i - i3 > 0 || i > 0) {
                this.f7180I = i;
                if (!this.f7178G || i3 != i) {
                    m7504m0();
                }
                this.f7178G = true;
            } else if (i - i3 < 0) {
                if (this.f7178G) {
                    m7502l0();
                }
                this.f7178G = false;
            }
            this.f7179H = i;
        }
    }

    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f7176E;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7537g0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final Animator m7540j0(int i, int i2, float f, float f2) {
        this.f7196l.setAlpha(0.0f);
        this.f7197m.setAlpha(0.0f);
        this.f7198n.setAlpha(0.0f);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (!xdl0.O0(this.f7200p)) {
            AppCompatImageView appCompatImageView = this.f7196l;
            Property property = View.ALPHA;
            long j = i;
            long j2 = i2;
            return bt0.z(new Animator[]{bt0.l(appCompatImageView, property, j, j2, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7197m, property, j, j2, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7198n, property, j, j2, decelerateInterpolator, new float[]{f, f2})});
        }
        this.f7200p.setAlpha(0.0f);
        AppCompatImageView appCompatImageView2 = this.f7196l;
        Property property2 = View.ALPHA;
        long j3 = i;
        long j4 = i2;
        return bt0.z(new Animator[]{bt0.l(appCompatImageView2, property2, j3, j4, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7197m, property2, j3, j4, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7198n, property2, j3, j4, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f7200p, property2, j3, j4, decelerateInterpolator, new float[]{f, f2})});
    }

    /* JADX INFO: renamed from: k0 */
    public void m7541k0(boolean z) {
        int iMax = Math.max(this.f7180I, Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
        this.f7180I = iMax;
        int iY0 = xdl0.y0() / 2;
        int iW0 = xdl0.w0();
        Animator animatorM7535U0 = m7535U0(HttpStatus.MULTIPLE_CHOICES_300, z ? 1 : 0, !z ? 1 : 0);
        int iD = t100.d(40.0f) * (-1);
        int i = z ? 0 : iD;
        if (!z) {
            iD = 0;
        }
        Animator animatorM7536V0 = m7536V0(HttpStatus.MULTIPLE_CHOICES_300, i, iD);
        int i2 = iW0 - iMax;
        Animator animatorM7545q0 = m7545q0(z, HttpStatus.MULTIPLE_CHOICES_300, iY0 - (this.f7192h.getRight() - (this.f7192h.getMeasuredWidth() / 2)), (i2 - t100.d(112.0f)) - this.f7192h.getBottom());
        Animator animatorM7546r0 = m7546r0(z, HttpStatus.MULTIPLE_CHOICES_300, iY0 - (this.f7194j.getLeft() + (this.f7194j.getMeasuredWidth() / 2)), (i2 - t100.d(112.0f)) - this.f7194j.getBottom());
        Animator animatorM7543o0 = m7543o0(z, HttpStatus.MULTIPLE_CHOICES_300, i2 - this.f7201q.getBottom());
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.f7190f.getLayoutParams();
        int iD2 = iMax + t100.d(380.0f);
        if (((ViewGroup.MarginLayoutParams) aVar).bottomMargin != iD2) {
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = iD2;
            this.f7190f.setLayoutParams(aVar);
        }
        Animator animatorM7533S0 = m7533S0(z, HttpStatus.MULTIPLE_CHOICES_300);
        if (NullChecker.a(this.f7184M)) {
            this.f7184M.cancel();
        }
        Animator animatorZ = bt0.z(new Animator[]{animatorM7535U0, animatorM7536V0, animatorM7545q0, animatorM7546r0, animatorM7543o0, animatorM7533S0});
        this.f7184M = animatorZ;
        animatorZ.setInterpolator(new DecelerateInterpolator());
        this.f7184M.setDuration(300L);
        this.f7184M.addListener(new C0527c(z));
        this.f7184M.start();
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void m7539i1(zax zaxVar) {
        this.f7177F = zaxVar;
    }

    /* JADX INFO: renamed from: o0 */
    public final Animator m7543o0(boolean z, int i, int i2) {
        return bt0.l(this.f7201q, View.TRANSLATION_Y, 0L, i, new DecelerateInterpolator(), new float[]{z ? 0.0f : i2, z ? i2 : 0.0f});
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7544p0(String str, String str2, int i, User user) {
        pxe.m6948c().m6959l(str2);
        tz00.h(act(), user, str, false, new RunnableC0526b());
    }

    /* JADX INFO: renamed from: q0 */
    public final Animator m7545q0(boolean z, int i, int i2, int i3) {
        int iD = i2;
        Property property = View.TRANSLATION_X;
        float fD = z ? t100.d(28.0f) : iD;
        if (!z) {
            iD = t100.d(28.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, fD, iD);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f7192h, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f7193i, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return bt0.z(new Animator[]{objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2});
    }

    /* JADX INFO: renamed from: r0 */
    public final Animator m7546r0(boolean z, int i, int i2, int i3) {
        int i4 = i2;
        Property property = View.TRANSLATION_X;
        float f = z ? -t100.d(10.0f) : i4;
        if (!z) {
            i4 = -t100.d(10.0f);
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, f, i4);
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, z ? 0.0f : i3, z ? i3 : 0.0f);
        Property property2 = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        Property property3 = View.SCALE_Y;
        PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.0674157f, z ? 1.0674157f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat((Property<?, Float>) property3, z ? 1.0f : 1.1445783f, z ? 1.1445783f : 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f7194j, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, propertyValuesHolderOfFloat4);
        long j = i;
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.f7195k, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
        objectAnimatorOfPropertyValuesHolder2.setDuration(j);
        return bt0.z(new Animator[]{objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2});
    }

    /* JADX INFO: renamed from: s0 */
    public void m7547s0(boolean z, int i) {
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.a) this.f7187c.getLayoutParams())).topMargin = xdl0.F0() + t100.o;
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.a) this.f7175D.getLayoutParams())).topMargin = xdl0.F0() + t100.d(7.0f);
        this.f7188d.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.M(this.f7175D, false);
        if (i == 43) {
            xdl0.M(this.f7200p, true);
            xdl0.M(this.f7174C, false);
        } else if (i == 45) {
            xdl0.M(this.f7200p, false);
            xdl0.M(this.f7174C, true);
            xdl0.M(this.f7175D, true);
            if (this.f7183L == null) {
                this.f7183L = new fyq(act());
            }
            act().getWindow().getDecorView().post(new Runnable() { // from class: l.ebx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3247a.m7511u0();
                }
            });
            xdl0.E0(this.f7185a, new View.OnClickListener() { // from class: l.fbx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3489a.m7513v0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m7548w0(TextView textView, int i, KeyEvent keyEvent) {
        if (!((Boolean) rs4.e.get()).booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f7202r.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f7182K.onClick(this.f7203s);
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m7549x0() {
        if (act() == null) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m7550z0(View view) {
        act().finish();
    }

    public void destroy() {
    }

    @Override // p003l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.sbx$c */
    public class C0527c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f7213a;

        public C0527c(boolean z) {
            this.f7213a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            if (this.f7213a) {
                return;
            }
            xdl0.M(sbx.this.f7197m, true);
            xdl0.M(sbx.this.f7196l, true);
            xdl0.M(sbx.this.f7198n, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            if (this.f7213a) {
                xdl0.M(sbx.this.f7197m, false);
                xdl0.M(sbx.this.f7196l, false);
                xdl0.M(sbx.this.f7198n, false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.sbx$a */
    public class C0525a implements TextWatcher {
        public C0525a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (upa.j2()) {
                sbx.this.f7203s.setTextColor(Color.parseColor(editable.toString().trim().isEmpty() ? "#33000000" : "#FE7E1D"));
            }
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            sbx sbxVar = sbx.this;
            if (zIsEmpty) {
                xdl0.M0(sbxVar.f7203s, false);
            } else {
                xdl0.M0(sbxVar.f7203s, true);
            }
            sbx.this.f7203s.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
