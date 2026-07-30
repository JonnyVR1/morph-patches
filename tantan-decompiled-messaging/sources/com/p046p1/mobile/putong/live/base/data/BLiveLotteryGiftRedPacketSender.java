package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveLotteryGiftRedPacketSender extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLotteryGiftRedPacketSender> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLotteryGiftRedPacketSender>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLotteryGiftRedPacketSender.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLotteryGiftRedPacketSender.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLotteryGiftRedPacketSender newInstance() {
            return new BLiveLotteryGiftRedPacketSender();
        }

        public boolean parseField(BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveLotteryGiftRedPacketSender.userId = jsonParser.getValueAsString();
                    return true;
                case "avatarUrl":
                    bLiveLotteryGiftRedPacketSender.avatarUrl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveLotteryGiftRedPacketSender.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLotteryGiftRedPacketSender.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveLotteryGiftRedPacketSender.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveLotteryGiftRedPacketSender.avatarUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatarUrl", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLotteryGiftRedPacketSender) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelotterygiftredpacketsender";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatarUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveLotteryGiftRedPacketSender new_() {
        BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = new BLiveLotteryGiftRedPacketSender();
        bLiveLotteryGiftRedPacketSender.nullCheck();
        return bLiveLotteryGiftRedPacketSender;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLotteryGiftRedPacketSender mo223809clone() {
        BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = new BLiveLotteryGiftRedPacketSender();
        bLiveLotteryGiftRedPacketSender.userId = this.userId;
        bLiveLotteryGiftRedPacketSender.name = this.name;
        bLiveLotteryGiftRedPacketSender.avatarUrl = this.avatarUrl;
        return bLiveLotteryGiftRedPacketSender;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLotteryGiftRedPacketSender)) {
            return false;
        }
        BLiveLotteryGiftRedPacketSender bLiveLotteryGiftRedPacketSender = (BLiveLotteryGiftRedPacketSender) obj;
        return ValueObject.util_equals(this.userId, bLiveLotteryGiftRedPacketSender.userId) && ValueObject.util_equals(this.name, bLiveLotteryGiftRedPacketSender.name) && ValueObject.util_equals(this.avatarUrl, bLiveLotteryGiftRedPacketSender.avatarUrl);
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
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatarUrl;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatarUrl == null) {
            this.avatarUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
