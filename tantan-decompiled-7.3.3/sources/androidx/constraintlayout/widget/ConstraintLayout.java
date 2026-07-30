package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.C0211a;
import androidx.constraintlayout.solver.widgets.C0215e;
import androidx.constraintlayout.solver.widgets.C0217g;
import androidx.constraintlayout.solver.widgets.C0219i;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import p153l.pa00;
import p153l.qhc0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean CACHE_MEASURED_DIMENSION = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.3";
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    private C0223a mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    private boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    C0215e mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    private pa00 mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOptimizationLevel;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C0215e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        init(null);
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C0221a) viewFindViewById.getLayoutParams()).f1260l0;
    }

    private void init(AttributeSet attributeSet) {
        this.mLayoutWidget.m1001W(this);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qhc0.f157587a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == qhc0.f157599e) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == qhc0.f157602f) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == qhc0.f157593c) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == qhc0.f157596d) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == qhc0.f157609h0) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == qhc0.f157611i) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0223a c0223a = new C0223a();
                        this.mConstraintSet = c0223a;
                        c0223a.m1160n(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m1094d1(this.mOptimizationLevel);
    }

    private void internalMeasureChildren(int i, int i2) {
        boolean z;
        boolean z2;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0221a c0221a = (C0221a) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = c0221a.f1260l0;
                if (!c0221a.f1235Y && !c0221a.f1236Z) {
                    constraintWidget.m1052x0(childAt.getVisibility());
                    int measuredWidth = ((ViewGroup.MarginLayoutParams) c0221a).width;
                    int measuredHeight = ((ViewGroup.MarginLayoutParams) c0221a).height;
                    boolean z4 = c0221a.f1232V;
                    if (z4 || (z3 = c0221a.f1233W) || (!z4 && c0221a.f1219I == 1) || measuredWidth == -1 || (!z3 && (c0221a.f1220J == 1 || measuredHeight == -1))) {
                        if (measuredWidth == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else if (measuredWidth == -1) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, -1);
                            z = false;
                        } else {
                            z = measuredWidth == -2;
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i, paddingLeft, measuredWidth);
                        }
                        if (measuredHeight == 0) {
                            z2 = true;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                        } else if (measuredHeight == -1) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                            z2 = false;
                        } else {
                            z2 = measuredHeight == -2;
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, measuredHeight);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        pa00 pa00Var = this.mMetrics;
                        if (pa00Var != null) {
                            pa00Var.f151204a++;
                        }
                        constraintWidget.m1056z0(measuredWidth == -2);
                        constraintWidget.m1010c0(measuredHeight == -2);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    constraintWidget.m1054y0(measuredWidth);
                    constraintWidget.m1008b0(measuredHeight);
                    if (z) {
                        constraintWidget.m974B0(measuredWidth);
                    }
                    if (z2) {
                        constraintWidget.m972A0(measuredHeight);
                    }
                    if (c0221a.f1234X && (baseline = childAt.getBaseline()) != -1) {
                        constraintWidget.m1000V(baseline);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    private void internalMeasureDimensions(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int childMeasureSpec;
        int i6;
        boolean z2;
        int childMeasureSpec2;
        int i7;
        int i8;
        int baseline;
        ConstraintLayout constraintLayout = this;
        int i9 = i;
        int paddingTop = constraintLayout.getPaddingTop() + constraintLayout.getPaddingBottom();
        int paddingLeft = constraintLayout.getPaddingLeft() + constraintLayout.getPaddingRight();
        int childCount = constraintLayout.getChildCount();
        int i10 = 0;
        while (true) {
            i3 = 8;
            if (i10 >= childCount) {
                break;
            }
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0221a c0221a = (C0221a) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = c0221a.f1260l0;
                if (!c0221a.f1235Y && !c0221a.f1236Z) {
                    constraintWidget.m1052x0(childAt.getVisibility());
                    int i11 = ((ViewGroup.MarginLayoutParams) c0221a).width;
                    int i12 = ((ViewGroup.MarginLayoutParams) c0221a).height;
                    if (i11 == 0 || i12 == 0) {
                        constraintWidget.m1051x().m184234c();
                        constraintWidget.m1049w().m184234c();
                    } else {
                        boolean z3 = i11 == -2;
                        int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i9, paddingLeft, i11);
                        boolean z4 = i12 == -2;
                        childAt.measure(childMeasureSpec3, ViewGroup.getChildMeasureSpec(i2, paddingTop, i12));
                        pa00 pa00Var = constraintLayout.mMetrics;
                        if (pa00Var != null) {
                            pa00Var.f151204a++;
                            i8 = -2;
                        } else {
                            i8 = -2;
                        }
                        constraintWidget.m1056z0(i11 == i8);
                        constraintWidget.m1010c0(i12 == i8);
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        constraintWidget.m1054y0(measuredWidth);
                        constraintWidget.m1008b0(measuredHeight);
                        if (z3) {
                            constraintWidget.m974B0(measuredWidth);
                        }
                        if (z4) {
                            constraintWidget.m972A0(measuredHeight);
                        }
                        if (c0221a.f1234X && (baseline = childAt.getBaseline()) != -1) {
                            constraintWidget.m1000V(baseline);
                        }
                        if (c0221a.f1232V && c0221a.f1233W) {
                            constraintWidget.m1051x().m179602h(measuredWidth);
                            constraintWidget.m1049w().m179602h(measuredHeight);
                        }
                    }
                }
            }
            i10++;
        }
        constraintLayout.mLayoutWidget.m1096f1();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2.getVisibility() == i3) {
                i4 = childCount;
                i5 = i13;
            } else {
                C0221a c0221a2 = (C0221a) childAt2.getLayoutParams();
                ConstraintWidget constraintWidget2 = c0221a2.f1260l0;
                if (c0221a2.f1235Y || c0221a2.f1236Z) {
                    i4 = childCount;
                    i5 = i13;
                } else {
                    constraintWidget2.m1052x0(childAt2.getVisibility());
                    int i14 = ((ViewGroup.MarginLayoutParams) c0221a2).width;
                    int i15 = ((ViewGroup.MarginLayoutParams) c0221a2).height;
                    if (i14 == 0 || i15 == 0) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        C0219i c0219iM962f = constraintWidget2.mo1019h(type).m962f();
                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                        C0219i c0219iM962f2 = constraintWidget2.mo1019h(type2).m962f();
                        boolean z5 = (constraintWidget2.mo1019h(type).m965i() == null || constraintWidget2.mo1019h(type2).m965i() == null) ? false : true;
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                        C0219i c0219iM962f3 = constraintWidget2.mo1019h(type3).m962f();
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                        C0219i c0219iM962f4 = constraintWidget2.mo1019h(type4).m962f();
                        boolean z6 = (constraintWidget2.mo1019h(type3).m965i() == null || constraintWidget2.mo1019h(type4).m965i() == null) ? false : true;
                        if (i14 == 0 && i15 == 0 && z5 && z6) {
                            i4 = childCount;
                            i5 = i13;
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = constraintLayout.mLayoutWidget.m1041s();
                            i4 = childCount;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            boolean z7 = dimensionBehaviourM1041s != dimensionBehaviour;
                            i5 = i13;
                            boolean z8 = constraintLayout.mLayoutWidget.m973B() != dimensionBehaviour;
                            if (!z7) {
                                constraintWidget2.m1051x().m184234c();
                            }
                            if (!z8) {
                                constraintWidget2.m1049w().m184234c();
                            }
                            if (i14 == 0) {
                                if (z7 && constraintWidget2.m994P() && z5 && c0219iM962f.m184235d() && c0219iM962f2.m184235d()) {
                                    int iM1121k = (int) (c0219iM962f2.m1121k() - c0219iM962f.m1121k());
                                    constraintWidget2.m1051x().m179602h(iM1121k);
                                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingLeft, iM1121k);
                                    i6 = iM1121k;
                                    z = false;
                                } else {
                                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingLeft, -2);
                                    z7 = false;
                                    i6 = i14;
                                    z = true;
                                }
                            } else if (i14 == -1) {
                                i6 = i14;
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingLeft, -1);
                                z = false;
                            } else {
                                boolean z9 = i14 == -2;
                                int childMeasureSpec4 = ViewGroup.getChildMeasureSpec(i9, paddingLeft, i14);
                                z = z9;
                                childMeasureSpec = childMeasureSpec4;
                                i6 = i14;
                            }
                            if (i15 == 0) {
                                if (z8 && constraintWidget2.m993O() && z6 && c0219iM962f3.m184235d() && c0219iM962f4.m184235d()) {
                                    int iM1121k2 = (int) (c0219iM962f4.m1121k() - c0219iM962f3.m1121k());
                                    constraintWidget2.m1049w().m179602h(iM1121k2);
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, iM1121k2);
                                    i7 = iM1121k2;
                                    z2 = false;
                                } else {
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                                    i7 = i15;
                                    z8 = false;
                                    z2 = true;
                                }
                            } else if (i15 == -1) {
                                i7 = i15;
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, paddingTop, -1);
                                z2 = false;
                            } else {
                                boolean z10 = i15 == -2;
                                int childMeasureSpec5 = ViewGroup.getChildMeasureSpec(i2, paddingTop, i15);
                                z2 = z10;
                                childMeasureSpec2 = childMeasureSpec5;
                                i7 = i15;
                            }
                            childAt2.measure(childMeasureSpec, childMeasureSpec2);
                            pa00 pa00Var2 = constraintLayout.mMetrics;
                            if (pa00Var2 != null) {
                                pa00Var2.f151204a++;
                            }
                            constraintWidget2.m1056z0(i6 == -2);
                            constraintWidget2.m1010c0(i7 == -2);
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            constraintWidget2.m1054y0(measuredWidth2);
                            constraintWidget2.m1008b0(measuredHeight2);
                            if (z) {
                                constraintWidget2.m974B0(measuredWidth2);
                            }
                            if (z2) {
                                constraintWidget2.m972A0(measuredHeight2);
                            }
                            if (z7) {
                                constraintWidget2.m1051x().m179602h(measuredWidth2);
                            } else {
                                constraintWidget2.m1051x().m179601g();
                            }
                            if (z8) {
                                constraintWidget2.m1049w().m179602h(measuredHeight2);
                            } else {
                                constraintWidget2.m1049w().m179601g();
                            }
                            if (c0221a2.f1234X) {
                                int baseline2 = childAt2.getBaseline();
                                if (baseline2 != -1) {
                                    constraintWidget2.m1000V(baseline2);
                                }
                            }
                        }
                    } else {
                        i4 = childCount;
                        i5 = i13;
                    }
                }
            }
            i3 = 8;
            i9 = i;
            i13 = i5 + 1;
            childCount = i4;
            constraintLayout = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v33 */
    private void setChildrenConstraints() {
        int i;
        float f;
        ConstraintWidget targetWidget;
        ConstraintWidget targetWidget2;
        ConstraintWidget targetWidget3;
        ConstraintWidget targetWidget4;
        int i2;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        ?? r3 = 0;
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).m1002X(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i4));
            if (viewWidget != null) {
                viewWidget.mo995Q();
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0223a c0223a = this.mConstraintSet;
        if (c0223a != null) {
            c0223a.m1148b(this);
        }
        this.mLayoutWidget.m144702M0();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo1137e(this);
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).m1145c(this);
            }
        }
        int i8 = 0;
        while (i8 < childCount) {
            View childAt4 = getChildAt(i8);
            ConstraintWidget viewWidget2 = getViewWidget(childAt4);
            if (viewWidget2 != null) {
                C0221a c0221a = (C0221a) childAt4.getLayoutParams();
                c0221a.m1139a();
                if (c0221a.f1262m0) {
                    c0221a.f1262m0 = r3;
                } else if (zIsInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt4.getId());
                        setDesignInformation(r3, resourceName2, Integer.valueOf(childAt4.getId()));
                        getTargetWidget(childAt4.getId()).m1002X(resourceName2.substring(resourceName2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                viewWidget2.m1052x0(childAt4.getVisibility());
                if (c0221a.f1238a0) {
                    viewWidget2.m1052x0(8);
                }
                viewWidget2.m1001W(childAt4);
                this.mLayoutWidget.m144699I0(viewWidget2);
                if (!c0221a.f1233W || !c0221a.f1232V) {
                    this.mVariableDimensionsWidgets.add(viewWidget2);
                }
                if (c0221a.f1235Y) {
                    C0217g c0217g = (C0217g) viewWidget2;
                    int i9 = c0221a.f1254i0;
                    int i10 = c0221a.f1256j0;
                    float f2 = c0221a.f1258k0;
                    if (f2 != -1.0f) {
                        c0217g.m1108L0(f2);
                    } else if (i9 != -1) {
                        c0217g.m1106J0(i9);
                    } else if (i10 != -1) {
                        c0217g.m1107K0(i10);
                    }
                } else if (c0221a.f1243d != -1 || c0221a.f1245e != -1 || c0221a.f1247f != -1 || c0221a.f1249g != -1 || c0221a.f1266q != -1 || c0221a.f1265p != -1 || c0221a.f1267r != -1 || c0221a.f1268s != -1 || c0221a.f1251h != -1 || c0221a.f1253i != -1 || c0221a.f1255j != -1 || c0221a.f1257k != -1 || c0221a.f1259l != -1 || c0221a.f1227Q != -1 || c0221a.f1228R != -1 || c0221a.f1261m != -1 || ((ViewGroup.MarginLayoutParams) c0221a).width == -1 || ((ViewGroup.MarginLayoutParams) c0221a).height == -1) {
                    int i11 = c0221a.f1240b0;
                    int i12 = c0221a.f1242c0;
                    int i13 = c0221a.f1244d0;
                    int i14 = c0221a.f1246e0;
                    int i15 = c0221a.f1248f0;
                    int i16 = c0221a.f1250g0;
                    float f3 = c0221a.f1252h0;
                    int i17 = c0221a.f1261m;
                    if (i17 != -1) {
                        ConstraintWidget targetWidget5 = getTargetWidget(i17);
                        if (targetWidget5 != null) {
                            viewWidget2.m1015f(targetWidget5, c0221a.f1264o, c0221a.f1263n);
                        }
                    } else {
                        if (i11 != -1) {
                            ConstraintWidget targetWidget6 = getTargetWidget(i11);
                            if (targetWidget6 != null) {
                                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                                i = i16;
                                f = f3;
                                viewWidget2.m988J(type, targetWidget6, type, ((ViewGroup.MarginLayoutParams) c0221a).leftMargin, i15);
                            } else {
                                i = i16;
                                f = f3;
                            }
                        } else {
                            i = i16;
                            f = f3;
                            if (i12 != -1 && (targetWidget = getTargetWidget(i12)) != null) {
                                viewWidget2.m988J(ConstraintAnchor.Type.LEFT, targetWidget, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) c0221a).leftMargin, i15);
                            }
                        }
                        if (i13 != -1) {
                            ConstraintWidget targetWidget7 = getTargetWidget(i13);
                            if (targetWidget7 != null) {
                                viewWidget2.m988J(ConstraintAnchor.Type.RIGHT, targetWidget7, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) c0221a).rightMargin, i);
                            }
                        } else {
                            int i18 = i;
                            if (i14 != -1 && (targetWidget2 = getTargetWidget(i14)) != null) {
                                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                                viewWidget2.m988J(type2, targetWidget2, type2, ((ViewGroup.MarginLayoutParams) c0221a).rightMargin, i18);
                            }
                        }
                        int i19 = c0221a.f1251h;
                        if (i19 != -1) {
                            ConstraintWidget targetWidget8 = getTargetWidget(i19);
                            if (targetWidget8 != null) {
                                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                                viewWidget2.m988J(type3, targetWidget8, type3, ((ViewGroup.MarginLayoutParams) c0221a).topMargin, c0221a.f1270u);
                            }
                        } else {
                            int i20 = c0221a.f1253i;
                            if (i20 != -1 && (targetWidget3 = getTargetWidget(i20)) != null) {
                                viewWidget2.m988J(ConstraintAnchor.Type.TOP, targetWidget3, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) c0221a).topMargin, c0221a.f1270u);
                            }
                        }
                        int i21 = c0221a.f1255j;
                        if (i21 != -1) {
                            ConstraintWidget targetWidget9 = getTargetWidget(i21);
                            if (targetWidget9 != null) {
                                viewWidget2.m988J(ConstraintAnchor.Type.BOTTOM, targetWidget9, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin, c0221a.f1272w);
                            }
                        } else {
                            int i22 = c0221a.f1257k;
                            if (i22 != -1 && (targetWidget4 = getTargetWidget(i22)) != null) {
                                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                                viewWidget2.m988J(type4, targetWidget4, type4, ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin, c0221a.f1272w);
                            }
                        }
                        int i23 = c0221a.f1259l;
                        if (i23 != -1) {
                            View view = this.mChildrenByIds.get(i23);
                            ConstraintWidget targetWidget10 = getTargetWidget(c0221a.f1259l);
                            if (targetWidget10 != null && view != null && (view.getLayoutParams() instanceof C0221a)) {
                                C0221a c0221a2 = (C0221a) view.getLayoutParams();
                                c0221a.f1234X = true;
                                c0221a2.f1234X = true;
                                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BASELINE;
                                viewWidget2.mo1019h(type5).m957a(targetWidget10.mo1019h(type5), 0, -1, ConstraintAnchor.Strength.STRONG, 0, true);
                                viewWidget2.mo1019h(ConstraintAnchor.Type.TOP).m969m();
                                viewWidget2.mo1019h(ConstraintAnchor.Type.BOTTOM).m969m();
                            }
                        }
                        if (f >= 0.0f && f != 0.5f) {
                            viewWidget2.m1012d0(f);
                        }
                        float f4 = c0221a.f1211A;
                        if (f4 >= 0.0f && f4 != 0.5f) {
                            viewWidget2.m1040r0(f4);
                        }
                    }
                    if (zIsInEditMode && ((i2 = c0221a.f1227Q) != -1 || c0221a.f1228R != -1)) {
                        viewWidget2.m1034o0(i2, c0221a.f1228R);
                    }
                    if (c0221a.f1232V) {
                        viewWidget2.m1018g0(ConstraintWidget.DimensionBehaviour.FIXED);
                        viewWidget2.m1054y0(((ViewGroup.MarginLayoutParams) c0221a).width);
                    } else if (((ViewGroup.MarginLayoutParams) c0221a).width == -1) {
                        viewWidget2.m1018g0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.mo1019h(ConstraintAnchor.Type.LEFT).f1033e = ((ViewGroup.MarginLayoutParams) c0221a).leftMargin;
                        viewWidget2.mo1019h(ConstraintAnchor.Type.RIGHT).f1033e = ((ViewGroup.MarginLayoutParams) c0221a).rightMargin;
                    } else {
                        viewWidget2.m1018g0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                        viewWidget2.m1054y0(0);
                    }
                    if (c0221a.f1233W) {
                        r3 = 0;
                        viewWidget2.m1046u0(ConstraintWidget.DimensionBehaviour.FIXED);
                        viewWidget2.m1008b0(((ViewGroup.MarginLayoutParams) c0221a).height);
                    } else if (((ViewGroup.MarginLayoutParams) c0221a).height == -1) {
                        viewWidget2.m1046u0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.mo1019h(ConstraintAnchor.Type.TOP).f1033e = ((ViewGroup.MarginLayoutParams) c0221a).topMargin;
                        viewWidget2.mo1019h(ConstraintAnchor.Type.BOTTOM).f1033e = ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin;
                        r3 = 0;
                    } else {
                        viewWidget2.m1046u0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                        r3 = 0;
                        viewWidget2.m1008b0(0);
                    }
                    String str = c0221a.f1212B;
                    if (str != null) {
                        viewWidget2.m1003Y(str);
                    }
                    viewWidget2.m1022i0(c0221a.f1215E);
                    viewWidget2.m1050w0(c0221a.f1216F);
                    viewWidget2.m1014e0(c0221a.f1217G);
                    viewWidget2.m1042s0(c0221a.f1218H);
                    viewWidget2.m1020h0(c0221a.f1219I, c0221a.f1221K, c0221a.f1223M, c0221a.f1225O);
                    viewWidget2.m1048v0(c0221a.f1220J, c0221a.f1222L, c0221a.f1224N, c0221a.f1226P);
                }
            }
            i8++;
            r3 = r3;
        }
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        int iMin;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                iMin = Math.min(this.mMaxWidth, size) - paddingLeft;
                dimensionBehaviour = dimensionBehaviour2;
            }
            iMin = 0;
        } else {
            iMin = size;
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.mMaxHeight, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.m1030m0(0);
        this.mLayoutWidget.m1028l0(0);
        this.mLayoutWidget.m1018g0(dimensionBehaviour);
        this.mLayoutWidget.m1054y0(iMin);
        this.mLayoutWidget.m1046u0(dimensionBehaviour2);
        this.mLayoutWidget.m1008b0(size2);
        this.mLayoutWidget.m1030m0((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.m1028l0((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    private void updateHierarchy() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                this.mVariableDimensionsWidgets.clear();
                setChildrenConstraints();
                return;
            }
        }
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).m1144b(this);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).m1136d(this);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0221a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(Constants.SEPARATOR_COMMA);
                    if (strArrSplit.length == 4) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        int i4 = Integer.parseInt(strArrSplit[2]);
                        int i5 = (int) ((i2 / 1080.0f) * width);
                        int i6 = (int) ((i3 / 1920.0f) * height);
                        int i7 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i5;
                        float f2 = i6;
                        float f3 = i5 + ((int) ((i4 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i6 + i7;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(pa00 pa00Var) {
        this.mMetrics = pa00Var;
        this.mLayoutWidget.m1082R0(pa00Var);
    }

    @Override // android.view.ViewGroup
    public C0221a generateDefaultLayoutParams() {
        return new C0221a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0221a generateLayoutParams(AttributeSet attributeSet) {
        return new C0221a(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m1083S0();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C0221a) view.getLayoutParams()).f1260l0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0221a c0221a = (C0221a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = c0221a.f1260l0;
            if ((childAt.getVisibility() != 8 || c0221a.f1235Y || c0221a.f1236Z || zIsInEditMode) && !c0221a.f1238a0) {
                int iM1035p = constraintWidget.m1035p();
                int iM1037q = constraintWidget.m1037q();
                int iM977D = constraintWidget.m977D() + iM1035p;
                int iM1039r = constraintWidget.m1039r() + iM1037q;
                childAt.layout(iM1035p, iM1037q, iM977D, iM1039r);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM1035p, iM1037q, iM977D, iM1039r);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo1135c(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[PHI: r11
      0x0117: PHI (r11v1 int) = (r11v0 int), (r11v10 int), (r11v10 int) binds: [B:38:0x00ca, B:54:0x010a, B:56:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int iMax;
        int i8;
        int i9;
        int baseline;
        System.currentTimeMillis();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.mLayoutWidget.m976C0(paddingLeft);
        this.mLayoutWidget.m978D0(paddingTop);
        this.mLayoutWidget.m1026k0(this.mMaxWidth);
        this.mLayoutWidget.m1024j0(this.mMaxHeight);
        int iCombineMeasuredStates = 0;
        this.mLayoutWidget.m1095e1(getLayoutDirection() == 1);
        setSelfDimensionBehaviour(i, i2);
        int iM977D = this.mLayoutWidget.m977D();
        int iM1039r = this.mLayoutWidget.m1039r();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            updateHierarchy();
            z = true;
        } else {
            z = false;
        }
        boolean z4 = (this.mOptimizationLevel & 8) == 8;
        if (z4) {
            this.mLayoutWidget.m1092b1();
            this.mLayoutWidget.m1090Z0(iM977D, iM1039r);
            internalMeasureDimensions(i, i2);
        } else {
            internalMeasureChildren(i, i2);
        }
        updatePostMeasures();
        if (getChildCount() > 0 && z) {
            C0211a.m1057a(this.mLayoutWidget);
        }
        C0215e c0215e = this.mLayoutWidget;
        if (c0215e.f1143I0) {
            if (c0215e.f1144J0 && mode == Integer.MIN_VALUE) {
                int i10 = c0215e.f1146L0;
                if (i10 < size) {
                    c0215e.m1054y0(i10);
                }
                this.mLayoutWidget.m1018g0(ConstraintWidget.DimensionBehaviour.FIXED);
            }
            C0215e c0215e2 = this.mLayoutWidget;
            if (c0215e2.f1145K0 && mode2 == Integer.MIN_VALUE) {
                int i11 = c0215e2.f1147M0;
                if (i11 < size2) {
                    c0215e2.m1008b0(i11);
                }
                this.mLayoutWidget.m1046u0(ConstraintWidget.DimensionBehaviour.FIXED);
            }
        }
        if ((this.mOptimizationLevel & 32) == 32) {
            int iM977D2 = this.mLayoutWidget.m977D();
            int iM1039r2 = this.mLayoutWidget.m1039r();
            if (this.mLastMeasureWidth != iM977D2 && mode == 1073741824) {
                C0211a.m1065i(this.mLayoutWidget.f1142H0, 0, iM977D2);
            }
            if (this.mLastMeasureHeight != iM1039r2 && mode2 == 1073741824) {
                C0211a.m1065i(this.mLayoutWidget.f1142H0, 1, iM1039r2);
            }
            C0215e c0215e3 = this.mLayoutWidget;
            if (!c0215e3.f1144J0 || c0215e3.f1146L0 <= size) {
                iCombineMeasuredStates = 0;
            } else {
                iCombineMeasuredStates = 0;
                C0211a.m1065i(c0215e3.f1142H0, 0, size);
            }
            C0215e c0215e4 = this.mLayoutWidget;
            if (!c0215e4.f1145K0 || c0215e4.f1147M0 <= size2) {
                i3 = 1;
            } else {
                i3 = 1;
                C0211a.m1065i(c0215e4.f1142H0, 1, size2);
            }
        } else {
            i3 = 1;
        }
        if (getChildCount() > 0) {
            solveLinearSystem("First pass");
        }
        int size3 = this.mVariableDimensionsWidgets.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourM1041s = this.mLayoutWidget.m1041s();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int i12 = dimensionBehaviourM1041s == dimensionBehaviour ? i3 : iCombineMeasuredStates;
            int i13 = this.mLayoutWidget.m973B() == dimensionBehaviour ? i3 : iCombineMeasuredStates;
            int iMax2 = Math.max(this.mLayoutWidget.m977D(), this.mMinWidth);
            int iMax3 = Math.max(this.mLayoutWidget.m1039r(), this.mMinHeight);
            int i14 = iCombineMeasuredStates;
            int i15 = iMax2;
            int i16 = i14;
            while (i16 < size3) {
                ConstraintWidget constraintWidget = this.mVariableDimensionsWidgets.get(i16);
                int i17 = i12;
                View view = (View) constraintWidget.m1029m();
                if (view == null) {
                    i5 = i13;
                    i6 = i16;
                } else {
                    i5 = i13;
                    C0221a c0221a = (C0221a) view.getLayoutParams();
                    i6 = i16;
                    if (!c0221a.f1236Z && !c0221a.f1235Y) {
                        i7 = i14;
                        if (view.getVisibility() == 8 || (z4 && constraintWidget.m1051x().m184235d() && constraintWidget.m1049w().m184235d())) {
                            paddingRight = paddingRight;
                            i15 = i15;
                            i14 = i7;
                        } else {
                            int i18 = ((ViewGroup.MarginLayoutParams) c0221a).width;
                            int childMeasureSpec = (i18 == -2 && c0221a.f1232V) ? ViewGroup.getChildMeasureSpec(i, paddingRight, i18) : View.MeasureSpec.makeMeasureSpec(constraintWidget.m977D(), 1073741824);
                            int i19 = ((ViewGroup.MarginLayoutParams) c0221a).height;
                            paddingRight = paddingRight;
                            view.measure(childMeasureSpec, (i19 == -2 && c0221a.f1233W) ? ViewGroup.getChildMeasureSpec(i2, paddingBottom, i19) : View.MeasureSpec.makeMeasureSpec(constraintWidget.m1039r(), 1073741824));
                            pa00 pa00Var = this.mMetrics;
                            if (pa00Var != null) {
                                pa00Var.f151205b++;
                            }
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            if (measuredWidth != constraintWidget.m977D()) {
                                constraintWidget.m1054y0(measuredWidth);
                                if (z4) {
                                    constraintWidget.m1051x().m179602h(measuredWidth);
                                }
                                if (i17 != 0) {
                                    iMax = i15;
                                    if (constraintWidget.m1053y() > iMax) {
                                        iMax = Math.max(iMax, constraintWidget.m1053y() + constraintWidget.mo1019h(ConstraintAnchor.Type.RIGHT).m960d());
                                    }
                                    i7 = 1;
                                } else {
                                    iMax = i15;
                                }
                                i7 = 1;
                            } else {
                                iMax = i15;
                                view = view;
                            }
                            if (measuredHeight != constraintWidget.m1039r()) {
                                constraintWidget.m1008b0(measuredHeight);
                                if (z4) {
                                    constraintWidget.m1049w().m179602h(measuredHeight);
                                }
                                if (i5 != 0 && constraintWidget.m1027l() > iMax3) {
                                    iMax3 = Math.max(iMax3, constraintWidget.m1027l() + constraintWidget.mo1019h(ConstraintAnchor.Type.BOTTOM).m960d());
                                }
                                i8 = iMax3;
                                i9 = 1;
                            } else {
                                i8 = iMax3;
                                i9 = i7;
                            }
                            if (c0221a.f1234X && (baseline = view.getBaseline()) != -1 && baseline != constraintWidget.m1023j()) {
                                constraintWidget.m1000V(baseline);
                                i9 = 1;
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            i15 = iMax;
                            i14 = i9;
                            iMax3 = i8;
                        }
                    }
                    i16 = i6 + 1;
                    i12 = i17;
                    i13 = i5;
                    paddingRight = paddingRight;
                }
                i7 = i14;
                i15 = i15;
                i14 = i7;
                i16 = i6 + 1;
                i12 = i17;
                i13 = i5;
                paddingRight = paddingRight;
            }
            i4 = paddingRight;
            int i20 = i14;
            int i21 = i15;
            if (i20 != 0) {
                this.mLayoutWidget.m1054y0(iM977D);
                this.mLayoutWidget.m1008b0(iM1039r);
                if (z4) {
                    this.mLayoutWidget.m1096f1();
                }
                solveLinearSystem("2nd pass");
                if (this.mLayoutWidget.m977D() < i21) {
                    this.mLayoutWidget.m1054y0(i21);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.mLayoutWidget.m1039r() < iMax3) {
                    this.mLayoutWidget.m1008b0(iMax3);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    solveLinearSystem("3rd pass");
                }
            }
            for (int i22 = 0; i22 < size3; i22++) {
                ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i22);
                View view2 = (View) constraintWidget2.m1029m();
                if (view2 != null && (view2.getMeasuredWidth() != constraintWidget2.m977D() || view2.getMeasuredHeight() != constraintWidget2.m1039r())) {
                    if (constraintWidget2.m975C() != 8) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(constraintWidget2.m977D(), 1073741824), View.MeasureSpec.makeMeasureSpec(constraintWidget2.m1039r(), 1073741824));
                        pa00 pa00Var2 = this.mMetrics;
                        if (pa00Var2 != null) {
                            pa00Var2.f151205b++;
                        }
                    }
                }
            }
        } else {
            i4 = paddingRight;
            iCombineMeasuredStates = 0;
        }
        int iM977D3 = this.mLayoutWidget.m977D() + i4;
        int iM1039r3 = this.mLayoutWidget.m1039r() + paddingBottom;
        int iResolveSizeAndState = View.resolveSizeAndState(iM977D3, i, iCombineMeasuredStates);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM1039r3, i2, iCombineMeasuredStates << 16) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (this.mLayoutWidget.m1087W0()) {
            iMin |= 16777216;
        }
        if (this.mLayoutWidget.m1085U0()) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C0217g)) {
            C0221a c0221a = (C0221a) view.getLayoutParams();
            C0217g c0217g = new C0217g();
            c0221a.f1260l0 = c0217g;
            c0221a.f1235Y = true;
            c0217g.m1109M0(c0221a.f1229S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m1138f();
            ((C0221a) view.getLayoutParams()).f1236Z = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.m144701L0(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public void setConstraintSet(C0223a c0223a) {
        this.mConstraintSet = c0223a;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.m1094d1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void solveLinearSystem(String str) {
        this.mLayoutWidget.mo1077K0();
        pa00 pa00Var = this.mMetrics;
        if (pa00Var != null) {
            pa00Var.f151206c++;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0221a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C0215e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        init(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mVariableDimensionsWidgets = new ArrayList<>(100);
        this.mLayoutWidget = new C0215e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 7;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        init(attributeSet);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0221a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public float f1211A;

        /* JADX INFO: renamed from: B */
        public String f1212B;

        /* JADX INFO: renamed from: C */
        public float f1213C;

        /* JADX INFO: renamed from: D */
        public int f1214D;

        /* JADX INFO: renamed from: E */
        public float f1215E;

        /* JADX INFO: renamed from: F */
        public float f1216F;

        /* JADX INFO: renamed from: G */
        public int f1217G;

        /* JADX INFO: renamed from: H */
        public int f1218H;

        /* JADX INFO: renamed from: I */
        public int f1219I;

        /* JADX INFO: renamed from: J */
        public int f1220J;

        /* JADX INFO: renamed from: K */
        public int f1221K;

        /* JADX INFO: renamed from: L */
        public int f1222L;

        /* JADX INFO: renamed from: M */
        public int f1223M;

        /* JADX INFO: renamed from: N */
        public int f1224N;

        /* JADX INFO: renamed from: O */
        public float f1225O;

        /* JADX INFO: renamed from: P */
        public float f1226P;

        /* JADX INFO: renamed from: Q */
        public int f1227Q;

        /* JADX INFO: renamed from: R */
        public int f1228R;

        /* JADX INFO: renamed from: S */
        public int f1229S;

        /* JADX INFO: renamed from: T */
        public boolean f1230T;

        /* JADX INFO: renamed from: U */
        public boolean f1231U;

        /* JADX INFO: renamed from: V */
        public boolean f1232V;

        /* JADX INFO: renamed from: W */
        public boolean f1233W;

        /* JADX INFO: renamed from: X */
        public boolean f1234X;

        /* JADX INFO: renamed from: Y */
        public boolean f1235Y;

        /* JADX INFO: renamed from: Z */
        public boolean f1236Z;

        /* JADX INFO: renamed from: a */
        public int f1237a;

        /* JADX INFO: renamed from: a0 */
        public boolean f1238a0;

        /* JADX INFO: renamed from: b */
        public int f1239b;

        /* JADX INFO: renamed from: b0 */
        public int f1240b0;

        /* JADX INFO: renamed from: c */
        public float f1241c;

        /* JADX INFO: renamed from: c0 */
        public int f1242c0;

        /* JADX INFO: renamed from: d */
        public int f1243d;

        /* JADX INFO: renamed from: d0 */
        public int f1244d0;

        /* JADX INFO: renamed from: e */
        public int f1245e;

        /* JADX INFO: renamed from: e0 */
        public int f1246e0;

        /* JADX INFO: renamed from: f */
        public int f1247f;

        /* JADX INFO: renamed from: f0 */
        public int f1248f0;

        /* JADX INFO: renamed from: g */
        public int f1249g;

        /* JADX INFO: renamed from: g0 */
        public int f1250g0;

        /* JADX INFO: renamed from: h */
        public int f1251h;

        /* JADX INFO: renamed from: h0 */
        public float f1252h0;

        /* JADX INFO: renamed from: i */
        public int f1253i;

        /* JADX INFO: renamed from: i0 */
        public int f1254i0;

        /* JADX INFO: renamed from: j */
        public int f1255j;

        /* JADX INFO: renamed from: j0 */
        public int f1256j0;

        /* JADX INFO: renamed from: k */
        public int f1257k;

        /* JADX INFO: renamed from: k0 */
        public float f1258k0;

        /* JADX INFO: renamed from: l */
        public int f1259l;

        /* JADX INFO: renamed from: l0 */
        public ConstraintWidget f1260l0;

        /* JADX INFO: renamed from: m */
        public int f1261m;

        /* JADX INFO: renamed from: m0 */
        public boolean f1262m0;

        /* JADX INFO: renamed from: n */
        public int f1263n;

        /* JADX INFO: renamed from: o */
        public float f1264o;

        /* JADX INFO: renamed from: p */
        public int f1265p;

        /* JADX INFO: renamed from: q */
        public int f1266q;

        /* JADX INFO: renamed from: r */
        public int f1267r;

        /* JADX INFO: renamed from: s */
        public int f1268s;

        /* JADX INFO: renamed from: t */
        public int f1269t;

        /* JADX INFO: renamed from: u */
        public int f1270u;

        /* JADX INFO: renamed from: v */
        public int f1271v;

        /* JADX INFO: renamed from: w */
        public int f1272w;

        /* JADX INFO: renamed from: x */
        public int f1273x;

        /* JADX INFO: renamed from: y */
        public int f1274y;

        /* JADX INFO: renamed from: z */
        public float f1275z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f1276a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1276a = sparseIntArray;
                sparseIntArray.append(qhc0.f157551I, 8);
                sparseIntArray.append(qhc0.f157553J, 9);
                sparseIntArray.append(qhc0.f157557L, 10);
                sparseIntArray.append(qhc0.f157559M, 11);
                sparseIntArray.append(qhc0.f157569R, 12);
                sparseIntArray.append(qhc0.f157567Q, 13);
                sparseIntArray.append(qhc0.f157635q, 14);
                sparseIntArray.append(qhc0.f157632p, 15);
                sparseIntArray.append(qhc0.f157626n, 16);
                sparseIntArray.append(qhc0.f157638r, 2);
                sparseIntArray.append(qhc0.f157644t, 3);
                sparseIntArray.append(qhc0.f157641s, 4);
                sparseIntArray.append(qhc0.f157585Z, 49);
                sparseIntArray.append(qhc0.f157588a0, 50);
                sparseIntArray.append(qhc0.f157656x, 5);
                sparseIntArray.append(qhc0.f157659y, 6);
                sparseIntArray.append(qhc0.f157662z, 7);
                sparseIntArray.append(qhc0.f157590b, 1);
                sparseIntArray.append(qhc0.f157561N, 17);
                sparseIntArray.append(qhc0.f157563O, 18);
                sparseIntArray.append(qhc0.f157653w, 19);
                sparseIntArray.append(qhc0.f157650v, 20);
                sparseIntArray.append(qhc0.f157597d0, 21);
                sparseIntArray.append(qhc0.f157606g0, 22);
                sparseIntArray.append(qhc0.f157600e0, 23);
                sparseIntArray.append(qhc0.f157591b0, 24);
                sparseIntArray.append(qhc0.f157603f0, 25);
                sparseIntArray.append(qhc0.f157594c0, 26);
                sparseIntArray.append(qhc0.f157539E, 29);
                sparseIntArray.append(qhc0.f157571S, 30);
                sparseIntArray.append(qhc0.f157647u, 44);
                sparseIntArray.append(qhc0.f157545G, 45);
                sparseIntArray.append(qhc0.f157575U, 46);
                sparseIntArray.append(qhc0.f157542F, 47);
                sparseIntArray.append(qhc0.f157573T, 48);
                sparseIntArray.append(qhc0.f157620l, 27);
                sparseIntArray.append(qhc0.f157617k, 28);
                sparseIntArray.append(qhc0.f157577V, 31);
                sparseIntArray.append(qhc0.f157527A, 32);
                sparseIntArray.append(qhc0.f157581X, 33);
                sparseIntArray.append(qhc0.f157579W, 34);
                sparseIntArray.append(qhc0.f157583Y, 35);
                sparseIntArray.append(qhc0.f157533C, 36);
                sparseIntArray.append(qhc0.f157530B, 37);
                sparseIntArray.append(qhc0.f157536D, 38);
                sparseIntArray.append(qhc0.f157548H, 39);
                sparseIntArray.append(qhc0.f157565P, 40);
                sparseIntArray.append(qhc0.f157555K, 41);
                sparseIntArray.append(qhc0.f157629o, 42);
                sparseIntArray.append(qhc0.f157623m, 43);
            }
        }

        public C0221a(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.f1237a = -1;
            this.f1239b = -1;
            this.f1241c = -1.0f;
            this.f1243d = -1;
            this.f1245e = -1;
            this.f1247f = -1;
            this.f1249g = -1;
            this.f1251h = -1;
            this.f1253i = -1;
            this.f1255j = -1;
            this.f1257k = -1;
            this.f1259l = -1;
            this.f1261m = -1;
            this.f1263n = 0;
            this.f1264o = 0.0f;
            this.f1265p = -1;
            this.f1266q = -1;
            this.f1267r = -1;
            this.f1268s = -1;
            this.f1269t = -1;
            this.f1270u = -1;
            this.f1271v = -1;
            this.f1272w = -1;
            this.f1273x = -1;
            this.f1274y = -1;
            this.f1275z = 0.5f;
            this.f1211A = 0.5f;
            this.f1212B = null;
            this.f1213C = 0.0f;
            this.f1214D = 1;
            this.f1215E = -1.0f;
            this.f1216F = -1.0f;
            this.f1217G = 0;
            this.f1218H = 0;
            this.f1219I = 0;
            this.f1220J = 0;
            this.f1221K = 0;
            this.f1222L = 0;
            this.f1223M = 0;
            this.f1224N = 0;
            this.f1225O = 1.0f;
            this.f1226P = 1.0f;
            this.f1227Q = -1;
            this.f1228R = -1;
            this.f1229S = -1;
            this.f1230T = false;
            this.f1231U = false;
            this.f1232V = true;
            this.f1233W = true;
            this.f1234X = false;
            this.f1235Y = false;
            this.f1236Z = false;
            this.f1238a0 = false;
            this.f1240b0 = -1;
            this.f1242c0 = -1;
            this.f1244d0 = -1;
            this.f1246e0 = -1;
            this.f1248f0 = -1;
            this.f1250g0 = -1;
            this.f1252h0 = 0.5f;
            this.f1260l0 = new ConstraintWidget();
            this.f1262m0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qhc0.f157587a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f1276a.get(index);
                switch (i3) {
                    case 1:
                        this.f1229S = typedArrayObtainStyledAttributes.getInt(index, this.f1229S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1261m);
                        this.f1261m = resourceId;
                        if (resourceId == -1) {
                            this.f1261m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f1263n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1263n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f1264o) % 360.0f;
                        this.f1264o = f;
                        if (f < 0.0f) {
                            this.f1264o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f1237a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1237a);
                        break;
                    case 6:
                        this.f1239b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1239b);
                        break;
                    case 7:
                        this.f1241c = typedArrayObtainStyledAttributes.getFloat(index, this.f1241c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1243d);
                        this.f1243d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1243d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1245e);
                        this.f1245e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1245e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1247f);
                        this.f1247f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1247f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1249g);
                        this.f1249g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1249g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1251h);
                        this.f1251h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1251h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1253i);
                        this.f1253i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1253i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1255j);
                        this.f1255j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1255j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1257k);
                        this.f1257k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1257k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1259l);
                        this.f1259l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1259l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1265p);
                        this.f1265p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1265p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1266q);
                        this.f1266q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1266q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1267r);
                        this.f1267r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1267r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1268s);
                        this.f1268s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1268s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f1269t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1269t);
                        break;
                    case 22:
                        this.f1270u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1270u);
                        break;
                    case 23:
                        this.f1271v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1271v);
                        break;
                    case 24:
                        this.f1272w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1272w);
                        break;
                    case 25:
                        this.f1273x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1273x);
                        break;
                    case 26:
                        this.f1274y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1274y);
                        break;
                    case 27:
                        this.f1230T = typedArrayObtainStyledAttributes.getBoolean(index, this.f1230T);
                        break;
                    case 28:
                        this.f1231U = typedArrayObtainStyledAttributes.getBoolean(index, this.f1231U);
                        break;
                    case 29:
                        this.f1275z = typedArrayObtainStyledAttributes.getFloat(index, this.f1275z);
                        break;
                    case 30:
                        this.f1211A = typedArrayObtainStyledAttributes.getFloat(index, this.f1211A);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1219I = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1220J = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f1221K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1221K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1221K) == -2) {
                                this.f1221K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f1223M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1223M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1223M) == -2) {
                                this.f1223M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f1225O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1225O));
                        break;
                    case 36:
                        try {
                            this.f1222L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1222L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1222L) == -2) {
                                this.f1222L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f1224N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1224N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1224N) == -2) {
                                this.f1224N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f1226P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f1226P));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f1212B = string;
                                this.f1213C = Float.NaN;
                                this.f1214D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f1212B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f1212B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f1214D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f1214D = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f1212B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f1212B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            this.f1213C = Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f1212B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.f1212B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.f1214D == 1) {
                                                        this.f1213C = Math.abs(f3 / f2);
                                                    } else {
                                                        this.f1213C = Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f1215E = typedArrayObtainStyledAttributes.getFloat(index, this.f1215E);
                                break;
                            case 46:
                                this.f1216F = typedArrayObtainStyledAttributes.getFloat(index, this.f1216F);
                                break;
                            case 47:
                                this.f1217G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1218H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1227Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1227Q);
                                break;
                            case 50:
                                this.f1228R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1228R);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m1139a();
        }

        /* JADX INFO: renamed from: a */
        public void m1139a() {
            this.f1235Y = false;
            this.f1232V = true;
            this.f1233W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f1230T) {
                this.f1232V = false;
                this.f1219I = 1;
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f1231U) {
                this.f1233W = false;
                this.f1220J = 1;
            }
            if (i == 0 || i == -1) {
                this.f1232V = false;
                if (i == 0 && this.f1219I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1230T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1233W = false;
                if (i2 == 0 && this.f1220J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1231U = true;
                }
            }
            if (this.f1241c == -1.0f && this.f1237a == -1 && this.f1239b == -1) {
                return;
            }
            this.f1235Y = true;
            this.f1232V = true;
            this.f1233W = true;
            if (!(this.f1260l0 instanceof C0217g)) {
                this.f1260l0 = new C0217g();
            }
            ((C0217g) this.f1260l0).m1109M0(this.f1229S);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0043  */
        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:22:0x0057  */
        /* JADX WARN: Code duplicated, block: B:25:0x005d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0073  */
        /* JADX WARN: Code duplicated, block: B:33:0x007b  */
        /* JADX WARN: Code duplicated, block: B:35:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x0086  */
        /* JADX WARN: Code duplicated, block: B:38:0x008a  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            float f;
            int i6;
            int i7;
            int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            this.f1244d0 = -1;
            this.f1246e0 = -1;
            this.f1240b0 = -1;
            this.f1242c0 = -1;
            this.f1248f0 = this.f1269t;
            this.f1250g0 = this.f1271v;
            this.f1252h0 = this.f1275z;
            this.f1254i0 = this.f1237a;
            this.f1256j0 = this.f1239b;
            this.f1258k0 = this.f1241c;
            int layoutDirection = getLayoutDirection();
            int i10 = this.f1265p;
            if (1 == layoutDirection) {
                if (i10 != -1) {
                    this.f1244d0 = i10;
                } else {
                    int i11 = this.f1266q;
                    if (i11 != -1) {
                        this.f1246e0 = i11;
                    } else {
                        z = false;
                    }
                    i2 = this.f1267r;
                    if (i2 != -1) {
                        this.f1242c0 = i2;
                        z = true;
                    }
                    i3 = this.f1268s;
                    if (i3 != -1) {
                        this.f1240b0 = i3;
                        z = true;
                    }
                    i4 = this.f1273x;
                    if (i4 != -1) {
                        this.f1250g0 = i4;
                    }
                    i5 = this.f1274y;
                    if (i5 != -1) {
                        this.f1248f0 = i5;
                    }
                    if (z) {
                        this.f1252h0 = 1.0f - this.f1275z;
                    }
                    if (this.f1235Y && this.f1229S == 1) {
                        f = this.f1241c;
                        if (f != -1.0f) {
                            this.f1258k0 = 1.0f - f;
                            this.f1254i0 = -1;
                            this.f1256j0 = -1;
                        } else {
                            i6 = this.f1237a;
                            if (i6 != -1) {
                                this.f1256j0 = i6;
                                this.f1254i0 = -1;
                                this.f1258k0 = -1.0f;
                            } else {
                                i7 = this.f1239b;
                                if (i7 != -1) {
                                    this.f1254i0 = i7;
                                    this.f1256j0 = -1;
                                    this.f1258k0 = -1.0f;
                                }
                            }
                        }
                    }
                }
                z = true;
                i2 = this.f1267r;
                if (i2 != -1) {
                    this.f1242c0 = i2;
                    z = true;
                }
                i3 = this.f1268s;
                if (i3 != -1) {
                    this.f1240b0 = i3;
                    z = true;
                }
                i4 = this.f1273x;
                if (i4 != -1) {
                    this.f1250g0 = i4;
                }
                i5 = this.f1274y;
                if (i5 != -1) {
                    this.f1248f0 = i5;
                }
                if (z) {
                    this.f1252h0 = 1.0f - this.f1275z;
                }
                if (this.f1235Y) {
                    f = this.f1241c;
                    if (f != -1.0f) {
                        this.f1258k0 = 1.0f - f;
                        this.f1254i0 = -1;
                        this.f1256j0 = -1;
                    } else {
                        i6 = this.f1237a;
                        if (i6 != -1) {
                            this.f1256j0 = i6;
                            this.f1254i0 = -1;
                            this.f1258k0 = -1.0f;
                        } else {
                            i7 = this.f1239b;
                            if (i7 != -1) {
                                this.f1254i0 = i7;
                                this.f1256j0 = -1;
                                this.f1258k0 = -1.0f;
                            }
                        }
                    }
                }
            } else {
                if (i10 != -1) {
                    this.f1242c0 = i10;
                }
                int i12 = this.f1266q;
                if (i12 != -1) {
                    this.f1240b0 = i12;
                }
                int i13 = this.f1267r;
                if (i13 != -1) {
                    this.f1244d0 = i13;
                }
                int i14 = this.f1268s;
                if (i14 != -1) {
                    this.f1246e0 = i14;
                }
                int i15 = this.f1273x;
                if (i15 != -1) {
                    this.f1248f0 = i15;
                }
                int i16 = this.f1274y;
                if (i16 != -1) {
                    this.f1250g0 = i16;
                }
            }
            if (this.f1267r == -1 && this.f1268s == -1 && this.f1266q == -1 && this.f1265p == -1) {
                int i17 = this.f1247f;
                if (i17 != -1) {
                    this.f1244d0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                    }
                } else {
                    int i18 = this.f1249g;
                    if (i18 != -1) {
                        this.f1246e0 = i18;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                        }
                    }
                }
                int i19 = this.f1243d;
                if (i19 != -1) {
                    this.f1240b0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                    return;
                }
                int i20 = this.f1245e;
                if (i20 != -1) {
                    this.f1242c0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                }
            }
        }

        public C0221a(int i, int i2) {
            super(i, i2);
            this.f1237a = -1;
            this.f1239b = -1;
            this.f1241c = -1.0f;
            this.f1243d = -1;
            this.f1245e = -1;
            this.f1247f = -1;
            this.f1249g = -1;
            this.f1251h = -1;
            this.f1253i = -1;
            this.f1255j = -1;
            this.f1257k = -1;
            this.f1259l = -1;
            this.f1261m = -1;
            this.f1263n = 0;
            this.f1264o = 0.0f;
            this.f1265p = -1;
            this.f1266q = -1;
            this.f1267r = -1;
            this.f1268s = -1;
            this.f1269t = -1;
            this.f1270u = -1;
            this.f1271v = -1;
            this.f1272w = -1;
            this.f1273x = -1;
            this.f1274y = -1;
            this.f1275z = 0.5f;
            this.f1211A = 0.5f;
            this.f1212B = null;
            this.f1213C = 0.0f;
            this.f1214D = 1;
            this.f1215E = -1.0f;
            this.f1216F = -1.0f;
            this.f1217G = 0;
            this.f1218H = 0;
            this.f1219I = 0;
            this.f1220J = 0;
            this.f1221K = 0;
            this.f1222L = 0;
            this.f1223M = 0;
            this.f1224N = 0;
            this.f1225O = 1.0f;
            this.f1226P = 1.0f;
            this.f1227Q = -1;
            this.f1228R = -1;
            this.f1229S = -1;
            this.f1230T = false;
            this.f1231U = false;
            this.f1232V = true;
            this.f1233W = true;
            this.f1234X = false;
            this.f1235Y = false;
            this.f1236Z = false;
            this.f1238a0 = false;
            this.f1240b0 = -1;
            this.f1242c0 = -1;
            this.f1244d0 = -1;
            this.f1246e0 = -1;
            this.f1248f0 = -1;
            this.f1250g0 = -1;
            this.f1252h0 = 0.5f;
            this.f1260l0 = new ConstraintWidget();
            this.f1262m0 = false;
        }

        public C0221a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1237a = -1;
            this.f1239b = -1;
            this.f1241c = -1.0f;
            this.f1243d = -1;
            this.f1245e = -1;
            this.f1247f = -1;
            this.f1249g = -1;
            this.f1251h = -1;
            this.f1253i = -1;
            this.f1255j = -1;
            this.f1257k = -1;
            this.f1259l = -1;
            this.f1261m = -1;
            this.f1263n = 0;
            this.f1264o = 0.0f;
            this.f1265p = -1;
            this.f1266q = -1;
            this.f1267r = -1;
            this.f1268s = -1;
            this.f1269t = -1;
            this.f1270u = -1;
            this.f1271v = -1;
            this.f1272w = -1;
            this.f1273x = -1;
            this.f1274y = -1;
            this.f1275z = 0.5f;
            this.f1211A = 0.5f;
            this.f1212B = null;
            this.f1213C = 0.0f;
            this.f1214D = 1;
            this.f1215E = -1.0f;
            this.f1216F = -1.0f;
            this.f1217G = 0;
            this.f1218H = 0;
            this.f1219I = 0;
            this.f1220J = 0;
            this.f1221K = 0;
            this.f1222L = 0;
            this.f1223M = 0;
            this.f1224N = 0;
            this.f1225O = 1.0f;
            this.f1226P = 1.0f;
            this.f1227Q = -1;
            this.f1228R = -1;
            this.f1229S = -1;
            this.f1230T = false;
            this.f1231U = false;
            this.f1232V = true;
            this.f1233W = true;
            this.f1234X = false;
            this.f1235Y = false;
            this.f1236Z = false;
            this.f1238a0 = false;
            this.f1240b0 = -1;
            this.f1242c0 = -1;
            this.f1244d0 = -1;
            this.f1246e0 = -1;
            this.f1248f0 = -1;
            this.f1250g0 = -1;
            this.f1252h0 = 0.5f;
            this.f1260l0 = new ConstraintWidget();
            this.f1262m0 = false;
        }
    }
}
