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
public class SquareDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "squaredetail";

    @ProtobufIndex(index = 2)
    public long currentSeq;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<SquareDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<SquareDetail>() { // from class: com.p1.mobile.putong.data.SquareDetail.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SquareDetail squareDetail) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, squareDetail.unreadCount) + CodedOutputByteBufferNano.m17283j(2, squareDetail.currentSeq);
            squareDetail.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SquareDetail parse(nc5 nc5Var) throws IOException {
            SquareDetail squareDetail = new SquareDetail();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    squareDetail.unreadCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return squareDetail;
                    }
                    squareDetail.currentSeq = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SquareDetail squareDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, squareDetail.unreadCount);
            codedOutputByteBufferNano.m17307I(2, squareDetail.currentSeq);
        }
    };
    public static JsonAdapter<SquareDetail> JSON_ADAPTER = new ObjectJsonAdapter<SquareDetail>() { // from class: com.p1.mobile.putong.data.SquareDetail.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SquareDetail.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SquareDetail newInstance() {
            return new SquareDetail();
        }

        public boolean parseField(SquareDetail squareDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("currentSeq")) {
                squareDetail.currentSeq = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("unreadCount")) {
                return false;
            }
            squareDetail.unreadCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SquareDetail squareDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("currentSeq") || str.equals("unreadCount")) {
                return true;
            }
            return super.parseFieldCheck(squareDetail, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SquareDetail squareDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", squareDetail.unreadCount);
            jsonGenerator.writeNumberField("currentSeq", squareDetail.currentSeq);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SquareDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SquareDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SquareDetail new_() {
        SquareDetail squareDetail = new SquareDetail();
        squareDetail.nullCheck();
        return squareDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SquareDetail mo225055clone() {
        SquareDetail squareDetail = new SquareDetail();
        squareDetail.unreadCount = this.unreadCount;
        squareDetail.currentSeq = this.currentSeq;
        return squareDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SquareDetail)) {
            return false;
        }
        SquareDetail squareDetail = (SquareDetail) obj;
        return this.unreadCount == squareDetail.unreadCount && this.currentSeq == squareDetail.currentSeq;
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
        int i2 = ((i * 41) + this.unreadCount) * 41;
        long j = this.currentSeq;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
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
