package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
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
    public final JvmClassName f65048b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final JvmClassName f65049c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final JvmClassName f65050d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final IncompatibleVersionErrorData<MetadataVersion> f65051e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final PreReleaseInfo f65052f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final DeserializedContainerAbiStability f65053g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final KotlinJvmBinaryClass f65054h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f65055i;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull ProtoBuf.Package r13, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        JvmClassName jvmClassNameM92017d;
        kotlinJvmBinaryClass.getClass();
        r13.getClass();
        nameResolver.getClass();
        deserializedContainerAbiStability.getClass();
        JvmClassName jvmClassNameM92015b = JvmClassName.m92015b(kotlinJvmBinaryClass.mo88949e());
        jvmClassNameM92015b.getClass();
        String strM90418e = kotlinJvmBinaryClass.mo88946b().m90418e();
        if (strM90418e != null) {
            jvmClassNameM92017d = strM90418e.length() > 0 ? JvmClassName.m92017d(strM90418e) : null;
        } else {
            jvmClassNameM92017d = null;
        }
        this(jvmClassNameM92015b, jvmClassNameM92017d, null, r13, nameResolver, incompatibleVersionErrorData, new PreReleaseInfo(z, null, 2, null), deserializedContainerAbiStability, kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo90326a() {
        return "Class '" + m90327d().m91034a().m91046a() + '\'';
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
    public final ClassId m90327d() {
        FqName fqNameM92021g = m90328e().m92021g();
        fqNameM92021g.getClass();
        return new ClassId(fqNameM92021g, m90331h());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public JvmClassName m90328e() {
        return this.f65048b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public JvmClassName m90329f() {
        return this.f65049c;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final KotlinJvmBinaryClass m90330g() {
        return this.f65054h;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Name m90331h() {
        String strM92020f = m90328e().m92020f();
        strM92020f.getClass();
        Name nameM91079i = Name.m91079i(StringsKt.m93415Q0(strM92020f, '/', null, 2, null));
        nameM91079i.getClass();
        return nameM91079i;
    }

    @NotNull
    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + m90328e();
    }

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName, @Nullable JvmClassName jvmClassName2, @Nullable JvmClassName jvmClassName3, @NotNull ProtoBuf.Package r4, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        jvmClassName.getClass();
        r4.getClass();
        nameResolver.getClass();
        preReleaseInfo.getClass();
        deserializedContainerAbiStability.getClass();
        this.f65048b = jvmClassName;
        this.f65049c = jvmClassName2;
        this.f65050d = jvmClassName3;
        this.f65051e = incompatibleVersionErrorData;
        this.f65052f = preReleaseInfo;
        this.f65053g = deserializedContainerAbiStability;
        this.f65054h = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.f65419m;
        generatedExtension.getClass();
        Integer num = (Integer) ProtoBufUtilKt.m90895a(r4, generatedExtension);
        this.f65055i = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? BLiveTraceServerLocation.main : string;
    }
}
