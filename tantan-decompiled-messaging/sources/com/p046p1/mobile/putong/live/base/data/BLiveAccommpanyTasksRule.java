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
public class BLiveAccommpanyTasksRule extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTasksRule> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTasksRule>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTasksRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTasksRule newInstance() {
            return new BLiveAccommpanyTasksRule();
        }

        public boolean parseField(BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveAccommpanyTasksRule.duration = jsonParser.getValueAsInt();
                    return true;
                case "giftId":
                    bLiveAccommpanyTasksRule.giftId = jsonParser.getValueAsString();
                    return true;
                case "giftAmount":
                    bLiveAccommpanyTasksRule.giftAmount = jsonParser.getValueAsInt();
                    return true;
                case "giftIcon":
                    bLiveAccommpanyTasksRule.giftIcon = jsonParser.getValueAsString();
                    return true;
                case "giftName":
                    bLiveAccommpanyTasksRule.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveAccommpanyTasksRule.duration);
            String str = bLiveAccommpanyTasksRule.giftIcon;
            if (str != null) {
                jsonGenerator.writeStringField("giftIcon", str);
            }
            String str2 = bLiveAccommpanyTasksRule.giftName;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftName", str2);
            }
            String str3 = bLiveAccommpanyTasksRule.giftId;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftId", str3);
            }
            jsonGenerator.writeNumberField("giftAmount", bLiveAccommpanyTasksRule.giftAmount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTasksRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasksrule";

    @ProtobufIndex(index = 1)
    public int duration;

    @ProtobufIndex(index = 5)
    public int giftAmount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftIcon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftName;

    public static BLiveAccommpanyTasksRule new_() {
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = new BLiveAccommpanyTasksRule();
        bLiveAccommpanyTasksRule.nullCheck();
        return bLiveAccommpanyTasksRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTasksRule mo223809clone() {
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = new BLiveAccommpanyTasksRule();
        bLiveAccommpanyTasksRule.duration = this.duration;
        bLiveAccommpanyTasksRule.giftIcon = this.giftIcon;
        bLiveAccommpanyTasksRule.giftName = this.giftName;
        bLiveAccommpanyTasksRule.giftId = this.giftId;
        bLiveAccommpanyTasksRule.giftAmount = this.giftAmount;
        return bLiveAccommpanyTasksRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTasksRule)) {
            return false;
        }
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = (BLiveAccommpanyTasksRule) obj;
        return this.duration == bLiveAccommpanyTasksRule.duration && ValueObject.util_equals(this.giftIcon, bLiveAccommpanyTasksRule.giftIcon) && ValueObject.util_equals(this.giftName, bLiveAccommpanyTasksRule.giftName) && ValueObject.util_equals(this.giftId, bLiveAccommpanyTasksRule.giftId) && this.giftAmount == bLiveAccommpanyTasksRule.giftAmount;
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
        int i2 = ((i * 41) + this.duration) * 41;
        String str = this.giftIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftId;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.giftAmount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
