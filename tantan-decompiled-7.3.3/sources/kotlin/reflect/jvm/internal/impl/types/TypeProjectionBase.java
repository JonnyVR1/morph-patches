package kotlin.reflect.jvm.internal.impl.types;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return mo93557b() == typeProjection.mo93557b() && mo93558c() == typeProjection.mo93558c() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int iHashCode = mo93558c().hashCode();
        if (TypeUtils.m93703w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo93557b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo93557b()) {
            return "*";
        }
        if (mo93558c() == Variance.INVARIANT) {
            return getType().toString();
        }
        return mo93558c() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getType();
    }
}
