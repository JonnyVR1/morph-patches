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
public class MessageAdditionalDataCompliment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageadditionaldatacompliment";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageAdditionalDataCompliment> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAdditionalDataCompliment>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageAdditionalDataCompliment messageAdditionalDataCompliment) {
            String str = messageAdditionalDataCompliment.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            messageAdditionalDataCompliment.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageAdditionalDataCompliment parse(nc5 nc5Var) throws IOException {
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = new MessageAdditionalDataCompliment();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageAdditionalDataCompliment.type != null) {
                        break;
                    }
                    messageAdditionalDataCompliment.type = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (messageAdditionalDataCompliment.type != null) {
                        break;
                    }
                    messageAdditionalDataCompliment.type = "";
                    return messageAdditionalDataCompliment;
                }
                messageAdditionalDataCompliment.type = nc5Var.m162495s();
            }
            return messageAdditionalDataCompliment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageAdditionalDataCompliment messageAdditionalDataCompliment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAdditionalDataCompliment.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageAdditionalDataCompliment> JSON_ADAPTER = new ObjectJsonAdapter<MessageAdditionalDataCompliment>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageAdditionalDataCompliment.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageAdditionalDataCompliment newInstance() {
            return new MessageAdditionalDataCompliment();
        }

        public boolean parseField(MessageAdditionalDataCompliment messageAdditionalDataCompliment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("type")) {
                return false;
            }
            messageAdditionalDataCompliment.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageAdditionalDataCompliment messageAdditionalDataCompliment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(messageAdditionalDataCompliment, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageAdditionalDataCompliment messageAdditionalDataCompliment, JsonGenerator jsonGenerator) throws IOException {
            String str = messageAdditionalDataCompliment.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAdditionalDataCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAdditionalDataCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAdditionalDataCompliment new_() {
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = new MessageAdditionalDataCompliment();
        messageAdditionalDataCompliment.nullCheck();
        return messageAdditionalDataCompliment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageAdditionalDataCompliment mo225055clone() {
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = new MessageAdditionalDataCompliment();
        messageAdditionalDataCompliment.type = this.type;
        return messageAdditionalDataCompliment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageAdditionalDataCompliment) {
            return ValueObject.util_equals(this.type, ((MessageAdditionalDataCompliment) obj).type);
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
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
