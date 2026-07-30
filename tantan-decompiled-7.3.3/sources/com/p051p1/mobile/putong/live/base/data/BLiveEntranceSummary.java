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
public class BLiveEntranceSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEntranceSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEntranceSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEntranceSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEntranceSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEntranceSummary newInstance() {
            return new BLiveEntranceSummary();
        }

        public boolean parseField(BLiveEntranceSummary bLiveEntranceSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveEntranceSummary.description = jsonParser.getValueAsString();
                    return true;
                case "scheme":
                    bLiveEntranceSummary.scheme = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveEntranceSummary.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveEntranceSummary.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveEntranceSummary.title = jsonParser.getValueAsString();
                    return true;
                case "displayTime":
                    bLiveEntranceSummary.displayTime = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEntranceSummary bLiveEntranceSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveEntranceSummary.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveEntranceSummary.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveEntranceSummary.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = bLiveEntranceSummary.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveEntranceSummary.scheme;
            if (str5 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str5);
            }
            jsonGenerator.writeNumberField("displayTime", bLiveEntranceSummary.displayTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEntranceSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveentrancesummary";

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @ProtobufIndex(index = 6)
    public int displayTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String scheme;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveEntranceSummary new_() {
        BLiveEntranceSummary bLiveEntranceSummary = new BLiveEntranceSummary();
        bLiveEntranceSummary.nullCheck();
        return bLiveEntranceSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEntranceSummary mo225055clone() {
        BLiveEntranceSummary bLiveEntranceSummary = new BLiveEntranceSummary();
        bLiveEntranceSummary.icon = this.icon;
        bLiveEntranceSummary.title = this.title;
        bLiveEntranceSummary.description = this.description;
        bLiveEntranceSummary.type = this.type;
        bLiveEntranceSummary.scheme = this.scheme;
        bLiveEntranceSummary.displayTime = this.displayTime;
        return bLiveEntranceSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEntranceSummary)) {
            return false;
        }
        BLiveEntranceSummary bLiveEntranceSummary = (BLiveEntranceSummary) obj;
        return ValueObject.util_equals(this.icon, bLiveEntranceSummary.icon) && ValueObject.util_equals(this.title, bLiveEntranceSummary.title) && ValueObject.util_equals(this.description, bLiveEntranceSummary.description) && ValueObject.util_equals(this.type, bLiveEntranceSummary.type) && ValueObject.util_equals(this.scheme, bLiveEntranceSummary.scheme) && this.displayTime == bLiveEntranceSummary.displayTime;
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.scheme;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.displayTime;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
