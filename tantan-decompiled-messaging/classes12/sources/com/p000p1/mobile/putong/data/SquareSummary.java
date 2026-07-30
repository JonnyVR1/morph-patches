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
public class SquareSummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "squaresummary";

    @ProtobufIndex(index = 2)
    public long currentSeq;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<SquareSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<SquareSummary>() { // from class: com.p1.mobile.putong.data.SquareSummary.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SquareSummary squareSummary) {
            int iH = CodedOutputByteBufferNano.h(1, squareSummary.unreadCount) + CodedOutputByteBufferNano.j(2, squareSummary.currentSeq);
            ((MessageNano) squareSummary).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SquareSummary m19019parse(nb5 nb5Var) throws IOException {
            SquareSummary squareSummary = new SquareSummary();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    squareSummary.unreadCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return squareSummary;
                    }
                    squareSummary.currentSeq = nb5Var.k();
                }
            }
        }

        public void serialize(SquareSummary squareSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, squareSummary.unreadCount);
            codedOutputByteBufferNano.I(2, squareSummary.currentSeq);
        }
    };
    public static JsonAdapter<SquareSummary> JSON_ADAPTER = new ObjectJsonAdapter<SquareSummary>() { // from class: com.p1.mobile.putong.data.SquareSummary.2
        public Class getDataClass() {
            return SquareSummary.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SquareSummary mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SquareSummary squareSummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", squareSummary.unreadCount);
            jsonGenerator.writeNumberField("currentSeq", squareSummary.currentSeq);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SquareSummary new_() {
        SquareSummary squareSummary = new SquareSummary();
        squareSummary.nullCheck();
        return squareSummary;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SquareSummary m19018clone() {
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
