package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFollowRateBubbleV2 extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowRateBubbleV2> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowRateBubbleV2>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowRateBubbleV2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowRateBubbleV2 newInstance() {
            return new BLiveFollowRateBubbleV2();
        }

        public boolean parseField(BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerEvents":
                    bLiveFollowRateBubbleV2.triggerEvents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conditions":
                    bLiveFollowRateBubbleV2.conditions = BLiveFollowConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "minEventInterval":
                    bLiveFollowRateBubbleV2.minEventInterval = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLiveFollowRateBubbleV2.type = jsonParser.getValueAsString();
                    return true;
                case "maxShowCount":
                    bLiveFollowRateBubbleV2.maxShowCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFollowRateBubbleV2.triggerEvents != null) {
                jsonGenerator.writeFieldName("triggerEvents");
                JsonAdapter.serializeArray(bLiveFollowRateBubbleV2.triggerEvents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveFollowRateBubbleV2.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("maxShowCount", bLiveFollowRateBubbleV2.maxShowCount);
            jsonGenerator.writeNumberField("minEventInterval", bLiveFollowRateBubbleV2.minEventInterval);
            if (bLiveFollowRateBubbleV2.conditions != null) {
                jsonGenerator.writeFieldName("conditions");
                BLiveFollowConditions.JSON_ADAPTER.serialize(bLiveFollowRateBubbleV2.conditions, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowRateBubbleV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowratebubblev2";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveFollowConditions conditions;

    @ProtobufIndex(index = 3)
    public int maxShowCount;

    @ProtobufIndex(index = 4)
    public int minEventInterval;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> triggerEvents;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69145a(String str) {
        return str;
    }

    public static BLiveFollowRateBubbleV2 new_() {
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = new BLiveFollowRateBubbleV2();
        bLiveFollowRateBubbleV2.nullCheck();
        return bLiveFollowRateBubbleV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowRateBubbleV2 mo225055clone() {
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = new BLiveFollowRateBubbleV2();
        List<String> list = this.triggerEvents;
        if (list != null) {
            bLiveFollowRateBubbleV2.triggerEvents = ValueObject.util_map(list, new qcj() { // from class: l.f02
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveFollowRateBubbleV2.m69145a((String) obj);
                }
            });
        }
        bLiveFollowRateBubbleV2.type = this.type;
        bLiveFollowRateBubbleV2.maxShowCount = this.maxShowCount;
        bLiveFollowRateBubbleV2.minEventInterval = this.minEventInterval;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        if (bLiveFollowConditions != null) {
            bLiveFollowRateBubbleV2.conditions = bLiveFollowConditions.mo225055clone();
        }
        return bLiveFollowRateBubbleV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowRateBubbleV2)) {
            return false;
        }
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = (BLiveFollowRateBubbleV2) obj;
        return ValueObject.util_equals(this.triggerEvents, bLiveFollowRateBubbleV2.triggerEvents) && ValueObject.util_equals(this.type, bLiveFollowRateBubbleV2.type) && this.maxShowCount == bLiveFollowRateBubbleV2.maxShowCount && this.minEventInterval == bLiveFollowRateBubbleV2.minEventInterval && ValueObject.util_equals(this.conditions, bLiveFollowRateBubbleV2.conditions);
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
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.maxShowCount) * 41) + this.minEventInterval) * 41;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        int iHashCode3 = iHashCode2 + (bLiveFollowConditions != null ? bLiveFollowConditions.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.triggerEvents == null) {
            this.triggerEvents = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.conditions == null) {
            this.conditions = BLiveFollowConditions.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
