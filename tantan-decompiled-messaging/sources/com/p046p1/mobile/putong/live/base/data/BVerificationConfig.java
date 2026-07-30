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
public class BVerificationConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BVerificationConfig> JSON_ADAPTER = new ObjectJsonAdapter<BVerificationConfig>() { // from class: com.p1.mobile.putong.live.base.data.BVerificationConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BVerificationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BVerificationConfig newInstance() {
            return new BVerificationConfig();
        }

        public boolean parseField(BVerificationConfig bVerificationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("createAnchorInterfaceType")) {
                return false;
            }
            bVerificationConfig.createAnchorInterfaceType = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BVerificationConfig bVerificationConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bVerificationConfig.createAnchorInterfaceType;
            if (str != null) {
                jsonGenerator.writeStringField("createAnchorInterfaceType", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BVerificationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bverificationconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String createAnchorInterfaceType;

    public static BVerificationConfig new_() {
        BVerificationConfig bVerificationConfig = new BVerificationConfig();
        bVerificationConfig.nullCheck();
        return bVerificationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BVerificationConfig mo223809clone() {
        BVerificationConfig bVerificationConfig = new BVerificationConfig();
        bVerificationConfig.createAnchorInterfaceType = this.createAnchorInterfaceType;
        return bVerificationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BVerificationConfig) {
            return ValueObject.util_equals(this.createAnchorInterfaceType, ((BVerificationConfig) obj).createAnchorInterfaceType);
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
        String str = this.createAnchorInterfaceType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.createAnchorInterfaceType == null) {
            this.createAnchorInterfaceType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
