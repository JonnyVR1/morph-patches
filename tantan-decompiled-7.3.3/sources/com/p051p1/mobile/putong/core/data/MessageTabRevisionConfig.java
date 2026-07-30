package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MessageTabRevisionConfig;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MessageTabRevisionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagetabrevisionconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> animContents;

    @ProtobufIndex(index = 5)
    public int click_chat_tab_interval_time;

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 6)
    public int new_tag_exposure_after_max_minutes;

    @ProtobufIndex(index = 4)
    public int new_tag_exposure_after_max_time;

    @ProtobufIndex(index = 3)
    public int new_tag_show_max_time;
    public static ProtobufAdapter<MessageTabRevisionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTabRevisionConfig>() { // from class: com.p1.mobile.putong.core.data.MessageTabRevisionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageTabRevisionConfig messageTabRevisionConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, messageTabRevisionConfig.enabled);
            List<String> list = messageTabRevisionConfig.animContents;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(3, messageTabRevisionConfig.new_tag_show_max_time) + CodedOutputByteBufferNano.m17281h(4, messageTabRevisionConfig.new_tag_exposure_after_max_time) + CodedOutputByteBufferNano.m17281h(5, messageTabRevisionConfig.click_chat_tab_interval_time) + CodedOutputByteBufferNano.m17281h(6, messageTabRevisionConfig.new_tag_exposure_after_max_minutes);
            messageTabRevisionConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageTabRevisionConfig parse(nc5 nc5Var) throws IOException {
            MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageTabRevisionConfig.animContents != null) {
                        break;
                    }
                    messageTabRevisionConfig.animContents = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    messageTabRevisionConfig.enabled = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    messageTabRevisionConfig.animContents = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 24) {
                    messageTabRevisionConfig.new_tag_show_max_time = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    messageTabRevisionConfig.new_tag_exposure_after_max_time = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    messageTabRevisionConfig.click_chat_tab_interval_time = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        if (messageTabRevisionConfig.animContents != null) {
                            break;
                        }
                        messageTabRevisionConfig.animContents = new ArrayList();
                        return messageTabRevisionConfig;
                    }
                    messageTabRevisionConfig.new_tag_exposure_after_max_minutes = nc5Var.m162486j();
                }
            }
            return messageTabRevisionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageTabRevisionConfig messageTabRevisionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, messageTabRevisionConfig.enabled);
            List<String> list = messageTabRevisionConfig.animContents;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(3, messageTabRevisionConfig.new_tag_show_max_time);
            codedOutputByteBufferNano.m17305G(4, messageTabRevisionConfig.new_tag_exposure_after_max_time);
            codedOutputByteBufferNano.m17305G(5, messageTabRevisionConfig.click_chat_tab_interval_time);
            codedOutputByteBufferNano.m17305G(6, messageTabRevisionConfig.new_tag_exposure_after_max_minutes);
        }
    };
    public static JsonAdapter<MessageTabRevisionConfig> JSON_ADAPTER = new ObjectJsonAdapter<MessageTabRevisionConfig>() { // from class: com.p1.mobile.putong.core.data.MessageTabRevisionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageTabRevisionConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageTabRevisionConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTabRevisionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTabRevisionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36691a(String str) {
        return str;
    }

    public static MessageTabRevisionConfig new_() {
        MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
        messageTabRevisionConfig.nullCheck();
        return messageTabRevisionConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageTabRevisionConfig mo225055clone() {
        MessageTabRevisionConfig messageTabRevisionConfig = new MessageTabRevisionConfig();
        messageTabRevisionConfig.enabled = this.enabled;
        List<String> list = this.animContents;
        if (list != null) {
            messageTabRevisionConfig.animContents = ValueObject.util_map(list, new qcj() { // from class: l.s600
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MessageTabRevisionConfig.m36691a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enabled ? 1231 : 1237)) * 41;
        List<String> list = this.animContents;
        int iHashCode = ((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.new_tag_show_max_time) * 41) + this.new_tag_exposure_after_max_time) * 41) + this.click_chat_tab_interval_time) * 41) + this.new_tag_exposure_after_max_minutes;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.animContents == null) {
            this.animContents = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
