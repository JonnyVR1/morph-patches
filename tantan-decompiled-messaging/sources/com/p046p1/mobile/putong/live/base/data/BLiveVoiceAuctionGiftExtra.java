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
public class BLiveVoiceAuctionGiftExtra extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceAuctionGiftExtra> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceAuctionGiftExtra>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionGiftExtra.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceAuctionGiftExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceAuctionGiftExtra newInstance() {
            return new BLiveVoiceAuctionGiftExtra();
        }

        public boolean parseField(BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sendGiftForAuction":
                    bLiveVoiceAuctionGiftExtra.sendGiftForAuction = jsonParser.getValueAsBoolean();
                    return true;
                case "hostUserId":
                    bLiveVoiceAuctionGiftExtra.hostUserId = jsonParser.getValueAsString();
                    return true;
                case "auctionId":
                    bLiveVoiceAuctionGiftExtra.auctionId = jsonParser.getValueAsString();
                    return true;
                case "sendGiftForBlessing":
                    bLiveVoiceAuctionGiftExtra.sendGiftForBlessing = jsonParser.getValueAsBoolean();
                    return true;
                case "guestUserId":
                    bLiveVoiceAuctionGiftExtra.guestUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceAuctionGiftExtra.auctionId;
            if (str != null) {
                jsonGenerator.writeStringField("auctionId", str);
            }
            String str2 = bLiveVoiceAuctionGiftExtra.hostUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("hostUserId", str2);
            }
            String str3 = bLiveVoiceAuctionGiftExtra.guestUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("guestUserId", str3);
            }
            jsonGenerator.writeBooleanField("sendGiftForAuction", bLiveVoiceAuctionGiftExtra.sendGiftForAuction);
            jsonGenerator.writeBooleanField("sendGiftForBlessing", bLiveVoiceAuctionGiftExtra.sendGiftForBlessing);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceAuctionGiftExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceauctiongiftextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String auctionId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String guestUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String hostUserId;

    @ProtobufIndex(index = 4)
    public boolean sendGiftForAuction;

    @ProtobufIndex(index = 5)
    public boolean sendGiftForBlessing;

    public static BLiveVoiceAuctionGiftExtra new_() {
        BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra = new BLiveVoiceAuctionGiftExtra();
        bLiveVoiceAuctionGiftExtra.nullCheck();
        return bLiveVoiceAuctionGiftExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceAuctionGiftExtra mo223809clone() {
        BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra = new BLiveVoiceAuctionGiftExtra();
        bLiveVoiceAuctionGiftExtra.auctionId = this.auctionId;
        bLiveVoiceAuctionGiftExtra.hostUserId = this.hostUserId;
        bLiveVoiceAuctionGiftExtra.guestUserId = this.guestUserId;
        bLiveVoiceAuctionGiftExtra.sendGiftForAuction = this.sendGiftForAuction;
        bLiveVoiceAuctionGiftExtra.sendGiftForBlessing = this.sendGiftForBlessing;
        return bLiveVoiceAuctionGiftExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceAuctionGiftExtra)) {
            return false;
        }
        BLiveVoiceAuctionGiftExtra bLiveVoiceAuctionGiftExtra = (BLiveVoiceAuctionGiftExtra) obj;
        return ValueObject.util_equals(this.auctionId, bLiveVoiceAuctionGiftExtra.auctionId) && ValueObject.util_equals(this.hostUserId, bLiveVoiceAuctionGiftExtra.hostUserId) && ValueObject.util_equals(this.guestUserId, bLiveVoiceAuctionGiftExtra.guestUserId) && this.sendGiftForAuction == bLiveVoiceAuctionGiftExtra.sendGiftForAuction && this.sendGiftForBlessing == bLiveVoiceAuctionGiftExtra.sendGiftForBlessing;
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
        String str = this.auctionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.hostUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.guestUserId;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.sendGiftForAuction ? 1231 : 1237)) * 41) + (this.sendGiftForBlessing ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.auctionId == null) {
            this.auctionId = "";
        }
        if (this.hostUserId == null) {
            this.hostUserId = "";
        }
        if (this.guestUserId == null) {
            this.guestUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
