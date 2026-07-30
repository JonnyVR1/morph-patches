package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ClassId f65847a;

    /* JADX INFO: renamed from: b */
    public final int f65848b;

    public ClassLiteralValue(@NotNull ClassId classId, int i) {
        classId.getClass();
        this.f65847a = classId;
        this.f65848b = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m91914a() {
        return this.f65847a;
    }

    /* JADX INFO: renamed from: b */
    public final int m91915b() {
        return this.f65848b;
    }

    /* JADX INFO: renamed from: c */
    public final int m91916c() {
        return this.f65848b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassId m91917d() {
        return this.f65847a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.m87488d(this.f65847a, classLiteralValue.f65847a) && this.f65848b == classLiteralValue.f65848b;
    }

    public int hashCode() {
        return (this.f65847a.hashCode() * 31) + Integer.hashCode(this.f65848b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f65848b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f65847a);
        int i3 = this.f65848b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
