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
public class BLiveUndercoverVoteResult extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUndercoverVoteResult> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUndercoverVoteResult>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUndercoverVoteResult.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUndercoverVoteResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUndercoverVoteResult newInstance() {
            return new BLiveUndercoverVoteResult();
        }

        public boolean parseField(BLiveUndercoverVoteResult bLiveUndercoverVoteResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "result":
                    bLiveUndercoverVoteResult.resultStr = jsonParser.getValueAsString();
                    return true;
                case "outUserMask":
                    bLiveUndercoverVoteResult.outUserMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "outUserRole":
                    bLiveUndercoverVoteResult.outUserRole = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUndercoverVoteResult bLiveUndercoverVoteResult, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUndercoverVoteResult.resultStr;
            if (str != null) {
                jsonGenerator.writeStringField(LovePlanetStage.result, str);
            }
            String str2 = bLiveUndercoverVoteResult.outUserRole;
            if (str2 != null) {
                jsonGenerator.writeStringField("outUserRole", str2);
            }
            if (bLiveUndercoverVoteResult.outUserMask != null) {
                jsonGenerator.writeFieldName("outUserMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveUndercoverVoteResult.outUserMask, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUndercoverVoteResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveundercovervoteresult";

    @ProtobufIndex(index = 1)
    public boolean isDraw;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUserMask outUserMask;

    @NonNull
    @ProtobufIndex(index = 3)
    public String outUserRole;

    @NonNull
    @ProtobufIndex(index = 2)
    public String resultStr;

    public static BLiveUndercoverVoteResult new_() {
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = new BLiveUndercoverVoteResult();
        bLiveUndercoverVoteResult.nullCheck();
        return bLiveUndercoverVoteResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUndercoverVoteResult mo225055clone() {
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = new BLiveUndercoverVoteResult();
        bLiveUndercoverVoteResult.isDraw = this.isDraw;
        bLiveUndercoverVoteResult.resultStr = this.resultStr;
        bLiveUndercoverVoteResult.outUserRole = this.outUserRole;
        BLiveUserMask bLiveUserMask = this.outUserMask;
        if (bLiveUserMask != null) {
            bLiveUndercoverVoteResult.outUserMask = bLiveUserMask.mo225055clone();
        }
        return bLiveUndercoverVoteResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUndercoverVoteResult)) {
            return false;
        }
        BLiveUndercoverVoteResult bLiveUndercoverVoteResult = (BLiveUndercoverVoteResult) obj;
        return this.isDraw == bLiveUndercoverVoteResult.isDraw && ValueObject.util_equals(this.resultStr, bLiveUndercoverVoteResult.resultStr) && ValueObject.util_equals(this.outUserRole, bLiveUndercoverVoteResult.outUserRole) && ValueObject.util_equals(this.outUserMask, bLiveUndercoverVoteResult.outUserMask);
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
        int i2 = ((i * 41) + (this.isDraw ? 1231 : 1237)) * 41;
        String str = this.resultStr;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.outUserRole;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.outUserMask;
        int iHashCode3 = iHashCode2 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resultStr == null) {
            this.resultStr = "";
        }
        if (this.outUserRole == null) {
            this.outUserRole = "";
        }
        if (this.outUserMask == null) {
            this.outUserMask = BLiveUserMask.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "BLiveUndercoverVoteResult{isDraw=" + this.isDraw + ", resultStr='" + this.resultStr + "', outUserRole='" + this.outUserRole + "', outUserMask=" + this.outUserMask + '}';
    }
}
