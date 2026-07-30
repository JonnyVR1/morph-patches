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
public class ConversationLiveVipInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationlivevipinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String lastOrderMsgId;
    public static ProtobufAdapter<ConversationLiveVipInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationLiveVipInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationLiveVipInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationLiveVipInfo conversationLiveVipInfo) {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            conversationLiveVipInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationLiveVipInfo parse(nb5 nb5Var) throws IOException {
            ConversationLiveVipInfo conversationLiveVipInfo = new ConversationLiveVipInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationLiveVipInfo.lastOrderMsgId != null) {
                        break;
                    }
                    conversationLiveVipInfo.lastOrderMsgId = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (conversationLiveVipInfo.lastOrderMsgId != null) {
                        break;
                    }
                    conversationLiveVipInfo.lastOrderMsgId = "";
                    return conversationLiveVipInfo;
                }
                conversationLiveVipInfo.lastOrderMsgId = nb5Var.m158750s();
            }
            return conversationLiveVipInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationLiveVipInfo conversationLiveVipInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationLiveVipInfo> JSON_ADAPTER = new ObjectJsonAdapter<ConversationLiveVipInfo>() { // from class: com.p1.mobile.putong.core.data.ConversationLiveVipInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationLiveVipInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationLiveVipInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationLiveVipInfo conversationLiveVipInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationLiveVipInfo.lastOrderMsgId;
            if (str != null) {
                jsonGenerator.writeStringField("lastOrderMsgId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationLiveVipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationLiveVipInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationLiveVipInfo new_() {
        ConversationLiveVipInfo conversationLiveVipInfo = new ConversationLiveVipInfo();
        conversationLiveVipInfo.nullCheck();
        return conversationLiveVipInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationLiveVipInfo mo223809clone() {
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
        String str = this.lastOrderMsgId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.lastOrderMsgId == null) {
            this.lastOrderMsgId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
