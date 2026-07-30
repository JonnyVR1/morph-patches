package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LinkAction;
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
public class MessageItemTarget extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitemtarget";

    @NonNull
    @ProtobufIndex(index = 2)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageItemTarget> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemTarget>() { // from class: com.p1.mobile.putong.core.data.MessageItemTarget.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageItemTarget messageItemTarget) {
            String str = messageItemTarget.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            messageItemTarget.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageItemTarget parse(nc5 nc5Var) throws IOException {
            MessageItemTarget messageItemTarget = new MessageItemTarget();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageItemTarget.type == null) {
                        messageItemTarget.type = "";
                    }
                    if (messageItemTarget.deeplink != null) {
                        break;
                    }
                    messageItemTarget.deeplink = "";
                    break;
                }
                if (iM162497u == 10) {
                    messageItemTarget.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (messageItemTarget.type == null) {
                            messageItemTarget.type = "";
                        }
                        if (messageItemTarget.deeplink != null) {
                            break;
                        }
                        messageItemTarget.deeplink = "";
                        return messageItemTarget;
                    }
                    messageItemTarget.deeplink = nc5Var.m162495s();
                }
            }
            return messageItemTarget;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageItemTarget messageItemTarget, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemTarget.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<MessageItemTarget> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemTarget>() { // from class: com.p1.mobile.putong.core.data.MessageItemTarget.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageItemTarget.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageItemTarget newInstance() {
            return new MessageItemTarget();
        }

        public boolean parseField(MessageItemTarget messageItemTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                messageItemTarget.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(LinkAction.deeplink)) {
                return false;
            }
            messageItemTarget.deeplink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageItemTarget messageItemTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals(LinkAction.deeplink)) {
                return true;
            }
            return super.parseFieldCheck(messageItemTarget, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageItemTarget messageItemTarget, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemTarget.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemTarget new_() {
        MessageItemTarget messageItemTarget = new MessageItemTarget();
        messageItemTarget.nullCheck();
        return messageItemTarget;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageItemTarget mo225055clone() {
        MessageItemTarget messageItemTarget = new MessageItemTarget();
        messageItemTarget.type = this.type;
        messageItemTarget.deeplink = this.deeplink;
        return messageItemTarget;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageItemTarget)) {
            return false;
        }
        MessageItemTarget messageItemTarget = (MessageItemTarget) obj;
        return ValueObject.util_equals(this.type, messageItemTarget.type) && ValueObject.util_equals(this.deeplink, messageItemTarget.deeplink);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
