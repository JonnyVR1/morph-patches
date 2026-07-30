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
public class BLiveLuckyParadiseBottomEntrance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLuckyParadiseBottomEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLuckyParadiseBottomEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLuckyParadiseBottomEntrance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLuckyParadiseBottomEntrance.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLuckyParadiseBottomEntrance newInstance() {
            return new BLiveLuckyParadiseBottomEntrance();
        }

        public boolean parseField(BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "endTime":
                    bLiveLuckyParadiseBottomEntrance.endTime = jsonParser.getValueAsLong();
                    return true;
                case "buffIcon":
                    bLiveLuckyParadiseBottomEntrance.buffIcon = jsonParser.getValueAsString();
                    return true;
                case "buffText":
                    bLiveLuckyParadiseBottomEntrance.buffText = jsonParser.getValueAsString();
                    return true;
                case "defaultIcon":
                    bLiveLuckyParadiseBottomEntrance.defaultIcon = jsonParser.getValueAsString();
                    return true;
                case "tip":
                    bLiveLuckyParadiseBottomEntrance.tip = jsonParser.getValueAsString();
                    return true;
                case "buff":
                    bLiveLuckyParadiseBottomEntrance.buff = jsonParser.getValueAsBoolean();
                    return true;
                case "currentTime":
                    bLiveLuckyParadiseBottomEntrance.currentTime = jsonParser.getValueAsLong();
                    return true;
                case "poolType":
                    bLiveLuckyParadiseBottomEntrance.poolType = jsonParser.getValueAsString();
                    return true;
                case "isCrazyNow":
                    bLiveLuckyParadiseBottomEntrance.isCrazyNow = jsonParser.getValueAsBoolean();
                    return true;
                case "crazyIcon":
                    bLiveLuckyParadiseBottomEntrance.crazyIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isCrazyNow", bLiveLuckyParadiseBottomEntrance.isCrazyNow);
            String str = bLiveLuckyParadiseBottomEntrance.poolType;
            if (str != null) {
                jsonGenerator.writeStringField("poolType", str);
            }
            jsonGenerator.writeNumberField("currentTime", bLiveLuckyParadiseBottomEntrance.currentTime);
            jsonGenerator.writeNumberField("endTime", bLiveLuckyParadiseBottomEntrance.endTime);
            String str2 = bLiveLuckyParadiseBottomEntrance.defaultIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("defaultIcon", str2);
            }
            String str3 = bLiveLuckyParadiseBottomEntrance.crazyIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("crazyIcon", str3);
            }
            String str4 = bLiveLuckyParadiseBottomEntrance.tip;
            if (str4 != null) {
                jsonGenerator.writeStringField("tip", str4);
            }
            jsonGenerator.writeBooleanField("buff", bLiveLuckyParadiseBottomEntrance.buff);
            String str5 = bLiveLuckyParadiseBottomEntrance.buffIcon;
            if (str5 != null) {
                jsonGenerator.writeStringField("buffIcon", str5);
            }
            String str6 = bLiveLuckyParadiseBottomEntrance.buffText;
            if (str6 != null) {
                jsonGenerator.writeStringField("buffText", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLuckyParadiseBottomEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveluckyparadisebottomentrance";

    @ProtobufIndex(index = 8)
    public boolean buff;

    @NonNull
    @ProtobufIndex(index = 9)
    public String buffIcon;

    @NonNull
    @ProtobufIndex(index = 10)
    public String buffText;

    @NonNull
    @ProtobufIndex(index = 6)
    public String crazyIcon;

    @ProtobufIndex(index = 3)
    public long currentTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String defaultIcon;

    @ProtobufIndex(index = 4)
    public long endTime;

    @ProtobufIndex(index = 1)
    public boolean isCrazyNow;

    @NonNull
    @ProtobufIndex(index = 2)
    public String poolType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String tip;

    public static BLiveLuckyParadiseBottomEntrance new_() {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance = new BLiveLuckyParadiseBottomEntrance();
        bLiveLuckyParadiseBottomEntrance.nullCheck();
        return bLiveLuckyParadiseBottomEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLuckyParadiseBottomEntrance mo223809clone() {
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance = new BLiveLuckyParadiseBottomEntrance();
        bLiveLuckyParadiseBottomEntrance.isCrazyNow = this.isCrazyNow;
        bLiveLuckyParadiseBottomEntrance.poolType = this.poolType;
        bLiveLuckyParadiseBottomEntrance.currentTime = this.currentTime;
        bLiveLuckyParadiseBottomEntrance.endTime = this.endTime;
        bLiveLuckyParadiseBottomEntrance.defaultIcon = this.defaultIcon;
        bLiveLuckyParadiseBottomEntrance.crazyIcon = this.crazyIcon;
        bLiveLuckyParadiseBottomEntrance.tip = this.tip;
        bLiveLuckyParadiseBottomEntrance.buff = this.buff;
        bLiveLuckyParadiseBottomEntrance.buffIcon = this.buffIcon;
        bLiveLuckyParadiseBottomEntrance.buffText = this.buffText;
        return bLiveLuckyParadiseBottomEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLuckyParadiseBottomEntrance)) {
            return false;
        }
        BLiveLuckyParadiseBottomEntrance bLiveLuckyParadiseBottomEntrance = (BLiveLuckyParadiseBottomEntrance) obj;
        return this.isCrazyNow == bLiveLuckyParadiseBottomEntrance.isCrazyNow && ValueObject.util_equals(this.poolType, bLiveLuckyParadiseBottomEntrance.poolType) && this.currentTime == bLiveLuckyParadiseBottomEntrance.currentTime && this.endTime == bLiveLuckyParadiseBottomEntrance.endTime && ValueObject.util_equals(this.defaultIcon, bLiveLuckyParadiseBottomEntrance.defaultIcon) && ValueObject.util_equals(this.crazyIcon, bLiveLuckyParadiseBottomEntrance.crazyIcon) && ValueObject.util_equals(this.tip, bLiveLuckyParadiseBottomEntrance.tip) && this.buff == bLiveLuckyParadiseBottomEntrance.buff && ValueObject.util_equals(this.buffIcon, bLiveLuckyParadiseBottomEntrance.buffIcon) && ValueObject.util_equals(this.buffText, bLiveLuckyParadiseBottomEntrance.buffText);
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
        int i2 = ((i * 41) + (this.isCrazyNow ? 1231 : 1237)) * 41;
        String str = this.poolType;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.currentTime;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.defaultIcon;
        int iHashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.crazyIcon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.tip;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.buff ? 1231 : 1237)) * 41;
        String str5 = this.buffIcon;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buffText;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.poolType == null) {
            this.poolType = "";
        }
        if (this.defaultIcon == null) {
            this.defaultIcon = "";
        }
        if (this.crazyIcon == null) {
            this.crazyIcon = "";
        }
        if (this.tip == null) {
            this.tip = "";
        }
        if (this.buffIcon == null) {
            this.buffIcon = "";
        }
        if (this.buffText == null) {
            this.buffText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
