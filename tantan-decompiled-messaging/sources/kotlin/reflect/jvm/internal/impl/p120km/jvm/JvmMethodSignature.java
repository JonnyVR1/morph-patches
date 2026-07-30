package kotlin.reflect.jvm.internal.impl.p120km.jvm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmMethodSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f64613a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f64614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f64613a = str;
        this.f64614b = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m89288a() {
        return this.f64614b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m89289b() {
        return this.f64613a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmMethodSignature)) {
            return false;
        }
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) obj;
        return Intrinsics.m87488d(this.f64613a, jvmMethodSignature.f64613a) && Intrinsics.m87488d(this.f64614b, jvmMethodSignature.f64614b);
    }

    public int hashCode() {
        return (this.f64613a.hashCode() * 31) + this.f64614b.hashCode();
    }

    @NotNull
    public String toString() {
        return m89289b() + m89288a();
    }
}
