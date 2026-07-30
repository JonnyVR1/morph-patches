package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.VerifyPremiumIsolationConfig;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class VerifyPremiumIsolationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verifypremiumisolationconfig";

    @ProtobufIndex(index = 5)
    public int non_verified_matches_limit;

    @ProtobufIndex(index = 2)
    public int non_verified_received_likes_limit;

    @NonNull
    @ProtobufIndex(index = 7)
    public String restrict_banner_button;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> restrict_banner_texts;

    @ProtobufIndex(index = 8)
    public boolean restrict_non_verified_common;

    @ProtobufIndex(index = 4)
    public boolean restrict_non_verified_matches;

    @ProtobufIndex(index = 3)
    public boolean restrict_non_verified_matches_backend;

    @ProtobufIndex(index = 1)
    public boolean restrict_non_verified_received_likes;
    public static ProtobufAdapter<VerifyPremiumIsolationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerifyPremiumIsolationConfig>() { // from class: com.p1.mobile.putong.core.data.VerifyPremiumIsolationConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, verifyPremiumIsolationConfig.restrict_non_verified_received_likes) + CodedOutputByteBufferNano.m17281h(2, verifyPremiumIsolationConfig.non_verified_received_likes_limit) + CodedOutputByteBufferNano.m17275b(3, verifyPremiumIsolationConfig.restrict_non_verified_matches_backend) + CodedOutputByteBufferNano.m17275b(4, verifyPremiumIsolationConfig.restrict_non_verified_matches) + CodedOutputByteBufferNano.m17281h(5, verifyPremiumIsolationConfig.non_verified_matches_limit);
            List<String> list = verifyPremiumIsolationConfig.restrict_banner_texts;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = verifyPremiumIsolationConfig.restrict_banner_button;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(8, verifyPremiumIsolationConfig.restrict_non_verified_common);
            verifyPremiumIsolationConfig.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerifyPremiumIsolationConfig parse(nc5 nc5Var) throws IOException {
            VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verifyPremiumIsolationConfig.restrict_banner_texts == null) {
                        verifyPremiumIsolationConfig.restrict_banner_texts = new ArrayList();
                    }
                    if (verifyPremiumIsolationConfig.restrict_banner_button != null) {
                        break;
                    }
                    verifyPremiumIsolationConfig.restrict_banner_button = "";
                    break;
                }
                if (iM162497u == 8) {
                    verifyPremiumIsolationConfig.restrict_non_verified_received_likes = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    verifyPremiumIsolationConfig.non_verified_received_likes_limit = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    verifyPremiumIsolationConfig.restrict_non_verified_matches_backend = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    verifyPremiumIsolationConfig.restrict_non_verified_matches = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    verifyPremiumIsolationConfig.non_verified_matches_limit = nc5Var.m162486j();
                } else if (iM162497u == 50) {
                    verifyPremiumIsolationConfig.restrict_banner_texts = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 58) {
                    verifyPremiumIsolationConfig.restrict_banner_button = nc5Var.m162495s();
                } else {
                    if (iM162497u != 64) {
                        if (verifyPremiumIsolationConfig.restrict_banner_texts == null) {
                            verifyPremiumIsolationConfig.restrict_banner_texts = new ArrayList();
                        }
                        if (verifyPremiumIsolationConfig.restrict_banner_button != null) {
                            break;
                        }
                        verifyPremiumIsolationConfig.restrict_banner_button = "";
                        return verifyPremiumIsolationConfig;
                    }
                    verifyPremiumIsolationConfig.restrict_non_verified_common = nc5Var.m162483g();
                }
            }
            return verifyPremiumIsolationConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, verifyPremiumIsolationConfig.restrict_non_verified_received_likes);
            codedOutputByteBufferNano.m17305G(2, verifyPremiumIsolationConfig.non_verified_received_likes_limit);
            codedOutputByteBufferNano.m17299A(3, verifyPremiumIsolationConfig.restrict_non_verified_matches_backend);
            codedOutputByteBufferNano.m17299A(4, verifyPremiumIsolationConfig.restrict_non_verified_matches);
            codedOutputByteBufferNano.m17305G(5, verifyPremiumIsolationConfig.non_verified_matches_limit);
            List<String> list = verifyPremiumIsolationConfig.restrict_banner_texts;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = verifyPremiumIsolationConfig.restrict_banner_button;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(7, str);
            }
            codedOutputByteBufferNano.m17299A(8, verifyPremiumIsolationConfig.restrict_non_verified_common);
        }
    };
    public static JsonAdapter<VerifyPremiumIsolationConfig> JSON_ADAPTER = new ObjectJsonAdapter<VerifyPremiumIsolationConfig>() { // from class: com.p1.mobile.putong.core.data.VerifyPremiumIsolationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerifyPremiumIsolationConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerifyPremiumIsolationConfig newInstance() {
            return new VerifyPremiumIsolationConfig();
        }

        public boolean parseField(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "restrict_non_verified_matches":
                    verifyPremiumIsolationConfig.restrict_non_verified_matches = jsonParser.getValueAsBoolean();
                    return true;
                case "restrict_non_verified_common":
                    verifyPremiumIsolationConfig.restrict_non_verified_common = jsonParser.getValueAsBoolean();
                    return true;
                case "restrict_banner_button":
                    verifyPremiumIsolationConfig.restrict_banner_button = jsonParser.getValueAsString();
                    return true;
                case "restrict_banner_texts":
                    verifyPremiumIsolationConfig.restrict_banner_texts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "non_verified_matches_limit":
                    verifyPremiumIsolationConfig.non_verified_matches_limit = jsonParser.getValueAsInt();
                    return true;
                case "non_verified_received_likes_limit":
                    verifyPremiumIsolationConfig.non_verified_received_likes_limit = jsonParser.getValueAsInt();
                    return true;
                case "restrict_non_verified_matches_backend":
                    verifyPremiumIsolationConfig.restrict_non_verified_matches_backend = jsonParser.getValueAsBoolean();
                    return true;
                case "restrict_non_verified_received_likes":
                    verifyPremiumIsolationConfig.restrict_non_verified_received_likes = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "restrict_non_verified_matches":
                case "restrict_non_verified_common":
                case "restrict_banner_button":
                case "restrict_banner_texts":
                case "non_verified_matches_limit":
                case "non_verified_received_likes_limit":
                case "restrict_non_verified_matches_backend":
                case "restrict_non_verified_received_likes":
                    return true;
                default:
                    return super.parseFieldCheck(verifyPremiumIsolationConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("restrict_non_verified_received_likes", verifyPremiumIsolationConfig.restrict_non_verified_received_likes);
            jsonGenerator.writeNumberField("non_verified_received_likes_limit", verifyPremiumIsolationConfig.non_verified_received_likes_limit);
            jsonGenerator.writeBooleanField("restrict_non_verified_matches_backend", verifyPremiumIsolationConfig.restrict_non_verified_matches_backend);
            jsonGenerator.writeBooleanField("restrict_non_verified_matches", verifyPremiumIsolationConfig.restrict_non_verified_matches);
            jsonGenerator.writeNumberField("non_verified_matches_limit", verifyPremiumIsolationConfig.non_verified_matches_limit);
            if (verifyPremiumIsolationConfig.restrict_banner_texts != null) {
                jsonGenerator.writeFieldName("restrict_banner_texts");
                JsonAdapter.serializeArray(verifyPremiumIsolationConfig.restrict_banner_texts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = verifyPremiumIsolationConfig.restrict_banner_button;
            if (str != null) {
                jsonGenerator.writeStringField("restrict_banner_button", str);
            }
            jsonGenerator.writeBooleanField("restrict_non_verified_common", verifyPremiumIsolationConfig.restrict_non_verified_common);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyPremiumIsolationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyPremiumIsolationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36904a(String str) {
        return str;
    }

    public static VerifyPremiumIsolationConfig new_() {
        VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
        verifyPremiumIsolationConfig.nullCheck();
        return verifyPremiumIsolationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerifyPremiumIsolationConfig mo225055clone() {
        VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
        verifyPremiumIsolationConfig.restrict_non_verified_received_likes = this.restrict_non_verified_received_likes;
        verifyPremiumIsolationConfig.non_verified_received_likes_limit = this.non_verified_received_likes_limit;
        verifyPremiumIsolationConfig.restrict_non_verified_matches_backend = this.restrict_non_verified_matches_backend;
        verifyPremiumIsolationConfig.restrict_non_verified_matches = this.restrict_non_verified_matches;
        verifyPremiumIsolationConfig.non_verified_matches_limit = this.non_verified_matches_limit;
        List<String> list = this.restrict_banner_texts;
        if (list != null) {
            verifyPremiumIsolationConfig.restrict_banner_texts = ValueObject.util_map(list, new qcj() { // from class: l.l9l0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VerifyPremiumIsolationConfig.m36904a((String) obj);
                }
            });
        }
        verifyPremiumIsolationConfig.restrict_banner_button = this.restrict_banner_button;
        verifyPremiumIsolationConfig.restrict_non_verified_common = this.restrict_non_verified_common;
        return verifyPremiumIsolationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyPremiumIsolationConfig)) {
            return false;
        }
        VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = (VerifyPremiumIsolationConfig) obj;
        return this.restrict_non_verified_received_likes == verifyPremiumIsolationConfig.restrict_non_verified_received_likes && this.non_verified_received_likes_limit == verifyPremiumIsolationConfig.non_verified_received_likes_limit && this.restrict_non_verified_matches_backend == verifyPremiumIsolationConfig.restrict_non_verified_matches_backend && this.restrict_non_verified_matches == verifyPremiumIsolationConfig.restrict_non_verified_matches && this.non_verified_matches_limit == verifyPremiumIsolationConfig.non_verified_matches_limit && ValueObject.util_equals(this.restrict_banner_texts, verifyPremiumIsolationConfig.restrict_banner_texts) && ValueObject.util_equals(this.restrict_banner_button, verifyPremiumIsolationConfig.restrict_banner_button) && this.restrict_non_verified_common == verifyPremiumIsolationConfig.restrict_non_verified_common;
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
        int i2 = ((((((((((i * 41) + (this.restrict_non_verified_received_likes ? 1231 : 1237)) * 41) + this.non_verified_received_likes_limit) * 41) + (this.restrict_non_verified_matches_backend ? 1231 : 1237)) * 41) + (this.restrict_non_verified_matches ? 1231 : 1237)) * 41) + this.non_verified_matches_limit) * 41;
        List<String> list = this.restrict_banner_texts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.restrict_banner_button;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.restrict_non_verified_common ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.restrict_banner_texts == null) {
            this.restrict_banner_texts = new ArrayList();
        }
        if (this.restrict_banner_button == null) {
            this.restrict_banner_button = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
