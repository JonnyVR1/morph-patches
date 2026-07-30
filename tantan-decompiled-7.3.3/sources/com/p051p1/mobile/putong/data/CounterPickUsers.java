package com.p051p1.mobile.putong.data;

import com.clevertap.android.sdk.Constants;
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
public class CounterPickUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterpickusers";

    @ProtobufIndex(index = 2)
    public int limit;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CounterPickUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterPickUsers>() { // from class: com.p1.mobile.putong.data.CounterPickUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterPickUsers counterPickUsers) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterPickUsers.unread) + CodedOutputByteBufferNano.m17281h(2, counterPickUsers.limit);
            counterPickUsers.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterPickUsers parse(nc5 nc5Var) throws IOException {
            CounterPickUsers counterPickUsers = new CounterPickUsers();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    counterPickUsers.unread = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return counterPickUsers;
                    }
                    counterPickUsers.limit = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterPickUsers counterPickUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterPickUsers.unread);
            codedOutputByteBufferNano.m17305G(2, counterPickUsers.limit);
        }
    };
    public static JsonAdapter<CounterPickUsers> JSON_ADAPTER = new ObjectJsonAdapter<CounterPickUsers>() { // from class: com.p1.mobile.putong.data.CounterPickUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterPickUsers.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterPickUsers newInstance() {
            return new CounterPickUsers();
        }

        public boolean parseField(CounterPickUsers counterPickUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread)) {
                counterPickUsers.unread = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(Constants.KEY_LIMIT)) {
                return false;
            }
            counterPickUsers.limit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterPickUsers counterPickUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LimitTimePictureStatus.unread) || str.equals(Constants.KEY_LIMIT)) {
                return true;
            }
            return super.parseFieldCheck(counterPickUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterPickUsers counterPickUsers, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, counterPickUsers.unread);
            jsonGenerator.writeNumberField(Constants.KEY_LIMIT, counterPickUsers.limit);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterPickUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterPickUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterPickUsers new_() {
        CounterPickUsers counterPickUsers = new CounterPickUsers();
        counterPickUsers.nullCheck();
        return counterPickUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterPickUsers mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.unread) * 41) + this.limit;
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
