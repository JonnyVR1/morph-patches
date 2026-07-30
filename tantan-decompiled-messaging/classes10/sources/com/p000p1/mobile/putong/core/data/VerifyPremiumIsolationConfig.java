package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.VerifyPremiumIsolationConfig;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VerifyPremiumIsolationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verifypremiumisolationconfig";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int non_verified_matches_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
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

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean restrict_non_verified_matches_backend;

    @ProtobufIndex(index = 1)
    public boolean restrict_non_verified_received_likes;
    public static ProtobufAdapter<VerifyPremiumIsolationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerifyPremiumIsolationConfig>() { // from class: com.p1.mobile.putong.core.data.VerifyPremiumIsolationConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig) {
            int iB = CodedOutputByteBufferNano.b(1, verifyPremiumIsolationConfig.restrict_non_verified_received_likes) + CodedOutputByteBufferNano.h(2, verifyPremiumIsolationConfig.non_verified_received_likes_limit) + CodedOutputByteBufferNano.b(3, verifyPremiumIsolationConfig.restrict_non_verified_matches_backend) + CodedOutputByteBufferNano.b(4, verifyPremiumIsolationConfig.restrict_non_verified_matches) + CodedOutputByteBufferNano.h(5, verifyPremiumIsolationConfig.non_verified_matches_limit);
            List<String> list = verifyPremiumIsolationConfig.restrict_banner_texts;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = verifyPremiumIsolationConfig.restrict_banner_button;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(7, str);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(8, verifyPremiumIsolationConfig.restrict_non_verified_common);
            ((MessageNano) verifyPremiumIsolationConfig).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerifyPremiumIsolationConfig m16220parse(nb5 nb5Var) throws IOException {
            VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verifyPremiumIsolationConfig.restrict_banner_texts == null) {
                        verifyPremiumIsolationConfig.restrict_banner_texts = new ArrayList();
                    }
                    if (verifyPremiumIsolationConfig.restrict_banner_button != null) {
                        break;
                    }
                    verifyPremiumIsolationConfig.restrict_banner_button = "";
                    break;
                }
                if (iU == 8) {
                    verifyPremiumIsolationConfig.restrict_non_verified_received_likes = nb5Var.g();
                } else if (iU == 16) {
                    verifyPremiumIsolationConfig.non_verified_received_likes_limit = nb5Var.j();
                } else if (iU == 24) {
                    verifyPremiumIsolationConfig.restrict_non_verified_matches_backend = nb5Var.g();
                } else if (iU == 32) {
                    verifyPremiumIsolationConfig.restrict_non_verified_matches = nb5Var.g();
                } else if (iU == 40) {
                    verifyPremiumIsolationConfig.non_verified_matches_limit = nb5Var.j();
                } else if (iU == 50) {
                    verifyPremiumIsolationConfig.restrict_banner_texts = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 58) {
                    verifyPremiumIsolationConfig.restrict_banner_button = nb5Var.s();
                } else {
                    if (iU != 64) {
                        if (verifyPremiumIsolationConfig.restrict_banner_texts == null) {
                            verifyPremiumIsolationConfig.restrict_banner_texts = new ArrayList();
                        }
                        if (verifyPremiumIsolationConfig.restrict_banner_button != null) {
                            break;
                        }
                        verifyPremiumIsolationConfig.restrict_banner_button = "";
                        return verifyPremiumIsolationConfig;
                    }
                    verifyPremiumIsolationConfig.restrict_non_verified_common = nb5Var.g();
                }
            }
            return verifyPremiumIsolationConfig;
        }

        public void serialize(VerifyPremiumIsolationConfig verifyPremiumIsolationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, verifyPremiumIsolationConfig.restrict_non_verified_received_likes);
            codedOutputByteBufferNano.G(2, verifyPremiumIsolationConfig.non_verified_received_likes_limit);
            codedOutputByteBufferNano.A(3, verifyPremiumIsolationConfig.restrict_non_verified_matches_backend);
            codedOutputByteBufferNano.A(4, verifyPremiumIsolationConfig.restrict_non_verified_matches);
            codedOutputByteBufferNano.G(5, verifyPremiumIsolationConfig.non_verified_matches_limit);
            List<String> list = verifyPremiumIsolationConfig.restrict_banner_texts;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = verifyPremiumIsolationConfig.restrict_banner_button;
            if (str != null) {
                codedOutputByteBufferNano.R(7, str);
            }
            codedOutputByteBufferNano.A(8, verifyPremiumIsolationConfig.restrict_non_verified_common);
        }
    };
    public static JsonAdapter<VerifyPremiumIsolationConfig> JSON_ADAPTER = new ObjectJsonAdapter<VerifyPremiumIsolationConfig>() { // from class: com.p1.mobile.putong.core.data.VerifyPremiumIsolationConfig.2
        public Class getDataClass() {
            return VerifyPremiumIsolationConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VerifyPremiumIsolationConfig m16221newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerifyPremiumIsolationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerifyPremiumIsolationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m703a(String str) {
        return str;
    }

    public static VerifyPremiumIsolationConfig new_() {
        VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
        verifyPremiumIsolationConfig.nullCheck();
        return verifyPremiumIsolationConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerifyPremiumIsolationConfig m16219clone() {
        VerifyPremiumIsolationConfig verifyPremiumIsolationConfig = new VerifyPremiumIsolationConfig();
        verifyPremiumIsolationConfig.restrict_non_verified_received_likes = this.restrict_non_verified_received_likes;
        verifyPremiumIsolationConfig.non_verified_received_likes_limit = this.non_verified_received_likes_limit;
        verifyPremiumIsolationConfig.restrict_non_verified_matches_backend = this.restrict_non_verified_matches_backend;
        verifyPremiumIsolationConfig.restrict_non_verified_matches = this.restrict_non_verified_matches;
        verifyPremiumIsolationConfig.non_verified_matches_limit = this.non_verified_matches_limit;
        List<String> list = this.restrict_banner_texts;
        if (list != null) {
            verifyPremiumIsolationConfig.restrict_banner_texts = ValueObject.util_map(list, new w9j() { // from class: l.g0l0
                public final Object call(Object obj) {
                    return VerifyPremiumIsolationConfig.m703a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((((i * 41) + (this.restrict_non_verified_received_likes ? 1231 : 1237)) * 41) + this.non_verified_received_likes_limit) * 41) + (this.restrict_non_verified_matches_backend ? 1231 : 1237)) * 41) + (this.restrict_non_verified_matches ? 1231 : 1237)) * 41) + this.non_verified_matches_limit) * 41;
        List<String> list = this.restrict_banner_texts;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.restrict_banner_button;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.restrict_non_verified_common ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.restrict_banner_texts == null) {
            this.restrict_banner_texts = new ArrayList();
        }
        if (this.restrict_banner_button == null) {
            this.restrict_banner_button = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
