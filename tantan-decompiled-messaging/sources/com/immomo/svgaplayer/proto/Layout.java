package com.immomo.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Layout extends Message<Layout, Builder> {
    public static final ProtoAdapter<Layout> ADAPTER = new ProtoAdapter_Layout();
    public static final Float DEFAULT_HEIGHT;
    public static final Float DEFAULT_WIDTH;
    public static final Float DEFAULT_X;
    public static final Float DEFAULT_Y;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float width;

    /* JADX INFO: renamed from: x */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float f14062x;

    /* JADX INFO: renamed from: y */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float f14063y;

    public static final class Builder extends Message.Builder<Layout, Builder> {
        public Float height;
        public Float width;

        /* JADX INFO: renamed from: x */
        public Float f14064x;

        /* JADX INFO: renamed from: y */
        public Float f14065y;

        @Override // com.squareup.wire.Message.Builder
        public Layout build() {
            return new Layout(this.f14064x, this.f14065y, this.width, this.height, super.buildUnknownFields());
        }

        public Builder height(Float f) {
            this.height = f;
            return this;
        }

        public Builder width(Float f) {
            this.width = f;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public Builder m19464x(Float f) {
            this.f14064x = f;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public Builder m19465y(Float f) {
            this.f14065y = f;
            return this;
        }
    }

    public static final class ProtoAdapter_Layout extends ProtoAdapter<Layout> {
        public ProtoAdapter_Layout() {
            super(FieldEncoding.LENGTH_DELIMITED, Layout.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Layout decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.m19464x(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.m19465y(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.width(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.height(ProtoAdapter.FLOAT.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Layout layout) throws IOException {
            Float f = layout.f14062x;
            if (f != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
            }
            Float f2 = layout.f14063y;
            if (f2 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, f2);
            }
            Float f3 = layout.width;
            if (f3 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, f3);
            }
            Float f4 = layout.height;
            if (f4 != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, f4);
            }
            protoWriter.writeBytes(layout.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Layout layout) {
            Float f = layout.f14062x;
            int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
            Float f2 = layout.f14063y;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (f2 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(2, f2) : 0);
            Float f3 = layout.width;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (f3 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(3, f3) : 0);
            Float f4 = layout.height;
            return iEncodedSizeWithTag3 + (f4 != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(4, f4) : 0) + layout.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Layout redact(Layout layout) throws EOFException {
            Builder builderNewBuilder = layout.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_X = fValueOf;
        DEFAULT_Y = fValueOf;
        DEFAULT_WIDTH = fValueOf;
        DEFAULT_HEIGHT = fValueOf;
    }

    public Layout(Float f, Float f2, Float f3, Float f4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f14062x = f;
        this.f14063y = f2;
        this.width = f3;
        this.height = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Layout)) {
            return false;
        }
        Layout layout = (Layout) obj;
        return unknownFields().equals(layout.unknownFields()) && Internal.equals(this.f14062x, layout.f14062x) && Internal.equals(this.f14063y, layout.f14063y) && Internal.equals(this.width, layout.width) && Internal.equals(this.height, layout.height);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f = this.f14062x;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        Float f2 = this.f14063y;
        int iHashCode3 = (iHashCode2 + (f2 != null ? f2.hashCode() : 0)) * 37;
        Float f3 = this.width;
        int iHashCode4 = (iHashCode3 + (f3 != null ? f3.hashCode() : 0)) * 37;
        Float f4 = this.height;
        int iHashCode5 = iHashCode4 + (f4 != null ? f4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f14064x = this.f14062x;
        builder.f14065y = this.f14063y;
        builder.width = this.width;
        builder.height = this.height;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f14062x != null) {
            sb.append(", x=");
            sb.append(this.f14062x);
        }
        if (this.f14063y != null) {
            sb.append(", y=");
            sb.append(this.f14063y);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Layout{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Layout(Float f, Float f2, Float f3, Float f4) {
        this(f, f2, f3, f4, ByteString.EMPTY);
    }
}
