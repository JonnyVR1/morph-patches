package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NameResolver f65967a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProtoBuf.Class f65968b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BinaryVersion f65969c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SourceElement f65970d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class r2, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        nameResolver.getClass();
        r2.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.f65967a = nameResolver;
        this.f65968b = r2;
        this.f65969c = binaryVersion;
        this.f65970d = sourceElement;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NameResolver m92134a() {
        return this.f65967a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Class m92135b() {
        return this.f65968b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final BinaryVersion m92136c() {
        return this.f65969c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final SourceElement m92137d() {
        return this.f65970d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.m87488d(this.f65967a, classData.f65967a) && Intrinsics.m87488d(this.f65968b, classData.f65968b) && Intrinsics.m87488d(this.f65969c, classData.f65969c) && Intrinsics.m87488d(this.f65970d, classData.f65970d);
    }

    public int hashCode() {
        return (((((this.f65967a.hashCode() * 31) + this.f65968b.hashCode()) * 31) + this.f65969c.hashCode()) * 31) + this.f65970d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f65967a + ", classProto=" + this.f65968b + ", metadataVersion=" + this.f65969c + ", sourceElement=" + this.f65970d + ')';
    }
}
