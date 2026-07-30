package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AIPosition;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.GaussianBlurParameters;
import com.p051p1.mobile.putong.data.GifMedia;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.PersonAlbumBgInfoMedia;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class PersonAlbumBgInfoMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "personalbumbginfomedia";

    @NonNull
    @ProtobufIndex(index = 11)
    public AIPosition aiPosition;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<PersonAlbumBgInfoMedia> attachments;

    @Nullable
    @ProtobufIndex(index = 8)
    public AudioMedia audio;

    @ProtobufIndex(index = 3)
    public float duration;

    @Nullable
    @ProtobufIndex(index = 12)
    public GaussianBlurParameters gaussianBlurParameters;

    @Nullable
    @ProtobufIndex(index = 9)
    public GifMedia gif;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40086id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mediaType;

    @Nullable
    @ProtobufIndex(index = 10)
    public Music music;

    @Nullable
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public Dimension size;

    @NonNull
    @ProtobufIndex(index = 13)
    public String status;

    @NonNull
    @ProtobufIndex(index = 7)
    public String url;
    public static ProtobufAdapter<PersonAlbumBgInfoMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<PersonAlbumBgInfoMedia>() { // from class: com.p1.mobile.putong.feed.data.PersonAlbumBgInfoMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PersonAlbumBgInfoMedia personAlbumBgInfoMedia) {
            String str = personAlbumBgInfoMedia.f40086id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = personAlbumBgInfoMedia.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17279f = iM17288o + CodedOutputByteBufferNano.m17279f(3, personAlbumBgInfoMedia.duration);
            String str3 = personAlbumBgInfoMedia.mediaType;
            if (str3 != null) {
                iM17279f += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            Dimension dimension = personAlbumBgInfoMedia.size;
            if (dimension != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(5, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            List<PersonAlbumBgInfoMedia> list = personAlbumBgInfoMedia.attachments;
            if (list != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(6, list, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = personAlbumBgInfoMedia.url;
            if (str4 != null) {
                iM17279f += CodedOutputByteBufferNano.m17288o(7, str4);
            }
            AudioMedia audioMedia = personAlbumBgInfoMedia.audio;
            if (audioMedia != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(8, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = personAlbumBgInfoMedia.gif;
            if (gifMedia != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(9, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = personAlbumBgInfoMedia.music;
            if (music != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(10, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = personAlbumBgInfoMedia.aiPosition;
            if (aIPosition != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(11, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = personAlbumBgInfoMedia.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(12, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            String str5 = personAlbumBgInfoMedia.status;
            if (str5 != null) {
                iM17279f += CodedOutputByteBufferNano.m17288o(13, str5);
            }
            personAlbumBgInfoMedia.cachedSize = iM17279f;
            return iM17279f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PersonAlbumBgInfoMedia parse(nc5 nc5Var) throws IOException {
            PersonAlbumBgInfoMedia personAlbumBgInfoMedia = new PersonAlbumBgInfoMedia();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (personAlbumBgInfoMedia.f40086id == null) {
                            personAlbumBgInfoMedia.f40086id = "";
                        }
                        if (personAlbumBgInfoMedia.mediaType == null) {
                            personAlbumBgInfoMedia.mediaType = "";
                        }
                        if (personAlbumBgInfoMedia.size == null) {
                            personAlbumBgInfoMedia.size = Dimension.new_();
                        }
                        if (personAlbumBgInfoMedia.url == null) {
                            personAlbumBgInfoMedia.url = "";
                        }
                        if (personAlbumBgInfoMedia.aiPosition == null) {
                            personAlbumBgInfoMedia.aiPosition = AIPosition.new_();
                        }
                        if (personAlbumBgInfoMedia.status == null) {
                            personAlbumBgInfoMedia.status = "";
                        }
                        break;
                    case 10:
                        personAlbumBgInfoMedia.f40086id = nc5Var.m162495s();
                        continue;
                    case 18:
                        personAlbumBgInfoMedia.name = nc5Var.m162495s();
                        continue;
                    case 29:
                        personAlbumBgInfoMedia.duration = nc5Var.m162485i();
                        continue;
                    case 34:
                        personAlbumBgInfoMedia.mediaType = nc5Var.m162495s();
                        continue;
                    case 42:
                        personAlbumBgInfoMedia.size = (Dimension) nc5Var.m162488l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        personAlbumBgInfoMedia.attachments = (List) nc5Var.m162488l(PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        personAlbumBgInfoMedia.url = nc5Var.m162495s();
                        continue;
                    case 66:
                        personAlbumBgInfoMedia.audio = (AudioMedia) nc5Var.m162488l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        personAlbumBgInfoMedia.gif = (GifMedia) nc5Var.m162488l(GifMedia.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        personAlbumBgInfoMedia.music = (Music) nc5Var.m162488l(Music.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        personAlbumBgInfoMedia.aiPosition = (AIPosition) nc5Var.m162488l(AIPosition.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        personAlbumBgInfoMedia.gaussianBlurParameters = (GaussianBlurParameters) nc5Var.m162488l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        personAlbumBgInfoMedia.status = nc5Var.m162495s();
                        continue;
                    default:
                        if (personAlbumBgInfoMedia.f40086id == null) {
                            personAlbumBgInfoMedia.f40086id = "";
                        }
                        if (personAlbumBgInfoMedia.mediaType == null) {
                            personAlbumBgInfoMedia.mediaType = "";
                        }
                        if (personAlbumBgInfoMedia.size == null) {
                            personAlbumBgInfoMedia.size = Dimension.new_();
                        }
                        if (personAlbumBgInfoMedia.url == null) {
                            personAlbumBgInfoMedia.url = "";
                        }
                        if (personAlbumBgInfoMedia.aiPosition == null) {
                            personAlbumBgInfoMedia.aiPosition = AIPosition.new_();
                        }
                        if (personAlbumBgInfoMedia.status == null) {
                            personAlbumBgInfoMedia.status = "";
                            return personAlbumBgInfoMedia;
                        }
                        break;
                }
            }
            return personAlbumBgInfoMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PersonAlbumBgInfoMedia personAlbumBgInfoMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = personAlbumBgInfoMedia.f40086id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = personAlbumBgInfoMedia.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17303E(3, personAlbumBgInfoMedia.duration);
            String str3 = personAlbumBgInfoMedia.mediaType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            Dimension dimension = personAlbumBgInfoMedia.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17309K(5, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            List<PersonAlbumBgInfoMedia> list = personAlbumBgInfoMedia.attachments;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = personAlbumBgInfoMedia.url;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(7, str4);
            }
            AudioMedia audioMedia = personAlbumBgInfoMedia.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.m17309K(8, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = personAlbumBgInfoMedia.gif;
            if (gifMedia != null) {
                codedOutputByteBufferNano.m17309K(9, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = personAlbumBgInfoMedia.music;
            if (music != null) {
                codedOutputByteBufferNano.m17309K(10, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = personAlbumBgInfoMedia.aiPosition;
            if (aIPosition != null) {
                codedOutputByteBufferNano.m17309K(11, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = personAlbumBgInfoMedia.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.m17309K(12, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            String str5 = personAlbumBgInfoMedia.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(13, str5);
            }
        }
    };
    public static JsonAdapter<PersonAlbumBgInfoMedia> JSON_ADAPTER = new ObjectJsonAdapter<PersonAlbumBgInfoMedia>() { // from class: com.p1.mobile.putong.feed.data.PersonAlbumBgInfoMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PersonAlbumBgInfoMedia.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PersonAlbumBgInfoMedia newInstance() {
            return new PersonAlbumBgInfoMedia();
        }

        public boolean parseField(PersonAlbumBgInfoMedia personAlbumBgInfoMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    personAlbumBgInfoMedia.duration = (float) jsonParser.getValueAsDouble();
                    return true;
                case "aiPosition":
                    personAlbumBgInfoMedia.aiPosition = Converter.AIPOSITION.parse(jsonParser, str2);
                    return true;
                case "status":
                    personAlbumBgInfoMedia.status = jsonParser.getValueAsString();
                    return true;
                case "attachments":
                    personAlbumBgInfoMedia.attachments = JsonAdapter.parseArray(jsonParser, PersonAlbumBgInfoMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gaussianBlurParameters":
                    personAlbumBgInfoMedia.gaussianBlurParameters = GaussianBlurParameters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    personAlbumBgInfoMedia.f40086id = jsonParser.getValueAsString();
                    return false;
                case "gif":
                    personAlbumBgInfoMedia.gif = GifMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    personAlbumBgInfoMedia.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    personAlbumBgInfoMedia.name = jsonParser.getValueAsString();
                    return true;
                case "size":
                    personAlbumBgInfoMedia.size = Converter.DIMENSION.parse(jsonParser, str2);
                    return true;
                case "audio":
                    personAlbumBgInfoMedia.audio = AudioMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "music":
                    personAlbumBgInfoMedia.music = Music.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    personAlbumBgInfoMedia.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PersonAlbumBgInfoMedia personAlbumBgInfoMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "aiPosition":
                case "status":
                case "attachments":
                case "gaussianBlurParameters":
                    return true;
                case "id":
                    return false;
                case "gif":
                case "url":
                case "name":
                case "size":
                case "audio":
                case "music":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(personAlbumBgInfoMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PersonAlbumBgInfoMedia personAlbumBgInfoMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = personAlbumBgInfoMedia.f40086id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = personAlbumBgInfoMedia.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, personAlbumBgInfoMedia.duration);
            String str3 = personAlbumBgInfoMedia.mediaType;
            if (str3 != null) {
                jsonGenerator.writeStringField("mediaType", str3);
            }
            if (personAlbumBgInfoMedia.size != null) {
                jsonGenerator.writeFieldName("size");
                Converter.DIMENSION.serialize(personAlbumBgInfoMedia.size, jsonGenerator, true);
            }
            if (personAlbumBgInfoMedia.attachments != null) {
                jsonGenerator.writeFieldName("attachments");
                JsonAdapter.serializeArray(personAlbumBgInfoMedia.attachments, jsonGenerator, PersonAlbumBgInfoMedia.JSON_ADAPTER);
            }
            String str4 = personAlbumBgInfoMedia.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
            if (personAlbumBgInfoMedia.audio != null) {
                jsonGenerator.writeFieldName("audio");
                AudioMedia.JSON_ADAPTER.serialize(personAlbumBgInfoMedia.audio, jsonGenerator, true);
            }
            if (personAlbumBgInfoMedia.gif != null) {
                jsonGenerator.writeFieldName("gif");
                GifMedia.JSON_ADAPTER.serialize(personAlbumBgInfoMedia.gif, jsonGenerator, true);
            }
            if (personAlbumBgInfoMedia.music != null) {
                jsonGenerator.writeFieldName("music");
                Music.JSON_ADAPTER.serialize(personAlbumBgInfoMedia.music, jsonGenerator, true);
            }
            if (personAlbumBgInfoMedia.aiPosition != null) {
                jsonGenerator.writeFieldName("aiPosition");
                Converter.AIPOSITION.serialize(personAlbumBgInfoMedia.aiPosition, jsonGenerator, true);
            }
            if (personAlbumBgInfoMedia.gaussianBlurParameters != null) {
                jsonGenerator.writeFieldName("gaussianBlurParameters");
                GaussianBlurParameters.JSON_ADAPTER.serialize(personAlbumBgInfoMedia.gaussianBlurParameters, jsonGenerator, true);
            }
            String str5 = personAlbumBgInfoMedia.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PersonAlbumBgInfoMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PersonAlbumBgInfoMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PersonAlbumBgInfoMedia new_() {
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = new PersonAlbumBgInfoMedia();
        personAlbumBgInfoMedia.nullCheck();
        return personAlbumBgInfoMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PersonAlbumBgInfoMedia mo225055clone() {
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = new PersonAlbumBgInfoMedia();
        personAlbumBgInfoMedia.f40086id = this.f40086id;
        personAlbumBgInfoMedia.name = this.name;
        personAlbumBgInfoMedia.duration = this.duration;
        personAlbumBgInfoMedia.mediaType = this.mediaType;
        Dimension dimension = this.size;
        if (dimension != null) {
            personAlbumBgInfoMedia.size = dimension.mo225055clone();
        }
        List<PersonAlbumBgInfoMedia> list = this.attachments;
        if (list != null) {
            personAlbumBgInfoMedia.attachments = ValueObject.util_map(list, new qcj() { // from class: l.ps60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PersonAlbumBgInfoMedia) obj).mo225055clone();
                }
            });
        }
        personAlbumBgInfoMedia.url = this.url;
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            personAlbumBgInfoMedia.audio = audioMedia.mo225055clone();
        }
        GifMedia gifMedia = this.gif;
        if (gifMedia != null) {
            personAlbumBgInfoMedia.gif = gifMedia.mo225055clone();
        }
        Music music = this.music;
        if (music != null) {
            personAlbumBgInfoMedia.music = music.mo225055clone();
        }
        AIPosition aIPosition = this.aiPosition;
        if (aIPosition != null) {
            personAlbumBgInfoMedia.aiPosition = aIPosition.mo225055clone();
        }
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            personAlbumBgInfoMedia.gaussianBlurParameters = gaussianBlurParameters.mo225055clone();
        }
        personAlbumBgInfoMedia.status = this.status;
        return personAlbumBgInfoMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonAlbumBgInfoMedia)) {
            return false;
        }
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = (PersonAlbumBgInfoMedia) obj;
        return ValueObject.util_equals(this.f40086id, personAlbumBgInfoMedia.f40086id) && ValueObject.util_equals(this.name, personAlbumBgInfoMedia.name) && this.duration == personAlbumBgInfoMedia.duration && ValueObject.util_equals(this.mediaType, personAlbumBgInfoMedia.mediaType) && ValueObject.util_equals(this.size, personAlbumBgInfoMedia.size) && ValueObject.util_equals(this.attachments, personAlbumBgInfoMedia.attachments) && ValueObject.util_equals(this.url, personAlbumBgInfoMedia.url) && ValueObject.util_equals(this.audio, personAlbumBgInfoMedia.audio) && ValueObject.util_equals(this.gif, personAlbumBgInfoMedia.gif) && ValueObject.util_equals(this.music, personAlbumBgInfoMedia.music) && ValueObject.util_equals(this.aiPosition, personAlbumBgInfoMedia.aiPosition) && ValueObject.util_equals(this.gaussianBlurParameters, personAlbumBgInfoMedia.gaussianBlurParameters) && ValueObject.util_equals(this.status, personAlbumBgInfoMedia.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f40086id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + Float.floatToIntBits(this.duration)) * 41;
        String str3 = this.mediaType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Dimension dimension = this.size;
        int iHashCode4 = (iHashCode3 + (dimension != null ? dimension.hashCode() : 0)) * 41;
        List<PersonAlbumBgInfoMedia> list = this.attachments;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        AudioMedia audioMedia = this.audio;
        int iHashCode7 = (iHashCode6 + (audioMedia != null ? audioMedia.hashCode() : 0)) * 41;
        GifMedia gifMedia = this.gif;
        int iHashCode8 = (iHashCode7 + (gifMedia != null ? gifMedia.hashCode() : 0)) * 41;
        Music music = this.music;
        int iHashCode9 = (iHashCode8 + (music != null ? music.hashCode() : 0)) * 41;
        AIPosition aIPosition = this.aiPosition;
        int iHashCode10 = (iHashCode9 + (aIPosition != null ? aIPosition.hashCode() : 0)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode11 = (iHashCode10 + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode12 = iHashCode11 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40086id == null) {
            this.f40086id = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.size == null) {
            this.size = Dimension.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.aiPosition == null) {
            this.aiPosition = AIPosition.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
