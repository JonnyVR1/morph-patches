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
public class BLiveOfficialShowInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOfficialShowInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOfficialShowInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOfficialShowInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOfficialShowInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOfficialShowInfo newInstance() {
            return new BLiveOfficialShowInfo();
        }

        public boolean parseField(BLiveOfficialShowInfo bLiveOfficialShowInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showLiveId")) {
                return false;
            }
            bLiveOfficialShowInfo.showLiveId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOfficialShowInfo bLiveOfficialShowInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOfficialShowInfo.showLiveId;
            if (str != null) {
                jsonGenerator.writeStringField("showLiveId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOfficialShowInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveofficialshowinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String showLiveId;

    public static BLiveOfficialShowInfo new_() {
        BLiveOfficialShowInfo bLiveOfficialShowInfo = new BLiveOfficialShowInfo();
        bLiveOfficialShowInfo.nullCheck();
        return bLiveOfficialShowInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOfficialShowInfo mo225055clone() {
        BLiveOfficialShowInfo bLiveOfficialShowInfo = new BLiveOfficialShowInfo();
        bLiveOfficialShowInfo.showLiveId = this.showLiveId;
        return bLiveOfficialShowInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveOfficialShowInfo) {
            return ValueObject.util_equals(this.showLiveId, ((BLiveOfficialShowInfo) obj).showLiveId);
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
        String str = this.showLiveId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showLiveId == null) {
            this.showLiveId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
