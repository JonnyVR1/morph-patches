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
public class ConversationTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationtag";

    @NonNull
    @ProtobufIndex(index = 3)
    public String emoji;

    @NonNull
    @ProtobufIndex(index = 2)
    public String guide;

    @ProtobufIndex(index = 1)
    public boolean showInList;

    @NonNull
    @ProtobufIndex(index = 5)
    public String suggestExpireTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String suggestText;
    public static ProtobufAdapter<ConversationTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationTag>() { // from class: com.p1.mobile.putong.core.data.ConversationTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationTag conversationTag) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, conversationTag.showInList);
            String str = conversationTag.guide;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = conversationTag.emoji;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = conversationTag.suggestText;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = conversationTag.suggestExpireTime;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            conversationTag.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationTag parse(nb5 nb5Var) throws IOException {
            ConversationTag conversationTag = new ConversationTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationTag.guide == null) {
                        conversationTag.guide = "";
                    }
                    if (conversationTag.emoji == null) {
                        conversationTag.emoji = "";
                    }
                    if (conversationTag.suggestText == null) {
                        conversationTag.suggestText = "";
                    }
                    if (conversationTag.suggestExpireTime != null) {
                        break;
                    }
                    conversationTag.suggestExpireTime = "";
                    break;
                }
                if (iM158752u == 8) {
                    conversationTag.showInList = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    conversationTag.guide = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    conversationTag.emoji = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    conversationTag.suggestText = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (conversationTag.guide == null) {
                            conversationTag.guide = "";
                        }
                        if (conversationTag.emoji == null) {
                            conversationTag.emoji = "";
                        }
                        if (conversationTag.suggestText == null) {
                            conversationTag.suggestText = "";
                        }
                        if (conversationTag.suggestExpireTime != null) {
                            break;
                        }
                        conversationTag.suggestExpireTime = "";
                        return conversationTag;
                    }
                    conversationTag.suggestExpireTime = nb5Var.m158750s();
                }
            }
            return conversationTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationTag conversationTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, conversationTag.showInList);
            String str = conversationTag.guide;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = conversationTag.emoji;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = conversationTag.suggestText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = conversationTag.suggestExpireTime;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    };
    public static JsonAdapter<ConversationTag> JSON_ADAPTER = new ObjectJsonAdapter<ConversationTag>() { // from class: com.p1.mobile.putong.core.data.ConversationTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationTag newInstance() {
            return new ConversationTag();
        }

        public boolean parseField(ConversationTag conversationTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "suggestText":
                    conversationTag.suggestText = jsonParser.getValueAsString();
                    return true;
                case "suggestExpireTime":
                    conversationTag.suggestExpireTime = jsonParser.getValueAsString();
                    return true;
                case "emoji":
                    conversationTag.emoji = jsonParser.getValueAsString();
                    return true;
                case "guide":
                    conversationTag.guide = jsonParser.getValueAsString();
                    return true;
                case "showInList":
                    conversationTag.showInList = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationTag conversationTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "suggestText":
                case "suggestExpireTime":
                case "emoji":
                case "guide":
                case "showInList":
                    return true;
                default:
                    return super.parseFieldCheck(conversationTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationTag conversationTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showInList", conversationTag.showInList);
            String str = conversationTag.guide;
            if (str != null) {
                jsonGenerator.writeStringField("guide", str);
            }
            String str2 = conversationTag.emoji;
            if (str2 != null) {
                jsonGenerator.writeStringField("emoji", str2);
            }
            String str3 = conversationTag.suggestText;
            if (str3 != null) {
                jsonGenerator.writeStringField("suggestText", str3);
            }
            String str4 = conversationTag.suggestExpireTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("suggestExpireTime", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationTag new_() {
        ConversationTag conversationTag = new ConversationTag();
        conversationTag.nullCheck();
        return conversationTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationTag mo223809clone() {
        ConversationTag conversationTag = new ConversationTag();
        conversationTag.showInList = this.showInList;
        conversationTag.guide = this.guide;
        conversationTag.emoji = this.emoji;
        conversationTag.suggestText = this.suggestText;
        conversationTag.suggestExpireTime = this.suggestExpireTime;
        return conversationTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationTag)) {
            return false;
        }
        ConversationTag conversationTag = (ConversationTag) obj;
        return this.showInList == conversationTag.showInList && ValueObject.util_equals(this.guide, conversationTag.guide) && ValueObject.util_equals(this.emoji, conversationTag.emoji) && ValueObject.util_equals(this.suggestText, conversationTag.suggestText) && ValueObject.util_equals(this.suggestExpireTime, conversationTag.suggestExpireTime);
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
        int i2 = ((i * 41) + (this.showInList ? 1231 : 1237)) * 41;
        String str = this.guide;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.emoji;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.suggestText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.suggestExpireTime;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guide == null) {
            this.guide = "";
        }
        if (this.emoji == null) {
            this.emoji = "";
        }
        if (this.suggestText == null) {
            this.suggestText = "";
        }
        if (this.suggestExpireTime == null) {
            this.suggestExpireTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
