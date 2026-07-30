package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFollowRatePopupV2 extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowRatePopupV2> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowRatePopupV2>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowRatePopupV2.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowRatePopupV2 newInstance() {
            return new BLiveFollowRatePopupV2();
        }

        public boolean parseField(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerEvents":
                    bLiveFollowRatePopupV2.triggerEvents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conditions":
                    bLiveFollowRatePopupV2.conditions = BLiveFollowConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "minEventInterval":
                    bLiveFollowRatePopupV2.minEventInterval = jsonParser.getValueAsInt();
                    return true;
                case "text":
                    bLiveFollowRatePopupV2.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveFollowRatePopupV2.type = jsonParser.getValueAsString();
                    return true;
                case "titlePrefix":
                    bLiveFollowRatePopupV2.titlePrefix = jsonParser.getValueAsString();
                    return true;
                case "titleSuffix":
                    bLiveFollowRatePopupV2.titleSuffix = jsonParser.getValueAsString();
                    return true;
                case "maxShowCount":
                    bLiveFollowRatePopupV2.maxShowCount = jsonParser.getValueAsInt();
                    return true;
                case "showDuration":
                    bLiveFollowRatePopupV2.showDuration = jsonParser.getValueAsInt();
                    return true;
                case "tickerTime":
                    bLiveFollowRatePopupV2.tickerTime = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowRatePopupV2 bLiveFollowRatePopupV2, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFollowRatePopupV2.triggerEvents != null) {
                jsonGenerator.writeFieldName("triggerEvents");
                JsonAdapter.serializeArray(bLiveFollowRatePopupV2.triggerEvents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveFollowRatePopupV2.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("tickerTime", bLiveFollowRatePopupV2.tickerTime);
            String str2 = bLiveFollowRatePopupV2.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeNumberField("maxShowCount", bLiveFollowRatePopupV2.maxShowCount);
            if (bLiveFollowRatePopupV2.conditions != null) {
                jsonGenerator.writeFieldName("conditions");
                BLiveFollowConditions.JSON_ADAPTER.serialize(bLiveFollowRatePopupV2.conditions, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("minEventInterval", bLiveFollowRatePopupV2.minEventInterval);
            String str3 = bLiveFollowRatePopupV2.titlePrefix;
            if (str3 != null) {
                jsonGenerator.writeStringField("titlePrefix", str3);
            }
            String str4 = bLiveFollowRatePopupV2.titleSuffix;
            if (str4 != null) {
                jsonGenerator.writeStringField("titleSuffix", str4);
            }
            jsonGenerator.writeNumberField("showDuration", bLiveFollowRatePopupV2.showDuration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowRatePopupV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowratepopupv2";

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveFollowConditions conditions;

    @ProtobufIndex(index = 5)
    public int maxShowCount;

    @ProtobufIndex(index = 7)
    public int minEventInterval;

    @ProtobufIndex(index = 10)
    public int showDuration;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @ProtobufIndex(index = 3)
    public int tickerTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String titlePrefix;

    @NonNull
    @ProtobufIndex(index = 9)
    public String titleSuffix;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> triggerEvents;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67964a(String str) {
        return str;
    }

    public static BLiveFollowRatePopupV2 new_() {
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = new BLiveFollowRatePopupV2();
        bLiveFollowRatePopupV2.nullCheck();
        return bLiveFollowRatePopupV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowRatePopupV2 mo223809clone() {
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = new BLiveFollowRatePopupV2();
        List<String> list = this.triggerEvents;
        if (list != null) {
            bLiveFollowRatePopupV2.triggerEvents = ValueObject.util_map(list, new w9j() { // from class: l.a02
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveFollowRatePopupV2.m67964a((String) obj);
                }
            });
        }
        bLiveFollowRatePopupV2.type = this.type;
        bLiveFollowRatePopupV2.tickerTime = this.tickerTime;
        bLiveFollowRatePopupV2.text = this.text;
        bLiveFollowRatePopupV2.maxShowCount = this.maxShowCount;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        if (bLiveFollowConditions != null) {
            bLiveFollowRatePopupV2.conditions = bLiveFollowConditions.mo223809clone();
        }
        bLiveFollowRatePopupV2.minEventInterval = this.minEventInterval;
        bLiveFollowRatePopupV2.titlePrefix = this.titlePrefix;
        bLiveFollowRatePopupV2.titleSuffix = this.titleSuffix;
        bLiveFollowRatePopupV2.showDuration = this.showDuration;
        return bLiveFollowRatePopupV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowRatePopupV2)) {
            return false;
        }
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = (BLiveFollowRatePopupV2) obj;
        return ValueObject.util_equals(this.triggerEvents, bLiveFollowRatePopupV2.triggerEvents) && ValueObject.util_equals(this.type, bLiveFollowRatePopupV2.type) && this.tickerTime == bLiveFollowRatePopupV2.tickerTime && ValueObject.util_equals(this.text, bLiveFollowRatePopupV2.text) && this.maxShowCount == bLiveFollowRatePopupV2.maxShowCount && ValueObject.util_equals(this.conditions, bLiveFollowRatePopupV2.conditions) && this.minEventInterval == bLiveFollowRatePopupV2.minEventInterval && ValueObject.util_equals(this.titlePrefix, bLiveFollowRatePopupV2.titlePrefix) && ValueObject.util_equals(this.titleSuffix, bLiveFollowRatePopupV2.titleSuffix) && this.showDuration == bLiveFollowRatePopupV2.showDuration;
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
        List<String> list = this.triggerEvents;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.tickerTime) * 41;
        String str2 = this.text;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.maxShowCount) * 41;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        int iHashCode4 = (((iHashCode3 + (bLiveFollowConditions != null ? bLiveFollowConditions.hashCode() : 0)) * 41) + this.minEventInterval) * 41;
        String str3 = this.titlePrefix;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.titleSuffix;
        int iHashCode6 = ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.showDuration;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.triggerEvents == null) {
            this.triggerEvents = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.conditions == null) {
            this.conditions = BLiveFollowConditions.new_();
        }
        if (this.titlePrefix == null) {
            this.titlePrefix = "";
        }
        if (this.titleSuffix == null) {
            this.titleSuffix = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
