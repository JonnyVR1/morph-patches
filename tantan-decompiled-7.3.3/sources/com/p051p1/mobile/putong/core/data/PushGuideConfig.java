package com.p051p1.mobile.putong.core.data;

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
public class PushGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushguideconfig";

    @ProtobufIndex(index = 4)
    public int chat_guide_first_close_count;

    @ProtobufIndex(index = 5)
    public int chat_guide_first_close_freezing_time;

    @ProtobufIndex(index = 6)
    public int chat_guide_second_close_count;

    @ProtobufIndex(index = 7)
    public int chat_guide_second_close_freezing_time;

    @ProtobufIndex(index = 2)
    public int dialog_guide_repeatly_close_count;

    @ProtobufIndex(index = 3)
    public int dialog_guide_repeatly_close_freezing_time;

    @ProtobufIndex(index = 1)
    public int dialog_guide_single_close_freezing_time;
    public static ProtobufAdapter<PushGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PushGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushGuideConfig pushGuideConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, pushGuideConfig.dialog_guide_single_close_freezing_time) + CodedOutputByteBufferNano.m17281h(2, pushGuideConfig.dialog_guide_repeatly_close_count) + CodedOutputByteBufferNano.m17281h(3, pushGuideConfig.dialog_guide_repeatly_close_freezing_time) + CodedOutputByteBufferNano.m17281h(4, pushGuideConfig.chat_guide_first_close_count) + CodedOutputByteBufferNano.m17281h(5, pushGuideConfig.chat_guide_first_close_freezing_time) + CodedOutputByteBufferNano.m17281h(6, pushGuideConfig.chat_guide_second_close_count) + CodedOutputByteBufferNano.m17281h(7, pushGuideConfig.chat_guide_second_close_freezing_time);
            pushGuideConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushGuideConfig parse(nc5 nc5Var) throws IOException {
            PushGuideConfig pushGuideConfig = new PushGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    pushGuideConfig.dialog_guide_single_close_freezing_time = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    pushGuideConfig.dialog_guide_repeatly_close_count = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    pushGuideConfig.dialog_guide_repeatly_close_freezing_time = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    pushGuideConfig.chat_guide_first_close_count = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    pushGuideConfig.chat_guide_first_close_freezing_time = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    pushGuideConfig.chat_guide_second_close_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 56) {
                        return pushGuideConfig;
                    }
                    pushGuideConfig.chat_guide_second_close_freezing_time = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushGuideConfig pushGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, pushGuideConfig.dialog_guide_single_close_freezing_time);
            codedOutputByteBufferNano.m17305G(2, pushGuideConfig.dialog_guide_repeatly_close_count);
            codedOutputByteBufferNano.m17305G(3, pushGuideConfig.dialog_guide_repeatly_close_freezing_time);
            codedOutputByteBufferNano.m17305G(4, pushGuideConfig.chat_guide_first_close_count);
            codedOutputByteBufferNano.m17305G(5, pushGuideConfig.chat_guide_first_close_freezing_time);
            codedOutputByteBufferNano.m17305G(6, pushGuideConfig.chat_guide_second_close_count);
            codedOutputByteBufferNano.m17305G(7, pushGuideConfig.chat_guide_second_close_freezing_time);
        }
    };
    public static JsonAdapter<PushGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<PushGuideConfig>() { // from class: com.p1.mobile.putong.core.data.PushGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushGuideConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushGuideConfig pushGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("dialog_guide_single_close_freezing_time", pushGuideConfig.dialog_guide_single_close_freezing_time);
            jsonGenerator.writeNumberField("dialog_guide_repeatly_close_count", pushGuideConfig.dialog_guide_repeatly_close_count);
            jsonGenerator.writeNumberField("dialog_guide_repeatly_close_freezing_time", pushGuideConfig.dialog_guide_repeatly_close_freezing_time);
            jsonGenerator.writeNumberField("chat_guide_first_close_count", pushGuideConfig.chat_guide_first_close_count);
            jsonGenerator.writeNumberField("chat_guide_first_close_freezing_time", pushGuideConfig.chat_guide_first_close_freezing_time);
            jsonGenerator.writeNumberField("chat_guide_second_close_count", pushGuideConfig.chat_guide_second_close_count);
            jsonGenerator.writeNumberField("chat_guide_second_close_freezing_time", pushGuideConfig.chat_guide_second_close_freezing_time);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushGuideConfig new_() {
        PushGuideConfig pushGuideConfig = new PushGuideConfig();
        pushGuideConfig.nullCheck();
        return pushGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushGuideConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + this.dialog_guide_single_close_freezing_time) * 41) + this.dialog_guide_repeatly_close_count) * 41) + this.dialog_guide_repeatly_close_freezing_time) * 41) + this.chat_guide_first_close_count) * 41) + this.chat_guide_first_close_freezing_time) * 41) + this.chat_guide_second_close_count) * 41) + this.chat_guide_second_close_freezing_time;
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
