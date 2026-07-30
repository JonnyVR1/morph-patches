package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements KProperty {
    private final boolean syntheticJavaProperty;

    @SinceKotlin
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && Intrinsics.m88377d(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getGetter */
    public abstract /* synthetic */ KProperty.Getter mo88810h0();

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KProperty getReflected() {
        if (!this.syntheticJavaProperty) {
            return (KProperty) super.getReflected();
        }
        pr3.m173429a("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @SinceKotlin
    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }
}
