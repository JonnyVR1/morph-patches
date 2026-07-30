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
public class LoveLetterConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "loveletterconfig";

    @ProtobufIndex(index = 1)
    public int chat_guide_interval;

    @ProtobufIndex(index = 2)
    public int chat_guide_trigger_message_count;

    @ProtobufIndex(index = 4)
    public int chat_guide_trigger_mm;

    @ProtobufIndex(index = 5)
    public int chat_guide_trigger_time_no_response;

    @ProtobufIndex(index = 3)
    public int chat_guide_trigger_time_window;

    @ProtobufIndex(index = 7)
    public boolean enable;

    @ProtobufIndex(index = 8)
    public int letter_min_count;

    @ProtobufIndex(index = 6)
    public int received_guide_show_limit;
    public static ProtobufAdapter<LoveLetterConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterConfig>() { // from class: com.p1.mobile.putong.core.data.LoveLetterConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveLetterConfig loveLetterConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, loveLetterConfig.chat_guide_interval) + CodedOutputByteBufferNano.m17281h(2, loveLetterConfig.chat_guide_trigger_message_count) + CodedOutputByteBufferNano.m17281h(3, loveLetterConfig.chat_guide_trigger_time_window) + CodedOutputByteBufferNano.m17281h(4, loveLetterConfig.chat_guide_trigger_mm) + CodedOutputByteBufferNano.m17281h(5, loveLetterConfig.chat_guide_trigger_time_no_response) + CodedOutputByteBufferNano.m17281h(6, loveLetterConfig.received_guide_show_limit) + CodedOutputByteBufferNano.m17275b(7, loveLetterConfig.enable) + CodedOutputByteBufferNano.m17281h(8, loveLetterConfig.letter_min_count);
            loveLetterConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveLetterConfig parse(nc5 nc5Var) throws IOException {
            LoveLetterConfig loveLetterConfig = new LoveLetterConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    loveLetterConfig.chat_guide_interval = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    loveLetterConfig.chat_guide_trigger_message_count = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    loveLetterConfig.chat_guide_trigger_time_window = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    loveLetterConfig.chat_guide_trigger_mm = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    loveLetterConfig.chat_guide_trigger_time_no_response = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    loveLetterConfig.received_guide_show_limit = nc5Var.m162486j();
                } else if (iM162497u == 56) {
                    loveLetterConfig.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 64) {
                        return loveLetterConfig;
                    }
                    loveLetterConfig.letter_min_count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveLetterConfig loveLetterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, loveLetterConfig.chat_guide_interval);
            codedOutputByteBufferNano.m17305G(2, loveLetterConfig.chat_guide_trigger_message_count);
            codedOutputByteBufferNano.m17305G(3, loveLetterConfig.chat_guide_trigger_time_window);
            codedOutputByteBufferNano.m17305G(4, loveLetterConfig.chat_guide_trigger_mm);
            codedOutputByteBufferNano.m17305G(5, loveLetterConfig.chat_guide_trigger_time_no_response);
            codedOutputByteBufferNano.m17305G(6, loveLetterConfig.received_guide_show_limit);
            codedOutputByteBufferNano.m17299A(7, loveLetterConfig.enable);
            codedOutputByteBufferNano.m17305G(8, loveLetterConfig.letter_min_count);
        }
    };
    public static JsonAdapter<LoveLetterConfig> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterConfig>() { // from class: com.p1.mobile.putong.core.data.LoveLetterConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveLetterConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveLetterConfig newInstance() {
            return new LoveLetterConfig();
        }

        public boolean parseField(LoveLetterConfig loveLetterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chat_guide_trigger_message_count":
                    loveLetterConfig.chat_guide_trigger_message_count = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    loveLetterConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "received_guide_show_limit":
                    loveLetterConfig.received_guide_show_limit = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_trigger_mm":
                    loveLetterConfig.chat_guide_trigger_mm = jsonParser.getValueAsInt();
                    return true;
                case "letter_min_count":
                    loveLetterConfig.letter_min_count = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_trigger_time_no_response":
                    loveLetterConfig.chat_guide_trigger_time_no_response = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_interval":
                    loveLetterConfig.chat_guide_interval = jsonParser.getValueAsInt();
                    return true;
                case "chat_guide_trigger_time_window":
                    loveLetterConfig.chat_guide_trigger_time_window = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveLetterConfig loveLetterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chat_guide_trigger_message_count":
                case "enable":
                case "received_guide_show_limit":
                case "chat_guide_trigger_mm":
                case "letter_min_count":
                case "chat_guide_trigger_time_no_response":
                case "chat_guide_interval":
                case "chat_guide_trigger_time_window":
                    return true;
                default:
                    return super.parseFieldCheck(loveLetterConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveLetterConfig loveLetterConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("chat_guide_interval", loveLetterConfig.chat_guide_interval);
            jsonGenerator.writeNumberField("chat_guide_trigger_message_count", loveLetterConfig.chat_guide_trigger_message_count);
            jsonGenerator.writeNumberField("chat_guide_trigger_time_window", loveLetterConfig.chat_guide_trigger_time_window);
            jsonGenerator.writeNumberField("chat_guide_trigger_mm", loveLetterConfig.chat_guide_trigger_mm);
            jsonGenerator.writeNumberField("chat_guide_trigger_time_no_response", loveLetterConfig.chat_guide_trigger_time_no_response);
            jsonGenerator.writeNumberField("received_guide_show_limit", loveLetterConfig.received_guide_show_limit);
            jsonGenerator.writeBooleanField("enable", loveLetterConfig.enable);
            jsonGenerator.writeNumberField("letter_min_count", loveLetterConfig.letter_min_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterConfig new_() {
        LoveLetterConfig loveLetterConfig = new LoveLetterConfig();
        loveLetterConfig.nullCheck();
        return loveLetterConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveLetterConfig mo225055clone() {
        LoveLetterConfig loveLetterConfig = new LoveLetterConfig();
        loveLetterConfig.chat_guide_interval = this.chat_guide_interval;
        loveLetterConfig.chat_guide_trigger_message_count = this.chat_guide_trigger_message_count;
        loveLetterConfig.chat_guide_trigger_time_window = this.chat_guide_trigger_time_window;
        loveLetterConfig.chat_guide_trigger_mm = this.chat_guide_trigger_mm;
        loveLetterConfig.chat_guide_trigger_time_no_response = this.chat_guide_trigger_time_no_response;
        loveLetterConfig.received_guide_show_limit = this.received_guide_show_limit;
        loveLetterConfig.enable = this.enable;
        loveLetterConfig.letter_min_count = this.letter_min_count;
        return loveLetterConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveLetterConfig)) {
            return false;
        }
        LoveLetterConfig loveLetterConfig = (LoveLetterConfig) obj;
        return this.chat_guide_interval == loveLetterConfig.chat_guide_interval && this.chat_guide_trigger_message_count == loveLetterConfig.chat_guide_trigger_message_count && this.chat_guide_trigger_time_window == loveLetterConfig.chat_guide_trigger_time_window && this.chat_guide_trigger_mm == loveLetterConfig.chat_guide_trigger_mm && this.chat_guide_trigger_time_no_response == loveLetterConfig.chat_guide_trigger_time_no_response && this.received_guide_show_limit == loveLetterConfig.received_guide_show_limit && this.enable == loveLetterConfig.enable && this.letter_min_count == loveLetterConfig.letter_min_count;
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
        int i2 = (((((((((((((((i * 41) + this.chat_guide_interval) * 41) + this.chat_guide_trigger_message_count) * 41) + this.chat_guide_trigger_time_window) * 41) + this.chat_guide_trigger_mm) * 41) + this.chat_guide_trigger_time_no_response) * 41) + this.received_guide_show_limit) * 41) + (this.enable ? 1231 : 1237)) * 41) + this.letter_min_count;
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
