package com.p046p1.mobile.putong.core.data;

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
public class IdealTypeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtypeconfig";

    @ProtobufIndex(index = 6)
    public boolean enable;

    @ProtobufIndex(index = 10)
    public int feedback_limit_one_day_has_ideal;

    @ProtobufIndex(index = 9)
    public int feedback_limit_one_day_no_ideal;

    @ProtobufIndex(index = 4)
    public int ideal_chat_guide_limit;

    @ProtobufIndex(index = 3)
    public int ideal_chat_guide_not_send_message_limit;

    @ProtobufIndex(index = 8)
    public int ideal_feedback_scroll_show_timeout;

    @ProtobufIndex(index = 7)
    public int ideal_feedback_show_timeout;

    @ProtobufIndex(index = 1)
    public int ideal_swipe_guide_dislike_limit;

    @ProtobufIndex(index = 5)
    public int ideal_swipe_guide_like_ideal_limit;

    @ProtobufIndex(index = 2)
    public int ideal_swipe_guide_limit;
    public static ProtobufAdapter<IdealTypeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTypeConfig>() { // from class: com.p1.mobile.putong.core.data.IdealTypeConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealTypeConfig idealTypeConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, idealTypeConfig.ideal_swipe_guide_dislike_limit) + CodedOutputByteBufferNano.m17226h(2, idealTypeConfig.ideal_swipe_guide_limit) + CodedOutputByteBufferNano.m17226h(3, idealTypeConfig.ideal_chat_guide_not_send_message_limit) + CodedOutputByteBufferNano.m17226h(4, idealTypeConfig.ideal_chat_guide_limit) + CodedOutputByteBufferNano.m17226h(5, idealTypeConfig.ideal_swipe_guide_like_ideal_limit) + CodedOutputByteBufferNano.m17220b(6, idealTypeConfig.enable) + CodedOutputByteBufferNano.m17226h(7, idealTypeConfig.ideal_feedback_show_timeout) + CodedOutputByteBufferNano.m17226h(8, idealTypeConfig.ideal_feedback_scroll_show_timeout) + CodedOutputByteBufferNano.m17226h(9, idealTypeConfig.feedback_limit_one_day_no_ideal) + CodedOutputByteBufferNano.m17226h(10, idealTypeConfig.feedback_limit_one_day_has_ideal);
            idealTypeConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealTypeConfig parse(nb5 nb5Var) throws IOException {
            IdealTypeConfig idealTypeConfig = new IdealTypeConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    idealTypeConfig.ideal_swipe_guide_dislike_limit = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    idealTypeConfig.ideal_swipe_guide_limit = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    idealTypeConfig.ideal_chat_guide_not_send_message_limit = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    idealTypeConfig.ideal_chat_guide_limit = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    idealTypeConfig.ideal_swipe_guide_like_ideal_limit = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    idealTypeConfig.enable = nb5Var.m158738g();
                } else if (iM158752u == 56) {
                    idealTypeConfig.ideal_feedback_show_timeout = nb5Var.m158741j();
                } else if (iM158752u == 64) {
                    idealTypeConfig.ideal_feedback_scroll_show_timeout = nb5Var.m158741j();
                } else if (iM158752u == 72) {
                    idealTypeConfig.feedback_limit_one_day_no_ideal = nb5Var.m158741j();
                } else {
                    if (iM158752u != 80) {
                        return idealTypeConfig;
                    }
                    idealTypeConfig.feedback_limit_one_day_has_ideal = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealTypeConfig idealTypeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, idealTypeConfig.ideal_swipe_guide_dislike_limit);
            codedOutputByteBufferNano.m17250G(2, idealTypeConfig.ideal_swipe_guide_limit);
            codedOutputByteBufferNano.m17250G(3, idealTypeConfig.ideal_chat_guide_not_send_message_limit);
            codedOutputByteBufferNano.m17250G(4, idealTypeConfig.ideal_chat_guide_limit);
            codedOutputByteBufferNano.m17250G(5, idealTypeConfig.ideal_swipe_guide_like_ideal_limit);
            codedOutputByteBufferNano.m17244A(6, idealTypeConfig.enable);
            codedOutputByteBufferNano.m17250G(7, idealTypeConfig.ideal_feedback_show_timeout);
            codedOutputByteBufferNano.m17250G(8, idealTypeConfig.ideal_feedback_scroll_show_timeout);
            codedOutputByteBufferNano.m17250G(9, idealTypeConfig.feedback_limit_one_day_no_ideal);
            codedOutputByteBufferNano.m17250G(10, idealTypeConfig.feedback_limit_one_day_has_ideal);
        }
    };
    public static JsonAdapter<IdealTypeConfig> JSON_ADAPTER = new ObjectJsonAdapter<IdealTypeConfig>() { // from class: com.p1.mobile.putong.core.data.IdealTypeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealTypeConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealTypeConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTypeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTypeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdealTypeConfig new_() {
        IdealTypeConfig idealTypeConfig = new IdealTypeConfig();
        idealTypeConfig.nullCheck();
        return idealTypeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealTypeConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.ideal_swipe_guide_dislike_limit) * 41) + this.ideal_swipe_guide_limit) * 41) + this.ideal_chat_guide_not_send_message_limit) * 41) + this.ideal_chat_guide_limit) * 41) + this.ideal_swipe_guide_like_ideal_limit) * 41) + this.ideal_feedback_show_timeout) * 41) + this.ideal_feedback_scroll_show_timeout) * 41) + this.feedback_limit_one_day_no_ideal) * 41) + this.feedback_limit_one_day_has_ideal;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
