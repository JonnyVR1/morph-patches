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
public class BLiveFanBaseActivityScores extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseActivityScores> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseActivityScores>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseActivityScores.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseActivityScores.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseActivityScores newInstance() {
            return new BLiveFanBaseActivityScores();
        }

        public boolean parseField(BLiveFanBaseActivityScores bLiveFanBaseActivityScores, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("total")) {
                return false;
            }
            bLiveFanBaseActivityScores.total = BLiveFanBaseScoresInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseActivityScores bLiveFanBaseActivityScores, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveFanBaseActivityScores.total != null) {
                jsonGenerator.writeFieldName("total");
                BLiveFanBaseScoresInfo.JSON_ADAPTER.serialize(bLiveFanBaseActivityScores.total, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseActivityScores) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbaseactivityscores";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveFanBaseScoresInfo total;

    public static BLiveFanBaseActivityScores new_() {
        BLiveFanBaseActivityScores bLiveFanBaseActivityScores = new BLiveFanBaseActivityScores();
        bLiveFanBaseActivityScores.nullCheck();
        return bLiveFanBaseActivityScores;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseActivityScores mo225055clone() {
        BLiveFanBaseActivityScores bLiveFanBaseActivityScores = new BLiveFanBaseActivityScores();
        BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo = this.total;
        if (bLiveFanBaseScoresInfo != null) {
            bLiveFanBaseActivityScores.total = bLiveFanBaseScoresInfo.mo225055clone();
        }
        return bLiveFanBaseActivityScores;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveFanBaseActivityScores) {
            return ValueObject.util_equals(this.total, ((BLiveFanBaseActivityScores) obj).total);
        }
        return false;
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
        BLiveFanBaseScoresInfo bLiveFanBaseScoresInfo = this.total;
        int iHashCode = i2 + (bLiveFanBaseScoresInfo != null ? bLiveFanBaseScoresInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.total == null) {
            this.total = BLiveFanBaseScoresInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
