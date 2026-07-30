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
public class AiAlbumStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aialbumstatusdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String albumId;

    @ProtobufIndex(index = 7)
    public int availableTimes;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public AiAlbumCheckingData checking;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public AiAlbumFinishedData finished;

    @NonNull
    @ProtobufIndex(index = 4)
    public AiAlbumProcessingData processing;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String templateId;
    public static ProtobufAdapter<AiAlbumStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiAlbumStatusData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiAlbumStatusData aiAlbumStatusData) {
            String str = aiAlbumStatusData.albumId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = aiAlbumStatusData.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumStatusData.checking;
            if (aiAlbumCheckingData != null) {
                iO += CodedOutputByteBufferNano.l(3, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
            AiAlbumProcessingData aiAlbumProcessingData = aiAlbumStatusData.processing;
            if (aiAlbumProcessingData != null) {
                iO += CodedOutputByteBufferNano.l(4, aiAlbumProcessingData, AiAlbumProcessingData.PROTOBUF_ADAPTER);
            }
            AiAlbumFinishedData aiAlbumFinishedData = aiAlbumStatusData.finished;
            if (aiAlbumFinishedData != null) {
                iO += CodedOutputByteBufferNano.l(5, aiAlbumFinishedData, AiAlbumFinishedData.PROTOBUF_ADAPTER);
            }
            String str3 = aiAlbumStatusData.templateId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(6, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(7, aiAlbumStatusData.availableTimes);
            ((MessageNano) aiAlbumStatusData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiAlbumStatusData m11577parse(nb5 nb5Var) throws IOException {
            AiAlbumStatusData aiAlbumStatusData = new AiAlbumStatusData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiAlbumStatusData.albumId == null) {
                        aiAlbumStatusData.albumId = "";
                    }
                    if (aiAlbumStatusData.status == null) {
                        aiAlbumStatusData.status = "";
                    }
                    if (aiAlbumStatusData.checking == null) {
                        aiAlbumStatusData.checking = AiAlbumCheckingData.new_();
                    }
                    if (aiAlbumStatusData.processing == null) {
                        aiAlbumStatusData.processing = AiAlbumProcessingData.new_();
                    }
                    if (aiAlbumStatusData.finished == null) {
                        aiAlbumStatusData.finished = AiAlbumFinishedData.new_();
                    }
                    if (aiAlbumStatusData.templateId != null) {
                        break;
                    }
                    aiAlbumStatusData.templateId = "";
                    break;
                }
                if (iU == 10) {
                    aiAlbumStatusData.albumId = nb5Var.s();
                } else if (iU == 18) {
                    aiAlbumStatusData.status = nb5Var.s();
                } else if (iU == 26) {
                    aiAlbumStatusData.checking = (AiAlbumCheckingData) nb5Var.l(AiAlbumCheckingData.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    aiAlbumStatusData.processing = (AiAlbumProcessingData) nb5Var.l(AiAlbumProcessingData.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    aiAlbumStatusData.finished = (AiAlbumFinishedData) nb5Var.l(AiAlbumFinishedData.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    aiAlbumStatusData.templateId = nb5Var.s();
                } else {
                    if (iU != 56) {
                        if (aiAlbumStatusData.albumId == null) {
                            aiAlbumStatusData.albumId = "";
                        }
                        if (aiAlbumStatusData.status == null) {
                            aiAlbumStatusData.status = "";
                        }
                        if (aiAlbumStatusData.checking == null) {
                            aiAlbumStatusData.checking = AiAlbumCheckingData.new_();
                        }
                        if (aiAlbumStatusData.processing == null) {
                            aiAlbumStatusData.processing = AiAlbumProcessingData.new_();
                        }
                        if (aiAlbumStatusData.finished == null) {
                            aiAlbumStatusData.finished = AiAlbumFinishedData.new_();
                        }
                        if (aiAlbumStatusData.templateId != null) {
                            break;
                        }
                        aiAlbumStatusData.templateId = "";
                        return aiAlbumStatusData;
                    }
                    aiAlbumStatusData.availableTimes = nb5Var.j();
                }
            }
            return aiAlbumStatusData;
        }

        public void serialize(AiAlbumStatusData aiAlbumStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiAlbumStatusData.albumId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = aiAlbumStatusData.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            AiAlbumCheckingData aiAlbumCheckingData = aiAlbumStatusData.checking;
            if (aiAlbumCheckingData != null) {
                codedOutputByteBufferNano.K(3, aiAlbumCheckingData, AiAlbumCheckingData.PROTOBUF_ADAPTER);
            }
            AiAlbumProcessingData aiAlbumProcessingData = aiAlbumStatusData.processing;
            if (aiAlbumProcessingData != null) {
                codedOutputByteBufferNano.K(4, aiAlbumProcessingData, AiAlbumProcessingData.PROTOBUF_ADAPTER);
            }
            AiAlbumFinishedData aiAlbumFinishedData = aiAlbumStatusData.finished;
            if (aiAlbumFinishedData != null) {
                codedOutputByteBufferNano.K(5, aiAlbumFinishedData, AiAlbumFinishedData.PROTOBUF_ADAPTER);
            }
            String str3 = aiAlbumStatusData.templateId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            codedOutputByteBufferNano.G(7, aiAlbumStatusData.availableTimes);
        }
    };
    public static JsonAdapter<AiAlbumStatusData> JSON_ADAPTER = new ObjectJsonAdapter<AiAlbumStatusData>() { // from class: com.p1.mobile.putong.core.data.AiAlbumStatusData.2
        public Class getDataClass() {
            return AiAlbumStatusData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiAlbumStatusData m11578newInstance() {
            return new AiAlbumStatusData();
        }

        public boolean parseField(AiAlbumStatusData aiAlbumStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "availableTimes":
                    aiAlbumStatusData.availableTimes = jsonParser.getValueAsInt();
                    return true;
                case "albumId":
                    aiAlbumStatusData.albumId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    aiAlbumStatusData.status = jsonParser.getValueAsString();
                    return true;
                case "finished":
                    aiAlbumStatusData.finished = (AiAlbumFinishedData) AiAlbumFinishedData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "processing":
                    aiAlbumStatusData.processing = (AiAlbumProcessingData) AiAlbumProcessingData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "templateId":
                    aiAlbumStatusData.templateId = jsonParser.getValueAsString();
                    return true;
                case "checking":
                    aiAlbumStatusData.checking = (AiAlbumCheckingData) AiAlbumCheckingData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AiAlbumStatusData aiAlbumStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "availableTimes":
                case "albumId":
                case "status":
                case "finished":
                case "processing":
                case "templateId":
                case "checking":
                    return true;
                default:
                    return super.parseFieldCheck(aiAlbumStatusData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AiAlbumStatusData aiAlbumStatusData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiAlbumStatusData.albumId;
            if (str != null) {
                jsonGenerator.writeStringField("albumId", str);
            }
            String str2 = aiAlbumStatusData.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
            if (aiAlbumStatusData.checking != null) {
                jsonGenerator.writeFieldName("checking");
                AiAlbumCheckingData.JSON_ADAPTER.serialize(aiAlbumStatusData.checking, jsonGenerator, true);
            }
            if (aiAlbumStatusData.processing != null) {
                jsonGenerator.writeFieldName(PaymentOrderStatus.processing);
                AiAlbumProcessingData.JSON_ADAPTER.serialize(aiAlbumStatusData.processing, jsonGenerator, true);
            }
            if (aiAlbumStatusData.finished != null) {
                jsonGenerator.writeFieldName(VoiceCallStatus.finished);
                AiAlbumFinishedData.JSON_ADAPTER.serialize(aiAlbumStatusData.finished, jsonGenerator, true);
            }
            String str3 = aiAlbumStatusData.templateId;
            if (str3 != null) {
                jsonGenerator.writeStringField("templateId", str3);
            }
            jsonGenerator.writeNumberField("availableTimes", aiAlbumStatusData.availableTimes);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiAlbumStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiAlbumStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiAlbumStatusData new_() {
        AiAlbumStatusData aiAlbumStatusData = new AiAlbumStatusData();
        aiAlbumStatusData.nullCheck();
        return aiAlbumStatusData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiAlbumStatusData m11576clone() {
        AiAlbumStatusData aiAlbumStatusData = new AiAlbumStatusData();
        aiAlbumStatusData.albumId = this.albumId;
        aiAlbumStatusData.status = this.status;
        AiAlbumCheckingData aiAlbumCheckingData = this.checking;
        if (aiAlbumCheckingData != null) {
            aiAlbumStatusData.checking = aiAlbumCheckingData.m11560clone();
        }
        AiAlbumProcessingData aiAlbumProcessingData = this.processing;
        if (aiAlbumProcessingData != null) {
            aiAlbumStatusData.processing = aiAlbumProcessingData.m11568clone();
        }
        AiAlbumFinishedData aiAlbumFinishedData = this.finished;
        if (aiAlbumFinishedData != null) {
            aiAlbumStatusData.finished = aiAlbumFinishedData.m11564clone();
        }
        aiAlbumStatusData.templateId = this.templateId;
        aiAlbumStatusData.availableTimes = this.availableTimes;
        return aiAlbumStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiAlbumStatusData)) {
            return false;
        }
        AiAlbumStatusData aiAlbumStatusData = (AiAlbumStatusData) obj;
        return ValueObject.util_equals(this.albumId, aiAlbumStatusData.albumId) && ValueObject.util_equals(this.status, aiAlbumStatusData.status) && ValueObject.util_equals(this.checking, aiAlbumStatusData.checking) && ValueObject.util_equals(this.processing, aiAlbumStatusData.processing) && ValueObject.util_equals(this.finished, aiAlbumStatusData.finished) && ValueObject.util_equals(this.templateId, aiAlbumStatusData.templateId) && this.availableTimes == aiAlbumStatusData.availableTimes;
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
        String str = this.albumId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        AiAlbumCheckingData aiAlbumCheckingData = this.checking;
        int iHashCode3 = (iHashCode2 + (aiAlbumCheckingData != null ? aiAlbumCheckingData.hashCode() : 0)) * 41;
        AiAlbumProcessingData aiAlbumProcessingData = this.processing;
        int iHashCode4 = (iHashCode3 + (aiAlbumProcessingData != null ? aiAlbumProcessingData.hashCode() : 0)) * 41;
        AiAlbumFinishedData aiAlbumFinishedData = this.finished;
        int iHashCode5 = (iHashCode4 + (aiAlbumFinishedData != null ? aiAlbumFinishedData.hashCode() : 0)) * 41;
        String str3 = this.templateId;
        int iHashCode6 = ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.availableTimes;
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.albumId == null) {
            this.albumId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.checking == null) {
            this.checking = AiAlbumCheckingData.new_();
        }
        if (this.processing == null) {
            this.processing = AiAlbumProcessingData.new_();
        }
        if (this.finished == null) {
            this.finished = AiAlbumFinishedData.new_();
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
