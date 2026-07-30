package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gcc0;
import p153l.hnl0;
import p153l.ng4;

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
    public static GhostViewPort m4098a(View view) {
        return (GhostViewPort) view.getTag(gcc0.f103556a);
    }

    /* JADX INFO: renamed from: b */
    public static void m4099b(@NonNull View view, @Nullable GhostViewPort ghostViewPort) {
        view.setTag(gcc0.f103556a, ghostViewPort);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4099b(this.f3183a, this);
        this.f3183a.getViewTreeObserver().addOnPreDrawListener(this.f3185c);
        hnl0.m136154h(this.f3183a, 4);
        if (this.f3183a.getParent() != null) {
            ((View) this.f3183a.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f3183a.getViewTreeObserver().removeOnPreDrawListener(this.f3185c);
        hnl0.m136154h(this.f3183a, 0);
        m4099b(this.f3183a, null);
        if (this.f3183a.getParent() != null) {
            ((View) this.f3183a.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ng4.m162963a(canvas, true);
        canvas.setMatrix(this.f3184b);
        hnl0.m136154h(this.f3183a, 0);
        this.f3183a.invalidate();
        hnl0.m136154h(this.f3183a, 4);
        drawChild(canvas, this.f3183a, getDrawingTime());
        ng4.m162963a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m4098a(this.f3183a) == this) {
            hnl0.m136154h(this.f3183a, i == 0 ? 4 : 0);
        }
    }
}
