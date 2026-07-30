package com.p051p1.mobile.putong.core.data;

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
public class GuessLikersFirstRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikersfirstrule";

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
    public static ProtobufAdapter<GuessLikersFirstRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersFirstRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersFirstRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GuessLikersFirstRule guessLikersFirstRule) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, guessLikersFirstRule.createTime) + CodedOutputByteBufferNano.m17281h(2, guessLikersFirstRule.maleSwipeNum) + CodedOutputByteBufferNano.m17281h(3, guessLikersFirstRule.maleIntervalTime) + CodedOutputByteBufferNano.m17281h(4, guessLikersFirstRule.femaleSwipeNum) + CodedOutputByteBufferNano.m17281h(5, guessLikersFirstRule.femaleIntervalTime);
            guessLikersFirstRule.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuessLikersFirstRule parse(nc5 nc5Var) throws IOException {
            GuessLikersFirstRule guessLikersFirstRule = new GuessLikersFirstRule();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    guessLikersFirstRule.createTime = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    guessLikersFirstRule.maleSwipeNum = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    guessLikersFirstRule.maleIntervalTime = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    guessLikersFirstRule.femaleSwipeNum = nc5Var.m162486j();
                } else {
                    if (iM162497u != 40) {
                        return guessLikersFirstRule;
                    }
                    guessLikersFirstRule.femaleIntervalTime = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuessLikersFirstRule guessLikersFirstRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, guessLikersFirstRule.createTime);
            codedOutputByteBufferNano.m17305G(2, guessLikersFirstRule.maleSwipeNum);
            codedOutputByteBufferNano.m17305G(3, guessLikersFirstRule.maleIntervalTime);
            codedOutputByteBufferNano.m17305G(4, guessLikersFirstRule.femaleSwipeNum);
            codedOutputByteBufferNano.m17305G(5, guessLikersFirstRule.femaleIntervalTime);
        }
    };
    public static JsonAdapter<GuessLikersFirstRule> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersFirstRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersFirstRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuessLikersFirstRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GuessLikersFirstRule newInstance() {
            return new GuessLikersFirstRule();
        }

        public boolean parseField(GuessLikersFirstRule guessLikersFirstRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                    guessLikersFirstRule.maleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "maleSwipeNum":
                    guessLikersFirstRule.maleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                case "femaleIntervalTime":
                    guessLikersFirstRule.femaleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "createTime":
                    guessLikersFirstRule.createTime = jsonParser.getValueAsInt();
                    return true;
                case "femaleSwipeNum":
                    guessLikersFirstRule.femaleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GuessLikersFirstRule guessLikersFirstRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                case "maleSwipeNum":
                case "femaleIntervalTime":
                case "createTime":
                case "femaleSwipeNum":
                    return true;
                default:
                    return super.parseFieldCheck(guessLikersFirstRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GuessLikersFirstRule guessLikersFirstRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createTime", guessLikersFirstRule.createTime);
            jsonGenerator.writeNumberField("maleSwipeNum", guessLikersFirstRule.maleSwipeNum);
            jsonGenerator.writeNumberField("maleIntervalTime", guessLikersFirstRule.maleIntervalTime);
            jsonGenerator.writeNumberField("femaleSwipeNum", guessLikersFirstRule.femaleSwipeNum);
            jsonGenerator.writeNumberField("femaleIntervalTime", guessLikersFirstRule.femaleIntervalTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersFirstRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersFirstRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersFirstRule new_() {
        GuessLikersFirstRule guessLikersFirstRule = new GuessLikersFirstRule();
        guessLikersFirstRule.nullCheck();
        return guessLikersFirstRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GuessLikersFirstRule mo225055clone() {
        GuessLikersFirstRule guessLikersFirstRule = new GuessLikersFirstRule();
        guessLikersFirstRule.createTime = this.createTime;
        guessLikersFirstRule.maleSwipeNum = this.maleSwipeNum;
        guessLikersFirstRule.maleIntervalTime = this.maleIntervalTime;
        guessLikersFirstRule.femaleSwipeNum = this.femaleSwipeNum;
        guessLikersFirstRule.femaleIntervalTime = this.femaleIntervalTime;
        return guessLikersFirstRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuessLikersFirstRule)) {
            return false;
        }
        GuessLikersFirstRule guessLikersFirstRule = (GuessLikersFirstRule) obj;
        return this.createTime == guessLikersFirstRule.createTime && this.maleSwipeNum == guessLikersFirstRule.maleSwipeNum && this.maleIntervalTime == guessLikersFirstRule.maleIntervalTime && this.femaleSwipeNum == guessLikersFirstRule.femaleSwipeNum && this.femaleIntervalTime == guessLikersFirstRule.femaleIntervalTime;
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
