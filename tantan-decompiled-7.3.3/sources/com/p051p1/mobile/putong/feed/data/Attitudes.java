package com.p051p1.mobile.putong.feed.data;

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
public class Attitudes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudes";

    @ProtobufIndex(index = 1)
    public int count;
    public static ProtobufAdapter<Attitudes> PROTOBUF_ADAPTER = new MessageNanoAdapter<Attitudes>() { // from class: com.p1.mobile.putong.feed.data.Attitudes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Attitudes attitudes) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, attitudes.count);
            attitudes.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Attitudes parse(nc5 nc5Var) throws IOException {
            Attitudes attitudes = new Attitudes();
            while (nc5Var.m162497u() == 8) {
                attitudes.count = nc5Var.m162486j();
            }
            return attitudes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Attitudes attitudes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, attitudes.count);
        }
    };
    public static JsonAdapter<Attitudes> JSON_ADAPTER = new ObjectJsonAdapter<Attitudes>() { // from class: com.p1.mobile.putong.feed.data.Attitudes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Attitudes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Attitudes newInstance() {
            return new Attitudes();
        }

        public boolean parseField(Attitudes attitudes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("count")) {
                return false;
            }
            attitudes.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Attitudes attitudes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(attitudes, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Attitudes attitudes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", attitudes.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Attitudes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Attitudes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Attitudes new_() {
        Attitudes attitudes = new Attitudes();
        attitudes.nullCheck();
        return attitudes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Attitudes mo225055clone() {
        Attitudes attitudes = new Attitudes();
        attitudes.count = this.count;
        return attitudes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Attitudes) && this.count == ((Attitudes) obj).count;
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
        int i2 = (i * 41) + this.count;
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
