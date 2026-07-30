package p149l;

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
public class syb {

    /* JADX INFO: renamed from: g */
    public static final Handler f166922g = new Handler(Looper.getMainLooper(), new C20077a());

    /* JADX INFO: renamed from: a */
    public LinearLayout f166923a;

    /* JADX INFO: renamed from: b */
    public TextView f166924b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f166925c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f166926d;

    /* JADX INFO: renamed from: e */
    public int f166927e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public nsi0.InterfaceC18761b f166928f = new C20078b();

    /* JADX INFO: renamed from: l.syb$a */
    public class C20077a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((syb) message.obj).m186650k();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((syb) message.obj).m186646f();
            return true;
        }
    }

    /* JADX INFO: renamed from: l.syb$b */
    public class C20078b implements nsi0.InterfaceC18761b {
        public C20078b() {
        }

        @Override // p149l.nsi0.InterfaceC18761b
        public void dismiss(int i) {
            Handler handler = syb.f166922g;
            handler.sendMessage(handler.obtainMessage(1, i, 0, syb.this));
        }

        @Override // p149l.nsi0.InterfaceC18761b
        public void show() {
            Handler handler = syb.f166922g;
            handler.sendMessage(handler.obtainMessage(0, syb.this));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static ViewGroup m186643d(View view) {
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
    public static syb m186644g(@NonNull View view, @NonNull CharSequence charSequence, int i, @ColorInt Integer num) {
        if (i > 3500) {
            i = 3500;
        }
        ViewGroup viewGroupM186643d = m186643d(view);
        if (viewGroupM186643d == null) {
            ig3.m135964a("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroupM186643d.getContext()).inflate(b6c0.f73798x, viewGroupM186643d, false);
        syb sybVar = new syb();
        sybVar.f166923a = linearLayout;
        sybVar.f166926d = viewGroupM186643d;
        sybVar.f166924b = (TextView) linearLayout.findViewById(p4c0.f147098V0);
        sybVar.f166925c = (LinearLayout) linearLayout.findViewById(p4c0.f147096U0);
        sybVar.m186648i(charSequence);
        sybVar.m186647h(i);
        if (num != null) {
            Drawable drawableMutate = sybVar.f166925c.getBackground().mutate();
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setColor(num.intValue());
                sybVar.f166925c.setBackground(drawableMutate);
            }
        }
        return sybVar;
    }

    /* JADX INFO: renamed from: e */
    public int m186645e() {
        return this.f166927e;
    }

    /* JADX INFO: renamed from: f */
    public final void m186646f() {
        if (this.f166923a.getVisibility() == 0) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f166923a.getContext(), ozb0.f146413a);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC20079c());
            this.f166923a.startAnimation(animationLoadAnimation);
            nsi0.m160770b().m160775f(this.f166928f);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public syb m186647h(int i) {
        this.f166927e = i;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m186648i(CharSequence charSequence) {
        this.f166924b.setText(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public void m186649j() {
        nsi0.m160770b().m160778i(m186645e(), this.f166928f);
    }

    /* JADX INFO: renamed from: k */
    public final void m186650k() {
        this.f166926d.addView(this.f166923a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f166923a.getLayoutParams();
        layoutParams.gravity = 17;
        this.f166923a.setLayoutParams(layoutParams);
        this.f166923a.setVisibility(0);
        this.f166923a.startAnimation(AnimationUtils.loadAnimation(this.f166923a.getContext(), ozb0.f146414b));
        nsi0.m160770b().m160776g(this.f166928f);
    }

    /* JADX INFO: renamed from: l.syb$c */
    public class AnimationAnimationListenerC20079c implements Animation.AnimationListener {
        public AnimationAnimationListenerC20079c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            syb.this.f166923a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
