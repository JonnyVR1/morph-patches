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
public class SendGiftExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sendgiftextra";

    @NonNull
    @ProtobufIndex(index = 3)
    public String greetingChannel;

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String privilegeType;
    public static ProtobufAdapter<SendGiftExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<SendGiftExtra>() { // from class: com.p1.mobile.putong.core.data.SendGiftExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SendGiftExtra sendGiftExtra) {
            String str = sendGiftExtra.momentId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = sendGiftExtra.privilegeType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = sendGiftExtra.greetingChannel;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            sendGiftExtra.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SendGiftExtra parse(nb5 nb5Var) throws IOException {
            SendGiftExtra sendGiftExtra = new SendGiftExtra();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (sendGiftExtra.momentId == null) {
                        sendGiftExtra.momentId = "";
                    }
                    if (sendGiftExtra.privilegeType == null) {
                        sendGiftExtra.privilegeType = "";
                    }
                    if (sendGiftExtra.greetingChannel != null) {
                        break;
                    }
                    sendGiftExtra.greetingChannel = "";
                    break;
                }
                if (iM158752u == 10) {
                    sendGiftExtra.momentId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    sendGiftExtra.privilegeType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (sendGiftExtra.momentId == null) {
                            sendGiftExtra.momentId = "";
                        }
                        if (sendGiftExtra.privilegeType == null) {
                            sendGiftExtra.privilegeType = "";
                        }
                        if (sendGiftExtra.greetingChannel != null) {
                            break;
                        }
                        sendGiftExtra.greetingChannel = "";
                        return sendGiftExtra;
                    }
                    sendGiftExtra.greetingChannel = nb5Var.m158750s();
                }
            }
            return sendGiftExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SendGiftExtra sendGiftExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sendGiftExtra.momentId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = sendGiftExtra.privilegeType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = sendGiftExtra.greetingChannel;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<SendGiftExtra> JSON_ADAPTER = new ObjectJsonAdapter<SendGiftExtra>() { // from class: com.p1.mobile.putong.core.data.SendGiftExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SendGiftExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SendGiftExtra newInstance() {
            return new SendGiftExtra();
        }

        public boolean parseField(SendGiftExtra sendGiftExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "greetingChannel":
                    sendGiftExtra.greetingChannel = jsonParser.getValueAsString();
                    return true;
                case "privilegeType":
                    sendGiftExtra.privilegeType = jsonParser.getValueAsString();
                    return true;
                case "momentId":
                    sendGiftExtra.momentId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SendGiftExtra sendGiftExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "greetingChannel":
                case "privilegeType":
                case "momentId":
                    return true;
                default:
                    return super.parseFieldCheck(sendGiftExtra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SendGiftExtra sendGiftExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = sendGiftExtra.momentId;
            if (str != null) {
                jsonGenerator.writeStringField("momentId", str);
            }
            String str2 = sendGiftExtra.privilegeType;
            if (str2 != null) {
                jsonGenerator.writeStringField("privilegeType", str2);
            }
            String str3 = sendGiftExtra.greetingChannel;
            if (str3 != null) {
                jsonGenerator.writeStringField("greetingChannel", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SendGiftExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SendGiftExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SendGiftExtra new_() {
        SendGiftExtra sendGiftExtra = new SendGiftExtra();
        sendGiftExtra.nullCheck();
        return sendGiftExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SendGiftExtra mo223809clone() {
        SendGiftExtra sendGiftExtra = new SendGiftExtra();
        sendGiftExtra.momentId = this.momentId;
        sendGiftExtra.privilegeType = this.privilegeType;
        sendGiftExtra.greetingChannel = this.greetingChannel;
        return sendGiftExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendGiftExtra)) {
            return false;
        }
        SendGiftExtra sendGiftExtra = (SendGiftExtra) obj;
        return ValueObject.util_equals(this.momentId, sendGiftExtra.momentId) && ValueObject.util_equals(this.privilegeType, sendGiftExtra.privilegeType) && ValueObject.util_equals(this.greetingChannel, sendGiftExtra.greetingChannel);
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
        String str = this.momentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.greetingChannel;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.privilegeType == null) {
            this.privilegeType = "";
        }
        if (this.greetingChannel == null) {
            this.greetingChannel = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
