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
public final class SpriteEntity extends Message<SpriteEntity, Builder> {
    public static final ProtoAdapter<SpriteEntity> ADAPTER = new ProtoAdapter_SpriteEntity();
    public static final String DEFAULT_IMAGEKEY = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.opensource.svgaplayer.proto.FrameEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<FrameEntity> frames;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String imageKey;

    public static final class Builder extends Message.Builder<SpriteEntity, Builder> {
        public List<FrameEntity> frames = Internal.newMutableList();
        public String imageKey;

        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public SpriteEntity m12163build() {
            return new SpriteEntity(this.imageKey, this.frames, super.buildUnknownFields());
        }

        public Builder frames(List<FrameEntity> list) {
            Internal.checkElementsNotNull(list);
            this.frames = list;
            return this;
        }

        public Builder imageKey(String str) {
            this.imageKey = str;
            return this;
        }
    }

    public static final class ProtoAdapter_SpriteEntity extends ProtoAdapter<SpriteEntity> {
        public ProtoAdapter_SpriteEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, SpriteEntity.class);
        }

        /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
        public SpriteEntity m12164decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.m12163build();
                }
                if (iNextTag == 1) {
                    builder.imageKey((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 2) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.frames.add((FrameEntity) FrameEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, SpriteEntity spriteEntity) throws IOException {
            String str = spriteEntity.imageKey;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            FrameEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, spriteEntity.frames);
            protoWriter.writeBytes(spriteEntity.unknownFields());
        }

        public int encodedSize(SpriteEntity spriteEntity) {
            String str = spriteEntity.imageKey;
            return (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0) + FrameEntity.ADAPTER.asRepeated().encodedSizeWithTag(2, spriteEntity.frames) + spriteEntity.unknownFields().size();
        }

        public SpriteEntity redact(SpriteEntity spriteEntity) {
            Builder builderM12162newBuilder = spriteEntity.m12162newBuilder();
            Internal.redactElements(builderM12162newBuilder.frames, FrameEntity.ADAPTER);
            builderM12162newBuilder.clearUnknownFields();
            return builderM12162newBuilder.m12163build();
        }
    }

    public SpriteEntity(String str, List<FrameEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.imageKey = str;
        this.frames = Internal.immutableCopyOf("frames", list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpriteEntity)) {
            return false;
        }
        SpriteEntity spriteEntity = (SpriteEntity) obj;
        return unknownFields().equals(spriteEntity.unknownFields()) && Internal.equals(this.imageKey, spriteEntity.imageKey) && this.frames.equals(spriteEntity.frames);
    }

    public int hashCode() {
        int i = ((Message) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.imageKey;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.frames.hashCode();
        ((Message) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m12162newBuilder() {
        Builder builder = new Builder();
        builder.imageKey = this.imageKey;
        builder.frames = Internal.copyOf("frames", this.frames);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.imageKey != null) {
            sb.append(", imageKey=");
            sb.append(this.imageKey);
        }
        if (!this.frames.isEmpty()) {
            sb.append(", frames=");
            sb.append(this.frames);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SpriteEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public SpriteEntity(String str, List<FrameEntity> list) {
        this(str, list, ByteString.EMPTY);
    }
}
