package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {

    @NotNull
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    /* JADX WARN: Illegal instructions before constructor call */
    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite extensionRegistryLiteM91300d = ExtensionRegistryLite.m91300d();
        BuiltInsProtoBuf.m90864a(extensionRegistryLiteM91300d);
        extensionRegistryLiteM91300d.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = BuiltInsProtoBuf.f65323a;
        generatedExtension.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> generatedExtension2 = BuiltInsProtoBuf.f65325c;
        generatedExtension2.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> generatedExtension3 = BuiltInsProtoBuf.f65324b;
        generatedExtension3.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension4 = BuiltInsProtoBuf.f65326d;
        generatedExtension4.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension5 = BuiltInsProtoBuf.f65327e;
        generatedExtension5.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension6 = BuiltInsProtoBuf.f65328f;
        generatedExtension6.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension7 = BuiltInsProtoBuf.f65329g;
        generatedExtension7.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> generatedExtension8 = BuiltInsProtoBuf.f65331i;
        generatedExtension8.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> generatedExtension9 = BuiltInsProtoBuf.f65330h;
        generatedExtension9.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> generatedExtension10 = BuiltInsProtoBuf.f65332j;
        generatedExtension10.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> generatedExtension11 = BuiltInsProtoBuf.f65333k;
        generatedExtension11.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> generatedExtension12 = BuiltInsProtoBuf.f65334l;
        generatedExtension12.getClass();
        super(extensionRegistryLiteM91300d, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, null, generatedExtension5, generatedExtension6, generatedExtension7, null, null, null, generatedExtension8, generatedExtension9, generatedExtension10, generatedExtension11, generatedExtension12);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m92279q(@NotNull FqName fqName) {
        fqName.getClass();
        return m92281s(fqName) + ".kotlin_builtins";
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final String m92280r(@NotNull FqName fqName) {
        fqName.getClass();
        return C15386d.m93478E(fqName.m91046a(), '.', '/', false, 4, null) + '/' + m92279q(fqName);
    }

    /* JADX INFO: renamed from: s */
    public final String m92281s(FqName fqName) {
        if (fqName.m91048c()) {
            return "default-package";
        }
        String strM91082b = fqName.m91051f().m91082b();
        strM91082b.getClass();
        return strM91082b;
    }
}
