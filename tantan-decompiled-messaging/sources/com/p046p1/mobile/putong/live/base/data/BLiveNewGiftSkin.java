package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveNewGiftSkin extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftSkin> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftSkin>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftSkin.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftSkin.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftSkin newInstance() {
            return new BLiveNewGiftSkin();
        }

        public boolean parseField(BLiveNewGiftSkin bLiveNewGiftSkin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveNewGiftSkin.status = jsonParser.getValueAsString();
                    return true;
                case "expiredText":
                    bLiveNewGiftSkin.expiredText = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftSkin.f44409id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveNewGiftSkin.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveNewGiftSkin.name = jsonParser.getValueAsString();
                    return true;
                case "describe":
                    bLiveNewGiftSkin.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftSkin bLiveNewGiftSkin, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftSkin.f44409id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftSkin.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveNewGiftSkin.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveNewGiftSkin.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = bLiveNewGiftSkin.expiredText;
            if (str5 != null) {
                jsonGenerator.writeStringField("expiredText", str5);
            }
            String str6 = bLiveNewGiftSkin.describe;
            if (str6 != null) {
                jsonGenerator.writeStringField("describe", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftSkin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftskin";

    @NonNull
    @ProtobufIndex(index = 6)
    public String describe;

    @NonNull
    @ProtobufIndex(index = 5)
    public String expiredText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44409id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;

    public static BLiveNewGiftSkin new_() {
        BLiveNewGiftSkin bLiveNewGiftSkin = new BLiveNewGiftSkin();
        bLiveNewGiftSkin.nullCheck();
        return bLiveNewGiftSkin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftSkin mo223809clone() {
        BLiveNewGiftSkin bLiveNewGiftSkin = new BLiveNewGiftSkin();
        bLiveNewGiftSkin.f44409id = this.f44409id;
        bLiveNewGiftSkin.icon = this.icon;
        bLiveNewGiftSkin.name = this.name;
        bLiveNewGiftSkin.status = this.status;
        bLiveNewGiftSkin.expiredText = this.expiredText;
        bLiveNewGiftSkin.describe = this.describe;
        return bLiveNewGiftSkin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftSkin)) {
            return false;
        }
        BLiveNewGiftSkin bLiveNewGiftSkin = (BLiveNewGiftSkin) obj;
        return ValueObject.util_equals(this.f44409id, bLiveNewGiftSkin.f44409id) && ValueObject.util_equals(this.icon, bLiveNewGiftSkin.icon) && ValueObject.util_equals(this.name, bLiveNewGiftSkin.name) && ValueObject.util_equals(this.status, bLiveNewGiftSkin.status) && ValueObject.util_equals(this.expiredText, bLiveNewGiftSkin.expiredText) && ValueObject.util_equals(this.describe, bLiveNewGiftSkin.describe);
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
        String str = this.f44409id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.expiredText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.describe;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44409id == null) {
            this.f44409id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.expiredText == null) {
            this.expiredText = "";
        }
        if (this.describe == null) {
            this.describe = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
