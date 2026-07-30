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
public class ConversationAdditionalTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationadditionaltag";

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 2)
    public boolean top;

    @NonNull
    @ProtobufIndex(index = 1)
    public ConversationAdditionalTagType type;
    public static ProtobufAdapter<ConversationAdditionalTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationAdditionalTag>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationAdditionalTag conversationAdditionalTag) {
            ConversationAdditionalTagType conversationAdditionalTagType = conversationAdditionalTag.type;
            int iM17230l = (conversationAdditionalTagType != null ? CodedOutputByteBufferNano.m17230l(1, conversationAdditionalTagType, ConversationAdditionalTagType.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17220b(2, conversationAdditionalTag.top) + CodedOutputByteBufferNano.m17228j(3, conversationAdditionalTag.expireTime);
            conversationAdditionalTag.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationAdditionalTag parse(nb5 nb5Var) throws IOException {
            ConversationAdditionalTag conversationAdditionalTag = new ConversationAdditionalTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationAdditionalTag.type != null) {
                        break;
                    }
                    conversationAdditionalTag.type = (ConversationAdditionalTagType) ConversationAdditionalTagType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    conversationAdditionalTag.type = (ConversationAdditionalTagType) nb5Var.m158743l(ConversationAdditionalTagType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    conversationAdditionalTag.top = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        if (conversationAdditionalTag.type != null) {
                            break;
                        }
                        conversationAdditionalTag.type = (ConversationAdditionalTagType) ConversationAdditionalTagType.JSON_ADAPTER.defaultEnum();
                        return conversationAdditionalTag;
                    }
                    conversationAdditionalTag.expireTime = nb5Var.m158742k();
                }
            }
            return conversationAdditionalTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationAdditionalTag conversationAdditionalTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConversationAdditionalTagType conversationAdditionalTagType = conversationAdditionalTag.type;
            if (conversationAdditionalTagType != null) {
                codedOutputByteBufferNano.m17254K(1, conversationAdditionalTagType, ConversationAdditionalTagType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(2, conversationAdditionalTag.top);
            codedOutputByteBufferNano.m17252I(3, conversationAdditionalTag.expireTime);
        }
    };
    public static JsonAdapter<ConversationAdditionalTag> JSON_ADAPTER = new ObjectJsonAdapter<ConversationAdditionalTag>() { // from class: com.p1.mobile.putong.core.data.ConversationAdditionalTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationAdditionalTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationAdditionalTag newInstance() {
            return new ConversationAdditionalTag();
        }

        public boolean parseField(ConversationAdditionalTag conversationAdditionalTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    conversationAdditionalTag.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "top":
                    conversationAdditionalTag.top = jsonParser.getValueAsBoolean();
                    return true;
                case "type":
                    conversationAdditionalTag.type = ConversationAdditionalTagType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationAdditionalTag conversationAdditionalTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                case "top":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(conversationAdditionalTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationAdditionalTag conversationAdditionalTag, JsonGenerator jsonGenerator) throws IOException {
            if (conversationAdditionalTag.type != null) {
                jsonGenerator.writeFieldName("type");
                ConversationAdditionalTagType.JSON_ADAPTER.serialize(conversationAdditionalTag.type, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(StickStatus.top, conversationAdditionalTag.top);
            jsonGenerator.writeNumberField("expireTime", conversationAdditionalTag.expireTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationAdditionalTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationAdditionalTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationAdditionalTag new_() {
        ConversationAdditionalTag conversationAdditionalTag = new ConversationAdditionalTag();
        conversationAdditionalTag.nullCheck();
        return conversationAdditionalTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationAdditionalTag mo223809clone() {
        ConversationAdditionalTag conversationAdditionalTag = new ConversationAdditionalTag();
        conversationAdditionalTag.type = this.type;
        conversationAdditionalTag.top = this.top;
        conversationAdditionalTag.expireTime = this.expireTime;
        return conversationAdditionalTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAdditionalTag)) {
            return false;
        }
        ConversationAdditionalTag conversationAdditionalTag = (ConversationAdditionalTag) obj;
        return ValueObject.util_equals(this.type, conversationAdditionalTag.type) && this.top == conversationAdditionalTag.top && this.expireTime == conversationAdditionalTag.expireTime;
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
        ConversationAdditionalTagType conversationAdditionalTagType = this.type;
        int iHashCode = (((i2 + (conversationAdditionalTagType != null ? conversationAdditionalTagType.hashCode() : 0)) * 41) + (this.top ? 1231 : 1237)) * 41;
        long j = this.expireTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (ConversationAdditionalTagType) ConversationAdditionalTagType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
