package p151v;

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
import p153l.bnl0;
import p153l.hhc0;
import p153l.kkl0;
import p153l.mke;

/* JADX INFO: loaded from: classes3.dex */
public class VList_Horizontal extends AdapterView<ListAdapter> {

    /* JADX INFO: renamed from: A */
    public View.OnClickListener f210087A;

    /* JADX INFO: renamed from: B */
    public DataSetObserver f210088B;

    /* JADX INFO: renamed from: C */
    public Runnable f210089C;

    /* JADX INFO: renamed from: a */
    public Scroller f210090a;

    /* JADX INFO: renamed from: b */
    public final C22664d f210091b;

    /* JADX INFO: renamed from: c */
    public GestureDetector f210092c;

    /* JADX INFO: renamed from: d */
    public int f210093d;

    /* JADX INFO: renamed from: e */
    public ListAdapter f210094e;

    /* JADX INFO: renamed from: f */
    public List<Queue<View>> f210095f;

    /* JADX INFO: renamed from: g */
    public boolean f210096g;

    /* JADX INFO: renamed from: h */
    public Rect f210097h;

    /* JADX INFO: renamed from: i */
    public View f210098i;

    /* JADX INFO: renamed from: j */
    public int f210099j;

    /* JADX INFO: renamed from: k */
    public Drawable f210100k;

    /* JADX INFO: renamed from: l */
    public int f210101l;

    /* JADX INFO: renamed from: m */
    public int f210102m;

    /* JADX INFO: renamed from: n */
    public Integer f210103n;

    /* JADX INFO: renamed from: o */
    public int f210104o;

    /* JADX INFO: renamed from: p */
    public int f210105p;

    /* JADX INFO: renamed from: q */
    public int f210106q;

    /* JADX INFO: renamed from: r */
    public int f210107r;

    /* JADX INFO: renamed from: s */
    public int f210108s;

    /* JADX INFO: renamed from: t */
    public boolean f210109t;

    /* JADX INFO: renamed from: u */
    public OnScrollStateChangedListener.ScrollState f210110u;

    /* JADX INFO: renamed from: v */
    public mke f210111v;

    /* JADX INFO: renamed from: w */
    public mke f210112w;

    /* JADX INFO: renamed from: x */
    public int f210113x;

    /* JADX INFO: renamed from: y */
    public boolean f210114y;

    /* JADX INFO: renamed from: z */
    public boolean f210115z;

    public interface OnScrollStateChangedListener {

        public enum ScrollState {
            SCROLL_STATE_IDLE,
            SCROLL_STATE_TOUCH_SCROLL,
            SCROLL_STATE_FLING
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$a */
    public class ViewOnTouchListenerC22661a implements View.OnTouchListener {
        public ViewOnTouchListenerC22661a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return VList_Horizontal.this.f210092c.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$b */
    public class C22662b extends DataSetObserver {
        public C22662b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VList_Horizontal.this.f210096g = true;
            VList_Horizontal.this.f210109t = false;
            VList_Horizontal.this.m224352R();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VList_Horizontal.this.f210109t = false;
            VList_Horizontal.this.m224352R();
            VList_Horizontal.this.m224350P();
            VList_Horizontal.this.invalidate();
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$c */
    public class RunnableC22663c implements Runnable {
        public RunnableC22663c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VList_Horizontal.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$d */
    public class C22664d extends GestureDetector.SimpleOnGestureListener {
        public C22664d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return VList_Horizontal.this.m224343I(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return VList_Horizontal.this.m224344J(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            VList_Horizontal.this.m224352R();
            int iM224366y = VList_Horizontal.this.m224366y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM224366y < 0 || VList_Horizontal.this.f210114y) {
                return;
            }
            View childAt = VList_Horizontal.this.getChildAt(iM224366y);
            AdapterView.OnItemLongClickListener onItemLongClickListener = VList_Horizontal.this.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                int i = VList_Horizontal.this.f210105p + iM224366y;
                VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                if (onItemLongClickListener.onItemLongClick(vList_Horizontal, childAt, i, vList_Horizontal.f210094e.getItemId(i))) {
                    VList_Horizontal.this.performHapticFeedback(0);
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            VList_Horizontal.this.m224349O(Boolean.TRUE);
            VList_Horizontal.this.setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_TOUCH_SCROLL);
            VList_Horizontal.this.m224352R();
            VList_Horizontal vList_Horizontal = VList_Horizontal.this;
            vList_Horizontal.f210102m += (int) f;
            vList_Horizontal.m224353S(Math.round(f));
            VList_Horizontal.this.requestLayout();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VList_Horizontal.this.m224352R();
            AdapterView.OnItemClickListener onItemClickListener = VList_Horizontal.this.getOnItemClickListener();
            int iM224366y = VList_Horizontal.this.m224366y((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iM224366y >= 0 && !VList_Horizontal.this.f210114y) {
                View childAt = VList_Horizontal.this.getChildAt(iM224366y);
                int i = VList_Horizontal.this.f210105p + iM224366y;
                if (onItemClickListener != null) {
                    VList_Horizontal vList_Horizontal = VList_Horizontal.this;
                    onItemClickListener.onItemClick(vList_Horizontal, childAt, i, vList_Horizontal.f210094e.getItemId(i));
                    return true;
                }
            }
            if (VList_Horizontal.this.f210087A == null || VList_Horizontal.this.f210114y) {
                return false;
            }
            VList_Horizontal.this.f210087A.onClick(VList_Horizontal.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$e */
    @TargetApi(11)
    public static final class C22665e {
        /* JADX INFO: renamed from: a */
        public static void m224368a(Scroller scroller, float f) {
            if (scroller != null) {
                scroller.setFriction(f);
            }
        }
    }

    /* JADX INFO: renamed from: v.VList_Horizontal$f */
    @TargetApi(14)
    public static final class C22666f {
        /* JADX INFO: renamed from: a */
        public static float m224369a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    public VList_Horizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210090a = new Scroller(getContext());
        C22664d c22664d = new C22664d();
        this.f210091b = c22664d;
        this.f210095f = new ArrayList();
        this.f210096g = false;
        this.f210097h = new Rect();
        this.f210098i = null;
        this.f210099j = 0;
        this.f210100k = null;
        this.f210103n = null;
        this.f210104o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f210108s = 0;
        this.f210109t = false;
        this.f210110u = OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE;
        this.f210114y = false;
        this.f210115z = false;
        this.f210088B = new C22662b();
        this.f210089C = new RunnableC22663c();
        this.f210111v = new mke(context);
        this.f210112w = new mke(context);
        this.f210092c = new GestureDetector(context, c22664d);
        m224355n();
        m224337C();
        m224351Q(context, attributeSet);
        setWillNotDraw(false);
        C22665e.m224368a(this.f210090a, 0.009f);
        m224336B(context);
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
        this.f210110u = scrollState;
    }

    /* JADX INFO: renamed from: A */
    public final View m224335A(int i) {
        int itemViewType = this.f210094e.getItemViewType(i);
        if (m224340F(itemViewType)) {
            return this.f210095f.get(itemViewType).poll();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m224336B(Context context) {
        if (bnl0.f77541b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m224337C() {
        this.f210105p = -1;
        this.f210106q = -1;
        this.f210093d = 0;
        this.f210101l = 0;
        this.f210102m = 0;
        this.f210104o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
    }

    /* JADX INFO: renamed from: D */
    public final void m224338D(int i) {
        this.f210095f.clear();
        for (int i2 = 0; i2 < i; i2++) {
            this.f210095f.add(new LinkedList());
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m224339E() {
        ListAdapter listAdapter = this.f210094e;
        return (listAdapter == null || listAdapter.isEmpty() || this.f210104o <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m224340F(int i) {
        return i < this.f210095f.size();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m224341G(int i) {
        return i == this.f210094e.getCount() - 1;
    }

    /* JADX INFO: renamed from: H */
    public final void m224342H(View view) {
        ViewGroup.LayoutParams layoutParamsM224367z = m224367z(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f210113x, getPaddingTop() + getPaddingBottom(), layoutParamsM224367z.height);
        int i = layoutParamsM224367z.width;
        view.measure(i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    /* JADX INFO: renamed from: I */
    public boolean m224343I(MotionEvent motionEvent) {
        int iM224366y;
        this.f210114y = !this.f210090a.isFinished();
        this.f210090a.forceFinished(true);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        m224352R();
        if (!this.f210114y && (iM224366y = m224366y((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            View childAt = getChildAt(iM224366y);
            this.f210098i = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m224344J(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f210090a.fling(this.f210102m, 0, (int) (-f), 0, 0, this.f210104o, 0, 0);
        setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m224345K(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = this.f210093d + i;
            this.f210093d = measuredWidth;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                int paddingLeft = getPaddingLeft() + measuredWidth;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                measuredWidth += childAt.getMeasuredWidth() + this.f210099j;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m224346L(int i, View view) {
        int itemViewType = this.f210094e.getItemViewType(i);
        if (m224340F(itemViewType)) {
            this.f210095f.get(itemViewType).offer(view);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m224347M() {
        mke mkeVar = this.f210111v;
        if (mkeVar != null) {
            mkeVar.m158763i();
        }
        mke mkeVar2 = this.f210112w;
        if (mkeVar2 != null) {
            mkeVar2.m158763i();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m224348N(int i) {
        View leftmostChild = getLeftmostChild();
        while (leftmostChild != null && leftmostChild.getRight() + i <= 0) {
            this.f210093d += m224341G(this.f210105p) ? leftmostChild.getMeasuredWidth() : this.f210099j + leftmostChild.getMeasuredWidth();
            m224346L(this.f210105p, leftmostChild);
            removeViewInLayout(leftmostChild);
            this.f210105p++;
            leftmostChild = getLeftmostChild();
        }
        View rightmostChild = getRightmostChild();
        while (rightmostChild != null && rightmostChild.getLeft() + i >= getWidth()) {
            m224346L(this.f210106q, rightmostChild);
            removeViewInLayout(rightmostChild);
            this.f210106q--;
            rightmostChild = getRightmostChild();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m224349O(Boolean bool) {
        if (this.f210115z != bool.booleanValue()) {
            for (View view = this; view.getParent() instanceof View; view = (View) view.getParent()) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f210115z = bool.booleanValue();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m224350P() {
        m224337C();
        removeAllViewsInLayout();
        requestLayout();
    }

    /* JADX INFO: renamed from: Q */
    public final void m224351Q(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109644R3);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(hhc0.f109656T3);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109650S3, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m224352R() {
        View view = this.f210098i;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f210098i = null;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m224353S(int i) {
        if (this.f210111v == null || this.f210112w == null) {
            return;
        }
        int i2 = this.f210101l + i;
        Scroller scroller = this.f210090a;
        if (scroller == null || scroller.isFinished()) {
            if (i2 < 0) {
                this.f210111v.m158762g(Math.abs(i) / getRenderWidth());
                if (this.f210112w.m158760d()) {
                    return;
                }
                this.f210112w.m158763i();
                return;
            }
            if (i2 > this.f210104o) {
                this.f210112w.m158762g(Math.abs(i) / getRenderWidth());
                if (this.f210111v.m158760d()) {
                    return;
                }
                this.f210111v.m158763i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m224361t(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f210105p;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f210106q;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i = this.f210101l;
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
        int i = this.f210101l;
        int i2 = this.f210104o;
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
        return m224365x(this.f210107r);
    }

    /* JADX INFO: renamed from: m */
    public final void m224354m(View view, int i) {
        addViewInLayout(view, i, m224367z(view), true);
        m224342H(view);
    }

    /* JADX INFO: renamed from: n */
    public final void m224355n() {
        setOnTouchListener(new ViewOnTouchListenerC22661a());
    }

    /* JADX INFO: renamed from: o */
    public final float m224356o() {
        return C22666f.m224369a(this.f210090a);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m224360s(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    @SuppressLint({"WrongCall"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f210094e == null) {
            return;
        }
        invalidate();
        if (this.f210096g) {
            int i5 = this.f210101l;
            m224337C();
            removeAllViewsInLayout();
            this.f210102m = i5;
            this.f210096g = false;
        }
        Integer num = this.f210103n;
        if (num != null) {
            this.f210102m = num.intValue();
            this.f210103n = null;
        }
        if (this.f210090a.computeScrollOffset()) {
            this.f210102m = this.f210090a.getCurrX();
        }
        int i6 = this.f210102m;
        if (i6 < 0) {
            this.f210102m = 0;
            if (this.f210111v.m158760d()) {
                this.f210111v.m158761e((int) m224356o());
            }
            this.f210090a.forceFinished(true);
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        } else {
            int i7 = this.f210104o;
            if (i6 > i7) {
                this.f210102m = i7;
                if (this.f210112w.m158760d()) {
                    this.f210112w.m158761e((int) m224356o());
                }
                this.f210090a.forceFinished(true);
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
        }
        int i8 = this.f210101l - this.f210102m;
        m224348N(i8);
        m224362u(i8);
        m224345K(i8);
        this.f210101l = this.f210102m;
        if (m224358q()) {
            onLayout(z, i, i2, i3, i4);
        } else if (!this.f210090a.isFinished()) {
            kkl0.m150148b0(this, this.f210089C);
        } else if (this.f210110u == OnScrollStateChangedListener.ScrollState.SCROLL_STATE_FLING) {
            setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f210113x = i2;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f210103n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f210101l);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Scroller scroller = this.f210090a;
            if (scroller == null || scroller.isFinished()) {
                setCurrentScrollState(OnScrollStateChangedListener.ScrollState.SCROLL_STATE_IDLE);
            }
            m224349O(Boolean.FALSE);
            m224347M();
        } else if (motionEvent.getAction() == 3) {
            m224352R();
            m224347M();
            m224349O(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m224357p() {
    }

    /* JADX INFO: renamed from: q */
    public final boolean m224358q() {
        View rightmostChild;
        if (m224341G(this.f210106q) && (rightmostChild = getRightmostChild()) != null) {
            int i = this.f210104o;
            int right = (this.f210101l + (rightmostChild.getRight() - getPaddingLeft())) - getRenderWidth();
            this.f210104o = right;
            if (right < 0) {
                this.f210104o = 0;
            }
            if (this.f210104o != i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m224359r(Canvas canvas, Rect rect) {
        Drawable drawable = this.f210100k;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.f210100k.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m224360s(Canvas canvas) {
        int childCount = getChildCount();
        Rect rect = this.f210097h;
        rect.top = getPaddingTop();
        Rect rect2 = this.f210097h;
        rect2.bottom = rect2.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m224341G(this.f210106q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f210099j;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m224359r(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m224359r(canvas, rect);
                }
            }
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f210094e;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f210088B);
        }
        if (listAdapter != null) {
            this.f210109t = false;
            this.f210094e = listAdapter;
            listAdapter.registerDataSetObserver(this.f210088B);
        }
        m224338D(this.f210094e.getViewTypeCount());
        m224350P();
    }

    public void setDivider(Drawable drawable) {
        this.f210100k = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f210099j = i;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f210087A = onClickListener;
    }

    public void setOnScrollStateChangedListener(OnScrollStateChangedListener onScrollStateChangedListener) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        this.f210107r = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setActivated(false);
        }
        if (getSelectedView() != null) {
            getSelectedView().setActivated(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m224361t(Canvas canvas) {
        mke mkeVar = this.f210111v;
        if (mkeVar != null && !mkeVar.m158760d() && m224339E()) {
            int iSave = canvas.save();
            int height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((-height) + getPaddingBottom(), 0.0f);
            this.f210111v.m158764j(getRenderHeight(), getRenderWidth());
            if (this.f210111v.m158759b(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(iSave);
            return;
        }
        mke mkeVar2 = this.f210112w;
        if (mkeVar2 == null || mkeVar2.m158760d() || !m224339E()) {
            return;
        }
        int iSave2 = canvas.save();
        int width = getWidth();
        canvas.rotate(90.0f, 0.0f, 0.0f);
        canvas.translate(getPaddingTop(), -width);
        this.f210112w.m158764j(getRenderHeight(), getRenderWidth());
        if (this.f210112w.m158759b(canvas)) {
            invalidate();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: u */
    public final void m224362u(int i) {
        View rightmostChild = getRightmostChild();
        m224364w(rightmostChild != null ? rightmostChild.getRight() : 0, i);
        View leftmostChild = getLeftmostChild();
        m224363v(leftmostChild != null ? leftmostChild.getLeft() : 0, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m224363v(int i, int i2) {
        int i3;
        while ((i + i2) - this.f210099j > 0 && (i3 = this.f210105p) >= 1) {
            int i4 = i3 - 1;
            this.f210105p = i4;
            View view = this.f210094e.getView(i4, m224335A(i4), this);
            if (this.f210105p == this.f210107r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m224354m(view, 0);
            i -= this.f210105p == 0 ? view.getMeasuredWidth() : this.f210099j + view.getMeasuredWidth();
            this.f210093d -= i + i2 == 0 ? view.getMeasuredWidth() : view.getMeasuredWidth() + this.f210099j;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m224364w(int i, int i2) {
        while (i + i2 + this.f210099j < getWidth() && this.f210106q + 1 < this.f210094e.getCount()) {
            int i3 = this.f210106q + 1;
            this.f210106q = i3;
            if (this.f210105p < 0) {
                this.f210105p = i3;
            }
            View view = this.f210094e.getView(i3, m224335A(i3), this);
            int i4 = 0;
            if (this.f210106q == this.f210107r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            m224354m(view, -1);
            if (this.f210106q != 0) {
                i4 = this.f210099j;
            }
            i += i4 + view.getMeasuredWidth();
            m224357p();
        }
    }

    /* JADX INFO: renamed from: x */
    public final View m224365x(int i) {
        int i2 = this.f210105p;
        if (i < i2 || i > this.f210106q) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* JADX INFO: renamed from: y */
    public final int m224366y(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f210097h);
            if (this.f210097h.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public final ViewGroup.LayoutParams m224367z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-2, -1) : layoutParams;
    }

    @Override // android.widget.AdapterView
    public ListAdapter getAdapter() {
        return this.f210094e;
    }
}
