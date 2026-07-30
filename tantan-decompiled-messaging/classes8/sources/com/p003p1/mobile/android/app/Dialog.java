package com.p003p1.mobile.android.app;

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
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import java.util.ArrayList;
import java.util.List;
import l.eqh0;
import l.ig3;
import l.qkq0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.joor.Reflect;
import p007l.b6c0;
import p007l.bt0;
import p007l.e51;
import p007l.j0c0;
import p007l.n8c0;
import p007l.ozb0;
import p007l.p4c0;
import p007l.szd;
import p007l.t0c0;
import p007l.u1c0;
import p007l.u2c0;
import v.VButton_FakeShadow;
import v.VLinear_Foreground;
import v.VList;
import v.VList_ScrollableHeight;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class Dialog extends szd implements View.OnClickListener {

    /* JADX INFO: renamed from: K */
    public static final int f1082K = t100.d(6.0f);

    /* JADX INFO: renamed from: L */
    public static final int f1083L = t100.d(8.0f);

    /* JADX INFO: renamed from: M */
    public static final int f1084M = t100.d(12.0f);

    /* JADX INFO: renamed from: N */
    public static final int f1085N = t100.d(16.0f);

    /* JADX INFO: renamed from: O */
    public static final int f1086O = t100.d(24.0f);

    /* JADX INFO: renamed from: P */
    public static final int f1087P = t100.d(32.0f);

    /* JADX INFO: renamed from: Q */
    public static final int f1088Q = t100.d(40.0f);

    /* JADX INFO: renamed from: R */
    public static final int f1089R = t100.d(42.0f);

    /* JADX INFO: renamed from: S */
    public static final int f1090S = t100.d(48.0f);

    /* JADX INFO: renamed from: T */
    public static final int f1091T = t100.d(64.0f);

    /* JADX INFO: renamed from: U */
    public static final int f1092U = t100.d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f1093V = t100.d(144.0f);

    /* JADX INFO: renamed from: A */
    public FrameLayout f1094A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f1095B;

    /* JADX INFO: renamed from: C */
    public TextView f1096C;

    /* JADX INFO: renamed from: D */
    public boolean f1097D;

    /* JADX INFO: renamed from: E */
    public boolean f1098E;

    /* JADX INFO: renamed from: F */
    public int f1099F;

    /* JADX INFO: renamed from: G */
    public ListType f1100G;

    /* JADX INFO: renamed from: H */
    public List<Integer> f1101H;

    /* JADX INFO: renamed from: I */
    public boolean f1102I;

    /* JADX INFO: renamed from: J */
    public boolean f1103J;

    /* JADX INFO: renamed from: j */
    public final VLinear_Foreground f1104j;

    /* JADX INFO: renamed from: k */
    public VLinear_Foreground f1105k;

    /* JADX INFO: renamed from: l */
    public final C0221e f1106l;

    /* JADX INFO: renamed from: m */
    public VList f1107m;

    /* JADX INFO: renamed from: n */
    public View f1108n;

    /* JADX INFO: renamed from: o */
    public TextView f1109o;

    /* JADX INFO: renamed from: p */
    public TextView f1110p;

    /* JADX INFO: renamed from: q */
    public TextView f1111q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f1112r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f1113s;

    /* JADX INFO: renamed from: t */
    public FrameLayout f1114t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f1115u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f1116v;

    /* JADX INFO: renamed from: w */
    public ViewGroup f1117w;

    /* JADX INFO: renamed from: x */
    public TextView f1118x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f1119y;

    /* JADX INFO: renamed from: z */
    public TextView f1120z;

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
            int i = C0220d.f1130b[listType.ordinal()];
            if (i == 1) {
                return b6c0.f1912D;
            }
            if (i == 2) {
                return b6c0.f1911C;
            }
            if (i == 3) {
                return b6c0.f1910B;
            }
            ig3.a("Not a valid list type");
            return 0;
        }
    }

    public enum Theme {
        LIGHT,
        DARK
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$a */
    public class C0217a implements AdapterView.OnItemClickListener {
        public C0217a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            ListType listType = dialog.f1100G;
            if (listType == ListType.MULTI) {
                boolean zIsChecked = ((CheckBox) view.findViewById(p4c0.f3605B)).isChecked();
                boolean zContains = Dialog.this.f1101H.contains(Integer.valueOf(i));
                if (zIsChecked) {
                    if (zContains) {
                        Dialog.this.f1101H.remove(Integer.valueOf(i));
                    }
                } else if (!zContains) {
                    Dialog dialog2 = Dialog.this;
                    if (dialog2.f1106l.f1162a0 != -1) {
                        int size = dialog2.f1101H.size();
                        C0221e c0221e = Dialog.this.f1106l;
                        if (size >= c0221e.f1162a0) {
                            c0221e.f1164b0.run();
                            return;
                        }
                    }
                    Dialog.this.f1101H.add(Integer.valueOf(i));
                }
            } else if (listType == ListType.SINGLE) {
                C0221e c0221e2 = dialog.f1106l;
                if (c0221e2.f1142H != i) {
                    c0221e2.f1142H = i;
                    ((C0224h) c0221e2.f1148N).notifyDataSetChanged();
                }
            }
            Dialog.this.onClick(view);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$b */
    public class C0218b implements AdapterView.OnItemClickListener {
        public C0218b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Dialog dialog = Dialog.this;
            C0221e c0221e = dialog.f1106l;
            if (c0221e.f1131A != null) {
                if (c0221e.f1144J) {
                    dialog.dismiss();
                }
                Dialog dialog2 = Dialog.this;
                dialog2.f1106l.f1131A.mo840a(dialog2, view, i, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c */
    public class DialogInterfaceOnShowListenerC0219c implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Drawable f1124b;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m750b() {
                Dialog.this.f1104j.setBackgroundDrawable(null);
                Dialog.this.getWindow().setBackgroundDrawableResource(u2c0.f4650a);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                e51.m9025H(Dialog.this.getContext(), new Runnable() { // from class: l.gzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2799a.m750b();
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
                dialog.m738h0(dialog.f1104j, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$c$c */
        public class c implements ValueAnimator.AnimatorUpdateListener {
            public c() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Dialog dialog = Dialog.this;
                dialog.m739i0(dialog.f1104j, (1.0f - valueAnimator.getAnimatedFraction()) * DialogInterfaceOnShowListenerC0219c.this.f1123a);
                DialogInterfaceOnShowListenerC0219c.this.f1124b.setAlpha(Math.max(0, (int) ((1.0f - (valueAnimator.getAnimatedFraction() * 1.3f)) * 255.0f)));
            }
        }

        public DialogInterfaceOnShowListenerC0219c(int i, Drawable drawable) {
            this.f1123a = i;
            this.f1124b = drawable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        @TargetApi(21)
        public void onShow(DialogInterface dialogInterface) {
            ValueAnimator valueAnimatorOfFloat;
            ValueAnimator valueAnimatorOfInt;
            Dialog.this.getWindow().setDimAmount(0.7f);
            int width = Dialog.this.f1104j.getWidth();
            int height = Dialog.this.f1104j.getHeight();
            float fSqrt = (float) Math.sqrt(((width * width) / 4) + ((height * height) / 4));
            Dialog dialog = Dialog.this;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(dialog.f1104j, width / 2, height / 2, dialog.f1106l.f1190o0, fSqrt);
            Dialog.this.f1104j.setVisibility(0);
            animatorCreateCircularReveal.addListener(new a());
            animatorCreateCircularReveal.setDuration(Dialog.m711G(250));
            animatorCreateCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            Dialog dialog2 = Dialog.this;
            Point point = dialog2.f1106l.f1188n0;
            if (point == null) {
                valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
                valueAnimatorOfFloat = ValueAnimator.ofInt(0, 1);
            } else {
                int[] iArr = new int[2];
                dialog2.f1104j.getLocationOnScreen(iArr);
                int width2 = iArr[0] + (Dialog.this.f1104j.getWidth() / 2);
                int height2 = iArr[1] + (Dialog.this.f1104j.getHeight() / 2);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f1104j, "translationX", point.x - width2, 0.0f);
                valueAnimatorOfFloat = ObjectAnimator.ofFloat(Dialog.this.f1104j, "translationY", point.y - height2, 0.0f);
                valueAnimatorOfInt = objectAnimatorOfFloat;
            }
            valueAnimatorOfInt.setDuration(Dialog.m711G(250));
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.setDuration(Dialog.m711G(250));
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt2.addUpdateListener(new b());
            valueAnimatorOfInt2.setStartDelay(Dialog.m711G(LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_CLIENT_CHATREQ_VALUE));
            valueAnimatorOfInt2.setDuration(Dialog.m711G(100));
            ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt3.addUpdateListener(new c());
            valueAnimatorOfInt3.setStartDelay(Dialog.m711G(100));
            valueAnimatorOfInt3.setDuration(Dialog.m711G(LongLinkMessage.MsgTypeEnum.MSG_TYPE_LIVE_CLIENT_CHATREQ_VALUE));
            valueAnimatorOfInt3.setInterpolator(bt0.f2325b);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorCreateCircularReveal, valueAnimatorOfFloat, valueAnimatorOfInt3);
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$d */
    public static /* synthetic */ class C0220d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1129a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f1130b;

        static {
            int[] iArr = new int[ListType.values().length];
            f1130b = iArr;
            try {
                iArr[ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1130b[ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1130b[ListType.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Action.values().length];
            f1129a = iArr2;
            try {
                iArr2[Action.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1129a[Action.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e */
    public static class C0221e {

        /* JADX INFO: renamed from: A */
        public InterfaceC0223g f1131A;

        /* JADX INFO: renamed from: B */
        public InterfaceC0223g f1133B;

        /* JADX INFO: renamed from: B0 */
        public CharSequence f1134B0;

        /* JADX INFO: renamed from: C0 */
        public boolean f1136C0;

        /* JADX INFO: renamed from: D0 */
        public AbstractC0222f f1138D0;

        /* JADX INFO: renamed from: K */
        public Drawable f1145K;

        /* JADX INFO: renamed from: M */
        public View f1147M;

        /* JADX INFO: renamed from: N */
        public ListAdapter f1148N;

        /* JADX INFO: renamed from: O */
        public DialogInterface.OnDismissListener f1149O;

        /* JADX INFO: renamed from: P */
        public DialogInterface.OnCancelListener f1150P;

        /* JADX INFO: renamed from: Q */
        public DialogInterface.OnKeyListener f1151Q;

        /* JADX INFO: renamed from: R */
        public DialogInterface.OnShowListener f1152R;

        /* JADX INFO: renamed from: S */
        public InterfaceC0225i f1153S;

        /* JADX INFO: renamed from: T */
        public boolean f1154T;

        /* JADX INFO: renamed from: U */
        public boolean f1155U;

        /* JADX INFO: renamed from: V */
        public int f1156V;

        /* JADX INFO: renamed from: W */
        public int f1157W;

        /* JADX INFO: renamed from: X */
        public Drawable f1158X;

        /* JADX INFO: renamed from: Y */
        public Drawable f1159Y;

        /* JADX INFO: renamed from: Z */
        public boolean f1160Z;

        /* JADX INFO: renamed from: a */
        public final Context f1161a;

        /* JADX INFO: renamed from: b */
        public CharSequence f1163b;

        /* JADX INFO: renamed from: c */
        public CharSequence f1165c;

        /* JADX INFO: renamed from: h0 */
        public Drawable f1176h0;

        /* JADX INFO: renamed from: i0 */
        public boolean f1178i0;

        /* JADX INFO: renamed from: k0 */
        public boolean f1182k0;

        /* JADX INFO: renamed from: m */
        public CharSequence f1185m;

        /* JADX INFO: renamed from: m0 */
        public boolean f1186m0;

        /* JADX INFO: renamed from: n */
        public CharSequence[] f1187n;

        /* JADX INFO: renamed from: n0 */
        public Point f1188n0;

        /* JADX INFO: renamed from: o */
        public CharSequence f1189o;

        /* JADX INFO: renamed from: o0 */
        public int f1190o0;

        /* JADX INFO: renamed from: p */
        public Drawable f1191p;

        /* JADX INFO: renamed from: p0 */
        public int f1192p0;

        /* JADX INFO: renamed from: q */
        public Drawable f1193q;

        /* JADX INFO: renamed from: r */
        public CharSequence f1195r;

        /* JADX INFO: renamed from: s */
        public CharSequence f1197s;

        /* JADX INFO: renamed from: s0 */
        public boolean f1198s0;

        /* JADX INFO: renamed from: t */
        public View f1199t;

        /* JADX INFO: renamed from: t0 */
        public boolean f1200t0;

        /* JADX INFO: renamed from: u */
        public int f1201u;

        /* JADX INFO: renamed from: u0 */
        public Dialog f1202u0;

        /* JADX INFO: renamed from: v */
        public int f1203v;

        /* JADX INFO: renamed from: v0 */
        public boolean f1204v0;

        /* JADX INFO: renamed from: w */
        public int f1205w;

        /* JADX INFO: renamed from: x */
        public Runnable f1207x;

        /* JADX INFO: renamed from: y */
        public Runnable f1209y;

        /* JADX INFO: renamed from: z */
        public Runnable f1211z;

        /* JADX INFO: renamed from: d */
        public int f1167d = 8388611;

        /* JADX INFO: renamed from: e */
        public int f1169e = 8388611;

        /* JADX INFO: renamed from: f */
        public int f1171f = 8388611;

        /* JADX INFO: renamed from: g */
        public int f1173g = 17;

        /* JADX INFO: renamed from: h */
        public int f1175h = -1;

        /* JADX INFO: renamed from: i */
        public int f1177i = -1;

        /* JADX INFO: renamed from: j */
        public int f1179j = 12;

        /* JADX INFO: renamed from: k */
        public int f1181k = -1;

        /* JADX INFO: renamed from: l */
        public int f1183l = -1;

        /* JADX INFO: renamed from: C */
        public boolean f1135C = false;

        /* JADX INFO: renamed from: D */
        public boolean f1137D = false;

        /* JADX INFO: renamed from: E */
        public Theme f1139E = Theme.LIGHT;

        /* JADX INFO: renamed from: F */
        public boolean f1140F = true;

        /* JADX INFO: renamed from: G */
        public float f1141G = 1.3f;

        /* JADX INFO: renamed from: H */
        public int f1142H = -1;

        /* JADX INFO: renamed from: I */
        public Integer[] f1143I = null;

        /* JADX INFO: renamed from: J */
        public boolean f1144J = true;

        /* JADX INFO: renamed from: L */
        public int f1146L = -1;

        /* JADX INFO: renamed from: a0 */
        public int f1162a0 = -1;

        /* JADX INFO: renamed from: b0 */
        public Runnable f1164b0 = null;

        /* JADX INFO: renamed from: c0 */
        public float f1166c0 = -1.0f;

        /* JADX INFO: renamed from: d0 */
        public boolean f1168d0 = false;

        /* JADX INFO: renamed from: e0 */
        public int f1170e0 = -2;

        /* JADX INFO: renamed from: f0 */
        public ImageView.ScaleType f1172f0 = null;

        /* JADX INFO: renamed from: g0 */
        public boolean f1174g0 = false;

        /* JADX INFO: renamed from: j0 */
        public int f1180j0 = -1;

        /* JADX INFO: renamed from: l0 */
        public int f1184l0 = 0;

        /* JADX INFO: renamed from: q0 */
        public int f1194q0 = -1;

        /* JADX INFO: renamed from: r0 */
        public int f1196r0 = -1;

        /* JADX INFO: renamed from: w0 */
        public int f1206w0 = -1;

        /* JADX INFO: renamed from: x0 */
        public int f1208x0 = -1;

        /* JADX INFO: renamed from: y0 */
        public int f1210y0 = -1;

        /* JADX INFO: renamed from: z0 */
        public int f1212z0 = -1;

        /* JADX INFO: renamed from: A0 */
        public int f1132A0 = Dialog.f1088Q;

        /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$e$a */
        public class a implements InterfaceC0223g {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ArrayList f1213a;

            public a(ArrayList arrayList) {
                this.f1213a = arrayList;
            }

            @Override // com.p003p1.mobile.android.app.Dialog.InterfaceC0223g
            /* JADX INFO: renamed from: a */
            public void mo840a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((MenuItem.OnMenuItemClickListener) Reflect.on(this.f1213a.get(i)).get("mClickListener")).onMenuItemClick((MenuItem) this.f1213a.get(i));
            }
        }

        public C0221e(@NonNull Context context) {
            this.f1161a = context;
        }

        /* JADX INFO: renamed from: A */
        public C0221e m765A(DialogInterface.OnCancelListener onCancelListener) {
            this.f1150P = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: A0 */
        public Dialog m766A0() {
            Dialog dialogM838z = m838z();
            dialogM838z.m10761A();
            return dialogM838z;
        }

        /* JADX INFO: renamed from: B */
        public C0221e m767B(boolean z) {
            this.f1140F = z;
            return this;
        }

        /* JADX INFO: renamed from: B0 */
        public C0221e m768B0(DialogInterface.OnShowListener onShowListener) {
            this.f1152R = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C0221e m769C(int i, int i2, int i3, int i4) {
            this.f1206w0 = i;
            this.f1208x0 = i2;
            this.f1210y0 = i3;
            this.f1212z0 = i4;
            return this;
        }

        /* JADX INFO: renamed from: C0 */
        public C0221e m770C0(CharSequence charSequence) {
            this.f1165c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C0221e m771D(@StringRes int i) {
            m775F(this.f1161a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: D0 */
        public C0221e m772D0(Theme theme) {
            this.f1139E = theme;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C0221e m773E(@StringRes int i, Object... objArr) {
            m775F(this.f1161a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: E0 */
        public C0221e m774E0(@StringRes int i) {
            m778G0(this.f1161a.getString(i));
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C0221e m775F(CharSequence charSequence) {
            this.f1185m = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: F0 */
        public C0221e m776F0(@StringRes int i, Object... objArr) {
            m778G0(this.f1161a.getString(i, objArr));
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C0221e m777G(int i) {
            this.f1183l = i;
            return this;
        }

        /* JADX INFO: renamed from: G0 */
        public C0221e m778G0(CharSequence charSequence) {
            this.f1163b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C0221e m779H(@ColorRes int i) {
            m777G(this.f1161a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: H0 */
        public C0221e m780H0(int i) {
            this.f1175h = i;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C0221e m781I(int i) {
            this.f1171f = i;
            return this;
        }

        /* JADX INFO: renamed from: I0 */
        public C0221e m782I0(@ColorRes int i) {
            m780H0(this.f1161a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C0221e m783J(boolean z) {
            this.f1174g0 = z;
            return this;
        }

        /* JADX INFO: renamed from: J0 */
        public C0221e m784J0(int i) {
            this.f1167d = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C0221e m785K(float f) {
            this.f1166c0 = f;
            return this;
        }

        /* JADX INFO: renamed from: K0 */
        public C0221e m786K0(InterfaceC0225i interfaceC0225i) {
            this.f1153S = interfaceC0225i;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C0221e m787L(int i) {
            this.f1184l0 = i;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C0221e m788M(@LayoutRes int i) {
            return m791P(LayoutInflater.from(this.f1161a).inflate(i, (ViewGroup) null), false);
        }

        /* JADX INFO: renamed from: N */
        public C0221e m789N(@LayoutRes int i, boolean z) {
            return m791P(LayoutInflater.from(this.f1161a).inflate(i, (ViewGroup) null), z);
        }

        @Deprecated
        /* JADX INFO: renamed from: O */
        public C0221e m790O(View view) {
            return m791P(view, true);
        }

        /* JADX INFO: renamed from: P */
        public C0221e m791P(View view, boolean z) {
            this.f1199t = view;
            this.f1155U = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C0221e m792Q() {
            this.f1204v0 = true;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C0221e m793R(boolean z) {
            this.f1136C0 = z;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C0221e m794S(int i) {
            this.f1177i = i;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C0221e m795T(@ColorRes int i) {
            m794S(this.f1161a.getResources().getColor(i));
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C0221e m796U(int i) {
            this.f1179j = i;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C0221e m797V(DialogInterface.OnDismissListener onDismissListener) {
            this.f1149O = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C0221e m798W(boolean z) {
            this.f1160Z = z;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C0221e m799X(boolean z) {
            this.f1154T = z;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public Dialog m800Y() {
            return this.f1202u0;
        }

        /* JADX INFO: renamed from: Z */
        public C0221e m801Z(int i) {
            this.f1194q0 = i;
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C0221e m802a0(Drawable drawable) {
            this.f1145K = drawable;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C0221e m803b0(View view) {
            this.f1147M = view;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C0221e m804c0(@DrawableRes int i) {
            this.f1145K = this.f1161a.getResources().getDrawable(i);
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C0221e m805d0(int i) {
            this.f1146L = i;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C0221e m806e0(List<String> list) {
            CharSequence[] charSequenceArr = new CharSequence[list.size()];
            for (int i = 0; i < list.size(); i++) {
                charSequenceArr[i] = list.get(i);
            }
            this.f1187n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C0221e m807f0(CharSequence[] charSequenceArr) {
            this.f1187n = charSequenceArr;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C0221e m808g0(InterfaceC0223g interfaceC0223g) {
            this.f1131A = interfaceC0223g;
            this.f1133B = null;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C0221e m809h0(int i, InterfaceC0223g interfaceC0223g) {
            this.f1142H = i;
            this.f1131A = null;
            this.f1133B = interfaceC0223g;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C0221e m810i0(DialogInterface.OnKeyListener onKeyListener) {
            this.f1151Q = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C0221e m811j0(final Menu menu) {
            m806e0(vwb.Q(vwb.a0(menu.size()), new w9j() { // from class: l.hzd
                public final Object call(Object obj) {
                    return menu.getItem(((Integer) obj).intValue()).getTitle().toString();
                }
            })).m808g0(new a((ArrayList) Reflect.on(menu).get("mItems")));
            return this;
        }

        /* JADX INFO: renamed from: k0 */
        public C0221e m812k0(@StringRes int i) {
            return m815n0(this.f1161a.getString(i), this.f1209y);
        }

        /* JADX INFO: renamed from: l0 */
        public C0221e m813l0(@StringRes int i, Runnable runnable) {
            return m815n0(this.f1161a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: m0 */
        public C0221e m814m0(CharSequence charSequence) {
            return m815n0(charSequence, this.f1209y);
        }

        /* JADX INFO: renamed from: n0 */
        public C0221e m815n0(CharSequence charSequence, Runnable runnable) {
            this.f1197s = charSequence;
            this.f1209y = runnable;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C0221e m816o(int i) {
            this.f1201u = i;
            this.f1203v = i;
            this.f1205w = i;
            return this;
        }

        /* JADX INFO: renamed from: o0 */
        public C0221e m817o0(int i) {
            this.f1203v = i;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0221e m818p(ListAdapter listAdapter) {
            this.f1148N = listAdapter;
            return this;
        }

        /* JADX INFO: renamed from: p0 */
        public C0221e m819p0(@StringRes int i, Runnable runnable) {
            return m821q0(this.f1161a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: q */
        public C0221e m820q(boolean z) {
            this.f1144J = z;
            return this;
        }

        /* JADX INFO: renamed from: q0 */
        public C0221e m821q0(CharSequence charSequence, Runnable runnable) {
            this.f1195r = charSequence;
            this.f1211z = runnable;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0221e m822r(int i) {
            this.f1156V = i;
            return this;
        }

        /* JADX INFO: renamed from: r0 */
        public C0221e m823r0(CharSequence charSequence) {
            this.f1134B0 = charSequence;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f1184l0 = n8c0.f3373l;
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0221e m824s() {
            this.f1168d0 = true;
            this.f1167d = 1;
            this.f1169e = 1;
            return this;
        }

        /* JADX INFO: renamed from: s0 */
        public C0221e m825s0(@StringRes int i) {
            return m831v0(this.f1161a.getString(i), this.f1207x);
        }

        /* JADX INFO: renamed from: t */
        public C0221e m826t() {
            this.f1198s0 = true;
            return this;
        }

        /* JADX INFO: renamed from: t0 */
        public C0221e m827t0(@StringRes int i, Runnable runnable) {
            return m831v0(this.f1161a.getString(i), runnable);
        }

        /* JADX INFO: renamed from: u */
        public C0221e m828u() {
            this.f1178i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: u0 */
        public C0221e m829u0(CharSequence charSequence) {
            return m831v0(charSequence, this.f1207x);
        }

        /* JADX INFO: renamed from: v */
        public C0221e m830v() {
            this.f1182k0 = true;
            this.f1200t0 = true;
            this.f1198s0 = true;
            this.f1154T = true;
            this.f1178i0 = true;
            return this;
        }

        /* JADX INFO: renamed from: v0 */
        public C0221e m831v0(CharSequence charSequence, Runnable runnable) {
            this.f1189o = charSequence;
            this.f1207x = runnable;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0221e m832w(int i) {
            this.f1173g = i;
            return this;
        }

        /* JADX INFO: renamed from: w0 */
        public C0221e m833w0(Drawable drawable) {
            this.f1176h0 = drawable;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C0221e m834x(int i) {
            this.f1132A0 = i;
            return this;
        }

        /* JADX INFO: renamed from: x0 */
        public C0221e m835x0(Drawable drawable) {
            this.f1191p = drawable;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C0221e m836y(boolean z) {
            this.f1168d0 = z;
            return this;
        }

        /* JADX INFO: renamed from: y0 */
        public C0221e m837y0(AbstractC0222f abstractC0222f) {
            this.f1138D0 = abstractC0222f;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public Dialog m838z() {
            Dialog dialog = new Dialog(this);
            this.f1202u0 = dialog;
            return dialog;
        }

        /* JADX INFO: renamed from: z0 */
        public Dialog m839z0() {
            Dialog dialogM838z = m838z();
            dialogM838z.show();
            return dialogM838z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$f */
    public static abstract class AbstractC0222f {
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$g */
    public interface InterfaceC0223g {
        /* JADX INFO: renamed from: a */
        void mo840a(Dialog dialog, View view, int i, CharSequence charSequence);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$h */
    public class C0224h extends ArrayAdapter<CharSequence> {

        /* JADX INFO: renamed from: a */
        public final int f1215a;

        public C0224h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
            this.f1215a = Dialog.m717b0(getContext(), j0c0.f2946g, Dialog.this.f1099F);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @SuppressLint({"WrongViewCast"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(p4c0.f3638R0);
            int i2 = C0220d.f1130b[Dialog.this.f1100G.ordinal()];
            if (i2 == 1) {
                ((RadioButton) view2.findViewById(p4c0.f3605B)).setChecked(Dialog.this.f1106l.f1142H == i);
            } else if (i2 == 2) {
                ((CheckBox) view2.findViewById(p4c0.f3605B)).setChecked(Dialog.this.f1101H.contains(Integer.valueOf(i)));
            }
            textView.setText(Dialog.this.f1106l.f1187n[i]);
            textView.setTextColor(this.f1215a);
            view2.setTag(i + ":" + ((Object) Dialog.this.f1106l.f1187n[i]));
            C0221e c0221e = Dialog.this.f1106l;
            Drawable drawableM720e0 = c0221e.f1158X;
            if (drawableM720e0 == null && (drawableM720e0 = Dialog.m720e0(c0221e.f1161a, j0c0.f2947h)) == null) {
                drawableM720e0 = Dialog.m720e0(getContext(), j0c0.f2947h);
            }
            view2.setBackgroundDrawable(drawableM720e0);
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.Dialog$i */
    public interface InterfaceC0225i {
        /* JADX INFO: renamed from: a */
        void m841a(Dialog dialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"InflateParams"})
    public Dialog(C0221e c0221e) {
        super(m713Q(c0221e), c0221e.f1178i0, c0221e.f1184l0);
        this.f1106l = c0221e;
        VLinear_Foreground vLinear_Foreground = new VLinear_Foreground(c0221e.f1161a);
        this.f1105k = vLinear_Foreground;
        vLinear_Foreground.setOrientation(1);
        this.f1105k.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        boolean zIsEmpty = TextUtils.isEmpty(c0221e.f1134B0);
        VLinear_Foreground vLinear_Foreground2 = this.f1105k;
        if (zIsEmpty) {
            this.f1104j = vLinear_Foreground2;
        } else {
            vLinear_Foreground2.setBackgroundResource(u2c0.f4658b);
            VLinear_Foreground vLinear_Foreground3 = new VLinear_Foreground(c0221e.f1161a);
            this.f1104j = vLinear_Foreground3;
            vLinear_Foreground3.setOrientation(1);
            vLinear_Foreground3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            vLinear_Foreground3.addView(this.f1105k);
            this.f1118x = new VText(c0221e.f1161a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = f1084M;
            layoutParams.gravity = 17;
            this.f1118x.setLayoutParams(layoutParams);
            this.f1118x.setTextSize(c0221e.f1179j);
            this.f1118x.setTypeface(eqh0.c(2));
            int i = c0221e.f1177i;
            TextView textView = this.f1118x;
            if (i != -1) {
                textView.setTextColor(i);
            } else {
                textView.setTextColor(getContext().getResources().getColor(t0c0.f4232p));
            }
            this.f1118x.setText(c0221e.f1134B0);
            this.f1118x.setGravity(17);
            if (c0221e.f1136C0) {
                this.f1118x.setOnClickListener(new View.OnClickListener() { // from class: l.fzd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f2750a.m715W(view);
                    }
                });
            }
            vLinear_Foreground3.addView(this.f1118x);
        }
        LinearLayout linearLayout = new LinearLayout(c0221e.f1161a);
        this.f1115u = linearLayout;
        linearLayout.setOrientation(1);
        this.f1115u.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        if (c0221e.f1182k0) {
            m723J(c0221e);
        } else {
            m724K(c0221e);
        }
        DialogInterface.OnShowListener onShowListener = c0221e.f1152R;
        if (onShowListener != null) {
            setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c0221e.f1150P;
        if (onCancelListener != null) {
            setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c0221e.f1149O;
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c0221e.f1151Q;
        if (onKeyListener != null) {
            setOnKeyListener(onKeyListener);
        }
        this.f1105k.addView(this.f1115u);
        setCancelable(c0221e.f1140F);
        setCanceledOnTouchOutside(c0221e.f1140F);
        int i2 = c0221e.f1156V;
        if (i2 == 0) {
            c0221e.f1156V = m716a0(getContext(), j0c0.f2942c);
        } else {
            this.f1104j.setBackgroundColor(i2);
        }
        int iM716a0 = m716a0(getContext(), j0c0.f2941b);
        int i3 = c0221e.f1201u;
        this.f1102I = i3 != 0;
        int i4 = c0221e.f1203v;
        this.f1103J = i4 != 0;
        if (iM716a0 != 0) {
            c0221e.f1201u = i3 == 0 ? iM716a0 : i3;
            c0221e.f1203v = i4 == 0 ? iM716a0 : i4;
            int i5 = c0221e.f1205w;
            c0221e.f1205w = i5 != 0 ? i5 : iM716a0;
        }
        if (c0221e.f1154T || c0221e.f1198s0 || c0221e.f1200t0) {
            this.f1097D = true;
        }
        m731T();
        m10769y();
        m10768x();
        m10770z(this.f1104j);
    }

    /* JADX INFO: renamed from: G */
    public static int m711G(int i) {
        return (int) (i * 0.9f);
    }

    /* JADX INFO: renamed from: H */
    public static int m712H(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: Q */
    public static ContextThemeWrapper m713Q(C0221e c0221e) {
        TypedArray typedArrayObtainStyledAttributes = c0221e.f1161a.getTheme().obtainStyledAttributes(new int[]{j0c0.f2945f});
        Theme theme = c0221e.f1139E;
        Theme theme2 = Theme.DARK;
        boolean z = theme == theme2;
        if (!z) {
            try {
                z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                if (!z) {
                    theme2 = Theme.LIGHT;
                }
                c0221e.f1139E = theme2;
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        return new ContextThemeWrapper(c0221e.f1161a, z ? n8c0.f3366e : n8c0.f3367f);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: R */
    public static int m714R(int i) {
        if (i != 17) {
            return i != 8388613 ? 5 : 6;
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m715W(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: a0 */
    public static int m716a0(Context context, int i) {
        return m717b0(context, i, 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static int m717b0(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static float m718c0(Context context, int i) {
        return m719d0(context, i, 0.0f);
    }

    /* JADX INFO: renamed from: d0 */
    public static float m719d0(Context context, int i, float f) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDimension(0, f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static Drawable m720e0(Context context, int i) {
        return m721f0(context, i, null);
    }

    /* JADX INFO: renamed from: f0 */
    public static Drawable m721f0(Context context, int i, Drawable drawable) {
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
    public Dialog m722I(boolean z) {
        this.f1106l.f1144J = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final void m723J(C0221e c0221e) {
        CharSequence charSequence = c0221e.f1163b;
        boolean z = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c0221e.f1165c;
        boolean z2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence3 = c0221e.f1185m;
        boolean z3 = (charSequence3 == null || charSequence3.toString().trim().length() == 0) ? false : true;
        boolean z4 = c0221e.f1199t != null;
        CharSequence[] charSequenceArr = c0221e.f1187n;
        boolean z5 = (charSequenceArr != null && charSequenceArr.length > 0) || c0221e.f1148N != null;
        if (this.f1106l.f1196r0 != -1) {
            this.f1115u.setPadding(0, this.f1106l.f1196r0, 0, 0);
        }
        if (c0221e.f1145K != null) {
            ImageView imageView = new ImageView(this.f1106l.f1161a);
            this.f1108n = imageView;
            imageView.setImageDrawable(c0221e.f1145K);
            ImageView.ScaleType scaleType = this.f1106l.f1172f0;
            if (scaleType == null) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                imageView.setScaleType(scaleType);
            }
        }
        View view = c0221e.f1147M;
        if (view != null) {
            this.f1108n = view;
        }
        if (this.f1108n != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f1106l.f1170e0, -2);
            int i = c0221e.f1146L;
            if (i == -1) {
                layoutParams.topMargin = f1087P;
            } else {
                layoutParams.topMargin = i;
            }
            layoutParams.gravity = 1;
            this.f1108n.setMinimumHeight(f1093V);
            this.f1115u.addView(this.f1108n, layoutParams);
        }
        if (z || z2 || z3) {
            int i2 = ((!z4 || c0221e.f1204v0) && !z5) ? this.f1106l.f1132A0 : 0;
            LinearLayout linearLayout = new LinearLayout(this.f1106l.f1161a);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            int i3 = f1086O;
            layoutParams2.setMargins(i3, xdl0.w0() < 960 ? f1083L : f1087P, i3, i2);
            linearLayout.setLayoutParams(layoutParams2);
            int i4 = 2;
            if (z) {
                this.f1109o = new VText(this.f1106l.f1161a);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                this.f1109o.setLayoutParams(layoutParams3);
                this.f1109o.setTextSize(20.0f);
                this.f1109o.setTypeface(eqh0.c(2));
                int i5 = c0221e.f1175h;
                if (i5 != -1) {
                    this.f1109o.setTextColor(i5);
                } else {
                    this.f1109o.setTextColor(m717b0(getContext(), j0c0.f2949j, getContext().getResources().getColor(t0c0.f4229m)));
                }
                this.f1109o.setText(this.f1106l.f1163b);
                this.f1109o.setGravity(17);
                linearLayout.addView(this.f1109o);
            } else {
                i4 = 2;
            }
            if (z2) {
                this.f1110p = new VText(this.f1106l.f1161a);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 16;
                layoutParams4.setMargins(0, z ? f1084M : 0, 0, 0);
                this.f1110p.setLayoutParams(layoutParams4);
                this.f1110p.setTextSize(14.0f);
                this.f1110p.setTypeface(eqh0.c(i4));
                int i6 = c0221e.f1181k;
                if (i6 != -1) {
                    this.f1110p.setTextColor(i6);
                } else {
                    this.f1110p.setTextColor(m717b0(getContext(), j0c0.f2948i, getContext().getResources().getColor(t0c0.f4230n)));
                }
                this.f1110p.setGravity(17);
                this.f1110p.setText(this.f1106l.f1165c);
                linearLayout.addView(this.f1110p);
            }
            if (z3) {
                this.f1111q = new VText(this.f1106l.f1161a);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.gravity = 16;
                layoutParams5.setMargins(0, (z || z2) ? f1084M : 0, 0, 0);
                if (c0221e.f1174g0) {
                    this.f1111q.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f1111q.setHighlightColor(getContext().getResources().getColor(t0c0.f4215E));
                }
                this.f1111q.setLayoutParams(layoutParams5);
                this.f1111q.setTypeface(eqh0.c(i4));
                TextView textView = this.f1111q;
                float f = this.f1106l.f1166c0;
                if (f <= 0.0f) {
                    f = 14.0f;
                }
                textView.setTextSize(f);
                this.f1111q.setText(this.f1106l.f1185m);
                int i7 = c0221e.f1183l;
                if (i7 != -1) {
                    this.f1111q.setTextColor(i7);
                } else {
                    this.f1111q.setTextColor(m717b0(getContext(), j0c0.f2944e, getContext().getResources().getColor(t0c0.f4230n)));
                }
                this.f1111q.setGravity(c0221e.f1173g);
                this.f1111q.setTextAlignment(m714R(c0221e.f1173g));
                linearLayout.addView(this.f1111q);
            }
            this.f1115u.addView(linearLayout);
        }
        if (z4) {
            this.f1113s = new FrameLayout(this.f1106l.f1161a);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(c0221e.f1206w0 == -1 ? 0 : c0221e.f1206w0, c0221e.f1208x0 == -1 ? 0 : c0221e.f1208x0, c0221e.f1210y0 == -1 ? 0 : c0221e.f1210y0, c0221e.f1212z0 == -1 ? 0 : c0221e.f1212z0);
            this.f1113s.setLayoutParams(layoutParams6);
            this.f1113s.addView(c0221e.f1199t);
            boolean z6 = c0221e.f1204v0;
            LinearLayout linearLayout2 = this.f1115u;
            if (z6) {
                linearLayout2.addView(this.f1113s, 0);
            } else {
                linearLayout2.addView(this.f1113s);
            }
        }
        if (z5) {
            FrameLayout frameLayout = new FrameLayout(this.f1106l.f1161a);
            this.f1116v = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f1106l.f1161a);
            this.f1107m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f1107m.setDivider(null);
            this.f1107m.setDividerHeight(0);
            this.f1107m.setScrollBarDefaultDelayBeforeFade(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
            this.f1107m.setScrollBarStyle(33554432);
            this.f1107m.setFastScrollEnabled(this.f1106l.f1160Z);
            this.f1107m.setSelector(m720e0(getContext(), j0c0.f2947h));
            int i8 = c0221e.f1157W;
            if (i8 != 0) {
                this.f1099F = i8;
            } else if (c0221e.f1139E == Theme.LIGHT) {
                this.f1099F = -16777216;
            } else {
                this.f1099F = -1;
            }
            C0221e c0221e2 = this.f1106l;
            if (c0221e2.f1148N == null) {
                if (c0221e2.f1133B != null) {
                    this.f1100G = ListType.SINGLE;
                    this.f1098E = c0221e.f1137D;
                } else {
                    c0221e2.getClass();
                    this.f1100G = ListType.REGULAR;
                }
                this.f1106l.f1148N = new C0224h(this.f1106l.f1161a, ListType.getLayoutForType(this.f1100G), p4c0.f3638R0, this.f1106l.f1187n);
            }
            this.f1116v.setPadding(0, (z || z2 || c0221e.f1185m != null || c0221e.f1199t != null) ? 0 : f1083L, 0, !m730S() ? f1083L : 0);
            this.f1116v.addView(this.f1107m);
            this.f1115u.addView(this.f1116v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m724K(C0221e c0221e) {
        Dialog dialog;
        Dialog dialog2;
        CharSequence charSequence = c0221e.f1163b;
        boolean z = (charSequence == null || charSequence.toString().trim().length() == 0) ? false : true;
        CharSequence charSequence2 = c0221e.f1165c;
        boolean z2 = (charSequence2 == null || charSequence2.toString().trim().length() == 0) ? false : true;
        if (z) {
            LinearLayout linearLayout = new LinearLayout(this.f1106l.f1161a);
            this.f1112r = linearLayout;
            linearLayout.setOrientation(this.f1106l.f1168d0 ? 1 : 0);
            this.f1112r.setGravity(16);
            this.f1112r.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = this.f1112r;
            int i = f1086O;
            int i2 = this.f1106l.f1196r0 == -1 ? i : this.f1106l.f1196r0;
            int i3 = f1085N;
            linearLayout2.setPadding(i, i2, i, i3);
            if (c0221e.f1145K != null) {
                ImageView imageView = new ImageView(this.f1106l.f1161a);
                this.f1108n = imageView;
                imageView.setImageDrawable(c0221e.f1145K);
                if (!this.f1106l.f1168d0) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            View view = c0221e.f1147M;
            if (view != null) {
                this.f1108n = view;
            }
            if (this.f1108n != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (this.f1106l.f1168d0) {
                    layoutParams.setMargins(i3, i3, i3, i3);
                    layoutParams.gravity = 1;
                } else {
                    layoutParams.setMargins(0, 0, i3, 0);
                }
                this.f1108n.setLayoutParams(layoutParams);
                this.f1112r.addView(this.f1108n);
            }
            this.f1109o = new VText(this.f1106l.f1161a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f1106l.f1168d0) {
                layoutParams2.gravity = 16;
            }
            this.f1109o.setLayoutParams(layoutParams2);
            this.f1109o.setTextSize(18.0f);
            this.f1109o.setTypeface(eqh0.c(3), 1);
            this.f1109o.setText(this.f1106l.f1163b);
            int i4 = c0221e.f1175h;
            if (i4 != -1) {
                this.f1109o.setTextColor(i4);
            } else {
                this.f1109o.setTextColor(m717b0(getContext(), j0c0.f2949j, m716a0(getContext(), R.attr.textColorPrimary)));
            }
            this.f1109o.setGravity(c0221e.f1167d);
            this.f1109o.setTextAlignment(m714R(c0221e.f1167d));
            this.f1112r.addView(this.f1109o);
            this.f1115u.addView(this.f1112r);
        }
        if (z2) {
            this.f1110p = new VText(this.f1106l.f1161a);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            if (this.f1106l.f1168d0) {
                layoutParams3.gravity = 16;
            }
            layoutParams3.setMargins(0, z ? 0 : f1086O, 0, f1085N);
            this.f1110p.setLayoutParams(layoutParams3);
            this.f1110p.setTextSize(14.0f);
            this.f1110p.setTypeface(eqh0.c(2));
            this.f1110p.setText(this.f1106l.f1165c);
            TextView textView = this.f1110p;
            int i5 = f1086O;
            textView.setPadding(i5, 0, i5, 0);
            int i6 = c0221e.f1181k;
            if (i6 != -1) {
                this.f1110p.setTextColor(i6);
            } else {
                this.f1110p.setTextColor(m717b0(getContext(), j0c0.f2948i, m716a0(getContext(), R.attr.textColorSecondary)));
            }
            this.f1110p.setGravity(c0221e.f1169e);
            this.f1109o.setTextAlignment(m714R(c0221e.f1167d));
            this.f1115u.addView(this.f1110p);
        }
        if (c0221e.f1185m != null) {
            FrameLayout frameLayout = new FrameLayout(this.f1106l.f1161a);
            this.f1114t = frameLayout;
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = this.f1114t;
            int i7 = f1086O;
            int i8 = f1085N;
            frameLayout2.setPadding(i7, 0, i7, i8);
            VText vText = new VText(this.f1106l.f1161a);
            this.f1111q = vText;
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (c0221e.f1174g0) {
                this.f1111q.setMovementMethod(LinkMovementMethod.getInstance());
                this.f1111q.setHighlightColor(getContext().getResources().getColor(t0c0.f4215E));
            }
            this.f1111q.setTypeface(eqh0.c(2));
            TextView textView2 = this.f1111q;
            float f = this.f1106l.f1166c0;
            textView2.setTextSize(f > 0.0f ? f : 14.0f);
            this.f1111q.setText(this.f1106l.f1185m);
            int i9 = c0221e.f1183l;
            if (i9 != -1) {
                this.f1111q.setTextColor(i9);
            } else {
                this.f1111q.setTextColor(m717b0(getContext(), j0c0.f2944e, m716a0(getContext(), R.attr.textColorSecondary)));
            }
            if (z || z2) {
                this.f1111q.setGravity(c0221e.f1171f);
                this.f1111q.setTextAlignment(m714R(c0221e.f1171f));
            } else {
                this.f1114t.setMinimumHeight(f1092U);
                this.f1114t.setPadding(i7, i7, i7, i8);
            }
            this.f1114t.addView(this.f1111q);
            this.f1115u.addView(this.f1114t);
        }
        if (c0221e.f1199t != null) {
            this.f1113s = new FrameLayout(this.f1106l.f1161a);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(c0221e.f1206w0 == -1 ? 0 : c0221e.f1206w0, c0221e.f1208x0 == -1 ? 0 : c0221e.f1208x0, c0221e.f1210y0 == -1 ? 0 : c0221e.f1210y0, c0221e.f1212z0 == -1 ? 0 : c0221e.f1212z0);
            this.f1113s.setLayoutParams(layoutParams4);
            this.f1113s.addView(c0221e.f1199t);
            boolean z3 = c0221e.f1204v0;
            LinearLayout linearLayout3 = this.f1115u;
            if (z3) {
                linearLayout3.addView(this.f1113s, 0);
            } else {
                linearLayout3.addView(this.f1113s);
            }
        }
        CharSequence[] charSequenceArr = c0221e.f1187n;
        if ((charSequenceArr == null || charSequenceArr.length <= 0) && c0221e.f1148N == null) {
            dialog = this;
        } else {
            FrameLayout frameLayout3 = new FrameLayout(this.f1106l.f1161a);
            this.f1116v = frameLayout3;
            frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VList_ScrollableHeight vList_ScrollableHeight = new VList_ScrollableHeight(this.f1106l.f1161a);
            this.f1107m = vList_ScrollableHeight;
            vList_ScrollableHeight.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f1107m.setDivider(null);
            this.f1107m.setDividerHeight(0);
            this.f1107m.setScrollBarDefaultDelayBeforeFade(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
            this.f1107m.setScrollBarStyle(33554432);
            this.f1107m.setFastScrollEnabled(this.f1106l.f1160Z);
            this.f1107m.setSelector(m720e0(getContext(), j0c0.f2947h));
            int i10 = c0221e.f1157W;
            if (i10 != 0) {
                this.f1099F = i10;
            } else if (c0221e.f1139E == Theme.LIGHT) {
                this.f1099F = -16777216;
            } else {
                this.f1099F = -1;
            }
            C0221e c0221e2 = this.f1106l;
            if (c0221e2.f1148N == null) {
                if (c0221e2.f1133B != null) {
                    this.f1100G = ListType.SINGLE;
                    this.f1098E = c0221e.f1137D;
                } else {
                    c0221e2.getClass();
                    this.f1100G = ListType.REGULAR;
                }
                Dialog dialog3 = this;
                this.f1106l.f1148N = dialog3.new C0224h(this.f1106l.f1161a, ListType.getLayoutForType(this.f1100G), p4c0.f3638R0, this.f1106l.f1187n);
                dialog2 = dialog3;
            } else {
                dialog2 = this;
            }
            dialog2.f1116v.setPadding(0, (z || z2 || c0221e.f1185m != null || c0221e.f1199t != null) ? 0 : f1083L, 0, !dialog2.m730S() ? f1083L : 0);
            dialog2.f1116v.addView(dialog2.f1107m);
            dialog2.f1115u.addView(dialog2.f1116v);
            dialog = dialog2;
        }
        if (z && !z2 && c0221e.f1185m == null && c0221e.f1199t == null) {
            CharSequence[] charSequenceArr2 = c0221e.f1187n;
            if ((charSequenceArr2 == null || charSequenceArr2.length == 0) && c0221e.f1148N == null) {
                dialog.f1112r.setMinimumHeight(f1092U);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final int m725L() {
        return (getWindow().getDecorView().getMeasuredWidth() - (((int) getContext().getResources().getDimension(u1c0.f4463o)) * 2)) / m735Y();
    }

    /* JADX INFO: renamed from: M */
    public final void m726M() {
        boolean z = this.f1097D;
        if (m735Y() <= 1) {
            return;
        }
        if (this.f1106l.f1154T && !this.f1097D) {
            this.f1097D = true;
            m731T();
            return;
        }
        int iM725L = m725L();
        this.f1097D = false;
        if (this.f1106l.f1189o != null) {
            this.f1097D = this.f1119y.getWidth() > iM725L;
        }
        if (!this.f1097D && this.f1106l.f1195r != null) {
            this.f1097D = this.f1094A.getWidth() > iM725L;
        }
        if (!this.f1097D && this.f1106l.f1197s != null) {
            this.f1097D = this.f1095B.getWidth() > iM725L;
        }
        if (z != this.f1097D) {
            m731T();
        }
    }

    /* JADX INFO: renamed from: N */
    public final ColorStateList m727N(int i) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m712H(i, 0.4f), i});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final Drawable m728O() {
        boolean z = this.f1097D;
        C0221e c0221e = this.f1106l;
        if (z) {
            Drawable drawable = c0221e.f1158X;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawableM720e0 = m720e0(c0221e.f1161a, j0c0.f2947h);
            if (drawableM720e0 != null) {
                return drawableM720e0;
            }
        } else {
            Drawable drawable2 = c0221e.f1159Y;
            if (drawable2 != null) {
                return drawable2;
            }
            Drawable drawableM720e1 = m720e0(c0221e.f1161a, j0c0.f2943d);
            if (drawableM720e1 != null) {
                return drawableM720e1;
            }
        }
        return m720e0(getContext(), this.f1097D ? j0c0.f2947h : j0c0.f2943d);
    }

    /* JADX INFO: renamed from: P */
    public final View m729P() {
        return this.f1106l.f1199t;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m730S() {
        return m735Y() > 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m731T() {
        LinearLayout.LayoutParams layoutParams;
        if (!m730S()) {
            m732U();
            if (this.f1105k.getChildCount() < 2 && this.f1116v != null) {
                this.f1107m.setClipToPadding(false);
            }
            return false;
        }
        ViewGroup viewGroup = this.f1117w;
        if (viewGroup != null && this.f1105k.indexOfChild(viewGroup) != -1) {
            this.f1105k.removeView(this.f1117w);
        }
        this.f1119y = new FrameLayout(this.f1106l.f1161a);
        this.f1095B = new FrameLayout(this.f1106l.f1161a);
        this.f1094A = new FrameLayout(this.f1106l.f1161a);
        this.f1120z = this.f1106l.f1198s0 ? new VButton_FakeShadow(this.f1106l.f1161a) : new VText(this.f1106l.f1161a);
        this.f1096C = new VText(this.f1106l.f1161a);
        VText vText = new VText(this.f1106l.f1161a);
        if (this.f1097D) {
            this.f1117w = new LinearLayout(this.f1106l.f1161a);
            this.f1117w.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ((LinearLayout) this.f1117w).setOrientation(1);
            m747q0(this.f1119y, false);
            if (this.f1106l.f1198s0) {
                m741k0();
            } else {
                m748r0(this.f1120z);
                this.f1119y.addView(this.f1120z);
            }
            m747q0(this.f1095B, true);
            if (this.f1106l.f1200t0) {
                m740j0();
            } else {
                m748r0(this.f1096C);
                this.f1095B.addView(this.f1096C);
            }
            m747q0(this.f1094A, false);
            m748r0(vText);
            this.f1094A.addView(vText);
            this.f1117w.addView(this.f1119y);
            this.f1117w.addView(this.f1095B);
            this.f1117w.addView(this.f1094A);
            this.f1094A.setId(p4c0.f3678n);
            this.f1119y.setId(p4c0.f3680o);
            this.f1095B.setId(p4c0.f3676m);
        } else {
            this.f1117w = new RelativeLayout(this.f1106l.f1161a);
            if (this.f1106l.f1198s0) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                ViewGroup viewGroup2 = this.f1117w;
                int i = f1084M;
                viewGroup2.setPadding(i, this.f1106l.f1199t == null ? f1086O : 0, i, i);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-1, f1091T);
            }
            this.f1117w.setLayoutParams(layoutParams);
            int i2 = f1087P;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i2);
            layoutParams2.addRule(9, -1);
            layoutParams2.addRule(12, -1);
            int i3 = f1083L;
            layoutParams2.setMargins(i3, 0, i3, i3);
            this.f1094A.setLayoutParams(layoutParams2);
            FrameLayout frameLayout = this.f1094A;
            int i4 = f1092U;
            frameLayout.setMinimumWidth(i4);
            m742l0(vText);
            vText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            this.f1094A.addView(vText);
            this.f1094A.setId(p4c0.f3678n);
            if (this.f1106l.f1200t0) {
                m740j0();
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams3.addRule(12, -1);
                this.f1095B.setLayoutParams(layoutParams3);
                m742l0(this.f1096C);
                this.f1096C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f1095B.setMinimumWidth(i4);
                this.f1095B.addView(this.f1096C);
                this.f1095B.setId(p4c0.f3676m);
            }
            if (this.f1106l.f1198s0) {
                m741k0();
            } else {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, i2);
                layoutParams4.addRule(11, -1);
                layoutParams4.addRule(12, -1);
                layoutParams4.setMargins(i3, 0, i3, i3);
                this.f1119y.setLayoutParams(layoutParams4);
                this.f1119y.setMinimumWidth(i4);
                m742l0(this.f1120z);
                this.f1120z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                this.f1119y.addView(this.f1120z);
                this.f1119y.setId(p4c0.f3680o);
            }
            this.f1117w.addView(this.f1094A);
            this.f1117w.addView(this.f1095B);
            this.f1117w.addView(this.f1119y);
        }
        Drawable drawable = this.f1106l.f1176h0;
        if (drawable != null) {
            xdl0.k(this.f1120z, drawable);
            this.f1120z.setCompoundDrawablePadding(f1082K);
        }
        CharSequence charSequence = this.f1106l.f1189o;
        if (charSequence != null) {
            this.f1120z.setText(charSequence.toString().toUpperCase());
            this.f1119y.setTag("POSITIVE");
            this.f1119y.setOnClickListener(this);
            if (!this.f1106l.f1198s0) {
                this.f1120z.setTextColor(m727N(this.f1106l.f1201u));
                this.f1119y.setBackgroundDrawable(m728O());
            }
        } else {
            this.f1119y.setVisibility(8);
        }
        C0221e c0221e = this.f1106l;
        if (c0221e.f1195r != null) {
            vText.setTextColor(m727N(c0221e.f1205w));
            this.f1094A.setBackgroundDrawable(m728O());
            vText.setText(this.f1106l.f1195r.toString().toUpperCase());
            this.f1094A.setTag("NEUTRAL");
            this.f1094A.setOnClickListener(this);
        } else {
            this.f1094A.setVisibility(8);
        }
        CharSequence charSequence2 = this.f1106l.f1197s;
        if (charSequence2 != null) {
            this.f1096C.setText(charSequence2.toString().toUpperCase());
            this.f1095B.setTag("NEGATIVE");
            this.f1095B.setOnClickListener(this);
            if (!this.f1106l.f1200t0) {
                this.f1096C.setTextColor(m727N(this.f1106l.f1203v));
                this.f1095B.setBackgroundDrawable(m728O());
            }
            if (!this.f1097D && !this.f1106l.f1200t0) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, f1087P);
                if (this.f1106l.f1189o != null) {
                    layoutParams5.addRule(16, this.f1119y.getId());
                    int i5 = f1083L;
                    layoutParams5.setMargins(i5, 0, 0, i5);
                } else {
                    layoutParams5.addRule(21);
                    int i6 = f1083L;
                    layoutParams5.setMargins(i6, 0, i6, i6);
                }
                layoutParams5.addRule(12, -1);
                this.f1095B.setLayoutParams(layoutParams5);
            }
        } else {
            this.f1095B.setVisibility(8);
        }
        if (!this.f1097D) {
            FrameLayout frameLayout2 = this.f1119y;
            int i7 = f1083L;
            frameLayout2.setPadding(i7, 0, i7, 0);
            this.f1095B.setPadding(i7, 0, i7, 0);
            this.f1094A.setPadding(i7, 0, i7, 0);
        }
        this.f1105k.addView(this.f1117w);
        m732U();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final void m732U() {
        C0221e c0221e = this.f1106l;
        CharSequence[] charSequenceArr = c0221e.f1187n;
        if ((charSequenceArr == null || charSequenceArr.length == 0) && c0221e.f1148N == null) {
            return;
        }
        this.f1107m.setAdapter(c0221e.f1148N);
        ListType listType = this.f1100G;
        VList vList = this.f1107m;
        if (listType != null) {
            vList.setOnItemClickListener(new C0217a());
        } else {
            vList.setOnItemClickListener(new C0218b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public final boolean m733V(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        return x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop;
    }

    /* JADX INFO: renamed from: X */
    public View m734X() {
        FrameLayout frameLayout = this.f1095B;
        return frameLayout != null ? frameLayout : findViewById(p4c0.f3676m);
    }

    /* JADX INFO: renamed from: Y */
    public final int m735Y() {
        C0221e c0221e = this.f1106l;
        int i = c0221e.f1189o != null ? 1 : 0;
        if (c0221e.f1195r != null) {
            i++;
        }
        return c0221e.f1197s != null ? i + 1 : i;
    }

    /* JADX INFO: renamed from: Z */
    public View m736Z() {
        FrameLayout frameLayout = this.f1119y;
        return frameLayout != null ? frameLayout : findViewById(p4c0.f3680o);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m737g0(View view) {
        C0221e c0221e = this.f1106l;
        int i = c0221e.f1142H;
        c0221e.f1133B.mo840a(this, view, i, i >= 0 ? c0221e.f1187n[i] : null);
    }

    /* JADX INFO: renamed from: h0 */
    public void m738h0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m739i0(ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setTranslationY(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final void m740j0() {
        if (this.f1097D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f1084M;
            this.f1095B.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f1084M;
            this.f1095B.setLayoutParams(layoutParams2);
        }
        this.f1096C.setTextAppearance(getContext(), n8c0.f3377p);
        if (this.f1103J) {
            this.f1096C.setTextColor(m727N(this.f1106l.f1203v));
        }
        this.f1096C.setSingleLine(true);
        this.f1096C.setGravity(17);
        this.f1096C.setEnabled(true);
        Drawable drawable = this.f1106l.f1193q;
        TextView textView = this.f1096C;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f1068e.getResources().getDrawable(u2c0.f4785q6));
        }
        this.f1096C.setMinHeight(f1090S);
        this.f1096C.setDuplicateParentStateEnabled(true);
        this.f1096C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f1095B.setClipChildren(false);
        this.f1095B.setClipToPadding(false);
        this.f1117w.setClipChildren(false);
        this.f1117w.setClipToPadding(false);
        this.f1096C.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f1068e, ozb0.f3587e));
        this.f1095B.addView(this.f1096C);
        this.f1095B.setId(p4c0.f3676m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m741k0() {
        if (this.f1097D) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = f1084M;
            this.f1119y.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = f1084M;
            this.f1119y.setLayoutParams(layoutParams2);
        }
        this.f1120z.setSingleLine(true);
        this.f1120z.setTextAppearance(getContext(), n8c0.f3376o);
        if (this.f1102I) {
            this.f1120z.setTextColor(m727N(this.f1106l.f1201u));
        }
        this.f1120z.setGravity(17);
        this.f1120z.setEnabled(true);
        Drawable drawable = this.f1106l.f1191p;
        TextView textView = this.f1120z;
        if (drawable != null) {
            textView.setBackgroundDrawable(drawable);
        } else {
            textView.setBackgroundDrawable(App.f1068e.getResources().getDrawable(u2c0.f4737k6));
        }
        this.f1120z.setMinHeight(f1090S);
        this.f1120z.setDuplicateParentStateEnabled(true);
        this.f1120z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 16));
        this.f1119y.setClipChildren(false);
        this.f1119y.setClipToPadding(false);
        this.f1117w.setClipChildren(false);
        this.f1117w.setClipToPadding(false);
        this.f1120z.setStateListAnimator(AnimatorInflater.loadStateListAnimator(App.f1068e, ozb0.f3587e));
        this.f1119y.addView(this.f1120z);
        this.f1119y.setId(p4c0.f3680o);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m742l0(TextView textView) {
        textView.setTextSize(14.0f);
        textView.setSingleLine(true);
        textView.setTypeface(eqh0.c(3));
        textView.setGravity(17);
        textView.setStateListAnimator(null);
        textView.setEnabled(true);
        textView.setBackgroundDrawable(null);
        textView.setMinWidth(f1089R);
        textView.setDuplicateParentStateEnabled(true);
    }

    /* JADX INFO: renamed from: m0 */
    public void m743m0(Runnable runnable) {
        this.f1106l.f1209y = runnable;
    }

    /* JADX INFO: renamed from: n0 */
    public TextView m744n0(String str) {
        if (this.f1096C != null) {
            boolean z = this.f1106l.f1200t0;
            TextView textView = this.f1096C;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f1096C;
    }

    /* JADX INFO: renamed from: o0 */
    public void m745o0(Runnable runnable) {
        this.f1106l.f1207x = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        String str;
        String str2 = (String) view.getTag();
        if ("POSITIVE".equals(str2)) {
            Runnable runnable = this.f1106l.f1207x;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f1106l.f1133B != null) {
                m737g0(view);
            }
            this.f1106l.getClass();
            if (this.f1106l.f1144J) {
                dismiss();
                return;
            }
            return;
        }
        if ("NEGATIVE".equals(str2)) {
            Runnable runnable2 = this.f1106l.f1209y;
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f1106l.f1144J) {
                dismiss();
                return;
            }
            return;
        }
        boolean zEquals = "NEUTRAL".equals(str2);
        C0221e c0221e = this.f1106l;
        if (zEquals) {
            Runnable runnable3 = c0221e.f1211z;
            if (runnable3 != null) {
                runnable3.run();
            }
            if (this.f1106l.f1144J) {
                dismiss();
                return;
            }
            return;
        }
        if (c0221e.f1131A != null) {
            if (c0221e.f1144J) {
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
                this.f1106l.f1131A.mo840a(this, view, i, str);
                return;
            }
            return;
        }
        if (c0221e.f1133B == null) {
            c0221e.getClass();
            if (this.f1106l.f1144J) {
                dismiss();
                return;
            }
            return;
        }
        RadioButton radioButton = (RadioButton) ((LinearLayout) view).getChildAt(1);
        if (!radioButton.isChecked()) {
            radioButton.setChecked(true);
        }
        C0221e c0221e2 = this.f1106l;
        if (c0221e2.f1144J && c0221e2.f1189o == null) {
            dismiss();
            m737g0(view);
        } else if (this.f1098E) {
            m737g0(view);
        }
    }

    @Override // p007l.szd, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        m726M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        InterfaceC0225i interfaceC0225i;
        if (motionEvent.getAction() != 0 || !m733V(getContext(), motionEvent) || (interfaceC0225i = this.f1106l.f1153S) == null) {
            return super/*android.app.Dialog*/.onTouchEvent(motionEvent);
        }
        interfaceC0225i.m841a(this);
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public TextView m746p0(String str) {
        if (this.f1120z != null) {
            boolean z = this.f1106l.f1198s0;
            TextView textView = this.f1120z;
            if (z) {
                textView.setText(str.toUpperCase());
            } else {
                textView.setText(str);
            }
        }
        return this.f1120z;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m747q0(FrameLayout frameLayout, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f1090S);
        layoutParams.gravity = 8388629;
        if (z) {
            layoutParams.setMargins(0, f1083L, 0, 0);
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setEnabled(true);
        int i = f1084M;
        frameLayout.setPadding(i, 0, i, 0);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m748r0(TextView textView) {
        m742l0(textView);
        int i = f1083L;
        textView.setPadding(i, 0, i, 0);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, this.f1106l.f1198s0 ? 17 : 21));
    }

    public final void setTitle(CharSequence charSequence) {
        this.f1109o.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.szd
    public void show() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.a("Dialogs can only be shown from the UI thread.");
            return;
        }
        Window window = getWindow();
        window.setWindowAnimations(n8c0.f3368g);
        if (this.f1106l.f1194q0 != -1) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.f1106l.f1194q0;
            window.setAttributes(attributes);
        }
        if (this.f1106l.f1180j0 != -1) {
            getWindow().setWindowAnimations(this.f1106l.f1180j0);
        }
        C0221e c0221e = this.f1106l;
        if (c0221e.f1186m0 && c0221e.f1178i0) {
            this.f1104j.setBackgroundResource(u2c0.f4658b);
            Drawable drawable = getContext().getDrawable(u2c0.f4658b);
            drawable.setColorFilter(new LightingColorFilter(this.f1106l.f1192p0, 0));
            int i = f1090S;
            m739i0(this.f1104j, i);
            m738h0(this.f1104j, 1.0f);
            getWindow().setBackgroundDrawableResource(u2c0.f4666c);
            this.f1104j.setForeground(drawable);
            getWindow().setDimAmount(0.7f);
            getWindow().setWindowAnimations(n8c0.f3363b);
            setOnShowListener(new DialogInterfaceOnShowListenerC0219c(i, drawable));
        }
        super.show();
    }
}
