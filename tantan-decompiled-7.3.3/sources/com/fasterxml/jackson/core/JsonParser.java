package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class JsonParser implements Closeable, Versioned {
    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected int _features;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        STRICT_DUPLICATE_DETECTION(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (this._mask & i) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser(int i) {
        this._features = i;
    }

    public ObjectCodec _codec() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec;
        }
        wtq0.m207906a("No ObjectCodec defined for parser, needed for deserialization");
        return null;
    }

    public JsonParseException _constructError(String str) {
        return new JsonParseException(str, getCurrentLocation());
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by parser of type ".concat(getClass().getName()));
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public abstract void clearCurrentToken();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public JsonParser configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
            return this;
        }
        disable(feature);
        return this;
    }

    public JsonParser disable(Feature feature) {
        this._features = (~feature.getMask()) & this._features;
        return this;
    }

    public JsonParser enable(Feature feature) {
        this._features = feature.getMask() | this._features;
        return this;
    }

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public byte[] getBinaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    public boolean getBooleanValue() throws IOException {
        JsonToken currentToken = getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException("Current token (" + currentToken + ") not of boolean type", getCurrentLocation());
    }

    public byte getByteValue() throws IOException {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I && intValue <= 255) {
            return (byte) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName() throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract int getCurrentTokenId();

    public Object getCurrentValue() {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext == null) {
            return null;
        }
        return parsingContext.getCurrentValue();
    }

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public abstract Object getEmbeddedObject() throws IOException;

    public int getFeatureMask() {
        return this._features;
    }

    public abstract float getFloatValue() throws IOException;

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue() throws IOException;

    public abstract JsonToken getLastClearedToken();

    public abstract long getLongValue() throws IOException;

    public abstract NumberType getNumberType() throws IOException;

    public abstract Number getNumberValue() throws IOException;

    public Object getObjectId() throws IOException {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public FormatSchema getSchema() {
        return null;
    }

    public short getShortValue() throws IOException {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I && intValue <= MAX_SHORT_I) {
            return (short) intValue;
        }
        throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    }

    public abstract String getText() throws IOException;

    public abstract char[] getTextCharacters() throws IOException;

    public abstract int getTextLength() throws IOException;

    public abstract int getTextOffset() throws IOException;

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId() throws IOException {
        return null;
    }

    public boolean getValueAsBoolean() throws IOException {
        return getValueAsBoolean(false);
    }

    public double getValueAsDouble() throws IOException {
        return getValueAsDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public int getValueAsInt() throws IOException {
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException {
        return getValueAsLong(0L);
    }

    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String str) throws IOException;

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasTokenId(int i);

    public abstract boolean isClosed();

    public boolean isEnabled(Feature feature) {
        return feature.enabledIn(this._features);
    }

    public boolean isExpectedStartArrayToken() {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return getCurrentToken() == JsonToken.START_OBJECT;
    }

    public Boolean nextBooleanValue() throws IOException {
        JsonToken jsonTokenNextToken = nextToken();
        if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonTokenNextToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        return nextToken() == JsonToken.FIELD_NAME && serializableString.getValue().equals(getCurrentName());
    }

    public int nextIntValue(int i) throws IOException {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
    }

    public long nextLongValue(long j) throws IOException {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
    }

    public String nextTextValue() throws IOException {
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract JsonToken nextToken() throws IOException;

    public abstract JsonToken nextValue() throws IOException;

    public abstract void overrideCurrentName(String str);

    public int readBinaryValue(OutputStream outputStream) throws IOException {
        return readBinaryValue(Base64Variants.getDefaultVariant(), outputStream);
    }

    public <T> T readValueAs(Class<T> cls) throws IOException {
        return (T) _codec().readValue(this, cls);
    }

    public <T extends TreeNode> T readValueAsTree() throws IOException {
        return (T) _codec().readTree(this);
    }

    public <T> Iterator<T> readValuesAs(Class<T> cls) throws IOException {
        return _codec().readValues(this, cls);
    }

    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract void setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    public JsonParser setFeatureMask(int i) {
        this._features = i;
        return this;
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonParser skipChildren() throws IOException;

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public int releaseBuffered(Writer writer) throws IOException {
        return -1;
    }

    public JsonParser() {
    }

    public boolean getValueAsBoolean(boolean z) throws IOException {
        return z;
    }

    public int getValueAsInt(int i) throws IOException {
        return i;
    }

    public double getValueAsDouble(double d) throws IOException {
        return d;
    }

    public long getValueAsLong(long j) throws IOException {
        return j;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    public <T> T readValueAs(TypeReference<?> typeReference) throws IOException {
        return (T) _codec().readValue(this, typeReference);
    }

    public <T> Iterator<T> readValuesAs(TypeReference<?> typeReference) throws IOException {
        return _codec().readValues(this, typeReference);
    }

    public String nextFieldName() throws IOException {
        if (nextToken() == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return null;
    }
}
