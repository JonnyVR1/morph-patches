package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    @NotNull
    private final ClassId arrayClassId;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        ClassId.Companion companion = ClassId.Companion;
        UBYTE = new UnsignedType("UBYTE", 0, ClassId.Companion.m91043b(companion, "kotlin/UByte", false, 2, null));
        USHORT = new UnsignedType("USHORT", 1, ClassId.Companion.m91043b(companion, "kotlin/UShort", false, 2, null));
        UINT = new UnsignedType("UINT", 2, ClassId.Companion.m91043b(companion, "kotlin/UInt", false, 2, null));
        ULONG = new UnsignedType("ULONG", 3, ClassId.Companion.m91043b(companion, "kotlin/ULong", false, 2, null));
        UnsignedType[] unsignedTypeArr$values = $values();
        $VALUES = unsignedTypeArr$values;
        $ENTRIES = EnumEntriesKt.m87385a(unsignedTypeArr$values);
    }

    private UnsignedType(String str, int i, ClassId classId) {
        super(str, i);
        this.classId = classId;
        Name nameM91040h = classId.m91040h();
        this.typeName = nameM91040h;
        FqName fqNameM91038f = classId.m91038f();
        Name nameM91079i = Name.m91079i(nameM91040h.m91082b() + "Array");
        nameM91079i.getClass();
        this.arrayClassId = new ClassId(fqNameM91038f, nameM91079i);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    @NotNull
    public final ClassId getArrayClassId() {
        return this.arrayClassId;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
