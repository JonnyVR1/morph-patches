package com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter;

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
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import p153l.dgq0;
import p153l.gt0;
import p153l.il50;
import p153l.jgc0;
import p153l.jwl;
import p153l.kkl0;
import p153l.l51;
import p153l.rq2;
import p153l.x20;
import p153l.xzs;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a */
/* JADX INFO: loaded from: classes4.dex */
public class DialogC12774a extends DialogInterfaceC0075a {

    /* JADX INFO: renamed from: b */
    public int f48559b;

    /* JADX INFO: renamed from: c */
    public int f48560c;

    /* JADX INFO: renamed from: d */
    public View f48561d;

    /* JADX INFO: renamed from: e */
    @LayoutRes
    public int f48562e;

    /* JADX INFO: renamed from: f */
    public LiveDialogEnum f48563f;

    /* JADX INFO: renamed from: g */
    public DialogInterface.OnShowListener f48564g;

    /* JADX INFO: renamed from: h */
    public DialogInterface.OnDismissListener f48565h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnShowListener f48566i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnDismissListener f48567j;

    /* JADX INFO: renamed from: k */
    public y20<jwl> f48568k;

    /* JADX INFO: renamed from: l */
    public y20<jwl> f48569l;

    /* JADX INFO: renamed from: m */
    public y20<View> f48570m;

    /* JADX INFO: renamed from: n */
    public b f48571n;

    /* JADX INFO: renamed from: o */
    public rq2 f48572o;

    /* JADX INFO: renamed from: p */
    public View f48573p;

    /* JADX INFO: renamed from: q */
    public boolean f48574q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f48575r;

    /* JADX INFO: renamed from: s */
    public ValueAnimator f48576s;

    /* JADX INFO: renamed from: t */
    public boolean f48577t;

    /* JADX INFO: renamed from: u */
    public x20 f48578u;

    /* JADX INFO: renamed from: v */
    public y20<View> f48579v;

    /* JADX INFO: renamed from: w */
    public c f48580w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$a */
    public static class a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogC12774a> f48581a;

        public a(DialogC12774a dialogC12774a) {
            this.f48581a = new WeakReference<>(dialogC12774a);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DialogC12774a dialogC12774a = this.f48581a.get();
            if (dialogC12774a == null) {
                return;
            }
            if (dialogC12774a.f48567j != null) {
                dialogC12774a.f48567j.onDismiss(dialogInterface);
            }
            if (dialogC12774a.f48565h != null) {
                dialogC12774a.f48565h.onDismiss(dialogInterface);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            DialogC12774a dialogC12774a = this.f48581a.get();
            if (dialogC12774a == null) {
                return;
            }
            if (dialogC12774a.f48566i != null) {
                dialogC12774a.f48566i.onShow(dialogInterface);
            }
            if (dialogC12774a.f48564g != null) {
                dialogC12774a.f48564g.onShow(dialogInterface);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$b */
    public class b implements jwl {
        public b() {
        }

        @Override // p153l.jwl
        /* JADX INFO: renamed from: a */
        public void mo72964a(DialogInterface.OnDismissListener onDismissListener) {
            if (DialogC12774a.this.f48567j != null) {
                return;
            }
            DialogC12774a.this.f48567j = onDismissListener;
        }

        @Override // p153l.jwl
        /* JADX INFO: renamed from: b */
        public int mo72965b() {
            return DialogC12774a.this.f48559b;
        }

        @Override // p153l.jwl
        /* JADX INFO: renamed from: c */
        public void mo72966c(DialogInterface.OnShowListener onShowListener) {
            if (DialogC12774a.this.f48566i != null) {
                return;
            }
            DialogC12774a.this.f48566i = onShowListener;
        }

        @Override // p153l.jwl
        public void dismiss() {
            DialogC12774a.this.dismiss();
        }

        @Override // p153l.jwl
        public LiveDialogEnum getType() {
            return DialogC12774a.this.f48563f;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a$c */
    public interface c {
        /* JADX INFO: renamed from: o */
        void mo72967o();
    }

    public DialogC12774a(xzs xzsVar, @LayoutRes int i, rq2 rq2Var) {
        super(xzsVar.act(), rq2Var.m182591d());
        this.f48559b = 17;
        this.f48560c = jgc0.f120701h;
        this.f48563f = LiveDialogEnum.UNKNOWN;
        this.f48571n = new b();
        this.f48574q = false;
        this.f48577t = false;
        this.f48579v = null;
        setOwnerActivity(xzsVar.act());
        xzsVar.m213814K2().m189703j(this.f48571n);
        this.f48572o = rq2Var;
        this.f48562e = i;
        this.f48559b = rq2Var.mo148407f();
        m72944S();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m72921C(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m72922D(View view) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ dgq0 m72939z(View view, View view2, dgq0 dgq0Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d);
        return dgq0Var;
    }

    /* JADX INFO: renamed from: O */
    public final void m72940O() {
        m72962k0(null);
    }

    /* JADX INFO: renamed from: P */
    public final void m72941P(x20 x20Var) {
        m72962k0(x20Var);
    }

    /* JADX INFO: renamed from: Q */
    public final void m72942Q(View view) {
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
    public View m72943R() {
        return this.f48561d;
    }

    /* JADX INFO: renamed from: S */
    public final void m72944S() {
        a aVar = new a(this);
        super.setOnShowListener(aVar);
        super.setOnDismissListener(aVar);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m72945T() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m72946U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        c cVar = this.f48580w;
        if (cVar == null) {
            return true;
        }
        cVar.mo72967o();
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m72947V() {
        this.f48574q = true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m72948W() {
        this.f48574q = false;
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing() && !getOwnerActivity().isDestroyed()) {
            dismiss();
        }
        x20 x20Var = this.f48578u;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m72949X(ValueAnimator valueAnimator) {
        if (this.f48572o.m182590a() <= 0.0f || !this.f48577t) {
            return;
        }
        this.f48561d.setBackgroundColor(Color.argb((int) (this.f48572o.m182590a() * 255.0f * (1.0f - valueAnimator.getAnimatedFraction())), 0, 0, 0));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m72950Y() {
        this.f48561d.setBackgroundColor(0);
        this.f48574q = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m72951Z(View view) {
        if (this.f48572o.m182593g()) {
            m72962k0(null);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m72952a0() {
        this.f48574q = false;
        y20<View> y20Var = this.f48579v;
        if (y20Var != null) {
            y20Var.call(this.f48573p);
        }
        this.f48561d.setOnClickListener(new View.OnClickListener() { // from class: l.u4t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177486a.m72951Z(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m72953b0(ValueAnimator valueAnimator) {
        if (this.f48572o.m182590a() > 0.0f) {
            this.f48561d.setBackgroundColor(Color.argb((int) (this.f48572o.m182590a() * 255.0f * valueAnimator.getAnimatedFraction()), 0, 0, 0));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m72954c0(int i) {
        this.f48560c = i;
    }

    /* JADX INFO: renamed from: d0 */
    public void m72955d0(boolean z) {
        if (z) {
            setOnKeyListener(null);
        } else {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.v4t
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return DialogC12774a.m72921C(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        y20<jwl> y20Var = this.f48569l;
        if (y20Var != null) {
            y20Var.call(this.f48571n);
        }
        ValueAnimator valueAnimator = this.f48575r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f48576s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    public void m72956e0(int i) {
        this.f48559b = i;
    }

    /* JADX INFO: renamed from: f0 */
    public void m72957f0(c cVar) {
        this.f48580w = cVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m72958g0(y20<View> y20Var) {
        this.f48579v = y20Var;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72959h0(y20<View> y20Var) {
        this.f48570m = y20Var;
    }

    /* JADX INFO: renamed from: i0 */
    public void m72960i0(boolean z) {
        this.f48577t = z;
    }

    /* JADX INFO: renamed from: j0 */
    public void m72961j0(LiveDialogEnum liveDialogEnum) {
        this.f48563f = liveDialogEnum;
    }

    /* JADX INFO: renamed from: k0 */
    public void m72962k0(x20 x20Var) {
        this.f48578u = x20Var;
        if (this.f48574q || !isShowing()) {
            return;
        }
        if (this.f48576s == null) {
            ValueAnimator valueAnimatorMo148405b = this.f48572o.mo148405b(this.f48573p);
            this.f48576s = valueAnimatorMo148405b;
            gt0.m132177w(valueAnimatorMo148405b, new Runnable() { // from class: l.z4t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202976a.m72947V();
                }
            }, new Runnable() { // from class: l.a5t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68642a.m72948W();
                }
            });
            this.f48576s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b5t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f75093a.m72949X(valueAnimator);
                }
            });
        }
        this.f48576s.start();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m72963l0() {
        if (this.f48574q) {
            return;
        }
        if (this.f48575r == null) {
            ValueAnimator valueAnimatorMo148406c = this.f48572o.mo148406c(this.f48573p);
            this.f48575r = valueAnimatorMo148406c;
            gt0.m132177w(valueAnimatorMo148406c, new Runnable() { // from class: l.c5t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79897a.m72950Y();
                }
            }, new Runnable() { // from class: l.d5t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85189a.m72952a0();
                }
            });
            this.f48575r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e5t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f92237a.m72953b0(valueAnimator);
                }
            });
        }
        this.f48575r.start();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        c cVar = this.f48580w;
        if (cVar != null) {
            cVar.mo72967o();
        }
        l51.m152888H(getContext(), new Runnable() { // from class: l.t4t
            @Override // java.lang.Runnable
            public final void run() {
                this.f172101a.m72945T();
            }
        }, 50L);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    @SuppressLint({"ResourceAsColor"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f48561d == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            if (Build.VERSION.SDK_INT > 34 && getOwnerActivity() != null && (getOwnerActivity() instanceof PutongAct)) {
                layoutInflaterFrom = getOwnerActivity().getLayoutInflater();
            }
            if (this.f48572o != null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(yec0.f199251t0, (ViewGroup) null);
                this.f48561d = viewInflate;
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) viewInflate).getChildAt(0);
                viewGroup.removeAllViews();
                ((FrameLayout.LayoutParams) viewGroup.getLayoutParams()).gravity = this.f48559b;
                View viewInflate2 = layoutInflaterFrom.inflate(this.f48562e, (ViewGroup) this.f48561d, false);
                this.f48573p = viewInflate2;
                viewGroup.addView(viewInflate2);
                if (this.f48572o.m182594h()) {
                    setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.w4t
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            return this.f187434a.m72946U(dialogInterface, i, keyEvent);
                        }
                    });
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.x4t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DialogC12774a.m72922D(view);
                    }
                });
            } else {
                this.f48561d = layoutInflaterFrom.inflate(this.f48562e, (ViewGroup) null);
            }
        }
        y20<View> y20Var = this.f48570m;
        if (y20Var != null) {
            y20Var.call(this.f48572o != null ? this.f48573p : this.f48561d);
        }
        m72942Q(this.f48561d);
        if (Build.VERSION.SDK_INT > 34) {
            final View viewFindViewById = findViewById(R.id.content);
            kkl0.m150194y0(this.f48561d, new il50() { // from class: l.y4t
                @Override // p153l.il50
                public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                    return DialogC12774a.m72939z(viewFindViewById, view, dgq0Var);
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
        window.setWindowAnimations(this.f48572o == null ? this.f48560c : 0);
        rq2 rq2Var = this.f48572o;
        if (rq2Var != null && rq2Var.m182592e() != null) {
            this.f48572o.m182592e().call(window);
        }
        setContentView(this.f48561d);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f48565h = onDismissListener;
    }

    @Override // android.app.Dialog
    public void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.f48564g = onShowListener;
    }

    @Override // android.app.Dialog
    public void show() {
        y20<jwl> y20Var = this.f48568k;
        if (y20Var != null) {
            y20Var.call(this.f48571n);
        }
        super.show();
        if (this.f48572o != null) {
            m72963l0();
        }
    }

    public DialogC12774a(xzs xzsVar, View view, int i) {
        this(xzsVar, jgc0.f120704k, view, i);
    }

    public DialogC12774a(xzs xzsVar, int i, View view, int i2) {
        super(xzsVar.act(), i);
        this.f48559b = 17;
        this.f48560c = jgc0.f120701h;
        this.f48563f = LiveDialogEnum.UNKNOWN;
        this.f48571n = new b();
        this.f48574q = false;
        this.f48577t = false;
        this.f48579v = null;
        setOwnerActivity(xzsVar.act());
        xzsVar.m213814K2().m189703j(this.f48571n);
        this.f48561d = view;
        this.f48559b = i2;
        m72944S();
    }

    public DialogC12774a(xzs xzsVar, int i, @LayoutRes int i2, int i3) {
        super(xzsVar.act(), i);
        this.f48559b = 17;
        this.f48560c = jgc0.f120701h;
        this.f48563f = LiveDialogEnum.UNKNOWN;
        this.f48571n = new b();
        this.f48574q = false;
        this.f48577t = false;
        this.f48579v = null;
        setOwnerActivity(xzsVar.act());
        xzsVar.m213814K2().m189703j(this.f48571n);
        this.f48562e = i2;
        this.f48559b = i3;
        m72944S();
    }

    public DialogC12774a(Act act, View view) {
        super(act, jgc0.f120704k);
        this.f48559b = 17;
        this.f48560c = jgc0.f120701h;
        this.f48563f = LiveDialogEnum.UNKNOWN;
        this.f48571n = new b();
        this.f48574q = false;
        this.f48577t = false;
        this.f48579v = null;
        setOwnerActivity(act);
        this.f48561d = view;
        m72944S();
    }
}
