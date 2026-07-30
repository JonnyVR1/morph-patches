package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.RawPicture;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
    @ProtobufIndex(index = 16)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;
    public static ProtobufAdapter<RawPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<RawPicture>() { // from class: com.p1.mobile.putong.data.RawPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RawPicture rawPicture) {
            String str = rawPicture.name;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17224f(2, rawPicture.duration);
            String str2 = rawPicture.mediaType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            Dimension dimension = rawPicture.size;
            if (dimension != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            String str3 = rawPicture.url;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            List<RawPicture> list = rawPicture.attachments;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list, RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AudioMedia audioMedia = rawPicture.audio;
            if (audioMedia != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(7, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = rawPicture.gif;
            if (gifMedia != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = rawPicture.music;
            if (music != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(9, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = rawPicture.aiPosition;
            if (aIPosition != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(10, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = rawPicture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(11, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(12, rawPicture.isPortrait);
            List<MediaLabel> list2 = rawPicture.labels;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(13, list2, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MediaLocalStatus mediaLocalStatus = rawPicture.status;
            if (mediaLocalStatus != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(14, mediaLocalStatus, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = rawPicture.livePhoto;
            if (livePhoto != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(15, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
            List<String> list3 = rawPicture.tags;
            if (list3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(16, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            rawPicture.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RawPicture parse(nb5 nb5Var) throws IOException {
            RawPicture rawPicture = new RawPicture();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                        rawPicture.name = nb5Var.m158750s();
                        continue;
                    case 21:
                        rawPicture.duration = nb5Var.m158740i();
                        continue;
                    case 26:
                        rawPicture.mediaType = nb5Var.m158750s();
                        continue;
                    case 34:
                        rawPicture.size = (Dimension) nb5Var.m158743l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        rawPicture.url = nb5Var.m158750s();
                        continue;
                    case 50:
                        rawPicture.attachments = (List) nb5Var.m158743l(RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        rawPicture.audio = (AudioMedia) nb5Var.m158743l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        rawPicture.gif = (GifMedia) nb5Var.m158743l(GifMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        rawPicture.music = (Music) nb5Var.m158743l(Music.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        rawPicture.aiPosition = (AIPosition) nb5Var.m158743l(AIPosition.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        rawPicture.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.m158743l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case Opcodes.IADD /* 96 */:
                        rawPicture.isPortrait = nb5Var.m158738g();
                        continue;
                    case 106:
                        rawPicture.labels = (List) nb5Var.m158743l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        rawPicture.status = (MediaLocalStatus) nb5Var.m158743l(MediaLocalStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        rawPicture.livePhoto = (LivePhoto) nb5Var.m158743l(LivePhoto.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        rawPicture.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RawPicture rawPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rawPicture.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17248E(2, rawPicture.duration);
            String str2 = rawPicture.mediaType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            Dimension dimension = rawPicture.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17254K(4, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            String str3 = rawPicture.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            List<RawPicture> list = rawPicture.attachments;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, RawPicture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            AudioMedia audioMedia = rawPicture.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.m17254K(7, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = rawPicture.gif;
            if (gifMedia != null) {
                codedOutputByteBufferNano.m17254K(8, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            Music music = rawPicture.music;
            if (music != null) {
                codedOutputByteBufferNano.m17254K(9, music, Music.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = rawPicture.aiPosition;
            if (aIPosition != null) {
                codedOutputByteBufferNano.m17254K(10, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            GaussianBlurParameters gaussianBlurParameters = rawPicture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.m17254K(11, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(12, rawPicture.isPortrait);
            List<MediaLabel> list2 = rawPicture.labels;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(13, list2, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MediaLocalStatus mediaLocalStatus = rawPicture.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.m17254K(14, mediaLocalStatus, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = rawPicture.livePhoto;
            if (livePhoto != null) {
                codedOutputByteBufferNano.m17254K(15, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
            List<String> list3 = rawPicture.tags;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(16, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RawPicture> JSON_ADAPTER = new ObjectJsonAdapter<RawPicture>() { // from class: com.p1.mobile.putong.data.RawPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RawPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RawPicture newInstance() {
            return new RawPicture();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(RawPicture rawPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1873649295:
                    if (str.equals("aiPosition")) {
                        b = 1;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -738997328:
                    if (str.equals("attachments")) {
                        b = 4;
                    }
                    break;
                case -592715636:
                    if (str.equals("gaussianBlurParameters")) {
                        b = 5;
                    }
                    break;
                case -64003355:
                    if (str.equals("isPortrait")) {
                        b = 6;
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        b = 7;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 3530753:
                    if (str.equals("size")) {
                        b = 10;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 11;
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        b = 12;
                    }
                    break;
                case 104263205:
                    if (str.equals("music")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 994791590:
                    if (str.equals("livePhoto")) {
                        b = 14;
                    }
                    break;
                case 2140463422:
                    if (str.equals("mediaType")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    rawPicture.duration = (float) jsonParser.getValueAsDouble();
                    return true;
                case 1:
                    rawPicture.aiPosition = Converter.AIPOSITION.parse(jsonParser, str2);
                    return true;
                case 2:
                    rawPicture.labels = JsonAdapter.parseArray(jsonParser, MediaLabel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    rawPicture.status = MediaLocalStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 4:
                    rawPicture.attachments = JsonAdapter.parseArray(jsonParser, RawPicture.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 5:
                    rawPicture.gaussianBlurParameters = GaussianBlurParameters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    rawPicture.isPortrait = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    rawPicture.gif = GifMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    rawPicture.url = jsonParser.getValueAsString();
                    return true;
                case 9:
                    rawPicture.name = jsonParser.getValueAsString();
                    return true;
                case 10:
                    rawPicture.size = Converter.DIMENSION.parse(jsonParser, str2);
                    return true;
                case 11:
                    rawPicture.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    rawPicture.audio = AudioMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    rawPicture.music = Music.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    rawPicture.livePhoto = LivePhoto.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    rawPicture.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(RawPicture rawPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1992012396:
                    if (str.equals(BLiveOperationTitleShowType.duration)) {
                        b = 0;
                    }
                    break;
                case -1873649295:
                    if (str.equals("aiPosition")) {
                        b = 1;
                    }
                    break;
                case -1110417409:
                    if (str.equals("labels")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -738997328:
                    if (str.equals("attachments")) {
                        b = 4;
                    }
                    break;
                case -592715636:
                    if (str.equals("gaussianBlurParameters")) {
                        b = 5;
                    }
                    break;
                case -64003355:
                    if (str.equals("isPortrait")) {
                        b = 6;
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        b = 7;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 8;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 9;
                    }
                    break;
                case 3530753:
                    if (str.equals("size")) {
                        b = 10;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b = 11;
                    }
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        b = 12;
                    }
                    break;
                case 104263205:
                    if (str.equals("music")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 994791590:
                    if (str.equals("livePhoto")) {
                        b = 14;
                    }
                    break;
                case 2140463422:
                    if (str.equals("mediaType")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(rawPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RawPicture rawPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = rawPicture.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, rawPicture.duration);
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RawPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RawPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MediaLabel m60058a(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60059b(String str) {
        return str;
    }

    public static RawPicture new_() {
        RawPicture rawPicture = new RawPicture();
        rawPicture.nullCheck();
        return rawPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RawPicture mo223809clone() {
        RawPicture rawPicture = new RawPicture();
        rawPicture.name = this.name;
        rawPicture.duration = this.duration;
        rawPicture.mediaType = this.mediaType;
        Dimension dimension = this.size;
        if (dimension != null) {
            rawPicture.size = dimension.mo223809clone();
        }
        rawPicture.url = this.url;
        List<RawPicture> list = this.attachments;
        if (list != null) {
            rawPicture.attachments = ValueObject.util_map(list, new w9j() { // from class: l.hdc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((RawPicture) obj).mo223809clone();
                }
            });
        }
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            rawPicture.audio = audioMedia.mo223809clone();
        }
        GifMedia gifMedia = this.gif;
        if (gifMedia != null) {
            rawPicture.gif = gifMedia.mo223809clone();
        }
        Music music = this.music;
        if (music != null) {
            rawPicture.music = music.mo223809clone();
        }
        AIPosition aIPosition = this.aiPosition;
        if (aIPosition != null) {
            rawPicture.aiPosition = aIPosition.mo223809clone();
        }
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            rawPicture.gaussianBlurParameters = gaussianBlurParameters.mo223809clone();
        }
        rawPicture.isPortrait = this.isPortrait;
        List<MediaLabel> list2 = this.labels;
        if (list2 != null) {
            rawPicture.labels = ValueObject.util_map(list2, new w9j() { // from class: l.idc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return RawPicture.m60058a((MediaLabel) obj);
                }
            });
        }
        rawPicture.status = this.status;
        LivePhoto livePhoto = this.livePhoto;
        if (livePhoto != null) {
            rawPicture.livePhoto = livePhoto.mo223809clone();
        }
        List<String> list3 = this.tags;
        if (list3 != null) {
            rawPicture.tags = ValueObject.util_map(list3, new w9j() { // from class: l.jdc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return RawPicture.m60059b((String) obj);
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
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
