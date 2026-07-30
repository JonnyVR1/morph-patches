package kotlin.reflect.jvm.internal.impl.p120km;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KmClassifier {

    public static final class Class extends KmClassifier {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64476a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull String str) {
            super(null);
            str.getClass();
            this.f64476a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Class) && Intrinsics.m87488d(this.f64476a, ((Class) obj).f64476a);
        }

        public int hashCode() {
            return this.f64476a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Class(name=" + this.f64476a + ')';
        }
    }

    public static final class TypeAlias extends KmClassifier {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeAlias(@NotNull String str) {
            super(null);
            str.getClass();
            this.f64477a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeAlias) && Intrinsics.m87488d(this.f64477a, ((TypeAlias) obj).f64477a);
        }

        public int hashCode() {
            return this.f64477a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TypeAlias(name=" + this.f64477a + ')';
        }
    }

    public static final class TypeParameter extends KmClassifier {

        /* JADX INFO: renamed from: a */
        public final int f64478a;

        public TypeParameter(int i) {
            super(null);
            this.f64478a = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeParameter) && this.f64478a == ((TypeParameter) obj).f64478a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64478a);
        }

        @NotNull
        public String toString() {
            return "TypeParameter(id=" + this.f64478a + ')';
        }
    }

    public /* synthetic */ KmClassifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KmClassifier() {
    }
}
