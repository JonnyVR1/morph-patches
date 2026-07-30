package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.List;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KmAnnotationArgument {

    public static final class AnnotationValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KmAnnotation f65110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(@NotNull KmAnnotation kmAnnotation) {
            super(null);
            kmAnnotation.getClass();
            this.f65110a = kmAnnotation;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnnotationValue) && Intrinsics.m88377d(this.f65110a, ((AnnotationValue) obj).f65110a);
        }

        public int hashCode() {
            return this.f65110a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AnnotationValue(" + this.f65110a + ')';
        }
    }

    @SourceDebugExtension
    public static final class ArrayKClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65111a;

        /* JADX INFO: renamed from: b */
        public final int f65112b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f65113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(@NotNull String str, int i) {
            super(null);
            str.getClass();
            this.f65111a = str;
            this.f65112b = i;
            if (i <= 0) {
                wg3.m206174a("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
                throw null;
            }
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.f65111a);
            int i3 = this.f65112b;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.f65113c = sb.toString();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayKClassValue)) {
                return false;
            }
            ArrayKClassValue arrayKClassValue = (ArrayKClassValue) obj;
            return Intrinsics.m88377d(this.f65111a, arrayKClassValue.f65111a) && this.f65112b == arrayKClassValue.f65112b;
        }

        public int hashCode() {
            return (this.f65111a.hashCode() * 31) + Integer.hashCode(this.f65112b);
        }

        @NotNull
        public String toString() {
            return this.f65113c;
        }
    }

    public static final class ArrayValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<KmAnnotationArgument> f65114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArrayValue(@NotNull List<? extends KmAnnotationArgument> list) {
            super(null);
            list.getClass();
            this.f65114a = list;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArrayValue) && Intrinsics.m88377d(this.f65114a, ((ArrayValue) obj).f65114a);
        }

        public int hashCode() {
            return this.f65114a.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArrayValue(" + this.f65114a + ')';
        }
    }

    public static final class BooleanValue extends LiteralValue<Boolean> {

        /* JADX INFO: renamed from: a */
        public final boolean f65115a;

        public BooleanValue(boolean z) {
            super(null);
            this.f65115a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo89976a() {
            return Boolean.valueOf(this.f65115a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BooleanValue) && this.f65115a == ((BooleanValue) obj).f65115a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f65115a);
        }
    }

    public static final class ByteValue extends LiteralValue<Byte> {

        /* JADX INFO: renamed from: a */
        public final byte f65116a;

        public ByteValue(byte b) {
            super(null);
            this.f65116a = b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte mo89976a() {
            return Byte.valueOf(this.f65116a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByteValue) && this.f65116a == ((ByteValue) obj).f65116a;
        }

        public int hashCode() {
            return Byte.hashCode(this.f65116a);
        }
    }

    public static final class CharValue extends LiteralValue<Character> {

        /* JADX INFO: renamed from: a */
        public final char f65117a;

        public CharValue(char c) {
            super(null);
            this.f65117a = c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character mo89976a() {
            return Character.valueOf(this.f65117a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharValue) && this.f65117a == ((CharValue) obj).f65117a;
        }

        public int hashCode() {
            return Character.hashCode(this.f65117a);
        }
    }

    public static final class DoubleValue extends LiteralValue<Double> {

        /* JADX INFO: renamed from: a */
        public final double f65118a;

        public DoubleValue(double d) {
            super(null);
            this.f65118a = d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double mo89976a() {
            return Double.valueOf(this.f65118a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleValue) && Double.compare(this.f65118a, ((DoubleValue) obj).f65118a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f65118a);
        }
    }

    public static final class EnumValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65119a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f65120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f65119a = str;
            this.f65120b = str2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumValue)) {
                return false;
            }
            EnumValue enumValue = (EnumValue) obj;
            return Intrinsics.m88377d(this.f65119a, enumValue.f65119a) && Intrinsics.m88377d(this.f65120b, enumValue.f65120b);
        }

        public int hashCode() {
            return (this.f65119a.hashCode() * 31) + this.f65120b.hashCode();
        }

        @NotNull
        public String toString() {
            return "EnumValue(" + this.f65119a + '.' + this.f65120b + ')';
        }
    }

    public static final class FloatValue extends LiteralValue<Float> {

        /* JADX INFO: renamed from: a */
        public final float f65121a;

        public FloatValue(float f) {
            super(null);
            this.f65121a = f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float mo89976a() {
            return Float.valueOf(this.f65121a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Float.compare(this.f65121a, ((FloatValue) obj).f65121a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f65121a);
        }
    }

    public static final class IntValue extends LiteralValue<Integer> {

        /* JADX INFO: renamed from: a */
        public final int f65122a;

        public IntValue(int i) {
            super(null);
            this.f65122a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer mo89976a() {
            return Integer.valueOf(this.f65122a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.f65122a == ((IntValue) obj).f65122a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65122a);
        }
    }

    public static final class KClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65123a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65123a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KClassValue) && Intrinsics.m88377d(this.f65123a, ((KClassValue) obj).f65123a);
        }

        public int hashCode() {
            return this.f65123a.hashCode();
        }

        @NotNull
        public String toString() {
            return "KClassValue(" + this.f65123a + ')';
        }
    }

    public static final class LongValue extends LiteralValue<Long> {

        /* JADX INFO: renamed from: a */
        public final long f65124a;

        public LongValue(long j) {
            super(null);
            this.f65124a = j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo89976a() {
            return Long.valueOf(this.f65124a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongValue) && this.f65124a == ((LongValue) obj).f65124a;
        }

        public int hashCode() {
            return Long.hashCode(this.f65124a);
        }
    }

    public static final class ShortValue extends LiteralValue<Short> {

        /* JADX INFO: renamed from: a */
        public final short f65125a;

        public ShortValue(short s) {
            super(null);
            this.f65125a = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short mo89976a() {
            return Short.valueOf(this.f65125a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortValue) && this.f65125a == ((ShortValue) obj).f65125a;
        }

        public int hashCode() {
            return Short.hashCode(this.f65125a);
        }
    }

    public static final class StringValue extends LiteralValue<String> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f65126a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(@NotNull String str) {
            super(null);
            str.getClass();
            this.f65126a = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo89976a() {
            return this.f65126a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.m88377d(this.f65126a, ((StringValue) obj).f65126a);
        }

        public int hashCode() {
            return this.f65126a.hashCode();
        }
    }

    public /* synthetic */ KmAnnotationArgument(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KmAnnotationArgument() {
    }

    public static abstract class LiteralValue<T> extends KmAnnotationArgument {
        private LiteralValue() {
            super(null);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract T mo89976a();

        @NotNull
        public final String toString() {
            String string;
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('(');
            if (this instanceof StringValue) {
                string = "\"" + ((Object) ((StringValue) this).mo89976a()) + '\"';
            } else {
                string = mo89976a().toString();
            }
            sb.append(string);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ LiteralValue(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class UByteValue extends LiteralValue<UByte> {

        /* JADX INFO: renamed from: a */
        public final byte f65127a;

        public UByteValue(byte b) {
            super(null);
            this.f65127a = b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UByte mo89976a() {
            return UByte.m88130a(m89986b());
        }

        /* JADX INFO: renamed from: b */
        public byte m89986b() {
            return this.f65127a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UByteValue) && this.f65127a == ((UByteValue) obj).f65127a;
        }

        public int hashCode() {
            return UByte.m88133g(this.f65127a);
        }

        public /* synthetic */ UByteValue(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }
    }

    public static final class UIntValue extends LiteralValue<UInt> {

        /* JADX INFO: renamed from: a */
        public final int f65128a;

        public UIntValue(int i) {
            super(null);
            this.f65128a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UInt mo89976a() {
            return UInt.m88153a(m89987b());
        }

        /* JADX INFO: renamed from: b */
        public int m89987b() {
            return this.f65128a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIntValue) && this.f65128a == ((UIntValue) obj).f65128a;
        }

        public int hashCode() {
            return UInt.m88156g(this.f65128a);
        }

        public /* synthetic */ UIntValue(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }
    }

    public static final class ULongValue extends LiteralValue<ULong> {

        /* JADX INFO: renamed from: a */
        public final long f65129a;

        public ULongValue(long j) {
            super(null);
            this.f65129a = j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ ULong mo89976a() {
            return ULong.m88176a(m89988b());
        }

        /* JADX INFO: renamed from: b */
        public long m89988b() {
            return this.f65129a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ULongValue) && this.f65129a == ((ULongValue) obj).f65129a;
        }

        public int hashCode() {
            return ULong.m88179g(this.f65129a);
        }

        public /* synthetic */ ULongValue(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public static final class UShortValue extends LiteralValue<UShort> {

        /* JADX INFO: renamed from: a */
        public final short f65130a;

        public UShortValue(short s) {
            super(null);
            this.f65130a = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UShort mo89976a() {
            return UShort.m88199a(m89989b());
        }

        /* JADX INFO: renamed from: b */
        public short m89989b() {
            return this.f65130a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UShortValue) && this.f65130a == ((UShortValue) obj).f65130a;
        }

        public int hashCode() {
            return UShort.m88202g(this.f65130a);
        }

        public /* synthetic */ UShortValue(short s, DefaultConstructorMarker defaultConstructorMarker) {
            this(s);
        }
    }
}
