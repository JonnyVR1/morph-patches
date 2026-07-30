package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAuctionInviteInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionInviteInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionInviteInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionInviteInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionInviteInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionInviteInfo newInstance() {
            return new BLiveAuctionInviteInfo();
        }

        public boolean parseField(BLiveAuctionInviteInfo bLiveAuctionInviteInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveAuctionInviteInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveAuctionInviteInfo.type = jsonParser.getValueAsString();
                    return true;
                case "inviteId":
                    bLiveAuctionInviteInfo.inviteId = jsonParser.getValueAsString();
                    return true;
                case "message":
                    bLiveAuctionInviteInfo.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionInviteInfo bLiveAuctionInviteInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuctionInviteInfo.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveAuctionInviteInfo.inviteId;
            if (str2 != null) {
                jsonGenerator.writeStringField("inviteId", str2);
            }
            String str3 = bLiveAuctionInviteInfo.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveAuctionInviteInfo.message;
            if (str4 != null) {
                jsonGenerator.writeStringField("message", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionInviteInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctioninviteinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String inviteId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String message;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    public static BLiveAuctionInviteInfo new_() {
        BLiveAuctionInviteInfo bLiveAuctionInviteInfo = new BLiveAuctionInviteInfo();
        bLiveAuctionInviteInfo.nullCheck();
        return bLiveAuctionInviteInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionInviteInfo mo225055clone() {
        BLiveAuctionInviteInfo bLiveAuctionInviteInfo = new BLiveAuctionInviteInfo();
        bLiveAuctionInviteInfo.type = this.type;
        bLiveAuctionInviteInfo.inviteId = this.inviteId;
        bLiveAuctionInviteInfo.userId = this.userId;
        bLiveAuctionInviteInfo.message = this.message;
        return bLiveAuctionInviteInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionInviteInfo)) {
            return false;
        }
        BLiveAuctionInviteInfo bLiveAuctionInviteInfo = (BLiveAuctionInviteInfo) obj;
        return ValueObject.util_equals(this.type, bLiveAuctionInviteInfo.type) && ValueObject.util_equals(this.inviteId, bLiveAuctionInviteInfo.inviteId) && ValueObject.util_equals(this.userId, bLiveAuctionInviteInfo.userId) && ValueObject.util_equals(this.message, bLiveAuctionInviteInfo.message);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.inviteId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.message;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.inviteId == null) {
            this.inviteId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
