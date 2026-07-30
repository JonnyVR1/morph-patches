package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ContinuesOpConvConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "continuesopconvconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int branch_size;

    @ProtobufIndex(index = 4)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String finish_tips;

    @ProtobufIndex(index = 1)
    public int max_count;
    public static ProtobufAdapter<ContinuesOpConvConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContinuesOpConvConfig>() { // from class: com.p1.mobile.putong.core.data.ContinuesOpConvConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ContinuesOpConvConfig continuesOpConvConfig) {
            int iH = CodedOutputByteBufferNano.h(1, continuesOpConvConfig.max_count) + CodedOutputByteBufferNano.h(2, continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            int iB = iH + CodedOutputByteBufferNano.b(4, continuesOpConvConfig.enable);
            ((MessageNano) continuesOpConvConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ContinuesOpConvConfig m12269parse(nb5 nb5Var) throws IOException {
            ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (continuesOpConvConfig.finish_tips != null) {
                        break;
                    }
                    continuesOpConvConfig.finish_tips = "";
                    break;
                }
                if (iU == 8) {
                    continuesOpConvConfig.max_count = nb5Var.j();
                } else if (iU == 16) {
                    continuesOpConvConfig.branch_size = nb5Var.j();
                } else if (iU == 26) {
                    continuesOpConvConfig.finish_tips = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (continuesOpConvConfig.finish_tips != null) {
                            break;
                        }
                        continuesOpConvConfig.finish_tips = "";
                        return continuesOpConvConfig;
                    }
                    continuesOpConvConfig.enable = nb5Var.g();
                }
            }
            return continuesOpConvConfig;
        }

        public void serialize(ContinuesOpConvConfig continuesOpConvConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, continuesOpConvConfig.max_count);
            codedOutputByteBufferNano.G(2, continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.A(4, continuesOpConvConfig.enable);
        }
    };
    public static JsonAdapter<ContinuesOpConvConfig> JSON_ADAPTER = new ObjectJsonAdapter<ContinuesOpConvConfig>() { // from class: com.p1.mobile.putong.core.data.ContinuesOpConvConfig.2
        public Class getDataClass() {
            return ContinuesOpConvConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ContinuesOpConvConfig m12270newInstance() {
            return new ContinuesOpConvConfig();
        }

        public boolean parseField(ContinuesOpConvConfig continuesOpConvConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    continuesOpConvConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "branch_size":
                    continuesOpConvConfig.branch_size = jsonParser.getValueAsInt();
                    return true;
                case "max_count":
                    continuesOpConvConfig.max_count = jsonParser.getValueAsInt();
                    return true;
                case "finish_tips":
                    continuesOpConvConfig.finish_tips = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContinuesOpConvConfig continuesOpConvConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "branch_size":
                case "max_count":
                case "finish_tips":
                    return true;
                default:
                    return super.parseFieldCheck(continuesOpConvConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ContinuesOpConvConfig continuesOpConvConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("max_count", continuesOpConvConfig.max_count);
            jsonGenerator.writeNumberField("branch_size", continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                jsonGenerator.writeStringField("finish_tips", str);
            }
            jsonGenerator.writeBooleanField("enable", continuesOpConvConfig.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContinuesOpConvConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContinuesOpConvConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContinuesOpConvConfig new_() {
        ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
        continuesOpConvConfig.nullCheck();
        return continuesOpConvConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ContinuesOpConvConfig m12268clone() {
        ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
        continuesOpConvConfig.max_count = this.max_count;
        continuesOpConvConfig.branch_size = this.branch_size;
        continuesOpConvConfig.finish_tips = this.finish_tips;
        continuesOpConvConfig.enable = this.enable;
        return continuesOpConvConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContinuesOpConvConfig)) {
            return false;
        }
        ContinuesOpConvConfig continuesOpConvConfig = (ContinuesOpConvConfig) obj;
        return this.max_count == continuesOpConvConfig.max_count && this.branch_size == continuesOpConvConfig.branch_size && ValueObject.util_equals(this.finish_tips, continuesOpConvConfig.finish_tips) && this.enable == continuesOpConvConfig.enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.max_count) * 41) + this.branch_size) * 41;
        String str = this.finish_tips;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.finish_tips == null) {
            this.finish_tips = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
