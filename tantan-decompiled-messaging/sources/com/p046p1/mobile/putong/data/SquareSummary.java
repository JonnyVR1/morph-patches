package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SquareSummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "squaresummary";

    @ProtobufIndex(index = 2)
    public long currentSeq;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<SquareSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<SquareSummary>() { // from class: com.p1.mobile.putong.data.SquareSummary.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SquareSummary squareSummary) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, squareSummary.unreadCount) + CodedOutputByteBufferNano.m17228j(2, squareSummary.currentSeq);
            squareSummary.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SquareSummary parse(nb5 nb5Var) throws IOException {
            SquareSummary squareSummary = new SquareSummary();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    squareSummary.unreadCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return squareSummary;
                    }
                    squareSummary.currentSeq = nb5Var.m158742k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SquareSummary squareSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, squareSummary.unreadCount);
            codedOutputByteBufferNano.m17252I(2, squareSummary.currentSeq);
        }
    };
    public static JsonAdapter<SquareSummary> JSON_ADAPTER = new ObjectJsonAdapter<SquareSummary>() { // from class: com.p1.mobile.putong.data.SquareSummary.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SquareSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SquareSummary newInstance() {
            return new SquareSummary();
        }

        public boolean parseField(SquareSummary squareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("currentSeq")) {
                squareSummary.currentSeq = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("unreadCount")) {
                return false;
            }
            squareSummary.unreadCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SquareSummary squareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("currentSeq") || str.equals("unreadCount")) {
                return true;
            }
            return super.parseFieldCheck(squareSummary, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SquareSummary squareSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", squareSummary.unreadCount);
            jsonGenerator.writeNumberField("currentSeq", squareSummary.currentSeq);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SquareSummary new_() {
        SquareSummary squareSummary = new SquareSummary();
        squareSummary.nullCheck();
        return squareSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SquareSummary mo223809clone() {
        SquareSummary squareSummary = new SquareSummary();
        squareSummary.unreadCount = this.unreadCount;
        squareSummary.currentSeq = this.currentSeq;
        return squareSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SquareSummary)) {
            return false;
        }
        SquareSummary squareSummary = (SquareSummary) obj;
        return this.unreadCount == squareSummary.unreadCount && this.currentSeq == squareSummary.currentSeq;
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
