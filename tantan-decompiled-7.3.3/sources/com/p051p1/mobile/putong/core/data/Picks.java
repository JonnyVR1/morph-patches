package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class Picks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picks";

    @ProtobufIndex(index = 1)
    public int todayLikedCount;

    @ProtobufIndex(index = 2)
    public boolean todayPaidProps;
    public static ProtobufAdapter<Picks> PROTOBUF_ADAPTER = new MessageNanoAdapter<Picks>() { // from class: com.p1.mobile.putong.core.data.Picks.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Picks picks) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, picks.todayLikedCount) + CodedOutputByteBufferNano.m17275b(2, picks.todayPaidProps);
            picks.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Picks parse(nc5 nc5Var) throws IOException {
            Picks picks = new Picks();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    picks.todayLikedCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return picks;
                    }
                    picks.todayPaidProps = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Picks picks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, picks.todayLikedCount);
            codedOutputByteBufferNano.m17299A(2, picks.todayPaidProps);
        }
    };
    public static JsonAdapter<Picks> JSON_ADAPTER = new ObjectJsonAdapter<Picks>() { // from class: com.p1.mobile.putong.core.data.Picks.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Picks.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Picks newInstance() {
            return new Picks();
        }

        public boolean parseField(Picks picks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("todayPaidProps")) {
                picks.todayPaidProps = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("todayLikedCount")) {
                return false;
            }
            picks.todayLikedCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Picks picks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("todayPaidProps") || str.equals("todayLikedCount")) {
                return true;
            }
            return super.parseFieldCheck(picks, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Picks picks, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayLikedCount", picks.todayLikedCount);
            jsonGenerator.writeBooleanField("todayPaidProps", picks.todayPaidProps);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Picks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Picks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Picks new_() {
        Picks picks = new Picks();
        picks.nullCheck();
        return picks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Picks mo225055clone() {
        Picks picks = new Picks();
        picks.todayLikedCount = this.todayLikedCount;
        picks.todayPaidProps = this.todayPaidProps;
        return picks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Picks)) {
            return false;
        }
        Picks picks = (Picks) obj;
        return this.todayLikedCount == picks.todayLikedCount && this.todayPaidProps == picks.todayPaidProps;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "picks";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.todayLikedCount) * 41) + (this.todayPaidProps ? 1231 : 1237);
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
