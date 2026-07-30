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
    public final ClassId f66521a;

    /* JADX INFO: renamed from: b */
    public final int f66522b;

    public ClassLiteralValue(@NotNull ClassId classId, int i) {
        classId.getClass();
        this.f66521a = classId;
        this.f66522b = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassId m92805a() {
        return this.f66521a;
    }

    /* JADX INFO: renamed from: b */
    public final int m92806b() {
        return this.f66522b;
    }

    /* JADX INFO: renamed from: c */
    public final int m92807c() {
        return this.f66522b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassId m92808d() {
        return this.f66521a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.m88377d(this.f66521a, classLiteralValue.f66521a) && this.f66522b == classLiteralValue.f66522b;
    }

    public int hashCode() {
        return (this.f66521a.hashCode() * 31) + Integer.hashCode(this.f66522b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f66522b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f66521a);
        int i3 = this.f66522b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
