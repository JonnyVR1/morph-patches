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
public class MessageAdditionalDataCompliment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageadditionaldatacompliment";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageAdditionalDataCompliment> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAdditionalDataCompliment>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageAdditionalDataCompliment messageAdditionalDataCompliment) {
            String str = messageAdditionalDataCompliment.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) messageAdditionalDataCompliment).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageAdditionalDataCompliment m14168parse(nb5 nb5Var) throws IOException {
            MessageAdditionalDataCompliment messageAdditionalDataCompliment = new MessageAdditionalDataCompliment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageAdditionalDataCompliment.type != null) {
                        break;
                    }
                    messageAdditionalDataCompliment.type = "";
                    break;
                }
                if (iU != 10) {
                    if (messageAdditionalDataCompliment.type != null) {
                        break;
                    }
                    messageAdditionalDataCompliment.type = "";
                    return messageAdditionalDataCompliment;
                }
                messageAdditionalDataCompliment.type = nb5Var.s();
            }
            return messageAdditionalDataCompliment;
        }

        public void serialize(MessageAdditionalDataCompliment messageAdditionalDataCompliment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAdditionalDataCompliment.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageAdditionalDataCompliment> JSON_ADAPTER = new ObjectJsonAdapter<MessageAdditionalDataCompliment>() { // from class: com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment.2
        public Class getDataClass() {
            return MessageAdditionalDataCompliment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageAdditionalDataCompliment m14169newInstance() {
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

        public void serializeFields(MessageAdditionalDataCompliment messageAdditionalDataCompliment, JsonGenerator jsonGenerator) throws IOException {
            String str = messageAdditionalDataCompliment.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAdditionalDataCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAdditionalDataCompliment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAdditionalDataCompliment new_() {
        MessageAdditionalDataCompliment messageAdditionalDataCompliment = new MessageAdditionalDataCompliment();
        messageAdditionalDataCompliment.nullCheck();
        return messageAdditionalDataCompliment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageAdditionalDataCompliment m14167clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
