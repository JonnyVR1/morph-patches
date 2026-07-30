package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
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

/* JADX INFO: loaded from: classes12.dex */
public class CounterFriendReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterfriendreminder";

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterFriendReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterFriendReminder>() { // from class: com.p1.mobile.putong.data.CounterFriendReminder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterFriendReminder counterFriendReminder) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterFriendReminder.unread);
            counterFriendReminder.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterFriendReminder parse(nc5 nc5Var) throws IOException {
            CounterFriendReminder counterFriendReminder = new CounterFriendReminder();
            while (nc5Var.m162497u() == 8) {
                counterFriendReminder.unread = nc5Var.m162486j();
            }
            return counterFriendReminder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterFriendReminder counterFriendReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterFriendReminder.unread);
        }
    };
    public static JsonAdapter<CounterFriendReminder> JSON_ADAPTER = new ObjectJsonAdapter<CounterFriendReminder>() { // from class: com.p1.mobile.putong.data.CounterFriendReminder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterFriendReminder.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterFriendReminder newInstance() {
            return new CounterFriendReminder();
        }

        public boolean parseField(CounterFriendReminder counterFriendReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            counterFriendReminder.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterFriendReminder counterFriendReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(counterFriendReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterFriendReminder counterFriendReminder, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterFriendReminder.unread);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterFriendReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterFriendReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterFriendReminder new_() {
        CounterFriendReminder counterFriendReminder = new CounterFriendReminder();
        counterFriendReminder.nullCheck();
        return counterFriendReminder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterFriendReminder mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
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
