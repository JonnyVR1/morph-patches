package kotlin.reflect.jvm.internal.impl.p120km.jvm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFieldSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f64611a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f64612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFieldSignature(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f64611a = str;
        this.f64612b = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m89284a() {
        return this.f64612b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m89285b() {
        return this.f64611a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmFieldSignature)) {
            return false;
        }
        JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) obj;
        return Intrinsics.m87488d(this.f64611a, jvmFieldSignature.f64611a) && Intrinsics.m87488d(this.f64612b, jvmFieldSignature.f64612b);
    }

    public int hashCode() {
        return (this.f64611a.hashCode() * 31) + this.f64612b.hashCode();
    }

    @NotNull
    public String toString() {
        return m89285b() + ':' + m89284a();
    }
}
