package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p149l.b9c0;
import p149l.iqk0;
import p149l.wg50;
import p149l.wjf0;
import p149l.xek0;

/* JADX INFO: loaded from: classes3.dex */
public class VRangeSlider extends VBaseSlider<VRangeSlider, Object, InterfaceC22565a> {

    /* JADX INFO: renamed from: T */
    public float f209319T;

    /* JADX INFO: renamed from: U */
    public int f209320U;

    /* JADX INFO: renamed from: v.VRangeSlider$a */
    public interface InterfaceC22565a extends xek0<VRangeSlider> {
    }

    public VRangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74252E4);
        if (typedArrayObtainStyledAttributes.hasValue(b9c0.f74266G4)) {
            setValues(m223181i0(typedArrayObtainStyledAttributes.getResources().obtainTypedArray(typedArrayObtainStyledAttributes.getResourceId(b9c0.f74266G4, 0))));
        }
        this.f209319T = typedArrayObtainStyledAttributes.getDimension(b9c0.f74259F4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i0 */
    public static List<Float> m223181i0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    @Override // p147v.VBaseSlider
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ boolean mo222934A() {
        return super.mo222934A();
    }

    @Override // p147v.VBaseSlider
    /* JADX INFO: renamed from: Q */
    public /* bridge */ /* synthetic */ void mo222950Q(@NonNull xek0 xek0Var) {
        super.mo222950Q(xek0Var);
    }

    @Override // p147v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // p147v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p147v.VBaseSlider
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo222965f(@Nullable wg50 wg50Var) {
        super.mo222965f(wg50Var);
    }

    @Override // p147v.VBaseSlider
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo222967g(@NonNull xek0 xek0Var) {
        super.mo222967g(xek0Var);
    }

    @Override // p147v.VBaseSlider, android.view.View
    @NonNull
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // p147v.VBaseSlider
    public float getMinSeparation() {
        return this.f209319T;
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // p147v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // p147v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // p147v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // p147v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // p147v.VBaseSlider
    @NonNull
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // p147v.VBaseSlider
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ wjf0 mo222976n() {
        return super.mo222976n();
    }

    @Override // p147v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p147v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof RangeSliderState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.f209319T = rangeSliderState.minSeparation;
        int i = rangeSliderState.separationUnit;
        this.f209320U = i;
        setSeparationUnit(i);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.minSeparation = this.f209319T;
        rangeSliderState.separationUnit = this.f209320U;
        return rangeSliderState;
    }

    @Override // p147v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p147v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable iqk0 iqk0Var) {
        super.setLabelFormatter(iqk0Var);
    }

    public void setMinSeparation(@Dimension float f) {
        this.f209319T = f;
        this.f209320U = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.f209319T = f;
        this.f209320U = 1;
        setSeparationUnit(1);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        super.setThumbRadius(i);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@DimenRes int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        super.setTrackHeight(i);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // p147v.VBaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override // p147v.VBaseSlider
    public void setValues(@NonNull Float... fArr) {
        super.setValues(fArr);
    }

    @Override // p147v.VBaseSlider
    public void setValues(@NonNull List<Float> list) {
        super.setValues(list);
    }

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new C22564a();
        private float minSeparation;
        private int separationUnit;

        /* JADX INFO: renamed from: v.VRangeSlider$RangeSliderState$a */
        public class C22564a implements Parcelable.Creator<RangeSliderState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RangeSliderState createFromParcel(Parcel parcel) {
                try {
                    return new RangeSliderState(parcel);
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RangeSliderState[] newArray(int i) {
                return new RangeSliderState[i];
            }
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.minSeparation = parcel.readFloat();
            this.separationUnit = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.minSeparation);
            parcel.writeInt(this.separationUnit);
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VRangeSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VRangeSlider(@NonNull Context context) {
        this(context, null);
    }
}
