package com.p051p1.mobile.android.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.util.ArrayList;
import java.util.List;
import org.joor.Reflect;
import p151v.VButton_FakeShadow;
import p151v.VLinear_Foreground;
import p151v.VList;
import p151v.VList_ScrollableHeight;
import p151v.VText;
import p153l.abc0;
import p153l.bac0;
import p153l.bnl0;
import p153l.g1e;
import p153l.gec0;
import p153l.gt0;
import p153l.jyb;
import p153l.l51;
import p153l.lyh0;
import p153l.o8c0;
import p153l.qa00;
import p153l.qcj;
import p153l.tgc0;
import p153l.u7c0;
import p153l.vcc0;
import p153l.wg3;
import p153l.wtq0;
import p153l.z8c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class Dialog extends g1e implements View.OnClickListener {

    /* JADX INFO: renamed from: K */
    public static final int f16102K = qa00.m175859d(6.0f);

    /* JADX INFO: renamed from: L */
    public static final int f16103L = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: M */
    public static final int f16104M = qa00.m175859d(12.0f);

    /* JADX INFO: renamed from: N */
    public static final int f16105N = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: O */
    public static final int f16106O = qa00.m175859d(24.0f);

    /* JADX INFO: renamed from: P */
    public static final int f16107P = qa00.m175859d(32.0f);

    /* JADX INFO: renamed from: Q */
    public static final int f16108Q = qa00.m175859d(40.0f);

    /* JADX INFO: renamed from: R */
    public static final int f16109R = qa00.m175859d(42.0f);

    /* JADX INFO: renamed from: S */
    public static final int f16110S = qa00.m175859d(48.0f);

    /* JADX INFO: renamed from: T */
    public static final int f16111T = qa00.m175859d(64.0f);

    /* JADX INFO: renamed from: U */
    public static final int f16112U = qa00.m175859d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f16113V = qa00.m175859d(144.0f);

    /* JADX INFO: renamed from: A */
    public FrameLayout f16114A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f16115B;

    /* JADX INFO: renamed from: C */
    public TextView f16116C;

    /* JADX INFO: renamed from: D */
    public boolean f16117D;

    /* JADX INFO: renamed from: E */
    public boolean f16118E;

    /* JADX INFO: renamed from: F */
    public int f16119F;

    /* JADX INFO: renamed from: G */
    public ListType f16120G;

    /* JADX INFO: renamed from: H */
    public List<Integer> f16121H;

    /* JADX INFO: renamed from: I */
    public boolean f16122I;

    /* JADX INFO: renamed from: J */
    public boolean f16123J;

    /* JADX INFO: renamed from: j */
    public final VLinear_Foreground f16124j;

    /* JADX INFO: renamed from: k */
    public VLinear_Foreground f16125k;

    /* JADX INFO: renamed from: l */
    public final C4460e f16126l;

    /* JADX INFO: renamed from: m */
    public VList f16127m;

    /* JADX INFO: renamed from: n */
    public View f16128n;

    /* JADX INFO: renamed from: o */
    public TextView f16129o;

    /* JADX INFO: renamed from: p */
    public TextView f16130p;

    /* JADX INFO: renamed from: q */
    public TextView f16131q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f16132r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f16133s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f16134t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f16135u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f16136v;

    /* JADX INFO: renamed from: w */
    public ViewGroup f16137w;

    /* JADX INFO: renamed from: x */
    public TextView f16138x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f16139y;

    /* JADX INFO: renamed from: z */
    public TextView f16140z;

    public enum Action {
        POSITIVE,
        NEUTRAL,
        NEGATIVE
    }

    public enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i = C4459d.f16150b[listType.ordinal()];
            if (i == 1) {
                return gec0.f103785D;
            }
            if (i == 2) {
                return gec0.f103784C;
            }
            if (i == 3) {
                return gec0.f103783B;
            }
            wg3.m206174a("Not a valid list type");
            return 0;
        }
    }

    public enum Theme {
        LIGHT,
        DARK
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$a */
    public class C4456a implements AdapterView.OnItemClickListener {
        public C4456a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            ListType listType = dialog.f16120G;
            if (listType == ListType.MULTI) {
                boolean zIsChecked = ((CheckBox) view.findViewById(vcc0.f183357B)).isChecked();
                boolean zContains = Dialog.this.f16121H.contains(Integer.valueOf(i));
                if (zIsChecked) {
                    if (zContains) {
                        Dialog.this.f16121H.remove(Integer.valueOf(i));
                    }
                } else if (!zContains) {
                    Dialog dialog2 = Dialog.this;
                    if (dialog2.f16126l.f16182a0 != -1) {
                        int size = dialog2.f16121H.size();
                        C4460e c4460e = Dialog.this.f16126l;
                        if (size >= c4460e.f16182a0) {
                            c4460e.f16184b0.run();
                            return;
                        }
                    }
                    Dialog.this.f16121H.add(Integer.valueOf(i));
                }
            } else if (listType == ListType.SINGLE) {
                C4460e c4460e2 = dialog.f16126l;
                if (c4460e2.f16162H != i) {
                    c4460e2.f16162H = i;
                    ((C4463h) c4460e2.f16168N).notifyDataSetChanged();
                }
            }
            Dialog.this.onClick(view);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$b */
    public class C4457b implements AdapterView.OnItemClickListener {
        public C4457b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            C4460e c4460e = dialog.f16126l;
            if (c4460e.f16151A != null) {
                if (c4460e.f16164J) {
                    dialog.dismiss();
                }
                Dialog dialog2 = Dialog.this;
                dialog2.f16126l.f16151A.mo21568a(dialog2, view, i, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c */
    public class DialogInterfaceOnShowListenerC4458c implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f16143a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f16144b;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m21478b() {
                Dialog.this.f16124j.setBackgroundDrawable(null);
                Dialog.this.getWindow().setBackgroundDrawableResource(abc0.f69402a);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                l51.m152888H(Dialog.this.getContext(), new Runnable() { // from class: l.u0e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f176876a.m21478b();
                    }
                }, 100L);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$b */
        public class b implements ValueAnimator.AnimatorUpdateListener {
            public b() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Dialog dialog = Dialog.this;
                dialog.m21466h0(dialog.f16124j, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$c */
        public class c implements ValueAnimator.AnimatorUpdateListener {
            public c() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Dialog dialog = Dialog.this;
                dialog.m21467i0(dialog.f16124j, (1.0f - valueAnimator.getAnimatedFraction()) * DialogInterfaceOnShowListenerC4458c.this.f16143a);
                DialogInterfaceOnShowListenerC4458c.this.f16144b.setAlpha(Math.max(0, (int) ((1.0f - (valueAnimator.getAnimatedFraction() * 1.3f)) * 255.0f)));
            }
        }

        public DialogInterfaceOnShowListenerC4458c(int i, Drawable drawable) {
            this.f16143a = i;
            this.f16144b = drawable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        @TargetApi(21)
        public void onShow(DialogInterface dialogInterface) {
            ValueAnimator valueAnimatorOfFloat;
            ValueAnimator valueAnimatorOfInt;
            Dialog.this.getWindow().setDimAmount(0.7f);
            int width = Dialog.this.f16124j.getWidth();
            int height = Dialog.this.f16124j.getHeight();
            float fSqrt = (float) Math.sqrt(((width * width) / 4) + ((height * height) / 4));
            Dialog dialog = Dialog.this;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(dialog.f16124j, width / 2, height / 2, dialog.f16126l.f16210o0, fSqrt);
            Dialog.this.f16124j.setVisibility(0);
            animatorCreateCircularReveal.addListener(new a());
            animatorCreateCircularReveal.setDuration(Dialog.m21439G(250));
            animatorCreateCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            Dialog dialog2 = Dialog.this;
            Point point = dialog2.f16126l.f16208n0;
            if (point == null) {
                valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
                valueAnimatorOfFloat = ValueAnimator.ofInt(0, 1);
            } else {
                int[] iArr = new int[2];
                dialog2.f16124j.getLocationOnScreen(iArr);
                int width2 = iArr[0] + (Dialog.this.f16124j.getWidth() / 2);
                int height2 = iArr[1] + (Dialog.this.f16124j.getHeight() / 2);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f16124j, "translationX", point.x - width2, 0.0f);
                valueAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f16124j, "translationY", point.y - height2, 0.0f);
                valueAnimatorOfInt = objectAnimatorOfFloat;
            }
            valueAnimatorOfInt.setDuration(Dialog.m21439G(250));
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(Dialog.m21439G(250));
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new b());
            valueAnimatorOfInt2.setStartDelay(Dialog.m21439G(150));
            valueAnimatorOfInt2.setDuration(Dialog.m21439G(100));
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt3.addUpdateListener(new c());
            valueAnimatorOfInt3.setStartDelay(Dialog.m21439G(100));
            valueAnimatorOfInt3.setDuration(Dialog.m21439G(150));
            valueAnimatorOfInt3.setInterpolator(gt0.f106347b);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorCreateCircularReveal, valueAnimatorOfFloat, valueAnimatorOfInt3);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$d */
    public static /* synthetic */ class C4459d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16149a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16150b;

        static {
            int[] iArr = new int[ListType.values().length];
            f16150b = iArr;
            try {
                iArr[ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16150b[ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16150b[ListType.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Action.values().length];
            f16149a = iArr2;
            try {
                iArr2[Action.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16149a[Action.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e */
    public static class C4460e {

        /* JADX INFO: renamed from: A */
        public InterfaceC4462g f16151A;

        /* JADX INFO: renamed from: B */
        public InterfaceC4462g f16153B;

        /* JADX INFO: renamed from: B0 */
        public CharSequence f16154B0;

        /* JADX INFO: renamed from: C0 */
        public boolean f16156C0;

        /* JADX INFO: renamed from: D0 */
        public AbstractC4461f f16158D0;

        /* JADX INFO: renamed from: K */
        public Drawable f16165K;

        /* JADX INFO: renamed from: M */
        public View f16167M;

        /* JADX INFO: renamed from: N */
        public ListAdapter f16168N;

        /* JADX INFO: renamed from: O */
        public DialogInterface.OnDismissListener f16169O;

        /* JADX INFO: renamed from: P */
        public DialogInterface.OnCancelListener f16170P;

        /* JADX INFO: renamed from: Q */
        public DialogInterface.OnKeyListener f16171Q;

        /* JADX INFO: renamed from: R */
        public DialogInterface.OnShowListener f16172R;

        /* JADX INFO: renamed from: S */
        public InterfaceC4464i f16173S;

        /* JADX INFO: renamed from: T */
        public boolean f16174T;

        /* JADX INFO: renamed from: U */
        public boolean f16175U;

        /* JADX INFO: renamed from: V */
        public int f16176V;

        /* JADX INFO: renamed from: W */
        public int f16177W;

        /* JADX INFO: renamed from: X */
        public Drawable f16178X;

        /* JADX INFO: renamed from: Y */
        public Drawable f16179Y;

        /* JADX INFO: renamed from: Z */
        public boolean f16180Z;

        /* JADX INFO: renamed from: a */
        public final Context f16181a;

        /* JADX INFO: renamed from: b */
        public CharSequence f16183b;

        /* JADX INFO: renamed from: c */
        public CharSequence f16185c;

        /* JADX INFO: renamed from: h0 */
        public Drawable f16196h0;

        /* JADX INFO: renamed from: i0 */
        public boolean f16198i0;

        /* JADX INFO: renamed from: k0 */
        public boolean f16202k0;

        /* JADX INFO: renamed from: m */
        public CharSequence f16205m;

        /* JADX INFO: renamed from: m0 */
        public boolean f16206m0;

        /* JADX INFO: renamed from: n */
        public CharSequence[] f16207n;

        /* JADX INFO: renamed from: n0 */
        public Point f16208n0;

        /* JADX INFO: renamed from: o */
        public CharSequence f16209o;

        /* JADX INFO: renamed from: o0 */
        public int f16210o0;

        /* JADX INFO: renamed from: p */
        public Drawable f16211p;

        /* JADX INFO: renamed from: p0 */
        public int f16212p0;

        /* JADX INFO: renamed from: q */
        public Drawable f16213q;

        /* JADX INFO: renamed from: r */
        public CharSequence f16215r;

        /* JADX INFO: renamed from: s */
        public CharSequence f16217s;

        /* JADX INFO: renamed from: s0 */
        public boolean f16218s0;

        /* JADX INFO: renamed from: t */
        public View f16219t;

        /* JADX INFO: renamed from: t0 */
        public boolean f16220t0;

        /* JADX INFO: renamed from: u */
        public int f16221u;

        /* JADX INFO: renamed from: u0 */
        public Dialog f16222u0;

        /* JADX INFO: renamed from: v */
        public int f16223v;

        /* JADX INFO: renamed from: v0 */
        public boolean f16224v0;

        /* JADX INFO: renamed from: w */
        public int f16225w;

        /* JADX INFO: renamed from: x */
        public Runnable f16227x;

        /* JADX INFO: renamed from: y */
        public Runnable f16229y;

        /* JADX INFO: renamed from: z */
        public Runnable f16231z;

        /* JADX INFO: renamed from: d */
        public int f16187d = 8388611;

        /* JADX INFO: renamed from: e */
        public int f16189e = 8388611;

        /* JADX INFO: renamed from: f */
        public int f16191f = 8388611;

        /* JADX INFO: renamed from: g */
        public int f16193g = 17;

        /* JADX INFO: renamed from: h */
        public int f16195h = -1;

        /* JADX INFO: renamed from: i */
        public int f16197i = -1;

        /* JADX INFO: renamed from: j */
        public int f16199j = 12;

        /* JADX INFO: renamed from: k */
        public int f16201k = -1;

        /* JADX INFO: renamed from: l */
        public int f16203l = -1;

        /* JADX INFO: renamed from: C */
        public boolean f16155C = false;

        /* JADX INFO: renamed from: D */
        public boolean f16157D = false;

        /* JADX INFO: renamed from: E */
        public Theme f16159E = Theme.LIGHT;

        /* JADX INFO: renamed from: F */
        public boolean f16160F = true;

        /* JADX INFO: renamed from: G */
        public float f16161G = 1.3f;

        /* JADX INFO: renamed from: H */
        public int f16162H = -1;

        /* JADX INFO: renamed from: I */
        public Integer[] f16163I = null;

        /* JADX INFO: renamed from: J */
        public boolean f16164J = true;

        /* JADX INFO: renamed from: L */
        public int f16166L = -1;

        /* JADX INFO: renamed from: a0 */
        public int f16182a0 = -1;

        /* JADX INFO: renamed from: b0 */
        public Runnable f16184b0 = null;

        /* JADX INFO: renamed from: c0 */
        public float f16186c0 = -1.0f;

        /* JADX INFO: renamed from: d0 */
        public boolean f16188d0 = false;

        /* JADX INFO: renamed from: e0 */
        public int f16190e0 = -2;

        /* JADX INFO: renamed from: f0 */
        public ImageView.ScaleType f16192f0 = null;

        /* JADX INFO: renamed from: g0 */
        public boolean f16194g0 = false;

        /* JADX INFO: renamed from: j0 */
        public int f16200j0 = -1;

        /* JADX INFO: renamed from: l0 */
        public int f16204l0 = 0;

        /* JADX INFO: renamed from: q0 */
        public int f16214q0 = -1;

        /* JADX INFO: renamed from: r0 */
        public int f16216r0 = -1;

        /* JADX INFO: renamed from: w0 */
        public int f16226w0 = -1;

        /* JADX INFO: renamed from: x0 */
        public int f16228x0 = -1;

        /* JADX INFO: renamed from: y0 */
        public int f16230y0 = -1;

        /* JADX INFO: renamed from: z0 */
        public int f16232z0 = -1;

        /* JADX INFO: renamed from: A0 */
        public int f16152A0 = Dialog.f16108Q;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e$a */
        public class a implements InterfaceC4462g {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ArrayList f16233a;

            public a(ArrayList arrayList) {
                this.f16233a = arrayList;
            }

            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((MenuItem.OnMenuItemClickListener) Reflect.m222382on(this.f16233a.get(i)).get("mClickListener")).onMenuItemClick((MenuItem) this.f16233a.get(i));
            }
        }

        public C4460e(@NonNull Context context) {
            this.f16181a = context;
        }

        /* JADX INFO: renamed from: A */
        public C4460e m21493A(DialogInterface.OnCancelListener onCancelListener) {
            this.f16170P = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: A0 */
        public Dialog m21494A0() {
            Dialog dialogM21566z = m21566z();
            dialogM21566z.m128493A();
            return dialogM21566z;
        }

        /* JADX INFO: renamed from: B */
        public C4460e m21495B(boolean z) {
            this.f16160F = z;
            return this;
        }

        /* JADX INFO: renamed from: B0 */
        public C4460e m21496B0(DialogInterface.OnShowListener onShowListener) {
            this.f16172R = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C4460e m21497C(int i, int i2, int i3, int i4) {
            this.f16226w0 = i;
            this.f16228x0 = i2;
            this.f16230y0 = i3;
            this.f16232z0 = i4;
            return this;
        }

        /* JADX INFO: renamed from: C0 */
        public C4460e m21498C0(CharSequence charSequence) {
            this.f16185c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C4460e m21499D(@StringRes int i) {
            m21503F(this.f16181a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: D0 */
        public C4460e m21500D0(Theme theme) {
            this.f16159E = theme;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C4460e m21501E(@StringRes int i, Object... objArr) {
            m21503F(this.f16181a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: E0 */
        public C4460e m21502E0(@StringRes int i) {
            m21506G0(this.f16181a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C4460e m21503F(CharSequence charSequence) {
            this.f16205m = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: F0 */
        public C4460e m21504F0(@StringRes int i, Object... objArr) {
            m21506G0(this.f16181a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C4460e m21505G(int i) {
            this.f16203l = i;
            return this;
        }

        /* JADX INFO: renamed from: G0 */
        public C4460e m21506G0(CharSequence charSequence) {
            this.f16183b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C4460e m21507H(@ColorRes int i) {
            m21505G(this.f16181a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: H0 */
        public C4460e m21508H0(int i) {
            this.f16195h = i;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C4460e m21509I(int i) {
            this.f16191f = i;
            return this;
        }

        /* JADX INFO: renamed from: I0 */
        public C4460e m21510I0(@ColorRes int i) {
            m21508H0(this.f16181a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C4460e m21511J(boolean z) {
            this.f16194g0 = z;
            return this;
        }

        /* JADX INFO: renamed from: J0 */
        public C4460e m21512J0(int i) {
            this.f16187d = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C4460e m21513K(float f) {
            this.f16186c0 = f;
            return this;
        }

        /* JADX INFO: renamed from: K0 */
        public C4460e m21514K0(InterfaceC4464i interfaceC4464i) {
            this.f16173S = interfaceC4464i;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C4460e m21515L(int i) {
            this.f16204l0 = i;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C4460e m21516M(@LayoutRes int i) {
            return m21519P(LayoutInflater.from(this.f16181a).inflate(i, (ViewGroup) null), false);
        }

        /* JADX INFO: renamed from: N */
        public C4460e m21517N(@LayoutRes int i, boolean z) {
            return m21519P(LayoutInflater.from(this.f16181a).inflate(i, (ViewGroup) null), z);
        }

        @Deprecated
        /* JADX INFO: renamed from: O */
        public C4460e m21518O(View view) {
            return m21519P(view, true);
        }

        /* JADX INFO: renamed from: P */
        public C4460e m21519P(View view, boolean z) {
            this.f16219t = view;
            this.f16175U = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C4460e m21520Q() {
            this.f16224v0 = true;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C4460e m21521R(boolean z) {
            this.f16156C0 = z;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C4460e m21522S(int i) {
            this.f16197i = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C4460e m21523T(@ColorRes int i) {
            m21522S(this.f16181a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C4460e m21524U(int i) {
            this.f16199j = i;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C4460e m21525V(DialogInterface.OnDismissListener onDismissListener) {
            this.f16169O = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C4460e m21526W(boolean z) {
            this.f16180Z = z;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C4460e m21527X(boolean z) {
            this.f16174T = z;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public Dialog m21528Y() {
            return this.f16222u0;
        }

        /* JADX INFO: renamed from: Z */
        public C4460e m21529Z(int i) {
            this.f16214q0 = i;
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C4460e m21530a0(Drawable drawable) {
            this.f16165K = drawable;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C4460e m21531b0(View view) {
            this.f16167M = view;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C4460e m21532c0(@DrawableRes int i) {
            this.f16165K = this.f16181a.getResources().getDrawable(i);
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C4460e m21533d0(int i) {
            this.f16166L = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C4460e m21534e0(List<String> list) {
            CharSequence[] charSequenceArr = new CharSequence[list.size()];
            for (int i = 0; i < list.size(); i++) {
                charSequenceArr[i] = list.get(i);
            }
            this.f16207n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C4460e m21535f0(CharSequence[] charSequenceArr) {
            this.f16207n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C4460e m21536g0(InterfaceC4462g interfaceC4462g) {
            this.f16151A = interfaceC4462g;
            this.f16153B = null;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C4460e m21537h0(int i, InterfaceC4462g interfaceC4462g) {
            this.f16162H = i;
            this.f16151A = null;
            this.f16153B = interfaceC4462g;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C4460e m21538i0(DialogInterface.OnKeyListener onKeyListener) {
            this.f16171Q = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C4460e m21539j0(final Menu menu) {
            m21534e0(jyb.m147486Q(jyb.m147497a0(menu.size()), new qcj() { // from class: l.v0e
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return menu.getItem(((Integer) obj).intValue()).getTitle().toString();
                }
            })).m21536g0(new a((ArrayList) Reflect.m222382on(menu).get("mItems")));
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C4460e m21540k0(@StringRes int i) {
            return m21543n0(this.f16181a.getString(i), this.f16229y);
        }

        /* JADX INFO: renamed from: l0 */
        public C4460e m21541l0(@StringRes int i, Runnable runnable) {
            return m21543n0(this.f16181a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: m0 */
        public C4460e m21542m0(CharSequence charSequence) {
            return m21543n0(charSequence, this.f16229y);
        }

        /* JADX INFO: renamed from: n0 */
        public C4460e m21543n0(CharSequence charSequence, Runnable runnable) {
            this.f16217s = charSequence;
            this.f16229y = runnable;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C4460e m21544o(int i) {
            this.f16221u = i;
            this.f16223v = i;
            this.f16225w = i;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C4460e m21545o0(int i) {
            this.f16223v = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C4460e m21546p(ListAdapter listAdapter) {
            this.f16168N = listAdapter;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C4460e m21547p0(@StringRes int i, Runnable runnable) {
            return m21549q0(this.f16181a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: q */
        public C4460e m21548q(boolean z) {
            this.f16164J = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C4460e m21549q0(CharSequence charSequence, Runnable runnable) {
            this.f16215r = charSequence;
            this.f16231z = runnable;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C4460e m21550r(int i) {
            this.f16176V = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public C4460e m21551r0(CharSequence charSequence) {
            this.f16154B0 = charSequence;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f16204l0 = tgc0.f174066l;
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C4460e m21552s() {
            this.f16188d0 = true;
            this.f16187d = 1;
            this.f16189e = 1;
            return this;
        }

        /* JADX INFO: renamed from: s0 */
        public C4460e m21553s0(@StringRes int i) {
            return m21559v0(this.f16181a.getString(i), this.f16227x);
        }

        /* JADX INFO: renamed from: t */
        public C4460e m21554t() {
            this.f16218s0 = true;
            return this;
        }

        /* JADX INFO: renamed from: t0 */
        public C4460e m21555t0(@StringRes int i, Runnable runnable) {
            return m21559v0(this.f16181a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: u */
        public C4460e m21556u() {
            this.f16198i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C4460e m21557u0(CharSequence charSequence) {
            return m21559v0(charSequence, this.f16227x);
        }

        /* JADX INFO: renamed from: v */
        public C4460e m21558v() {
            this.f16202k0 = true;
            this.f16220t0 = true;
            this.f16218s0 = true;
            this.f16174T = true;
            this.f16198i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C4460e m21559v0(CharSequence charSequence, Runnable runnable) {
            this.f16209o = charSequence;
            this.f16227x = runnable;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C4460e m21560w(int i) {
            this.f16193g = i;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C4460e m21561w0(Drawable drawable) {
            this.f16196h0 = drawable;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C4460e m21562x(int i) {
            this.f16152A0 = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C4460e m21563x0(Drawable drawable) {
            this.f16211p = drawable;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C4460e m21564y(boolean z) {
            this.f16188d0 = z;
            return this;
        }

        /* JADX INFO: renamed from: y0 */
        public C4460e m21565y0(AbstractC4461f abstractC4461f) {
            this.f16158D0 = abstractC4461f;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public Dialog m21566z() {
            Dialog dialog = new Dialog(this);
            this.f16222u0 = dialog;
            return dialog;
        }

        /* JADX INFO: renamed from: z0 */
        public Dialog m21567z0() {
            Dialog dialogM21566z = m21566z();
            dialogM21566z.show();
            return dialogM21566z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$f */
    public static abstract class AbstractC4461f {
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$g */
    public interface InterfaceC4462g {
        /* JADX INFO: renamed from: a */
        void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$h */
    public class C4463h extends ArrayAdapter<CharSequence> {

        /* JADX INFO: renamed from: a */
        public final int f16235a;

        public C4463h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
            this.f16235a = Dialog.m21445b0(getContext(), o8c0.f145397g, Dialog.this.f16119F);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @SuppressLint({"WrongViewCast"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(vcc0.f183390R0);
            int i2 = C4459d.f16150b[Dialog.this.f16120G.ordinal()];
            if (i2 == 1) {
                ((RadioButton) view2.findViewById(vcc0.f183357B)).setChecked(Dialog.this.f16126l.f16162H == i);
            } else if (i2 == 2) {
                ((CheckBox) view2.findViewById(vcc0.f183357B)).setChecked(Dialog.this.f16121H.contains(Integer.valueOf(i)));
            }
            textView.setText(Dialog.this.f16126l.f16207n[i]);
            textView.setTextColor(this.f16235a);
            view2.setTag(i + ":" + ((Object) Dialog.this.f16126l.f16207n[i]));
            C4460e c4460e = Dialog.this.f16126l;
            Drawable drawableM21448e0 = c4460e.f16178X;
            if (drawableM21448e0 == null && (drawableM21448e0 = Dialog.m21448e0(c4460e.f16181a, o8c0.f145398h)) == null) {
                drawableM21448e0 = Dialog.m21448e0(getContext(), o8c0.f145398h);
            }
            view2.setBackgroundDrawable(drawableM21448e0);
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$i */
    public interface InterfaceC4464i {
        /* JADX INFO: renamed from: a */
        void mo21569a(Dialog dialog);
    }

    @SuppressLint({"InflateParams"})
    public Dialog(C4460e c4460e) {
        super(m21441Q(c4460e), c4460e.f16198i0, c4460e.f16204l0);
        this.f16126l = c4460e;
        VLinear_Foreground vLinear_Foreground = new VLinear_Foreground(c4460e.f16181a);
        this.f16125k = vLinear_Foreground;
        vLinear_Foreground.setOrientation(1);
        this.f16125k.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        boolean zIsEmpty = TextUtils.isEmpty(c4460e.f16154B0);
        VLinear_Foreground vLinear_Foreground2 = this.f16125k;
        if (zIsEmpty) {
            this.f16124j = vLinear_Foreground2;
        } else {
            vLinear_Foreground2.setBackgroundResource(abc0.f69410b);
            VLinear_Foreground vLinear_Foreground3 = new VLinear_Foreground(c4460e.f16181a);
            this.f16124j = vLinear_Foreground3;
            vLinear_Foreground3.setOrientation(1);
            vLinear_Foreground3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vLinear_Foreground3.addView(this.f16125k);
            this.f16138x = new VText(c4460e.f16181a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = f16104M;
            layoutParams.gravity = 17;
            this.f16138x.setLayoutParams(layoutParams);
            this.f16138x.setTextSize(c4460e.f16199j);
            this.f16138x.setTypeface(lyh0.m156283c(2));
            int i = c4460e.f16197i;
            TextView textView = this.f16138x;
            if (i != -1) {
                textView.setTextColor(i);
            } else {
                textView.setTextColor(getContext().getResources().getColor(z8c0.f203355p));
            }
            this.f16138x.setText(c4460e.f16154B0);
            this.f16138x.setGravity(17);
            if (c4460e.f16156C0) {
                this.f16138x.setOnClickListener(new View.OnClickListener() { // from class: l.t0e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f171489a.m21443W(view);
                    }
                });
            }
            vLinear_Foreground3.addView(this.f16138x);
        }
        LinearLayout linearLayout = new LinearLayout(c4460e.f16181a);
        this.f16135u = linearLayout;
        linearLayout.setOrientation(1);
        this.f16135u.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        if (c4460e.f16202k0) {
            m21451J(c4460e);
        } else {
            m21452K(c4460e);
        }
        DialogInterface.OnShowListener onShowListener = c4460e.f16172R;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c4460e.f16170P;
        if (onCancelListener != null) {
            setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c4460e.f16169O;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c4460e.f16171Q;
        if (onKeyListener != null) {
            setOnKeyListener(onKeyListener);
        }
        this.f16125k.addView(this.f16135u);
        setCancelable(c4460e.f16160F);
        setCanceledOnTouchOutside(c4460e.f16160F);
        int i2 = c4460e.f16176V;
        if (i2 == 0) {
            c4460e.f16176V = m21444a0(getContext(), o8c0.f145393c);
        } else {
            this.f16124j.setBackgroundColor(i2);
        }
        int iM21444a0 = m21444a0(getContext(), o8c0.f145392b);
        int i3 = c4460e.f16221u;
        this.f16122I = i3 != 0;
        int i4 = c4460e.f16223v;
        this.f16123J = i4 != 0;
        if (iM21444a0 != 0) {
            c4460e.f16221u = i3 == 0 ? iM21444a0 : i3;
            c4460e.f16223v = i4 == 0 ? iM21444a0 : i4;
            int i5 = c4460e.f16225w;
            c4460e.f16225w = i5 != 0 ? i5 : iM21444a0;
        }
        if (c4460e.f16174T || c4460e.f16218s0 || c4460e.f16220t0) {
            this.f16117D = true;
        }
        m21459T();
        m128501y();
        m128500x();
        m128502z(this.f16124j);
    }

    /* JADX INFO: renamed from: G */
    public static int m21439G(int i) {
        return (int) (i * 0.9f);
    }

    /* JADX INFO: renamed from: H */
    public static int m21440H(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: Q */
    public static ContextThemeWrapper m21441Q(C4460e c4460e) {
        TypedArray typedArrayObtainStyledAttributes = c4460e.f16181a.getTheme().obtainStyledAttributes(new int[]{o8c0.f145396f});
        Theme theme = c4460e.f16159E;
        Theme theme2 = Theme.DARK;
        boolean z = theme == theme2;
        if (!z) {
            try {
                z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                if (!z) {
                    theme2 = Theme.LIGHT;
                }
                c4460e.f16159E = theme2;
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        return new ContextThemeWrapper(c4460e.f16181a, z ? tgc0.f174059e : tgc0.f174060f);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: R */
    public static int m21442R(int i) {
        if (i != 17) {
            return i != 8388613 ? 5 : 6;
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m21443W(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: a0 */
    public static int m21444a0(Context context, int i) {
        return m21445b0(context, i, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static int m21445b0(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static float m21446c0(Context context, int i) {
        return m21447d0(context, i, 0.0f);
    }

    /* JADX INFO: renamed from: d0 */
    public static float m21447d0(Context context, int i, float f) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDimension(0, f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Drawable m21448e0(Context context, int i) {
        return m21449f0(context, i, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static Drawable m21449f0(Context context, int i, Drawable drawable) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: I */
    public Dialog m21450I(boolean z) {
        this.f16126l.f16164J = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final void m21451J(C4460e c4460e) {
        CharSequence charSequence = c4460e.f16183b;
        boolean z = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c4460e.f16185c;
        boolean z2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence3 = c4460e.f16205m;
        boolean z3 = (charSequence3 == null || charSequence3.toString().trim().length() == 0) ? false : true;
        boolean z4 = c4460e.f16219t != null;
        CharSequence[] charSequenceArr = c4460e.f16207n;
        boolean z5 = (charSequenceArr != null && charSequenceArr.length > 0) || c4460e.f16168N != null;
        if (this.f16126l.f16216r0 != -1) {
            this.f16135u.setPadding(0, this.f16126l.f16216r0, 0, 0);
        }
        if (c4460e.f16165K != null) {
            ImageView imageView = new ImageView(this.f16126l.f16181a);
            this.f16128n = imageView;
            imageView.setImageDrawable(c4460e.f16165K);
            ImageView.ScaleType scaleType = this.f16126l.f16192f0;
            if (scaleType == null) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                imageView.setScaleType(scaleType);
            }
        }
        View view = c4460e.f16167M;
        if (view != null) {
            this.f16128n = view;
        }
        if (this.f16128n != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f16126l.f16190e0, -2);
            int i = c4460e.f16166L;
            if (i == -1) {
                layoutParams.topMargin = f16107P;
            } else {
                layoutParams.topMargin = i;
            }
            layoutParams.gravity = 1;
            this.f16128n.setMinimumHeight(f16113V);
            this.f16135u.addView(this.f16128n, layoutParams);
        }
        if (z || z2 || z3) {
            int i2 = ((!z4 || c4460e.f16224v0) && !z5) ? this.f16126l.f16152A0 : 0;
            LinearLayout linearLayout = new LinearLayout(this.f16126l.f16181a);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            int i3 = f16106O;
            layoutParams2.setMargins(i3, bnl0.m105588w0() < 960 ? f16103L : f16107P, i3, i2);
            linearLayout.setLayoutParams(layoutParams2);
            int i4 = 2;
            if (z) {
                this.f16129o = new VText(this.f16126l.f16181a);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                this.f16129o.setLayoutParams(layoutParams3);
                this.f16129o.setTextSize(20.0f);
                this.f16129o.setTypeface(lyh0.m156283c(2));
                int i5 = c4460e.f16195h;
                if (i5 != -1) {
                    this.f16129o.setTextColor(i5);
                } else {
                    this.f16129o.setTextColor(m21445b0(getContext(), o8c0.f145400j, getContext().getResources().getColor(z8c0.f203352m)));
                }
                this.f16129o.setText(this.f16126l.f16183b);
                this.f16129o.setGravity(17);
                linearLayout.addView(this.f16129o);
            } else {
                i4 = 2;
            }
            if (z2) {
                this.f16130p = new VText(this.f16126l.f16181a);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 16;
                layoutParams4.setMargins(0, z ? f16104M : 0, 0, 0);
                this.f16130p.setLayoutParams(layoutParams4);
                this.f16130p.setTextSize(14.0f);
                this.f16130p.setTypeface(lyh0.m156283c(i4));
                int i6 = c4460e.f16201k;
                if (i6 != -1) {
                    this.f16130p.setTextColor(i6);
                } else {
                    this.f16130p.setTextColor(m21445b0(getContext(), o8c0.f145399i, getContext().getResources().getColor(z8c0.f203353n)));
                }
                this.f16130p.setGravity(17);
                this.f16130p.setText(this.f16126l.f16185c);
                linearLayout.addView(this.f16130p);
            }
            if (z3) {
                this.f16131q = new VText(this.f16126l.f16181a);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.gravity = 16;
                layoutParams5.setMargins(0, (z || z2) ? f16104M : 0, 0, 0);
                if (c4460e.f16194g0) {
                    this.f16131q.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f16131q.setHighlightColor(getContext().getResources().getColor(z8c0.f203338E));
                }
                this.f16131q.setLayoutParams(layoutParams5);
                this.f16131q.setTypeface(lyh0.m156283c(i4));
                TextView textView = this.f16131q;
                float f = this.f16126l.f16186c0;
                if (f <= 0.0f) {
                    f = 14.0f;
                }
                textView.setTextSize(f);
                this.f16131q.setText(this.f16126l.f16205m);
                int i7 = c4460e.f16203l;
                if (i7 != -1) {
                    this.f16131q.setTextColor(i7);
                } else {
                    this.f16131q.setTextColor(m21445b0(getContext(), o8c0.f145395e, getContext().getResources().getColor(z8c0.f203353n)));
                }
                this.f16131q.setGravity(c4460e.f16193g);
                this.f16131q.setTextAlignment(m21442R(c4460e.f16193g));
                linearLayout.addView(this.f16131q);
            }
            this.f16135u.addView(linearLayout);
        }
        if (z4) {
            this.f16133s = new FrameLayout(this.f16126l.f16181a);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(c4460e.f16226w0 == -1 ? 0 : c4460e.f16226w0, c4460e.f16228x0 == -1 ? 0 : c4460e.f16228x0, c4460e.f16230y0 == -1 ? 0 : c4460e.f16230y0, c4460e.f16232z0 == -1 ? 0 : c4460e.f16232z0);
            this.f16133s.setLayoutParams(layoutParams6);
            this.f16133s.addView(c4460e.f16219t);
            boolean z6 = c4460e.f16224v0;
            LinearLayout linearLayout2 = this.f16135u;
            if (z6) {
                linearLayout2.addView(this.f16133s, 0);
            } else {
                linearLayout2.addView(this.f16133s);
            }
        }
        if (z5) {
            FrameLayout frameLayout = new FrameLayout(this.f16126l.f16181a);
            this.f16136v = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f16126l.f16181a);
            this.f16127m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f16127m.setDivider(null);
            this.f16127m.setDividerHeight(0);
            this.f16127m.setScrollBarDefaultDelayBeforeFade(1000);
            this.f16127m.setScrollBarStyle(33554432);
            this.f16127m.setFastScrollEnabled(this.f16126l.f16180Z);
            this.f16127m.setSelector(m21448e0(getContext(), o8c0.f145398h));
            int i8 = c4460e.f16177W;
            if (i8 != 0) {
                this.f16119F = i8;
            } else if (c4460e.f16159E == Theme.LIGHT) {
                this.f16119F = RoundedDrawable.DEFAULT_BORDER_COLOR;
            } else {
                this.f16119F = -1;
            }
            C4460e c4460e2 = this.f16126l;
            if (c4460e2.f16168N == null) {
                if (c4460e2.f16153B != null) {
                    this.f16120G = ListType.SINGLE;
                    this.f16118E = c4460e.f16157D;
                } else {
                    c4460e2.getClass();
                    this.f16120G = ListType.REGULAR;
                }
                this.f16126l.f16168N = new C4463h(this.f16126l.f16181a, ListType.getLayoutForType(this.f16120G), vcc0.f183390R0, this.f16126l.f16207n);
            }
            this.f16136v.setPadding(0, (z || z2 || c4460e.f16205m != null || c4460e.f16219t != null) ? 0 : f16103L, 0, !m21458S() ? f16103L : 0);
            this.f16136v.addView(this.f16127m);
            this.f16135u.addView(this.f16136v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m21452K(C4460e c4460e) {
        Dialog dialog;
        CharSequence charSequence = c4460e.f16183b;
        Object[] objArr = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c4460e.f16185c;
        Object[] objArr2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        if (objArr != false) {
            LinearLayout linearLayout = new LinearLayout(this.f16126l.f16181a);
            this.f16132r = linearLayout;
            linearLayout.setOrientation(this.f16126l.f16188d0 ? 1 : 0);
            this.f16132r.setGravity(16);
            this.f16132r.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = this.f16132r;
            int i = f16106O;
            int i2 = this.f16126l.f16216r0 == -1 ? i : this.f16126l.f16216r0;
            int i3 = f16105N;
            linearLayout2.setPadding(i, i2, i, i3);
            if (c4460e.f16165K != null) {
                ImageView imageView = new ImageView(this.f16126l.f16181a);
                this.f16128n = imageView;
                imageView.setImageDrawable(c4460e.f16165K);
                if (!this.f16126l.f16188d0) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            View view = c4460e.f16167M;
            if (view != null) {
                this.f16128n = view;
            }
            if (this.f16128n != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.f16126l.f16188d0) {
                    layoutParams.setMargins(i3, i3, i3, i3);
                    layoutParams.gravity = 1;
                } else {
                    layoutParams.setMargins(0, 0, i3, 0);
                }
                this.f16128n.setLayoutParams(layoutParams);
                this.f16132r.addView(this.f16128n);
            }
            this.f16129o = new VText(this.f16126l.f16181a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f16126l.f16188d0) {
                layoutParams2.gravity = 16;
            }
            this.f16129o.setLayoutParams(layoutParams2);
            this.f16129o.setTextSize(18.0f);
            this.f16129o.setTypeface(lyh0.m156283c(3), 1);
            this.f16129o.setText(this.f16126l.f16183b);
            int i4 = c4460e.f16195h;
            if (i4 != -1) {
                this.f16129o.setTextColor(i4);
            } else {
                this.f16129o.setTextColor(m21445b0(getContext(), o8c0.f145400j, m21444a0(getContext(), R.attr.textColorPrimary)));
            }
            this.f16129o.setGravity(c4460e.f16187d);
            this.f16129o.setTextAlignment(m21442R(c4460e.f16187d));
            this.f16132r.addView(this.f16129o);
            this.f16135u.addView(this.f16132r);
        }
        if (objArr2 != false) {
            this.f16130p = new VText(this.f16126l.f16181a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f16126l.f16188d0) {
                layoutParams3.gravity = 16;
            }
            layoutParams3.setMargins(0, objArr != false ? 0 : f16106O, 0, f16105N);
            this.f16130p.setLayoutParams(layoutParams3);
            this.f16130p.setTextSize(14.0f);
            this.f16130p.setTypeface(lyh0.m156283c(2));
            this.f16130p.setText(this.f16126l.f16185c);
            TextView textView = this.f16130p;
            int i5 = f16106O;
            textView.setPadding(i5, 0, i5, 0);
            int i6 = c4460e.f16201k;
            if (i6 != -1) {
                this.f16130p.setTextColor(i6);
            } else {
                this.f16130p.setTextColor(m21445b0(getContext(), o8c0.f145399i, m21444a0(getContext(), R.attr.textColorSecondary)));
            }
            this.f16130p.setGravity(c4460e.f16189e);
            this.f16129o.setTextAlignment(m21442R(c4460e.f16187d));
            this.f16135u.addView(this.f16130p);
        }
        if (c4460e.f16205m != null) {
            FrameLayout frameLayout = new FrameLayout(this.f16126l.f16181a);
            this.f16134t = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = this.f16134t;
            int i7 = f16106O;
            int i8 = f16105N;
            frameLayout2.setPadding(i7, 0, i7, i8);
            VText vText = new VText(this.f16126l.f16181a);
            this.f16131q = vText;
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (c4460e.f16194g0) {
                this.f16131q.setMovementMethod(LinkMovementMethod.getInstance());
                this.f16131q.setHighlightColor(getContext().getResources().getColor(z8c0.f203338E));
            }
            this.f16131q.setTypeface(lyh0.m156283c(2));
            TextView textView2 = this.f16131q;
            float f = this.f16126l.f16186c0;
            textView2.setTextSize(f > 0.0f ? f : 14.0f);
            this.f16131q.setText(this.f16126l.f16205m);
            int i9 = c4460e.f16203l;
            if (i9 != -1) {
                this.f16131q.setTextColor(i9);
            } else {
                this.f16131q.setTextColor(m21445b0(getContext(), o8c0.f145395e, m21444a0(getContext(), R.attr.textColorSecondary)));
            }
            if (objArr == true || objArr2 == true) {
                this.f16131q.setGravity(c4460e.f16191f);
                this.f16131q.setTextAlignment(m21442R(c4460e.f16191f));
            } else {
                this.f16134t.setMinimumHeight(f16112U);
                this.f16134t.setPadding(i7, i7, i7, i8);
            }
            this.f16134t.addView(this.f16131q);
            this.f16135u.addView(this.f16134t);
        }
        if (c4460e.f16219t != null) {
            this.f16133s = new FrameLayout(this.f16126l.f16181a);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(c4460e.f16226w0 == -1 ? 0 : c4460e.f16226w0, c4460e.f16228x0 == -1 ? 0 : c4460e.f16228x0, c4460e.f16230y0 == -1 ? 0 : c4460e.f16230y0, c4460e.f16232z0 == -1 ? 0 : c4460e.f16232z0);
            this.f16133s.setLayoutParams(layoutParams4);
            this.f16133s.addView(c4460e.f16219t);
            boolean z = c4460e.f16224v0;
            LinearLayout linearLayout3 = this.f16135u;
            if (z) {
                linearLayout3.addView(this.f16133s, 0);
            } else {
                linearLayout3.addView(this.f16133s);
            }
        }
        CharSequence[] charSequenceArr = c4460e.f16207n;
        if ((charSequenceArr == null || charSequenceArr.length <= 0) && c4460e.f16168N == null) {
            dialog = this;
        } else {
            FrameLayout frameLayout3 = new FrameLayout(this.f16126l.f16181a);
            this.f16136v = frameLayout3;
            frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f16126l.f16181a);
            this.f16127m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f16127m.setDivider(null);
            this.f16127m.setDividerHeight(0);
            this.f16127m.setScrollBarDefaultDelayBeforeFade(1000);
            this.f16127m.setScrollBarStyle(33554432);
            this.f16127m.setFastScrollEnabled(this.f16126l.f16180Z);
            this.f16127m.setSelector(m21448e0(getContext(), o8c0.f145398h));
            int i10 = c4460e.f16177W;
            if (i10 != 0) {
                this.f16119F = i10;
            } else if (c4460e.f16159E == Theme.LIGHT) {
                this.f16119F = RoundedDrawable.DEFAULT_BORDER_COLOR;
            } else {
                this.f16119F = -1;
            }
            C4460e c4460e2 = this.f16126l;
            if (c4460e2.f16168N == null) {
                if (c4460e2.f16153B != null) {
                    this.f16120G = ListType.SINGLE;
                    this.f16118E = c4460e.f16157D;
                } else {
                    c4460e2.getClass();
                    this.f16120G = ListType.REGULAR;
                }
                dialog = this;
                this.f16126l.f16168N = dialog.new C4463h(this.f16126l.f16181a, ListType.getLayoutForType(this.f16120G), vcc0.f183390R0, this.f16126l.f16207n);
            } else {
                dialog = this;
            }
            dialog.f16136v.setPadding(0, (objArr == true || objArr2 == true || c4460e.f16205m != null || c4460e.f16219t != null) ? 0 : f16103L, 0, !dialog.m21458S() ? f16103L : 0);
            dialog.f16136v.addView(dialog.f16127m);
            dialog.f16135u.addView(dialog.f16136v);
        }
        if (objArr == true && objArr2 != true && c4460e.f16205m == null && c4460e.f16219t == null) {
            CharSequence[] charSequenceArr2 = c4460e.f16207n;
            if ((charSequenceArr2 == null || charSequenceArr2.length == 0) && c4460e.f16168N == null) {
                dialog.f16132r.setMinimumHeight(f16112U);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m21453L() {
        return (getWindow().getDecorView().getMeasuredWidth() - (((int) getContext().getResources().getDimension(bac0.f75676o)) * 2)) / m21463Y();
    }

    /* JADX INFO: renamed from: M */
    public final void m21454M() {
        boolean z = this.f16117D;
        if (m21463Y() <= 1) {
            return;
        }
        if (this.f16126l.f16174T && !this.f16117D) {
            this.f16117D = true;
            m21459T();
            return;
        }
        int iM21453L = m21453L();
        this.f16117D = false;
        if (this.f16126l.f16209o != null) {
            this.f16117D = this.f16139y.getWidth() > iM21453L;
        }
        if (!this.f16117D && this.f16126l.f16215r != null) {
            this.f16117D = this.f16114A.getWidth() > iM21453L;
        }
        if (!this.f16117D && this.f16126l.f16217s != null) {
            this.f16117D = this.f16115B.getWidth() > iM21453L;
        }
        if (z != this.f16117D) {
            m21459T();
        }
    }

    /* JADX INFO: renamed from: N */
    public final ColorStateList m21455N(int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m21440H(i, 0.4f), i});
    }

    /* JADX INFO: renamed from: O */
    public final Drawable m21456O() {
        boolean z = this.f16117D;
        C4460e c4460e = this.f16126l;
        if (z) {
            Drawable drawable = c4460e.f16178X;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableM21448e0 = m21448e0(c4460e.f16181a, o8c0.f145398h);
            if (drawableM21448e0 != null) {
                return drawableM21448e0;
            }
        } else {
            Drawable drawable2 = c4460e.f16179Y;
            if (drawable2 != null) {
                return drawable2;
            }
            Drawable drawableM21448e1 = m21448e0(c4460e.f16181a, o8c0.f145394d);
            if (drawableM21448e1 != null) {
                return drawableM21448e1;
            }
        }
        return m21448e0(getContext(), this.f16117D ? o8c0.f145398h : o8c0.f145394d);
    }

    /* JADX INFO: renamed from: P */
    public final View m21457P() {
        return this.f16126l.f16219t;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m21458S() {
        return m21463Y() > 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m21459T() {
        LinearLayout.LayoutParams layoutParams;
        if (!m21458S()) {
            m21460U();
            if (this.f16125k.getChildCount() < 2 && this.f16136v != null) {
                this.f16127m.setClipToPadding(false);
            }
            return false;
        }
        ViewGroup viewGroup = this.f16137w;
        if (viewGroup != null && this.f16125k.indexOfChild(viewGroup) != -1) {
            this.f16125k.removeView(this.f16137w);
        }
        this.f16139y = new FrameLayout(this.f16126l.f16181a);
        this.f16115B = new FrameLayout(this.f16126l.f16181a);
        this.f16114A = new FrameLayout(this.f16126l.f16181a);
        this.f16140z = this.f16126l.f16218s0 ? new VButton_FakeShadow(this.f16126l.f16181a) : new VText(this.f16126l.f16181a);
        this.f16116C = new VText(this.f16126l.f16181a);
        VText vText = new VText(this.f16126l.f16181a);
        if (this.f16117D) {
            this.f16137w = new LinearLayout(this.f16126l.f16181a);
            this.f16137w.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ((LinearLayout) this.f16137w).setOrientation(1);
            m21475q0(this.f16139y, false);
            if (this.f16126l.f16218s0) {
                m21469k0();
            } else {
                m21476r0(this.f16140z);
                this.f16139y.addView(this.f16140z);
            }
            m21475q0(this.f16115B, true);
            if (this.f16126l.f16220t0) {
                m21468j0();
            } else {
                m21476r0(this.f16116C);
                this.f16115B.addView(this.f16116C);
            }
            m21475q0(this.f16114A, false);
            m21476r0(vText);
            this.f16114A.addView(vText);
            this.f16137w.addView(this.f16139y);
            this.f16137w.addView(this.f16115B);
            this.f16137w.addView(this.f16114A);
            this.f16114A.setId(vcc0.f183430n);
            this.f16139y.setId(vcc0.f183432o);
            this.f16115B.setId(vcc0.f183428m);
        } else {
            this.f16137w = new RelativeLayout(this.f16126l.f16181a);
            if (this.f16126l.f16218s0) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ViewGroup viewGroup2 = this.f16137w;
                int i = f16104M;
                viewGroup2.setPadding(i, this.f16126l.f16219t == null ? f16106O : 0, i, i);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, f16111T);
            }
            this.f16137w.setLayoutParams(layoutParams);
            int i2 = f16107P;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
            layoutParams2.addRule(9, -1);
            layoutParams2.addRule(12, -1);
            int i3 = f16103L;
            layoutParams2.setMargins(i3, 0, i3, i3);
            this.f16114A.setLayoutParams(layoutParams2);
            FrameLayout frameLayout = this.f16114A;
            int i4 = f16112U;
            frameLayout.setMinimumWidth(i4);
            m21470l0(vText);
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            this.f16114A.addView(vText);
            this.f16114A.setId(vcc0.f183430n);
            if (this.f16126l.f16220t0) {
                m21468j0();
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams3.addRule(12, -1);
                this.f16115B.setLayoutParams(layoutParams3);
                m21470l0(this.f16116C);
                this.f16116C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f16115B.setMinimumWidth(i4);
                this.f16115B.addView(this.f16116C);
                this.f16115B.setId(vcc0.f183428m);
            }
            if (this.f16126l.f16218s0) {
                m21469k0();
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams4.addRule(11, -1);
                layoutParams4.addRule(12, -1);
                layoutParams4.setMargins(i3, 0, i3, i3);
                this.f16139y.setLayoutParams(layoutParams4);
                this.f16139y.setMinimumWidth(i4);
                m21470l0(this.f16140z);
                this.f16140z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f16139y.addView(this.f16140z);
                this.f16139y.setId(vcc0.f183432o);
            }
            this.f16137w.addView(this.f16114A);
            this.f16137w.addView(this.f16115B);
            this.f16137w.addView(this.f16139y);
        }
        Drawable drawable = this.f16126l.f16196h0;
        if (drawable != null) {
            bnl0.m105563k(this.f16140z, drawable);
            this.f16140z.setCompoundDrawablePadding(f16102K);
        }
        CharSequence charSequence = this.f16126l.f16209o;
        if (charSequence != null) {
            this.f16140z.setText(charSequence.toString().toUpperCase());
            this.f16139y.setTag("POSITIVE");
            this.f16139y.setOnClickListener(this);
            if (!this.f16126l.f16218s0) {
                this.f16140z.setTextColor(m21455N(this.f16126l.f16221u));
                this.f16139y.setBackgroundDrawable(m21456O());
            }
        } else {
            this.f16139y.setVisibility(8);
        }
        C4460e c4460e = this.f16126l;
        if (c4460e.f16215r != null) {
            vText.setTextColor(m21455N(c4460e.f16225w));
            this.f16114A.setBackgroundDrawable(m21456O());
            vText.setText(this.f16126l.f16215r.toString().toUpperCase());
            this.f16114A.setTag("NEUTRAL");
            this.f16114A.setOnClickListener(this);
        } else {
            this.f16114A.setVisibility(8);
        }
        CharSequence charSequence2 = this.f16126l.f16217s;
        if (charSequence2 != null) {
            this.f16116C.setText(charSequence2.toString().toUpperCase());
            this.f16115B.setTag("NEGATIVE");
            this.f16115B.setOnClickListener(this);
            if (!this.f16126l.f16220t0) {
                this.f16116C.setTextColor(m21455N(this.f16126l.f16223v));
                this.f16115B.setBackgroundDrawable(m21456O());
            }
            if (!this.f16117D && !this.f16126l.f16220t0) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, f16107P);
                if (this.f16126l.f16209o != null) {
                    layoutParams5.addRule(16, this.f16139y.getId());
                    int i5 = f16103L;
                    layoutParams5.setMargins(i5, 0, 0, i5);
                } else {
                    layoutParams5.addRule(21);
                    int i6 = f16103L;
                    layoutParams5.setMargins(i6, 0, i6, i6);
                }
                layoutParams5.addRule(12, -1);
                this.f16115B.setLayoutParams(layoutParams5);
            }
        } else {
            this.f16115B.setVisibility(8);
        }
        if (!this.f16117D) {
            FrameLayout frameLayout2 = this.f16139y;
            int i7 = f16103L;
            frameLayout2.setPadding(i7, 0, i7, 0);
            this.f16115B.setPadding(i7, 0, i7, 0);
            this.f16114A.setPadding(i7, 0, i7, 0);
        }
        this.f16125k.addView(this.f16137w);
        m21460U();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final void m21460U() {
        C4460e c4460e = this.f16126l;
        CharSequence[] charSequenceArr = c4460e.f16207n;
        if ((charSequenceArr == null || charSequenceArr.length == 0) && c4460e.f16168N == null) {
            return;
        }
        this.f16127m.setAdapter(c4460e.f16168N);
        ListType listType = this.f16120G;
        VList vList = this.f16127m;
        if (listType != null) {
            vList.setOnItemClickListener(new C4456a());
        } else {
            vList.setOnItemClickListener(new C4457b());
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m21461V(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        return x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX INFO: renamed from: X */
    public View m21462X() {
        FrameLayout frameLayout = this.f16115B;
        return frameLayout != null ? frameLayout : findViewById(vcc0.f183428m);
    }

    /* JADX INFO: renamed from: Y */
    public final int m21463Y() {
        C4460e c4460e = this.f16126l;
        int i = c4460e.f16209o != null ? 1 : 0;
        if (c4460e.f16215r != null) {
            i++;
        }
        return c4460e.f16217s != null ? i + 1 : i;
    }

    /* JADX INFO: renamed from: Z */
    public View m21464Z() {
        FrameLayout frameLayout = this.f16139y;
        return frameLayout != null ? frameLayout : findViewById(vcc0.f183432o);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m21465g0(View view) {
        C4460e c4460e = this.f16126l;
        int i = c4460e.f16162H;
        c4460e.f16153B.mo21568a(this, view, i, i >= 0 ? c4460e.f16207n[i] : null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m21466h0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m21467i0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m21468j0() {
        if (this.f16117D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f16104M;
            this.f16115B.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f16104M;
            this.f16115B.setLayoutParams(layoutParams2);
        }
        this.f16116C.setTextAppearance(getContext(), tgc0.f174070p);
        if (this.f16123J) {
            this.f16116C.setTextColor(m21455N(this.f16126l.f16223v));
        }
        this.f16116C.setSingleLine(true);
        this.f16116C.setGravity(17);
        this.f16116C.setEnabled(true);
        Drawable drawable = this.f16126l.f16213q;
        TextView textView = this.f16116C;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f16088e.getResources().getDrawable(abc0.f69537q6));
        }
        this.f16116C.setMinHeight(f16110S);
        this.f16116C.setDuplicateParentStateEnabled(true);
        this.f16116C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f16115B.setClipChildren(false);
        this.f16115B.setClipToPadding(false);
        this.f16137w.setClipChildren(false);
        this.f16137w.setClipToPadding(false);
        this.f16116C.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f16088e, u7c0.f177899e));
        this.f16115B.addView(this.f16116C);
        this.f16115B.setId(vcc0.f183428m);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m21469k0() {
        if (this.f16117D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f16104M;
            this.f16139y.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f16104M;
            this.f16139y.setLayoutParams(layoutParams2);
        }
        this.f16140z.setSingleLine(true);
        this.f16140z.setTextAppearance(getContext(), tgc0.f174069o);
        if (this.f16122I) {
            this.f16140z.setTextColor(m21455N(this.f16126l.f16221u));
        }
        this.f16140z.setGravity(17);
        this.f16140z.setEnabled(true);
        Drawable drawable = this.f16126l.f16211p;
        TextView textView = this.f16140z;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f16088e.getResources().getDrawable(abc0.f69489k6));
        }
        this.f16140z.setMinHeight(f16110S);
        this.f16140z.setDuplicateParentStateEnabled(true);
        this.f16140z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f16139y.setClipChildren(false);
        this.f16139y.setClipToPadding(false);
        this.f16137w.setClipChildren(false);
        this.f16137w.setClipToPadding(false);
        this.f16140z.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f16088e, u7c0.f177899e));
        this.f16139y.addView(this.f16140z);
        this.f16139y.setId(vcc0.f183432o);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m21470l0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setTypeface(lyh0.m156283c(3));
        textView.setGravity(17);
        textView.setStateListAnimator(null);
        textView.setEnabled(true);
        textView.setBackgroundDrawable(null);
        textView.setMinWidth(f16109R);
        textView.setDuplicateParentStateEnabled(true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m21471m0(Runnable runnable) {
        this.f16126l.f16229y = runnable;
    }

    /* JADX INFO: renamed from: n0 */
    public TextView m21472n0(String str) {
        if (this.f16116C != null) {
            boolean z = this.f16126l.f16220t0;
            TextView textView = this.f16116C;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f16116C;
    }

    /* JADX INFO: renamed from: o0 */
    public void m21473o0(Runnable runnable) {
        this.f16126l.f16227x = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String str;
        String str2 = (String) view.getTag();
        if ("POSITIVE".equals(str2)) {
            Runnable runnable = this.f16126l.f16227x;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f16126l.f16153B != null) {
                m21465g0(view);
            }
            this.f16126l.getClass();
            if (this.f16126l.f16164J) {
                dismiss();
                return;
            }
            return;
        }
        if ("NEGATIVE".equals(str2)) {
            Runnable runnable2 = this.f16126l.f16229y;
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f16126l.f16164J) {
                dismiss();
                return;
            }
            return;
        }
        boolean zEquals = "NEUTRAL".equals(str2);
        C4460e c4460e = this.f16126l;
        if (zEquals) {
            Runnable runnable3 = c4460e.f16231z;
            if (runnable3 != null) {
                runnable3.run();
            }
            if (this.f16126l.f16164J) {
                dismiss();
                return;
            }
            return;
        }
        if (c4460e.f16151A != null) {
            if (c4460e.f16164J) {
                dismiss();
            }
            if (str2 != null) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length == 2) {
                    i = Integer.parseInt(strArrSplit[0]);
                    str = strArrSplit[1];
                } else {
                    i = strArrSplit.length == 1 ? Integer.parseInt(strArrSplit[0]) : 0;
                    str = "";
                }
                this.f16126l.f16151A.mo21568a(this, view, i, str);
                return;
            }
            return;
        }
        if (c4460e.f16153B == null) {
            c4460e.getClass();
            if (this.f16126l.f16164J) {
                dismiss();
                return;
            }
            return;
        }
        RadioButton radioButton = (RadioButton) ((LinearLayout) view).getChildAt(1);
        if (!radioButton.isChecked()) {
            radioButton.setChecked(true);
        }
        C4460e c4460e2 = this.f16126l;
        if (c4460e2.f16164J && c4460e2.f16209o == null) {
            dismiss();
            m21465g0(view);
        } else if (this.f16118E) {
            m21465g0(view);
        }
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        m21454M();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        InterfaceC4464i interfaceC4464i;
        if (motionEvent.getAction() != 0 || !m21461V(getContext(), motionEvent) || (interfaceC4464i = this.f16126l.f16173S) == null) {
            return super.onTouchEvent(motionEvent);
        }
        interfaceC4464i.mo21569a(this);
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public TextView m21474p0(String str) {
        if (this.f16140z != null) {
            boolean z = this.f16126l.f16218s0;
            TextView textView = this.f16140z;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f16140z;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m21475q0(FrameLayout frameLayout, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f16110S);
        layoutParams.gravity = 8388629;
        if (z) {
            layoutParams.setMargins(0, f16103L, 0, 0);
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setEnabled(true);
        int i = f16104M;
        frameLayout.setPadding(i, 0, i, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m21476r0(TextView textView) {
        m21470l0(textView);
        int i = f16103L;
        textView.setPadding(i, 0, i, 0);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, this.f16126l.f16218s0 ? 17 : 21));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f16129o.setText(charSequence);
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            wtq0.m207906a("Dialogs can only be shown from the UI thread.");
            return;
        }
        Window window = getWindow();
        window.setWindowAnimations(tgc0.f174061g);
        if (this.f16126l.f16214q0 != -1) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.f16126l.f16214q0;
            window.setAttributes(attributes);
        }
        if (this.f16126l.f16200j0 != -1) {
            getWindow().setWindowAnimations(this.f16126l.f16200j0);
        }
        C4460e c4460e = this.f16126l;
        if (c4460e.f16206m0 && c4460e.f16198i0) {
            this.f16124j.setBackgroundResource(abc0.f69410b);
            Drawable drawable = getContext().getDrawable(abc0.f69410b);
            drawable.setColorFilter(new LightingColorFilter(this.f16126l.f16212p0, 0));
            int i = f16110S;
            m21467i0(this.f16124j, i);
            m21466h0(this.f16124j, 1.0f);
            getWindow().setBackgroundDrawableResource(abc0.f69418c);
            this.f16124j.setForeground(drawable);
            getWindow().setDimAmount(0.7f);
            getWindow().setWindowAnimations(tgc0.f174056b);
            setOnShowListener(new DialogInterfaceOnShowListenerC4458c(i, drawable));
        }
        super.show();
    }
}
