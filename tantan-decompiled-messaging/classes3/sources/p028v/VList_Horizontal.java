package p028v;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import l.b9c0;
import l.gbl0;
import l.ije;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VList_Horizontal extends AdapterView<ListAdapter> {

    /* JADX INFO: renamed from: A */
    public View.OnClickListener f12790A;

    /* JADX INFO: renamed from: B */
    public DataSetObserver f12791B;

    /* JADX INFO: renamed from: C */
    public Runnable f12792C;

    /* JADX INFO: renamed from: a */
    public Scroller f12793a;

    /* JADX INFO: renamed from: b */
    public final C1342d f12794b;

    /* JADX INFO: renamed from: c */
    public GestureDetector f12795c;

    /* JADX INFO: renamed from: d */
    public int f12796d;

    /* JADX INFO: renamed from: e */
    public ListAdapter f12797e;

    /* JADX INFO: renamed from: f */
    public List<Queue<View>> f12798f;

    /* JADX INFO: renamed from: g */
    public boolean f12799g;

    /* JADX INFO: renamed from: h */
    public Rect f12800h;

    /* JADX INFO: renamed from: i */
    public View f12801i;

    /* JADX INFO: renamed from: j */
    public int f12802j;

    /* JADX INFO: renamed from: k */
    public Drawable f12803k;

    /* JADX INFO: renamed from: l */
    public int f12804l;

    /* JADX INFO: renamed from: m */
    public int f12805m;

    /* JADX INFO: renamed from: n */
    public Integer f12806n;

    /* JADX INFO: renamed from: o */
    public int f12807o;

    /* JADX INFO: renamed from: p */
    public int f12808p;

    /* JADX INFO: renamed from: q */
    public int f12809q;

    /* JADX INFO: renamed from: r */
    public int f12810r;

    /* JADX INFO: renamed from: s */
    public int f12811s;

    /* JADX INFO: renamed from: t */
    public boolean f12812t;

    /* JADX INFO: renamed from: u */
    public OnScrollStateChangedListener.ScrollState f12813u;

    /* JADX INFO: renamed from: v */
    public ije f12814v;

    /* JADX INFO: renamed from: w */
    public ije f12815w;

    /* JADX INFO: renamed from: x */
    public int f12816x;

    /* JADX INFO: renamed from: y */
    public boolean f12817y;

    /* JADX INFO: renamed from: z */
    public boolean f12818z;

    public interface OnScrollStateChangedListener {

        public enum ScrollState {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$a */
    public class ViewOnTouchListenerC1339a implements View.OnTouchListener {
        public ViewOnTouchListenerC1339a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return VList_Horizontal.this.f12795c.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$b */
    public class C1340b extends DataSetObserver {
        public C1340b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VList_Horizontal.this.f12799g = true;
            VList_Horizontal.this.f12812t = false;
            VList_Horizontal.this.m11587R();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VList_Horizontal.this.f12812t = false;
            VList_Horizontal.this.m11587R();
            VList_Horizontal.this.m11585P();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$c */
    public class RunnableC1341c implements Runnable {
        public RunnableC1341c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$d */
    public class C1342d extends GestureDetector.SimpleOnGestureListener {
        public C1342d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return VList_Horizontal.this.m11578I(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return VList_Horizontal.this.m11579J(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            VList_Horizontal.this.m11587R();
            int iM11601y = VList_Horizontal.this.m11601y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM11601y < 0 || VList_Horizontal.this.f12817y) {
                return;
            }
            View childAt = VList_Horizontal.this.getChildAt(iM11601y);
            AdapterView.OnItemLongClickListener onItemLongClickListener = VList_Horizontal.this.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                int i = VList_Horizontal.this.f12808p + iM11601y;
                VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                if (onItemLongClickListener.onItemLongClick(vList_Horizontal, childAt, i, vList_Horizontal.f12797e.getItemId(i))) {
                    VList_Horizontal.this.performHapticFeedback(0);
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VList_Horizontal.this.m11584O(Boolean.TRUE);
            VList_Horizontal.this.setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_TOUCH_SCROLL);
            VList_Horizontal.this.m11587R();
            VList_Horizontal vList_Horizontal = VList_Horizontal.this;
            vList_Horizontal.f12805m += (int) f;
            vList_Horizontal.m11588S(Math.round(f));
            VList_Horizontal.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VList_Horizontal.this.m11587R();
            AdapterView.OnItemClickListener onItemClickListener = VList_Horizontal.this.getOnItemClickListener();
            int iM11601y = VList_Horizontal.this.m11601y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM11601y >= 0 && !VList_Horizontal.this.f12817y) {
                View childAt = VList_Horizontal.this.getChildAt(iM11601y);
                int i = VList_Horizontal.this.f12808p + iM11601y;
                if (onItemClickListener != null) {
                    VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                    onItemClickListener.onItemClick(vList_Horizontal, childAt, i, vList_Horizontal.f12797e.getItemId(i));
                    return true;
                }
            }
            if (VList_Horizontal.this.f12790A == null || VList_Horizontal.this.f12817y) {
                return false;
            }
            VList_Horizontal.this.f12790A.onClick(VList_Horizontal.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$e */
    @TargetApi(11)
    public static final class C1343e {
        /* JADX INFO: renamed from: a */
        public static void m11603a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$f */
    @TargetApi(14)
    public static final class C1344f {
        /* JADX INFO: renamed from: a */
        public static float m11604a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    public VList_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12793a = new Scroller(getContext());
        C1342d c1342d = new C1342d();
        this.f12794b = c1342d;
        this.f12798f = new ArrayList();
        this.f12799g = false;
        this.f12800h = new Rect();
        this.f12801i = null;
        this.f12802j = 0;
        this.f12803k = null;
        this.f12806n = null;
        this.f12807o = Integer.MAX_VALUE;
        this.f12811s = 0;
        this.f12812t = false;
        this.f12813u = OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE;
        this.f12817y = false;
        this.f12818z = false;
        this.f12791B = new C1340b();
        this.f12792C = new RunnableC1341c();
        this.f12814v = new ije(context);
        this.f12815w = new ije(context);
        this.f12795c = new GestureDetector(context, c1342d);
        m11590n();
        m11572C();
        m11586Q(context, attributeSet);
        setWillNotDraw(false);
        C1343e.m11603a(this.f12793a, 0.009f);
        m11571B(context);
    }

    private View getLeftmostChild() {
        return getChildAt(0);
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentScrollState(OnScrollStateChangedListener.ScrollState scrollState) {
        this.f12813u = scrollState;
    }

    /* JADX INFO: renamed from: A */
    public final View m11570A(int i) {
        int itemViewType = this.f12797e.getItemViewType(i);
        if (m11575F(itemViewType)) {
            return this.f12798f.get(itemViewType).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m11571B(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m11572C() {
        this.f12808p = -1;
        this.f12809q = -1;
        this.f12796d = 0;
        this.f12804l = 0;
        this.f12805m = 0;
        this.f12807o = Integer.MAX_VALUE;
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
    }

    /* JADX INFO: renamed from: D */
    public final void m11573D(int i) {
        this.f12798f.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f12798f.add(new LinkedList());
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m11574E() {
        ListAdapter listAdapter = this.f12797e;
        return (listAdapter == null || listAdapter.isEmpty() || this.f12807o <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m11575F(int i) {
        return i < this.f12798f.size();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m11576G(int i) {
        return i == this.f12797e.getCount() - 1;
    }

    /* JADX INFO: renamed from: H */
    public final void m11577H(View view) {
        ViewGroup.LayoutParams layoutParamsM11602z = m11602z(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f12816x, getPaddingTop() + getPaddingBottom(), layoutParamsM11602z.height);
        int i = layoutParamsM11602z.width;
        view.measure(i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* JADX INFO: renamed from: I */
    public boolean m11578I(MotionEvent motionEvent) {
        int iM11601y;
        this.f12817y = !this.f12793a.isFinished();
        this.f12793a.forceFinished(true);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        m11587R();
        if (!this.f12817y && (iM11601y = m11601y((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(iM11601y);
            this.f12801i = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m11579J(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f12793a.fling(this.f12805m, 0, (int) (-f), 0, 0, this.f12807o, 0, 0);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m11580K(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = this.f12796d + i;
            this.f12796d = measuredWidth;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int paddingLeft = getPaddingLeft() + measuredWidth;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                measuredWidth += childAt.getMeasuredWidth() + this.f12802j;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m11581L(int i, View view) {
        int itemViewType = this.f12797e.getItemViewType(i);
        if (m11575F(itemViewType)) {
            this.f12798f.get(itemViewType).offer(view);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m11582M() {
        ije ijeVar = this.f12814v;
        if (ijeVar != null) {
            ijeVar.i();
        }
        ije ijeVar2 = this.f12815w;
        if (ijeVar2 != null) {
            ijeVar2.i();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m11583N(int i) {
        View leftmostChild = getLeftmostChild();
        while (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
            this.f12796d += m11576G(this.f12808p) ? leftmostChild.getMeasuredWidth() : this.f12802j + leftmostChild.getMeasuredWidth();
            m11581L(this.f12808p, leftmostChild);
            removeViewInLayout(leftmostChild);
            this.f12808p++;
            leftmostChild = getLeftmostChild();
        }
        View rightmostChild = getRightmostChild();
        while (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
            m11581L(this.f12809q, rightmostChild);
            removeViewInLayout(rightmostChild);
            this.f12809q--;
            rightmostChild = getRightmostChild();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m11584O(Boolean bool) {
        if (this.f12818z != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f12818z = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m11585P() {
        m11572C();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* JADX INFO: renamed from: Q */
    public final void m11586Q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.R3);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.T3);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.S3, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11587R() {
        View view = this.f12801i;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f12801i = null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m11588S(int i) {
        if (this.f12814v == null || this.f12815w == null) {
            return;
        }
        int i2 = this.f12804l + i;
        Scroller scroller = this.f12793a;
        if (scroller == null || scroller.isFinished()) {
            if (i2 < 0) {
                this.f12814v.g(Math.abs(i) / getRenderWidth());
                if (this.f12815w.d()) {
                    return;
                }
                this.f12815w.i();
                return;
            }
            if (i2 > this.f12807o) {
                this.f12815w.g(Math.abs(i) / getRenderWidth());
                if (this.f12814v.d()) {
                    return;
                }
                this.f12814v.i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m11596t(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f12808p;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f12809q;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f12804l;
        if (i == 0) {
            return 0.0f;
        }
        if (i < horizontalFadingEdgeLength) {
            return i / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f12804l;
        int i2 = this.f12807o;
        if (i == i2) {
            return 0.0f;
        }
        if (i2 - i < horizontalFadingEdgeLength) {
            return (i2 - i) / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return m11600x(this.f12810r);
    }

    /* JADX INFO: renamed from: m */
    public final void m11589m(View view, int i) {
        addViewInLayout(view, i, m11602z(view), true);
        m11577H(view);
    }

    /* JADX INFO: renamed from: n */
    public final void m11590n() {
        setOnTouchListener(new ViewOnTouchListenerC1339a());
    }

    /* JADX INFO: renamed from: o */
    public final float m11591o() {
        return C1344f.m11604a(this.f12793a);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m11595s(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12797e == null) {
            return;
        }
        invalidate();
        if (this.f12799g) {
            int i5 = this.f12804l;
            m11572C();
            removeAllViewsInLayout();
            this.f12805m = i5;
            this.f12799g = false;
        }
        Integer num = this.f12806n;
        if (num != null) {
            this.f12805m = num.intValue();
            this.f12806n = null;
        }
        if (this.f12793a.computeScrollOffset()) {
            this.f12805m = this.f12793a.getCurrX();
        }
        int i6 = this.f12805m;
        if (i6 < 0) {
            this.f12805m = 0;
            if (this.f12814v.d()) {
                this.f12814v.e((int) m11591o());
            }
            this.f12793a.forceFinished(true);
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        } else {
            int i7 = this.f12807o;
            if (i6 > i7) {
                this.f12805m = i7;
                if (this.f12815w.d()) {
                    this.f12815w.e((int) m11591o());
                }
                this.f12793a.forceFinished(true);
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
        }
        int i8 = this.f12804l - this.f12805m;
        m11583N(i8);
        m11597u(i8);
        m11580K(i8);
        this.f12804l = this.f12805m;
        if (m11593q()) {
            onLayout(z, i, i2, i3, i4);
        } else if (!this.f12793a.isFinished()) {
            gbl0.b0(this, this.f12792C);
        } else if (this.f12813u == OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING) {
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12816x = i2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f12806n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f12804l);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f12793a;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
            m11584O(Boolean.FALSE);
            m11582M();
        } else if (motionEvent.getAction() == 3) {
            m11587R();
            m11582M();
            m11584O(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m11592p() {
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11593q() {
        View rightmostChild;
        if (m11576G(this.f12809q) && (rightmostChild = getRightmostChild()) != null) {
            int i = this.f12807o;
            int right = (this.f12804l + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f12807o = right;
            if (right < 0) {
                this.f12807o = 0;
            }
            if (this.f12807o != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m11594r(Canvas canvas, Rect rect) {
        Drawable drawable = this.f12803k;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.f12803k.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11595s(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f12800h;
        rect.top = getPaddingTop();
        Rect rect2 = this.f12800h;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m11576G(this.f12809q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f12802j;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m11594r(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m11594r(canvas, rect);
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f12797e;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f12791B);
        }
        if (listAdapter != null) {
            this.f12812t = false;
            this.f12797e = listAdapter;
            listAdapter.registerDataSetObserver(this.f12791B);
        }
        m11573D(this.f12797e.getViewTypeCount());
        m11585P();
    }

    public void setDivider(Drawable drawable) {
        this.f12803k = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f12802j = i;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12790A = onClickListener;
    }

    public void setOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        this.f12810r = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setActivated(false);
        }
        if (getSelectedView() != null) {
            getSelectedView().setActivated(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m11596t(Canvas canvas) {
        ije ijeVar = this.f12814v;
        if (ijeVar != null && !ijeVar.d() && m11574E()) {
            int iSave = canvas.save();
            int height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((-height) + getPaddingBottom(), 0.0f);
            this.f12814v.j(getRenderHeight(), getRenderWidth());
            if (this.f12814v.b(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(iSave);
            return;
        }
        ije ijeVar2 = this.f12815w;
        if (ijeVar2 == null || ijeVar2.d() || !m11574E()) {
            return;
        }
        int iSave2 = canvas.save();
        int width = getWidth();
        canvas.rotate(90.0f, 0.0f, 0.0f);
        canvas.translate(getPaddingTop(), -width);
        this.f12815w.j(getRenderHeight(), getRenderWidth());
        if (this.f12815w.b(canvas)) {
            invalidate();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: u */
    public final void m11597u(int i) {
        View rightmostChild = getRightmostChild();
        m11599w(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        m11598v(leftmostChild != null ? leftmostChild.getLeft() : 0, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m11598v(int i, int i2) {
        int i3;
        while ((i + i2) - this.f12802j > 0 && (i3 = this.f12808p) >= 1) {
            int i4 = i3 - 1;
            this.f12808p = i4;
            View view = this.f12797e.getView(i4, m11570A(i4), this);
            if (this.f12808p == this.f12810r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m11589m(view, 0);
            i -= this.f12808p == 0 ? view.getMeasuredWidth() : this.f12802j + view.getMeasuredWidth();
            this.f12796d -= i + i2 == 0 ? view.getMeasuredWidth() : view.getMeasuredWidth() + this.f12802j;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11599w(int i, int i2) {
        while (i + i2 + this.f12802j < getWidth() && this.f12809q + 1 < this.f12797e.getCount()) {
            int i3 = this.f12809q + 1;
            this.f12809q = i3;
            if (this.f12808p < 0) {
                this.f12808p = i3;
            }
            View view = this.f12797e.getView(i3, m11570A(i3), this);
            int i4 = 0;
            if (this.f12809q == this.f12810r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m11589m(view, -1);
            if (this.f12809q != 0) {
                i4 = this.f12802j;
            }
            i += i4 + view.getMeasuredWidth();
            m11592p();
        }
    }

    /* JADX INFO: renamed from: x */
    public final View m11600x(int i) {
        int i2 = this.f12808p;
        if (i < i2 || i > this.f12809q) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* JADX INFO: renamed from: y */
    public final int m11601y(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f12800h);
            if (this.f12800h.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public final ViewGroup.LayoutParams m11602z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f12797e;
    }
}
