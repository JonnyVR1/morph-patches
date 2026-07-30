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
public class AiChatMessageExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatmessageextrainfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public AIMessageFeedback feedback;

    @NonNull
    @ProtobufIndex(index = 4)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String scene;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AIMessageStatus status;
    public static ProtobufAdapter<AiChatMessageExtraInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiChatMessageExtraInfo>() { // from class: com.p1.mobile.putong.core.data.AiChatMessageExtraInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiChatMessageExtraInfo aiChatMessageExtraInfo) {
            String str = aiChatMessageExtraInfo.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            AIMessageStatus aIMessageStatus = aiChatMessageExtraInfo.status;
            if (aIMessageStatus != null) {
                iO += CodedOutputByteBufferNano.l(2, aIMessageStatus, AIMessageStatus.PROTOBUF_ADAPTER);
            }
            AIMessageFeedback aIMessageFeedback = aiChatMessageExtraInfo.feedback;
            if (aIMessageFeedback != null) {
                iO += CodedOutputByteBufferNano.l(3, aIMessageFeedback, AIMessageFeedback.PROTOBUF_ADAPTER);
            }
            String str2 = aiChatMessageExtraInfo.response_uuid;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = aiChatMessageExtraInfo.scene;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) aiChatMessageExtraInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiChatMessageExtraInfo m11597parse(nb5 nb5Var) throws IOException {
            AiChatMessageExtraInfo aiChatMessageExtraInfo = new AiChatMessageExtraInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    aiChatMessageExtraInfo.content = nb5Var.s();
                } else if (iU == 18) {
                    aiChatMessageExtraInfo.status = (AIMessageStatus) nb5Var.l(AIMessageStatus.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    aiChatMessageExtraInfo.feedback = (AIMessageFeedback) nb5Var.l(AIMessageFeedback.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    aiChatMessageExtraInfo.response_uuid = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    aiChatMessageExtraInfo.scene = nb5Var.s();
                }
            }
            return aiChatMessageExtraInfo;
        }

        public void serialize(AiChatMessageExtraInfo aiChatMessageExtraInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiChatMessageExtraInfo.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            AIMessageStatus aIMessageStatus = aiChatMessageExtraInfo.status;
            if (aIMessageStatus != null) {
                codedOutputByteBufferNano.K(2, aIMessageStatus, AIMessageStatus.PROTOBUF_ADAPTER);
            }
            AIMessageFeedback aIMessageFeedback = aiChatMessageExtraInfo.feedback;
            if (aIMessageFeedback != null) {
                codedOutputByteBufferNano.K(3, aIMessageFeedback, AIMessageFeedback.PROTOBUF_ADAPTER);
            }
            String str2 = aiChatMessageExtraInfo.response_uuid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = aiChatMessageExtraInfo.scene;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<AiChatMessageExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<AiChatMessageExtraInfo>() { // from class: com.p1.mobile.putong.core.data.AiChatMessageExtraInfo.2
        public Class getDataClass() {
            return AiChatMessageExtraInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiChatMessageExtraInfo m11598newInstance() {
            return new AiChatMessageExtraInfo();
        }

        public boolean parseField(AiChatMessageExtraInfo aiChatMessageExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    aiChatMessageExtraInfo.status = (AIMessageStatus) AIMessageStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "feedback":
                    aiChatMessageExtraInfo.feedback = (AIMessageFeedback) AIMessageFeedback.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(AiChatMessageExtraInfo aiChatMessageExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = aiChatMessageExtraInfo.content;
            if (str != null) {
                jsonGenerator.writeStringField(Content.TYPE, str);
            }
            if (aiChatMessageExtraInfo.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiChatMessageExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiChatMessageExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiChatMessageExtraInfo new_() {
        AiChatMessageExtraInfo aiChatMessageExtraInfo = new AiChatMessageExtraInfo();
        aiChatMessageExtraInfo.nullCheck();
        return aiChatMessageExtraInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiChatMessageExtraInfo m11596clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
