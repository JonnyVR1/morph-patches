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
public class HomeSeeVisitorConfigs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "homeseevisitorconfigs";

    @ProtobufIndex(index = 5)
    public int basicMatchNum;

    @ProtobufIndex(index = 4)
    public int basicSwipeNum;

    @ProtobufIndex(index = 1)
    public boolean homeShow;

    @ProtobufIndex(index = 6)
    public int pullSwipeRandMaxNum;

    @ProtobufIndex(index = 3)
    public int showNewDurationSecond;

    @ProtobufIndex(index = 2)
    public int showNewTimes;
    public static ProtobufAdapter<HomeSeeVisitorConfigs> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeSeeVisitorConfigs>() { // from class: com.p1.mobile.putong.core.data.HomeSeeVisitorConfigs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeSeeVisitorConfigs homeSeeVisitorConfigs) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, homeSeeVisitorConfigs.homeShow) + CodedOutputByteBufferNano.m17281h(2, homeSeeVisitorConfigs.showNewTimes) + CodedOutputByteBufferNano.m17281h(3, homeSeeVisitorConfigs.showNewDurationSecond) + CodedOutputByteBufferNano.m17281h(4, homeSeeVisitorConfigs.basicSwipeNum) + CodedOutputByteBufferNano.m17281h(5, homeSeeVisitorConfigs.basicMatchNum) + CodedOutputByteBufferNano.m17281h(6, homeSeeVisitorConfigs.pullSwipeRandMaxNum);
            homeSeeVisitorConfigs.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeSeeVisitorConfigs parse(nc5 nc5Var) throws IOException {
            HomeSeeVisitorConfigs homeSeeVisitorConfigs = new HomeSeeVisitorConfigs();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    homeSeeVisitorConfigs.homeShow = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    homeSeeVisitorConfigs.showNewTimes = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    homeSeeVisitorConfigs.showNewDurationSecond = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    homeSeeVisitorConfigs.basicSwipeNum = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    homeSeeVisitorConfigs.basicMatchNum = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        return homeSeeVisitorConfigs;
                    }
                    homeSeeVisitorConfigs.pullSwipeRandMaxNum = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeSeeVisitorConfigs homeSeeVisitorConfigs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, homeSeeVisitorConfigs.homeShow);
            codedOutputByteBufferNano.m17305G(2, homeSeeVisitorConfigs.showNewTimes);
            codedOutputByteBufferNano.m17305G(3, homeSeeVisitorConfigs.showNewDurationSecond);
            codedOutputByteBufferNano.m17305G(4, homeSeeVisitorConfigs.basicSwipeNum);
            codedOutputByteBufferNano.m17305G(5, homeSeeVisitorConfigs.basicMatchNum);
            codedOutputByteBufferNano.m17305G(6, homeSeeVisitorConfigs.pullSwipeRandMaxNum);
        }
    };
    public static JsonAdapter<HomeSeeVisitorConfigs> JSON_ADAPTER = new ObjectJsonAdapter<HomeSeeVisitorConfigs>() { // from class: com.p1.mobile.putong.core.data.HomeSeeVisitorConfigs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeSeeVisitorConfigs.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeSeeVisitorConfigs newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeSeeVisitorConfigs homeSeeVisitorConfigs, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("homeShow", homeSeeVisitorConfigs.homeShow);
            jsonGenerator.writeNumberField("showNewTimes", homeSeeVisitorConfigs.showNewTimes);
            jsonGenerator.writeNumberField("showNewDurationSecond", homeSeeVisitorConfigs.showNewDurationSecond);
            jsonGenerator.writeNumberField("basicSwipeNum", homeSeeVisitorConfigs.basicSwipeNum);
            jsonGenerator.writeNumberField("basicMatchNum", homeSeeVisitorConfigs.basicMatchNum);
            jsonGenerator.writeNumberField("pullSwipeRandMaxNum", homeSeeVisitorConfigs.pullSwipeRandMaxNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeSeeVisitorConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeSeeVisitorConfigs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeSeeVisitorConfigs new_() {
        HomeSeeVisitorConfigs homeSeeVisitorConfigs = new HomeSeeVisitorConfigs();
        homeSeeVisitorConfigs.nullCheck();
        return homeSeeVisitorConfigs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeSeeVisitorConfigs mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.homeShow ? 1231 : 1237)) * 41) + this.showNewTimes) * 41) + this.showNewDurationSecond) * 41) + this.basicSwipeNum) * 41) + this.basicMatchNum) * 41) + this.pullSwipeRandMaxNum;
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
