package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class MediaMeta extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mediameta";

    @NonNull
    @ProtobufIndex(index = 57)
    public String camera;

    @NonNull
    @ProtobufIndex(index = 59)
    public String filter;

    @ProtobufIndex(index = 54)
    public boolean hasAudio;

    @ProtobufIndex(index = 60)
    public boolean isSameMusic;

    @NonNull
    @ProtobufIndex(index = 55)
    public String musicId;

    @NonNull
    @ProtobufIndex(index = 53)
    public String musicReference;

    @NonNull
    @ProtobufIndex(index = 56)
    public String proportion;

    @NonNull
    @ProtobufIndex(index = 52)
    public String source;

    @NonNull
    @ProtobufIndex(index = 58)
    public String sticker;

    @NonNull
    @ProtobufIndex(index = 51)
    public String type;
    public static ProtobufAdapter<MediaMeta> PROTOBUF_ADAPTER = new MessageNanoAdapter<MediaMeta>() { // from class: com.p1.mobile.putong.data.MediaMeta.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MediaMeta mediaMeta) {
            String str = mediaMeta.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(51, str) : 0;
            String str2 = mediaMeta.source;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(52, str2);
            }
            String str3 = mediaMeta.musicReference;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(53, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(54, mediaMeta.hasAudio);
            String str4 = mediaMeta.musicId;
            if (str4 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(55, str4);
            }
            String str5 = mediaMeta.proportion;
            if (str5 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(56, str5);
            }
            String str6 = mediaMeta.camera;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(57, str6);
            }
            String str7 = mediaMeta.sticker;
            if (str7 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(58, str7);
            }
            String str8 = mediaMeta.filter;
            if (str8 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(59, str8);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(60, mediaMeta.isSameMusic);
            mediaMeta.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MediaMeta parse(nc5 nc5Var) throws IOException {
            MediaMeta mediaMeta = new MediaMeta();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (mediaMeta.type == null) {
                            mediaMeta.type = "";
                        }
                        if (mediaMeta.source == null) {
                            mediaMeta.source = "";
                        }
                        if (mediaMeta.musicReference == null) {
                            mediaMeta.musicReference = "";
                        }
                        if (mediaMeta.musicId == null) {
                            mediaMeta.musicId = "";
                        }
                        if (mediaMeta.proportion == null) {
                            mediaMeta.proportion = "";
                        }
                        if (mediaMeta.camera == null) {
                            mediaMeta.camera = "";
                        }
                        if (mediaMeta.sticker == null) {
                            mediaMeta.sticker = "";
                        }
                        if (mediaMeta.filter == null) {
                            mediaMeta.filter = "";
                        }
                        break;
                    case 410:
                        mediaMeta.type = nc5Var.m162495s();
                        continue;
                    case 418:
                        mediaMeta.source = nc5Var.m162495s();
                        continue;
                    case 426:
                        mediaMeta.musicReference = nc5Var.m162495s();
                        continue;
                    case 432:
                        mediaMeta.hasAudio = nc5Var.m162483g();
                        continue;
                    case 442:
                        mediaMeta.musicId = nc5Var.m162495s();
                        continue;
                    case 450:
                        mediaMeta.proportion = nc5Var.m162495s();
                        continue;
                    case 458:
                        mediaMeta.camera = nc5Var.m162495s();
                        continue;
                    case 466:
                        mediaMeta.sticker = nc5Var.m162495s();
                        continue;
                    case 474:
                        mediaMeta.filter = nc5Var.m162495s();
                        continue;
                    case 480:
                        mediaMeta.isSameMusic = nc5Var.m162483g();
                        continue;
                    default:
                        if (mediaMeta.type == null) {
                            mediaMeta.type = "";
                        }
                        if (mediaMeta.source == null) {
                            mediaMeta.source = "";
                        }
                        if (mediaMeta.musicReference == null) {
                            mediaMeta.musicReference = "";
                        }
                        if (mediaMeta.musicId == null) {
                            mediaMeta.musicId = "";
                        }
                        if (mediaMeta.proportion == null) {
                            mediaMeta.proportion = "";
                        }
                        if (mediaMeta.camera == null) {
                            mediaMeta.camera = "";
                        }
                        if (mediaMeta.sticker == null) {
                            mediaMeta.sticker = "";
                        }
                        if (mediaMeta.filter == null) {
                            mediaMeta.filter = "";
                            return mediaMeta;
                        }
                        break;
                }
            }
            return mediaMeta;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MediaMeta mediaMeta, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = mediaMeta.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(51, str);
            }
            String str2 = mediaMeta.source;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(52, str2);
            }
            String str3 = mediaMeta.musicReference;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(53, str3);
            }
            codedOutputByteBufferNano.m17299A(54, mediaMeta.hasAudio);
            String str4 = mediaMeta.musicId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(55, str4);
            }
            String str5 = mediaMeta.proportion;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(56, str5);
            }
            String str6 = mediaMeta.camera;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(57, str6);
            }
            String str7 = mediaMeta.sticker;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(58, str7);
            }
            String str8 = mediaMeta.filter;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(59, str8);
            }
            codedOutputByteBufferNano.m17299A(60, mediaMeta.isSameMusic);
        }
    };
    public static JsonAdapter<MediaMeta> JSON_ADAPTER = new ObjectJsonAdapter<MediaMeta>() { // from class: com.p1.mobile.putong.data.MediaMeta.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MediaMeta.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MediaMeta newInstance() {
            return new MediaMeta();
        }

        public boolean parseField(MediaMeta mediaMeta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sticker":
                    mediaMeta.sticker = jsonParser.getValueAsString();
                    return true;
                case "camera":
                    mediaMeta.camera = jsonParser.getValueAsString();
                    return true;
                case "filter":
                    mediaMeta.filter = jsonParser.getValueAsString();
                    return true;
                case "source":
                    mediaMeta.source = jsonParser.getValueAsString();
                    return true;
                case "proportion":
                    mediaMeta.proportion = jsonParser.getValueAsString();
                    return true;
                case "type":
                    mediaMeta.type = jsonParser.getValueAsString();
                    return true;
                case "hasAudio":
                    mediaMeta.hasAudio = jsonParser.getValueAsBoolean();
                    return true;
                case "musicId":
                    mediaMeta.musicId = jsonParser.getValueAsString();
                    return true;
                case "musicReference":
                    mediaMeta.musicReference = jsonParser.getValueAsString();
                    return true;
                case "isSameMusic":
                    mediaMeta.isSameMusic = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MediaMeta mediaMeta, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sticker":
                case "camera":
                case "filter":
                case "source":
                case "proportion":
                case "type":
                case "hasAudio":
                case "musicId":
                case "musicReference":
                case "isSameMusic":
                    return true;
                default:
                    return super.parseFieldCheck(mediaMeta, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MediaMeta mediaMeta, JsonGenerator jsonGenerator) throws IOException {
            String str = mediaMeta.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = mediaMeta.source;
            if (str2 != null) {
                jsonGenerator.writeStringField("source", str2);
            }
            String str3 = mediaMeta.musicReference;
            if (str3 != null) {
                jsonGenerator.writeStringField("musicReference", str3);
            }
            jsonGenerator.writeBooleanField("hasAudio", mediaMeta.hasAudio);
            String str4 = mediaMeta.musicId;
            if (str4 != null) {
                jsonGenerator.writeStringField("musicId", str4);
            }
            String str5 = mediaMeta.proportion;
            if (str5 != null) {
                jsonGenerator.writeStringField("proportion", str5);
            }
            String str6 = mediaMeta.camera;
            if (str6 != null) {
                jsonGenerator.writeStringField("camera", str6);
            }
            String str7 = mediaMeta.sticker;
            if (str7 != null) {
                jsonGenerator.writeStringField("sticker", str7);
            }
            String str8 = mediaMeta.filter;
            if (str8 != null) {
                jsonGenerator.writeStringField("filter", str8);
            }
            jsonGenerator.writeBooleanField("isSameMusic", mediaMeta.isSameMusic);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MediaMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MediaMeta) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MediaMeta new_() {
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.nullCheck();
        return mediaMeta;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MediaMeta mo225055clone() {
        MediaMeta mediaMeta = new MediaMeta();
        mediaMeta.type = this.type;
        mediaMeta.source = this.source;
        mediaMeta.musicReference = this.musicReference;
        mediaMeta.hasAudio = this.hasAudio;
        mediaMeta.musicId = this.musicId;
        mediaMeta.proportion = this.proportion;
        mediaMeta.camera = this.camera;
        mediaMeta.sticker = this.sticker;
        mediaMeta.filter = this.filter;
        mediaMeta.isSameMusic = this.isSameMusic;
        return mediaMeta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaMeta)) {
            return false;
        }
        MediaMeta mediaMeta = (MediaMeta) obj;
        return ValueObject.util_equals(this.type, mediaMeta.type) && ValueObject.util_equals(this.source, mediaMeta.source) && ValueObject.util_equals(this.musicReference, mediaMeta.musicReference) && this.hasAudio == mediaMeta.hasAudio && ValueObject.util_equals(this.musicId, mediaMeta.musicId) && ValueObject.util_equals(this.proportion, mediaMeta.proportion) && ValueObject.util_equals(this.camera, mediaMeta.camera) && ValueObject.util_equals(this.sticker, mediaMeta.sticker) && ValueObject.util_equals(this.filter, mediaMeta.filter) && this.isSameMusic == mediaMeta.isSameMusic;
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.musicReference;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.hasAudio ? 1231 : 1237)) * 41;
        String str4 = this.musicId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.proportion;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.camera;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.sticker;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.filter;
        int iHashCode8 = ((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.isSameMusic ? 1231 : 1237);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.musicReference == null) {
            this.musicReference = "";
        }
        if (this.musicId == null) {
            this.musicId = "";
        }
        if (this.proportion == null) {
            this.proportion = "";
        }
        if (this.camera == null) {
            this.camera = "";
        }
        if (this.sticker == null) {
            this.sticker = "";
        }
        if (this.filter == null) {
            this.filter = "";
        }
    }

    public MediaMeta subtract(MediaMeta mediaMeta) {
        MediaMeta mediaMeta2 = new MediaMeta();
        if (!ValueObject.util_equals(this.type, mediaMeta.type)) {
            mediaMeta2.type = this.type;
        }
        if (!ValueObject.util_equals(this.source, mediaMeta.source)) {
            mediaMeta2.source = this.source;
        }
        if (!ValueObject.util_equals(this.musicReference, mediaMeta.musicReference)) {
            mediaMeta2.musicReference = this.musicReference;
        }
        if (!ValueObject.util_equals(this.musicId, mediaMeta.musicId)) {
            mediaMeta2.musicId = this.musicId;
        }
        if (!ValueObject.util_equals(this.proportion, mediaMeta.proportion)) {
            mediaMeta2.proportion = this.proportion;
        }
        if (!ValueObject.util_equals(this.camera, mediaMeta.camera)) {
            mediaMeta2.camera = this.camera;
        }
        if (!ValueObject.util_equals(this.sticker, mediaMeta.sticker)) {
            mediaMeta2.sticker = this.sticker;
        }
        if (!ValueObject.util_equals(this.filter, mediaMeta.filter)) {
            mediaMeta2.filter = this.filter;
        }
        if (mediaMeta2.equals(new MediaMeta())) {
            return null;
        }
        return mediaMeta2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
