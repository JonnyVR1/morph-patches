package com.clevertap.android.sdk.inapp.pipsdk.internal.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPControlsOverlay;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPControlsOverlay;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "autoHide", "", "f", "(Z)V", Constants.INAPP_DATA_TAG, "()V", "e", "c", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mainHandler", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "hideRunnable", "Z", "controlsVisible", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class PIPControlsOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Handler mainHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Runnable hideRunnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean controlsVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIPControlsOverlay(@NotNull Context context) {
        super(context);
        context.getClass();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.hideRunnable = new Runnable() { // from class: l.u160
            @Override // java.lang.Runnable
            public final void run() {
                PIPControlsOverlay.m6577b(this.f172973a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m6576a(PIPControlsOverlay pIPControlsOverlay) {
        pIPControlsOverlay.getClass();
        pIPControlsOverlay.controlsVisible = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m6577b(PIPControlsOverlay pIPControlsOverlay) {
        pIPControlsOverlay.getClass();
        pIPControlsOverlay.m6580d();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6578g(PIPControlsOverlay pIPControlsOverlay, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        pIPControlsOverlay.m6582f(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m6579c() {
        this.mainHandler.removeCallbacks(this.hideRunnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m6580d() {
        this.mainHandler.removeCallbacks(this.hideRunnable);
        animate().cancel();
        animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: l.v160
            @Override // java.lang.Runnable
            public final void run() {
                PIPControlsOverlay.m6576a(this.f179199a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: e */
    public final void m6581e() {
        this.mainHandler.removeCallbacks(this.hideRunnable);
        this.mainHandler.postDelayed(this.hideRunnable, 3000L);
    }

    /* JADX INFO: renamed from: f */
    public final void m6582f(boolean autoHide) {
        this.mainHandler.removeCallbacks(this.hideRunnable);
        animate().cancel();
        this.controlsVisible = true;
        animate().alpha(1.0f).setDuration(200L).start();
        if (autoHide) {
            this.mainHandler.postDelayed(this.hideRunnable, 3000L);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        return !this.controlsVisible;
    }
}
