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
public class AudioSignature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiosignature";

    @ProtobufIndex(index = 1)
    public float duration;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mediaType;

    @NonNull
    @ProtobufIndex(index = 4)
    public MediaLocalStatus status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<AudioSignature> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioSignature>() { // from class: com.p1.mobile.putong.data.AudioSignature.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AudioSignature audioSignature) {
            int iF = CodedOutputByteBufferNano.f(1, audioSignature.duration);
            String str = audioSignature.mediaType;
            if (str != null) {
                iF += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = audioSignature.url;
            if (str2 != null) {
                iF += CodedOutputByteBufferNano.o(3, str2);
            }
            MediaLocalStatus mediaLocalStatus = audioSignature.status;
            if (mediaLocalStatus != null) {
                iF += CodedOutputByteBufferNano.h(4, mediaLocalStatus.ordinal());
            }
            MediaLocalStatus mediaLocalStatus2 = audioSignature.status;
            if (mediaLocalStatus2 != null) {
                iF += CodedOutputByteBufferNano.l(5, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) audioSignature).cachedSize = iF;
            return iF;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AudioSignature m17721parse(nb5 nb5Var) throws IOException {
            AudioSignature audioSignature = new AudioSignature();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (audioSignature.status == null && numValueOf != null) {
                        audioSignature.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (audioSignature.mediaType == null) {
                        audioSignature.mediaType = "";
                    }
                    if (audioSignature.url == null) {
                        audioSignature.url = "";
                    }
                    if (audioSignature.status != null) {
                        break;
                    }
                    audioSignature.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 13) {
                    audioSignature.duration = nb5Var.i();
                } else if (iU == 18) {
                    audioSignature.mediaType = nb5Var.s();
                } else if (iU == 26) {
                    audioSignature.url = nb5Var.s();
                } else if (iU == 32) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 42) {
                        if (audioSignature.status == null && numValueOf != null) {
                            audioSignature.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (audioSignature.mediaType == null) {
                            audioSignature.mediaType = "";
                        }
                        if (audioSignature.url == null) {
                            audioSignature.url = "";
                        }
                        if (audioSignature.status != null) {
                            break;
                        }
                        audioSignature.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        return audioSignature;
                    }
                    audioSignature.status = (MediaLocalStatus) nb5Var.l(MediaLocalStatus.PROTOBUF_ADAPTER);
                }
            }
            return audioSignature;
        }

        public void serialize(AudioSignature audioSignature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.E(1, audioSignature.duration);
            String str = audioSignature.mediaType;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = audioSignature.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            MediaLocalStatus mediaLocalStatus = audioSignature.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.G(4, mediaLocalStatus.ordinal());
            }
            MediaLocalStatus mediaLocalStatus2 = audioSignature.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.K(5, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AudioSignature> JSON_ADAPTER = new ObjectJsonAdapter<AudioSignature>() { // from class: com.p1.mobile.putong.data.AudioSignature.2
        public Class getDataClass() {
            return AudioSignature.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AudioSignature mo17830newInstance() {
            return new AudioSignature();
        }

        public boolean parseField(AudioSignature audioSignature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    audioSignature.duration = (float) jsonParser.getValueAsDouble();
                    return true;
                case "url":
                    audioSignature.url = jsonParser.getValueAsString();
                    return true;
                case "mediaType":
                    audioSignature.mediaType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AudioSignature audioSignature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(audioSignature, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioSignature audioSignature, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("duration", audioSignature.duration);
            String str = audioSignature.mediaType;
            if (str != null) {
                jsonGenerator.writeStringField("mediaType", str);
            }
            String str2 = audioSignature.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioSignature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioSignature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AudioSignature new_() {
        AudioSignature audioSignature = new AudioSignature();
        audioSignature.nullCheck();
        return audioSignature;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AudioSignature m17720clone() {
        AudioSignature audioSignature = new AudioSignature();
        audioSignature.duration = this.duration;
        audioSignature.mediaType = this.mediaType;
        audioSignature.url = this.url;
        audioSignature.status = this.status;
        return audioSignature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSignature)) {
            return false;
        }
        AudioSignature audioSignature = (AudioSignature) obj;
        return this.duration == audioSignature.duration && ValueObject.util_equals(this.mediaType, audioSignature.mediaType) && ValueObject.util_equals(this.url, audioSignature.url) && ValueObject.util_equals(this.status, audioSignature.status);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = ((i * 41) + Float.floatToIntBits(this.duration)) * 41;
        String str = this.mediaType;
        int iHashCode = (iFloatToIntBits + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        MediaLocalStatus mediaLocalStatus = this.status;
        int iHashCode3 = iHashCode2 + (mediaLocalStatus != null ? mediaLocalStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.status == null) {
            this.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
