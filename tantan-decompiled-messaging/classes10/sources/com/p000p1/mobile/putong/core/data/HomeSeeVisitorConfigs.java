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
public class HomeSeeVisitorConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "homeseevisitorconfigs";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int basicMatchNum;

    @ProtobufIndex(index = 4)
    public int basicSwipeNum;

    @ProtobufIndex(index = 1)
    public boolean homeShow;

    @ProtobufIndex(index = 6)
    public int pullSwipeRandMaxNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int showNewDurationSecond;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int showNewTimes;
    public static ProtobufAdapter<HomeSeeVisitorConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeSeeVisitorConfigs>() { // from class: com.p1.mobile.putong.core.data.HomeSeeVisitorConfigs.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeSeeVisitorConfigs homeSeeVisitorConfigs) {
            int iB = CodedOutputByteBufferNano.b(1, homeSeeVisitorConfigs.homeShow) + CodedOutputByteBufferNano.h(2, homeSeeVisitorConfigs.showNewTimes) + CodedOutputByteBufferNano.h(3, homeSeeVisitorConfigs.showNewDurationSecond) + CodedOutputByteBufferNano.h(4, homeSeeVisitorConfigs.basicSwipeNum) + CodedOutputByteBufferNano.h(5, homeSeeVisitorConfigs.basicMatchNum) + CodedOutputByteBufferNano.h(6, homeSeeVisitorConfigs.pullSwipeRandMaxNum);
            ((MessageNano) homeSeeVisitorConfigs).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeSeeVisitorConfigs m13311parse(nb5 nb5Var) throws IOException {
            HomeSeeVisitorConfigs homeSeeVisitorConfigs = new HomeSeeVisitorConfigs();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    homeSeeVisitorConfigs.homeShow = nb5Var.g();
                } else if (iU == 16) {
                    homeSeeVisitorConfigs.showNewTimes = nb5Var.j();
                } else if (iU == 24) {
                    homeSeeVisitorConfigs.showNewDurationSecond = nb5Var.j();
                } else if (iU == 32) {
                    homeSeeVisitorConfigs.basicSwipeNum = nb5Var.j();
                } else if (iU == 40) {
                    homeSeeVisitorConfigs.basicMatchNum = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return homeSeeVisitorConfigs;
                    }
                    homeSeeVisitorConfigs.pullSwipeRandMaxNum = nb5Var.j();
                }
            }
        }

        public void serialize(HomeSeeVisitorConfigs homeSeeVisitorConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, homeSeeVisitorConfigs.homeShow);
            codedOutputByteBufferNano.G(2, homeSeeVisitorConfigs.showNewTimes);
            codedOutputByteBufferNano.G(3, homeSeeVisitorConfigs.showNewDurationSecond);
            codedOutputByteBufferNano.G(4, homeSeeVisitorConfigs.basicSwipeNum);
            codedOutputByteBufferNano.G(5, homeSeeVisitorConfigs.basicMatchNum);
            codedOutputByteBufferNano.G(6, homeSeeVisitorConfigs.pullSwipeRandMaxNum);
        }
    };
    public static JsonAdapter<HomeSeeVisitorConfigs> JSON_ADAPTER = new ObjectJsonAdapter<HomeSeeVisitorConfigs>() { // from class: com.p1.mobile.putong.core.data.HomeSeeVisitorConfigs.2
        public Class getDataClass() {
            return HomeSeeVisitorConfigs.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeSeeVisitorConfigs m13312newInstance() {
            return new HomeSeeVisitorConfigs();
        }

        public boolean parseField(HomeSeeVisitorConfigs homeSeeVisitorConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "basicSwipeNum":
                    homeSeeVisitorConfigs.basicSwipeNum = jsonParser.getValueAsInt();
                    return true;
                case "basicMatchNum":
                    homeSeeVisitorConfigs.basicMatchNum = jsonParser.getValueAsInt();
                    return true;
                case "homeShow":
                    homeSeeVisitorConfigs.homeShow = jsonParser.getValueAsBoolean();
                    return true;
                case "showNewTimes":
                    homeSeeVisitorConfigs.showNewTimes = jsonParser.getValueAsInt();
                    return true;
                case "pullSwipeRandMaxNum":
                    homeSeeVisitorConfigs.pullSwipeRandMaxNum = jsonParser.getValueAsInt();
                    return true;
                case "showNewDurationSecond":
                    homeSeeVisitorConfigs.showNewDurationSecond = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeSeeVisitorConfigs homeSeeVisitorConfigs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "basicSwipeNum":
                case "basicMatchNum":
                case "homeShow":
                case "showNewTimes":
                case "pullSwipeRandMaxNum":
                case "showNewDurationSecond":
                    return true;
                default:
                    return super.parseFieldCheck(homeSeeVisitorConfigs, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(HomeSeeVisitorConfigs homeSeeVisitorConfigs, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("homeShow", homeSeeVisitorConfigs.homeShow);
            jsonGenerator.writeNumberField("showNewTimes", homeSeeVisitorConfigs.showNewTimes);
            jsonGenerator.writeNumberField("showNewDurationSecond", homeSeeVisitorConfigs.showNewDurationSecond);
            jsonGenerator.writeNumberField("basicSwipeNum", homeSeeVisitorConfigs.basicSwipeNum);
            jsonGenerator.writeNumberField("basicMatchNum", homeSeeVisitorConfigs.basicMatchNum);
            jsonGenerator.writeNumberField("pullSwipeRandMaxNum", homeSeeVisitorConfigs.pullSwipeRandMaxNum);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeSeeVisitorConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeSeeVisitorConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeSeeVisitorConfigs new_() {
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = new HomeSeeVisitorConfigs();
        homeSeeVisitorConfigs.nullCheck();
        return homeSeeVisitorConfigs;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeSeeVisitorConfigs m13310clone() {
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = new HomeSeeVisitorConfigs();
        homeSeeVisitorConfigs.homeShow = this.homeShow;
        homeSeeVisitorConfigs.showNewTimes = this.showNewTimes;
        homeSeeVisitorConfigs.showNewDurationSecond = this.showNewDurationSecond;
        homeSeeVisitorConfigs.basicSwipeNum = this.basicSwipeNum;
        homeSeeVisitorConfigs.basicMatchNum = this.basicMatchNum;
        homeSeeVisitorConfigs.pullSwipeRandMaxNum = this.pullSwipeRandMaxNum;
        return homeSeeVisitorConfigs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeSeeVisitorConfigs)) {
            return false;
        }
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = (HomeSeeVisitorConfigs) obj;
        return this.homeShow == homeSeeVisitorConfigs.homeShow && this.showNewTimes == homeSeeVisitorConfigs.showNewTimes && this.showNewDurationSecond == homeSeeVisitorConfigs.showNewDurationSecond && this.basicSwipeNum == homeSeeVisitorConfigs.basicSwipeNum && this.basicMatchNum == homeSeeVisitorConfigs.basicMatchNum && this.pullSwipeRandMaxNum == homeSeeVisitorConfigs.pullSwipeRandMaxNum;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.homeShow ? 1231 : 1237)) * 41) + this.showNewTimes) * 41) + this.showNewDurationSecond) * 41) + this.basicSwipeNum) * 41) + this.basicMatchNum) * 41) + this.pullSwipeRandMaxNum;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
