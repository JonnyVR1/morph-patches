package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class ConversationGroupProperty extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationgroupproperty";

    @ProtobufIndex(index = 2)
    public double joinedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String latestNotificationMsgId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String source;
    public static ProtobufAdapter<ConversationGroupProperty> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationGroupProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationGroupProperty.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationGroupProperty conversationGroupProperty) {
            String str = conversationGroupProperty.latestNotificationMsgId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17222d(2, conversationGroupProperty.joinedTime);
            String str2 = conversationGroupProperty.source;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            conversationGroupProperty.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationGroupProperty parse(nb5 nb5Var) throws IOException {
            ConversationGroupProperty conversationGroupProperty = new ConversationGroupProperty();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationGroupProperty.latestNotificationMsgId == null) {
                        conversationGroupProperty.latestNotificationMsgId = "";
                    }
                    if (conversationGroupProperty.source != null) {
                        break;
                    }
                    conversationGroupProperty.source = "";
                    break;
                }
                if (iM158752u == 10) {
                    conversationGroupProperty.latestNotificationMsgId = nb5Var.m158750s();
                } else if (iM158752u == 17) {
                    conversationGroupProperty.joinedTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 26) {
                        if (conversationGroupProperty.latestNotificationMsgId == null) {
                            conversationGroupProperty.latestNotificationMsgId = "";
                        }
                        if (conversationGroupProperty.source != null) {
                            break;
                        }
                        conversationGroupProperty.source = "";
                        return conversationGroupProperty;
                    }
                    conversationGroupProperty.source = nb5Var.m158750s();
                }
            }
            return conversationGroupProperty;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationGroupProperty conversationGroupProperty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationGroupProperty.latestNotificationMsgId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17246C(2, conversationGroupProperty.joinedTime);
            String str2 = conversationGroupProperty.source;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<ConversationGroupProperty> JSON_ADAPTER = new ObjectJsonAdapter<ConversationGroupProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationGroupProperty.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationGroupProperty.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationGroupProperty newInstance() {
            return new ConversationGroupProperty();
        }

        public boolean parseField(ConversationGroupProperty conversationGroupProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    conversationGroupProperty.source = jsonParser.getValueAsString();
                    return true;
                case "latestNotificationMsgId":
                    conversationGroupProperty.latestNotificationMsgId = jsonParser.getValueAsString();
                    return true;
                case "joinedTime":
                    conversationGroupProperty.joinedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationGroupProperty conversationGroupProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "latestNotificationMsgId":
                case "joinedTime":
                    return true;
                default:
                    return super.parseFieldCheck(conversationGroupProperty, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationGroupProperty conversationGroupProperty, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationGroupProperty.latestNotificationMsgId;
            if (str != null) {
                jsonGenerator.writeStringField("latestNotificationMsgId", str);
            }
            jsonGenerator.writeFieldName("joinedTime");
            Converter.API_TIME.serialize(Double.valueOf(conversationGroupProperty.joinedTime), jsonGenerator, true);
            String str2 = conversationGroupProperty.source;
            if (str2 != null) {
                jsonGenerator.writeStringField("source", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationGroupProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationGroupProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationGroupProperty new_() {
        ConversationGroupProperty conversationGroupProperty = new ConversationGroupProperty();
        conversationGroupProperty.nullCheck();
        return conversationGroupProperty;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationGroupProperty mo223809clone() {
        ConversationGroupProperty conversationGroupProperty = new ConversationGroupProperty();
        conversationGroupProperty.latestNotificationMsgId = this.latestNotificationMsgId;
        conversationGroupProperty.joinedTime = this.joinedTime;
        conversationGroupProperty.source = this.source;
        return conversationGroupProperty;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationGroupProperty)) {
            return false;
        }
        ConversationGroupProperty conversationGroupProperty = (ConversationGroupProperty) obj;
        return ValueObject.util_equals(this.latestNotificationMsgId, conversationGroupProperty.latestNotificationMsgId) && this.joinedTime == conversationGroupProperty.joinedTime && ValueObject.util_equals(this.source, conversationGroupProperty.source);
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
        String str = this.latestNotificationMsgId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.joinedTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.source;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.latestNotificationMsgId == null) {
            this.latestNotificationMsgId = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
