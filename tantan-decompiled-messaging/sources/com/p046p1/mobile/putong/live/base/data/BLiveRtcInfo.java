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
public class BLiveRtcInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRtcInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRtcInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRtcInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRtcInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRtcInfo newInstance() {
            return new BLiveRtcInfo();
        }

        public boolean parseField(BLiveRtcInfo bLiveRtcInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("provider")) {
                return false;
            }
            bLiveRtcInfo.provider = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRtcInfo bLiveRtcInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRtcInfo.provider;
            if (str != null) {
                jsonGenerator.writeStringField("provider", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRtcInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivertcinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String provider;

    public static BLiveRtcInfo new_() {
        BLiveRtcInfo bLiveRtcInfo = new BLiveRtcInfo();
        bLiveRtcInfo.nullCheck();
        return bLiveRtcInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRtcInfo mo223809clone() {
        BLiveRtcInfo bLiveRtcInfo = new BLiveRtcInfo();
        bLiveRtcInfo.provider = this.provider;
        return bLiveRtcInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveRtcInfo) {
            return ValueObject.util_equals(this.provider, ((BLiveRtcInfo) obj).provider);
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
        String str = this.provider;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
