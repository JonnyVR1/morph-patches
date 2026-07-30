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
public class GrowthExposureInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthexposureinfo";

    @ProtobufIndex(index = 1)
    public int continuousSignDays;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int exposureNum;

    @ProtobufIndex(index = 4)
    public boolean isSignedToday;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long lastSignTime;
    public static ProtobufAdapter<GrowthExposureInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthExposureInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthExposureInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthExposureInfo growthExposureInfo) {
            int iH = CodedOutputByteBufferNano.h(1, growthExposureInfo.continuousSignDays) + CodedOutputByteBufferNano.h(2, growthExposureInfo.exposureNum) + CodedOutputByteBufferNano.j(3, growthExposureInfo.lastSignTime) + CodedOutputByteBufferNano.b(4, growthExposureInfo.isSignedToday);
            ((MessageNano) growthExposureInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthExposureInfo m13131parse(nb5 nb5Var) throws IOException {
            GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    growthExposureInfo.continuousSignDays = nb5Var.j();
                } else if (iU == 16) {
                    growthExposureInfo.exposureNum = nb5Var.j();
                } else if (iU == 24) {
                    growthExposureInfo.lastSignTime = nb5Var.k();
                } else {
                    if (iU != 32) {
                        return growthExposureInfo;
                    }
                    growthExposureInfo.isSignedToday = nb5Var.g();
                }
            }
        }

        public void serialize(GrowthExposureInfo growthExposureInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, growthExposureInfo.continuousSignDays);
            codedOutputByteBufferNano.G(2, growthExposureInfo.exposureNum);
            codedOutputByteBufferNano.I(3, growthExposureInfo.lastSignTime);
            codedOutputByteBufferNano.A(4, growthExposureInfo.isSignedToday);
        }
    };
    public static JsonAdapter<GrowthExposureInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthExposureInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthExposureInfo.2
        public Class getDataClass() {
            return GrowthExposureInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthExposureInfo m13132newInstance() {
            return new GrowthExposureInfo();
        }

        public boolean parseField(GrowthExposureInfo growthExposureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isSignedToday":
                    growthExposureInfo.isSignedToday = jsonParser.getValueAsBoolean();
                    return true;
                case "lastSignTime":
                    growthExposureInfo.lastSignTime = jsonParser.getValueAsLong();
                    return true;
                case "exposureNum":
                    growthExposureInfo.exposureNum = jsonParser.getValueAsInt();
                    return true;
                case "continuousSignDays":
                    growthExposureInfo.continuousSignDays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthExposureInfo growthExposureInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isSignedToday":
                case "lastSignTime":
                case "exposureNum":
                case "continuousSignDays":
                    return true;
                default:
                    return super.parseFieldCheck(growthExposureInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GrowthExposureInfo growthExposureInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("continuousSignDays", growthExposureInfo.continuousSignDays);
            jsonGenerator.writeNumberField("exposureNum", growthExposureInfo.exposureNum);
            jsonGenerator.writeNumberField("lastSignTime", growthExposureInfo.lastSignTime);
            jsonGenerator.writeBooleanField("isSignedToday", growthExposureInfo.isSignedToday);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthExposureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthExposureInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthExposureInfo new_() {
        GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
        growthExposureInfo.nullCheck();
        return growthExposureInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthExposureInfo m13130clone() {
        GrowthExposureInfo growthExposureInfo = new GrowthExposureInfo();
        growthExposureInfo.continuousSignDays = this.continuousSignDays;
        growthExposureInfo.exposureNum = this.exposureNum;
        growthExposureInfo.lastSignTime = this.lastSignTime;
        growthExposureInfo.isSignedToday = this.isSignedToday;
        return growthExposureInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthExposureInfo)) {
            return false;
        }
        GrowthExposureInfo growthExposureInfo = (GrowthExposureInfo) obj;
        return this.continuousSignDays == growthExposureInfo.continuousSignDays && this.exposureNum == growthExposureInfo.exposureNum && this.lastSignTime == growthExposureInfo.lastSignTime && this.isSignedToday == growthExposureInfo.isSignedToday;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.continuousSignDays) * 41) + this.exposureNum) * 41;
        long j = this.lastSignTime;
        int i3 = ((i2 + ((int) (j ^ (j >>> 32)))) * 41) + (this.isSignedToday ? 1231 : 1237);
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
