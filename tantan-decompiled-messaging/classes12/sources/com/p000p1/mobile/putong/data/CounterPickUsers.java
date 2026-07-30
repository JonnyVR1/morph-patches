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
public class CounterPickUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterpickusers";

    @ProtobufIndex(index = 2)
    public int limit;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterPickUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterPickUsers>() { // from class: com.p1.mobile.putong.data.CounterPickUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterPickUsers counterPickUsers) {
            int iH = CodedOutputByteBufferNano.h(1, counterPickUsers.unread) + CodedOutputByteBufferNano.h(2, counterPickUsers.limit);
            ((MessageNano) counterPickUsers).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterPickUsers m17899parse(nb5 nb5Var) throws IOException {
            CounterPickUsers counterPickUsers = new CounterPickUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterPickUsers.unread = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return counterPickUsers;
                    }
                    counterPickUsers.limit = nb5Var.j();
                }
            }
        }

        public void serialize(CounterPickUsers counterPickUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterPickUsers.unread);
            codedOutputByteBufferNano.G(2, counterPickUsers.limit);
        }
    };
    public static JsonAdapter<CounterPickUsers> JSON_ADAPTER = new ObjectJsonAdapter<CounterPickUsers>() { // from class: com.p1.mobile.putong.data.CounterPickUsers.2
        public Class getDataClass() {
            return CounterPickUsers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterPickUsers mo17830newInstance() {
            return new CounterPickUsers();
        }

        public boolean parseField(CounterPickUsers counterPickUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unread")) {
                counterPickUsers.unread = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("limit")) {
                return false;
            }
            counterPickUsers.limit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterPickUsers counterPickUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread") || str.equals("limit")) {
                return true;
            }
            return super.parseFieldCheck(counterPickUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterPickUsers counterPickUsers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", counterPickUsers.unread);
            jsonGenerator.writeNumberField("limit", counterPickUsers.limit);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterPickUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterPickUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterPickUsers new_() {
        CounterPickUsers counterPickUsers = new CounterPickUsers();
        counterPickUsers.nullCheck();
        return counterPickUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterPickUsers m17898clone() {
        CounterPickUsers counterPickUsers = new CounterPickUsers();
        counterPickUsers.unread = this.unread;
        counterPickUsers.limit = this.limit;
        return counterPickUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterPickUsers)) {
            return false;
        }
        CounterPickUsers counterPickUsers = (CounterPickUsers) obj;
        return this.unread == counterPickUsers.unread && this.limit == counterPickUsers.limit;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.unread) * 41) + this.limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
