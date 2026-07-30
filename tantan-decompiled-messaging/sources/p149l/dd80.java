package p149l;

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
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class dd80 extends szd {

    /* JADX INFO: renamed from: j */
    public final C16336a f85536j;

    /* JADX INFO: renamed from: k */
    public VText f85537k;

    /* JADX INFO: renamed from: l */
    public VText f85538l;

    /* JADX INFO: renamed from: m */
    public VButton f85539m;

    /* JADX INFO: renamed from: n */
    public VButton f85540n;

    /* JADX INFO: renamed from: o */
    public VButton f85541o;

    /* JADX INFO: renamed from: p */
    public VText f85542p;

    /* JADX INFO: renamed from: q */
    public VText f85543q;

    /* JADX INFO: renamed from: r */
    public VImage f85544r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f85545s;

    /* JADX INFO: renamed from: t */
    public View f85546t;

    /* JADX INFO: renamed from: l.dd80$a */
    public static class C16336a {

        /* JADX INFO: renamed from: A */
        public DialogInterface.OnDismissListener f85547A;

        /* JADX INFO: renamed from: B */
        public DialogInterface.OnCancelListener f85548B;

        /* JADX INFO: renamed from: C */
        public Drawable f85549C;

        /* JADX INFO: renamed from: D */
        public int f85550D;

        /* JADX INFO: renamed from: a */
        public final Context f85556a;

        /* JADX INFO: renamed from: c */
        public CharSequence f85558c;

        /* JADX INFO: renamed from: d */
        public CharSequence f85559d;

        /* JADX INFO: renamed from: e */
        public CharSequence f85560e;

        /* JADX INFO: renamed from: g */
        public CharSequence f85562g;

        /* JADX INFO: renamed from: j */
        public CharSequence f85565j;

        /* JADX INFO: renamed from: k */
        public CharSequence f85566k;

        /* JADX INFO: renamed from: l */
        public Runnable f85567l;

        /* JADX INFO: renamed from: m */
        public Runnable f85568m;

        /* JADX INFO: renamed from: n */
        public Runnable f85569n;

        /* JADX INFO: renamed from: o */
        public Runnable f85570o;

        /* JADX INFO: renamed from: p */
        public boolean f85571p;

        /* JADX INFO: renamed from: q */
        public CharSequence f85572q;

        /* JADX INFO: renamed from: s */
        public Runnable f85574s;

        /* JADX INFO: renamed from: t */
        public int f85575t;

        /* JADX INFO: renamed from: u */
        public CharSequence f85576u;

        /* JADX INFO: renamed from: v */
        public View f85577v;

        /* JADX INFO: renamed from: w */
        public w660 f85578w;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnShowListener f85581z;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f85557b = -1;

        /* JADX INFO: renamed from: f */
        public int f85561f = 17;

        /* JADX INFO: renamed from: h */
        @DrawableRes
        public int f85563h = -1;

        /* JADX INFO: renamed from: i */
        @DrawableRes
        public int f85564i = -1;

        /* JADX INFO: renamed from: r */
        public int f85573r = 0;

        /* JADX INFO: renamed from: x */
        public boolean f85579x = true;

        /* JADX INFO: renamed from: y */
        public boolean f85580y = true;

        /* JADX INFO: renamed from: E */
        public int f85551E = -1;

        /* JADX INFO: renamed from: F */
        public int f85552F = -1;

        /* JADX INFO: renamed from: G */
        public MovementMethod f85553G = null;

        /* JADX INFO: renamed from: H */
        public boolean f85554H = false;

        /* JADX INFO: renamed from: I */
        public boolean f85555I = false;

        public C16336a(@NonNull Context context) {
            this.f85556a = context;
            this.f85549C = context.getDrawable(u2c0.f173461x);
        }

        /* JADX INFO: renamed from: M */
        public C16336a m110958M(boolean z) {
            this.f85580y = z;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C16336a m110959N(Drawable drawable) {
            this.f85549C = drawable;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public dd80 m110960O() {
            return new dd80(this);
        }

        /* JADX INFO: renamed from: P */
        public C16336a m110961P(boolean z) {
            this.f85579x = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C16336a m110962Q(@LayoutRes int i) {
            return m110963R(LayoutInflater.from(this.f85556a).inflate(i, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: R */
        public C16336a m110963R(View view) {
            this.f85577v = view;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C16336a m110964S(@DrawableRes int i) {
            this.f85557b = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C16336a m110965T(boolean z) {
            this.f85554H = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C16336a m110966U(@StringRes int i, Runnable runnable) {
            return m110969X(this.f85556a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: V */
        public C16336a m110967V(@StringRes int i, Object... objArr) {
            m110969X(this.f85556a.getString(i, objArr), this.f85574s);
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C16336a m110968W(CharSequence charSequence) {
            m110969X(charSequence, this.f85574s);
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C16336a m110969X(CharSequence charSequence, Runnable runnable) {
            this.f85572q = charSequence;
            this.f85574s = runnable;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C16336a m110970Y(@ColorInt int i) {
            this.f85573r = i;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C16336a m110971Z(@StringRes int i) {
            return m110974c0(this.f85556a.getString(i), this.f85567l);
        }

        /* JADX INFO: renamed from: a0 */
        public C16336a m110972a0(@StringRes int i, Runnable runnable) {
            return m110974c0(this.f85556a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: b0 */
        public C16336a m110973b0(CharSequence charSequence) {
            return m110974c0(charSequence, this.f85567l);
        }

        /* JADX INFO: renamed from: c0 */
        public C16336a m110974c0(CharSequence charSequence, Runnable runnable) {
            this.f85562g = charSequence;
            this.f85567l = runnable;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C16336a m110975d0(@DrawableRes int i) {
            this.f85563h = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C16336a m110976e0(boolean z) {
            this.f85571p = z;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C16336a m110977f0(@StringRes int i, Runnable runnable) {
            return m110979h0(this.f85556a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: g0 */
        public C16336a m110978g0(CharSequence charSequence) {
            return m110979h0(charSequence, this.f85568m);
        }

        /* JADX INFO: renamed from: h0 */
        public C16336a m110979h0(CharSequence charSequence, Runnable runnable) {
            this.f85565j = charSequence;
            this.f85568m = runnable;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C16336a m110980i0(@DrawableRes int i) {
            this.f85564i = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C16336a m110981j0(CharSequence charSequence) {
            this.f85566k = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C16336a m110982k0(CharSequence charSequence) {
            this.f85560e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: l0 */
        public C16336a m110983l0(DialogInterface.OnCancelListener onCancelListener) {
            this.f85548B = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m0 */
        public C16336a m110984m0(Runnable runnable) {
            this.f85570o = runnable;
            return this;
        }

        /* JADX INFO: renamed from: n0 */
        public C16336a m110985n0(DialogInterface.OnDismissListener onDismissListener) {
            this.f85547A = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C16336a m110986o0(DialogInterface.OnShowListener onShowListener) {
            this.f85581z = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C16336a m110987p0(boolean z) {
            this.f85555I = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C16336a m110988q0(int i) {
            this.f85561f = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public dd80 m110989r0() {
            dd80 dd80VarM110960O = m110960O();
            dd80VarM110960O.show();
            return dd80VarM110960O;
        }

        /* JADX INFO: renamed from: s0 */
        public C16336a m110990s0(@StringRes int i, Object... objArr) {
            return m110991t0(this.f85556a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: t0 */
        public C16336a m110991t0(CharSequence charSequence) {
            this.f85559d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C16336a m110992u0(int i, int i2) {
            this.f85551E = i;
            this.f85552F = i2;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C16336a m110993v0(MovementMethod movementMethod) {
            this.f85553G = movementMethod;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C16336a m110994w0(int i) {
            this.f85550D = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C16336a m110995x0(@StringRes int i, Object... objArr) {
            return m110996y0(this.f85556a.getString(i, objArr));
        }

        /* JADX INFO: renamed from: y0 */
        public C16336a m110996y0(CharSequence charSequence) {
            this.f85558c = charSequence;
            return this;
        }
    }

    public dd80(C16336a c16336a) {
        super(c16336a.f85556a, true, m110903M(c16336a));
        this.f85536j = c16336a;
        View viewInflate = View.inflate(c16336a.f85556a, b6c0.f73793s, null);
        this.f85546t = viewInflate;
        m110912T(c16336a, viewInflate);
        m186759y();
        m186758x();
        if (c16336a.f85581z != null) {
            setOnShowListener(c16336a.f85581z);
        }
        if (c16336a.f85548B != null) {
            setOnCancelListener(c16336a.f85548B);
        }
        if (c16336a.f85547A != null) {
            setOnDismissListener(c16336a.f85547A);
        }
        setCancelable(c16336a.f85579x);
        m186760z(this.f85546t);
    }

    /* JADX INFO: renamed from: M */
    public static int m110903M(C16336a c16336a) {
        if (c16336a.f85550D != 0) {
            return c16336a.f85550D;
        }
        return xdl0.m208412y0() >= 1080 ? n8c0.f137626j : n8c0.f137625i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m110904N(View view) {
        VCheckBox vCheckBox = this.f85545s;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    /* JADX INFO: renamed from: K */
    public boolean m110905K() {
        return this.f85545s.isChecked();
    }

    /* JADX INFO: renamed from: L */
    public final View m110906L() {
        return this.f85536j.f85577v;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m110907O(C16336a c16336a, View view) {
        if (c16336a.f85567l != null) {
            c16336a.f85567l.run();
        }
        if (c16336a.f85580y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m110908P(C16336a c16336a, View view) {
        if (c16336a.f85568m != null) {
            c16336a.f85568m.run();
        }
        if (c16336a.f85580y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m110909Q(C16336a c16336a, View view) {
        if (c16336a.f85574s != null) {
            c16336a.f85574s.run();
        }
        if (c16336a.f85580y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m110910R(C16336a c16336a, View view) {
        dismiss();
        if (c16336a.f85570o != null) {
            c16336a.f85570o.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m110911S(C16336a c16336a, View view) {
        if (c16336a.f85569n != null) {
            c16336a.f85569n.run();
        }
        if (c16336a.f85580y) {
            dismiss();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m110912T(final C16336a c16336a, View view) {
        View viewFindViewById = view.findViewById(p4c0.f147155z0);
        if (c16336a.f85550D != 0) {
            viewFindViewById.setBackground(null);
        } else {
            viewFindViewById.setBackground(c16336a.f85549C);
        }
        View viewFindViewById2 = view.findViewById(p4c0.f147143t0);
        View viewFindViewById3 = view.findViewById(p4c0.f147147v0);
        if (c16336a.f85578w != null) {
            viewFindViewById3.setVisibility(0);
            viewFindViewById2.setVisibility(8);
            VPager vPager = (VPager) view.findViewById(p4c0.f147145u0);
            VPagerCircleIndicator vPagerCircleIndicator = (VPagerCircleIndicator) view.findViewById(p4c0.f147139r0);
            vPager.setAdapter(c16336a.f85578w);
            vPagerCircleIndicator.m223143c(vPager, vPager.getCurrentItem());
            vPagerCircleIndicator.invalidate();
        } else {
            viewFindViewById3.setVisibility(8);
            viewFindViewById2.setVisibility(0);
            VImage vImage = (VImage) view.findViewById(p4c0.f147137q0);
            Space space = (Space) view.findViewById(p4c0.f147060C0);
            this.f85537k = (VText) view.findViewById(p4c0.f147058B0);
            this.f85538l = (VText) view.findViewById(p4c0.f147056A0);
            if (c16336a.f85557b != -1) {
                vImage.setImageResource(c16336a.f85557b);
                vImage.setVisibility(0);
                space.setVisibility(8);
            } else if (c16336a.f85577v != null) {
                space.setVisibility(8);
                vImage.setVisibility(8);
                ((VFrame) view.findViewById(p4c0.f147135p0)).addView(c16336a.f85577v, new FrameLayout.LayoutParams(-1, -2));
            } else {
                space.setVisibility(0);
                vImage.setVisibility(8);
            }
            boolean zIsEmpty = TextUtils.isEmpty(c16336a.f85558c);
            VText vText = this.f85537k;
            if (zIsEmpty) {
                vText.setVisibility(8);
            } else {
                vText.setTypeface(eqh0.m117752c(3), 1);
                this.f85537k.setText(c16336a.f85558c);
                this.f85537k.setVisibility(0);
            }
            if (TextUtils.isEmpty(c16336a.f85559d)) {
                this.f85538l.setVisibility(8);
                if (!TextUtils.isEmpty(c16336a.f85558c)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f85537k.getLayoutParams();
                    if (c16336a.f85557b != -1) {
                        layoutParams.topMargin = t100.f167254c;
                        layoutParams.bottomMargin = t100.f167264m;
                    } else {
                        layoutParams.topMargin = t100.f167265n;
                        layoutParams.bottomMargin = t100.f167268q;
                    }
                    this.f85537k.setLayoutParams(layoutParams);
                }
            } else {
                if (c16336a.f85554H) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f85538l.getLayoutParams();
                    layoutParams2.topMargin = c16336a.f85551E > -1 ? c16336a.f85551E : t100.f167258g;
                    this.f85538l.setLayoutParams(layoutParams2);
                } else if (c16336a.f85557b == -1 && c16336a.f85578w == null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f85538l.getLayoutParams();
                    layoutParams3.topMargin = c16336a.f85551E > -1 ? c16336a.f85551E : t100.f167266o;
                    layoutParams3.bottomMargin = c16336a.f85552F > -1 ? c16336a.f85552F : t100.f167268q;
                    this.f85538l.setLayoutParams(layoutParams3);
                } else if (c16336a.f85557b != -1) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f85538l.getLayoutParams();
                    layoutParams4.topMargin = c16336a.f85551E > -1 ? c16336a.f85551E : t100.f167256e;
                    this.f85538l.setLayoutParams(layoutParams4);
                }
                this.f85538l.setText(c16336a.f85559d);
                this.f85538l.setGravity(c16336a.f85561f);
                this.f85538l.setVisibility(0);
            }
            if (c16336a.f85553G != null) {
                this.f85538l.setMovementMethod(c16336a.f85553G);
            }
            if (!TextUtils.isEmpty(c16336a.f85560e)) {
                this.f85545s = (VCheckBox) view.findViewById(p4c0.f147142t);
                ViewGroup viewGroup = (ViewGroup) view.findViewById(p4c0.f147144u);
                xdl0.m208344M(viewGroup, true);
                ((TextView) view.findViewById(p4c0.f147062D0)).setText(c16336a.f85560e);
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.xc80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f192184a.m110904N(view2);
                    }
                });
            }
        }
        this.f85539m = (VButton) view.findViewById(p4c0.f147149w0);
        this.f85540n = (VButton) view.findViewById(p4c0.f147151x0);
        this.f85542p = (VText) view.findViewById(p4c0.f147141s0);
        Space space2 = (Space) view.findViewById(p4c0.f147131n0);
        this.f85543q = (VText) view.findViewById(p4c0.f147133o0);
        boolean zIsEmpty2 = TextUtils.isEmpty(c16336a.f85562g);
        VButton vButton = this.f85539m;
        if (zIsEmpty2) {
            vButton.setVisibility(8);
        } else {
            vButton.setText(c16336a.f85562g);
            if (c16336a.f85563h != -1) {
                this.f85539m.setBackgroundResource(c16336a.f85563h);
            }
            this.f85539m.setOnClickListener(new View.OnClickListener() { // from class: l.yc80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f197419a.m110907O(c16336a, view2);
                }
            });
            this.f85539m.setVisibility(0);
        }
        if (c16336a.f85571p) {
            this.f85539m.setBackgroundResource(u2c0.f173426s);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(c16336a.f85565j);
        VButton vButton2 = this.f85540n;
        if (zIsEmpty3) {
            vButton2.setVisibility(8);
        } else {
            vButton2.setText(c16336a.f85565j);
            if (c16336a.f85564i != -1) {
                this.f85540n.setBackgroundResource(c16336a.f85564i);
            }
            this.f85540n.setOnClickListener(new View.OnClickListener() { // from class: l.zc80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f202520a.m110908P(c16336a, view2);
                }
            });
            this.f85540n.setVisibility(0);
        }
        if (!TextUtils.isEmpty(c16336a.f85572q)) {
            this.f85542p.setText(c16336a.f85572q);
            this.f85542p.setOnClickListener(new View.OnClickListener() { // from class: l.ad80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f68915a.m110909Q(c16336a, view2);
                }
            });
            if (c16336a.f85573r != 0) {
                this.f85542p.setTextColor(c16336a.f85573r);
            }
            this.f85542p.setVisibility(0);
            space2.setVisibility(8);
        } else if (c16336a.f85577v != null && TextUtils.isEmpty(c16336a.f85562g) && TextUtils.isEmpty(c16336a.f85565j) && TextUtils.isEmpty(c16336a.f85572q)) {
            this.f85542p.setVisibility(8);
            space2.setVisibility(8);
        } else {
            this.f85542p.setVisibility(8);
            space2.setVisibility(0);
        }
        if (TextUtils.isEmpty(c16336a.f85576u) || c16336a.f85550D != 0) {
            this.f85543q.setVisibility(8);
        } else {
            if (c16336a.f85575t != 0) {
                this.f85543q.setTextColor(c16336a.f85575t);
            }
            this.f85543q.setText(c16336a.f85576u);
            this.f85543q.setVisibility(0);
        }
        if (c16336a.f85555I) {
            VImage vImage2 = (VImage) view.findViewById(p4c0.f147146v);
            this.f85544r = vImage2;
            xdl0.m208344M(vImage2, true);
            xdl0.m208329E0(this.f85544r, new View.OnClickListener() { // from class: l.bd80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f75010a.m110910R(c16336a, view2);
                }
            });
        }
        this.f85541o = (VButton) view.findViewById(p4c0.f147153y0);
        boolean zIsEmpty4 = TextUtils.isEmpty(c16336a.f85566k);
        VButton vButton3 = this.f85541o;
        if (zIsEmpty4) {
            vButton3.setVisibility(8);
            return;
        }
        vButton3.setText(c16336a.f85566k);
        this.f85541o.setOnClickListener(new View.OnClickListener() { // from class: l.cd80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80353a.m110911S(c16336a, view2);
            }
        });
        this.f85541o.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m110913U(CharSequence charSequence) {
        VText vText = this.f85542p;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m110914V(Runnable runnable) {
        this.f85536j.f85574s = runnable;
    }

    /* JADX INFO: renamed from: W */
    public void m110915W(Runnable runnable) {
        this.f85536j.f85567l = runnable;
    }

    /* JADX INFO: renamed from: X */
    public void m110916X(Runnable runnable) {
        this.f85536j.f85569n = runnable;
    }

    /* JADX INFO: renamed from: Y */
    public void m110917Y(CharSequence charSequence) {
        VButton vButton = this.f85539m;
        if (vButton != null) {
            vButton.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m110918Z(CharSequence charSequence) {
        VText vText = this.f85538l;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m110919a0(CharSequence charSequence) {
        VText vText = this.f85537k;
        if (vText != null) {
            vText.setText(charSequence);
        }
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.m175383a("Dialogs can only be shown from the UI thread.");
        } else {
            getWindow().setWindowAnimations(n8c0.f137623g);
            super.show();
        }
    }
}
