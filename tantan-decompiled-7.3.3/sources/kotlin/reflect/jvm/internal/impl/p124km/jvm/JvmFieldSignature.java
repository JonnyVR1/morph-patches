package kotlin.reflect.jvm.internal.impl.p124km.jvm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFieldSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65285a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f65286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFieldSignature(@NotNull String str, @NotNull String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f65285a = str;
        this.f65286b = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m90175a() {
        return this.f65286b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m90176b() {
        return this.f65285a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmFieldSignature)) {
            return false;
        }
        JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) obj;
        return Intrinsics.m88377d(this.f65285a, jvmFieldSignature.f65285a) && Intrinsics.m88377d(this.f65286b, jvmFieldSignature.f65286b);
    }

    public int hashCode() {
        return (this.f65285a.hashCode() * 31) + this.f65286b.hashCode();
    }

    @NotNull
    public String toString() {
        return m90176b() + ':' + m90175a();
    }
}
