package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
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
public class BLiveVoiceCpLeaderBoards extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCpLeaderBoards> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCpLeaderBoards>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCpLeaderBoards.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCpLeaderBoards.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCpLeaderBoards newInstance() {
            return new BLiveVoiceCpLeaderBoards();
        }

        public boolean parseField(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("topCpList")) {
                bLiveVoiceCpLeaderBoards.topCpList = JsonAdapter.parseArray(jsonParser, BLiveSweetCpRankInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meMaxCpInfo")) {
                return false;
            }
            bLiveVoiceCpLeaderBoards.meMaxCpInfo = BLiveVoiceCpHouseInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceCpLeaderBoards.meMaxCpInfo != null) {
                jsonGenerator.writeFieldName("meMaxCpInfo");
                BLiveVoiceCpHouseInfo.JSON_ADAPTER.serialize(bLiveVoiceCpLeaderBoards.meMaxCpInfo, jsonGenerator, true);
            }
            if (bLiveVoiceCpLeaderBoards.topCpList != null) {
                jsonGenerator.writeFieldName("topCpList");
                JsonAdapter.serializeArray(bLiveVoiceCpLeaderBoards.topCpList, jsonGenerator, BLiveSweetCpRankInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCpLeaderBoards) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecpleaderboards";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVoiceCpHouseInfo meMaxCpInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveSweetCpRankInfo> topCpList;

    public static BLiveVoiceCpLeaderBoards new_() {
        BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards = new BLiveVoiceCpLeaderBoards();
        bLiveVoiceCpLeaderBoards.nullCheck();
        return bLiveVoiceCpLeaderBoards;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCpLeaderBoards mo225055clone() {
        BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards = new BLiveVoiceCpLeaderBoards();
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.meMaxCpInfo;
        if (bLiveVoiceCpHouseInfo != null) {
            bLiveVoiceCpLeaderBoards.meMaxCpInfo = bLiveVoiceCpHouseInfo.mo225055clone();
        }
        List<BLiveSweetCpRankInfo> list = this.topCpList;
        if (list != null) {
            bLiveVoiceCpLeaderBoards.topCpList = ValueObject.util_map(list, new qcj() { // from class: l.t82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSweetCpRankInfo) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceCpLeaderBoards;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCpLeaderBoards)) {
            return false;
        }
        BLiveVoiceCpLeaderBoards bLiveVoiceCpLeaderBoards = (BLiveVoiceCpLeaderBoards) obj;
        return ValueObject.util_equals(this.meMaxCpInfo, bLiveVoiceCpLeaderBoards.meMaxCpInfo) && ValueObject.util_equals(this.topCpList, bLiveVoiceCpLeaderBoards.topCpList);
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
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.meMaxCpInfo;
        int iHashCode = (i2 + (bLiveVoiceCpHouseInfo != null ? bLiveVoiceCpHouseInfo.hashCode() : 0)) * 41;
        List<BLiveSweetCpRankInfo> list = this.topCpList;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meMaxCpInfo == null) {
            this.meMaxCpInfo = BLiveVoiceCpHouseInfo.new_();
        }
        if (this.topCpList == null) {
            this.topCpList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
