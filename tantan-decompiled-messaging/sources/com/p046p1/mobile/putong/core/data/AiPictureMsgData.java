package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class AiPictureMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipicturemsgdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String momoImgUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskId;
    public static ProtobufAdapter<AiPictureMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureMsgData>() { // from class: com.p1.mobile.putong.core.data.AiPictureMsgData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiPictureMsgData aiPictureMsgData) {
            String str = aiPictureMsgData.taskId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = aiPictureMsgData.momoImgUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            aiPictureMsgData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiPictureMsgData parse(nb5 nb5Var) throws IOException {
            AiPictureMsgData aiPictureMsgData = new AiPictureMsgData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiPictureMsgData.taskId == null) {
                        aiPictureMsgData.taskId = "";
                    }
                    if (aiPictureMsgData.momoImgUrl != null) {
                        break;
                    }
                    aiPictureMsgData.momoImgUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    aiPictureMsgData.taskId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (aiPictureMsgData.taskId == null) {
                            aiPictureMsgData.taskId = "";
                        }
                        if (aiPictureMsgData.momoImgUrl != null) {
                            break;
                        }
                        aiPictureMsgData.momoImgUrl = "";
                        return aiPictureMsgData;
                    }
                    aiPictureMsgData.momoImgUrl = nb5Var.m158750s();
                }
            }
            return aiPictureMsgData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiPictureMsgData aiPictureMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiPictureMsgData.taskId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = aiPictureMsgData.momoImgUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<AiPictureMsgData> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureMsgData>() { // from class: com.p1.mobile.putong.core.data.AiPictureMsgData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiPictureMsgData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiPictureMsgData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureMsgData new_() {
        AiPictureMsgData aiPictureMsgData = new AiPictureMsgData();
        aiPictureMsgData.nullCheck();
        return aiPictureMsgData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiPictureMsgData mo223809clone() {
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
        String str = this.taskId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momoImgUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskId == null) {
            this.taskId = "";
        }
        if (this.momoImgUrl == null) {
            this.momoImgUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
