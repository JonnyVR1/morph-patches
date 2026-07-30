package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveStreamCdnInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStreamCdnInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStreamCdnInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStreamCdnInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStreamCdnInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStreamCdnInfo newInstance() {
            return new BLiveStreamCdnInfo();
        }

        public boolean parseField(BLiveStreamCdnInfo bLiveStreamCdnInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("provider")) {
                bLiveStreamCdnInfo.provider = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("businessType")) {
                return false;
            }
            bLiveStreamCdnInfo.businessType = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStreamCdnInfo bLiveStreamCdnInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("provider", bLiveStreamCdnInfo.provider);
            jsonGenerator.writeNumberField("businessType", bLiveStreamCdnInfo.businessType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStreamCdnInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestreamcdninfo";

    @ProtobufIndex(index = 2)
    public int businessType;

    @ProtobufIndex(index = 1)
    public int provider;

    public static BLiveStreamCdnInfo new_() {
        BLiveStreamCdnInfo bLiveStreamCdnInfo = new BLiveStreamCdnInfo();
        bLiveStreamCdnInfo.nullCheck();
        return bLiveStreamCdnInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStreamCdnInfo mo223809clone() {
        BLiveStreamCdnInfo bLiveStreamCdnInfo = new BLiveStreamCdnInfo();
        bLiveStreamCdnInfo.provider = this.provider;
        bLiveStreamCdnInfo.businessType = this.businessType;
        return bLiveStreamCdnInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStreamCdnInfo)) {
            return false;
        }
        BLiveStreamCdnInfo bLiveStreamCdnInfo = (BLiveStreamCdnInfo) obj;
        return this.provider == bLiveStreamCdnInfo.provider && this.businessType == bLiveStreamCdnInfo.businessType;
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
        int i2 = (((i * 41) + this.provider) * 41) + this.businessType;
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
