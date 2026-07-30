package p151v;

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
import p153l.cp50;
import p153l.dok0;
import p153l.fsf0;
import p153l.ozk0;

/* JADX INFO: loaded from: classes3.dex */
public class VSlider extends VBaseSlider<VSlider, Object, InterfaceC22684b> {

    /* JADX INFO: renamed from: v.VSlider$a */
    public static abstract class AbstractC22683a implements cp50 {
        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull VSlider vSlider, boolean z, float f) {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull VSlider vSlider, boolean z, float f, float f2) {
        }
    }

    /* JADX INFO: renamed from: v.VSlider$b */
    public interface InterfaceC22684b extends dok0<VSlider> {
    }

    public VSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ boolean mo224180A() {
        return super.mo224180A();
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: O */
    public boolean mo224194O() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: Q */
    public /* bridge */ /* synthetic */ void mo224196Q(@NonNull dok0 dok0Var) {
        super.mo224196Q(dok0Var);
    }

    @Override // p151v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // p151v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo224211f(@Nullable cp50 cp50Var) {
        super.mo224211f(cp50Var);
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo224213g(@NonNull dok0 dok0Var) {
        super.mo224213g(dok0Var);
    }

    @Override // p151v.VBaseSlider, android.view.View
    @NonNull
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // p151v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // p151v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // p151v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // p151v.VBaseSlider
    @Dimension
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // p151v.VBaseSlider
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ fsf0 mo224222n() {
        return super.mo224222n();
    }

    @Override // p151v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p151v.VBaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p151v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p151v.VBaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable ozk0 ozk0Var) {
        super.setLabelFormatter(ozk0Var);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = 0) @Dimension int i) {
        super.setThumbRadius(i);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@DimenRes int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = 0) @Dimension int i) {
        super.setTrackHeight(i);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    @Override // p151v.VBaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // p151v.VBaseSlider
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
