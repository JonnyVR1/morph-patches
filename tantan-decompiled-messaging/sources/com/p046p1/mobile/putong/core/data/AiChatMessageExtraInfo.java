package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class AiChatMessageExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatmessageextrainfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public AIMessageFeedback feedback;

    @NonNull
    @ProtobufIndex(index = 4)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = 5)
    public String scene;

    @NonNull
    @ProtobufIndex(index = 2)
    public AIMessageStatus status;
    public static ProtobufAdapter<AiChatMessageExtraInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiChatMessageExtraInfo>() { // from class: com.p1.mobile.putong.core.data.AiChatMessageExtraInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiChatMessageExtraInfo aiChatMessageExtraInfo) {
            String str = aiChatMessageExtraInfo.content;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            AIMessageStatus aIMessageStatus = aiChatMessageExtraInfo.status;
            if (aIMessageStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, aIMessageStatus, AIMessageStatus.PROTOBUF_ADAPTER);
            }
            AIMessageFeedback aIMessageFeedback = aiChatMessageExtraInfo.feedback;
            if (aIMessageFeedback != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, aIMessageFeedback, AIMessageFeedback.PROTOBUF_ADAPTER);
            }
            String str2 = aiChatMessageExtraInfo.response_uuid;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = aiChatMessageExtraInfo.scene;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            aiChatMessageExtraInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiChatMessageExtraInfo parse(nb5 nb5Var) throws IOException {
            AiChatMessageExtraInfo aiChatMessageExtraInfo = new AiChatMessageExtraInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aiChatMessageExtraInfo.content == null) {
                        aiChatMessageExtraInfo.content = "";
                    }
                    if (aiChatMessageExtraInfo.status == null) {
                        aiChatMessageExtraInfo.status = (AIMessageStatus) AIMessageStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (aiChatMessageExtraInfo.feedback == null) {
                        aiChatMessageExtraInfo.feedback = (AIMessageFeedback) AIMessageFeedback.JSON_ADAPTER.defaultEnum();
                    }
                    if (aiChatMessageExtraInfo.response_uuid == null) {
                        aiChatMessageExtraInfo.response_uuid = "";
                    }
                    if (aiChatMessageExtraInfo.scene != null) {
                        break;
                    }
                    aiChatMessageExtraInfo.scene = "";
                    break;
                }
                if (iM158752u == 10) {
                    aiChatMessageExtraInfo.content = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    aiChatMessageExtraInfo.status = (AIMessageStatus) nb5Var.m158743l(AIMessageStatus.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    aiChatMessageExtraInfo.feedback = (AIMessageFeedback) nb5Var.m158743l(AIMessageFeedback.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    aiChatMessageExtraInfo.response_uuid = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (aiChatMessageExtraInfo.content == null) {
                            aiChatMessageExtraInfo.content = "";
                        }
                        if (aiChatMessageExtraInfo.status == null) {
                            aiChatMessageExtraInfo.status = (AIMessageStatus) AIMessageStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (aiChatMessageExtraInfo.feedback == null) {
                            aiChatMessageExtraInfo.feedback = (AIMessageFeedback) AIMessageFeedback.JSON_ADAPTER.defaultEnum();
                        }
                        if (aiChatMessageExtraInfo.response_uuid == null) {
                            aiChatMessageExtraInfo.response_uuid = "";
                        }
                        if (aiChatMessageExtraInfo.scene != null) {
                            break;
                        }
                        aiChatMessageExtraInfo.scene = "";
                        return aiChatMessageExtraInfo;
                    }
                    aiChatMessageExtraInfo.scene = nb5Var.m158750s();
                }
            }
            return aiChatMessageExtraInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiChatMessageExtraInfo aiChatMessageExtraInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiChatMessageExtraInfo.content;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            AIMessageStatus aIMessageStatus = aiChatMessageExtraInfo.status;
            if (aIMessageStatus != null) {
                codedOutputByteBufferNano.m17254K(2, aIMessageStatus, AIMessageStatus.PROTOBUF_ADAPTER);
            }
            AIMessageFeedback aIMessageFeedback = aiChatMessageExtraInfo.feedback;
            if (aIMessageFeedback != null) {
                codedOutputByteBufferNano.m17254K(3, aIMessageFeedback, AIMessageFeedback.PROTOBUF_ADAPTER);
            }
            String str2 = aiChatMessageExtraInfo.response_uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = aiChatMessageExtraInfo.scene;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<AiChatMessageExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<AiChatMessageExtraInfo>() { // from class: com.p1.mobile.putong.core.data.AiChatMessageExtraInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiChatMessageExtraInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiChatMessageExtraInfo newInstance() {
            return new AiChatMessageExtraInfo();
        }

        public boolean parseField(AiChatMessageExtraInfo aiChatMessageExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    aiChatMessageExtraInfo.status = AIMessageStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "feedback":
                    aiChatMessageExtraInfo.feedback = AIMessageFeedback.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "scene":
                    aiChatMessageExtraInfo.scene = jsonParser.getValueAsString();
                    return true;
                case "content":
                    aiChatMessageExtraInfo.content = jsonParser.getValueAsString();
                    return true;
                case "response_uuid":
                    aiChatMessageExtraInfo.response_uuid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AiChatMessageExtraInfo aiChatMessageExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "feedback":
                case "scene":
                case "content":
                case "response_uuid":
                    return true;
                default:
                    return super.parseFieldCheck(aiChatMessageExtraInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiChatMessageExtraInfo aiChatMessageExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = aiChatMessageExtraInfo.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            if (aiChatMessageExtraInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                AIMessageStatus.JSON_ADAPTER.serialize(aiChatMessageExtraInfo.status, jsonGenerator, true);
            }
            if (aiChatMessageExtraInfo.feedback != null) {
                jsonGenerator.writeFieldName(MessageType.feedback);
                AIMessageFeedback.JSON_ADAPTER.serialize(aiChatMessageExtraInfo.feedback, jsonGenerator, true);
            }
            String str2 = aiChatMessageExtraInfo.response_uuid;
            if (str2 != null) {
                jsonGenerator.writeStringField("response_uuid", str2);
            }
            String str3 = aiChatMessageExtraInfo.scene;
            if (str3 != null) {
                jsonGenerator.writeStringField("scene", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiChatMessageExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiChatMessageExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiChatMessageExtraInfo new_() {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = new AiChatMessageExtraInfo();
        aiChatMessageExtraInfo.nullCheck();
        return aiChatMessageExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiChatMessageExtraInfo mo223809clone() {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = new AiChatMessageExtraInfo();
        aiChatMessageExtraInfo.content = this.content;
        aiChatMessageExtraInfo.status = this.status;
        aiChatMessageExtraInfo.feedback = this.feedback;
        aiChatMessageExtraInfo.response_uuid = this.response_uuid;
        aiChatMessageExtraInfo.scene = this.scene;
        return aiChatMessageExtraInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiChatMessageExtraInfo)) {
            return false;
        }
        AiChatMessageExtraInfo aiChatMessageExtraInfo = (AiChatMessageExtraInfo) obj;
        return ValueObject.util_equals(this.content, aiChatMessageExtraInfo.content) && ValueObject.util_equals(this.status, aiChatMessageExtraInfo.status) && ValueObject.util_equals(this.feedback, aiChatMessageExtraInfo.feedback) && ValueObject.util_equals(this.response_uuid, aiChatMessageExtraInfo.response_uuid) && ValueObject.util_equals(this.scene, aiChatMessageExtraInfo.scene);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        AIMessageStatus aIMessageStatus = this.status;
        int iHashCode2 = (iHashCode + (aIMessageStatus != null ? aIMessageStatus.hashCode() : 0)) * 41;
        AIMessageFeedback aIMessageFeedback = this.feedback;
        int iHashCode3 = (iHashCode2 + (aIMessageFeedback != null ? aIMessageFeedback.hashCode() : 0)) * 41;
        String str2 = this.response_uuid;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.scene;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.status == null) {
            this.status = (AIMessageStatus) AIMessageStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.feedback == null) {
            this.feedback = (AIMessageFeedback) AIMessageFeedback.JSON_ADAPTER.defaultEnum();
        }
        if (this.response_uuid == null) {
            this.response_uuid = "";
        }
        if (this.scene == null) {
            this.scene = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
