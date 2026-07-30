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
public class BLiveGiftShowcaseItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftShowcaseItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftShowcaseItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftShowcaseItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftShowcaseItem newInstance() {
            return new BLiveGiftShowcaseItem();
        }

        public boolean parseField(BLiveGiftShowcaseItem bLiveGiftShowcaseItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftExpireTime":
                    bLiveGiftShowcaseItem.giftExpireTime = jsonParser.getValueAsLong();
                    return true;
                case "otherUserId":
                    bLiveGiftShowcaseItem.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveGiftShowcaseItem.userId = jsonParser.getValueAsString();
                    return true;
                case "giftGivenTime":
                    bLiveGiftShowcaseItem.giftGivenTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveGiftShowcaseItem.f44382id = jsonParser.getValueAsString();
                    return false;
                case "giftUrl":
                    bLiveGiftShowcaseItem.giftUrl = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLiveGiftShowcaseItem.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftShowcaseItem bLiveGiftShowcaseItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftShowcaseItem.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveGiftShowcaseItem.otherUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUserId", str2);
            }
            String str3 = bLiveGiftShowcaseItem.giftName;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftName", str3);
            }
            String str4 = bLiveGiftShowcaseItem.giftUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftUrl", str4);
            }
            jsonGenerator.writeNumberField("giftGivenTime", bLiveGiftShowcaseItem.giftGivenTime);
            jsonGenerator.writeNumberField("giftExpireTime", bLiveGiftShowcaseItem.giftExpireTime);
            String str5 = bLiveGiftShowcaseItem.f44382id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftShowcaseItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftshowcaseitem";

    @ProtobufIndex(index = 6)
    public long giftExpireTime;

    @ProtobufIndex(index = 5)
    public long giftGivenTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f44382id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveGiftShowcaseItem new_() {
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = new BLiveGiftShowcaseItem();
        bLiveGiftShowcaseItem.nullCheck();
        return bLiveGiftShowcaseItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftShowcaseItem mo223809clone() {
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = new BLiveGiftShowcaseItem();
        bLiveGiftShowcaseItem.userId = this.userId;
        bLiveGiftShowcaseItem.otherUserId = this.otherUserId;
        bLiveGiftShowcaseItem.giftName = this.giftName;
        bLiveGiftShowcaseItem.giftUrl = this.giftUrl;
        bLiveGiftShowcaseItem.giftGivenTime = this.giftGivenTime;
        bLiveGiftShowcaseItem.giftExpireTime = this.giftExpireTime;
        bLiveGiftShowcaseItem.f44382id = this.f44382id;
        return bLiveGiftShowcaseItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftShowcaseItem)) {
            return false;
        }
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = (BLiveGiftShowcaseItem) obj;
        return ValueObject.util_equals(this.userId, bLiveGiftShowcaseItem.userId) && ValueObject.util_equals(this.otherUserId, bLiveGiftShowcaseItem.otherUserId) && ValueObject.util_equals(this.giftName, bLiveGiftShowcaseItem.giftName) && ValueObject.util_equals(this.giftUrl, bLiveGiftShowcaseItem.giftUrl) && this.giftGivenTime == bLiveGiftShowcaseItem.giftGivenTime && this.giftExpireTime == bLiveGiftShowcaseItem.giftExpireTime && ValueObject.util_equals(this.f44382id, bLiveGiftShowcaseItem.f44382id);
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
        String str3 = this.giftName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftUrl;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.giftGivenTime;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.giftExpireTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str5 = this.f44382id;
        int iHashCode5 = i4 + (str5 != null ? str5.hashCode() : 0);
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
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftUrl == null) {
            this.giftUrl = "";
        }
        if (this.f44382id == null) {
            this.f44382id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
