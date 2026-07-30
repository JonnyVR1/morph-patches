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
public class CounterKankan extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterkankan";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterKankan> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterKankan>() { // from class: com.p1.mobile.putong.data.CounterKankan.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterKankan counterKankan) {
            int iH = CodedOutputByteBufferNano.h(1, counterKankan.unread);
            ((MessageNano) counterKankan).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterKankan m17890parse(nb5 nb5Var) throws IOException {
            CounterKankan counterKankan = new CounterKankan();
            while (nb5Var.u() == 8) {
                counterKankan.unread = nb5Var.j();
            }
            return counterKankan;
        }

        public void serialize(CounterKankan counterKankan, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterKankan.unread);
        }
    };
    public static JsonAdapter<CounterKankan> JSON_ADAPTER = new ObjectJsonAdapter<CounterKankan>() { // from class: com.p1.mobile.putong.data.CounterKankan.2
        public Class getDataClass() {
            return CounterKankan.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterKankan mo17830newInstance() {
            return new CounterKankan();
        }

        public boolean parseField(CounterKankan counterKankan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unread")) {
                return false;
            }
            counterKankan.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterKankan counterKankan, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread")) {
                return true;
            }
            return super.parseFieldCheck(counterKankan, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterKankan counterKankan, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", counterKankan.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterKankan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterKankan) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterKankan new_() {
        CounterKankan counterKankan = new CounterKankan();
        counterKankan.nullCheck();
        return counterKankan;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterKankan m17889clone() {
        CounterKankan counterKankan = new CounterKankan();
        counterKankan.unread = this.unread;
        return counterKankan;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CounterKankan) && this.unread == ((CounterKankan) obj).unread;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public boolean showRedDot() {
        return this.unread > 0;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
