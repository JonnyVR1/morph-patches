package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
public class HeartbeatMatchData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatmatchdata";

    @ProtobufIndex(index = 2)
    public double expiredTime;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<HeartbeatMatchData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartbeatMatchData>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatchData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeartbeatMatchData heartbeatMatchData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, heartbeatMatchData.remaining) + CodedOutputByteBufferNano.m17277d(2, heartbeatMatchData.expiredTime);
            heartbeatMatchData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartbeatMatchData parse(nc5 nc5Var) throws IOException {
            HeartbeatMatchData heartbeatMatchData = new HeartbeatMatchData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    heartbeatMatchData.remaining = nc5Var.m162486j();
                } else {
                    if (iM162497u != 17) {
                        return heartbeatMatchData;
                    }
                    heartbeatMatchData.expiredTime = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartbeatMatchData heartbeatMatchData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, heartbeatMatchData.remaining);
            codedOutputByteBufferNano.m17301C(2, heartbeatMatchData.expiredTime);
        }
    };
    public static JsonAdapter<HeartbeatMatchData> JSON_ADAPTER = new ObjectJsonAdapter<HeartbeatMatchData>() { // from class: com.p1.mobile.putong.core.data.HeartbeatMatchData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartbeatMatchData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeartbeatMatchData newInstance() {
            return new HeartbeatMatchData();
        }

        public boolean parseField(HeartbeatMatchData heartbeatMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                heartbeatMatchData.expiredTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeartbeatMatchData heartbeatMatchData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", heartbeatMatchData.remaining);
            jsonGenerator.writeFieldName("expiredTime");
            Converter.API_TIME.serialize(Double.valueOf(heartbeatMatchData.expiredTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartbeatMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartbeatMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartbeatMatchData new_() {
        HeartbeatMatchData heartbeatMatchData = new HeartbeatMatchData();
        heartbeatMatchData.nullCheck();
        return heartbeatMatchData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeartbeatMatchData mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.remaining;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiredTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
