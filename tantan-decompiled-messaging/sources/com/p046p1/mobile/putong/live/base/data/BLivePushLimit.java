package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLivePushLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivepushlimit";

    @ProtobufIndex(index = 2)
    public double availableTime;

    @ProtobufIndex(index = 1)
    public int remaining;
    public static ProtobufAdapter<BLivePushLimit> PROTOBUF_ADAPTER = new C11997a();
    public static JsonAdapter<BLivePushLimit> JSON_ADAPTER = new ObjectJsonAdapter<BLivePushLimit>() { // from class: com.p1.mobile.putong.live.base.data.BLivePushLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePushLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePushLimit newInstance() {
            return new BLivePushLimit();
        }

        public boolean parseField(BLivePushLimit bLivePushLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("remaining")) {
                bLivePushLimit.remaining = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("availableTime")) {
                return false;
            }
            bLivePushLimit.availableTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePushLimit bLivePushLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", bLivePushLimit.remaining);
            jsonGenerator.writeFieldName("availableTime");
            Converter.API_TIME.serialize(Double.valueOf(bLivePushLimit.availableTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePushLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePushLimit$a */
    public class C11997a extends MessageNanoAdapter<BLivePushLimit> {
        public C11997a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLivePushLimit bLivePushLimit) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, bLivePushLimit.remaining) + CodedOutputByteBufferNano.m17222d(2, bLivePushLimit.availableTime);
            bLivePushLimit.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLivePushLimit parse(nb5 nb5Var) throws IOException {
            BLivePushLimit bLivePushLimit = new BLivePushLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    bLivePushLimit.remaining = nb5Var.m158741j();
                } else {
                    if (iM158752u != 17) {
                        return bLivePushLimit;
                    }
                    bLivePushLimit.availableTime = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLivePushLimit bLivePushLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, bLivePushLimit.remaining);
            codedOutputByteBufferNano.m17246C(2, bLivePushLimit.availableTime);
        }
    }

    public static BLivePushLimit new_() {
        BLivePushLimit bLivePushLimit = new BLivePushLimit();
        bLivePushLimit.nullCheck();
        return bLivePushLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePushLimit mo223809clone() {
        BLivePushLimit bLivePushLimit = new BLivePushLimit();
        bLivePushLimit.remaining = this.remaining;
        bLivePushLimit.availableTime = this.availableTime;
        return bLivePushLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePushLimit)) {
            return false;
        }
        BLivePushLimit bLivePushLimit = (BLivePushLimit) obj;
        return this.remaining == bLivePushLimit.remaining && this.availableTime == bLivePushLimit.availableTime;
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
