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
public class BLiveSignPrizesRewards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignPrizesRewards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignPrizesRewards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignPrizesRewards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignPrizesRewards.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignPrizesRewards newInstance() {
            return new BLiveSignPrizesRewards();
        }

        public boolean parseField(BLiveSignPrizesRewards bLiveSignPrizesRewards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveSignPrizesRewards.description = jsonParser.getValueAsString();
                    return true;
                case "button":
                    bLiveSignPrizesRewards.button = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "icon":
                    bLiveSignPrizesRewards.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSignPrizesRewards.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveSignPrizesRewards.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignPrizesRewards bLiveSignPrizesRewards, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSignPrizesRewards.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveSignPrizesRewards.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveSignPrizesRewards.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = bLiveSignPrizesRewards.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            if (bLiveSignPrizesRewards.button != null) {
                jsonGenerator.writeFieldName("button");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveSignPrizesRewards.button, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignPrizesRewards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesignprizesrewards";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveCommonViewConfig button;

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveSignPrizesRewards new_() {
        BLiveSignPrizesRewards bLiveSignPrizesRewards = new BLiveSignPrizesRewards();
        bLiveSignPrizesRewards.nullCheck();
        return bLiveSignPrizesRewards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignPrizesRewards mo223809clone() {
        BLiveSignPrizesRewards bLiveSignPrizesRewards = new BLiveSignPrizesRewards();
        bLiveSignPrizesRewards.icon = this.icon;
        bLiveSignPrizesRewards.title = this.title;
        bLiveSignPrizesRewards.description = this.description;
        bLiveSignPrizesRewards.type = this.type;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.button;
        if (bLiveCommonViewConfig != null) {
            bLiveSignPrizesRewards.button = bLiveCommonViewConfig.mo223809clone();
        }
        return bLiveSignPrizesRewards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignPrizesRewards)) {
            return false;
        }
        BLiveSignPrizesRewards bLiveSignPrizesRewards = (BLiveSignPrizesRewards) obj;
        return ValueObject.util_equals(this.icon, bLiveSignPrizesRewards.icon) && ValueObject.util_equals(this.title, bLiveSignPrizesRewards.title) && ValueObject.util_equals(this.description, bLiveSignPrizesRewards.description) && ValueObject.util_equals(this.type, bLiveSignPrizesRewards.type) && ValueObject.util_equals(this.button, bLiveSignPrizesRewards.button);
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
        BLiveCommonViewConfig bLiveCommonViewConfig = this.button;
        int iHashCode5 = iHashCode4 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0);
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
        if (this.button == null) {
            this.button = BLiveCommonViewConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
