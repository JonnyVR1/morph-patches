package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import p149l.ddl0;
import p149l.ece;
import p149l.enr;
import p149l.kbe;
import p149l.n0c0;

/* JADX INFO: loaded from: classes.dex */
class DropDownListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f665a;

    /* JADX INFO: renamed from: b */
    public int f666b;

    /* JADX INFO: renamed from: c */
    public int f667c;

    /* JADX INFO: renamed from: d */
    public int f668d;

    /* JADX INFO: renamed from: e */
    public int f669e;

    /* JADX INFO: renamed from: f */
    public int f670f;

    /* JADX INFO: renamed from: g */
    public Field f671g;

    /* JADX INFO: renamed from: h */
    public C0129a f672h;

    /* JADX INFO: renamed from: i */
    public boolean f673i;

    /* JADX INFO: renamed from: j */
    public boolean f674j;

    /* JADX INFO: renamed from: k */
    public boolean f675k;

    /* JADX INFO: renamed from: l */
    public ddl0 f676l;

    /* JADX INFO: renamed from: m */
    public enr f677m;

    /* JADX INFO: renamed from: n */
    public RunnableC0130b f678n;

    /* JADX INFO: renamed from: androidx.appcompat.widget.DropDownListView$a */
    public static class C0129a extends ece {

        /* JADX INFO: renamed from: a */
        public boolean f679a;

        public C0129a(Drawable drawable) {
            super(drawable);
            this.f679a = true;
        }

        /* JADX INFO: renamed from: a */
        public void m574a(boolean z) {
            this.f679a = z;
        }

        @Override // p149l.ece, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f679a) {
                super.draw(canvas);
            }
        }

        @Override // p149l.ece, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f679a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p149l.ece, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f679a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p149l.ece, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f679a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p149l.ece, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f679a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.DropDownListView$b */
    public class RunnableC0130b implements Runnable {
        public RunnableC0130b() {
        }

        /* JADX INFO: renamed from: a */
        public void m575a() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f678n = null;
            dropDownListView.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: b */
        public void m576b() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f678n = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z) {
        super(context, null, n0c0.f136494C);
        this.f665a = new Rect();
        this.f666b = 0;
        this.f667c = 0;
        this.f668d = 0;
        this.f669e = 0;
        this.f674j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f671g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0129a c0129a = this.f672h;
        if (c0129a != null) {
            c0129a.m574a(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m563a() {
        this.f675k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f670f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ddl0 ddl0Var = this.f676l;
        if (ddl0Var != null) {
            ddl0Var.m111031c();
            this.f676l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m564b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m565c(Canvas canvas) {
        Drawable selector;
        if (this.f665a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f665a);
        selector.draw(canvas);
    }

    /* JADX INFO: renamed from: d */
    public int mo566d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m565c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f678n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m573k();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    /* JADX INFO: renamed from: e */
    public boolean mo567e(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        enr enrVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    m563a();
                }
                enrVar = this.f677m;
                if (z) {
                    if (enrVar != null) {
                        enrVar.m131329m(false);
                    }
                    return z;
                }
                if (enrVar == null) {
                    this.f677m = new enr(this);
                }
                this.f677m.m131329m(true);
                this.f677m.onTouch(this, motionEvent);
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                m571i(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    m564b(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            m563a();
        } else {
            m563a();
        }
        enrVar = this.f677m;
        if (z) {
            if (enrVar != null) {
                enrVar.m131329m(false);
            }
            return z;
        }
        if (enrVar == null) {
            this.f677m = new enr(this);
        }
        this.f677m.m131329m(true);
        this.f677m.onTouch(this, motionEvent);
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m568f(int i, View view) {
        Rect rect = this.f665a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f666b;
        rect.top -= this.f667c;
        rect.right += this.f668d;
        rect.bottom += this.f669e;
        try {
            boolean z = this.f671g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f671g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m569g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m568f(i, view);
        if (z) {
            Rect rect = this.f665a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            kbe.m145277k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m570h(int i, View view, float f, float f2) {
        m569g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        kbe.m145277k(selector, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f674j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f674j || super.hasWindowFocus();
    }

    /* JADX INFO: renamed from: i */
    public final void m571i(View view, int i, float f, float f2) {
        View childAt;
        this.f675k = true;
        drawableHotspotChanged(f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f670f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f670f = i;
        view.drawableHotspotChanged(f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m570h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f674j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f674j && this.f673i) || super.isInTouchMode();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m572j() {
        return this.f675k;
    }

    /* JADX INFO: renamed from: k */
    public final void m573k() {
        Drawable selector = getSelector();
        if (selector != null && m572j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f678n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f678n == null) {
            RunnableC0130b runnableC0130b = new RunnableC0130b();
            this.f678n = runnableC0130b;
            runnableC0130b.m576b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
            }
            m573k();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f670f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0130b runnableC0130b = this.f678n;
        if (runnableC0130b != null) {
            runnableC0130b.m575a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f673i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0129a c0129a = drawable != null ? new C0129a(drawable) : null;
        this.f672h = c0129a;
        super.setSelector(c0129a);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f666b = rect.left;
        this.f667c = rect.top;
        this.f668d = rect.right;
        this.f669e = rect.bottom;
    }
}
