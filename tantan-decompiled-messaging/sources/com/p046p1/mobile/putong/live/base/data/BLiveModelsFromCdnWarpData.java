package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveModelsFromCdnWarpData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveModelsFromCdnWarpData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveModelsFromCdnWarpData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveModelsFromCdnWarpData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveModelsFromCdnWarpData newInstance() {
            return new BLiveModelsFromCdnWarpData();
        }

        public boolean parseField(BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                bLiveModelsFromCdnWarpData.version = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("liveModels")) {
                return false;
            }
            bLiveModelsFromCdnWarpData.liveModels = BLiveMedals.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveModelsFromCdnWarpData.liveModels != null) {
                jsonGenerator.writeFieldName("liveModels");
                BLiveMedals.JSON_ADAPTER.serialize(bLiveModelsFromCdnWarpData.liveModels, jsonGenerator, true);
            }
            String str = bLiveModelsFromCdnWarpData.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveModelsFromCdnWarpData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemodelsfromcdnwarpdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveMedals liveModels;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveModelsFromCdnWarpData new_() {
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = new BLiveModelsFromCdnWarpData();
        bLiveModelsFromCdnWarpData.nullCheck();
        return bLiveModelsFromCdnWarpData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveModelsFromCdnWarpData mo223809clone() {
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = new BLiveModelsFromCdnWarpData();
        BLiveMedals bLiveMedals = this.liveModels;
        if (bLiveMedals != null) {
            bLiveModelsFromCdnWarpData.liveModels = bLiveMedals.mo223809clone();
        }
        bLiveModelsFromCdnWarpData.version = this.version;
        return bLiveModelsFromCdnWarpData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveModelsFromCdnWarpData)) {
            return false;
        }
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = (BLiveModelsFromCdnWarpData) obj;
        return ValueObject.util_equals(this.liveModels, bLiveModelsFromCdnWarpData.liveModels) && ValueObject.util_equals(this.version, bLiveModelsFromCdnWarpData.version);
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
        BLiveMedals bLiveMedals = this.liveModels;
        int iHashCode = (i2 + (bLiveMedals != null ? bLiveMedals.hashCode() : 0)) * 41;
        String str = this.version;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveModels == null) {
            this.liveModels = BLiveMedals.new_();
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
