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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserDressUp extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserDressUp> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserDressUp>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserDressUp.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserDressUp.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserDressUp newInstance() {
            return new BLiveUserDressUp();
        }

        public boolean parseField(BLiveUserDressUp bLiveUserDressUp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imageUrl":
                    bLiveUserDressUp.imageUrl = jsonParser.getValueAsString();
                    return true;
                case "jumpInfo":
                    bLiveUserDressUp.jumpInfo = BLiveJumpInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveUserDressUp.f45318id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    bLiveUserDressUp.desc = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveUserDressUp.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveUserDressUp.type = jsonParser.getValueAsString();
                    return true;
                case "placeType":
                    bLiveUserDressUp.placeType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserDressUp bLiveUserDressUp, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserDressUp.f45318id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUserDressUp.imageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("imageUrl", str2);
            }
            String str3 = bLiveUserDressUp.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveUserDressUp.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveUserDressUp.desc;
            if (str5 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str5);
            }
            if (bLiveUserDressUp.jumpInfo != null) {
                jsonGenerator.writeFieldName("jumpInfo");
                BLiveJumpInfo.JSON_ADAPTER.serialize(bLiveUserDressUp.jumpInfo, jsonGenerator, true);
            }
            String str6 = bLiveUserDressUp.placeType;
            if (str6 != null) {
                jsonGenerator.writeStringField("placeType", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserDressUp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserdressup";

    @NonNull
    @ProtobufIndex(index = 7)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45318id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveJumpInfo jumpInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String placeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveUserDressUp new_() {
        BLiveUserDressUp bLiveUserDressUp = new BLiveUserDressUp();
        bLiveUserDressUp.nullCheck();
        return bLiveUserDressUp;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserDressUp mo225055clone() {
        BLiveUserDressUp bLiveUserDressUp = new BLiveUserDressUp();
        bLiveUserDressUp.f45318id = this.f45318id;
        bLiveUserDressUp.imageUrl = this.imageUrl;
        bLiveUserDressUp.name = this.name;
        bLiveUserDressUp.type = this.type;
        bLiveUserDressUp.desc = this.desc;
        BLiveJumpInfo bLiveJumpInfo = this.jumpInfo;
        if (bLiveJumpInfo != null) {
            bLiveUserDressUp.jumpInfo = bLiveJumpInfo.mo225055clone();
        }
        bLiveUserDressUp.placeType = this.placeType;
        return bLiveUserDressUp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserDressUp)) {
            return false;
        }
        BLiveUserDressUp bLiveUserDressUp = (BLiveUserDressUp) obj;
        return ValueObject.util_equals(this.f45318id, bLiveUserDressUp.f45318id) && ValueObject.util_equals(this.imageUrl, bLiveUserDressUp.imageUrl) && ValueObject.util_equals(this.name, bLiveUserDressUp.name) && ValueObject.util_equals(this.type, bLiveUserDressUp.type) && ValueObject.util_equals(this.desc, bLiveUserDressUp.desc) && ValueObject.util_equals(this.jumpInfo, bLiveUserDressUp.jumpInfo) && ValueObject.util_equals(this.placeType, bLiveUserDressUp.placeType);
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
        String str = this.f45318id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.desc;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveJumpInfo bLiveJumpInfo = this.jumpInfo;
        int iHashCode6 = (iHashCode5 + (bLiveJumpInfo != null ? bLiveJumpInfo.hashCode() : 0)) * 41;
        String str6 = this.placeType;
        int iHashCode7 = iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45318id == null) {
            this.f45318id = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.jumpInfo == null) {
            this.jumpInfo = BLiveJumpInfo.new_();
        }
        if (this.placeType == null) {
            this.placeType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
