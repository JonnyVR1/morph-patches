package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinJvmBinaryClass f65746b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final IncompatibleVersionErrorData<MetadataVersion> f65747c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final PreReleaseInfo f65748d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final DeserializedContainerAbiStability f65749e;

    public KotlinJvmBinarySourceElement(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        kotlinJvmBinaryClass.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.f65746b = kotlinJvmBinaryClass;
        this.f65747c = incompatibleVersionErrorData;
        this.f65748d = preReleaseInfo;
        this.f65749e = deserializedContainerAbiStability;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo91217a() {
        return "Class '" + this.f65746b.mo89840e().m91925a().m91937a() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* JADX INFO: renamed from: b */
    public SourceFile mo89484b() {
        SourceFile sourceFile = SourceFile.f64738a;
        sourceFile.getClass();
        return sourceFile;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final KotlinJvmBinaryClass m91259d() {
        return this.f65746b;
    }

    @NotNull
    public String toString() {
        return KotlinJvmBinarySourceElement.class.getSimpleName() + ": " + this.f65746b;
    }
}
