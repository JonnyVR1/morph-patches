package com.p046p1.mobile.putong.live.base.span;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Locale;
import p149l.aq0;
import p149l.da5;
import p149l.fa5;
import p149l.imf0;
import p149l.jcr;
import p149l.ldl0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAnimatedWebpSpanDrawable extends imf0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public aq0 f44555a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public fa5<da5> f44556b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public TextView f44558d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public jcr f44559e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public DefaultLifecycleObserver f44560f;

    /* JADX INFO: renamed from: c */
    public boolean f44557c = true;

    /* JADX INFO: renamed from: g */
    public final Runnable f44561g = new Runnable() { // from class: l.ftr
        @Override // java.lang.Runnable
        public final void run() {
            this.f99255a.m68605i();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable$a */
    public class C12463a implements Drawable.Callback {
        public C12463a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f44558d;
            if (textView != null) {
                textView.postInvalidateOnAnimation();
                textView.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, Runnable runnable, long j) {
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f44558d;
            if (textView == null) {
                return;
            }
            Handler handler = textView.getHandler();
            if (handler != null) {
                handler.postAtTime(runnable, j);
            } else {
                textView.postDelayed(runnable, Math.max(0L, j - SystemClock.uptimeMillis()));
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, Runnable runnable) {
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f44558d;
            if (textView == null) {
                return;
            }
            Handler handler = textView.getHandler();
            if (handler != null) {
                handler.removeCallbacks(runnable);
            } else {
                textView.removeCallbacks(runnable);
            }
        }
    }

    public LiveAnimatedWebpSpanDrawable(@NonNull aq0 aq0Var, @NonNull fa5<da5> fa5Var) {
        this.f44555a = aq0Var;
        this.f44556b = fa5Var;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m68600j(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.US).contains(".webp");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            aq0Var.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m68601e(@NonNull TextView textView) {
        if (this.f44555a == null) {
            return;
        }
        this.f44558d = textView;
        textView.removeCallbacks(this.f44561g);
        if (textView.isAttachedToWindow()) {
            m68609n(textView);
        } else {
            textView.post(this.f44561g);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m68602f() {
        m68611p();
        TextView textView = this.f44558d;
        if (textView != null) {
            textView.removeCallbacks(this.f44561g);
        }
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            m68610o();
            aq0Var.mo98207a();
        }
        fa5.m120154v(this.f44556b);
        this.f44556b = null;
        this.f44555a = null;
        this.f44558d = null;
        this.f44557c = true;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final jcr m68603g(@Nullable Context context) {
        for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof jcr) {
                return (jcr) baseContext;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            return aq0Var.getOpacity();
        }
        return -2;
    }

    @Override // p149l.j3m
    public float getRatio() {
        return 4.928571f;
    }

    /* JADX INFO: renamed from: h */
    public final void m68604h() {
        aq0 aq0Var = this.f44555a;
        if (aq0Var == null) {
            return;
        }
        aq0Var.setCallback(new C12463a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m68605i() {
        TextView textView = this.f44558d;
        if (textView == null) {
            return;
        }
        m68609n(textView);
    }

    /* JADX INFO: renamed from: k */
    public final void m68606k(@NonNull TextView textView) {
        m68611p();
        jcr jcrVarM68607l = m68607l(textView);
        if (jcrVarM68607l == null) {
            return;
        }
        this.f44559e = jcrVarM68607l;
        this.f44560f = new DefaultLifecycleObserver() { // from class: com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NonNull jcr jcrVar) {
                LiveAnimatedWebpSpanDrawable.this.m68608m();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(@NonNull jcr jcrVar) {
                aq0 aq0Var = LiveAnimatedWebpSpanDrawable.this.f44555a;
                if (aq0Var != null) {
                    aq0Var.stop();
                }
            }
        };
        jcrVarM68607l.getLifecycle().mo2966a(this.f44560f);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final jcr m68607l(@NonNull TextView textView) {
        jcr jcrVarM149446a = ldl0.m149446a(textView);
        return jcrVarM149446a != null ? jcrVarM149446a : m68603g(textView.getContext());
    }

    /* JADX INFO: renamed from: m */
    public void m68608m() {
        aq0 aq0Var;
        TextView textView = this.f44558d;
        if (this.f44557c || textView == null || (aq0Var = this.f44555a) == null || aq0Var.isRunning()) {
            return;
        }
        m68609n(textView);
    }

    /* JADX INFO: renamed from: n */
    public final void m68609n(@NonNull TextView textView) {
        aq0 aq0Var = this.f44555a;
        if (aq0Var == null) {
            return;
        }
        aq0Var.stop();
        m68604h();
        aq0Var.setVisible(true, true);
        aq0Var.start();
        aq0Var.invalidateSelf();
        textView.postInvalidateOnAnimation();
        textView.invalidate();
        m68606k(textView);
        this.f44557c = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m68610o() {
        aq0 aq0Var = this.f44555a;
        if (aq0Var == null) {
            return;
        }
        aq0Var.stop();
        aq0Var.setCallback(null);
        aq0Var.setVisible(false, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m68611p() {
        jcr jcrVar = this.f44559e;
        if (jcrVar != null && this.f44560f != null) {
            jcrVar.getLifecycle().mo2969d(this.f44560f);
        }
        this.f44559e = null;
        this.f44560f = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            aq0Var.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            aq0Var.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        aq0 aq0Var = this.f44555a;
        if (aq0Var != null) {
            aq0Var.setColorFilter(colorFilter);
        }
    }
}
