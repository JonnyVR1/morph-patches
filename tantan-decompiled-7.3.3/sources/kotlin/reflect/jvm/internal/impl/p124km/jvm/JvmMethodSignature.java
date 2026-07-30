package kotlin.reflect.jvm.internal.impl.p124km.jvm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmMethodSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65287a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f65288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f65287a = str;
        this.f65288b = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m90179a() {
        return this.f65288b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m90180b() {
        return this.f65287a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmMethodSignature)) {
            return false;
        }
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) obj;
        return Intrinsics.m88377d(this.f65287a, jvmMethodSignature.f65287a) && Intrinsics.m88377d(this.f65288b, jvmMethodSignature.f65288b);
    }

    public int hashCode() {
        return (this.f65287a.hashCode() * 31) + this.f65288b.hashCode();
    }

    @NotNull
    public String toString() {
        return m90180b() + m90179a();
    }
}
