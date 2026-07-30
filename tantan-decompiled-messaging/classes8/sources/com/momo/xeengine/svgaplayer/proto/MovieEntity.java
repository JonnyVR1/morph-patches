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
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class MovieEntity extends Message<MovieEntity, Builder> {
    public static final ProtoAdapter<MovieEntity> ADAPTER = new ProtoAdapter_MovieEntity();
    public static final String DEFAULT_VERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.opensource.svgaplayer.proto.AudioEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<AudioEntity> audios;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, ByteString> images;

    @WireField(adapter = "com.opensource.svgaplayer.proto.MovieParams#ADAPTER", tag = 2)
    public final MovieParams params;

    @WireField(adapter = "com.opensource.svgaplayer.proto.SpriteEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<SpriteEntity> sprites;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String version;

    public static final class Builder extends Message.Builder<MovieEntity, Builder> {
        public MovieParams params;
        public String version;
        public Map<String, ByteString> images = Internal.newMutableMap();
        public List<SpriteEntity> sprites = Internal.newMutableList();
        public List<AudioEntity> audios = Internal.newMutableList();

        public Builder audios(List<AudioEntity> list) {
            Internal.checkElementsNotNull(list);
            this.audios = list;
            return this;
        }

        /* JADX INFO: renamed from: build, reason: merged with bridge method [inline-methods] */
        public MovieEntity m12139build() {
            return new MovieEntity(this.version, this.params, this.images, this.sprites, this.audios, super.buildUnknownFields());
        }

        public Builder images(Map<String, ByteString> map) {
            Internal.checkElementsNotNull(map);
            this.images = map;
            return this;
        }

        public Builder params(MovieParams movieParams) {
            this.params = movieParams;
            return this;
        }

        public Builder sprites(List<SpriteEntity> list) {
            Internal.checkElementsNotNull(list);
            this.sprites = list;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }
    }

    public static final class ProtoAdapter_MovieEntity extends ProtoAdapter<MovieEntity> {
        private final ProtoAdapter<Map<String, ByteString>> images;

        public ProtoAdapter_MovieEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, MovieEntity.class);
            this.images = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BYTES);
        }

        /* JADX INFO: renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MovieEntity m12140decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.m12139build();
                }
                if (iNextTag == 1) {
                    builder.version((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.params((MovieParams) MovieParams.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.images.putAll((Map) this.images.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.sprites.add((SpriteEntity) SpriteEntity.ADAPTER.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.audios.add((AudioEntity) AudioEntity.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MovieEntity movieEntity) throws IOException {
            String str = movieEntity.version;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            MovieParams movieParams = movieEntity.params;
            if (movieParams != null) {
                MovieParams.ADAPTER.encodeWithTag(protoWriter, 2, movieParams);
            }
            this.images.encodeWithTag(protoWriter, 3, movieEntity.images);
            SpriteEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, movieEntity.sprites);
            AudioEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, movieEntity.audios);
            protoWriter.writeBytes(movieEntity.unknownFields());
        }

        public int encodedSize(MovieEntity movieEntity) {
            String str = movieEntity.version;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            MovieParams movieParams = movieEntity.params;
            return iEncodedSizeWithTag + (movieParams != null ? MovieParams.ADAPTER.encodedSizeWithTag(2, movieParams) : 0) + this.images.encodedSizeWithTag(3, movieEntity.images) + SpriteEntity.ADAPTER.asRepeated().encodedSizeWithTag(4, movieEntity.sprites) + AudioEntity.ADAPTER.asRepeated().encodedSizeWithTag(5, movieEntity.audios) + movieEntity.unknownFields().size();
        }

        public MovieEntity redact(MovieEntity movieEntity) {
            Builder builderM12138newBuilder = movieEntity.m12138newBuilder();
            MovieParams movieParams = builderM12138newBuilder.params;
            if (movieParams != null) {
                builderM12138newBuilder.params = (MovieParams) MovieParams.ADAPTER.redact(movieParams);
            }
            Internal.redactElements(builderM12138newBuilder.sprites, SpriteEntity.ADAPTER);
            Internal.redactElements(builderM12138newBuilder.audios, AudioEntity.ADAPTER);
            builderM12138newBuilder.clearUnknownFields();
            return builderM12138newBuilder.m12139build();
        }
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.params = movieParams;
        this.images = Internal.immutableCopyOf("images", map);
        this.sprites = Internal.immutableCopyOf("sprites", list);
        this.audios = Internal.immutableCopyOf("audios", list2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieEntity)) {
            return false;
        }
        MovieEntity movieEntity = (MovieEntity) obj;
        return unknownFields().equals(movieEntity.unknownFields()) && Internal.equals(this.version, movieEntity.version) && Internal.equals(this.params, movieEntity.params) && this.images.equals(movieEntity.images) && this.sprites.equals(movieEntity.sprites) && this.audios.equals(movieEntity.audios);
    }

    public int hashCode() {
        int i = ((Message) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        MovieParams movieParams = this.params;
        int iHashCode3 = ((((((iHashCode2 + (movieParams != null ? movieParams.hashCode() : 0)) * 37) + this.images.hashCode()) * 37) + this.sprites.hashCode()) * 37) + this.audios.hashCode();
        ((Message) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    /* JADX INFO: renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m12138newBuilder() {
        Builder builder = new Builder();
        builder.version = this.version;
        builder.params = this.params;
        builder.images = Internal.copyOf("images", this.images);
        builder.sprites = Internal.copyOf("sprites", this.sprites);
        builder.audios = Internal.copyOf("audios", this.audios);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.params != null) {
            sb.append(", params=");
            sb.append(this.params);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (!this.sprites.isEmpty()) {
            sb.append(", sprites=");
            sb.append(this.sprites);
        }
        if (!this.audios.isEmpty()) {
            sb.append(", audios=");
            sb.append(this.audios);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "MovieEntity{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2) {
        this(str, movieParams, map, list, list2, ByteString.EMPTY);
    }
}
