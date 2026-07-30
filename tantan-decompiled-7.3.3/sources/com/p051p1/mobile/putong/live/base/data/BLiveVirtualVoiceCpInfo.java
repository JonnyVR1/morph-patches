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
public class BLiveVirtualVoiceCpInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceCpInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceCpInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceCpInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceCpInfo newInstance() {
            return new BLiveVirtualVoiceCpInfo();
        }

        public boolean parseField(BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    bLiveVirtualVoiceCpInfo.otherUser = BLiveVirtualVoiceCpUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meUser":
                    bLiveVirtualVoiceCpInfo.meUser = BLiveVirtualVoiceCpUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "luxuryValue":
                    bLiveVirtualVoiceCpInfo.luxuryValue = jsonParser.getValueAsDouble();
                    return true;
                case "id":
                    bLiveVirtualVoiceCpInfo.f45328id = jsonParser.getValueAsString();
                    return false;
                case "currentHouse":
                    bLiveVirtualVoiceCpInfo.currentHouse = BLiveVirtualVoiceCpHouseInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceCpInfo.f45328id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("luxuryValue", bLiveVirtualVoiceCpInfo.luxuryValue);
            if (bLiveVirtualVoiceCpInfo.currentHouse != null) {
                jsonGenerator.writeFieldName("currentHouse");
                BLiveVirtualVoiceCpHouseInfo.JSON_ADAPTER.serialize(bLiveVirtualVoiceCpInfo.currentHouse, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCpInfo.meUser != null) {
                jsonGenerator.writeFieldName("meUser");
                BLiveVirtualVoiceCpUserInfo.JSON_ADAPTER.serialize(bLiveVirtualVoiceCpInfo.meUser, jsonGenerator, true);
            }
            if (bLiveVirtualVoiceCpInfo.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                BLiveVirtualVoiceCpUserInfo.JSON_ADAPTER.serialize(bLiveVirtualVoiceCpInfo.otherUser, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceCpInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicecpinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVirtualVoiceCpHouseInfo currentHouse;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45328id;

    @ProtobufIndex(index = 2)
    public double luxuryValue;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVirtualVoiceCpUserInfo meUser;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveVirtualVoiceCpUserInfo otherUser;

    public static BLiveVirtualVoiceCpInfo new_() {
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = new BLiveVirtualVoiceCpInfo();
        bLiveVirtualVoiceCpInfo.nullCheck();
        return bLiveVirtualVoiceCpInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceCpInfo mo225055clone() {
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = new BLiveVirtualVoiceCpInfo();
        bLiveVirtualVoiceCpInfo.f45328id = this.f45328id;
        bLiveVirtualVoiceCpInfo.luxuryValue = this.luxuryValue;
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = this.currentHouse;
        if (bLiveVirtualVoiceCpHouseInfo != null) {
            bLiveVirtualVoiceCpInfo.currentHouse = bLiveVirtualVoiceCpHouseInfo.mo225055clone();
        }
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo = this.meUser;
        if (bLiveVirtualVoiceCpUserInfo != null) {
            bLiveVirtualVoiceCpInfo.meUser = bLiveVirtualVoiceCpUserInfo.mo225055clone();
        }
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo2 = this.otherUser;
        if (bLiveVirtualVoiceCpUserInfo2 != null) {
            bLiveVirtualVoiceCpInfo.otherUser = bLiveVirtualVoiceCpUserInfo2.mo225055clone();
        }
        return bLiveVirtualVoiceCpInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceCpInfo)) {
            return false;
        }
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = (BLiveVirtualVoiceCpInfo) obj;
        return ValueObject.util_equals(this.f45328id, bLiveVirtualVoiceCpInfo.f45328id) && this.luxuryValue == bLiveVirtualVoiceCpInfo.luxuryValue && ValueObject.util_equals(this.currentHouse, bLiveVirtualVoiceCpInfo.currentHouse) && ValueObject.util_equals(this.meUser, bLiveVirtualVoiceCpInfo.meUser) && ValueObject.util_equals(this.otherUser, bLiveVirtualVoiceCpInfo.otherUser);
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
        String str = this.f45328id;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.luxuryValue);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = this.currentHouse;
        int iHashCode2 = (i3 + (bLiveVirtualVoiceCpHouseInfo != null ? bLiveVirtualVoiceCpHouseInfo.hashCode() : 0)) * 41;
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo = this.meUser;
        int iHashCode3 = (iHashCode2 + (bLiveVirtualVoiceCpUserInfo != null ? bLiveVirtualVoiceCpUserInfo.hashCode() : 0)) * 41;
        BLiveVirtualVoiceCpUserInfo bLiveVirtualVoiceCpUserInfo2 = this.otherUser;
        int iHashCode4 = iHashCode3 + (bLiveVirtualVoiceCpUserInfo2 != null ? bLiveVirtualVoiceCpUserInfo2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45328id == null) {
            this.f45328id = "";
        }
        if (this.currentHouse == null) {
            this.currentHouse = BLiveVirtualVoiceCpHouseInfo.new_();
        }
        if (this.meUser == null) {
            this.meUser = BLiveVirtualVoiceCpUserInfo.new_();
        }
        if (this.otherUser == null) {
            this.otherUser = BLiveVirtualVoiceCpUserInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
