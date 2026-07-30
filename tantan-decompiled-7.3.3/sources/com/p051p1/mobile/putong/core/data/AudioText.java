package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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

/* JADX INFO: loaded from: classes10.dex */
public class AudioText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiotext";

    @ProtobufIndex(index = 4)
    public boolean failRetry;

    @NonNull
    @ProtobufIndex(index = 1)
    public String msgId;

    @NonNull
    @ProtobufIndex(index = 2)
    public AudioTextStatus status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String translationResult;
    public static ProtobufAdapter<AudioText> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioText>() { // from class: com.p1.mobile.putong.core.data.AudioText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AudioText audioText) {
            String str = audioText.msgId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            AudioTextStatus audioTextStatus = audioText.status;
            if (audioTextStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, audioTextStatus.ordinal());
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, audioText.failRetry);
            AudioTextStatus audioTextStatus2 = audioText.status;
            if (audioTextStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(5, audioTextStatus2, AudioTextStatus.PROTOBUF_ADAPTER);
            }
            audioText.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AudioText parse(nc5 nc5Var) throws IOException {
            AudioText audioText = new AudioText();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (audioText.status == null && numValueOf != null) {
                        audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (audioText.msgId == null) {
                        audioText.msgId = "";
                    }
                    if (audioText.status == null) {
                        audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (audioText.translationResult != null) {
                        break;
                    }
                    audioText.translationResult = "";
                    break;
                }
                if (iM162497u == 10) {
                    audioText.msgId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    audioText.translationResult = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    audioText.failRetry = nc5Var.m162483g();
                } else {
                    if (iM162497u != 42) {
                        if (audioText.status == null && numValueOf != null) {
                            audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (audioText.msgId == null) {
                            audioText.msgId = "";
                        }
                        if (audioText.status == null) {
                            audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (audioText.translationResult != null) {
                            break;
                        }
                        audioText.translationResult = "";
                        return audioText;
                    }
                    audioText.status = (AudioTextStatus) nc5Var.m162488l(AudioTextStatus.PROTOBUF_ADAPTER);
                }
            }
            return audioText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AudioText audioText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = audioText.msgId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            AudioTextStatus audioTextStatus = audioText.status;
            if (audioTextStatus != null) {
                codedOutputByteBufferNano.m17305G(2, audioTextStatus.ordinal());
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, audioText.failRetry);
            AudioTextStatus audioTextStatus2 = audioText.status;
            if (audioTextStatus2 != null) {
                codedOutputByteBufferNano.m17309K(5, audioTextStatus2, AudioTextStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AudioText> JSON_ADAPTER = new ObjectJsonAdapter<AudioText>() { // from class: com.p1.mobile.putong.core.data.AudioText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AudioText.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AudioText newInstance() {
            return new AudioText();
        }

        public boolean parseField(AudioText audioText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "result":
                    audioText.translationResult = jsonParser.getValueAsString();
                    return true;
                case "status":
                    audioText.status = AudioTextStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "failRetry":
                    audioText.failRetry = jsonParser.getValueAsBoolean();
                    return true;
                case "msgId":
                    audioText.msgId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AudioText audioText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "result":
                case "status":
                case "failRetry":
                case "msgId":
                    return true;
                default:
                    return super.parseFieldCheck(audioText, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioText audioText, JsonGenerator jsonGenerator) throws IOException {
            String str = audioText.msgId;
            if (str != null) {
                jsonGenerator.writeStringField("msgId", str);
            }
            if (audioText.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                AudioTextStatus.JSON_ADAPTER.serialize(audioText.status, jsonGenerator, true);
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                jsonGenerator.writeStringField(LovePlanetStage.result, str2);
            }
            jsonGenerator.writeBooleanField("failRetry", audioText.failRetry);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AudioText new_() {
        AudioText audioText = new AudioText();
        audioText.nullCheck();
        return audioText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AudioText mo225055clone() {
        AudioText audioText = new AudioText();
        audioText.msgId = this.msgId;
        audioText.status = this.status;
        audioText.translationResult = this.translationResult;
        audioText.failRetry = this.failRetry;
        return audioText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioText)) {
            return false;
        }
        AudioText audioText = (AudioText) obj;
        return ValueObject.util_equals(this.msgId, audioText.msgId) && ValueObject.util_equals(this.status, audioText.status) && ValueObject.util_equals(this.translationResult, audioText.translationResult) && this.failRetry == audioText.failRetry;
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
        String str = this.msgId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        AudioTextStatus audioTextStatus = this.status;
        int iHashCode2 = (iHashCode + (audioTextStatus != null ? audioTextStatus.hashCode() : 0)) * 41;
        String str2 = this.translationResult;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.failRetry ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.msgId == null) {
            this.msgId = "";
        }
        if (this.status == null) {
            this.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.translationResult == null) {
            this.translationResult = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
