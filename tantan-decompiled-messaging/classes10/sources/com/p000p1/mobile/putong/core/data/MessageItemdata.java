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
public class MessageItemdata extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitemdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String tips_source;
    public static ProtobufAdapter<MessageItemdata> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemdata>() { // from class: com.p1.mobile.putong.core.data.MessageItemdata.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageItemdata messageItemdata) {
            String str = messageItemdata.tips_source;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) messageItemdata).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageItemdata m14229parse(nb5 nb5Var) throws IOException {
            MessageItemdata messageItemdata = new MessageItemdata();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageItemdata.tips_source != null) {
                        break;
                    }
                    messageItemdata.tips_source = "";
                    break;
                }
                if (iU != 10) {
                    if (messageItemdata.tips_source != null) {
                        break;
                    }
                    messageItemdata.tips_source = "";
                    return messageItemdata;
                }
                messageItemdata.tips_source = nb5Var.s();
            }
            return messageItemdata;
        }

        public void serialize(MessageItemdata messageItemdata, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemdata.tips_source;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<MessageItemdata> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemdata>() { // from class: com.p1.mobile.putong.core.data.MessageItemdata.2
        public Class getDataClass() {
            return MessageItemdata.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageItemdata m14230newInstance() {
            return new MessageItemdata();
        }

        public boolean parseField(MessageItemdata messageItemdata, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("tips_source")) {
                return false;
            }
            messageItemdata.tips_source = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageItemdata messageItemdata, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tips_source")) {
                return true;
            }
            return super.parseFieldCheck(messageItemdata, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageItemdata messageItemdata, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemdata.tips_source;
            if (str != null) {
                jsonGenerator.writeStringField("tips_source", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemdata) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemdata) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemdata new_() {
        MessageItemdata messageItemdata = new MessageItemdata();
        messageItemdata.nullCheck();
        return messageItemdata;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageItemdata m14228clone() {
        MessageItemdata messageItemdata = new MessageItemdata();
        messageItemdata.tips_source = this.tips_source;
        return messageItemdata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageItemdata) {
            return ValueObject.util_equals(this.tips_source, ((MessageItemdata) obj).tips_source);
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
        String str = this.tips_source;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.tips_source == null) {
            this.tips_source = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
