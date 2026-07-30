package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.MatchFrom;
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
public class BLiveGameInfoReq extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGameInfoReq> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGameInfoReq>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGameInfoReq.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGameInfoReq.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGameInfoReq newInstance() {
            return new BLiveGameInfoReq();
        }

        public boolean parseField(BLiveGameInfoReq bLiveGameInfoReq, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fakeId":
                    bLiveGameInfoReq.fakeId = jsonParser.getValueAsString();
                    return true;
                case "giftId":
                    bLiveGameInfoReq.giftId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveGameInfoReq.liveId = jsonParser.getValueAsString();
                    return true;
                case "tradeNo":
                    bLiveGameInfoReq.tradeNo = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveGameInfoReq.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveGameInfoReq.roomId = jsonParser.getValueAsString();
                    return true;
                case "scenario":
                    bLiveGameInfoReq.scenario = jsonParser.getValueAsString();
                    return true;
                case "gameInfoExt":
                    bLiveGameInfoReq.gameInfoExt = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGameInfoReq bLiveGameInfoReq, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGameInfoReq.scenario;
            if (str != null) {
                jsonGenerator.writeStringField(MatchFrom.scenario, str);
            }
            String str2 = bLiveGameInfoReq.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveGameInfoReq.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveGameInfoReq.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            String str5 = bLiveGameInfoReq.fakeId;
            if (str5 != null) {
                jsonGenerator.writeStringField("fakeId", str5);
            }
            String str6 = bLiveGameInfoReq.giftId;
            if (str6 != null) {
                jsonGenerator.writeStringField("giftId", str6);
            }
            String str7 = bLiveGameInfoReq.tradeNo;
            if (str7 != null) {
                jsonGenerator.writeStringField("tradeNo", str7);
            }
            String str8 = bLiveGameInfoReq.gameInfoExt;
            if (str8 != null) {
                jsonGenerator.writeStringField("gameInfoExt", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGameInfoReq) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegameinforeq";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String gameInfoExt;

    @NonNull
    @ProtobufIndex(index = 6)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String scenario;

    @NonNull
    @ProtobufIndex(index = 7)
    public String tradeNo;

    public static BLiveGameInfoReq new_() {
        BLiveGameInfoReq bLiveGameInfoReq = new BLiveGameInfoReq();
        bLiveGameInfoReq.nullCheck();
        return bLiveGameInfoReq;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGameInfoReq mo223809clone() {
        BLiveGameInfoReq bLiveGameInfoReq = new BLiveGameInfoReq();
        bLiveGameInfoReq.scenario = this.scenario;
        bLiveGameInfoReq.roomId = this.roomId;
        bLiveGameInfoReq.liveId = this.liveId;
        bLiveGameInfoReq.anchorId = this.anchorId;
        bLiveGameInfoReq.fakeId = this.fakeId;
        bLiveGameInfoReq.giftId = this.giftId;
        bLiveGameInfoReq.tradeNo = this.tradeNo;
        bLiveGameInfoReq.gameInfoExt = this.gameInfoExt;
        return bLiveGameInfoReq;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGameInfoReq)) {
            return false;
        }
        BLiveGameInfoReq bLiveGameInfoReq = (BLiveGameInfoReq) obj;
        return ValueObject.util_equals(this.scenario, bLiveGameInfoReq.scenario) && ValueObject.util_equals(this.roomId, bLiveGameInfoReq.roomId) && ValueObject.util_equals(this.liveId, bLiveGameInfoReq.liveId) && ValueObject.util_equals(this.anchorId, bLiveGameInfoReq.anchorId) && ValueObject.util_equals(this.fakeId, bLiveGameInfoReq.fakeId) && ValueObject.util_equals(this.giftId, bLiveGameInfoReq.giftId) && ValueObject.util_equals(this.tradeNo, bLiveGameInfoReq.tradeNo) && ValueObject.util_equals(this.gameInfoExt, bLiveGameInfoReq.gameInfoExt);
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
        String str = this.scenario;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.fakeId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.giftId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.tradeNo;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.gameInfoExt;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.tradeNo == null) {
            this.tradeNo = "";
        }
        if (this.gameInfoExt == null) {
            this.gameInfoExt = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
