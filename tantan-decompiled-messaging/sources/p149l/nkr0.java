package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.mlkit_language_id_common.zzal;
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

/* JADX INFO: loaded from: classes6.dex */
public final class nkr0 implements ObjectEncoderContext {

    /* JADX INFO: renamed from: f */
    public static final Charset f139459f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f139460g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f139461h;

    /* JADX INFO: renamed from: i */
    public static final ObjectEncoder f139462i;

    /* JADX INFO: renamed from: a */
    public OutputStream f139463a;

    /* JADX INFO: renamed from: b */
    public final Map f139464b;

    /* JADX INFO: renamed from: c */
    public final Map f139465c;

    /* JADX INFO: renamed from: d */
    public final ObjectEncoder f139466d;

    /* JADX INFO: renamed from: e */
    public final rpr0 f139467e = new rpr0(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Constants.KEY_KEY);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f139460g = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f139461h = builder2.withProperty(bcr0Var2.m101121b()).build();
        f139462i = new ObjectEncoder() { // from class: l.cjr0
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                nkr0.m159989g((Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    public nkr0(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f139463a = outputStream;
        this.f139464b = map;
        this.f139465c = map2;
        this.f139466d = objectEncoder;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m159989g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f139460g, entry.getKey());
        objectEncoderContext.add(f139461h, entry.getValue());
    }

    /* JADX INFO: renamed from: h */
    private static int m159990h(FieldDescriptor fieldDescriptor) {
        qhr0 qhr0Var = (qhr0) fieldDescriptor.getProperty(qhr0.class);
        if (qhr0Var != null) {
            return qhr0Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: i */
    private final long m159991i(ObjectEncoder objectEncoder, Object obj) throws IOException {
        mdr0 mdr0Var = new mdr0();
        try {
            OutputStream outputStream = this.f139463a;
            this.f139463a = mdr0Var;
            try {
                objectEncoder.encode(obj, this);
                this.f139463a = outputStream;
                long jM154106k = mdr0Var.m154106k();
                mdr0Var.close();
                return jM154106k;
            } catch (Throwable th) {
                this.f139463a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                mdr0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static qhr0 m159992j(FieldDescriptor fieldDescriptor) {
        qhr0 qhr0Var = (qhr0) fieldDescriptor.getProperty(qhr0.class);
        if (qhr0Var != null) {
            return qhr0Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: m */
    private static ByteBuffer m159993m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: n */
    private final void m159994n(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f139463a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m159995o(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f139463a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ObjectEncoderContext m159996a(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this;
        }
        m159994n((m159990h(fieldDescriptor) << 3) | 1);
        this.f139463a.write(m159993m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        m159996a(FieldDescriptor.m16784of(str), d, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ObjectEncoderContext m159997b(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m159994n((m159990h(fieldDescriptor) << 3) | 5);
        this.f139463a.write(m159993m(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ObjectEncoderContext m159998c(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    m159994n((m159990h(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f139459f);
                    m159994n(bytes.length);
                    this.f139463a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m159998c(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m160002k(f139462i, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    m159996a(fieldDescriptor, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    m159997b(fieldDescriptor, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    m160000e(fieldDescriptor, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    m159999d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.f139464b.get(obj.getClass());
                    if (objectEncoder != null) {
                        m160002k(objectEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.f139465c.get(obj.getClass());
                    if (valueEncoder != null) {
                        m160003l(valueEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    if (obj instanceof per0) {
                        m159999d(fieldDescriptor, ((per0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        m159999d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m160002k(this.f139466d, fieldDescriptor, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    m159994n((m159990h(fieldDescriptor) << 3) | 2);
                    m159994n(bArr.length);
                    this.f139463a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final nkr0 m159999d(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            qhr0 qhr0VarM159992j = m159992j(fieldDescriptor);
            zzal zzalVar = zzal.DEFAULT;
            int iOrdinal = qhr0VarM159992j.zzb().ordinal();
            if (iOrdinal == 0) {
                m159994n(qhr0VarM159992j.zza() << 3);
                m159994n(i);
                return this;
            }
            if (iOrdinal == 1) {
                m159994n(qhr0VarM159992j.zza() << 3);
                m159994n((i + i) ^ (i >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                m159994n((qhr0VarM159992j.zza() << 3) | 5);
                this.f139463a.write(m159993m(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final nkr0 m160000e(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            qhr0 qhr0VarM159992j = m159992j(fieldDescriptor);
            zzal zzalVar = zzal.DEFAULT;
            int iOrdinal = qhr0VarM159992j.zzb().ordinal();
            if (iOrdinal == 0) {
                m159994n(qhr0VarM159992j.zza() << 3);
                m159995o(j);
                return this;
            }
            if (iOrdinal == 1) {
                m159994n(qhr0VarM159992j.zza() << 3);
                m159995o((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                m159994n((qhr0VarM159992j.zza() << 3) | 1);
                this.f139463a.write(m159993m(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final nkr0 m160001f(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f139464b.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        m160001f(obj);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final nkr0 m160002k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        long jM159991i = m159991i(objectEncoder, obj);
        if (z && jM159991i == 0) {
            return this;
        }
        m159994n((m159990h(fieldDescriptor) << 3) | 2);
        m159995o(jM159991i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final nkr0 m160003l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        this.f139467e.m180398a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f139467e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m16784of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        m159997b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        m159999d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        m160000e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        m159998c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        m159999d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        m159996a(fieldDescriptor, d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        m159999d(FieldDescriptor.m16784of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        m160000e(FieldDescriptor.m16784of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        m159998c(FieldDescriptor.m16784of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        m159999d(FieldDescriptor.m16784of(str), z ? 1 : 0, true);
        return this;
    }
}
