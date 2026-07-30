package com.p051p1.mobile.putong.core.data;

import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class WoodenFishConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "woodenfishconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;
    public static ProtobufAdapter<WoodenFishConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WoodenFishConfig>() { // from class: com.p1.mobile.putong.core.data.WoodenFishConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WoodenFishConfig woodenFishConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, woodenFishConfig.exp);
            woodenFishConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WoodenFishConfig parse(nc5 nc5Var) throws IOException {
            WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
            while (nc5Var.m162497u() == 8) {
                woodenFishConfig.exp = nc5Var.m162483g();
            }
            return woodenFishConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WoodenFishConfig woodenFishConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, woodenFishConfig.exp);
        }
    };
    public static JsonAdapter<WoodenFishConfig> JSON_ADAPTER = new ObjectJsonAdapter<WoodenFishConfig>() { // from class: com.p1.mobile.putong.core.data.WoodenFishConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WoodenFishConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WoodenFishConfig newInstance() {
            return new WoodenFishConfig();
        }

        public boolean parseField(WoodenFishConfig woodenFishConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                return false;
            }
            woodenFishConfig.exp = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(WoodenFishConfig woodenFishConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                return true;
            }
            return super.parseFieldCheck(woodenFishConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WoodenFishConfig woodenFishConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(AuthenticationTokenClaims.JSON_KEY_EXP, woodenFishConfig.exp);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WoodenFishConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WoodenFishConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WoodenFishConfig new_() {
        WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
        woodenFishConfig.nullCheck();
        return woodenFishConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WoodenFishConfig mo225055clone() {
        WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
        woodenFishConfig.exp = this.exp;
        return woodenFishConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WoodenFishConfig) && this.exp == ((WoodenFishConfig) obj).exp;
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
        int i2 = (i * 41) + (this.exp ? 1231 : 1237);
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
