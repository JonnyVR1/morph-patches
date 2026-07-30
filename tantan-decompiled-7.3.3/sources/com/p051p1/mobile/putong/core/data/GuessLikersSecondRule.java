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
public class GuessLikersSecondRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikerssecondrule";

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
    public static ProtobufAdapter<GuessLikersSecondRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersSecondRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersSecondRule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GuessLikersSecondRule guessLikersSecondRule) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, guessLikersSecondRule.createTime) + CodedOutputByteBufferNano.m17281h(2, guessLikersSecondRule.maleSwipeNum) + CodedOutputByteBufferNano.m17281h(3, guessLikersSecondRule.maleIntervalTime) + CodedOutputByteBufferNano.m17281h(4, guessLikersSecondRule.femaleSwipeNum) + CodedOutputByteBufferNano.m17281h(5, guessLikersSecondRule.femaleIntervalTime);
            guessLikersSecondRule.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuessLikersSecondRule parse(nc5 nc5Var) throws IOException {
            GuessLikersSecondRule guessLikersSecondRule = new GuessLikersSecondRule();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    guessLikersSecondRule.createTime = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    guessLikersSecondRule.maleSwipeNum = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    guessLikersSecondRule.maleIntervalTime = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    guessLikersSecondRule.femaleSwipeNum = nc5Var.m162486j();
                } else {
                    if (iM162497u != 40) {
                        return guessLikersSecondRule;
                    }
                    guessLikersSecondRule.femaleIntervalTime = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuessLikersSecondRule guessLikersSecondRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, guessLikersSecondRule.createTime);
            codedOutputByteBufferNano.m17305G(2, guessLikersSecondRule.maleSwipeNum);
            codedOutputByteBufferNano.m17305G(3, guessLikersSecondRule.maleIntervalTime);
            codedOutputByteBufferNano.m17305G(4, guessLikersSecondRule.femaleSwipeNum);
            codedOutputByteBufferNano.m17305G(5, guessLikersSecondRule.femaleIntervalTime);
        }
    };
    public static JsonAdapter<GuessLikersSecondRule> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersSecondRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersSecondRule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuessLikersSecondRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GuessLikersSecondRule newInstance() {
            return new GuessLikersSecondRule();
        }

        public boolean parseField(GuessLikersSecondRule guessLikersSecondRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                    guessLikersSecondRule.maleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "maleSwipeNum":
                    guessLikersSecondRule.maleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                case "femaleIntervalTime":
                    guessLikersSecondRule.femaleIntervalTime = jsonParser.getValueAsInt();
                    return true;
                case "createTime":
                    guessLikersSecondRule.createTime = jsonParser.getValueAsInt();
                    return true;
                case "femaleSwipeNum":
                    guessLikersSecondRule.femaleSwipeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GuessLikersSecondRule guessLikersSecondRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maleIntervalTime":
                case "maleSwipeNum":
                case "femaleIntervalTime":
                case "createTime":
                case "femaleSwipeNum":
                    return true;
                default:
                    return super.parseFieldCheck(guessLikersSecondRule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GuessLikersSecondRule guessLikersSecondRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createTime", guessLikersSecondRule.createTime);
            jsonGenerator.writeNumberField("maleSwipeNum", guessLikersSecondRule.maleSwipeNum);
            jsonGenerator.writeNumberField("maleIntervalTime", guessLikersSecondRule.maleIntervalTime);
            jsonGenerator.writeNumberField("femaleSwipeNum", guessLikersSecondRule.femaleSwipeNum);
            jsonGenerator.writeNumberField("femaleIntervalTime", guessLikersSecondRule.femaleIntervalTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersSecondRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersSecondRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersSecondRule new_() {
        GuessLikersSecondRule guessLikersSecondRule = new GuessLikersSecondRule();
        guessLikersSecondRule.nullCheck();
        return guessLikersSecondRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GuessLikersSecondRule mo225055clone() {
        GuessLikersSecondRule guessLikersSecondRule = new GuessLikersSecondRule();
        guessLikersSecondRule.createTime = this.createTime;
        guessLikersSecondRule.maleSwipeNum = this.maleSwipeNum;
        guessLikersSecondRule.maleIntervalTime = this.maleIntervalTime;
        guessLikersSecondRule.femaleSwipeNum = this.femaleSwipeNum;
        guessLikersSecondRule.femaleIntervalTime = this.femaleIntervalTime;
        return guessLikersSecondRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuessLikersSecondRule)) {
            return false;
        }
        GuessLikersSecondRule guessLikersSecondRule = (GuessLikersSecondRule) obj;
        return this.createTime == guessLikersSecondRule.createTime && this.maleSwipeNum == guessLikersSecondRule.maleSwipeNum && this.maleIntervalTime == guessLikersSecondRule.maleIntervalTime && this.femaleSwipeNum == guessLikersSecondRule.femaleSwipeNum && this.femaleIntervalTime == guessLikersSecondRule.femaleIntervalTime;
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
