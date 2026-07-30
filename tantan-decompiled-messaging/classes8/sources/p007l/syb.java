package p007l;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class syb {

    /* JADX INFO: renamed from: g */
    public static final Handler f4193g = new Handler(Looper.getMainLooper(), new C0702a());

    /* JADX INFO: renamed from: a */
    public LinearLayout f4194a;

    /* JADX INFO: renamed from: b */
    public TextView f4195b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4196c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f4197d;

    /* JADX INFO: renamed from: e */
    public int f4198e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public nsi0.InterfaceC0627b f4199f = new C0703b();

    /* JADX INFO: renamed from: l.syb$a */
    public class C0702a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((syb) message.obj).m10758k();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((syb) message.obj).m10754f();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.syb$b */
    public class C0703b implements nsi0.InterfaceC0627b {
        public C0703b() {
        }

        @Override // p007l.nsi0.InterfaceC0627b
        public void dismiss(int i) {
            Handler handler = syb.f4193g;
            handler.sendMessage(handler.obtainMessage(1, i, 0, syb.this));
        }

        @Override // p007l.nsi0.InterfaceC0627b
        public void show() {
            Handler handler = syb.f4193g;
            handler.sendMessage(handler.obtainMessage(0, syb.this));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ViewGroup m10751d(View view) {
        ViewGroup viewGroup = null;
        do {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        } while (view != null);
        return viewGroup;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static syb m10752g(@NonNull View view, @NonNull CharSequence charSequence, int i, @ColorInt Integer num) {
        if (i > 3500) {
            i = 3500;
        }
        ViewGroup viewGroupM10751d = m10751d(view);
        if (viewGroupM10751d == null) {
            ig3.a("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroupM10751d.getContext()).inflate(b6c0.f1938x, viewGroupM10751d, false);
        syb sybVar = new syb();
        sybVar.f4194a = linearLayout;
        sybVar.f4197d = viewGroupM10751d;
        sybVar.f4195b = (TextView) linearLayout.findViewById(p4c0.f3646V0);
        sybVar.f4196c = (LinearLayout) linearLayout.findViewById(p4c0.f3644U0);
        sybVar.m10756i(charSequence);
        sybVar.m10755h(i);
        if (num != null) {
            Drawable drawableMutate = sybVar.f4196c.getBackground().mutate();
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setColor(num.intValue());
                sybVar.f4196c.setBackground(drawableMutate);
            }
        }
        return sybVar;
    }

    /* JADX INFO: renamed from: e */
    public int m10753e() {
        return this.f4198e;
    }

    /* JADX INFO: renamed from: f */
    public final void m10754f() {
        if (this.f4194a.getVisibility() == 0) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f4194a.getContext(), ozb0.f3583a);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0704c());
            this.f4194a.startAnimation(animationLoadAnimation);
            nsi0.m10080b().m10085f(this.f4199f);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public syb m10755h(int i) {
        this.f4198e = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m10756i(CharSequence charSequence) {
        this.f4195b.setText(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public void m10757j() {
        nsi0.m10080b().m10088i(m10753e(), this.f4199f);
    }

    /* JADX INFO: renamed from: k */
    public final void m10758k() {
        this.f4197d.addView(this.f4194a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4194a.getLayoutParams();
        layoutParams.gravity = 17;
        this.f4194a.setLayoutParams(layoutParams);
        this.f4194a.setVisibility(0);
        this.f4194a.startAnimation(AnimationUtils.loadAnimation(this.f4194a.getContext(), ozb0.f3584b));
        nsi0.m10080b().m10086g(this.f4199f);
    }

    /* JADX INFO: renamed from: l.syb$c */
    public class AnimationAnimationListenerC0704c implements Animation.AnimationListener {
        public AnimationAnimationListenerC0704c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            syb.this.f4194a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
