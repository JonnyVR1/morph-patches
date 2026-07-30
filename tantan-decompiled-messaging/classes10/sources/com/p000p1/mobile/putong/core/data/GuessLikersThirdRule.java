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
public class GuessLikersThirdRule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guesslikersthirdrule";

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
    public static ProtobufAdapter<GuessLikersThirdRule> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuessLikersThirdRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersThirdRule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GuessLikersThirdRule guessLikersThirdRule) {
            int iH = CodedOutputByteBufferNano.h(1, guessLikersThirdRule.createTime) + CodedOutputByteBufferNano.h(2, guessLikersThirdRule.maleSwipeNum) + CodedOutputByteBufferNano.h(3, guessLikersThirdRule.maleIntervalTime) + CodedOutputByteBufferNano.h(4, guessLikersThirdRule.femaleSwipeNum) + CodedOutputByteBufferNano.h(5, guessLikersThirdRule.femaleIntervalTime);
            ((MessageNano) guessLikersThirdRule).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GuessLikersThirdRule m13171parse(nb5 nb5Var) throws IOException {
            GuessLikersThirdRule guessLikersThirdRule = new GuessLikersThirdRule();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    guessLikersThirdRule.createTime = nb5Var.j();
                } else if (iU == 16) {
                    guessLikersThirdRule.maleSwipeNum = nb5Var.j();
                } else if (iU == 24) {
                    guessLikersThirdRule.maleIntervalTime = nb5Var.j();
                } else if (iU == 32) {
                    guessLikersThirdRule.femaleSwipeNum = nb5Var.j();
                } else {
                    if (iU != 40) {
                        return guessLikersThirdRule;
                    }
                    guessLikersThirdRule.femaleIntervalTime = nb5Var.j();
                }
            }
        }

        public void serialize(GuessLikersThirdRule guessLikersThirdRule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, guessLikersThirdRule.createTime);
            codedOutputByteBufferNano.G(2, guessLikersThirdRule.maleSwipeNum);
            codedOutputByteBufferNano.G(3, guessLikersThirdRule.maleIntervalTime);
            codedOutputByteBufferNano.G(4, guessLikersThirdRule.femaleSwipeNum);
            codedOutputByteBufferNano.G(5, guessLikersThirdRule.femaleIntervalTime);
        }
    };
    public static JsonAdapter<GuessLikersThirdRule> JSON_ADAPTER = new ObjectJsonAdapter<GuessLikersThirdRule>() { // from class: com.p1.mobile.putong.core.data.GuessLikersThirdRule.2
        public Class getDataClass() {
            return GuessLikersThirdRule.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GuessLikersThirdRule m13172newInstance() {
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

        public void serializeFields(GuessLikersThirdRule guessLikersThirdRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("createTime", guessLikersThirdRule.createTime);
            jsonGenerator.writeNumberField("maleSwipeNum", guessLikersThirdRule.maleSwipeNum);
            jsonGenerator.writeNumberField("maleIntervalTime", guessLikersThirdRule.maleIntervalTime);
            jsonGenerator.writeNumberField("femaleSwipeNum", guessLikersThirdRule.femaleSwipeNum);
            jsonGenerator.writeNumberField("femaleIntervalTime", guessLikersThirdRule.femaleIntervalTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuessLikersThirdRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuessLikersThirdRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuessLikersThirdRule new_() {
        GuessLikersThirdRule guessLikersThirdRule = new GuessLikersThirdRule();
        guessLikersThirdRule.nullCheck();
        return guessLikersThirdRule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GuessLikersThirdRule m13170clone() {
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
