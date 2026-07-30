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
public class ConversationAdditionalKanKanContentIdWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionalkankancontentidwrapper";

    @NonNull
    @ProtobufIndex(index = 1)
    public String kankanId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String ownerId;
    public static ProtobufAdapter<ConversationAdditionalKanKanContentIdWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalKanKanContentIdWrapper>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalKanKanContentIdWrapper.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper) {
            String str = conversationAdditionalKanKanContentIdWrapper.kankanId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = conversationAdditionalKanKanContentIdWrapper.ownerId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) conversationAdditionalKanKanContentIdWrapper).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalKanKanContentIdWrapper m12335parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper = new ConversationAdditionalKanKanContentIdWrapper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationAdditionalKanKanContentIdWrapper.kankanId == null) {
                        conversationAdditionalKanKanContentIdWrapper.kankanId = "";
                    }
                    if (conversationAdditionalKanKanContentIdWrapper.ownerId != null) {
                        break;
                    }
                    conversationAdditionalKanKanContentIdWrapper.ownerId = "";
                    break;
                }
                if (iU == 10) {
                    conversationAdditionalKanKanContentIdWrapper.kankanId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (conversationAdditionalKanKanContentIdWrapper.kankanId == null) {
                            conversationAdditionalKanKanContentIdWrapper.kankanId = "";
                        }
                        if (conversationAdditionalKanKanContentIdWrapper.ownerId != null) {
                            break;
                        }
                        conversationAdditionalKanKanContentIdWrapper.ownerId = "";
                        return conversationAdditionalKanKanContentIdWrapper;
                    }
                    conversationAdditionalKanKanContentIdWrapper.ownerId = nb5Var.s();
                }
            }
            return conversationAdditionalKanKanContentIdWrapper;
        }

        public void serialize(ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationAdditionalKanKanContentIdWrapper.kankanId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = conversationAdditionalKanKanContentIdWrapper.ownerId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ConversationAdditionalKanKanContentIdWrapper> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalKanKanContentIdWrapper>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalKanKanContentIdWrapper.2
        public Class getDataClass() {
            return ConversationAdditionalKanKanContentIdWrapper.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationAdditionalKanKanContentIdWrapper m12336newInstance() {
            return new ConversationAdditionalKanKanContentIdWrapper();
        }

        public boolean parseField(ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ownerId")) {
                conversationAdditionalKanKanContentIdWrapper.ownerId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("kankanId")) {
                return false;
            }
            conversationAdditionalKanKanContentIdWrapper.kankanId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ownerId") || str.equals("kankanId")) {
                return true;
            }
            return super.parseFieldCheck(conversationAdditionalKanKanContentIdWrapper, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationAdditionalKanKanContentIdWrapper.kankanId;
            if (str != null) {
                jsonGenerator.writeStringField("kankanId", str);
            }
            String str2 = conversationAdditionalKanKanContentIdWrapper.ownerId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerId", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalKanKanContentIdWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalKanKanContentIdWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalKanKanContentIdWrapper new_() {
        ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper = new ConversationAdditionalKanKanContentIdWrapper();
        conversationAdditionalKanKanContentIdWrapper.nullCheck();
        return conversationAdditionalKanKanContentIdWrapper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationAdditionalKanKanContentIdWrapper m12334clone() {
        ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper = new ConversationAdditionalKanKanContentIdWrapper();
        conversationAdditionalKanKanContentIdWrapper.kankanId = this.kankanId;
        conversationAdditionalKanKanContentIdWrapper.ownerId = this.ownerId;
        return conversationAdditionalKanKanContentIdWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditionalKanKanContentIdWrapper)) {
            return false;
        }
        ConversationAdditionalKanKanContentIdWrapper conversationAdditionalKanKanContentIdWrapper = (ConversationAdditionalKanKanContentIdWrapper) obj;
        return ValueObject.util_equals(this.kankanId, conversationAdditionalKanKanContentIdWrapper.kankanId) && ValueObject.util_equals(this.ownerId, conversationAdditionalKanKanContentIdWrapper.ownerId);
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
        String str = this.kankanId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ownerId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.kankanId == null) {
            this.kankanId = "";
        }
        if (this.ownerId == null) {
            this.ownerId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
