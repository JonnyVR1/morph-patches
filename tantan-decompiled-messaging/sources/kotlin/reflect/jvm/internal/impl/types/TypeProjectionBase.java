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
        return mo92666b() == typeProjection.mo92666b() && mo92667c() == typeProjection.mo92667c() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int iHashCode = mo92667c().hashCode();
        if (TypeUtils.m92812w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo92666b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo92666b()) {
            return "*";
        }
        if (mo92667c() == Variance.INVARIANT) {
            return getType().toString();
        }
        return mo92667c() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getType();
    }
}
