package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
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
public class BLiveFollowRateChatV2 extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowRateChatV2> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowRateChatV2>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowRateChatV2.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowRateChatV2.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowRateChatV2 newInstance() {
            return new BLiveFollowRateChatV2();
        }

        public boolean parseField(BLiveFollowRateChatV2 bLiveFollowRateChatV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "triggerEvents":
                    bLiveFollowRateChatV2.triggerEvents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conditions":
                    bLiveFollowRateChatV2.conditions = BLiveFollowConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "minEventInterval":
                    bLiveFollowRateChatV2.minEventInterval = jsonParser.getValueAsInt();
                    return true;
                case "maxShowCount":
                    bLiveFollowRateChatV2.maxShowCount = jsonParser.getValueAsInt();
                    return true;
                case "templateId":
                    bLiveFollowRateChatV2.templateId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowRateChatV2 bLiveFollowRateChatV2, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFollowRateChatV2.triggerEvents != null) {
                jsonGenerator.writeFieldName("triggerEvents");
                JsonAdapter.serializeArray(bLiveFollowRateChatV2.triggerEvents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveFollowRateChatV2.templateId;
            if (str != null) {
                jsonGenerator.writeStringField("templateId", str);
            }
            jsonGenerator.writeNumberField("maxShowCount", bLiveFollowRateChatV2.maxShowCount);
            if (bLiveFollowRateChatV2.conditions != null) {
                jsonGenerator.writeFieldName("conditions");
                BLiveFollowConditions.JSON_ADAPTER.serialize(bLiveFollowRateChatV2.conditions, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("minEventInterval", bLiveFollowRateChatV2.minEventInterval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowRateChatV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowratechatv2";

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveFollowConditions conditions;

    @ProtobufIndex(index = 3)
    public int maxShowCount;

    @ProtobufIndex(index = 5)
    public int minEventInterval;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> triggerEvents;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67963a(String str) {
        return str;
    }

    public static BLiveFollowRateChatV2 new_() {
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = new BLiveFollowRateChatV2();
        bLiveFollowRateChatV2.nullCheck();
        return bLiveFollowRateChatV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowRateChatV2 mo223809clone() {
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = new BLiveFollowRateChatV2();
        List<String> list = this.triggerEvents;
        if (list != null) {
            bLiveFollowRateChatV2.triggerEvents = ValueObject.util_map(list, new w9j() { // from class: l.zz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveFollowRateChatV2.m67963a((String) obj);
                }
            });
        }
        bLiveFollowRateChatV2.templateId = this.templateId;
        bLiveFollowRateChatV2.maxShowCount = this.maxShowCount;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        if (bLiveFollowConditions != null) {
            bLiveFollowRateChatV2.conditions = bLiveFollowConditions.mo223809clone();
        }
        bLiveFollowRateChatV2.minEventInterval = this.minEventInterval;
        return bLiveFollowRateChatV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowRateChatV2)) {
            return false;
        }
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = (BLiveFollowRateChatV2) obj;
        return ValueObject.util_equals(this.triggerEvents, bLiveFollowRateChatV2.triggerEvents) && ValueObject.util_equals(this.templateId, bLiveFollowRateChatV2.templateId) && this.maxShowCount == bLiveFollowRateChatV2.maxShowCount && ValueObject.util_equals(this.conditions, bLiveFollowRateChatV2.conditions) && this.minEventInterval == bLiveFollowRateChatV2.minEventInterval;
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
        String str = this.templateId;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.maxShowCount) * 41;
        BLiveFollowConditions bLiveFollowConditions = this.conditions;
        int iHashCode3 = ((iHashCode2 + (bLiveFollowConditions != null ? bLiveFollowConditions.hashCode() : 0)) * 41) + this.minEventInterval;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.triggerEvents == null) {
            this.triggerEvents = new ArrayList();
        }
        if (this.templateId == null) {
            this.templateId = "";
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
