package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Reason;
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

/* JADX INFO: loaded from: classes12.dex */
public class JailedGroupChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jailedgroupchat";

    @ProtobufIndex(index = 1)
    public boolean active;

    @NonNull
    @ProtobufIndex(index = 4)
    public String code;

    @ProtobufIndex(index = 3)
    public double expireTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String reason;
    public static ProtobufAdapter<JailedGroupChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<JailedGroupChat>() { // from class: com.p1.mobile.putong.data.JailedGroupChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(JailedGroupChat jailedGroupChat) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, jailedGroupChat.active);
            String str = jailedGroupChat.reason;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17222d = iM17220b + CodedOutputByteBufferNano.m17222d(3, jailedGroupChat.expireTime);
            String str2 = jailedGroupChat.code;
            if (str2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            jailedGroupChat.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public JailedGroupChat parse(nb5 nb5Var) throws IOException {
            JailedGroupChat jailedGroupChat = new JailedGroupChat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (jailedGroupChat.reason == null) {
                        jailedGroupChat.reason = "";
                    }
                    if (jailedGroupChat.code != null) {
                        break;
                    }
                    jailedGroupChat.code = "";
                    break;
                }
                if (iM158752u == 8) {
                    jailedGroupChat.active = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    jailedGroupChat.reason = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    jailedGroupChat.expireTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 34) {
                        if (jailedGroupChat.reason == null) {
                            jailedGroupChat.reason = "";
                        }
                        if (jailedGroupChat.code != null) {
                            break;
                        }
                        jailedGroupChat.code = "";
                        return jailedGroupChat;
                    }
                    jailedGroupChat.code = nb5Var.m158750s();
                }
            }
            return jailedGroupChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(JailedGroupChat jailedGroupChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, jailedGroupChat.active);
            String str = jailedGroupChat.reason;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17246C(3, jailedGroupChat.expireTime);
            String str2 = jailedGroupChat.code;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
        }
    };
    public static JsonAdapter<JailedGroupChat> JSON_ADAPTER = new ObjectJsonAdapter<JailedGroupChat>() { // from class: com.p1.mobile.putong.data.JailedGroupChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return JailedGroupChat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public JailedGroupChat newInstance() {
            return new JailedGroupChat();
        }

        public boolean parseField(JailedGroupChat jailedGroupChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "active":
                    jailedGroupChat.active = jsonParser.getValueAsBoolean();
                    return true;
                case "reason":
                    jailedGroupChat.reason = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    jailedGroupChat.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "code":
                    jailedGroupChat.code = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(JailedGroupChat jailedGroupChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "active":
                case "reason":
                case "expireTime":
                case "code":
                    return true;
                default:
                    return super.parseFieldCheck(jailedGroupChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JailedGroupChat jailedGroupChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, jailedGroupChat.active);
            String str = jailedGroupChat.reason;
            if (str != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str);
            }
            jsonGenerator.writeFieldName("expireTime");
            Converter.API_TIME.serialize(Double.valueOf(jailedGroupChat.expireTime), jsonGenerator, true);
            String str2 = jailedGroupChat.code;
            if (str2 != null) {
                jsonGenerator.writeStringField("code", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JailedGroupChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JailedGroupChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JailedGroupChat new_() {
        JailedGroupChat jailedGroupChat = new JailedGroupChat();
        jailedGroupChat.nullCheck();
        return jailedGroupChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public JailedGroupChat mo223809clone() {
        JailedGroupChat jailedGroupChat = new JailedGroupChat();
        jailedGroupChat.active = this.active;
        jailedGroupChat.reason = this.reason;
        jailedGroupChat.expireTime = this.expireTime;
        jailedGroupChat.code = this.code;
        return jailedGroupChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JailedGroupChat)) {
            return false;
        }
        JailedGroupChat jailedGroupChat = (JailedGroupChat) obj;
        return this.active == jailedGroupChat.active && ValueObject.util_equals(this.reason, jailedGroupChat.reason) && this.expireTime == jailedGroupChat.expireTime && ValueObject.util_equals(this.code, jailedGroupChat.code);
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
        int i2 = ((i * 41) + (this.active ? 1231 : 1237)) * 41;
        String str = this.reason;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.code;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.code == null) {
            this.code = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
