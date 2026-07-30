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
public class CounterViewer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterviewer";

    @ProtobufIndex(index = 1)
    public int total;

    @ProtobufIndex(index = 2)
    public int unread;
    public static ProtobufAdapter<CounterViewer> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterViewer>() { // from class: com.p1.mobile.putong.data.CounterViewer.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterViewer counterViewer) {
            int iH = CodedOutputByteBufferNano.h(1, counterViewer.total) + CodedOutputByteBufferNano.h(2, counterViewer.unread);
            ((MessageNano) counterViewer).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterViewer m17911parse(nb5 nb5Var) throws IOException {
            CounterViewer counterViewer = new CounterViewer();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterViewer.total = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return counterViewer;
                    }
                    counterViewer.unread = nb5Var.j();
                }
            }
        }

        public void serialize(CounterViewer counterViewer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterViewer.total);
            codedOutputByteBufferNano.G(2, counterViewer.unread);
        }
    };
    public static JsonAdapter<CounterViewer> JSON_ADAPTER = new ObjectJsonAdapter<CounterViewer>() { // from class: com.p1.mobile.putong.data.CounterViewer.2
        public Class getDataClass() {
            return CounterViewer.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterViewer mo17830newInstance() {
            return new CounterViewer();
        }

        public boolean parseField(CounterViewer counterViewer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unread")) {
                counterViewer.unread = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("total")) {
                return false;
            }
            counterViewer.total = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterViewer counterViewer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread") || str.equals("total")) {
                return true;
            }
            return super.parseFieldCheck(counterViewer, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterViewer counterViewer, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", counterViewer.total);
            jsonGenerator.writeNumberField("unread", counterViewer.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterViewer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterViewer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterViewer new_() {
        CounterViewer counterViewer = new CounterViewer();
        counterViewer.nullCheck();
        return counterViewer;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterViewer m17910clone() {
        CounterViewer counterViewer = new CounterViewer();
        counterViewer.total = this.total;
        counterViewer.unread = this.unread;
        return counterViewer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterViewer)) {
            return false;
        }
        CounterViewer counterViewer = (CounterViewer) obj;
        return this.total == counterViewer.total && this.unread == counterViewer.unread;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.total) * 41) + this.unread;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
