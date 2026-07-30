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
public class ConversationAdditionalOneSide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionaloneside";

    @NonNull
    @ProtobufIndex(index = 2)
    public String initiator;

    @NonNull
    @ProtobufIndex(index = 1)
    public ConversationSubChannel subChannel;
    public static ProtobufAdapter<ConversationAdditionalOneSide> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalOneSide>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalOneSide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationAdditionalOneSide conversationAdditionalOneSide) {
            ConversationSubChannel conversationSubChannel = conversationAdditionalOneSide.subChannel;
            int iM17281h = conversationSubChannel != null ? CodedOutputByteBufferNano.m17281h(1, conversationSubChannel.ordinal()) : 0;
            String str = conversationAdditionalOneSide.initiator;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            ConversationSubChannel conversationSubChannel2 = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, conversationSubChannel2, ConversationSubChannel.PROTOBUF_ADAPTER);
            }
            conversationAdditionalOneSide.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationAdditionalOneSide parse(nc5 nc5Var) throws IOException {
            ConversationAdditionalOneSide conversationAdditionalOneSide = new ConversationAdditionalOneSide();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationAdditionalOneSide.subChannel == null && numValueOf != null) {
                        conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 18) {
                    conversationAdditionalOneSide.initiator = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (conversationAdditionalOneSide.subChannel == null && numValueOf != null) {
                            conversationAdditionalOneSide.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                    conversationAdditionalOneSide.subChannel = (ConversationSubChannel) nc5Var.m162488l(ConversationSubChannel.PROTOBUF_ADAPTER);
                }
            }
            return conversationAdditionalOneSide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationAdditionalOneSide conversationAdditionalOneSide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConversationSubChannel conversationSubChannel = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel != null) {
                codedOutputByteBufferNano.m17305G(1, conversationSubChannel.ordinal());
            }
            String str = conversationAdditionalOneSide.initiator;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            ConversationSubChannel conversationSubChannel2 = conversationAdditionalOneSide.subChannel;
            if (conversationSubChannel2 != null) {
                codedOutputByteBufferNano.m17309K(3, conversationSubChannel2, ConversationSubChannel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationAdditionalOneSide> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalOneSide>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalOneSide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationAdditionalOneSide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationAdditionalOneSide newInstance() {
            return new ConversationAdditionalOneSide();
        }

        public boolean parseField(ConversationAdditionalOneSide conversationAdditionalOneSide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subChannel")) {
                conversationAdditionalOneSide.subChannel = ConversationSubChannel.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalOneSide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalOneSide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalOneSide new_() {
        ConversationAdditionalOneSide conversationAdditionalOneSide = new ConversationAdditionalOneSide();
        conversationAdditionalOneSide.nullCheck();
        return conversationAdditionalOneSide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationAdditionalOneSide mo225055clone() {
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
        ConversationSubChannel conversationSubChannel = this.subChannel;
        int iHashCode = (i2 + (conversationSubChannel != null ? conversationSubChannel.hashCode() : 0)) * 41;
        String str = this.initiator;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.subChannel == null) {
            this.subChannel = (ConversationSubChannel) ConversationSubChannel.JSON_ADAPTER.defaultEnum();
        }
        if (this.initiator == null) {
            this.initiator = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
