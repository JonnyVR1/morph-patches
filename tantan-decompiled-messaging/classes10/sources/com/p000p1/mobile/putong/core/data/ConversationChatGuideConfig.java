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
public class ConversationChatGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationchatguideconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int dismiss_threshold;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public String guide_text;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int work_time;
    public static ProtobufAdapter<ConversationChatGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationChatGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationChatGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationChatGuideConfig conversationChatGuideConfig) {
            int iB = CodedOutputByteBufferNano.b(1, conversationChatGuideConfig.enable) + CodedOutputByteBufferNano.h(2, conversationChatGuideConfig.work_time) + CodedOutputByteBufferNano.h(3, conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(4, str);
            }
            ((MessageNano) conversationChatGuideConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationChatGuideConfig m12357parse(nb5 nb5Var) throws IOException {
            ConversationChatGuideConfig conversationChatGuideConfig = new ConversationChatGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationChatGuideConfig.guide_text != null) {
                        break;
                    }
                    conversationChatGuideConfig.guide_text = "";
                    break;
                }
                if (iU == 8) {
                    conversationChatGuideConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    conversationChatGuideConfig.work_time = nb5Var.j();
                } else if (iU == 24) {
                    conversationChatGuideConfig.dismiss_threshold = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (conversationChatGuideConfig.guide_text != null) {
                            break;
                        }
                        conversationChatGuideConfig.guide_text = "";
                        return conversationChatGuideConfig;
                    }
                    conversationChatGuideConfig.guide_text = nb5Var.s();
                }
            }
            return conversationChatGuideConfig;
        }

        public void serialize(ConversationChatGuideConfig conversationChatGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, conversationChatGuideConfig.enable);
            codedOutputByteBufferNano.G(2, conversationChatGuideConfig.work_time);
            codedOutputByteBufferNano.G(3, conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
        }
    };
    public static JsonAdapter<ConversationChatGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationChatGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationChatGuideConfig.2
        public Class getDataClass() {
            return ConversationChatGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationChatGuideConfig m12358newInstance() {
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

        public void serializeFields(ConversationChatGuideConfig conversationChatGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", conversationChatGuideConfig.enable);
            jsonGenerator.writeNumberField("work_time", conversationChatGuideConfig.work_time);
            jsonGenerator.writeNumberField("dismiss_threshold", conversationChatGuideConfig.dismiss_threshold);
            String str = conversationChatGuideConfig.guide_text;
            if (str != null) {
                jsonGenerator.writeStringField("guide_text", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationChatGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationChatGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationChatGuideConfig new_() {
        ConversationChatGuideConfig conversationChatGuideConfig = new ConversationChatGuideConfig();
        conversationChatGuideConfig.nullCheck();
        return conversationChatGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationChatGuideConfig m12356clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.work_time) * 41) + this.dismiss_threshold) * 41;
        String str = this.guide_text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.guide_text == null) {
            this.guide_text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
