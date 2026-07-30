package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {

    @NotNull
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    /* JADX WARN: Illegal instructions before constructor call */
    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite extensionRegistryLiteM92191d = ExtensionRegistryLite.m92191d();
        BuiltInsProtoBuf.m91755a(extensionRegistryLiteM92191d);
        extensionRegistryLiteM92191d.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = BuiltInsProtoBuf.f65997a;
        generatedExtension.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> generatedExtension2 = BuiltInsProtoBuf.f65999c;
        generatedExtension2.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> generatedExtension3 = BuiltInsProtoBuf.f65998b;
        generatedExtension3.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension4 = BuiltInsProtoBuf.f66000d;
        generatedExtension4.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension5 = BuiltInsProtoBuf.f66001e;
        generatedExtension5.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension6 = BuiltInsProtoBuf.f66002f;
        generatedExtension6.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension7 = BuiltInsProtoBuf.f66003g;
        generatedExtension7.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> generatedExtension8 = BuiltInsProtoBuf.f66005i;
        generatedExtension8.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> generatedExtension9 = BuiltInsProtoBuf.f66004h;
        generatedExtension9.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> generatedExtension10 = BuiltInsProtoBuf.f66006j;
        generatedExtension10.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> generatedExtension11 = BuiltInsProtoBuf.f66007k;
        generatedExtension11.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> generatedExtension12 = BuiltInsProtoBuf.f66008l;
        generatedExtension12.getClass();
        super(extensionRegistryLiteM92191d, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, null, generatedExtension5, generatedExtension6, generatedExtension7, null, null, null, generatedExtension8, generatedExtension9, generatedExtension10, generatedExtension11, generatedExtension12);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m93170q(@NotNull FqName fqName) {
        fqName.getClass();
        return m93172s(fqName) + ".kotlin_builtins";
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final String m93171r(@NotNull FqName fqName) {
        fqName.getClass();
        return C15493d.m94369E(fqName.m91937a(), '.', '/', false, 4, null) + '/' + m93170q(fqName);
    }

    /* JADX INFO: renamed from: s */
    public final String m93172s(FqName fqName) {
        if (fqName.m91939c()) {
            return "default-package";
        }
        String strM91973b = fqName.m91942f().m91973b();
        strM91973b.getClass();
        return strM91973b;
    }
}
