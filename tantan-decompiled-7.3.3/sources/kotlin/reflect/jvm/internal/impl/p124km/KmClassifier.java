package kotlin.reflect.jvm.internal.impl.p124km;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KmClassifier {

    public static final class Class extends KmClassifier {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65150a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Class) && Intrinsics.m88377d(this.f65150a, ((Class) obj).f65150a);
        }

        public int hashCode() {
            return this.f65150a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Class(name=" + this.f65150a + ')';
        }
    }

    public static final class TypeAlias extends KmClassifier {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeAlias(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65151a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeAlias) && Intrinsics.m88377d(this.f65151a, ((TypeAlias) obj).f65151a);
        }

        public int hashCode() {
            return this.f65151a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TypeAlias(name=" + this.f65151a + ')';
        }
    }

    public static final class TypeParameter extends KmClassifier {

        /* JADX INFO: renamed from: a */
        public final int f65152a;

        public TypeParameter(int i) {
            super(null);
            this.f65152a = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypeParameter) && this.f65152a == ((TypeParameter) obj).f65152a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65152a);
        }

        @NotNull
        public String toString() {
            return "TypeParameter(id=" + this.f65152a + ')';
        }
    }

    public /* synthetic */ KmClassifier(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KmClassifier() {
    }
}
