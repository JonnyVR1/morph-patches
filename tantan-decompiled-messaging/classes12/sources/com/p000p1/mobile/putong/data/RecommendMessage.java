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
public class RecommendMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recommendmessage";

    @NonNull
    @ProtobufIndex(index = 5)
    public CommonGiftInfo giftInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String messageType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String messageValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<RecommendMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecommendMessage>() { // from class: com.p1.mobile.putong.data.RecommendMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecommendMessage recommendMessage) {
            String str = recommendMessage.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = recommendMessage.otherUserId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = recommendMessage.messageType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = recommendMessage.messageValue;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            CommonGiftInfo commonGiftInfo = recommendMessage.giftInfo;
            if (commonGiftInfo != null) {
                iO += CodedOutputByteBufferNano.l(5, commonGiftInfo, CommonGiftInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) recommendMessage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecommendMessage m18875parse(nb5 nb5Var) throws IOException {
            RecommendMessage recommendMessage = new RecommendMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recommendMessage.userId == null) {
                        recommendMessage.userId = "";
                    }
                    if (recommendMessage.otherUserId == null) {
                        recommendMessage.otherUserId = "";
                    }
                    if (recommendMessage.messageType == null) {
                        recommendMessage.messageType = "";
                    }
                    if (recommendMessage.messageValue == null) {
                        recommendMessage.messageValue = "";
                    }
                    if (recommendMessage.giftInfo != null) {
                        break;
                    }
                    recommendMessage.giftInfo = CommonGiftInfo.new_();
                    break;
                }
                if (iU == 10) {
                    recommendMessage.userId = nb5Var.s();
                } else if (iU == 18) {
                    recommendMessage.otherUserId = nb5Var.s();
                } else if (iU == 26) {
                    recommendMessage.messageType = nb5Var.s();
                } else if (iU == 34) {
                    recommendMessage.messageValue = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (recommendMessage.userId == null) {
                            recommendMessage.userId = "";
                        }
                        if (recommendMessage.otherUserId == null) {
                            recommendMessage.otherUserId = "";
                        }
                        if (recommendMessage.messageType == null) {
                            recommendMessage.messageType = "";
                        }
                        if (recommendMessage.messageValue == null) {
                            recommendMessage.messageValue = "";
                        }
                        if (recommendMessage.giftInfo != null) {
                            break;
                        }
                        recommendMessage.giftInfo = CommonGiftInfo.new_();
                        return recommendMessage;
                    }
                    recommendMessage.giftInfo = (CommonGiftInfo) nb5Var.l(CommonGiftInfo.PROTOBUF_ADAPTER);
                }
            }
            return recommendMessage;
        }

        public void serialize(RecommendMessage recommendMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommendMessage.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = recommendMessage.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = recommendMessage.messageType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = recommendMessage.messageValue;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            CommonGiftInfo commonGiftInfo = recommendMessage.giftInfo;
            if (commonGiftInfo != null) {
                codedOutputByteBufferNano.K(5, commonGiftInfo, CommonGiftInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecommendMessage> JSON_ADAPTER = new ObjectJsonAdapter<RecommendMessage>() { // from class: com.p1.mobile.putong.data.RecommendMessage.2
        public Class getDataClass() {
            return RecommendMessage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RecommendMessage mo17830newInstance() {
            return new RecommendMessage();
        }

        public boolean parseField(RecommendMessage recommendMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    recommendMessage.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "messageValue":
                    recommendMessage.messageValue = jsonParser.getValueAsString();
                    return true;
                case "messageType":
                    recommendMessage.messageType = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    recommendMessage.userId = jsonParser.getValueAsString();
                    return true;
                case "giftInfo":
                    recommendMessage.giftInfo = (CommonGiftInfo) CommonGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecommendMessage recommendMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "messageValue":
                case "messageType":
                case "userId":
                case "giftInfo":
                    return true;
                default:
                    return super.parseFieldCheck(recommendMessage, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecommendMessage recommendMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = recommendMessage.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = recommendMessage.otherUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUserId", str2);
            }
            String str3 = recommendMessage.messageType;
            if (str3 != null) {
                jsonGenerator.writeStringField("messageType", str3);
            }
            String str4 = recommendMessage.messageValue;
            if (str4 != null) {
                jsonGenerator.writeStringField("messageValue", str4);
            }
            if (recommendMessage.giftInfo != null) {
                jsonGenerator.writeFieldName("giftInfo");
                CommonGiftInfo.JSON_ADAPTER.serialize(recommendMessage.giftInfo, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendMessage new_() {
        RecommendMessage recommendMessage = new RecommendMessage();
        recommendMessage.nullCheck();
        return recommendMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecommendMessage m18874clone() {
        RecommendMessage recommendMessage = new RecommendMessage();
        recommendMessage.userId = this.userId;
        recommendMessage.otherUserId = this.otherUserId;
        recommendMessage.messageType = this.messageType;
        recommendMessage.messageValue = this.messageValue;
        CommonGiftInfo commonGiftInfo = this.giftInfo;
        if (commonGiftInfo != null) {
            recommendMessage.giftInfo = commonGiftInfo.m17832clone();
        }
        return recommendMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecommendMessage)) {
            return false;
        }
        RecommendMessage recommendMessage = (RecommendMessage) obj;
        return ValueObject.util_equals(this.userId, recommendMessage.userId) && ValueObject.util_equals(this.otherUserId, recommendMessage.otherUserId) && ValueObject.util_equals(this.messageType, recommendMessage.messageType) && ValueObject.util_equals(this.messageValue, recommendMessage.messageValue) && ValueObject.util_equals(this.giftInfo, recommendMessage.giftInfo);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.messageType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.messageValue;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        CommonGiftInfo commonGiftInfo = this.giftInfo;
        int iHashCode5 = iHashCode4 + (commonGiftInfo != null ? commonGiftInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.messageType == null) {
            this.messageType = "";
        }
        if (this.messageValue == null) {
            this.messageValue = "";
        }
        if (this.giftInfo == null) {
            this.giftInfo = CommonGiftInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
