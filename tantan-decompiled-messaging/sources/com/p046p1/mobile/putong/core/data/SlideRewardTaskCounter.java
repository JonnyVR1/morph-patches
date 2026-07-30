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
public class SlideRewardTaskCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sliderewardtaskcounter";

    @ProtobufIndex(index = 4)
    public int lotteryChoice;

    @ProtobufIndex(index = 3)
    public boolean notify;

    @ProtobufIndex(index = 2)
    public int reward;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<SlideRewardTaskCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<SlideRewardTaskCounter>() { // from class: com.p1.mobile.putong.core.data.SlideRewardTaskCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SlideRewardTaskCounter slideRewardTaskCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, slideRewardTaskCounter.total) + CodedOutputByteBufferNano.m17226h(2, slideRewardTaskCounter.reward) + CodedOutputByteBufferNano.m17220b(3, slideRewardTaskCounter.notify) + CodedOutputByteBufferNano.m17226h(4, slideRewardTaskCounter.lotteryChoice);
            slideRewardTaskCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SlideRewardTaskCounter parse(nb5 nb5Var) throws IOException {
            SlideRewardTaskCounter slideRewardTaskCounter = new SlideRewardTaskCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    slideRewardTaskCounter.total = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    slideRewardTaskCounter.reward = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    slideRewardTaskCounter.notify = nb5Var.m158738g();
                } else {
                    if (iM158752u != 32) {
                        return slideRewardTaskCounter;
                    }
                    slideRewardTaskCounter.lotteryChoice = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SlideRewardTaskCounter slideRewardTaskCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, slideRewardTaskCounter.total);
            codedOutputByteBufferNano.m17250G(2, slideRewardTaskCounter.reward);
            codedOutputByteBufferNano.m17244A(3, slideRewardTaskCounter.notify);
            codedOutputByteBufferNano.m17250G(4, slideRewardTaskCounter.lotteryChoice);
        }
    };
    public static JsonAdapter<SlideRewardTaskCounter> JSON_ADAPTER = new ObjectJsonAdapter<SlideRewardTaskCounter>() { // from class: com.p1.mobile.putong.core.data.SlideRewardTaskCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SlideRewardTaskCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SlideRewardTaskCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SlideRewardTaskCounter slideRewardTaskCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", slideRewardTaskCounter.total);
            jsonGenerator.writeNumberField("reward", slideRewardTaskCounter.reward);
            jsonGenerator.writeBooleanField("notify", slideRewardTaskCounter.notify);
            jsonGenerator.writeNumberField("lotteryChoice", slideRewardTaskCounter.lotteryChoice);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SlideRewardTaskCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SlideRewardTaskCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SlideRewardTaskCounter new_() {
        SlideRewardTaskCounter slideRewardTaskCounter = new SlideRewardTaskCounter();
        slideRewardTaskCounter.nullCheck();
        return slideRewardTaskCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SlideRewardTaskCounter mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.total) * 41) + this.reward) * 41) + (this.notify ? 1231 : 1237)) * 41) + this.lotteryChoice;
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
