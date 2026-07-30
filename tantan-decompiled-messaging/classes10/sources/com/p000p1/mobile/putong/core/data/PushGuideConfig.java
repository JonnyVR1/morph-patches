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
public class PushGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushguideconfig";

    @ProtobufIndex(index = 4)
    public int chat_guide_first_close_count;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int chat_guide_first_close_freezing_time;

    @ProtobufIndex(index = 6)
    public int chat_guide_second_close_count;

    @ProtobufIndex(index = 7)
    public int chat_guide_second_close_freezing_time;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int dialog_guide_repeatly_close_count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int dialog_guide_repeatly_close_freezing_time;

    @ProtobufIndex(index = 1)
    public int dialog_guide_single_close_freezing_time;
    public static ProtobufAdapter<PushGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PushGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PushGuideConfig pushGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, pushGuideConfig.dialog_guide_single_close_freezing_time) + CodedOutputByteBufferNano.h(2, pushGuideConfig.dialog_guide_repeatly_close_count) + CodedOutputByteBufferNano.h(3, pushGuideConfig.dialog_guide_repeatly_close_freezing_time) + CodedOutputByteBufferNano.h(4, pushGuideConfig.chat_guide_first_close_count) + CodedOutputByteBufferNano.h(5, pushGuideConfig.chat_guide_first_close_freezing_time) + CodedOutputByteBufferNano.h(6, pushGuideConfig.chat_guide_second_close_count) + CodedOutputByteBufferNano.h(7, pushGuideConfig.chat_guide_second_close_freezing_time);
            ((MessageNano) pushGuideConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PushGuideConfig m15101parse(nb5 nb5Var) throws IOException {
            PushGuideConfig pushGuideConfig = new PushGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    pushGuideConfig.dialog_guide_single_close_freezing_time = nb5Var.j();
                } else if (iU == 16) {
                    pushGuideConfig.dialog_guide_repeatly_close_count = nb5Var.j();
                } else if (iU == 24) {
                    pushGuideConfig.dialog_guide_repeatly_close_freezing_time = nb5Var.j();
                } else if (iU == 32) {
                    pushGuideConfig.chat_guide_first_close_count = nb5Var.j();
                } else if (iU == 40) {
                    pushGuideConfig.chat_guide_first_close_freezing_time = nb5Var.j();
                } else if (iU == 48) {
                    pushGuideConfig.chat_guide_second_close_count = nb5Var.j();
                } else {
                    if (iU != 56) {
                        return pushGuideConfig;
                    }
                    pushGuideConfig.chat_guide_second_close_freezing_time = nb5Var.j();
                }
            }
        }

        public void serialize(PushGuideConfig pushGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, pushGuideConfig.dialog_guide_single_close_freezing_time);
            codedOutputByteBufferNano.G(2, pushGuideConfig.dialog_guide_repeatly_close_count);
            codedOutputByteBufferNano.G(3, pushGuideConfig.dialog_guide_repeatly_close_freezing_time);
            codedOutputByteBufferNano.G(4, pushGuideConfig.chat_guide_first_close_count);
            codedOutputByteBufferNano.G(5, pushGuideConfig.chat_guide_first_close_freezing_time);
            codedOutputByteBufferNano.G(6, pushGuideConfig.chat_guide_second_close_count);
            codedOutputByteBufferNano.G(7, pushGuideConfig.chat_guide_second_close_freezing_time);
        }
    };
    public static JsonAdapter<PushGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<PushGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PushGuideConfig.2
        public Class getDataClass() {
            return PushGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PushGuideConfig m15102newInstance() {
            return new PushGuideConfig();
        }

        public boolean parseField(PushGuideConfig pushGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chat_guide_first_close_count":
                    pushGuideConfig.chat_guide_first_close_count = jsonParser.getValueAsInt();
                    return true;
                case "dialog_guide_repeatly_close_count":
                    pushGuideConfig.dialog_guide_repeatly_close_count = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_second_close_freezing_time":
                    pushGuideConfig.chat_guide_second_close_freezing_time = jsonParser.getValueAsInt();
                    return true;
                case "dialog_guide_repeatly_close_freezing_time":
                    pushGuideConfig.dialog_guide_repeatly_close_freezing_time = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_first_close_freezing_time":
                    pushGuideConfig.chat_guide_first_close_freezing_time = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_second_close_count":
                    pushGuideConfig.chat_guide_second_close_count = jsonParser.getValueAsInt();
                    return true;
                case "dialog_guide_single_close_freezing_time":
                    pushGuideConfig.dialog_guide_single_close_freezing_time = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PushGuideConfig pushGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chat_guide_first_close_count":
                case "dialog_guide_repeatly_close_count":
                case "chat_guide_second_close_freezing_time":
                case "dialog_guide_repeatly_close_freezing_time":
                case "chat_guide_first_close_freezing_time":
                case "chat_guide_second_close_count":
                case "dialog_guide_single_close_freezing_time":
                    return true;
                default:
                    return super.parseFieldCheck(pushGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PushGuideConfig pushGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("dialog_guide_single_close_freezing_time", pushGuideConfig.dialog_guide_single_close_freezing_time);
            jsonGenerator.writeNumberField("dialog_guide_repeatly_close_count", pushGuideConfig.dialog_guide_repeatly_close_count);
            jsonGenerator.writeNumberField("dialog_guide_repeatly_close_freezing_time", pushGuideConfig.dialog_guide_repeatly_close_freezing_time);
            jsonGenerator.writeNumberField("chat_guide_first_close_count", pushGuideConfig.chat_guide_first_close_count);
            jsonGenerator.writeNumberField("chat_guide_first_close_freezing_time", pushGuideConfig.chat_guide_first_close_freezing_time);
            jsonGenerator.writeNumberField("chat_guide_second_close_count", pushGuideConfig.chat_guide_second_close_count);
            jsonGenerator.writeNumberField("chat_guide_second_close_freezing_time", pushGuideConfig.chat_guide_second_close_freezing_time);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushGuideConfig new_() {
        PushGuideConfig pushGuideConfig = new PushGuideConfig();
        pushGuideConfig.nullCheck();
        return pushGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PushGuideConfig m15100clone() {
        PushGuideConfig pushGuideConfig = new PushGuideConfig();
        pushGuideConfig.dialog_guide_single_close_freezing_time = this.dialog_guide_single_close_freezing_time;
        pushGuideConfig.dialog_guide_repeatly_close_count = this.dialog_guide_repeatly_close_count;
        pushGuideConfig.dialog_guide_repeatly_close_freezing_time = this.dialog_guide_repeatly_close_freezing_time;
        pushGuideConfig.chat_guide_first_close_count = this.chat_guide_first_close_count;
        pushGuideConfig.chat_guide_first_close_freezing_time = this.chat_guide_first_close_freezing_time;
        pushGuideConfig.chat_guide_second_close_count = this.chat_guide_second_close_count;
        pushGuideConfig.chat_guide_second_close_freezing_time = this.chat_guide_second_close_freezing_time;
        return pushGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushGuideConfig)) {
            return false;
        }
        PushGuideConfig pushGuideConfig = (PushGuideConfig) obj;
        return this.dialog_guide_single_close_freezing_time == pushGuideConfig.dialog_guide_single_close_freezing_time && this.dialog_guide_repeatly_close_count == pushGuideConfig.dialog_guide_repeatly_close_count && this.dialog_guide_repeatly_close_freezing_time == pushGuideConfig.dialog_guide_repeatly_close_freezing_time && this.chat_guide_first_close_count == pushGuideConfig.chat_guide_first_close_count && this.chat_guide_first_close_freezing_time == pushGuideConfig.chat_guide_first_close_freezing_time && this.chat_guide_second_close_count == pushGuideConfig.chat_guide_second_close_count && this.chat_guide_second_close_freezing_time == pushGuideConfig.chat_guide_second_close_freezing_time;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + this.dialog_guide_single_close_freezing_time) * 41) + this.dialog_guide_repeatly_close_count) * 41) + this.dialog_guide_repeatly_close_freezing_time) * 41) + this.chat_guide_first_close_count) * 41) + this.chat_guide_first_close_freezing_time) * 41) + this.chat_guide_second_close_count) * 41) + this.chat_guide_second_close_freezing_time;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
