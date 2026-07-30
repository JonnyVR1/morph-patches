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
public class ConversationSoulMatch2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationsoulmatch2";

    @ProtobufIndex(index = 2)
    public long endTimestamp;

    @NonNull
    @ProtobufIndex(index = 4)
    public String openProfileUsers;

    @NonNull
    @ProtobufIndex(index = 1)
    public String question;

    @ProtobufIndex(index = 3)
    public long startTimestamp;
    public static ProtobufAdapter<ConversationSoulMatch2> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationSoulMatch2>() { // from class: com.p1.mobile.putong.core.data.ConversationSoulMatch2.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationSoulMatch2 conversationSoulMatch2) {
            String str = conversationSoulMatch2.question;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, conversationSoulMatch2.endTimestamp) + CodedOutputByteBufferNano.m17283j(3, conversationSoulMatch2.startTimestamp);
            String str2 = conversationSoulMatch2.openProfileUsers;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            conversationSoulMatch2.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationSoulMatch2 parse(nc5 nc5Var) throws IOException {
            ConversationSoulMatch2 conversationSoulMatch2 = new ConversationSoulMatch2();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationSoulMatch2.question == null) {
                        conversationSoulMatch2.question = "";
                    }
                    if (conversationSoulMatch2.openProfileUsers != null) {
                        break;
                    }
                    conversationSoulMatch2.openProfileUsers = "";
                    break;
                }
                if (iM162497u == 10) {
                    conversationSoulMatch2.question = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    conversationSoulMatch2.endTimestamp = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    conversationSoulMatch2.startTimestamp = nc5Var.m162487k();
                } else {
                    if (iM162497u != 34) {
                        if (conversationSoulMatch2.question == null) {
                            conversationSoulMatch2.question = "";
                        }
                        if (conversationSoulMatch2.openProfileUsers != null) {
                            break;
                        }
                        conversationSoulMatch2.openProfileUsers = "";
                        return conversationSoulMatch2;
                    }
                    conversationSoulMatch2.openProfileUsers = nc5Var.m162495s();
                }
            }
            return conversationSoulMatch2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationSoulMatch2 conversationSoulMatch2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationSoulMatch2.question;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, conversationSoulMatch2.endTimestamp);
            codedOutputByteBufferNano.m17307I(3, conversationSoulMatch2.startTimestamp);
            String str2 = conversationSoulMatch2.openProfileUsers;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<ConversationSoulMatch2> JSON_ADAPTER = new ObjectJsonAdapter<ConversationSoulMatch2>() { // from class: com.p1.mobile.putong.core.data.ConversationSoulMatch2.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationSoulMatch2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationSoulMatch2 newInstance() {
            return new ConversationSoulMatch2();
        }

        public boolean parseField(ConversationSoulMatch2 conversationSoulMatch2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    conversationSoulMatch2.question = jsonParser.getValueAsString();
                    return true;
                case "endTimestamp":
                    conversationSoulMatch2.endTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "startTimestamp":
                    conversationSoulMatch2.startTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "openProfileUsers":
                    conversationSoulMatch2.openProfileUsers = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationSoulMatch2 conversationSoulMatch2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "question":
                case "endTimestamp":
                case "startTimestamp":
                case "openProfileUsers":
                    return true;
                default:
                    return super.parseFieldCheck(conversationSoulMatch2, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationSoulMatch2 conversationSoulMatch2, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationSoulMatch2.question;
            if (str != null) {
                jsonGenerator.writeStringField("question", str);
            }
            jsonGenerator.writeNumberField("endTimestamp", conversationSoulMatch2.endTimestamp);
            jsonGenerator.writeNumberField("startTimestamp", conversationSoulMatch2.startTimestamp);
            String str2 = conversationSoulMatch2.openProfileUsers;
            if (str2 != null) {
                jsonGenerator.writeStringField("openProfileUsers", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationSoulMatch2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationSoulMatch2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationSoulMatch2 new_() {
        ConversationSoulMatch2 conversationSoulMatch2 = new ConversationSoulMatch2();
        conversationSoulMatch2.nullCheck();
        return conversationSoulMatch2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationSoulMatch2 mo225055clone() {
        ConversationSoulMatch2 conversationSoulMatch2 = new ConversationSoulMatch2();
        conversationSoulMatch2.question = this.question;
        conversationSoulMatch2.endTimestamp = this.endTimestamp;
        conversationSoulMatch2.startTimestamp = this.startTimestamp;
        conversationSoulMatch2.openProfileUsers = this.openProfileUsers;
        return conversationSoulMatch2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationSoulMatch2)) {
            return false;
        }
        ConversationSoulMatch2 conversationSoulMatch2 = (ConversationSoulMatch2) obj;
        return ValueObject.util_equals(this.question, conversationSoulMatch2.question) && this.endTimestamp == conversationSoulMatch2.endTimestamp && this.startTimestamp == conversationSoulMatch2.startTimestamp && ValueObject.util_equals(this.openProfileUsers, conversationSoulMatch2.openProfileUsers);
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
        String str = this.question;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.endTimestamp;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.startTimestamp;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.openProfileUsers;
        int iHashCode2 = i4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.question == null) {
            this.question = "";
        }
        if (this.openProfileUsers == null) {
            this.openProfileUsers = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
