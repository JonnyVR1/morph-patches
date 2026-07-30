package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveJsAudienceInfo;
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
public class BLiveJsAudienceInfoData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJsAudienceInfoData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJsAudienceInfoData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJsAudienceInfoData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJsAudienceInfoData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJsAudienceInfoData newInstance() {
            return new BLiveJsAudienceInfoData();
        }

        public boolean parseField(BLiveJsAudienceInfoData bLiveJsAudienceInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("audienceList")) {
                return false;
            }
            bLiveJsAudienceInfoData.audienceList = JsonAdapter.parseArray(jsonParser, BLiveJsAudienceInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJsAudienceInfoData bLiveJsAudienceInfoData, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveJsAudienceInfoData.audienceList != null) {
                jsonGenerator.writeFieldName("audienceList");
                JsonAdapter.serializeArray(bLiveJsAudienceInfoData.audienceList, jsonGenerator, BLiveJsAudienceInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJsAudienceInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejsaudienceinfodata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveJsAudienceInfo> audienceList;

    public static BLiveJsAudienceInfoData new_() {
        BLiveJsAudienceInfoData bLiveJsAudienceInfoData = new BLiveJsAudienceInfoData();
        bLiveJsAudienceInfoData.nullCheck();
        return bLiveJsAudienceInfoData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJsAudienceInfoData mo225055clone() {
        BLiveJsAudienceInfoData bLiveJsAudienceInfoData = new BLiveJsAudienceInfoData();
        List<BLiveJsAudienceInfo> list = this.audienceList;
        if (list != null) {
            bLiveJsAudienceInfoData.audienceList = ValueObject.util_map(list, new qcj() { // from class: l.z12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveJsAudienceInfo) obj).mo225055clone();
                }
            });
        }
        return bLiveJsAudienceInfoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveJsAudienceInfoData) {
            return ValueObject.util_equals(this.audienceList, ((BLiveJsAudienceInfoData) obj).audienceList);
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
        List<BLiveJsAudienceInfo> list = this.audienceList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.audienceList == null) {
            this.audienceList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
