package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ProtoTypeTableUtilKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ProtoBuf.Type m90897a(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.m90918a(type.getAbbreviatedTypeId());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<ProtoBuf.Type> m90898b(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = r2.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = r2.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.m90918a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final List<ProtoBuf.Type> m90899c(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.m90918a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final List<ProtoBuf.Type> m90900d(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            List<Integer> list = contextReceiverTypeIdList;
            contextReceiverTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                contextReceiverTypeList.add(typeTable.m90918a(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ProtoBuf.Type m90901e(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (typeAlias.hasExpandedTypeId()) {
            return typeTable.m90918a(typeAlias.getExpandedTypeId());
        }
        qkq0.m175383a("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final ProtoBuf.Type m90902f(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.m90918a(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m90903g(@NotNull ProtoBuf.Function function) {
        function.getClass();
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m90904h(@NotNull ProtoBuf.Property property) {
        property.getClass();
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final ProtoBuf.Type m90905i(@NotNull ProtoBuf.Class r1, @NotNull TypeTable typeTable) {
        r1.getClass();
        typeTable.getClass();
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.m90918a(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final ProtoBuf.Type m90906j(@NotNull ProtoBuf.Expression expression, @NotNull TypeTable typeTable) {
        expression.getClass();
        typeTable.getClass();
        if (expression.hasIsInstanceType()) {
            return expression.getIsInstanceType();
        }
        if (expression.hasIsInstanceTypeId()) {
            return typeTable.m90918a(expression.getIsInstanceTypeId());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final ProtoBuf.Type m90907k(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        type.getClass();
        typeTable.getClass();
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.m90918a(type.getOuterTypeId());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final ProtoBuf.Type m90908l(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.m90918a(function.getReceiverTypeId());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final ProtoBuf.Type m90909m(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.m90918a(property.getReceiverTypeId());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final ProtoBuf.Type m90910n(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        function.getClass();
        typeTable.getClass();
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (function.hasReturnTypeId()) {
            return typeTable.m90918a(function.getReturnTypeId());
        }
        qkq0.m175383a("No returnType in ProtoBuf.Function");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final ProtoBuf.Type m90911o(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        property.getClass();
        typeTable.getClass();
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (property.hasReturnTypeId()) {
            return typeTable.m90918a(property.getReturnTypeId());
        }
        qkq0.m175383a("No returnType in ProtoBuf.Property");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final List<ProtoBuf.Type> m90912p(@NotNull ProtoBuf.Class r2, @NotNull TypeTable typeTable) {
        r2.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> supertypeList = r2.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r2.getSupertypeIdList();
            supertypeIdList.getClass();
            List<Integer> list = supertypeIdList;
            supertypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                supertypeList.add(typeTable.m90918a(num.intValue()));
            }
        }
        return supertypeList;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final ProtoBuf.Type m90913q(@NotNull ProtoBuf.Type.Argument argument, @NotNull TypeTable typeTable) {
        argument.getClass();
        typeTable.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.m90918a(argument.getTypeId());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final ProtoBuf.Type m90914r(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            type.getClass();
            return type;
        }
        if (valueParameter.hasTypeId()) {
            return typeTable.m90918a(valueParameter.getTypeId());
        }
        qkq0.m175383a("No type in ProtoBuf.ValueParameter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public static final ProtoBuf.Type m90915s(@NotNull ProtoBuf.TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        typeAlias.getClass();
        typeTable.getClass();
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.m90918a(typeAlias.getUnderlyingTypeId());
        }
        qkq0.m175383a("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final List<ProtoBuf.Type> m90916t(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull TypeTable typeTable) {
        typeParameter.getClass();
        typeTable.getClass();
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            List<Integer> list = upperBoundIdList;
            upperBoundList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Integer num : list) {
                num.getClass();
                upperBoundList.add(typeTable.m90918a(num.intValue()));
            }
        }
        return upperBoundList;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static final ProtoBuf.Type m90917u(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        valueParameter.getClass();
        typeTable.getClass();
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.m90918a(valueParameter.getVarargElementTypeId());
        }
        return null;
    }
}
