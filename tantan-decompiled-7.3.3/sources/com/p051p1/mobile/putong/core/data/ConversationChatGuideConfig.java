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
public class ConversationChatGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationchatguideconfig";

    @ProtobufIndex(index = 3)
    public int dismiss_threshold;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public String guide_text;

    @ProtobufIndex(index = 2)
    public int work_time;
    public static ProtobufAdapter<ConversationChatGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationChatGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationChatGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationChatGuideConfig conversationChatGuideConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, conversationChatGuideConfig.enable) + CodedOutputByteBufferNano.m17281h(2, conversationChatGuideConfig.work_time) + CodedOutputByteBufferNano.m17281h(3, conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str);
            }
            conversationChatGuideConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationChatGuideConfig parse(nc5 nc5Var) throws IOException {
            ConversationChatGuideConfig conversationChatGuideConfig = new ConversationChatGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationChatGuideConfig.guide_text != null) {
                        break;
                    }
                    conversationChatGuideConfig.guide_text = "";
                    break;
                }
                if (iM162497u == 8) {
                    conversationChatGuideConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    conversationChatGuideConfig.work_time = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    conversationChatGuideConfig.dismiss_threshold = nc5Var.m162486j();
                } else {
                    if (iM162497u != 34) {
                        if (conversationChatGuideConfig.guide_text != null) {
                            break;
                        }
                        conversationChatGuideConfig.guide_text = "";
                        return conversationChatGuideConfig;
                    }
                    conversationChatGuideConfig.guide_text = nc5Var.m162495s();
                }
            }
            return conversationChatGuideConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationChatGuideConfig conversationChatGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, conversationChatGuideConfig.enable);
            codedOutputByteBufferNano.m17305G(2, conversationChatGuideConfig.work_time);
            codedOutputByteBufferNano.m17305G(3, conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
        }
    };
    public static JsonAdapter<ConversationChatGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationChatGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationChatGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationChatGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationChatGuideConfig newInstance() {
            return new ConversationChatGuideConfig();
        }

        public boolean parseField(ConversationChatGuideConfig conversationChatGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    conversationChatGuideConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "guide_text":
                    conversationChatGuideConfig.guide_text = jsonParser.getValueAsString();
                    return true;
                case "dismiss_threshold":
                    conversationChatGuideConfig.dismiss_threshold = jsonParser.getValueAsInt();
                    return true;
                case "work_time":
                    conversationChatGuideConfig.work_time = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationChatGuideConfig conversationChatGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "guide_text":
                case "dismiss_threshold":
                case "work_time":
                    return true;
                default:
                    return super.parseFieldCheck(conversationChatGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationChatGuideConfig conversationChatGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", conversationChatGuideConfig.enable);
            jsonGenerator.writeNumberField("work_time", conversationChatGuideConfig.work_time);
            jsonGenerator.writeNumberField("dismiss_threshold", conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                jsonGenerator.writeStringField("guide_text", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationChatGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationChatGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationChatGuideConfig new_() {
        ConversationChatGuideConfig conversationChatGuideConfig = new ConversationChatGuideConfig();
        conversationChatGuideConfig.nullCheck();
        return conversationChatGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationChatGuideConfig mo225055clone() {
        ConversationChatGuideConfig conversationChatGuideConfig = new ConversationChatGuideConfig();
        conversationChatGuideConfig.enable = this.enable;
        conversationChatGuideConfig.work_time = this.work_time;
        conversationChatGuideConfig.dismiss_threshold = this.dismiss_threshold;
        conversationChatGuideConfig.guide_text = this.guide_text;
        return conversationChatGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationChatGuideConfig)) {
            return false;
        }
        ConversationChatGuideConfig conversationChatGuideConfig = (ConversationChatGuideConfig) obj;
        return this.enable == conversationChatGuideConfig.enable && this.work_time == conversationChatGuideConfig.work_time && this.dismiss_threshold == conversationChatGuideConfig.dismiss_threshold && ValueObject.util_equals(this.guide_text, conversationChatGuideConfig.guide_text);
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
        int i2 = ((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.work_time) * 41) + this.dismiss_threshold) * 41;
        String str = this.guide_text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guide_text == null) {
            this.guide_text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
