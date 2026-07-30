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
public class BLiveMyCardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMyCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMyCardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMyCardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMyCardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMyCardInfo newInstance() {
            return new BLiveMyCardInfo();
        }

        public boolean parseField(BLiveMyCardInfo bLiveMyCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardType":
                    bLiveMyCardInfo.cardType = jsonParser.getValueAsString();
                    return true;
                case "url":
                    bLiveMyCardInfo.url = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveMyCardInfo.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveMyCardInfo.name = jsonParser.getValueAsString();
                    return true;
                case "nums":
                    bLiveMyCardInfo.nums = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMyCardInfo bLiveMyCardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMyCardInfo.cardType;
            if (str != null) {
                jsonGenerator.writeStringField("cardType", str);
            }
            String str2 = bLiveMyCardInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("nums", bLiveMyCardInfo.nums);
            String str3 = bLiveMyCardInfo.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveMyCardInfo.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMyCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemycardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cardType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 3)
    public int nums;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    public static BLiveMyCardInfo new_() {
        BLiveMyCardInfo bLiveMyCardInfo = new BLiveMyCardInfo();
        bLiveMyCardInfo.nullCheck();
        return bLiveMyCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMyCardInfo mo225055clone() {
        BLiveMyCardInfo bLiveMyCardInfo = new BLiveMyCardInfo();
        bLiveMyCardInfo.cardType = this.cardType;
        bLiveMyCardInfo.name = this.name;
        bLiveMyCardInfo.nums = this.nums;
        bLiveMyCardInfo.icon = this.icon;
        bLiveMyCardInfo.url = this.url;
        return bLiveMyCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMyCardInfo)) {
            return false;
        }
        BLiveMyCardInfo bLiveMyCardInfo = (BLiveMyCardInfo) obj;
        return ValueObject.util_equals(this.cardType, bLiveMyCardInfo.cardType) && ValueObject.util_equals(this.name, bLiveMyCardInfo.name) && this.nums == bLiveMyCardInfo.nums && ValueObject.util_equals(this.icon, bLiveMyCardInfo.icon) && ValueObject.util_equals(this.url, bLiveMyCardInfo.url);
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
        String str = this.cardType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.nums) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardType == null) {
            this.cardType = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
