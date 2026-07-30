package p153l;

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

/* JADX INFO: loaded from: classes8.dex */
public class g0c {

    /* JADX INFO: renamed from: g */
    public static final Handler f101629g = new Handler(Looper.getMainLooper(), new C17108a());

    /* JADX INFO: renamed from: a */
    public LinearLayout f101630a;

    /* JADX INFO: renamed from: b */
    public TextView f101631b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f101632c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f101633d;

    /* JADX INFO: renamed from: e */
    public int f101634e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public q1j0.InterfaceC19490b f101635f = new C17109b();

    /* JADX INFO: renamed from: l.g0c$a */
    public class C17108a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((g0c) message.obj).m128416k();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((g0c) message.obj).m128412f();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.g0c$b */
    public class C17109b implements q1j0.InterfaceC19490b {
        public C17109b() {
        }

        @Override // p153l.q1j0.InterfaceC19490b
        public void dismiss(int i) {
            Handler handler = g0c.f101629g;
            handler.sendMessage(handler.obtainMessage(1, i, 0, g0c.this));
        }

        @Override // p153l.q1j0.InterfaceC19490b
        public void show() {
            Handler handler = g0c.f101629g;
            handler.sendMessage(handler.obtainMessage(0, g0c.this));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ViewGroup m128409d(View view) {
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
    public static g0c m128410g(@NonNull View view, @NonNull CharSequence charSequence, int i, @ColorInt Integer num) {
        if (i > 3500) {
            i = 3500;
        }
        ViewGroup viewGroupM128409d = m128409d(view);
        if (viewGroupM128409d == null) {
            wg3.m206174a("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroupM128409d.getContext()).inflate(gec0.f103811x, viewGroupM128409d, false);
        g0c g0cVar = new g0c();
        g0cVar.f101630a = linearLayout;
        g0cVar.f101633d = viewGroupM128409d;
        g0cVar.f101631b = (TextView) linearLayout.findViewById(vcc0.f183398V0);
        g0cVar.f101632c = (LinearLayout) linearLayout.findViewById(vcc0.f183396U0);
        g0cVar.m128414i(charSequence);
        g0cVar.m128413h(i);
        if (num != null) {
            Drawable drawableMutate = g0cVar.f101632c.getBackground().mutate();
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setColor(num.intValue());
                g0cVar.f101632c.setBackground(drawableMutate);
            }
        }
        return g0cVar;
    }

    /* JADX INFO: renamed from: e */
    public int m128411e() {
        return this.f101634e;
    }

    /* JADX INFO: renamed from: f */
    public final void m128412f() {
        if (this.f101630a.getVisibility() == 0) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f101630a.getContext(), u7c0.f177895a);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC17110c());
            this.f101630a.startAnimation(animationLoadAnimation);
            q1j0.m174892b().m174897f(this.f101635f);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public g0c m128413h(int i) {
        this.f101634e = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m128414i(CharSequence charSequence) {
        this.f101631b.setText(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public void m128415j() {
        q1j0.m174892b().m174900i(m128411e(), this.f101635f);
    }

    /* JADX INFO: renamed from: k */
    public final void m128416k() {
        this.f101633d.addView(this.f101630a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f101630a.getLayoutParams();
        layoutParams.gravity = 17;
        this.f101630a.setLayoutParams(layoutParams);
        this.f101630a.setVisibility(0);
        this.f101630a.startAnimation(AnimationUtils.loadAnimation(this.f101630a.getContext(), u7c0.f177896b));
        q1j0.m174892b().m174898g(this.f101635f);
    }

    /* JADX INFO: renamed from: l.g0c$c */
    public class AnimationAnimationListenerC17110c implements Animation.AnimationListener {
        public AnimationAnimationListenerC17110c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            g0c.this.f101630a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
