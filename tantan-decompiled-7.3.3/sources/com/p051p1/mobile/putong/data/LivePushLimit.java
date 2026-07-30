package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class LivePushLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livepushlimit";

    @ProtobufIndex(index = 2)
    public double availableTime;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<LivePushLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<LivePushLimit>() { // from class: com.p1.mobile.putong.data.LivePushLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LivePushLimit livePushLimit) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, livePushLimit.remaining) + CodedOutputByteBufferNano.m17277d(2, livePushLimit.availableTime);
            livePushLimit.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LivePushLimit parse(nc5 nc5Var) throws IOException {
            LivePushLimit livePushLimit = new LivePushLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    livePushLimit.remaining = nc5Var.m162486j();
                } else {
                    if (iM162497u != 17) {
                        return livePushLimit;
                    }
                    livePushLimit.availableTime = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LivePushLimit livePushLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, livePushLimit.remaining);
            codedOutputByteBufferNano.m17301C(2, livePushLimit.availableTime);
        }
    };
    public static JsonAdapter<LivePushLimit> JSON_ADAPTER = new ObjectJsonAdapter<LivePushLimit>() { // from class: com.p1.mobile.putong.data.LivePushLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LivePushLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LivePushLimit newInstance() {
            return new LivePushLimit();
        }

        public boolean parseField(LivePushLimit livePushLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("remaining")) {
                livePushLimit.remaining = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("availableTime")) {
                return false;
            }
            livePushLimit.availableTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(LivePushLimit livePushLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("remaining") || str.equals("availableTime")) {
                return true;
            }
            return super.parseFieldCheck(livePushLimit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LivePushLimit livePushLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", livePushLimit.remaining);
            jsonGenerator.writeFieldName("availableTime");
            Converter.API_TIME.serialize(Double.valueOf(livePushLimit.availableTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LivePushLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LivePushLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LivePushLimit new_() {
        LivePushLimit livePushLimit = new LivePushLimit();
        livePushLimit.nullCheck();
        return livePushLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LivePushLimit mo225055clone() {
        LivePushLimit livePushLimit = new LivePushLimit();
        livePushLimit.remaining = this.remaining;
        livePushLimit.availableTime = this.availableTime;
        return livePushLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LivePushLimit)) {
            return false;
        }
        LivePushLimit livePushLimit = (LivePushLimit) obj;
        return this.remaining == livePushLimit.remaining && this.availableTime == livePushLimit.availableTime;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.availableTime);
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
