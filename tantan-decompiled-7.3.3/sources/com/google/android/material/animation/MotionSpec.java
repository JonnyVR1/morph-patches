package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import p153l.fig0;
import p153l.oof0;
import p153l.ypg0;

/* JADX INFO: loaded from: classes7.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final oof0<String, MotionTiming> timings = new oof0<>();
    private final oof0<String, PropertyValuesHolder[]> propertyValues = new oof0<>();

    private static void addInfoFromAnimator(@NonNull MotionSpec motionSpec, Animator animator) {
        if (!(animator instanceof ObjectAnimator)) {
            ypg0.m217021a("Animator must be an ObjectAnimator: ", animator);
            return;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) animator;
        motionSpec.setPropertyValues(objectAnimator.getPropertyName(), objectAnimator.getValues());
        motionSpec.setTiming(objectAnimator.getPropertyName(), MotionTiming.createFromAnimator(objectAnimator));
    }

    @NonNull
    private PropertyValuesHolder[] clonePropertyValuesHolder(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return createFromResource(context, resourceId);
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context, @AnimatorRes int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return createSpecFromAnimators(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return createSpecFromAnimators(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    @NonNull
    private static MotionSpec createSpecFromAnimators(@NonNull List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addInfoFromAnimator(motionSpec, list.get(i));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.timings.equals(((MotionSpec) obj).timings);
        }
        return false;
    }

    @NonNull
    public <T> ObjectAnimator getAnimator(@NonNull String str, @NonNull T t, @NonNull Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, getPropertyValues(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        getTiming(str).apply(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String str) {
        if (hasPropertyValues(str)) {
            return clonePropertyValuesHolder(this.propertyValues.get(str));
        }
        fig0.m125680a();
        return null;
    }

    public MotionTiming getTiming(String str) {
        if (hasTiming(str)) {
            return this.timings.get(str);
        }
        fig0.m125680a();
        return null;
    }

    public long getTotalDuration() {
        int size = this.timings.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            MotionTiming motionTimingM168583m = this.timings.m168583m(i);
            jMax = Math.max(jMax, motionTimingM168583m.getDelay() + motionTimingM168583m.getDuration());
        }
        return jMax;
    }

    public boolean hasPropertyValues(String str) {
        return this.propertyValues.get(str) != null;
    }

    public boolean hasTiming(String str) {
        return this.timings.get(str) != null;
    }

    public int hashCode() {
        return this.timings.hashCode();
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.propertyValues.put(str, propertyValuesHolderArr);
    }

    public void setTiming(String str, @Nullable MotionTiming motionTiming) {
        this.timings.put(str, motionTiming);
    }

    @NonNull
    public String toString() {
        return SignParameters.NEW_LINE + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.timings + "}\n";
    }
}
