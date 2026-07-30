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
    public final NameResolver f66641a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProtoBuf.Class f66642b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BinaryVersion f66643c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final SourceElement f66644d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class r2, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        nameResolver.getClass();
        r2.getClass();
        binaryVersion.getClass();
        sourceElement.getClass();
        this.f66641a = nameResolver;
        this.f66642b = r2;
        this.f66643c = binaryVersion;
        this.f66644d = sourceElement;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final NameResolver m93025a() {
        return this.f66641a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Class m93026b() {
        return this.f66642b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final BinaryVersion m93027c() {
        return this.f66643c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final SourceElement m93028d() {
        return this.f66644d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.m88377d(this.f66641a, classData.f66641a) && Intrinsics.m88377d(this.f66642b, classData.f66642b) && Intrinsics.m88377d(this.f66643c, classData.f66643c) && Intrinsics.m88377d(this.f66644d, classData.f66644d);
    }

    public int hashCode() {
        return (((((this.f66641a.hashCode() * 31) + this.f66642b.hashCode()) * 31) + this.f66643c.hashCode()) * 31) + this.f66644d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.f66641a + ", classProto=" + this.f66642b + ", metadataVersion=" + this.f66643c + ", sourceElement=" + this.f66644d + ')';
    }
}
