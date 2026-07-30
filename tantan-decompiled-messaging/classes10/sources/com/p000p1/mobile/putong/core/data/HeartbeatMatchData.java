package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class HeartbeatMatchData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatmatchdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double expiredTime;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<HeartbeatMatchData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartbeatMatchData>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatchData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HeartbeatMatchData heartbeatMatchData) {
            int iH = CodedOutputByteBufferNano.h(1, heartbeatMatchData.remaining) + CodedOutputByteBufferNano.d(2, heartbeatMatchData.expiredTime);
            ((MessageNano) heartbeatMatchData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HeartbeatMatchData m13251parse(nb5 nb5Var) throws IOException {
            HeartbeatMatchData heartbeatMatchData = new HeartbeatMatchData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    heartbeatMatchData.remaining = nb5Var.j();
                } else {
                    if (iU != 17) {
                        return heartbeatMatchData;
                    }
                    heartbeatMatchData.expiredTime = nb5Var.h();
                }
            }
        }

        public void serialize(HeartbeatMatchData heartbeatMatchData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, heartbeatMatchData.remaining);
            codedOutputByteBufferNano.C(2, heartbeatMatchData.expiredTime);
        }
    };
    public static JsonAdapter<HeartbeatMatchData> JSON_ADAPTER = new ObjectJsonAdapter<HeartbeatMatchData>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatchData.2
        public Class getDataClass() {
            return HeartbeatMatchData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HeartbeatMatchData m13252newInstance() {
            return new HeartbeatMatchData();
        }

        public boolean parseField(HeartbeatMatchData heartbeatMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                heartbeatMatchData.expiredTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                return true;
            }
            if (!str.equals("remaining")) {
                return false;
            }
            heartbeatMatchData.remaining = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(HeartbeatMatchData heartbeatMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTime") || str.equals("remaining")) {
                return true;
            }
            return super.parseFieldCheck(heartbeatMatchData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HeartbeatMatchData heartbeatMatchData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", heartbeatMatchData.remaining);
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(heartbeatMatchData.expiredTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartbeatMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartbeatMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartbeatMatchData new_() {
        HeartbeatMatchData heartbeatMatchData = new HeartbeatMatchData();
        heartbeatMatchData.nullCheck();
        return heartbeatMatchData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HeartbeatMatchData m13250clone() {
        HeartbeatMatchData heartbeatMatchData = new HeartbeatMatchData();
        heartbeatMatchData.remaining = this.remaining;
        heartbeatMatchData.expiredTime = this.expiredTime;
        return heartbeatMatchData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartbeatMatchData)) {
            return false;
        }
        HeartbeatMatchData heartbeatMatchData = (HeartbeatMatchData) obj;
        return this.remaining == heartbeatMatchData.remaining && this.expiredTime == heartbeatMatchData.expiredTime;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.remaining;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
