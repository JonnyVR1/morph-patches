package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPlayer;
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
public class BLiveMultiPkDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkDetail newInstance() {
            return new BLiveMultiPkDetail();
        }

        public boolean parseField(BLiveMultiPkDetail bLiveMultiPkDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveMultiPkDetail.duration = jsonParser.getValueAsInt();
                    return true;
                case "startTs":
                    bLiveMultiPkDetail.startTs = jsonParser.getValueAsLong();
                    return true;
                case "players":
                    bLiveMultiPkDetail.players = JsonAdapter.parseArray(jsonParser, BLiveMultiPkPlayer.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveMultiPkDetail.f44407id = jsonParser.getValueAsString();
                    return false;
                case "stage":
                    bLiveMultiPkDetail.stage = jsonParser.getValueAsString();
                    return true;
                case "winnerUserId":
                    bLiveMultiPkDetail.winnerUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkDetail bLiveMultiPkDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiPkDetail.f44407id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiPkDetail.stage;
            if (str2 != null) {
                jsonGenerator.writeStringField("stage", str2);
            }
            jsonGenerator.writeNumberField("startTs", bLiveMultiPkDetail.startTs);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveMultiPkDetail.duration);
            String str3 = bLiveMultiPkDetail.winnerUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("winnerUserId", str3);
            }
            if (bLiveMultiPkDetail.players != null) {
                jsonGenerator.writeFieldName("players");
                JsonAdapter.serializeArray(bLiveMultiPkDetail.players, jsonGenerator, BLiveMultiPkPlayer.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkdetail";

    @ProtobufIndex(index = 4)
    public int duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44407id;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveMultiPkPlayer> players;

    @NonNull
    @ProtobufIndex(index = 2)
    public String stage;

    @ProtobufIndex(index = 3)
    public long startTs;

    @NonNull
    @ProtobufIndex(index = 5)
    public String winnerUserId;

    public static BLiveMultiPkDetail new_() {
        BLiveMultiPkDetail bLiveMultiPkDetail = new BLiveMultiPkDetail();
        bLiveMultiPkDetail.nullCheck();
        return bLiveMultiPkDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkDetail mo223809clone() {
        BLiveMultiPkDetail bLiveMultiPkDetail = new BLiveMultiPkDetail();
        bLiveMultiPkDetail.f44407id = this.f44407id;
        bLiveMultiPkDetail.stage = this.stage;
        bLiveMultiPkDetail.startTs = this.startTs;
        bLiveMultiPkDetail.duration = this.duration;
        bLiveMultiPkDetail.winnerUserId = this.winnerUserId;
        List<BLiveMultiPkPlayer> list = this.players;
        if (list != null) {
            bLiveMultiPkDetail.players = ValueObject.util_map(list, new w9j() { // from class: l.z22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveMultiPkPlayer) obj).mo223809clone();
                }
            });
        }
        return bLiveMultiPkDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkDetail)) {
            return false;
        }
        BLiveMultiPkDetail bLiveMultiPkDetail = (BLiveMultiPkDetail) obj;
        return ValueObject.util_equals(this.f44407id, bLiveMultiPkDetail.f44407id) && ValueObject.util_equals(this.stage, bLiveMultiPkDetail.stage) && this.startTs == bLiveMultiPkDetail.startTs && this.duration == bLiveMultiPkDetail.duration && ValueObject.util_equals(this.winnerUserId, bLiveMultiPkDetail.winnerUserId) && ValueObject.util_equals(this.players, bLiveMultiPkDetail.players);
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
        String str = this.f44407id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.stage;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.startTs;
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.duration) * 41;
        String str3 = this.winnerUserId;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveMultiPkPlayer> list = this.players;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44407id == null) {
            this.f44407id = "";
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.winnerUserId == null) {
            this.winnerUserId = "";
        }
        if (this.players == null) {
            this.players = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
