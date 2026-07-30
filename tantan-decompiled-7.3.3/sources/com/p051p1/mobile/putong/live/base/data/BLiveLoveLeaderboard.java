package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveLoveLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLoveLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLoveLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLoveLeaderboard.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLoveLeaderboard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLoveLeaderboard newInstance() {
            return new BLiveLoveLeaderboard();
        }

        public boolean parseField(BLiveLoveLeaderboard bLiveLoveLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "baseAmount":
                    bLiveLoveLeaderboard.baseAmount = jsonParser.getValueAsInt();
                    return true;
                case "count":
                    bLiveLoveLeaderboard.count = jsonParser.getValueAsInt();
                    return true;
                case "medalId":
                    bLiveLoveLeaderboard.medalId = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLoveLeaderboard bLiveLoveLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", bLiveLoveLeaderboard.count);
            jsonGenerator.writeNumberField("baseAmount", bLiveLoveLeaderboard.baseAmount);
            jsonGenerator.writeNumberField("medalId", bLiveLoveLeaderboard.medalId);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLoveLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveloveleaderboard";

    @ProtobufIndex(index = 2)
    public int baseAmount;

    @ProtobufIndex(index = 1)
    public int count;

    @ProtobufIndex(index = 3)
    public int medalId;

    public static BLiveLoveLeaderboard new_() {
        BLiveLoveLeaderboard bLiveLoveLeaderboard = new BLiveLoveLeaderboard();
        bLiveLoveLeaderboard.nullCheck();
        return bLiveLoveLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLoveLeaderboard mo225055clone() {
        BLiveLoveLeaderboard bLiveLoveLeaderboard = new BLiveLoveLeaderboard();
        bLiveLoveLeaderboard.count = this.count;
        bLiveLoveLeaderboard.baseAmount = this.baseAmount;
        bLiveLoveLeaderboard.medalId = this.medalId;
        return bLiveLoveLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLoveLeaderboard)) {
            return false;
        }
        BLiveLoveLeaderboard bLiveLoveLeaderboard = (BLiveLoveLeaderboard) obj;
        return this.count == bLiveLoveLeaderboard.count && this.baseAmount == bLiveLoveLeaderboard.baseAmount && this.medalId == bLiveLoveLeaderboard.medalId;
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
        int i2 = (((((i * 41) + this.count) * 41) + this.baseAmount) * 41) + this.medalId;
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
