package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final FieldDescriptor MAP_KEY_DESC = FieldDescriptor.builder(Constants.KEY_KEY).withProperty(AtProtobuf.builder().tag(1).build()).build();
    private static final FieldDescriptor MAP_VALUE_DESC = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();
    private static final ObjectEncoder<Map.Entry<Object, Object>> DEFAULT_MAP_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.a
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ProtobufDataEncoderContext.m16788a((Map.Entry) obj, objectEncoderContext);
        }
    };

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    public static /* synthetic */ class C31941 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding */
        static final /* synthetic */ int[] f11458x531607dd;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f11458x531607dd = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11458x531607dd[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11458x531607dd[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16788a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    private static ByteBuffer allocateBuffer(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long determineSize(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> ProtobufDataEncoderContext doEncode(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long jDetermineSize = determineSize(objectEncoder, t);
        if (z && jDetermineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(jDetermineSize);
        objectEncoder.encode(t, this);
        return this;
    }

    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void writeVarInt32(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.output;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    private void writeVarInt64(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.output;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(UTF_8);
                    writeVarInt32(bytes.length);
                    this.output.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    add(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    doEncode((ObjectEncoder<Map.Entry>) DEFAULT_MAP_ENCODER, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return add(fieldDescriptor, ((Double) obj).doubleValue(), z);
                }
                if (obj instanceof Float) {
                    return add(fieldDescriptor, ((Float) obj).floatValue(), z);
                }
                if (obj instanceof Number) {
                    return add(fieldDescriptor, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
                    if (objectEncoder != null) {
                        return doEncode(objectEncoder, fieldDescriptor, obj, z);
                    }
                    ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
                    if (valueEncoder != null) {
                        return doEncode(valueEncoder, fieldDescriptor, obj, z);
                    }
                    if (obj instanceof ProtoEnum) {
                        return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
                    }
                    return obj instanceof Enum ? add(fieldDescriptor, ((Enum) obj).ordinal()) : doEncode(this.fallbackEncoder, fieldDescriptor, obj, z);
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    writeVarInt32(bArr.length);
                    this.output.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public ProtobufDataEncoderContext encode(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return encode(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m16784of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    private <T> ProtobufDataEncoderContext doEncode(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.valueEncoderContext.resetContext(fieldDescriptor, z);
        valueEncoder.encode(t, this.valueEncoderContext);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.m16784of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        return add(FieldDescriptor.m16784of(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        return add(FieldDescriptor.m16784of(str), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        return add(FieldDescriptor.m16784of(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        return add(FieldDescriptor.m16784of(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        return add(fieldDescriptor, d, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        return add(fieldDescriptor, f, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        return add(fieldDescriptor, i, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i2 = C31941.f11458x531607dd[protobuf.intEncoding().ordinal()];
            if (i2 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i);
                return this;
            }
            if (i2 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i << 1) ^ (i >> 31));
                return this;
            }
            if (i2 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(allocateBuffer(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return add(fieldDescriptor, j, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i = C31941.f11458x531607dd[protobuf.intEncoding().ordinal()];
            if (i == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64(j);
                return this;
            }
            if (i == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64((j >> 63) ^ (j << 1));
                return this;
            }
            if (i == 3) {
                writeVarInt32((protobuf.tag() << 3) | 1);
                this.output.write(allocateBuffer(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return add(fieldDescriptor, z, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws IOException {
        return add(fieldDescriptor, z ? 1 : 0, z2);
    }
}
