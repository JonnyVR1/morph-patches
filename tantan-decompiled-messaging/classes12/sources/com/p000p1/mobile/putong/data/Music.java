package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Music extends ValueObject implements Cloneable, Serializable {
    public static final String SOURCE_BRAND = "brand";
    public static final String SOURCE_DEFAULT = "default";
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARE = 1;
    public static final String TYPE = "music";

    @NonNull
    @ProtobufIndex(index = 58)
    public AudioMedia audio;

    @NonNull
    @ProtobufIndex(index = 56)
    public String cover;

    @NonNull
    @ProtobufIndex(index = 53)
    public String describe;

    @ProtobufIndex(index = 59)
    public boolean favor;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f242id;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 54)
    public String owner;
    public int playState = 1;

    @NonNull
    @ProtobufIndex(index = 60)
    public String source;

    @NonNull
    @ProtobufIndex(index = 57)
    public String status;

    @NonNull
    @ProtobufIndex(index = 55)
    public String type;
    public static ProtobufAdapter<Music> PROTOBUF_ADAPTER = new MessageNanoAdapter<Music>() { // from class: com.p1.mobile.putong.data.Music.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Music music) {
            String str = music.f242id;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = music.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            String str3 = music.describe;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(53, str3);
            }
            String str4 = music.owner;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(54, str4);
            }
            String str5 = music.type;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(55, str5);
            }
            String str6 = music.cover;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(56, str6);
            }
            String str7 = music.status;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(57, str7);
            }
            AudioMedia audioMedia = music.audio;
            if (audioMedia != null) {
                iO += CodedOutputByteBufferNano.l(58, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(59, music.favor);
            String str8 = music.source;
            if (str8 != null) {
                iB += CodedOutputByteBufferNano.o(60, str8);
            }
            ((MessageNano) music).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Music m18501parse(nb5 nb5Var) throws IOException {
            Music music = new Music();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (music.f242id == null) {
                            music.f242id = "";
                        }
                        if (music.name == null) {
                            music.name = "";
                        }
                        if (music.describe == null) {
                            music.describe = "";
                        }
                        if (music.owner == null) {
                            music.owner = "";
                        }
                        if (music.type == null) {
                            music.type = "";
                        }
                        if (music.cover == null) {
                            music.cover = "";
                        }
                        if (music.status == null) {
                            music.status = "";
                        }
                        if (music.audio == null) {
                            music.audio = AudioMedia.new_();
                        }
                        if (music.source == null) {
                            music.source = "";
                        }
                        break;
                    case 410:
                        music.f242id = nb5Var.s();
                        continue;
                    case 418:
                        music.name = nb5Var.s();
                        continue;
                    case 426:
                        music.describe = nb5Var.s();
                        continue;
                    case 434:
                        music.owner = nb5Var.s();
                        continue;
                    case 442:
                        music.type = nb5Var.s();
                        continue;
                    case 450:
                        music.cover = nb5Var.s();
                        continue;
                    case 458:
                        music.status = nb5Var.s();
                        continue;
                    case 466:
                        music.audio = (AudioMedia) nb5Var.l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 472:
                        music.favor = nb5Var.g();
                        continue;
                    case 482:
                        music.source = nb5Var.s();
                        continue;
                    default:
                        if (music.f242id == null) {
                            music.f242id = "";
                        }
                        if (music.name == null) {
                            music.name = "";
                        }
                        if (music.describe == null) {
                            music.describe = "";
                        }
                        if (music.owner == null) {
                            music.owner = "";
                        }
                        if (music.type == null) {
                            music.type = "";
                        }
                        if (music.cover == null) {
                            music.cover = "";
                        }
                        if (music.status == null) {
                            music.status = "";
                        }
                        if (music.audio == null) {
                            music.audio = AudioMedia.new_();
                        }
                        if (music.source == null) {
                            music.source = "";
                            return music;
                        }
                        break;
                }
            }
            return music;
        }

        public void serialize(Music music, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = music.f242id;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = music.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
            String str3 = music.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.R(53, str3);
            }
            String str4 = music.owner;
            if (str4 != null) {
                codedOutputByteBufferNano.R(54, str4);
            }
            String str5 = music.type;
            if (str5 != null) {
                codedOutputByteBufferNano.R(55, str5);
            }
            String str6 = music.cover;
            if (str6 != null) {
                codedOutputByteBufferNano.R(56, str6);
            }
            String str7 = music.status;
            if (str7 != null) {
                codedOutputByteBufferNano.R(57, str7);
            }
            AudioMedia audioMedia = music.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.K(58, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(59, music.favor);
            String str8 = music.source;
            if (str8 != null) {
                codedOutputByteBufferNano.R(60, str8);
            }
        }
    };
    public static JsonAdapter<Music> JSON_ADAPTER = new ObjectJsonAdapter<Music>() { // from class: com.p1.mobile.putong.data.Music.2
        public Class getDataClass() {
            return Music.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Music mo17830newInstance() {
            return new Music();
        }

        public boolean parseField(Music music, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    music.source = jsonParser.getValueAsString();
                    return true;
                case "status":
                    music.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    music.f242id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    music.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    music.type = jsonParser.getValueAsString();
                    return true;
                case "audio":
                    music.audio = (AudioMedia) AudioMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cover":
                    music.cover = jsonParser.getValueAsString();
                    return true;
                case "favor":
                    music.favor = jsonParser.getValueAsBoolean();
                    return true;
                case "owner":
                    music.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "describe":
                    music.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Music music, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "status":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                case "audio":
                case "cover":
                case "favor":
                case "owner":
                case "describe":
                    return true;
                default:
                    return super.parseFieldCheck(music, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Music music, JsonGenerator jsonGenerator) throws IOException {
            String str = music.f242id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = music.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = music.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
            if (music.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(music.owner, jsonGenerator, true);
            }
            String str4 = music.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = music.cover;
            if (str5 != null) {
                jsonGenerator.writeStringField("cover", str5);
            }
            String str6 = music.status;
            if (str6 != null) {
                jsonGenerator.writeStringField("status", str6);
            }
            if (music.audio != null) {
                jsonGenerator.writeFieldName("audio");
                AudioMedia.JSON_ADAPTER.serialize(music.audio, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("favor", music.favor);
            String str7 = music.source;
            if (str7 != null) {
                jsonGenerator.writeStringField("source", str7);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Music) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Music) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Music new_() {
        Music music = new Music();
        music.nullCheck();
        return music;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Music m18500clone() {
        Music music = new Music();
        music.f242id = this.f242id;
        music.name = this.name;
        music.describe = this.describe;
        music.owner = this.owner;
        music.type = this.type;
        music.cover = this.cover;
        music.status = this.status;
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            music.audio = audioMedia.m17717clone();
        }
        music.favor = this.favor;
        music.source = this.source;
        return music;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Music)) {
            return false;
        }
        Music music = (Music) obj;
        return ValueObject.util_equals(this.f242id, music.f242id) && ValueObject.util_equals(this.name, music.name) && ValueObject.util_equals(this.describe, music.describe) && ValueObject.util_equals(this.owner, music.owner) && ValueObject.util_equals(this.type, music.type) && ValueObject.util_equals(this.cover, music.cover) && ValueObject.util_equals(this.status, music.status) && ValueObject.util_equals(this.audio, music.audio) && this.favor == music.favor && ValueObject.util_equals(this.source, music.source);
    }

    public String getClassParseName() {
        return "music";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f242id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.describe;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.owner;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cover;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.status;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        AudioMedia audioMedia = this.audio;
        int iHashCode8 = (((iHashCode7 + (audioMedia != null ? audioMedia.hashCode() : 0)) * 41) + (this.favor ? 1231 : 1237)) * 41;
        String str8 = this.source;
        int iHashCode9 = iHashCode8 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f242id == null) {
            this.f242id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.describe == null) {
            this.describe = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.audio == null) {
            this.audio = AudioMedia.new_();
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    public Music subtract(Music music) {
        Music music2 = new Music();
        if (!ValueObject.util_equals(this.f242id, music.f242id)) {
            music2.f242id = this.f242id;
        }
        if (!ValueObject.util_equals(this.name, music.name)) {
            music2.name = this.name;
        }
        if (!ValueObject.util_equals(this.describe, music.describe)) {
            music2.describe = this.describe;
        }
        if (!ValueObject.util_equals(this.owner, music.owner)) {
            music2.owner = this.owner;
        }
        if (!ValueObject.util_equals(this.type, music.type)) {
            music2.type = this.type;
        }
        if (!ValueObject.util_equals(this.cover, music.cover)) {
            music2.cover = this.cover;
        }
        if (!ValueObject.util_equals(this.status, music.status)) {
            music2.status = this.status;
        }
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            music2.audio = audioMedia.subtract(music.audio);
        }
        if (!ValueObject.util_equals(this.source, music.source)) {
            music2.source = this.source;
        }
        if (music2.equals(new Music())) {
            return null;
        }
        return music2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
