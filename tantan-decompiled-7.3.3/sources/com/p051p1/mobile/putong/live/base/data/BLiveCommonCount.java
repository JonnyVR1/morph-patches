package com.p051p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCommonCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivecommoncount";

    @ProtobufIndex(index = 3)
    public int current;

    @ProtobufIndex(index = 2)
    public int remaining;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<BLiveCommonCount> PROTOBUF_ADAPTER = new C11745a();
    public static JsonAdapter<BLiveCommonCount> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCommonCount>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCommonCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCommonCount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCommonCount newInstance() {
            return new BLiveCommonCount();
        }

        public boolean parseField(BLiveCommonCount bLiveCommonCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "total":
                    bLiveCommonCount.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    bLiveCommonCount.remaining = jsonParser.getValueAsInt();
                    return true;
                case "current":
                    bLiveCommonCount.current = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCommonCount bLiveCommonCount, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", bLiveCommonCount.total);
            jsonGenerator.writeNumberField("remaining", bLiveCommonCount.remaining);
            jsonGenerator.writeNumberField("current", bLiveCommonCount.current);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCommonCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCommonCount$a */
    public class C11745a extends MessageNanoAdapter<BLiveCommonCount> {
        public C11745a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveCommonCount bLiveCommonCount) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, bLiveCommonCount.total) + CodedOutputByteBufferNano.m17281h(2, bLiveCommonCount.remaining) + CodedOutputByteBufferNano.m17281h(3, bLiveCommonCount.current);
            bLiveCommonCount.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveCommonCount parse(nc5 nc5Var) throws IOException {
            BLiveCommonCount bLiveCommonCount = new BLiveCommonCount();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    bLiveCommonCount.total = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    bLiveCommonCount.remaining = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return bLiveCommonCount;
                    }
                    bLiveCommonCount.current = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveCommonCount bLiveCommonCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, bLiveCommonCount.total);
            codedOutputByteBufferNano.m17305G(2, bLiveCommonCount.remaining);
            codedOutputByteBufferNano.m17305G(3, bLiveCommonCount.current);
        }
    }

    public static BLiveCommonCount new_() {
        BLiveCommonCount bLiveCommonCount = new BLiveCommonCount();
        bLiveCommonCount.nullCheck();
        return bLiveCommonCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCommonCount mo225055clone() {
        BLiveCommonCount bLiveCommonCount = new BLiveCommonCount();
        bLiveCommonCount.total = this.total;
        bLiveCommonCount.remaining = this.remaining;
        bLiveCommonCount.current = this.current;
        return bLiveCommonCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCommonCount)) {
            return false;
        }
        BLiveCommonCount bLiveCommonCount = (BLiveCommonCount) obj;
        return this.total == bLiveCommonCount.total && this.remaining == bLiveCommonCount.remaining && this.current == bLiveCommonCount.current;
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
        int i2 = (((((i * 41) + this.total) * 41) + this.remaining) * 41) + this.current;
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
