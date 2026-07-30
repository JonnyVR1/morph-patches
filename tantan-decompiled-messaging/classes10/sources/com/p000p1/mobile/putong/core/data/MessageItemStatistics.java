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
public class MessageItemStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitemstatistics";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MessageItemdata data;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f107id;
    public static ProtobufAdapter<MessageItemStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemStatistics>() { // from class: com.p1.mobile.putong.core.data.MessageItemStatistics.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageItemStatistics messageItemStatistics) {
            String str = messageItemStatistics.f107id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            MessageItemdata messageItemdata = messageItemStatistics.data;
            if (messageItemdata != null) {
                iO += CodedOutputByteBufferNano.l(2, messageItemdata, MessageItemdata.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageItemStatistics).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageItemStatistics m14221parse(nb5 nb5Var) throws IOException {
            MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageItemStatistics.f107id == null) {
                        messageItemStatistics.f107id = "";
                    }
                    if (messageItemStatistics.data != null) {
                        break;
                    }
                    messageItemStatistics.data = MessageItemdata.new_();
                    break;
                }
                if (iU == 10) {
                    messageItemStatistics.f107id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (messageItemStatistics.f107id == null) {
                            messageItemStatistics.f107id = "";
                        }
                        if (messageItemStatistics.data != null) {
                            break;
                        }
                        messageItemStatistics.data = MessageItemdata.new_();
                        return messageItemStatistics;
                    }
                    messageItemStatistics.data = (MessageItemdata) nb5Var.l(MessageItemdata.PROTOBUF_ADAPTER);
                }
            }
            return messageItemStatistics;
        }

        public void serialize(MessageItemStatistics messageItemStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemStatistics.f107id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            MessageItemdata messageItemdata = messageItemStatistics.data;
            if (messageItemdata != null) {
                codedOutputByteBufferNano.K(2, messageItemdata, MessageItemdata.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageItemStatistics> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemStatistics>() { // from class: com.p1.mobile.putong.core.data.MessageItemStatistics.2
        public Class getDataClass() {
            return MessageItemStatistics.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageItemStatistics m14222newInstance() {
            return new MessageItemStatistics();
        }

        public boolean parseField(MessageItemStatistics messageItemStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                messageItemStatistics.f107id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("data")) {
                return false;
            }
            messageItemStatistics.data = (MessageItemdata) MessageItemdata.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MessageItemStatistics messageItemStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(messageItemStatistics, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageItemStatistics messageItemStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemStatistics.f107id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (messageItemStatistics.data != null) {
                jsonGenerator.writeFieldName("data");
                MessageItemdata.JSON_ADAPTER.serialize(messageItemStatistics.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemStatistics new_() {
        MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
        messageItemStatistics.nullCheck();
        return messageItemStatistics;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageItemStatistics m14220clone() {
        MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
        messageItemStatistics.f107id = this.f107id;
        MessageItemdata messageItemdata = this.data;
        if (messageItemdata != null) {
            messageItemStatistics.data = messageItemdata.m14228clone();
        }
        return messageItemStatistics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageItemStatistics)) {
            return false;
        }
        MessageItemStatistics messageItemStatistics = (MessageItemStatistics) obj;
        return ValueObject.util_equals(this.f107id, messageItemStatistics.f107id) && ValueObject.util_equals(this.data, messageItemStatistics.data);
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
        String str = this.f107id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MessageItemdata messageItemdata = this.data;
        int iHashCode2 = iHashCode + (messageItemdata != null ? messageItemdata.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f107id == null) {
            this.f107id = "";
        }
        if (this.data == null) {
            this.data = MessageItemdata.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
