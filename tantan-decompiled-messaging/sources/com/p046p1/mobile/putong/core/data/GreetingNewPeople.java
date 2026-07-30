package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GreetingNewPeople extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingnewpeople";

    @NonNull
    @ProtobufIndex(index = 1)
    public String UserId;
    public static ProtobufAdapter<GreetingNewPeople> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingNewPeople>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeople.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingNewPeople greetingNewPeople) {
            String str = greetingNewPeople.UserId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            greetingNewPeople.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingNewPeople parse(nb5 nb5Var) throws IOException {
            GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (greetingNewPeople.UserId != null) {
                        break;
                    }
                    greetingNewPeople.UserId = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (greetingNewPeople.UserId != null) {
                        break;
                    }
                    greetingNewPeople.UserId = "";
                    return greetingNewPeople;
                }
                greetingNewPeople.UserId = nb5Var.m158750s();
            }
            return greetingNewPeople;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingNewPeople greetingNewPeople, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingNewPeople.UserId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingNewPeople> JSON_ADAPTER = new ObjectJsonAdapter<GreetingNewPeople>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeople.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingNewPeople.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingNewPeople newInstance() {
            return new GreetingNewPeople();
        }

        public boolean parseField(GreetingNewPeople greetingNewPeople, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("UserId")) {
                return false;
            }
            greetingNewPeople.UserId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingNewPeople greetingNewPeople, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("UserId")) {
                return true;
            }
            return super.parseFieldCheck(greetingNewPeople, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingNewPeople greetingNewPeople, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingNewPeople.UserId;
            if (str != null) {
                jsonGenerator.writeStringField("UserId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingNewPeople) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingNewPeople) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingNewPeople new_() {
        GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
        greetingNewPeople.nullCheck();
        return greetingNewPeople;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingNewPeople mo223809clone() {
        GreetingNewPeople greetingNewPeople = new GreetingNewPeople();
        greetingNewPeople.UserId = this.UserId;
        return greetingNewPeople;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GreetingNewPeople) {
            return ValueObject.util_equals(this.UserId, ((GreetingNewPeople) obj).UserId);
        }
        return false;
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
        int i2 = i * 41;
        String str = this.UserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.UserId == null) {
            this.UserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
