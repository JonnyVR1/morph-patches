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
public class SlideRewardTaskCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sliderewardtaskcounter";

    @ProtobufIndex(index = 4)
    public int lotteryChoice;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean notify;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int reward;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<SlideRewardTaskCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<SlideRewardTaskCounter>() { // from class: com.p1.mobile.putong.core.data.SlideRewardTaskCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SlideRewardTaskCounter slideRewardTaskCounter) {
            int iH = CodedOutputByteBufferNano.h(1, slideRewardTaskCounter.total) + CodedOutputByteBufferNano.h(2, slideRewardTaskCounter.reward) + CodedOutputByteBufferNano.b(3, slideRewardTaskCounter.notify) + CodedOutputByteBufferNano.h(4, slideRewardTaskCounter.lotteryChoice);
            ((MessageNano) slideRewardTaskCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SlideRewardTaskCounter m15672parse(nb5 nb5Var) throws IOException {
            SlideRewardTaskCounter slideRewardTaskCounter = new SlideRewardTaskCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    slideRewardTaskCounter.total = nb5Var.j();
                } else if (iU == 16) {
                    slideRewardTaskCounter.reward = nb5Var.j();
                } else if (iU == 24) {
                    slideRewardTaskCounter.notify = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return slideRewardTaskCounter;
                    }
                    slideRewardTaskCounter.lotteryChoice = nb5Var.j();
                }
            }
        }

        public void serialize(SlideRewardTaskCounter slideRewardTaskCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, slideRewardTaskCounter.total);
            codedOutputByteBufferNano.G(2, slideRewardTaskCounter.reward);
            codedOutputByteBufferNano.A(3, slideRewardTaskCounter.notify);
            codedOutputByteBufferNano.G(4, slideRewardTaskCounter.lotteryChoice);
        }
    };
    public static JsonAdapter<SlideRewardTaskCounter> JSON_ADAPTER = new ObjectJsonAdapter<SlideRewardTaskCounter>() { // from class: com.p1.mobile.putong.core.data.SlideRewardTaskCounter.2
        public Class getDataClass() {
            return SlideRewardTaskCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SlideRewardTaskCounter m15673newInstance() {
            return new SlideRewardTaskCounter();
        }

        public boolean parseField(SlideRewardTaskCounter slideRewardTaskCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "notify":
                    slideRewardTaskCounter.notify = jsonParser.getValueAsBoolean();
                    return true;
                case "reward":
                    slideRewardTaskCounter.reward = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    slideRewardTaskCounter.total = jsonParser.getValueAsInt();
                    return true;
                case "lotteryChoice":
                    slideRewardTaskCounter.lotteryChoice = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SlideRewardTaskCounter slideRewardTaskCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "notify":
                case "reward":
                case "total":
                case "lotteryChoice":
                    return true;
                default:
                    return super.parseFieldCheck(slideRewardTaskCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SlideRewardTaskCounter slideRewardTaskCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", slideRewardTaskCounter.total);
            jsonGenerator.writeNumberField("reward", slideRewardTaskCounter.reward);
            jsonGenerator.writeBooleanField("notify", slideRewardTaskCounter.notify);
            jsonGenerator.writeNumberField("lotteryChoice", slideRewardTaskCounter.lotteryChoice);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SlideRewardTaskCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SlideRewardTaskCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SlideRewardTaskCounter new_() {
        SlideRewardTaskCounter slideRewardTaskCounter = new SlideRewardTaskCounter();
        slideRewardTaskCounter.nullCheck();
        return slideRewardTaskCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SlideRewardTaskCounter m15671clone() {
        SlideRewardTaskCounter slideRewardTaskCounter = new SlideRewardTaskCounter();
        slideRewardTaskCounter.total = this.total;
        slideRewardTaskCounter.reward = this.reward;
        slideRewardTaskCounter.notify = this.notify;
        slideRewardTaskCounter.lotteryChoice = this.lotteryChoice;
        return slideRewardTaskCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SlideRewardTaskCounter)) {
            return false;
        }
        SlideRewardTaskCounter slideRewardTaskCounter = (SlideRewardTaskCounter) obj;
        return this.total == slideRewardTaskCounter.total && this.reward == slideRewardTaskCounter.reward && this.notify == slideRewardTaskCounter.notify && this.lotteryChoice == slideRewardTaskCounter.lotteryChoice;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.total) * 41) + this.reward) * 41) + (this.notify ? 1231 : 1237)) * 41) + this.lotteryChoice;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
