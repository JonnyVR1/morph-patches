package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetingNewPeopleMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingnewpeoplemessage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;
    public static ProtobufAdapter<GreetingNewPeopleMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingNewPeopleMessage>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeopleMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingNewPeopleMessage greetingNewPeopleMessage) {
            String str = greetingNewPeopleMessage.message;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) greetingNewPeopleMessage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingNewPeopleMessage m13045parse(nb5 nb5Var) throws IOException {
            GreetingNewPeopleMessage greetingNewPeopleMessage = new GreetingNewPeopleMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingNewPeopleMessage.message != null) {
                        break;
                    }
                    greetingNewPeopleMessage.message = "";
                    break;
                }
                if (iU != 10) {
                    if (greetingNewPeopleMessage.message != null) {
                        break;
                    }
                    greetingNewPeopleMessage.message = "";
                    return greetingNewPeopleMessage;
                }
                greetingNewPeopleMessage.message = nb5Var.s();
            }
            return greetingNewPeopleMessage;
        }

        public void serialize(GreetingNewPeopleMessage greetingNewPeopleMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingNewPeopleMessage.message;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingNewPeopleMessage> JSON_ADAPTER = new ObjectJsonAdapter<GreetingNewPeopleMessage>() { // from class: com.p1.mobile.putong.core.data.GreetingNewPeopleMessage.2
        public Class getDataClass() {
            return GreetingNewPeopleMessage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingNewPeopleMessage m13046newInstance() {
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

        public void serializeFields(GreetingNewPeopleMessage greetingNewPeopleMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingNewPeopleMessage.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingNewPeopleMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingNewPeopleMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingNewPeopleMessage new_() {
        GreetingNewPeopleMessage greetingNewPeopleMessage = new GreetingNewPeopleMessage();
        greetingNewPeopleMessage.nullCheck();
        return greetingNewPeopleMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingNewPeopleMessage m13044clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.message;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
