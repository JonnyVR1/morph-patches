package com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter;

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
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import p149l.aq2;
import p149l.bd50;
import p149l.bt0;
import p149l.d30;
import p149l.d8c0;
import p149l.e30;
import p149l.e51;
import p149l.gbl0;
import p149l.t6c0;
import p149l.vtl;
import p149l.wxs;
import p149l.y6q0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC12611a extends DialogInterfaceC0074a {

    /* JADX INFO: renamed from: b */
    public int f47711b;

    /* JADX INFO: renamed from: c */
    public int f47712c;

    /* JADX INFO: renamed from: d */
    public View f47713d;

    /* JADX INFO: renamed from: e */
    @LayoutRes
    public int f47714e;

    /* JADX INFO: renamed from: f */
    public LiveDialogEnum f47715f;

    /* JADX INFO: renamed from: g */
    public DialogInterface.OnShowListener f47716g;

    /* JADX INFO: renamed from: h */
    public DialogInterface.OnDismissListener f47717h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnShowListener f47718i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnDismissListener f47719j;

    /* JADX INFO: renamed from: k */
    public e30<vtl> f47720k;

    /* JADX INFO: renamed from: l */
    public e30<vtl> f47721l;

    /* JADX INFO: renamed from: m */
    public e30<View> f47722m;

    /* JADX INFO: renamed from: n */
    public b f47723n;

    /* JADX INFO: renamed from: o */
    public aq2 f47724o;

    /* JADX INFO: renamed from: p */
    public View f47725p;

    /* JADX INFO: renamed from: q */
    public boolean f47726q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f47727r;

    /* JADX INFO: renamed from: s */
    public ValueAnimator f47728s;

    /* JADX INFO: renamed from: t */
    public boolean f47729t;

    /* JADX INFO: renamed from: u */
    public d30 f47730u;

    /* JADX INFO: renamed from: v */
    public e30<View> f47731v;

    /* JADX INFO: renamed from: w */
    public c f47732w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$a */
    public static class a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogC12611a> f47733a;

        public a(DialogC12611a dialogC12611a) {
            this.f47733a = new WeakReference<>(dialogC12611a);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogC12611a dialogC12611a = this.f47733a.get();
            if (dialogC12611a == null) {
                return;
            }
            if (dialogC12611a.f47719j != null) {
                dialogC12611a.f47719j.onDismiss(dialogInterface);
            }
            if (dialogC12611a.f47717h != null) {
                dialogC12611a.f47717h.onDismiss(dialogInterface);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            DialogC12611a dialogC12611a = this.f47733a.get();
            if (dialogC12611a == null) {
                return;
            }
            if (dialogC12611a.f47718i != null) {
                dialogC12611a.f47718i.onShow(dialogInterface);
            }
            if (dialogC12611a.f47716g != null) {
                dialogC12611a.f47716g.onShow(dialogInterface);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$b */
    public class b implements vtl {
        public b() {
        }

        @Override // p149l.vtl
        /* JADX INFO: renamed from: a */
        public void mo71781a(DialogInterface.OnDismissListener onDismissListener) {
            if (DialogC12611a.this.f47719j != null) {
                return;
            }
            DialogC12611a.this.f47719j = onDismissListener;
        }

        @Override // p149l.vtl
        /* JADX INFO: renamed from: b */
        public int mo71782b() {
            return DialogC12611a.this.f47711b;
        }

        @Override // p149l.vtl
        /* JADX INFO: renamed from: c */
        public void mo71783c(DialogInterface.OnShowListener onShowListener) {
            if (DialogC12611a.this.f47718i != null) {
                return;
            }
            DialogC12611a.this.f47718i = onShowListener;
        }

        @Override // p149l.vtl
        public void dismiss() {
            DialogC12611a.this.dismiss();
        }

        @Override // p149l.vtl
        public LiveDialogEnum getType() {
            return DialogC12611a.this.f47715f;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$c */
    public interface c {
        /* JADX INFO: renamed from: o */
        void mo71784o();
    }

    public DialogC12611a(wxs wxsVar, @LayoutRes int i, aq2 aq2Var) {
        super(wxsVar.act(), aq2Var.m98218d());
        this.f47711b = 17;
        this.f47712c = d8c0.f84853h;
        this.f47715f = LiveDialogEnum.UNKNOWN;
        this.f47723n = new b();
        this.f47726q = false;
        this.f47729t = false;
        this.f47731v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m206031K2().m182467j(this.f47723n);
        this.f47724o = aq2Var;
        this.f47714e = i;
        this.f47711b = aq2Var.mo98220f();
        m71761S();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m71738C(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m71739D(View view) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ y6q0 m71756z(View view, View view2, y6q0 y6q0Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: O */
    public final void m71757O() {
        m71779k0(null);
    }

    /* JADX INFO: renamed from: P */
    public final void m71758P(d30 d30Var) {
        m71779k0(d30Var);
    }

    /* JADX INFO: renamed from: Q */
    public final void m71759Q(View view) {
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
    public View m71760R() {
        return this.f47713d;
    }

    /* JADX INFO: renamed from: S */
    public final void m71761S() {
        a aVar = new a(this);
        super.setOnShowListener(aVar);
        super.setOnDismissListener(aVar);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m71762T() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m71763U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        c cVar = this.f47732w;
        if (cVar == null) {
            return true;
        }
        cVar.mo71784o();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m71764V() {
        this.f47726q = true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m71765W() {
        this.f47726q = false;
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing() && !getOwnerActivity().isDestroyed()) {
            dismiss();
        }
        d30 d30Var = this.f47730u;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m71766X(ValueAnimator valueAnimator) {
        if (this.f47724o.m98215a() <= 0.0f || !this.f47729t) {
            return;
        }
        this.f47713d.setBackgroundColor(Color.argb((int) (this.f47724o.m98215a() * 255.0f * (1.0f - valueAnimator.getAnimatedFraction())), 0, 0, 0));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m71767Y() {
        this.f47713d.setBackgroundColor(0);
        this.f47726q = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m71768Z(View view) {
        if (this.f47724o.m98221g()) {
            m71779k0(null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m71769a0() {
        this.f47726q = false;
        e30<View> e30Var = this.f47731v;
        if (e30Var != null) {
            e30Var.call(this.f47725p);
        }
        this.f47713d.setOnClickListener(new View.OnClickListener() { // from class: l.t2t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167549a.m71768Z(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m71770b0(ValueAnimator valueAnimator) {
        if (this.f47724o.m98215a() > 0.0f) {
            this.f47713d.setBackgroundColor(Color.argb((int) (this.f47724o.m98215a() * 255.0f * valueAnimator.getAnimatedFraction()), 0, 0, 0));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m71771c0(int i) {
        this.f47712c = i;
    }

    /* JADX INFO: renamed from: d0 */
    public void m71772d0(boolean z) {
        if (z) {
            setOnKeyListener(null);
        } else {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.u2t
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return DialogC12611a.m71738C(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        e30<vtl> e30Var = this.f47721l;
        if (e30Var != null) {
            e30Var.call(this.f47723n);
        }
        ValueAnimator valueAnimator = this.f47727r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f47728s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    public void m71773e0(int i) {
        this.f47711b = i;
    }

    /* JADX INFO: renamed from: f0 */
    public void m71774f0(c cVar) {
        this.f47732w = cVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m71775g0(e30<View> e30Var) {
        this.f47731v = e30Var;
    }

    /* JADX INFO: renamed from: h0 */
    public void m71776h0(e30<View> e30Var) {
        this.f47722m = e30Var;
    }

    /* JADX INFO: renamed from: i0 */
    public void m71777i0(boolean z) {
        this.f47729t = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m71778j0(LiveDialogEnum liveDialogEnum) {
        this.f47715f = liveDialogEnum;
    }

    /* JADX INFO: renamed from: k0 */
    public void m71779k0(d30 d30Var) {
        this.f47730u = d30Var;
        if (this.f47726q || !isShowing()) {
            return;
        }
        if (this.f47728s == null) {
            ValueAnimator valueAnimatorMo98216b = this.f47724o.mo98216b(this.f47725p);
            this.f47728s = valueAnimatorMo98216b;
            bt0.m103750w(valueAnimatorMo98216b, new Runnable() { // from class: l.y2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195710a.m71764V();
                }
            }, new Runnable() { // from class: l.z2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201278a.m71765W();
                }
            });
            this.f47728s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a3t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f67413a.m71766X(valueAnimator);
                }
            });
        }
        this.f47728s.start();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m71780l0() {
        if (this.f47726q) {
            return;
        }
        if (this.f47727r == null) {
            ValueAnimator valueAnimatorMo98217c = this.f47724o.mo98217c(this.f47725p);
            this.f47727r = valueAnimatorMo98217c;
            bt0.m103750w(valueAnimatorMo98217c, new Runnable() { // from class: l.b3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73257a.m71767Y();
                }
            }, new Runnable() { // from class: l.c3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79029a.m71769a0();
                }
            });
            this.f47727r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d3t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f84257a.m71770b0(valueAnimator);
                }
            });
        }
        this.f47727r.start();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        c cVar = this.f47732w;
        if (cVar != null) {
            cVar.mo71784o();
        }
        e51.m114743H(getContext(), new Runnable() { // from class: l.s2t
            @Override // java.lang.Runnable
            public final void run() {
                this.f162003a.m71762T();
            }
        }, 50L);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    @SuppressLint({"ResourceAsColor"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f47713d == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            if (Build.VERSION.SDK_INT > 34 && getOwnerActivity() != null && (getOwnerActivity() instanceof PutongAct)) {
                layoutInflaterFrom = getOwnerActivity().getLayoutInflater();
            }
            if (this.f47724o != null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(t6c0.f168519t0, (ViewGroup) null);
                this.f47713d = viewInflate;
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) viewInflate).getChildAt(0);
                viewGroup.removeAllViews();
                ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).gravity = this.f47711b;
                View viewInflate2 = layoutInflaterFrom.inflate(this.f47714e, (ViewGroup) this.f47713d, false);
                this.f47725p = viewInflate2;
                viewGroup.addView(viewInflate2);
                if (this.f47724o.m98222h()) {
                    setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.v2t
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            return this.f179607a.m71763U(dialogInterface, i, keyEvent);
                        }
                    });
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.w2t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DialogC12611a.m71739D(view);
                    }
                });
            } else {
                this.f47713d = layoutInflaterFrom.inflate(this.f47714e, (ViewGroup) null);
            }
        }
        e30<View> e30Var = this.f47722m;
        if (e30Var != null) {
            e30Var.call(this.f47724o != null ? this.f47725p : this.f47713d);
        }
        m71759Q(this.f47713d);
        if (Build.VERSION.SDK_INT > 34) {
            final View viewFindViewById = findViewById(R.id.content);
            gbl0.m125231y0(this.f47713d, new bd50() { // from class: l.x2t
                @Override // p149l.bd50
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return DialogC12611a.m71756z(viewFindViewById, view, y6q0Var);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setWindowAnimations(this.f47724o == null ? this.f47712c : 0);
        aq2 aq2Var = this.f47724o;
        if (aq2Var != null && aq2Var.m98219e() != null) {
            this.f47724o.m98219e().call(window);
        }
        setContentView(this.f47713d);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f47717h = onDismissListener;
    }

    @Override // android.app.Dialog
    public void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.f47716g = onShowListener;
    }

    @Override // android.app.Dialog
    public void show() {
        e30<vtl> e30Var = this.f47720k;
        if (e30Var != null) {
            e30Var.call(this.f47723n);
        }
        super.show();
        if (this.f47724o != null) {
            m71780l0();
        }
    }

    public DialogC12611a(wxs wxsVar, View view, int i) {
        this(wxsVar, d8c0.f84856k, view, i);
    }

    public DialogC12611a(wxs wxsVar, int i, View view, int i2) {
        super(wxsVar.act(), i);
        this.f47711b = 17;
        this.f47712c = d8c0.f84853h;
        this.f47715f = LiveDialogEnum.UNKNOWN;
        this.f47723n = new b();
        this.f47726q = false;
        this.f47729t = false;
        this.f47731v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m206031K2().m182467j(this.f47723n);
        this.f47713d = view;
        this.f47711b = i2;
        m71761S();
    }

    public DialogC12611a(wxs wxsVar, int i, @LayoutRes int i2, int i3) {
        super(wxsVar.act(), i);
        this.f47711b = 17;
        this.f47712c = d8c0.f84853h;
        this.f47715f = LiveDialogEnum.UNKNOWN;
        this.f47723n = new b();
        this.f47726q = false;
        this.f47729t = false;
        this.f47731v = null;
        setOwnerActivity(wxsVar.act());
        wxsVar.m206031K2().m182467j(this.f47723n);
        this.f47714e = i2;
        this.f47711b = i3;
        m71761S();
    }

    public DialogC12611a(Act act, View view) {
        super(act, d8c0.f84856k);
        this.f47711b = 17;
        this.f47712c = d8c0.f84853h;
        this.f47715f = LiveDialogEnum.UNKNOWN;
        this.f47723n = new b();
        this.f47726q = false;
        this.f47729t = false;
        this.f47731v = null;
        setOwnerActivity(act);
        this.f47713d = view;
        m71761S();
    }
}
