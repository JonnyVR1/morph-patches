package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import org.seamless.xhtml.XHTML;
import p153l.cic0;
import p153l.wmw;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ArrayList<View> f1877a;

    /* JADX INFO: renamed from: b */
    public ArrayList<View> f1878b;

    /* JADX INFO: renamed from: c */
    public boolean f1879c;

    public FragmentContainerView(@NonNull Context context, @NonNull AttributeSet attributeSet, @NonNull FragmentManager fragmentManager) {
        super(context, attributeSet);
        this.f1879c = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cic0.f81926e);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(cic0.f81927f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(cic0.f81928g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM2555h0 = fragmentManager.m2555h0(id);
        if (classAttribute != null && fragmentM2555h0 == null) {
            if (id <= 0) {
                wmw.m207134a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : "");
                throw null;
            }
            Fragment fragmentInstantiate = fragmentManager.m2584r0().instantiate(context.getClassLoader(), classAttribute);
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m2568m().m2816x(true).m2806d(this, fragmentInstantiate, string).mo2711l();
        }
        fragmentManager.m2528V0(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2479a(@NonNull View view) {
        ArrayList<View> arrayList = this.f1878b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1877a == null) {
            this.f1877a = new ArrayList<>();
        }
        this.f1877a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m2480A0(view) != null) {
            super.addView(view, i, layoutParams);
        } else {
            wmw.m207134a("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m2480A0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        wmw.m207134a("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f1879c && this.f1877a != null) {
            for (int i = 0; i < this.f1877a.size(); i++) {
                super.drawChild(canvas, this.f1877a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, @NonNull View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f1879c || (arrayList = this.f1877a) == null || arrayList.size() <= 0 || !this.f1877a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NonNull View view) {
        ArrayList<View> arrayList = this.f1878b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1877a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1879c = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @NonNull
    @RequiresApi(20)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2479a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(@NonNull View view, boolean z) {
        if (z) {
            m2479a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        m2479a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m2479a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NonNull View view) {
        m2479a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2479a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2479a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1879c = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NonNull View view) {
        if (view.getParent() == this) {
            if (this.f1878b == null) {
                this.f1878b = new ArrayList<>();
            }
            this.f1878b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        this.f1879c = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cic0.f81926e);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(cic0.f81927f);
                str = "android:name";
            } else {
                str = XHTML.ATTR.CLASS;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(@NonNull Context context) {
        super(context);
        this.f1879c = true;
    }
}
