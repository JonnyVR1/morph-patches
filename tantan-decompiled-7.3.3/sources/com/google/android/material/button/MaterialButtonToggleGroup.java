package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.C2489R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p153l.kkl0;
import p153l.pxw;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final String LOG_TAG = "MaterialButtonToggleGroup";

    @IdRes
    private int checkedId;
    private final CheckedStateTracker checkedStateTracker;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private final List<CornerData> originalCornerData;
    private final PressedStateTracker pressedStateTracker;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public class CheckedStateTracker implements MaterialButton.OnCheckedChangeListener {
        private CheckedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
        public void onCheckedChanged(@NonNull MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.skipCheckedStateTracker) {
                return;
            }
            if (MaterialButtonToggleGroup.this.singleSelection) {
                MaterialButtonToggleGroup.this.checkedId = z ? materialButton.getId() : -1;
            }
            MaterialButtonToggleGroup.this.dispatchOnButtonChecked(materialButton.getId(), z);
            MaterialButtonToggleGroup.this.updateCheckedStates(materialButton.getId(), z);
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public static class CornerData {
        private static final CornerSize noCorner = new AbsoluteCornerSize(0.0f);
        CornerSize bottomLeft;
        CornerSize bottomRight;
        CornerSize topLeft;
        CornerSize topRight;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.topLeft = cornerSize;
            this.topRight = cornerSize3;
            this.bottomRight = cornerSize4;
            this.bottomLeft = cornerSize2;
        }

        public static CornerData bottom(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerData.bottomLeft, cornerSize, cornerData.bottomRight);
        }

        public static CornerData end(CornerData cornerData, View view) {
            return ViewUtils.isLayoutRtl(view) ? left(cornerData) : right(cornerData);
        }

        public static CornerData left(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = cornerData.bottomLeft;
            CornerSize cornerSize3 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        public static CornerData right(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerSize, cornerData.topRight, cornerData.bottomRight);
        }

        public static CornerData start(CornerData cornerData, View view) {
            return ViewUtils.isLayoutRtl(view) ? right(cornerData) : left(cornerData);
        }

        public static CornerData top(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerData.topRight, cornerSize2);
        }
    }

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i, boolean z);
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.updateCheckedStates(materialButton.getId(), materialButton.isChecked());
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.originalCornerData = new ArrayList();
        this.checkedStateTracker = new CheckedStateTracker();
        this.pressedStateTracker = new PressedStateTracker();
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.childOrderComparator = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.skipCheckedStateTracker = false;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C2489R.styleable.MaterialButtonToggleGroup, i, C2489R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(C2489R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.checkedId = typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        setChildrenDrawingOrderEnabled(true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            int iMin = Math.min(childButton.getStrokeWidth(), getChildButton(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                pxw.m174250c(layoutParamsBuildLayoutParams, 0);
                pxw.m174251d(layoutParamsBuildLayoutParams, -iMin);
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = -iMin;
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    @NonNull
    private LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void checkForced(int i) {
        setCheckedStateForView(i, true);
        updateCheckedStates(i, true);
        setCheckedId(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnButtonChecked(@IdRes int i, boolean z) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i, z);
        }
    }

    private MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Nullable
    private CornerData getNewCornerData(int i, int i2, int i3) {
        int childCount = getChildCount();
        CornerData cornerData = this.originalCornerData.get(i);
        if (childCount == 1) {
            return cornerData;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? CornerData.start(cornerData, this) : CornerData.top(cornerData);
        }
        if (i == i3) {
            return z ? CornerData.end(cornerData, this) : CornerData.bottom(cornerData);
        }
        return null;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void resetChildMargins(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            pxw.m174250c(layoutParams, 0);
            pxw.m174251d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedId(int i) {
        this.checkedId = i;
        dispatchOnButtonChecked(i, true);
    }

    private void setCheckedStateForView(@IdRes int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(kkl0.m150161i());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.checkedStateTracker);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, @Nullable CornerData cornerData) {
        if (cornerData == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cornerData.topLeft).setBottomLeftCornerSize(cornerData.bottomLeft).setTopRightCornerSize(cornerData.topRight).setBottomRightCornerSize(cornerData.bottomRight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCheckedStates(int i, boolean z) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton childButton = getChildButton(i2);
            if (childButton.isChecked() && this.singleSelection && z && childButton.getId() != i) {
                setCheckedStateForView(childButton.getId(), false);
                dispatchOnButtonChecked(childButton.getId(), false);
            }
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            updateCheckedStates(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.originalCornerData.add(new CornerData(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
    }

    public void check(@IdRes int i) {
        if (i == this.checkedId) {
            return;
        }
        checkForced(i);
    }

    public void clearChecked() {
        this.skipCheckedStateTracker = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            childButton.setChecked(false);
            dispatchOnButtonChecked(childButton.getId(), false);
        }
        this.skipCheckedStateTracker = false;
        setCheckedId(-1);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (this.singleSelection) {
            return this.checkedId;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            if (childButton.isChecked()) {
                arrayList.add(Integer.valueOf(childButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.checkedId;
        if (i != -1) {
            checkForced(i);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.checkedStateTracker);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalCornerData.remove(iIndexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void uncheck(@IdRes int i) {
        setCheckedStateForView(i, false);
        updateCheckedStates(i, false);
        this.checkedId = -1;
        dispatchOnButtonChecked(i, false);
    }

    @VisibleForTesting
    public void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton childButton = getChildButton(i);
            if (childButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
                updateBuilderWithCornerData(builder, getNewCornerData(i, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2489R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }
}
