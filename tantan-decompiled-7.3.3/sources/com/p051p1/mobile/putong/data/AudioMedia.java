package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class AudioMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiomedia";

    @ProtobufIndex(index = 53)
    public double duration;

    @NonNull
    @ProtobufIndex(index = 51)
    public String musicId;

    @NonNull
    @ProtobufIndex(index = 52)
    public String size;

    @NonNull
    @ProtobufIndex(index = 55)
    public String type;

    @NonNull
    @ProtobufIndex(index = 54)
    public String url;
    public static ProtobufAdapter<AudioMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioMedia>() { // from class: com.p1.mobile.putong.data.AudioMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AudioMedia audioMedia) {
            String str = audioMedia.musicId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(51, str) : 0;
            String str2 = audioMedia.size;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(52, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(53, audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(54, str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(55, str4);
            }
            audioMedia.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AudioMedia parse(nc5 nc5Var) throws IOException {
            AudioMedia audioMedia = new AudioMedia();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (audioMedia.musicId == null) {
                        audioMedia.musicId = "";
                    }
                    if (audioMedia.size == null) {
                        audioMedia.size = "";
                    }
                    if (audioMedia.url == null) {
                        audioMedia.url = "";
                    }
                    if (audioMedia.type != null) {
                        break;
                    }
                    audioMedia.type = "";
                    break;
                }
                if (iM162497u == 410) {
                    audioMedia.musicId = nc5Var.m162495s();
                } else if (iM162497u == 418) {
                    audioMedia.size = nc5Var.m162495s();
                } else if (iM162497u == 425) {
                    audioMedia.duration = nc5Var.m162484h();
                } else if (iM162497u == 434) {
                    audioMedia.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 442) {
                        if (audioMedia.musicId == null) {
                            audioMedia.musicId = "";
                        }
                        if (audioMedia.size == null) {
                            audioMedia.size = "";
                        }
                        if (audioMedia.url == null) {
                            audioMedia.url = "";
                        }
                        if (audioMedia.type != null) {
                            break;
                        }
                        audioMedia.type = "";
                        return audioMedia;
                    }
                    audioMedia.type = nc5Var.m162495s();
                }
            }
            return audioMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AudioMedia audioMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = audioMedia.musicId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(51, str);
            }
            String str2 = audioMedia.size;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(52, str2);
            }
            codedOutputByteBufferNano.m17301C(53, audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(54, str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(55, str4);
            }
        }
    };
    public static JsonAdapter<AudioMedia> JSON_ADAPTER = new ObjectJsonAdapter<AudioMedia>() { // from class: com.p1.mobile.putong.data.AudioMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AudioMedia.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AudioMedia newInstance() {
            return new AudioMedia();
        }

        public boolean parseField(AudioMedia audioMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    audioMedia.duration = jsonParser.getValueAsDouble();
                    return true;
                case "url":
                    audioMedia.url = jsonParser.getValueAsString();
                    return true;
                case "size":
                    audioMedia.size = jsonParser.getValueAsString();
                    return true;
                case "type":
                    audioMedia.type = jsonParser.getValueAsString();
                    return true;
                case "musicId":
                    audioMedia.musicId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AudioMedia audioMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "size":
                case "type":
                case "musicId":
                    return true;
                default:
                    return super.parseFieldCheck(audioMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioMedia audioMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = audioMedia.musicId;
            if (str != null) {
                jsonGenerator.writeStringField("musicId", str);
            }
            String str2 = audioMedia.size;
            if (str2 != null) {
                jsonGenerator.writeStringField("size", str2);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AudioMedia new_() {
        AudioMedia audioMedia = new AudioMedia();
        audioMedia.nullCheck();
        return audioMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AudioMedia mo225055clone() {
        AudioMedia audioMedia = new AudioMedia();
        audioMedia.musicId = this.musicId;
        audioMedia.size = this.size;
        audioMedia.duration = this.duration;
        audioMedia.url = this.url;
        audioMedia.type = this.type;
        return audioMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMedia)) {
            return false;
        }
        AudioMedia audioMedia = (AudioMedia) obj;
        return ValueObject.util_equals(this.musicId, audioMedia.musicId) && ValueObject.util_equals(this.size, audioMedia.size) && this.duration == audioMedia.duration && ValueObject.util_equals(this.url, audioMedia.url) && ValueObject.util_equals(this.type, audioMedia.type);
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
        String str = this.musicId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.size;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.duration);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str3 = this.url;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.musicId == null) {
            this.musicId = "";
        }
        if (this.size == null) {
            this.size = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public AudioMedia subtract(AudioMedia audioMedia) {
        AudioMedia audioMedia2 = new AudioMedia();
        if (!ValueObject.util_equals(this.musicId, audioMedia.musicId)) {
            audioMedia2.musicId = this.musicId;
        }
        if (!ValueObject.util_equals(this.size, audioMedia.size)) {
            audioMedia2.size = this.size;
        }
        if (!ValueObject.util_equals(this.url, audioMedia.url)) {
            audioMedia2.url = this.url;
        }
        if (!ValueObject.util_equals(this.type, audioMedia.type)) {
            audioMedia2.type = this.type;
        }
        if (audioMedia2.equals(new AudioMedia())) {
            return null;
        }
        return audioMedia2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
