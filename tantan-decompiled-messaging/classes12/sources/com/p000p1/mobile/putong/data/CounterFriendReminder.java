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
public class CounterFriendReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterfriendreminder";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterFriendReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterFriendReminder>() { // from class: com.p1.mobile.putong.data.CounterFriendReminder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterFriendReminder counterFriendReminder) {
            int iH = CodedOutputByteBufferNano.h(1, counterFriendReminder.unread);
            ((MessageNano) counterFriendReminder).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterFriendReminder m17884parse(nb5 nb5Var) throws IOException {
            CounterFriendReminder counterFriendReminder = new CounterFriendReminder();
            while (nb5Var.u() == 8) {
                counterFriendReminder.unread = nb5Var.j();
            }
            return counterFriendReminder;
        }

        public void serialize(CounterFriendReminder counterFriendReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterFriendReminder.unread);
        }
    };
    public static JsonAdapter<CounterFriendReminder> JSON_ADAPTER = new ObjectJsonAdapter<CounterFriendReminder>() { // from class: com.p1.mobile.putong.data.CounterFriendReminder.2
        public Class getDataClass() {
            return CounterFriendReminder.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterFriendReminder mo17830newInstance() {
            return new CounterFriendReminder();
        }

        public boolean parseField(CounterFriendReminder counterFriendReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unread")) {
                return false;
            }
            counterFriendReminder.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterFriendReminder counterFriendReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unread")) {
                return true;
            }
            return super.parseFieldCheck(counterFriendReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterFriendReminder counterFriendReminder, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unread", counterFriendReminder.unread);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterFriendReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterFriendReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterFriendReminder new_() {
        CounterFriendReminder counterFriendReminder = new CounterFriendReminder();
        counterFriendReminder.nullCheck();
        return counterFriendReminder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterFriendReminder m17883clone() {
        CounterFriendReminder counterFriendReminder = new CounterFriendReminder();
        counterFriendReminder.unread = this.unread;
        return counterFriendReminder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CounterFriendReminder) && this.unread == ((CounterFriendReminder) obj).unread;
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
