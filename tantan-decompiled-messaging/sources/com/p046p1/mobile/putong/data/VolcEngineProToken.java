package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class VolcEngineProToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "volcengineprotoken";

    @NonNull
    @ProtobufIndex(index = 4)
    public String accessKeyId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String bytedanceToken;

    @NonNull
    @ProtobufIndex(index = 2)
    public String clientConfig;

    @NonNull
    @ProtobufIndex(index = 5)
    public String secretAccessKey;

    @NonNull
    @ProtobufIndex(index = 3)
    public String stsToken;
    public static ProtobufAdapter<VolcEngineProToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<VolcEngineProToken>() { // from class: com.p1.mobile.putong.data.VolcEngineProToken.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VolcEngineProToken volcEngineProToken) {
            String str = volcEngineProToken.bytedanceToken;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = volcEngineProToken.clientConfig;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = volcEngineProToken.stsToken;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = volcEngineProToken.accessKeyId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = volcEngineProToken.secretAccessKey;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            volcEngineProToken.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VolcEngineProToken parse(nb5 nb5Var) throws IOException {
            VolcEngineProToken volcEngineProToken = new VolcEngineProToken();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (volcEngineProToken.bytedanceToken == null) {
                        volcEngineProToken.bytedanceToken = "";
                    }
                    if (volcEngineProToken.clientConfig == null) {
                        volcEngineProToken.clientConfig = "";
                    }
                    if (volcEngineProToken.stsToken == null) {
                        volcEngineProToken.stsToken = "";
                    }
                    if (volcEngineProToken.accessKeyId == null) {
                        volcEngineProToken.accessKeyId = "";
                    }
                    if (volcEngineProToken.secretAccessKey != null) {
                        break;
                    }
                    volcEngineProToken.secretAccessKey = "";
                    break;
                }
                if (iM158752u == 10) {
                    volcEngineProToken.bytedanceToken = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    volcEngineProToken.clientConfig = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    volcEngineProToken.stsToken = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    volcEngineProToken.accessKeyId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (volcEngineProToken.bytedanceToken == null) {
                            volcEngineProToken.bytedanceToken = "";
                        }
                        if (volcEngineProToken.clientConfig == null) {
                            volcEngineProToken.clientConfig = "";
                        }
                        if (volcEngineProToken.stsToken == null) {
                            volcEngineProToken.stsToken = "";
                        }
                        if (volcEngineProToken.accessKeyId == null) {
                            volcEngineProToken.accessKeyId = "";
                        }
                        if (volcEngineProToken.secretAccessKey != null) {
                            break;
                        }
                        volcEngineProToken.secretAccessKey = "";
                        return volcEngineProToken;
                    }
                    volcEngineProToken.secretAccessKey = nb5Var.m158750s();
                }
            }
            return volcEngineProToken;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VolcEngineProToken volcEngineProToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = volcEngineProToken.bytedanceToken;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = volcEngineProToken.clientConfig;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = volcEngineProToken.stsToken;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = volcEngineProToken.accessKeyId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = volcEngineProToken.secretAccessKey;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    };
    public static JsonAdapter<VolcEngineProToken> JSON_ADAPTER = new ObjectJsonAdapter<VolcEngineProToken>() { // from class: com.p1.mobile.putong.data.VolcEngineProToken.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VolcEngineProToken.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VolcEngineProToken newInstance() {
            return new VolcEngineProToken();
        }

        public boolean parseField(VolcEngineProToken volcEngineProToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "secretAccessKey":
                    volcEngineProToken.secretAccessKey = jsonParser.getValueAsString();
                    return true;
                case "clientConfig":
                    volcEngineProToken.clientConfig = jsonParser.getValueAsString();
                    return true;
                case "accessKeyId":
                    volcEngineProToken.accessKeyId = jsonParser.getValueAsString();
                    return true;
                case "bytedanceToken":
                    volcEngineProToken.bytedanceToken = jsonParser.getValueAsString();
                    return true;
                case "stsToken":
                    volcEngineProToken.stsToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VolcEngineProToken volcEngineProToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "secretAccessKey":
                case "clientConfig":
                case "accessKeyId":
                case "bytedanceToken":
                case "stsToken":
                    return true;
                default:
                    return super.parseFieldCheck(volcEngineProToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VolcEngineProToken volcEngineProToken, JsonGenerator jsonGenerator) throws IOException {
            String str = volcEngineProToken.bytedanceToken;
            if (str != null) {
                jsonGenerator.writeStringField("bytedanceToken", str);
            }
            String str2 = volcEngineProToken.clientConfig;
            if (str2 != null) {
                jsonGenerator.writeStringField("clientConfig", str2);
            }
            String str3 = volcEngineProToken.stsToken;
            if (str3 != null) {
                jsonGenerator.writeStringField("stsToken", str3);
            }
            String str4 = volcEngineProToken.accessKeyId;
            if (str4 != null) {
                jsonGenerator.writeStringField("accessKeyId", str4);
            }
            String str5 = volcEngineProToken.secretAccessKey;
            if (str5 != null) {
                jsonGenerator.writeStringField("secretAccessKey", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VolcEngineProToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VolcEngineProToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VolcEngineProToken new_() {
        VolcEngineProToken volcEngineProToken = new VolcEngineProToken();
        volcEngineProToken.nullCheck();
        return volcEngineProToken;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VolcEngineProToken mo223809clone() {
        VolcEngineProToken volcEngineProToken = new VolcEngineProToken();
        volcEngineProToken.bytedanceToken = this.bytedanceToken;
        volcEngineProToken.clientConfig = this.clientConfig;
        volcEngineProToken.stsToken = this.stsToken;
        volcEngineProToken.accessKeyId = this.accessKeyId;
        volcEngineProToken.secretAccessKey = this.secretAccessKey;
        return volcEngineProToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VolcEngineProToken)) {
            return false;
        }
        VolcEngineProToken volcEngineProToken = (VolcEngineProToken) obj;
        return ValueObject.util_equals(this.bytedanceToken, volcEngineProToken.bytedanceToken) && ValueObject.util_equals(this.clientConfig, volcEngineProToken.clientConfig) && ValueObject.util_equals(this.stsToken, volcEngineProToken.stsToken) && ValueObject.util_equals(this.accessKeyId, volcEngineProToken.accessKeyId) && ValueObject.util_equals(this.secretAccessKey, volcEngineProToken.secretAccessKey);
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
        String str = this.bytedanceToken;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.clientConfig;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.stsToken;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.accessKeyId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.secretAccessKey;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bytedanceToken == null) {
            this.bytedanceToken = "";
        }
        if (this.clientConfig == null) {
            this.clientConfig = "";
        }
        if (this.stsToken == null) {
            this.stsToken = "";
        }
        if (this.accessKeyId == null) {
            this.accessKeyId = "";
        }
        if (this.secretAccessKey == null) {
            this.secretAccessKey = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
