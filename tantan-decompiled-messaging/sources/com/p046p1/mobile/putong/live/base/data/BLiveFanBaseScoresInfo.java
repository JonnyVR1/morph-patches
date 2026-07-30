package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveFanBaseScoresInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseScoresInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseScoresInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseScoresInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseScoresInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseScoresInfo newInstance() {
            return new BLiveFanBaseScoresInfo();
        }

        public boolean parseField(BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLivePkCategory.rank)) {
                bLiveFanBaseScoresInfo.rank = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.SCORE)) {
                return false;
            }
            bLiveFanBaseScoresInfo.score = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveFanBaseScoresInfo.score);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveFanBaseScoresInfo.rank);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseScoresInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasescoresinfo";

    @ProtobufIndex(index = 2)
    public int rank;

    @ProtobufIndex(index = 1)
    public long score;

    public static BLiveFanBaseScoresInfo new_() {
        BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo = new BLiveFanBaseScoresInfo();
        bLiveFanBaseScoresInfo.nullCheck();
        return bLiveFanBaseScoresInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseScoresInfo mo223809clone() {
        BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo = new BLiveFanBaseScoresInfo();
        bLiveFanBaseScoresInfo.score = this.score;
        bLiveFanBaseScoresInfo.rank = this.rank;
        return bLiveFanBaseScoresInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseScoresInfo)) {
            return false;
        }
        BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo = (BLiveFanBaseScoresInfo) obj;
        return this.score == bLiveFanBaseScoresInfo.score && this.rank == bLiveFanBaseScoresInfo.rank;
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
        long j = this.score;
        int i2 = (((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.rank;
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
