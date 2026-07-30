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
public class ConversationAdditionalOneSide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionaloneside";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String initiator;

    @NonNull
    @ProtobufIndex(index = 1)
    public ConversationSubChannel subChannel;
    public static ProtobufAdapter<ConversationAdditionalOneSide> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalOneSide>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalOneSide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationAdditionalOneSide conversationAdditionalOneSide) {
            ConversationSubChannel conversationSubChannel = conversationAdditionalOneSide.subChannel;
            int iH = conversationSubChannel != null ? CodedOutputByteBufferNano.h(1, conversationSubChannel.ordinal()) : 0;
            String str = conversationAdditionalOneSide.initiator;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ConversationSubChannel conversationSubChannel2 = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel2 != null) {
                iH += CodedOutputByteBufferNano.l(3, conversationSubChannel2, ConversationSubChannel.PROTOBUF_ADAPTER);
            }
            ((MessageNano) conversationAdditionalOneSide).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalOneSide m12339parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalOneSide conversationAdditionalOneSide = new ConversationAdditionalOneSide();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationAdditionalOneSide.subChannel == null && numValueOf != null) {
                        conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (conversationAdditionalOneSide.subChannel == null) {
                        conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.defaultEnum();
                    }
                    if (conversationAdditionalOneSide.initiator != null) {
                        break;
                    }
                    conversationAdditionalOneSide.initiator = "";
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    conversationAdditionalOneSide.initiator = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (conversationAdditionalOneSide.subChannel == null && numValueOf != null) {
                            conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (conversationAdditionalOneSide.subChannel == null) {
                            conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.defaultEnum();
                        }
                        if (conversationAdditionalOneSide.initiator != null) {
                            break;
                        }
                        conversationAdditionalOneSide.initiator = "";
                        return conversationAdditionalOneSide;
                    }
                    conversationAdditionalOneSide.subChannel = (ConversationSubChannel) nb5Var.l(ConversationSubChannel.PROTOBUF_ADAPTER);
                }
            }
            return conversationAdditionalOneSide;
        }

        public void serialize(ConversationAdditionalOneSide conversationAdditionalOneSide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConversationSubChannel conversationSubChannel = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel != null) {
                codedOutputByteBufferNano.G(1, conversationSubChannel.ordinal());
            }
            String str = conversationAdditionalOneSide.initiator;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            ConversationSubChannel conversationSubChannel2 = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel2 != null) {
                codedOutputByteBufferNano.K(3, conversationSubChannel2, ConversationSubChannel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationAdditionalOneSide> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalOneSide>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalOneSide.2
        public Class getDataClass() {
            return ConversationAdditionalOneSide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalOneSide m12340newInstance() {
            return new ConversationAdditionalOneSide();
        }

        public boolean parseField(ConversationAdditionalOneSide conversationAdditionalOneSide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subChannel")) {
                conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("initiator")) {
                return false;
            }
            conversationAdditionalOneSide.initiator = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationAdditionalOneSide conversationAdditionalOneSide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subChannel") || str.equals("initiator")) {
                return true;
            }
            return super.parseFieldCheck(conversationAdditionalOneSide, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationAdditionalOneSide conversationAdditionalOneSide, JsonGenerator jsonGenerator) throws IOException {
            if (conversationAdditionalOneSide.subChannel != null) {
                jsonGenerator.writeFieldName("subChannel");
                ConversationSubChannel.JSON_ADAPTER.serialize(conversationAdditionalOneSide.subChannel, jsonGenerator, true);
            }
            String str = conversationAdditionalOneSide.initiator;
            if (str != null) {
                jsonGenerator.writeStringField("initiator", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalOneSide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalOneSide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalOneSide new_() {
        ConversationAdditionalOneSide conversationAdditionalOneSide = new ConversationAdditionalOneSide();
        conversationAdditionalOneSide.nullCheck();
        return conversationAdditionalOneSide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationAdditionalOneSide m12338clone() {
        ConversationAdditionalOneSide conversationAdditionalOneSide = new ConversationAdditionalOneSide();
        conversationAdditionalOneSide.subChannel = this.subChannel;
        conversationAdditionalOneSide.initiator = this.initiator;
        return conversationAdditionalOneSide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditionalOneSide)) {
            return false;
        }
        ConversationAdditionalOneSide conversationAdditionalOneSide = (ConversationAdditionalOneSide) obj;
        return ValueObject.util_equals(this.subChannel, conversationAdditionalOneSide.subChannel) && ValueObject.util_equals(this.initiator, conversationAdditionalOneSide.initiator);
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
        ConversationSubChannel conversationSubChannel = this.subChannel;
        int iHashCode = (i2 + (conversationSubChannel != null ? conversationSubChannel.hashCode() : 0)) * 41;
        String str = this.initiator;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.subChannel == null) {
            this.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.defaultEnum();
        }
        if (this.initiator == null) {
            this.initiator = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
