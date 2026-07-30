package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveOfficialShowSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOfficialShowSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOfficialShowSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOfficialShowSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOfficialShowSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOfficialShowSummary newInstance() {
            return new BLiveOfficialShowSummary();
        }

        public boolean parseField(BLiveOfficialShowSummary bLiveOfficialShowSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "audienceCount":
                    bLiveOfficialShowSummary.audienceCount = jsonParser.getValueAsInt();
                    return true;
                case "rewarderCount":
                    bLiveOfficialShowSummary.rewarderCount = jsonParser.getValueAsInt();
                    return true;
                case "newFollowCount":
                    bLiveOfficialShowSummary.newFollowCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOfficialShowSummary bLiveOfficialShowSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("audienceCount", bLiveOfficialShowSummary.audienceCount);
            jsonGenerator.writeNumberField("newFollowCount", bLiveOfficialShowSummary.newFollowCount);
            jsonGenerator.writeNumberField("rewarderCount", bLiveOfficialShowSummary.rewarderCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOfficialShowSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveofficialshowsummary";

    @ProtobufIndex(index = 1)
    public int audienceCount;

    @ProtobufIndex(index = 2)
    public int newFollowCount;

    @ProtobufIndex(index = 3)
    public int rewarderCount;

    public static BLiveOfficialShowSummary new_() {
        BLiveOfficialShowSummary bLiveOfficialShowSummary = new BLiveOfficialShowSummary();
        bLiveOfficialShowSummary.nullCheck();
        return bLiveOfficialShowSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOfficialShowSummary mo223809clone() {
        BLiveOfficialShowSummary bLiveOfficialShowSummary = new BLiveOfficialShowSummary();
        bLiveOfficialShowSummary.audienceCount = this.audienceCount;
        bLiveOfficialShowSummary.newFollowCount = this.newFollowCount;
        bLiveOfficialShowSummary.rewarderCount = this.rewarderCount;
        return bLiveOfficialShowSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOfficialShowSummary)) {
            return false;
        }
        BLiveOfficialShowSummary bLiveOfficialShowSummary = (BLiveOfficialShowSummary) obj;
        return this.audienceCount == bLiveOfficialShowSummary.audienceCount && this.newFollowCount == bLiveOfficialShowSummary.newFollowCount && this.rewarderCount == bLiveOfficialShowSummary.rewarderCount;
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
        int i2 = (((((i * 41) + this.audienceCount) * 41) + this.newFollowCount) * 41) + this.rewarderCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
