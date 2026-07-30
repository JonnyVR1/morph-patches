package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AudioText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiotext";

    @ProtobufIndex(index = 4)
    public boolean failRetry;

    @NonNull
    @ProtobufIndex(index = 1)
    public String msgId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AudioTextStatus status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String translationResult;
    public static ProtobufAdapter<AudioText> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioText>() { // from class: com.p1.mobile.putong.core.data.AudioText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AudioText audioText) {
            String str = audioText.msgId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            AudioTextStatus audioTextStatus = audioText.status;
            if (audioTextStatus != null) {
                iO += CodedOutputByteBufferNano.h(2, audioTextStatus.ordinal());
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, audioText.failRetry);
            AudioTextStatus audioTextStatus2 = audioText.status;
            if (audioTextStatus2 != null) {
                iB += CodedOutputByteBufferNano.l(5, audioTextStatus2, AudioTextStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) audioText).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AudioText m11661parse(nb5 nb5Var) throws IOException {
            AudioText audioText = new AudioText();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (audioText.status == null && numValueOf != null) {
                        audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 10) {
                    audioText.msgId = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    audioText.translationResult = nb5Var.s();
                } else if (iU == 32) {
                    audioText.failRetry = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (audioText.status == null && numValueOf != null) {
                            audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    audioText.status = (AudioTextStatus) nb5Var.l(AudioTextStatus.PROTOBUF_ADAPTER);
                }
            }
            return audioText;
        }

        public void serialize(AudioText audioText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = audioText.msgId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            AudioTextStatus audioTextStatus = audioText.status;
            if (audioTextStatus != null) {
                codedOutputByteBufferNano.G(2, audioTextStatus.ordinal());
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.A(4, audioText.failRetry);
            AudioTextStatus audioTextStatus2 = audioText.status;
            if (audioTextStatus2 != null) {
                codedOutputByteBufferNano.K(5, audioTextStatus2, AudioTextStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AudioText> JSON_ADAPTER = new ObjectJsonAdapter<AudioText>() { // from class: com.p1.mobile.putong.core.data.AudioText.2
        public Class getDataClass() {
            return AudioText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AudioText m11662newInstance() {
            return new AudioText();
        }

        public boolean parseField(AudioText audioText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "result":
                    audioText.translationResult = jsonParser.getValueAsString();
                    return true;
                case "status":
                    audioText.status = (AudioTextStatus) AudioTextStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(AudioText audioText, JsonGenerator jsonGenerator) throws IOException {
            String str = audioText.msgId;
            if (str != null) {
                jsonGenerator.writeStringField("msgId", str);
            }
            if (audioText.status != null) {
                jsonGenerator.writeFieldName("status");
                AudioTextStatus.JSON_ADAPTER.serialize(audioText.status, jsonGenerator, true);
            }
            String str2 = audioText.translationResult;
            if (str2 != null) {
                jsonGenerator.writeStringField("result", str2);
            }
            jsonGenerator.writeBooleanField("failRetry", audioText.failRetry);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AudioText new_() {
        AudioText audioText = new AudioText();
        audioText.nullCheck();
        return audioText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AudioText m11660clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
