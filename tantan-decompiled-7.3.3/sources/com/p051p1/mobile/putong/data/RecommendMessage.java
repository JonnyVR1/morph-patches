package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecommendMessage recommendMessage) {
            String str = recommendMessage.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = recommendMessage.otherUserId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = recommendMessage.messageType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = recommendMessage.messageValue;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            CommonGiftInfo commonGiftInfo = recommendMessage.giftInfo;
            if (commonGiftInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, commonGiftInfo, CommonGiftInfo.PROTOBUF_ADAPTER);
            }
            recommendMessage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecommendMessage parse(nc5 nc5Var) throws IOException {
            RecommendMessage recommendMessage = new RecommendMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    recommendMessage.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    recommendMessage.otherUserId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    recommendMessage.messageType = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    recommendMessage.messageValue = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
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
                    recommendMessage.giftInfo = (CommonGiftInfo) nc5Var.m162488l(CommonGiftInfo.PROTOBUF_ADAPTER);
                }
            }
            return recommendMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecommendMessage recommendMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recommendMessage.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = recommendMessage.otherUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = recommendMessage.messageType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = recommendMessage.messageValue;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            CommonGiftInfo commonGiftInfo = recommendMessage.giftInfo;
            if (commonGiftInfo != null) {
                codedOutputByteBufferNano.m17309K(5, commonGiftInfo, CommonGiftInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RecommendMessage> JSON_ADAPTER = new ObjectJsonAdapter<RecommendMessage>() { // from class: com.p1.mobile.putong.data.RecommendMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecommendMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecommendMessage newInstance() {
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
                    recommendMessage.giftInfo = CommonGiftInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecommendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecommendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecommendMessage new_() {
        RecommendMessage recommendMessage = new RecommendMessage();
        recommendMessage.nullCheck();
        return recommendMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecommendMessage mo225055clone() {
        RecommendMessage recommendMessage = new RecommendMessage();
        recommendMessage.userId = this.userId;
        recommendMessage.otherUserId = this.otherUserId;
        recommendMessage.messageType = this.messageType;
        recommendMessage.messageValue = this.messageValue;
        CommonGiftInfo commonGiftInfo = this.giftInfo;
        if (commonGiftInfo != null) {
            recommendMessage.giftInfo = commonGiftInfo.mo225055clone();
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
