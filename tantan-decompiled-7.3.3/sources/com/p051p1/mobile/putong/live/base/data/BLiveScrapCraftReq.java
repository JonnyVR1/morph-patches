package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.MatchFrom;
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
public class BLiveScrapCraftReq extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapCraftReq> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapCraftReq>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapCraftReq.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapCraftReq.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapCraftReq newInstance() {
            return new BLiveScrapCraftReq();
        }

        public boolean parseField(BLiveScrapCraftReq bLiveScrapCraftReq, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "originalId":
                    bLiveScrapCraftReq.originalId = jsonParser.getValueAsString();
                    return true;
                case "fakeId":
                    bLiveScrapCraftReq.fakeId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveScrapCraftReq.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveScrapCraftReq.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveScrapCraftReq.roomId = jsonParser.getValueAsString();
                    return true;
                case "source":
                    bLiveScrapCraftReq.source = jsonParser.getValueAsString();
                    return true;
                case "targetItemId":
                    bLiveScrapCraftReq.targetItemId = jsonParser.getValueAsString();
                    return true;
                case "scenario":
                    bLiveScrapCraftReq.scenario = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapCraftReq bLiveScrapCraftReq, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapCraftReq.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
            String str2 = bLiveScrapCraftReq.scenario;
            if (str2 != null) {
                jsonGenerator.writeStringField(MatchFrom.scenario, str2);
            }
            String str3 = bLiveScrapCraftReq.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLiveScrapCraftReq.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLiveScrapCraftReq.anchorId;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorId", str5);
            }
            String str6 = bLiveScrapCraftReq.targetItemId;
            if (str6 != null) {
                jsonGenerator.writeStringField("targetItemId", str6);
            }
            String str7 = bLiveScrapCraftReq.originalId;
            if (str7 != null) {
                jsonGenerator.writeStringField("originalId", str7);
            }
            String str8 = bLiveScrapCraftReq.fakeId;
            if (str8 != null) {
                jsonGenerator.writeStringField("fakeId", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapCraftReq) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapcraftreq";

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String originalId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String scenario;

    @NonNull
    @ProtobufIndex(index = 1)
    public String source;

    @NonNull
    @ProtobufIndex(index = 6)
    public String targetItemId;

    public static BLiveScrapCraftReq new_() {
        BLiveScrapCraftReq bLiveScrapCraftReq = new BLiveScrapCraftReq();
        bLiveScrapCraftReq.nullCheck();
        return bLiveScrapCraftReq;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapCraftReq mo225055clone() {
        BLiveScrapCraftReq bLiveScrapCraftReq = new BLiveScrapCraftReq();
        bLiveScrapCraftReq.source = this.source;
        bLiveScrapCraftReq.scenario = this.scenario;
        bLiveScrapCraftReq.roomId = this.roomId;
        bLiveScrapCraftReq.liveId = this.liveId;
        bLiveScrapCraftReq.anchorId = this.anchorId;
        bLiveScrapCraftReq.targetItemId = this.targetItemId;
        bLiveScrapCraftReq.originalId = this.originalId;
        bLiveScrapCraftReq.fakeId = this.fakeId;
        return bLiveScrapCraftReq;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapCraftReq)) {
            return false;
        }
        BLiveScrapCraftReq bLiveScrapCraftReq = (BLiveScrapCraftReq) obj;
        return ValueObject.util_equals(this.source, bLiveScrapCraftReq.source) && ValueObject.util_equals(this.scenario, bLiveScrapCraftReq.scenario) && ValueObject.util_equals(this.roomId, bLiveScrapCraftReq.roomId) && ValueObject.util_equals(this.liveId, bLiveScrapCraftReq.liveId) && ValueObject.util_equals(this.anchorId, bLiveScrapCraftReq.anchorId) && ValueObject.util_equals(this.targetItemId, bLiveScrapCraftReq.targetItemId) && ValueObject.util_equals(this.originalId, bLiveScrapCraftReq.originalId) && ValueObject.util_equals(this.fakeId, bLiveScrapCraftReq.fakeId);
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
        String str = this.source;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scenario;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.targetItemId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.originalId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.fakeId;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.scenario == null) {
            this.scenario = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.targetItemId == null) {
            this.targetItemId = "";
        }
        if (this.originalId == null) {
            this.originalId = "";
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
