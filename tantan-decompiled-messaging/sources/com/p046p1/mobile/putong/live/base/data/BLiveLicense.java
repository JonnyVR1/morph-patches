package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
public class BLiveLicense extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLicense> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLicense>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLicense.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLicense.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLicense newInstance() {
            return new BLiveLicense();
        }

        public boolean parseField(BLiveLicense bLiveLicense, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("secretKey")) {
                bLiveLicense.secretKey = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(RemoteConfigConstants.RequestFieldKey.APP_ID)) {
                return false;
            }
            bLiveLicense.appId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLicense bLiveLicense, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLicense.secretKey;
            if (str != null) {
                jsonGenerator.writeStringField("secretKey", str);
            }
            String str2 = bLiveLicense.appId;
            if (str2 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLicense) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelicense";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String secretKey;

    public static BLiveLicense new_() {
        BLiveLicense bLiveLicense = new BLiveLicense();
        bLiveLicense.nullCheck();
        return bLiveLicense;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLicense mo223809clone() {
        BLiveLicense bLiveLicense = new BLiveLicense();
        bLiveLicense.secretKey = this.secretKey;
        bLiveLicense.appId = this.appId;
        return bLiveLicense;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLicense)) {
            return false;
        }
        BLiveLicense bLiveLicense = (BLiveLicense) obj;
        return ValueObject.util_equals(this.secretKey, bLiveLicense.secretKey) && ValueObject.util_equals(this.appId, bLiveLicense.appId);
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
        String str = this.secretKey;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.secretKey == null) {
            this.secretKey = "";
        }
        if (this.appId == null) {
            this.appId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
