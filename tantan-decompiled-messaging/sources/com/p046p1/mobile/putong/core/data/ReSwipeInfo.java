package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.RelationshipStatus;
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
public class ReSwipeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeinfo";

    @ProtobufIndex(index = 4)
    public boolean autoSendMessage;

    @Nullable
    @ProtobufIndex(index = 1)
    public PlatinumPinChat pinChat;

    @NonNull
    @ProtobufIndex(index = 2)
    public RelationshipStatus status;

    @ProtobufIndex(index = 3)
    public double swipedTime;
    public static ProtobufAdapter<ReSwipeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeInfo>() { // from class: com.p1.mobile.putong.core.data.ReSwipeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReSwipeInfo reSwipeInfo) {
            PlatinumPinChat platinumPinChat = reSwipeInfo.pinChat;
            int iM17230l = platinumPinChat != null ? CodedOutputByteBufferNano.m17230l(1, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER) : 0;
            RelationshipStatus relationshipStatus = reSwipeInfo.status;
            if (relationshipStatus != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            int iM17222d = iM17230l + CodedOutputByteBufferNano.m17222d(3, reSwipeInfo.swipedTime) + CodedOutputByteBufferNano.m17220b(4, reSwipeInfo.autoSendMessage);
            reSwipeInfo.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReSwipeInfo parse(nb5 nb5Var) throws IOException {
            ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (reSwipeInfo.status != null) {
                        break;
                    }
                    reSwipeInfo.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    reSwipeInfo.pinChat = (PlatinumPinChat) nb5Var.m158743l(PlatinumPinChat.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    reSwipeInfo.status = (RelationshipStatus) nb5Var.m158743l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iM158752u == 25) {
                    reSwipeInfo.swipedTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 32) {
                        if (reSwipeInfo.status != null) {
                            break;
                        }
                        reSwipeInfo.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        return reSwipeInfo;
                    }
                    reSwipeInfo.autoSendMessage = nb5Var.m158738g();
                }
            }
            return reSwipeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReSwipeInfo reSwipeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PlatinumPinChat platinumPinChat = reSwipeInfo.pinChat;
            if (platinumPinChat != null) {
                codedOutputByteBufferNano.m17254K(1, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = reSwipeInfo.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.m17254K(2, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17246C(3, reSwipeInfo.swipedTime);
            codedOutputByteBufferNano.m17244A(4, reSwipeInfo.autoSendMessage);
        }
    };
    public static JsonAdapter<ReSwipeInfo> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeInfo>() { // from class: com.p1.mobile.putong.core.data.ReSwipeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReSwipeInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReSwipeInfo newInstance() {
            return new ReSwipeInfo();
        }

        public boolean parseField(ReSwipeInfo reSwipeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    reSwipeInfo.status = RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pinChat":
                    reSwipeInfo.pinChat = PlatinumPinChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipedTime":
                    reSwipeInfo.swipedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "autoSendMessage":
                    reSwipeInfo.autoSendMessage = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReSwipeInfo reSwipeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "pinChat":
                case "swipedTime":
                case "autoSendMessage":
                    return true;
                default:
                    return super.parseFieldCheck(reSwipeInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReSwipeInfo reSwipeInfo, JsonGenerator jsonGenerator) throws IOException {
            if (reSwipeInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                RelationshipStatus.JSON_ADAPTER.serialize(reSwipeInfo.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("swipedTime");
            Converter.API_TIME.serialize(Double.valueOf(reSwipeInfo.swipedTime), jsonGenerator, true);
            if (reSwipeInfo.pinChat != null) {
                jsonGenerator.writeFieldName(SummarizedPrivilegesId.pinChat);
                PlatinumPinChat.JSON_ADAPTER.serialize(reSwipeInfo.pinChat, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("autoSendMessage", reSwipeInfo.autoSendMessage);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeInfo new_() {
        ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
        reSwipeInfo.nullCheck();
        return reSwipeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReSwipeInfo mo223809clone() {
        ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
        reSwipeInfo.status = this.status;
        reSwipeInfo.swipedTime = this.swipedTime;
        PlatinumPinChat platinumPinChat = this.pinChat;
        if (platinumPinChat != null) {
            reSwipeInfo.pinChat = platinumPinChat.mo223809clone();
        }
        reSwipeInfo.autoSendMessage = this.autoSendMessage;
        return reSwipeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReSwipeInfo)) {
            return false;
        }
        ReSwipeInfo reSwipeInfo = (ReSwipeInfo) obj;
        return ValueObject.util_equals(this.status, reSwipeInfo.status) && this.swipedTime == reSwipeInfo.swipedTime && ValueObject.util_equals(this.pinChat, reSwipeInfo.pinChat) && this.autoSendMessage == reSwipeInfo.autoSendMessage;
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
        RelationshipStatus relationshipStatus = this.status;
        int iHashCode = relationshipStatus != null ? relationshipStatus.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.swipedTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        PlatinumPinChat platinumPinChat = this.pinChat;
        int iHashCode2 = ((i3 + (platinumPinChat != null ? platinumPinChat.hashCode() : 0)) * 41) + (this.autoSendMessage ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
