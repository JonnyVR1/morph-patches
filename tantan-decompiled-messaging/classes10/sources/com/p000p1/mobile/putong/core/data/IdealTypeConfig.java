package com.p000p1.mobile.putong.core.data;

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
public class IdealTypeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtypeconfig";

    @ProtobufIndex(index = 6)
    public boolean enable;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public int feedback_limit_one_day_has_ideal;

    @ProtobufIndex(index = 9)
    public int feedback_limit_one_day_no_ideal;

    @ProtobufIndex(index = 4)
    public int ideal_chat_guide_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int ideal_chat_guide_not_send_message_limit;

    @ProtobufIndex(index = 8)
    public int ideal_feedback_scroll_show_timeout;

    @ProtobufIndex(index = 7)
    public int ideal_feedback_show_timeout;

    @ProtobufIndex(index = 1)
    public int ideal_swipe_guide_dislike_limit;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int ideal_swipe_guide_like_ideal_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int ideal_swipe_guide_limit;
    public static ProtobufAdapter<IdealTypeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTypeConfig>() { // from class: com.p1.mobile.putong.core.data.IdealTypeConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdealTypeConfig idealTypeConfig) {
            int iH = CodedOutputByteBufferNano.h(1, idealTypeConfig.ideal_swipe_guide_dislike_limit) + CodedOutputByteBufferNano.h(2, idealTypeConfig.ideal_swipe_guide_limit) + CodedOutputByteBufferNano.h(3, idealTypeConfig.ideal_chat_guide_not_send_message_limit) + CodedOutputByteBufferNano.h(4, idealTypeConfig.ideal_chat_guide_limit) + CodedOutputByteBufferNano.h(5, idealTypeConfig.ideal_swipe_guide_like_ideal_limit) + CodedOutputByteBufferNano.b(6, idealTypeConfig.enable) + CodedOutputByteBufferNano.h(7, idealTypeConfig.ideal_feedback_show_timeout) + CodedOutputByteBufferNano.h(8, idealTypeConfig.ideal_feedback_scroll_show_timeout) + CodedOutputByteBufferNano.h(9, idealTypeConfig.feedback_limit_one_day_no_ideal) + CodedOutputByteBufferNano.h(10, idealTypeConfig.feedback_limit_one_day_has_ideal);
            ((MessageNano) idealTypeConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdealTypeConfig m13425parse(nb5 nb5Var) throws IOException {
            IdealTypeConfig idealTypeConfig = new IdealTypeConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    idealTypeConfig.ideal_swipe_guide_dislike_limit = nb5Var.j();
                } else if (iU == 16) {
                    idealTypeConfig.ideal_swipe_guide_limit = nb5Var.j();
                } else if (iU == 24) {
                    idealTypeConfig.ideal_chat_guide_not_send_message_limit = nb5Var.j();
                } else if (iU == 32) {
                    idealTypeConfig.ideal_chat_guide_limit = nb5Var.j();
                } else if (iU == 40) {
                    idealTypeConfig.ideal_swipe_guide_like_ideal_limit = nb5Var.j();
                } else if (iU == 48) {
                    idealTypeConfig.enable = nb5Var.g();
                } else if (iU == 56) {
                    idealTypeConfig.ideal_feedback_show_timeout = nb5Var.j();
                } else if (iU == 64) {
                    idealTypeConfig.ideal_feedback_scroll_show_timeout = nb5Var.j();
                } else if (iU == 72) {
                    idealTypeConfig.feedback_limit_one_day_no_ideal = nb5Var.j();
                } else {
                    if (iU != 80) {
                        return idealTypeConfig;
                    }
                    idealTypeConfig.feedback_limit_one_day_has_ideal = nb5Var.j();
                }
            }
        }

        public void serialize(IdealTypeConfig idealTypeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, idealTypeConfig.ideal_swipe_guide_dislike_limit);
            codedOutputByteBufferNano.G(2, idealTypeConfig.ideal_swipe_guide_limit);
            codedOutputByteBufferNano.G(3, idealTypeConfig.ideal_chat_guide_not_send_message_limit);
            codedOutputByteBufferNano.G(4, idealTypeConfig.ideal_chat_guide_limit);
            codedOutputByteBufferNano.G(5, idealTypeConfig.ideal_swipe_guide_like_ideal_limit);
            codedOutputByteBufferNano.A(6, idealTypeConfig.enable);
            codedOutputByteBufferNano.G(7, idealTypeConfig.ideal_feedback_show_timeout);
            codedOutputByteBufferNano.G(8, idealTypeConfig.ideal_feedback_scroll_show_timeout);
            codedOutputByteBufferNano.G(9, idealTypeConfig.feedback_limit_one_day_no_ideal);
            codedOutputByteBufferNano.G(10, idealTypeConfig.feedback_limit_one_day_has_ideal);
        }
    };
    public static JsonAdapter<IdealTypeConfig> JSON_ADAPTER = new ObjectJsonAdapter<IdealTypeConfig>() { // from class: com.p1.mobile.putong.core.data.IdealTypeConfig.2
        public Class getDataClass() {
            return IdealTypeConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IdealTypeConfig m13426newInstance() {
            return new IdealTypeConfig();
        }

        public boolean parseField(IdealTypeConfig idealTypeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ideal_chat_guide_not_send_message_limit":
                    idealTypeConfig.ideal_chat_guide_not_send_message_limit = jsonParser.getValueAsInt();
                    return true;
                case "feedback_limit_one_day_has_ideal":
                    idealTypeConfig.feedback_limit_one_day_has_ideal = jsonParser.getValueAsInt();
                    return true;
                case "ideal_swipe_guide_limit":
                    idealTypeConfig.ideal_swipe_guide_limit = jsonParser.getValueAsInt();
                    return true;
                case "feedback_limit_one_day_no_ideal":
                    idealTypeConfig.feedback_limit_one_day_no_ideal = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    idealTypeConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "ideal_chat_guide_limit":
                    idealTypeConfig.ideal_chat_guide_limit = jsonParser.getValueAsInt();
                    return true;
                case "ideal_swipe_guide_dislike_limit":
                    idealTypeConfig.ideal_swipe_guide_dislike_limit = jsonParser.getValueAsInt();
                    return true;
                case "ideal_feedback_scroll_show_timeout":
                    idealTypeConfig.ideal_feedback_scroll_show_timeout = jsonParser.getValueAsInt();
                    return true;
                case "ideal_swipe_guide_like_ideal_limit":
                    idealTypeConfig.ideal_swipe_guide_like_ideal_limit = jsonParser.getValueAsInt();
                    return true;
                case "ideal_feedback_show_timeout":
                    idealTypeConfig.ideal_feedback_show_timeout = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealTypeConfig idealTypeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ideal_chat_guide_not_send_message_limit":
                case "feedback_limit_one_day_has_ideal":
                case "ideal_swipe_guide_limit":
                case "feedback_limit_one_day_no_ideal":
                case "enable":
                case "ideal_chat_guide_limit":
                case "ideal_swipe_guide_dislike_limit":
                case "ideal_feedback_scroll_show_timeout":
                case "ideal_swipe_guide_like_ideal_limit":
                case "ideal_feedback_show_timeout":
                    return true;
                default:
                    return super.parseFieldCheck(idealTypeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IdealTypeConfig idealTypeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", idealTypeConfig.enable);
            jsonGenerator.writeNumberField("ideal_swipe_guide_dislike_limit", idealTypeConfig.ideal_swipe_guide_dislike_limit);
            jsonGenerator.writeNumberField("ideal_swipe_guide_limit", idealTypeConfig.ideal_swipe_guide_limit);
            jsonGenerator.writeNumberField("ideal_chat_guide_not_send_message_limit", idealTypeConfig.ideal_chat_guide_not_send_message_limit);
            jsonGenerator.writeNumberField("ideal_chat_guide_limit", idealTypeConfig.ideal_chat_guide_limit);
            jsonGenerator.writeNumberField("ideal_swipe_guide_like_ideal_limit", idealTypeConfig.ideal_swipe_guide_like_ideal_limit);
            jsonGenerator.writeNumberField("ideal_feedback_show_timeout", idealTypeConfig.ideal_feedback_show_timeout);
            jsonGenerator.writeNumberField("ideal_feedback_scroll_show_timeout", idealTypeConfig.ideal_feedback_scroll_show_timeout);
            jsonGenerator.writeNumberField("feedback_limit_one_day_no_ideal", idealTypeConfig.feedback_limit_one_day_no_ideal);
            jsonGenerator.writeNumberField("feedback_limit_one_day_has_ideal", idealTypeConfig.feedback_limit_one_day_has_ideal);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTypeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTypeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdealTypeConfig new_() {
        IdealTypeConfig idealTypeConfig = new IdealTypeConfig();
        idealTypeConfig.nullCheck();
        return idealTypeConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdealTypeConfig m13424clone() {
        IdealTypeConfig idealTypeConfig = new IdealTypeConfig();
        idealTypeConfig.enable = this.enable;
        idealTypeConfig.ideal_swipe_guide_dislike_limit = this.ideal_swipe_guide_dislike_limit;
        idealTypeConfig.ideal_swipe_guide_limit = this.ideal_swipe_guide_limit;
        idealTypeConfig.ideal_chat_guide_not_send_message_limit = this.ideal_chat_guide_not_send_message_limit;
        idealTypeConfig.ideal_chat_guide_limit = this.ideal_chat_guide_limit;
        idealTypeConfig.ideal_swipe_guide_like_ideal_limit = this.ideal_swipe_guide_like_ideal_limit;
        idealTypeConfig.ideal_feedback_show_timeout = this.ideal_feedback_show_timeout;
        idealTypeConfig.ideal_feedback_scroll_show_timeout = this.ideal_feedback_scroll_show_timeout;
        idealTypeConfig.feedback_limit_one_day_no_ideal = this.feedback_limit_one_day_no_ideal;
        idealTypeConfig.feedback_limit_one_day_has_ideal = this.feedback_limit_one_day_has_ideal;
        return idealTypeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealTypeConfig)) {
            return false;
        }
        IdealTypeConfig idealTypeConfig = (IdealTypeConfig) obj;
        return this.enable == idealTypeConfig.enable && this.ideal_swipe_guide_dislike_limit == idealTypeConfig.ideal_swipe_guide_dislike_limit && this.ideal_swipe_guide_limit == idealTypeConfig.ideal_swipe_guide_limit && this.ideal_chat_guide_not_send_message_limit == idealTypeConfig.ideal_chat_guide_not_send_message_limit && this.ideal_chat_guide_limit == idealTypeConfig.ideal_chat_guide_limit && this.ideal_swipe_guide_like_ideal_limit == idealTypeConfig.ideal_swipe_guide_like_ideal_limit && this.ideal_feedback_show_timeout == idealTypeConfig.ideal_feedback_show_timeout && this.ideal_feedback_scroll_show_timeout == idealTypeConfig.ideal_feedback_scroll_show_timeout && this.feedback_limit_one_day_no_ideal == idealTypeConfig.feedback_limit_one_day_no_ideal && this.feedback_limit_one_day_has_ideal == idealTypeConfig.feedback_limit_one_day_has_ideal;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.ideal_swipe_guide_dislike_limit) * 41) + this.ideal_swipe_guide_limit) * 41) + this.ideal_chat_guide_not_send_message_limit) * 41) + this.ideal_chat_guide_limit) * 41) + this.ideal_swipe_guide_like_ideal_limit) * 41) + this.ideal_feedback_show_timeout) * 41) + this.ideal_feedback_scroll_show_timeout) * 41) + this.feedback_limit_one_day_no_ideal) * 41) + this.feedback_limit_one_day_has_ideal;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
