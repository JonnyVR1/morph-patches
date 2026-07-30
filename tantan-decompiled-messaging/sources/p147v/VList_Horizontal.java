package p147v;

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
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p149l.b9c0;
import p149l.gbl0;
import p149l.ije;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VList_Horizontal extends AdapterView<ListAdapter> {

    /* JADX INFO: renamed from: A */
    public View.OnClickListener f209165A;

    /* JADX INFO: renamed from: B */
    public DataSetObserver f209166B;

    /* JADX INFO: renamed from: C */
    public Runnable f209167C;

    /* JADX INFO: renamed from: a */
    public Scroller f209168a;

    /* JADX INFO: renamed from: b */
    public final C22549d f209169b;

    /* JADX INFO: renamed from: c */
    public GestureDetector f209170c;

    /* JADX INFO: renamed from: d */
    public int f209171d;

    /* JADX INFO: renamed from: e */
    public ListAdapter f209172e;

    /* JADX INFO: renamed from: f */
    public List<Queue<View>> f209173f;

    /* JADX INFO: renamed from: g */
    public boolean f209174g;

    /* JADX INFO: renamed from: h */
    public Rect f209175h;

    /* JADX INFO: renamed from: i */
    public View f209176i;

    /* JADX INFO: renamed from: j */
    public int f209177j;

    /* JADX INFO: renamed from: k */
    public Drawable f209178k;

    /* JADX INFO: renamed from: l */
    public int f209179l;

    /* JADX INFO: renamed from: m */
    public int f209180m;

    /* JADX INFO: renamed from: n */
    public Integer f209181n;

    /* JADX INFO: renamed from: o */
    public int f209182o;

    /* JADX INFO: renamed from: p */
    public int f209183p;

    /* JADX INFO: renamed from: q */
    public int f209184q;

    /* JADX INFO: renamed from: r */
    public int f209185r;

    /* JADX INFO: renamed from: s */
    public int f209186s;

    /* JADX INFO: renamed from: t */
    public boolean f209187t;

    /* JADX INFO: renamed from: u */
    public OnScrollStateChangedListener.ScrollState f209188u;

    /* JADX INFO: renamed from: v */
    public ije f209189v;

    /* JADX INFO: renamed from: w */
    public ije f209190w;

    /* JADX INFO: renamed from: x */
    public int f209191x;

    /* JADX INFO: renamed from: y */
    public boolean f209192y;

    /* JADX INFO: renamed from: z */
    public boolean f209193z;

    public interface OnScrollStateChangedListener {

        public enum ScrollState {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$a */
    public class ViewOnTouchListenerC22546a implements View.OnTouchListener {
        public ViewOnTouchListenerC22546a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return VList_Horizontal.this.f209170c.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$b */
    public class C22547b extends DataSetObserver {
        public C22547b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VList_Horizontal.this.f209174g = true;
            VList_Horizontal.this.f209187t = false;
            VList_Horizontal.this.m223106R();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VList_Horizontal.this.f209187t = false;
            VList_Horizontal.this.m223106R();
            VList_Horizontal.this.m223104P();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$c */
    public class RunnableC22548c implements Runnable {
        public RunnableC22548c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$d */
    public class C22549d extends GestureDetector.SimpleOnGestureListener {
        public C22549d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return VList_Horizontal.this.m223097I(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return VList_Horizontal.this.m223098J(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            VList_Horizontal.this.m223106R();
            int iM223120y = VList_Horizontal.this.m223120y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM223120y < 0 || VList_Horizontal.this.f209192y) {
                return;
            }
            View childAt = VList_Horizontal.this.getChildAt(iM223120y);
            AdapterView.OnItemLongClickListener onItemLongClickListener = VList_Horizontal.this.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                int i = VList_Horizontal.this.f209183p + iM223120y;
                VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                if (onItemLongClickListener.onItemLongClick(vList_Horizontal, childAt, i, vList_Horizontal.f209172e.getItemId(i))) {
                    VList_Horizontal.this.performHapticFeedback(0);
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VList_Horizontal.this.m223103O(Boolean.TRUE);
            VList_Horizontal.this.setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_TOUCH_SCROLL);
            VList_Horizontal.this.m223106R();
            VList_Horizontal vList_Horizontal = VList_Horizontal.this;
            vList_Horizontal.f209180m += (int) f;
            vList_Horizontal.m223107S(Math.round(f));
            VList_Horizontal.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VList_Horizontal.this.m223106R();
            AdapterView.OnItemClickListener onItemClickListener = VList_Horizontal.this.getOnItemClickListener();
            int iM223120y = VList_Horizontal.this.m223120y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM223120y >= 0 && !VList_Horizontal.this.f209192y) {
                View childAt = VList_Horizontal.this.getChildAt(iM223120y);
                int i = VList_Horizontal.this.f209183p + iM223120y;
                if (onItemClickListener != null) {
                    VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                    onItemClickListener.onItemClick(vList_Horizontal, childAt, i, vList_Horizontal.f209172e.getItemId(i));
                    return true;
                }
            }
            if (VList_Horizontal.this.f209165A == null || VList_Horizontal.this.f209192y) {
                return false;
            }
            VList_Horizontal.this.f209165A.onClick(VList_Horizontal.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$e */
    @TargetApi(11)
    public static final class C22550e {
        /* JADX INFO: renamed from: a */
        public static void m223122a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$f */
    @TargetApi(14)
    public static final class C22551f {
        /* JADX INFO: renamed from: a */
        public static float m223123a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    public VList_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209168a = new Scroller(getContext());
        C22549d c22549d = new C22549d();
        this.f209169b = c22549d;
        this.f209173f = new ArrayList();
        this.f209174g = false;
        this.f209175h = new Rect();
        this.f209176i = null;
        this.f209177j = 0;
        this.f209178k = null;
        this.f209181n = null;
        this.f209182o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f209186s = 0;
        this.f209187t = false;
        this.f209188u = OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE;
        this.f209192y = false;
        this.f209193z = false;
        this.f209166B = new C22547b();
        this.f209167C = new RunnableC22548c();
        this.f209189v = new ije(context);
        this.f209190w = new ije(context);
        this.f209170c = new GestureDetector(context, c22549d);
        m223109n();
        m223091C();
        m223105Q(context, attributeSet);
        setWillNotDraw(false);
        C22550e.m223122a(this.f209168a, 0.009f);
        m223090B(context);
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
        this.f209188u = scrollState;
    }

    /* JADX INFO: renamed from: A */
    public final View m223089A(int i) {
        int itemViewType = this.f209172e.getItemViewType(i);
        if (m223094F(itemViewType)) {
            return this.f209173f.get(itemViewType).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m223090B(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m223091C() {
        this.f209183p = -1;
        this.f209184q = -1;
        this.f209171d = 0;
        this.f209179l = 0;
        this.f209180m = 0;
        this.f209182o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
    }

    /* JADX INFO: renamed from: D */
    public final void m223092D(int i) {
        this.f209173f.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f209173f.add(new LinkedList());
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m223093E() {
        ListAdapter listAdapter = this.f209172e;
        return (listAdapter == null || listAdapter.isEmpty() || this.f209182o <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m223094F(int i) {
        return i < this.f209173f.size();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m223095G(int i) {
        return i == this.f209172e.getCount() - 1;
    }

    /* JADX INFO: renamed from: H */
    public final void m223096H(View view) {
        ViewGroup.LayoutParams layoutParamsM223121z = m223121z(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f209191x, getPaddingTop() + getPaddingBottom(), layoutParamsM223121z.height);
        int i = layoutParamsM223121z.width;
        view.measure(i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* JADX INFO: renamed from: I */
    public boolean m223097I(MotionEvent motionEvent) {
        int iM223120y;
        this.f209192y = !this.f209168a.isFinished();
        this.f209168a.forceFinished(true);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        m223106R();
        if (!this.f209192y && (iM223120y = m223120y((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(iM223120y);
            this.f209176i = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m223098J(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f209168a.fling(this.f209180m, 0, (int) (-f), 0, 0, this.f209182o, 0, 0);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m223099K(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = this.f209171d + i;
            this.f209171d = measuredWidth;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int paddingLeft = getPaddingLeft() + measuredWidth;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                measuredWidth += childAt.getMeasuredWidth() + this.f209177j;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m223100L(int i, View view) {
        int itemViewType = this.f209172e.getItemViewType(i);
        if (m223094F(itemViewType)) {
            this.f209173f.get(itemViewType).offer(view);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m223101M() {
        ije ijeVar = this.f209189v;
        if (ijeVar != null) {
            ijeVar.m136602i();
        }
        ije ijeVar2 = this.f209190w;
        if (ijeVar2 != null) {
            ijeVar2.m136602i();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m223102N(int i) {
        View leftmostChild = getLeftmostChild();
        while (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
            this.f209171d += m223095G(this.f209183p) ? leftmostChild.getMeasuredWidth() : this.f209177j + leftmostChild.getMeasuredWidth();
            m223100L(this.f209183p, leftmostChild);
            removeViewInLayout(leftmostChild);
            this.f209183p++;
            leftmostChild = getLeftmostChild();
        }
        View rightmostChild = getRightmostChild();
        while (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
            m223100L(this.f209184q, rightmostChild);
            removeViewInLayout(rightmostChild);
            this.f209184q--;
            rightmostChild = getRightmostChild();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m223103O(Boolean bool) {
        if (this.f209193z != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f209193z = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m223104P() {
        m223091C();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* JADX INFO: renamed from: Q */
    public final void m223105Q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74335R3);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.f74347T3);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74341S3, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m223106R() {
        View view = this.f209176i;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f209176i = null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m223107S(int i) {
        if (this.f209189v == null || this.f209190w == null) {
            return;
        }
        int i2 = this.f209179l + i;
        Scroller scroller = this.f209168a;
        if (scroller == null || scroller.isFinished()) {
            if (i2 < 0) {
                this.f209189v.m136601g(Math.abs(i) / getRenderWidth());
                if (this.f209190w.m136599d()) {
                    return;
                }
                this.f209190w.m136602i();
                return;
            }
            if (i2 > this.f209182o) {
                this.f209190w.m136601g(Math.abs(i) / getRenderWidth());
                if (this.f209189v.m136599d()) {
                    return;
                }
                this.f209189v.m136602i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m223115t(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f209183p;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f209184q;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f209179l;
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
        int i = this.f209179l;
        int i2 = this.f209182o;
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
        return m223119x(this.f209185r);
    }

    /* JADX INFO: renamed from: m */
    public final void m223108m(View view, int i) {
        addViewInLayout(view, i, m223121z(view), true);
        m223096H(view);
    }

    /* JADX INFO: renamed from: n */
    public final void m223109n() {
        setOnTouchListener(new ViewOnTouchListenerC22546a());
    }

    /* JADX INFO: renamed from: o */
    public final float m223110o() {
        return C22551f.m223123a(this.f209168a);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m223114s(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f209172e == null) {
            return;
        }
        invalidate();
        if (this.f209174g) {
            int i5 = this.f209179l;
            m223091C();
            removeAllViewsInLayout();
            this.f209180m = i5;
            this.f209174g = false;
        }
        Integer num = this.f209181n;
        if (num != null) {
            this.f209180m = num.intValue();
            this.f209181n = null;
        }
        if (this.f209168a.computeScrollOffset()) {
            this.f209180m = this.f209168a.getCurrX();
        }
        int i6 = this.f209180m;
        if (i6 < 0) {
            this.f209180m = 0;
            if (this.f209189v.m136599d()) {
                this.f209189v.m136600e((int) m223110o());
            }
            this.f209168a.forceFinished(true);
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        } else {
            int i7 = this.f209182o;
            if (i6 > i7) {
                this.f209180m = i7;
                if (this.f209190w.m136599d()) {
                    this.f209190w.m136600e((int) m223110o());
                }
                this.f209168a.forceFinished(true);
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
        }
        int i8 = this.f209179l - this.f209180m;
        m223102N(i8);
        m223116u(i8);
        m223099K(i8);
        this.f209179l = this.f209180m;
        if (m223112q()) {
            onLayout(z, i, i2, i3, i4);
        } else if (!this.f209168a.isFinished()) {
            gbl0.m125185b0(this, this.f209167C);
        } else if (this.f209188u == OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING) {
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f209191x = i2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f209181n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f209179l);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f209168a;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
            m223103O(Boolean.FALSE);
            m223101M();
        } else if (motionEvent.getAction() == 3) {
            m223106R();
            m223101M();
            m223103O(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m223111p() {
    }

    /* JADX INFO: renamed from: q */
    public final boolean m223112q() {
        View rightmostChild;
        if (m223095G(this.f209184q) && (rightmostChild = getRightmostChild()) != null) {
            int i = this.f209182o;
            int right = (this.f209179l + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f209182o = right;
            if (right < 0) {
                this.f209182o = 0;
            }
            if (this.f209182o != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m223113r(Canvas canvas, Rect rect) {
        Drawable drawable = this.f209178k;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.f209178k.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m223114s(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f209175h;
        rect.top = getPaddingTop();
        Rect rect2 = this.f209175h;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m223095G(this.f209184q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f209177j;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m223113r(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m223113r(canvas, rect);
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f209172e;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f209166B);
        }
        if (listAdapter != null) {
            this.f209187t = false;
            this.f209172e = listAdapter;
            listAdapter.registerDataSetObserver(this.f209166B);
        }
        m223092D(this.f209172e.getViewTypeCount());
        m223104P();
    }

    public void setDivider(Drawable drawable) {
        this.f209178k = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f209177j = i;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f209165A = onClickListener;
    }

    public void setOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        this.f209185r = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setActivated(false);
        }
        if (getSelectedView() != null) {
            getSelectedView().setActivated(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m223115t(Canvas canvas) {
        ije ijeVar = this.f209189v;
        if (ijeVar != null && !ijeVar.m136599d() && m223093E()) {
            int iSave = canvas.save();
            int height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((-height) + getPaddingBottom(), 0.0f);
            this.f209189v.m136603j(getRenderHeight(), getRenderWidth());
            if (this.f209189v.m136598b(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(iSave);
            return;
        }
        ije ijeVar2 = this.f209190w;
        if (ijeVar2 == null || ijeVar2.m136599d() || !m223093E()) {
            return;
        }
        int iSave2 = canvas.save();
        int width = getWidth();
        canvas.rotate(90.0f, 0.0f, 0.0f);
        canvas.translate(getPaddingTop(), -width);
        this.f209190w.m136603j(getRenderHeight(), getRenderWidth());
        if (this.f209190w.m136598b(canvas)) {
            invalidate();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: u */
    public final void m223116u(int i) {
        View rightmostChild = getRightmostChild();
        m223118w(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        m223117v(leftmostChild != null ? leftmostChild.getLeft() : 0, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m223117v(int i, int i2) {
        int i3;
        while ((i + i2) - this.f209177j > 0 && (i3 = this.f209183p) >= 1) {
            int i4 = i3 - 1;
            this.f209183p = i4;
            View view = this.f209172e.getView(i4, m223089A(i4), this);
            if (this.f209183p == this.f209185r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m223108m(view, 0);
            i -= this.f209183p == 0 ? view.getMeasuredWidth() : this.f209177j + view.getMeasuredWidth();
            this.f209171d -= i + i2 == 0 ? view.getMeasuredWidth() : view.getMeasuredWidth() + this.f209177j;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m223118w(int i, int i2) {
        while (i + i2 + this.f209177j < getWidth() && this.f209184q + 1 < this.f209172e.getCount()) {
            int i3 = this.f209184q + 1;
            this.f209184q = i3;
            if (this.f209183p < 0) {
                this.f209183p = i3;
            }
            View view = this.f209172e.getView(i3, m223089A(i3), this);
            int i4 = 0;
            if (this.f209184q == this.f209185r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m223108m(view, -1);
            if (this.f209184q != 0) {
                i4 = this.f209177j;
            }
            i += i4 + view.getMeasuredWidth();
            m223111p();
        }
    }

    /* JADX INFO: renamed from: x */
    public final View m223119x(int i) {
        int i2 = this.f209183p;
        if (i < i2 || i > this.f209184q) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* JADX INFO: renamed from: y */
    public final int m223120y(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f209175h);
            if (this.f209175h.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public final ViewGroup.LayoutParams m223121z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f209172e;
    }
}
