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
public class BLiveLiveMedalCDN extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLiveMedalCDN> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLiveMedalCDN>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLiveMedalCDN.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLiveMedalCDN.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLiveMedalCDN newInstance() {
            return new BLiveLiveMedalCDN();
        }

        public boolean parseField(BLiveLiveMedalCDN bLiveLiveMedalCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("cdnUrl")) {
                bLiveLiveMedalCDN.cdnUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            bLiveLiveMedalCDN.version = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLiveMedalCDN bLiveLiveMedalCDN, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLiveMedalCDN.cdnUrl;
            if (str != null) {
                jsonGenerator.writeStringField("cdnUrl", str);
            }
            String str2 = bLiveLiveMedalCDN.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLiveMedalCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelivemedalcdn";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cdnUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveLiveMedalCDN new_() {
        BLiveLiveMedalCDN bLiveLiveMedalCDN = new BLiveLiveMedalCDN();
        bLiveLiveMedalCDN.nullCheck();
        return bLiveLiveMedalCDN;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLiveMedalCDN mo223809clone() {
        BLiveLiveMedalCDN bLiveLiveMedalCDN = new BLiveLiveMedalCDN();
        bLiveLiveMedalCDN.cdnUrl = this.cdnUrl;
        bLiveLiveMedalCDN.version = this.version;
        return bLiveLiveMedalCDN;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLiveMedalCDN)) {
            return false;
        }
        BLiveLiveMedalCDN bLiveLiveMedalCDN = (BLiveLiveMedalCDN) obj;
        return ValueObject.util_equals(this.cdnUrl, bLiveLiveMedalCDN.cdnUrl) && ValueObject.util_equals(this.version, bLiveLiveMedalCDN.version);
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
        String str = this.cdnUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cdnUrl == null) {
            this.cdnUrl = "";
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
