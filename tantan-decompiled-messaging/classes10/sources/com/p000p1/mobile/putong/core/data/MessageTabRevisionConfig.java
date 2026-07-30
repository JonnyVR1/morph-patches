package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MessageTabRevisionConfig;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageTabRevisionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetabrevisionconfig";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> animContents;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int click_chat_tab_interval_time;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 6)
    public int new_tag_exposure_after_max_minutes;

    @ProtobufIndex(index = 4)
    public int new_tag_exposure_after_max_time;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int new_tag_show_max_time;
    public static ProtobufAdapter<MessageTabRevisionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTabRevisionConfig>() { // from class: com.p1.mobile.putong.core.data.MessageTabRevisionConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageTabRevisionConfig messageTabRevisionConfig) {
            int iB = CodedOutputByteBufferNano.b(1, messageTabRevisionConfig.enabled);
            List<String> list = messageTabRevisionConfig.animContents;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iB + CodedOutputByteBufferNano.h(3, messageTabRevisionConfig.new_tag_show_max_time) + CodedOutputByteBufferNano.h(4, messageTabRevisionConfig.new_tag_exposure_after_max_time) + CodedOutputByteBufferNano.h(5, messageTabRevisionConfig.click_chat_tab_interval_time) + CodedOutputByteBufferNano.h(6, messageTabRevisionConfig.new_tag_exposure_after_max_minutes);
            ((MessageNano) messageTabRevisionConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageTabRevisionConfig m14277parse(nb5 nb5Var) throws IOException {
            MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageTabRevisionConfig.animContents != null) {
                        break;
                    }
                    messageTabRevisionConfig.animContents = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    messageTabRevisionConfig.enabled = nb5Var.g();
                } else if (iU == 18) {
                    messageTabRevisionConfig.animContents = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    messageTabRevisionConfig.new_tag_show_max_time = nb5Var.j();
                } else if (iU == 32) {
                    messageTabRevisionConfig.new_tag_exposure_after_max_time = nb5Var.j();
                } else if (iU == 40) {
                    messageTabRevisionConfig.click_chat_tab_interval_time = nb5Var.j();
                } else {
                    if (iU != 48) {
                        if (messageTabRevisionConfig.animContents != null) {
                            break;
                        }
                        messageTabRevisionConfig.animContents = new ArrayList();
                        return messageTabRevisionConfig;
                    }
                    messageTabRevisionConfig.new_tag_exposure_after_max_minutes = nb5Var.j();
                }
            }
            return messageTabRevisionConfig;
        }

        public void serialize(MessageTabRevisionConfig messageTabRevisionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageTabRevisionConfig.enabled);
            List<String> list = messageTabRevisionConfig.animContents;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, messageTabRevisionConfig.new_tag_show_max_time);
            codedOutputByteBufferNano.G(4, messageTabRevisionConfig.new_tag_exposure_after_max_time);
            codedOutputByteBufferNano.G(5, messageTabRevisionConfig.click_chat_tab_interval_time);
            codedOutputByteBufferNano.G(6, messageTabRevisionConfig.new_tag_exposure_after_max_minutes);
        }
    };
    public static JsonAdapter<MessageTabRevisionConfig> JSON_ADAPTER = new ObjectJsonAdapter<MessageTabRevisionConfig>() { // from class: com.p1.mobile.putong.core.data.MessageTabRevisionConfig.2
        public Class getDataClass() {
            return MessageTabRevisionConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageTabRevisionConfig m14278newInstance() {
            return new MessageTabRevisionConfig();
        }

        public boolean parseField(MessageTabRevisionConfig messageTabRevisionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    messageTabRevisionConfig.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "new_tag_exposure_after_max_time":
                    messageTabRevisionConfig.new_tag_exposure_after_max_time = jsonParser.getValueAsInt();
                    return true;
                case "new_tag_show_max_time":
                    messageTabRevisionConfig.new_tag_show_max_time = jsonParser.getValueAsInt();
                    return true;
                case "click_chat_tab_interval_time":
                    messageTabRevisionConfig.click_chat_tab_interval_time = jsonParser.getValueAsInt();
                    return true;
                case "animContents":
                    messageTabRevisionConfig.animContents = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "new_tag_exposure_after_max_minutes":
                    messageTabRevisionConfig.new_tag_exposure_after_max_minutes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageTabRevisionConfig messageTabRevisionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "new_tag_exposure_after_max_time":
                case "new_tag_show_max_time":
                case "click_chat_tab_interval_time":
                case "animContents":
                case "new_tag_exposure_after_max_minutes":
                    return true;
                default:
                    return super.parseFieldCheck(messageTabRevisionConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageTabRevisionConfig messageTabRevisionConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", messageTabRevisionConfig.enabled);
            if (messageTabRevisionConfig.animContents != null) {
                jsonGenerator.writeFieldName("animContents");
                JsonAdapter.serializeArray(messageTabRevisionConfig.animContents, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("new_tag_show_max_time", messageTabRevisionConfig.new_tag_show_max_time);
            jsonGenerator.writeNumberField("new_tag_exposure_after_max_time", messageTabRevisionConfig.new_tag_exposure_after_max_time);
            jsonGenerator.writeNumberField("click_chat_tab_interval_time", messageTabRevisionConfig.click_chat_tab_interval_time);
            jsonGenerator.writeNumberField("new_tag_exposure_after_max_minutes", messageTabRevisionConfig.new_tag_exposure_after_max_minutes);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTabRevisionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTabRevisionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m490a(String str) {
        return str;
    }

    public static MessageTabRevisionConfig new_() {
        MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
        messageTabRevisionConfig.nullCheck();
        return messageTabRevisionConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageTabRevisionConfig m14276clone() {
        MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
        messageTabRevisionConfig.enabled = this.enabled;
        List<String> list = this.animContents;
        if (list != null) {
            messageTabRevisionConfig.animContents = ValueObject.util_map(list, new w9j() { // from class: l.vxz
                public final Object call(Object obj) {
                    return MessageTabRevisionConfig.m490a((String) obj);
                }
            });
        }
        messageTabRevisionConfig.new_tag_show_max_time = this.new_tag_show_max_time;
        messageTabRevisionConfig.new_tag_exposure_after_max_time = this.new_tag_exposure_after_max_time;
        messageTabRevisionConfig.click_chat_tab_interval_time = this.click_chat_tab_interval_time;
        messageTabRevisionConfig.new_tag_exposure_after_max_minutes = this.new_tag_exposure_after_max_minutes;
        return messageTabRevisionConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageTabRevisionConfig)) {
            return false;
        }
        MessageTabRevisionConfig messageTabRevisionConfig = (MessageTabRevisionConfig) obj;
        return this.enabled == messageTabRevisionConfig.enabled && ValueObject.util_equals(this.animContents, messageTabRevisionConfig.animContents) && this.new_tag_show_max_time == messageTabRevisionConfig.new_tag_show_max_time && this.new_tag_exposure_after_max_time == messageTabRevisionConfig.new_tag_exposure_after_max_time && this.click_chat_tab_interval_time == messageTabRevisionConfig.click_chat_tab_interval_time && this.new_tag_exposure_after_max_minutes == messageTabRevisionConfig.new_tag_exposure_after_max_minutes;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enabled ? 1231 : 1237)) * 41;
        List<String> list = this.animContents;
        int iHashCode = ((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.new_tag_show_max_time) * 41) + this.new_tag_exposure_after_max_time) * 41) + this.click_chat_tab_interval_time) * 41) + this.new_tag_exposure_after_max_minutes;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.animContents == null) {
            this.animContents = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
