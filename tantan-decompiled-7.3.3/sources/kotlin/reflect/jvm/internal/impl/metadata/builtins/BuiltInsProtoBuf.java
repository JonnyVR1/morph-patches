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
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f65997a = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 151, WireFormat.FieldType.INT32, Integer.class);

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f65998b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f65999c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f66000d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f66001e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f66002f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f66003g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f66004h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f66005i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f66006j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f66007k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f66008l;

    static {
        ProtoBuf.Class defaultInstance = ProtoBuf.Class.getDefaultInstance();
        ProtoBuf.Annotation defaultInstance2 = ProtoBuf.Annotation.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f65998b = GeneratedMessageLite.newRepeatedGeneratedExtension(defaultInstance, defaultInstance2, null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f65999c = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Constructor.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66000d = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66001e = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66002f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, fieldType, false, ProtoBuf.Annotation.class);
        f66003g = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 153, fieldType, false, ProtoBuf.Annotation.class);
        f66004h = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), ProtoBuf.Annotation.Argument.Value.getDefaultInstance(), null, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f66005i = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.EnumEntry.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66006j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.ValueParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66007k = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
        f66008l = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 150, fieldType, false, ProtoBuf.Annotation.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m91755a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.m92192a(f65997a);
        extensionRegistryLite.m92192a(f65998b);
        extensionRegistryLite.m92192a(f65999c);
        extensionRegistryLite.m92192a(f66000d);
        extensionRegistryLite.m92192a(f66001e);
        extensionRegistryLite.m92192a(f66002f);
        extensionRegistryLite.m92192a(f66003g);
        extensionRegistryLite.m92192a(f66004h);
        extensionRegistryLite.m92192a(f66005i);
        extensionRegistryLite.m92192a(f66006j);
        extensionRegistryLite.m92192a(f66007k);
        extensionRegistryLite.m92192a(f66008l);
    }
}
