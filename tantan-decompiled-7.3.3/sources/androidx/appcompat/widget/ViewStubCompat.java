package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import p153l.gic0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a */
    public int f745a;

    /* JADX INFO: renamed from: b */
    public int f746b;

    /* JADX INFO: renamed from: c */
    public WeakReference<View> f747c;

    /* JADX INFO: renamed from: d */
    public LayoutInflater f748d;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0162a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f745a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gic0.f104308R3, i, 0);
        this.f746b = typedArrayObtainStyledAttributes.getResourceId(gic0.f104323U3, -1);
        this.f745a = typedArrayObtainStyledAttributes.getResourceId(gic0.f104318T3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(gic0.f104313S3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public View m610a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            wtq0.m207906a("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f745a == 0) {
            wg3.m206174a("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f748d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f745a, viewGroup, false);
        int i = this.f746b;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f747c = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f746b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f748d;
    }

    public int getLayoutResource() {
        return this.f745a;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f746b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f748d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f745a = i;
    }

    public void setOnInflateListener(InterfaceC0162a interfaceC0162a) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f747c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                wtq0.m207906a("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m610a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
