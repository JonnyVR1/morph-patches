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
public class BLiveFollowConditions extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowConditions> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowConditions>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowConditions.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowConditions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowConditions newInstance() {
            return new BLiveFollowConditions();
        }

        public boolean parseField(BLiveFollowConditions bLiveFollowConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "msgCount":
                    bLiveFollowConditions.msgCount = jsonParser.getValueAsString();
                    return true;
                case "watchTime":
                    bLiveFollowConditions.watchTime = jsonParser.getValueAsString();
                    return true;
                case "rewardPoint":
                    bLiveFollowConditions.rewardPoint = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowConditions bLiveFollowConditions, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFollowConditions.watchTime;
            if (str != null) {
                jsonGenerator.writeStringField("watchTime", str);
            }
            String str2 = bLiveFollowConditions.msgCount;
            if (str2 != null) {
                jsonGenerator.writeStringField("msgCount", str2);
            }
            String str3 = bLiveFollowConditions.rewardPoint;
            if (str3 != null) {
                jsonGenerator.writeStringField("rewardPoint", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowconditions";

    @NonNull
    @ProtobufIndex(index = 2)
    public String msgCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rewardPoint;

    @NonNull
    @ProtobufIndex(index = 1)
    public String watchTime;

    public static BLiveFollowConditions new_() {
        BLiveFollowConditions bLiveFollowConditions = new BLiveFollowConditions();
        bLiveFollowConditions.nullCheck();
        return bLiveFollowConditions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowConditions mo225055clone() {
        BLiveFollowConditions bLiveFollowConditions = new BLiveFollowConditions();
        bLiveFollowConditions.watchTime = this.watchTime;
        bLiveFollowConditions.msgCount = this.msgCount;
        bLiveFollowConditions.rewardPoint = this.rewardPoint;
        return bLiveFollowConditions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowConditions)) {
            return false;
        }
        BLiveFollowConditions bLiveFollowConditions = (BLiveFollowConditions) obj;
        return ValueObject.util_equals(this.watchTime, bLiveFollowConditions.watchTime) && ValueObject.util_equals(this.msgCount, bLiveFollowConditions.msgCount) && ValueObject.util_equals(this.rewardPoint, bLiveFollowConditions.rewardPoint);
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
        String str = this.watchTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.msgCount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rewardPoint;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.watchTime == null) {
            this.watchTime = "";
        }
        if (this.msgCount == null) {
            this.msgCount = "";
        }
        if (this.rewardPoint == null) {
            this.rewardPoint = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
