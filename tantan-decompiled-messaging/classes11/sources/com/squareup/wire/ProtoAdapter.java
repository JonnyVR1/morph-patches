package com.squareup.wire;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.ig3;
import l.qkq0;
import l.y9g0;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import p009l.zya0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Long> UINT64;
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        public EnumConstantNotFoundException(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.value = i;
        }
    }

    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        final ProtoAdapter<K> keyAdapter;
        final ProtoAdapter<V> valueAdapter;

        public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.keyAdapter = protoAdapter;
            this.valueAdapter = protoAdapter2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) throws IOException {
            this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
            this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map.Entry<K, V> entry) {
            return this.keyAdapter.encodedSizeWithTag(1, entry.getKey()) + this.valueAdapter.encodedSizeWithTag(2, entry.getValue());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        BOOL = new ProtoAdapter<Boolean>(fieldEncoding, Boolean.class) { // from class: com.squareup.wire.ProtoAdapter.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Boolean decode(ProtoReader protoReader) throws IOException {
                int varint32 = protoReader.readVarint32();
                if (varint32 == 0) {
                    return Boolean.FALSE;
                }
                if (varint32 == 1) {
                    return Boolean.TRUE;
                }
                throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(varint32)));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
                protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Boolean bool) {
                return 1;
            }
        };
        Class<Integer> cls = Integer.class;
        INT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeSignedVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.int32Size(num.intValue());
            }
        };
        UINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readVarint32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(num.intValue());
            }
        };
        SINT32 = new ProtoAdapter<Integer>(fieldEncoding, cls) { // from class: com.squareup.wire.ProtoAdapter.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(ProtoWriter.decodeZigZag32(protoReader.readVarint32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeVarint32(ProtoWriter.encodeZigZag32(num.intValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return ProtoWriter.varint32Size(ProtoWriter.encodeZigZag32(num.intValue()));
            }
        };
        FieldEncoding fieldEncoding2 = FieldEncoding.FIXED32;
        ProtoAdapter<Integer> protoAdapter = new ProtoAdapter<Integer>(fieldEncoding2, cls) { // from class: com.squareup.wire.ProtoAdapter.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Integer decode(ProtoReader protoReader) throws IOException {
                return Integer.valueOf(protoReader.readFixed32());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
                protoWriter.writeFixed32(num.intValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Integer num) {
                return 4;
            }
        };
        FIXED32 = protoAdapter;
        SFIXED32 = protoAdapter;
        Class<Long> cls2 = Long.class;
        INT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                protoWriter.writeVarint64(l2.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l2) {
                return ProtoWriter.varint64Size(l2.longValue());
            }
        };
        UINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readVarint64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                protoWriter.writeVarint64(l2.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l2) {
                return ProtoWriter.varint64Size(l2.longValue());
            }
        };
        SINT64 = new ProtoAdapter<Long>(fieldEncoding, cls2) { // from class: com.squareup.wire.ProtoAdapter.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(ProtoWriter.decodeZigZag64(protoReader.readVarint64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                protoWriter.writeVarint64(ProtoWriter.encodeZigZag64(l2.longValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l2) {
                return ProtoWriter.varint64Size(ProtoWriter.encodeZigZag64(l2.longValue()));
            }
        };
        FieldEncoding fieldEncoding3 = FieldEncoding.FIXED64;
        ProtoAdapter<Long> protoAdapter2 = new ProtoAdapter<Long>(fieldEncoding3, cls2) { // from class: com.squareup.wire.ProtoAdapter.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Long decode(ProtoReader protoReader) throws IOException {
                return Long.valueOf(protoReader.readFixed64());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Long l2) throws IOException {
                protoWriter.writeFixed64(l2.longValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Long l2) {
                return 8;
            }
        };
        FIXED64 = protoAdapter2;
        SFIXED64 = protoAdapter2;
        FLOAT = new ProtoAdapter<Float>(fieldEncoding2, Float.class) { // from class: com.squareup.wire.ProtoAdapter.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Float decode(ProtoReader protoReader) throws IOException {
                return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Float f) throws IOException {
                protoWriter.writeFixed32(Float.floatToIntBits(f.floatValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Float f) {
                return 4;
            }
        };
        DOUBLE = new ProtoAdapter<Double>(fieldEncoding3, Double.class) { // from class: com.squareup.wire.ProtoAdapter.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Double decode(ProtoReader protoReader) throws IOException {
                return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Double d) throws IOException {
                protoWriter.writeFixed64(Double.doubleToLongBits(d.doubleValue()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Double d) {
                return 8;
            }
        };
        FieldEncoding fieldEncoding4 = FieldEncoding.LENGTH_DELIMITED;
        STRING = new ProtoAdapter<String>(fieldEncoding4, String.class) { // from class: com.squareup.wire.ProtoAdapter.12
            @Override // com.squareup.wire.ProtoAdapter
            public String decode(ProtoReader protoReader) throws IOException {
                return protoReader.readString();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, String str) throws IOException {
                protoWriter.writeString(str);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(String str) {
                return ProtoWriter.utf8Length(str);
            }
        };
        BYTES = new ProtoAdapter<ByteString>(fieldEncoding4, ByteString.class) { // from class: com.squareup.wire.ProtoAdapter.13
            @Override // com.squareup.wire.ProtoAdapter
            public ByteString decode(ProtoReader protoReader) throws IOException {
                return protoReader.readBytes();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ByteString byteString) throws IOException {
                protoWriter.writeBytes(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ByteString byteString) {
                return byteString.size();
            }
        };
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> cls) {
        this.fieldEncoding = fieldEncoding;
        this.javaType = cls;
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding = this.fieldEncoding;
        FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding != fieldEncoding2) {
            return new ProtoAdapter<List<E>>(fieldEncoding2, List.class) { // from class: com.squareup.wire.ProtoAdapter.14
                @Override // com.squareup.wire.ProtoAdapter
                public List<E> decode(ProtoReader protoReader) throws IOException {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter protoWriter, List<E> list) throws IOException {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, list.get(i));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                    if (list.isEmpty()) {
                        return;
                    }
                    super.encodeWithTag(protoWriter, i, list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(List<E> list) {
                    int size = list.size();
                    int iEncodedSize = 0;
                    for (int i = 0; i < size; i++) {
                        iEncodedSize += ProtoAdapter.this.encodedSize(list.get(i));
                    }
                    return iEncodedSize;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSizeWithTag(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return super.encodedSizeWithTag(i, list);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<E> redact(List<E> list) {
                    return Collections.EMPTY_LIST;
                }
            };
        }
        ig3.a("Unable to pack a length-delimited type.");
        return null;
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) { // from class: com.squareup.wire.ProtoAdapter.15
            @Override // com.squareup.wire.ProtoAdapter
            public List<E> decode(ProtoReader protoReader) throws IOException {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, list.get(i2));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSizeWithTag(int i, List<E> list) {
                int size = list.size();
                int iEncodedSizeWithTag = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iEncodedSizeWithTag += ProtoAdapter.this.encodedSizeWithTag(i, list.get(i2));
                }
                return iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<E> redact(List<E> list) {
                return Collections.EMPTY_LIST;
            }
        };
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e);
        }
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return RuntimeMessageAdapter.create(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreatePacked = createPacked();
        this.packedAdapter = protoAdapterCreatePacked;
        return protoAdapterCreatePacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> protoAdapterCreateRepeated = createRepeated();
        this.repeatedAdapter = protoAdapterCreateRepeated;
        return protoAdapterCreateRepeated;
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(byte[] bArr) throws IOException {
        Preconditions.checkNotNull(bArr, "bytes == null");
        return decode((BufferedSource) new Buffer().write(bArr));
    }

    public abstract void encode(ProtoWriter protoWriter, E e) throws IOException;

    public final void encode(OutputStream outputStream, E e) throws IOException {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(outputStream, "stream == null");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(outputStream));
        encode(bufferedSinkBuffer, e);
        bufferedSinkBuffer.emit();
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) throws IOException {
        if (e == null) {
            return;
        }
        protoWriter.writeTag(i, this.fieldEncoding);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            protoWriter.writeVarint32(encodedSize(e));
        }
        encode(protoWriter, e);
    }

    public abstract int encodedSize(E e);

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(e);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.varint32Size(iEncodedSize);
        }
        return iEncodedSize + ProtoWriter.tagSize(i);
    }

    public E redact(E e) {
        return null;
    }

    public String toString(E e) {
        return e.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoAdapter<?> withLabel(WireField.Label label) {
        if (label.isRepeated()) {
            return label.isPacked() ? asPacked() : asRepeated();
        }
        return this;
    }

    public static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        private final MapEntryProtoAdapter<K, V> entryAdapter;

        public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> decode(ProtoReader protoReader) throws IOException {
            long jBeginMessage = protoReader.beginMessage();
            K kDecode = null;
            V vDecode = null;
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    break;
                }
                if (iNextTag == 1) {
                    kDecode = this.entryAdapter.keyAdapter.decode(protoReader);
                } else if (iNextTag == 2) {
                    vDecode = this.entryAdapter.valueAdapter.decode(protoReader);
                }
            }
            protoReader.endMessage(jBeginMessage);
            if (kDecode == null) {
                qkq0.a("Map entry with null key");
                return null;
            }
            if (vDecode != null) {
                return Collections.singletonMap(kDecode, vDecode);
            }
            qkq0.a("Map entry with null value");
            return null;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) throws IOException {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.entryAdapter.encodeWithTag(protoWriter, i, it.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i, Map<K, V> map) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            int iEncodedSizeWithTag = 0;
            while (it.hasNext()) {
                iEncodedSizeWithTag += this.entryAdapter.encodedSizeWithTag(i, it.next());
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Map<K, V> redact(Map<K, V> map) {
            return Collections.EMPTY_MAP;
        }
    }

    public final E decode(ByteString byteString) throws IOException {
        Preconditions.checkNotNull(byteString, "bytes == null");
        return decode((BufferedSource) new Buffer().write(byteString));
    }

    public final E decode(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream, "stream == null");
        return decode(Okio.buffer(Okio.source(inputStream)));
    }

    public final E decode(BufferedSource bufferedSource) throws IOException {
        Preconditions.checkNotNull(bufferedSource, "source == null");
        return decode(new ProtoReader(bufferedSource));
    }

    public final void encode(BufferedSink bufferedSink, E e) throws IOException {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(bufferedSink, "sink == null");
        encode(new ProtoWriter(bufferedSink), e);
    }

    public final byte[] encode(E e) {
        Preconditions.checkNotNull(e, "value == null");
        Buffer buffer = new Buffer();
        try {
            encode((BufferedSink) buffer, (Object) e);
            return buffer.readByteArray();
        } catch (IOException e2) {
            y9g0.a(e2);
            return null;
        }
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int iIndexOf = str.indexOf(35);
            String strSubstring = str.substring(0, iIndexOf);
            return (ProtoAdapter) Class.forName(strSubstring).getField(str.substring(iIndexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            zya0.m26143a("failed to access ", str, e);
            return null;
        }
    }
}
