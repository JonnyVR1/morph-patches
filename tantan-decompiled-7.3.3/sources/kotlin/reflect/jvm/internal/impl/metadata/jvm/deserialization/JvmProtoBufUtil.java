package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmProtoBufUtil {

    @NotNull
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ExtensionRegistryLite f66135a;

    static {
        ExtensionRegistryLite extensionRegistryLiteM92191d = ExtensionRegistryLite.m92191d();
        JvmProtoBuf.m91827a(extensionRegistryLiteM92191d);
        extensionRegistryLiteM92191d.getClass();
        f66135a = extensionRegistryLiteM92191d;
    }

    private JvmProtoBufUtil() {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ JvmMemberSignature.Field m91909d(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.m91918c(property, nameResolver, typeTable, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m91910f(@NotNull ProtoBuf.Property property) {
        property.getClass();
        Flags.BooleanFlagField booleanFlagFieldM91898a = JvmFlags.INSTANCE.m91898a();
        Object extension = property.getExtension(JvmProtoBuf.f66085e);
        extension.getClass();
        Boolean boolMo91766d = booleanFlagFieldM91898a.mo91766d(((Number) extension).intValue());
        boolMo91766d.getClass();
        return boolMo91766d.booleanValue();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final Pair<JvmNameResolver, ProtoBuf.Class> m91911h(@NotNull byte[] bArr, @NotNull String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.m91921k(byteArrayInputStream, strArr), ProtoBuf.Class.parseFrom(byteArrayInputStream, f66135a));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Pair<JvmNameResolver, ProtoBuf.Class> m91912i(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] bArrM91894e = BitEncoding.m91894e(strArr);
        bArrM91894e.getClass();
        return m91911h(bArrM91894e, strArr2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Pair<JvmNameResolver, ProtoBuf.Function> m91913j(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.m91894e(strArr));
        return new Pair<>(INSTANCE.m91921k(byteArrayInputStream, strArr2), ProtoBuf.Function.parseFrom(byteArrayInputStream, f66135a));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Pair<JvmNameResolver, ProtoBuf.Package> m91914l(@NotNull byte[] bArr, @NotNull String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.m91921k(byteArrayInputStream, strArr), ProtoBuf.Package.parseFrom(byteArrayInputStream, f66135a));
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Pair<JvmNameResolver, ProtoBuf.Package> m91915m(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] bArrM91894e = BitEncoding.m91894e(strArr);
        bArrM91894e.getClass();
        return m91914l(bArrM91894e, strArr2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ExtensionRegistryLite m91916a() {
        return f66135a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JvmMemberSignature.Method m91917b(@NotNull ProtoBuf.Constructor constructor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String strJoinToString$default;
        constructor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.f66081a;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.m91786a(constructor, generatedExtension);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            valueParameterList.getClass();
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                valueParameter.getClass();
                String strM91920g = jvmProtoBufUtil.m91920g(ProtoTypeTableUtilKt.m91805r(valueParameter, typeTable), nameResolver);
                if (strM91920g == null) {
                    return null;
                }
                arrayList.add(strM91920g);
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strJoinToString$default = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string, strJoinToString$default);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final JvmMemberSignature.Field m91918c(@NotNull ProtoBuf.Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, boolean z) {
        String strM91920g;
        property.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f66084d;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m91786a(property, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? property.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            strM91920g = m91920g(ProtoTypeTableUtilKt.m91802o(property, typeTable), nameResolver);
            if (strM91920g == null) {
                return null;
            }
        } else {
            strM91920g = nameResolver.getString(field.getDesc());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(name), strM91920g);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final JvmMemberSignature.Method m91919e(@NotNull ProtoBuf.Function function, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String string;
        function.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.f66082b;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.m91786a(function, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listListOfNotNull = CollectionsKt.listOfNotNull(ProtoTypeTableUtilKt.m91799l(function, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            valueParameterList.getClass();
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                valueParameter.getClass();
                arrayList.add(ProtoTypeTableUtilKt.m91805r(valueParameter, typeTable));
            }
            List listPlus = CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
            Iterator it = listPlus.iterator();
            while (it.hasNext()) {
                String strM91920g = INSTANCE.m91920g((ProtoBuf.Type) it.next(), nameResolver);
                if (strM91920g == null) {
                    return null;
                }
                arrayList2.add(strM91920g);
            }
            String strM91920g2 = m91920g(ProtoTypeTableUtilKt.m91801n(function, typeTable), nameResolver);
            if (strM91920g2 == null) {
                return null;
            }
            string = CollectionsKt.joinToString$default(arrayList2, "", "(", ")", 0, null, null, 56, null) + strM91920g2;
        } else {
            string = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), string);
    }

    /* JADX INFO: renamed from: g */
    public final String m91920g(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.m91897b(nameResolver.mo91783a(type.getClassName()));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final JvmNameResolver m91921k(InputStream inputStream, String[] strArr) throws IOException {
        JvmProtoBuf.StringTableTypes delimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, f66135a);
        delimitedFrom.getClass();
        return new JvmNameResolver(delimitedFrom, strArr);
    }
}
