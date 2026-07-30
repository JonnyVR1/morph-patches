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
public class ReadMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "readmessage";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20487id;
    public static ProtobufAdapter<ReadMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReadMessage>() { // from class: com.p1.mobile.putong.core.data.ReadMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReadMessage readMessage) {
            String str = readMessage.f20487id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            readMessage.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReadMessage parse(nb5 nb5Var) throws IOException {
            ReadMessage readMessage = new ReadMessage();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (readMessage.f20487id != null) {
                        break;
                    }
                    readMessage.f20487id = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (readMessage.f20487id != null) {
                        break;
                    }
                    readMessage.f20487id = "";
                    return readMessage;
                }
                readMessage.f20487id = nb5Var.m158750s();
            }
            return readMessage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReadMessage readMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = readMessage.f20487id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<ReadMessage> JSON_ADAPTER = new ObjectJsonAdapter<ReadMessage>() { // from class: com.p1.mobile.putong.core.data.ReadMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReadMessage.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReadMessage newInstance() {
            return new ReadMessage();
        }

        public boolean parseField(ReadMessage readMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            readMessage.f20487id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(ReadMessage readMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(readMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReadMessage readMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = readMessage.f20487id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReadMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReadMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReadMessage new_() {
        ReadMessage readMessage = new ReadMessage();
        readMessage.nullCheck();
        return readMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReadMessage mo223809clone() {
        ReadMessage readMessage = new ReadMessage();
        readMessage.f20487id = this.f20487id;
        return readMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReadMessage) {
            return ValueObject.util_equals(this.f20487id, ((ReadMessage) obj).f20487id);
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
        String str = this.f20487id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20487id == null) {
            this.f20487id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
