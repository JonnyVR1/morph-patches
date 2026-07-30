package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class GreetingNewPeopleMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingnewpeoplemessage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;
    public static ProtobufAdapter<GreetingNewPeopleMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingNewPeopleMessage>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeopleMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingNewPeopleMessage greetingNewPeopleMessage) {
            String str = greetingNewPeopleMessage.message;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            greetingNewPeopleMessage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingNewPeopleMessage parse(nc5 nc5Var) throws IOException {
            GreetingNewPeopleMessage greetingNewPeopleMessage = new GreetingNewPeopleMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (greetingNewPeopleMessage.message != null) {
                        break;
                    }
                    greetingNewPeopleMessage.message = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (greetingNewPeopleMessage.message != null) {
                        break;
                    }
                    greetingNewPeopleMessage.message = "";
                    return greetingNewPeopleMessage;
                }
                greetingNewPeopleMessage.message = nc5Var.m162495s();
            }
            return greetingNewPeopleMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingNewPeopleMessage greetingNewPeopleMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingNewPeopleMessage.message;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingNewPeopleMessage> JSON_ADAPTER = new ObjectJsonAdapter<GreetingNewPeopleMessage>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeopleMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingNewPeopleMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingNewPeopleMessage newInstance() {
            return new GreetingNewPeopleMessage();
        }

        public boolean parseField(GreetingNewPeopleMessage greetingNewPeopleMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("message")) {
                return false;
            }
            greetingNewPeopleMessage.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingNewPeopleMessage greetingNewPeopleMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(greetingNewPeopleMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingNewPeopleMessage greetingNewPeopleMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingNewPeopleMessage.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingNewPeopleMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingNewPeopleMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingNewPeopleMessage new_() {
        GreetingNewPeopleMessage greetingNewPeopleMessage = new GreetingNewPeopleMessage();
        greetingNewPeopleMessage.nullCheck();
        return greetingNewPeopleMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingNewPeopleMessage mo225055clone() {
        GreetingNewPeopleMessage greetingNewPeopleMessage = new GreetingNewPeopleMessage();
        greetingNewPeopleMessage.message = this.message;
        return greetingNewPeopleMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GreetingNewPeopleMessage) {
            return ValueObject.util_equals(this.message, ((GreetingNewPeopleMessage) obj).message);
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
        String str = this.message;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
