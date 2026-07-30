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
public class ConversationDiff extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationdiff";

    @NonNull
    @ProtobufIndex(index = 1)
    public String syncUrl;
    public static ProtobufAdapter<ConversationDiff> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationDiff>() { // from class: com.p1.mobile.putong.core.data.ConversationDiff.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationDiff conversationDiff) {
            String str = conversationDiff.syncUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            conversationDiff.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationDiff parse(nb5 nb5Var) throws IOException {
            ConversationDiff conversationDiff = new ConversationDiff();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationDiff.syncUrl != null) {
                        break;
                    }
                    conversationDiff.syncUrl = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (conversationDiff.syncUrl != null) {
                        break;
                    }
                    conversationDiff.syncUrl = "";
                    return conversationDiff;
                }
                conversationDiff.syncUrl = nb5Var.m158750s();
            }
            return conversationDiff;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationDiff conversationDiff, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationDiff.syncUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationDiff> JSON_ADAPTER = new ObjectJsonAdapter<ConversationDiff>() { // from class: com.p1.mobile.putong.core.data.ConversationDiff.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationDiff.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationDiff newInstance() {
            return new ConversationDiff();
        }

        public boolean parseField(ConversationDiff conversationDiff, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("syncUrl")) {
                return false;
            }
            conversationDiff.syncUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationDiff conversationDiff, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("syncUrl")) {
                return true;
            }
            return super.parseFieldCheck(conversationDiff, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationDiff conversationDiff, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationDiff.syncUrl;
            if (str != null) {
                jsonGenerator.writeStringField("syncUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationDiff) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationDiff) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationDiff new_() {
        ConversationDiff conversationDiff = new ConversationDiff();
        conversationDiff.nullCheck();
        return conversationDiff;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationDiff mo223809clone() {
        ConversationDiff conversationDiff = new ConversationDiff();
        conversationDiff.syncUrl = this.syncUrl;
        return conversationDiff;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationDiff) {
            return ValueObject.util_equals(this.syncUrl, ((ConversationDiff) obj).syncUrl);
        }
        return false;
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
        String str = this.syncUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.syncUrl == null) {
            this.syncUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
