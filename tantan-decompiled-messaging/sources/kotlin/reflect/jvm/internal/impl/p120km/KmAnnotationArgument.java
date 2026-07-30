package kotlin.reflect.jvm.internal.impl.p120km;

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
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KmAnnotationArgument {

    public static final class AnnotationValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final KmAnnotation f64436a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(@NotNull KmAnnotation kmAnnotation) {
            super(null);
            kmAnnotation.getClass();
            this.f64436a = kmAnnotation;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnnotationValue) && Intrinsics.m87488d(this.f64436a, ((AnnotationValue) obj).f64436a);
        }

        public int hashCode() {
            return this.f64436a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AnnotationValue(" + this.f64436a + ')';
        }
    }

    @SourceDebugExtension
    public static final class ArrayKClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64437a;

        /* JADX INFO: renamed from: b */
        public final int f64438b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final String f64439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(@NotNull String str, int i) {
            super(null);
            str.getClass();
            this.f64437a = str;
            this.f64438b = i;
            if (i <= 0) {
                ig3.m135964a("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
                throw null;
            }
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.f64437a);
            int i3 = this.f64438b;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(">");
            }
            sb.append(")");
            this.f64439c = sb.toString();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayKClassValue)) {
                return false;
            }
            ArrayKClassValue arrayKClassValue = (ArrayKClassValue) obj;
            return Intrinsics.m87488d(this.f64437a, arrayKClassValue.f64437a) && this.f64438b == arrayKClassValue.f64438b;
        }

        public int hashCode() {
            return (this.f64437a.hashCode() * 31) + Integer.hashCode(this.f64438b);
        }

        @NotNull
        public String toString() {
            return this.f64439c;
        }
    }

    public static final class ArrayValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final List<KmAnnotationArgument> f64440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArrayValue(@NotNull List<? extends KmAnnotationArgument> list) {
            super(null);
            list.getClass();
            this.f64440a = list;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArrayValue) && Intrinsics.m87488d(this.f64440a, ((ArrayValue) obj).f64440a);
        }

        public int hashCode() {
            return this.f64440a.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArrayValue(" + this.f64440a + ')';
        }
    }

    public static final class BooleanValue extends LiteralValue<Boolean> {

        /* JADX INFO: renamed from: a */
        public final boolean f64441a;

        public BooleanValue(boolean z) {
            super(null);
            this.f64441a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo89085a() {
            return Boolean.valueOf(this.f64441a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BooleanValue) && this.f64441a == ((BooleanValue) obj).f64441a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f64441a);
        }
    }

    public static final class ByteValue extends LiteralValue<Byte> {

        /* JADX INFO: renamed from: a */
        public final byte f64442a;

        public ByteValue(byte b) {
            super(null);
            this.f64442a = b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte mo89085a() {
            return Byte.valueOf(this.f64442a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByteValue) && this.f64442a == ((ByteValue) obj).f64442a;
        }

        public int hashCode() {
            return Byte.hashCode(this.f64442a);
        }
    }

    public static final class CharValue extends LiteralValue<Character> {

        /* JADX INFO: renamed from: a */
        public final char f64443a;

        public CharValue(char c) {
            super(null);
            this.f64443a = c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character mo89085a() {
            return Character.valueOf(this.f64443a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharValue) && this.f64443a == ((CharValue) obj).f64443a;
        }

        public int hashCode() {
            return Character.hashCode(this.f64443a);
        }
    }

    public static final class DoubleValue extends LiteralValue<Double> {

        /* JADX INFO: renamed from: a */
        public final double f64444a;

        public DoubleValue(double d) {
            super(null);
            this.f64444a = d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double mo89085a() {
            return Double.valueOf(this.f64444a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleValue) && Double.compare(this.f64444a, ((DoubleValue) obj).f64444a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f64444a);
        }
    }

    public static final class EnumValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64445a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final String f64446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f64445a = str;
            this.f64446b = str2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnumValue)) {
                return false;
            }
            EnumValue enumValue = (EnumValue) obj;
            return Intrinsics.m87488d(this.f64445a, enumValue.f64445a) && Intrinsics.m87488d(this.f64446b, enumValue.f64446b);
        }

        public int hashCode() {
            return (this.f64445a.hashCode() * 31) + this.f64446b.hashCode();
        }

        @NotNull
        public String toString() {
            return "EnumValue(" + this.f64445a + '.' + this.f64446b + ')';
        }
    }

    public static final class FloatValue extends LiteralValue<Float> {

        /* JADX INFO: renamed from: a */
        public final float f64447a;

        public FloatValue(float f) {
            super(null);
            this.f64447a = f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float mo89085a() {
            return Float.valueOf(this.f64447a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Float.compare(this.f64447a, ((FloatValue) obj).f64447a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f64447a);
        }
    }

    public static final class IntValue extends LiteralValue<Integer> {

        /* JADX INFO: renamed from: a */
        public final int f64448a;

        public IntValue(int i) {
            super(null);
            this.f64448a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer mo89085a() {
            return Integer.valueOf(this.f64448a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.f64448a == ((IntValue) obj).f64448a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64448a);
        }
    }

    public static final class KClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64449a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(@NotNull String str) {
            super(null);
            str.getClass();
            this.f64449a = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KClassValue) && Intrinsics.m87488d(this.f64449a, ((KClassValue) obj).f64449a);
        }

        public int hashCode() {
            return this.f64449a.hashCode();
        }

        @NotNull
        public String toString() {
            return "KClassValue(" + this.f64449a + ')';
        }
    }

    public static final class LongValue extends LiteralValue<Long> {

        /* JADX INFO: renamed from: a */
        public final long f64450a;

        public LongValue(long j) {
            super(null);
            this.f64450a = j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo89085a() {
            return Long.valueOf(this.f64450a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongValue) && this.f64450a == ((LongValue) obj).f64450a;
        }

        public int hashCode() {
            return Long.hashCode(this.f64450a);
        }
    }

    public static final class ShortValue extends LiteralValue<Short> {

        /* JADX INFO: renamed from: a */
        public final short f64451a;

        public ShortValue(short s) {
            super(null);
            this.f64451a = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short mo89085a() {
            return Short.valueOf(this.f64451a);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortValue) && this.f64451a == ((ShortValue) obj).f64451a;
        }

        public int hashCode() {
            return Short.hashCode(this.f64451a);
        }
    }

    public static final class StringValue extends LiteralValue<String> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f64452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(@NotNull String str) {
            super(null);
            str.getClass();
            this.f64452a = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo89085a() {
            return this.f64452a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.m87488d(this.f64452a, ((StringValue) obj).f64452a);
        }

        public int hashCode() {
            return this.f64452a.hashCode();
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
        public abstract T mo89085a();

        @NotNull
        public final String toString() {
            String string;
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('(');
            if (this instanceof StringValue) {
                string = "\"" + ((Object) ((StringValue) this).mo89085a()) + '\"';
            } else {
                string = mo89085a().toString();
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
        public final byte f64453a;

        public UByteValue(byte b) {
            super(null);
            this.f64453a = b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UByte mo89085a() {
            return UByte.m87241a(m89095b());
        }

        /* JADX INFO: renamed from: b */
        public byte m89095b() {
            return this.f64453a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UByteValue) && this.f64453a == ((UByteValue) obj).f64453a;
        }

        public int hashCode() {
            return UByte.m87244g(this.f64453a);
        }

        public /* synthetic */ UByteValue(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }
    }

    public static final class UIntValue extends LiteralValue<UInt> {

        /* JADX INFO: renamed from: a */
        public final int f64454a;

        public UIntValue(int i) {
            super(null);
            this.f64454a = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UInt mo89085a() {
            return UInt.m87264a(m89096b());
        }

        /* JADX INFO: renamed from: b */
        public int m89096b() {
            return this.f64454a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UIntValue) && this.f64454a == ((UIntValue) obj).f64454a;
        }

        public int hashCode() {
            return UInt.m87267g(this.f64454a);
        }

        public /* synthetic */ UIntValue(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }
    }

    public static final class ULongValue extends LiteralValue<ULong> {

        /* JADX INFO: renamed from: a */
        public final long f64455a;

        public ULongValue(long j) {
            super(null);
            this.f64455a = j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ ULong mo89085a() {
            return ULong.m87287a(m89097b());
        }

        /* JADX INFO: renamed from: b */
        public long m89097b() {
            return this.f64455a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ULongValue) && this.f64455a == ((ULongValue) obj).f64455a;
        }

        public int hashCode() {
            return ULong.m87290g(this.f64455a);
        }

        public /* synthetic */ ULongValue(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public static final class UShortValue extends LiteralValue<UShort> {

        /* JADX INFO: renamed from: a */
        public final short f64456a;

        public UShortValue(short s) {
            super(null);
            this.f64456a = s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ UShort mo89085a() {
            return UShort.m87310a(m89098b());
        }

        /* JADX INFO: renamed from: b */
        public short m89098b() {
            return this.f64456a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UShortValue) && this.f64456a == ((UShortValue) obj).f64456a;
        }

        public int hashCode() {
            return UShort.m87313g(this.f64456a);
        }

        public /* synthetic */ UShortValue(short s, DefaultConstructorMarker defaultConstructorMarker) {
            this(s);
        }
    }
}
