package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ConversationGroupProperty extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationgroupproperty";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double joinedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String latestNotificationMsgId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String source;
    public static ProtobufAdapter<ConversationGroupProperty> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationGroupProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationGroupProperty.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationGroupProperty conversationGroupProperty) {
            String str = conversationGroupProperty.latestNotificationMsgId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, conversationGroupProperty.joinedTime);
            String str2 = conversationGroupProperty.source;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) conversationGroupProperty).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationGroupProperty m12369parse(nb5 nb5Var) throws IOException {
            ConversationGroupProperty conversationGroupProperty = new ConversationGroupProperty();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationGroupProperty.latestNotificationMsgId == null) {
                        conversationGroupProperty.latestNotificationMsgId = "";
                    }
                    if (conversationGroupProperty.source != null) {
                        break;
                    }
                    conversationGroupProperty.source = "";
                    break;
                }
                if (iU == 10) {
                    conversationGroupProperty.latestNotificationMsgId = nb5Var.s();
                } else if (iU == 17) {
                    conversationGroupProperty.joinedTime = nb5Var.h();
                } else {
                    if (iU != 26) {
                        if (conversationGroupProperty.latestNotificationMsgId == null) {
                            conversationGroupProperty.latestNotificationMsgId = "";
                        }
                        if (conversationGroupProperty.source != null) {
                            break;
                        }
                        conversationGroupProperty.source = "";
                        return conversationGroupProperty;
                    }
                    conversationGroupProperty.source = nb5Var.s();
                }
            }
            return conversationGroupProperty;
        }

        public void serialize(ConversationGroupProperty conversationGroupProperty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationGroupProperty.latestNotificationMsgId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, conversationGroupProperty.joinedTime);
            String str2 = conversationGroupProperty.source;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<ConversationGroupProperty> JSON_ADAPTER = new ObjectJsonAdapter<ConversationGroupProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationGroupProperty.2
        public Class getDataClass() {
            return ConversationGroupProperty.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationGroupProperty m12370newInstance() {
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
                    conversationGroupProperty.joinedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationGroupProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationGroupProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationGroupProperty new_() {
        ConversationGroupProperty conversationGroupProperty = new ConversationGroupProperty();
        conversationGroupProperty.nullCheck();
        return conversationGroupProperty;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationGroupProperty m12368clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.latestNotificationMsgId == null) {
            this.latestNotificationMsgId = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
