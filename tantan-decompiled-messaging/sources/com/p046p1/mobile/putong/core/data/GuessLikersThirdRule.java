package com.p046p1.mobile.putong.core.data;

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
public class GuessLikersThirdRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikersthirdrule";

    @ProtobufIndex(index = 1)
    public int createTime;

    @ProtobufIndex(index = 5)
    public int femaleIntervalTime;

    @ProtobufIndex(index = 4)
    public int femaleSwipeNum;

    @ProtobufIndex(index = 3)
    public int maleIntervalTime;

    @ProtobufIndex(index = 2)
    public int maleSwipeNum;
    public static ProtobufAdapter<GuessLikersThirdRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersThirdRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersThirdRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GuessLikersThirdRule guessLikersThirdRule) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, guessLikersThirdRule.createTime) + CodedOutputByteBufferNano.m17226h(2, guessLikersThirdRule.maleSwipeNum) + CodedOutputByteBufferNano.m17226h(3, guessLikersThirdRule.maleIntervalTime) + CodedOutputByteBufferNano.m17226h(4, guessLikersThirdRule.femaleSwipeNum) + CodedOutputByteBufferNano.m17226h(5, guessLikersThirdRule.femaleIntervalTime);
            guessLikersThirdRule.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuessLikersThirdRule parse(nb5 nb5Var) throws IOException {
            GuessLikersThirdRule guessLikersThirdRule = new GuessLikersThirdRule();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    guessLikersThirdRule.createTime = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    guessLikersThirdRule.maleSwipeNum = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    guessLikersThirdRule.maleIntervalTime = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    guessLikersThirdRule.femaleSwipeNum = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        return guessLikersThirdRule;
                    }
                    guessLikersThirdRule.femaleIntervalTime = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuessLikersThirdRule guessLikersThirdRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, guessLikersThirdRule.createTime);
            codedOutputByteBufferNano.m17250G(2, guessLikersThirdRule.maleSwipeNum);
            codedOutputByteBufferNano.m17250G(3, guessLikersThirdRule.maleIntervalTime);
            codedOutputByteBufferNano.m17250G(4, guessLikersThirdRule.femaleSwipeNum);
            codedOutputByteBufferNano.m17250G(5, guessLikersThirdRule.femaleIntervalTime);
        }
    };
    public static JsonAdapter<GuessLikersThirdRule> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersThirdRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersThirdRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuessLikersThirdRule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GuessLikersThirdRule newInstance() {
            return new GuessLikersThirdRule();
        }

        public boolean parseField(GuessLikersThirdRule guessLikersThirdRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                    guessLikersThirdRule.maleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "maleSwipeNum":
                    guessLikersThirdRule.maleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                case "femaleIntervalTime":
                    guessLikersThirdRule.femaleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "createTime":
                    guessLikersThirdRule.createTime = jsonParser.getValueAsInt();
                    return true;
                case "femaleSwipeNum":
                    guessLikersThirdRule.femaleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GuessLikersThirdRule guessLikersThirdRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                case "maleSwipeNum":
                case "femaleIntervalTime":
                case "createTime":
                case "femaleSwipeNum":
                    return true;
                default:
                    return super.parseFieldCheck(guessLikersThirdRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GuessLikersThirdRule guessLikersThirdRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createTime", guessLikersThirdRule.createTime);
            jsonGenerator.writeNumberField("maleSwipeNum", guessLikersThirdRule.maleSwipeNum);
            jsonGenerator.writeNumberField("maleIntervalTime", guessLikersThirdRule.maleIntervalTime);
            jsonGenerator.writeNumberField("femaleSwipeNum", guessLikersThirdRule.femaleSwipeNum);
            jsonGenerator.writeNumberField("femaleIntervalTime", guessLikersThirdRule.femaleIntervalTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersThirdRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersThirdRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersThirdRule new_() {
        GuessLikersThirdRule guessLikersThirdRule = new GuessLikersThirdRule();
        guessLikersThirdRule.nullCheck();
        return guessLikersThirdRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GuessLikersThirdRule mo223809clone() {
        GuessLikersThirdRule guessLikersThirdRule = new GuessLikersThirdRule();
        guessLikersThirdRule.createTime = this.createTime;
        guessLikersThirdRule.maleSwipeNum = this.maleSwipeNum;
        guessLikersThirdRule.maleIntervalTime = this.maleIntervalTime;
        guessLikersThirdRule.femaleSwipeNum = this.femaleSwipeNum;
        guessLikersThirdRule.femaleIntervalTime = this.femaleIntervalTime;
        return guessLikersThirdRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuessLikersThirdRule)) {
            return false;
        }
        GuessLikersThirdRule guessLikersThirdRule = (GuessLikersThirdRule) obj;
        return this.createTime == guessLikersThirdRule.createTime && this.maleSwipeNum == guessLikersThirdRule.maleSwipeNum && this.maleIntervalTime == guessLikersThirdRule.maleIntervalTime && this.femaleSwipeNum == guessLikersThirdRule.femaleSwipeNum && this.femaleIntervalTime == guessLikersThirdRule.femaleIntervalTime;
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
        int i2 = (((((((((i * 41) + this.createTime) * 41) + this.maleSwipeNum) * 41) + this.maleIntervalTime) * 41) + this.femaleSwipeNum) * 41) + this.femaleIntervalTime;
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
