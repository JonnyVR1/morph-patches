package com.p000p1.mobile.putong.core.data;

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
public class GuessLikersSecondRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikerssecondrule";

    @ProtobufIndex(index = 1)
    public int createTime;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int femaleIntervalTime;

    @ProtobufIndex(index = 4)
    public int femaleSwipeNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int maleIntervalTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int maleSwipeNum;
    public static ProtobufAdapter<GuessLikersSecondRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersSecondRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersSecondRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GuessLikersSecondRule guessLikersSecondRule) {
            int iH = CodedOutputByteBufferNano.h(1, guessLikersSecondRule.createTime) + CodedOutputByteBufferNano.h(2, guessLikersSecondRule.maleSwipeNum) + CodedOutputByteBufferNano.h(3, guessLikersSecondRule.maleIntervalTime) + CodedOutputByteBufferNano.h(4, guessLikersSecondRule.femaleSwipeNum) + CodedOutputByteBufferNano.h(5, guessLikersSecondRule.femaleIntervalTime);
            ((MessageNano) guessLikersSecondRule).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GuessLikersSecondRule m13167parse(nb5 nb5Var) throws IOException {
            GuessLikersSecondRule guessLikersSecondRule = new GuessLikersSecondRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    guessLikersSecondRule.createTime = nb5Var.j();
                } else if (iU == 16) {
                    guessLikersSecondRule.maleSwipeNum = nb5Var.j();
                } else if (iU == 24) {
                    guessLikersSecondRule.maleIntervalTime = nb5Var.j();
                } else if (iU == 32) {
                    guessLikersSecondRule.femaleSwipeNum = nb5Var.j();
                } else {
                    if (iU != 40) {
                        return guessLikersSecondRule;
                    }
                    guessLikersSecondRule.femaleIntervalTime = nb5Var.j();
                }
            }
        }

        public void serialize(GuessLikersSecondRule guessLikersSecondRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, guessLikersSecondRule.createTime);
            codedOutputByteBufferNano.G(2, guessLikersSecondRule.maleSwipeNum);
            codedOutputByteBufferNano.G(3, guessLikersSecondRule.maleIntervalTime);
            codedOutputByteBufferNano.G(4, guessLikersSecondRule.femaleSwipeNum);
            codedOutputByteBufferNano.G(5, guessLikersSecondRule.femaleIntervalTime);
        }
    };
    public static JsonAdapter<GuessLikersSecondRule> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersSecondRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersSecondRule.2
        public Class getDataClass() {
            return GuessLikersSecondRule.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GuessLikersSecondRule m13168newInstance() {
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

        public void serializeFields(GuessLikersSecondRule guessLikersSecondRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createTime", guessLikersSecondRule.createTime);
            jsonGenerator.writeNumberField("maleSwipeNum", guessLikersSecondRule.maleSwipeNum);
            jsonGenerator.writeNumberField("maleIntervalTime", guessLikersSecondRule.maleIntervalTime);
            jsonGenerator.writeNumberField("femaleSwipeNum", guessLikersSecondRule.femaleSwipeNum);
            jsonGenerator.writeNumberField("femaleIntervalTime", guessLikersSecondRule.femaleIntervalTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersSecondRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersSecondRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersSecondRule new_() {
        GuessLikersSecondRule guessLikersSecondRule = new GuessLikersSecondRule();
        guessLikersSecondRule.nullCheck();
        return guessLikersSecondRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GuessLikersSecondRule m13166clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((i * 41) + this.createTime) * 41) + this.maleSwipeNum) * 41) + this.maleIntervalTime) * 41) + this.femaleSwipeNum) * 41) + this.femaleIntervalTime;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
