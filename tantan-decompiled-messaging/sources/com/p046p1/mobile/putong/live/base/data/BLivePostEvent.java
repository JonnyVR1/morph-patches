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
public class BLivePostEvent extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePostEvent> JSON_ADAPTER = new ObjectJsonAdapter<BLivePostEvent>() { // from class: com.p1.mobile.putong.live.base.data.BLivePostEvent.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePostEvent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePostEvent newInstance() {
            return new BLivePostEvent();
        }

        public boolean parseField(BLivePostEvent bLivePostEvent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fakeId":
                    bLivePostEvent.fakeId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLivePostEvent.anchorId = jsonParser.getValueAsString();
                    return true;
                case "eventInfo":
                    bLivePostEvent.eventInfo = BLiveFollowConditions.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "eventName":
                    bLivePostEvent.eventName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePostEvent bLivePostEvent, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePostEvent.eventName;
            if (str != null) {
                jsonGenerator.writeStringField("eventName", str);
            }
            String str2 = bLivePostEvent.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            if (bLivePostEvent.eventInfo != null) {
                jsonGenerator.writeFieldName("eventInfo");
                BLiveFollowConditions.JSON_ADAPTER.serialize(bLivePostEvent.eventInfo, jsonGenerator, true);
            }
            String str3 = bLivePostEvent.fakeId;
            if (str3 != null) {
                jsonGenerator.writeStringField("fakeId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePostEvent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepostevent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveFollowConditions eventInfo;

    @NonNull
    @ProtobufIndex(index = 1)
    public String eventName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fakeId;

    public static BLivePostEvent new_() {
        BLivePostEvent bLivePostEvent = new BLivePostEvent();
        bLivePostEvent.nullCheck();
        return bLivePostEvent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePostEvent mo223809clone() {
        BLivePostEvent bLivePostEvent = new BLivePostEvent();
        bLivePostEvent.eventName = this.eventName;
        bLivePostEvent.anchorId = this.anchorId;
        BLiveFollowConditions bLiveFollowConditions = this.eventInfo;
        if (bLiveFollowConditions != null) {
            bLivePostEvent.eventInfo = bLiveFollowConditions.mo223809clone();
        }
        bLivePostEvent.fakeId = this.fakeId;
        return bLivePostEvent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePostEvent)) {
            return false;
        }
        BLivePostEvent bLivePostEvent = (BLivePostEvent) obj;
        return ValueObject.util_equals(this.eventName, bLivePostEvent.eventName) && ValueObject.util_equals(this.anchorId, bLivePostEvent.anchorId) && ValueObject.util_equals(this.eventInfo, bLivePostEvent.eventInfo) && ValueObject.util_equals(this.fakeId, bLivePostEvent.fakeId);
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
        String str = this.eventName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveFollowConditions bLiveFollowConditions = this.eventInfo;
        int iHashCode3 = (iHashCode2 + (bLiveFollowConditions != null ? bLiveFollowConditions.hashCode() : 0)) * 41;
        String str3 = this.fakeId;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.eventName == null) {
            this.eventName = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.eventInfo == null) {
            this.eventInfo = BLiveFollowConditions.new_();
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
