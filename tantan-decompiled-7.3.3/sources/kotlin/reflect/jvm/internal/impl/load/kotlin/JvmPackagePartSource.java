package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final JvmClassName f65722b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final JvmClassName f65723c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final JvmClassName f65724d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final IncompatibleVersionErrorData<MetadataVersion> f65725e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PreReleaseInfo f65726f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final DeserializedContainerAbiStability f65727g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final KotlinJvmBinaryClass f65728h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f65729i;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull ProtoBuf.Package r13, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        JvmClassName jvmClassNameM92908d;
        kotlinJvmBinaryClass.getClass();
        r13.getClass();
        nameResolver.getClass();
        deserializedContainerAbiStability.getClass();
        JvmClassName jvmClassNameM92906b = JvmClassName.m92906b(kotlinJvmBinaryClass.mo89840e());
        jvmClassNameM92906b.getClass();
        String strM91309e = kotlinJvmBinaryClass.mo89837b().m91309e();
        if (strM91309e != null) {
            jvmClassNameM92908d = strM91309e.length() > 0 ? JvmClassName.m92908d(strM91309e) : null;
        } else {
            jvmClassNameM92908d = null;
        }
        this(jvmClassNameM92906b, jvmClassNameM92908d, null, r13, nameResolver, incompatibleVersionErrorData, new PreReleaseInfo(z, null, 2, null), deserializedContainerAbiStability, kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo91217a() {
        return "Class '" + m91218d().m91925a().m91937a() + '\'';
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
    public final ClassId m91218d() {
        FqName fqNameM92912g = m91219e().m92912g();
        fqNameM92912g.getClass();
        return new ClassId(fqNameM92912g, m91222h());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public JvmClassName m91219e() {
        return this.f65722b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public JvmClassName m91220f() {
        return this.f65723c;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final KotlinJvmBinaryClass m91221g() {
        return this.f65728h;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Name m91222h() {
        String strM92911f = m91219e().m92911f();
        strM92911f.getClass();
        Name nameM91970i = Name.m91970i(StringsKt.m94306Q0(strM92911f, '/', null, 2, null));
        nameM91970i.getClass();
        return nameM91970i;
    }

    @NotNull
    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + m91219e();
    }

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName, @Nullable JvmClassName jvmClassName2, @Nullable JvmClassName jvmClassName3, @NotNull ProtoBuf.Package r4, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        jvmClassName.getClass();
        r4.getClass();
        nameResolver.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.f65722b = jvmClassName;
        this.f65723c = jvmClassName2;
        this.f65724d = jvmClassName3;
        this.f65725e = incompatibleVersionErrorData;
        this.f65726f = preReleaseInfo;
        this.f65727g = deserializedContainerAbiStability;
        this.f65728h = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.f66093m;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m91786a(r4, generatedExtension);
        this.f65729i = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? BLiveTraceServerLocation.main : string;
    }
}
