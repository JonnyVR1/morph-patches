package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.reflect.KClass;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.o4c;
import p153l.p7f;
import p153l.qzv;
import p153l.wtq0;
import p153l.wwq0;
import p153l.y6c;
import p153l.yg3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001a B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\f2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m88121d2 = {"Landroidx/work/Data;", "", "other", "<init>", "(Landroidx/work/Data;)V", "", "", "values", "(Ljava/util/Map;)V", Constants.KEY_KEY, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", p7f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "klass", "", "e", "(Ljava/lang/String;Ljava/lang/Class;)Z", "", "f", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "keyValueMap", "Companion", "b", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class Data {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Data f3391b = new C0755a().m4322a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> values;

    /* JADX INFO: renamed from: androidx.work.Data$a */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Landroidx/work/Data$a;", "", "<init>", "()V", "", Constants.KEY_KEY, "value", "f", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$a;", "Landroidx/work/Data;", "data", "c", "(Landroidx/work/Data;)Landroidx/work/Data$a;", "", "values", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;)Landroidx/work/Data$a;", "b", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$a;", "a", "()Landroidx/work/Data;", "e", "", "Ljava/util/Map;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C0755a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> values = new LinkedHashMap();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Data m4322a() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.INSTANCE.m4335e(data);
            return data;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        /* JADX INFO: renamed from: b */
        public final C0755a m4323b(@NotNull String key, @Nullable Object value) {
            key.getClass();
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                KClass kClassM88396b = Reflection.m88396b(value.getClass());
                if (!(Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Boolean.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Byte.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Integer.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Long.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Float.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Double.TYPE)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(String.class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Boolean[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Byte[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Integer[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Long[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Float[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Double[].class)) ? true : Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(String[].class)))) {
                    if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(boolean[].class))) {
                        value = y6c.m214456h((boolean[]) value);
                    } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(byte[].class))) {
                        value = y6c.m214457i((byte[]) value);
                    } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(int[].class))) {
                        value = y6c.m214460l((int[]) value);
                    } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(long[].class))) {
                        value = y6c.m214461m((long[]) value);
                    } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(float[].class))) {
                        value = y6c.m214459k((float[]) value);
                    } else {
                        if (!Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(double[].class))) {
                            wwq0.m208289a("Key ", key, " has invalid type ", kClassM88396b);
                            return null;
                        }
                        value = y6c.m214458j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C0755a m4324c(@NotNull Data data) {
            data.getClass();
            m4325d(data.values);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C0755a m4325d(@NotNull Map<String, ? extends Object> values) {
            values.getClass();
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                m4323b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final C0755a m4326e(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C0755a m4327f(@NotNull String key, @Nullable String value) {
            key.getClass();
            return m4326e(key, value);
        }
    }

    /* JADX INFO: renamed from: androidx.work.Data$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, m88121d2 = {"Landroidx/work/Data$b;", "", "<init>", "()V", "Landroidx/work/Data;", "data", "", "e", "(Landroidx/work/Data;)[B", HttpHeaderValues.BYTES, "a", "([B)Landroidx/work/Data;", "EMPTY", "Landroidx/work/Data;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", p7f.LATITUDE_SOUTH, "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static final boolean m4328b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            boolean z = false;
            if (bArr[0] == -84 && bArr[1] == -19) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        /* JADX INFO: renamed from: c */
        public static final void m4329c(DataInputStream dataInputStream) throws IOException {
            short s = dataInputStream.readShort();
            if (s != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s)).toString());
            }
            short s2 = dataInputStream.readShort();
            if (s2 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s2)).toString());
        }

        /* JADX INFO: renamed from: d */
        public static final Object m4330d(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int i2 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i2];
                while (i < i2) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return boolArr;
            }
            if (b == 9) {
                int i3 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i3];
                while (i < i3) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return bArr;
            }
            if (b == 10) {
                int i4 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i4];
                while (i < i4) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return numArr;
            }
            if (b == 11) {
                int i5 = dataInputStream.readInt();
                Long[] lArr = new Long[i5];
                while (i < i5) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return lArr;
            }
            if (b == 12) {
                int i6 = dataInputStream.readInt();
                Float[] fArr = new Float[i6];
                while (i < i6) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return fArr;
            }
            if (b == 13) {
                int i7 = dataInputStream.readInt();
                Double[] dArr = new Double[i7];
                while (i < i7) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return dArr;
            }
            if (b != 14) {
                o4c.m165980a("Unsupported type ", b);
                return null;
            }
            int i8 = dataInputStream.readInt();
            String[] strArr = new String[i8];
            while (i < i8) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.m88377d(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i] = utf;
                i++;
            }
            return strArr;
        }

        /* JADX INFO: renamed from: f */
        public static final void m4331f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i;
            KClass kClassM88396b = Reflection.m88396b(objArr.getClass());
            if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Boolean[].class))) {
                i = 8;
            } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Byte[].class))) {
                i = 9;
            } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Integer[].class))) {
                i = 10;
            } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Long[].class))) {
                i = 11;
            } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Float[].class))) {
                i = 12;
            } else if (Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(Double[].class))) {
                i = 13;
            } else {
                if (!Intrinsics.m88377d(kClassM88396b, Reflection.m88396b(String[].class))) {
                    yg3.m215829a("Unsupported value type ", Reflection.m88396b(objArr.getClass()).mo88359r());
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l2 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static final void m4332g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    yg3.m215829a("Unsupported value type ", Reflection.m88396b(obj.getClass()).mo88360s());
                    return;
                }
                m4331f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        /* JADX INFO: renamed from: h */
        public static final void m4333h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Data m4334a(@NotNull byte[] bytes) {
            bytes.getClass();
            if (bytes.length > 10240) {
                wtq0.m207906a("Data cannot occupy more than 10240 bytes when serialized");
                return null;
            }
            if (bytes.length == 0) {
                return Data.f3391b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i = 0;
                if (m4328b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i2 = objectInputStream.readInt();
                        while (i < i2) {
                            String utf = objectInputStream.readUTF();
                            utf.getClass();
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i++;
                        }
                        CloseableKt.m88293a(objectInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.m88293a(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        m4329c(dataInputStream);
                        int i3 = dataInputStream.readInt();
                        while (i < i3) {
                            Object objM4330d = m4330d(dataInputStream, dataInputStream.readByte());
                            String utf2 = dataInputStream.readUTF();
                            utf2.getClass();
                            linkedHashMap.put(utf2, objM4330d);
                            i++;
                        }
                        CloseableKt.m88293a(dataInputStream, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.m88293a(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e) {
                qzv.m178829e().mo178835d(y6c.f197677a, "Error in Data#fromByteArray: ", e);
            } catch (ClassNotFoundException e2) {
                qzv.m178829e().mo178835d(y6c.f197677a, "Error in Data#fromByteArray: ", e2);
            }
            return new Data(linkedHashMap);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        /* JADX INFO: renamed from: e */
        public final byte[] m4335e(@NotNull Data data) {
            data.getClass();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    m4333h(dataOutputStream);
                    dataOutputStream.writeInt(data.m4321f());
                    for (Map.Entry entry : data.values.entrySet()) {
                        m4332g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.m88293a(dataOutputStream, null);
                    byteArray.getClass();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(dataOutputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                qzv.m178829e().mo178835d(y6c.f197677a, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        public Companion() {
        }
    }

    public Data(@NotNull Data data) {
        data.getClass();
        this.values = new HashMap(data.values);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Data m4316b(@NotNull byte[] bArr) {
        return INSTANCE.m4334a(bArr);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final byte[] m4317g(@NotNull Data data) {
        return INSTANCE.m4335e(data);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m4318c() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m4319d(@NotNull String key) {
        key.getClass();
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final <T> boolean m4320e(@NotNull String key, @NotNull Class<T> klass) {
        key.getClass();
        klass.getClass();
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public boolean equals(@Nullable Object other) {
        boolean zM88377d;
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m88377d(Data.class, other.getClass())) {
            return false;
        }
        Data data = (Data) other;
        Set<String> setKeySet = this.values.keySet();
        if (!Intrinsics.m88377d(setKeySet, data.values.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.values.get(str);
            Object obj2 = data.values.get(str);
            if (obj == null || obj2 == null) {
                zM88377d = obj == obj2;
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (obj2 instanceof Object[]) {
                    zM88377d = ArraysKt.contentDeepEquals(objArr, (Object[]) obj2);
                } else {
                    zM88377d = Intrinsics.m88377d(obj, obj2);
                }
            } else {
                zM88377d = Intrinsics.m88377d(obj, obj2);
            }
            if (!zM88377d) {
                return false;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final int m4321f() {
        return this.values.size();
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ ArraysKt.contentDeepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    @NotNull
    public String toString() {
        return "Data {" + CollectionsKt.joinToString$default(this.values.entrySet(), null, null, null, 0, null, new Function1<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: androidx.work.Data$toString$1$content$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Map.Entry<String, ? extends Object> entry) {
                entry.getClass();
                String key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(key);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                return invoke2((Map.Entry<String, ? extends Object>) entry);
            }
        }, 31, null) + "}";
    }

    public Data(@NotNull Map<String, ?> map) {
        map.getClass();
        this.values = new HashMap(map);
    }
}
