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
public class BLiveNewGiftWallProgress extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallProgress> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallProgress>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallProgress.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallProgress newInstance() {
            return new BLiveNewGiftWallProgress();
        }

        public boolean parseField(BLiveNewGiftWallProgress bLiveNewGiftWallProgress, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgEndColor":
                    bLiveNewGiftWallProgress.bgEndColor = jsonParser.getValueAsString();
                    return true;
                case "startColor":
                    bLiveNewGiftWallProgress.startColor = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    bLiveNewGiftWallProgress.textColor = jsonParser.getValueAsString();
                    return true;
                case "bgStartColor":
                    bLiveNewGiftWallProgress.bgStartColor = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveNewGiftWallProgress.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveNewGiftWallProgress.type = jsonParser.getValueAsString();
                    return true;
                case "total":
                    bLiveNewGiftWallProgress.total = jsonParser.getValueAsInt();
                    return true;
                case "current":
                    bLiveNewGiftWallProgress.current = jsonParser.getValueAsInt();
                    return true;
                case "endColor":
                    bLiveNewGiftWallProgress.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallProgress bLiveNewGiftWallProgress, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallProgress.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveNewGiftWallProgress.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("total", bLiveNewGiftWallProgress.total);
            jsonGenerator.writeNumberField("current", bLiveNewGiftWallProgress.current);
            String str3 = bLiveNewGiftWallProgress.startColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("startColor", str3);
            }
            String str4 = bLiveNewGiftWallProgress.endColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("endColor", str4);
            }
            String str5 = bLiveNewGiftWallProgress.bgStartColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("bgStartColor", str5);
            }
            String str6 = bLiveNewGiftWallProgress.bgEndColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("bgEndColor", str6);
            }
            String str7 = bLiveNewGiftWallProgress.textColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("textColor", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallProgress) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallprogress";

    @NonNull
    @ProtobufIndex(index = 8)
    public String bgEndColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bgStartColor;

    @ProtobufIndex(index = 4)
    public int current;

    @NonNull
    @ProtobufIndex(index = 6)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 9)
    public String textColor;

    @ProtobufIndex(index = 3)
    public int total;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveNewGiftWallProgress new_() {
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = new BLiveNewGiftWallProgress();
        bLiveNewGiftWallProgress.nullCheck();
        return bLiveNewGiftWallProgress;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallProgress mo223809clone() {
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = new BLiveNewGiftWallProgress();
        bLiveNewGiftWallProgress.type = this.type;
        bLiveNewGiftWallProgress.name = this.name;
        bLiveNewGiftWallProgress.total = this.total;
        bLiveNewGiftWallProgress.current = this.current;
        bLiveNewGiftWallProgress.startColor = this.startColor;
        bLiveNewGiftWallProgress.endColor = this.endColor;
        bLiveNewGiftWallProgress.bgStartColor = this.bgStartColor;
        bLiveNewGiftWallProgress.bgEndColor = this.bgEndColor;
        bLiveNewGiftWallProgress.textColor = this.textColor;
        return bLiveNewGiftWallProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallProgress)) {
            return false;
        }
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = (BLiveNewGiftWallProgress) obj;
        return ValueObject.util_equals(this.type, bLiveNewGiftWallProgress.type) && ValueObject.util_equals(this.name, bLiveNewGiftWallProgress.name) && this.total == bLiveNewGiftWallProgress.total && this.current == bLiveNewGiftWallProgress.current && ValueObject.util_equals(this.startColor, bLiveNewGiftWallProgress.startColor) && ValueObject.util_equals(this.endColor, bLiveNewGiftWallProgress.endColor) && ValueObject.util_equals(this.bgStartColor, bLiveNewGiftWallProgress.bgStartColor) && ValueObject.util_equals(this.bgEndColor, bLiveNewGiftWallProgress.bgEndColor) && ValueObject.util_equals(this.textColor, bLiveNewGiftWallProgress.textColor);
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
        String str2 = this.name;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.total) * 41) + this.current) * 41;
        String str3 = this.startColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.endColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bgStartColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.bgEndColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.textColor;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.bgStartColor == null) {
            this.bgStartColor = "";
        }
        if (this.bgEndColor == null) {
            this.bgEndColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
