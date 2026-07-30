package com.google.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: loaded from: classes7.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: a */
    public static final int f11562a = m17074c(1, 3);

    /* JADX INFO: renamed from: b */
    public static final int f11563b = m17074c(1, 4);

    /* JADX INFO: renamed from: c */
    public static final int f11564c = m17074c(2, 0);

    /* JADX INFO: renamed from: d */
    public static final int f11565d = m17074c(3, 2);

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        JavaType(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.WireFormat$a */
    public static /* synthetic */ class C3402a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11566a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f11566a = iArr;
            try {
                iArr[FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11566a[FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11566a[FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11566a[FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11566a[FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11566a[FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11566a[FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11566a[FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11566a[FieldType.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11566a[FieldType.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11566a[FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11566a[FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11566a[FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11566a[FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11566a[FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11566a[FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11566a[FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11566a[FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m17072a(int i) {
        return i >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public static int m17073b(int i) {
        return i & 7;
    }

    /* JADX INFO: renamed from: c */
    public static int m17074c(int i, int i2) {
        return (i << 3) | i2;
    }

    /* JADX INFO: renamed from: d */
    public static Object m17075d(C3407e c3407e, FieldType fieldType, Utf8Validation utf8Validation) throws IOException {
        switch (C3402a.f11566a[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(c3407e.m17135o());
            case 2:
                return Float.valueOf(c3407e.m17139s());
            case 3:
                return Long.valueOf(c3407e.m17142v());
            case 4:
                return Long.valueOf(c3407e.m17118O());
            case 5:
                return Integer.valueOf(c3407e.m17141u());
            case 6:
                return Long.valueOf(c3407e.m17138r());
            case 7:
                return Integer.valueOf(c3407e.m17137q());
            case 8:
                return Boolean.valueOf(c3407e.m17133m());
            case 9:
                return c3407e.m17134n();
            case 10:
                return Integer.valueOf(c3407e.m17117N());
            case 11:
                return Integer.valueOf(c3407e.m17110G());
            case 12:
                return Long.valueOf(c3407e.m17111H());
            case 13:
                return Integer.valueOf(c3407e.m17112I());
            case 14:
                return Long.valueOf(c3407e.m17113J());
            case 15:
                return utf8Validation.readString(c3407e);
            case 16:
                ig3.m135964a("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                ig3.m135964a("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                ig3.m135964a("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    public enum Utf8Validation {
        LOOSE { // from class: com.google.protobuf.WireFormat.Utf8Validation.1
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object readString(C3407e c3407e) throws IOException {
                return c3407e.m17114K();
            }
        },
        STRICT { // from class: com.google.protobuf.WireFormat.Utf8Validation.2
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object readString(C3407e c3407e) throws IOException {
                return c3407e.m17115L();
            }
        },
        LAZY { // from class: com.google.protobuf.WireFormat.Utf8Validation.3
            @Override // com.google.protobuf.WireFormat.Utf8Validation
            public Object readString(C3407e c3407e) throws IOException {
                return c3407e.m17134n();
            }
        };

        public abstract Object readString(C3407e c3407e) throws IOException;

        /* synthetic */ Utf8Validation(C3402a c3402a) {
            this();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType BOOL;
        public static final FieldType BYTES;
        public static final FieldType DOUBLE;
        public static final FieldType ENUM;
        public static final FieldType FIXED32;
        public static final FieldType FIXED64;
        public static final FieldType FLOAT;
        public static final FieldType GROUP;
        public static final FieldType INT32;
        public static final FieldType INT64;
        public static final FieldType MESSAGE;
        public static final FieldType SFIXED32;
        public static final FieldType SFIXED64;
        public static final FieldType SINT32;
        public static final FieldType SINT64;
        public static final FieldType STRING;
        public static final FieldType UINT32;
        public static final FieldType UINT64;
        private final JavaType javaType;
        private final int wireType;

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            INT64 = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            UINT64 = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            INT32 = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            FIXED64 = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            FIXED32 = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            FieldType fieldType9 = new FieldType("STRING", 8, JavaType.STRING, 2) { // from class: com.google.protobuf.WireFormat.FieldType.1
                {
                    C3402a c3402a = null;
                }

                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            STRING = fieldType9;
            JavaType javaType3 = JavaType.MESSAGE;
            FieldType fieldType10 = new FieldType("GROUP", 9, javaType3, 3) { // from class: com.google.protobuf.WireFormat.FieldType.2
                {
                    C3402a c3402a = null;
                }

                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            GROUP = fieldType10;
            int i = 2;
            FieldType fieldType11 = new FieldType("MESSAGE", 10, javaType3, i) { // from class: com.google.protobuf.WireFormat.FieldType.3
                {
                    C3402a c3402a = null;
                }

                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            MESSAGE = fieldType11;
            FieldType fieldType12 = new FieldType("BYTES", 11, JavaType.BYTE_STRING, i) { // from class: com.google.protobuf.WireFormat.FieldType.4
                {
                    C3402a c3402a = null;
                }

                @Override // com.google.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            BYTES = fieldType12;
            FieldType fieldType13 = new FieldType("UINT32", 12, javaType2, 0);
            UINT32 = fieldType13;
            FieldType fieldType14 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            ENUM = fieldType14;
            FieldType fieldType15 = new FieldType("SFIXED32", 14, javaType2, 5);
            SFIXED32 = fieldType15;
            FieldType fieldType16 = new FieldType("SFIXED64", 15, javaType, 1);
            SFIXED64 = fieldType16;
            FieldType fieldType17 = new FieldType("SINT32", 16, javaType2, 0);
            SINT32 = fieldType17;
            FieldType fieldType18 = new FieldType("SINT64", 17, javaType, 0);
            SINT64 = fieldType18;
            $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(String str, int i, JavaType javaType, int i2) {
            super(str, i);
            this.javaType = javaType;
            this.wireType = i2;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        public /* synthetic */ FieldType(String str, int i, JavaType javaType, int i2, C3402a c3402a) {
            this(str, i, javaType, i2);
        }
    }
}
