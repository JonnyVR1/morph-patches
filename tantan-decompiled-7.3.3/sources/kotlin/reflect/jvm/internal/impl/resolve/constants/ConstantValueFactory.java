package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.gy5;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m92811d(PrimitiveType primitiveType, ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM89110P = moduleDescriptor.mo89437f().m89110P(primitiveType);
        simpleTypeM89110P.getClass();
        return simpleTypeM89110P;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ConstantValue m92812f(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i, Object obj2) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.m92815e(obj, moduleDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public final ArrayValue m92813b(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List list2 = CollectionsKt.toList(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueM92812f = m92812f(this, it.next(), null, 2, null);
            if (constantValueM92812f != null) {
                arrayList.add(constantValueM92812f);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new gy5(primitiveType));
        }
        SimpleType simpleTypeM89110P = moduleDescriptor.mo89437f().m89110P(primitiveType);
        simpleTypeM89110P.getClass();
        return new TypedArrayValue(arrayList, simpleTypeM89110P);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ArrayValue m92814c(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        list.getClass();
        kotlinType.getClass();
        return new TypedArrayValue(list, kotlinType);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ConstantValue<?> m92815e(@Nullable Object obj, @Nullable ModuleDescriptor moduleDescriptor) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return m92813b(ArraysKt.toList((byte[]) obj), moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return m92813b(ArraysKt.toList((short[]) obj), moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return m92813b(ArraysKt.toList((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return m92813b(ArraysKt.toList((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return m92813b(ArraysKt.toList((char[]) obj), moduleDescriptor, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return m92813b(ArraysKt.toList((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return m92813b(ArraysKt.toList((double[]) obj), moduleDescriptor, PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return m92813b(ArraysKt.toList((boolean[]) obj), moduleDescriptor, PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new NullValue();
        }
        return null;
    }
}
