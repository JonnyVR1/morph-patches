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
public class ReadMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "readmessage";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f149id;
    public static ProtobufAdapter<ReadMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReadMessage>() { // from class: com.p1.mobile.putong.core.data.ReadMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReadMessage readMessage) {
            String str = readMessage.f149id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) readMessage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReadMessage m15245parse(nb5 nb5Var) throws IOException {
            ReadMessage readMessage = new ReadMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (readMessage.f149id != null) {
                        break;
                    }
                    readMessage.f149id = "";
                    break;
                }
                if (iU != 10) {
                    if (readMessage.f149id != null) {
                        break;
                    }
                    readMessage.f149id = "";
                    return readMessage;
                }
                readMessage.f149id = nb5Var.s();
            }
            return readMessage;
        }

        public void serialize(ReadMessage readMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = readMessage.f149id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ReadMessage> JSON_ADAPTER = new ObjectJsonAdapter<ReadMessage>() { // from class: com.p1.mobile.putong.core.data.ReadMessage.2
        public Class getDataClass() {
            return ReadMessage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReadMessage m15246newInstance() {
            return new ReadMessage();
        }

        public boolean parseField(ReadMessage readMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            readMessage.f149id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(ReadMessage readMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(readMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ReadMessage readMessage, JsonGenerator jsonGenerator) throws IOException {
            String str = readMessage.f149id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReadMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReadMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReadMessage new_() {
        ReadMessage readMessage = new ReadMessage();
        readMessage.nullCheck();
        return readMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReadMessage m15244clone() {
        ReadMessage readMessage = new ReadMessage();
        readMessage.f149id = this.f149id;
        return readMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReadMessage) {
            return ValueObject.util_equals(this.f149id, ((ReadMessage) obj).f149id);
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
        String str = this.f149id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f149id == null) {
            this.f149id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
