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
public class AiPictureMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipicturemsgdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String momoImgUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskId;
    public static ProtobufAdapter<AiPictureMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureMsgData>() { // from class: com.p1.mobile.putong.core.data.AiPictureMsgData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiPictureMsgData aiPictureMsgData) {
            String str = aiPictureMsgData.taskId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = aiPictureMsgData.momoImgUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) aiPictureMsgData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiPictureMsgData m11617parse(nb5 nb5Var) throws IOException {
            AiPictureMsgData aiPictureMsgData = new AiPictureMsgData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiPictureMsgData.taskId == null) {
                        aiPictureMsgData.taskId = "";
                    }
                    if (aiPictureMsgData.momoImgUrl != null) {
                        break;
                    }
                    aiPictureMsgData.momoImgUrl = "";
                    break;
                }
                if (iU == 10) {
                    aiPictureMsgData.taskId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (aiPictureMsgData.taskId == null) {
                            aiPictureMsgData.taskId = "";
                        }
                        if (aiPictureMsgData.momoImgUrl != null) {
                            break;
                        }
                        aiPictureMsgData.momoImgUrl = "";
                        return aiPictureMsgData;
                    }
                    aiPictureMsgData.momoImgUrl = nb5Var.s();
                }
            }
            return aiPictureMsgData;
        }

        public void serialize(AiPictureMsgData aiPictureMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPictureMsgData.taskId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = aiPictureMsgData.momoImgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AiPictureMsgData> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureMsgData>() { // from class: com.p1.mobile.putong.core.data.AiPictureMsgData.2
        public Class getDataClass() {
            return AiPictureMsgData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiPictureMsgData m11618newInstance() {
            return new AiPictureMsgData();
        }

        public boolean parseField(AiPictureMsgData aiPictureMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("taskId")) {
                aiPictureMsgData.taskId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("momoImgUrl")) {
                return false;
            }
            aiPictureMsgData.momoImgUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiPictureMsgData aiPictureMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("taskId") || str.equals("momoImgUrl")) {
                return true;
            }
            return super.parseFieldCheck(aiPictureMsgData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AiPictureMsgData aiPictureMsgData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiPictureMsgData.taskId;
            if (str != null) {
                jsonGenerator.writeStringField("taskId", str);
            }
            String str2 = aiPictureMsgData.momoImgUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("momoImgUrl", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureMsgData new_() {
        AiPictureMsgData aiPictureMsgData = new AiPictureMsgData();
        aiPictureMsgData.nullCheck();
        return aiPictureMsgData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiPictureMsgData m11616clone() {
        AiPictureMsgData aiPictureMsgData = new AiPictureMsgData();
        aiPictureMsgData.taskId = this.taskId;
        aiPictureMsgData.momoImgUrl = this.momoImgUrl;
        return aiPictureMsgData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiPictureMsgData)) {
            return false;
        }
        AiPictureMsgData aiPictureMsgData = (AiPictureMsgData) obj;
        return ValueObject.util_equals(this.taskId, aiPictureMsgData.taskId) && ValueObject.util_equals(this.momoImgUrl, aiPictureMsgData.momoImgUrl);
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
        String str = this.taskId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momoImgUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.taskId == null) {
            this.taskId = "";
        }
        if (this.momoImgUrl == null) {
            this.momoImgUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
