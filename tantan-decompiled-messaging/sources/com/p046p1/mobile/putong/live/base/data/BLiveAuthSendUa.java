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
public class BLiveAuthSendUa extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuthSendUa> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuthSendUa>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuthSendUa.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuthSendUa.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuthSendUa newInstance() {
            return new BLiveAuthSendUa();
        }

        public boolean parseField(BLiveAuthSendUa bLiveAuthSendUa, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    bLiveAuthSendUa.source = jsonParser.getValueAsString();
                    return true;
                case "brand":
                    bLiveAuthSendUa.brand = jsonParser.getValueAsString();
                    return true;
                case "model":
                    bLiveAuthSendUa.model = jsonParser.getValueAsString();
                    return true;
                case "sourceVersion":
                    bLiveAuthSendUa.sourceVersion = jsonParser.getValueAsString();
                    return true;
                case "appVersion":
                    bLiveAuthSendUa.appVersion = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuthSendUa bLiveAuthSendUa, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuthSendUa.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
            String str2 = bLiveAuthSendUa.appVersion;
            if (str2 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str2);
            }
            String str3 = bLiveAuthSendUa.sourceVersion;
            if (str3 != null) {
                jsonGenerator.writeStringField("sourceVersion", str3);
            }
            String str4 = bLiveAuthSendUa.brand;
            if (str4 != null) {
                jsonGenerator.writeStringField("brand", str4);
            }
            String str5 = bLiveAuthSendUa.model;
            if (str5 != null) {
                jsonGenerator.writeStringField("model", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuthSendUa) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauthsendua";

    @NonNull
    @ProtobufIndex(index = 2)
    public String appVersion;

    @NonNull
    @ProtobufIndex(index = 4)
    public String brand;

    @NonNull
    @ProtobufIndex(index = 5)
    public String model;

    @NonNull
    @ProtobufIndex(index = 1)
    public String source;

    @NonNull
    @ProtobufIndex(index = 3)
    public String sourceVersion;

    public static BLiveAuthSendUa new_() {
        BLiveAuthSendUa bLiveAuthSendUa = new BLiveAuthSendUa();
        bLiveAuthSendUa.nullCheck();
        return bLiveAuthSendUa;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuthSendUa mo223809clone() {
        BLiveAuthSendUa bLiveAuthSendUa = new BLiveAuthSendUa();
        bLiveAuthSendUa.source = this.source;
        bLiveAuthSendUa.appVersion = this.appVersion;
        bLiveAuthSendUa.sourceVersion = this.sourceVersion;
        bLiveAuthSendUa.brand = this.brand;
        bLiveAuthSendUa.model = this.model;
        return bLiveAuthSendUa;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuthSendUa)) {
            return false;
        }
        BLiveAuthSendUa bLiveAuthSendUa = (BLiveAuthSendUa) obj;
        return ValueObject.util_equals(this.source, bLiveAuthSendUa.source) && ValueObject.util_equals(this.appVersion, bLiveAuthSendUa.appVersion) && ValueObject.util_equals(this.sourceVersion, bLiveAuthSendUa.sourceVersion) && ValueObject.util_equals(this.brand, bLiveAuthSendUa.brand) && ValueObject.util_equals(this.model, bLiveAuthSendUa.model);
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
        String str = this.source;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.sourceVersion;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.brand;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.model;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.appVersion == null) {
            this.appVersion = "";
        }
        if (this.sourceVersion == null) {
            this.sourceVersion = "";
        }
        if (this.brand == null) {
            this.brand = "";
        }
        if (this.model == null) {
            this.model = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
