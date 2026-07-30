package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SquareDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "squaredetail";

    @ProtobufIndex(index = 2)
    public long currentSeq;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<SquareDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<SquareDetail>() { // from class: com.p1.mobile.putong.data.SquareDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SquareDetail squareDetail) {
            int iH = CodedOutputByteBufferNano.h(1, squareDetail.unreadCount) + CodedOutputByteBufferNano.j(2, squareDetail.currentSeq);
            ((MessageNano) squareDetail).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SquareDetail m19016parse(nb5 nb5Var) throws IOException {
            SquareDetail squareDetail = new SquareDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    squareDetail.unreadCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return squareDetail;
                    }
                    squareDetail.currentSeq = nb5Var.k();
                }
            }
        }

        public void serialize(SquareDetail squareDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, squareDetail.unreadCount);
            codedOutputByteBufferNano.I(2, squareDetail.currentSeq);
        }
    };
    public static JsonAdapter<SquareDetail> JSON_ADAPTER = new ObjectJsonAdapter<SquareDetail>() { // from class: com.p1.mobile.putong.data.SquareDetail.2
        public Class getDataClass() {
            return SquareDetail.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SquareDetail mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SquareDetail squareDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", squareDetail.unreadCount);
            jsonGenerator.writeNumberField("currentSeq", squareDetail.currentSeq);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SquareDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SquareDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SquareDetail new_() {
        SquareDetail squareDetail = new SquareDetail();
        squareDetail.nullCheck();
        return squareDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SquareDetail m19015clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.unreadCount) * 41;
        long j = this.currentSeq;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
