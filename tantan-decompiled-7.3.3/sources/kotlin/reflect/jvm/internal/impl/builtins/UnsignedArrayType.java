package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
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
public final class UnsignedArrayType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        ClassId.Companion companion = ClassId.Companion;
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.m91934b(companion, "kotlin/UByteArray", false, 2, null));
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.m91934b(companion, "kotlin/UShortArray", false, 2, null));
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.m91934b(companion, "kotlin/UIntArray", false, 2, null));
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.m91934b(companion, "kotlin/ULongArray", false, 2, null));
        UnsignedArrayType[] unsignedArrayTypeArr$values = $values();
        $VALUES = unsignedArrayTypeArr$values;
        $ENTRIES = EnumEntriesKt.m88274a(unsignedArrayTypeArr$values);
    }

    private UnsignedArrayType(String str, int i, ClassId classId) {
        super(str, i);
        this.classId = classId;
        this.typeName = classId.m91931h();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
