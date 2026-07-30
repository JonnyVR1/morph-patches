package com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import java.lang.ref.WeakReference;
import l.bd50;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.gbl0;
import l.y6q0;
import p002l.aq2;
import p002l.d8c0;
import p002l.t6c0;
import p002l.vtl;
import p002l.wxs;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0200a extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: b */
    public int f3753b;

    /* JADX INFO: renamed from: c */
    public int f3754c;

    /* JADX INFO: renamed from: d */
    public View f3755d;

    /* JADX INFO: renamed from: e */
    @LayoutRes
    public int f3756e;

    /* JADX INFO: renamed from: f */
    public LiveDialogEnum f3757f;

    /* JADX INFO: renamed from: g */
    public DialogInterface.OnShowListener f3758g;

    /* JADX INFO: renamed from: h */
    public DialogInterface.OnDismissListener f3759h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnShowListener f3760i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnDismissListener f3761j;

    /* JADX INFO: renamed from: k */
    public e30<vtl> f3762k;

    /* JADX INFO: renamed from: l */
    public e30<vtl> f3763l;

    /* JADX INFO: renamed from: m */
    public e30<View> f3764m;

    /* JADX INFO: renamed from: n */
    public b f3765n;

    /* JADX INFO: renamed from: o */
    public aq2 f3766o;

    /* JADX INFO: renamed from: p */
    public View f3767p;

    /* JADX INFO: renamed from: q */
    public boolean f3768q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f3769r;

    /* JADX INFO: renamed from: s */
    public ValueAnimator f3770s;

    /* JADX INFO: renamed from: t */
    public boolean f3771t;

    /* JADX INFO: renamed from: u */
    public d30 f3772u;

    /* JADX INFO: renamed from: v */
    public e30<View> f3773v;

    /* JADX INFO: renamed from: w */
    public c f3774w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$a */
    public static class a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public WeakReference<C0200a> f3775a;

        public a(C0200a c0200a) {
            this.f3775a = new WeakReference<>(c0200a);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C0200a c0200a = this.f3775a.get();
            if (c0200a == null) {
                return;
            }
            if (c0200a.f3761j != null) {
                c0200a.f3761j.onDismiss(dialogInterface);
            }
            if (c0200a.f3759h != null) {
                c0200a.f3759h.onDismiss(dialogInterface);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            C0200a c0200a = this.f3775a.get();
            if (c0200a == null) {
                return;
            }
            if (c0200a.f3760i != null) {
                c0200a.f3760i.onShow(dialogInterface);
            }
            if (c0200a.f3758g != null) {
                c0200a.f3758g.onShow(dialogInterface);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$b */
    public class b implements vtl {
        public b() {
        }

        @Override // p002l.vtl
        /* JADX INFO: renamed from: a */
        public void mo5149a(DialogInterface.OnDismissListener onDismissListener) {
            if (C0200a.this.f3761j != null) {
                return;
            }
            C0200a.this.f3761j = onDismissListener;
        }

        @Override // p002l.vtl
        /* JADX INFO: renamed from: b */
        public int mo5150b() {
            return C0200a.this.f3753b;
        }

        @Override // p002l.vtl
        /* JADX INFO: renamed from: c */
        public void mo5151c(DialogInterface.OnShowListener onShowListener) {
            if (C0200a.this.f3760i != null) {
                return;
            }
            C0200a.this.f3760i = onShowListener;
        }

        @Override // p002l.vtl
        public void dismiss() {
            C0200a.this.dismiss();
        }

        @Override // p002l.vtl
        public LiveDialogEnum getType() {
            return C0200a.this.f3757f;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$c */
    public interface c {
        /* JADX INFO: renamed from: o */
        void mo5152o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0200a(wxs wxsVar, @LayoutRes int i, aq2 aq2Var) {
        super(wxsVar.act(), aq2Var.m10022d());
        this.f3753b = 17;
        this.f3754c = d8c0.f9103h;
        this.f3757f = LiveDialogEnum.UNKNOWN;
        this.f3765n = new b();
        this.f3768q = false;
        this.f3771t = false;
        this.f3773v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m25551K2().m22222j(this.f3765n);
        this.f3766o = aq2Var;
        this.f3756e = i;
        this.f3753b = aq2Var.mo10024f();
        m5129S();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m5106C(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m5107D(View view) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ y6q0 m5124z(View view, View view2, y6q0 y6q0Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), y6q0Var.f(y6q0.l.d()).d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: O */
    public final void m5125O() {
        m5147k0(null);
    }

    /* JADX INFO: renamed from: P */
    public final void m5126P(d30 d30Var) {
        m5147k0(d30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m5127Q(View view) {
        if (Build.VERSION.SDK_INT > 34) {
            view.setFitsSystemWindows(false);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.fitsSystemWindows});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        view.setFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: R */
    public View m5128R() {
        return this.f3755d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m5129S() {
        a aVar = new a(this);
        super/*android.app.Dialog*/.setOnShowListener(aVar);
        super/*android.app.Dialog*/.setOnDismissListener(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m5130T() {
        super/*android.app.Dialog*/.onBackPressed();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m5131U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        c cVar = this.f3774w;
        if (cVar == null) {
            return true;
        }
        cVar.mo5152o();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m5132V() {
        this.f3768q = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m5133W() {
        this.f3768q = false;
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing() && !getOwnerActivity().isDestroyed()) {
            dismiss();
        }
        d30 d30Var = this.f3772u;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m5134X(ValueAnimator valueAnimator) {
        if (this.f3766o.m10019a() <= 0.0f || !this.f3771t) {
            return;
        }
        this.f3755d.setBackgroundColor(Color.argb((int) (this.f3766o.m10019a() * 255.0f * (1.0f - valueAnimator.getAnimatedFraction())), 0, 0, 0));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m5135Y() {
        this.f3755d.setBackgroundColor(0);
        this.f3768q = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m5136Z(View view) {
        if (this.f3766o.m10025g()) {
            m5147k0(null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m5137a0() {
        this.f3768q = false;
        e30<View> e30Var = this.f3773v;
        if (e30Var != null) {
            e30Var.call(this.f3767p);
        }
        this.f3755d.setOnClickListener(new View.OnClickListener() { // from class: l.t2t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19405a.m5136Z(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m5138b0(ValueAnimator valueAnimator) {
        if (this.f3766o.m10019a() > 0.0f) {
            this.f3755d.setBackgroundColor(Color.argb((int) (this.f3766o.m10019a() * 255.0f * valueAnimator.getAnimatedFraction()), 0, 0, 0));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m5139c0(int i) {
        this.f3754c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public void m5140d0(boolean z) {
        if (z) {
            setOnKeyListener(null);
        } else {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.u2t
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return C0200a.m5106C(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        e30<vtl> e30Var = this.f3763l;
        if (e30Var != null) {
            e30Var.call(this.f3765n);
        }
        ValueAnimator valueAnimator = this.f3769r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f3770s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super/*android.app.Dialog*/.dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    public void m5141e0(int i) {
        this.f3753b = i;
    }

    /* JADX INFO: renamed from: f0 */
    public void m5142f0(c cVar) {
        this.f3774w = cVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m5143g0(e30<View> e30Var) {
        this.f3773v = e30Var;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5144h0(e30<View> e30Var) {
        this.f3764m = e30Var;
    }

    /* JADX INFO: renamed from: i0 */
    public void m5145i0(boolean z) {
        this.f3771t = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m5146j0(LiveDialogEnum liveDialogEnum) {
        this.f3757f = liveDialogEnum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m5147k0(d30 d30Var) {
        this.f3772u = d30Var;
        if (this.f3768q || !isShowing()) {
            return;
        }
        if (this.f3770s == null) {
            ValueAnimator valueAnimatorMo10020b = this.f3766o.mo10020b(this.f3767p);
            this.f3770s = valueAnimatorMo10020b;
            bt0.w(valueAnimatorMo10020b, new Runnable() { // from class: l.y2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22638a.m5132V();
                }
            }, new Runnable() { // from class: l.z2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23193a.m5133W();
                }
            });
            this.f3770s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a3t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f7358a.m5134X(valueAnimator);
                }
            });
        }
        this.f3770s.start();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m5148l0() {
        if (this.f3768q) {
            return;
        }
        if (this.f3769r == null) {
            ValueAnimator valueAnimatorMo10021c = this.f3766o.mo10021c(this.f3767p);
            this.f3769r = valueAnimatorMo10021c;
            bt0.w(valueAnimatorMo10021c, new Runnable() { // from class: l.b3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7973a.m5135Y();
                }
            }, new Runnable() { // from class: l.c3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8475a.m5137a0();
                }
            });
            this.f3769r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d3t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9053a.m5138b0(valueAnimator);
                }
            });
        }
        this.f3769r.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        c cVar = this.f3774w;
        if (cVar != null) {
            cVar.mo5152o();
        }
        e51.H(getContext(), new Runnable() { // from class: l.s2t
            @Override // java.lang.Runnable
            public final void run() {
                this.f18768a.m5130T();
            }
        }, 50L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceAsColor"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f3755d == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            if (Build.VERSION.SDK_INT > 34 && getOwnerActivity() != null && (getOwnerActivity() instanceof PutongAct)) {
                layoutInflaterFrom = getOwnerActivity().getLayoutInflater();
            }
            if (this.f3766o != null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(t6c0.f20015t0, (ViewGroup) null);
                this.f3755d = viewInflate;
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) viewInflate).getChildAt(0);
                viewGroup.removeAllViews();
                ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).gravity = this.f3753b;
                View viewInflate2 = layoutInflaterFrom.inflate(this.f3756e, (ViewGroup) this.f3755d, false);
                this.f3767p = viewInflate2;
                viewGroup.addView(viewInflate2);
                if (this.f3766o.m10026h()) {
                    setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.v2t
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            return this.f20936a.m5131U(dialogInterface, i, keyEvent);
                        }
                    });
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.w2t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C0200a.m5107D(view);
                    }
                });
            } else {
                this.f3755d = layoutInflaterFrom.inflate(this.f3756e, (ViewGroup) null);
            }
        }
        e30<View> e30Var = this.f3764m;
        if (e30Var != null) {
            e30Var.call(this.f3766o != null ? this.f3767p : this.f3755d);
        }
        m5127Q(this.f3755d);
        if (Build.VERSION.SDK_INT > 34) {
            final View viewFindViewById = findViewById(R.id.content);
            gbl0.y0(this.f3755d, new bd50() { // from class: l.x2t
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return C0200a.m5124z(viewFindViewById, view, y6q0Var);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        super/*android.app.Dialog*/.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.clearFlags(67108864);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setWindowAnimations(this.f3766o == null ? this.f3754c : 0);
        aq2 aq2Var = this.f3766o;
        if (aq2Var != null && aq2Var.m10023e() != null) {
            this.f3766o.m10023e().call(window);
        }
        setContentView(this.f3755d);
    }

    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f3759h = onDismissListener;
    }

    public void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.f3758g = onShowListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        e30<vtl> e30Var = this.f3762k;
        if (e30Var != null) {
            e30Var.call(this.f3765n);
        }
        super/*android.app.Dialog*/.show();
        if (this.f3766o != null) {
            m5148l0();
        }
    }

    public C0200a(wxs wxsVar, View view, int i) {
        this(wxsVar, d8c0.f9106k, view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0200a(wxs wxsVar, int i, View view, int i2) {
        super(wxsVar.act(), i);
        this.f3753b = 17;
        this.f3754c = d8c0.f9103h;
        this.f3757f = LiveDialogEnum.UNKNOWN;
        this.f3765n = new b();
        this.f3768q = false;
        this.f3771t = false;
        this.f3773v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m25551K2().m22222j(this.f3765n);
        this.f3755d = view;
        this.f3753b = i2;
        m5129S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0200a(wxs wxsVar, int i, @LayoutRes int i2, int i3) {
        super(wxsVar.act(), i);
        this.f3753b = 17;
        this.f3754c = d8c0.f9103h;
        this.f3757f = LiveDialogEnum.UNKNOWN;
        this.f3765n = new b();
        this.f3768q = false;
        this.f3771t = false;
        this.f3773v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m25551K2().m22222j(this.f3765n);
        this.f3756e = i2;
        this.f3753b = i3;
        m5129S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0200a(Act act, View view) {
        super(act, d8c0.f9106k);
        this.f3753b = 17;
        this.f3754c = d8c0.f9103h;
        this.f3757f = LiveDialogEnum.UNKNOWN;
        this.f3765n = new b();
        this.f3768q = false;
        this.f3771t = false;
        this.f3773v = null;
        setOwnerActivity(act);
        this.f3755d = view;
        m5129S();
    }
}
