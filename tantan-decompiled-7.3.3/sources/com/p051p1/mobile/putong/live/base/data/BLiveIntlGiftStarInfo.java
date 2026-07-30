package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveIntlGiftStarInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlGiftStarInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlGiftStarInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlGiftStarInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlGiftStarInfo newInstance() {
            return new BLiveIntlGiftStarInfo();
        }

        public boolean parseField(BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveIntlGiftStarInfo.amount = jsonParser.getValueAsLong();
                    return true;
                case "giftId":
                    bLiveIntlGiftStarInfo.giftId = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveIntlGiftStarInfo.gap = jsonParser.getValueAsLong();
                    return true;
                case "name":
                    bLiveIntlGiftStarInfo.name = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveIntlGiftStarInfo.rank = jsonParser.getValueAsLong();
                    return true;
                case "giftIcon":
                    bLiveIntlGiftStarInfo.giftIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlGiftStarInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveIntlGiftStarInfo.giftId;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftId", str2);
            }
            String str3 = bLiveIntlGiftStarInfo.giftIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftIcon", str3);
            }
            jsonGenerator.writeNumberField("amount", bLiveIntlGiftStarInfo.amount);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveIntlGiftStarInfo.rank);
            jsonGenerator.writeNumberField("gap", bLiveIntlGiftStarInfo.gap);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlGiftStarInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlgiftstarinfo";

    @ProtobufIndex(index = 4)
    public long amount;

    @ProtobufIndex(index = 6)
    public long gap;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftIcon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 5)
    public long rank;

    public static BLiveIntlGiftStarInfo new_() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo = new BLiveIntlGiftStarInfo();
        bLiveIntlGiftStarInfo.nullCheck();
        return bLiveIntlGiftStarInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlGiftStarInfo mo225055clone() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo = new BLiveIntlGiftStarInfo();
        bLiveIntlGiftStarInfo.name = this.name;
        bLiveIntlGiftStarInfo.giftId = this.giftId;
        bLiveIntlGiftStarInfo.giftIcon = this.giftIcon;
        bLiveIntlGiftStarInfo.amount = this.amount;
        bLiveIntlGiftStarInfo.rank = this.rank;
        bLiveIntlGiftStarInfo.gap = this.gap;
        return bLiveIntlGiftStarInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlGiftStarInfo)) {
            return false;
        }
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo = (BLiveIntlGiftStarInfo) obj;
        return ValueObject.util_equals(this.name, bLiveIntlGiftStarInfo.name) && ValueObject.util_equals(this.giftId, bLiveIntlGiftStarInfo.giftId) && ValueObject.util_equals(this.giftIcon, bLiveIntlGiftStarInfo.giftIcon) && this.amount == bLiveIntlGiftStarInfo.amount && this.rank == bLiveIntlGiftStarInfo.rank && this.gap == bLiveIntlGiftStarInfo.gap;
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftIcon;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.amount;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.rank;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.gap;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
