package com.p000p1.mobile.putong.feed.data;

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
public class Attitudes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "attitudes";

    @ProtobufIndex(index = 1)
    public int count;
    public static ProtobufAdapter<Attitudes> PROTOBUF_ADAPTER = new MessageNanoAdapter<Attitudes>() { // from class: com.p1.mobile.putong.feed.data.Attitudes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Attitudes attitudes) {
            int iH = CodedOutputByteBufferNano.h(1, attitudes.count);
            ((MessageNano) attitudes).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Attitudes m19422parse(nb5 nb5Var) throws IOException {
            Attitudes attitudes = new Attitudes();
            while (nb5Var.u() == 8) {
                attitudes.count = nb5Var.j();
            }
            return attitudes;
        }

        public void serialize(Attitudes attitudes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, attitudes.count);
        }
    };
    public static JsonAdapter<Attitudes> JSON_ADAPTER = new ObjectJsonAdapter<Attitudes>() { // from class: com.p1.mobile.putong.feed.data.Attitudes.2
        public Class getDataClass() {
            return Attitudes.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Attitudes mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Attitudes attitudes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", attitudes.count);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Attitudes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Attitudes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Attitudes new_() {
        Attitudes attitudes = new Attitudes();
        attitudes.nullCheck();
        return attitudes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Attitudes m19421clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
