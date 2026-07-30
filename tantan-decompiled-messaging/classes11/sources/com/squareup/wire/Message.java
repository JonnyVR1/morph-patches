package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import l.jfd0;
import l.shg0;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize = 0;
    protected transient int hashCode = 0;
    private final transient ByteString unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient Buffer unknownFieldsBuffer;
        transient ByteString unknownFieldsByteString = ByteString.EMPTY;
        transient ProtoWriter unknownFieldsWriter;

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                Buffer buffer = new Buffer();
                this.unknownFieldsBuffer = buffer;
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = ByteString.EMPTY;
                } catch (IOException unused) {
                    shg0.a();
                }
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                shg0.a();
                return null;
            }
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.size() <= 0) {
                return this;
            }
            prepareForNewUnknownFields();
            try {
                this.unknownFieldsWriter.writeBytes(byteString);
                return this;
            } catch (IOException unused) {
                shg0.a();
                return null;
            }
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                this.unknownFieldsByteString = buffer.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = ByteString.EMPTY;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                buffer.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter == null) {
            jfd0.a("adapter == null");
            throw null;
        }
        if (byteString == null) {
            jfd0.a("unknownFields == null");
            throw null;
        }
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public abstract Builder<M, B> newBuilder();

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString != null ? byteString : ByteString.EMPTY;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.adapter.encode(bufferedSink, this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, this);
    }
}
