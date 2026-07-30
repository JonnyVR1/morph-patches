package com.p046p1.mobile.android.app;

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
import p147v.VButton_FakeShadow;
import p147v.VLinear_Foreground;
import p147v.VList;
import p147v.VList_ScrollableHeight;
import p147v.VText;
import p149l.b6c0;
import p149l.bt0;
import p149l.e51;
import p149l.eqh0;
import p149l.ig3;
import p149l.j0c0;
import p149l.n8c0;
import p149l.ozb0;
import p149l.p4c0;
import p149l.qkq0;
import p149l.szd;
import p149l.t0c0;
import p149l.t100;
import p149l.u1c0;
import p149l.u2c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class Dialog extends szd implements View.OnClickListener {

    /* JADX INFO: renamed from: K */
    public static final int f15383K = t100.m186890d(6.0f);

    /* JADX INFO: renamed from: L */
    public static final int f15384L = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: M */
    public static final int f15385M = t100.m186890d(12.0f);

    /* JADX INFO: renamed from: N */
    public static final int f15386N = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: O */
    public static final int f15387O = t100.m186890d(24.0f);

    /* JADX INFO: renamed from: P */
    public static final int f15388P = t100.m186890d(32.0f);

    /* JADX INFO: renamed from: Q */
    public static final int f15389Q = t100.m186890d(40.0f);

    /* JADX INFO: renamed from: R */
    public static final int f15390R = t100.m186890d(42.0f);

    /* JADX INFO: renamed from: S */
    public static final int f15391S = t100.m186890d(48.0f);

    /* JADX INFO: renamed from: T */
    public static final int f15392T = t100.m186890d(64.0f);

    /* JADX INFO: renamed from: U */
    public static final int f15393U = t100.m186890d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f15394V = t100.m186890d(144.0f);

    /* JADX INFO: renamed from: A */
    public FrameLayout f15395A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f15396B;

    /* JADX INFO: renamed from: C */
    public TextView f15397C;

    /* JADX INFO: renamed from: D */
    public boolean f15398D;

    /* JADX INFO: renamed from: E */
    public boolean f15399E;

    /* JADX INFO: renamed from: F */
    public int f15400F;

    /* JADX INFO: renamed from: G */
    public ListType f15401G;

    /* JADX INFO: renamed from: H */
    public List<Integer> f15402H;

    /* JADX INFO: renamed from: I */
    public boolean f15403I;

    /* JADX INFO: renamed from: J */
    public boolean f15404J;

    /* JADX INFO: renamed from: j */
    public final VLinear_Foreground f15405j;

    /* JADX INFO: renamed from: k */
    public VLinear_Foreground f15406k;

    /* JADX INFO: renamed from: l */
    public final C4309e f15407l;

    /* JADX INFO: renamed from: m */
    public VList f15408m;

    /* JADX INFO: renamed from: n */
    public View f15409n;

    /* JADX INFO: renamed from: o */
    public TextView f15410o;

    /* JADX INFO: renamed from: p */
    public TextView f15411p;

    /* JADX INFO: renamed from: q */
    public TextView f15412q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f15413r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f15414s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f15415t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f15416u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f15417v;

    /* JADX INFO: renamed from: w */
    public ViewGroup f15418w;

    /* JADX INFO: renamed from: x */
    public TextView f15419x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f15420y;

    /* JADX INFO: renamed from: z */
    public TextView f15421z;

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
            int i = C4308d.f15431b[listType.ordinal()];
            if (i == 1) {
                return b6c0.f73772D;
            }
            if (i == 2) {
                return b6c0.f73771C;
            }
            if (i == 3) {
                return b6c0.f73770B;
            }
            ig3.m135964a("Not a valid list type");
            return 0;
        }
    }

    public enum Theme {
        LIGHT,
        DARK
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$a */
    public class C4305a implements AdapterView.OnItemClickListener {
        public C4305a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            ListType listType = dialog.f15401G;
            if (listType == ListType.MULTI) {
                boolean zIsChecked = ((CheckBox) view.findViewById(p4c0.f147057B)).isChecked();
                boolean zContains = Dialog.this.f15402H.contains(Integer.valueOf(i));
                if (zIsChecked) {
                    if (zContains) {
                        Dialog.this.f15402H.remove(Integer.valueOf(i));
                    }
                } else if (!zContains) {
                    Dialog dialog2 = Dialog.this;
                    if (dialog2.f15407l.f15463a0 != -1) {
                        int size = dialog2.f15402H.size();
                        C4309e c4309e = Dialog.this.f15407l;
                        if (size >= c4309e.f15463a0) {
                            c4309e.f15465b0.run();
                            return;
                        }
                    }
                    Dialog.this.f15402H.add(Integer.valueOf(i));
                }
            } else if (listType == ListType.SINGLE) {
                C4309e c4309e2 = dialog.f15407l;
                if (c4309e2.f15443H != i) {
                    c4309e2.f15443H = i;
                    ((C4312h) c4309e2.f15449N).notifyDataSetChanged();
                }
            }
            Dialog.this.onClick(view);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$b */
    public class C4306b implements AdapterView.OnItemClickListener {
        public C4306b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            C4309e c4309e = dialog.f15407l;
            if (c4309e.f15432A != null) {
                if (c4309e.f15445J) {
                    dialog.dismiss();
                }
                Dialog dialog2 = Dialog.this;
                dialog2.f15407l.f15432A.mo20569a(dialog2, view, i, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c */
    public class DialogInterfaceOnShowListenerC4307c implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f15424a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f15425b;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m20479b() {
                Dialog.this.f15405j.setBackgroundDrawable(null);
                Dialog.this.getWindow().setBackgroundDrawableResource(u2c0.f173282a);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                e51.m114743H(Dialog.this.getContext(), new Runnable() { // from class: l.gzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f105124a.m20479b();
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
                dialog.m20467h0(dialog.f15405j, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$c */
        public class c implements ValueAnimator.AnimatorUpdateListener {
            public c() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Dialog dialog = Dialog.this;
                dialog.m20468i0(dialog.f15405j, (1.0f - valueAnimator.getAnimatedFraction()) * DialogInterfaceOnShowListenerC4307c.this.f15424a);
                DialogInterfaceOnShowListenerC4307c.this.f15425b.setAlpha(Math.max(0, (int) ((1.0f - (valueAnimator.getAnimatedFraction() * 1.3f)) * 255.0f)));
            }
        }

        public DialogInterfaceOnShowListenerC4307c(int i, Drawable drawable) {
            this.f15424a = i;
            this.f15425b = drawable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        @TargetApi(21)
        public void onShow(DialogInterface dialogInterface) {
            ValueAnimator valueAnimatorOfFloat;
            ValueAnimator valueAnimatorOfInt;
            Dialog.this.getWindow().setDimAmount(0.7f);
            int width = Dialog.this.f15405j.getWidth();
            int height = Dialog.this.f15405j.getHeight();
            float fSqrt = (float) Math.sqrt(((width * width) / 4) + ((height * height) / 4));
            Dialog dialog = Dialog.this;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(dialog.f15405j, width / 2, height / 2, dialog.f15407l.f15491o0, fSqrt);
            Dialog.this.f15405j.setVisibility(0);
            animatorCreateCircularReveal.addListener(new a());
            animatorCreateCircularReveal.setDuration(Dialog.m20440G(250));
            animatorCreateCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            Dialog dialog2 = Dialog.this;
            Point point = dialog2.f15407l.f15489n0;
            if (point == null) {
                valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
                valueAnimatorOfFloat = ValueAnimator.ofInt(0, 1);
            } else {
                int[] iArr = new int[2];
                dialog2.f15405j.getLocationOnScreen(iArr);
                int width2 = iArr[0] + (Dialog.this.f15405j.getWidth() / 2);
                int height2 = iArr[1] + (Dialog.this.f15405j.getHeight() / 2);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f15405j, "translationX", point.x - width2, 0.0f);
                valueAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f15405j, "translationY", point.y - height2, 0.0f);
                valueAnimatorOfInt = objectAnimatorOfFloat;
            }
            valueAnimatorOfInt.setDuration(Dialog.m20440G(250));
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(Dialog.m20440G(250));
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new b());
            valueAnimatorOfInt2.setStartDelay(Dialog.m20440G(150));
            valueAnimatorOfInt2.setDuration(Dialog.m20440G(100));
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt3.addUpdateListener(new c());
            valueAnimatorOfInt3.setStartDelay(Dialog.m20440G(100));
            valueAnimatorOfInt3.setDuration(Dialog.m20440G(150));
            valueAnimatorOfInt3.setInterpolator(bt0.f77155b);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorCreateCircularReveal, valueAnimatorOfFloat, valueAnimatorOfInt3);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$d */
    public static /* synthetic */ class C4308d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15430a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f15431b;

        static {
            int[] iArr = new int[ListType.values().length];
            f15431b = iArr;
            try {
                iArr[ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15431b[ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15431b[ListType.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Action.values().length];
            f15430a = iArr2;
            try {
                iArr2[Action.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15430a[Action.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e */
    public static class C4309e {

        /* JADX INFO: renamed from: A */
        public InterfaceC4311g f15432A;

        /* JADX INFO: renamed from: B */
        public InterfaceC4311g f15434B;

        /* JADX INFO: renamed from: B0 */
        public CharSequence f15435B0;

        /* JADX INFO: renamed from: C0 */
        public boolean f15437C0;

        /* JADX INFO: renamed from: D0 */
        public AbstractC4310f f15439D0;

        /* JADX INFO: renamed from: K */
        public Drawable f15446K;

        /* JADX INFO: renamed from: M */
        public View f15448M;

        /* JADX INFO: renamed from: N */
        public ListAdapter f15449N;

        /* JADX INFO: renamed from: O */
        public DialogInterface.OnDismissListener f15450O;

        /* JADX INFO: renamed from: P */
        public DialogInterface.OnCancelListener f15451P;

        /* JADX INFO: renamed from: Q */
        public DialogInterface.OnKeyListener f15452Q;

        /* JADX INFO: renamed from: R */
        public DialogInterface.OnShowListener f15453R;

        /* JADX INFO: renamed from: S */
        public InterfaceC4313i f15454S;

        /* JADX INFO: renamed from: T */
        public boolean f15455T;

        /* JADX INFO: renamed from: U */
        public boolean f15456U;

        /* JADX INFO: renamed from: V */
        public int f15457V;

        /* JADX INFO: renamed from: W */
        public int f15458W;

        /* JADX INFO: renamed from: X */
        public Drawable f15459X;

        /* JADX INFO: renamed from: Y */
        public Drawable f15460Y;

        /* JADX INFO: renamed from: Z */
        public boolean f15461Z;

        /* JADX INFO: renamed from: a */
        public final Context f15462a;

        /* JADX INFO: renamed from: b */
        public CharSequence f15464b;

        /* JADX INFO: renamed from: c */
        public CharSequence f15466c;

        /* JADX INFO: renamed from: h0 */
        public Drawable f15477h0;

        /* JADX INFO: renamed from: i0 */
        public boolean f15479i0;

        /* JADX INFO: renamed from: k0 */
        public boolean f15483k0;

        /* JADX INFO: renamed from: m */
        public CharSequence f15486m;

        /* JADX INFO: renamed from: m0 */
        public boolean f15487m0;

        /* JADX INFO: renamed from: n */
        public CharSequence[] f15488n;

        /* JADX INFO: renamed from: n0 */
        public Point f15489n0;

        /* JADX INFO: renamed from: o */
        public CharSequence f15490o;

        /* JADX INFO: renamed from: o0 */
        public int f15491o0;

        /* JADX INFO: renamed from: p */
        public Drawable f15492p;

        /* JADX INFO: renamed from: p0 */
        public int f15493p0;

        /* JADX INFO: renamed from: q */
        public Drawable f15494q;

        /* JADX INFO: renamed from: r */
        public CharSequence f15496r;

        /* JADX INFO: renamed from: s */
        public CharSequence f15498s;

        /* JADX INFO: renamed from: s0 */
        public boolean f15499s0;

        /* JADX INFO: renamed from: t */
        public View f15500t;

        /* JADX INFO: renamed from: t0 */
        public boolean f15501t0;

        /* JADX INFO: renamed from: u */
        public int f15502u;

        /* JADX INFO: renamed from: u0 */
        public Dialog f15503u0;

        /* JADX INFO: renamed from: v */
        public int f15504v;

        /* JADX INFO: renamed from: v0 */
        public boolean f15505v0;

        /* JADX INFO: renamed from: w */
        public int f15506w;

        /* JADX INFO: renamed from: x */
        public Runnable f15508x;

        /* JADX INFO: renamed from: y */
        public Runnable f15510y;

        /* JADX INFO: renamed from: z */
        public Runnable f15512z;

        /* JADX INFO: renamed from: d */
        public int f15468d = 8388611;

        /* JADX INFO: renamed from: e */
        public int f15470e = 8388611;

        /* JADX INFO: renamed from: f */
        public int f15472f = 8388611;

        /* JADX INFO: renamed from: g */
        public int f15474g = 17;

        /* JADX INFO: renamed from: h */
        public int f15476h = -1;

        /* JADX INFO: renamed from: i */
        public int f15478i = -1;

        /* JADX INFO: renamed from: j */
        public int f15480j = 12;

        /* JADX INFO: renamed from: k */
        public int f15482k = -1;

        /* JADX INFO: renamed from: l */
        public int f15484l = -1;

        /* JADX INFO: renamed from: C */
        public boolean f15436C = false;

        /* JADX INFO: renamed from: D */
        public boolean f15438D = false;

        /* JADX INFO: renamed from: E */
        public Theme f15440E = Theme.LIGHT;

        /* JADX INFO: renamed from: F */
        public boolean f15441F = true;

        /* JADX INFO: renamed from: G */
        public float f15442G = 1.3f;

        /* JADX INFO: renamed from: H */
        public int f15443H = -1;

        /* JADX INFO: renamed from: I */
        public Integer[] f15444I = null;

        /* JADX INFO: renamed from: J */
        public boolean f15445J = true;

        /* JADX INFO: renamed from: L */
        public int f15447L = -1;

        /* JADX INFO: renamed from: a0 */
        public int f15463a0 = -1;

        /* JADX INFO: renamed from: b0 */
        public Runnable f15465b0 = null;

        /* JADX INFO: renamed from: c0 */
        public float f15467c0 = -1.0f;

        /* JADX INFO: renamed from: d0 */
        public boolean f15469d0 = false;

        /* JADX INFO: renamed from: e0 */
        public int f15471e0 = -2;

        /* JADX INFO: renamed from: f0 */
        public ImageView.ScaleType f15473f0 = null;

        /* JADX INFO: renamed from: g0 */
        public boolean f15475g0 = false;

        /* JADX INFO: renamed from: j0 */
        public int f15481j0 = -1;

        /* JADX INFO: renamed from: l0 */
        public int f15485l0 = 0;

        /* JADX INFO: renamed from: q0 */
        public int f15495q0 = -1;

        /* JADX INFO: renamed from: r0 */
        public int f15497r0 = -1;

        /* JADX INFO: renamed from: w0 */
        public int f15507w0 = -1;

        /* JADX INFO: renamed from: x0 */
        public int f15509x0 = -1;

        /* JADX INFO: renamed from: y0 */
        public int f15511y0 = -1;

        /* JADX INFO: renamed from: z0 */
        public int f15513z0 = -1;

        /* JADX INFO: renamed from: A0 */
        public int f15433A0 = Dialog.f15389Q;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e$a */
        public class a implements InterfaceC4311g {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ArrayList f15514a;

            public a(ArrayList arrayList) {
                this.f15514a = arrayList;
            }

            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((MenuItem.OnMenuItemClickListener) Reflect.m221136on(this.f15514a.get(i)).get("mClickListener")).onMenuItemClick((MenuItem) this.f15514a.get(i));
            }
        }

        public C4309e(@NonNull Context context) {
            this.f15462a = context;
        }

        /* JADX INFO: renamed from: A */
        public C4309e m20494A(DialogInterface.OnCancelListener onCancelListener) {
            this.f15451P = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: A0 */
        public Dialog m20495A0() {
            Dialog dialogM20567z = m20567z();
            dialogM20567z.m186751A();
            return dialogM20567z;
        }

        /* JADX INFO: renamed from: B */
        public C4309e m20496B(boolean z) {
            this.f15441F = z;
            return this;
        }

        /* JADX INFO: renamed from: B0 */
        public C4309e m20497B0(DialogInterface.OnShowListener onShowListener) {
            this.f15453R = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C4309e m20498C(int i, int i2, int i3, int i4) {
            this.f15507w0 = i;
            this.f15509x0 = i2;
            this.f15511y0 = i3;
            this.f15513z0 = i4;
            return this;
        }

        /* JADX INFO: renamed from: C0 */
        public C4309e m20499C0(CharSequence charSequence) {
            this.f15466c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C4309e m20500D(@StringRes int i) {
            m20504F(this.f15462a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: D0 */
        public C4309e m20501D0(Theme theme) {
            this.f15440E = theme;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C4309e m20502E(@StringRes int i, Object... objArr) {
            m20504F(this.f15462a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: E0 */
        public C4309e m20503E0(@StringRes int i) {
            m20507G0(this.f15462a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C4309e m20504F(CharSequence charSequence) {
            this.f15486m = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: F0 */
        public C4309e m20505F0(@StringRes int i, Object... objArr) {
            m20507G0(this.f15462a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C4309e m20506G(int i) {
            this.f15484l = i;
            return this;
        }

        /* JADX INFO: renamed from: G0 */
        public C4309e m20507G0(CharSequence charSequence) {
            this.f15464b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C4309e m20508H(@ColorRes int i) {
            m20506G(this.f15462a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: H0 */
        public C4309e m20509H0(int i) {
            this.f15476h = i;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C4309e m20510I(int i) {
            this.f15472f = i;
            return this;
        }

        /* JADX INFO: renamed from: I0 */
        public C4309e m20511I0(@ColorRes int i) {
            m20509H0(this.f15462a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C4309e m20512J(boolean z) {
            this.f15475g0 = z;
            return this;
        }

        /* JADX INFO: renamed from: J0 */
        public C4309e m20513J0(int i) {
            this.f15468d = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C4309e m20514K(float f) {
            this.f15467c0 = f;
            return this;
        }

        /* JADX INFO: renamed from: K0 */
        public C4309e m20515K0(InterfaceC4313i interfaceC4313i) {
            this.f15454S = interfaceC4313i;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C4309e m20516L(int i) {
            this.f15485l0 = i;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C4309e m20517M(@LayoutRes int i) {
            return m20520P(LayoutInflater.from(this.f15462a).inflate(i, (ViewGroup) null), false);
        }

        /* JADX INFO: renamed from: N */
        public C4309e m20518N(@LayoutRes int i, boolean z) {
            return m20520P(LayoutInflater.from(this.f15462a).inflate(i, (ViewGroup) null), z);
        }

        @Deprecated
        /* JADX INFO: renamed from: O */
        public C4309e m20519O(View view) {
            return m20520P(view, true);
        }

        /* JADX INFO: renamed from: P */
        public C4309e m20520P(View view, boolean z) {
            this.f15500t = view;
            this.f15456U = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C4309e m20521Q() {
            this.f15505v0 = true;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C4309e m20522R(boolean z) {
            this.f15437C0 = z;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C4309e m20523S(int i) {
            this.f15478i = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C4309e m20524T(@ColorRes int i) {
            m20523S(this.f15462a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C4309e m20525U(int i) {
            this.f15480j = i;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C4309e m20526V(DialogInterface.OnDismissListener onDismissListener) {
            this.f15450O = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C4309e m20527W(boolean z) {
            this.f15461Z = z;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C4309e m20528X(boolean z) {
            this.f15455T = z;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public Dialog m20529Y() {
            return this.f15503u0;
        }

        /* JADX INFO: renamed from: Z */
        public C4309e m20530Z(int i) {
            this.f15495q0 = i;
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C4309e m20531a0(Drawable drawable) {
            this.f15446K = drawable;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C4309e m20532b0(View view) {
            this.f15448M = view;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C4309e m20533c0(@DrawableRes int i) {
            this.f15446K = this.f15462a.getResources().getDrawable(i);
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C4309e m20534d0(int i) {
            this.f15447L = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C4309e m20535e0(List<String> list) {
            CharSequence[] charSequenceArr = new CharSequence[list.size()];
            for (int i = 0; i < list.size(); i++) {
                charSequenceArr[i] = list.get(i);
            }
            this.f15488n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C4309e m20536f0(CharSequence[] charSequenceArr) {
            this.f15488n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C4309e m20537g0(InterfaceC4311g interfaceC4311g) {
            this.f15432A = interfaceC4311g;
            this.f15434B = null;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C4309e m20538h0(int i, InterfaceC4311g interfaceC4311g) {
            this.f15443H = i;
            this.f15432A = null;
            this.f15434B = interfaceC4311g;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C4309e m20539i0(DialogInterface.OnKeyListener onKeyListener) {
            this.f15452Q = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C4309e m20540j0(final Menu menu) {
            m20535e0(vwb.m200303Q(vwb.m200314a0(menu.size()), new w9j() { // from class: l.hzd
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return menu.getItem(((Integer) obj).intValue()).getTitle().toString();
                }
            })).m20537g0(new a((ArrayList) Reflect.m221136on(menu).get("mItems")));
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C4309e m20541k0(@StringRes int i) {
            return m20544n0(this.f15462a.getString(i), this.f15510y);
        }

        /* JADX INFO: renamed from: l0 */
        public C4309e m20542l0(@StringRes int i, Runnable runnable) {
            return m20544n0(this.f15462a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: m0 */
        public C4309e m20543m0(CharSequence charSequence) {
            return m20544n0(charSequence, this.f15510y);
        }

        /* JADX INFO: renamed from: n0 */
        public C4309e m20544n0(CharSequence charSequence, Runnable runnable) {
            this.f15498s = charSequence;
            this.f15510y = runnable;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C4309e m20545o(int i) {
            this.f15502u = i;
            this.f15504v = i;
            this.f15506w = i;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C4309e m20546o0(int i) {
            this.f15504v = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C4309e m20547p(ListAdapter listAdapter) {
            this.f15449N = listAdapter;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C4309e m20548p0(@StringRes int i, Runnable runnable) {
            return m20550q0(this.f15462a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: q */
        public C4309e m20549q(boolean z) {
            this.f15445J = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C4309e m20550q0(CharSequence charSequence, Runnable runnable) {
            this.f15496r = charSequence;
            this.f15512z = runnable;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C4309e m20551r(int i) {
            this.f15457V = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public C4309e m20552r0(CharSequence charSequence) {
            this.f15435B0 = charSequence;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f15485l0 = n8c0.f137628l;
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C4309e m20553s() {
            this.f15469d0 = true;
            this.f15468d = 1;
            this.f15470e = 1;
            return this;
        }

        /* JADX INFO: renamed from: s0 */
        public C4309e m20554s0(@StringRes int i) {
            return m20560v0(this.f15462a.getString(i), this.f15508x);
        }

        /* JADX INFO: renamed from: t */
        public C4309e m20555t() {
            this.f15499s0 = true;
            return this;
        }

        /* JADX INFO: renamed from: t0 */
        public C4309e m20556t0(@StringRes int i, Runnable runnable) {
            return m20560v0(this.f15462a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: u */
        public C4309e m20557u() {
            this.f15479i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C4309e m20558u0(CharSequence charSequence) {
            return m20560v0(charSequence, this.f15508x);
        }

        /* JADX INFO: renamed from: v */
        public C4309e m20559v() {
            this.f15483k0 = true;
            this.f15501t0 = true;
            this.f15499s0 = true;
            this.f15455T = true;
            this.f15479i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C4309e m20560v0(CharSequence charSequence, Runnable runnable) {
            this.f15490o = charSequence;
            this.f15508x = runnable;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C4309e m20561w(int i) {
            this.f15474g = i;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C4309e m20562w0(Drawable drawable) {
            this.f15477h0 = drawable;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C4309e m20563x(int i) {
            this.f15433A0 = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C4309e m20564x0(Drawable drawable) {
            this.f15492p = drawable;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C4309e m20565y(boolean z) {
            this.f15469d0 = z;
            return this;
        }

        /* JADX INFO: renamed from: y0 */
        public C4309e m20566y0(AbstractC4310f abstractC4310f) {
            this.f15439D0 = abstractC4310f;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public Dialog m20567z() {
            Dialog dialog = new Dialog(this);
            this.f15503u0 = dialog;
            return dialog;
        }

        /* JADX INFO: renamed from: z0 */
        public Dialog m20568z0() {
            Dialog dialogM20567z = m20567z();
            dialogM20567z.show();
            return dialogM20567z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$f */
    public static abstract class AbstractC4310f {
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$g */
    public interface InterfaceC4311g {
        /* JADX INFO: renamed from: a */
        void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$h */
    public class C4312h extends ArrayAdapter<CharSequence> {

        /* JADX INFO: renamed from: a */
        public final int f15516a;

        public C4312h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
            this.f15516a = Dialog.m20446b0(getContext(), j0c0.f115663g, Dialog.this.f15400F);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @SuppressLint({"WrongViewCast"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(p4c0.f147090R0);
            int i2 = C4308d.f15431b[Dialog.this.f15401G.ordinal()];
            if (i2 == 1) {
                ((RadioButton) view2.findViewById(p4c0.f147057B)).setChecked(Dialog.this.f15407l.f15443H == i);
            } else if (i2 == 2) {
                ((CheckBox) view2.findViewById(p4c0.f147057B)).setChecked(Dialog.this.f15402H.contains(Integer.valueOf(i)));
            }
            textView.setText(Dialog.this.f15407l.f15488n[i]);
            textView.setTextColor(this.f15516a);
            view2.setTag(i + ":" + ((Object) Dialog.this.f15407l.f15488n[i]));
            C4309e c4309e = Dialog.this.f15407l;
            Drawable drawableM20449e0 = c4309e.f15459X;
            if (drawableM20449e0 == null && (drawableM20449e0 = Dialog.m20449e0(c4309e.f15462a, j0c0.f115664h)) == null) {
                drawableM20449e0 = Dialog.m20449e0(getContext(), j0c0.f115664h);
            }
            view2.setBackgroundDrawable(drawableM20449e0);
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$i */
    public interface InterfaceC4313i {
        /* JADX INFO: renamed from: a */
        void mo20570a(Dialog dialog);
    }

    @SuppressLint({"InflateParams"})
    public Dialog(C4309e c4309e) {
        super(m20442Q(c4309e), c4309e.f15479i0, c4309e.f15485l0);
        this.f15407l = c4309e;
        VLinear_Foreground vLinear_Foreground = new VLinear_Foreground(c4309e.f15462a);
        this.f15406k = vLinear_Foreground;
        vLinear_Foreground.setOrientation(1);
        this.f15406k.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        boolean zIsEmpty = TextUtils.isEmpty(c4309e.f15435B0);
        VLinear_Foreground vLinear_Foreground2 = this.f15406k;
        if (zIsEmpty) {
            this.f15405j = vLinear_Foreground2;
        } else {
            vLinear_Foreground2.setBackgroundResource(u2c0.f173290b);
            VLinear_Foreground vLinear_Foreground3 = new VLinear_Foreground(c4309e.f15462a);
            this.f15405j = vLinear_Foreground3;
            vLinear_Foreground3.setOrientation(1);
            vLinear_Foreground3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vLinear_Foreground3.addView(this.f15406k);
            this.f15419x = new VText(c4309e.f15462a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = f15385M;
            layoutParams.gravity = 17;
            this.f15419x.setLayoutParams(layoutParams);
            this.f15419x.setTextSize(c4309e.f15480j);
            this.f15419x.setTypeface(eqh0.m117752c(2));
            int i = c4309e.f15478i;
            TextView textView = this.f15419x;
            if (i != -1) {
                textView.setTextColor(i);
            } else {
                textView.setTextColor(getContext().getResources().getColor(t0c0.f167164p));
            }
            this.f15419x.setText(c4309e.f15435B0);
            this.f15419x.setGravity(17);
            if (c4309e.f15437C0) {
                this.f15419x.setOnClickListener(new View.OnClickListener() { // from class: l.fzd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f99955a.m20444W(view);
                    }
                });
            }
            vLinear_Foreground3.addView(this.f15419x);
        }
        LinearLayout linearLayout = new LinearLayout(c4309e.f15462a);
        this.f15416u = linearLayout;
        linearLayout.setOrientation(1);
        this.f15416u.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        if (c4309e.f15483k0) {
            m20452J(c4309e);
        } else {
            m20453K(c4309e);
        }
        DialogInterface.OnShowListener onShowListener = c4309e.f15453R;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c4309e.f15451P;
        if (onCancelListener != null) {
            setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c4309e.f15450O;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c4309e.f15452Q;
        if (onKeyListener != null) {
            setOnKeyListener(onKeyListener);
        }
        this.f15406k.addView(this.f15416u);
        setCancelable(c4309e.f15441F);
        setCanceledOnTouchOutside(c4309e.f15441F);
        int i2 = c4309e.f15457V;
        if (i2 == 0) {
            c4309e.f15457V = m20445a0(getContext(), j0c0.f115659c);
        } else {
            this.f15405j.setBackgroundColor(i2);
        }
        int iM20445a0 = m20445a0(getContext(), j0c0.f115658b);
        int i3 = c4309e.f15502u;
        this.f15403I = i3 != 0;
        int i4 = c4309e.f15504v;
        this.f15404J = i4 != 0;
        if (iM20445a0 != 0) {
            c4309e.f15502u = i3 == 0 ? iM20445a0 : i3;
            c4309e.f15504v = i4 == 0 ? iM20445a0 : i4;
            int i5 = c4309e.f15506w;
            c4309e.f15506w = i5 != 0 ? i5 : iM20445a0;
        }
        if (c4309e.f15455T || c4309e.f15499s0 || c4309e.f15501t0) {
            this.f15398D = true;
        }
        m20460T();
        m186759y();
        m186758x();
        m186760z(this.f15405j);
    }

    /* JADX INFO: renamed from: G */
    public static int m20440G(int i) {
        return (int) (i * 0.9f);
    }

    /* JADX INFO: renamed from: H */
    public static int m20441H(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: Q */
    public static ContextThemeWrapper m20442Q(C4309e c4309e) {
        TypedArray typedArrayObtainStyledAttributes = c4309e.f15462a.getTheme().obtainStyledAttributes(new int[]{j0c0.f115662f});
        Theme theme = c4309e.f15440E;
        Theme theme2 = Theme.DARK;
        boolean z = theme == theme2;
        if (!z) {
            try {
                z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                if (!z) {
                    theme2 = Theme.LIGHT;
                }
                c4309e.f15440E = theme2;
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        return new ContextThemeWrapper(c4309e.f15462a, z ? n8c0.f137621e : n8c0.f137622f);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: R */
    public static int m20443R(int i) {
        if (i != 17) {
            return i != 8388613 ? 5 : 6;
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m20444W(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: a0 */
    public static int m20445a0(Context context, int i) {
        return m20446b0(context, i, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static int m20446b0(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static float m20447c0(Context context, int i) {
        return m20448d0(context, i, 0.0f);
    }

    /* JADX INFO: renamed from: d0 */
    public static float m20448d0(Context context, int i, float f) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDimension(0, f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Drawable m20449e0(Context context, int i) {
        return m20450f0(context, i, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static Drawable m20450f0(Context context, int i, Drawable drawable) {
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
    public Dialog m20451I(boolean z) {
        this.f15407l.f15445J = z;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final void m20452J(C4309e c4309e) {
        CharSequence charSequence = c4309e.f15464b;
        boolean z = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c4309e.f15466c;
        boolean z2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence3 = c4309e.f15486m;
        boolean z3 = (charSequence3 == null || charSequence3.toString().trim().length() == 0) ? false : true;
        boolean z4 = c4309e.f15500t != null;
        CharSequence[] charSequenceArr = c4309e.f15488n;
        boolean z5 = (charSequenceArr != null && charSequenceArr.length > 0) || c4309e.f15449N != null;
        if (this.f15407l.f15497r0 != -1) {
            this.f15416u.setPadding(0, this.f15407l.f15497r0, 0, 0);
        }
        if (c4309e.f15446K != null) {
            ImageView imageView = new ImageView(this.f15407l.f15462a);
            this.f15409n = imageView;
            imageView.setImageDrawable(c4309e.f15446K);
            ImageView.ScaleType scaleType = this.f15407l.f15473f0;
            if (scaleType == null) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                imageView.setScaleType(scaleType);
            }
        }
        View view = c4309e.f15448M;
        if (view != null) {
            this.f15409n = view;
        }
        if (this.f15409n != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f15407l.f15471e0, -2);
            int i = c4309e.f15447L;
            if (i == -1) {
                layoutParams.topMargin = f15388P;
            } else {
                layoutParams.topMargin = i;
            }
            layoutParams.gravity = 1;
            this.f15409n.setMinimumHeight(f15394V);
            this.f15416u.addView(this.f15409n, layoutParams);
        }
        if (z || z2 || z3) {
            int i2 = ((!z4 || c4309e.f15505v0) && !z5) ? this.f15407l.f15433A0 : 0;
            LinearLayout linearLayout = new LinearLayout(this.f15407l.f15462a);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            int i3 = f15387O;
            layoutParams2.setMargins(i3, xdl0.m208408w0() < 960 ? f15384L : f15388P, i3, i2);
            linearLayout.setLayoutParams(layoutParams2);
            int i4 = 2;
            if (z) {
                this.f15410o = new VText(this.f15407l.f15462a);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                this.f15410o.setLayoutParams(layoutParams3);
                this.f15410o.setTextSize(20.0f);
                this.f15410o.setTypeface(eqh0.m117752c(2));
                int i5 = c4309e.f15476h;
                if (i5 != -1) {
                    this.f15410o.setTextColor(i5);
                } else {
                    this.f15410o.setTextColor(m20446b0(getContext(), j0c0.f115666j, getContext().getResources().getColor(t0c0.f167161m)));
                }
                this.f15410o.setText(this.f15407l.f15464b);
                this.f15410o.setGravity(17);
                linearLayout.addView(this.f15410o);
            } else {
                i4 = 2;
            }
            if (z2) {
                this.f15411p = new VText(this.f15407l.f15462a);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 16;
                layoutParams4.setMargins(0, z ? f15385M : 0, 0, 0);
                this.f15411p.setLayoutParams(layoutParams4);
                this.f15411p.setTextSize(14.0f);
                this.f15411p.setTypeface(eqh0.m117752c(i4));
                int i6 = c4309e.f15482k;
                if (i6 != -1) {
                    this.f15411p.setTextColor(i6);
                } else {
                    this.f15411p.setTextColor(m20446b0(getContext(), j0c0.f115665i, getContext().getResources().getColor(t0c0.f167162n)));
                }
                this.f15411p.setGravity(17);
                this.f15411p.setText(this.f15407l.f15466c);
                linearLayout.addView(this.f15411p);
            }
            if (z3) {
                this.f15412q = new VText(this.f15407l.f15462a);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.gravity = 16;
                layoutParams5.setMargins(0, (z || z2) ? f15385M : 0, 0, 0);
                if (c4309e.f15475g0) {
                    this.f15412q.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f15412q.setHighlightColor(getContext().getResources().getColor(t0c0.f167147E));
                }
                this.f15412q.setLayoutParams(layoutParams5);
                this.f15412q.setTypeface(eqh0.m117752c(i4));
                TextView textView = this.f15412q;
                float f = this.f15407l.f15467c0;
                if (f <= 0.0f) {
                    f = 14.0f;
                }
                textView.setTextSize(f);
                this.f15412q.setText(this.f15407l.f15486m);
                int i7 = c4309e.f15484l;
                if (i7 != -1) {
                    this.f15412q.setTextColor(i7);
                } else {
                    this.f15412q.setTextColor(m20446b0(getContext(), j0c0.f115661e, getContext().getResources().getColor(t0c0.f167162n)));
                }
                this.f15412q.setGravity(c4309e.f15474g);
                this.f15412q.setTextAlignment(m20443R(c4309e.f15474g));
                linearLayout.addView(this.f15412q);
            }
            this.f15416u.addView(linearLayout);
        }
        if (z4) {
            this.f15414s = new FrameLayout(this.f15407l.f15462a);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(c4309e.f15507w0 == -1 ? 0 : c4309e.f15507w0, c4309e.f15509x0 == -1 ? 0 : c4309e.f15509x0, c4309e.f15511y0 == -1 ? 0 : c4309e.f15511y0, c4309e.f15513z0 == -1 ? 0 : c4309e.f15513z0);
            this.f15414s.setLayoutParams(layoutParams6);
            this.f15414s.addView(c4309e.f15500t);
            boolean z6 = c4309e.f15505v0;
            LinearLayout linearLayout2 = this.f15416u;
            if (z6) {
                linearLayout2.addView(this.f15414s, 0);
            } else {
                linearLayout2.addView(this.f15414s);
            }
        }
        if (z5) {
            FrameLayout frameLayout = new FrameLayout(this.f15407l.f15462a);
            this.f15417v = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f15407l.f15462a);
            this.f15408m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f15408m.setDivider(null);
            this.f15408m.setDividerHeight(0);
            this.f15408m.setScrollBarDefaultDelayBeforeFade(1000);
            this.f15408m.setScrollBarStyle(33554432);
            this.f15408m.setFastScrollEnabled(this.f15407l.f15461Z);
            this.f15408m.setSelector(m20449e0(getContext(), j0c0.f115664h));
            int i8 = c4309e.f15458W;
            if (i8 != 0) {
                this.f15400F = i8;
            } else if (c4309e.f15440E == Theme.LIGHT) {
                this.f15400F = RoundedDrawable.DEFAULT_BORDER_COLOR;
            } else {
                this.f15400F = -1;
            }
            C4309e c4309e2 = this.f15407l;
            if (c4309e2.f15449N == null) {
                if (c4309e2.f15434B != null) {
                    this.f15401G = ListType.SINGLE;
                    this.f15399E = c4309e.f15438D;
                } else {
                    c4309e2.getClass();
                    this.f15401G = ListType.REGULAR;
                }
                this.f15407l.f15449N = new C4312h(this.f15407l.f15462a, ListType.getLayoutForType(this.f15401G), p4c0.f147090R0, this.f15407l.f15488n);
            }
            this.f15417v.setPadding(0, (z || z2 || c4309e.f15486m != null || c4309e.f15500t != null) ? 0 : f15384L, 0, !m20459S() ? f15384L : 0);
            this.f15417v.addView(this.f15408m);
            this.f15416u.addView(this.f15417v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m20453K(C4309e c4309e) {
        Dialog dialog;
        CharSequence charSequence = c4309e.f15464b;
        Object[] objArr = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c4309e.f15466c;
        Object[] objArr2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        if (objArr != false) {
            LinearLayout linearLayout = new LinearLayout(this.f15407l.f15462a);
            this.f15413r = linearLayout;
            linearLayout.setOrientation(this.f15407l.f15469d0 ? 1 : 0);
            this.f15413r.setGravity(16);
            this.f15413r.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = this.f15413r;
            int i = f15387O;
            int i2 = this.f15407l.f15497r0 == -1 ? i : this.f15407l.f15497r0;
            int i3 = f15386N;
            linearLayout2.setPadding(i, i2, i, i3);
            if (c4309e.f15446K != null) {
                ImageView imageView = new ImageView(this.f15407l.f15462a);
                this.f15409n = imageView;
                imageView.setImageDrawable(c4309e.f15446K);
                if (!this.f15407l.f15469d0) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            View view = c4309e.f15448M;
            if (view != null) {
                this.f15409n = view;
            }
            if (this.f15409n != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.f15407l.f15469d0) {
                    layoutParams.setMargins(i3, i3, i3, i3);
                    layoutParams.gravity = 1;
                } else {
                    layoutParams.setMargins(0, 0, i3, 0);
                }
                this.f15409n.setLayoutParams(layoutParams);
                this.f15413r.addView(this.f15409n);
            }
            this.f15410o = new VText(this.f15407l.f15462a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f15407l.f15469d0) {
                layoutParams2.gravity = 16;
            }
            this.f15410o.setLayoutParams(layoutParams2);
            this.f15410o.setTextSize(18.0f);
            this.f15410o.setTypeface(eqh0.m117752c(3), 1);
            this.f15410o.setText(this.f15407l.f15464b);
            int i4 = c4309e.f15476h;
            if (i4 != -1) {
                this.f15410o.setTextColor(i4);
            } else {
                this.f15410o.setTextColor(m20446b0(getContext(), j0c0.f115666j, m20445a0(getContext(), R.attr.textColorPrimary)));
            }
            this.f15410o.setGravity(c4309e.f15468d);
            this.f15410o.setTextAlignment(m20443R(c4309e.f15468d));
            this.f15413r.addView(this.f15410o);
            this.f15416u.addView(this.f15413r);
        }
        if (objArr2 != false) {
            this.f15411p = new VText(this.f15407l.f15462a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f15407l.f15469d0) {
                layoutParams3.gravity = 16;
            }
            layoutParams3.setMargins(0, objArr != false ? 0 : f15387O, 0, f15386N);
            this.f15411p.setLayoutParams(layoutParams3);
            this.f15411p.setTextSize(14.0f);
            this.f15411p.setTypeface(eqh0.m117752c(2));
            this.f15411p.setText(this.f15407l.f15466c);
            TextView textView = this.f15411p;
            int i5 = f15387O;
            textView.setPadding(i5, 0, i5, 0);
            int i6 = c4309e.f15482k;
            if (i6 != -1) {
                this.f15411p.setTextColor(i6);
            } else {
                this.f15411p.setTextColor(m20446b0(getContext(), j0c0.f115665i, m20445a0(getContext(), R.attr.textColorSecondary)));
            }
            this.f15411p.setGravity(c4309e.f15470e);
            this.f15410o.setTextAlignment(m20443R(c4309e.f15468d));
            this.f15416u.addView(this.f15411p);
        }
        if (c4309e.f15486m != null) {
            FrameLayout frameLayout = new FrameLayout(this.f15407l.f15462a);
            this.f15415t = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = this.f15415t;
            int i7 = f15387O;
            int i8 = f15386N;
            frameLayout2.setPadding(i7, 0, i7, i8);
            VText vText = new VText(this.f15407l.f15462a);
            this.f15412q = vText;
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (c4309e.f15475g0) {
                this.f15412q.setMovementMethod(LinkMovementMethod.getInstance());
                this.f15412q.setHighlightColor(getContext().getResources().getColor(t0c0.f167147E));
            }
            this.f15412q.setTypeface(eqh0.m117752c(2));
            TextView textView2 = this.f15412q;
            float f = this.f15407l.f15467c0;
            textView2.setTextSize(f > 0.0f ? f : 14.0f);
            this.f15412q.setText(this.f15407l.f15486m);
            int i9 = c4309e.f15484l;
            if (i9 != -1) {
                this.f15412q.setTextColor(i9);
            } else {
                this.f15412q.setTextColor(m20446b0(getContext(), j0c0.f115661e, m20445a0(getContext(), R.attr.textColorSecondary)));
            }
            if (objArr == true || objArr2 == true) {
                this.f15412q.setGravity(c4309e.f15472f);
                this.f15412q.setTextAlignment(m20443R(c4309e.f15472f));
            } else {
                this.f15415t.setMinimumHeight(f15393U);
                this.f15415t.setPadding(i7, i7, i7, i8);
            }
            this.f15415t.addView(this.f15412q);
            this.f15416u.addView(this.f15415t);
        }
        if (c4309e.f15500t != null) {
            this.f15414s = new FrameLayout(this.f15407l.f15462a);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(c4309e.f15507w0 == -1 ? 0 : c4309e.f15507w0, c4309e.f15509x0 == -1 ? 0 : c4309e.f15509x0, c4309e.f15511y0 == -1 ? 0 : c4309e.f15511y0, c4309e.f15513z0 == -1 ? 0 : c4309e.f15513z0);
            this.f15414s.setLayoutParams(layoutParams4);
            this.f15414s.addView(c4309e.f15500t);
            boolean z = c4309e.f15505v0;
            LinearLayout linearLayout3 = this.f15416u;
            if (z) {
                linearLayout3.addView(this.f15414s, 0);
            } else {
                linearLayout3.addView(this.f15414s);
            }
        }
        CharSequence[] charSequenceArr = c4309e.f15488n;
        if ((charSequenceArr == null || charSequenceArr.length <= 0) && c4309e.f15449N == null) {
            dialog = this;
        } else {
            FrameLayout frameLayout3 = new FrameLayout(this.f15407l.f15462a);
            this.f15417v = frameLayout3;
            frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f15407l.f15462a);
            this.f15408m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f15408m.setDivider(null);
            this.f15408m.setDividerHeight(0);
            this.f15408m.setScrollBarDefaultDelayBeforeFade(1000);
            this.f15408m.setScrollBarStyle(33554432);
            this.f15408m.setFastScrollEnabled(this.f15407l.f15461Z);
            this.f15408m.setSelector(m20449e0(getContext(), j0c0.f115664h));
            int i10 = c4309e.f15458W;
            if (i10 != 0) {
                this.f15400F = i10;
            } else if (c4309e.f15440E == Theme.LIGHT) {
                this.f15400F = RoundedDrawable.DEFAULT_BORDER_COLOR;
            } else {
                this.f15400F = -1;
            }
            C4309e c4309e2 = this.f15407l;
            if (c4309e2.f15449N == null) {
                if (c4309e2.f15434B != null) {
                    this.f15401G = ListType.SINGLE;
                    this.f15399E = c4309e.f15438D;
                } else {
                    c4309e2.getClass();
                    this.f15401G = ListType.REGULAR;
                }
                dialog = this;
                this.f15407l.f15449N = dialog.new C4312h(this.f15407l.f15462a, ListType.getLayoutForType(this.f15401G), p4c0.f147090R0, this.f15407l.f15488n);
            } else {
                dialog = this;
            }
            dialog.f15417v.setPadding(0, (objArr == true || objArr2 == true || c4309e.f15486m != null || c4309e.f15500t != null) ? 0 : f15384L, 0, !dialog.m20459S() ? f15384L : 0);
            dialog.f15417v.addView(dialog.f15408m);
            dialog.f15416u.addView(dialog.f15417v);
        }
        if (objArr == true && objArr2 != true && c4309e.f15486m == null && c4309e.f15500t == null) {
            CharSequence[] charSequenceArr2 = c4309e.f15488n;
            if ((charSequenceArr2 == null || charSequenceArr2.length == 0) && c4309e.f15449N == null) {
                dialog.f15413r.setMinimumHeight(f15393U);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m20454L() {
        return (getWindow().getDecorView().getMeasuredWidth() - (((int) getContext().getResources().getDimension(u1c0.f173001o)) * 2)) / m20464Y();
    }

    /* JADX INFO: renamed from: M */
    public final void m20455M() {
        boolean z = this.f15398D;
        if (m20464Y() <= 1) {
            return;
        }
        if (this.f15407l.f15455T && !this.f15398D) {
            this.f15398D = true;
            m20460T();
            return;
        }
        int iM20454L = m20454L();
        this.f15398D = false;
        if (this.f15407l.f15490o != null) {
            this.f15398D = this.f15420y.getWidth() > iM20454L;
        }
        if (!this.f15398D && this.f15407l.f15496r != null) {
            this.f15398D = this.f15395A.getWidth() > iM20454L;
        }
        if (!this.f15398D && this.f15407l.f15498s != null) {
            this.f15398D = this.f15396B.getWidth() > iM20454L;
        }
        if (z != this.f15398D) {
            m20460T();
        }
    }

    /* JADX INFO: renamed from: N */
    public final ColorStateList m20456N(int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m20441H(i, 0.4f), i});
    }

    /* JADX INFO: renamed from: O */
    public final Drawable m20457O() {
        boolean z = this.f15398D;
        C4309e c4309e = this.f15407l;
        if (z) {
            Drawable drawable = c4309e.f15459X;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableM20449e0 = m20449e0(c4309e.f15462a, j0c0.f115664h);
            if (drawableM20449e0 != null) {
                return drawableM20449e0;
            }
        } else {
            Drawable drawable2 = c4309e.f15460Y;
            if (drawable2 != null) {
                return drawable2;
            }
            Drawable drawableM20449e1 = m20449e0(c4309e.f15462a, j0c0.f115660d);
            if (drawableM20449e1 != null) {
                return drawableM20449e1;
            }
        }
        return m20449e0(getContext(), this.f15398D ? j0c0.f115664h : j0c0.f115660d);
    }

    /* JADX INFO: renamed from: P */
    public final View m20458P() {
        return this.f15407l.f15500t;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m20459S() {
        return m20464Y() > 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m20460T() {
        LinearLayout.LayoutParams layoutParams;
        if (!m20459S()) {
            m20461U();
            if (this.f15406k.getChildCount() < 2 && this.f15417v != null) {
                this.f15408m.setClipToPadding(false);
            }
            return false;
        }
        ViewGroup viewGroup = this.f15418w;
        if (viewGroup != null && this.f15406k.indexOfChild(viewGroup) != -1) {
            this.f15406k.removeView(this.f15418w);
        }
        this.f15420y = new FrameLayout(this.f15407l.f15462a);
        this.f15396B = new FrameLayout(this.f15407l.f15462a);
        this.f15395A = new FrameLayout(this.f15407l.f15462a);
        this.f15421z = this.f15407l.f15499s0 ? new VButton_FakeShadow(this.f15407l.f15462a) : new VText(this.f15407l.f15462a);
        this.f15397C = new VText(this.f15407l.f15462a);
        VText vText = new VText(this.f15407l.f15462a);
        if (this.f15398D) {
            this.f15418w = new LinearLayout(this.f15407l.f15462a);
            this.f15418w.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ((LinearLayout) this.f15418w).setOrientation(1);
            m20476q0(this.f15420y, false);
            if (this.f15407l.f15499s0) {
                m20470k0();
            } else {
                m20477r0(this.f15421z);
                this.f15420y.addView(this.f15421z);
            }
            m20476q0(this.f15396B, true);
            if (this.f15407l.f15501t0) {
                m20469j0();
            } else {
                m20477r0(this.f15397C);
                this.f15396B.addView(this.f15397C);
            }
            m20476q0(this.f15395A, false);
            m20477r0(vText);
            this.f15395A.addView(vText);
            this.f15418w.addView(this.f15420y);
            this.f15418w.addView(this.f15396B);
            this.f15418w.addView(this.f15395A);
            this.f15395A.setId(p4c0.f147130n);
            this.f15420y.setId(p4c0.f147132o);
            this.f15396B.setId(p4c0.f147128m);
        } else {
            this.f15418w = new RelativeLayout(this.f15407l.f15462a);
            if (this.f15407l.f15499s0) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ViewGroup viewGroup2 = this.f15418w;
                int i = f15385M;
                viewGroup2.setPadding(i, this.f15407l.f15500t == null ? f15387O : 0, i, i);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, f15392T);
            }
            this.f15418w.setLayoutParams(layoutParams);
            int i2 = f15388P;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
            layoutParams2.addRule(9, -1);
            layoutParams2.addRule(12, -1);
            int i3 = f15384L;
            layoutParams2.setMargins(i3, 0, i3, i3);
            this.f15395A.setLayoutParams(layoutParams2);
            FrameLayout frameLayout = this.f15395A;
            int i4 = f15393U;
            frameLayout.setMinimumWidth(i4);
            m20471l0(vText);
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            this.f15395A.addView(vText);
            this.f15395A.setId(p4c0.f147130n);
            if (this.f15407l.f15501t0) {
                m20469j0();
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams3.addRule(12, -1);
                this.f15396B.setLayoutParams(layoutParams3);
                m20471l0(this.f15397C);
                this.f15397C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f15396B.setMinimumWidth(i4);
                this.f15396B.addView(this.f15397C);
                this.f15396B.setId(p4c0.f147128m);
            }
            if (this.f15407l.f15499s0) {
                m20470k0();
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams4.addRule(11, -1);
                layoutParams4.addRule(12, -1);
                layoutParams4.setMargins(i3, 0, i3, i3);
                this.f15420y.setLayoutParams(layoutParams4);
                this.f15420y.setMinimumWidth(i4);
                m20471l0(this.f15421z);
                this.f15421z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f15420y.addView(this.f15421z);
                this.f15420y.setId(p4c0.f147132o);
            }
            this.f15418w.addView(this.f15395A);
            this.f15418w.addView(this.f15396B);
            this.f15418w.addView(this.f15420y);
        }
        Drawable drawable = this.f15407l.f15477h0;
        if (drawable != null) {
            xdl0.m208383k(this.f15421z, drawable);
            this.f15421z.setCompoundDrawablePadding(f15383K);
        }
        CharSequence charSequence = this.f15407l.f15490o;
        if (charSequence != null) {
            this.f15421z.setText(charSequence.toString().toUpperCase());
            this.f15420y.setTag("POSITIVE");
            this.f15420y.setOnClickListener(this);
            if (!this.f15407l.f15499s0) {
                this.f15421z.setTextColor(m20456N(this.f15407l.f15502u));
                this.f15420y.setBackgroundDrawable(m20457O());
            }
        } else {
            this.f15420y.setVisibility(8);
        }
        C4309e c4309e = this.f15407l;
        if (c4309e.f15496r != null) {
            vText.setTextColor(m20456N(c4309e.f15506w));
            this.f15395A.setBackgroundDrawable(m20457O());
            vText.setText(this.f15407l.f15496r.toString().toUpperCase());
            this.f15395A.setTag("NEUTRAL");
            this.f15395A.setOnClickListener(this);
        } else {
            this.f15395A.setVisibility(8);
        }
        CharSequence charSequence2 = this.f15407l.f15498s;
        if (charSequence2 != null) {
            this.f15397C.setText(charSequence2.toString().toUpperCase());
            this.f15396B.setTag("NEGATIVE");
            this.f15396B.setOnClickListener(this);
            if (!this.f15407l.f15501t0) {
                this.f15397C.setTextColor(m20456N(this.f15407l.f15504v));
                this.f15396B.setBackgroundDrawable(m20457O());
            }
            if (!this.f15398D && !this.f15407l.f15501t0) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, f15388P);
                if (this.f15407l.f15490o != null) {
                    layoutParams5.addRule(16, this.f15420y.getId());
                    int i5 = f15384L;
                    layoutParams5.setMargins(i5, 0, 0, i5);
                } else {
                    layoutParams5.addRule(21);
                    int i6 = f15384L;
                    layoutParams5.setMargins(i6, 0, i6, i6);
                }
                layoutParams5.addRule(12, -1);
                this.f15396B.setLayoutParams(layoutParams5);
            }
        } else {
            this.f15396B.setVisibility(8);
        }
        if (!this.f15398D) {
            FrameLayout frameLayout2 = this.f15420y;
            int i7 = f15384L;
            frameLayout2.setPadding(i7, 0, i7, 0);
            this.f15396B.setPadding(i7, 0, i7, 0);
            this.f15395A.setPadding(i7, 0, i7, 0);
        }
        this.f15406k.addView(this.f15418w);
        m20461U();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final void m20461U() {
        C4309e c4309e = this.f15407l;
        CharSequence[] charSequenceArr = c4309e.f15488n;
        if ((charSequenceArr == null || charSequenceArr.length == 0) && c4309e.f15449N == null) {
            return;
        }
        this.f15408m.setAdapter(c4309e.f15449N);
        ListType listType = this.f15401G;
        VList vList = this.f15408m;
        if (listType != null) {
            vList.setOnItemClickListener(new C4305a());
        } else {
            vList.setOnItemClickListener(new C4306b());
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m20462V(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        return x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX INFO: renamed from: X */
    public View m20463X() {
        FrameLayout frameLayout = this.f15396B;
        return frameLayout != null ? frameLayout : findViewById(p4c0.f147128m);
    }

    /* JADX INFO: renamed from: Y */
    public final int m20464Y() {
        C4309e c4309e = this.f15407l;
        int i = c4309e.f15490o != null ? 1 : 0;
        if (c4309e.f15496r != null) {
            i++;
        }
        return c4309e.f15498s != null ? i + 1 : i;
    }

    /* JADX INFO: renamed from: Z */
    public View m20465Z() {
        FrameLayout frameLayout = this.f15420y;
        return frameLayout != null ? frameLayout : findViewById(p4c0.f147132o);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m20466g0(View view) {
        C4309e c4309e = this.f15407l;
        int i = c4309e.f15443H;
        c4309e.f15434B.mo20569a(this, view, i, i >= 0 ? c4309e.f15488n[i] : null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m20467h0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m20468i0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m20469j0() {
        if (this.f15398D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f15385M;
            this.f15396B.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f15385M;
            this.f15396B.setLayoutParams(layoutParams2);
        }
        this.f15397C.setTextAppearance(getContext(), n8c0.f137632p);
        if (this.f15404J) {
            this.f15397C.setTextColor(m20456N(this.f15407l.f15504v));
        }
        this.f15397C.setSingleLine(true);
        this.f15397C.setGravity(17);
        this.f15397C.setEnabled(true);
        Drawable drawable = this.f15407l.f15494q;
        TextView textView = this.f15397C;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f15369e.getResources().getDrawable(u2c0.f173417q6));
        }
        this.f15397C.setMinHeight(f15391S);
        this.f15397C.setDuplicateParentStateEnabled(true);
        this.f15397C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f15396B.setClipChildren(false);
        this.f15396B.setClipToPadding(false);
        this.f15418w.setClipChildren(false);
        this.f15418w.setClipToPadding(false);
        this.f15397C.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f15369e, ozb0.f146417e));
        this.f15396B.addView(this.f15397C);
        this.f15396B.setId(p4c0.f147128m);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m20470k0() {
        if (this.f15398D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f15385M;
            this.f15420y.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f15385M;
            this.f15420y.setLayoutParams(layoutParams2);
        }
        this.f15421z.setSingleLine(true);
        this.f15421z.setTextAppearance(getContext(), n8c0.f137631o);
        if (this.f15403I) {
            this.f15421z.setTextColor(m20456N(this.f15407l.f15502u));
        }
        this.f15421z.setGravity(17);
        this.f15421z.setEnabled(true);
        Drawable drawable = this.f15407l.f15492p;
        TextView textView = this.f15421z;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f15369e.getResources().getDrawable(u2c0.f173369k6));
        }
        this.f15421z.setMinHeight(f15391S);
        this.f15421z.setDuplicateParentStateEnabled(true);
        this.f15421z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f15420y.setClipChildren(false);
        this.f15420y.setClipToPadding(false);
        this.f15418w.setClipChildren(false);
        this.f15418w.setClipToPadding(false);
        this.f15421z.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f15369e, ozb0.f146417e));
        this.f15420y.addView(this.f15421z);
        this.f15420y.setId(p4c0.f147132o);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m20471l0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setTypeface(eqh0.m117752c(3));
        textView.setGravity(17);
        textView.setStateListAnimator(null);
        textView.setEnabled(true);
        textView.setBackgroundDrawable(null);
        textView.setMinWidth(f15390R);
        textView.setDuplicateParentStateEnabled(true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m20472m0(Runnable runnable) {
        this.f15407l.f15510y = runnable;
    }

    /* JADX INFO: renamed from: n0 */
    public TextView m20473n0(String str) {
        if (this.f15397C != null) {
            boolean z = this.f15407l.f15501t0;
            TextView textView = this.f15397C;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f15397C;
    }

    /* JADX INFO: renamed from: o0 */
    public void m20474o0(Runnable runnable) {
        this.f15407l.f15508x = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String str;
        String str2 = (String) view.getTag();
        if ("POSITIVE".equals(str2)) {
            Runnable runnable = this.f15407l.f15508x;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f15407l.f15434B != null) {
                m20466g0(view);
            }
            this.f15407l.getClass();
            if (this.f15407l.f15445J) {
                dismiss();
                return;
            }
            return;
        }
        if ("NEGATIVE".equals(str2)) {
            Runnable runnable2 = this.f15407l.f15510y;
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f15407l.f15445J) {
                dismiss();
                return;
            }
            return;
        }
        boolean zEquals = "NEUTRAL".equals(str2);
        C4309e c4309e = this.f15407l;
        if (zEquals) {
            Runnable runnable3 = c4309e.f15512z;
            if (runnable3 != null) {
                runnable3.run();
            }
            if (this.f15407l.f15445J) {
                dismiss();
                return;
            }
            return;
        }
        if (c4309e.f15432A != null) {
            if (c4309e.f15445J) {
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
                this.f15407l.f15432A.mo20569a(this, view, i, str);
                return;
            }
            return;
        }
        if (c4309e.f15434B == null) {
            c4309e.getClass();
            if (this.f15407l.f15445J) {
                dismiss();
                return;
            }
            return;
        }
        RadioButton radioButton = (RadioButton) ((LinearLayout) view).getChildAt(1);
        if (!radioButton.isChecked()) {
            radioButton.setChecked(true);
        }
        C4309e c4309e2 = this.f15407l;
        if (c4309e2.f15445J && c4309e2.f15490o == null) {
            dismiss();
            m20466g0(view);
        } else if (this.f15399E) {
            m20466g0(view);
        }
    }

    @Override // p149l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        m20455M();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        InterfaceC4313i interfaceC4313i;
        if (motionEvent.getAction() != 0 || !m20462V(getContext(), motionEvent) || (interfaceC4313i = this.f15407l.f15454S) == null) {
            return super.onTouchEvent(motionEvent);
        }
        interfaceC4313i.mo20570a(this);
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public TextView m20475p0(String str) {
        if (this.f15421z != null) {
            boolean z = this.f15407l.f15499s0;
            TextView textView = this.f15421z;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f15421z;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m20476q0(FrameLayout frameLayout, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f15391S);
        layoutParams.gravity = 8388629;
        if (z) {
            layoutParams.setMargins(0, f15384L, 0, 0);
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setEnabled(true);
        int i = f15385M;
        frameLayout.setPadding(i, 0, i, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m20477r0(TextView textView) {
        m20471l0(textView);
        int i = f15384L;
        textView.setPadding(i, 0, i, 0);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, this.f15407l.f15499s0 ? 17 : 21));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f15410o.setText(charSequence);
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.m175383a("Dialogs can only be shown from the UI thread.");
            return;
        }
        Window window = getWindow();
        window.setWindowAnimations(n8c0.f137623g);
        if (this.f15407l.f15495q0 != -1) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.f15407l.f15495q0;
            window.setAttributes(attributes);
        }
        if (this.f15407l.f15481j0 != -1) {
            getWindow().setWindowAnimations(this.f15407l.f15481j0);
        }
        C4309e c4309e = this.f15407l;
        if (c4309e.f15487m0 && c4309e.f15479i0) {
            this.f15405j.setBackgroundResource(u2c0.f173290b);
            Drawable drawable = getContext().getDrawable(u2c0.f173290b);
            drawable.setColorFilter(new LightingColorFilter(this.f15407l.f15493p0, 0));
            int i = f15391S;
            m20468i0(this.f15405j, i);
            m20467h0(this.f15405j, 1.0f);
            getWindow().setBackgroundDrawableResource(u2c0.f173298c);
            this.f15405j.setForeground(drawable);
            getWindow().setDimAmount(0.7f);
            getWindow().setWindowAnimations(n8c0.f137618b);
            setOnShowListener(new DialogInterfaceOnShowListenerC4307c(i, drawable));
        }
        super.show();
    }
}
