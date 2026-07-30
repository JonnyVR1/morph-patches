package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LiveUserCardButtonColorConfig;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveUserCardButtonColorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveusercardbuttoncolorconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> colors;

    @ProtobufIndex(index = 1)
    public int gradientDirection;

    @ProtobufIndex(index = 3)
    public int transparency;
    public static ProtobufAdapter<LiveUserCardButtonColorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserCardButtonColorConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonColorConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig) {
            int iH = CodedOutputByteBufferNano.h(1, liveUserCardButtonColorConfig.gradientDirection);
            List<String> list = liveUserCardButtonColorConfig.colors;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, liveUserCardButtonColorConfig.transparency);
            ((MessageNano) liveUserCardButtonColorConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveUserCardButtonColorConfig m18394parse(nb5 nb5Var) throws IOException {
            LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveUserCardButtonColorConfig.colors != null) {
                        break;
                    }
                    liveUserCardButtonColorConfig.colors = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    liveUserCardButtonColorConfig.gradientDirection = nb5Var.j();
                } else if (iU == 18) {
                    liveUserCardButtonColorConfig.colors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (liveUserCardButtonColorConfig.colors != null) {
                            break;
                        }
                        liveUserCardButtonColorConfig.colors = new ArrayList();
                        return liveUserCardButtonColorConfig;
                    }
                    liveUserCardButtonColorConfig.transparency = nb5Var.j();
                }
            }
            return liveUserCardButtonColorConfig;
        }

        public void serialize(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, liveUserCardButtonColorConfig.gradientDirection);
            List<String> list = liveUserCardButtonColorConfig.colors;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, liveUserCardButtonColorConfig.transparency);
        }
    };
    public static JsonAdapter<LiveUserCardButtonColorConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserCardButtonColorConfig>() { // from class: com.p1.mobile.putong.data.LiveUserCardButtonColorConfig.2
        public Class getDataClass() {
            return LiveUserCardButtonColorConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveUserCardButtonColorConfig mo17830newInstance() {
            return new LiveUserCardButtonColorConfig();
        }

        public boolean parseField(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "transparency":
                    liveUserCardButtonColorConfig.transparency = jsonParser.getValueAsInt();
                    return true;
                case "colors":
                    liveUserCardButtonColorConfig.colors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "gradientDirection":
                    liveUserCardButtonColorConfig.gradientDirection = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "transparency":
                case "colors":
                case "gradientDirection":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserCardButtonColorConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserCardButtonColorConfig liveUserCardButtonColorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("gradientDirection", liveUserCardButtonColorConfig.gradientDirection);
            if (liveUserCardButtonColorConfig.colors != null) {
                jsonGenerator.writeFieldName("colors");
                JsonAdapter.serializeArray(liveUserCardButtonColorConfig.colors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("transparency", liveUserCardButtonColorConfig.transparency);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserCardButtonColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserCardButtonColorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m761a(String str) {
        return str;
    }

    public static LiveUserCardButtonColorConfig new_() {
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
        liveUserCardButtonColorConfig.nullCheck();
        return liveUserCardButtonColorConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveUserCardButtonColorConfig m18393clone() {
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = new LiveUserCardButtonColorConfig();
        liveUserCardButtonColorConfig.gradientDirection = this.gradientDirection;
        List<String> list = this.colors;
        if (list != null) {
            liveUserCardButtonColorConfig.colors = ValueObject.util_map(list, new w9j() { // from class: l.vdu
                public final Object call(Object obj) {
                    return LiveUserCardButtonColorConfig.m761a((String) obj);
                }
            });
        }
        liveUserCardButtonColorConfig.transparency = this.transparency;
        return liveUserCardButtonColorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserCardButtonColorConfig)) {
            return false;
        }
        LiveUserCardButtonColorConfig liveUserCardButtonColorConfig = (LiveUserCardButtonColorConfig) obj;
        return this.gradientDirection == liveUserCardButtonColorConfig.gradientDirection && ValueObject.util_equals(this.colors, liveUserCardButtonColorConfig.colors) && this.transparency == liveUserCardButtonColorConfig.transparency;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.gradientDirection) * 41;
        List<String> list = this.colors;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.transparency;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.colors == null) {
            this.colors = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
