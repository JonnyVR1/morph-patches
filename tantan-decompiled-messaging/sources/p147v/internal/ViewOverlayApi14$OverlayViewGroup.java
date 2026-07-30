package p147v.internal;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor", "PrivateApi"})
class ViewOverlayApi14$OverlayViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public static Method f209750d;

    /* JADX INFO: renamed from: a */
    public ViewGroup f209751a;

    /* JADX INFO: renamed from: b */
    public View f209752b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Drawable> f209753c;

    static {
        try {
            Class cls = Integer.TYPE;
            f209750d = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m223574a(int[] iArr) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        this.f209751a.getLocationOnScreen(iArr2);
        this.f209752b.getLocationOnScreen(iArr3);
        iArr[0] = iArr3[0] - iArr2[0];
        iArr[1] = iArr3[1] - iArr2[1];
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f209751a.getLocationOnScreen(iArr);
        this.f209752b.getLocationOnScreen(iArr2);
        canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        canvas.clipRect(new Rect(0, 0, this.f209752b.getWidth(), this.f209752b.getHeight()));
        super.dispatchDraw(canvas);
        ArrayList<Drawable> arrayList = this.f209753c;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f209753c.get(i).draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.f209751a == null) {
            return null;
        }
        rect.offset(iArr[0], iArr[1]);
        if (this.f209751a == null) {
            invalidate(rect);
            return null;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        int[] iArr2 = new int[2];
        m223574a(iArr2);
        rect.offset(iArr2[0], iArr2[1]);
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        ArrayList<Drawable> arrayList = this.f209753c;
        return arrayList != null && arrayList.contains(drawable);
    }
}
