package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftInfo;
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
public class BLiveSendLiveGiftReq extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendLiveGiftReq> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendLiveGiftReq>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendLiveGiftReq.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendLiveGiftReq newInstance() {
            return new BLiveSendLiveGiftReq();
        }

        public boolean parseField(BLiveSendLiveGiftReq bLiveSendLiveGiftReq, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "originalId":
                    bLiveSendLiveGiftReq.originalId = jsonParser.getValueAsString();
                    return true;
                case "fakeId":
                    bLiveSendLiveGiftReq.fakeId = jsonParser.getValueAsString();
                    return true;
                case "giftId":
                    bLiveSendLiveGiftReq.giftId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveSendLiveGiftReq.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveSendLiveGiftReq.roomId = jsonParser.getValueAsString();
                    return true;
                case "scenario":
                    bLiveSendLiveGiftReq.scenario = jsonParser.getValueAsString();
                    return true;
                case "extraInfo":
                    bLiveSendLiveGiftReq.extraInfo = BLiveGiftExtraInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pkId":
                    bLiveSendLiveGiftReq.pkId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSendLiveGiftReq.type = jsonParser.getValueAsString();
                    return true;
                case "giftNum":
                    bLiveSendLiveGiftReq.giftNum = jsonParser.getValueAsInt();
                    return true;
                case "giftInfo":
                    bLiveSendLiveGiftReq.giftInfo = JsonAdapter.parseArray(jsonParser, BLiveGiftInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "liveMode":
                    bLiveSendLiveGiftReq.liveMode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendLiveGiftReq bLiveSendLiveGiftReq, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendLiveGiftReq.scenario;
            if (str != null) {
                jsonGenerator.writeStringField(MatchFrom.scenario, str);
            }
            String str2 = bLiveSendLiveGiftReq.originalId;
            if (str2 != null) {
                jsonGenerator.writeStringField("originalId", str2);
            }
            String str3 = bLiveSendLiveGiftReq.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLiveSendLiveGiftReq.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLiveSendLiveGiftReq.pkId;
            if (str5 != null) {
                jsonGenerator.writeStringField("pkId", str5);
            }
            if (bLiveSendLiveGiftReq.giftInfo != null) {
                jsonGenerator.writeFieldName("giftInfo");
                JsonAdapter.serializeArray(bLiveSendLiveGiftReq.giftInfo, jsonGenerator, BLiveGiftInfo.JSON_ADAPTER);
            }
            if (bLiveSendLiveGiftReq.extraInfo != null) {
                jsonGenerator.writeFieldName("extraInfo");
                BLiveGiftExtraInfo.JSON_ADAPTER.serialize(bLiveSendLiveGiftReq.extraInfo, jsonGenerator, true);
            }
            String str6 = bLiveSendLiveGiftReq.type;
            if (str6 != null) {
                jsonGenerator.writeStringField("type", str6);
            }
            String str7 = bLiveSendLiveGiftReq.fakeId;
            if (str7 != null) {
                jsonGenerator.writeStringField("fakeId", str7);
            }
            String str8 = bLiveSendLiveGiftReq.liveMode;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveMode", str8);
            }
            String str9 = bLiveSendLiveGiftReq.giftId;
            if (str9 != null) {
                jsonGenerator.writeStringField("giftId", str9);
            }
            jsonGenerator.writeNumberField("giftNum", bLiveSendLiveGiftReq.giftNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendLiveGiftReq) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendlivegiftreq";

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveGiftExtraInfo extraInfo;

    @NonNull
    @ProtobufIndex(index = 9)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveGiftInfo> giftInfo;

    @ProtobufIndex(index = 12)
    public int giftNum;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String originalId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String pkId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String scenario;

    @NonNull
    @ProtobufIndex(index = 8)
    public String type;

    public static BLiveSendLiveGiftReq new_() {
        BLiveSendLiveGiftReq bLiveSendLiveGiftReq = new BLiveSendLiveGiftReq();
        bLiveSendLiveGiftReq.nullCheck();
        return bLiveSendLiveGiftReq;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendLiveGiftReq mo225055clone() {
        BLiveSendLiveGiftReq bLiveSendLiveGiftReq = new BLiveSendLiveGiftReq();
        bLiveSendLiveGiftReq.scenario = this.scenario;
        bLiveSendLiveGiftReq.originalId = this.originalId;
        bLiveSendLiveGiftReq.roomId = this.roomId;
        bLiveSendLiveGiftReq.liveId = this.liveId;
        bLiveSendLiveGiftReq.pkId = this.pkId;
        List<BLiveGiftInfo> list = this.giftInfo;
        if (list != null) {
            bLiveSendLiveGiftReq.giftInfo = ValueObject.util_map(list, new qcj() { // from class: l.n52
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftInfo) obj).mo225055clone();
                }
            });
        }
        BLiveGiftExtraInfo bLiveGiftExtraInfo = this.extraInfo;
        if (bLiveGiftExtraInfo != null) {
            bLiveSendLiveGiftReq.extraInfo = bLiveGiftExtraInfo.mo225055clone();
        }
        bLiveSendLiveGiftReq.type = this.type;
        bLiveSendLiveGiftReq.fakeId = this.fakeId;
        bLiveSendLiveGiftReq.liveMode = this.liveMode;
        bLiveSendLiveGiftReq.giftId = this.giftId;
        bLiveSendLiveGiftReq.giftNum = this.giftNum;
        return bLiveSendLiveGiftReq;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendLiveGiftReq)) {
            return false;
        }
        BLiveSendLiveGiftReq bLiveSendLiveGiftReq = (BLiveSendLiveGiftReq) obj;
        return ValueObject.util_equals(this.scenario, bLiveSendLiveGiftReq.scenario) && ValueObject.util_equals(this.originalId, bLiveSendLiveGiftReq.originalId) && ValueObject.util_equals(this.roomId, bLiveSendLiveGiftReq.roomId) && ValueObject.util_equals(this.liveId, bLiveSendLiveGiftReq.liveId) && ValueObject.util_equals(this.pkId, bLiveSendLiveGiftReq.pkId) && ValueObject.util_equals(this.giftInfo, bLiveSendLiveGiftReq.giftInfo) && ValueObject.util_equals(this.extraInfo, bLiveSendLiveGiftReq.extraInfo) && ValueObject.util_equals(this.type, bLiveSendLiveGiftReq.type) && ValueObject.util_equals(this.fakeId, bLiveSendLiveGiftReq.fakeId) && ValueObject.util_equals(this.liveMode, bLiveSendLiveGiftReq.liveMode) && ValueObject.util_equals(this.giftId, bLiveSendLiveGiftReq.giftId) && this.giftNum == bLiveSendLiveGiftReq.giftNum;
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
        String str2 = this.originalId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.pkId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLiveGiftInfo> list = this.giftInfo;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveGiftExtraInfo bLiveGiftExtraInfo = this.extraInfo;
        int iHashCode7 = (iHashCode6 + (bLiveGiftExtraInfo != null ? bLiveGiftExtraInfo.hashCode() : 0)) * 41;
        String str6 = this.type;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.fakeId;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.liveMode;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.giftId;
        int iHashCode11 = ((iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41) + this.giftNum;
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.scenario == null) {
            this.scenario = "";
        }
        if (this.originalId == null) {
            this.originalId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.pkId == null) {
            this.pkId = "";
        }
        if (this.giftInfo == null) {
            this.giftInfo = new ArrayList();
        }
        if (this.extraInfo == null) {
            this.extraInfo = BLiveGiftExtraInfo.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.liveMode == null) {
            this.liveMode = "";
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
