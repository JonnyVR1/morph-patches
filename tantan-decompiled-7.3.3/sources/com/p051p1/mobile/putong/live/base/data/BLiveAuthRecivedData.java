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
public class BLiveAuthRecivedData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuthRecivedData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuthRecivedData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuthRecivedData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuthRecivedData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuthRecivedData newInstance() {
            return new BLiveAuthRecivedData();
        }

        public boolean parseField(BLiveAuthRecivedData bLiveAuthRecivedData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pubKey")) {
                bLiveAuthRecivedData.pubKey = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("sign")) {
                return false;
            }
            bLiveAuthRecivedData.sign = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuthRecivedData bLiveAuthRecivedData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuthRecivedData.pubKey;
            if (str != null) {
                jsonGenerator.writeStringField("pubKey", str);
            }
            String str2 = bLiveAuthRecivedData.sign;
            if (str2 != null) {
                jsonGenerator.writeStringField("sign", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuthRecivedData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauthreciveddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String pubKey;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sign;

    public static BLiveAuthRecivedData new_() {
        BLiveAuthRecivedData bLiveAuthRecivedData = new BLiveAuthRecivedData();
        bLiveAuthRecivedData.nullCheck();
        return bLiveAuthRecivedData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuthRecivedData mo225055clone() {
        BLiveAuthRecivedData bLiveAuthRecivedData = new BLiveAuthRecivedData();
        bLiveAuthRecivedData.pubKey = this.pubKey;
        bLiveAuthRecivedData.sign = this.sign;
        return bLiveAuthRecivedData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuthRecivedData)) {
            return false;
        }
        BLiveAuthRecivedData bLiveAuthRecivedData = (BLiveAuthRecivedData) obj;
        return ValueObject.util_equals(this.pubKey, bLiveAuthRecivedData.pubKey) && ValueObject.util_equals(this.sign, bLiveAuthRecivedData.sign);
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
        String str = this.pubKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sign;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pubKey == null) {
            this.pubKey = "";
        }
        if (this.sign == null) {
            this.sign = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
