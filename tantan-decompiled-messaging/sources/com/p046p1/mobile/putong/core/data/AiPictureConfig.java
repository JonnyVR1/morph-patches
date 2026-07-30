package com.p046p1.mobile.putong.core.data;

import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class AiPictureConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipictureconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = 3)
    public int quick_access_limit;

    @ProtobufIndex(index = 2)
    public int timeout;
    public static ProtobufAdapter<AiPictureConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureConfig>() { // from class: com.p1.mobile.putong.core.data.AiPictureConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiPictureConfig aiPictureConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, aiPictureConfig.exp) + CodedOutputByteBufferNano.m17226h(2, aiPictureConfig.timeout) + CodedOutputByteBufferNano.m17226h(3, aiPictureConfig.quick_access_limit);
            aiPictureConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiPictureConfig parse(nb5 nb5Var) throws IOException {
            AiPictureConfig aiPictureConfig = new AiPictureConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    aiPictureConfig.exp = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    aiPictureConfig.timeout = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return aiPictureConfig;
                    }
                    aiPictureConfig.quick_access_limit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiPictureConfig aiPictureConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, aiPictureConfig.exp);
            codedOutputByteBufferNano.m17250G(2, aiPictureConfig.timeout);
            codedOutputByteBufferNano.m17250G(3, aiPictureConfig.quick_access_limit);
        }
    };
    public static JsonAdapter<AiPictureConfig> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureConfig>() { // from class: com.p1.mobile.putong.core.data.AiPictureConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiPictureConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiPictureConfig newInstance() {
            return new AiPictureConfig();
        }

        public boolean parseField(AiPictureConfig aiPictureConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timeout":
                    aiPictureConfig.timeout = jsonParser.getValueAsInt();
                    return true;
                case "exp":
                    aiPictureConfig.exp = jsonParser.getValueAsBoolean();
                    return true;
                case "quick_access_limit":
                    aiPictureConfig.quick_access_limit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AiPictureConfig aiPictureConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "timeout":
                case "exp":
                case "quick_access_limit":
                    return true;
                default:
                    return super.parseFieldCheck(aiPictureConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiPictureConfig aiPictureConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(AuthenticationTokenClaims.JSON_KEY_EXP, aiPictureConfig.exp);
            jsonGenerator.writeNumberField("timeout", aiPictureConfig.timeout);
            jsonGenerator.writeNumberField("quick_access_limit", aiPictureConfig.quick_access_limit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureConfig new_() {
        AiPictureConfig aiPictureConfig = new AiPictureConfig();
        aiPictureConfig.nullCheck();
        return aiPictureConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiPictureConfig mo223809clone() {
        AiPictureConfig aiPictureConfig = new AiPictureConfig();
        aiPictureConfig.exp = this.exp;
        aiPictureConfig.timeout = this.timeout;
        aiPictureConfig.quick_access_limit = this.quick_access_limit;
        return aiPictureConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiPictureConfig)) {
            return false;
        }
        AiPictureConfig aiPictureConfig = (AiPictureConfig) obj;
        return this.exp == aiPictureConfig.exp && this.timeout == aiPictureConfig.timeout && this.quick_access_limit == aiPictureConfig.quick_access_limit;
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
        int i2 = (((((i * 41) + (this.exp ? 1231 : 1237)) * 41) + this.timeout) * 41) + this.quick_access_limit;
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
