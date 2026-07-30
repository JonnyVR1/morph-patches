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
import p153l.bu6;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkSituation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSituation> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSituation>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSituation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSituation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSituation newInstance() {
            return new BLivePkSituation();
        }

        public boolean parseField(BLivePkSituation bLivePkSituation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "currentStageInfo":
                    bLivePkSituation.currentStageInfo = BLivePkCurrentStageInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isTied":
                    bLivePkSituation.isTied = jsonParser.getValueAsBoolean();
                    return true;
                case "winnerId":
                    bLivePkSituation.winnerId = jsonParser.getValueAsString();
                    return true;
                case "points":
                    bLivePkSituation.points = bu6.f78430b.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSituation bLivePkSituation, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkSituation.currentStageInfo != null) {
                jsonGenerator.writeFieldName("currentStageInfo");
                BLivePkCurrentStageInfo.JSON_ADAPTER.serialize(bLivePkSituation.currentStageInfo, jsonGenerator, true);
            }
            if (bLivePkSituation.points != null) {
                jsonGenerator.writeFieldName("points");
                bu6.f78430b.serialize(bLivePkSituation.points, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isTied", bLivePkSituation.isTied);
            String str = bLivePkSituation.winnerId;
            if (str != null) {
                jsonGenerator.writeStringField("winnerId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSituation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksituation";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLivePkCurrentStageInfo currentStageInfo;

    @ProtobufIndex(index = 3)
    public boolean isTied;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLivePkPointList points;

    @NonNull
    @ProtobufIndex(index = 4)
    public String winnerId;

    public static BLivePkSituation new_() {
        BLivePkSituation bLivePkSituation = new BLivePkSituation();
        bLivePkSituation.nullCheck();
        return bLivePkSituation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSituation mo225055clone() {
        BLivePkSituation bLivePkSituation = new BLivePkSituation();
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = this.currentStageInfo;
        if (bLivePkCurrentStageInfo != null) {
            bLivePkSituation.currentStageInfo = bLivePkCurrentStageInfo.mo225055clone();
        }
        BLivePkPointList bLivePkPointList = this.points;
        if (bLivePkPointList != null) {
            bLivePkSituation.points = bLivePkPointList.mo225055clone();
        }
        bLivePkSituation.isTied = this.isTied;
        bLivePkSituation.winnerId = this.winnerId;
        return bLivePkSituation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkSituation)) {
            return false;
        }
        BLivePkSituation bLivePkSituation = (BLivePkSituation) obj;
        return ValueObject.util_equals(this.currentStageInfo, bLivePkSituation.currentStageInfo) && ValueObject.util_equals(this.points, bLivePkSituation.points) && this.isTied == bLivePkSituation.isTied && ValueObject.util_equals(this.winnerId, bLivePkSituation.winnerId);
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
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = this.currentStageInfo;
        int iHashCode = (i2 + (bLivePkCurrentStageInfo != null ? bLivePkCurrentStageInfo.hashCode() : 0)) * 41;
        BLivePkPointList bLivePkPointList = this.points;
        int iHashCode2 = (((iHashCode + (bLivePkPointList != null ? bLivePkPointList.hashCode() : 0)) * 41) + (this.isTied ? 1231 : 1237)) * 41;
        String str = this.winnerId;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentStageInfo == null) {
            this.currentStageInfo = BLivePkCurrentStageInfo.new_();
        }
        if (this.points == null) {
            this.points = BLivePkPointList.new_();
        }
        if (this.winnerId == null) {
            this.winnerId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
