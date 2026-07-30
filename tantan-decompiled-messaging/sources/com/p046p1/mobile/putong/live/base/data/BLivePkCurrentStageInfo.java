package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLivePkCurrentStageInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkCurrentStageInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkCurrentStageInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkCurrentStageInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkCurrentStageInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkCurrentStageInfo newInstance() {
            return new BLivePkCurrentStageInfo();
        }

        public boolean parseField(BLivePkCurrentStageInfo bLivePkCurrentStageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLivePkCurrentStageInfo.duration = jsonParser.getValueAsInt();
                    return true;
                case "startTs":
                    bLivePkCurrentStageInfo.startTs = jsonParser.getValueAsString();
                    return true;
                case "stage":
                    bLivePkCurrentStageInfo.stage = BLivePkStage.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkCurrentStageInfo bLivePkCurrentStageInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkCurrentStageInfo.stage != null) {
                jsonGenerator.writeFieldName("stage");
                BLivePkStage.JSON_ADAPTER.serialize(bLivePkCurrentStageInfo.stage, jsonGenerator, true);
            }
            String str = bLivePkCurrentStageInfo.startTs;
            if (str != null) {
                jsonGenerator.writeStringField("startTs", str);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLivePkCurrentStageInfo.duration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkCurrentStageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkcurrentstageinfo";

    @ProtobufIndex(index = 3)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLivePkStage stage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String startTs;

    public static BLivePkCurrentStageInfo new_() {
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = new BLivePkCurrentStageInfo();
        bLivePkCurrentStageInfo.nullCheck();
        return bLivePkCurrentStageInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkCurrentStageInfo mo223809clone() {
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = new BLivePkCurrentStageInfo();
        bLivePkCurrentStageInfo.stage = this.stage;
        bLivePkCurrentStageInfo.startTs = this.startTs;
        bLivePkCurrentStageInfo.duration = this.duration;
        return bLivePkCurrentStageInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkCurrentStageInfo)) {
            return false;
        }
        BLivePkCurrentStageInfo bLivePkCurrentStageInfo = (BLivePkCurrentStageInfo) obj;
        return ValueObject.util_equals(this.stage, bLivePkCurrentStageInfo.stage) && ValueObject.util_equals(this.startTs, bLivePkCurrentStageInfo.startTs) && this.duration == bLivePkCurrentStageInfo.duration;
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
        BLivePkStage bLivePkStage = this.stage;
        int iHashCode = (i2 + (bLivePkStage != null ? bLivePkStage.hashCode() : 0)) * 41;
        String str = this.startTs;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.duration;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.stage == null) {
            this.stage = (BLivePkStage) BLivePkStage.JSON_ADAPTER.defaultEnum();
        }
        if (this.startTs == null) {
            this.startTs = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
