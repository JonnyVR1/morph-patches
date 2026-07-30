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
public class BLivePKCardItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePKCardItem> JSON_ADAPTER = new ObjectJsonAdapter<BLivePKCardItem>() { // from class: com.p1.mobile.putong.live.base.data.BLivePKCardItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePKCardItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePKCardItem newInstance() {
            return new BLivePKCardItem();
        }

        public boolean parseField(BLivePKCardItem bLivePKCardItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLivePKCardItem.duration = jsonParser.getValueAsInt();
                    return true;
                case "startTs":
                    bLivePKCardItem.startTs = jsonParser.getValueAsLong();
                    return true;
                case "icon":
                    bLivePKCardItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLivePKCardItem.name = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLivePKCardItem.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLivePKCardItem.type = jsonParser.getValueAsString();
                    return true;
                case "showCountdown":
                    bLivePKCardItem.showCountdown = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePKCardItem bLivePKCardItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePKCardItem.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLivePKCardItem.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeNumberField("startTs", bLivePKCardItem.startTs);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLivePKCardItem.duration);
            jsonGenerator.writeBooleanField("showCountdown", bLivePKCardItem.showCountdown);
            String str3 = bLivePKCardItem.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLivePKCardItem.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePKCardItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkcarditem";

    @ProtobufIndex(index = 4)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 7)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 6)
    public String name;

    @ProtobufIndex(index = 5)
    public boolean showCountdown;

    @ProtobufIndex(index = 3)
    public long startTs;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLivePKCardItem new_() {
        BLivePKCardItem bLivePKCardItem = new BLivePKCardItem();
        bLivePKCardItem.nullCheck();
        return bLivePKCardItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePKCardItem mo223809clone() {
        BLivePKCardItem bLivePKCardItem = new BLivePKCardItem();
        bLivePKCardItem.type = this.type;
        bLivePKCardItem.text = this.text;
        bLivePKCardItem.startTs = this.startTs;
        bLivePKCardItem.duration = this.duration;
        bLivePKCardItem.showCountdown = this.showCountdown;
        bLivePKCardItem.name = this.name;
        bLivePKCardItem.icon = this.icon;
        return bLivePKCardItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePKCardItem)) {
            return false;
        }
        BLivePKCardItem bLivePKCardItem = (BLivePKCardItem) obj;
        return ValueObject.util_equals(this.type, bLivePKCardItem.type) && ValueObject.util_equals(this.text, bLivePKCardItem.text) && this.startTs == bLivePKCardItem.startTs && this.duration == bLivePKCardItem.duration && this.showCountdown == bLivePKCardItem.showCountdown && ValueObject.util_equals(this.name, bLivePKCardItem.name) && ValueObject.util_equals(this.icon, bLivePKCardItem.icon);
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
        String str2 = this.text;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.startTs;
        int i3 = (((((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.duration) * 41) + (this.showCountdown ? 1231 : 1237)) * 41;
        String str3 = this.name;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.name == null) {
            this.name = "";
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
