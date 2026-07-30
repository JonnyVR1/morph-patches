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
public class BLiveGiftExtraPkInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraPkInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraPkInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraPkInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraPkInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraPkInfo newInstance() {
            return new BLiveGiftExtraPkInfo();
        }

        public boolean parseField(BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("pkId")) {
                return false;
            }
            bLiveGiftExtraPkInfo.pkId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraPkInfo.pkId;
            if (str != null) {
                jsonGenerator.writeStringField("pkId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraPkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextrapkinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String pkId;

    public static BLiveGiftExtraPkInfo new_() {
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo = new BLiveGiftExtraPkInfo();
        bLiveGiftExtraPkInfo.nullCheck();
        return bLiveGiftExtraPkInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraPkInfo mo225055clone() {
        BLiveGiftExtraPkInfo bLiveGiftExtraPkInfo = new BLiveGiftExtraPkInfo();
        bLiveGiftExtraPkInfo.pkId = this.pkId;
        return bLiveGiftExtraPkInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGiftExtraPkInfo) {
            return ValueObject.util_equals(this.pkId, ((BLiveGiftExtraPkInfo) obj).pkId);
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
        String str = this.pkId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pkId == null) {
            this.pkId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
