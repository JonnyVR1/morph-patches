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
public class GreetingMessages extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingmessages";

    @NonNull
    @ProtobufIndex(index = 1)
    public String latestId;

    @ProtobufIndex(index = 2)
    public int unread;
    public static ProtobufAdapter<GreetingMessages> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingMessages>() { // from class: com.p1.mobile.putong.core.data.GreetingMessages.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingMessages greetingMessages) {
            String str = greetingMessages.latestId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, greetingMessages.unread);
            greetingMessages.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingMessages parse(nc5 nc5Var) throws IOException {
            GreetingMessages greetingMessages = new GreetingMessages();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (greetingMessages.latestId != null) {
                        break;
                    }
                    greetingMessages.latestId = "";
                    break;
                }
                if (iM162497u == 10) {
                    greetingMessages.latestId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (greetingMessages.latestId != null) {
                            break;
                        }
                        greetingMessages.latestId = "";
                        return greetingMessages;
                    }
                    greetingMessages.unread = nc5Var.m162486j();
                }
            }
            return greetingMessages;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingMessages greetingMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingMessages.latestId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, greetingMessages.unread);
        }
    };
    public static JsonAdapter<GreetingMessages> JSON_ADAPTER = new ObjectJsonAdapter<GreetingMessages>() { // from class: com.p1.mobile.putong.core.data.GreetingMessages.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingMessages.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingMessages newInstance() {
            return new GreetingMessages();
        }

        public boolean parseField(GreetingMessages greetingMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("latestId")) {
                greetingMessages.latestId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(LimitTimePictureStatus.unread)) {
                return false;
            }
            greetingMessages.unread = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(GreetingMessages greetingMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("latestId") || str.equals(LimitTimePictureStatus.unread)) {
                return true;
            }
            return super.parseFieldCheck(greetingMessages, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingMessages greetingMessages, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingMessages.latestId;
            if (str != null) {
                jsonGenerator.writeStringField("latestId", str);
            }
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, greetingMessages.unread);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingMessages new_() {
        GreetingMessages greetingMessages = new GreetingMessages();
        greetingMessages.nullCheck();
        return greetingMessages;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingMessages mo225055clone() {
        GreetingMessages greetingMessages = new GreetingMessages();
        greetingMessages.latestId = this.latestId;
        greetingMessages.unread = this.unread;
        return greetingMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingMessages)) {
            return false;
        }
        GreetingMessages greetingMessages = (GreetingMessages) obj;
        return ValueObject.util_equals(this.latestId, greetingMessages.latestId) && this.unread == greetingMessages.unread;
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
        String str = this.latestId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.unread;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.latestId == null) {
            this.latestId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
