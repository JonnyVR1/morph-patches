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
    public final KotlinJvmBinaryClass f65072b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final IncompatibleVersionErrorData<MetadataVersion> f65073c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final PreReleaseInfo f65074d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final DeserializedContainerAbiStability f65075e;

    public KotlinJvmBinarySourceElement(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        kotlinJvmBinaryClass.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.f65072b = kotlinJvmBinaryClass;
        this.f65073c = incompatibleVersionErrorData;
        this.f65074d = preReleaseInfo;
        this.f65075e = deserializedContainerAbiStability;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo90326a() {
        return "Class '" + this.f65072b.mo88949e().m91034a().m91046a() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* JADX INFO: renamed from: b */
    public SourceFile mo88593b() {
        SourceFile sourceFile = SourceFile.f64064a;
        sourceFile.getClass();
        return sourceFile;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final KotlinJvmBinaryClass m90368d() {
        return this.f65072b;
    }

    @NotNull
    public String toString() {
        return KotlinJvmBinarySourceElement.class.getSimpleName() + ": " + this.f65072b;
    }
}
