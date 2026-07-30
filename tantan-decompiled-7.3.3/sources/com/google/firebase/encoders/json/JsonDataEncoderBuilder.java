package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new ObjectEncoder() { // from class: l.mrq
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            JsonDataEncoderBuilder.m16841b(obj, objectEncoderContext);
        }
    };
    private static final ValueEncoder<String> STRING_ENCODER = new ValueEncoder() { // from class: l.nrq
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add((String) obj);
        }
    };
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER = new ValueEncoder() { // from class: l.orq
        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(((Boolean) obj).booleanValue());
        }
    };
    private static final TimestampEncoder TIMESTAMP_ENCODER = new TimestampEncoder();
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
    private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;
    private boolean ignoreNullValues = false;

    public static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) STRING_ENCODER);
        registerEncoder(Boolean.class, (ValueEncoder) BOOLEAN_ENCODER);
        registerEncoder(Date.class, (ValueEncoder) TIMESTAMP_ENCODER);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16841b(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public DataEncoder build() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.objectEncoders, JsonDataEncoderBuilder.this.valueEncoders, JsonDataEncoderBuilder.this.fallbackEncoder, JsonDataEncoderBuilder.this.ignoreNullValues);
                jsonValueObjectEncoderContext.add(obj, false);
                jsonValueObjectEncoderContext.close();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String encode(@NonNull Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.ignoreNullValues = z;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.objectEncoders.put(cls, objectEncoder);
        this.valueEncoders.remove(cls);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.fallbackEncoder = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.valueEncoders.put(cls, valueEncoder);
        this.objectEncoders.remove(cls);
        return this;
    }
}
