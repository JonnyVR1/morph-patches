package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsProtoBuf {

    /* JADX INFO: renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f65323a = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 151, WireFormat.FieldType.INT32, Integer.class);

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f65324b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f65325c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f65326d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f65327e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f65328f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f65329g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f65330h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f65331i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f65332j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f65333k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f65334l;

    static {
        ProtoBuf.Class defaultInstance = ProtoBuf.Class.getDefaultInstance();
        ProtoBuf.Annotation defaultInstance2 = ProtoBuf.Annotation.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f65324b = GeneratedMessageLite.newRepeatedGeneratedExtension(defaultInstance, defaultInstance2, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65325c = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Constructor.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65326d = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65327e = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65328f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, fieldType, false, ProtoBuf.Annotation.class);
        f65329g = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 153, fieldType, false, ProtoBuf.Annotation.class);
        f65330h = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), null, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f65331i = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.EnumEntry.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65332j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.ValueParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65333k = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65334l = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m90864a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.m91301a(f65323a);
        extensionRegistryLite.m91301a(f65324b);
        extensionRegistryLite.m91301a(f65325c);
        extensionRegistryLite.m91301a(f65326d);
        extensionRegistryLite.m91301a(f65327e);
        extensionRegistryLite.m91301a(f65328f);
        extensionRegistryLite.m91301a(f65329g);
        extensionRegistryLite.m91301a(f65330h);
        extensionRegistryLite.m91301a(f65331i);
        extensionRegistryLite.m91301a(f65332j);
        extensionRegistryLite.m91301a(f65333k);
        extensionRegistryLite.m91301a(f65334l);
    }
}
