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
public class ConversationLiveVipInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlivevipinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String lastOrderMsgId;
    public static ProtobufAdapter<ConversationLiveVipInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLiveVipInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationLiveVipInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationLiveVipInfo conversationLiveVipInfo) {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) conversationLiveVipInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationLiveVipInfo m12385parse(nb5 nb5Var) throws IOException {
            ConversationLiveVipInfo conversationLiveVipInfo = new ConversationLiveVipInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationLiveVipInfo.lastOrderMsgId != null) {
                        break;
                    }
                    conversationLiveVipInfo.lastOrderMsgId = "";
                    break;
                }
                if (iU != 10) {
                    if (conversationLiveVipInfo.lastOrderMsgId != null) {
                        break;
                    }
                    conversationLiveVipInfo.lastOrderMsgId = "";
                    return conversationLiveVipInfo;
                }
                conversationLiveVipInfo.lastOrderMsgId = nb5Var.s();
            }
            return conversationLiveVipInfo;
        }

        public void serialize(ConversationLiveVipInfo conversationLiveVipInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationLiveVipInfo> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLiveVipInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationLiveVipInfo.2
        public Class getDataClass() {
            return ConversationLiveVipInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationLiveVipInfo m12386newInstance() {
            return new ConversationLiveVipInfo();
        }

        public boolean parseField(ConversationLiveVipInfo conversationLiveVipInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("lastOrderMsgId")) {
                return false;
            }
            conversationLiveVipInfo.lastOrderMsgId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationLiveVipInfo conversationLiveVipInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("lastOrderMsgId")) {
                return true;
            }
            return super.parseFieldCheck(conversationLiveVipInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationLiveVipInfo conversationLiveVipInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            if (str != null) {
                jsonGenerator.writeStringField("lastOrderMsgId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLiveVipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLiveVipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLiveVipInfo new_() {
        ConversationLiveVipInfo conversationLiveVipInfo = new ConversationLiveVipInfo();
        conversationLiveVipInfo.nullCheck();
        return conversationLiveVipInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationLiveVipInfo m12384clone() {
        ConversationLiveVipInfo conversationLiveVipInfo = new ConversationLiveVipInfo();
        conversationLiveVipInfo.lastOrderMsgId = this.lastOrderMsgId;
        return conversationLiveVipInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationLiveVipInfo) {
            return ValueObject.util_equals(this.lastOrderMsgId, ((ConversationLiveVipInfo) obj).lastOrderMsgId);
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
        String str = this.lastOrderMsgId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.lastOrderMsgId == null) {
            this.lastOrderMsgId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
