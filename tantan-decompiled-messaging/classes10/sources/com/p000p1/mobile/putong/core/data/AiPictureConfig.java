package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AiPictureConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aipictureconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int quick_access_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int timeout;
    public static ProtobufAdapter<AiPictureConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiPictureConfig>() { // from class: com.p1.mobile.putong.core.data.AiPictureConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiPictureConfig aiPictureConfig) {
            int iB = CodedOutputByteBufferNano.b(1, aiPictureConfig.exp) + CodedOutputByteBufferNano.h(2, aiPictureConfig.timeout) + CodedOutputByteBufferNano.h(3, aiPictureConfig.quick_access_limit);
            ((MessageNano) aiPictureConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiPictureConfig m11613parse(nb5 nb5Var) throws IOException {
            AiPictureConfig aiPictureConfig = new AiPictureConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    aiPictureConfig.exp = nb5Var.g();
                } else if (iU == 16) {
                    aiPictureConfig.timeout = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return aiPictureConfig;
                    }
                    aiPictureConfig.quick_access_limit = nb5Var.j();
                }
            }
        }

        public void serialize(AiPictureConfig aiPictureConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, aiPictureConfig.exp);
            codedOutputByteBufferNano.G(2, aiPictureConfig.timeout);
            codedOutputByteBufferNano.G(3, aiPictureConfig.quick_access_limit);
        }
    };
    public static JsonAdapter<AiPictureConfig> JSON_ADAPTER = new ObjectJsonAdapter<AiPictureConfig>() { // from class: com.p1.mobile.putong.core.data.AiPictureConfig.2
        public Class getDataClass() {
            return AiPictureConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiPictureConfig m11614newInstance() {
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

        public void serializeFields(AiPictureConfig aiPictureConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exp", aiPictureConfig.exp);
            jsonGenerator.writeNumberField("timeout", aiPictureConfig.timeout);
            jsonGenerator.writeNumberField("quick_access_limit", aiPictureConfig.quick_access_limit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiPictureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiPictureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiPictureConfig new_() {
        AiPictureConfig aiPictureConfig = new AiPictureConfig();
        aiPictureConfig.nullCheck();
        return aiPictureConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiPictureConfig m11612clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.exp ? 1231 : 1237)) * 41) + this.timeout) * 41) + this.quick_access_limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
