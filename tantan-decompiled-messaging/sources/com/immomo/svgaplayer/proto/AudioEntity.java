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
public final class AudioEntity extends Message<AudioEntity, Builder> {
    public static final String DEFAULT_AUDIOKEY = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String audioKey;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer endFrame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer startFrame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer startTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer totalTime;
    public static final ProtoAdapter<AudioEntity> ADAPTER = new ProtoAdapter_AudioEntity();
    public static final Integer DEFAULT_STARTFRAME = 0;
    public static final Integer DEFAULT_ENDFRAME = 0;
    public static final Integer DEFAULT_STARTTIME = 0;
    public static final Integer DEFAULT_TOTALTIME = 0;

    public static final class Builder extends Message.Builder<AudioEntity, Builder> {
        public String audioKey;
        public Integer endFrame;
        public Integer startFrame;
        public Integer startTime;
        public Integer totalTime;

        public Builder audioKey(String str) {
            this.audioKey = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AudioEntity build() {
            return new AudioEntity(this.audioKey, this.startFrame, this.endFrame, this.startTime, this.totalTime, super.buildUnknownFields());
        }

        public Builder endFrame(Integer num) {
            this.endFrame = num;
            return this;
        }

        public Builder startFrame(Integer num) {
            this.startFrame = num;
            return this;
        }

        public Builder startTime(Integer num) {
            this.startTime = num;
            return this;
        }

        public Builder totalTime(Integer num) {
            this.totalTime = num;
            return this;
        }
    }

    public static final class ProtoAdapter_AudioEntity extends ProtoAdapter<AudioEntity> {
        public ProtoAdapter_AudioEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, AudioEntity.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public AudioEntity decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.audioKey(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.startFrame(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.endFrame(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.startTime(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.totalTime(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, AudioEntity audioEntity) throws IOException {
            String str = audioEntity.audioKey;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            Integer num = audioEntity.startFrame;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, num);
            }
            Integer num2 = audioEntity.endFrame;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, num2);
            }
            Integer num3 = audioEntity.startTime;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, num3);
            }
            Integer num4 = audioEntity.totalTime;
            if (num4 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, num4);
            }
            protoWriter.writeBytes(audioEntity.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(AudioEntity audioEntity) {
            String str = audioEntity.audioKey;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            Integer num = audioEntity.startFrame;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, num) : 0);
            Integer num2 = audioEntity.endFrame;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, num2) : 0);
            Integer num3 = audioEntity.startTime;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, num3) : 0);
            Integer num4 = audioEntity.totalTime;
            return iEncodedSizeWithTag4 + (num4 != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, num4) : 0) + audioEntity.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public AudioEntity redact(AudioEntity audioEntity) throws EOFException {
            Builder builderNewBuilder = audioEntity.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audioKey = str;
        this.startFrame = num;
        this.endFrame = num2;
        this.startTime = num3;
        this.totalTime = num4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioEntity)) {
            return false;
        }
        AudioEntity audioEntity = (AudioEntity) obj;
        return unknownFields().equals(audioEntity.unknownFields()) && Internal.equals(this.audioKey, audioEntity.audioKey) && Internal.equals(this.startFrame, audioEntity.startFrame) && Internal.equals(this.endFrame, audioEntity.endFrame) && Internal.equals(this.startTime, audioEntity.startTime) && Internal.equals(this.totalTime, audioEntity.totalTime);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.audioKey;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.startFrame;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.endFrame;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.startTime;
        int iHashCode5 = (iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Integer num4 = this.totalTime;
        int iHashCode6 = iHashCode5 + (num4 != null ? num4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.audioKey = this.audioKey;
        builder.startFrame = this.startFrame;
        builder.endFrame = this.endFrame;
        builder.startTime = this.startTime;
        builder.totalTime = this.totalTime;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.audioKey != null) {
            sb.append(", audioKey=");
            sb.append(this.audioKey);
        }
        if (this.startFrame != null) {
            sb.append(", startFrame=");
            sb.append(this.startFrame);
        }
        if (this.endFrame != null) {
            sb.append(", endFrame=");
            sb.append(this.endFrame);
        }
        if (this.startTime != null) {
            sb.append(", startTime=");
            sb.append(this.startTime);
        }
        if (this.totalTime != null) {
            sb.append(", totalTime=");
            sb.append(this.totalTime);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "AudioEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this(str, num, num2, num3, num4, ByteString.EMPTY);
    }
}
