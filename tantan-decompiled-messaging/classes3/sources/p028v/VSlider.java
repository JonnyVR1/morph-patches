package p028v;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p003l.iqk0;
import p003l.wg50;
import p003l.wjf0;
import p003l.xek0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSlider extends VBaseSlider<VSlider, Object, InterfaceC1362b> {

    /* JADX INFO: renamed from: v.VSlider$a */
    public static abstract class AbstractC1361a implements wg50 {
        @Override // p003l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo8558a(@NonNull VSlider vSlider, boolean z, float f) {
        }

        @Override // p003l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo8559b(@NonNull VSlider vSlider, boolean z, float f, float f2) {
        }
    }

    /* JADX INFO: renamed from: v.VSlider$b */
    public interface InterfaceC1362b extends xek0<VSlider> {
    }

    public VSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ boolean mo11407A() {
        return super.mo11407A();
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: O */
    public boolean mo11421O() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: Q */
    public /* bridge */ /* synthetic */ void mo11423Q(@NonNull xek0 xek0Var) {
        super.mo11423Q(xek0Var);
    }

    @Override // p028v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // p028v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo11438f(@Nullable wg50 wg50Var) {
        super.mo11438f(wg50Var);
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo11440g(@NonNull xek0 xek0Var) {
        super.mo11440g(xek0Var);
    }

    @Override // p028v.VBaseSlider, android.view.View
    @NonNull
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // p028v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // p028v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // p028v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // p028v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // p028v.VBaseSlider
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ wjf0 mo11449n() {
        return super.mo11449n();
    }

    @Override // p028v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p028v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p028v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p028v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable iqk0 iqk0Var) {
        super.setLabelFormatter(iqk0Var);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        super.setThumbRadius(i);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@DimenRes int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        super.setTrackHeight(i);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // p028v.VBaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    public VSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSlider(@NonNull Context context) {
        this(context, null);
    }
}
