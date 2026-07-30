package com.momo.xeengine.svgaplayer.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class FrameEntity extends Message<FrameEntity, Builder> {
    public static final ProtoAdapter<FrameEntity> ADAPTER = new ProtoAdapter_FrameEntity();
    public static final Float DEFAULT_ALPHA = Float.valueOf(0.0f);
    public static final String DEFAULT_CLIPPATH = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float alpha;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String clipPath;

    @WireField(adapter = "com.opensource.svgaplayer.proto.Layout#ADAPTER", tag = 2)
    public final Layout layout;

    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<ShapeEntity> shapes;

    @WireField(adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER", tag = 3)
    public final Transform transform;

    public static final class Builder extends Message.Builder<FrameEntity, Builder> {
        public Float alpha;
        public String clipPath;
        public Layout layout;
        public List<ShapeEntity> shapes = Internal.newMutableList();
        public Transform transform;

        public Builder alpha(Float f) {
            this.alpha = f;
            return this;
        }

        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public FrameEntity m12133build() {
            return new FrameEntity(this.alpha, this.layout, this.transform, this.clipPath, this.shapes, super.buildUnknownFields());
        }

        public Builder clipPath(String str) {
            this.clipPath = str;
            return this;
        }

        public Builder layout(Layout layout) {
            this.layout = layout;
            return this;
        }

        public Builder shapes(List<ShapeEntity> list) {
            Internal.checkElementsNotNull(list);
            this.shapes = list;
            return this;
        }

        public Builder transform(Transform transform) {
            this.transform = transform;
            return this;
        }
    }

    public static final class ProtoAdapter_FrameEntity extends ProtoAdapter<FrameEntity> {
        public ProtoAdapter_FrameEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, FrameEntity.class);
        }

        /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
        public FrameEntity m12134decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.m12133build();
                }
                if (iNextTag == 1) {
                    builder.alpha((Float) ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.layout((Layout) Layout.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.transform((Transform) Transform.ADAPTER.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.clipPath((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.shapes.add((ShapeEntity) ShapeEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, FrameEntity frameEntity) throws IOException {
            Float f = frameEntity.alpha;
            if (f != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, f);
            }
            Layout layout = frameEntity.layout;
            if (layout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 2, layout);
            }
            Transform transform = frameEntity.transform;
            if (transform != null) {
                Transform.ADAPTER.encodeWithTag(protoWriter, 3, transform);
            }
            String str = frameEntity.clipPath;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            ShapeEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, frameEntity.shapes);
            protoWriter.writeBytes(frameEntity.unknownFields());
        }

        public int encodedSize(FrameEntity frameEntity) {
            Float f = frameEntity.alpha;
            int iEncodedSizeWithTag = f != null ? ProtoAdapter.FLOAT.encodedSizeWithTag(1, f) : 0;
            Layout layout = frameEntity.layout;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (layout != null ? Layout.ADAPTER.encodedSizeWithTag(2, layout) : 0);
            Transform transform = frameEntity.transform;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (transform != null ? Transform.ADAPTER.encodedSizeWithTag(3, transform) : 0);
            String str = frameEntity.clipPath;
            return iEncodedSizeWithTag3 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0) + ShapeEntity.ADAPTER.asRepeated().encodedSizeWithTag(5, frameEntity.shapes) + frameEntity.unknownFields().size();
        }

        public FrameEntity redact(FrameEntity frameEntity) {
            Builder builderM12132newBuilder = frameEntity.m12132newBuilder();
            Layout layout = builderM12132newBuilder.layout;
            if (layout != null) {
                builderM12132newBuilder.layout = (Layout) Layout.ADAPTER.redact(layout);
            }
            Transform transform = builderM12132newBuilder.transform;
            if (transform != null) {
                builderM12132newBuilder.transform = (Transform) Transform.ADAPTER.redact(transform);
            }
            Internal.redactElements(builderM12132newBuilder.shapes, ShapeEntity.ADAPTER);
            builderM12132newBuilder.clearUnknownFields();
            return builderM12132newBuilder.m12133build();
        }
    }

    public FrameEntity(Float f, Layout layout, Transform transform, String str, List<ShapeEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.alpha = f;
        this.layout = layout;
        this.transform = transform;
        this.clipPath = str;
        this.shapes = Internal.immutableCopyOf("shapes", list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FrameEntity)) {
            return false;
        }
        FrameEntity frameEntity = (FrameEntity) obj;
        return unknownFields().equals(frameEntity.unknownFields()) && Internal.equals(this.alpha, frameEntity.alpha) && Internal.equals(this.layout, frameEntity.layout) && Internal.equals(this.transform, frameEntity.transform) && Internal.equals(this.clipPath, frameEntity.clipPath) && this.shapes.equals(frameEntity.shapes);
    }

    public int hashCode() {
        int i = ((Message) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f = this.alpha;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        Layout layout = this.layout;
        int iHashCode3 = (iHashCode2 + (layout != null ? layout.hashCode() : 0)) * 37;
        Transform transform = this.transform;
        int iHashCode4 = (iHashCode3 + (transform != null ? transform.hashCode() : 0)) * 37;
        String str = this.clipPath;
        int iHashCode5 = ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.shapes.hashCode();
        ((Message) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m12132newBuilder() {
        Builder builder = new Builder();
        builder.alpha = this.alpha;
        builder.layout = this.layout;
        builder.transform = this.transform;
        builder.clipPath = this.clipPath;
        builder.shapes = Internal.copyOf("shapes", this.shapes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.alpha != null) {
            sb.append(", alpha=");
            sb.append(this.alpha);
        }
        if (this.layout != null) {
            sb.append(", layout=");
            sb.append(this.layout);
        }
        if (this.transform != null) {
            sb.append(", transform=");
            sb.append(this.transform);
        }
        if (this.clipPath != null) {
            sb.append(", clipPath=");
            sb.append(this.clipPath);
        }
        if (!this.shapes.isEmpty()) {
            sb.append(", shapes=");
            sb.append(this.shapes);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "FrameEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public FrameEntity(Float f, Layout layout, Transform transform, String str, List<ShapeEntity> list) {
        this(f, layout, transform, str, list, ByteString.EMPTY);
    }
}
