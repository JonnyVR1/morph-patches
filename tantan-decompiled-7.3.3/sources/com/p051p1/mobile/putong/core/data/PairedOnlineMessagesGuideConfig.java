package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class PairedOnlineMessagesGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pairedonlinemessagesguideconfig";

    @ProtobufIndex(index = 1)
    public boolean exp1;

    @ProtobufIndex(index = 2)
    public boolean exp2;

    @NonNull
    @ProtobufIndex(index = 3)
    public String key;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;
    public static ProtobufAdapter<PairedOnlineMessagesGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PairedOnlineMessagesGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PairedOnlineMessagesGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, pairedOnlineMessagesGuideConfig.exp1) + CodedOutputByteBufferNano.m17275b(2, pairedOnlineMessagesGuideConfig.exp2);
            String str = pairedOnlineMessagesGuideConfig.key;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = pairedOnlineMessagesGuideConfig.value;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            pairedOnlineMessagesGuideConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PairedOnlineMessagesGuideConfig parse(nc5 nc5Var) throws IOException {
            PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig = new PairedOnlineMessagesGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (pairedOnlineMessagesGuideConfig.key == null) {
                        pairedOnlineMessagesGuideConfig.key = "";
                    }
                    if (pairedOnlineMessagesGuideConfig.value != null) {
                        break;
                    }
                    pairedOnlineMessagesGuideConfig.value = "";
                    break;
                }
                if (iM162497u == 8) {
                    pairedOnlineMessagesGuideConfig.exp1 = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    pairedOnlineMessagesGuideConfig.exp2 = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    pairedOnlineMessagesGuideConfig.key = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (pairedOnlineMessagesGuideConfig.key == null) {
                            pairedOnlineMessagesGuideConfig.key = "";
                        }
                        if (pairedOnlineMessagesGuideConfig.value != null) {
                            break;
                        }
                        pairedOnlineMessagesGuideConfig.value = "";
                        return pairedOnlineMessagesGuideConfig;
                    }
                    pairedOnlineMessagesGuideConfig.value = nc5Var.m162495s();
                }
            }
            return pairedOnlineMessagesGuideConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, pairedOnlineMessagesGuideConfig.exp1);
            codedOutputByteBufferNano.m17299A(2, pairedOnlineMessagesGuideConfig.exp2);
            String str = pairedOnlineMessagesGuideConfig.key;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = pairedOnlineMessagesGuideConfig.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<PairedOnlineMessagesGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<PairedOnlineMessagesGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PairedOnlineMessagesGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PairedOnlineMessagesGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PairedOnlineMessagesGuideConfig newInstance() {
            return new PairedOnlineMessagesGuideConfig();
        }

        public boolean parseField(PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    pairedOnlineMessagesGuideConfig.key = jsonParser.getValueAsString();
                    return true;
                case "exp1":
                    pairedOnlineMessagesGuideConfig.exp1 = jsonParser.getValueAsBoolean();
                    return true;
                case "exp2":
                    pairedOnlineMessagesGuideConfig.exp2 = jsonParser.getValueAsBoolean();
                    return true;
                case "value":
                    pairedOnlineMessagesGuideConfig.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "key":
                case "exp1":
                case "exp2":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(pairedOnlineMessagesGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exp1", pairedOnlineMessagesGuideConfig.exp1);
            jsonGenerator.writeBooleanField("exp2", pairedOnlineMessagesGuideConfig.exp2);
            String str = pairedOnlineMessagesGuideConfig.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = pairedOnlineMessagesGuideConfig.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PairedOnlineMessagesGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PairedOnlineMessagesGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PairedOnlineMessagesGuideConfig new_() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig = new PairedOnlineMessagesGuideConfig();
        pairedOnlineMessagesGuideConfig.nullCheck();
        return pairedOnlineMessagesGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PairedOnlineMessagesGuideConfig mo225055clone() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig = new PairedOnlineMessagesGuideConfig();
        pairedOnlineMessagesGuideConfig.exp1 = this.exp1;
        pairedOnlineMessagesGuideConfig.exp2 = this.exp2;
        pairedOnlineMessagesGuideConfig.key = this.key;
        pairedOnlineMessagesGuideConfig.value = this.value;
        return pairedOnlineMessagesGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PairedOnlineMessagesGuideConfig)) {
            return false;
        }
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfig = (PairedOnlineMessagesGuideConfig) obj;
        return this.exp1 == pairedOnlineMessagesGuideConfig.exp1 && this.exp2 == pairedOnlineMessagesGuideConfig.exp2 && ValueObject.util_equals(this.key, pairedOnlineMessagesGuideConfig.key) && ValueObject.util_equals(this.value, pairedOnlineMessagesGuideConfig.value);
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
        int i2 = ((((i * 41) + (this.exp1 ? 1231 : 1237)) * 41) + (this.exp2 ? 1231 : 1237)) * 41;
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
