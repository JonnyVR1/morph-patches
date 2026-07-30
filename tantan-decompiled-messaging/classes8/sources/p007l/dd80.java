package p007l;

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
import l.eqh0;
import l.qkq0;
import l.t100;
import l.w660;
import l.xdl0;
import v.VButton;
import v.VCheckBox;
import v.VImage;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class dd80 extends szd {

    /* JADX INFO: renamed from: j */
    public final C0522a f2521j;

    /* JADX INFO: renamed from: k */
    public VText f2522k;

    /* JADX INFO: renamed from: l */
    public VText f2523l;

    /* JADX INFO: renamed from: m */
    public VButton f2524m;

    /* JADX INFO: renamed from: n */
    public VButton f2525n;

    /* JADX INFO: renamed from: o */
    public VButton f2526o;

    /* JADX INFO: renamed from: p */
    public VText f2527p;

    /* JADX INFO: renamed from: q */
    public VText f2528q;

    /* JADX INFO: renamed from: r */
    public VImage f2529r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f2530s;

    /* JADX INFO: renamed from: t */
    public View f2531t;

    /* JADX INFO: renamed from: l.dd80$a */
    public static class C0522a {

        /* JADX INFO: renamed from: A */
        public DialogInterface.OnDismissListener f2532A;

        /* JADX INFO: renamed from: B */
        public DialogInterface.OnCancelListener f2533B;

        /* JADX INFO: renamed from: C */
        public Drawable f2534C;

        /* JADX INFO: renamed from: D */
        public int f2535D;

        /* JADX INFO: renamed from: a */
        public final Context f2541a;

        /* JADX INFO: renamed from: c */
        public CharSequence f2543c;

        /* JADX INFO: renamed from: d */
        public CharSequence f2544d;

        /* JADX INFO: renamed from: e */
        public CharSequence f2545e;

        /* JADX INFO: renamed from: g */
        public CharSequence f2547g;

        /* JADX INFO: renamed from: j */
        public CharSequence f2550j;

        /* JADX INFO: renamed from: k */
        public CharSequence f2551k;

        /* JADX INFO: renamed from: l */
        public Runnable f2552l;

        /* JADX INFO: renamed from: m */
        public Runnable f2553m;

        /* JADX INFO: renamed from: n */
        public Runnable f2554n;

        /* JADX INFO: renamed from: o */
        public Runnable f2555o;

        /* JADX INFO: renamed from: p */
        public boolean f2556p;

        /* JADX INFO: renamed from: q */
        public CharSequence f2557q;

        /* JADX INFO: renamed from: s */
        public Runnable f2559s;

        /* JADX INFO: renamed from: t */
        public int f2560t;

        /* JADX INFO: renamed from: u */
        public CharSequence f2561u;

        /* JADX INFO: renamed from: v */
        public View f2562v;

        /* JADX INFO: renamed from: w */
        public w660 f2563w;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnShowListener f2566z;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f2542b = -1;

        /* JADX INFO: renamed from: f */
        public int f2546f = 17;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f2548h = -1;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f2549i = -1;

        /* JADX INFO: renamed from: r */
        public int f2558r = 0;

        /* JADX INFO: renamed from: x */
        public boolean f2564x = true;

        /* JADX INFO: renamed from: y */
        public boolean f2565y = true;

        /* JADX INFO: renamed from: E */
        public int f2536E = -1;

        /* JADX INFO: renamed from: F */
        public int f2537F = -1;

        /* JADX INFO: renamed from: G */
        public MovementMethod f2538G = null;

        /* JADX INFO: renamed from: H */
        public boolean f2539H = false;

        /* JADX INFO: renamed from: I */
        public boolean f2540I = false;

        public C0522a(@NonNull Context context) {
            this.f2541a = context;
            this.f2534C = context.getDrawable(u2c0.f4829x);
        }

        /* JADX INFO: renamed from: M */
        public C0522a m8944M(boolean z) {
            this.f2565y = z;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C0522a m8945N(Drawable drawable) {
            this.f2534C = drawable;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public dd80 m8946O() {
            return new dd80(this);
        }

        /* JADX INFO: renamed from: P */
        public C0522a m8947P(boolean z) {
            this.f2564x = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C0522a m8948Q(@LayoutRes int i) {
            return m8949R(LayoutInflater.from(this.f2541a).inflate(i, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: R */
        public C0522a m8949R(View view) {
            this.f2562v = view;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C0522a m8950S(@DrawableRes int i) {
            this.f2542b = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C0522a m8951T(boolean z) {
            this.f2539H = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C0522a m8952U(@StringRes int i, Runnable runnable) {
            return m8955X(this.f2541a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: V */
        public C0522a m8953V(@StringRes int i, Object... objArr) {
            m8955X(this.f2541a.getString(i, objArr), this.f2559s);
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C0522a m8954W(CharSequence charSequence) {
            m8955X(charSequence, this.f2559s);
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C0522a m8955X(CharSequence charSequence, Runnable runnable) {
            this.f2557q = charSequence;
            this.f2559s = runnable;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C0522a m8956Y(@ColorInt int i) {
            this.f2558r = i;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C0522a m8957Z(@StringRes int i) {
            return m8960c0(this.f2541a.getString(i), this.f2552l);
        }

        /* JADX INFO: renamed from: a0 */
        public C0522a m8958a0(@StringRes int i, Runnable runnable) {
            return m8960c0(this.f2541a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: b0 */
        public C0522a m8959b0(CharSequence charSequence) {
            return m8960c0(charSequence, this.f2552l);
        }

        /* JADX INFO: renamed from: c0 */
        public C0522a m8960c0(CharSequence charSequence, Runnable runnable) {
            this.f2547g = charSequence;
            this.f2552l = runnable;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C0522a m8961d0(@DrawableRes int i) {
            this.f2548h = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C0522a m8962e0(boolean z) {
            this.f2556p = z;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C0522a m8963f0(@StringRes int i, Runnable runnable) {
            return m8965h0(this.f2541a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: g0 */
        public C0522a m8964g0(CharSequence charSequence) {
            return m8965h0(charSequence, this.f2553m);
        }

        /* JADX INFO: renamed from: h0 */
        public C0522a m8965h0(CharSequence charSequence, Runnable runnable) {
            this.f2550j = charSequence;
            this.f2553m = runnable;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C0522a m8966i0(@DrawableRes int i) {
            this.f2549i = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C0522a m8967j0(CharSequence charSequence) {
            this.f2551k = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C0522a m8968k0(CharSequence charSequence) {
            this.f2545e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: l0 */
        public C0522a m8969l0(DialogInterface.OnCancelListener onCancelListener) {
            this.f2533B = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m0 */
        public C0522a m8970m0(Runnable runnable) {
            this.f2555o = runnable;
            return this;
        }

        /* JADX INFO: renamed from: n0 */
        public C0522a m8971n0(DialogInterface.OnDismissListener onDismissListener) {
            this.f2532A = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C0522a m8972o0(DialogInterface.OnShowListener onShowListener) {
            this.f2566z = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C0522a m8973p0(boolean z) {
            this.f2540I = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C0522a m8974q0(int i) {
            this.f2546f = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public dd80 m8975r0() {
            dd80 dd80VarM8946O = m8946O();
            dd80VarM8946O.show();
            return dd80VarM8946O;
        }

        /* JADX INFO: renamed from: s0 */
        public C0522a m8976s0(@StringRes int i, Object... objArr) {
            return m8977t0(this.f2541a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: t0 */
        public C0522a m8977t0(CharSequence charSequence) {
            this.f2544d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C0522a m8978u0(int i, int i2) {
            this.f2536E = i;
            this.f2537F = i2;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C0522a m8979v0(MovementMethod movementMethod) {
            this.f2538G = movementMethod;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C0522a m8980w0(int i) {
            this.f2535D = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C0522a m8981x0(@StringRes int i, Object... objArr) {
            return m8982y0(this.f2541a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: y0 */
        public C0522a m8982y0(CharSequence charSequence) {
            this.f2543c = charSequence;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dd80(C0522a c0522a) {
        super(c0522a.f2541a, true, m8889M(c0522a));
        this.f2521j = c0522a;
        View viewInflate = View.inflate(c0522a.f2541a, b6c0.f1933s, null);
        this.f2531t = viewInflate;
        m8898T(c0522a, viewInflate);
        m10769y();
        m10768x();
        if (c0522a.f2566z != null) {
            setOnShowListener(c0522a.f2566z);
        }
        if (c0522a.f2533B != null) {
            setOnCancelListener(c0522a.f2533B);
        }
        if (c0522a.f2532A != null) {
            setOnDismissListener(c0522a.f2532A);
        }
        setCancelable(c0522a.f2564x);
        m10770z(this.f2531t);
    }

    /* JADX INFO: renamed from: M */
    public static int m8889M(C0522a c0522a) {
        if (c0522a.f2535D != 0) {
            return c0522a.f2535D;
        }
        return xdl0.y0() >= 1080 ? n8c0.f3371j : n8c0.f3370i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m8890N(View view) {
        VCheckBox vCheckBox = this.f2530s;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: renamed from: K */
    public boolean m8891K() {
        return this.f2530s.isChecked();
    }

    /* JADX INFO: renamed from: L */
    public final View m8892L() {
        return this.f2521j.f2562v;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m8893O(C0522a c0522a, View view) {
        if (c0522a.f2552l != null) {
            c0522a.f2552l.run();
        }
        if (c0522a.f2565y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m8894P(C0522a c0522a, View view) {
        if (c0522a.f2553m != null) {
            c0522a.f2553m.run();
        }
        if (c0522a.f2565y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m8895Q(C0522a c0522a, View view) {
        if (c0522a.f2559s != null) {
            c0522a.f2559s.run();
        }
        if (c0522a.f2565y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m8896R(C0522a c0522a, View view) {
        dismiss();
        if (c0522a.f2555o != null) {
            c0522a.f2555o.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m8897S(C0522a c0522a, View view) {
        if (c0522a.f2554n != null) {
            c0522a.f2554n.run();
        }
        if (c0522a.f2565y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8898T(final C0522a c0522a, View view) {
        View viewFindViewById = view.findViewById(p4c0.f3703z0);
        if (c0522a.f2535D != 0) {
            viewFindViewById.setBackground(null);
        } else {
            viewFindViewById.setBackground(c0522a.f2534C);
        }
        View viewFindViewById2 = view.findViewById(p4c0.f3691t0);
        View viewFindViewById3 = view.findViewById(p4c0.f3695v0);
        if (c0522a.f2563w != null) {
            viewFindViewById3.setVisibility(0);
            viewFindViewById2.setVisibility(8);
            VPager vPagerFindViewById = view.findViewById(p4c0.f3693u0);
            VPagerCircleIndicator vPagerCircleIndicatorFindViewById = view.findViewById(p4c0.f3687r0);
            vPagerFindViewById.setAdapter(c0522a.f2563w);
            vPagerCircleIndicatorFindViewById.c(vPagerFindViewById, vPagerFindViewById.getCurrentItem());
            vPagerCircleIndicatorFindViewById.invalidate();
        } else {
            viewFindViewById3.setVisibility(8);
            viewFindViewById2.setVisibility(0);
            VImage vImageFindViewById = view.findViewById(p4c0.f3685q0);
            Space space = (Space) view.findViewById(p4c0.f3608C0);
            this.f2522k = view.findViewById(p4c0.f3606B0);
            this.f2523l = view.findViewById(p4c0.f3604A0);
            if (c0522a.f2542b != -1) {
                vImageFindViewById.setImageResource(c0522a.f2542b);
                vImageFindViewById.setVisibility(0);
                space.setVisibility(8);
            } else if (c0522a.f2562v != null) {
                space.setVisibility(8);
                vImageFindViewById.setVisibility(8);
                view.findViewById(p4c0.f3683p0).addView(c0522a.f2562v, new FrameLayout.LayoutParams(-1, -2));
            } else {
                space.setVisibility(0);
                vImageFindViewById.setVisibility(8);
            }
            boolean zIsEmpty = TextUtils.isEmpty(c0522a.f2543c);
            VText vText = this.f2522k;
            if (zIsEmpty) {
                vText.setVisibility(8);
            } else {
                vText.setTypeface(eqh0.c(3), 1);
                this.f2522k.setText(c0522a.f2543c);
                this.f2522k.setVisibility(0);
            }
            if (TextUtils.isEmpty(c0522a.f2544d)) {
                this.f2523l.setVisibility(8);
                if (!TextUtils.isEmpty(c0522a.f2543c)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2522k.getLayoutParams();
                    if (c0522a.f2542b != -1) {
                        layoutParams.topMargin = t100.c;
                        layoutParams.bottomMargin = t100.m;
                    } else {
                        layoutParams.topMargin = t100.n;
                        layoutParams.bottomMargin = t100.q;
                    }
                    this.f2522k.setLayoutParams(layoutParams);
                }
            } else {
                if (c0522a.f2539H) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2523l.getLayoutParams();
                    layoutParams2.topMargin = c0522a.f2536E > -1 ? c0522a.f2536E : t100.g;
                    this.f2523l.setLayoutParams(layoutParams2);
                } else if (c0522a.f2542b == -1 && c0522a.f2563w == null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f2523l.getLayoutParams();
                    layoutParams3.topMargin = c0522a.f2536E > -1 ? c0522a.f2536E : t100.o;
                    layoutParams3.bottomMargin = c0522a.f2537F > -1 ? c0522a.f2537F : t100.q;
                    this.f2523l.setLayoutParams(layoutParams3);
                } else if (c0522a.f2542b != -1) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f2523l.getLayoutParams();
                    layoutParams4.topMargin = c0522a.f2536E > -1 ? c0522a.f2536E : t100.e;
                    this.f2523l.setLayoutParams(layoutParams4);
                }
                this.f2523l.setText(c0522a.f2544d);
                this.f2523l.setGravity(c0522a.f2546f);
                this.f2523l.setVisibility(0);
            }
            if (c0522a.f2538G != null) {
                this.f2523l.setMovementMethod(c0522a.f2538G);
            }
            if (!TextUtils.isEmpty(c0522a.f2545e)) {
                this.f2530s = view.findViewById(p4c0.f3690t);
                ViewGroup viewGroup = (ViewGroup) view.findViewById(p4c0.f3692u);
                xdl0.M(viewGroup, true);
                ((TextView) view.findViewById(p4c0.f3610D0)).setText(c0522a.f2545e);
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.xc80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f5285a.m8890N(view2);
                    }
                });
            }
        }
        this.f2524m = view.findViewById(p4c0.f3697w0);
        this.f2525n = view.findViewById(p4c0.f3699x0);
        this.f2527p = view.findViewById(p4c0.f3689s0);
        Space space2 = (Space) view.findViewById(p4c0.f3679n0);
        this.f2528q = view.findViewById(p4c0.f3681o0);
        boolean zIsEmpty2 = TextUtils.isEmpty(c0522a.f2547g);
        VButton vButton = this.f2524m;
        if (zIsEmpty2) {
            vButton.setVisibility(8);
        } else {
            vButton.setText(c0522a.f2547g);
            if (c0522a.f2548h != -1) {
                this.f2524m.setBackgroundResource(c0522a.f2548h);
            }
            this.f2524m.setOnClickListener(new View.OnClickListener() { // from class: l.yc80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5425a.m8893O(c0522a, view2);
                }
            });
            this.f2524m.setVisibility(0);
        }
        if (c0522a.f2556p) {
            this.f2524m.setBackgroundResource(u2c0.f4794s);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(c0522a.f2550j);
        VButton vButton2 = this.f2525n;
        if (zIsEmpty3) {
            vButton2.setVisibility(8);
        } else {
            vButton2.setText(c0522a.f2550j);
            if (c0522a.f2549i != -1) {
                this.f2525n.setBackgroundResource(c0522a.f2549i);
            }
            this.f2525n.setOnClickListener(new View.OnClickListener() { // from class: l.zc80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5503a.m8894P(c0522a, view2);
                }
            });
            this.f2525n.setVisibility(0);
        }
        if (!TextUtils.isEmpty(c0522a.f2557q)) {
            this.f2527p.setText(c0522a.f2557q);
            this.f2527p.setOnClickListener(new View.OnClickListener() { // from class: l.ad80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f1846a.m8895Q(c0522a, view2);
                }
            });
            if (c0522a.f2558r != 0) {
                this.f2527p.setTextColor(c0522a.f2558r);
            }
            this.f2527p.setVisibility(0);
            space2.setVisibility(8);
        } else if (c0522a.f2562v != null && TextUtils.isEmpty(c0522a.f2547g) && TextUtils.isEmpty(c0522a.f2550j) && TextUtils.isEmpty(c0522a.f2557q)) {
            this.f2527p.setVisibility(8);
            space2.setVisibility(8);
        } else {
            this.f2527p.setVisibility(8);
            space2.setVisibility(0);
        }
        if (TextUtils.isEmpty(c0522a.f2561u) || c0522a.f2535D != 0) {
            this.f2528q.setVisibility(8);
        } else {
            if (c0522a.f2560t != 0) {
                this.f2528q.setTextColor(c0522a.f2560t);
            }
            this.f2528q.setText(c0522a.f2561u);
            this.f2528q.setVisibility(0);
        }
        if (c0522a.f2540I) {
            VImage vImageFindViewById2 = view.findViewById(p4c0.f3694v);
            this.f2529r = vImageFindViewById2;
            xdl0.M(vImageFindViewById2, true);
            xdl0.E0(this.f2529r, new View.OnClickListener() { // from class: l.bd80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f2305a.m8896R(c0522a, view2);
                }
            });
        }
        this.f2526o = view.findViewById(p4c0.f3701y0);
        boolean zIsEmpty4 = TextUtils.isEmpty(c0522a.f2551k);
        VButton vButton3 = this.f2526o;
        if (zIsEmpty4) {
            vButton3.setVisibility(8);
            return;
        }
        vButton3.setText(c0522a.f2551k);
        this.f2526o.setOnClickListener(new View.OnClickListener() { // from class: l.cd80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f2462a.m8897S(c0522a, view2);
            }
        });
        this.f2526o.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m8899U(CharSequence charSequence) {
        VText vText = this.f2527p;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m8900V(Runnable runnable) {
        this.f2521j.f2559s = runnable;
    }

    /* JADX INFO: renamed from: W */
    public void m8901W(Runnable runnable) {
        this.f2521j.f2552l = runnable;
    }

    /* JADX INFO: renamed from: X */
    public void m8902X(Runnable runnable) {
        this.f2521j.f2554n = runnable;
    }

    /* JADX INFO: renamed from: Y */
    public void m8903Y(CharSequence charSequence) {
        VButton vButton = this.f2524m;
        if (vButton != null) {
            vButton.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m8904Z(CharSequence charSequence) {
        VText vText = this.f2523l;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m8905a0(CharSequence charSequence) {
        VText vText = this.f2522k;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.szd
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.a("Dialogs can only be shown from the UI thread.");
        } else {
            getWindow().setWindowAnimations(n8c0.f3368g);
            super.show();
        }
    }
}
