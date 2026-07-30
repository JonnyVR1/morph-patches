package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Reason;
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
public class BLiveMedalEditInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedalEditInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedalEditInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedalEditInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedalEditInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedalEditInfo newInstance() {
            return new BLiveMedalEditInfo();
        }

        public boolean parseField(BLiveMedalEditInfo bLiveMedalEditInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "durationDays":
                    bLiveMedalEditInfo.durationDays = jsonParser.getValueAsInt();
                    return true;
                case "reason":
                    bLiveMedalEditInfo.reason = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveMedalEditInfo.status = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveMedalEditInfo.icon = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveMedalEditInfo.text = jsonParser.getValueAsString();
                    return true;
                case "color":
                    bLiveMedalEditInfo.color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedalEditInfo bLiveMedalEditInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("durationDays", bLiveMedalEditInfo.durationDays);
            String str = bLiveMedalEditInfo.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
            String str2 = bLiveMedalEditInfo.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str2);
            }
            String str3 = bLiveMedalEditInfo.color;
            if (str3 != null) {
                jsonGenerator.writeStringField("color", str3);
            }
            String str4 = bLiveMedalEditInfo.text;
            if (str4 != null) {
                jsonGenerator.writeStringField("text", str4);
            }
            String str5 = bLiveMedalEditInfo.icon;
            if (str5 != null) {
                jsonGenerator.writeStringField("icon", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedalEditInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedaleditinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String color;

    @ProtobufIndex(index = 1)
    public int durationDays;

    @NonNull
    @ProtobufIndex(index = 6)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 5)
    public String text;

    public static BLiveMedalEditInfo new_() {
        BLiveMedalEditInfo bLiveMedalEditInfo = new BLiveMedalEditInfo();
        bLiveMedalEditInfo.nullCheck();
        return bLiveMedalEditInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedalEditInfo mo225055clone() {
        BLiveMedalEditInfo bLiveMedalEditInfo = new BLiveMedalEditInfo();
        bLiveMedalEditInfo.durationDays = this.durationDays;
        bLiveMedalEditInfo.status = this.status;
        bLiveMedalEditInfo.reason = this.reason;
        bLiveMedalEditInfo.color = this.color;
        bLiveMedalEditInfo.text = this.text;
        bLiveMedalEditInfo.icon = this.icon;
        return bLiveMedalEditInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedalEditInfo)) {
            return false;
        }
        BLiveMedalEditInfo bLiveMedalEditInfo = (BLiveMedalEditInfo) obj;
        return this.durationDays == bLiveMedalEditInfo.durationDays && ValueObject.util_equals(this.status, bLiveMedalEditInfo.status) && ValueObject.util_equals(this.reason, bLiveMedalEditInfo.reason) && ValueObject.util_equals(this.color, bLiveMedalEditInfo.color) && ValueObject.util_equals(this.text, bLiveMedalEditInfo.text) && ValueObject.util_equals(this.icon, bLiveMedalEditInfo.icon);
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
        int i2 = ((i * 41) + this.durationDays) * 41;
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.icon;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
