package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.a4c0;
import p149l.del0;
import p149l.of4;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewPort extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final View f3183a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Matrix f3184b;

    /* JADX INFO: renamed from: c */
    public final ViewTreeObserver.OnPreDrawListener f3185c;

    /* JADX INFO: renamed from: a */
    public static GhostViewPort m4096a(View view) {
        return (GhostViewPort) view.getTag(a4c0.f67492a);
    }

    /* JADX INFO: renamed from: b */
    public static void m4097b(@NonNull View view, @Nullable GhostViewPort ghostViewPort) {
        view.setTag(a4c0.f67492a, ghostViewPort);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4097b(this.f3183a, this);
        this.f3183a.getViewTreeObserver().addOnPreDrawListener(this.f3185c);
        del0.m111275h(this.f3183a, 4);
        if (this.f3183a.getParent() != null) {
            ((View) this.f3183a.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f3183a.getViewTreeObserver().removeOnPreDrawListener(this.f3185c);
        del0.m111275h(this.f3183a, 0);
        m4097b(this.f3183a, null);
        if (this.f3183a.getParent() != null) {
            ((View) this.f3183a.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        of4.m164056a(canvas, true);
        canvas.setMatrix(this.f3184b);
        del0.m111275h(this.f3183a, 0);
        this.f3183a.invalidate();
        del0.m111275h(this.f3183a, 4);
        drawChild(canvas, this.f3183a, getDrawingTime());
        of4.m164056a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m4096a(this.f3183a) == this) {
            del0.m111275h(this.f3183a, i == 0 ? 4 : 0);
        }
    }
}
