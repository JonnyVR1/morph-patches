package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SpryEmojiArgsConfig;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class SpryEmojiArgsConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spryemojiargsconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> hint_emoji_array;

    @ProtobufIndex(index = 3)
    public int hint_emoji_show_max;

    @NonNull
    @ProtobufIndex(index = 2)
    public SpryEmojiData spry_emoji_array;

    @ProtobufIndex(index = 1)
    public int spry_emoji_show_max;
    public static ProtobufAdapter<SpryEmojiArgsConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpryEmojiArgsConfig>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiArgsConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpryEmojiArgsConfig spryEmojiArgsConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, spryEmojiArgsConfig.spry_emoji_show_max);
            SpryEmojiData spryEmojiData = spryEmojiArgsConfig.spry_emoji_array;
            if (spryEmojiData != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, spryEmojiData, SpryEmojiData.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(3, spryEmojiArgsConfig.hint_emoji_show_max);
            List<String> list = spryEmojiArgsConfig.hint_emoji_array;
            if (list != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            spryEmojiArgsConfig.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpryEmojiArgsConfig parse(nb5 nb5Var) throws IOException {
            SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (spryEmojiArgsConfig.spry_emoji_array == null) {
                        spryEmojiArgsConfig.spry_emoji_array = SpryEmojiData.new_();
                    }
                    if (spryEmojiArgsConfig.hint_emoji_array != null) {
                        break;
                    }
                    spryEmojiArgsConfig.hint_emoji_array = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    spryEmojiArgsConfig.spry_emoji_show_max = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    spryEmojiArgsConfig.spry_emoji_array = (SpryEmojiData) nb5Var.m158743l(SpryEmojiData.PROTOBUF_ADAPTER);
                } else if (iM158752u == 24) {
                    spryEmojiArgsConfig.hint_emoji_show_max = nb5Var.m158741j();
                } else {
                    if (iM158752u != 34) {
                        if (spryEmojiArgsConfig.spry_emoji_array == null) {
                            spryEmojiArgsConfig.spry_emoji_array = SpryEmojiData.new_();
                        }
                        if (spryEmojiArgsConfig.hint_emoji_array != null) {
                            break;
                        }
                        spryEmojiArgsConfig.hint_emoji_array = new ArrayList();
                        return spryEmojiArgsConfig;
                    }
                    spryEmojiArgsConfig.hint_emoji_array = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spryEmojiArgsConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpryEmojiArgsConfig spryEmojiArgsConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, spryEmojiArgsConfig.spry_emoji_show_max);
            SpryEmojiData spryEmojiData = spryEmojiArgsConfig.spry_emoji_array;
            if (spryEmojiData != null) {
                codedOutputByteBufferNano.m17254K(2, spryEmojiData, SpryEmojiData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(3, spryEmojiArgsConfig.hint_emoji_show_max);
            List<String> list = spryEmojiArgsConfig.hint_emoji_array;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpryEmojiArgsConfig> JSON_ADAPTER = new ObjectJsonAdapter<SpryEmojiArgsConfig>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiArgsConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpryEmojiArgsConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpryEmojiArgsConfig newInstance() {
            return new SpryEmojiArgsConfig();
        }

        public boolean parseField(SpryEmojiArgsConfig spryEmojiArgsConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hint_emoji_array":
                    spryEmojiArgsConfig.hint_emoji_array = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "spry_emoji_show_max":
                    spryEmojiArgsConfig.spry_emoji_show_max = jsonParser.getValueAsInt();
                    return true;
                case "hint_emoji_show_max":
                    spryEmojiArgsConfig.hint_emoji_show_max = jsonParser.getValueAsInt();
                    return true;
                case "spry_emoji_array":
                    spryEmojiArgsConfig.spry_emoji_array = SpryEmojiData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpryEmojiArgsConfig spryEmojiArgsConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hint_emoji_array":
                case "spry_emoji_show_max":
                case "hint_emoji_show_max":
                case "spry_emoji_array":
                    return true;
                default:
                    return super.parseFieldCheck(spryEmojiArgsConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpryEmojiArgsConfig spryEmojiArgsConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("spry_emoji_show_max", spryEmojiArgsConfig.spry_emoji_show_max);
            if (spryEmojiArgsConfig.spry_emoji_array != null) {
                jsonGenerator.writeFieldName("spry_emoji_array");
                SpryEmojiData.JSON_ADAPTER.serialize(spryEmojiArgsConfig.spry_emoji_array, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("hint_emoji_show_max", spryEmojiArgsConfig.hint_emoji_show_max);
            if (spryEmojiArgsConfig.hint_emoji_array != null) {
                jsonGenerator.writeFieldName("hint_emoji_array");
                JsonAdapter.serializeArray(spryEmojiArgsConfig.hint_emoji_array, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpryEmojiArgsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpryEmojiArgsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35853a(String str) {
        return str;
    }

    public static SpryEmojiArgsConfig new_() {
        SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
        spryEmojiArgsConfig.nullCheck();
        return spryEmojiArgsConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpryEmojiArgsConfig mo223809clone() {
        SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
        spryEmojiArgsConfig.spry_emoji_show_max = this.spry_emoji_show_max;
        SpryEmojiData spryEmojiData = this.spry_emoji_array;
        if (spryEmojiData != null) {
            spryEmojiArgsConfig.spry_emoji_array = spryEmojiData.mo223809clone();
        }
        spryEmojiArgsConfig.hint_emoji_show_max = this.hint_emoji_show_max;
        List<String> list = this.hint_emoji_array;
        if (list != null) {
            spryEmojiArgsConfig.hint_emoji_array = ValueObject.util_map(list, new w9j() { // from class: l.brf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SpryEmojiArgsConfig.m35853a((String) obj);
                }
            });
        }
        return spryEmojiArgsConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpryEmojiArgsConfig)) {
            return false;
        }
        SpryEmojiArgsConfig spryEmojiArgsConfig = (SpryEmojiArgsConfig) obj;
        return this.spry_emoji_show_max == spryEmojiArgsConfig.spry_emoji_show_max && ValueObject.util_equals(this.spry_emoji_array, spryEmojiArgsConfig.spry_emoji_array) && this.hint_emoji_show_max == spryEmojiArgsConfig.hint_emoji_show_max && ValueObject.util_equals(this.hint_emoji_array, spryEmojiArgsConfig.hint_emoji_array);
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
        int i2 = ((i * 41) + this.spry_emoji_show_max) * 41;
        SpryEmojiData spryEmojiData = this.spry_emoji_array;
        int iHashCode = (((i2 + (spryEmojiData != null ? spryEmojiData.hashCode() : 0)) * 41) + this.hint_emoji_show_max) * 41;
        List<String> list = this.hint_emoji_array;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.spry_emoji_array == null) {
            this.spry_emoji_array = SpryEmojiData.new_();
        }
        if (this.hint_emoji_array == null) {
            this.hint_emoji_array = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
