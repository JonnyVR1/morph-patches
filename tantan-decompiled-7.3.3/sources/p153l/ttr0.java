package p153l;

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
public final class ttr0 implements ObjectEncoderContext {

    /* JADX INFO: renamed from: f */
    public static final Charset f176092f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f176093g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f176094h;

    /* JADX INFO: renamed from: i */
    public static final ObjectEncoder f176095i;

    /* JADX INFO: renamed from: a */
    public OutputStream f176096a;

    /* JADX INFO: renamed from: b */
    public final Map f176097b;

    /* JADX INFO: renamed from: c */
    public final Map f176098c;

    /* JADX INFO: renamed from: d */
    public final ObjectEncoder f176099d;

    /* JADX INFO: renamed from: e */
    public final xyr0 f176100e = new xyr0(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Constants.KEY_KEY);
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f176093g = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f176094h = builder2.withProperty(hlr0Var2.m135771b()).build();
        f176095i = new ObjectEncoder() { // from class: l.isr0
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                ttr0.m192677g((Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    public ttr0(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f176096a = outputStream;
        this.f176097b = map;
        this.f176098c = map2;
        this.f176099d = objectEncoder;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m192677g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f176093g, entry.getKey());
        objectEncoderContext.add(f176094h, entry.getValue());
    }

    /* JADX INFO: renamed from: h */
    private static int m192678h(FieldDescriptor fieldDescriptor) {
        wqr0 wqr0Var = (wqr0) fieldDescriptor.getProperty(wqr0.class);
        if (wqr0Var != null) {
            return wqr0Var.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: i */
    private final long m192679i(ObjectEncoder objectEncoder, Object obj) throws IOException {
        smr0 smr0Var = new smr0();
        try {
            OutputStream outputStream = this.f176096a;
            this.f176096a = smr0Var;
            try {
                objectEncoder.encode(obj, this);
                this.f176096a = outputStream;
                long jM186842k = smr0Var.m186842k();
                smr0Var.close();
                return jM186842k;
            } catch (Throwable th) {
                this.f176096a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                smr0Var.close();
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
    public static wqr0 m192680j(FieldDescriptor fieldDescriptor) {
        wqr0 wqr0Var = (wqr0) fieldDescriptor.getProperty(wqr0.class);
        if (wqr0Var != null) {
            return wqr0Var;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: m */
    private static ByteBuffer m192681m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: n */
    private final void m192682n(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f176096a;
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
    private final void m192683o(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f176096a;
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
    public final ObjectEncoderContext m192684a(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this;
        }
        m192682n((m192678h(fieldDescriptor) << 3) | 1);
        this.f176096a.write(m192681m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        m192684a(FieldDescriptor.m16839of(str), d, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final ObjectEncoderContext m192685b(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m192682n((m192678h(fieldDescriptor) << 3) | 5);
        this.f176096a.write(m192681m(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final ObjectEncoderContext m192686c(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    m192682n((m192678h(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f176092f);
                    m192682n(bytes.length);
                    this.f176096a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m192686c(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m192690k(f176095i, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    m192684a(fieldDescriptor, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    m192685b(fieldDescriptor, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    m192688e(fieldDescriptor, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    m192687d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.f176097b.get(obj.getClass());
                    if (objectEncoder != null) {
                        m192690k(objectEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.f176098c.get(obj.getClass());
                    if (valueEncoder != null) {
                        m192691l(valueEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    if (obj instanceof vnr0) {
                        m192687d(fieldDescriptor, ((vnr0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        m192687d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m192690k(this.f176099d, fieldDescriptor, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    m192682n((m192678h(fieldDescriptor) << 3) | 2);
                    m192682n(bArr.length);
                    this.f176096a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final ttr0 m192687d(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            wqr0 wqr0VarM192680j = m192680j(fieldDescriptor);
            zzal zzalVar = zzal.DEFAULT;
            int iOrdinal = wqr0VarM192680j.zzb().ordinal();
            if (iOrdinal == 0) {
                m192682n(wqr0VarM192680j.zza() << 3);
                m192682n(i);
                return this;
            }
            if (iOrdinal == 1) {
                m192682n(wqr0VarM192680j.zza() << 3);
                m192682n((i + i) ^ (i >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                m192682n((wqr0VarM192680j.zza() << 3) | 5);
                this.f176096a.write(m192681m(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final ttr0 m192688e(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            wqr0 wqr0VarM192680j = m192680j(fieldDescriptor);
            zzal zzalVar = zzal.DEFAULT;
            int iOrdinal = wqr0VarM192680j.zzb().ordinal();
            if (iOrdinal == 0) {
                m192682n(wqr0VarM192680j.zza() << 3);
                m192683o(j);
                return this;
            }
            if (iOrdinal == 1) {
                m192682n(wqr0VarM192680j.zza() << 3);
                m192683o((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                m192682n((wqr0VarM192680j.zza() << 3) | 1);
                this.f176096a.write(m192681m(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final ttr0 m192689f(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f176097b.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        m192689f(obj);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final ttr0 m192690k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        long jM192679i = m192679i(objectEncoder, obj);
        if (z && jM192679i == 0) {
            return this;
        }
        m192682n((m192678h(fieldDescriptor) << 3) | 2);
        m192683o(jM192679i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ttr0 m192691l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        this.f176100e.m213637a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f176100e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m16839of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        m192685b(fieldDescriptor, f, true);
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
        m192687d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        m192688e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        m192686c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        m192687d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        m192684a(fieldDescriptor, d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        m192687d(FieldDescriptor.m16839of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        m192688e(FieldDescriptor.m16839of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        m192686c(FieldDescriptor.m16839of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        m192687d(FieldDescriptor.m16839of(str), z ? 1 : 0, true);
        return this;
    }
}
