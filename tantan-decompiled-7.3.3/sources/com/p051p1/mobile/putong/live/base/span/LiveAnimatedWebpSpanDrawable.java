package com.p051p1.mobile.putong.live.base.span;

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
import p153l.db5;
import p153l.fb5;
import p153l.ker;
import p153l.pml0;
import p153l.ruf0;
import p153l.wp0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAnimatedWebpSpanDrawable extends ruf0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public wp0 f45403a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public fb5<db5> f45404b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public TextView f45406d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ker f45407e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public DefaultLifecycleObserver f45408f;

    /* JADX INFO: renamed from: c */
    public boolean f45405c = true;

    /* JADX INFO: renamed from: g */
    public final Runnable f45409g = new Runnable() { // from class: l.gvr
        @Override // java.lang.Runnable
        public final void run() {
            this.f106675a.m69788i();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable$a */
    public class C12626a implements Drawable.Callback {
        public C12626a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f45406d;
            if (textView != null) {
                textView.postInvalidateOnAnimation();
                textView.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, Runnable runnable, long j) {
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f45406d;
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
            TextView textView = LiveAnimatedWebpSpanDrawable.this.f45406d;
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

    public LiveAnimatedWebpSpanDrawable(@NonNull wp0 wp0Var, @NonNull fb5<db5> fb5Var) {
        this.f45403a = wp0Var;
        this.f45404b = fb5Var;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m69783j(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.US).contains(".webp");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            wp0Var.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m69784e(@NonNull TextView textView) {
        if (this.f45403a == null) {
            return;
        }
        this.f45406d = textView;
        textView.removeCallbacks(this.f45409g);
        if (textView.isAttachedToWindow()) {
            m69792n(textView);
        } else {
            textView.post(this.f45409g);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m69785f() {
        m69794p();
        TextView textView = this.f45406d;
        if (textView != null) {
            textView.removeCallbacks(this.f45409g);
        }
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            m69793o();
            wp0Var.mo134586a();
        }
        fb5.m124874v(this.f45404b);
        this.f45404b = null;
        this.f45403a = null;
        this.f45406d = null;
        this.f45405c = true;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final ker m69786g(@Nullable Context context) {
        for (Object baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ker) {
                return (ker) baseContext;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            return wp0Var.getOpacity();
        }
        return -2;
    }

    @Override // p153l.a6m
    public float getRatio() {
        return 4.928571f;
    }

    /* JADX INFO: renamed from: h */
    public final void m69787h() {
        wp0 wp0Var = this.f45403a;
        if (wp0Var == null) {
            return;
        }
        wp0Var.setCallback(new C12626a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m69788i() {
        TextView textView = this.f45406d;
        if (textView == null) {
            return;
        }
        m69792n(textView);
    }

    /* JADX INFO: renamed from: k */
    public final void m69789k(@NonNull TextView textView) {
        m69794p();
        ker kerVarM69790l = m69790l(textView);
        if (kerVarM69790l == null) {
            return;
        }
        this.f45407e = kerVarM69790l;
        this.f45408f = new DefaultLifecycleObserver() { // from class: com.p1.mobile.putong.live.base.span.LiveAnimatedWebpSpanDrawable.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NonNull ker kerVar) {
                LiveAnimatedWebpSpanDrawable.this.m69791m();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(@NonNull ker kerVar) {
                wp0 wp0Var = LiveAnimatedWebpSpanDrawable.this.f45403a;
                if (wp0Var != null) {
                    wp0Var.stop();
                }
            }
        };
        kerVarM69790l.getLifecycle().mo2967a(this.f45408f);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ker m69790l(@NonNull TextView textView) {
        ker kerVarM172954a = pml0.m172954a(textView);
        return kerVarM172954a != null ? kerVarM172954a : m69786g(textView.getContext());
    }

    /* JADX INFO: renamed from: m */
    public void m69791m() {
        wp0 wp0Var;
        TextView textView = this.f45406d;
        if (this.f45405c || textView == null || (wp0Var = this.f45403a) == null || wp0Var.isRunning()) {
            return;
        }
        m69792n(textView);
    }

    /* JADX INFO: renamed from: n */
    public final void m69792n(@NonNull TextView textView) {
        wp0 wp0Var = this.f45403a;
        if (wp0Var == null) {
            return;
        }
        wp0Var.stop();
        m69787h();
        wp0Var.setVisible(true, true);
        wp0Var.start();
        wp0Var.invalidateSelf();
        textView.postInvalidateOnAnimation();
        textView.invalidate();
        m69789k(textView);
        this.f45405c = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m69793o() {
        wp0 wp0Var = this.f45403a;
        if (wp0Var == null) {
            return;
        }
        wp0Var.stop();
        wp0Var.setCallback(null);
        wp0Var.setVisible(false, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m69794p() {
        ker kerVar = this.f45407e;
        if (kerVar != null && this.f45408f != null) {
            kerVar.getLifecycle().mo2970d(this.f45408f);
        }
        this.f45407e = null;
        this.f45408f = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            wp0Var.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            wp0Var.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        wp0 wp0Var = this.f45403a;
        if (wp0Var != null) {
            wp0Var.setColorFilter(colorFilter);
        }
    }
}
