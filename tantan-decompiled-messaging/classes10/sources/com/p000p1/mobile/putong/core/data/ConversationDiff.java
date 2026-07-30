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
public class ConversationDiff extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationdiff";

    @NonNull
    @ProtobufIndex(index = 1)
    public String syncUrl;
    public static ProtobufAdapter<ConversationDiff> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationDiff>() { // from class: com.p1.mobile.putong.core.data.ConversationDiff.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationDiff conversationDiff) {
            String str = conversationDiff.syncUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) conversationDiff).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationDiff m12361parse(nb5 nb5Var) throws IOException {
            ConversationDiff conversationDiff = new ConversationDiff();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationDiff.syncUrl != null) {
                        break;
                    }
                    conversationDiff.syncUrl = "";
                    break;
                }
                if (iU != 10) {
                    if (conversationDiff.syncUrl != null) {
                        break;
                    }
                    conversationDiff.syncUrl = "";
                    return conversationDiff;
                }
                conversationDiff.syncUrl = nb5Var.s();
            }
            return conversationDiff;
        }

        public void serialize(ConversationDiff conversationDiff, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationDiff.syncUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationDiff> JSON_ADAPTER = new ObjectJsonAdapter<ConversationDiff>() { // from class: com.p1.mobile.putong.core.data.ConversationDiff.2
        public Class getDataClass() {
            return ConversationDiff.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationDiff m12362newInstance() {
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

        public void serializeFields(ConversationDiff conversationDiff, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationDiff.syncUrl;
            if (str != null) {
                jsonGenerator.writeStringField("syncUrl", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationDiff) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationDiff) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationDiff new_() {
        ConversationDiff conversationDiff = new ConversationDiff();
        conversationDiff.nullCheck();
        return conversationDiff;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationDiff m12360clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.syncUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.syncUrl == null) {
            this.syncUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
