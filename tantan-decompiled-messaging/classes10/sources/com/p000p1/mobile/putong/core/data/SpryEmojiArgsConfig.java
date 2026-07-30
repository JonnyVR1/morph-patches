package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SpryEmojiArgsConfig;
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
public class SpryEmojiArgsConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spryemojiargsconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> hint_emoji_array;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int hint_emoji_show_max;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SpryEmojiData spry_emoji_array;

    @ProtobufIndex(index = 1)
    public int spry_emoji_show_max;
    public static ProtobufAdapter<SpryEmojiArgsConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpryEmojiArgsConfig>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiArgsConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpryEmojiArgsConfig spryEmojiArgsConfig) {
            int iH = CodedOutputByteBufferNano.h(1, spryEmojiArgsConfig.spry_emoji_show_max);
            SpryEmojiData spryEmojiData = spryEmojiArgsConfig.spry_emoji_array;
            if (spryEmojiData != null) {
                iH += CodedOutputByteBufferNano.l(2, spryEmojiData, SpryEmojiData.PROTOBUF_ADAPTER);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, spryEmojiArgsConfig.hint_emoji_show_max);
            List<String> list = spryEmojiArgsConfig.hint_emoji_array;
            if (list != null) {
                iH2 += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) spryEmojiArgsConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpryEmojiArgsConfig m15734parse(nb5 nb5Var) throws IOException {
            SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (spryEmojiArgsConfig.spry_emoji_array == null) {
                        spryEmojiArgsConfig.spry_emoji_array = SpryEmojiData.new_();
                    }
                    if (spryEmojiArgsConfig.hint_emoji_array != null) {
                        break;
                    }
                    spryEmojiArgsConfig.hint_emoji_array = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    spryEmojiArgsConfig.spry_emoji_show_max = nb5Var.j();
                } else if (iU == 18) {
                    spryEmojiArgsConfig.spry_emoji_array = (SpryEmojiData) nb5Var.l(SpryEmojiData.PROTOBUF_ADAPTER);
                } else if (iU == 24) {
                    spryEmojiArgsConfig.hint_emoji_show_max = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (spryEmojiArgsConfig.spry_emoji_array == null) {
                            spryEmojiArgsConfig.spry_emoji_array = SpryEmojiData.new_();
                        }
                        if (spryEmojiArgsConfig.hint_emoji_array != null) {
                            break;
                        }
                        spryEmojiArgsConfig.hint_emoji_array = new ArrayList();
                        return spryEmojiArgsConfig;
                    }
                    spryEmojiArgsConfig.hint_emoji_array = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spryEmojiArgsConfig;
        }

        public void serialize(SpryEmojiArgsConfig spryEmojiArgsConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, spryEmojiArgsConfig.spry_emoji_show_max);
            SpryEmojiData spryEmojiData = spryEmojiArgsConfig.spry_emoji_array;
            if (spryEmojiData != null) {
                codedOutputByteBufferNano.K(2, spryEmojiData, SpryEmojiData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, spryEmojiArgsConfig.hint_emoji_show_max);
            List<String> list = spryEmojiArgsConfig.hint_emoji_array;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpryEmojiArgsConfig> JSON_ADAPTER = new ObjectJsonAdapter<SpryEmojiArgsConfig>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiArgsConfig.2
        public Class getDataClass() {
            return SpryEmojiArgsConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpryEmojiArgsConfig m15735newInstance() {
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
                    spryEmojiArgsConfig.spry_emoji_array = (SpryEmojiData) SpryEmojiData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpryEmojiArgsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpryEmojiArgsConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m655a(String str) {
        return str;
    }

    public static SpryEmojiArgsConfig new_() {
        SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
        spryEmojiArgsConfig.nullCheck();
        return spryEmojiArgsConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpryEmojiArgsConfig m15733clone() {
        SpryEmojiArgsConfig spryEmojiArgsConfig = new SpryEmojiArgsConfig();
        spryEmojiArgsConfig.spry_emoji_show_max = this.spry_emoji_show_max;
        SpryEmojiData spryEmojiData = this.spry_emoji_array;
        if (spryEmojiData != null) {
            spryEmojiArgsConfig.spry_emoji_array = spryEmojiData.m15737clone();
        }
        spryEmojiArgsConfig.hint_emoji_show_max = this.hint_emoji_show_max;
        List<String> list = this.hint_emoji_array;
        if (list != null) {
            spryEmojiArgsConfig.hint_emoji_array = ValueObject.util_map(list, new w9j() { // from class: l.brf0
                public final Object call(Object obj) {
                    return SpryEmojiArgsConfig.m655a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.spry_emoji_show_max) * 41;
        SpryEmojiData spryEmojiData = this.spry_emoji_array;
        int iHashCode = (((i2 + (spryEmojiData != null ? spryEmojiData.hashCode() : 0)) * 41) + this.hint_emoji_show_max) * 41;
        List<String> list = this.hint_emoji_array;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.spry_emoji_array == null) {
            this.spry_emoji_array = SpryEmojiData.new_();
        }
        if (this.hint_emoji_array == null) {
            this.hint_emoji_array = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
