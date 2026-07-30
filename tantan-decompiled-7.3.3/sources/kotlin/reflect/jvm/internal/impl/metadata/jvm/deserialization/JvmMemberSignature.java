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
        public final String f66123a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f66124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f66123a = str;
            this.f66124b = str2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91899a() {
            return m91903e() + ':' + m91902d();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m91900b() {
            return this.f66123a;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m91901c() {
            return this.f66124b;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public String m91902d() {
            return this.f66124b;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public String m91903e() {
            return this.f66123a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.m88377d(this.f66123a, field.f66123a) && Intrinsics.m88377d(this.f66124b, field.f66124b);
        }

        public int hashCode() {
            return (this.f66123a.hashCode() * 31) + this.f66124b.hashCode();
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f66125a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f66126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f66125a = str;
            this.f66126b = str2;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Method m91904c(Method method, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = method.f66125a;
            }
            if ((i & 2) != 0) {
                str2 = method.f66126b;
            }
            return method.m91905b(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo91899a() {
            return m91907e() + m91906d();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Method m91905b(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            return new Method(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public String m91906d() {
            return this.f66126b;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public String m91907e() {
            return this.f66125a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.m88377d(this.f66125a, method.f66125a) && Intrinsics.m88377d(this.f66126b, method.f66126b);
        }

        public int hashCode() {
            return (this.f66125a.hashCode() * 31) + this.f66126b.hashCode();
        }
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String mo91899a();

    @NotNull
    public final String toString() {
        return mo91899a();
    }

    private JvmMemberSignature() {
    }
}
