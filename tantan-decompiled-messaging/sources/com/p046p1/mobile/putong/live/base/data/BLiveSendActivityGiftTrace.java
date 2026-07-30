package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSendActivityGiftTrace extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendActivityGiftTrace> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendActivityGiftTrace>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendActivityGiftTrace.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendActivityGiftTrace newInstance() {
            return new BLiveSendActivityGiftTrace();
        }

        public boolean parseField(BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "toUserId":
                    bLiveSendActivityGiftTrace.toUserId = jsonParser.getValueAsString();
                    return true;
                case "showSendGiftConfirmDialogFlag":
                    bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag = jsonParser.getValueAsBoolean();
                    return true;
                case "giftId":
                    bLiveSendActivityGiftTrace.giftId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveSendActivityGiftTrace.userId = jsonParser.getValueAsString();
                    return true;
                case "fromTag":
                    bLiveSendActivityGiftTrace.fromTag = jsonParser.getValueAsString();
                    return true;
                case "traceActivityName":
                    bLiveSendActivityGiftTrace.traceActivityName = jsonParser.getValueAsString();
                    return true;
                case "traceModule":
                    bLiveSendActivityGiftTrace.traceModule = jsonParser.getValueAsString();
                    return true;
                case "giftCount":
                    bLiveSendActivityGiftTrace.giftCount = jsonParser.getValueAsInt();
                    return true;
                case "showSendGiftFirstConfirmDialogFlag":
                    bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendActivityGiftTrace.giftId;
            if (str != null) {
                jsonGenerator.writeStringField("giftId", str);
            }
            String str2 = bLiveSendActivityGiftTrace.traceActivityName;
            if (str2 != null) {
                jsonGenerator.writeStringField("traceActivityName", str2);
            }
            String str3 = bLiveSendActivityGiftTrace.traceModule;
            if (str3 != null) {
                jsonGenerator.writeStringField("traceModule", str3);
            }
            jsonGenerator.writeNumberField("giftCount", bLiveSendActivityGiftTrace.giftCount);
            jsonGenerator.writeBooleanField("showSendGiftConfirmDialogFlag", bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag);
            String str4 = bLiveSendActivityGiftTrace.userId;
            if (str4 != null) {
                jsonGenerator.writeStringField("userId", str4);
            }
            String str5 = bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag;
            if (str5 != null) {
                jsonGenerator.writeStringField("showSendGiftFirstConfirmDialogFlag", str5);
            }
            String str6 = bLiveSendActivityGiftTrace.toUserId;
            if (str6 != null) {
                jsonGenerator.writeStringField("toUserId", str6);
            }
            String str7 = bLiveSendActivityGiftTrace.fromTag;
            if (str7 != null) {
                jsonGenerator.writeStringField("fromTag", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendActivityGiftTrace) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendactivitygifttrace";

    @NonNull
    @ProtobufIndex(index = 9)
    public String fromTag;

    @ProtobufIndex(index = 4)
    public int giftCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftId;

    @ProtobufIndex(index = 5)
    public boolean showSendGiftConfirmDialogFlag;

    @NonNull
    @ProtobufIndex(index = 7)
    public String showSendGiftFirstConfirmDialogFlag;

    @NonNull
    @ProtobufIndex(index = 8)
    public String toUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String traceActivityName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String traceModule;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userId;

    public static BLiveSendActivityGiftTrace new_() {
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = new BLiveSendActivityGiftTrace();
        bLiveSendActivityGiftTrace.nullCheck();
        return bLiveSendActivityGiftTrace;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendActivityGiftTrace mo223809clone() {
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = new BLiveSendActivityGiftTrace();
        bLiveSendActivityGiftTrace.giftId = this.giftId;
        bLiveSendActivityGiftTrace.traceActivityName = this.traceActivityName;
        bLiveSendActivityGiftTrace.traceModule = this.traceModule;
        bLiveSendActivityGiftTrace.giftCount = this.giftCount;
        bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag = this.showSendGiftConfirmDialogFlag;
        bLiveSendActivityGiftTrace.userId = this.userId;
        bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag = this.showSendGiftFirstConfirmDialogFlag;
        bLiveSendActivityGiftTrace.toUserId = this.toUserId;
        bLiveSendActivityGiftTrace.fromTag = this.fromTag;
        return bLiveSendActivityGiftTrace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendActivityGiftTrace)) {
            return false;
        }
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTrace = (BLiveSendActivityGiftTrace) obj;
        return ValueObject.util_equals(this.giftId, bLiveSendActivityGiftTrace.giftId) && ValueObject.util_equals(this.traceActivityName, bLiveSendActivityGiftTrace.traceActivityName) && ValueObject.util_equals(this.traceModule, bLiveSendActivityGiftTrace.traceModule) && this.giftCount == bLiveSendActivityGiftTrace.giftCount && this.showSendGiftConfirmDialogFlag == bLiveSendActivityGiftTrace.showSendGiftConfirmDialogFlag && ValueObject.util_equals(this.userId, bLiveSendActivityGiftTrace.userId) && ValueObject.util_equals(this.showSendGiftFirstConfirmDialogFlag, bLiveSendActivityGiftTrace.showSendGiftFirstConfirmDialogFlag) && ValueObject.util_equals(this.toUserId, bLiveSendActivityGiftTrace.toUserId) && ValueObject.util_equals(this.fromTag, bLiveSendActivityGiftTrace.fromTag);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int getRealGiftCount() {
        int i = this.giftCount;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.giftId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.traceActivityName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.traceModule;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.giftCount) * 41) + (this.showSendGiftConfirmDialogFlag ? 1231 : 1237)) * 41;
        String str4 = this.userId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.showSendGiftFirstConfirmDialogFlag;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.toUserId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.fromTag;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.traceActivityName == null) {
            this.traceActivityName = "";
        }
        if (this.traceModule == null) {
            this.traceModule = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.showSendGiftFirstConfirmDialogFlag == null) {
            this.showSendGiftFirstConfirmDialogFlag = "";
        }
        if (this.toUserId == null) {
            this.toUserId = "";
        }
        if (this.fromTag == null) {
            this.fromTag = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
