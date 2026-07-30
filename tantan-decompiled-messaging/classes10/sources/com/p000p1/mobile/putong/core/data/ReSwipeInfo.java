package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.RelationshipStatus;
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
public class ReSwipeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeinfo";

    @ProtobufIndex(index = 4)
    public boolean autoSendMessage;

    @Nullable
    @ProtobufIndex(index = 1)
    public PlatinumPinChat pinChat;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RelationshipStatus status;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double swipedTime;
    public static ProtobufAdapter<ReSwipeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeInfo>() { // from class: com.p1.mobile.putong.core.data.ReSwipeInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReSwipeInfo reSwipeInfo) {
            PlatinumPinChat platinumPinChat = reSwipeInfo.pinChat;
            int iL = platinumPinChat != null ? CodedOutputByteBufferNano.l(1, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER) : 0;
            RelationshipStatus relationshipStatus = reSwipeInfo.status;
            if (relationshipStatus != null) {
                iL += CodedOutputByteBufferNano.l(2, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            int iD = iL + CodedOutputByteBufferNano.d(3, reSwipeInfo.swipedTime) + CodedOutputByteBufferNano.b(4, reSwipeInfo.autoSendMessage);
            ((MessageNano) reSwipeInfo).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReSwipeInfo m15241parse(nb5 nb5Var) throws IOException {
            ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reSwipeInfo.status != null) {
                        break;
                    }
                    reSwipeInfo.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    reSwipeInfo.pinChat = (PlatinumPinChat) nb5Var.l(PlatinumPinChat.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    reSwipeInfo.status = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                } else if (iU == 25) {
                    reSwipeInfo.swipedTime = nb5Var.h();
                } else {
                    if (iU != 32) {
                        if (reSwipeInfo.status != null) {
                            break;
                        }
                        reSwipeInfo.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        return reSwipeInfo;
                    }
                    reSwipeInfo.autoSendMessage = nb5Var.g();
                }
            }
            return reSwipeInfo;
        }

        public void serialize(ReSwipeInfo reSwipeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PlatinumPinChat platinumPinChat = reSwipeInfo.pinChat;
            if (platinumPinChat != null) {
                codedOutputByteBufferNano.K(1, platinumPinChat, PlatinumPinChat.PROTOBUF_ADAPTER);
            }
            RelationshipStatus relationshipStatus = reSwipeInfo.status;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(2, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(3, reSwipeInfo.swipedTime);
            codedOutputByteBufferNano.A(4, reSwipeInfo.autoSendMessage);
        }
    };
    public static JsonAdapter<ReSwipeInfo> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeInfo>() { // from class: com.p1.mobile.putong.core.data.ReSwipeInfo.2
        public Class getDataClass() {
            return ReSwipeInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReSwipeInfo m15242newInstance() {
            return new ReSwipeInfo();
        }

        public boolean parseField(ReSwipeInfo reSwipeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    reSwipeInfo.status = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pinChat":
                    reSwipeInfo.pinChat = (PlatinumPinChat) PlatinumPinChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipedTime":
                    reSwipeInfo.swipedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public void serializeFields(ReSwipeInfo reSwipeInfo, JsonGenerator jsonGenerator) throws IOException {
            if (reSwipeInfo.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeInfo new_() {
        ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
        reSwipeInfo.nullCheck();
        return reSwipeInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReSwipeInfo m15240clone() {
        ReSwipeInfo reSwipeInfo = new ReSwipeInfo();
        reSwipeInfo.status = this.status;
        reSwipeInfo.swipedTime = this.swipedTime;
        PlatinumPinChat platinumPinChat = this.pinChat;
        if (platinumPinChat != null) {
            reSwipeInfo.pinChat = platinumPinChat.m14820clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
