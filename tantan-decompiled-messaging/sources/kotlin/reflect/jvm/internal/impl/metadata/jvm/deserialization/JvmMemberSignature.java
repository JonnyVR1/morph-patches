package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65449a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f65450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f65449a = str;
            this.f65450b = str2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91008a() {
            return m91012e() + ':' + m91011d();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m91009b() {
            return this.f65449a;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m91010c() {
            return this.f65450b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public String m91011d() {
            return this.f65450b;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public String m91012e() {
            return this.f65449a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.m87488d(this.f65449a, field.f65449a) && Intrinsics.m87488d(this.f65450b, field.f65450b);
        }

        public int hashCode() {
            return (this.f65449a.hashCode() * 31) + this.f65450b.hashCode();
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65451a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f65452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f65451a = str;
            this.f65452b = str2;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Method m91013c(Method method, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = method.f65451a;
            }
            if ((i & 2) != 0) {
                str2 = method.f65452b;
            }
            return method.m91014b(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91008a() {
            return m91016e() + m91015d();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Method m91014b(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new Method(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public String m91015d() {
            return this.f65452b;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public String m91016e() {
            return this.f65451a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.m87488d(this.f65451a, method.f65451a) && Intrinsics.m87488d(this.f65452b, method.f65452b);
        }

        public int hashCode() {
            return (this.f65451a.hashCode() * 31) + this.f65452b.hashCode();
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String mo91008a();

    @NotNull
    public final String toString() {
        return mo91008a();
    }

    private JvmMemberSignature() {
    }
}
