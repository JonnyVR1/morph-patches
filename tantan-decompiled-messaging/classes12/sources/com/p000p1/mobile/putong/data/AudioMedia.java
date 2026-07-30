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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AudioMedia audioMedia) {
            String str = audioMedia.musicId;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = audioMedia.size;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(53, audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                iD += CodedOutputByteBufferNano.o(54, str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                iD += CodedOutputByteBufferNano.o(55, str4);
            }
            ((MessageNano) audioMedia).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AudioMedia m17718parse(nb5 nb5Var) throws IOException {
            AudioMedia audioMedia = new AudioMedia();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 410) {
                    audioMedia.musicId = nb5Var.s();
                } else if (iU == 418) {
                    audioMedia.size = nb5Var.s();
                } else if (iU == 425) {
                    audioMedia.duration = nb5Var.h();
                } else if (iU == 434) {
                    audioMedia.url = nb5Var.s();
                } else {
                    if (iU != 442) {
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
                    audioMedia.type = nb5Var.s();
                }
            }
            return audioMedia;
        }

        public void serialize(AudioMedia audioMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = audioMedia.musicId;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = audioMedia.size;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
            codedOutputByteBufferNano.C(53, audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(54, str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                codedOutputByteBufferNano.R(55, str4);
            }
        }
    };
    public static JsonAdapter<AudioMedia> JSON_ADAPTER = new ObjectJsonAdapter<AudioMedia>() { // from class: com.p1.mobile.putong.data.AudioMedia.2
        public Class getDataClass() {
            return AudioMedia.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AudioMedia mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioMedia audioMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = audioMedia.musicId;
            if (str != null) {
                jsonGenerator.writeStringField("musicId", str);
            }
            String str2 = audioMedia.size;
            if (str2 != null) {
                jsonGenerator.writeStringField("size", str2);
            }
            jsonGenerator.writeNumberField("duration", audioMedia.duration);
            String str3 = audioMedia.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = audioMedia.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AudioMedia new_() {
        AudioMedia audioMedia = new AudioMedia();
        audioMedia.nullCheck();
        return audioMedia;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AudioMedia m17717clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
