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
public class GuessLikersConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikersconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public GuessLikersFirstRule firstRule;

    @ProtobufIndex(index = 1)
    public boolean isGuessLikeOpen;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public GuessLikersSecondRule secondRule;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public GuessLikersThirdRule thirdRule;
    public static ProtobufAdapter<GuessLikersConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersConfig>() { // from class: com.p1.mobile.putong.core.data.GuessLikersConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GuessLikersConfig guessLikersConfig) {
            int iB = CodedOutputByteBufferNano.b(1, guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            GuessLikersFirstRule guessLikersFirstRule = guessLikersConfig.firstRule;
            if (guessLikersFirstRule != null) {
                iB += CodedOutputByteBufferNano.l(3, guessLikersFirstRule, GuessLikersFirstRule.PROTOBUF_ADAPTER);
            }
            GuessLikersSecondRule guessLikersSecondRule = guessLikersConfig.secondRule;
            if (guessLikersSecondRule != null) {
                iB += CodedOutputByteBufferNano.l(4, guessLikersSecondRule, GuessLikersSecondRule.PROTOBUF_ADAPTER);
            }
            GuessLikersThirdRule guessLikersThirdRule = guessLikersConfig.thirdRule;
            if (guessLikersThirdRule != null) {
                iB += CodedOutputByteBufferNano.l(5, guessLikersThirdRule, GuessLikersThirdRule.PROTOBUF_ADAPTER);
            }
            ((MessageNano) guessLikersConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GuessLikersConfig m13159parse(nb5 nb5Var) throws IOException {
            GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    guessLikersConfig.isGuessLikeOpen = nb5Var.g();
                } else if (iU == 18) {
                    guessLikersConfig.name = nb5Var.s();
                } else if (iU == 26) {
                    guessLikersConfig.firstRule = (GuessLikersFirstRule) nb5Var.l(GuessLikersFirstRule.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    guessLikersConfig.secondRule = (GuessLikersSecondRule) nb5Var.l(GuessLikersSecondRule.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
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
                    guessLikersConfig.thirdRule = (GuessLikersThirdRule) nb5Var.l(GuessLikersThirdRule.PROTOBUF_ADAPTER);
                }
            }
            return guessLikersConfig;
        }

        public void serialize(GuessLikersConfig guessLikersConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            GuessLikersFirstRule guessLikersFirstRule = guessLikersConfig.firstRule;
            if (guessLikersFirstRule != null) {
                codedOutputByteBufferNano.K(3, guessLikersFirstRule, GuessLikersFirstRule.PROTOBUF_ADAPTER);
            }
            GuessLikersSecondRule guessLikersSecondRule = guessLikersConfig.secondRule;
            if (guessLikersSecondRule != null) {
                codedOutputByteBufferNano.K(4, guessLikersSecondRule, GuessLikersSecondRule.PROTOBUF_ADAPTER);
            }
            GuessLikersThirdRule guessLikersThirdRule = guessLikersConfig.thirdRule;
            if (guessLikersThirdRule != null) {
                codedOutputByteBufferNano.K(5, guessLikersThirdRule, GuessLikersThirdRule.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GuessLikersConfig> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersConfig>() { // from class: com.p1.mobile.putong.core.data.GuessLikersConfig.2
        public Class getDataClass() {
            return GuessLikersConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GuessLikersConfig m13160newInstance() {
            return new GuessLikersConfig();
        }

        public boolean parseField(GuessLikersConfig guessLikersConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "thirdRule":
                    guessLikersConfig.thirdRule = (GuessLikersThirdRule) GuessLikersThirdRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    guessLikersConfig.name = jsonParser.getValueAsString();
                    return true;
                case "firstRule":
                    guessLikersConfig.firstRule = (GuessLikersFirstRule) GuessLikersFirstRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "secondRule":
                    guessLikersConfig.secondRule = (GuessLikersSecondRule) GuessLikersSecondRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(GuessLikersConfig guessLikersConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isGuessLikeOpen", guessLikersConfig.isGuessLikeOpen);
            String str = guessLikersConfig.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersConfig new_() {
        GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
        guessLikersConfig.nullCheck();
        return guessLikersConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GuessLikersConfig m13158clone() {
        GuessLikersConfig guessLikersConfig = new GuessLikersConfig();
        guessLikersConfig.isGuessLikeOpen = this.isGuessLikeOpen;
        guessLikersConfig.name = this.name;
        GuessLikersFirstRule guessLikersFirstRule = this.firstRule;
        if (guessLikersFirstRule != null) {
            guessLikersConfig.firstRule = guessLikersFirstRule.m13162clone();
        }
        GuessLikersSecondRule guessLikersSecondRule = this.secondRule;
        if (guessLikersSecondRule != null) {
            guessLikersConfig.secondRule = guessLikersSecondRule.m13166clone();
        }
        GuessLikersThirdRule guessLikersThirdRule = this.thirdRule;
        if (guessLikersThirdRule != null) {
            guessLikersConfig.thirdRule = guessLikersThirdRule.m13170clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
