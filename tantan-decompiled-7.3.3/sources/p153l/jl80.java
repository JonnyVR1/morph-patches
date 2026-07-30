package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class jl80 extends g1e {

    /* JADX INFO: renamed from: j */
    public final C17971a f121487j;

    /* JADX INFO: renamed from: k */
    public VText f121488k;

    /* JADX INFO: renamed from: l */
    public VText f121489l;

    /* JADX INFO: renamed from: m */
    public VButton f121490m;

    /* JADX INFO: renamed from: n */
    public VButton f121491n;

    /* JADX INFO: renamed from: o */
    public VButton f121492o;

    /* JADX INFO: renamed from: p */
    public VText f121493p;

    /* JADX INFO: renamed from: q */
    public VText f121494q;

    /* JADX INFO: renamed from: r */
    public VImage f121495r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f121496s;

    /* JADX INFO: renamed from: t */
    public View f121497t;

    /* JADX INFO: renamed from: l.jl80$a */
    public static class C17971a {

        /* JADX INFO: renamed from: A */
        public DialogInterface.OnDismissListener f121498A;

        /* JADX INFO: renamed from: B */
        public DialogInterface.OnCancelListener f121499B;

        /* JADX INFO: renamed from: C */
        public Drawable f121500C;

        /* JADX INFO: renamed from: D */
        public int f121501D;

        /* JADX INFO: renamed from: a */
        public final Context f121507a;

        /* JADX INFO: renamed from: c */
        public CharSequence f121509c;

        /* JADX INFO: renamed from: d */
        public CharSequence f121510d;

        /* JADX INFO: renamed from: e */
        public CharSequence f121511e;

        /* JADX INFO: renamed from: g */
        public CharSequence f121513g;

        /* JADX INFO: renamed from: j */
        public CharSequence f121516j;

        /* JADX INFO: renamed from: k */
        public CharSequence f121517k;

        /* JADX INFO: renamed from: l */
        public Runnable f121518l;

        /* JADX INFO: renamed from: m */
        public Runnable f121519m;

        /* JADX INFO: renamed from: n */
        public Runnable f121520n;

        /* JADX INFO: renamed from: o */
        public Runnable f121521o;

        /* JADX INFO: renamed from: p */
        public boolean f121522p;

        /* JADX INFO: renamed from: q */
        public CharSequence f121523q;

        /* JADX INFO: renamed from: s */
        public Runnable f121525s;

        /* JADX INFO: renamed from: t */
        public int f121526t;

        /* JADX INFO: renamed from: u */
        public CharSequence f121527u;

        /* JADX INFO: renamed from: v */
        public View f121528v;

        /* JADX INFO: renamed from: w */
        public cf60 f121529w;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnShowListener f121532z;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f121508b = -1;

        /* JADX INFO: renamed from: f */
        public int f121512f = 17;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f121514h = -1;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f121515i = -1;

        /* JADX INFO: renamed from: r */
        public int f121524r = 0;

        /* JADX INFO: renamed from: x */
        public boolean f121530x = true;

        /* JADX INFO: renamed from: y */
        public boolean f121531y = true;

        /* JADX INFO: renamed from: E */
        public int f121502E = -1;

        /* JADX INFO: renamed from: F */
        public int f121503F = -1;

        /* JADX INFO: renamed from: G */
        public MovementMethod f121504G = null;

        /* JADX INFO: renamed from: H */
        public boolean f121505H = false;

        /* JADX INFO: renamed from: I */
        public boolean f121506I = false;

        public C17971a(@NonNull Context context) {
            this.f121507a = context;
            this.f121500C = context.getDrawable(abc0.f69581x);
        }

        /* JADX INFO: renamed from: M */
        public C17971a m146018M(boolean z) {
            this.f121531y = z;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C17971a m146019N(Drawable drawable) {
            this.f121500C = drawable;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public jl80 m146020O() {
            return new jl80(this);
        }

        /* JADX INFO: renamed from: P */
        public C17971a m146021P(boolean z) {
            this.f121530x = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C17971a m146022Q(@LayoutRes int i) {
            return m146023R(LayoutInflater.from(this.f121507a).inflate(i, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: R */
        public C17971a m146023R(View view) {
            this.f121528v = view;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C17971a m146024S(@DrawableRes int i) {
            this.f121508b = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C17971a m146025T(boolean z) {
            this.f121505H = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C17971a m146026U(@StringRes int i, Runnable runnable) {
            return m146029X(this.f121507a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: V */
        public C17971a m146027V(@StringRes int i, Object... objArr) {
            m146029X(this.f121507a.getString(i, objArr), this.f121525s);
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C17971a m146028W(CharSequence charSequence) {
            m146029X(charSequence, this.f121525s);
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C17971a m146029X(CharSequence charSequence, Runnable runnable) {
            this.f121523q = charSequence;
            this.f121525s = runnable;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C17971a m146030Y(@ColorInt int i) {
            this.f121524r = i;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C17971a m146031Z(@StringRes int i) {
            return m146034c0(this.f121507a.getString(i), this.f121518l);
        }

        /* JADX INFO: renamed from: a0 */
        public C17971a m146032a0(@StringRes int i, Runnable runnable) {
            return m146034c0(this.f121507a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: b0 */
        public C17971a m146033b0(CharSequence charSequence) {
            return m146034c0(charSequence, this.f121518l);
        }

        /* JADX INFO: renamed from: c0 */
        public C17971a m146034c0(CharSequence charSequence, Runnable runnable) {
            this.f121513g = charSequence;
            this.f121518l = runnable;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C17971a m146035d0(@DrawableRes int i) {
            this.f121514h = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C17971a m146036e0(boolean z) {
            this.f121522p = z;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C17971a m146037f0(@StringRes int i, Runnable runnable) {
            return m146039h0(this.f121507a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: g0 */
        public C17971a m146038g0(CharSequence charSequence) {
            return m146039h0(charSequence, this.f121519m);
        }

        /* JADX INFO: renamed from: h0 */
        public C17971a m146039h0(CharSequence charSequence, Runnable runnable) {
            this.f121516j = charSequence;
            this.f121519m = runnable;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C17971a m146040i0(@DrawableRes int i) {
            this.f121515i = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C17971a m146041j0(CharSequence charSequence) {
            this.f121517k = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C17971a m146042k0(CharSequence charSequence) {
            this.f121511e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: l0 */
        public C17971a m146043l0(DialogInterface.OnCancelListener onCancelListener) {
            this.f121499B = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m0 */
        public C17971a m146044m0(Runnable runnable) {
            this.f121521o = runnable;
            return this;
        }

        /* JADX INFO: renamed from: n0 */
        public C17971a m146045n0(DialogInterface.OnDismissListener onDismissListener) {
            this.f121498A = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C17971a m146046o0(DialogInterface.OnShowListener onShowListener) {
            this.f121532z = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C17971a m146047p0(boolean z) {
            this.f121506I = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C17971a m146048q0(int i) {
            this.f121512f = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public jl80 m146049r0() {
            jl80 jl80VarM146020O = m146020O();
            jl80VarM146020O.show();
            return jl80VarM146020O;
        }

        /* JADX INFO: renamed from: s0 */
        public C17971a m146050s0(@StringRes int i, Object... objArr) {
            return m146051t0(this.f121507a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: t0 */
        public C17971a m146051t0(CharSequence charSequence) {
            this.f121510d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C17971a m146052u0(int i, int i2) {
            this.f121502E = i;
            this.f121503F = i2;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C17971a m146053v0(MovementMethod movementMethod) {
            this.f121504G = movementMethod;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C17971a m146054w0(int i) {
            this.f121501D = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C17971a m146055x0(@StringRes int i, Object... objArr) {
            return m146056y0(this.f121507a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: y0 */
        public C17971a m146056y0(CharSequence charSequence) {
            this.f121509c = charSequence;
            return this;
        }
    }

    public jl80(C17971a c17971a) {
        super(c17971a.f121507a, true, m145963M(c17971a));
        this.f121487j = c17971a;
        View viewInflate = View.inflate(c17971a.f121507a, gec0.f103806s, null);
        this.f121497t = viewInflate;
        m145972T(c17971a, viewInflate);
        m128501y();
        m128500x();
        if (c17971a.f121532z != null) {
            setOnShowListener(c17971a.f121532z);
        }
        if (c17971a.f121499B != null) {
            setOnCancelListener(c17971a.f121499B);
        }
        if (c17971a.f121498A != null) {
            setOnDismissListener(c17971a.f121498A);
        }
        setCancelable(c17971a.f121530x);
        m128502z(this.f121497t);
    }

    /* JADX INFO: renamed from: M */
    public static int m145963M(C17971a c17971a) {
        if (c17971a.f121501D != 0) {
            return c17971a.f121501D;
        }
        return bnl0.m105592y0() >= 1080 ? tgc0.f174064j : tgc0.f174063i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m145964N(View view) {
        VCheckBox vCheckBox = this.f121496s;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: renamed from: K */
    public boolean m145965K() {
        return this.f121496s.isChecked();
    }

    /* JADX INFO: renamed from: L */
    public final View m145966L() {
        return this.f121487j.f121528v;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m145967O(C17971a c17971a, View view) {
        if (c17971a.f121518l != null) {
            c17971a.f121518l.run();
        }
        if (c17971a.f121531y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m145968P(C17971a c17971a, View view) {
        if (c17971a.f121519m != null) {
            c17971a.f121519m.run();
        }
        if (c17971a.f121531y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m145969Q(C17971a c17971a, View view) {
        if (c17971a.f121525s != null) {
            c17971a.f121525s.run();
        }
        if (c17971a.f121531y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m145970R(C17971a c17971a, View view) {
        dismiss();
        if (c17971a.f121521o != null) {
            c17971a.f121521o.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m145971S(C17971a c17971a, View view) {
        if (c17971a.f121520n != null) {
            c17971a.f121520n.run();
        }
        if (c17971a.f121531y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m145972T(final C17971a c17971a, View view) {
        View viewFindViewById = view.findViewById(vcc0.f183455z0);
        if (c17971a.f121501D != 0) {
            viewFindViewById.setBackground(null);
        } else {
            viewFindViewById.setBackground(c17971a.f121500C);
        }
        View viewFindViewById2 = view.findViewById(vcc0.f183443t0);
        View viewFindViewById3 = view.findViewById(vcc0.f183447v0);
        if (c17971a.f121529w != null) {
            viewFindViewById3.setVisibility(0);
            viewFindViewById2.setVisibility(8);
            VPager vPager = (VPager) view.findViewById(vcc0.f183445u0);
            VPagerCircleIndicator vPagerCircleIndicator = (VPagerCircleIndicator) view.findViewById(vcc0.f183439r0);
            vPager.setAdapter(c17971a.f121529w);
            vPagerCircleIndicator.m224389c(vPager, vPager.getCurrentItem());
            vPagerCircleIndicator.invalidate();
        } else {
            viewFindViewById3.setVisibility(8);
            viewFindViewById2.setVisibility(0);
            VImage vImage = (VImage) view.findViewById(vcc0.f183437q0);
            Space space = (Space) view.findViewById(vcc0.f183360C0);
            this.f121488k = (VText) view.findViewById(vcc0.f183358B0);
            this.f121489l = (VText) view.findViewById(vcc0.f183356A0);
            if (c17971a.f121508b != -1) {
                vImage.setImageResource(c17971a.f121508b);
                vImage.setVisibility(0);
                space.setVisibility(8);
            } else if (c17971a.f121528v != null) {
                space.setVisibility(8);
                vImage.setVisibility(8);
                ((VFrame) view.findViewById(vcc0.f183435p0)).addView(c17971a.f121528v, new FrameLayout.LayoutParams(-1, -2));
            } else {
                space.setVisibility(0);
                vImage.setVisibility(8);
            }
            boolean zIsEmpty = TextUtils.isEmpty(c17971a.f121509c);
            VText vText = this.f121488k;
            if (zIsEmpty) {
                vText.setVisibility(8);
            } else {
                vText.setTypeface(lyh0.m156283c(3), 1);
                this.f121488k.setText(c17971a.f121509c);
                this.f121488k.setVisibility(0);
            }
            if (TextUtils.isEmpty(c17971a.f121510d)) {
                this.f121489l.setVisibility(8);
                if (!TextUtils.isEmpty(c17971a.f121509c)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f121488k.getLayoutParams();
                    if (c17971a.f121508b != -1) {
                        layoutParams.topMargin = qa00.f156316c;
                        layoutParams.bottomMargin = qa00.f156326m;
                    } else {
                        layoutParams.topMargin = qa00.f156327n;
                        layoutParams.bottomMargin = qa00.f156330q;
                    }
                    this.f121488k.setLayoutParams(layoutParams);
                }
            } else {
                if (c17971a.f121505H) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f121489l.getLayoutParams();
                    layoutParams2.topMargin = c17971a.f121502E > -1 ? c17971a.f121502E : qa00.f156320g;
                    this.f121489l.setLayoutParams(layoutParams2);
                } else if (c17971a.f121508b == -1 && c17971a.f121529w == null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f121489l.getLayoutParams();
                    layoutParams3.topMargin = c17971a.f121502E > -1 ? c17971a.f121502E : qa00.f156328o;
                    layoutParams3.bottomMargin = c17971a.f121503F > -1 ? c17971a.f121503F : qa00.f156330q;
                    this.f121489l.setLayoutParams(layoutParams3);
                } else if (c17971a.f121508b != -1) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f121489l.getLayoutParams();
                    layoutParams4.topMargin = c17971a.f121502E > -1 ? c17971a.f121502E : qa00.f156318e;
                    this.f121489l.setLayoutParams(layoutParams4);
                }
                this.f121489l.setText(c17971a.f121510d);
                this.f121489l.setGravity(c17971a.f121512f);
                this.f121489l.setVisibility(0);
            }
            if (c17971a.f121504G != null) {
                this.f121489l.setMovementMethod(c17971a.f121504G);
            }
            if (!TextUtils.isEmpty(c17971a.f121511e)) {
                this.f121496s = (VCheckBox) view.findViewById(vcc0.f183442t);
                ViewGroup viewGroup = (ViewGroup) view.findViewById(vcc0.f183444u);
                bnl0.m105524M(viewGroup, true);
                ((TextView) view.findViewById(vcc0.f183362D0)).setText(c17971a.f121511e);
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.dl80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f89518a.m145964N(view2);
                    }
                });
            }
        }
        this.f121490m = (VButton) view.findViewById(vcc0.f183449w0);
        this.f121491n = (VButton) view.findViewById(vcc0.f183451x0);
        this.f121493p = (VText) view.findViewById(vcc0.f183441s0);
        Space space2 = (Space) view.findViewById(vcc0.f183431n0);
        this.f121494q = (VText) view.findViewById(vcc0.f183433o0);
        boolean zIsEmpty2 = TextUtils.isEmpty(c17971a.f121513g);
        VButton vButton = this.f121490m;
        if (zIsEmpty2) {
            vButton.setVisibility(8);
        } else {
            vButton.setText(c17971a.f121513g);
            if (c17971a.f121514h != -1) {
                this.f121490m.setBackgroundResource(c17971a.f121514h);
            }
            this.f121490m.setOnClickListener(new View.OnClickListener() { // from class: l.el80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f94492a.m145967O(c17971a, view2);
                }
            });
            this.f121490m.setVisibility(0);
        }
        if (c17971a.f121522p) {
            this.f121490m.setBackgroundResource(abc0.f69546s);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(c17971a.f121516j);
        VButton vButton2 = this.f121491n;
        if (zIsEmpty3) {
            vButton2.setVisibility(8);
        } else {
            vButton2.setText(c17971a.f121516j);
            if (c17971a.f121515i != -1) {
                this.f121491n.setBackgroundResource(c17971a.f121515i);
            }
            this.f121491n.setOnClickListener(new View.OnClickListener() { // from class: l.fl80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f99628a.m145968P(c17971a, view2);
                }
            });
            this.f121491n.setVisibility(0);
        }
        if (!TextUtils.isEmpty(c17971a.f121523q)) {
            this.f121493p.setText(c17971a.f121523q);
            this.f121493p.setOnClickListener(new View.OnClickListener() { // from class: l.gl80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f104826a.m145969Q(c17971a, view2);
                }
            });
            if (c17971a.f121524r != 0) {
                this.f121493p.setTextColor(c17971a.f121524r);
            }
            this.f121493p.setVisibility(0);
            space2.setVisibility(8);
        } else if (c17971a.f121528v != null && TextUtils.isEmpty(c17971a.f121513g) && TextUtils.isEmpty(c17971a.f121516j) && TextUtils.isEmpty(c17971a.f121523q)) {
            this.f121493p.setVisibility(8);
            space2.setVisibility(8);
        } else {
            this.f121493p.setVisibility(8);
            space2.setVisibility(0);
        }
        if (TextUtils.isEmpty(c17971a.f121527u) || c17971a.f121501D != 0) {
            this.f121494q.setVisibility(8);
        } else {
            if (c17971a.f121526t != 0) {
                this.f121494q.setTextColor(c17971a.f121526t);
            }
            this.f121494q.setText(c17971a.f121527u);
            this.f121494q.setVisibility(0);
        }
        if (c17971a.f121506I) {
            VImage vImage2 = (VImage) view.findViewById(vcc0.f183446v);
            this.f121495r = vImage2;
            bnl0.m105524M(vImage2, true);
            bnl0.m105509E0(this.f121495r, new View.OnClickListener() { // from class: l.hl80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f110486a.m145970R(c17971a, view2);
                }
            });
        }
        this.f121492o = (VButton) view.findViewById(vcc0.f183453y0);
        boolean zIsEmpty4 = TextUtils.isEmpty(c17971a.f121517k);
        VButton vButton3 = this.f121492o;
        if (zIsEmpty4) {
            vButton3.setVisibility(8);
            return;
        }
        vButton3.setText(c17971a.f121517k);
        this.f121492o.setOnClickListener(new View.OnClickListener() { // from class: l.il80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f115552a.m145971S(c17971a, view2);
            }
        });
        this.f121492o.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m145973U(CharSequence charSequence) {
        VText vText = this.f121493p;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m145974V(Runnable runnable) {
        this.f121487j.f121525s = runnable;
    }

    /* JADX INFO: renamed from: W */
    public void m145975W(Runnable runnable) {
        this.f121487j.f121518l = runnable;
    }

    /* JADX INFO: renamed from: X */
    public void m145976X(Runnable runnable) {
        this.f121487j.f121520n = runnable;
    }

    /* JADX INFO: renamed from: Y */
    public void m145977Y(CharSequence charSequence) {
        VButton vButton = this.f121490m;
        if (vButton != null) {
            vButton.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m145978Z(CharSequence charSequence) {
        VText vText = this.f121489l;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m145979a0(CharSequence charSequence) {
        VText vText = this.f121488k;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            wtq0.m207906a("Dialogs can only be shown from the UI thread.");
        } else {
            getWindow().setWindowAnimations(tgc0.f174061g);
            super.show();
        }
    }
}
