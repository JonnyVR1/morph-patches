package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class GuessLikersConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikersconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public GuessLikersFirstRule firstRule;

    @ProtobufIndex(index = 1)
    public boolean isGuessLikeOpen;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public GuessLikersSecondRule secondRule;

    @NonNull
    @ProtobufIndex(index = 5)
    public GuessLikersThirdRule thirdRule;
    public static ProtobufAdapter<GuessLikersConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersConfig>() { // from class: com.p1.mobile.putong.core.data.GuessLikersConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GuessLikersConfig guessLikersConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            GuessLikersFirstRule guessLikersFirstRule = guessLikersConfig.firstRule;
            if (guessLikersFirstRule != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, guessLikersFirstRule, GuessLikersFirstRule.PROTOBUF_ADAPTER);
            }
            GuessLikersSecondRule guessLikersSecondRule = guessLikersConfig.secondRule;
            if (guessLikersSecondRule != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, guessLikersSecondRule, GuessLikersSecondRule.PROTOBUF_ADAPTER);
            }
            GuessLikersThirdRule guessLikersThirdRule = guessLikersConfig.thirdRule;
            if (guessLikersThirdRule != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, guessLikersThirdRule, GuessLikersThirdRule.PROTOBUF_ADAPTER);
            }
            guessLikersConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuessLikersConfig parse(nb5 nb5Var) throws IOException {
            GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (guessLikersConfig.name == null) {
                        guessLikersConfig.name = "";
                    }
                    if (guessLikersConfig.firstRule == null) {
                        guessLikersConfig.firstRule = GuessLikersFirstRule.new_();
                    }
                    if (guessLikersConfig.secondRule == null) {
                        guessLikersConfig.secondRule = GuessLikersSecondRule.new_();
                    }
                    if (guessLikersConfig.thirdRule != null) {
                        break;
                    }
                    guessLikersConfig.thirdRule = GuessLikersThirdRule.new_();
                    break;
                }
                if (iM158752u == 8) {
                    guessLikersConfig.isGuessLikeOpen = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    guessLikersConfig.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    guessLikersConfig.firstRule = (GuessLikersFirstRule) nb5Var.m158743l(GuessLikersFirstRule.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    guessLikersConfig.secondRule = (GuessLikersSecondRule) nb5Var.m158743l(GuessLikersSecondRule.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (guessLikersConfig.name == null) {
                            guessLikersConfig.name = "";
                        }
                        if (guessLikersConfig.firstRule == null) {
                            guessLikersConfig.firstRule = GuessLikersFirstRule.new_();
                        }
                        if (guessLikersConfig.secondRule == null) {
                            guessLikersConfig.secondRule = GuessLikersSecondRule.new_();
                        }
                        if (guessLikersConfig.thirdRule != null) {
                            break;
                        }
                        guessLikersConfig.thirdRule = GuessLikersThirdRule.new_();
                        return guessLikersConfig;
                    }
                    guessLikersConfig.thirdRule = (GuessLikersThirdRule) nb5Var.m158743l(GuessLikersThirdRule.PROTOBUF_ADAPTER);
                }
            }
            return guessLikersConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuessLikersConfig guessLikersConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            GuessLikersFirstRule guessLikersFirstRule = guessLikersConfig.firstRule;
            if (guessLikersFirstRule != null) {
                codedOutputByteBufferNano.m17254K(3, guessLikersFirstRule, GuessLikersFirstRule.PROTOBUF_ADAPTER);
            }
            GuessLikersSecondRule guessLikersSecondRule = guessLikersConfig.secondRule;
            if (guessLikersSecondRule != null) {
                codedOutputByteBufferNano.m17254K(4, guessLikersSecondRule, GuessLikersSecondRule.PROTOBUF_ADAPTER);
            }
            GuessLikersThirdRule guessLikersThirdRule = guessLikersConfig.thirdRule;
            if (guessLikersThirdRule != null) {
                codedOutputByteBufferNano.m17254K(5, guessLikersThirdRule, GuessLikersThirdRule.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GuessLikersConfig> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersConfig>() { // from class: com.p1.mobile.putong.core.data.GuessLikersConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuessLikersConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GuessLikersConfig newInstance() {
            return new GuessLikersConfig();
        }

        public boolean parseField(GuessLikersConfig guessLikersConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "thirdRule":
                    guessLikersConfig.thirdRule = GuessLikersThirdRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    guessLikersConfig.name = jsonParser.getValueAsString();
                    return true;
                case "firstRule":
                    guessLikersConfig.firstRule = GuessLikersFirstRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "secondRule":
                    guessLikersConfig.secondRule = GuessLikersSecondRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isGuessLikeOpen":
                    guessLikersConfig.isGuessLikeOpen = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GuessLikersConfig guessLikersConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "thirdRule":
                case "name":
                case "firstRule":
                case "secondRule":
                case "isGuessLikeOpen":
                    return true;
                default:
                    return super.parseFieldCheck(guessLikersConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GuessLikersConfig guessLikersConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isGuessLikeOpen", guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (guessLikersConfig.firstRule != null) {
                jsonGenerator.writeFieldName("firstRule");
                GuessLikersFirstRule.JSON_ADAPTER.serialize(guessLikersConfig.firstRule, jsonGenerator, true);
            }
            if (guessLikersConfig.secondRule != null) {
                jsonGenerator.writeFieldName("secondRule");
                GuessLikersSecondRule.JSON_ADAPTER.serialize(guessLikersConfig.secondRule, jsonGenerator, true);
            }
            if (guessLikersConfig.thirdRule != null) {
                jsonGenerator.writeFieldName("thirdRule");
                GuessLikersThirdRule.JSON_ADAPTER.serialize(guessLikersConfig.thirdRule, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersConfig new_() {
        GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
        guessLikersConfig.nullCheck();
        return guessLikersConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GuessLikersConfig mo223809clone() {
        GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
        guessLikersConfig.isGuessLikeOpen = this.isGuessLikeOpen;
        guessLikersConfig.name = this.name;
        GuessLikersFirstRule guessLikersFirstRule = this.firstRule;
        if (guessLikersFirstRule != null) {
            guessLikersConfig.firstRule = guessLikersFirstRule.mo223809clone();
        }
        GuessLikersSecondRule guessLikersSecondRule = this.secondRule;
        if (guessLikersSecondRule != null) {
            guessLikersConfig.secondRule = guessLikersSecondRule.mo223809clone();
        }
        GuessLikersThirdRule guessLikersThirdRule = this.thirdRule;
        if (guessLikersThirdRule != null) {
            guessLikersConfig.thirdRule = guessLikersThirdRule.mo223809clone();
        }
        return guessLikersConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuessLikersConfig)) {
            return false;
        }
        GuessLikersConfig guessLikersConfig = (GuessLikersConfig) obj;
        return this.isGuessLikeOpen == guessLikersConfig.isGuessLikeOpen && ValueObject.util_equals(this.name, guessLikersConfig.name) && ValueObject.util_equals(this.firstRule, guessLikersConfig.firstRule) && ValueObject.util_equals(this.secondRule, guessLikersConfig.secondRule) && ValueObject.util_equals(this.thirdRule, guessLikersConfig.thirdRule);
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
        int i2 = ((i * 41) + (this.isGuessLikeOpen ? 1231 : 1237)) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        GuessLikersFirstRule guessLikersFirstRule = this.firstRule;
        int iHashCode2 = (iHashCode + (guessLikersFirstRule != null ? guessLikersFirstRule.hashCode() : 0)) * 41;
        GuessLikersSecondRule guessLikersSecondRule = this.secondRule;
        int iHashCode3 = (iHashCode2 + (guessLikersSecondRule != null ? guessLikersSecondRule.hashCode() : 0)) * 41;
        GuessLikersThirdRule guessLikersThirdRule = this.thirdRule;
        int iHashCode4 = iHashCode3 + (guessLikersThirdRule != null ? guessLikersThirdRule.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.firstRule == null) {
            this.firstRule = GuessLikersFirstRule.new_();
        }
        if (this.secondRule == null) {
            this.secondRule = GuessLikersSecondRule.new_();
        }
        if (this.thirdRule == null) {
            this.thirdRule = GuessLikersThirdRule.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
