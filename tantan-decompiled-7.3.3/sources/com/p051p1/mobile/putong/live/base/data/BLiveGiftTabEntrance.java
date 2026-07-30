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
public class BLiveGiftTabEntrance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftTabEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftTabEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftTabEntrance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftTabEntrance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftTabEntrance newInstance() {
            return new BLiveGiftTabEntrance();
        }

        public boolean parseField(BLiveGiftTabEntrance bLiveGiftTabEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveGiftTabEntrance.subTitle = jsonParser.getValueAsString();
                    return true;
                case "latestUpdateTimeInSeconds":
                    bLiveGiftTabEntrance.latestUpdateTimeInSeconds = jsonParser.getValueAsLong();
                    return true;
                case "jumpUrl":
                    bLiveGiftTabEntrance.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveGiftTabEntrance.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveGiftTabEntrance.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveGiftTabEntrance.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftTabEntrance bLiveGiftTabEntrance, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftTabEntrance.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveGiftTabEntrance.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = bLiveGiftTabEntrance.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeNumberField("latestUpdateTimeInSeconds", bLiveGiftTabEntrance.latestUpdateTimeInSeconds);
            String str4 = bLiveGiftTabEntrance.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveGiftTabEntrance.jumpUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("jumpUrl", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftTabEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegifttabentrance";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String jumpUrl;

    @ProtobufIndex(index = 4)
    public long latestUpdateTimeInSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    public static BLiveGiftTabEntrance new_() {
        BLiveGiftTabEntrance bLiveGiftTabEntrance = new BLiveGiftTabEntrance();
        bLiveGiftTabEntrance.nullCheck();
        return bLiveGiftTabEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftTabEntrance mo225055clone() {
        BLiveGiftTabEntrance bLiveGiftTabEntrance = new BLiveGiftTabEntrance();
        bLiveGiftTabEntrance.name = this.name;
        bLiveGiftTabEntrance.subTitle = this.subTitle;
        bLiveGiftTabEntrance.icon = this.icon;
        bLiveGiftTabEntrance.latestUpdateTimeInSeconds = this.latestUpdateTimeInSeconds;
        bLiveGiftTabEntrance.type = this.type;
        bLiveGiftTabEntrance.jumpUrl = this.jumpUrl;
        return bLiveGiftTabEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftTabEntrance)) {
            return false;
        }
        BLiveGiftTabEntrance bLiveGiftTabEntrance = (BLiveGiftTabEntrance) obj;
        return ValueObject.util_equals(this.name, bLiveGiftTabEntrance.name) && ValueObject.util_equals(this.subTitle, bLiveGiftTabEntrance.subTitle) && ValueObject.util_equals(this.icon, bLiveGiftTabEntrance.icon) && this.latestUpdateTimeInSeconds == bLiveGiftTabEntrance.latestUpdateTimeInSeconds && ValueObject.util_equals(this.type, bLiveGiftTabEntrance.type) && ValueObject.util_equals(this.jumpUrl, bLiveGiftTabEntrance.jumpUrl);
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
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.latestUpdateTimeInSeconds;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.type;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.jumpUrl;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
