package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class CounterFollowShips extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterfollowships";

    @ProtobufIndex(index = 1)
    public int unreadFollowers;
    public static ProtobufAdapter<CounterFollowShips> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterFollowShips>() { // from class: com.p1.mobile.putong.data.CounterFollowShips.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterFollowShips counterFollowShips) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterFollowShips.unreadFollowers);
            counterFollowShips.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterFollowShips parse(nc5 nc5Var) throws IOException {
            CounterFollowShips counterFollowShips = new CounterFollowShips();
            while (nc5Var.m162497u() == 8) {
                counterFollowShips.unreadFollowers = nc5Var.m162486j();
            }
            return counterFollowShips;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterFollowShips counterFollowShips, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterFollowShips.unreadFollowers);
        }
    };
    public static JsonAdapter<CounterFollowShips> JSON_ADAPTER = new ObjectJsonAdapter<CounterFollowShips>() { // from class: com.p1.mobile.putong.data.CounterFollowShips.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterFollowShips.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterFollowShips newInstance() {
            return new CounterFollowShips();
        }

        public boolean parseField(CounterFollowShips counterFollowShips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("unreadFollowers")) {
                return false;
            }
            counterFollowShips.unreadFollowers = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterFollowShips counterFollowShips, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unreadFollowers")) {
                return true;
            }
            return super.parseFieldCheck(counterFollowShips, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterFollowShips counterFollowShips, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadFollowers", counterFollowShips.unreadFollowers);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterFollowShips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterFollowShips) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterFollowShips new_() {
        CounterFollowShips counterFollowShips = new CounterFollowShips();
        counterFollowShips.nullCheck();
        return counterFollowShips;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterFollowShips mo225055clone() {
        CounterFollowShips counterFollowShips = new CounterFollowShips();
        counterFollowShips.unreadFollowers = this.unreadFollowers;
        return counterFollowShips;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CounterFollowShips) && this.unreadFollowers == ((CounterFollowShips) obj).unreadFollowers;
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
        int i2 = (i * 41) + this.unreadFollowers;
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
