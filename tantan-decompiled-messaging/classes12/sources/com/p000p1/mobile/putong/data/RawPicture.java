package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.MediaLabel;
import com.p000p1.mobile.putong.data.RawPicture;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RawPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rawpicture";

    @NonNull
    @ProtobufIndex(index = 10)
    public AIPosition aiPosition;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<RawPicture> attachments;

    @Nullable
    @ProtobufIndex(index = 7)
    public AudioMedia audio;

    @ProtobufIndex(index = 2)
    public float duration;

    @Nullable
    @ProtobufIndex(index = 11)
    public GaussianBlurParameters gaussianBlurParameters;

    @Nullable
    @ProtobufIndex(index = 8)
    public GifMedia gif;

    @ProtobufIndex(index = 12)
    public boolean isPortrait;

    @Nullable
    @ProtobufIndex(index = 13)
    public List<MediaLabel> labels;

    @Nullable
    @ProtobufIndex(index = 15)
    public LivePhoto livePhoto;

    @NonNull
    @ProtobufIndex(index = 3)
    public String mediaType;

    @Nullable
    @ProtobufIndex(index = 9)
    public Music music;

    @Nullable
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public Dimension size;

    @Nullable
    @ProtobufIndex(index = 14)
    public MediaLocalStatus status;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;
    public static ProtobufAdapter<RawPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<RawPicture>() { // from class: com.p1.mobile.putong.data.RawPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RawPicture rawPicture) {
            String str = rawPicture.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.f(2, rawPicture.duration);
            String str2 = rawPicture.mediaType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            Dimension dimension = rawPicture.size;
            if (dimension != null) {
                iO += CodedOutputByteBufferNano.l(4, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            String str3 = rawPicture.url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            List<RawPicture> list = rawPicture.attachments;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(6, list, RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AudioMedia audioMedia = rawPicture.audio;
            if (audioMedia != null) {
                iO += CodedOutputByteBufferNano.l(7, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = rawPicture.gif;
            if (gifMedia != null) {
                iO += CodedOutputByteBufferNano.l(8, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = rawPicture.music;
            if (music != null) {
                iO += CodedOutputByteBufferNano.l(9, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = rawPicture.aiPosition;
            if (aIPosition != null) {
                iO += CodedOutputByteBufferNano.l(10, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = rawPicture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iO += CodedOutputByteBufferNano.l(11, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(12, rawPicture.isPortrait);
            List<MediaLabel> list2 = rawPicture.labels;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(13, list2, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MediaLocalStatus mediaLocalStatus = rawPicture.status;
            if (mediaLocalStatus != null) {
                iB += CodedOutputByteBufferNano.l(14, mediaLocalStatus, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = rawPicture.livePhoto;
            if (livePhoto != null) {
                iB += CodedOutputByteBufferNano.l(15, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
            List<String> list3 = rawPicture.tags;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(16, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) rawPicture).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RawPicture m18869parse(nb5 nb5Var) throws IOException {
            RawPicture rawPicture = new RawPicture();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (rawPicture.mediaType == null) {
                            rawPicture.mediaType = "";
                        }
                        if (rawPicture.size == null) {
                            rawPicture.size = Dimension.new_();
                        }
                        if (rawPicture.url == null) {
                            rawPicture.url = "";
                        }
                        if (rawPicture.aiPosition == null) {
                            rawPicture.aiPosition = AIPosition.new_();
                        }
                        if (rawPicture.tags == null) {
                            rawPicture.tags = new ArrayList();
                        }
                        break;
                    case 10:
                        rawPicture.name = nb5Var.s();
                        continue;
                    case 21:
                        rawPicture.duration = nb5Var.i();
                        continue;
                    case 26:
                        rawPicture.mediaType = nb5Var.s();
                        continue;
                    case 34:
                        rawPicture.size = (Dimension) nb5Var.l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        rawPicture.url = nb5Var.s();
                        continue;
                    case 50:
                        rawPicture.attachments = (List) nb5Var.l(RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        rawPicture.audio = (AudioMedia) nb5Var.l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        rawPicture.gif = (GifMedia) nb5Var.l(GifMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        rawPicture.music = (Music) nb5Var.l(Music.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        rawPicture.aiPosition = (AIPosition) nb5Var.l(AIPosition.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        rawPicture.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 96:
                        rawPicture.isPortrait = nb5Var.g();
                        continue;
                    case 106:
                        rawPicture.labels = (List) nb5Var.l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        rawPicture.status = (MediaLocalStatus) nb5Var.l(MediaLocalStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        rawPicture.livePhoto = (LivePhoto) nb5Var.l(LivePhoto.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        rawPicture.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (rawPicture.mediaType == null) {
                            rawPicture.mediaType = "";
                        }
                        if (rawPicture.size == null) {
                            rawPicture.size = Dimension.new_();
                        }
                        if (rawPicture.url == null) {
                            rawPicture.url = "";
                        }
                        if (rawPicture.aiPosition == null) {
                            rawPicture.aiPosition = AIPosition.new_();
                        }
                        if (rawPicture.tags == null) {
                            rawPicture.tags = new ArrayList();
                            return rawPicture;
                        }
                        break;
                }
            }
            return rawPicture;
        }

        public void serialize(RawPicture rawPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rawPicture.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.E(2, rawPicture.duration);
            String str2 = rawPicture.mediaType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            Dimension dimension = rawPicture.size;
            if (dimension != null) {
                codedOutputByteBufferNano.K(4, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            String str3 = rawPicture.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            List<RawPicture> list = rawPicture.attachments;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AudioMedia audioMedia = rawPicture.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.K(7, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = rawPicture.gif;
            if (gifMedia != null) {
                codedOutputByteBufferNano.K(8, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = rawPicture.music;
            if (music != null) {
                codedOutputByteBufferNano.K(9, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = rawPicture.aiPosition;
            if (aIPosition != null) {
                codedOutputByteBufferNano.K(10, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = rawPicture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.K(11, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(12, rawPicture.isPortrait);
            List<MediaLabel> list2 = rawPicture.labels;
            if (list2 != null) {
                codedOutputByteBufferNano.K(13, list2, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MediaLocalStatus mediaLocalStatus = rawPicture.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.K(14, mediaLocalStatus, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = rawPicture.livePhoto;
            if (livePhoto != null) {
                codedOutputByteBufferNano.K(15, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
            List<String> list3 = rawPicture.tags;
            if (list3 != null) {
                codedOutputByteBufferNano.K(16, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RawPicture> JSON_ADAPTER = new ObjectJsonAdapter<RawPicture>() { // from class: com.p1.mobile.putong.data.RawPicture.2
        public Class getDataClass() {
            return RawPicture.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RawPicture mo17830newInstance() {
            return new RawPicture();
        }

        public boolean parseField(RawPicture rawPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    rawPicture.duration = (float) jsonParser.getValueAsDouble();
                    return true;
                case "aiPosition":
                    rawPicture.aiPosition = (AIPosition) Converter.AIPOSITION.parse(jsonParser, str2);
                    return true;
                case "labels":
                    rawPicture.labels = JsonAdapter.parseArray(jsonParser, MediaLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    rawPicture.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "attachments":
                    rawPicture.attachments = JsonAdapter.parseArray(jsonParser, RawPicture.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gaussianBlurParameters":
                    rawPicture.gaussianBlurParameters = (GaussianBlurParameters) GaussianBlurParameters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isPortrait":
                    rawPicture.isPortrait = jsonParser.getValueAsBoolean();
                    return true;
                case "gif":
                    rawPicture.gif = (GifMedia) GifMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    rawPicture.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    rawPicture.name = jsonParser.getValueAsString();
                    return true;
                case "size":
                    rawPicture.size = (Dimension) Converter.DIMENSION.parse(jsonParser, str2);
                    return true;
                case "tags":
                    rawPicture.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "audio":
                    rawPicture.audio = (AudioMedia) AudioMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "music":
                    rawPicture.music = (Music) Music.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "livePhoto":
                    rawPicture.livePhoto = (LivePhoto) LivePhoto.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    rawPicture.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RawPicture rawPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "aiPosition":
                case "labels":
                case "status":
                case "attachments":
                case "gaussianBlurParameters":
                case "isPortrait":
                case "gif":
                case "url":
                case "name":
                case "size":
                case "tags":
                case "audio":
                case "music":
                case "livePhoto":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(rawPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RawPicture rawPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = rawPicture.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeNumberField("duration", rawPicture.duration);
            String str2 = rawPicture.mediaType;
            if (str2 != null) {
                jsonGenerator.writeStringField("mediaType", str2);
            }
            if (rawPicture.size != null) {
                jsonGenerator.writeFieldName("size");
                Converter.DIMENSION.serialize(rawPicture.size, jsonGenerator, true);
            }
            String str3 = rawPicture.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            if (rawPicture.attachments != null) {
                jsonGenerator.writeFieldName("attachments");
                JsonAdapter.serializeArray(rawPicture.attachments, jsonGenerator, RawPicture.JSON_ADAPTER);
            }
            if (rawPicture.audio != null) {
                jsonGenerator.writeFieldName("audio");
                AudioMedia.JSON_ADAPTER.serialize(rawPicture.audio, jsonGenerator, true);
            }
            if (rawPicture.gif != null) {
                jsonGenerator.writeFieldName("gif");
                GifMedia.JSON_ADAPTER.serialize(rawPicture.gif, jsonGenerator, true);
            }
            if (rawPicture.music != null) {
                jsonGenerator.writeFieldName("music");
                Music.JSON_ADAPTER.serialize(rawPicture.music, jsonGenerator, true);
            }
            if (rawPicture.aiPosition != null) {
                jsonGenerator.writeFieldName("aiPosition");
                Converter.AIPOSITION.serialize(rawPicture.aiPosition, jsonGenerator, true);
            }
            if (rawPicture.gaussianBlurParameters != null) {
                jsonGenerator.writeFieldName("gaussianBlurParameters");
                GaussianBlurParameters.JSON_ADAPTER.serialize(rawPicture.gaussianBlurParameters, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isPortrait", rawPicture.isPortrait);
            if (rawPicture.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(rawPicture.labels, jsonGenerator, MediaLabel.JSON_ADAPTER);
            }
            if (rawPicture.status != null) {
                jsonGenerator.writeFieldName("status");
                MediaLocalStatus.JSON_ADAPTER.serialize(rawPicture.status, jsonGenerator, true);
            }
            if (rawPicture.livePhoto != null) {
                jsonGenerator.writeFieldName("livePhoto");
                LivePhoto.JSON_ADAPTER.serialize(rawPicture.livePhoto, jsonGenerator, true);
            }
            if (rawPicture.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(rawPicture.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RawPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RawPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MediaLabel m976a(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m977b(String str) {
        return str;
    }

    public static RawPicture new_() {
        RawPicture rawPicture = new RawPicture();
        rawPicture.nullCheck();
        return rawPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RawPicture m18868clone() {
        RawPicture rawPicture = new RawPicture();
        rawPicture.name = this.name;
        rawPicture.duration = this.duration;
        rawPicture.mediaType = this.mediaType;
        Dimension dimension = this.size;
        if (dimension != null) {
            rawPicture.size = dimension.m17988clone();
        }
        rawPicture.url = this.url;
        List<RawPicture> list = this.attachments;
        if (list != null) {
            rawPicture.attachments = ValueObject.util_map(list, new w9j() { // from class: l.hdc0
                public final Object call(Object obj) {
                    return ((RawPicture) obj).m18868clone();
                }
            });
        }
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            rawPicture.audio = audioMedia.m17717clone();
        }
        GifMedia gifMedia = this.gif;
        if (gifMedia != null) {
            rawPicture.gif = gifMedia.m18177clone();
        }
        Music music = this.music;
        if (music != null) {
            rawPicture.music = music.m18500clone();
        }
        AIPosition aIPosition = this.aiPosition;
        if (aIPosition != null) {
            rawPicture.aiPosition = aIPosition.m17610clone();
        }
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            rawPicture.gaussianBlurParameters = gaussianBlurParameters.m18171clone();
        }
        rawPicture.isPortrait = this.isPortrait;
        List<MediaLabel> list2 = this.labels;
        if (list2 != null) {
            rawPicture.labels = ValueObject.util_map(list2, new w9j() { // from class: l.idc0
                public final Object call(Object obj) {
                    return RawPicture.m976a((MediaLabel) obj);
                }
            });
        }
        rawPicture.status = this.status;
        LivePhoto livePhoto = this.livePhoto;
        if (livePhoto != null) {
            rawPicture.livePhoto = livePhoto.m18357clone();
        }
        List<String> list3 = this.tags;
        if (list3 != null) {
            rawPicture.tags = ValueObject.util_map(list3, new w9j() { // from class: l.jdc0
                public final Object call(Object obj) {
                    return RawPicture.m977b((String) obj);
                }
            });
        }
        return rawPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawPicture)) {
            return false;
        }
        RawPicture rawPicture = (RawPicture) obj;
        return ValueObject.util_equals(this.name, rawPicture.name) && this.duration == rawPicture.duration && ValueObject.util_equals(this.mediaType, rawPicture.mediaType) && ValueObject.util_equals(this.size, rawPicture.size) && ValueObject.util_equals(this.url, rawPicture.url) && ValueObject.util_equals(this.attachments, rawPicture.attachments) && ValueObject.util_equals(this.audio, rawPicture.audio) && ValueObject.util_equals(this.gif, rawPicture.gif) && ValueObject.util_equals(this.music, rawPicture.music) && ValueObject.util_equals(this.aiPosition, rawPicture.aiPosition) && ValueObject.util_equals(this.gaussianBlurParameters, rawPicture.gaussianBlurParameters) && this.isPortrait == rawPicture.isPortrait && ValueObject.util_equals(this.labels, rawPicture.labels) && ValueObject.util_equals(this.status, rawPicture.status) && ValueObject.util_equals(this.livePhoto, rawPicture.livePhoto) && ValueObject.util_equals(this.tags, rawPicture.tags);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + Float.floatToIntBits(this.duration)) * 41;
        String str2 = this.mediaType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Dimension dimension = this.size;
        int iHashCode3 = (iHashCode2 + (dimension != null ? dimension.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<RawPicture> list = this.attachments;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        AudioMedia audioMedia = this.audio;
        int iHashCode6 = (iHashCode5 + (audioMedia != null ? audioMedia.hashCode() : 0)) * 41;
        GifMedia gifMedia = this.gif;
        int iHashCode7 = (iHashCode6 + (gifMedia != null ? gifMedia.hashCode() : 0)) * 41;
        Music music = this.music;
        int iHashCode8 = (iHashCode7 + (music != null ? music.hashCode() : 0)) * 41;
        AIPosition aIPosition = this.aiPosition;
        int iHashCode9 = (iHashCode8 + (aIPosition != null ? aIPosition.hashCode() : 0)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode10 = (((iHashCode9 + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0)) * 41) + (this.isPortrait ? 1231 : 1237)) * 41;
        List<MediaLabel> list2 = this.labels;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        MediaLocalStatus mediaLocalStatus = this.status;
        int iHashCode12 = (iHashCode11 + (mediaLocalStatus != null ? mediaLocalStatus.hashCode() : 0)) * 41;
        LivePhoto livePhoto = this.livePhoto;
        int iHashCode13 = (iHashCode12 + (livePhoto != null ? livePhoto.hashCode() : 0)) * 41;
        List<String> list3 = this.tags;
        int iHashCode14 = iHashCode13 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode14;
        return iHashCode14;
    }

    public void nullCheck() {
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
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
