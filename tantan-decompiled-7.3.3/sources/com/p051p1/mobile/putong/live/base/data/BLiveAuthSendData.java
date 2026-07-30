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
public class BLiveAuthSendData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuthSendData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuthSendData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuthSendData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuthSendData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuthSendData newInstance() {
            return new BLiveAuthSendData();
        }

        public boolean parseField(BLiveAuthSendData bLiveAuthSendData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pubKey")) {
                bLiveAuthSendData.pubKey = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("ua")) {
                return false;
            }
            bLiveAuthSendData.f45183ua = BLiveAuthSendUa.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuthSendData bLiveAuthSendData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuthSendData.pubKey;
            if (str != null) {
                jsonGenerator.writeStringField("pubKey", str);
            }
            if (bLiveAuthSendData.f45183ua != null) {
                jsonGenerator.writeFieldName("ua");
                BLiveAuthSendUa.JSON_ADAPTER.serialize(bLiveAuthSendData.f45183ua, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuthSendData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauthsenddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String pubKey;

    /* JADX INFO: renamed from: ua */
    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveAuthSendUa f45183ua;

    public static BLiveAuthSendData new_() {
        BLiveAuthSendData bLiveAuthSendData = new BLiveAuthSendData();
        bLiveAuthSendData.nullCheck();
        return bLiveAuthSendData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuthSendData mo225055clone() {
        BLiveAuthSendData bLiveAuthSendData = new BLiveAuthSendData();
        bLiveAuthSendData.pubKey = this.pubKey;
        BLiveAuthSendUa bLiveAuthSendUa = this.f45183ua;
        if (bLiveAuthSendUa != null) {
            bLiveAuthSendData.f45183ua = bLiveAuthSendUa.mo225055clone();
        }
        return bLiveAuthSendData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuthSendData)) {
            return false;
        }
        BLiveAuthSendData bLiveAuthSendData = (BLiveAuthSendData) obj;
        return ValueObject.util_equals(this.pubKey, bLiveAuthSendData.pubKey) && ValueObject.util_equals(this.f45183ua, bLiveAuthSendData.f45183ua);
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
        BLiveAuthSendUa bLiveAuthSendUa = this.f45183ua;
        int iHashCode2 = iHashCode + (bLiveAuthSendUa != null ? bLiveAuthSendUa.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pubKey == null) {
            this.pubKey = "";
        }
        if (this.f45183ua == null) {
            this.f45183ua = BLiveAuthSendUa.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
