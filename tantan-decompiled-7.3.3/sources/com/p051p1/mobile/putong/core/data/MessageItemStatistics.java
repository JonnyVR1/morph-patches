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
public class MessageItemStatistics extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitemstatistics";

    @NonNull
    @ProtobufIndex(index = 2)
    public MessageItemdata data;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21187id;
    public static ProtobufAdapter<MessageItemStatistics> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemStatistics>() { // from class: com.p1.mobile.putong.core.data.MessageItemStatistics.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageItemStatistics messageItemStatistics) {
            String str = messageItemStatistics.f21187id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            MessageItemdata messageItemdata = messageItemStatistics.data;
            if (messageItemdata != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, messageItemdata, MessageItemdata.PROTOBUF_ADAPTER);
            }
            messageItemStatistics.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageItemStatistics parse(nc5 nc5Var) throws IOException {
            MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageItemStatistics.f21187id == null) {
                        messageItemStatistics.f21187id = "";
                    }
                    if (messageItemStatistics.data != null) {
                        break;
                    }
                    messageItemStatistics.data = MessageItemdata.new_();
                    break;
                }
                if (iM162497u == 10) {
                    messageItemStatistics.f21187id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (messageItemStatistics.f21187id == null) {
                            messageItemStatistics.f21187id = "";
                        }
                        if (messageItemStatistics.data != null) {
                            break;
                        }
                        messageItemStatistics.data = MessageItemdata.new_();
                        return messageItemStatistics;
                    }
                    messageItemStatistics.data = (MessageItemdata) nc5Var.m162488l(MessageItemdata.PROTOBUF_ADAPTER);
                }
            }
            return messageItemStatistics;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageItemStatistics messageItemStatistics, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemStatistics.f21187id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            MessageItemdata messageItemdata = messageItemStatistics.data;
            if (messageItemdata != null) {
                codedOutputByteBufferNano.m17309K(2, messageItemdata, MessageItemdata.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageItemStatistics> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemStatistics>() { // from class: com.p1.mobile.putong.core.data.MessageItemStatistics.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageItemStatistics.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageItemStatistics newInstance() {
            return new MessageItemStatistics();
        }

        public boolean parseField(MessageItemStatistics messageItemStatistics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                messageItemStatistics.f21187id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("data")) {
                return false;
            }
            messageItemStatistics.data = MessageItemdata.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageItemStatistics messageItemStatistics, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemStatistics.f21187id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (messageItemStatistics.data != null) {
                jsonGenerator.writeFieldName("data");
                MessageItemdata.JSON_ADAPTER.serialize(messageItemStatistics.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemStatistics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemStatistics new_() {
        MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
        messageItemStatistics.nullCheck();
        return messageItemStatistics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageItemStatistics mo225055clone() {
        MessageItemStatistics messageItemStatistics = new MessageItemStatistics();
        messageItemStatistics.f21187id = this.f21187id;
        MessageItemdata messageItemdata = this.data;
        if (messageItemdata != null) {
            messageItemStatistics.data = messageItemdata.mo225055clone();
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
        return ValueObject.util_equals(this.f21187id, messageItemStatistics.f21187id) && ValueObject.util_equals(this.data, messageItemStatistics.data);
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
        String str = this.f21187id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MessageItemdata messageItemdata = this.data;
        int iHashCode2 = iHashCode + (messageItemdata != null ? messageItemdata.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21187id == null) {
            this.f21187id = "";
        }
        if (this.data == null) {
            this.data = MessageItemdata.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
