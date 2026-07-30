package com.p046p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCommonCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivecommoncount";

    @ProtobufIndex(index = 3)
    public int current;

    @ProtobufIndex(index = 2)
    public int remaining;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<BLiveCommonCount> PROTOBUF_ADAPTER = new C11582a();
    public static JsonAdapter<BLiveCommonCount> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCommonCount>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCommonCount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCommonCount.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCommonCount bLiveCommonCount, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", bLiveCommonCount.total);
            jsonGenerator.writeNumberField("remaining", bLiveCommonCount.remaining);
            jsonGenerator.writeNumberField("current", bLiveCommonCount.current);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCommonCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCommonCount$a */
    public class C11582a extends MessageNanoAdapter<BLiveCommonCount> {
        public C11582a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveCommonCount bLiveCommonCount) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, bLiveCommonCount.total) + CodedOutputByteBufferNano.m17226h(2, bLiveCommonCount.remaining) + CodedOutputByteBufferNano.m17226h(3, bLiveCommonCount.current);
            bLiveCommonCount.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveCommonCount parse(nb5 nb5Var) throws IOException {
            BLiveCommonCount bLiveCommonCount = new BLiveCommonCount();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    bLiveCommonCount.total = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    bLiveCommonCount.remaining = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return bLiveCommonCount;
                    }
                    bLiveCommonCount.current = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveCommonCount bLiveCommonCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, bLiveCommonCount.total);
            codedOutputByteBufferNano.m17250G(2, bLiveCommonCount.remaining);
            codedOutputByteBufferNano.m17250G(3, bLiveCommonCount.current);
        }
    }

    public static BLiveCommonCount new_() {
        BLiveCommonCount bLiveCommonCount = new BLiveCommonCount();
        bLiveCommonCount.nullCheck();
        return bLiveCommonCount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCommonCount mo223809clone() {
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
